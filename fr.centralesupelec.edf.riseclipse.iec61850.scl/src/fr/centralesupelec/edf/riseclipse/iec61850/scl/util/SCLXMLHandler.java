/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.util;

import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;

public class SCLXMLHandler extends SAXXMLHandler {

    private Stack< Integer > lineNumbers = new Stack< Integer >();
    private boolean inPrivate = false;
    private String lastElement;
    
    // This is needed to avoid NullPointerException when an unknown feature is seen
    // AND OPTION_USE_DEPRECATED_METHODS is unchanged (stay true) in SclResourceFactoryImpl
    // This must not be used is OPTION_USE_DEPRECATED_METHODS is set to false
    //private boolean unknownFeatureSeen;

    public SCLXMLHandler( XMLResource xmiResource, XMLHelper helper, Map< ?, ? > options ) {
        super( xmiResource, helper, options );
    }

    @Override
    public void startElement( String uri, String localName, String qName, Attributes attributes ) throws SAXException {
        lineNumbers.push( this.locator.getLineNumber() );
        // see above
        //unknownFeatureSeen = false;
        
        if(( "Private".equals( localName )) && SclPackage.eNS_URI.equals( uri )) {
            inPrivate = true;
        }
        else if( inPrivate ) {
            if( text == null ) text = new StringBuffer();
            else if( lastElement != null ) {
                text.append( ">" );
            }
            text.append( "<" + qName );
            lastElement = qName;
            
            for( int i = 0; i < attributes.getLength(); ++i ) {
                text.append( " " + attributes.getQName( i ) + "=\"" + attributes.getValue( i ) + "\"" );
            }
            return;
        }
        super.startElement( uri, localName, qName, attributes );
    }

    @Override
    public void characters( char[] ch, int start, int length ) {
        if(( inPrivate ) && ( lastElement != null )) {
            text.append( ">" );
            lastElement = null;
            text.append( ch, start, length );
        }
        else {
            super.characters( ch, start, length );
        }
    }

    @Override
    public void startCDATA() {
        if( inPrivate ) {
            if( lastElement != null ) {
                text.append( ">" );
                lastElement = null;
            }
            else if( text == null ) text = new StringBuffer();
            text.append( "<![CDATA[" );
        }
        else {
            super.startCDATA();
        }
    }

    @Override
    public void endCDATA() {
        if( inPrivate ) {
            text.append( "]]>" );
        }
        else {
            super.startCDATA();
        }
    }

    @Override
    public void endElement( String uri, String localName, String name ) {
        if( lineNumbers.empty() ) {
            AbstractRiseClipseConsole.getConsole().warning( "linenumber stack empty !" );
        }
        else {
            lineNumbers.pop();
        }
        
        if(( "Private".equals( localName )) && SclPackage.eNS_URI.equals( uri )) {
            inPrivate = false;
        }
        else if( inPrivate ) {
            if( name.equals( lastElement )) {
                text.append( "/>" );
                lastElement = null;
            }
            else {
                text.append( "</" + name + ">" );
            }
            return;
        }
        super.endElement( uri, localName, name );
    }

	@Override
    protected EStructuralFeature getFeature( EObject object, String prefix, String name, boolean isElement ) {
        // XMLHelperImpl.getFeature(EClass eClass, String namespaceURI, String name)
	    // ignore the namespace to find a feature using XMLHelperImpl.getFeatureWithoutMap(EClass eClass, String name)
	    // (checked version in Eclipse 2019-06)
	    //
	    // This lead to the creation of SCL objects if elements from another namespace use existing SCL element names.
	    //
	    // To avoid extending XMLHelper class, the namespace is checked here
	    // And we give back the any attribute to store the element
	    
	    if(( isElement ) && ( prefix != null ) && ( ! SclPackage.eNS_URI.equals( helper.getURI( prefix )))) {
	        return super.getFeature( object, prefix, "any", isElement );
	    }
        return super.getFeature( object, prefix, name, isElement );
    }

    @Override
    protected EPackage getPackageForURI( String uriString ) {
        if( ! SclPackage.eNS_URI.equals( uriString )) {
//            AbstractRiseClipseConsole.getConsole().info( "ignoring namespace " + uriString );
            return null;
        }
        return super.getPackageForURI( uriString );
    }

    @Override
    protected void processObject( EObject object ) {
        if( lineNumbers.empty() ) {
            AbstractRiseClipseConsole.getConsole().warning( "linenumber stack empty !" );
        }
        else {
        	// Will pop in endElement, because some attributes in the model
        	// are sub-elements in XML, therefore they are not process here
            int lineNumber = lineNumbers.peek();
            if( object instanceof SclObject ) {
                (( SclObject ) object ).setLineNumber( lineNumber );
            }
        }
        // TODO: error message
        super.processObject( object );
    }
	
	protected void setFeatureValue( EObject object, EStructuralFeature feature, Object value, int position ) {
	    // When an object a owns an object b1, a may replace it by another object b2 of the same kind
	    // It seems OK.
	    // However, when an XSD says an element A contains 0 or 1 element B (and not several), and when
	    // there are in XML 2 elements B in A, EMF just replace the first by the second, therefore
	    // accept the XML file even if it is invalid according to the XSD.
	    // We intercept here this behavior
	    // TODO: check if it has undesirable effect
	    // TODO: check if there is another way for this
	    
	    // feature may be null on invalid attribute/tag
	    if( feature == null ) return;
	    
	    if(( inPrivate ) && ( lastElement != null )) {
	        text.append( " " + feature.getName() + "=\"" + value + "\"" );
	        return;
	    }
	    
	    if(( feature.getUpperBound() == 1 ) && object.eIsSet( feature )) {
	        AbstractRiseClipseConsole.getConsole().error( "there shall not be more than 1 "
	                + feature.getName() + " in " + object.eClass().getName() + " (line "
	                + (( SclObject ) object ).getLineNumber() + ")" );
	        return;
	    }
	    
	    // 0 or 1 are allowed as boolean values
	    if( feature.getEType() == EcorePackage.Literals.EBOOLEAN_OBJECT ) {
	        if(( value != null ) && ( value.getClass() == String.class )) {
	            switch(( String ) value ) {
	            case "0" :
	                super.setFeatureValue( object, feature, "false", position );
	                return;
	            case "1" :
	                super.setFeatureValue( object, feature, "true", position );
	                return;
	            }
	        }
	    }
	    
	    super.setFeatureValue( object, feature, value, position );
	}

	@Override
    public void endDocument() {
        super.endDocument();
        
        if( ! lineNumbers.empty() ) {
            AbstractRiseClipseConsole.getConsole().warning( "linenumber stack not empty !" );
            while( ! lineNumbers.empty() ) {
            	AbstractRiseClipseConsole.getConsole().warning( lineNumbers.pop() );
            }
        }
    }

    @Override
    protected String getXSIType() {
        // We don't want to take xsi:type into account
        return null;
    }

    @Override
    public void handleUnknownFeature( String prefix, String name, boolean isElement, EObject peekObject, String value ) {
        String mess = "unknown feature " + name;
        mess += " in object " + peekObject.eClass().getName();
        if( ! lineNumbers.empty() ) {
            mess += " (defined at line " + lineNumbers.peek() + ")";
        }
        AbstractRiseClipseConsole.getConsole().error( mess );
        // do nothing in endElement (but see above)
        //unknownFeatureSeen = true;
    }

}
