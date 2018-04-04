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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getAbstractEqFuncSubFunc <em>Abstract Eq Func Sub Func</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getEquipmentContainer <em>Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getGeneralEquipmentContainer <em>General Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getSubFunction <em>Sub Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralEquipmentImpl extends EquipmentImpl implements GeneralEquipment {
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
	 * The cached value of the '{@link #getEqFunction() <em>Eq Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEqFunction()
	 * @generated
	 * @ordered
	 */
    protected EList<EqFunction> eqFunction;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected GeneralEquipmentImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getGeneralEquipment();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GENERAL_EQUIPMENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
    public AbstractEqFuncSubFunc getAbstractEqFuncSubFunc() {
		if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC) return null;
		return (AbstractEqFuncSubFunc)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAbstractEqFuncSubFunc( AbstractEqFuncSubFunc newAbstractEqFuncSubFunc,
            NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newAbstractEqFuncSubFunc, SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAbstractEqFuncSubFunc( AbstractEqFuncSubFunc newAbstractEqFuncSubFunc ) {
		if (newAbstractEqFuncSubFunc != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC && newAbstractEqFuncSubFunc != null)) {
			if (EcoreUtil.isAncestor(this, newAbstractEqFuncSubFunc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstractEqFuncSubFunc != null)
				msgs = ((InternalEObject)newAbstractEqFuncSubFunc).eInverseAdd(this, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT, AbstractEqFuncSubFunc.class, msgs);
			msgs = basicSetAbstractEqFuncSubFunc(newAbstractEqFuncSubFunc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC, newAbstractEqFuncSubFunc, newAbstractEqFuncSubFunc));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<EqFunction> getEqFunction() {
		if (eqFunction == null) {
			eqFunction = new EObjectContainmentWithInverseEList.Unsettable<EqFunction>(EqFunction.class, this, SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION, SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT);
		}
		return eqFunction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetEqFunction() {
		if (eqFunction != null) ((InternalEList.Unsettable<?>)eqFunction).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetEqFunction() {
		return eqFunction != null && ((InternalEList.Unsettable<?>)eqFunction).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EquipmentContainer getEquipmentContainer() {
		if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER) return null;
		return (EquipmentContainer)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetEquipmentContainer( EquipmentContainer newEquipmentContainer,
            NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newEquipmentContainer, SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setEquipmentContainer( EquipmentContainer newEquipmentContainer ) {
		if (newEquipmentContainer != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER && newEquipmentContainer != null)) {
			if (EcoreUtil.isAncestor(this, newEquipmentContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEquipmentContainer != null)
				msgs = ((InternalEObject)newEquipmentContainer).eInverseAdd(this, SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, EquipmentContainer.class, msgs);
			msgs = basicSetEquipmentContainer(newEquipmentContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER, newEquipmentContainer, newEquipmentContainer));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Function getFunction() {
		if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__FUNCTION) return null;
		return (Function)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetFunction( Function newFunction, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newFunction, SclPackage.GENERAL_EQUIPMENT__FUNCTION, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFunction( Function newFunction ) {
		if (newFunction != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__FUNCTION && newFunction != null)) {
			if (EcoreUtil.isAncestor(this, newFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, SclPackage.FUNCTION__GENERAL_EQUIPMENT, Function.class, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__FUNCTION, newFunction, newFunction));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GeneralEquipmentContainer getGeneralEquipmentContainer() {
		if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER) return null;
		return (GeneralEquipmentContainer)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGeneralEquipmentContainer( GeneralEquipmentContainer newGeneralEquipmentContainer,
            NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newGeneralEquipmentContainer, SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGeneralEquipmentContainer( GeneralEquipmentContainer newGeneralEquipmentContainer ) {
		if (newGeneralEquipmentContainer != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER && newGeneralEquipmentContainer != null)) {
			if (EcoreUtil.isAncestor(this, newGeneralEquipmentContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGeneralEquipmentContainer != null)
				msgs = ((InternalEObject)newGeneralEquipmentContainer).eInverseAdd(this, SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, GeneralEquipmentContainer.class, msgs);
			msgs = basicSetGeneralEquipmentContainer(newGeneralEquipmentContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER, newGeneralEquipmentContainer, newGeneralEquipmentContainer));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SubFunction getSubFunction() {
		if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION) return null;
		return (SubFunction)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSubFunction( SubFunction newSubFunction, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newSubFunction, SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSubFunction( SubFunction newSubFunction ) {
		if (newSubFunction != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION && newSubFunction != null)) {
			if (EcoreUtil.isAncestor(this, newSubFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSubFunction != null)
				msgs = ((InternalEObject)newSubFunction).eInverseAdd(this, SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT, SubFunction.class, msgs);
			msgs = basicSetSubFunction(newSubFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION, newSubFunction, newSubFunction));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEquipment_type_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv GeneralEquipment_type_required:
		 *   let
		 *     severity : Integer[1] = 'GeneralEquipment::GeneralEquipment_type_required'.getSeverity()
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
		 *             Tuple{message = 'type attribute shall be present in GeneralEquipment (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'GeneralEquipment::GeneralEquipment_type_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_GeneralEquipment_c_c_GeneralEquipment_type_required);
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
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_type_32_attribute_32_shall_32_be_32_present_32_in_32_GeneralEquipment_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_GeneralEquipment_c_c_GeneralEquipment_type_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEquipment_type_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv GeneralEquipment_type_valid:
		 *   let
		 *     severity : Integer[1] = 'GeneralEquipment::GeneralEquipment_type_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.type <> null implies
		 *           self.validSclGeneralEquipmentEnum(type)
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'type attribute shall be valid in GeneralEquipment (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.type.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'GeneralEquipment::GeneralEquipment_type_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_GeneralEquipment_c_c_GeneralEquipment_type_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ String type_0 = this.getType();
				final /*@NonInvalid*/ boolean ne = type_0 != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@Thrown*/ boolean validSclGeneralEquipmentEnum = ((SclObject)this).validSclGeneralEquipmentEnum(type_0);
					status = validSclGeneralEquipmentEnum;
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
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_type_32_attribute_32_shall_32_be_32_valid_32_in_32_GeneralEquipment_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(type_0);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_GeneralEquipment_c_c_GeneralEquipment_type_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)otherEnd, msgs);
			case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEqFunction()).basicAdd(otherEnd, msgs);
			case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEquipmentContainer((EquipmentContainer)otherEnd, msgs);
			case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFunction((Function)otherEnd, msgs);
			case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGeneralEquipmentContainer((GeneralEquipmentContainer)otherEnd, msgs);
			case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSubFunction((SubFunction)otherEnd, msgs);
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
			case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
				return basicSetAbstractEqFuncSubFunc(null, msgs);
			case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
				return ((InternalEList<?>)getEqFunction()).basicRemove(otherEnd, msgs);
			case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
				return basicSetEquipmentContainer(null, msgs);
			case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
				return basicSetFunction(null, msgs);
			case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
				return basicSetGeneralEquipmentContainer(null, msgs);
			case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
				return basicSetSubFunction(null, msgs);
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
			case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
				return eInternalContainer().eInverseRemove(this, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT, AbstractEqFuncSubFunc.class, msgs);
			case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
				return eInternalContainer().eInverseRemove(this, SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, EquipmentContainer.class, msgs);
			case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
				return eInternalContainer().eInverseRemove(this, SclPackage.FUNCTION__GENERAL_EQUIPMENT, Function.class, msgs);
			case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
				return eInternalContainer().eInverseRemove(this, SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, GeneralEquipmentContainer.class, msgs);
			case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
				return eInternalContainer().eInverseRemove(this, SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT, SubFunction.class, msgs);
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
			case SclPackage.GENERAL_EQUIPMENT__TYPE:
				return getType();
			case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
				return getAbstractEqFuncSubFunc();
			case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
				return getEqFunction();
			case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
				return getEquipmentContainer();
			case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
				return getFunction();
			case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
				return getGeneralEquipmentContainer();
			case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
				return getSubFunction();
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
			case SclPackage.GENERAL_EQUIPMENT__TYPE:
				setType((String)newValue);
				return;
			case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
				setAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)newValue);
				return;
			case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
				getEqFunction().clear();
				getEqFunction().addAll((Collection<? extends EqFunction>)newValue);
				return;
			case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
				setEquipmentContainer((EquipmentContainer)newValue);
				return;
			case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
				setFunction((Function)newValue);
				return;
			case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
				setGeneralEquipmentContainer((GeneralEquipmentContainer)newValue);
				return;
			case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
				setSubFunction((SubFunction)newValue);
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
			case SclPackage.GENERAL_EQUIPMENT__TYPE:
				unsetType();
				return;
			case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
				setAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)null);
				return;
			case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
				unsetEqFunction();
				return;
			case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
				setEquipmentContainer((EquipmentContainer)null);
				return;
			case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
				setFunction((Function)null);
				return;
			case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
				setGeneralEquipmentContainer((GeneralEquipmentContainer)null);
				return;
			case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
				setSubFunction((SubFunction)null);
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
			case SclPackage.GENERAL_EQUIPMENT__TYPE:
				return isSetType();
			case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
				return getAbstractEqFuncSubFunc() != null;
			case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
				return isSetEqFunction();
			case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
				return getEquipmentContainer() != null;
			case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
				return getFunction() != null;
			case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
				return getGeneralEquipmentContainer() != null;
			case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
				return getSubFunction() != null;
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
			case SclPackage.GENERAL_EQUIPMENT___VALIDATE_GENERAL_EQUIPMENT_TYPE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateGeneralEquipment_type_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.GENERAL_EQUIPMENT___VALIDATE_GENERAL_EQUIPMENT_TYPE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateGeneralEquipment_type_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GeneralEquipmentImpl
