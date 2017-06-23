/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  This file is part of the RiseClipse tool
 * 
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExplicitLinkResolver;
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
    public void printStatistics( IRiseClipseConsole console ) {
        // Nothing for the moment
    }

    @Override
    public void finalizeLoad( boolean ignore_unresolved_reference ) {
        if( getContents().size() > 0 ) {
            ExplicitLinkResolver scl = ( ExplicitLinkResolver ) getContents().get( 0 );
            scl.resolveLinks();
        }
    }
    
} // SclResourceImpl
