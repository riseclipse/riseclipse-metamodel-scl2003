/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDesc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef;
import java.util.List;
import java.util.stream.Collectors;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client LN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getApRef <em>Ap Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getParentRptEnabled <em>Parent Rpt Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientLNImpl extends ExplicitLinkResolverImpl implements ClientLN {
    /**
     * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDesc()
     * @generated
     * @ordered
     */
    protected static final String DESC_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDesc()
     * @generated
     * @ordered
     */
    protected String desc = DESC_EDEFAULT;

    /**
     * This is true if the Desc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descESet;

    /**
     * The default value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIedName()
     * @generated
     * @ordered
     */
    protected static final String IED_NAME_EDEFAULT = null;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClientLNImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getClientLN();
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__AP_REF, oldApRef, apRef, !oldApRefESet));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__AP_REF, oldApRef, AP_REF_EDEFAULT, oldApRefESet));
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
    public RptEnabled getParentRptEnabled() {
        if (eContainerFeatureID() != SclPackage.CLIENT_LN__PARENT_RPT_ENABLED) return null;
        return (RptEnabled)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentRptEnabled(RptEnabled newParentRptEnabled, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentRptEnabled, SclPackage.CLIENT_LN__PARENT_RPT_ENABLED, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentRptEnabled(RptEnabled newParentRptEnabled) {
        if (newParentRptEnabled != eInternalContainer() || (eContainerFeatureID() != SclPackage.CLIENT_LN__PARENT_RPT_ENABLED && newParentRptEnabled != null)) {
            if (EcoreUtil.isAncestor(this, newParentRptEnabled))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentRptEnabled != null)
                msgs = ((InternalEObject)newParentRptEnabled).eInverseAdd(this, SclPackage.RPT_ENABLED__CLIENT_LN, RptEnabled.class, msgs);
            msgs = basicSetParentRptEnabled(newParentRptEnabled, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__PARENT_RPT_ENABLED, newParentRptEnabled, newParentRptEnabled));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__IED_NAME, oldIedName, iedName, !oldIedNameESet));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__IED_NAME, oldIedName, IED_NAME_EDEFAULT, oldIedNameESet));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__LD_INST, oldLdInst, ldInst, !oldLdInstESet));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__LD_INST, oldLdInst, LD_INST_EDEFAULT, oldLdInstESet));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__LN_CLASS, oldLnClass, lnClass, !oldLnClassESet));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__LN_CLASS, oldLnClass, LN_CLASS_EDEFAULT, oldLnClassESet));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__LN_INST, oldLnInst, lnInst, !oldLnInstESet));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__LN_INST, oldLnInst, LN_INST_EDEFAULT, oldLnInstESet));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__PREFIX, oldPrefix, prefix, !oldPrefixESet));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet));
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
    public String getDesc() {
        return desc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDesc(String newDesc) {
        String oldDesc = desc;
        desc = newDesc;
        boolean oldDescESet = descESet;
        descESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__DESC, oldDesc, desc, !oldDescESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDesc() {
        String oldDesc = desc;
        boolean oldDescESet = descESet;
        desc = DESC_EDEFAULT;
        descESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__DESC, oldDesc, DESC_EDEFAULT, oldDescESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDesc() {
        return descESet;
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
    public NotificationChain basicSetRefersToAnyLN(AnyLN newRefersToAnyLN, NotificationChain msgs) {
        AnyLN oldRefersToAnyLN = refersToAnyLN;
        refersToAnyLN = newRefersToAnyLN;
        boolean oldRefersToAnyLNESet = refersToAnyLNESet;
        refersToAnyLNESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToAnyLN(AnyLN newRefersToAnyLN) {
        if (newRefersToAnyLN != refersToAnyLN) {
            NotificationChain msgs = null;
            if (refersToAnyLN != null)
                msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN, AnyLN.class, msgs);
            if (newRefersToAnyLN != null)
                msgs = ((InternalEObject)newRefersToAnyLN).eInverseAdd(this, SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN, AnyLN.class, msgs);
            msgs = basicSetRefersToAnyLN(newRefersToAnyLN, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CLIENT_LN__REFERS_TO_ANY_LN, newRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAnyLN(NotificationChain msgs) {
        AnyLN oldRefersToAnyLN = refersToAnyLN;
        refersToAnyLN = null;
        boolean oldRefersToAnyLNESet = refersToAnyLNESet;
        refersToAnyLNESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
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
        if (refersToAnyLN != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN, AnyLN.class, msgs);
            msgs = basicUnsetRefersToAnyLN(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CLIENT_LN__REFERS_TO_ANY_LN, null, null, oldRefersToAnyLNESet));
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.CLIENT_LN__PARENT_RPT_ENABLED:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentRptEnabled((RptEnabled)otherEnd, msgs);
            case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
                if (refersToAnyLN != null)
                    msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_CLIENT_LN, AnyLN.class, msgs);
                return basicSetRefersToAnyLN((AnyLN)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.CLIENT_LN__PARENT_RPT_ENABLED:
                return basicSetParentRptEnabled(null, msgs);
            case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
                return basicUnsetRefersToAnyLN(msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch (eContainerFeatureID()) {
            case SclPackage.CLIENT_LN__PARENT_RPT_ENABLED:
                return eInternalContainer().eInverseRemove(this, SclPackage.RPT_ENABLED__CLIENT_LN, RptEnabled.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
            case SclPackage.CLIENT_LN__DESC:
                return getDesc();
            case SclPackage.CLIENT_LN__IED_NAME:
                return getIedName();
            case SclPackage.CLIENT_LN__LD_INST:
                return getLdInst();
            case SclPackage.CLIENT_LN__LN_CLASS:
                return getLnClass();
            case SclPackage.CLIENT_LN__LN_INST:
                return getLnInst();
            case SclPackage.CLIENT_LN__PREFIX:
                return getPrefix();
            case SclPackage.CLIENT_LN__AP_REF:
                return getApRef();
            case SclPackage.CLIENT_LN__PARENT_RPT_ENABLED:
                return getParentRptEnabled();
            case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
                return getRefersToAnyLN();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
            case SclPackage.CLIENT_LN__DESC:
                setDesc((String)newValue);
                return;
            case SclPackage.CLIENT_LN__IED_NAME:
                setIedName((String)newValue);
                return;
            case SclPackage.CLIENT_LN__LD_INST:
                setLdInst((String)newValue);
                return;
            case SclPackage.CLIENT_LN__LN_CLASS:
                setLnClass((String)newValue);
                return;
            case SclPackage.CLIENT_LN__LN_INST:
                setLnInst((String)newValue);
                return;
            case SclPackage.CLIENT_LN__PREFIX:
                setPrefix((String)newValue);
                return;
            case SclPackage.CLIENT_LN__AP_REF:
                setApRef((String)newValue);
                return;
            case SclPackage.CLIENT_LN__PARENT_RPT_ENABLED:
                setParentRptEnabled((RptEnabled)newValue);
                return;
            case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
                setRefersToAnyLN((AnyLN)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch (featureID) {
            case SclPackage.CLIENT_LN__DESC:
                unsetDesc();
                return;
            case SclPackage.CLIENT_LN__IED_NAME:
                unsetIedName();
                return;
            case SclPackage.CLIENT_LN__LD_INST:
                unsetLdInst();
                return;
            case SclPackage.CLIENT_LN__LN_CLASS:
                unsetLnClass();
                return;
            case SclPackage.CLIENT_LN__LN_INST:
                unsetLnInst();
                return;
            case SclPackage.CLIENT_LN__PREFIX:
                unsetPrefix();
                return;
            case SclPackage.CLIENT_LN__AP_REF:
                unsetApRef();
                return;
            case SclPackage.CLIENT_LN__PARENT_RPT_ENABLED:
                setParentRptEnabled((RptEnabled)null);
                return;
            case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
                unsetRefersToAnyLN();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
            case SclPackage.CLIENT_LN__DESC:
                return isSetDesc();
            case SclPackage.CLIENT_LN__IED_NAME:
                return isSetIedName();
            case SclPackage.CLIENT_LN__LD_INST:
                return isSetLdInst();
            case SclPackage.CLIENT_LN__LN_CLASS:
                return isSetLnClass();
            case SclPackage.CLIENT_LN__LN_INST:
                return isSetLnInst();
            case SclPackage.CLIENT_LN__PREFIX:
                return isSetPrefix();
            case SclPackage.CLIENT_LN__AP_REF:
                return isSetApRef();
            case SclPackage.CLIENT_LN__PARENT_RPT_ENABLED:
                return getParentRptEnabled() != null;
            case SclPackage.CLIENT_LN__REFERS_TO_ANY_LN:
                return isSetRefersToAnyLN();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == AgDesc.class) {
            switch (derivedFeatureID) {
                case SclPackage.CLIENT_LN__DESC: return SclPackage.AG_DESC__DESC;
                default: return -1;
            }
        }
        if (baseClass == AgLDRef.class) {
            switch (derivedFeatureID) {
                case SclPackage.CLIENT_LN__IED_NAME: return SclPackage.AG_LD_REF__IED_NAME;
                case SclPackage.CLIENT_LN__LD_INST: return SclPackage.AG_LD_REF__LD_INST;
                default: return -1;
            }
        }
        if (baseClass == AgLNRef.class) {
            switch (derivedFeatureID) {
                case SclPackage.CLIENT_LN__LN_CLASS: return SclPackage.AG_LN_REF__LN_CLASS;
                case SclPackage.CLIENT_LN__LN_INST: return SclPackage.AG_LN_REF__LN_INST;
                case SclPackage.CLIENT_LN__PREFIX: return SclPackage.AG_LN_REF__PREFIX;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == AgDesc.class) {
            switch (baseFeatureID) {
                case SclPackage.AG_DESC__DESC: return SclPackage.CLIENT_LN__DESC;
                default: return -1;
            }
        }
        if (baseClass == AgLDRef.class) {
            switch (baseFeatureID) {
                case SclPackage.AG_LD_REF__IED_NAME: return SclPackage.CLIENT_LN__IED_NAME;
                case SclPackage.AG_LD_REF__LD_INST: return SclPackage.CLIENT_LN__LD_INST;
                default: return -1;
            }
        }
        if (baseClass == AgLNRef.class) {
            switch (baseFeatureID) {
                case SclPackage.AG_LN_REF__LN_CLASS: return SclPackage.CLIENT_LN__LN_CLASS;
                case SclPackage.AG_LN_REF__LN_INST: return SclPackage.CLIENT_LN__LN_INST;
                case SclPackage.AG_LN_REF__PREFIX: return SclPackage.CLIENT_LN__PREFIX;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (desc: ");
        if (descESet) result.append(desc); else result.append("<unset>");
        result.append(", iedName: ");
        if (iedNameESet) result.append(iedName); else result.append("<unset>");
        result.append(", ldInst: ");
        if (ldInstESet) result.append(ldInst); else result.append("<unset>");
        result.append(", lnClass: ");
        if (lnClassESet) result.append(lnClass); else result.append("<unset>");
        result.append(", lnInst: ");
        if (lnInstESet) result.append(lnInst); else result.append("<unset>");
        result.append(", prefix: ");
        if (prefixESet) result.append(prefix); else result.append("<unset>");
        result.append(", apRef: ");
        if (apRefESet) result.append(apRef); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doResolveLinks() {
        // see Issue #13
        super.doResolveLinks();
        
        // iedName The name of the IED where the LN resides
        // apRef   The name of the access point via which the IED shall be accessed. Optional, not needed if the IED has only one access point.
        // ldInst  The instance identification of the LD where the LN resides
        // prefix  The LN prefix
        // lnClass The LN class according to IEC 61850-7-4
        // lnInst  The instance id of this LN instance of below LN class in the IED
        // desc    optional descriptive text, e.g. about purpose of the client

        if( getIedName() == null ) return;
        if( getLdInst() == null ) return;
        if( getLnClass() == null ) return;
        // If the reference is to an LN at a pure client access point, then the value of ldInst shall be LD0
        if( getLdInst().equals( "LD0" )) return;

        IRiseClipseConsole console = AbstractRiseClipseConsole.getConsole();
        String messagePrefix = "while resolving link from ClientLN on line " + getLineNumber() + ": ";

        // find an IED with
        //   IED.name == ClientLN.iedName
        List< IED > res1 =
                get_IEDs()
                .stream()
                .filter( ied -> getIedName().equals( ied.getName() ))
                .collect( Collectors.toList() );

        IED ied = null;
        String mess1 = "IED( name = " + getIedName() + " )";
        if( res1.isEmpty() ) {
            console.error( messagePrefix + "cannot find " + mess1 );
            return;
        }
        if( res1.size() > 1 ) {
            console.error( messagePrefix + "found several " + mess1 );
            return;
        }
        ied = res1.get( 0 );
        console.verbose( messagePrefix + "found " + mess1 + " on line " + ied.getLineNumber() );
        
        AccessPoint ap = null;
        if(( getApRef() == null ) || getApRef().isEmpty() ) {
            if( ied.getAccessPoint().size() == 0 ) {
                console.error( messagePrefix + "no AccessPoint found in ied ( name = " + ied.getName() + " )" );
                return;
            }
            if( ied.getAccessPoint().size() > 1 ) {
                console.error( messagePrefix + "found several AccessPoint in ied ( name = " + ied.getName() + " ) but apRef not specified" );
                return;
            }
            ap = ied.getAccessPoint().get( 0 );
        }
        else {
            List< AccessPoint > res2 =
                    ied
                    .getAccessPoint()
                    .stream()
                    .filter(  a -> getApRef().equals( a.getName() ))
                    .collect( Collectors.toList() );
            String mess2 = "AccessPoint( name = " + getApRef() + " )";
            if( res2.isEmpty() ) {
                console.error( messagePrefix + "cannot find " + mess2 );
                return;
            }
            if( res2.size() > 1 ) {
                console.error( messagePrefix + "found several " + mess2 );
                return;
            }
            ap = res2.get( 0 );
            console.verbose( messagePrefix + "found " + mess2 + " on line " + ap.getLineNumber() );
        }

        // The following is copy/paste from ExtRef/FCDA
        // TODO: factor out ?
        
        // find inside an LDevice with
        //   LDevice.name == ClientLN.ldInst
        if( ap.getServer() == null ) return;
        List< LDevice > res3 = 
                ap
                .getServer()
                .getLDevice()
                .stream()
                .filter( ld -> getLdInst().equals( ld.getInst() ))
                .collect( Collectors.toList() );

        String mess3 = "LDevice( inst = " + getLdInst() + " )";
        if( res3.isEmpty() ) {
            console.error( messagePrefix + "cannot find " + mess3 );
            return;
        }
        if( res3.size() > 1 ) {
            console.error( messagePrefix + "found several " + mess3 );
            return;
        }
        LDevice lDevice = res3.get( 0 );
        console.verbose( messagePrefix + "found " + mess3 + " on line " + lDevice.getLineNumber() );

        if( "LLN0".equals( getLnClass() )) {
            if( lDevice.getLN0() == null ) {
                console.error( messagePrefix + "cannot find LN0" );
                return;
            }
            setRefersToAnyLN( lDevice.getLN0() );
            console.info( "ClientLN on line " + getLineNumber() + " refers to LN0 on line " + getRefersToAnyLN().getLineNumber() );
        }
        else {
            if( getLnInst() == null ) return;
            // find inside an LN with
            //   LN.lnClass == ClientLN.lnClass
            //   LN.prefix == ClientLN.prefix
            //   LN.inst == ClientLN.lnInst
            List< LN > res4 = 
                    lDevice
                    .getLN()
                    .stream()
                    .filter( ln ->  getLnClass().equals( ln.getLnClass() ) && getLnInst().equals( ln.getInst() ) && getPrefix().equals( ln.getPrefix() ))
                    .collect( Collectors.toList() );

            String mess4 = "LN( lnClass = " + getLnClass() + ", inst = " + getLnInst() + " )";
            if( res4.isEmpty() ) {
                console.error( messagePrefix + "cannot find " + mess4 );
                return;
            }
            if( res4.size() > 1 ) {
                console.error( messagePrefix + "found several " + mess4 );
                return;
            }
            setRefersToAnyLN( res4.get( 0 ));
            console.info( "ClientLN on line " + getLineNumber() + " refers to " + mess4 + " on line " + getRefersToAnyLN().getLineNumber() );
        }
    }

} //ClientLNImpl
