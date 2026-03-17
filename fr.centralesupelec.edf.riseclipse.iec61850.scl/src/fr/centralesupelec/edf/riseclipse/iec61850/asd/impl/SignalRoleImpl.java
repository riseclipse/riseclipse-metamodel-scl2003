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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SignalRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SignalRoleImpl#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SignalRoleImpl#getParentFunctionRef <em>Parent Function Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SignalRoleImpl#getLNodeInputRef <em>LNode Input Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SignalRoleImpl#getLNodeOutputRef <em>LNode Output Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SignalRoleImpl#getLNodeDataRef <em>LNode Data Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalRoleImpl extends FunctionalVariantRefContainerImpl implements SignalRole {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The default value of the '{@link #getOriginUuid() <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginUuid()
     * @generated
     * @ordered
     */
    protected static final String ORIGIN_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOriginUuid() <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginUuid()
     * @generated
     * @ordered
     */
    protected String originUuid = ORIGIN_UUID_EDEFAULT;

    /**
     * This is true if the Origin Uuid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean originUuidESet;

    /**
     * The cached value of the '{@link #getLNodeInputRef() <em>LNode Input Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLNodeInputRef()
     * @generated
     * @ordered
     */
    protected EList< LNodeInputRef > lNodeInputRef;

    /**
     * The cached value of the '{@link #getLNodeOutputRef() <em>LNode Output Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLNodeOutputRef()
     * @generated
     * @ordered
     */
    protected EList< LNodeOutputRef > lNodeOutputRef;

    /**
     * The cached value of the '{@link #getLNodeDataRef() <em>LNode Data Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLNodeDataRef()
     * @generated
     * @ordered
     */
    protected EList< LNodeDataRef > lNodeDataRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SignalRoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getSignalRole();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SIGNAL_ROLE__NAME, oldName, name,
                    !oldNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SIGNAL_ROLE__NAME, oldName,
                    NAME_EDEFAULT, oldNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOriginUuid() {
        return originUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOriginUuid( String newOriginUuid ) {
        String oldOriginUuid = originUuid;
        originUuid = newOriginUuid;
        boolean oldOriginUuidESet = originUuidESet;
        originUuidESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SIGNAL_ROLE__ORIGIN_UUID, oldOriginUuid,
                    originUuid, !oldOriginUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOriginUuid() {
        String oldOriginUuid = originUuid;
        boolean oldOriginUuidESet = originUuidESet;
        originUuid = ORIGIN_UUID_EDEFAULT;
        originUuidESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SIGNAL_ROLE__ORIGIN_UUID,
                    oldOriginUuid, ORIGIN_UUID_EDEFAULT, oldOriginUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOriginUuid() {
        return originUuidESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionRef getParentFunctionRef() {
        if( eContainerFeatureID() != AsdPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF ) {
            return null;
        }
        return ( FunctionRef ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionRef( FunctionRef newParentFunctionRef, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionRef,
                AsdPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionRef( FunctionRef newParentFunctionRef ) {
        if( newParentFunctionRef != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF
                        && newParentFunctionRef != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionRef ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentFunctionRef != null ) {
                msgs = ( ( InternalEObject ) newParentFunctionRef ).eInverseAdd( this,
                        AsdPackage.FUNCTION_REF__SIGNAL_ROLE, FunctionRef.class, msgs );
            }
            msgs = basicSetParentFunctionRef( newParentFunctionRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF,
                    newParentFunctionRef, newParentFunctionRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LNodeInputRef > getLNodeInputRef() {
        if( lNodeInputRef == null ) {
            lNodeInputRef = new EObjectContainmentWithInverseEList.Unsettable< >( LNodeInputRef.class,
                    this, AsdPackage.SIGNAL_ROLE__LNODE_INPUT_REF, AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE );
        }
        return lNodeInputRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLNodeInputRef() {
        if( lNodeInputRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) lNodeInputRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLNodeInputRef() {
        return lNodeInputRef != null && ( ( InternalEList.Unsettable< ? > ) lNodeInputRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LNodeOutputRef > getLNodeOutputRef() {
        if( lNodeOutputRef == null ) {
            lNodeOutputRef = new EObjectContainmentWithInverseEList.Unsettable< >( LNodeOutputRef.class,
                    this, AsdPackage.SIGNAL_ROLE__LNODE_OUTPUT_REF, AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE );
        }
        return lNodeOutputRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLNodeOutputRef() {
        if( lNodeOutputRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) lNodeOutputRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLNodeOutputRef() {
        return lNodeOutputRef != null && ( ( InternalEList.Unsettable< ? > ) lNodeOutputRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LNodeDataRef > getLNodeDataRef() {
        if( lNodeDataRef == null ) {
            lNodeDataRef = new EObjectContainmentWithInverseEList.Unsettable< >( LNodeDataRef.class, this,
                    AsdPackage.SIGNAL_ROLE__LNODE_DATA_REF, AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE );
        }
        return lNodeDataRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLNodeDataRef() {
        if( lNodeDataRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) lNodeDataRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLNodeDataRef() {
        return lNodeDataRef != null && ( ( InternalEList.Unsettable< ? > ) lNodeDataRef ).isSet();
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
        case AsdPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionRef( ( FunctionRef ) otherEnd, msgs );
        case AsdPackage.SIGNAL_ROLE__LNODE_INPUT_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLNodeInputRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SIGNAL_ROLE__LNODE_OUTPUT_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLNodeOutputRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SIGNAL_ROLE__LNODE_DATA_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLNodeDataRef() ).basicAdd( otherEnd,
                    msgs );
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
        case AsdPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF:
            return basicSetParentFunctionRef( null, msgs );
        case AsdPackage.SIGNAL_ROLE__LNODE_INPUT_REF:
            return ( ( InternalEList< ? > ) getLNodeInputRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SIGNAL_ROLE__LNODE_OUTPUT_REF:
            return ( ( InternalEList< ? > ) getLNodeOutputRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SIGNAL_ROLE__LNODE_DATA_REF:
            return ( ( InternalEList< ? > ) getLNodeDataRef() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF:
            return eInternalContainer().eInverseRemove( this, AsdPackage.FUNCTION_REF__SIGNAL_ROLE, FunctionRef.class,
                    msgs );
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
        case AsdPackage.SIGNAL_ROLE__NAME:
            return getName();
        case AsdPackage.SIGNAL_ROLE__ORIGIN_UUID:
            return getOriginUuid();
        case AsdPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF:
            return getParentFunctionRef();
        case AsdPackage.SIGNAL_ROLE__LNODE_INPUT_REF:
            return getLNodeInputRef();
        case AsdPackage.SIGNAL_ROLE__LNODE_OUTPUT_REF:
            return getLNodeOutputRef();
        case AsdPackage.SIGNAL_ROLE__LNODE_DATA_REF:
            return getLNodeDataRef();
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
        case AsdPackage.SIGNAL_ROLE__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.SIGNAL_ROLE__ORIGIN_UUID:
            setOriginUuid( ( String ) newValue );
            return;
        case AsdPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF:
            setParentFunctionRef( ( FunctionRef ) newValue );
            return;
        case AsdPackage.SIGNAL_ROLE__LNODE_INPUT_REF:
            getLNodeInputRef().clear();
            getLNodeInputRef().addAll( ( Collection< ? extends LNodeInputRef > ) newValue );
            return;
        case AsdPackage.SIGNAL_ROLE__LNODE_OUTPUT_REF:
            getLNodeOutputRef().clear();
            getLNodeOutputRef().addAll( ( Collection< ? extends LNodeOutputRef > ) newValue );
            return;
        case AsdPackage.SIGNAL_ROLE__LNODE_DATA_REF:
            getLNodeDataRef().clear();
            getLNodeDataRef().addAll( ( Collection< ? extends LNodeDataRef > ) newValue );
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
        case AsdPackage.SIGNAL_ROLE__NAME:
            unsetName();
            return;
        case AsdPackage.SIGNAL_ROLE__ORIGIN_UUID:
            unsetOriginUuid();
            return;
        case AsdPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF:
            setParentFunctionRef( ( FunctionRef ) null );
            return;
        case AsdPackage.SIGNAL_ROLE__LNODE_INPUT_REF:
            unsetLNodeInputRef();
            return;
        case AsdPackage.SIGNAL_ROLE__LNODE_OUTPUT_REF:
            unsetLNodeOutputRef();
            return;
        case AsdPackage.SIGNAL_ROLE__LNODE_DATA_REF:
            unsetLNodeDataRef();
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
        case AsdPackage.SIGNAL_ROLE__NAME:
            return isSetName();
        case AsdPackage.SIGNAL_ROLE__ORIGIN_UUID:
            return isSetOriginUuid();
        case AsdPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF:
            return getParentFunctionRef() != null;
        case AsdPackage.SIGNAL_ROLE__LNODE_INPUT_REF:
            return isSetLNodeInputRef();
        case AsdPackage.SIGNAL_ROLE__LNODE_OUTPUT_REF:
            return isSetLNodeOutputRef();
        case AsdPackage.SIGNAL_ROLE__LNODE_DATA_REF:
            return isSetLNodeDataRef();
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (name: " );
        if( nameESet ) {
            result.append( name );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", originUuid: " );
        if( originUuidESet ) {
            result.append( originUuid );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //SignalRoleImpl
