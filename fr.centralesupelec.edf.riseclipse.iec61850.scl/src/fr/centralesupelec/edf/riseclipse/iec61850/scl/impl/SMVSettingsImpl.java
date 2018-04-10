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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMV Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getSvID <em>Sv ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getOptFields <em>Opt Fields</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getSmpRateAttribute <em>Smp Rate Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#isSamplesPerSecAttribute <em>Samples Per Sec Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#isPdcTimeStamp <em>Pdc Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getSamplesPerSec <em>Samples Per Sec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl#getSecPerSamples <em>Sec Per Samples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMVSettingsImpl extends ServiceSettingsImpl implements SMVSettings {
    /**
     * The default value of the '{@link #getSvID() <em>Sv ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvID()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsEnum SV_ID_EDEFAULT = ServiceSettingsEnum.DYN;
    /**
     * The cached value of the '{@link #getSvID() <em>Sv ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvID()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum svID = SV_ID_EDEFAULT;
    /**
     * This is true if the Sv ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svIDESet;
    /**
     * The default value of the '{@link #getOptFields() <em>Opt Fields</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptFields()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsEnum OPT_FIELDS_EDEFAULT = ServiceSettingsEnum.DYN;
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
     * The default value of the '{@link #getSmpRateAttribute() <em>Smp Rate Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpRateAttribute()
     * @generated
     * @ordered
     */
    protected static final ServiceSettingsEnum SMP_RATE_ATTRIBUTE_EDEFAULT = ServiceSettingsEnum.DYN;
    /**
     * The cached value of the '{@link #getSmpRateAttribute() <em>Smp Rate Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpRateAttribute()
     * @generated
     * @ordered
     */
    protected ServiceSettingsEnum smpRateAttribute = SMP_RATE_ATTRIBUTE_EDEFAULT;
    /**
     * This is true if the Smp Rate Attribute attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean smpRateAttributeESet;
    /**
     * The default value of the '{@link #isSamplesPerSecAttribute() <em>Samples Per Sec Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSamplesPerSecAttribute()
     * @generated
     * @ordered
     */
    protected static final boolean SAMPLES_PER_SEC_ATTRIBUTE_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isSamplesPerSecAttribute() <em>Samples Per Sec Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSamplesPerSecAttribute()
     * @generated
     * @ordered
     */
    protected boolean samplesPerSecAttribute = SAMPLES_PER_SEC_ATTRIBUTE_EDEFAULT;
    /**
     * This is true if the Samples Per Sec Attribute attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean samplesPerSecAttributeESet;
    /**
     * The default value of the '{@link #isPdcTimeStamp() <em>Pdc Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPdcTimeStamp()
     * @generated
     * @ordered
     */
    protected static final boolean PDC_TIME_STAMP_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isPdcTimeStamp() <em>Pdc Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isPdcTimeStamp()
     * @generated
     * @ordered
     */
    protected boolean pdcTimeStamp = PDC_TIME_STAMP_EDEFAULT;
    /**
     * This is true if the Pdc Time Stamp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pdcTimeStampESet;
    /**
     * The cached value of the '{@link #getSmpRate() <em>Smp Rate</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpRate()
     * @generated
     * @ordered
     */
    protected EList<SmpRate> smpRate;
    /**
     * The cached value of the '{@link #getSamplesPerSec() <em>Samples Per Sec</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSamplesPerSec()
     * @generated
     * @ordered
     */
    protected EList<SamplesPerSec> samplesPerSec;
    /**
     * The cached value of the '{@link #getSecPerSamples() <em>Sec Per Samples</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecPerSamples()
     * @generated
     * @ordered
     */
    protected EList<SecPerSamples> secPerSamples;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SMVSettingsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSMVSettings();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ServiceSettingsEnum getSvID() {
        if( isSetSvID() ) {
            return svID;
        }
        return ServiceSettingsEnum.FIX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSvID(ServiceSettingsEnum newSvID) {
        ServiceSettingsEnum oldSvID = svID;
        svID = newSvID == null ? SV_ID_EDEFAULT : newSvID;
        boolean oldSvIDESet = svIDESet;
        svIDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_SETTINGS__SV_ID, oldSvID, svID, !oldSvIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSvID() {
        ServiceSettingsEnum oldSvID = svID;
        boolean oldSvIDESet = svIDESet;
        svID = SV_ID_EDEFAULT;
        svIDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_SETTINGS__SV_ID, oldSvID, SV_ID_EDEFAULT, oldSvIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSvID() {
        return svIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public ServiceSettingsEnum getOptFields() {
        if( isSetOptFields() ) {
            return optFields;
        }
        return ServiceSettingsEnum.FIX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOptFields(ServiceSettingsEnum newOptFields) {
        ServiceSettingsEnum oldOptFields = optFields;
        optFields = newOptFields == null ? OPT_FIELDS_EDEFAULT : newOptFields;
        boolean oldOptFieldsESet = optFieldsESet;
        optFieldsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_SETTINGS__OPT_FIELDS, oldOptFields, optFields, !oldOptFieldsESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_SETTINGS__OPT_FIELDS, oldOptFields, OPT_FIELDS_EDEFAULT, oldOptFieldsESet));
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
     * @generated NOT
     */
    public ServiceSettingsEnum getSmpRateAttribute() {
        if( isSetSmpRateAttribute() ) {
            return smpRateAttribute;
        }
        return ServiceSettingsEnum.FIX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSmpRateAttribute(ServiceSettingsEnum newSmpRateAttribute) {
        ServiceSettingsEnum oldSmpRateAttribute = smpRateAttribute;
        smpRateAttribute = newSmpRateAttribute == null ? SMP_RATE_ATTRIBUTE_EDEFAULT : newSmpRateAttribute;
        boolean oldSmpRateAttributeESet = smpRateAttributeESet;
        smpRateAttributeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE, oldSmpRateAttribute, smpRateAttribute, !oldSmpRateAttributeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSmpRateAttribute() {
        ServiceSettingsEnum oldSmpRateAttribute = smpRateAttribute;
        boolean oldSmpRateAttributeESet = smpRateAttributeESet;
        smpRateAttribute = SMP_RATE_ATTRIBUTE_EDEFAULT;
        smpRateAttributeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE, oldSmpRateAttribute, SMP_RATE_ATTRIBUTE_EDEFAULT, oldSmpRateAttributeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSmpRateAttribute() {
        return smpRateAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isSamplesPerSecAttribute() {
        if( isSetSamplesPerSecAttribute() ) {
            return samplesPerSecAttribute;
        }
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSamplesPerSecAttribute(boolean newSamplesPerSecAttribute) {
        boolean oldSamplesPerSecAttribute = samplesPerSecAttribute;
        samplesPerSecAttribute = newSamplesPerSecAttribute;
        boolean oldSamplesPerSecAttributeESet = samplesPerSecAttributeESet;
        samplesPerSecAttributeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE, oldSamplesPerSecAttribute, samplesPerSecAttribute, !oldSamplesPerSecAttributeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSamplesPerSecAttribute() {
        boolean oldSamplesPerSecAttribute = samplesPerSecAttribute;
        boolean oldSamplesPerSecAttributeESet = samplesPerSecAttributeESet;
        samplesPerSecAttribute = SAMPLES_PER_SEC_ATTRIBUTE_EDEFAULT;
        samplesPerSecAttributeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE, oldSamplesPerSecAttribute, SAMPLES_PER_SEC_ATTRIBUTE_EDEFAULT, oldSamplesPerSecAttributeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSamplesPerSecAttribute() {
        return samplesPerSecAttributeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isPdcTimeStamp() {
        if( isSetPdcTimeStamp() ) {
            return pdcTimeStamp;
        }
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPdcTimeStamp(boolean newPdcTimeStamp) {
        boolean oldPdcTimeStamp = pdcTimeStamp;
        pdcTimeStamp = newPdcTimeStamp;
        boolean oldPdcTimeStampESet = pdcTimeStampESet;
        pdcTimeStampESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_SETTINGS__PDC_TIME_STAMP, oldPdcTimeStamp, pdcTimeStamp, !oldPdcTimeStampESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPdcTimeStamp() {
        boolean oldPdcTimeStamp = pdcTimeStamp;
        boolean oldPdcTimeStampESet = pdcTimeStampESet;
        pdcTimeStamp = PDC_TIME_STAMP_EDEFAULT;
        pdcTimeStampESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_SETTINGS__PDC_TIME_STAMP, oldPdcTimeStamp, PDC_TIME_STAMP_EDEFAULT, oldPdcTimeStampESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPdcTimeStamp() {
        return pdcTimeStampESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SmpRate> getSmpRate() {
        if (smpRate == null) {
            smpRate = new EObjectContainmentEList.Unsettable<SmpRate>(SmpRate.class, this, SclPackage.SMV_SETTINGS__SMP_RATE);
        }
        return smpRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSmpRate() {
        if (smpRate != null) ((InternalEList.Unsettable<?>)smpRate).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSmpRate() {
        return smpRate != null && ((InternalEList.Unsettable<?>)smpRate).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SamplesPerSec> getSamplesPerSec() {
        if (samplesPerSec == null) {
            samplesPerSec = new EObjectContainmentEList.Unsettable<SamplesPerSec>(SamplesPerSec.class, this, SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC);
        }
        return samplesPerSec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSamplesPerSec() {
        if (samplesPerSec != null) ((InternalEList.Unsettable<?>)samplesPerSec).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSamplesPerSec() {
        return samplesPerSec != null && ((InternalEList.Unsettable<?>)samplesPerSec).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SecPerSamples> getSecPerSamples() {
        if (secPerSamples == null) {
            secPerSamples = new EObjectContainmentEList.Unsettable<SecPerSamples>(SecPerSamples.class, this, SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES);
        }
        return secPerSamples;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSecPerSamples() {
        if (secPerSamples != null) ((InternalEList.Unsettable<?>)secPerSamples).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSecPerSamples() {
        return secPerSamples != null && ((InternalEList.Unsettable<?>)secPerSamples).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SclPackage.SMV_SETTINGS__SMP_RATE:
                return ((InternalEList<?>)getSmpRate()).basicRemove(otherEnd, msgs);
            case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
                return ((InternalEList<?>)getSamplesPerSec()).basicRemove(otherEnd, msgs);
            case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
                return ((InternalEList<?>)getSecPerSamples()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SclPackage.SMV_SETTINGS__SV_ID:
                return getSvID();
            case SclPackage.SMV_SETTINGS__OPT_FIELDS:
                return getOptFields();
            case SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE:
                return getSmpRateAttribute();
            case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE:
                return isSamplesPerSecAttribute();
            case SclPackage.SMV_SETTINGS__PDC_TIME_STAMP:
                return isPdcTimeStamp();
            case SclPackage.SMV_SETTINGS__SMP_RATE:
                return getSmpRate();
            case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
                return getSamplesPerSec();
            case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
                return getSecPerSamples();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SclPackage.SMV_SETTINGS__SV_ID:
                setSvID((ServiceSettingsEnum)newValue);
                return;
            case SclPackage.SMV_SETTINGS__OPT_FIELDS:
                setOptFields((ServiceSettingsEnum)newValue);
                return;
            case SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE:
                setSmpRateAttribute((ServiceSettingsEnum)newValue);
                return;
            case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE:
                setSamplesPerSecAttribute((Boolean)newValue);
                return;
            case SclPackage.SMV_SETTINGS__PDC_TIME_STAMP:
                setPdcTimeStamp((Boolean)newValue);
                return;
            case SclPackage.SMV_SETTINGS__SMP_RATE:
                getSmpRate().clear();
                getSmpRate().addAll((Collection<? extends SmpRate>)newValue);
                return;
            case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
                getSamplesPerSec().clear();
                getSamplesPerSec().addAll((Collection<? extends SamplesPerSec>)newValue);
                return;
            case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
                getSecPerSamples().clear();
                getSecPerSamples().addAll((Collection<? extends SecPerSamples>)newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
            case SclPackage.SMV_SETTINGS__SV_ID:
                unsetSvID();
                return;
            case SclPackage.SMV_SETTINGS__OPT_FIELDS:
                unsetOptFields();
                return;
            case SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE:
                unsetSmpRateAttribute();
                return;
            case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE:
                unsetSamplesPerSecAttribute();
                return;
            case SclPackage.SMV_SETTINGS__PDC_TIME_STAMP:
                unsetPdcTimeStamp();
                return;
            case SclPackage.SMV_SETTINGS__SMP_RATE:
                unsetSmpRate();
                return;
            case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
                unsetSamplesPerSec();
                return;
            case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
                unsetSecPerSamples();
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SclPackage.SMV_SETTINGS__SV_ID:
                return isSetSvID();
            case SclPackage.SMV_SETTINGS__OPT_FIELDS:
                return isSetOptFields();
            case SclPackage.SMV_SETTINGS__SMP_RATE_ATTRIBUTE:
                return isSetSmpRateAttribute();
            case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE:
                return isSetSamplesPerSecAttribute();
            case SclPackage.SMV_SETTINGS__PDC_TIME_STAMP:
                return isSetPdcTimeStamp();
            case SclPackage.SMV_SETTINGS__SMP_RATE:
                return isSetSmpRate();
            case SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC:
                return isSetSamplesPerSec();
            case SclPackage.SMV_SETTINGS__SEC_PER_SAMPLES:
                return isSetSecPerSamples();
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
        result.append(" (svID: ");
        if (svIDESet) result.append(svID); else result.append("<unset>");
        result.append(", optFields: ");
        if (optFieldsESet) result.append(optFields); else result.append("<unset>");
        result.append(", smpRateAttribute: ");
        if (smpRateAttributeESet) result.append(smpRateAttribute); else result.append("<unset>");
        result.append(", samplesPerSecAttribute: ");
        if (samplesPerSecAttributeESet) result.append(samplesPerSecAttribute); else result.append("<unset>");
        result.append(", pdcTimeStamp: ");
        if (pdcTimeStampESet) result.append(pdcTimeStamp); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SMVSettingsImpl
