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
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Private</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PrivateImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PrivateImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PrivateImpl#getBaseElement <em>Base Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivateImpl extends AnyContentFromOtherNamespaceImpl implements Private {
    /**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
    protected static final String SOURCE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
    protected String source = SOURCE_EDEFAULT;

    /**
	 * This is true if the Source attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean sourceESet;

    /**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected static final String TYPE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected String type = TYPE_EDEFAULT;

    /**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean typeESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected PrivateImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.PRIVATE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getSource() {
		return source;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSource( String newSource ) {
		String oldSource = source;
		source = newSource;
		boolean oldSourceESet = sourceESet;
		sourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PRIVATE__SOURCE, oldSource, source, !oldSourceESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSource() {
		String oldSource = source;
		boolean oldSourceESet = sourceESet;
		source = SOURCE_EDEFAULT;
		sourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.PRIVATE__SOURCE, oldSource, SOURCE_EDEFAULT, oldSourceESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSource() {
		return sourceESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getType() {
		return type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType( String newType ) {
		String oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PRIVATE__TYPE, oldType, type, !oldTypeESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.PRIVATE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetType() {
		return typeESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BaseElement getBaseElement() {
		if (eContainerFeatureID() != SclPackage.PRIVATE__BASE_ELEMENT) return null;
		return (BaseElement)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBaseElement( BaseElement newBaseElement, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newBaseElement, SclPackage.PRIVATE__BASE_ELEMENT, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBaseElement( BaseElement newBaseElement ) {
		if (newBaseElement != eInternalContainer() || (eContainerFeatureID() != SclPackage.PRIVATE__BASE_ELEMENT && newBaseElement != null)) {
			if (EcoreUtil.isAncestor(this, newBaseElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBaseElement != null)
				msgs = ((InternalEObject)newBaseElement).eInverseAdd(this, SclPackage.BASE_ELEMENT__PRIVATE, BaseElement.class, msgs);
			msgs = basicSetBaseElement(newBaseElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.PRIVATE__BASE_ELEMENT, newBaseElement, newBaseElement));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivate_type_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Private_type_required:
		 *   let severity : Integer[1] = 'Private::Private_type_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.type <> null
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'type attribute shall be present in Private (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'Private::Private_type_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Private_c_c_Private_type_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ String type = this.getType();
			final /*@NonInvalid*/ boolean status = type != null;
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_type_32_attribute_32_shall_32_be_32_present_32_in_32_Private_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Private_c_c_Private_type_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivate_type_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Private_type_valid:
		 *   let severity : Integer[1] = 'Private::Private_type_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.type <> null implies
		 *           self.type.size() >= 1
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'type attribute shall not be empty in Private (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.type.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'Private::Private_type_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Private_c_c_Private_type_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String type = this.getType();
				final /*@NonInvalid*/ boolean ne = type != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(type);
					final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, size, SclTables.INT_1).booleanValue();
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_type_32_attribute_32_shall_32_not_32_be_32_empty_32_in_32_Private_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(type);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Private_c_c_Private_type_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.PRIVATE__BASE_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBaseElement((BaseElement)otherEnd, msgs);
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
			case SclPackage.PRIVATE__BASE_ELEMENT:
				return basicSetBaseElement(null, msgs);
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
			case SclPackage.PRIVATE__BASE_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SclPackage.BASE_ELEMENT__PRIVATE, BaseElement.class, msgs);
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
			case SclPackage.PRIVATE__SOURCE:
				return getSource();
			case SclPackage.PRIVATE__TYPE:
				return getType();
			case SclPackage.PRIVATE__BASE_ELEMENT:
				return getBaseElement();
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
			case SclPackage.PRIVATE__SOURCE:
				setSource((String)newValue);
				return;
			case SclPackage.PRIVATE__TYPE:
				setType((String)newValue);
				return;
			case SclPackage.PRIVATE__BASE_ELEMENT:
				setBaseElement((BaseElement)newValue);
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
			case SclPackage.PRIVATE__SOURCE:
				unsetSource();
				return;
			case SclPackage.PRIVATE__TYPE:
				unsetType();
				return;
			case SclPackage.PRIVATE__BASE_ELEMENT:
				setBaseElement((BaseElement)null);
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
			case SclPackage.PRIVATE__SOURCE:
				return isSetSource();
			case SclPackage.PRIVATE__TYPE:
				return isSetType();
			case SclPackage.PRIVATE__BASE_ELEMENT:
				return getBaseElement() != null;
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
			case SclPackage.PRIVATE___VALIDATE_PRIVATE_TYPE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validatePrivate_type_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.PRIVATE___VALIDATE_PRIVATE_TYPE_VALID__DIAGNOSTICCHAIN_MAP:
				return validatePrivate_type_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (source: ");
		if (sourceESet) result.append(source); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PrivateImpl
