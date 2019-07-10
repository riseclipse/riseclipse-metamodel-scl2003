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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Eq Func Sub Func</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractEqFuncSubFuncImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractEqFuncSubFuncImpl#getEqSubFunction <em>Eq Sub Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractEqFuncSubFuncImpl#getSubGeneralEquipment <em>Sub General Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractEqFuncSubFuncImpl extends PowerSystemResourceImpl implements AbstractEqFuncSubFunc {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getEqSubFunction() <em>Eq Sub Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEqSubFunction()
     * @generated
     * @ordered
     */
    protected EList< EqSubFunction > eqSubFunction;

    /**
     * The cached value of the '{@link #getSubGeneralEquipment() <em>Sub General Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubGeneralEquipment()
     * @generated
     * @ordered
     */
    protected EList< GeneralEquipment > subGeneralEquipment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractEqFuncSubFuncImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getAbstractEqFuncSubFunc();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__TYPE, oldType,
                    type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__TYPE,
                    oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EqSubFunction > getEqSubFunction() {
        if( eqSubFunction == null ) {
            eqSubFunction = new EObjectContainmentWithInverseEList.Unsettable< EqSubFunction >( EqSubFunction.class,
                    this, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION,
                    SclPackage.EQ_SUB_FUNCTION__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC );
        }
        return eqSubFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEqSubFunction() {
        if( eqSubFunction != null ) ( ( InternalEList.Unsettable< ? > ) eqSubFunction ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEqSubFunction() {
        return eqSubFunction != null && ( ( InternalEList.Unsettable< ? > ) eqSubFunction ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GeneralEquipment > getSubGeneralEquipment() {
        if( subGeneralEquipment == null ) {
            subGeneralEquipment = new EObjectContainmentWithInverseEList.Unsettable< GeneralEquipment >(
                    GeneralEquipment.class, this, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT,
                    SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC );
        }
        return subGeneralEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubGeneralEquipment() {
        if( subGeneralEquipment != null ) ( ( InternalEList.Unsettable< ? > ) subGeneralEquipment ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubGeneralEquipment() {
        return subGeneralEquipment != null && ( ( InternalEList.Unsettable< ? > ) subGeneralEquipment ).isSet();
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
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEqSubFunction() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubGeneralEquipment() )
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
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION:
            return ( ( InternalEList< ? > ) getEqSubFunction() ).basicRemove( otherEnd, msgs );
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT:
            return ( ( InternalEList< ? > ) getSubGeneralEquipment() ).basicRemove( otherEnd, msgs );
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
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__TYPE:
            return getType();
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION:
            return getEqSubFunction();
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT:
            return getSubGeneralEquipment();
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
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__TYPE:
            setType( ( String ) newValue );
            return;
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION:
            getEqSubFunction().clear();
            getEqSubFunction().addAll( ( Collection< ? extends EqSubFunction > ) newValue );
            return;
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT:
            getSubGeneralEquipment().clear();
            getSubGeneralEquipment().addAll( ( Collection< ? extends GeneralEquipment > ) newValue );
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
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__TYPE:
            unsetType();
            return;
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION:
            unsetEqSubFunction();
            return;
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT:
            unsetSubGeneralEquipment();
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
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__TYPE:
            return isSetType();
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION:
            return isSetEqSubFunction();
        case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT:
            return isSetSubGeneralEquipment();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AbstractEqFuncSubFuncImpl
