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
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SignalRole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LNode Data Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeDataRefImpl#getDaName <em>Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeDataRefImpl#getData <em>Data</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeDataRefImpl#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeDataRefImpl#getLnodeUuid <em>Lnode Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeDataRefImpl#getRefersToLNode <em>Refers To LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeDataRefImpl#getParentSignalRole <em>Parent Signal Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNodeDataRefImpl extends FunctionalVariantRefContainerImpl implements LNodeDataRef {
    /**
     * The default value of the '{@link #getDaName() <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaName()
     * @generated
     * @ordered
     */
    protected static final String DA_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDaName() <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDaName()
     * @generated
     * @ordered
     */
    protected String daName = DA_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected static final String DATA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getData()
     * @generated
     * @ordered
     */
    protected String data = DATA_EDEFAULT;

    /**
     * The default value of the '{@link #getDoName() <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoName()
     * @generated
     * @ordered
     */
    protected static final String DO_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDoName() <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDoName()
     * @generated
     * @ordered
     */
    protected String doName = DO_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getLnodeUuid() <em>Lnode Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnodeUuid()
     * @generated
     * @ordered
     */
    protected static final String LNODE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLnodeUuid() <em>Lnode Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnodeUuid()
     * @generated
     * @ordered
     */
    protected String lnodeUuid = LNODE_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToLNode() <em>Refers To LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToLNode()
     * @generated
     * @ordered
     */
    protected LNode refersToLNode;

    /**
     * This is true if the Refers To LNode reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToLNodeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNodeDataRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getLNodeDataRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDaName() {
        return daName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDaName( String newDaName ) {
        String oldDaName = daName;
        daName = newDaName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_DATA_REF__DA_NAME, oldDaName,
                    daName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getData() {
        return data;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setData( String newData ) {
        String oldData = data;
        data = newData;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_DATA_REF__DATA, oldData, data ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDoName() {
        return doName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDoName( String newDoName ) {
        String oldDoName = doName;
        doName = newDoName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_DATA_REF__DO_NAME, oldDoName,
                    doName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLnodeUuid() {
        return lnodeUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLnodeUuid( String newLnodeUuid ) {
        String oldLnodeUuid = lnodeUuid;
        lnodeUuid = newLnodeUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_DATA_REF__LNODE_UUID, oldLnodeUuid,
                    lnodeUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNode getRefersToLNode() {
        if( refersToLNode != null && refersToLNode.eIsProxy() ) {
            InternalEObject oldRefersToLNode = ( InternalEObject ) refersToLNode;
            refersToLNode = ( LNode ) eResolveProxy( oldRefersToLNode );
            if( refersToLNode != oldRefersToLNode ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.LNODE_DATA_REF__REFERS_TO_LNODE, oldRefersToLNode, refersToLNode ) );
                }
            }
        }
        return refersToLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LNode basicGetRefersToLNode() {
        return refersToLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToLNode( LNode newRefersToLNode, NotificationChain msgs ) {
        LNode oldRefersToLNode = refersToLNode;
        refersToLNode = newRefersToLNode;
        boolean oldRefersToLNodeESet = refersToLNodeESet;
        refersToLNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.LNODE_DATA_REF__REFERS_TO_LNODE, oldRefersToLNode, newRefersToLNode,
                    !oldRefersToLNodeESet );
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
    public void setRefersToLNode( LNode newRefersToLNode ) {
        if( newRefersToLNode != refersToLNode ) {
            NotificationChain msgs = null;
            if( refersToLNode != null ) {
                msgs = ( ( InternalEObject ) refersToLNode ).eInverseRemove( this,
                        SclPackage.LNODE__REFERRED_BY_LNODE_DATA_REF, LNode.class, msgs );
            }
            if( newRefersToLNode != null ) {
                msgs = ( ( InternalEObject ) newRefersToLNode ).eInverseAdd( this,
                        SclPackage.LNODE__REFERRED_BY_LNODE_DATA_REF, LNode.class, msgs );
            }
            msgs = basicSetRefersToLNode( newRefersToLNode, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToLNodeESet = refersToLNodeESet;
            refersToLNodeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_DATA_REF__REFERS_TO_LNODE,
                        newRefersToLNode, newRefersToLNode, !oldRefersToLNodeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToLNode( NotificationChain msgs ) {
        LNode oldRefersToLNode = refersToLNode;
        refersToLNode = null;
        boolean oldRefersToLNodeESet = refersToLNodeESet;
        refersToLNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.LNODE_DATA_REF__REFERS_TO_LNODE, oldRefersToLNode, null, oldRefersToLNodeESet );
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
    public void unsetRefersToLNode() {
        if( refersToLNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToLNode ).eInverseRemove( this,
                    SclPackage.LNODE__REFERRED_BY_LNODE_DATA_REF, LNode.class, msgs );
            msgs = basicUnsetRefersToLNode( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToLNodeESet = refersToLNodeESet;
            refersToLNodeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.LNODE_DATA_REF__REFERS_TO_LNODE,
                        null, null, oldRefersToLNodeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToLNode() {
        return refersToLNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SignalRole getParentSignalRole() {
        if( eContainerFeatureID() != AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE ) {
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
                AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE
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
                        SclPackage.SIGNAL_ROLE__LNODE_DATA_REF, SignalRole.class, msgs );
            }
            msgs = basicSetParentSignalRole( newParentSignalRole, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE,
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
        case AsdPackage.LNODE_DATA_REF__REFERS_TO_LNODE:
            if( refersToLNode != null ) {
                msgs = ( ( InternalEObject ) refersToLNode ).eInverseRemove( this,
                        SclPackage.LNODE__REFERRED_BY_LNODE_DATA_REF, LNode.class, msgs );
            }
            return basicSetRefersToLNode( ( LNode ) otherEnd, msgs );
        case AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE:
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
        case AsdPackage.LNODE_DATA_REF__REFERS_TO_LNODE:
            return basicUnsetRefersToLNode( msgs );
        case AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE:
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
        case AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE:
            return eInternalContainer().eInverseRemove( this, SclPackage.SIGNAL_ROLE__LNODE_DATA_REF, SignalRole.class,
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
        case AsdPackage.LNODE_DATA_REF__DA_NAME:
            return getDaName();
        case AsdPackage.LNODE_DATA_REF__DATA:
            return getData();
        case AsdPackage.LNODE_DATA_REF__DO_NAME:
            return getDoName();
        case AsdPackage.LNODE_DATA_REF__LNODE_UUID:
            return getLnodeUuid();
        case AsdPackage.LNODE_DATA_REF__REFERS_TO_LNODE:
            if( resolve ) {
                return getRefersToLNode();
            }
            return basicGetRefersToLNode();
        case AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE:
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
        case AsdPackage.LNODE_DATA_REF__DA_NAME:
            setDaName( ( String ) newValue );
            return;
        case AsdPackage.LNODE_DATA_REF__DATA:
            setData( ( String ) newValue );
            return;
        case AsdPackage.LNODE_DATA_REF__DO_NAME:
            setDoName( ( String ) newValue );
            return;
        case AsdPackage.LNODE_DATA_REF__LNODE_UUID:
            setLnodeUuid( ( String ) newValue );
            return;
        case AsdPackage.LNODE_DATA_REF__REFERS_TO_LNODE:
            setRefersToLNode( ( LNode ) newValue );
            return;
        case AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE:
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
        case AsdPackage.LNODE_DATA_REF__DA_NAME:
            setDaName( DA_NAME_EDEFAULT );
            return;
        case AsdPackage.LNODE_DATA_REF__DATA:
            setData( DATA_EDEFAULT );
            return;
        case AsdPackage.LNODE_DATA_REF__DO_NAME:
            setDoName( DO_NAME_EDEFAULT );
            return;
        case AsdPackage.LNODE_DATA_REF__LNODE_UUID:
            setLnodeUuid( LNODE_UUID_EDEFAULT );
            return;
        case AsdPackage.LNODE_DATA_REF__REFERS_TO_LNODE:
            unsetRefersToLNode();
            return;
        case AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE:
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
        case AsdPackage.LNODE_DATA_REF__DA_NAME:
            return DA_NAME_EDEFAULT == null ? daName != null : !DA_NAME_EDEFAULT.equals( daName );
        case AsdPackage.LNODE_DATA_REF__DATA:
            return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals( data );
        case AsdPackage.LNODE_DATA_REF__DO_NAME:
            return DO_NAME_EDEFAULT == null ? doName != null : !DO_NAME_EDEFAULT.equals( doName );
        case AsdPackage.LNODE_DATA_REF__LNODE_UUID:
            return LNODE_UUID_EDEFAULT == null ? lnodeUuid != null : !LNODE_UUID_EDEFAULT.equals( lnodeUuid );
        case AsdPackage.LNODE_DATA_REF__REFERS_TO_LNODE:
            return isSetRefersToLNode();
        case AsdPackage.LNODE_DATA_REF__PARENT_SIGNAL_ROLE:
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
        result.append( " (daName: " );
        result.append( daName );
        result.append( ", data: " );
        result.append( data );
        result.append( ", doName: " );
        result.append( doName );
        result.append( ", lnodeUuid: " );
        result.append( lnodeUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "LNodeDataRefImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from LNodeDataRef: ";
        doBuildExplicitLinkWithLNode( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithLNode( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for LNode) ";

        if( !getParentSignalRole().getParentFunctionRef().isExplicitLinksBuilt() ) {
            getParentSignalRole().getParentFunctionRef().buildExplicitLinks( console, false );
        }

        if( !getParentSignalRole().getParentFunctionRef().isSetRefersToFunction()
                || getParentSignalRole().getParentFunctionRef().getRefersToFunction() == null ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, "cannot resolve Function referred by parent FunctionRef" );
            return;
        }

        Function function = getParentSignalRole().getParentFunctionRef().getRefersToFunction();

        if( getLnodeUuid() != null && !getLnodeUuid().isEmpty() ) {
            List< Function > parent = new ArrayList<>();
            parent.add( function );

            Pair< LNode, Integer > res = AsdUtilities.findByUuid( parent, getLnodeUuid(), LNode.class );

            if( res.getLeft() != null ) {
                setRefersToLNode( res.getLeft() );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "LNodeDataRef refers to LNode( uuid = ", getLnodeUuid(), " ) on line ",
                        getRefersToLNode().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.getRight() == 0 ) ? "cannot find" : "found several" ),
                //         " LNode( uuid = ", getLNodeUuid(), " ) in Function( name = ", function.getName(), " )" );
            }

        }
        else if( getData() != null && !getData().isEmpty() ) {
            String[] dataPath = getData().split( "\\.", 2 );

            if( dataPath.length < 2 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, "inexpected data format: ", getData() );
                return;
            }

            String[] lnodePath = dataPath[0].split( "/" );

            Pair< LNode, Integer > lnode = AsdUtilities.getLNode( function, lnodePath );
            if( lnode.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( lnode.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "LNode( name = ", lnodePath[lnodePath.length - 1], " )" );
                return;
            }

            setRefersToLNode( lnode.getLeft() );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "LNodeDataRef refers to LNode( name = ", lnodePath[lnodePath.length - 1], " )", " on line ",
                    getRefersToLNode().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because data and lnodeUuid are missing" );
        }

    }

} //LNodeDataRefImpl
