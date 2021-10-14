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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EquipmentContainerImpl#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EquipmentContainerImpl#getGeneralEquipment <em>General Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipmentContainerImpl extends PowerSystemResourceImpl implements EquipmentContainer {
    /**
     * The cached value of the '{@link #getPowerTransformer() <em>Power Transformer</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerTransformer()
     * @generated
     * @ordered
     */
    protected EList< PowerTransformer > powerTransformer;

    /**
     * The cached value of the '{@link #getGeneralEquipment() <em>General Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneralEquipment()
     * @generated
     * @ordered
     */
    protected EList< GeneralEquipment > generalEquipment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EquipmentContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getEquipmentContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerTransformer > getPowerTransformer() {
        if( powerTransformer == null ) {
            powerTransformer = new EObjectContainmentWithInverseEList.Unsettable< PowerTransformer >(
                    PowerTransformer.class, this, SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER,
                    SclPackage.POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER );
        }
        return powerTransformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerTransformer() {
        if( powerTransformer != null ) ( ( InternalEList.Unsettable< ? > ) powerTransformer ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerTransformer() {
        return powerTransformer != null && ( ( InternalEList.Unsettable< ? > ) powerTransformer ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GeneralEquipment > getGeneralEquipment() {
        if( generalEquipment == null ) {
            generalEquipment = new EObjectContainmentWithInverseEList.Unsettable< GeneralEquipment >(
                    GeneralEquipment.class, this, SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT,
                    SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER );
        }
        return generalEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGeneralEquipment() {
        if( generalEquipment != null ) ( ( InternalEList.Unsettable< ? > ) generalEquipment ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGeneralEquipment() {
        return generalEquipment != null && ( ( InternalEList.Unsettable< ? > ) generalEquipment ).isSet();
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
        case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerTransformer() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGeneralEquipment() )
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
        case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
            return ( ( InternalEList< ? > ) getPowerTransformer() ).basicRemove( otherEnd, msgs );
        case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
            return ( ( InternalEList< ? > ) getGeneralEquipment() ).basicRemove( otherEnd, msgs );
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
        case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
            return getPowerTransformer();
        case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
            return getGeneralEquipment();
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
        case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
            getPowerTransformer().clear();
            getPowerTransformer().addAll( ( Collection< ? extends PowerTransformer > ) newValue );
            return;
        case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
            getGeneralEquipment().clear();
            getGeneralEquipment().addAll( ( Collection< ? extends GeneralEquipment > ) newValue );
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
        case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
            unsetPowerTransformer();
            return;
        case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
            unsetGeneralEquipment();
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
        case SclPackage.EQUIPMENT_CONTAINER__POWER_TRANSFORMER:
            return isSetPowerTransformer();
        case SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
            return isSetGeneralEquipment();
        }
        return super.eIsSet( featureID );
    }

} //EquipmentContainerImpl
