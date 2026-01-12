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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LNode Output Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeOutputRefImpl#getControlRef <em>Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeOutputRefImpl#getControlRefUuid <em>Control Ref Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeOutputRefImpl#getRefersToControlRef <em>Refers To Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeOutputRefImpl#getParentSignalRole <em>Parent Signal Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNodeOutputRefImpl extends FunctionalVariantRefContainerImpl implements LNodeOutputRef {
    /**
     * The default value of the '{@link #getControlRef() <em>Control Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlRef()
     * @generated
     * @ordered
     */
    protected static final String CONTROL_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlRef() <em>Control Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlRef()
     * @generated
     * @ordered
     */
    protected String controlRef = CONTROL_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getControlRefUuid() <em>Control Ref Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlRefUuid()
     * @generated
     * @ordered
     */
    protected static final String CONTROL_REF_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlRefUuid() <em>Control Ref Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlRefUuid()
     * @generated
     * @ordered
     */
    protected String controlRefUuid = CONTROL_REF_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToControlRef() <em>Refers To Control Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToControlRef()
     * @generated
     * @ordered
     */
    protected ControlRef refersToControlRef;

    /**
     * This is true if the Refers To Control Ref reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToControlRefESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNodeOutputRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getLNodeOutputRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getControlRef() {
        return controlRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlRef( String newControlRef ) {
        String oldControlRef = controlRef;
        controlRef = newControlRef;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_OUTPUT_REF__CONTROL_REF,
                    oldControlRef, controlRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getControlRefUuid() {
        return controlRefUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlRefUuid( String newControlRefUuid ) {
        String oldControlRefUuid = controlRefUuid;
        controlRefUuid = newControlRefUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_OUTPUT_REF__CONTROL_REF_UUID,
                    oldControlRefUuid, controlRefUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlRef getRefersToControlRef() {
        if( refersToControlRef != null && refersToControlRef.eIsProxy() ) {
            InternalEObject oldRefersToControlRef = ( InternalEObject ) refersToControlRef;
            refersToControlRef = ( ControlRef ) eResolveProxy( oldRefersToControlRef );
            if( refersToControlRef != oldRefersToControlRef ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF, oldRefersToControlRef,
                            refersToControlRef ) );
                }
            }
        }
        return refersToControlRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlRef basicGetRefersToControlRef() {
        return refersToControlRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToControlRef( ControlRef newRefersToControlRef, NotificationChain msgs ) {
        ControlRef oldRefersToControlRef = refersToControlRef;
        refersToControlRef = newRefersToControlRef;
        boolean oldRefersToControlRefESet = refersToControlRefESet;
        refersToControlRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF, oldRefersToControlRef, newRefersToControlRef,
                    !oldRefersToControlRefESet );
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
    public void setRefersToControlRef( ControlRef newRefersToControlRef ) {
        if( newRefersToControlRef != refersToControlRef ) {
            NotificationChain msgs = null;
            if( refersToControlRef != null ) {
                msgs = ( ( InternalEObject ) refersToControlRef ).eInverseRemove( this,
                        AsdPackage.CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF, ControlRef.class, msgs );
            }
            if( newRefersToControlRef != null ) {
                msgs = ( ( InternalEObject ) newRefersToControlRef ).eInverseAdd( this,
                        AsdPackage.CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF, ControlRef.class, msgs );
            }
            msgs = basicSetRefersToControlRef( newRefersToControlRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToControlRefESet = refersToControlRefESet;
            refersToControlRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF, newRefersToControlRef,
                        newRefersToControlRef, !oldRefersToControlRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToControlRef( NotificationChain msgs ) {
        ControlRef oldRefersToControlRef = refersToControlRef;
        refersToControlRef = null;
        boolean oldRefersToControlRefESet = refersToControlRefESet;
        refersToControlRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF, oldRefersToControlRef, null,
                    oldRefersToControlRefESet );
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
    public void unsetRefersToControlRef() {
        if( refersToControlRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToControlRef ).eInverseRemove( this,
                    AsdPackage.CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF, ControlRef.class, msgs );
            msgs = basicUnsetRefersToControlRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToControlRefESet = refersToControlRefESet;
            refersToControlRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF, null, null, oldRefersToControlRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToControlRef() {
        return refersToControlRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SignalRole getParentSignalRole() {
        if( eContainerFeatureID() != AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE ) {
            return null;
        }
        return ( SignalRole ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSignalRole( SignalRole newParentSignalRole, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSignalRole,
                AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSignalRole( SignalRole newParentSignalRole ) {
        if( newParentSignalRole != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE
                        && newParentSignalRole != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSignalRole ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSignalRole != null ) {
                msgs = ( ( InternalEObject ) newParentSignalRole ).eInverseAdd( this,
                        SclPackage.SIGNAL_ROLE__LNODE_OUTPUT_REF, SignalRole.class, msgs );
            }
            msgs = basicSetParentSignalRole( newParentSignalRole, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE,
                    newParentSignalRole, newParentSignalRole ) );
        }
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
        case AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF:
            if( refersToControlRef != null ) {
                msgs = ( ( InternalEObject ) refersToControlRef ).eInverseRemove( this,
                        AsdPackage.CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF, ControlRef.class, msgs );
            }
            return basicSetRefersToControlRef( ( ControlRef ) otherEnd, msgs );
        case AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSignalRole( ( SignalRole ) otherEnd, msgs );
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
        case AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF:
            return basicUnsetRefersToControlRef( msgs );
        case AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE:
            return basicSetParentSignalRole( null, msgs );
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
        case AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE:
            return eInternalContainer().eInverseRemove( this, SclPackage.SIGNAL_ROLE__LNODE_OUTPUT_REF,
                    SignalRole.class, msgs );
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
        case AsdPackage.LNODE_OUTPUT_REF__CONTROL_REF:
            return getControlRef();
        case AsdPackage.LNODE_OUTPUT_REF__CONTROL_REF_UUID:
            return getControlRefUuid();
        case AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF:
            if( resolve ) {
                return getRefersToControlRef();
            }
            return basicGetRefersToControlRef();
        case AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE:
            return getParentSignalRole();
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
        case AsdPackage.LNODE_OUTPUT_REF__CONTROL_REF:
            setControlRef( ( String ) newValue );
            return;
        case AsdPackage.LNODE_OUTPUT_REF__CONTROL_REF_UUID:
            setControlRefUuid( ( String ) newValue );
            return;
        case AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF:
            setRefersToControlRef( ( ControlRef ) newValue );
            return;
        case AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE:
            setParentSignalRole( ( SignalRole ) newValue );
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
        case AsdPackage.LNODE_OUTPUT_REF__CONTROL_REF:
            setControlRef( CONTROL_REF_EDEFAULT );
            return;
        case AsdPackage.LNODE_OUTPUT_REF__CONTROL_REF_UUID:
            setControlRefUuid( CONTROL_REF_UUID_EDEFAULT );
            return;
        case AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF:
            unsetRefersToControlRef();
            return;
        case AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE:
            setParentSignalRole( ( SignalRole ) null );
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
        case AsdPackage.LNODE_OUTPUT_REF__CONTROL_REF:
            return CONTROL_REF_EDEFAULT == null ? controlRef != null : !CONTROL_REF_EDEFAULT.equals( controlRef );
        case AsdPackage.LNODE_OUTPUT_REF__CONTROL_REF_UUID:
            return CONTROL_REF_UUID_EDEFAULT == null ? controlRefUuid != null
                    : !CONTROL_REF_UUID_EDEFAULT.equals( controlRefUuid );
        case AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF:
            return isSetRefersToControlRef();
        case AsdPackage.LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE:
            return getParentSignalRole() != null;
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
        result.append( " (controlRef: " );
        result.append( controlRef );
        result.append( ", controlRefUuid: " );
        result.append( controlRefUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "LNodeOutputRefImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from LNodeOutputRef: ";
        doBuildExplicitLinkWithControlRef( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithControlRef( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for ControlRef) ";

        Function function = getParentSignalRole().getParentFunctionRef().getRefersToFunction();

        if( getControlRefUuid() != null && !getControlRefUuid().isEmpty() ) {
            List< ControlRef > refersToControlRef = new ArrayList<>();

            TreeIterator< EObject > it = function.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( o instanceof ControlRef && getControlRefUuid().equals( ( ( ControlRef ) o ).getUuid() ) ) {
                    refersToControlRef.add( ( ControlRef ) o );
                }
            }

            if( refersToControlRef.size() == 1 ) {
                setRefersToControlRef( refersToControlRef.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "LNodeOutputRef refers to ControlRef( id = ", getControlRefUuid(), " ) on line ",
                        getRefersToControlRef().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( refersToControlRef.size() == 0 ) ? "cannot find" : "found several" ),
                //         " ControlRef( uuid = ", getControlRefUuid(), " ) in Function( name = ", function.getName(), " )" );
            }

        }
        else if( getControlRef() != null && !getControlRef().isEmpty() ) {
            String[] controlRefPath = getControlRef().split( "\\.", 2 );

            if( controlRefPath.length < 2 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, "inexpected controlRef format: ", getControlRef() );
                return;
            }

            String[] lnodePath = controlRefPath[0].split( "/" );

            Pair< LNode, Integer > lnode = AsdUtilities.getLNode( function, lnodePath );
            if( lnode.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( lnode.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "LNode( name = ", lnodePath[lnodePath.length - 1], " )" );
                return;
            }
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found LNode( name = ", lnodePath[lnodePath.length - 1], " ) on line ",
                    lnode.getLeft().getLineNumber() );

            List< ControlRef > res = lnode.getLeft().getPrivate()
                    .stream()
                    .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                    .map( Private::getAsdObjects )
                    .flatMap( Collection::stream )
                    .filter( o -> o instanceof LNodeOutputs )
                    .map( i -> ( ( LNodeOutputs ) i ).getControlRef() )
                    .flatMap( Collection::stream )
                    .filter( c -> controlRefPath[1]
                            .equals( AsdUtilities.getControlRefName( c, controlRefPath[1].contains( "(" ) ) ) )
                    .toList();

            if( res.size() != 1 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " ControlRef( name = ", controlRefPath[1], " )" );
                return;
            }

            setRefersToControlRef( res.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "LNodeOutputRef refers to ControlRef( id = ", controlRefPath[1], " )", " on line ",
                    getRefersToControlRef().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because controlRef and controlRefUuid are missing" );
        }

    }

} //LNodeOutputRefImpl
