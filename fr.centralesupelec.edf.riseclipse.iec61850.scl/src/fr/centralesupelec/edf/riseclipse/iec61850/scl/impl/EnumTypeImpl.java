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
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EnumTypeImpl#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EnumTypeImpl#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EnumTypeImpl#getEnumVal <em>Enum Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumTypeImpl extends IDNamingImpl implements EnumType {
    /**
	 * The cached value of the '{@link #getReferredByAbstractDataAttribute() <em>Referred By Abstract Data Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReferredByAbstractDataAttribute()
	 * @generated
	 * @ordered
	 */
    protected EList<AbstractDataAttribute> referredByAbstractDataAttribute;

    /**
	 * The cached value of the '{@link #getEnumVal() <em>Enum Val</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEnumVal()
	 * @generated
	 * @ordered
	 */
    protected EList<EnumVal> enumVal;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected EnumTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getEnumType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<AbstractDataAttribute> getReferredByAbstractDataAttribute() {
		if (referredByAbstractDataAttribute == null) {
			referredByAbstractDataAttribute = new EObjectWithInverseEList.Unsettable<AbstractDataAttribute>(AbstractDataAttribute.class, this, SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE);
		}
		return referredByAbstractDataAttribute;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetReferredByAbstractDataAttribute() {
		if (referredByAbstractDataAttribute != null) ((InternalEList.Unsettable<?>)referredByAbstractDataAttribute).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetReferredByAbstractDataAttribute() {
		return referredByAbstractDataAttribute != null && ((InternalEList.Unsettable<?>)referredByAbstractDataAttribute).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataTypeTemplates getDataTypeTemplates() {
		if (eContainerFeatureID() != SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES) return null;
		return (DataTypeTemplates)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDataTypeTemplates( DataTypeTemplates newDataTypeTemplates, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newDataTypeTemplates, SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataTypeTemplates( DataTypeTemplates newDataTypeTemplates ) {
		if (newDataTypeTemplates != eInternalContainer() || (eContainerFeatureID() != SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES && newDataTypeTemplates != null)) {
			if (EcoreUtil.isAncestor(this, newDataTypeTemplates))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataTypeTemplates != null)
				msgs = ((InternalEObject)newDataTypeTemplates).eInverseAdd(this, SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE, DataTypeTemplates.class, msgs);
			msgs = basicSetDataTypeTemplates(newDataTypeTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES, newDataTypeTemplates, newDataTypeTemplates));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<EnumVal> getEnumVal() {
		if (enumVal == null) {
			enumVal = new EObjectContainmentWithInverseEList.Unsettable<EnumVal>(EnumVal.class, this, SclPackage.ENUM_TYPE__ENUM_VAL, SclPackage.ENUM_VAL__ENUM_TYPE);
		}
		return enumVal;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetEnumVal() {
		if (enumVal != null) ((InternalEList.Unsettable<?>)enumVal).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetEnumVal() {
		return enumVal != null && ((InternalEList.Unsettable<?>)enumVal).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumType_nothing(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv EnumType_nothing: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumType_at_least_one_EnumVal_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv EnumType_at_least_one_EnumVal_required:
		 *   let
		 *     severity : Integer[1] = 'EnumType::EnumType_at_least_one_EnumVal_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = self.EnumVal->notEmpty()
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'EnumType shall contain at least one EnumVal (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'EnumType::EnumType_at_least_one_EnumVal_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_EnumType_c_c_EnumType_at_least_one_EnumVal_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<EnumVal> EnumVal = this.getEnumVal();
			final /*@NonInvalid*/ SetValue BOXED_EnumVal = idResolver.createSetOfAll(SclTables.SET_CLSSid_EnumVal, EnumVal);
			final /*@NonInvalid*/ boolean status = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_EnumVal).booleanValue();
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_EnumType_32_shall_32_contain_32_at_32_least_32_one_32_EnumVal_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_EnumType_c_c_EnumType_at_least_one_EnumVal_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByAbstractDataAttribute()).basicAdd(otherEnd, msgs);
			case SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataTypeTemplates((DataTypeTemplates)otherEnd, msgs);
			case SclPackage.ENUM_TYPE__ENUM_VAL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumVal()).basicAdd(otherEnd, msgs);
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
			case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
				return ((InternalEList<?>)getReferredByAbstractDataAttribute()).basicRemove(otherEnd, msgs);
			case SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES:
				return basicSetDataTypeTemplates(null, msgs);
			case SclPackage.ENUM_TYPE__ENUM_VAL:
				return ((InternalEList<?>)getEnumVal()).basicRemove(otherEnd, msgs);
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
			case SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES:
				return eInternalContainer().eInverseRemove(this, SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE, DataTypeTemplates.class, msgs);
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
			case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
				return getReferredByAbstractDataAttribute();
			case SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES:
				return getDataTypeTemplates();
			case SclPackage.ENUM_TYPE__ENUM_VAL:
				return getEnumVal();
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
			case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
				getReferredByAbstractDataAttribute().clear();
				getReferredByAbstractDataAttribute().addAll((Collection<? extends AbstractDataAttribute>)newValue);
				return;
			case SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES:
				setDataTypeTemplates((DataTypeTemplates)newValue);
				return;
			case SclPackage.ENUM_TYPE__ENUM_VAL:
				getEnumVal().clear();
				getEnumVal().addAll((Collection<? extends EnumVal>)newValue);
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
			case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
				unsetReferredByAbstractDataAttribute();
				return;
			case SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES:
				setDataTypeTemplates((DataTypeTemplates)null);
				return;
			case SclPackage.ENUM_TYPE__ENUM_VAL:
				unsetEnumVal();
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
			case SclPackage.ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
				return isSetReferredByAbstractDataAttribute();
			case SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES:
				return getDataTypeTemplates() != null;
			case SclPackage.ENUM_TYPE__ENUM_VAL:
				return isSetEnumVal();
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
			case SclPackage.ENUM_TYPE___VALIDATE_ENUM_TYPE_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateEnumType_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.ENUM_TYPE___VALIDATE_ENUM_TYPE_AT_LEAST_ONE_ENUM_VAL_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateEnumType_at_least_one_EnumVal_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnumTypeImpl
