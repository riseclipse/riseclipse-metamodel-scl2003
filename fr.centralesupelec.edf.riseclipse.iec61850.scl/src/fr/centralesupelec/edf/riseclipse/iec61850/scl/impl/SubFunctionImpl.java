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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubFunctionImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubFunctionImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubFunctionImpl#getParentFunction <em>Parent Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubFunctionImpl#getGeneralEquipment <em>General Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubFunctionImpl#getSubSubFunctions <em>Sub Sub Functions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubFunctionImpl#getParentSubFunction <em>Parent Sub Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubFunctionImpl extends PowerSystemResourceImpl implements SubFunction {
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
     * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConductingEquipment()
     * @generated
     * @ordered
     */
    protected EList< ConductingEquipment > conductingEquipment;

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
     * The cached value of the '{@link #getSubSubFunctions() <em>Sub Sub Functions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubSubFunctions()
     * @generated
     * @ordered
     */
    protected EList< SubFunction > subSubFunctions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSubFunction();
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUB_FUNCTION__TYPE, oldType, type,
                    !oldTypeESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SUB_FUNCTION__TYPE, oldType,
                    TYPE_EDEFAULT, oldTypeESet ) );
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
    public EList< ConductingEquipment > getConductingEquipment() {
        if( conductingEquipment == null ) {
            conductingEquipment = new EObjectContainmentWithInverseEList.Unsettable< ConductingEquipment >(
                    ConductingEquipment.class, this, SclPackage.SUB_FUNCTION__CONDUCTING_EQUIPMENT,
                    SclPackage.CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION );
        }
        return conductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConductingEquipment() {
        if( conductingEquipment != null ) ( ( InternalEList.Unsettable< ? > ) conductingEquipment ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConductingEquipment() {
        return conductingEquipment != null && ( ( InternalEList.Unsettable< ? > ) conductingEquipment ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Function getParentFunction() {
        if( eContainerFeatureID() != SclPackage.SUB_FUNCTION__PARENT_FUNCTION ) return null;
        return ( Function ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunction( Function newParentFunction, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunction, SclPackage.SUB_FUNCTION__PARENT_FUNCTION,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunction( Function newParentFunction ) {
        if( newParentFunction != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SUB_FUNCTION__PARENT_FUNCTION
                        && newParentFunction != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunction ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentFunction != null )
                msgs = ( ( InternalEObject ) newParentFunction ).eInverseAdd( this, SclPackage.FUNCTION__SUB_FUNCTION,
                        Function.class, msgs );
            msgs = basicSetParentFunction( newParentFunction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUB_FUNCTION__PARENT_FUNCTION,
                    newParentFunction, newParentFunction ) );
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
                    GeneralEquipment.class, this, SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT,
                    SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION );
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
    @Override
    public EList< SubFunction > getSubSubFunctions() {
        if( subSubFunctions == null ) {
            subSubFunctions = new EObjectContainmentWithInverseEList.Unsettable< SubFunction >( SubFunction.class, this,
                    SclPackage.SUB_FUNCTION__SUB_SUB_FUNCTIONS, SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION );
        }
        return subSubFunctions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubSubFunctions() {
        if( subSubFunctions != null ) ( ( InternalEList.Unsettable< ? > ) subSubFunctions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubSubFunctions() {
        return subSubFunctions != null && ( ( InternalEList.Unsettable< ? > ) subSubFunctions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubFunction getParentSubFunction() {
        if( eContainerFeatureID() != SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION ) return null;
        return ( SubFunction ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSubFunction( SubFunction newParentSubFunction, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSubFunction,
                SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSubFunction( SubFunction newParentSubFunction ) {
        if( newParentSubFunction != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION
                        && newParentSubFunction != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSubFunction ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentSubFunction != null )
                msgs = ( ( InternalEObject ) newParentSubFunction ).eInverseAdd( this,
                        SclPackage.SUB_FUNCTION__SUB_SUB_FUNCTIONS, SubFunction.class, msgs );
            msgs = basicSetParentSubFunction( newParentSubFunction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION,
                    newParentSubFunction, newParentSubFunction ) );
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
        case SclPackage.SUB_FUNCTION__CONDUCTING_EQUIPMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConductingEquipment() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.SUB_FUNCTION__PARENT_FUNCTION:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentFunction( ( Function ) otherEnd, msgs );
        case SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGeneralEquipment() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.SUB_FUNCTION__SUB_SUB_FUNCTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubSubFunctions() )
                    .basicAdd( otherEnd, msgs );
        case SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentSubFunction( ( SubFunction ) otherEnd, msgs );
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
        case SclPackage.SUB_FUNCTION__CONDUCTING_EQUIPMENT:
            return ( ( InternalEList< ? > ) getConductingEquipment() ).basicRemove( otherEnd, msgs );
        case SclPackage.SUB_FUNCTION__PARENT_FUNCTION:
            return basicSetParentFunction( null, msgs );
        case SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT:
            return ( ( InternalEList< ? > ) getGeneralEquipment() ).basicRemove( otherEnd, msgs );
        case SclPackage.SUB_FUNCTION__SUB_SUB_FUNCTIONS:
            return ( ( InternalEList< ? > ) getSubSubFunctions() ).basicRemove( otherEnd, msgs );
        case SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION:
            return basicSetParentSubFunction( null, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch( eContainerFeatureID() ) {
        case SclPackage.SUB_FUNCTION__PARENT_FUNCTION:
            return eInternalContainer().eInverseRemove( this, SclPackage.FUNCTION__SUB_FUNCTION, Function.class, msgs );
        case SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION:
            return eInternalContainer().eInverseRemove( this, SclPackage.SUB_FUNCTION__SUB_SUB_FUNCTIONS,
                    SubFunction.class, msgs );
        }
        return super.eBasicRemoveFromContainerFeature( msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.SUB_FUNCTION__TYPE:
            return getType();
        case SclPackage.SUB_FUNCTION__CONDUCTING_EQUIPMENT:
            return getConductingEquipment();
        case SclPackage.SUB_FUNCTION__PARENT_FUNCTION:
            return getParentFunction();
        case SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT:
            return getGeneralEquipment();
        case SclPackage.SUB_FUNCTION__SUB_SUB_FUNCTIONS:
            return getSubSubFunctions();
        case SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION:
            return getParentSubFunction();
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
        case SclPackage.SUB_FUNCTION__TYPE:
            setType( ( String ) newValue );
            return;
        case SclPackage.SUB_FUNCTION__CONDUCTING_EQUIPMENT:
            getConductingEquipment().clear();
            getConductingEquipment().addAll( ( Collection< ? extends ConductingEquipment > ) newValue );
            return;
        case SclPackage.SUB_FUNCTION__PARENT_FUNCTION:
            setParentFunction( ( Function ) newValue );
            return;
        case SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT:
            getGeneralEquipment().clear();
            getGeneralEquipment().addAll( ( Collection< ? extends GeneralEquipment > ) newValue );
            return;
        case SclPackage.SUB_FUNCTION__SUB_SUB_FUNCTIONS:
            getSubSubFunctions().clear();
            getSubSubFunctions().addAll( ( Collection< ? extends SubFunction > ) newValue );
            return;
        case SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION:
            setParentSubFunction( ( SubFunction ) newValue );
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
        case SclPackage.SUB_FUNCTION__TYPE:
            unsetType();
            return;
        case SclPackage.SUB_FUNCTION__CONDUCTING_EQUIPMENT:
            unsetConductingEquipment();
            return;
        case SclPackage.SUB_FUNCTION__PARENT_FUNCTION:
            setParentFunction( ( Function ) null );
            return;
        case SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT:
            unsetGeneralEquipment();
            return;
        case SclPackage.SUB_FUNCTION__SUB_SUB_FUNCTIONS:
            unsetSubSubFunctions();
            return;
        case SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION:
            setParentSubFunction( ( SubFunction ) null );
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
        case SclPackage.SUB_FUNCTION__TYPE:
            return isSetType();
        case SclPackage.SUB_FUNCTION__CONDUCTING_EQUIPMENT:
            return isSetConductingEquipment();
        case SclPackage.SUB_FUNCTION__PARENT_FUNCTION:
            return getParentFunction() != null;
        case SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT:
            return isSetGeneralEquipment();
        case SclPackage.SUB_FUNCTION__SUB_SUB_FUNCTIONS:
            return isSetSubSubFunctions();
        case SclPackage.SUB_FUNCTION__PARENT_SUB_FUNCTION:
            return getParentSubFunction() != null;
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

} //SubFunctionImpl
