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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportSettingsImpl#getBufTime <em>Buf Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportSettingsImpl#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportSettingsImpl#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportSettingsImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportSettingsImpl#getResvTms <em>Resv Tms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportSettingsImpl#getRptID <em>Rpt ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportSettingsImpl#getTrgOps <em>Trg Ops</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportSettingsImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportSettingsImpl extends ServiceSettingsImpl implements ReportSettings {
    /**
     * The default value of the '{@link #getBufTime() <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufTime()
     * @generated NOT
     * @ordered
     */
    protected static final ServiceSettingsEnum BUF_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBufTime() <em>Buf Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBufTime()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum bufTime = BUF_TIME_EDEFAULT;

    /**
     * This is true if the Buf Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bufTimeESet;

    /**
     * The default value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntgPd()
     * @generated NOT
     * @ordered
     */
    protected static final ServiceSettingsEnum INTG_PD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntgPd()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum intgPd = INTG_PD_EDEFAULT;

    /**
     * This is true if the Intg Pd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean intgPdESet;

    /**
     * The default value of the '{@link #getOptFields() <em>Opt Fields</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptFields()
     * @generated NOT
     * @ordered
     */
    protected static final ServiceSettingsEnum OPT_FIELDS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOptFields() <em>Opt Fields</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptFields()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum optFields = OPT_FIELDS_EDEFAULT;

    /**
     * This is true if the Opt Fields attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean optFieldsESet;

    /**
     * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected static final Boolean OWNER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected Boolean owner = OWNER_EDEFAULT;

    /**
     * This is true if the Owner attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ownerESet;

    /**
     * The default value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResvTms()
     * @generated
     * @ordered
     */
    protected static final Boolean RESV_TMS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResvTms()
     * @generated
     * @ordered
     */
    protected Boolean resvTms = RESV_TMS_EDEFAULT;

    /**
     * This is true if the Resv Tms attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean resvTmsESet;

    /**
     * The default value of the '{@link #getRptID() <em>Rpt ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRptID()
     * @generated NOT
     * @ordered
     */
    protected static final ServiceSettingsEnum RPT_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRptID() <em>Rpt ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRptID()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum rptID = RPT_ID_EDEFAULT;

    /**
     * This is true if the Rpt ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rptIDESet;

    /**
     * The default value of the '{@link #getTrgOps() <em>Trg Ops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrgOps()
     * @generated NOT
     * @ordered
     */
    protected static final ServiceSettingsEnum TRG_OPS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTrgOps() <em>Trg Ops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrgOps()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum trgOps = TRG_OPS_EDEFAULT;

    /**
     * This is true if the Trg Ops attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trgOpsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReportSettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getReportSettings();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSettingsEnum getBufTime() {
        return bufTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBufTime( ServiceSettingsEnum newBufTime ) {
        ServiceSettingsEnum oldBufTime = bufTime;
        bufTime = newBufTime == null ? BUF_TIME_EDEFAULT : newBufTime;
        boolean oldBufTimeESet = bufTimeESet;
        bufTimeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_SETTINGS__BUF_TIME, oldBufTime, bufTime, !oldBufTimeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBufTime() {
        ServiceSettingsEnum oldBufTime = bufTime;
        boolean oldBufTimeESet = bufTimeESet;
        bufTime = BUF_TIME_EDEFAULT;
        bufTimeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_SETTINGS__BUF_TIME, oldBufTime, BUF_TIME_EDEFAULT, oldBufTimeESet));
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
    public ServiceSettingsEnum getIntgPd() {
        return intgPd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIntgPd( ServiceSettingsEnum newIntgPd ) {
        ServiceSettingsEnum oldIntgPd = intgPd;
        intgPd = newIntgPd == null ? INTG_PD_EDEFAULT : newIntgPd;
        boolean oldIntgPdESet = intgPdESet;
        intgPdESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_SETTINGS__INTG_PD, oldIntgPd, intgPd, !oldIntgPdESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIntgPd() {
        ServiceSettingsEnum oldIntgPd = intgPd;
        boolean oldIntgPdESet = intgPdESet;
        intgPd = INTG_PD_EDEFAULT;
        intgPdESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_SETTINGS__INTG_PD, oldIntgPd, INTG_PD_EDEFAULT, oldIntgPdESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIntgPd() {
        return intgPdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSettingsEnum getOptFields() {
        return optFields;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOptFields( ServiceSettingsEnum newOptFields ) {
        ServiceSettingsEnum oldOptFields = optFields;
        optFields = newOptFields == null ? OPT_FIELDS_EDEFAULT : newOptFields;
        boolean oldOptFieldsESet = optFieldsESet;
        optFieldsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_SETTINGS__OPT_FIELDS, oldOptFields, optFields, !oldOptFieldsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOptFields() {
        ServiceSettingsEnum oldOptFields = optFields;
        boolean oldOptFieldsESet = optFieldsESet;
        optFields = OPT_FIELDS_EDEFAULT;
        optFieldsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_SETTINGS__OPT_FIELDS, oldOptFields, OPT_FIELDS_EDEFAULT, oldOptFieldsESet));
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
    public Boolean getOwner() {
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner( Boolean newOwner ) {
        Boolean oldOwner = owner;
        owner = newOwner;
        boolean oldOwnerESet = ownerESet;
        ownerESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_SETTINGS__OWNER, oldOwner, owner, !oldOwnerESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOwner() {
        Boolean oldOwner = owner;
        boolean oldOwnerESet = ownerESet;
        owner = OWNER_EDEFAULT;
        ownerESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_SETTINGS__OWNER, oldOwner, OWNER_EDEFAULT, oldOwnerESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOwner() {
        return ownerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getResvTms() {
        return resvTms;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setResvTms( Boolean newResvTms ) {
        Boolean oldResvTms = resvTms;
        resvTms = newResvTms;
        boolean oldResvTmsESet = resvTmsESet;
        resvTmsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_SETTINGS__RESV_TMS, oldResvTms, resvTms, !oldResvTmsESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetResvTms() {
        Boolean oldResvTms = resvTms;
        boolean oldResvTmsESet = resvTmsESet;
        resvTms = RESV_TMS_EDEFAULT;
        resvTmsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_SETTINGS__RESV_TMS, oldResvTms, RESV_TMS_EDEFAULT, oldResvTmsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetResvTms() {
        return resvTmsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSettingsEnum getRptID() {
        return rptID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRptID( ServiceSettingsEnum newRptID ) {
        ServiceSettingsEnum oldRptID = rptID;
        rptID = newRptID == null ? RPT_ID_EDEFAULT : newRptID;
        boolean oldRptIDESet = rptIDESet;
        rptIDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_SETTINGS__RPT_ID, oldRptID, rptID, !oldRptIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetRptID() {
        ServiceSettingsEnum oldRptID = rptID;
        boolean oldRptIDESet = rptIDESet;
        rptID = RPT_ID_EDEFAULT;
        rptIDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_SETTINGS__RPT_ID, oldRptID, RPT_ID_EDEFAULT, oldRptIDESet));
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
    public ServiceSettingsEnum getTrgOps() {
        return trgOps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrgOps( ServiceSettingsEnum newTrgOps ) {
        ServiceSettingsEnum oldTrgOps = trgOps;
        trgOps = newTrgOps == null ? TRG_OPS_EDEFAULT : newTrgOps;
        boolean oldTrgOpsESet = trgOpsESet;
        trgOpsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_SETTINGS__TRG_OPS, oldTrgOps, trgOps, !oldTrgOpsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTrgOps() {
        ServiceSettingsEnum oldTrgOps = trgOps;
        boolean oldTrgOpsESet = trgOpsESet;
        trgOps = TRG_OPS_EDEFAULT;
        trgOpsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.REPORT_SETTINGS__TRG_OPS, oldTrgOps, TRG_OPS_EDEFAULT, oldTrgOpsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTrgOps() {
        return trgOpsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Services getServices() {
        if (eContainerFeatureID() != SclPackage.REPORT_SETTINGS__SERVICES) return null;
        return (Services)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServices( Services newServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newServices, SclPackage.REPORT_SETTINGS__SERVICES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServices( Services newServices ) {
        if (newServices != eInternalContainer() || (eContainerFeatureID() != SclPackage.REPORT_SETTINGS__SERVICES && newServices != null)) {
            if (EcoreUtil.isAncestor(this, newServices))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newServices != null)
                msgs = ((InternalEObject)newServices).eInverseAdd(this, SclPackage.SERVICES__REPORT_SETTINGS, Services.class, msgs);
            msgs = basicSetServices(newServices, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.REPORT_SETTINGS__SERVICES, newServices, newServices));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.REPORT_SETTINGS__SERVICES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetServices((Services)otherEnd, msgs);
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
            case SclPackage.REPORT_SETTINGS__SERVICES:
                return basicSetServices(null, msgs);
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
            case SclPackage.REPORT_SETTINGS__SERVICES:
                return eInternalContainer().eInverseRemove(this, SclPackage.SERVICES__REPORT_SETTINGS, Services.class, msgs);
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
            case SclPackage.REPORT_SETTINGS__BUF_TIME:
                return getBufTime();
            case SclPackage.REPORT_SETTINGS__INTG_PD:
                return getIntgPd();
            case SclPackage.REPORT_SETTINGS__OPT_FIELDS:
                return getOptFields();
            case SclPackage.REPORT_SETTINGS__OWNER:
                return getOwner();
            case SclPackage.REPORT_SETTINGS__RESV_TMS:
                return getResvTms();
            case SclPackage.REPORT_SETTINGS__RPT_ID:
                return getRptID();
            case SclPackage.REPORT_SETTINGS__TRG_OPS:
                return getTrgOps();
            case SclPackage.REPORT_SETTINGS__SERVICES:
                return getServices();
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
            case SclPackage.REPORT_SETTINGS__BUF_TIME:
                setBufTime((ServiceSettingsEnum)newValue);
                return;
            case SclPackage.REPORT_SETTINGS__INTG_PD:
                setIntgPd((ServiceSettingsEnum)newValue);
                return;
            case SclPackage.REPORT_SETTINGS__OPT_FIELDS:
                setOptFields((ServiceSettingsEnum)newValue);
                return;
            case SclPackage.REPORT_SETTINGS__OWNER:
                setOwner((Boolean)newValue);
                return;
            case SclPackage.REPORT_SETTINGS__RESV_TMS:
                setResvTms((Boolean)newValue);
                return;
            case SclPackage.REPORT_SETTINGS__RPT_ID:
                setRptID((ServiceSettingsEnum)newValue);
                return;
            case SclPackage.REPORT_SETTINGS__TRG_OPS:
                setTrgOps((ServiceSettingsEnum)newValue);
                return;
            case SclPackage.REPORT_SETTINGS__SERVICES:
                setServices((Services)newValue);
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
            case SclPackage.REPORT_SETTINGS__BUF_TIME:
                unsetBufTime();
                return;
            case SclPackage.REPORT_SETTINGS__INTG_PD:
                unsetIntgPd();
                return;
            case SclPackage.REPORT_SETTINGS__OPT_FIELDS:
                unsetOptFields();
                return;
            case SclPackage.REPORT_SETTINGS__OWNER:
                unsetOwner();
                return;
            case SclPackage.REPORT_SETTINGS__RESV_TMS:
                unsetResvTms();
                return;
            case SclPackage.REPORT_SETTINGS__RPT_ID:
                unsetRptID();
                return;
            case SclPackage.REPORT_SETTINGS__TRG_OPS:
                unsetTrgOps();
                return;
            case SclPackage.REPORT_SETTINGS__SERVICES:
                setServices((Services)null);
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
            case SclPackage.REPORT_SETTINGS__BUF_TIME:
                return isSetBufTime();
            case SclPackage.REPORT_SETTINGS__INTG_PD:
                return isSetIntgPd();
            case SclPackage.REPORT_SETTINGS__OPT_FIELDS:
                return isSetOptFields();
            case SclPackage.REPORT_SETTINGS__OWNER:
                return isSetOwner();
            case SclPackage.REPORT_SETTINGS__RESV_TMS:
                return isSetResvTms();
            case SclPackage.REPORT_SETTINGS__RPT_ID:
                return isSetRptID();
            case SclPackage.REPORT_SETTINGS__TRG_OPS:
                return isSetTrgOps();
            case SclPackage.REPORT_SETTINGS__SERVICES:
                return getServices() != null;
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
        result.append(", intgPd: ");
        if (intgPdESet) result.append(intgPd); else result.append("<unset>");
        result.append(", optFields: ");
        if (optFieldsESet) result.append(optFields); else result.append("<unset>");
        result.append(", owner: ");
        if (ownerESet) result.append(owner); else result.append("<unset>");
        result.append(", resvTms: ");
        if (resvTmsESet) result.append(resvTms); else result.append("<unset>");
        result.append(", rptID: ");
        if (rptIDESet) result.append(rptID); else result.append("<unset>");
        result.append(", trgOps: ");
        if (trgOpsESet) result.append(trgOps); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ReportSettingsImpl
