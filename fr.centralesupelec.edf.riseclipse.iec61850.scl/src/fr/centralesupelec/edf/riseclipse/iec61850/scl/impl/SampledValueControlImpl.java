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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sampled Value Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SampledValueControlImpl#getMulticast <em>Multicast</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SampledValueControlImpl#getNofASDU <em>Nof ASDU</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SampledValueControlImpl#getSecurityEnable <em>Security Enable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SampledValueControlImpl#getSmpMod <em>Smp Mod</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SampledValueControlImpl#getSmpRate <em>Smp Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SampledValueControlImpl#getSmvID <em>Smv ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SampledValueControlImpl#getLN0 <em>LN0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SampledValueControlImpl#getSmvOpts <em>Smv Opts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SampledValueControlImpl extends ControlWithIEDNameImpl implements SampledValueControl {
    /**
     * The default value of the '{@link #getMulticast() <em>Multicast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMulticast()
     * @generated
     * @ordered
     */
    protected static final Boolean MULTICAST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMulticast() <em>Multicast</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMulticast()
     * @generated
     * @ordered
     */
    protected Boolean multicast = MULTICAST_EDEFAULT;

    /**
     * This is true if the Multicast attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean multicastESet;

    /**
     * The default value of the '{@link #getNofASDU() <em>Nof ASDU</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNofASDU()
     * @generated
     * @ordered
     */
    protected static final Integer NOF_ASDU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNofASDU() <em>Nof ASDU</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNofASDU()
     * @generated
     * @ordered
     */
    protected Integer nofASDU = NOF_ASDU_EDEFAULT;

    /**
     * This is true if the Nof ASDU attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nofASDUESet;

    /**
     * The default value of the '{@link #getSecurityEnable() <em>Security Enable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityEnable()
     * @generated NOT
     * @ordered
     */
    protected static final PredefinedTypeOfSecurityEnum SECURITY_ENABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSecurityEnable() <em>Security Enable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityEnable()
     * @generated
     * @ordered
     */
    protected PredefinedTypeOfSecurityEnum securityEnable = SECURITY_ENABLE_EDEFAULT;

    /**
     * This is true if the Security Enable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean securityEnableESet;

    /**
     * The default value of the '{@link #getSmpMod() <em>Smp Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpMod()
     * @generated NOT
     * @ordered
     */
    protected static final SmpMod SMP_MOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSmpMod() <em>Smp Mod</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpMod()
     * @generated
     * @ordered
     */
    protected SmpMod smpMod = SMP_MOD_EDEFAULT;

    /**
     * This is true if the Smp Mod attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean smpModESet;

    /**
     * The default value of the '{@link #getSmpRate() <em>Smp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpRate()
     * @generated
     * @ordered
     */
    protected static final Integer SMP_RATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSmpRate() <em>Smp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmpRate()
     * @generated
     * @ordered
     */
    protected Integer smpRate = SMP_RATE_EDEFAULT;

    /**
     * This is true if the Smp Rate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean smpRateESet;

    /**
     * The default value of the '{@link #getSmvID() <em>Smv ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmvID()
     * @generated
     * @ordered
     */
    protected static final String SMV_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSmvID() <em>Smv ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmvID()
     * @generated
     * @ordered
     */
    protected String smvID = SMV_ID_EDEFAULT;

    /**
     * This is true if the Smv ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean smvIDESet;

    /**
     * The cached value of the '{@link #getSmvOpts() <em>Smv Opts</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmvOpts()
     * @generated
     * @ordered
     */
    protected SmvOpts smvOpts;

    /**
     * This is true if the Smv Opts containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean smvOptsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SampledValueControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSampledValueControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Boolean getMulticast() {
        if( isSetMulticast() ) {
            return multicast;
        }
        return Boolean.TRUE;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setMulticast( Boolean newMulticast ) {
        Boolean oldMulticast = multicast;
        multicast = newMulticast;
        boolean oldMulticastESet = multicastESet;
        multicastESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SAMPLED_VALUE_CONTROL__MULTICAST, oldMulticast, multicast, !oldMulticastESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMulticast() {
        Boolean oldMulticast = multicast;
        boolean oldMulticastESet = multicastESet;
        multicast = MULTICAST_EDEFAULT;
        multicastESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SAMPLED_VALUE_CONTROL__MULTICAST, oldMulticast, MULTICAST_EDEFAULT, oldMulticastESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMulticast() {
        return multicastESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getNofASDU() {
        return nofASDU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNofASDU( Integer newNofASDU ) {
        Integer oldNofASDU = nofASDU;
        nofASDU = newNofASDU;
        boolean oldNofASDUESet = nofASDUESet;
        nofASDUESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SAMPLED_VALUE_CONTROL__NOF_ASDU, oldNofASDU, nofASDU, !oldNofASDUESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetNofASDU() {
        Integer oldNofASDU = nofASDU;
        boolean oldNofASDUESet = nofASDUESet;
        nofASDU = NOF_ASDU_EDEFAULT;
        nofASDUESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SAMPLED_VALUE_CONTROL__NOF_ASDU, oldNofASDU, NOF_ASDU_EDEFAULT, oldNofASDUESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetNofASDU() {
        return nofASDUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public PredefinedTypeOfSecurityEnum getSecurityEnable() {
        if( isSetSecurityEnable() ) {
            return securityEnable;
        }
        return PredefinedTypeOfSecurityEnum.NONE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSecurityEnable( PredefinedTypeOfSecurityEnum newSecurityEnable ) {
        PredefinedTypeOfSecurityEnum oldSecurityEnable = securityEnable;
        securityEnable = newSecurityEnable == null ? SECURITY_ENABLE_EDEFAULT : newSecurityEnable;
        boolean oldSecurityEnableESet = securityEnableESet;
        securityEnableESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SAMPLED_VALUE_CONTROL__SECURITY_ENABLE, oldSecurityEnable, securityEnable, !oldSecurityEnableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSecurityEnable() {
        PredefinedTypeOfSecurityEnum oldSecurityEnable = securityEnable;
        boolean oldSecurityEnableESet = securityEnableESet;
        securityEnable = SECURITY_ENABLE_EDEFAULT;
        securityEnableESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SAMPLED_VALUE_CONTROL__SECURITY_ENABLE, oldSecurityEnable, SECURITY_ENABLE_EDEFAULT, oldSecurityEnableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSecurityEnable() {
        return securityEnableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public SmpMod getSmpMod() {
        if( isSetSmpMod() ) {
            return smpMod;
        }
        return SmpMod.SMP_PER_PERIOD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSmpMod( SmpMod newSmpMod ) {
        SmpMod oldSmpMod = smpMod;
        smpMod = newSmpMod == null ? SMP_MOD_EDEFAULT : newSmpMod;
        boolean oldSmpModESet = smpModESet;
        smpModESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SAMPLED_VALUE_CONTROL__SMP_MOD, oldSmpMod, smpMod, !oldSmpModESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSmpMod() {
        SmpMod oldSmpMod = smpMod;
        boolean oldSmpModESet = smpModESet;
        smpMod = SMP_MOD_EDEFAULT;
        smpModESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SAMPLED_VALUE_CONTROL__SMP_MOD, oldSmpMod, SMP_MOD_EDEFAULT, oldSmpModESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSmpMod() {
        return smpModESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getSmpRate() {
        return smpRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSmpRate( Integer newSmpRate ) {
        Integer oldSmpRate = smpRate;
        smpRate = newSmpRate;
        boolean oldSmpRateESet = smpRateESet;
        smpRateESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SAMPLED_VALUE_CONTROL__SMP_RATE, oldSmpRate, smpRate, !oldSmpRateESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSmpRate() {
        Integer oldSmpRate = smpRate;
        boolean oldSmpRateESet = smpRateESet;
        smpRate = SMP_RATE_EDEFAULT;
        smpRateESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SAMPLED_VALUE_CONTROL__SMP_RATE, oldSmpRate, SMP_RATE_EDEFAULT, oldSmpRateESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSmpRate() {
        return smpRateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSmvID() {
        return smvID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSmvID( String newSmvID ) {
        String oldSmvID = smvID;
        smvID = newSmvID;
        boolean oldSmvIDESet = smvIDESet;
        smvIDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SAMPLED_VALUE_CONTROL__SMV_ID, oldSmvID, smvID, !oldSmvIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSmvID() {
        String oldSmvID = smvID;
        boolean oldSmvIDESet = smvIDESet;
        smvID = SMV_ID_EDEFAULT;
        smvIDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SAMPLED_VALUE_CONTROL__SMV_ID, oldSmvID, SMV_ID_EDEFAULT, oldSmvIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSmvID() {
        return smvIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LN0 getLN0() {
        if (eContainerFeatureID() != SclPackage.SAMPLED_VALUE_CONTROL__LN0) return null;
        return (LN0)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLN0( LN0 newLN0, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newLN0, SclPackage.SAMPLED_VALUE_CONTROL__LN0, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLN0( LN0 newLN0 ) {
        if (newLN0 != eInternalContainer() || (eContainerFeatureID() != SclPackage.SAMPLED_VALUE_CONTROL__LN0 && newLN0 != null)) {
            if (EcoreUtil.isAncestor(this, newLN0))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newLN0 != null)
                msgs = ((InternalEObject)newLN0).eInverseAdd(this, SclPackage.LN0__SAMPLED_VALUE_CONTROL, LN0.class, msgs);
            msgs = basicSetLN0(newLN0, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SAMPLED_VALUE_CONTROL__LN0, newLN0, newLN0));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmvOpts getSmvOpts() {
        return smvOpts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSmvOpts( SmvOpts newSmvOpts, NotificationChain msgs ) {
        SmvOpts oldSmvOpts = smvOpts;
        smvOpts = newSmvOpts;
        boolean oldSmvOptsESet = smvOptsESet;
        smvOptsESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS, oldSmvOpts, newSmvOpts, !oldSmvOptsESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSmvOpts( SmvOpts newSmvOpts ) {
        if (newSmvOpts != smvOpts) {
            NotificationChain msgs = null;
            if (smvOpts != null)
                msgs = ((InternalEObject)smvOpts).eInverseRemove(this, SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL, SmvOpts.class, msgs);
            if (newSmvOpts != null)
                msgs = ((InternalEObject)newSmvOpts).eInverseAdd(this, SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL, SmvOpts.class, msgs);
            msgs = basicSetSmvOpts(newSmvOpts, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldSmvOptsESet = smvOptsESet;
            smvOptsESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS, newSmvOpts, newSmvOpts, !oldSmvOptsESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSmvOpts( NotificationChain msgs ) {
        SmvOpts oldSmvOpts = smvOpts;
        smvOpts = null;
        boolean oldSmvOptsESet = smvOptsESet;
        smvOptsESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS, oldSmvOpts, null, oldSmvOptsESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSmvOpts() {
        if (smvOpts != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)smvOpts).eInverseRemove(this, SclPackage.SMV_OPTS__SAMPLED_VALUE_CONTROL, SmvOpts.class, msgs);
            msgs = basicUnsetSmvOpts(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldSmvOptsESet = smvOptsESet;
            smvOptsESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS, null, null, oldSmvOptsESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSmvOpts() {
        return smvOptsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.SAMPLED_VALUE_CONTROL__LN0:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetLN0((LN0)otherEnd, msgs);
            case SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS:
                if (smvOpts != null)
                    msgs = ((InternalEObject)smvOpts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS, null, msgs);
                return basicSetSmvOpts((SmvOpts)otherEnd, msgs);
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
            case SclPackage.SAMPLED_VALUE_CONTROL__LN0:
                return basicSetLN0(null, msgs);
            case SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS:
                return basicUnsetSmvOpts(msgs);
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
            case SclPackage.SAMPLED_VALUE_CONTROL__LN0:
                return eInternalContainer().eInverseRemove(this, SclPackage.LN0__SAMPLED_VALUE_CONTROL, LN0.class, msgs);
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
            case SclPackage.SAMPLED_VALUE_CONTROL__MULTICAST:
                return getMulticast();
            case SclPackage.SAMPLED_VALUE_CONTROL__NOF_ASDU:
                return getNofASDU();
            case SclPackage.SAMPLED_VALUE_CONTROL__SECURITY_ENABLE:
                return getSecurityEnable();
            case SclPackage.SAMPLED_VALUE_CONTROL__SMP_MOD:
                return getSmpMod();
            case SclPackage.SAMPLED_VALUE_CONTROL__SMP_RATE:
                return getSmpRate();
            case SclPackage.SAMPLED_VALUE_CONTROL__SMV_ID:
                return getSmvID();
            case SclPackage.SAMPLED_VALUE_CONTROL__LN0:
                return getLN0();
            case SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS:
                return getSmvOpts();
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
            case SclPackage.SAMPLED_VALUE_CONTROL__MULTICAST:
                setMulticast((Boolean)newValue);
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__NOF_ASDU:
                setNofASDU((Integer)newValue);
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__SECURITY_ENABLE:
                setSecurityEnable((PredefinedTypeOfSecurityEnum)newValue);
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__SMP_MOD:
                setSmpMod((SmpMod)newValue);
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__SMP_RATE:
                setSmpRate((Integer)newValue);
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__SMV_ID:
                setSmvID((String)newValue);
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__LN0:
                setLN0((LN0)newValue);
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS:
                setSmvOpts((SmvOpts)newValue);
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
            case SclPackage.SAMPLED_VALUE_CONTROL__MULTICAST:
                unsetMulticast();
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__NOF_ASDU:
                unsetNofASDU();
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__SECURITY_ENABLE:
                unsetSecurityEnable();
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__SMP_MOD:
                unsetSmpMod();
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__SMP_RATE:
                unsetSmpRate();
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__SMV_ID:
                unsetSmvID();
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__LN0:
                setLN0((LN0)null);
                return;
            case SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS:
                unsetSmvOpts();
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
            case SclPackage.SAMPLED_VALUE_CONTROL__MULTICAST:
                return isSetMulticast();
            case SclPackage.SAMPLED_VALUE_CONTROL__NOF_ASDU:
                return isSetNofASDU();
            case SclPackage.SAMPLED_VALUE_CONTROL__SECURITY_ENABLE:
                return isSetSecurityEnable();
            case SclPackage.SAMPLED_VALUE_CONTROL__SMP_MOD:
                return isSetSmpMod();
            case SclPackage.SAMPLED_VALUE_CONTROL__SMP_RATE:
                return isSetSmpRate();
            case SclPackage.SAMPLED_VALUE_CONTROL__SMV_ID:
                return isSetSmvID();
            case SclPackage.SAMPLED_VALUE_CONTROL__LN0:
                return getLN0() != null;
            case SclPackage.SAMPLED_VALUE_CONTROL__SMV_OPTS:
                return isSetSmvOpts();
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
        result.append(" (multicast: ");
        if (multicastESet) result.append(multicast); else result.append("<unset>");
        result.append(", nofASDU: ");
        if (nofASDUESet) result.append(nofASDU); else result.append("<unset>");
        result.append(", securityEnable: ");
        if (securityEnableESet) result.append(securityEnable); else result.append("<unset>");
        result.append(", smpMod: ");
        if (smpModESet) result.append(smpMod); else result.append("<unset>");
        result.append(", smpRate: ");
        if (smpRateESet) result.append(smpRate); else result.append("<unset>");
        result.append(", smvID: ");
        if (smvIDESet) result.append(smvID); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SampledValueControlImpl
