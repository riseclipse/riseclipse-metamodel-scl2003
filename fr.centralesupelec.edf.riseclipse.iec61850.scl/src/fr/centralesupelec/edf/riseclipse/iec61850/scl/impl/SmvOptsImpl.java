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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smv Opts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmvOptsImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmvOptsImpl#getRefreshTime <em>Refresh Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmvOptsImpl#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmvOptsImpl#getSampleSynchronized <em>Sample Synchronized</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmvOptsImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmvOptsImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmvOptsImpl#getSynchSourceId <em>Synch Source Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmvOptsImpl#getDataRef <em>Data Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmvOptsImpl#getSampledValueControl <em>Sampled Value Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmvOptsImpl extends SclObjectImpl implements SmvOpts {
    /**
     * The default value of the '{@link #getDataSet() <em>Data Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSet()
     * @generated
     * @ordered
     */
    protected static final Boolean DATA_SET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSet()
     * @generated
     * @ordered
     */
    protected Boolean dataSet = DATA_SET_EDEFAULT;

    /**
     * This is true if the Data Set attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dataSetESet;

    /**
     * The default value of the '{@link #getRefreshTime() <em>Refresh Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefreshTime()
     * @generated
     * @ordered
     */
    protected static final Boolean REFRESH_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRefreshTime() <em>Refresh Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefreshTime()
     * @generated
     * @ordered
     */
    protected Boolean refreshTime = REFRESH_TIME_EDEFAULT;

    /**
     * This is true if the Refresh Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refreshTimeESet;

    /**
     * The default value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSampleRate()
     * @generated
     * @ordered
     */
    protected static final Boolean SAMPLE_RATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSampleRate()
     * @generated
     * @ordered
     */
    protected Boolean sampleRate = SAMPLE_RATE_EDEFAULT;

    /**
     * This is true if the Sample Rate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sampleRateESet;

    /**
     * The default value of the '{@link #getSampleSynchronized() <em>Sample Synchronized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSampleSynchronized()
     * @generated
     * @ordered
     */
    protected static final Boolean SAMPLE_SYNCHRONIZED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSampleSynchronized() <em>Sample Synchronized</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSampleSynchronized()
     * @generated
     * @ordered
     */
    protected Boolean sampleSynchronized = SAMPLE_SYNCHRONIZED_EDEFAULT;

    /**
     * This is true if the Sample Synchronized attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sampleSynchronizedESet;

    /**
     * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurity()
     * @generated
     * @ordered
     */
    protected static final Boolean SECURITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurity()
     * @generated
     * @ordered
     */
    protected Boolean security = SECURITY_EDEFAULT;

    /**
     * This is true if the Security attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean securityESet;

    /**
     * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimestamp()
     * @generated
     * @ordered
     */
    protected static final Boolean TIMESTAMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimestamp()
     * @generated
     * @ordered
     */
    protected Boolean timestamp = TIMESTAMP_EDEFAULT;

    /**
     * This is true if the Timestamp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timestampESet;

    /**
     * The default value of the '{@link #getSynchSourceId() <em>Synch Source Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchSourceId()
     * @generated
     * @ordered
     */
    protected static final Boolean SYNCH_SOURCE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSynchSourceId() <em>Synch Source Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchSourceId()
     * @generated
     * @ordered
     */
    protected Boolean synchSourceId = SYNCH_SOURCE_ID_EDEFAULT;

    /**
     * This is true if the Synch Source Id attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchSourceIdESet;

    /**
     * The default value of the '{@link #getDataRef() <em>Data Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataRef()
     * @generated
     * @ordered
     */
    protected static final Boolean DATA_REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataRef() <em>Data Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataRef()
     * @generated
     * @ordered
     */
    protected Boolean dataRef = DATA_REF_EDEFAULT;

    /**
     * This is true if the Data Ref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dataRefESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SmvOptsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSmvOpts();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDataSet() {
        return dataSet;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataSet( Boolean newDataSet ) {
        Boolean oldDataSet = dataSet;
        dataSet = newDataSet;
        boolean oldDataSetESet = dataSetESet;
        dataSetESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS__DATA_SET, oldDataSet, dataSet, !oldDataSetESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDataSet() {
        Boolean oldDataSet = dataSet;
        boolean oldDataSetESet = dataSetESet;
        dataSet = DATA_SET_EDEFAULT;
        dataSetESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS__DATA_SET, oldDataSet, DATA_SET_EDEFAULT, oldDataSetESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDataSet() {
        return dataSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRefreshTime() {
        return refreshTime;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefreshTime( Boolean newRefreshTime ) {
        Boolean oldRefreshTime = refreshTime;
        refreshTime = newRefreshTime;
        boolean oldRefreshTimeESet = refreshTimeESet;
        refreshTimeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS__REFRESH_TIME, oldRefreshTime, refreshTime, !oldRefreshTimeESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefreshTime() {
        Boolean oldRefreshTime = refreshTime;
        boolean oldRefreshTimeESet = refreshTimeESet;
        refreshTime = REFRESH_TIME_EDEFAULT;
        refreshTimeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS__REFRESH_TIME, oldRefreshTime, REFRESH_TIME_EDEFAULT, oldRefreshTimeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefreshTime() {
        return refreshTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSampleRate() {
        return sampleRate;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSampleRate( Boolean newSampleRate ) {
        Boolean oldSampleRate = sampleRate;
        sampleRate = newSampleRate;
        boolean oldSampleRateESet = sampleRateESet;
        sampleRateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS__SAMPLE_RATE, oldSampleRate, sampleRate, !oldSampleRateESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSampleRate() {
        Boolean oldSampleRate = sampleRate;
        boolean oldSampleRateESet = sampleRateESet;
        sampleRate = SAMPLE_RATE_EDEFAULT;
        sampleRateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS__SAMPLE_RATE, oldSampleRate, SAMPLE_RATE_EDEFAULT, oldSampleRateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSampleRate() {
        return sampleRateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSampleSynchronized() {
        return sampleSynchronized;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSampleSynchronized( Boolean newSampleSynchronized ) {
        Boolean oldSampleSynchronized = sampleSynchronized;
        sampleSynchronized = newSampleSynchronized;
        boolean oldSampleSynchronizedESet = sampleSynchronizedESet;
        sampleSynchronizedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS__SAMPLE_SYNCHRONIZED, oldSampleSynchronized, sampleSynchronized, !oldSampleSynchronizedESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSampleSynchronized() {
        Boolean oldSampleSynchronized = sampleSynchronized;
        boolean oldSampleSynchronizedESet = sampleSynchronizedESet;
        sampleSynchronized = SAMPLE_SYNCHRONIZED_EDEFAULT;
        sampleSynchronizedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS__SAMPLE_SYNCHRONIZED, oldSampleSynchronized, SAMPLE_SYNCHRONIZED_EDEFAULT, oldSampleSynchronizedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSampleSynchronized() {
        return sampleSynchronizedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSecurity() {
        return security;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSecurity( Boolean newSecurity ) {
        Boolean oldSecurity = security;
        security = newSecurity;
        boolean oldSecurityESet = securityESet;
        securityESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS__SECURITY, oldSecurity, security, !oldSecurityESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSecurity() {
        Boolean oldSecurity = security;
        boolean oldSecurityESet = securityESet;
        security = SECURITY_EDEFAULT;
        securityESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS__SECURITY, oldSecurity, SECURITY_EDEFAULT, oldSecurityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecurity() {
        return securityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getTimestamp() {
        return timestamp;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimestamp( Boolean newTimestamp ) {
        Boolean oldTimestamp = timestamp;
        timestamp = newTimestamp;
        boolean oldTimestampESet = timestampESet;
        timestampESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS__TIMESTAMP, oldTimestamp, timestamp, !oldTimestampESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimestamp() {
        Boolean oldTimestamp = timestamp;
        boolean oldTimestampESet = timestampESet;
        timestamp = TIMESTAMP_EDEFAULT;
        timestampESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS__TIMESTAMP, oldTimestamp, TIMESTAMP_EDEFAULT, oldTimestampESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimestamp() {
        return timestampESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SampledValueControl getSampledValueControl() {
        if (eContainerFeatureID() != SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL) return null;
        return (SampledValueControl)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSampledValueControl( SampledValueControl newSampledValueControl,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newSampledValueControl, SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSampledValueControl( SampledValueControl newSampledValueControl ) {
        if (newSampledValueControl != eInternalContainer() || (eContainerFeatureID() != SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL && newSampledValueControl != null)) {
            if (EcoreUtil.isAncestor(this, newSampledValueControl))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSampledValueControl != null)
                msgs = ((InternalEObject)newSampledValueControl).eInverseAdd(this, SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS, SampledValueControl.class, msgs);
            msgs = basicSetSampledValueControl(newSampledValueControl, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL, newSampledValueControl, newSampledValueControl));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSynchSourceId() {
        return synchSourceId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSynchSourceId(Boolean newSynchSourceId) {
        Boolean oldSynchSourceId = synchSourceId;
        synchSourceId = newSynchSourceId;
        boolean oldSynchSourceIdESet = synchSourceIdESet;
        synchSourceIdESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS__SYNCH_SOURCE_ID, oldSynchSourceId, synchSourceId, !oldSynchSourceIdESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSynchSourceId() {
        Boolean oldSynchSourceId = synchSourceId;
        boolean oldSynchSourceIdESet = synchSourceIdESet;
        synchSourceId = SYNCH_SOURCE_ID_EDEFAULT;
        synchSourceIdESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS__SYNCH_SOURCE_ID, oldSynchSourceId, SYNCH_SOURCE_ID_EDEFAULT, oldSynchSourceIdESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchSourceId() {
        return synchSourceIdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDataRef() {
        return dataRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataRef(Boolean newDataRef) {
        Boolean oldDataRef = dataRef;
        dataRef = newDataRef;
        boolean oldDataRefESet = dataRefESet;
        dataRefESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SMV_OPTS__DATA_REF, oldDataRef, dataRef, !oldDataRefESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDataRef() {
        Boolean oldDataRef = dataRef;
        boolean oldDataRefESet = dataRefESet;
        dataRef = DATA_REF_EDEFAULT;
        dataRefESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SMV_OPTS__DATA_REF, oldDataRef, DATA_REF_EDEFAULT, oldDataRefESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDataRef() {
        return dataRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSampledValueControl((SampledValueControl)otherEnd, msgs);
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
            case SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL:
                return basicSetSampledValueControl(null, msgs);
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
            case SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL:
                return eInternalContainer().eInverseRemove(this, SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS, SampledValueControl.class, msgs);
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
            case SclPackage.SMV_OPTS__DATA_SET:
                return getDataSet();
            case SclPackage.SMV_OPTS__REFRESH_TIME:
                return getRefreshTime();
            case SclPackage.SMV_OPTS__SAMPLE_RATE:
                return getSampleRate();
            case SclPackage.SMV_OPTS__SAMPLE_SYNCHRONIZED:
                return getSampleSynchronized();
            case SclPackage.SMV_OPTS__SECURITY:
                return getSecurity();
            case SclPackage.SMV_OPTS__TIMESTAMP:
                return getTimestamp();
            case SclPackage.SMV_OPTS__SYNCH_SOURCE_ID:
                return getSynchSourceId();
            case SclPackage.SMV_OPTS__DATA_REF:
                return getDataRef();
            case SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL:
                return getSampledValueControl();
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
            case SclPackage.SMV_OPTS__DATA_SET:
                setDataSet((Boolean)newValue);
                return;
            case SclPackage.SMV_OPTS__REFRESH_TIME:
                setRefreshTime((Boolean)newValue);
                return;
            case SclPackage.SMV_OPTS__SAMPLE_RATE:
                setSampleRate((Boolean)newValue);
                return;
            case SclPackage.SMV_OPTS__SAMPLE_SYNCHRONIZED:
                setSampleSynchronized((Boolean)newValue);
                return;
            case SclPackage.SMV_OPTS__SECURITY:
                setSecurity((Boolean)newValue);
                return;
            case SclPackage.SMV_OPTS__TIMESTAMP:
                setTimestamp((Boolean)newValue);
                return;
            case SclPackage.SMV_OPTS__SYNCH_SOURCE_ID:
                setSynchSourceId((Boolean)newValue);
                return;
            case SclPackage.SMV_OPTS__DATA_REF:
                setDataRef((Boolean)newValue);
                return;
            case SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL:
                setSampledValueControl((SampledValueControl)newValue);
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
            case SclPackage.SMV_OPTS__DATA_SET:
                unsetDataSet();
                return;
            case SclPackage.SMV_OPTS__REFRESH_TIME:
                unsetRefreshTime();
                return;
            case SclPackage.SMV_OPTS__SAMPLE_RATE:
                unsetSampleRate();
                return;
            case SclPackage.SMV_OPTS__SAMPLE_SYNCHRONIZED:
                unsetSampleSynchronized();
                return;
            case SclPackage.SMV_OPTS__SECURITY:
                unsetSecurity();
                return;
            case SclPackage.SMV_OPTS__TIMESTAMP:
                unsetTimestamp();
                return;
            case SclPackage.SMV_OPTS__SYNCH_SOURCE_ID:
                unsetSynchSourceId();
                return;
            case SclPackage.SMV_OPTS__DATA_REF:
                unsetDataRef();
                return;
            case SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL:
                setSampledValueControl((SampledValueControl)null);
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
            case SclPackage.SMV_OPTS__DATA_SET:
                return isSetDataSet();
            case SclPackage.SMV_OPTS__REFRESH_TIME:
                return isSetRefreshTime();
            case SclPackage.SMV_OPTS__SAMPLE_RATE:
                return isSetSampleRate();
            case SclPackage.SMV_OPTS__SAMPLE_SYNCHRONIZED:
                return isSetSampleSynchronized();
            case SclPackage.SMV_OPTS__SECURITY:
                return isSetSecurity();
            case SclPackage.SMV_OPTS__TIMESTAMP:
                return isSetTimestamp();
            case SclPackage.SMV_OPTS__SYNCH_SOURCE_ID:
                return isSetSynchSourceId();
            case SclPackage.SMV_OPTS__DATA_REF:
                return isSetDataRef();
            case SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL:
                return getSampledValueControl() != null;
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
        if (baseClass == AgSmvOpts.class) {
            switch (derivedFeatureID) {
                case SclPackage.SMV_OPTS__DATA_SET: return SclPackage.AG_SMV_OPTS__DATA_SET;
                case SclPackage.SMV_OPTS__REFRESH_TIME: return SclPackage.AG_SMV_OPTS__REFRESH_TIME;
                case SclPackage.SMV_OPTS__SAMPLE_RATE: return SclPackage.AG_SMV_OPTS__SAMPLE_RATE;
                case SclPackage.SMV_OPTS__SAMPLE_SYNCHRONIZED: return SclPackage.AG_SMV_OPTS__SAMPLE_SYNCHRONIZED;
                case SclPackage.SMV_OPTS__SECURITY: return SclPackage.AG_SMV_OPTS__SECURITY;
                case SclPackage.SMV_OPTS__TIMESTAMP: return SclPackage.AG_SMV_OPTS__TIMESTAMP;
                case SclPackage.SMV_OPTS__SYNCH_SOURCE_ID: return SclPackage.AG_SMV_OPTS__SYNCH_SOURCE_ID;
                case SclPackage.SMV_OPTS__DATA_REF: return SclPackage.AG_SMV_OPTS__DATA_REF;
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
        if (baseClass == AgSmvOpts.class) {
            switch (baseFeatureID) {
                case SclPackage.AG_SMV_OPTS__DATA_SET: return SclPackage.SMV_OPTS__DATA_SET;
                case SclPackage.AG_SMV_OPTS__REFRESH_TIME: return SclPackage.SMV_OPTS__REFRESH_TIME;
                case SclPackage.AG_SMV_OPTS__SAMPLE_RATE: return SclPackage.SMV_OPTS__SAMPLE_RATE;
                case SclPackage.AG_SMV_OPTS__SAMPLE_SYNCHRONIZED: return SclPackage.SMV_OPTS__SAMPLE_SYNCHRONIZED;
                case SclPackage.AG_SMV_OPTS__SECURITY: return SclPackage.SMV_OPTS__SECURITY;
                case SclPackage.AG_SMV_OPTS__TIMESTAMP: return SclPackage.SMV_OPTS__TIMESTAMP;
                case SclPackage.AG_SMV_OPTS__SYNCH_SOURCE_ID: return SclPackage.SMV_OPTS__SYNCH_SOURCE_ID;
                case SclPackage.AG_SMV_OPTS__DATA_REF: return SclPackage.SMV_OPTS__DATA_REF;
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
        result.append(" (dataSet: ");
        if (dataSetESet) result.append(dataSet); else result.append("<unset>");
        result.append(", refreshTime: ");
        if (refreshTimeESet) result.append(refreshTime); else result.append("<unset>");
        result.append(", sampleRate: ");
        if (sampleRateESet) result.append(sampleRate); else result.append("<unset>");
        result.append(", sampleSynchronized: ");
        if (sampleSynchronizedESet) result.append(sampleSynchronized); else result.append("<unset>");
        result.append(", security: ");
        if (securityESet) result.append(security); else result.append("<unset>");
        result.append(", timestamp: ");
        if (timestampESet) result.append(timestamp); else result.append("<unset>");
        result.append(", synchSourceId: ");
        if (synchSourceIdESet) result.append(synchSourceId); else result.append("<unset>");
        result.append(", dataRef: ");
        if (dataRefESet) result.append(dataRef); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SmvOptsImpl
