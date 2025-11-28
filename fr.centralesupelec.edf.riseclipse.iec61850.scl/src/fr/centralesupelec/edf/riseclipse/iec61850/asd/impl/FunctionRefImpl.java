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

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRefImpl#getSignalRole <em>Signal Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRefImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRefImpl#getFunctionUuid <em>Function Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRefImpl#getParentAllocationRole <em>Parent Allocation Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRefImpl#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRefImpl#getRefersToFunction <em>Refers To Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionRefImpl extends FunctionalVariantRefContainerImpl implements FunctionRef {
    /**
     * The cached value of the '{@link #getSignalRole() <em>Signal Role</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSignalRole()
     * @generated
     * @ordered
     */
    protected EList< SignalRole > signalRole;

    /**
     * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected static final String FUNCTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunction()
     * @generated
     * @ordered
     */
    protected String function = FUNCTION_EDEFAULT;

    /**
     * The default value of the '{@link #getFunctionUuid() <em>Function Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionUuid()
     * @generated
     * @ordered
     */
    protected static final String FUNCTION_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFunctionUuid() <em>Function Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionUuid()
     * @generated
     * @ordered
     */
    protected String functionUuid = FUNCTION_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToFunction() <em>Refers To Function</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToFunction()
     * @generated
     * @ordered
     */
    protected Function refersToFunction;

    /**
     * This is true if the Refers To Function reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToFunctionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getFunctionRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SignalRole > getSignalRole() {
        if( signalRole == null ) {
            signalRole = new EObjectContainmentWithInverseEList.Unsettable< >( SignalRole.class, this,
                    AsdPackage.FUNCTION_REF__SIGNAL_ROLE, SclPackage.SIGNAL_ROLE__PARENT_FUNCTION_REF );
        }
        return signalRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSignalRole() {
        if( signalRole != null ) {
            ( ( InternalEList.Unsettable< ? > ) signalRole ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSignalRole() {
        return signalRole != null && ( ( InternalEList.Unsettable< ? > ) signalRole ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFunction() {
        return function;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunction( String newFunction ) {
        String oldFunction = function;
        function = newFunction;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_REF__FUNCTION, oldFunction,
                    function ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFunctionUuid() {
        return functionUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunctionUuid( String newFunctionUuid ) {
        String oldFunctionUuid = functionUuid;
        functionUuid = newFunctionUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_REF__FUNCTION_UUID,
                    oldFunctionUuid, functionUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AllocationRole getParentAllocationRole() {
        if( eContainerFeatureID() != AsdPackage.FUNCTION_REF__PARENT_ALLOCATION_ROLE ) {
            return null;
        }
        return ( AllocationRole ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAllocationRole( AllocationRole newParentAllocationRole,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAllocationRole,
                AsdPackage.FUNCTION_REF__PARENT_ALLOCATION_ROLE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAllocationRole( AllocationRole newParentAllocationRole ) {
        if( newParentAllocationRole != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.FUNCTION_REF__PARENT_ALLOCATION_ROLE
                        && newParentAllocationRole != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAllocationRole ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentAllocationRole != null ) {
                msgs = ( ( InternalEObject ) newParentAllocationRole ).eInverseAdd( this,
                        AsdPackage.ALLOCATION_ROLE__FUNCTION_REF, AllocationRole.class, msgs );
            }
            msgs = basicSetParentAllocationRole( newParentAllocationRole, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_REF__PARENT_ALLOCATION_ROLE,
                    newParentAllocationRole, newParentAllocationRole ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionRoleContent getParentFunctionRoleContent() {
        if( eContainerFeatureID() != AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT ) {
            return null;
        }
        return ( FunctionRoleContent ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionRoleContent( FunctionRoleContent newParentFunctionRoleContent,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionRoleContent,
                AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionRoleContent( FunctionRoleContent newParentFunctionRoleContent ) {
        if( newParentFunctionRoleContent != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT
                        && newParentFunctionRoleContent != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionRoleContent ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentFunctionRoleContent != null ) {
                msgs = ( ( InternalEObject ) newParentFunctionRoleContent ).eInverseAdd( this,
                        AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_REF, FunctionRoleContent.class, msgs );
            }
            msgs = basicSetParentFunctionRoleContent( newParentFunctionRoleContent, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT, newParentFunctionRoleContent,
                    newParentFunctionRoleContent ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Function getRefersToFunction() {
        return refersToFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToFunction( Function newRefersToFunction, NotificationChain msgs ) {
        Function oldRefersToFunction = refersToFunction;
        refersToFunction = newRefersToFunction;
        boolean oldRefersToFunctionESet = refersToFunctionESet;
        refersToFunctionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTION_REF__REFERS_TO_FUNCTION, oldRefersToFunction, newRefersToFunction,
                    !oldRefersToFunctionESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToFunction( Function newRefersToFunction ) {
        if( newRefersToFunction != refersToFunction ) {
            NotificationChain msgs = null;
            if( refersToFunction != null ) {
                msgs = ( ( InternalEObject ) refersToFunction ).eInverseRemove( this,
                        SclPackage.FUNCTION__REFERRED_BY_FUNCTION_REF, Function.class, msgs );
            }
            if( newRefersToFunction != null ) {
                msgs = ( ( InternalEObject ) newRefersToFunction ).eInverseAdd( this,
                        SclPackage.FUNCTION__REFERRED_BY_FUNCTION_REF, Function.class, msgs );
            }
            msgs = basicSetRefersToFunction( newRefersToFunction, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToFunctionESet = refersToFunctionESet;
            refersToFunctionESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_REF__REFERS_TO_FUNCTION,
                        newRefersToFunction, newRefersToFunction, !oldRefersToFunctionESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToFunction( NotificationChain msgs ) {
        Function oldRefersToFunction = refersToFunction;
        refersToFunction = null;
        boolean oldRefersToFunctionESet = refersToFunctionESet;
        refersToFunctionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.FUNCTION_REF__REFERS_TO_FUNCTION, oldRefersToFunction, null, oldRefersToFunctionESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToFunction() {
        if( refersToFunction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToFunction ).eInverseRemove( this,
                    SclPackage.FUNCTION__REFERRED_BY_FUNCTION_REF, Function.class, msgs );
            msgs = basicUnsetRefersToFunction( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToFunctionESet = refersToFunctionESet;
            refersToFunctionESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.FUNCTION_REF__REFERS_TO_FUNCTION,
                        null, null, oldRefersToFunctionESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToFunction() {
        return refersToFunctionESet;
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
        case AsdPackage.FUNCTION_REF__SIGNAL_ROLE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSignalRole() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.FUNCTION_REF__PARENT_ALLOCATION_ROLE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentAllocationRole( ( AllocationRole ) otherEnd, msgs );
        case AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionRoleContent( ( FunctionRoleContent ) otherEnd, msgs );
        case AsdPackage.FUNCTION_REF__REFERS_TO_FUNCTION:
            if( refersToFunction != null ) {
                msgs = ( ( InternalEObject ) refersToFunction ).eInverseRemove( this,
                        SclPackage.FUNCTION__REFERRED_BY_FUNCTION_REF, Function.class, msgs );
            }
            return basicSetRefersToFunction( ( Function ) otherEnd, msgs );
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
        case AsdPackage.FUNCTION_REF__SIGNAL_ROLE:
            return ( ( InternalEList< ? > ) getSignalRole() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_REF__PARENT_ALLOCATION_ROLE:
            return basicSetParentAllocationRole( null, msgs );
        case AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return basicSetParentFunctionRoleContent( null, msgs );
        case AsdPackage.FUNCTION_REF__REFERS_TO_FUNCTION:
            return basicUnsetRefersToFunction( msgs );
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
        case AsdPackage.FUNCTION_REF__PARENT_ALLOCATION_ROLE:
            return eInternalContainer().eInverseRemove( this, AsdPackage.ALLOCATION_ROLE__FUNCTION_REF,
                    AllocationRole.class, msgs );
        case AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return eInternalContainer().eInverseRemove( this, AsdPackage.FUNCTION_ROLE_CONTENT__FUNCTION_REF,
                    FunctionRoleContent.class, msgs );
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
        case AsdPackage.FUNCTION_REF__SIGNAL_ROLE:
            return getSignalRole();
        case AsdPackage.FUNCTION_REF__FUNCTION:
            return getFunction();
        case AsdPackage.FUNCTION_REF__FUNCTION_UUID:
            return getFunctionUuid();
        case AsdPackage.FUNCTION_REF__PARENT_ALLOCATION_ROLE:
            return getParentAllocationRole();
        case AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent();
        case AsdPackage.FUNCTION_REF__REFERS_TO_FUNCTION:
            return getRefersToFunction();
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
        case AsdPackage.FUNCTION_REF__SIGNAL_ROLE:
            getSignalRole().clear();
            getSignalRole().addAll( ( Collection< ? extends SignalRole > ) newValue );
            return;
        case AsdPackage.FUNCTION_REF__FUNCTION:
            setFunction( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_REF__FUNCTION_UUID:
            setFunctionUuid( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_REF__PARENT_ALLOCATION_ROLE:
            setParentAllocationRole( ( AllocationRole ) newValue );
            return;
        case AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) newValue );
            return;
        case AsdPackage.FUNCTION_REF__REFERS_TO_FUNCTION:
            setRefersToFunction( ( Function ) newValue );
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
        case AsdPackage.FUNCTION_REF__SIGNAL_ROLE:
            unsetSignalRole();
            return;
        case AsdPackage.FUNCTION_REF__FUNCTION:
            setFunction( FUNCTION_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_REF__FUNCTION_UUID:
            setFunctionUuid( FUNCTION_UUID_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_REF__PARENT_ALLOCATION_ROLE:
            setParentAllocationRole( ( AllocationRole ) null );
            return;
        case AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) null );
            return;
        case AsdPackage.FUNCTION_REF__REFERS_TO_FUNCTION:
            unsetRefersToFunction();
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
        case AsdPackage.FUNCTION_REF__SIGNAL_ROLE:
            return isSetSignalRole();
        case AsdPackage.FUNCTION_REF__FUNCTION:
            return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals( function );
        case AsdPackage.FUNCTION_REF__FUNCTION_UUID:
            return FUNCTION_UUID_EDEFAULT == null ? functionUuid != null
                    : !FUNCTION_UUID_EDEFAULT.equals( functionUuid );
        case AsdPackage.FUNCTION_REF__PARENT_ALLOCATION_ROLE:
            return getParentAllocationRole() != null;
        case AsdPackage.FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent() != null;
        case AsdPackage.FUNCTION_REF__REFERS_TO_FUNCTION:
            return isSetRefersToFunction();
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
        result.append( " (function: " );
        result.append( function );
        result.append( ", functionUuid: " );
        result.append( functionUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "FunctionRefImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from FunctionRef: ";
        doBuildExplicitLinkWithFunction( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithFunction( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for Function) ";

        if( getFunctionUuid() != null && !getFunctionUuid().isEmpty() ) {
            SCL sclRoot = AsdUtilities.getSCL( this );

            Pair< Function, Integer > res = AsdUtilities.getFunctionFromUuid( sclRoot, getFunctionUuid() );

            if( res.getLeft() != null ) {
                setRefersToFunction( res.getLeft() );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "FunctionRef refers to Function( id = ", getFunctionUuid(), " ) on line ",
                        getRefersToFunction().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( refersToFunction.size() == 0 ) ? "cannot find" : "found several" ),
                //         " Function( uuid = ", getFunctionUuid(), " )" );
            }

        }
        else if( getFunction() != null && !getFunction().isEmpty() ) {
            String[] functionPath = getFunction().split( "/" );
            SclObject scl = AsdUtilities.getSCL( this );
            Pair< LNodeContainer, Integer > function = AsdUtilities.getLNodeContainer( scl, functionPath );

            if( function.getLeft() != null && function.getLeft() instanceof Function ) {
                setRefersToFunction( ( Function ) function.getLeft() );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "FunctionRef refers to Function( id = ", getRefersToFunction().getName(), " )", " on line ",
                        getRefersToFunction().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( refersToFunction.size() == 0 ) ? "cannot find" : "found several" ),
                //         " Function( name = ", getFunction(), " )" );
            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because function and functionUuid are missing" );
        }

    }

} //FunctionRefImpl
