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
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl;
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
		return SclPackage.Literals.LN0;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN0_lnClass_value(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv LN0_lnClass_value:
		 *   let severity : Integer[1] = 'LN0::LN0_lnClass_value'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.lnClass <> null implies self.lnClass = 'LLN0'
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'lnClass attribute shall be LLN0 in LN0 (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.lnClass.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'LN0::LN0_lnClass_value'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_LN0_c_c_LN0_lnClass_value);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String lnClass_0 = this.getLnClass();
				final /*@NonInvalid*/ boolean ne = lnClass_0 != null;
				/*@NonInvalid*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ boolean eq = SclTables.STR_LLN0.equals(lnClass_0);
					status = eq;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_lnClass_32_attribute_32_shall_32_be_32_LLN0_32_in_32_LN0_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(lnClass_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_LN0_c_c_LN0_lnClass_value, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN0_inst_empty(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv LN0_inst_empty:
		 *   let severity : Integer[1] = 'LN0::LN0_inst_empty'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.inst <> null implies self.inst = ''
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'inst attribute shall be empty in LN0 (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.inst.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'LN0::LN0_inst_empty'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_LN0_c_c_LN0_inst_empty);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String inst = this.getInst();
				final /*@NonInvalid*/ boolean ne = inst != null;
				/*@NonInvalid*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ boolean eq = SclTables.STR_.equals(inst);
					status = eq;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_inst_32_attribute_32_shall_32_be_32_empty_32_in_32_LN0_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(inst);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_LN0_c_c_LN0_inst_empty, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
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
