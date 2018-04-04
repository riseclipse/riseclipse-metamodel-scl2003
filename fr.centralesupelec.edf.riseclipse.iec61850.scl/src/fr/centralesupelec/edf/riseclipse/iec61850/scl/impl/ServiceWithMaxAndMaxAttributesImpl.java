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

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service With Max And Max Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithMaxAndMaxAttributesImpl#getMaxAttributes <em>Max Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceWithMaxAndMaxAttributesImpl extends ServiceWithMaxImpl implements ServiceWithMaxAndMaxAttributes {
    /**
	 * The default value of the '{@link #getMaxAttributes() <em>Max Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMaxAttributes()
	 * @generated
	 * @ordered
	 */
    protected static final Integer MAX_ATTRIBUTES_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMaxAttributes() <em>Max Attributes</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMaxAttributes()
	 * @generated
	 * @ordered
	 */
    protected Integer maxAttributes = MAX_ATTRIBUTES_EDEFAULT;

    /**
	 * This is true if the Max Attributes attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean maxAttributesESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ServiceWithMaxAndMaxAttributesImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getMaxAttributes() {
		return maxAttributes;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMaxAttributes(Integer newMaxAttributes) {
		Integer oldMaxAttributes = maxAttributes;
		maxAttributes = newMaxAttributes;
		boolean oldMaxAttributesESet = maxAttributesESet;
		maxAttributesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES, oldMaxAttributes, maxAttributes, !oldMaxAttributesESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetMaxAttributes() {
		Integer oldMaxAttributes = maxAttributes;
		boolean oldMaxAttributesESet = maxAttributesESet;
		maxAttributes = MAX_ATTRIBUTES_EDEFAULT;
		maxAttributesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES, oldMaxAttributes, MAX_ATTRIBUTES_EDEFAULT, oldMaxAttributesESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetMaxAttributes() {
		return maxAttributesESet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMax_maxAttributes_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv ServiceWithMax_maxAttributes_valid:
		 *   let
		 *     severity : Integer[1] = 'ServiceWithMaxAndMaxAttributes::ServiceWithMax_maxAttributes_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.maxAttributes <> null implies self.maxAttributes > 0
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'maxAttributes attribute shall be valid in ServiceWithMaxAndMaxAttributes (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.maxAttributes.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'ServiceWithMaxAndMaxAttributes::ServiceWithMax_maxAttributes_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_ServiceWithMaxAndMaxAttributes_c_c_ServiceWithMax_maxAttributes_val);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer maxAttributes_0 = this.getMaxAttributes();
				final /*@NonInvalid*/ IntegerValue BOXED_maxAttributes_0 = maxAttributes_0 == null ? null : ValueUtil.integerValueOf(maxAttributes_0);
				final /*@NonInvalid*/ boolean ne = BOXED_maxAttributes_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_maxAttributes_0, SclTables.INT_0).booleanValue();
					status = gt;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_maxAttributes_32_attribute_32_shall_32_be_32_valid_32_in_32_ServiceWithMaxAndMaxAt, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_maxAttributes_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_ServiceWithMaxAndMaxAttributes_c_c_ServiceWithMax_maxAttributes_val, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
				return getMaxAttributes();
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
			case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
				setMaxAttributes((Integer)newValue);
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
			case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
				unsetMaxAttributes();
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
			case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES:
				return isSetMaxAttributes();
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
			case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES___VALIDATE_SERVICE_WITH_MAX_MAX_ATTRIBUTES_VALID__DIAGNOSTICCHAIN_MAP:
				return validateServiceWithMax_maxAttributes_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (maxAttributes: ");
		if (maxAttributesESet) result.append(maxAttributes); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServiceWithMaxAndMaxAttributesImpl
