/*
*************************************************************************
**  Copyright (c) 2016-2022 CentraleSupélec & EDF.
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

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LNode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getLnType <em>Ln Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getParentLNodeContainer <em>Parent LNode Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl#getRefersToLNodeType <em>Refers To LNode Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNodeImpl extends UnNamingImpl implements LNode {
    /**
     * The default value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIedName()
     * @generated
     * @ordered
     */
    protected static final String IED_NAME_EDEFAULT = "None";

    /**
     * The cached value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIedName()
     * @generated
     * @ordered
     */
    protected String iedName = IED_NAME_EDEFAULT;

    /**
     * This is true if the Ied Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iedNameESet;

    /**
     * The default value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdInst()
     * @generated
     * @ordered
     */
    protected static final String LD_INST_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdInst()
     * @generated
     * @ordered
     */
    protected String ldInst = LD_INST_EDEFAULT;

    /**
     * This is true if the Ld Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ldInstESet;

    /**
     * The default value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnClass()
     * @generated
     * @ordered
     */
    protected static final String LN_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnClass()
     * @generated
     * @ordered
     */
    protected String lnClass = LN_CLASS_EDEFAULT;

    /**
     * This is true if the Ln Class attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnClassESet;

    /**
     * The default value of the '{@link #getLnInst() <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnInst()
     * @generated
     * @ordered
     */
    protected static final String LN_INST_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getLnInst() <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnInst()
     * @generated
     * @ordered
     */
    protected String lnInst = LN_INST_EDEFAULT;

    /**
     * This is true if the Ln Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnInstESet;

    /**
     * The default value of the '{@link #getLnType() <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnType()
     * @generated
     * @ordered
     */
    protected static final String LN_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLnType() <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnType()
     * @generated
     * @ordered
     */
    protected String lnType = LN_TYPE_EDEFAULT;

    /**
     * This is true if the Ln Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnTypeESet;

    /**
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected String prefix = PREFIX_EDEFAULT;

    /**
     * This is true if the Prefix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean prefixESet;

    /**
     * The cached value of the '{@link #getRefersToAnyLN() <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAnyLN()
     * @generated
     * @ordered
     */
    protected AnyLN refersToAnyLN;

    /**
     * This is true if the Refers To Any LN reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAnyLNESet;

    /**
     * The cached value of the '{@link #getRefersToLNodeType() <em>Refers To LNode Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToLNodeType()
     * @generated
     * @ordered
     */
    protected LNodeType refersToLNodeType;

    /**
     * This is true if the Refers To LNode Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToLNodeTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIedName() {
        return iedName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIedName( String newIedName ) {
        String oldIedName = iedName;
        iedName = newIedName;
        boolean oldIedNameESet = iedNameESet;
        iedNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LNODE__IED_NAME, oldIedName, iedName,
                    !oldIedNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIedName() {
        String oldIedName = iedName;
        boolean oldIedNameESet = iedNameESet;
        iedName = IED_NAME_EDEFAULT;
        iedNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LNODE__IED_NAME, oldIedName,
                    IED_NAME_EDEFAULT, oldIedNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIedName() {
        return iedNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLdInst() {
        return ldInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLdInst( String newLdInst ) {
        String oldLdInst = ldInst;
        ldInst = newLdInst;
        boolean oldLdInstESet = ldInstESet;
        ldInstESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LNODE__LD_INST, oldLdInst, ldInst,
                    !oldLdInstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLdInst() {
        String oldLdInst = ldInst;
        boolean oldLdInstESet = ldInstESet;
        ldInst = LD_INST_EDEFAULT;
        ldInstESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LNODE__LD_INST, oldLdInst,
                    LD_INST_EDEFAULT, oldLdInstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLdInst() {
        return ldInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLnClass() {
        return lnClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLnClass( String newLnClass ) {
        String oldLnClass = lnClass;
        lnClass = newLnClass;
        boolean oldLnClassESet = lnClassESet;
        lnClassESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LNODE__LN_CLASS, oldLnClass, lnClass,
                    !oldLnClassESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLnClass() {
        String oldLnClass = lnClass;
        boolean oldLnClassESet = lnClassESet;
        lnClass = LN_CLASS_EDEFAULT;
        lnClassESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LNODE__LN_CLASS, oldLnClass,
                    LN_CLASS_EDEFAULT, oldLnClassESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLnClass() {
        return lnClassESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLnInst() {
        return lnInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLnInst( String newLnInst ) {
        String oldLnInst = lnInst;
        lnInst = newLnInst;
        boolean oldLnInstESet = lnInstESet;
        lnInstESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LNODE__LN_INST, oldLnInst, lnInst,
                    !oldLnInstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLnInst() {
        String oldLnInst = lnInst;
        boolean oldLnInstESet = lnInstESet;
        lnInst = LN_INST_EDEFAULT;
        lnInstESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LNODE__LN_INST, oldLnInst,
                    LN_INST_EDEFAULT, oldLnInstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLnInst() {
        return lnInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLnType() {
        return lnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLnType( String newLnType ) {
        String oldLnType = lnType;
        lnType = newLnType;
        boolean oldLnTypeESet = lnTypeESet;
        lnTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LNODE__LN_TYPE, oldLnType, lnType,
                    !oldLnTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLnType() {
        String oldLnType = lnType;
        boolean oldLnTypeESet = lnTypeESet;
        lnType = LN_TYPE_EDEFAULT;
        lnTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LNODE__LN_TYPE, oldLnType,
                    LN_TYPE_EDEFAULT, oldLnTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLnType() {
        return lnTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPrefix() {
        return prefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrefix( String newPrefix ) {
        String oldPrefix = prefix;
        prefix = newPrefix;
        boolean oldPrefixESet = prefixESet;
        prefixESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LNODE__PREFIX, oldPrefix, prefix,
                    !oldPrefixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrefix() {
        String oldPrefix = prefix;
        boolean oldPrefixESet = prefixESet;
        prefix = PREFIX_EDEFAULT;
        prefixESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LNODE__PREFIX, oldPrefix,
                    PREFIX_EDEFAULT, oldPrefixESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrefix() {
        return prefixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnyLN getRefersToAnyLN() {
        return refersToAnyLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAnyLN( AnyLN newRefersToAnyLN, NotificationChain msgs ) {
        AnyLN oldRefersToAnyLN = refersToAnyLN;
        refersToAnyLN = newRefersToAnyLN;
        boolean oldRefersToAnyLNESet = refersToAnyLNESet;
        refersToAnyLNESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.LNODE__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToAnyLN( AnyLN newRefersToAnyLN ) {
        if( newRefersToAnyLN != refersToAnyLN ) {
            NotificationChain msgs = null;
            if( refersToAnyLN != null )
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_LNODE,
                        AnyLN.class, msgs );
            if( newRefersToAnyLN != null )
                msgs = ( ( InternalEObject ) newRefersToAnyLN ).eInverseAdd( this, SclPackage.ANY_LN__REFERRED_BY_LNODE,
                        AnyLN.class, msgs );
            msgs = basicSetRefersToAnyLN( newRefersToAnyLN, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LNODE__REFERS_TO_ANY_LN,
                        newRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAnyLN( NotificationChain msgs ) {
        AnyLN oldRefersToAnyLN = refersToAnyLN;
        refersToAnyLN = null;
        boolean oldRefersToAnyLNESet = refersToAnyLNESet;
        refersToAnyLNESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.LNODE__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToAnyLN() {
        if( refersToAnyLN != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_LNODE,
                    AnyLN.class, msgs );
            msgs = basicUnsetRefersToAnyLN( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LNODE__REFERS_TO_ANY_LN, null,
                        null, oldRefersToAnyLNESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAnyLN() {
        return refersToAnyLNESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeContainer getParentLNodeContainer() {
        if( eContainerFeatureID() != SclPackage.LNODE__PARENT_LNODE_CONTAINER ) return null;
        return ( LNodeContainer ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLNodeContainer( LNodeContainer newParentLNodeContainer,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLNodeContainer,
                SclPackage.LNODE__PARENT_LNODE_CONTAINER, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLNodeContainer( LNodeContainer newParentLNodeContainer ) {
        if( newParentLNodeContainer != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LNODE__PARENT_LNODE_CONTAINER
                        && newParentLNodeContainer != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLNodeContainer ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentLNodeContainer != null )
                msgs = ( ( InternalEObject ) newParentLNodeContainer ).eInverseAdd( this,
                        SclPackage.LNODE_CONTAINER__LNODE, LNodeContainer.class, msgs );
            msgs = basicSetParentLNodeContainer( newParentLNodeContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LNODE__PARENT_LNODE_CONTAINER,
                    newParentLNodeContainer, newParentLNodeContainer ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeType getRefersToLNodeType() {
        return refersToLNodeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToLNodeType( LNodeType newRefersToLNodeType, NotificationChain msgs ) {
        LNodeType oldRefersToLNodeType = refersToLNodeType;
        refersToLNodeType = newRefersToLNodeType;
        boolean oldRefersToLNodeTypeESet = refersToLNodeTypeESet;
        refersToLNodeTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.LNODE__REFERS_TO_LNODE_TYPE, oldRefersToLNodeType, newRefersToLNodeType,
                    !oldRefersToLNodeTypeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToLNodeType( LNodeType newRefersToLNodeType ) {
        if( newRefersToLNodeType != refersToLNodeType ) {
            NotificationChain msgs = null;
            if( refersToLNodeType != null )
                msgs = ( ( InternalEObject ) refersToLNodeType ).eInverseRemove( this,
                        SclPackage.LNODE_TYPE__REFERRED_BY_LNODE, LNodeType.class, msgs );
            if( newRefersToLNodeType != null )
                msgs = ( ( InternalEObject ) newRefersToLNodeType ).eInverseAdd( this,
                        SclPackage.LNODE_TYPE__REFERRED_BY_LNODE, LNodeType.class, msgs );
            msgs = basicSetRefersToLNodeType( newRefersToLNodeType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToLNodeTypeESet = refersToLNodeTypeESet;
            refersToLNodeTypeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LNODE__REFERS_TO_LNODE_TYPE,
                        newRefersToLNodeType, newRefersToLNodeType, !oldRefersToLNodeTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToLNodeType( NotificationChain msgs ) {
        LNodeType oldRefersToLNodeType = refersToLNodeType;
        refersToLNodeType = null;
        boolean oldRefersToLNodeTypeESet = refersToLNodeTypeESet;
        refersToLNodeTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.LNODE__REFERS_TO_LNODE_TYPE, oldRefersToLNodeType, null, oldRefersToLNodeTypeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToLNodeType() {
        if( refersToLNodeType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToLNodeType ).eInverseRemove( this,
                    SclPackage.LNODE_TYPE__REFERRED_BY_LNODE, LNodeType.class, msgs );
            msgs = basicUnsetRefersToLNodeType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToLNodeTypeESet = refersToLNodeTypeESet;
            refersToLNodeTypeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LNODE__REFERS_TO_LNODE_TYPE, null,
                        null, oldRefersToLNodeTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToLNodeType() {
        return refersToLNodeTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.LNODE__REFERS_TO_ANY_LN:
            if( refersToAnyLN != null )
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_LNODE,
                        AnyLN.class, msgs );
            return basicSetRefersToAnyLN( ( AnyLN ) otherEnd, msgs );
        case SclPackage.LNODE__PARENT_LNODE_CONTAINER:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentLNodeContainer( ( LNodeContainer ) otherEnd, msgs );
        case SclPackage.LNODE__REFERS_TO_LNODE_TYPE:
            if( refersToLNodeType != null )
                msgs = ( ( InternalEObject ) refersToLNodeType ).eInverseRemove( this,
                        SclPackage.LNODE_TYPE__REFERRED_BY_LNODE, LNodeType.class, msgs );
            return basicSetRefersToLNodeType( ( LNodeType ) otherEnd, msgs );
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
        case SclPackage.LNODE__REFERS_TO_ANY_LN:
            return basicUnsetRefersToAnyLN( msgs );
        case SclPackage.LNODE__PARENT_LNODE_CONTAINER:
            return basicSetParentLNodeContainer( null, msgs );
        case SclPackage.LNODE__REFERS_TO_LNODE_TYPE:
            return basicUnsetRefersToLNodeType( msgs );
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
        case SclPackage.LNODE__PARENT_LNODE_CONTAINER:
            return eInternalContainer().eInverseRemove( this, SclPackage.LNODE_CONTAINER__LNODE, LNodeContainer.class,
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
        case SclPackage.LNODE__IED_NAME:
            return getIedName();
        case SclPackage.LNODE__LD_INST:
            return getLdInst();
        case SclPackage.LNODE__LN_CLASS:
            return getLnClass();
        case SclPackage.LNODE__LN_INST:
            return getLnInst();
        case SclPackage.LNODE__LN_TYPE:
            return getLnType();
        case SclPackage.LNODE__PREFIX:
            return getPrefix();
        case SclPackage.LNODE__REFERS_TO_ANY_LN:
            return getRefersToAnyLN();
        case SclPackage.LNODE__PARENT_LNODE_CONTAINER:
            return getParentLNodeContainer();
        case SclPackage.LNODE__REFERS_TO_LNODE_TYPE:
            return getRefersToLNodeType();
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
        case SclPackage.LNODE__IED_NAME:
            setIedName( ( String ) newValue );
            return;
        case SclPackage.LNODE__LD_INST:
            setLdInst( ( String ) newValue );
            return;
        case SclPackage.LNODE__LN_CLASS:
            setLnClass( ( String ) newValue );
            return;
        case SclPackage.LNODE__LN_INST:
            setLnInst( ( String ) newValue );
            return;
        case SclPackage.LNODE__LN_TYPE:
            setLnType( ( String ) newValue );
            return;
        case SclPackage.LNODE__PREFIX:
            setPrefix( ( String ) newValue );
            return;
        case SclPackage.LNODE__REFERS_TO_ANY_LN:
            setRefersToAnyLN( ( AnyLN ) newValue );
            return;
        case SclPackage.LNODE__PARENT_LNODE_CONTAINER:
            setParentLNodeContainer( ( LNodeContainer ) newValue );
            return;
        case SclPackage.LNODE__REFERS_TO_LNODE_TYPE:
            setRefersToLNodeType( ( LNodeType ) newValue );
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
        case SclPackage.LNODE__IED_NAME:
            unsetIedName();
            return;
        case SclPackage.LNODE__LD_INST:
            unsetLdInst();
            return;
        case SclPackage.LNODE__LN_CLASS:
            unsetLnClass();
            return;
        case SclPackage.LNODE__LN_INST:
            unsetLnInst();
            return;
        case SclPackage.LNODE__LN_TYPE:
            unsetLnType();
            return;
        case SclPackage.LNODE__PREFIX:
            unsetPrefix();
            return;
        case SclPackage.LNODE__REFERS_TO_ANY_LN:
            unsetRefersToAnyLN();
            return;
        case SclPackage.LNODE__PARENT_LNODE_CONTAINER:
            setParentLNodeContainer( ( LNodeContainer ) null );
            return;
        case SclPackage.LNODE__REFERS_TO_LNODE_TYPE:
            unsetRefersToLNodeType();
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
        case SclPackage.LNODE__IED_NAME:
            return isSetIedName();
        case SclPackage.LNODE__LD_INST:
            return isSetLdInst();
        case SclPackage.LNODE__LN_CLASS:
            return isSetLnClass();
        case SclPackage.LNODE__LN_INST:
            return isSetLnInst();
        case SclPackage.LNODE__LN_TYPE:
            return isSetLnType();
        case SclPackage.LNODE__PREFIX:
            return isSetPrefix();
        case SclPackage.LNODE__REFERS_TO_ANY_LN:
            return isSetRefersToAnyLN();
        case SclPackage.LNODE__PARENT_LNODE_CONTAINER:
            return getParentLNodeContainer() != null;
        case SclPackage.LNODE__REFERS_TO_LNODE_TYPE:
            return isSetRefersToLNodeType();
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
        result.append( " (iedName: " );
        if( iedNameESet )
            result.append( iedName );
        else
            result.append( "<unset>" );
        result.append( ", ldInst: " );
        if( ldInstESet )
            result.append( ldInst );
        else
            result.append( "<unset>" );
        result.append( ", lnClass: " );
        if( lnClassESet )
            result.append( lnClass );
        else
            result.append( "<unset>" );
        result.append( ", lnInst: " );
        if( lnInstESet )
            result.append( lnInst );
        else
            result.append( "<unset>" );
        result.append( ", lnType: " );
        if( lnTypeESet )
            result.append( lnType );
        else
            result.append( "<unset>" );
        result.append( ", prefix: " );
        if( prefixESet )
            result.append( prefix );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getLineNumber(), "LNodeImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from LNode: ";
        doBuildExplicitAnyLNLink( console, messagePrefix );
        doBuildExplicitLNodeTypeLink( console, messagePrefix );
    }

    private void doBuildExplicitAnyLNLink( @NonNull IRiseClipseConsole console, String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for LN) ";

        // lnInst   The LN instance identification. Can only be missing for lnClass=LLN0, meaning as value here the empty string
        // lnClass  The LN class as defined in IEC 61850-7-x
        // iedName  The name of the IED which contains the LN, none if used for specification (default if attribute is not specified)
        // ldInst   The LD instance on the IED which contains the LN within a specification (SSD file), where iedName=None, this shall
        //          result in unique LN instance identification, i.e. may contain the LD name
        // prefix   The LN prefix used in the IED (if needed; default, if not specified, is the empty string). Can be used for more
        //          detailed function specification than possible by LN class alone, if the LN is not allocated to an IED

        // Resolve only if attribute is not None
        // Default value is None
        if( ( getIedName() == null ) || getIedName().isEmpty() || "None".equals( getIedName() ) ) {
            console.info( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                    messagePrefix, "link to AnyLN not resolved because iedName is absent or None" );
            return;
        }

        if( ( getLnClass() == null ) || getLnClass().isEmpty() ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                    messagePrefix, "lnClass is missing" );
            return;
        }

        // find an IED with
        //   IED.name == LNode.iedName
        Pair< IED, Integer > ied = SclUtilities.getIED( SclUtilities.getSCL( this ), getIedName() );
        if( ied.getLeft() == null ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                    messagePrefix, ( ( ied.getRight() == 0 ) ? "cannot find" : "found several" ),
                    " IED( name = ", getIedName(), " )" );
            return;
        }
        console.info( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                messagePrefix, "found IED( name = ", getIedName(), " ) on line ",
                ied.getLeft().getLineNumber() );

        // find inside an LDevice with
        //   LDevice.name == LNode.ldInst
        Pair< LDevice, Integer > lDevice = SclUtilities.getLDevice( ied.getLeft(), getLdInst() );
        if( lDevice.getLeft() == null ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                    messagePrefix, ( ( lDevice.getRight() == 0 ) ? "cannot find" : "found several" ),
                    " LDevice( inst = ", getLdInst(), " )" );
            return;
        }
        console.info( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                messagePrefix, "found LDevice( inst = ", getLdInst(), " ) on line ",
                lDevice.getLeft().getLineNumber() );

        // find inside an LN with
        //   LN.lnClass == LNode.lnClass
        //   LN.prefix == LNode.prefix
        //   LN.inst == LNode.lnInst
        Pair< AnyLN, Integer > anyLN = SclUtilities.getAnyLN( lDevice.getLeft(), getLnClass(), getLnInst(),
                getPrefix() );
        String mess = " LN( lnClass = " + getLnClass();
        if( getLnInst() != null ) {
            mess += ", inst = " + getLnInst();
            if( getPrefix() != "" ) mess += ", prefix = " + getPrefix();
        }
        mess += " )";
        if( anyLN.getLeft() == null ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                    messagePrefix, ( ( anyLN.getRight() == 0 ) ? "cannot find" : "found several" ),
                    mess );
            return;
        }
        setRefersToAnyLN( anyLN.getLeft() );
        console.notice( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                "LNode refers to ", mess, " on line ", getRefersToAnyLN().getLineNumber() );
    }

    private void doBuildExplicitLNodeTypeLink( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for LNodeType) ";

        // lnType   The logical node type definition containing more detailed functional specification. Might be missing, if the LN is allocated to an IED.

        if( ( getLnType() == null ) || getLnType().isEmpty() ) {
            console.info( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                    messagePrefix, "link not resolved because lnType is missing" );
            return;
        }
        DataTypeTemplates dtt = SclUtilities.getSCL( this ).getDataTypeTemplates();
        if( dtt == null ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                    messagePrefix, "DataTypeTemplates is missing" );
            return;
        }

        List< LNodeType > res = dtt
                .getLNodeType()
                .stream()
                .filter( lnt -> getLnType().equals( lnt.getId() ) )
                .collect( Collectors.toList() );

        if( res.size() != 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                    messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                    " LNodeType( id = ", getLnType(), " )" );
            return;
        }
        setRefersToLNodeType( res.get( 0 ) );
        console.notice( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                "AnyLN refers to LNodeType( id = ", getLnType(), " ) on line ",
                getRefersToLNodeType().getLineNumber() );

        if( ( getLnClass() != null ) && !getLnClass().equals( getRefersToLNodeType().getLnClass() ) ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                    messagePrefix, "lnClass in LNodeType( id = ", getLnType(), " ) is ",
                    getRefersToLNodeType().getLnClass(), " and not ", getLnClass() );
        }
    }

} //LNodeImpl
