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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResourceFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclResourceImpl
 * @generated NOT
 */
public class SclResourceFactoryImpl extends ResourceFactoryImpl implements IRiseClipseResourceFactory {

    /**
     * Creates an instance of the resource factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SclResourceFactoryImpl() {
        super();
    }

    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated NOT
     */
    @Override
    public SclResourceImpl createResource( URI uri ) {
        SclResourceImpl result = new SclResourceImpl( uri );

        result.getDefaultSaveOptions().put( XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE );
        result.getDefaultLoadOptions().put( XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE );

        result.getDefaultSaveOptions().put( XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE );

        result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE );
        result.getDefaultSaveOptions().put( XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE );

        // Determines whether comments and CDATA will be preserved in any mixed text processing.
        result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE );

        result.getDefaultLoadOptions().put( XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE );

        // Default is true, turn to false to improve deserialization performance.
        result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE );

        return result;
    }

} // SclResourceFactoryImpl
