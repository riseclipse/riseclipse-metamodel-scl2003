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

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control With Trigger Opt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithTriggerOptImpl#getIntgPd <em>Intg Pd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithTriggerOptImpl#getTrgOps <em>Trg Ops</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlWithTriggerOptImpl extends ControlImpl implements ControlWithTriggerOpt {
    /**
	 * The default value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIntgPd()
	 * @generated
	 * @ordered
	 */
    protected static final Integer INTG_PD_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getIntgPd() <em>Intg Pd</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIntgPd()
	 * @generated
	 * @ordered
	 */
    protected Integer intgPd = INTG_PD_EDEFAULT;

    /**
	 * This is true if the Intg Pd attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean intgPdESet;

    /**
	 * The cached value of the '{@link #getTrgOps() <em>Trg Ops</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTrgOps()
	 * @generated
	 * @ordered
	 */
    protected TrgOps trgOps;

    /**
	 * This is true if the Trg Ops containment reference has been set.
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
    protected ControlWithTriggerOptImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.CONTROL_WITH_TRIGGER_OPT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getIntgPd() {
		return intgPd;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIntgPd( Integer newIntgPd ) {
		Integer oldIntgPd = intgPd;
		intgPd = newIntgPd;
		boolean oldIntgPdESet = intgPdESet;
		intgPdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD, oldIntgPd, intgPd, !oldIntgPdESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetIntgPd() {
		Integer oldIntgPd = intgPd;
		boolean oldIntgPdESet = intgPdESet;
		intgPd = INTG_PD_EDEFAULT;
		intgPdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD, oldIntgPd, INTG_PD_EDEFAULT, oldIntgPdESet));
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
    public TrgOps getTrgOps() {
		return trgOps;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTrgOps( TrgOps newTrgOps, NotificationChain msgs ) {
		TrgOps oldTrgOps = trgOps;
		trgOps = newTrgOps;
		boolean oldTrgOpsESet = trgOpsESet;
		trgOpsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, oldTrgOps, newTrgOps, !oldTrgOpsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTrgOps( TrgOps newTrgOps ) {
		if (newTrgOps != trgOps) {
			NotificationChain msgs = null;
			if (trgOps != null)
				msgs = ((InternalEObject)trgOps).eInverseRemove(this, SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT, TrgOps.class, msgs);
			if (newTrgOps != null)
				msgs = ((InternalEObject)newTrgOps).eInverseAdd(this, SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT, TrgOps.class, msgs);
			msgs = basicSetTrgOps(newTrgOps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTrgOpsESet = trgOpsESet;
			trgOpsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, newTrgOps, newTrgOps, !oldTrgOpsESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetTrgOps( NotificationChain msgs ) {
		TrgOps oldTrgOps = trgOps;
		trgOps = null;
		boolean oldTrgOpsESet = trgOpsESet;
		trgOpsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, oldTrgOps, null, oldTrgOpsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetTrgOps() {
		if (trgOps != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)trgOps).eInverseRemove(this, SclPackage.TRG_OPS__CONTROL_WITH_TRIGGER_OPT, TrgOps.class, msgs);
			msgs = basicUnsetTrgOps(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTrgOpsESet = trgOpsESet;
			trgOpsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, null, null, oldTrgOpsESet));
		}
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
	public boolean validateControlWithTriggerOpt_intgPd_unsigned_int(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ControlWithTriggerOpt_intgPd_unsigned_int:
		 *   let
		 *     severity : Integer[1] = 'ControlWithTriggerOpt::ControlWithTriggerOpt_intgPd_unsigned_int'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.intgPd <> null implies self.intgPd >= 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'intgPd attribute shall be valid in ControlWithTriggerOpt (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.intgPd.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ControlWithTriggerOpt::ControlWithTriggerOpt_intgPd_unsigned_int'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ControlWithTriggerOpt_c_c_ControlWithTriggerOpt_intgPd_unsigned_int);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer intgPd = this.getIntgPd();
				final /*@NonInvalid*/ IntegerValue BOXED_intgPd = intgPd == null ? null : ValueUtil.integerValueOf(intgPd);
				final /*@NonInvalid*/ boolean ne = BOXED_intgPd != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_intgPd, SclTables.INT_0).booleanValue();
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_intgPd_32_attribute_32_shall_32_be_32_valid_32_in_32_ControlWithTriggerOpt_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_intgPd);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ControlWithTriggerOpt_c_c_ControlWithTriggerOpt_intgPd_unsigned_int, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
				if (trgOps != null)
					msgs = ((InternalEObject)trgOps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS, null, msgs);
				return basicSetTrgOps((TrgOps)otherEnd, msgs);
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
			case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
				return basicUnsetTrgOps(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
		switch (featureID) {
			case SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD:
				return getIntgPd();
			case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
				return getTrgOps();
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
			case SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD:
				setIntgPd((Integer)newValue);
				return;
			case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
				setTrgOps((TrgOps)newValue);
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
			case SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD:
				unsetIntgPd();
				return;
			case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
				unsetTrgOps();
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
			case SclPackage.CONTROL_WITH_TRIGGER_OPT__INTG_PD:
				return isSetIntgPd();
			case SclPackage.CONTROL_WITH_TRIGGER_OPT__TRG_OPS:
				return isSetTrgOps();
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
			case SclPackage.CONTROL_WITH_TRIGGER_OPT___VALIDATE_CONTROL_WITH_TRIGGER_OPT_INTG_PD_UNSIGNED_INT__DIAGNOSTICCHAIN_MAP:
				return validateControlWithTriggerOpt_intgPd_unsigned_int((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (intgPd: ");
		if (intgPdESet) result.append(intgPd); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ControlWithTriggerOptImpl
