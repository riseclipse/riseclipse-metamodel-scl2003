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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value With Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValueWithUnitImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValueWithUnitImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValueWithUnitImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueWithUnitImpl extends SclObjectImpl implements ValueWithUnit {
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
	 * @generated
	 * @ordered
	 */
    protected static final UnitMultiplierEnum MULTIPLIER_EDEFAULT = UnitMultiplierEnum.MILLI;

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
    protected ValueWithUnitImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getValueWithUnit();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VALUE_WITH_UNIT__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VALUE_WITH_UNIT__MULTIPLIER, oldMultiplier, multiplier, !oldMultiplierESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.VALUE_WITH_UNIT__MULTIPLIER, oldMultiplier, MULTIPLIER_EDEFAULT, oldMultiplierESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VALUE_WITH_UNIT__UNIT, oldUnit, unit, !oldUnitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.VALUE_WITH_UNIT__UNIT, oldUnit, UNIT_EDEFAULT, oldUnitESet));
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
	 * The cached validation expression for the '{@link #validateValueWithUnit_value_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value With Unit value required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateValueWithUnit_value_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VALUE_WITH_UNIT_VALUE_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'value shall be present in ValueWithUnit (line ' + self.lineNumber.toString() + ')' ,\n" +
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
	public boolean validateValueWithUnit_value_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getValueWithUnit(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getValueWithUnit__ValidateValueWithUnit_value_required__DiagnosticChain_Map(),
				 VALIDATE_VALUE_WITH_UNIT_VALUE_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.VALUE_WITH_UNIT__VALIDATE_VALUE_WITH_UNIT_VALUE_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateValueWithUnit_unit_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value With Unit unit required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateValueWithUnit_unit_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VALUE_WITH_UNIT_UNIT_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'unit shall be present in ValueWithUnit (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.unit <> null\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueWithUnit_unit_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getValueWithUnit(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getValueWithUnit__ValidateValueWithUnit_unit_required__DiagnosticChain_Map(),
				 VALIDATE_VALUE_WITH_UNIT_UNIT_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.VALUE_WITH_UNIT__VALIDATE_VALUE_WITH_UNIT_UNIT_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateValueWithUnit_unit_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Value With Unit unit valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateValueWithUnit_unit_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VALUE_WITH_UNIT_UNIT_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'unit shall be present in ValueWithUnit (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.value.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        -- It is a token in XSD\n" +
		"        -- There is a SIUnitEnum but it is commented out\n" +
		"        -- TODO: why ?\n" +
		"        true\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueWithUnit_unit_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getValueWithUnit(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getValueWithUnit__ValidateValueWithUnit_unit_valid__DiagnosticChain_Map(),
				 VALIDATE_VALUE_WITH_UNIT_UNIT_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.VALUE_WITH_UNIT__VALIDATE_VALUE_WITH_UNIT_UNIT_VALID);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.VALUE_WITH_UNIT__VALUE:
				return getValue();
			case SclPackage.VALUE_WITH_UNIT__MULTIPLIER:
				return getMultiplier();
			case SclPackage.VALUE_WITH_UNIT__UNIT:
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
			case SclPackage.VALUE_WITH_UNIT__VALUE:
				setValue((BigDecimal)newValue);
				return;
			case SclPackage.VALUE_WITH_UNIT__MULTIPLIER:
				setMultiplier((UnitMultiplierEnum)newValue);
				return;
			case SclPackage.VALUE_WITH_UNIT__UNIT:
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
			case SclPackage.VALUE_WITH_UNIT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SclPackage.VALUE_WITH_UNIT__MULTIPLIER:
				unsetMultiplier();
				return;
			case SclPackage.VALUE_WITH_UNIT__UNIT:
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
			case SclPackage.VALUE_WITH_UNIT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SclPackage.VALUE_WITH_UNIT__MULTIPLIER:
				return isSetMultiplier();
			case SclPackage.VALUE_WITH_UNIT__UNIT:
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
			case SclPackage.VALUE_WITH_UNIT___VALIDATE_VALUE_WITH_UNIT_VALUE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateValueWithUnit_value_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.VALUE_WITH_UNIT___VALIDATE_VALUE_WITH_UNIT_UNIT_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateValueWithUnit_unit_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.VALUE_WITH_UNIT___VALIDATE_VALUE_WITH_UNIT_UNIT_VALID__DIAGNOSTICCHAIN_MAP:
				return validateValueWithUnit_unit_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

} //ValueWithUnitImpl
