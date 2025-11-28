/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.asd.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power System Relations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationsImpl#getPowerSystemRelation <em>Power System Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSystemRelationsImpl extends BaseExtensionElementWithDescImpl implements PowerSystemRelations {
    /**
     * The cached value of the '{@link #getPowerSystemRelation() <em>Power System Relation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemRelation()
     * @generated
     * @ordered
     */
    protected EList< PowerSystemRelation > powerSystemRelation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerSystemRelationsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getPowerSystemRelations();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerSystemRelation > getPowerSystemRelation() {
        if( powerSystemRelation == null ) {
            powerSystemRelation = new EObjectContainmentWithInverseEList.Unsettable< PowerSystemRelation >(
                    PowerSystemRelation.class, this, AsdPackage.POWER_SYSTEM_RELATIONS__POWER_SYSTEM_RELATION,
                    AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION );
        }
        return powerSystemRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerSystemRelation() {
        if( powerSystemRelation != null ) ( ( InternalEList.Unsettable< ? > ) powerSystemRelation ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemRelation() {
        return powerSystemRelation != null && ( ( InternalEList.Unsettable< ? > ) powerSystemRelation ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.POWER_SYSTEM_RELATIONS__POWER_SYSTEM_RELATION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerSystemRelation() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.POWER_SYSTEM_RELATIONS__POWER_SYSTEM_RELATION:
            return ( ( InternalEList< ? > ) getPowerSystemRelation() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.POWER_SYSTEM_RELATIONS__POWER_SYSTEM_RELATION:
            return getPowerSystemRelation();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case AsdPackage.POWER_SYSTEM_RELATIONS__POWER_SYSTEM_RELATION:
            getPowerSystemRelation().clear();
            getPowerSystemRelation().addAll( ( Collection< ? extends PowerSystemRelation > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case AsdPackage.POWER_SYSTEM_RELATIONS__POWER_SYSTEM_RELATION:
            unsetPowerSystemRelation();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case AsdPackage.POWER_SYSTEM_RELATIONS__POWER_SYSTEM_RELATION:
            return isSetPowerSystemRelation();
        }
        return super.eIsSet( featureID );
    }

} //PowerSystemRelationsImpl
