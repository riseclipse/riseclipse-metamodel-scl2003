/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportControlImpl#getBuffered <em>Buffered</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportControlImpl#getBufTime <em>Buf Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportControlImpl#getConfRev <em>Conf Rev</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportControlImpl#getIndexed <em>Indexed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportControlImpl#getRptID <em>Rpt ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportControlImpl#getAnyLN <em>Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportControlImpl#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportControlImpl#getRptEnabled <em>Rpt Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportControlImpl extends ControlWithTriggerOptImpl implements ReportControl {
    /**
     * The default value of the '{@link #getBuffered() <em>Buffered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBuffered()
     * @generated
     * @ordered
     */
    protected static final Boolean BUFFERED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBuffered() <em>Buffered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBuffered()
     * @generated
     * @ordered
     */
    protected Boolean buffered = BUFFERED_EDEFAULT;

    /**
     * This is true if the Buffered attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bufferedESet;

    /**
     * The default value of the '{@link #getBufTime() <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufTime()
     * @generated
     * @ordered
     */
    protected static final Integer BUF_TIME_EDEFAULT = null;

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
     * The default value of the '{@link #getConfRev() <em>Conf Rev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfRev()
     * @generated
     * @ordered
     */
    protected static final Integer CONF_REV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfRev() <em>Conf Rev</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfRev()
     * @generated
     * @ordered
     */
    protected Integer confRev = CONF_REV_EDEFAULT;

    /**
     * This is true if the Conf Rev attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean confRevESet;

    /**
     * The default value of the '{@link #getIndexed() <em>Indexed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndexed()
     * @generated
     * @ordered
     */
    protected static final Boolean INDEXED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIndexed() <em>Indexed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndexed()
     * @generated
     * @ordered
     */
    protected Boolean indexed = INDEXED_EDEFAULT;

    /**
     * This is true if the Indexed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean indexedESet;

    /**
     * The default value of the '{@link #getRptID() <em>Rpt ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRptID()
     * @generated
     * @ordered
     */
    protected static final String RPT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRptID() <em>Rpt ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRptID()
     * @generated
     * @ordered
     */
    protected String rptID = RPT_ID_EDEFAULT;

    /**
     * This is true if the Rpt ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rptIDESet;

    /**
     * The cached value of the '{@link #getOptFields() <em>Opt Fields</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptFields()
     * @generated
     * @ordered
     */
    protected OptFields optFields;

    /**
     * This is true if the Opt Fields containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean optFieldsESet;

    /**
     * The cached value of the '{@link #getRptEnabled() <em>Rpt Enabled</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRptEnabled()
     * @generated
     * @ordered
     */
    protected RptEnabled rptEnabled;

    /**
     * This is true if the Rpt Enabled containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rptEnabledESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReportControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getReportControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Boolean getBuffered() {
        if( isSetBuffered() ) {
            return buffered;
        }
        return Boolean.FALSE;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setBuffered( Boolean newBuffered ) {
        Boolean oldBuffered = buffered;
        buffered = newBuffered;
        boolean oldBufferedESet = bufferedESet;
        bufferedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_CONTROL__BUFFERED, oldBuffered, buffered, !oldBufferedESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBuffered() {
        Boolean oldBuffered = buffered;
        boolean oldBufferedESet = bufferedESet;
        buffered = BUFFERED_EDEFAULT;
        bufferedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_CONTROL__BUFFERED, oldBuffered, BUFFERED_EDEFAULT, oldBufferedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBuffered() {
        return bufferedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Integer getBufTime() {
        if( isSetBufTime() ) {
            return bufTime;
        }
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBufTime( Integer newBufTime ) {
        Integer oldBufTime = bufTime;
        bufTime = newBufTime;
        boolean oldBufTimeESet = bufTimeESet;
        bufTimeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_CONTROL__BUF_TIME, oldBufTime, bufTime, !oldBufTimeESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBufTime() {
        Integer oldBufTime = bufTime;
        boolean oldBufTimeESet = bufTimeESet;
        bufTime = BUF_TIME_EDEFAULT;
        bufTimeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_CONTROL__BUF_TIME, oldBufTime, BUF_TIME_EDEFAULT, oldBufTimeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBufTime() {
        return bufTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getConfRev() {
        return confRev;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfRev( Integer newConfRev ) {
        Integer oldConfRev = confRev;
        confRev = newConfRev;
        boolean oldConfRevESet = confRevESet;
        confRevESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_CONTROL__CONF_REV, oldConfRev, confRev, !oldConfRevESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConfRev() {
        Integer oldConfRev = confRev;
        boolean oldConfRevESet = confRevESet;
        confRev = CONF_REV_EDEFAULT;
        confRevESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_CONTROL__CONF_REV, oldConfRev, CONF_REV_EDEFAULT, oldConfRevESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConfRev() {
        return confRevESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Boolean getIndexed() {
        if( isSetIndexed() ) {
            return indexed;
        }
        return Boolean.TRUE;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setIndexed( Boolean newIndexed ) {
        Boolean oldIndexed = indexed;
        indexed = newIndexed;
        boolean oldIndexedESet = indexedESet;
        indexedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_CONTROL__INDEXED, oldIndexed, indexed, !oldIndexedESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIndexed() {
        Boolean oldIndexed = indexed;
        boolean oldIndexedESet = indexedESet;
        indexed = INDEXED_EDEFAULT;
        indexedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_CONTROL__INDEXED, oldIndexed, INDEXED_EDEFAULT, oldIndexedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIndexed() {
        return indexedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getRptID() {
        return rptID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRptID( String newRptID ) {
        String oldRptID = rptID;
        rptID = newRptID;
        boolean oldRptIDESet = rptIDESet;
        rptIDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_CONTROL__RPT_ID, oldRptID, rptID, !oldRptIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRptID() {
        String oldRptID = rptID;
        boolean oldRptIDESet = rptIDESet;
        rptID = RPT_ID_EDEFAULT;
        rptIDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_CONTROL__RPT_ID, oldRptID, RPT_ID_EDEFAULT, oldRptIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRptID() {
        return rptIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyLN getAnyLN() {
        if (eContainerFeatureID() != SclPackage.REPORT_CONTROL__ANY_LN) return null;
        return (AnyLN)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnyLN( AnyLN newAnyLN, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newAnyLN, SclPackage.REPORT_CONTROL__ANY_LN, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnyLN( AnyLN newAnyLN ) {
        if (newAnyLN != eInternalContainer() || (eContainerFeatureID() != SclPackage.REPORT_CONTROL__ANY_LN && newAnyLN != null)) {
            if (EcoreUtil.isAncestor(this, newAnyLN))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAnyLN != null)
                msgs = ((InternalEObject)newAnyLN).eInverseAdd(this, SclPackage.ANY_LN__REPORT_CONTROL, AnyLN.class, msgs);
            msgs = basicSetAnyLN(newAnyLN, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_CONTROL__ANY_LN, newAnyLN, newAnyLN));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OptFields getOptFields() {
        return optFields;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOptFields( OptFields newOptFields, NotificationChain msgs ) {
        OptFields oldOptFields = optFields;
        optFields = newOptFields;
        boolean oldOptFieldsESet = optFieldsESet;
        optFieldsESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_CONTROL__OPT_FIELDS, oldOptFields, newOptFields, !oldOptFieldsESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOptFields( OptFields newOptFields ) {
        if (newOptFields != optFields) {
            NotificationChain msgs = null;
            if (optFields != null)
                msgs = ((InternalEObject)optFields).eInverseRemove(this, SclPackage.OPT_FIELDS__REPORT_CONTROL, OptFields.class, msgs);
            if (newOptFields != null)
                msgs = ((InternalEObject)newOptFields).eInverseAdd(this, SclPackage.OPT_FIELDS__REPORT_CONTROL, OptFields.class, msgs);
            msgs = basicSetOptFields(newOptFields, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldOptFieldsESet = optFieldsESet;
            optFieldsESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_CONTROL__OPT_FIELDS, newOptFields, newOptFields, !oldOptFieldsESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOptFields( NotificationChain msgs ) {
        OptFields oldOptFields = optFields;
        optFields = null;
        boolean oldOptFieldsESet = optFieldsESet;
        optFieldsESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_CONTROL__OPT_FIELDS, oldOptFields, null, oldOptFieldsESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOptFields() {
        if (optFields != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)optFields).eInverseRemove(this, SclPackage.OPT_FIELDS__REPORT_CONTROL, OptFields.class, msgs);
            msgs = basicUnsetOptFields(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldOptFieldsESet = optFieldsESet;
            optFieldsESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_CONTROL__OPT_FIELDS, null, null, oldOptFieldsESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOptFields() {
        return optFieldsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RptEnabled getRptEnabled() {
        return rptEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRptEnabled( RptEnabled newRptEnabled, NotificationChain msgs ) {
        RptEnabled oldRptEnabled = rptEnabled;
        rptEnabled = newRptEnabled;
        boolean oldRptEnabledESet = rptEnabledESet;
        rptEnabledESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_CONTROL__RPT_ENABLED, oldRptEnabled, newRptEnabled, !oldRptEnabledESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRptEnabled( RptEnabled newRptEnabled ) {
        if (newRptEnabled != rptEnabled) {
            NotificationChain msgs = null;
            if (rptEnabled != null)
                msgs = ((InternalEObject)rptEnabled).eInverseRemove(this, SclPackage.RPT_ENABLED__REPORT_CONTROL, RptEnabled.class, msgs);
            if (newRptEnabled != null)
                msgs = ((InternalEObject)newRptEnabled).eInverseAdd(this, SclPackage.RPT_ENABLED__REPORT_CONTROL, RptEnabled.class, msgs);
            msgs = basicSetRptEnabled(newRptEnabled, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRptEnabledESet = rptEnabledESet;
            rptEnabledESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_CONTROL__RPT_ENABLED, newRptEnabled, newRptEnabled, !oldRptEnabledESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRptEnabled( NotificationChain msgs ) {
        RptEnabled oldRptEnabled = rptEnabled;
        rptEnabled = null;
        boolean oldRptEnabledESet = rptEnabledESet;
        rptEnabledESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_CONTROL__RPT_ENABLED, oldRptEnabled, null, oldRptEnabledESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRptEnabled() {
        if (rptEnabled != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)rptEnabled).eInverseRemove(this, SclPackage.RPT_ENABLED__REPORT_CONTROL, RptEnabled.class, msgs);
            msgs = basicUnsetRptEnabled(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRptEnabledESet = rptEnabledESet;
            rptEnabledESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_CONTROL__RPT_ENABLED, null, null, oldRptEnabledESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetRptEnabled() {
        return rptEnabledESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.REPORT_CONTROL__ANY_LN:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAnyLN((AnyLN)otherEnd, msgs);
            case SclPackage.REPORT_CONTROL__OPT_FIELDS:
                if (optFields != null)
                    msgs = ((InternalEObject)optFields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.REPORT_CONTROL__OPT_FIELDS, null, msgs);
                return basicSetOptFields((OptFields)otherEnd, msgs);
            case SclPackage.REPORT_CONTROL__RPT_ENABLED:
                if (rptEnabled != null)
                    msgs = ((InternalEObject)rptEnabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.REPORT_CONTROL__RPT_ENABLED, null, msgs);
                return basicSetRptEnabled((RptEnabled)otherEnd, msgs);
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
            case SclPackage.REPORT_CONTROL__ANY_LN:
                return basicSetAnyLN(null, msgs);
            case SclPackage.REPORT_CONTROL__OPT_FIELDS:
                return basicUnsetOptFields(msgs);
            case SclPackage.REPORT_CONTROL__RPT_ENABLED:
                return basicUnsetRptEnabled(msgs);
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
            case SclPackage.REPORT_CONTROL__ANY_LN:
                return eInternalContainer().eInverseRemove(this, SclPackage.ANY_LN__REPORT_CONTROL, AnyLN.class, msgs);
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
            case SclPackage.REPORT_CONTROL__BUFFERED:
                return getBuffered();
            case SclPackage.REPORT_CONTROL__BUF_TIME:
                return getBufTime();
            case SclPackage.REPORT_CONTROL__CONF_REV:
                return getConfRev();
            case SclPackage.REPORT_CONTROL__INDEXED:
                return getIndexed();
            case SclPackage.REPORT_CONTROL__RPT_ID:
                return getRptID();
            case SclPackage.REPORT_CONTROL__ANY_LN:
                return getAnyLN();
            case SclPackage.REPORT_CONTROL__OPT_FIELDS:
                return getOptFields();
            case SclPackage.REPORT_CONTROL__RPT_ENABLED:
                return getRptEnabled();
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
            case SclPackage.REPORT_CONTROL__BUFFERED:
                setBuffered((Boolean)newValue);
                return;
            case SclPackage.REPORT_CONTROL__BUF_TIME:
                setBufTime((Integer)newValue);
                return;
            case SclPackage.REPORT_CONTROL__CONF_REV:
                setConfRev((Integer)newValue);
                return;
            case SclPackage.REPORT_CONTROL__INDEXED:
                setIndexed((Boolean)newValue);
                return;
            case SclPackage.REPORT_CONTROL__RPT_ID:
                setRptID((String)newValue);
                return;
            case SclPackage.REPORT_CONTROL__ANY_LN:
                setAnyLN((AnyLN)newValue);
                return;
            case SclPackage.REPORT_CONTROL__OPT_FIELDS:
                setOptFields((OptFields)newValue);
                return;
            case SclPackage.REPORT_CONTROL__RPT_ENABLED:
                setRptEnabled((RptEnabled)newValue);
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
            case SclPackage.REPORT_CONTROL__BUFFERED:
                unsetBuffered();
                return;
            case SclPackage.REPORT_CONTROL__BUF_TIME:
                unsetBufTime();
                return;
            case SclPackage.REPORT_CONTROL__CONF_REV:
                unsetConfRev();
                return;
            case SclPackage.REPORT_CONTROL__INDEXED:
                unsetIndexed();
                return;
            case SclPackage.REPORT_CONTROL__RPT_ID:
                unsetRptID();
                return;
            case SclPackage.REPORT_CONTROL__ANY_LN:
                setAnyLN((AnyLN)null);
                return;
            case SclPackage.REPORT_CONTROL__OPT_FIELDS:
                unsetOptFields();
                return;
            case SclPackage.REPORT_CONTROL__RPT_ENABLED:
                unsetRptEnabled();
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
            case SclPackage.REPORT_CONTROL__BUFFERED:
                return isSetBuffered();
            case SclPackage.REPORT_CONTROL__BUF_TIME:
                return isSetBufTime();
            case SclPackage.REPORT_CONTROL__CONF_REV:
                return isSetConfRev();
            case SclPackage.REPORT_CONTROL__INDEXED:
                return isSetIndexed();
            case SclPackage.REPORT_CONTROL__RPT_ID:
                return isSetRptID();
            case SclPackage.REPORT_CONTROL__ANY_LN:
                return getAnyLN() != null;
            case SclPackage.REPORT_CONTROL__OPT_FIELDS:
                return isSetOptFields();
            case SclPackage.REPORT_CONTROL__RPT_ENABLED:
                return isSetRptEnabled();
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (buffered: ");
        if (bufferedESet) result.append(buffered); else result.append("<unset>");
        result.append(", bufTime: ");
        if (bufTimeESet) result.append(bufTime); else result.append("<unset>");
        result.append(", confRev: ");
        if (confRevESet) result.append(confRev); else result.append("<unset>");
        result.append(", indexed: ");
        if (indexedESet) result.append(indexed); else result.append("<unset>");
        result.append(", rptID: ");
        if (rptIDESet) result.append(rptID); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ReportControlImpl
