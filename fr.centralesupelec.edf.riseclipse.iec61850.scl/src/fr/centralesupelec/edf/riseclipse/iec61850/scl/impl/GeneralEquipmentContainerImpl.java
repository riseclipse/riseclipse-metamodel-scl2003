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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Equipment Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentContainerImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentContainerImpl#getGeneralEquipment <em>General Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralEquipmentContainerImpl extends PowerSystemResourceImpl implements GeneralEquipmentContainer {
    /**
     * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected EList< Function > function;

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
    protected GeneralEquipmentContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getGeneralEquipmentContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Function > getFunction() {
        if( function == null ) {
            function = new EObjectContainmentWithInverseEList.Unsettable< Function >( Function.class, this,
                    SclPackage.GENERAL_EQUIPMENT_CONTAINER__FUNCTION,
                    SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER );
        }
        return function;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunction() {
        if( function != null ) ( ( InternalEList.Unsettable< ? > ) function ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunction() {
        return function != null && ( ( InternalEList.Unsettable< ? > ) function ).isSet();
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
                    GeneralEquipment.class, this, SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT,
                    SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER );
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
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__FUNCTION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunction() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
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
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__FUNCTION:
            return ( ( InternalEList< ? > ) getFunction() ).basicRemove( otherEnd, msgs );
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
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
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__FUNCTION:
            return getFunction();
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
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
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__FUNCTION:
            getFunction().clear();
            getFunction().addAll( ( Collection< ? extends Function > ) newValue );
            return;
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
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
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__FUNCTION:
            unsetFunction();
            return;
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
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
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__FUNCTION:
            return isSetFunction();
        case SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT:
            return isSetGeneralEquipment();
        }
        return super.eIsSet( featureID );
    }

} //GeneralEquipmentContainerImpl
