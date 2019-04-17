/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.jdt.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExplicitLinkResolver;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Link Resolver</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExplicitLinkResolverImpl extends SclObjectImpl implements ExplicitLinkResolver {

    private boolean isResolved;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExplicitLinkResolverImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getExplicitLinkResolver();
    }

    /**
     */
    final public void resolveLinks() {
        if( isResolved ) return;
        doResolveLinks();
        isResolved = true;
        resolveChildren();
    }

    protected void doResolveLinks() {
    }

    private void resolveChildren() {
        // The default implementation propagates the call to included objects
        for( EObject o : eContents() ) {
            if( o instanceof ExplicitLinkResolver ) {
                ( ( ExplicitLinkResolver ) o ).resolveLinks();
            }
        }
    }

    protected void setIsResolved() {
        isResolved = true;
    }

    // get_ to make a difference with standard EMF getters
    protected SCL get_SCL() {
        EObject scl = this;
        while( ( scl != null ) && !( scl instanceof SCL ) ) {
            scl = scl.eContainer();
        }
        return ( SCL ) scl;
    }
    
    protected List< IED > get_IEDs() {
        SCL scl = get_SCL();
        if( scl == null ) return null;
        return scl.getIED();
    }
    
    protected List< Substation > get_Substations() {
        SCL scl = get_SCL();
        if( scl == null ) return null;
        return scl.getSubstation();
    }
    
    protected DataTypeTemplates get_DataTypeTemplates() {
        SCL scl = get_SCL();
        if( scl == null ) return null;
        return scl.getDataTypeTemplates();
    }

} //ExplicitLinkResolverImpl
