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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Templates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl#getDAType <em>DA Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl#getDOType <em>DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl#getEnumType <em>Enum Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl#getLNodeType <em>LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl#getParentSCL <em>Parent SCL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeTemplatesImpl extends SclObjectImpl implements DataTypeTemplates {
    /**
     * The cached value of the '{@link #getDAType() <em>DA Type</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAType()
     * @generated
     * @ordered
     */
    protected EList< DAType > daType;

    /**
     * The cached value of the '{@link #getDOType() <em>DO Type</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDOType()
     * @generated
     * @ordered
     */
    protected EList< DOType > doType;

    /**
     * The cached value of the '{@link #getEnumType() <em>Enum Type</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnumType()
     * @generated
     * @ordered
     */
    protected EList< EnumType > enumType;

    /**
     * The cached value of the '{@link #getLNodeType() <em>LNode Type</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLNodeType()
     * @generated
     * @ordered
     */
    protected EList< LNodeType > lNodeType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataTypeTemplatesImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDataTypeTemplates();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DAType > getDAType() {
        if( daType == null ) {
            daType = new EObjectContainmentWithInverseEList.Unsettable< DAType >( DAType.class, this,
                    SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE, SclPackage.DA_TYPE__PARENT_DATA_TYPE_TEMPLATES );
        }
        return daType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDAType() {
        if( daType != null ) ( ( InternalEList.Unsettable< ? > ) daType ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDAType() {
        return daType != null && ( ( InternalEList.Unsettable< ? > ) daType ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DOType > getDOType() {
        if( doType == null ) {
            doType = new EObjectContainmentWithInverseEList.Unsettable< DOType >( DOType.class, this,
                    SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE, SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES );
        }
        return doType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDOType() {
        if( doType != null ) ( ( InternalEList.Unsettable< ? > ) doType ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDOType() {
        return doType != null && ( ( InternalEList.Unsettable< ? > ) doType ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EnumType > getEnumType() {
        if( enumType == null ) {
            enumType = new EObjectContainmentWithInverseEList.Unsettable< EnumType >( EnumType.class, this,
                    SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE, SclPackage.ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES );
        }
        return enumType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnumType() {
        if( enumType != null ) ( ( InternalEList.Unsettable< ? > ) enumType ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnumType() {
        return enumType != null && ( ( InternalEList.Unsettable< ? > ) enumType ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LNodeType > getLNodeType() {
        if( lNodeType == null ) {
            lNodeType = new EObjectContainmentWithInverseEList.Unsettable< LNodeType >( LNodeType.class, this,
                    SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE, SclPackage.LNODE_TYPE__PARENT_DATA_TYPE_TEMPLATES );
        }
        return lNodeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLNodeType() {
        if( lNodeType != null ) ( ( InternalEList.Unsettable< ? > ) lNodeType ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLNodeType() {
        return lNodeType != null && ( ( InternalEList.Unsettable< ? > ) lNodeType ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SCL getParentSCL() {
        if( eContainerFeatureID() != SclPackage.DATA_TYPE_TEMPLATES__PARENT_SCL ) return null;
        return ( SCL ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSCL( SCL newParentSCL, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSCL, SclPackage.DATA_TYPE_TEMPLATES__PARENT_SCL, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSCL( SCL newParentSCL ) {
        if( newParentSCL != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.DATA_TYPE_TEMPLATES__PARENT_SCL && newParentSCL != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSCL ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentSCL != null )
                msgs = ( ( InternalEObject ) newParentSCL ).eInverseAdd( this, SclPackage.SCL__DATA_TYPE_TEMPLATES,
                        SCL.class, msgs );
            msgs = basicSetParentSCL( newParentSCL, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DATA_TYPE_TEMPLATES__PARENT_SCL,
                    newParentSCL, newParentSCL ) );
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
        case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDAType() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDOType() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEnumType() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLNodeType() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.DATA_TYPE_TEMPLATES__PARENT_SCL:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentSCL( ( SCL ) otherEnd, msgs );
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
        case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
            return ( ( InternalEList< ? > ) getDAType() ).basicRemove( otherEnd, msgs );
        case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
            return ( ( InternalEList< ? > ) getDOType() ).basicRemove( otherEnd, msgs );
        case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
            return ( ( InternalEList< ? > ) getEnumType() ).basicRemove( otherEnd, msgs );
        case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
            return ( ( InternalEList< ? > ) getLNodeType() ).basicRemove( otherEnd, msgs );
        case SclPackage.DATA_TYPE_TEMPLATES__PARENT_SCL:
            return basicSetParentSCL( null, msgs );
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
        case SclPackage.DATA_TYPE_TEMPLATES__PARENT_SCL:
            return eInternalContainer().eInverseRemove( this, SclPackage.SCL__DATA_TYPE_TEMPLATES, SCL.class, msgs );
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
        case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
            return getDAType();
        case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
            return getDOType();
        case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
            return getEnumType();
        case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
            return getLNodeType();
        case SclPackage.DATA_TYPE_TEMPLATES__PARENT_SCL:
            return getParentSCL();
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
        case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
            getDAType().clear();
            getDAType().addAll( ( Collection< ? extends DAType > ) newValue );
            return;
        case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
            getDOType().clear();
            getDOType().addAll( ( Collection< ? extends DOType > ) newValue );
            return;
        case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
            getEnumType().clear();
            getEnumType().addAll( ( Collection< ? extends EnumType > ) newValue );
            return;
        case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
            getLNodeType().clear();
            getLNodeType().addAll( ( Collection< ? extends LNodeType > ) newValue );
            return;
        case SclPackage.DATA_TYPE_TEMPLATES__PARENT_SCL:
            setParentSCL( ( SCL ) newValue );
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
        case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
            unsetDAType();
            return;
        case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
            unsetDOType();
            return;
        case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
            unsetEnumType();
            return;
        case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
            unsetLNodeType();
            return;
        case SclPackage.DATA_TYPE_TEMPLATES__PARENT_SCL:
            setParentSCL( ( SCL ) null );
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
        case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
            return isSetDAType();
        case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
            return isSetDOType();
        case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
            return isSetEnumType();
        case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
            return isSetLNodeType();
        case SclPackage.DATA_TYPE_TEMPLATES__PARENT_SCL:
            return getParentSCL() != null;
        }
        return super.eIsSet( featureID );
    }

} //DataTypeTemplatesImpl
