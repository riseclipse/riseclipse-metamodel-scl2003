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

import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LN0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LN0Impl#getGSEControl <em>GSE Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LN0Impl#getLDevice <em>LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LN0Impl#getSampledValueControl <em>Sampled Value Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LN0Impl#getSettingControl <em>Setting Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LN0Impl extends AnyLNImpl implements LN0 {
    /**
	 * The cached value of the '{@link #getGSEControl() <em>GSE Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGSEControl()
	 * @generated
	 * @ordered
	 */
    protected EList<GSEControl> gseControl;

    /**
	 * The cached value of the '{@link #getSampledValueControl() <em>Sampled Value Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSampledValueControl()
	 * @generated
	 * @ordered
	 */
    protected EList<SampledValueControl> sampledValueControl;

    /**
	 * The cached value of the '{@link #getSettingControl() <em>Setting Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSettingControl()
	 * @generated
	 * @ordered
	 */
    protected SettingControl settingControl;

    /**
	 * This is true if the Setting Control containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean settingControlESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected LN0Impl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getLN0();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<GSEControl> getGSEControl() {
		if (gseControl == null) {
			gseControl = new EObjectContainmentWithInverseEList.Unsettable<GSEControl>(GSEControl.class, this, SclPackage.LN0__GSE_CONTROL, SclPackage.GSE_CONTROL__LN0);
		}
		return gseControl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetGSEControl() {
		if (gseControl != null) ((InternalEList.Unsettable<?>)gseControl).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGSEControl() {
		return gseControl != null && ((InternalEList.Unsettable<?>)gseControl).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LDevice getLDevice() {
		if (eContainerFeatureID() != SclPackage.LN0__LDEVICE) return null;
		return (LDevice)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLDevice( LDevice newLDevice, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newLDevice, SclPackage.LN0__LDEVICE, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLDevice( LDevice newLDevice ) {
		if (newLDevice != eInternalContainer() || (eContainerFeatureID() != SclPackage.LN0__LDEVICE && newLDevice != null)) {
			if (EcoreUtil.isAncestor(this, newLDevice))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLDevice != null)
				msgs = ((InternalEObject)newLDevice).eInverseAdd(this, SclPackage.LDEVICE__LN0, LDevice.class, msgs);
			msgs = basicSetLDevice(newLDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LN0__LDEVICE, newLDevice, newLDevice));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SampledValueControl> getSampledValueControl() {
		if (sampledValueControl == null) {
			sampledValueControl = new EObjectContainmentWithInverseEList.Unsettable<SampledValueControl>(SampledValueControl.class, this, SclPackage.LN0__SAMPLED_VALUE_CONTROL, SclPackage.SAMPLED_VALUE_CONTROL__LN0);
		}
		return sampledValueControl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSampledValueControl() {
		if (sampledValueControl != null) ((InternalEList.Unsettable<?>)sampledValueControl).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSampledValueControl() {
		return sampledValueControl != null && ((InternalEList.Unsettable<?>)sampledValueControl).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SettingControl getSettingControl() {
		return settingControl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSettingControl( SettingControl newSettingControl, NotificationChain msgs ) {
		SettingControl oldSettingControl = settingControl;
		settingControl = newSettingControl;
		boolean oldSettingControlESet = settingControlESet;
		settingControlESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.LN0__SETTING_CONTROL, oldSettingControl, newSettingControl, !oldSettingControlESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSettingControl( SettingControl newSettingControl ) {
		if (newSettingControl != settingControl) {
			NotificationChain msgs = null;
			if (settingControl != null)
				msgs = ((InternalEObject)settingControl).eInverseRemove(this, SclPackage.SETTING_CONTROL__LN0, SettingControl.class, msgs);
			if (newSettingControl != null)
				msgs = ((InternalEObject)newSettingControl).eInverseAdd(this, SclPackage.SETTING_CONTROL__LN0, SettingControl.class, msgs);
			msgs = basicSetSettingControl(newSettingControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSettingControlESet = settingControlESet;
			settingControlESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LN0__SETTING_CONTROL, newSettingControl, newSettingControl, !oldSettingControlESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetSettingControl( NotificationChain msgs ) {
		SettingControl oldSettingControl = settingControl;
		settingControl = null;
		boolean oldSettingControlESet = settingControlESet;
		settingControlESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.LN0__SETTING_CONTROL, oldSettingControl, null, oldSettingControlESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSettingControl() {
		if (settingControl != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)settingControl).eInverseRemove(this, SclPackage.SETTING_CONTROL__LN0, SettingControl.class, msgs);
			msgs = basicUnsetSettingControl(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSettingControlESet = settingControlESet;
			settingControlESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LN0__SETTING_CONTROL, null, null, oldSettingControlESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSettingControl() {
		return settingControlESet;
	}

    /**
	 * The cached validation expression for the '{@link #validateLN0_lnClass_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate LN0 ln Class value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLN0_lnClass_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LN0_LN_CLASS_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'lnClass attribute shall be LLN0 in LN0 (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.lnClass.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.lnClass <> null implies self.lnClass = 'LLN0'\n" +
		"    \n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN0_lnClass_value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getLN0(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getLN0__ValidateLN0_lnClass_value__DiagnosticChain_Map(),
				 VALIDATE_LN0_LN_CLASS_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.LN0__VALIDATE_LN0_LN_CLASS_VALUE);
	}

				/**
	 * The cached validation expression for the '{@link #validateLN0_inst_empty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate LN0 inst empty</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLN0_inst_empty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LN0_INST_EMPTY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'inst attribute shall be empty in LN0 (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.inst.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.inst <> null implies self.inst = ''\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN0_inst_empty(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getLN0(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getLN0__ValidateLN0_inst_empty__DiagnosticChain_Map(),
				 VALIDATE_LN0_INST_EMPTY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.LN0__VALIDATE_LN0_INST_EMPTY);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.LN0__GSE_CONTROL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGSEControl()).basicAdd(otherEnd, msgs);
			case SclPackage.LN0__LDEVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLDevice((LDevice)otherEnd, msgs);
			case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSampledValueControl()).basicAdd(otherEnd, msgs);
			case SclPackage.LN0__SETTING_CONTROL:
				if (settingControl != null)
					msgs = ((InternalEObject)settingControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.LN0__SETTING_CONTROL, null, msgs);
				return basicSetSettingControl((SettingControl)otherEnd, msgs);
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
			case SclPackage.LN0__GSE_CONTROL:
				return ((InternalEList<?>)getGSEControl()).basicRemove(otherEnd, msgs);
			case SclPackage.LN0__LDEVICE:
				return basicSetLDevice(null, msgs);
			case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
				return ((InternalEList<?>)getSampledValueControl()).basicRemove(otherEnd, msgs);
			case SclPackage.LN0__SETTING_CONTROL:
				return basicUnsetSettingControl(msgs);
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
			case SclPackage.LN0__LDEVICE:
				return eInternalContainer().eInverseRemove(this, SclPackage.LDEVICE__LN0, LDevice.class, msgs);
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
			case SclPackage.LN0__GSE_CONTROL:
				return getGSEControl();
			case SclPackage.LN0__LDEVICE:
				return getLDevice();
			case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
				return getSampledValueControl();
			case SclPackage.LN0__SETTING_CONTROL:
				return getSettingControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
		switch (featureID) {
			case SclPackage.LN0__GSE_CONTROL:
				getGSEControl().clear();
				getGSEControl().addAll((Collection<? extends GSEControl>)newValue);
				return;
			case SclPackage.LN0__LDEVICE:
				setLDevice((LDevice)newValue);
				return;
			case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
				getSampledValueControl().clear();
				getSampledValueControl().addAll((Collection<? extends SampledValueControl>)newValue);
				return;
			case SclPackage.LN0__SETTING_CONTROL:
				setSettingControl((SettingControl)newValue);
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
			case SclPackage.LN0__GSE_CONTROL:
				unsetGSEControl();
				return;
			case SclPackage.LN0__LDEVICE:
				setLDevice((LDevice)null);
				return;
			case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
				unsetSampledValueControl();
				return;
			case SclPackage.LN0__SETTING_CONTROL:
				unsetSettingControl();
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
			case SclPackage.LN0__GSE_CONTROL:
				return isSetGSEControl();
			case SclPackage.LN0__LDEVICE:
				return getLDevice() != null;
			case SclPackage.LN0__SAMPLED_VALUE_CONTROL:
				return isSetSampledValueControl();
			case SclPackage.LN0__SETTING_CONTROL:
				return isSetSettingControl();
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
			case SclPackage.LN0___VALIDATE_LN0_LN_CLASS_VALUE__DIAGNOSTICCHAIN_MAP:
				return validateLN0_lnClass_value((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.LN0___VALIDATE_LN0_INST_EMPTY__DIAGNOSTICCHAIN_MAP:
				return validateLN0_inst_empty((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LN0Impl
