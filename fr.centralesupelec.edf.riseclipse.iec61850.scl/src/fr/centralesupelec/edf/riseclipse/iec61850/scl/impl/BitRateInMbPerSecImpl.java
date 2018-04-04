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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Rate In Mb Per Sec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BitRateInMbPerSecImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BitRateInMbPerSecImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BitRateInMbPerSecImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BitRateInMbPerSecImpl extends SclObjectImpl implements BitRateInMbPerSec {
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
    protected BitRateInMbPerSecImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getBitRateInMbPerSec();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.BIT_RATE_IN_MB_PER_SEC__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.BIT_RATE_IN_MB_PER_SEC__MULTIPLIER, oldMultiplier, multiplier, !oldMultiplierESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.BIT_RATE_IN_MB_PER_SEC__MULTIPLIER, oldMultiplier, MULTIPLIER_EDEFAULT, oldMultiplierESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.BIT_RATE_IN_MB_PER_SEC__UNIT, oldUnit, unit, !oldUnitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.BIT_RATE_IN_MB_PER_SEC__UNIT, oldUnit, UNIT_EDEFAULT, oldUnitESet));
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
	 * The cached validation expression for the '{@link #validateBitRateInMbPerSec_value_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Bit Rate In Mb Per Sec value required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBitRateInMbPerSec_value_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIT_RATE_IN_MB_PER_SEC_VALUE_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'value shall be present in BitRateInMbPerSec (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.value <> null\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitRateInMbPerSec_value_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getBitRateInMbPerSec(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getBitRateInMbPerSec__ValidateBitRateInMbPerSec_value_required__DiagnosticChain_Map(),
				 VALIDATE_BIT_RATE_IN_MB_PER_SEC_VALUE_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.BIT_RATE_IN_MB_PER_SEC__VALIDATE_BIT_RATE_IN_MB_PER_SEC_VALUE_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateBitRateInMbPerSec_value_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Bit Rate In Mb Per Sec value valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBitRateInMbPerSec_value_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIT_RATE_IN_MB_PER_SEC_VALUE_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'value shall be positive in BitRateInMbPerSec (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.value.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.value <> null implies self.value > 0\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitRateInMbPerSec_value_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getBitRateInMbPerSec(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getBitRateInMbPerSec__ValidateBitRateInMbPerSec_value_valid__DiagnosticChain_Map(),
				 VALIDATE_BIT_RATE_IN_MB_PER_SEC_VALUE_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.BIT_RATE_IN_MB_PER_SEC__VALIDATE_BIT_RATE_IN_MB_PER_SEC_VALUE_VALID);
	}

				/**
	 * The cached validation expression for the '{@link #validateBitRateInMbPerSec_unit_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Bit Rate In Mb Per Sec unit value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBitRateInMbPerSec_unit_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIT_RATE_IN_MB_PER_SEC_UNIT_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'unit attribute if present shall be b/s in BitRateInMbPerSec (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.unit.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.unit <> null implies self.unit = 'b/s'\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitRateInMbPerSec_unit_value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getBitRateInMbPerSec(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getBitRateInMbPerSec__ValidateBitRateInMbPerSec_unit_value__DiagnosticChain_Map(),
				 VALIDATE_BIT_RATE_IN_MB_PER_SEC_UNIT_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.BIT_RATE_IN_MB_PER_SEC__VALIDATE_BIT_RATE_IN_MB_PER_SEC_UNIT_VALUE);
	}

				/**
	 * The cached validation expression for the '{@link #validateBitRateInMbPerSec_multiplier_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Bit Rate In Mb Per Sec multiplier value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBitRateInMbPerSec_multiplier_value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIT_RATE_IN_MB_PER_SEC_MULTIPLIER_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'multiplier attribute if present shall be M in BitRateInMbPerSec (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.multiplier.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.multiplier <> null implies self.multiplier = UnitMultiplierEnum::M\n" +
		"    \n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitRateInMbPerSec_multiplier_value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getBitRateInMbPerSec(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getBitRateInMbPerSec__ValidateBitRateInMbPerSec_multiplier_value__DiagnosticChain_Map(),
				 VALIDATE_BIT_RATE_IN_MB_PER_SEC_MULTIPLIER_VALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.BIT_RATE_IN_MB_PER_SEC__VALIDATE_BIT_RATE_IN_MB_PER_SEC_MULTIPLIER_VALUE);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__VALUE:
				return getValue();
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__MULTIPLIER:
				return getMultiplier();
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__UNIT:
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
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__VALUE:
				setValue((BigDecimal)newValue);
				return;
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__MULTIPLIER:
				setMultiplier((UnitMultiplierEnum)newValue);
				return;
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__UNIT:
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
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__MULTIPLIER:
				unsetMultiplier();
				return;
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__UNIT:
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
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__MULTIPLIER:
				return isSetMultiplier();
			case SclPackage.BIT_RATE_IN_MB_PER_SEC__UNIT:
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
			case SclPackage.BIT_RATE_IN_MB_PER_SEC___VALIDATE_BIT_RATE_IN_MB_PER_SEC_VALUE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateBitRateInMbPerSec_value_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.BIT_RATE_IN_MB_PER_SEC___VALIDATE_BIT_RATE_IN_MB_PER_SEC_VALUE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateBitRateInMbPerSec_value_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.BIT_RATE_IN_MB_PER_SEC___VALIDATE_BIT_RATE_IN_MB_PER_SEC_UNIT_VALUE__DIAGNOSTICCHAIN_MAP:
				return validateBitRateInMbPerSec_unit_value((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.BIT_RATE_IN_MB_PER_SEC___VALIDATE_BIT_RATE_IN_MB_PER_SEC_MULTIPLIER_VALUE__DIAGNOSTICCHAIN_MAP:
				return validateBitRateInMbPerSec_multiplier_value((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

} //BitRateInMbPerSecImpl
