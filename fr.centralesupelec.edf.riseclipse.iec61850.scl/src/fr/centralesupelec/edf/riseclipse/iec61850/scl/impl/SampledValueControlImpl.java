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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

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
	public boolean validateSampledValueControl_smvID_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SampledValueControl_smvID_required:
		 *   let
		 *     severity : Integer[1] = 'SampledValueControl::SampledValueControl_smvID_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.smvID <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'smvID attribute shall be present in SampledValueControl (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'SampledValueControl::SampledValueControl_smvID_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SampledValueControl_c_c_SampledValueControl_smvID_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String smvID = this.getSmvID();
			final /*@NonInvalid*/ boolean status = smvID != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_smvID_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SampledValueControl_c_c_SampledValueControl_smvID_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_smvID_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SampledValueControl_smvID_valid:
		 *   let
		 *     severity : Integer[1] = 'SampledValueControl::SampledValueControl_smvID_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.smvID <> null implies
		 *           self.validSclMessageID(smvID)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'smvID attribute shall be present in SampledValueControl (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.smvID.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SampledValueControl::SampledValueControl_smvID_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SampledValueControl_c_c_SampledValueControl_smvID_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String smvID_0 = this.getSmvID();
				final /*@NonInvalid*/ boolean ne = smvID_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclMessageID = ((SclObject)this).validSclMessageID(smvID_0);
					status = validSclMessageID;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_smvID_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(smvID_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SampledValueControl_c_c_SampledValueControl_smvID_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_smpRate_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SampledValueControl_smpRate_required:
		 *   let
		 *     severity : Integer[1] = 'SampledValueControl::SampledValueControl_smpRate_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.smpRate <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'smpRate attribute shall be present in SampledValueControl (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'SampledValueControl::SampledValueControl_smpRate_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SampledValueControl_c_c_SampledValueControl_smpRate_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ Integer smpRate = this.getSmpRate();
			final /*@NonInvalid*/ IntegerValue BOXED_smpRate = smpRate == null ? null : ValueUtil.integerValueOf(smpRate);
			final /*@NonInvalid*/ boolean status = BOXED_smpRate != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_smpRate_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SampledValueControl_c_c_SampledValueControl_smpRate_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_smpRate_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SampledValueControl_smpRate_valid:
		 *   let
		 *     severity : Integer[1] = 'SampledValueControl::SampledValueControl_smpRate_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.smpRate <> null implies self.smpRate >= 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'smpRate attribute shall be valid in SampledValueControl (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.smpRate.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SampledValueControl::SampledValueControl_smpRate_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SampledValueControl_c_c_SampledValueControl_smpRate_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer smpRate_0 = this.getSmpRate();
				final /*@NonInvalid*/ IntegerValue BOXED_smpRate_0 = smpRate_0 == null ? null : ValueUtil.integerValueOf(smpRate_0);
				final /*@NonInvalid*/ boolean ne = BOXED_smpRate_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_smpRate_0, SclTables.INT_0).booleanValue();
					status = ge;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_smpRate_32_attribute_32_shall_32_be_32_valid_32_in_32_SampledValueControl_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_smpRate_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SampledValueControl_c_c_SampledValueControl_smpRate_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_nofASDU_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SampledValueControl_nofASDU_required:
		 *   let
		 *     severity : Integer[1] = 'SampledValueControl::SampledValueControl_nofASDU_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.nofASDU <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'nofASDU attribute shall be present in SampledValueControl (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'SampledValueControl::SampledValueControl_nofASDU_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SampledValueControl_c_c_SampledValueControl_nofASDU_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ Integer nofASDU = this.getNofASDU();
			final /*@NonInvalid*/ IntegerValue BOXED_nofASDU = nofASDU == null ? null : ValueUtil.integerValueOf(nofASDU);
			final /*@NonInvalid*/ boolean status = BOXED_nofASDU != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_nofASDU_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SampledValueControl_c_c_SampledValueControl_nofASDU_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_nofASDU_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SampledValueControl_nofASDU_valid:
		 *   let
		 *     severity : Integer[1] = 'SampledValueControl::SampledValueControl_nofASDU_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.nofASDU <> null implies self.nofASDU >= 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'nofASDU attribute shall be present in SampledValueControl (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.nofASDU.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SampledValueControl::SampledValueControl_nofASDU_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SampledValueControl_c_c_SampledValueControl_nofASDU_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer nofASDU_0 = this.getNofASDU();
				final /*@NonInvalid*/ IntegerValue BOXED_nofASDU_0 = nofASDU_0 == null ? null : ValueUtil.integerValueOf(nofASDU_0);
				final /*@NonInvalid*/ boolean ne = BOXED_nofASDU_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_nofASDU_0, SclTables.INT_0).booleanValue();
					status = ge;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_nofASDU_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_nofASDU_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SampledValueControl_c_c_SampledValueControl_nofASDU_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_confRev_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SampledValueControl_confRev_required:
		 *   let
		 *     severity : Integer[1] = 'SampledValueControl::SampledValueControl_confRev_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.confRev <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'confRev attribute shall be present in SampledValueControl (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'SampledValueControl::SampledValueControl_confRev_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SampledValueControl_c_c_SampledValueControl_confRev_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ Integer confRev = this.getConfRev();
			final /*@NonInvalid*/ IntegerValue BOXED_confRev = confRev == null ? null : ValueUtil.integerValueOf(confRev);
			final /*@NonInvalid*/ boolean status = BOXED_confRev != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_confRev_32_attribute_32_shall_32_be_32_present_32_in_32_SampledValueControl_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SampledValueControl_c_c_SampledValueControl_confRev_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_confRev_unsignedInt(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SampledValueControl_confRev_unsignedInt:
		 *   let
		 *     severity : Integer[1] = 'SampledValueControl::SampledValueControl_confRev_unsignedInt'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.confRev <> null implies self.confRev >= 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'confRev attribute shall be valid in SampledValueControl (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.confRev.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'SampledValueControl::SampledValueControl_confRev_unsignedInt'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SampledValueControl_c_c_SampledValueControl_confRev_unsignedInt);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer confRev_0 = this.getConfRev();
				final /*@NonInvalid*/ IntegerValue BOXED_confRev_0 = confRev_0 == null ? null : ValueUtil.integerValueOf(confRev_0);
				final /*@NonInvalid*/ boolean ne = BOXED_confRev_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_confRev_0, SclTables.INT_0).booleanValue();
					status = ge;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_confRev_32_attribute_32_shall_32_be_32_valid_32_in_32_SampledValueControl_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_confRev_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SampledValueControl_c_c_SampledValueControl_confRev_unsignedInt, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_one_SmvOpts_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SampledValueControl_one_SmvOpts_required:
		 *   let
		 *     severity : Integer[1] = 'SampledValueControl::SampledValueControl_one_SmvOpts_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.SmvOpts <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'SampledValueControl shall contain a SmvOpts (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'SampledValueControl::SampledValueControl_one_SmvOpts_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SampledValueControl_c_c_SampledValueControl_one_SmvOpts_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ SmvOpts SmvOpts = this.getSmvOpts();
			final /*@NonInvalid*/ boolean status = SmvOpts != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_SampledValueControl_32_shall_32_contain_32_a_32_SmvOpts_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SampledValueControl_c_c_SampledValueControl_one_SmvOpts_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_multicast(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv SampledValueControl_multicast:
		 *   let
		 *     severity : Integer[1] = 'SampledValueControl::SampledValueControl_multicast'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = not self.multicast implies
		 *           self.IEDName->size() <= 1
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'If Multicast is FALSE, a maximum of one client IED shall be assigned to the SampledValueControl (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'SampledValueControl::SampledValueControl_multicast'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_SampledValueControl_c_c_SampledValueControl_multicast);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_3;
		if (le) {
			symbol_3 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_2;
			try {
				final /*@NonInvalid*/ Boolean multicast = this.getMulticast();
				final /*@NonInvalid*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(multicast);
				final /*@NonInvalid*/ List<IEDName> IEDName = this.getIEDName();
				final /*@NonInvalid*/ SetValue BOXED_IEDName = idResolver.createSetOfAll(SclTables.SET_CLSSid_IEDName, IEDName);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_IEDName);
				final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_1).booleanValue();
				final /*@Thrown*/ Boolean status = BooleanImpliesOperation.INSTANCE.evaluate(not, le_0);
				final /*@Thrown*/ boolean symbol_0 = status == Boolean.TRUE;
				/*@Thrown*/ Object symbol_2;
				if (symbol_0) {
					symbol_2 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_If_32_Multicast_32_is_32_FALSE_44_32_a_32_maximum_32_of_32_one_32_client_32_IED_32_shall_32_be_32_assi, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
					final /*@Thrown*/ TupleValue symbol_1 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
					symbol_2 = symbol_1;
				}
				CAUGHT_symbol_2 = symbol_2;
			}
			catch (Exception e) {
				CAUGHT_symbol_2 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_SampledValueControl_c_c_SampledValueControl_multicast, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_2, SclTables.INT_0).booleanValue();
			symbol_3 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_3;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SclPackage.SAMPLED_VALUE_CONTROL___VALIDATE_SAMPLED_VALUE_CONTROL_SMV_ID_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSampledValueControl_smvID_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SAMPLED_VALUE_CONTROL___VALIDATE_SAMPLED_VALUE_CONTROL_SMV_ID_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSampledValueControl_smvID_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SAMPLED_VALUE_CONTROL___VALIDATE_SAMPLED_VALUE_CONTROL_SMP_RATE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSampledValueControl_smpRate_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SAMPLED_VALUE_CONTROL___VALIDATE_SAMPLED_VALUE_CONTROL_SMP_RATE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSampledValueControl_smpRate_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SAMPLED_VALUE_CONTROL___VALIDATE_SAMPLED_VALUE_CONTROL_NOF_ASDU_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSampledValueControl_nofASDU_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SAMPLED_VALUE_CONTROL___VALIDATE_SAMPLED_VALUE_CONTROL_NOF_ASDU_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSampledValueControl_nofASDU_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SAMPLED_VALUE_CONTROL___VALIDATE_SAMPLED_VALUE_CONTROL_CONF_REV_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSampledValueControl_confRev_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SAMPLED_VALUE_CONTROL___VALIDATE_SAMPLED_VALUE_CONTROL_CONF_REV_UNSIGNED_INT__DIAGNOSTICCHAIN_MAP:
				return validateSampledValueControl_confRev_unsignedInt((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SAMPLED_VALUE_CONTROL___VALIDATE_SAMPLED_VALUE_CONTROL_ONE_SMV_OPTS_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSampledValueControl_one_SmvOpts_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SAMPLED_VALUE_CONTROL___VALIDATE_SAMPLED_VALUE_CONTROL_MULTICAST__DIAGNOSTICCHAIN_MAP:
				return validateSampledValueControl_multicast((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
