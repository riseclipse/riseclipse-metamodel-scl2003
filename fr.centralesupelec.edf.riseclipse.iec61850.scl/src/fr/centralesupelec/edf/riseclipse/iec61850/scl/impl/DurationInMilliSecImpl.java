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

import java.math.BigDecimal;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration In Milli Sec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DurationInMilliSecImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DurationInMilliSecImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DurationInMilliSecImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DurationInMilliSecImpl extends SclObjectImpl implements DurationInMilliSec {
    /**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
    protected static final BigDecimal VALUE_EDEFAULT = null;
    /**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
    protected BigDecimal value = VALUE_EDEFAULT;
    /**
     * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplier()
     * @generated NOT
     * @ordered
     */
    protected static final UnitMultiplierEnum MULTIPLIER_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
    protected UnitMultiplierEnum multiplier = MULTIPLIER_EDEFAULT;
    /**
	 * This is true if the Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean multiplierESet;
    /**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
    protected static final String UNIT_EDEFAULT = null;
    /**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
    protected String unit = UNIT_EDEFAULT;
    /**
	 * This is true if the Unit attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean unitESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DurationInMilliSecImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.DURATION_IN_MILLI_SEC;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BigDecimal getValue() {
		return value;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValue(BigDecimal newValue) {
		BigDecimal oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DURATION_IN_MILLI_SEC__VALUE, oldValue, value));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public UnitMultiplierEnum getMultiplier() {
		return multiplier;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMultiplier(UnitMultiplierEnum newMultiplier) {
		UnitMultiplierEnum oldMultiplier = multiplier;
		multiplier = newMultiplier == null ? MULTIPLIER_EDEFAULT : newMultiplier;
		boolean oldMultiplierESet = multiplierESet;
		multiplierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER, oldMultiplier, multiplier, !oldMultiplierESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetMultiplier() {
		UnitMultiplierEnum oldMultiplier = multiplier;
		boolean oldMultiplierESet = multiplierESet;
		multiplier = MULTIPLIER_EDEFAULT;
		multiplierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER, oldMultiplier, MULTIPLIER_EDEFAULT, oldMultiplierESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetMultiplier() {
		return multiplierESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getUnit() {
		return unit;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		boolean oldUnitESet = unitESet;
		unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DURATION_IN_MILLI_SEC__UNIT, oldUnit, unit, !oldUnitESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetUnit() {
		String oldUnit = unit;
		boolean oldUnitESet = unitESet;
		unit = UNIT_EDEFAULT;
		unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DURATION_IN_MILLI_SEC__UNIT, oldUnit, UNIT_EDEFAULT, oldUnitESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetUnit() {
		return unitESet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInMilliSec_value_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DurationInMilliSec_value_required:
		 *   let
		 *     severity : Integer[1] = 'DurationInMilliSec::DurationInMilliSec_value_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.value <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'value shall be present in DurationInMilliSec (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'DurationInMilliSec::DurationInMilliSec_value_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DurationInMilliSec_c_c_DurationInMilliSec_value_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DurationInMilliSec_c_c_DurationInMilliSec_value_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, ValueUtil.TRUE_VALUE, SclTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInMilliSec_value_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DurationInMilliSec_value_valid:
		 *   let
		 *     severity : Integer[1] = 'DurationInMilliSec::DurationInMilliSec_value_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.value <> null implies self.value > 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'value shall be positive in DurationInMilliSec (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.value.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'DurationInMilliSec::DurationInMilliSec_value_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DurationInMilliSec_c_c_DurationInMilliSec_value_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ BigDecimal value = this.getValue();
			final /*@NonInvalid*/ RealValue BOXED_value = ValueUtil.realValueOf(value);
			final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_value, SclTables.INT_0).booleanValue();
			/*@NonInvalid*/ Object symbol_1;
			if (gt) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_value_32_shall_32_be_32_positive_32_in_32_DurationInMilliSec_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
				final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
				final /*@NonInvalid*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_value);
				final /*@NonInvalid*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, gt);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DurationInMilliSec_c_c_DurationInMilliSec_value_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInMilliSec_unit_value_fixed(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DurationInMilliSec_unit_value_fixed:
		 *   let
		 *     severity : Integer[1] = 'DurationInMilliSec::DurationInMilliSec_unit_value_fixed'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.unit <> null implies self.unit = 's'
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'unit attribute shall be s in DurationInMilliSec (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.unit.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'DurationInMilliSec::DurationInMilliSec_unit_value_fixed'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DurationInMilliSec_c_c_DurationInMilliSec_unit_value_fixed);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String unit_0 = this.getUnit();
				final /*@NonInvalid*/ boolean ne = unit_0 != null;
				/*@NonInvalid*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ boolean eq = SclTables.STR_s.equals(unit_0);
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_unit_32_attribute_32_shall_32_be_32_s_32_in_32_DurationInMilliSec_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(unit_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DurationInMilliSec_c_c_DurationInMilliSec_unit_value_fixed, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInMilliSec_multiplier_value_fixed(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DurationInMilliSec_multiplier_value_fixed:
		 *   let
		 *     severity : Integer[1] = 'DurationInMilliSec::DurationInMilliSec_multiplier_value_fixed'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.multiplier <> null implies self.multiplier = UnitMultiplierEnum::milli
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'multiplier attribute shall be m in DurationInMilliSec (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.multiplier.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'DurationInMilliSec::DurationInMilliSec_multiplier_value_fixed'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DurationInMilliSec_c_c_DurationInMilliSec_multiplier_value_fixed);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ UnitMultiplierEnum multiplier_0 = this.getMultiplier();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_multiplier_0 = multiplier_0 == null ? null : SclTables.ENUMid_UnitMultiplierEnum.getEnumerationLiteralId(ClassUtil.nonNullState(multiplier_0.getName()));
				final /*@NonInvalid*/ boolean ne = BOXED_multiplier_0 != null;
				/*@NonInvalid*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ boolean eq = BOXED_multiplier_0 == SclTables.ELITid_milli;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_multiplier_32_attribute_32_shall_32_be_32_m_32_in_32_DurationInMilliSec_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_multiplier_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DurationInMilliSec_c_c_DurationInMilliSec_multiplier_value_fixed, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.DURATION_IN_MILLI_SEC__VALUE:
				return getValue();
			case SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER:
				return getMultiplier();
			case SclPackage.DURATION_IN_MILLI_SEC__UNIT:
				return getUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SclPackage.DURATION_IN_MILLI_SEC__VALUE:
				setValue((BigDecimal)newValue);
				return;
			case SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER:
				setMultiplier((UnitMultiplierEnum)newValue);
				return;
			case SclPackage.DURATION_IN_MILLI_SEC__UNIT:
				setUnit((String)newValue);
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
			case SclPackage.DURATION_IN_MILLI_SEC__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER:
				unsetMultiplier();
				return;
			case SclPackage.DURATION_IN_MILLI_SEC__UNIT:
				unsetUnit();
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
			case SclPackage.DURATION_IN_MILLI_SEC__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SclPackage.DURATION_IN_MILLI_SEC__MULTIPLIER:
				return isSetMultiplier();
			case SclPackage.DURATION_IN_MILLI_SEC__UNIT:
				return isSetUnit();
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
			case SclPackage.DURATION_IN_MILLI_SEC___VALIDATE_DURATION_IN_MILLI_SEC_VALUE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateDurationInMilliSec_value_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.DURATION_IN_MILLI_SEC___VALIDATE_DURATION_IN_MILLI_SEC_VALUE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateDurationInMilliSec_value_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.DURATION_IN_MILLI_SEC___VALIDATE_DURATION_IN_MILLI_SEC_UNIT_VALUE_FIXED__DIAGNOSTICCHAIN_MAP:
				return validateDurationInMilliSec_unit_value_fixed((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.DURATION_IN_MILLI_SEC___VALIDATE_DURATION_IN_MILLI_SEC_MULTIPLIER_VALUE_FIXED__DIAGNOSTICCHAIN_MAP:
				return validateDurationInMilliSec_multiplier_value_fixed((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (value: ");
		result.append(value);
		result.append(", multiplier: ");
		if (multiplierESet) result.append(multiplier); else result.append("<unset>");
		result.append(", unit: ");
		if (unitESet) result.append(unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DurationInMilliSecImpl
