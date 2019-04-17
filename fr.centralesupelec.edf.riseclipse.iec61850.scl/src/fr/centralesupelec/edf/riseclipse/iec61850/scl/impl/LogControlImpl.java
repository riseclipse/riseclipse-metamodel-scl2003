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

import java.util.List;
import java.util.stream.Collectors;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Log;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl#getBufTime <em>Buf Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl#getLogEna <em>Log Ena</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl#getLogName <em>Log Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl#getReasonCode <em>Reason Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl#getAnyLN <em>Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl#getRefersToLog <em>Refers To Log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogControlImpl extends ControlWithTriggerOptImpl implements LogControl {
    /**
     * The default value of the '{@link #getBufTime() <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufTime()
     * @generated
     * @ordered
     */
    protected static final Integer BUF_TIME_EDEFAULT = new Integer(0);

    /**
     * The cached value of the '{@link #getBufTime() <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufTime()
     * @generated
     * @ordered
     */
    protected Integer bufTime = BUF_TIME_EDEFAULT;

    /**
     * This is true if the Buf Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bufTimeESet;

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
    protected static final String LN_CLASS_EDEFAULT = "LLN0";

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
     * The default value of the '{@link #getLogEna() <em>Log Ena</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogEna()
     * @generated
     * @ordered
     */
    protected static final Boolean LOG_ENA_EDEFAULT = Boolean.TRUE;

    /**
     * The cached value of the '{@link #getLogEna() <em>Log Ena</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogEna()
     * @generated
     * @ordered
     */
    protected Boolean logEna = LOG_ENA_EDEFAULT;

    /**
     * This is true if the Log Ena attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean logEnaESet;

    /**
     * The default value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogName()
     * @generated
     * @ordered
     */
    protected static final String LOG_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogName()
     * @generated
     * @ordered
     */
    protected String logName = LOG_NAME_EDEFAULT;

    /**
     * This is true if the Log Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean logNameESet;

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
     * The default value of the '{@link #getReasonCode() <em>Reason Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReasonCode()
     * @generated
     * @ordered
     */
    protected static final Boolean REASON_CODE_EDEFAULT = Boolean.TRUE;

    /**
     * The cached value of the '{@link #getReasonCode() <em>Reason Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReasonCode()
     * @generated
     * @ordered
     */
    protected Boolean reasonCode = REASON_CODE_EDEFAULT;

    /**
     * This is true if the Reason Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reasonCodeESet;

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
     * The cached value of the '{@link #getRefersToLog() <em>Refers To Log</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToLog()
     * @generated
     * @ordered
     */
    protected Log refersToLog;

    /**
     * This is true if the Refers To Log reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToLogESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LogControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLogControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getBufTime() {
        return bufTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBufTime( Integer newBufTime ) {
        Integer oldBufTime = bufTime;
        bufTime = newBufTime;
        boolean oldBufTimeESet = bufTimeESet;
        bufTimeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__BUF_TIME, oldBufTime, bufTime, !oldBufTimeESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBufTime() {
        Integer oldBufTime = bufTime;
        boolean oldBufTimeESet = bufTimeESet;
        bufTime = BUF_TIME_EDEFAULT;
        bufTimeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__BUF_TIME, oldBufTime, BUF_TIME_EDEFAULT, oldBufTimeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBufTime() {
        return bufTimeESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__LD_INST, oldLdInst, ldInst, !oldLdInstESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__LD_INST, oldLdInst, LD_INST_EDEFAULT, oldLdInstESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__LN_CLASS, oldLnClass, lnClass, !oldLnClassESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__LN_CLASS, oldLnClass, LN_CLASS_EDEFAULT, oldLnClassESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__LN_INST, oldLnInst, lnInst, !oldLnInstESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__LN_INST, oldLnInst, LN_INST_EDEFAULT, oldLnInstESet));
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
    public Boolean getLogEna() {
        return logEna;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLogEna( Boolean newLogEna ) {
        Boolean oldLogEna = logEna;
        logEna = newLogEna;
        boolean oldLogEnaESet = logEnaESet;
        logEnaESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__LOG_ENA, oldLogEna, logEna, !oldLogEnaESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLogEna() {
        Boolean oldLogEna = logEna;
        boolean oldLogEnaESet = logEnaESet;
        logEna = LOG_ENA_EDEFAULT;
        logEnaESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__LOG_ENA, oldLogEna, LOG_ENA_EDEFAULT, oldLogEnaESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLogEna() {
        return logEnaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLogName() {
        return logName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLogName( String newLogName ) {
        String oldLogName = logName;
        logName = newLogName;
        boolean oldLogNameESet = logNameESet;
        logNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__LOG_NAME, oldLogName, logName, !oldLogNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLogName() {
        String oldLogName = logName;
        boolean oldLogNameESet = logNameESet;
        logName = LOG_NAME_EDEFAULT;
        logNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__LOG_NAME, oldLogName, LOG_NAME_EDEFAULT, oldLogNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLogName() {
        return logNameESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__PREFIX, oldPrefix, prefix, !oldPrefixESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet));
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
    public Boolean getReasonCode() {
        return reasonCode;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReasonCode( Boolean newReasonCode ) {
        Boolean oldReasonCode = reasonCode;
        reasonCode = newReasonCode;
        boolean oldReasonCodeESet = reasonCodeESet;
        reasonCodeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__REASON_CODE, oldReasonCode, reasonCode, !oldReasonCodeESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReasonCode() {
        Boolean oldReasonCode = reasonCode;
        boolean oldReasonCodeESet = reasonCodeESet;
        reasonCode = REASON_CODE_EDEFAULT;
        reasonCodeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__REASON_CODE, oldReasonCode, REASON_CODE_EDEFAULT, oldReasonCodeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReasonCode() {
        return reasonCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnyLN getAnyLN() {
        if (eContainerFeatureID() != SclPackage.LOG_CONTROL__ANY_LN) return null;
        return (AnyLN)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnyLN( AnyLN newAnyLN, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newAnyLN, SclPackage.LOG_CONTROL__ANY_LN, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAnyLN( AnyLN newAnyLN ) {
        if (newAnyLN != eInternalContainer() || (eContainerFeatureID() != SclPackage.LOG_CONTROL__ANY_LN && newAnyLN != null)) {
            if (EcoreUtil.isAncestor(this, newAnyLN))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAnyLN != null)
                msgs = ((InternalEObject)newAnyLN).eInverseAdd(this, SclPackage.ANY_LN__LOG_CONTROL, AnyLN.class, msgs);
            msgs = basicSetAnyLN(newAnyLN, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__ANY_LN, newAnyLN, newAnyLN));
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
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet);
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
    public void setRefersToAnyLN( AnyLN newRefersToAnyLN ) {
        if (newRefersToAnyLN != refersToAnyLN) {
            NotificationChain msgs = null;
            if (refersToAnyLN != null)
                msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_LOG_CONTROL, AnyLN.class, msgs);
            if (newRefersToAnyLN != null)
                msgs = ((InternalEObject)newRefersToAnyLN).eInverseAdd(this, SclPackage.ANY_LN__REFERRED_BY_LOG_CONTROL, AnyLN.class, msgs);
            msgs = basicSetRefersToAnyLN(newRefersToAnyLN, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__REFERS_TO_ANY_LN, newRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet));
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
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet);
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
            msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_LOG_CONTROL, AnyLN.class, msgs);
            msgs = basicUnsetRefersToAnyLN(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__REFERS_TO_ANY_LN, null, null, oldRefersToAnyLNESet));
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
    public Log getRefersToLog() {
        return refersToLog;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToLog(Log newRefersToLog, NotificationChain msgs) {
        Log oldRefersToLog = refersToLog;
        refersToLog = newRefersToLog;
        boolean oldRefersToLogESet = refersToLogESet;
        refersToLogESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__REFERS_TO_LOG, oldRefersToLog, newRefersToLog, !oldRefersToLogESet);
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
    public void setRefersToLog(Log newRefersToLog) {
        if (newRefersToLog != refersToLog) {
            NotificationChain msgs = null;
            if (refersToLog != null)
                msgs = ((InternalEObject)refersToLog).eInverseRemove(this, SclPackage.LOG__REFERRED_BY_LOG_CONTROL, Log.class, msgs);
            if (newRefersToLog != null)
                msgs = ((InternalEObject)newRefersToLog).eInverseAdd(this, SclPackage.LOG__REFERRED_BY_LOG_CONTROL, Log.class, msgs);
            msgs = basicSetRefersToLog(newRefersToLog, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToLogESet = refersToLogESet;
            refersToLogESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LOG_CONTROL__REFERS_TO_LOG, newRefersToLog, newRefersToLog, !oldRefersToLogESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToLog(NotificationChain msgs) {
        Log oldRefersToLog = refersToLog;
        refersToLog = null;
        boolean oldRefersToLogESet = refersToLogESet;
        refersToLogESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__REFERS_TO_LOG, oldRefersToLog, null, oldRefersToLogESet);
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
    public void unsetRefersToLog() {
        if (refersToLog != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToLog).eInverseRemove(this, SclPackage.LOG__REFERRED_BY_LOG_CONTROL, Log.class, msgs);
            msgs = basicUnsetRefersToLog(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToLogESet = refersToLogESet;
            refersToLogESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LOG_CONTROL__REFERS_TO_LOG, null, null, oldRefersToLogESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToLog() {
        return refersToLogESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.LOG_CONTROL__ANY_LN:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAnyLN((AnyLN)otherEnd, msgs);
            case SclPackage.LOG_CONTROL__REFERS_TO_ANY_LN:
                if (refersToAnyLN != null)
                    msgs = ((InternalEObject)refersToAnyLN).eInverseRemove(this, SclPackage.ANY_LN__REFERRED_BY_LOG_CONTROL, AnyLN.class, msgs);
                return basicSetRefersToAnyLN((AnyLN)otherEnd, msgs);
            case SclPackage.LOG_CONTROL__REFERS_TO_LOG:
                if (refersToLog != null)
                    msgs = ((InternalEObject)refersToLog).eInverseRemove(this, SclPackage.LOG__REFERRED_BY_LOG_CONTROL, Log.class, msgs);
                return basicSetRefersToLog((Log)otherEnd, msgs);
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
            case SclPackage.LOG_CONTROL__ANY_LN:
                return basicSetAnyLN(null, msgs);
            case SclPackage.LOG_CONTROL__REFERS_TO_ANY_LN:
                return basicUnsetRefersToAnyLN(msgs);
            case SclPackage.LOG_CONTROL__REFERS_TO_LOG:
                return basicUnsetRefersToLog(msgs);
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
            case SclPackage.LOG_CONTROL__ANY_LN:
                return eInternalContainer().eInverseRemove(this, SclPackage.ANY_LN__LOG_CONTROL, AnyLN.class, msgs);
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
            case SclPackage.LOG_CONTROL__BUF_TIME:
                return getBufTime();
            case SclPackage.LOG_CONTROL__LD_INST:
                return getLdInst();
            case SclPackage.LOG_CONTROL__LN_CLASS:
                return getLnClass();
            case SclPackage.LOG_CONTROL__LN_INST:
                return getLnInst();
            case SclPackage.LOG_CONTROL__LOG_ENA:
                return getLogEna();
            case SclPackage.LOG_CONTROL__LOG_NAME:
                return getLogName();
            case SclPackage.LOG_CONTROL__PREFIX:
                return getPrefix();
            case SclPackage.LOG_CONTROL__REASON_CODE:
                return getReasonCode();
            case SclPackage.LOG_CONTROL__ANY_LN:
                return getAnyLN();
            case SclPackage.LOG_CONTROL__REFERS_TO_ANY_LN:
                return getRefersToAnyLN();
            case SclPackage.LOG_CONTROL__REFERS_TO_LOG:
                return getRefersToLog();
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
            case SclPackage.LOG_CONTROL__BUF_TIME:
                setBufTime((Integer)newValue);
                return;
            case SclPackage.LOG_CONTROL__LD_INST:
                setLdInst((String)newValue);
                return;
            case SclPackage.LOG_CONTROL__LN_CLASS:
                setLnClass((String)newValue);
                return;
            case SclPackage.LOG_CONTROL__LN_INST:
                setLnInst((String)newValue);
                return;
            case SclPackage.LOG_CONTROL__LOG_ENA:
                setLogEna((Boolean)newValue);
                return;
            case SclPackage.LOG_CONTROL__LOG_NAME:
                setLogName((String)newValue);
                return;
            case SclPackage.LOG_CONTROL__PREFIX:
                setPrefix((String)newValue);
                return;
            case SclPackage.LOG_CONTROL__REASON_CODE:
                setReasonCode((Boolean)newValue);
                return;
            case SclPackage.LOG_CONTROL__ANY_LN:
                setAnyLN((AnyLN)newValue);
                return;
            case SclPackage.LOG_CONTROL__REFERS_TO_ANY_LN:
                setRefersToAnyLN((AnyLN)newValue);
                return;
            case SclPackage.LOG_CONTROL__REFERS_TO_LOG:
                setRefersToLog((Log)newValue);
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
            case SclPackage.LOG_CONTROL__BUF_TIME:
                unsetBufTime();
                return;
            case SclPackage.LOG_CONTROL__LD_INST:
                unsetLdInst();
                return;
            case SclPackage.LOG_CONTROL__LN_CLASS:
                unsetLnClass();
                return;
            case SclPackage.LOG_CONTROL__LN_INST:
                unsetLnInst();
                return;
            case SclPackage.LOG_CONTROL__LOG_ENA:
                unsetLogEna();
                return;
            case SclPackage.LOG_CONTROL__LOG_NAME:
                unsetLogName();
                return;
            case SclPackage.LOG_CONTROL__PREFIX:
                unsetPrefix();
                return;
            case SclPackage.LOG_CONTROL__REASON_CODE:
                unsetReasonCode();
                return;
            case SclPackage.LOG_CONTROL__ANY_LN:
                setAnyLN((AnyLN)null);
                return;
            case SclPackage.LOG_CONTROL__REFERS_TO_ANY_LN:
                unsetRefersToAnyLN();
                return;
            case SclPackage.LOG_CONTROL__REFERS_TO_LOG:
                unsetRefersToLog();
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
            case SclPackage.LOG_CONTROL__BUF_TIME:
                return isSetBufTime();
            case SclPackage.LOG_CONTROL__LD_INST:
                return isSetLdInst();
            case SclPackage.LOG_CONTROL__LN_CLASS:
                return isSetLnClass();
            case SclPackage.LOG_CONTROL__LN_INST:
                return isSetLnInst();
            case SclPackage.LOG_CONTROL__LOG_ENA:
                return isSetLogEna();
            case SclPackage.LOG_CONTROL__LOG_NAME:
                return isSetLogName();
            case SclPackage.LOG_CONTROL__PREFIX:
                return isSetPrefix();
            case SclPackage.LOG_CONTROL__REASON_CODE:
                return isSetReasonCode();
            case SclPackage.LOG_CONTROL__ANY_LN:
                return getAnyLN() != null;
            case SclPackage.LOG_CONTROL__REFERS_TO_ANY_LN:
                return isSetRefersToAnyLN();
            case SclPackage.LOG_CONTROL__REFERS_TO_LOG:
                return isSetRefersToLog();
        }
        return super.eIsSet(featureID);
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
        result.append(" (bufTime: ");
        if (bufTimeESet) result.append(bufTime); else result.append("<unset>");
        result.append(", ldInst: ");
        if (ldInstESet) result.append(ldInst); else result.append("<unset>");
        result.append(", lnClass: ");
        if (lnClassESet) result.append(lnClass); else result.append("<unset>");
        result.append(", lnInst: ");
        if (lnInstESet) result.append(lnInst); else result.append("<unset>");
        result.append(", logEna: ");
        if (logEnaESet) result.append(logEna); else result.append("<unset>");
        result.append(", logName: ");
        if (logNameESet) result.append(logName); else result.append("<unset>");
        result.append(", prefix: ");
        if (prefixESet) result.append(prefix); else result.append("<unset>");
        result.append(", reasonCode: ");
        if (reasonCodeESet) result.append(reasonCode); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doResolveLinks() {
        // see Issue #13
        super.doResolveLinks();
        
        // name         the name of the log control block
        // desc         a description text
        // datSet       the name of the data set whose values shall be logged; datSet should only be missing within an ICD-File,
        //              or for an unused control block. The referenced data set must reside in the same LN as the control block.
        // intgPd       integrity scan period in milliseconds – see IEC 61850-7-2.
        // ldInst       The identification of the LD where the log resides; if missing, the same LD where this control block is placed.
        // prefix       Prefix of LN where the log resides; if missing, empty string
        // lnClass      Class of the LN where the log resides; if missing, LLN0
        // lnInst       Instance number of LN, where the log resides; missing for LLN0
        // logName      Relative name of the log within its hosting LN; name of the log element
        // logEna       TRUE enables immediate logging; FALSE prohibits logging until enabled online
        // reasonCode   If true, the reason code for the event trigger is also stored into the log – see IEC 61850-7-2
        
        if( getLogName() == null ) return;
        
        String messagePrefix = "while resolving link from LogControl on line " + getLineNumber() + ": ";
        IRiseClipseConsole console = AbstractRiseClipseConsole.getConsole();
        
        LDevice lDevice = getAnyLN().getLDevice();

        if( getLdInst() != null ) {
            List< LDevice > res1 = 
                    lDevice
                    .getServer()
                    .getAccessPoint()
                    .getIED()
                    .getAccessPoint()
                    .stream()
                    .map( ap -> ap.getServer() )
                    .filter( s -> s != null )
                    .map( s -> s.getLDevice() )
                    .filter( ld -> ld != null )
                    .flatMap( ld -> ld.stream() )
                    .filter( ld -> getLdInst().equals( ld.getInst() ))
                    .collect( Collectors.toList() );

            String mess1 = "LDevice( inst = " + getLdInst() + " ))";
            if( res1.isEmpty() ) {
                console.error( messagePrefix + "cannot find " + mess1 );
                return;
            }
            if( res1.size() > 1 ) {
                console.error( messagePrefix + "found several " + mess1 );
                return;
            }
            lDevice = res1.get( 0 );
            console.verbose( messagePrefix + "found " + mess1 + " on line " + lDevice.getLineNumber() );
        }

        String mess3 = "LN( lnClass = " + getLnClass() + ", inst = " + getLnInst() + " )";
        if(( getLnClass() == null ) || getLnClass().isEmpty() || ( "LLN0".equals( getLnClass() ))) {
            if( lDevice.getLN0() == null ) {
                console.error( messagePrefix + "cannot find LN0" );
                return;
            }
            setRefersToAnyLN( lDevice.getLN0() );
        }
        else {
            if( getLnInst() == null ) return;
            // find inside an LN with
            //   LN.lnClass == FCDA.lnClass
            //   LN.prefix == FCDA.prefix
            //   LN.inst == FCDA.lnInst
            List< LN > res3 = lDevice
                    .getLN()
                    .stream()
                    .filter( ln ->  getLnClass().equals( ln.getLnClass() ) && getLnInst().equals( ln.getInst() ) && getPrefix().equals( ln.getPrefix() ))
                    .collect( Collectors.toList() );

            if( res3.isEmpty() ) {
                console.error( messagePrefix + "cannot find " + mess3 );
                return;
            }
            if( res3.size() > 1 ) {
                console.error( messagePrefix + "found several " + mess3 );
                return;
            }
            setRefersToAnyLN( res3.get( 0 ) );
        }
        console.info( "LogControl on line " + getLineNumber() + " refers to " + mess3 + " on line " + getRefersToAnyLN().getLineNumber() );
        
    }

} //LogControlImpl
