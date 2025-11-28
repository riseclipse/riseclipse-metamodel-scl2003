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
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic Var Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogicVarRefImpl#getDaName <em>Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogicVarRefImpl#getDataName <em>Data Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogicVarRefImpl#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogicVarRefImpl#getLnodeUuid <em>Lnode Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogicVarRefImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogicVarRefImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogicVarRefImpl#getRefersToLNode <em>Refers To LNode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicVarRefImpl extends BaseExtensionElementWithDescImpl implements LogicVarRef {
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
     * The default value of the '{@link #getDataName() <em>Data Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataName()
     * @generated
     * @ordered
     */
    protected static final String DATA_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataName() <em>Data Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataName()
     * @generated
     * @ordered
     */
    protected String dataName = DATA_NAME_EDEFAULT;

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
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVarName()
     * @generated
     * @ordered
     */
    protected static final String VAR_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVarName()
     * @generated
     * @ordered
     */
    protected String varName = VAR_NAME_EDEFAULT;

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
    protected LogicVarRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getLogicVarRef();
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOGIC_VAR_REF__DA_NAME, oldDaName,
                    daName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDataName() {
        return dataName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataName( String newDataName ) {
        String oldDataName = dataName;
        dataName = newDataName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOGIC_VAR_REF__DATA_NAME, oldDataName,
                    dataName ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOGIC_VAR_REF__DO_NAME, oldDoName,
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOGIC_VAR_REF__LNODE_UUID, oldLnodeUuid,
                    lnodeUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( String newValue ) {
        String oldValue = value;
        value = newValue;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOGIC_VAR_REF__VALUE, oldValue,
                    value ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVarName() {
        return varName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVarName( String newVarName ) {
        String oldVarName = varName;
        varName = newVarName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOGIC_VAR_REF__VAR_NAME, oldVarName,
                    varName ) );
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
                            AsdPackage.LOGIC_VAR_REF__REFERS_TO_LNODE, oldRefersToLNode, refersToLNode ) );
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
                    AsdPackage.LOGIC_VAR_REF__REFERS_TO_LNODE, oldRefersToLNode, newRefersToLNode,
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
                        SclPackage.LNODE__REFERRED_BY_LOGIC_VAR_REF, LNode.class, msgs );
            }
            if( newRefersToLNode != null ) {
                msgs = ( ( InternalEObject ) newRefersToLNode ).eInverseAdd( this,
                        SclPackage.LNODE__REFERRED_BY_LOGIC_VAR_REF, LNode.class, msgs );
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
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.LOGIC_VAR_REF__REFERS_TO_LNODE,
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
                    AsdPackage.LOGIC_VAR_REF__REFERS_TO_LNODE, oldRefersToLNode, null, oldRefersToLNodeESet );
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
                    SclPackage.LNODE__REFERRED_BY_LOGIC_VAR_REF, LNode.class, msgs );
            msgs = basicUnsetRefersToLNode( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToLNodeESet = refersToLNodeESet;
            refersToLNodeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.LOGIC_VAR_REF__REFERS_TO_LNODE,
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.LOGIC_VAR_REF__REFERS_TO_LNODE:
            if( refersToLNode != null ) {
                msgs = ( ( InternalEObject ) refersToLNode ).eInverseRemove( this,
                        SclPackage.LNODE__REFERRED_BY_LOGIC_VAR_REF, LNode.class, msgs );
            }
            return basicSetRefersToLNode( ( LNode ) otherEnd, msgs );
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
        case AsdPackage.LOGIC_VAR_REF__REFERS_TO_LNODE:
            return basicUnsetRefersToLNode( msgs );
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
        case AsdPackage.LOGIC_VAR_REF__DA_NAME:
            return getDaName();
        case AsdPackage.LOGIC_VAR_REF__DATA_NAME:
            return getDataName();
        case AsdPackage.LOGIC_VAR_REF__DO_NAME:
            return getDoName();
        case AsdPackage.LOGIC_VAR_REF__LNODE_UUID:
            return getLnodeUuid();
        case AsdPackage.LOGIC_VAR_REF__VALUE:
            return getValue();
        case AsdPackage.LOGIC_VAR_REF__VAR_NAME:
            return getVarName();
        case AsdPackage.LOGIC_VAR_REF__REFERS_TO_LNODE:
            if( resolve ) {
                return getRefersToLNode();
            }
            return basicGetRefersToLNode();
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
        case AsdPackage.LOGIC_VAR_REF__DA_NAME:
            setDaName( ( String ) newValue );
            return;
        case AsdPackage.LOGIC_VAR_REF__DATA_NAME:
            setDataName( ( String ) newValue );
            return;
        case AsdPackage.LOGIC_VAR_REF__DO_NAME:
            setDoName( ( String ) newValue );
            return;
        case AsdPackage.LOGIC_VAR_REF__LNODE_UUID:
            setLnodeUuid( ( String ) newValue );
            return;
        case AsdPackage.LOGIC_VAR_REF__VALUE:
            setValue( ( String ) newValue );
            return;
        case AsdPackage.LOGIC_VAR_REF__VAR_NAME:
            setVarName( ( String ) newValue );
            return;
        case AsdPackage.LOGIC_VAR_REF__REFERS_TO_LNODE:
            setRefersToLNode( ( LNode ) newValue );
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
        case AsdPackage.LOGIC_VAR_REF__DA_NAME:
            setDaName( DA_NAME_EDEFAULT );
            return;
        case AsdPackage.LOGIC_VAR_REF__DATA_NAME:
            setDataName( DATA_NAME_EDEFAULT );
            return;
        case AsdPackage.LOGIC_VAR_REF__DO_NAME:
            setDoName( DO_NAME_EDEFAULT );
            return;
        case AsdPackage.LOGIC_VAR_REF__LNODE_UUID:
            setLnodeUuid( LNODE_UUID_EDEFAULT );
            return;
        case AsdPackage.LOGIC_VAR_REF__VALUE:
            setValue( VALUE_EDEFAULT );
            return;
        case AsdPackage.LOGIC_VAR_REF__VAR_NAME:
            setVarName( VAR_NAME_EDEFAULT );
            return;
        case AsdPackage.LOGIC_VAR_REF__REFERS_TO_LNODE:
            unsetRefersToLNode();
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
        case AsdPackage.LOGIC_VAR_REF__DA_NAME:
            return DA_NAME_EDEFAULT == null ? daName != null : !DA_NAME_EDEFAULT.equals( daName );
        case AsdPackage.LOGIC_VAR_REF__DATA_NAME:
            return DATA_NAME_EDEFAULT == null ? dataName != null : !DATA_NAME_EDEFAULT.equals( dataName );
        case AsdPackage.LOGIC_VAR_REF__DO_NAME:
            return DO_NAME_EDEFAULT == null ? doName != null : !DO_NAME_EDEFAULT.equals( doName );
        case AsdPackage.LOGIC_VAR_REF__LNODE_UUID:
            return LNODE_UUID_EDEFAULT == null ? lnodeUuid != null : !LNODE_UUID_EDEFAULT.equals( lnodeUuid );
        case AsdPackage.LOGIC_VAR_REF__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals( value );
        case AsdPackage.LOGIC_VAR_REF__VAR_NAME:
            return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals( varName );
        case AsdPackage.LOGIC_VAR_REF__REFERS_TO_LNODE:
            return isSetRefersToLNode();
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
        result.append( ", dataName: " );
        result.append( dataName );
        result.append( ", doName: " );
        result.append( doName );
        result.append( ", lnodeUuid: " );
        result.append( lnodeUuid );
        result.append( ", value: " );
        result.append( value );
        result.append( ", varName: " );
        result.append( varName );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "LogicVarRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from LogicVarRef: ";
        doBuildExplicitLinkWithLNode( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithLNode( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for LNode) ";

        if( !( eContainer() instanceof BehaviorDescription ) ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, "inexpected LogicVarRef location" );
            return;
        }

        BaseElement parent = ( ( BehaviorDescription ) eContainer() ).getParentPrivate().getParentBaseElement();

        if( getLnodeUuid() != null && !getLnodeUuid().isEmpty() ) {
            List< BaseElement > content = new ArrayList<>();
            content.add( parent );

            Pair< LNode, Integer > res = AsdUtilities.findByUuid( content, getLnodeUuid(), LNode.class );

            if( res.getLeft() != null ) {
                setRefersToLNode( res.getLeft() );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "LogicVarRef refers to LNode( uuid = ", getLnodeUuid(), " ) on line ",
                        getRefersToLNode().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.getRight() == 0 ) ? "cannot find" : "found several" ),
                //         " LNode( uuid = ", getLnodeUuid(), " )" );
            }

        }
        else if( getDataName() != null && !getDataName().isEmpty() ) {
            String[] path = getDataName().split( "\\.", 2 );

            if( path.length < 2 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, "inexpected dataName format: ", getDataName() );
                return;
            }

            String[] lnodePath = path[0].split( "/" );

            Pair< LNode, Integer > lnode = AsdUtilities.getLNode( parent, lnodePath );
            if( lnode.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( lnode.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "LNode( name = ", lnodePath[lnodePath.length - 1], " )" );
                return;
            }

            setRefersToLNode( lnode.getLeft() );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "LogicVarRef refers to LNode( name = ", lnodePath[lnodePath.length - 1], " )", " on line ",
                    getRefersToLNode().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because dataName and lnodeUuid are missing" );
        }

    }

} //LogicVarRefImpl
