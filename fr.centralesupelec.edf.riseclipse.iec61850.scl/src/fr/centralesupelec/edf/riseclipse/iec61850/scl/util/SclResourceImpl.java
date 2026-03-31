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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResource;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclResourceFactoryImpl
 * @generated NOT
 */
public class SclResourceImpl extends XMLResourceImpl implements IRiseClipseResource {
    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @param uri the URI of the new resource.
     * @generated
     */
    public SclResourceImpl( URI uri ) {
        super( uri );
    }

    @Override
    protected XMLLoad createXMLLoad() {
        return new SclLoadImpl( createXMLHelper() );
    }

    @Override
    protected XMLHelper createXMLHelper() {
        // XMLHelperImpl.getFeature(EClass eClass, String namespaceURI, String name)
        // ignore the namespace to find a feature using XMLHelperImpl.getFeatureWithoutMap(EClass eClass, String name)
        // (checked version in Eclipse 2023-09)
        //
        // This lead to the creation of SCL objects if elements from another namespace use existing SCL names.
        //
        // See issue https://github.com/riseclipse/riseclipse-metamodel-scl2003/issues/35:
        // The problem can also arise for attributes
        //
        return new XMLHelperImpl( this ) {
            private boolean otherNamespace = true;

            @Override
            public EStructuralFeature getFeature( EClass eClass, String namespaceURI, String name ) {
                otherNamespace = ( namespaceURI != null )
                            && ( ! namespaceURI.isEmpty() )
                            && ( ! SclPackage.eNS_URI.equals( namespaceURI ));
                return super.getFeature( eClass, namespaceURI, name );
            }

            @Override
            protected EStructuralFeature getFeatureWithoutMap( EClass eClass, String name ) {
                return otherNamespace ? null : super.getFeatureWithoutMap( eClass, name );
            }
        };
    }

    @Override
    public void printStatistics( IRiseClipseConsole console ) {
        // Nothing for the moment
    }

    @Override
    public void finalizeLoad( IRiseClipseConsole console ) {
        if( getContents().size() > 0 ) {
            SCL scl = ( SCL ) getContents().get( 0 );
            scl.buildExplicitLinks( console, false );
        }
    }

} // SclResourceImpl
