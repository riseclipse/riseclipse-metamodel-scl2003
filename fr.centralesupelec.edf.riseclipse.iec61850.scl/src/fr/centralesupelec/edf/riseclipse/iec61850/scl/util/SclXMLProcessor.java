/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class SclXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SclXMLProcessor() {
        super( ( EPackage.Registry.INSTANCE ) );
        SclPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the SclResourceFactoryImpl factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map< String, Resource.Factory > getRegistrations() {
        if( registrations == null ) {
            super.getRegistrations();
            registrations.put( XML_EXTENSION, new SclResourceFactoryImpl() );
            registrations.put( STAR_EXTENSION, new SclResourceFactoryImpl() );
        }
        return registrations;
    }

} // SclXMLProcessor
