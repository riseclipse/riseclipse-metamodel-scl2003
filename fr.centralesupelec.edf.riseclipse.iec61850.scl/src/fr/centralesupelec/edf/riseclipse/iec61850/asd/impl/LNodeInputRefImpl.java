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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LNode Input Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeInputRefImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeInputRefImpl#getSourceRefUuid <em>Source Ref Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeInputRefImpl#getRefersToSourceRef <em>Refers To Source Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeInputRefImpl#getParentSignalRole <em>Parent Signal Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNodeInputRefImpl extends FunctionalVariantRefContainerImpl implements LNodeInputRef {
    /**
     * The default value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRef()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRef()
     * @generated
     * @ordered
     */
    protected String sourceRef = SOURCE_REF_EDEFAULT;

    /**
     * The default value of the '{@link #getSourceRefUuid() <em>Source Ref Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRefUuid()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_REF_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceRefUuid() <em>Source Ref Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceRefUuid()
     * @generated
     * @ordered
     */
    protected String sourceRefUuid = SOURCE_REF_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToSourceRef() <em>Refers To Source Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToSourceRef()
     * @generated
     * @ordered
     */
    protected SourceRef refersToSourceRef;

    /**
     * This is true if the Refers To Source Ref reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToSourceRefESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNodeInputRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getLNodeInputRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSourceRef() {
        return sourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSourceRef( String newSourceRef ) {
        String oldSourceRef = sourceRef;
        sourceRef = newSourceRef;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_INPUT_REF__SOURCE_REF,
                    oldSourceRef, sourceRef ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSourceRefUuid() {
        return sourceRefUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSourceRefUuid( String newSourceRefUuid ) {
        String oldSourceRefUuid = sourceRefUuid;
        sourceRefUuid = newSourceRefUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_INPUT_REF__SOURCE_REF_UUID,
                    oldSourceRefUuid, sourceRefUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SourceRef getRefersToSourceRef() {
        if( refersToSourceRef != null && refersToSourceRef.eIsProxy() ) {
            InternalEObject oldRefersToSourceRef = ( InternalEObject ) refersToSourceRef;
            refersToSourceRef = ( SourceRef ) eResolveProxy( oldRefersToSourceRef );
            if( refersToSourceRef != oldRefersToSourceRef ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF, oldRefersToSourceRef,
                            refersToSourceRef ) );
                }
            }
        }
        return refersToSourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceRef basicGetRefersToSourceRef() {
        return refersToSourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToSourceRef( SourceRef newRefersToSourceRef, NotificationChain msgs ) {
        SourceRef oldRefersToSourceRef = refersToSourceRef;
        refersToSourceRef = newRefersToSourceRef;
        boolean oldRefersToSourceRefESet = refersToSourceRefESet;
        refersToSourceRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF, oldRefersToSourceRef, newRefersToSourceRef,
                    !oldRefersToSourceRefESet );
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
    public void setRefersToSourceRef( SourceRef newRefersToSourceRef ) {
        if( newRefersToSourceRef != refersToSourceRef ) {
            NotificationChain msgs = null;
            if( refersToSourceRef != null ) {
                msgs = ( ( InternalEObject ) refersToSourceRef ).eInverseRemove( this,
                        AsdPackage.SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF, SourceRef.class, msgs );
            }
            if( newRefersToSourceRef != null ) {
                msgs = ( ( InternalEObject ) newRefersToSourceRef ).eInverseAdd( this,
                        AsdPackage.SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF, SourceRef.class, msgs );
            }
            msgs = basicSetRefersToSourceRef( newRefersToSourceRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSourceRefESet = refersToSourceRefESet;
            refersToSourceRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF, newRefersToSourceRef, newRefersToSourceRef,
                        !oldRefersToSourceRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToSourceRef( NotificationChain msgs ) {
        SourceRef oldRefersToSourceRef = refersToSourceRef;
        refersToSourceRef = null;
        boolean oldRefersToSourceRefESet = refersToSourceRefESet;
        refersToSourceRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF, oldRefersToSourceRef, null,
                    oldRefersToSourceRefESet );
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
    public void unsetRefersToSourceRef() {
        if( refersToSourceRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToSourceRef ).eInverseRemove( this,
                    AsdPackage.SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF, SourceRef.class, msgs );
            msgs = basicUnsetRefersToSourceRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSourceRefESet = refersToSourceRefESet;
            refersToSourceRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF, null, null, oldRefersToSourceRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToSourceRef() {
        return refersToSourceRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SignalRole getParentSignalRole() {
        if( eContainerFeatureID() != AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE ) {
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
                AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE
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
                        SclPackage.SIGNAL_ROLE__LNODE_INPUT_REF, SignalRole.class, msgs );
            }
            msgs = basicSetParentSignalRole( newParentSignalRole, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE,
                    newParentSignalRole, newParentSignalRole ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF:
            if( refersToSourceRef != null ) {
                msgs = ( ( InternalEObject ) refersToSourceRef ).eInverseRemove( this,
                        AsdPackage.SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF, SourceRef.class, msgs );
            }
            return basicSetRefersToSourceRef( ( SourceRef ) otherEnd, msgs );
        case AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE:
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
        case AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF:
            return basicUnsetRefersToSourceRef( msgs );
        case AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE:
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
        case AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE:
            return eInternalContainer().eInverseRemove( this, SclPackage.SIGNAL_ROLE__LNODE_INPUT_REF, SignalRole.class,
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
        case AsdPackage.LNODE_INPUT_REF__SOURCE_REF:
            return getSourceRef();
        case AsdPackage.LNODE_INPUT_REF__SOURCE_REF_UUID:
            return getSourceRefUuid();
        case AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF:
            if( resolve ) {
                return getRefersToSourceRef();
            }
            return basicGetRefersToSourceRef();
        case AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE:
            return getParentSignalRole();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case AsdPackage.LNODE_INPUT_REF__SOURCE_REF:
            setSourceRef( ( String ) newValue );
            return;
        case AsdPackage.LNODE_INPUT_REF__SOURCE_REF_UUID:
            setSourceRefUuid( ( String ) newValue );
            return;
        case AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF:
            setRefersToSourceRef( ( SourceRef ) newValue );
            return;
        case AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE:
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
        case AsdPackage.LNODE_INPUT_REF__SOURCE_REF:
            setSourceRef( SOURCE_REF_EDEFAULT );
            return;
        case AsdPackage.LNODE_INPUT_REF__SOURCE_REF_UUID:
            setSourceRefUuid( SOURCE_REF_UUID_EDEFAULT );
            return;
        case AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF:
            unsetRefersToSourceRef();
            return;
        case AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE:
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
        case AsdPackage.LNODE_INPUT_REF__SOURCE_REF:
            return SOURCE_REF_EDEFAULT == null ? sourceRef != null : !SOURCE_REF_EDEFAULT.equals( sourceRef );
        case AsdPackage.LNODE_INPUT_REF__SOURCE_REF_UUID:
            return SOURCE_REF_UUID_EDEFAULT == null ? sourceRefUuid != null
                    : !SOURCE_REF_UUID_EDEFAULT.equals( sourceRefUuid );
        case AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF:
            return isSetRefersToSourceRef();
        case AsdPackage.LNODE_INPUT_REF__PARENT_SIGNAL_ROLE:
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
        result.append( " (sourceRef: " );
        result.append( sourceRef );
        result.append( ", sourceRefUuid: " );
        result.append( sourceRefUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "LNodeInputRefImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from LNodeInputRef: ";
        doBuildExplicitLinkWithSourceRef( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithSourceRef( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for SourceRef) ";

        Function function = getParentSignalRole().getParentFunctionRef().getRefersToFunction();

        if( getSourceRefUuid() != null && !getSourceRefUuid().isEmpty() ) {
            List< SourceRef > refersToSourceRef = new ArrayList<>();

            TreeIterator< EObject > it = function.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( o instanceof SourceRef && getSourceRefUuid().equals( ( ( SourceRef ) o ).getUuid() ) ) {
                    refersToSourceRef.add( ( SourceRef ) o );
                }
            }

            if( refersToSourceRef.size() == 1 ) {
                setRefersToSourceRef( refersToSourceRef.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "LNodeInputRef refers to SourceRef( id = ", getSourceRefUuid(), " ) on line ",
                        getRefersToSourceRef().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( refersToSourceRef.size() == 0 ) ? "cannot find" : "found several" ),
                //         " SourceRef( uuid = ", getSourceRefUuid(), " ) in Function( name = ", function.getName(), " )" );
            }

        }
        else if( getSourceRef() != null && !getSourceRef().isEmpty() ) {
            String[] sourceRefPath = getSourceRef().split( "\\.", 2 );

            if( sourceRefPath.length < 2 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, "inexpected sourceRef format: ", getSourceRef() );
                return;
            }

            String[] lnodePath = sourceRefPath[0].split( "/" );

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

            List< SourceRef > res = lnode.getLeft().getPrivate()
                    .stream()
                    .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                    .map( Private::getAsdObjects )
                    .flatMap( Collection::stream )
                    .filter( o -> o instanceof LNodeInputs )
                    .map( i -> ( ( LNodeInputs ) i ).getSourceRef() )
                    .flatMap( Collection::stream )
                    .filter( s -> sourceRefPath[1]
                            .equals( AsdUtilities.getSourceRefName( s, sourceRefPath[1].contains( "(" ) ) ) )
                    .toList();

            if( res.size() != 1 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " SourceRef( name = ", sourceRefPath[1], " )" );
                return;
            }

            setRefersToSourceRef( res.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "LNodeInputRef refers to SourceRef( id = ", sourceRefPath[1], " )", " on line ",
                    getRefersToSourceRef().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because sourceRef and sourceRefUuid are missing" );
        }

    }

} //LNodeInputRefImpl
