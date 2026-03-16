/*
*************************************************************************
**  Copyright (c) 2016-2026 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.util;

import java.util.Map;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdXMLHandler;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;

public class SCLXMLHandler extends SAXXMLHandler {

    private static final String XML_HANDLER_CATEGORY = "SCL/XMLHandler";

    private Stack< Integer > lineNumbers = new Stack< Integer >();
    private AsdXMLHandler asdHandler;
    
    public SCLXMLHandler( XMLResource xmiResource, XMLHelper helper, Map< ?, ? > options ) {
        super( xmiResource, helper, options );
        
        asdHandler = new AsdXMLHandler( xmiResource, helper, options, this.objects );
        asdHandler.setDocumentLocator( this.locator );
    }

    @Override
    public void startElement( String uri, String localName, String qName, Attributes attributes ) throws SAXException {
        if (AsdPackage.eNS_URI.equals( uri )) {
            asdHandler.setDocumentLocator( this.locator );
            asdHandler.startElement( uri, localName, qName, attributes );
            return;
        }
        
        lineNumbers.push( this.locator.getLineNumber() );
        super.startElement( uri, localName, qName, attributes );
    }

    @Override
    public void endElement( String uri, String localName, String name ) {
        if (AsdPackage.eNS_URI.equals( uri )) {
            asdHandler.setDocumentLocator( this.locator );
            asdHandler.endElement( uri, localName, name );
            return;
        }
        
        if( lineNumbers.empty() ) {
            AbstractRiseClipseConsole.getConsole().warning(
                XML_HANDLER_CATEGORY, resourceURI.lastSegment(), 0, "linenumber stack empty !" );
        }
        else {
            lineNumbers.pop();
        }
        
        super.endElement( uri, localName, name );
    }

    @Override
    protected void processObject( EObject object ) {
        if( lineNumbers.empty() ) {
            AbstractRiseClipseConsole.getConsole().warning(
                XML_HANDLER_CATEGORY, resourceURI.lastSegment(), 0, "linenumber stack empty !" );
        }
        else {
            // Will pop in endElement, because some attributes in the model
            // are sub-elements in XML, therefore they are not process here
            int lineNumber = lineNumbers.peek();
            if( object instanceof SclObject ) {
                (( SclObject ) object ).setLineNumber( lineNumber );
                (( SclObject ) object ).setFilename( resourceURI.lastSegment() );
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
        
        if(( feature.getUpperBound() == 1 ) && object.eIsSet( feature )) {
            AbstractRiseClipseConsole.getConsole().error(
                      XML_HANDLER_CATEGORY, resourceURI.lastSegment(), (( SclObject ) object ).getLineNumber(),
                      "there shall not be more than 1 ",
                      feature.getName(), " in ", object.eClass().getName() );
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
            AbstractRiseClipseConsole.getConsole().warning(
                XML_HANDLER_CATEGORY, resourceURI.lastSegment(), 0, "linenumber stack not empty !" );
            while( ! lineNumbers.empty() ) {
                AbstractRiseClipseConsole.getConsole().warning(
                    XML_HANDLER_CATEGORY, resourceURI.lastSegment(), lineNumbers.pop(), "popping " );
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
        int ln = 0;
        if( ! lineNumbers.empty() ) {
            ln = lineNumbers.peek();
        }
        // A feature from another namespace is ignored, so this is not an error
        if( prefix != null ) return;
        AbstractRiseClipseConsole.getConsole().error( XML_HANDLER_CATEGORY, resourceURI.lastSegment(),
                ln, "unknown feature \"", name, "\" in object ", peekObject.eClass().getName() );
    }

}
