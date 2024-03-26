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

import org.apache.commons.lang3.tuple.Pair;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IED Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl#getApRef <em>Ap Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl#getParentControlWithIEDName <em>Parent Control With IED Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl#getRefersToIED <em>Refers To IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl#getRefersToLDevice <em>Refers To LDevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IEDNameImpl extends SclObjectImpl implements IEDName {
    /**
     * The default value of the '{@link #getApRef() <em>Ap Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApRef()
     * @generated
     * @ordered
     */
    protected static final String AP_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApRef() <em>Ap Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApRef()
     * @generated
     * @ordered
     */
    protected String apRef = AP_REF_EDEFAULT;

    /**
     * This is true if the Ap Ref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean apRefESet;

    /**
     * The default value of the '{@link #getLdInst() <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLdInst()
     * @generated
     * @ordered
     */
    protected static final String LD_INST_EDEFAULT = null;

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
    protected static final String LN_INST_EDEFAULT = null;

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
     * This is true if the Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

    /**
     * The cached value of the '{@link #getRefersToIED() <em>Refers To IED</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToIED()
     * @generated
     * @ordered
     */
    protected IED refersToIED;

    /**
     * This is true if the Refers To IED reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToIEDESet;

    /**
     * The cached value of the '{@link #getRefersToLDevice() <em>Refers To LDevice</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToLDevice()
     * @generated
     * @ordered
     */
    protected LDevice refersToLDevice;

    /**
     * This is true if the Refers To LDevice reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToLDeviceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IEDNameImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getIEDName();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getApRef() {
        return apRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApRef( String newApRef ) {
        String oldApRef = apRef;
        apRef = newApRef;
        boolean oldApRefESet = apRefESet;
        apRefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED_NAME__AP_REF, oldApRef, apRef,
                    !oldApRefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApRef() {
        String oldApRef = apRef;
        boolean oldApRefESet = apRefESet;
        apRef = AP_REF_EDEFAULT;
        apRefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED_NAME__AP_REF, oldApRef,
                    AP_REF_EDEFAULT, oldApRefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApRef() {
        return apRefESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED_NAME__LD_INST, oldLdInst, ldInst,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED_NAME__LD_INST, oldLdInst,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED_NAME__LN_CLASS, oldLnClass, lnClass,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED_NAME__LN_CLASS, oldLnClass,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED_NAME__LN_INST, oldLnInst, lnInst,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED_NAME__LN_INST, oldLnInst,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED_NAME__PREFIX, oldPrefix, prefix,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED_NAME__PREFIX, oldPrefix,
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
    public ControlWithIEDName getParentControlWithIEDName() {
        if( eContainerFeatureID() != SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME ) return null;
        return ( ControlWithIEDName ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentControlWithIEDName( ControlWithIEDName newParentControlWithIEDName,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentControlWithIEDName,
                SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentControlWithIEDName( ControlWithIEDName newParentControlWithIEDName ) {
        if( newParentControlWithIEDName != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME
                        && newParentControlWithIEDName != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentControlWithIEDName ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentControlWithIEDName != null )
                msgs = ( ( InternalEObject ) newParentControlWithIEDName ).eInverseAdd( this,
                        SclPackage.CONTROL_WITH_IED_NAME__IED_NAME, ControlWithIEDName.class, msgs );
            msgs = basicSetParentControlWithIEDName( newParentControlWithIEDName, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME,
                    newParentControlWithIEDName, newParentControlWithIEDName ) );
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
                    SclPackage.IED_NAME__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet );
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
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this,
                        SclPackage.ANY_LN__REFERRED_BY_IED_NAME, AnyLN.class, msgs );
            if( newRefersToAnyLN != null )
                msgs = ( ( InternalEObject ) newRefersToAnyLN ).eInverseAdd( this,
                        SclPackage.ANY_LN__REFERRED_BY_IED_NAME, AnyLN.class, msgs );
            msgs = basicSetRefersToAnyLN( newRefersToAnyLN, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED_NAME__REFERS_TO_ANY_LN,
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
                    SclPackage.IED_NAME__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet );
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
            msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_IED_NAME,
                    AnyLN.class, msgs );
            msgs = basicUnsetRefersToAnyLN( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED_NAME__REFERS_TO_ANY_LN, null,
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
        boolean oldValueESet = valueESet;
        valueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED_NAME__VALUE, oldValue, value,
                    !oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue() {
        String oldValue = value;
        boolean oldValueESet = valueESet;
        value = VALUE_EDEFAULT;
        valueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED_NAME__VALUE, oldValue,
                    VALUE_EDEFAULT, oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue() {
        return valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IED getRefersToIED() {
        return refersToIED;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToIED( IED newRefersToIED, NotificationChain msgs ) {
        IED oldRefersToIED = refersToIED;
        refersToIED = newRefersToIED;
        boolean oldRefersToIEDESet = refersToIEDESet;
        refersToIEDESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.IED_NAME__REFERS_TO_IED, oldRefersToIED, newRefersToIED, !oldRefersToIEDESet );
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
    public void setRefersToIED( IED newRefersToIED ) {
        if( newRefersToIED != refersToIED ) {
            NotificationChain msgs = null;
            if( refersToIED != null )
                msgs = ( ( InternalEObject ) refersToIED ).eInverseRemove( this, SclPackage.IED__REFERRED_BY_IED_NAME,
                        IED.class, msgs );
            if( newRefersToIED != null )
                msgs = ( ( InternalEObject ) newRefersToIED ).eInverseAdd( this, SclPackage.IED__REFERRED_BY_IED_NAME,
                        IED.class, msgs );
            msgs = basicSetRefersToIED( newRefersToIED, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToIEDESet = refersToIEDESet;
            refersToIEDESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED_NAME__REFERS_TO_IED,
                        newRefersToIED, newRefersToIED, !oldRefersToIEDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToIED( NotificationChain msgs ) {
        IED oldRefersToIED = refersToIED;
        refersToIED = null;
        boolean oldRefersToIEDESet = refersToIEDESet;
        refersToIEDESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.IED_NAME__REFERS_TO_IED, oldRefersToIED, null, oldRefersToIEDESet );
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
    public void unsetRefersToIED() {
        if( refersToIED != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToIED ).eInverseRemove( this, SclPackage.IED__REFERRED_BY_IED_NAME,
                    IED.class, msgs );
            msgs = basicUnsetRefersToIED( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToIEDESet = refersToIEDESet;
            refersToIEDESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED_NAME__REFERS_TO_IED, null,
                        null, oldRefersToIEDESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToIED() {
        return refersToIEDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LDevice getRefersToLDevice() {
        return refersToLDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToLDevice( LDevice newRefersToLDevice, NotificationChain msgs ) {
        LDevice oldRefersToLDevice = refersToLDevice;
        refersToLDevice = newRefersToLDevice;
        boolean oldRefersToLDeviceESet = refersToLDeviceESet;
        refersToLDeviceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.IED_NAME__REFERS_TO_LDEVICE, oldRefersToLDevice, newRefersToLDevice,
                    !oldRefersToLDeviceESet );
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
    public void setRefersToLDevice( LDevice newRefersToLDevice ) {
        if( newRefersToLDevice != refersToLDevice ) {
            NotificationChain msgs = null;
            if( refersToLDevice != null )
                msgs = ( ( InternalEObject ) refersToLDevice ).eInverseRemove( this,
                        SclPackage.LDEVICE__REFERRED_BY_IED_NAME, LDevice.class, msgs );
            if( newRefersToLDevice != null )
                msgs = ( ( InternalEObject ) newRefersToLDevice ).eInverseAdd( this,
                        SclPackage.LDEVICE__REFERRED_BY_IED_NAME, LDevice.class, msgs );
            msgs = basicSetRefersToLDevice( newRefersToLDevice, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToLDeviceESet = refersToLDeviceESet;
            refersToLDeviceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.IED_NAME__REFERS_TO_LDEVICE,
                        newRefersToLDevice, newRefersToLDevice, !oldRefersToLDeviceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToLDevice( NotificationChain msgs ) {
        LDevice oldRefersToLDevice = refersToLDevice;
        refersToLDevice = null;
        boolean oldRefersToLDeviceESet = refersToLDeviceESet;
        refersToLDeviceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.IED_NAME__REFERS_TO_LDEVICE, oldRefersToLDevice, null, oldRefersToLDeviceESet );
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
    public void unsetRefersToLDevice() {
        if( refersToLDevice != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToLDevice ).eInverseRemove( this,
                    SclPackage.LDEVICE__REFERRED_BY_IED_NAME, LDevice.class, msgs );
            msgs = basicUnsetRefersToLDevice( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToLDeviceESet = refersToLDeviceESet;
            refersToLDeviceESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.IED_NAME__REFERS_TO_LDEVICE, null,
                        null, oldRefersToLDeviceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToLDevice() {
        return refersToLDeviceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentControlWithIEDName( ( ControlWithIEDName ) otherEnd, msgs );
        case SclPackage.IED_NAME__REFERS_TO_ANY_LN:
            if( refersToAnyLN != null )
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this,
                        SclPackage.ANY_LN__REFERRED_BY_IED_NAME, AnyLN.class, msgs );
            return basicSetRefersToAnyLN( ( AnyLN ) otherEnd, msgs );
        case SclPackage.IED_NAME__REFERS_TO_IED:
            if( refersToIED != null )
                msgs = ( ( InternalEObject ) refersToIED ).eInverseRemove( this, SclPackage.IED__REFERRED_BY_IED_NAME,
                        IED.class, msgs );
            return basicSetRefersToIED( ( IED ) otherEnd, msgs );
        case SclPackage.IED_NAME__REFERS_TO_LDEVICE:
            if( refersToLDevice != null )
                msgs = ( ( InternalEObject ) refersToLDevice ).eInverseRemove( this,
                        SclPackage.LDEVICE__REFERRED_BY_IED_NAME, LDevice.class, msgs );
            return basicSetRefersToLDevice( ( LDevice ) otherEnd, msgs );
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
        case SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME:
            return basicSetParentControlWithIEDName( null, msgs );
        case SclPackage.IED_NAME__REFERS_TO_ANY_LN:
            return basicUnsetRefersToAnyLN( msgs );
        case SclPackage.IED_NAME__REFERS_TO_IED:
            return basicUnsetRefersToIED( msgs );
        case SclPackage.IED_NAME__REFERS_TO_LDEVICE:
            return basicUnsetRefersToLDevice( msgs );
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
        case SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME:
            return eInternalContainer().eInverseRemove( this, SclPackage.CONTROL_WITH_IED_NAME__IED_NAME,
                    ControlWithIEDName.class, msgs );
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
        case SclPackage.IED_NAME__AP_REF:
            return getApRef();
        case SclPackage.IED_NAME__LD_INST:
            return getLdInst();
        case SclPackage.IED_NAME__LN_CLASS:
            return getLnClass();
        case SclPackage.IED_NAME__LN_INST:
            return getLnInst();
        case SclPackage.IED_NAME__PREFIX:
            return getPrefix();
        case SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME:
            return getParentControlWithIEDName();
        case SclPackage.IED_NAME__REFERS_TO_ANY_LN:
            return getRefersToAnyLN();
        case SclPackage.IED_NAME__VALUE:
            return getValue();
        case SclPackage.IED_NAME__REFERS_TO_IED:
            return getRefersToIED();
        case SclPackage.IED_NAME__REFERS_TO_LDEVICE:
            return getRefersToLDevice();
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
        case SclPackage.IED_NAME__AP_REF:
            setApRef( ( String ) newValue );
            return;
        case SclPackage.IED_NAME__LD_INST:
            setLdInst( ( String ) newValue );
            return;
        case SclPackage.IED_NAME__LN_CLASS:
            setLnClass( ( String ) newValue );
            return;
        case SclPackage.IED_NAME__LN_INST:
            setLnInst( ( String ) newValue );
            return;
        case SclPackage.IED_NAME__PREFIX:
            setPrefix( ( String ) newValue );
            return;
        case SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME:
            setParentControlWithIEDName( ( ControlWithIEDName ) newValue );
            return;
        case SclPackage.IED_NAME__REFERS_TO_ANY_LN:
            setRefersToAnyLN( ( AnyLN ) newValue );
            return;
        case SclPackage.IED_NAME__VALUE:
            setValue( ( String ) newValue );
            return;
        case SclPackage.IED_NAME__REFERS_TO_IED:
            setRefersToIED( ( IED ) newValue );
            return;
        case SclPackage.IED_NAME__REFERS_TO_LDEVICE:
            setRefersToLDevice( ( LDevice ) newValue );
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
        case SclPackage.IED_NAME__AP_REF:
            unsetApRef();
            return;
        case SclPackage.IED_NAME__LD_INST:
            unsetLdInst();
            return;
        case SclPackage.IED_NAME__LN_CLASS:
            unsetLnClass();
            return;
        case SclPackage.IED_NAME__LN_INST:
            unsetLnInst();
            return;
        case SclPackage.IED_NAME__PREFIX:
            unsetPrefix();
            return;
        case SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME:
            setParentControlWithIEDName( ( ControlWithIEDName ) null );
            return;
        case SclPackage.IED_NAME__REFERS_TO_ANY_LN:
            unsetRefersToAnyLN();
            return;
        case SclPackage.IED_NAME__VALUE:
            unsetValue();
            return;
        case SclPackage.IED_NAME__REFERS_TO_IED:
            unsetRefersToIED();
            return;
        case SclPackage.IED_NAME__REFERS_TO_LDEVICE:
            unsetRefersToLDevice();
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
        case SclPackage.IED_NAME__AP_REF:
            return isSetApRef();
        case SclPackage.IED_NAME__LD_INST:
            return isSetLdInst();
        case SclPackage.IED_NAME__LN_CLASS:
            return isSetLnClass();
        case SclPackage.IED_NAME__LN_INST:
            return isSetLnInst();
        case SclPackage.IED_NAME__PREFIX:
            return isSetPrefix();
        case SclPackage.IED_NAME__PARENT_CONTROL_WITH_IED_NAME:
            return getParentControlWithIEDName() != null;
        case SclPackage.IED_NAME__REFERS_TO_ANY_LN:
            return isSetRefersToAnyLN();
        case SclPackage.IED_NAME__VALUE:
            return isSetValue();
        case SclPackage.IED_NAME__REFERS_TO_IED:
            return isSetRefersToIED();
        case SclPackage.IED_NAME__REFERS_TO_LDEVICE:
            return isSetRefersToLDevice();
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
        result.append( " (apRef: " );
        if( apRefESet )
            result.append( apRef );
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
        result.append( ", prefix: " );
        if( prefixESet )
            result.append( prefix );
        else
            result.append( "<unset>" );
        result.append( ", value: " );
        if( valueESet )
            result.append( value );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "IEDNameImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        // apRef        The reference to the access point on the IED, via which the data shall flow. Optional, only needed if the IED has more than one access point.
        // ldInst       Identifies the destination LD in the IED. Optional.
        // prefix       Destination LN prefix. Optional
        // lnClass      Destination LN class, optional. If missing, no destination LN at all
        // lnInst       Destination LN instance number, optional. If missing, either no destination LN, or lnClass = LLN0.

        // We only set the most precise RefersTo (IED / LDevice / AnyLN)

        String messagePrefix = "while resolving link from IEDName: ";

        if( ( getValue() == null ) || getValue().isEmpty() ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "value is missing" );
            return;
        }

        // find an IED with
        //   IED.name == value
        Pair< IED, Integer > ied = SclUtilities.getIED( SclUtilities.getSCL( this ), getValue() );
        if( ied.getLeft() == null ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, ( ( ied.getRight() == 0 ) ? "cannot find" : "found several" ),
                    " IED( name = ", getValue(), " )" );
            return;
        }

        if( ( getLdInst() == null ) || getLdInst().isEmpty() ) {
            setRefersToIED( ied.getLeft() );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "IEDName to IED( name = ", getValue(), " ) on line ",
                    ied.getLeft().getLineNumber() );
            return;
        }

        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                messagePrefix, "found IED( name = ", getValue(), " ) on line ",
                ied.getLeft().getLineNumber() );

        Pair< AccessPoint, Integer > ap = null;
        if( ( getApRef() == null ) || getApRef().isEmpty() ) {
            if( ied.getLeft().getAccessPoint().size() == 0 ) {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "no AccessPoint found in ied ( name = ", ied.getLeft().getName(), " )" );
                return;
            }
            if( ied.getLeft().getAccessPoint().size() > 1 ) {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, "found several AccessPoint in ied ( name = ", ied.getLeft().getName(),
                        " ) but apRef not specified" );
                return;
            }
            ap = Pair.of( ied.getLeft().getAccessPoint().get( 0 ), 1 );
        }
        else {
            ap = SclUtilities.getAccessPoint( ied.getLeft(), getApRef() );
            if( ap.getLeft() == null ) {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, ( ( ap.getRight() == 0 ) ? "cannot find" : "found several" ),
                        " AccessPoint( name = ", getApRef(), " )" );
                return;
            }
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found AccessPoint( name = ", getApRef(), " ) on line ",
                    ap.getLeft().getLineNumber() );
        }
        Pair< LDevice, Integer > lDevice = SclUtilities.getLDevice( ied.getLeft(), getLdInst() );
        if( lDevice.getLeft() == null ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, ( ( lDevice.getRight() == 0 ) ? "cannot find" : "found several" ),
                    " LDevice( inst = ", getLdInst(), " )" );
            return;
        }
        if( ( getLnClass() == null ) || getLnClass().isEmpty() ) {
            setRefersToLDevice( lDevice.getLeft() );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "IEDName refers to LDevice( inst = ", getLdInst(), " ) on line ",
                    getRefersToLDevice().getLineNumber() );
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                messagePrefix, "found LDevice( inst = ", getLdInst(), " ) on line ",
                lDevice.getLeft().getLineNumber() );

        Pair< AnyLN, Integer > anyLN = SclUtilities.getAnyLN( lDevice.getLeft(), getLnClass(), getLnInst(),
                getPrefix() );
        String mess = " LN( lnClass = " + getLnClass();
        if( getLnInst() != null ) {
            mess += ", inst = " + getLnInst();
            if( getPrefix() != "" ) mess += ", prefix = " + getPrefix();
        }
        mess += " )";
        if( anyLN.getLeft() == null ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, ( ( anyLN.getRight() == 0 ) ? "cannot find" : "found several" ),
                    mess );
            return;
        }
        setRefersToAnyLN( anyLN.getLeft() );
        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "ClientLN refers to", mess, " on line ", getRefersToAnyLN().getLineNumber() );
    }

} //IEDNameImpl
