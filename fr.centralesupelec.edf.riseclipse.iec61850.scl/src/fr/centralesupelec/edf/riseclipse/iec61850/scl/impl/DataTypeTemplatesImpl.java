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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Templates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl#getDAType <em>DA Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl#getDOType <em>DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl#getEnumType <em>Enum Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl#getLNodeType <em>LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl#getSCL <em>SCL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeTemplatesImpl extends ExplicitLinkResolverImpl implements DataTypeTemplates {
    /**
	 * The cached value of the '{@link #getDAType() <em>DA Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDAType()
	 * @generated
	 * @ordered
	 */
    protected EList<DAType> daType;

    /**
	 * The cached value of the '{@link #getDOType() <em>DO Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDOType()
	 * @generated
	 * @ordered
	 */
    protected EList<DOType> doType;

    /**
	 * The cached value of the '{@link #getEnumType() <em>Enum Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEnumType()
	 * @generated
	 * @ordered
	 */
    protected EList<EnumType> enumType;

    /**
	 * The cached value of the '{@link #getLNodeType() <em>LNode Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLNodeType()
	 * @generated
	 * @ordered
	 */
    protected EList<LNodeType> lNodeType;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DataTypeTemplatesImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.DATA_TYPE_TEMPLATES;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DAType> getDAType() {
		if (daType == null) {
			daType = new EObjectContainmentWithInverseEList.Unsettable<DAType>(DAType.class, this, SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE, SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES);
		}
		return daType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetDAType() {
		if (daType != null) ((InternalEList.Unsettable<?>)daType).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetDAType() {
		return daType != null && ((InternalEList.Unsettable<?>)daType).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DOType> getDOType() {
		if (doType == null) {
			doType = new EObjectContainmentWithInverseEList.Unsettable<DOType>(DOType.class, this, SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE, SclPackage.DO_TYPE__DATA_TYPE_TEMPLATES);
		}
		return doType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetDOType() {
		if (doType != null) ((InternalEList.Unsettable<?>)doType).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetDOType() {
		return doType != null && ((InternalEList.Unsettable<?>)doType).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<EnumType> getEnumType() {
		if (enumType == null) {
			enumType = new EObjectContainmentWithInverseEList.Unsettable<EnumType>(EnumType.class, this, SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE, SclPackage.ENUM_TYPE__DATA_TYPE_TEMPLATES);
		}
		return enumType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetEnumType() {
		if (enumType != null) ((InternalEList.Unsettable<?>)enumType).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetEnumType() {
		return enumType != null && ((InternalEList.Unsettable<?>)enumType).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<LNodeType> getLNodeType() {
		if (lNodeType == null) {
			lNodeType = new EObjectContainmentWithInverseEList.Unsettable<LNodeType>(LNodeType.class, this, SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE, SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES);
		}
		return lNodeType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetLNodeType() {
		if (lNodeType != null) ((InternalEList.Unsettable<?>)lNodeType).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetLNodeType() {
		return lNodeType != null && ((InternalEList.Unsettable<?>)lNodeType).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SCL getSCL() {
		if (eContainerFeatureID() != SclPackage.DATA_TYPE_TEMPLATES__SCL) return null;
		return (SCL)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSCL( SCL newSCL, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newSCL, SclPackage.DATA_TYPE_TEMPLATES__SCL, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSCL( SCL newSCL ) {
		if (newSCL != eInternalContainer() || (eContainerFeatureID() != SclPackage.DATA_TYPE_TEMPLATES__SCL && newSCL != null)) {
			if (EcoreUtil.isAncestor(this, newSCL))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSCL != null)
				msgs = ((InternalEObject)newSCL).eInverseAdd(this, SclPackage.SCL__DATA_TYPE_TEMPLATES, SCL.class, msgs);
			msgs = basicSetSCL(newSCL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DATA_TYPE_TEMPLATES__SCL, newSCL, newSCL));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTemplates_nothing(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv DataTypeTemplates_nothing: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTemplates_at_least_one_LNodeType_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DataTypeTemplates_at_least_one_LNodeType_required:
		 *   let
		 *     severity : Integer[1] = 'DataTypeTemplates::DataTypeTemplates_at_least_one_LNodeType_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let
		 *           status : Boolean[1] = self.LNodeType->notEmpty()
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'DataTypeTemplates shall contain at least one LNodeType (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'DataTypeTemplates::DataTypeTemplates_at_least_one_LNodeType_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DataTypeTemplates_c_c_DataTypeTemplates_at_least_one_LNodeType_requ);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<LNodeType> LNodeType = this.getLNodeType();
			final /*@NonInvalid*/ SetValue BOXED_LNodeType = idResolver.createSetOfAll(SclTables.SET_CLSSid_LNodeType, LNodeType);
			final /*@NonInvalid*/ boolean status = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_LNodeType).booleanValue();
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_DataTypeTemplates_32_shall_32_contain_32_at_32_least_32_one_32_LNodeType_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DataTypeTemplates_c_c_DataTypeTemplates_at_least_one_LNodeType_requ, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTemplates_at_least_one_DOType_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DataTypeTemplates_at_least_one_DOType_required:
		 *   let
		 *     severity : Integer[1] = 'DataTypeTemplates::DataTypeTemplates_at_least_one_DOType_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.DOType->notEmpty()
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'DataTypeTemplates shall contain at least one DOType (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'DataTypeTemplates::DataTypeTemplates_at_least_one_DOType_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DataTypeTemplates_c_c_DataTypeTemplates_at_least_one_DOType_require);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<DOType> DOType = this.getDOType();
			final /*@NonInvalid*/ SetValue BOXED_DOType = idResolver.createSetOfAll(SclTables.SET_CLSSid_DOType, DOType);
			final /*@NonInvalid*/ boolean status = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_DOType).booleanValue();
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_DataTypeTemplates_32_shall_32_contain_32_at_32_least_32_one_32_DOType_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DataTypeTemplates_c_c_DataTypeTemplates_at_least_one_DOType_require, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDAType()).basicAdd(otherEnd, msgs);
			case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDOType()).basicAdd(otherEnd, msgs);
			case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumType()).basicAdd(otherEnd, msgs);
			case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLNodeType()).basicAdd(otherEnd, msgs);
			case SclPackage.DATA_TYPE_TEMPLATES__SCL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSCL((SCL)otherEnd, msgs);
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
			case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
				return ((InternalEList<?>)getDAType()).basicRemove(otherEnd, msgs);
			case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
				return ((InternalEList<?>)getDOType()).basicRemove(otherEnd, msgs);
			case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
				return ((InternalEList<?>)getEnumType()).basicRemove(otherEnd, msgs);
			case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
				return ((InternalEList<?>)getLNodeType()).basicRemove(otherEnd, msgs);
			case SclPackage.DATA_TYPE_TEMPLATES__SCL:
				return basicSetSCL(null, msgs);
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
			case SclPackage.DATA_TYPE_TEMPLATES__SCL:
				return eInternalContainer().eInverseRemove(this, SclPackage.SCL__DATA_TYPE_TEMPLATES, SCL.class, msgs);
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
			case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
				return getDAType();
			case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
				return getDOType();
			case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
				return getEnumType();
			case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
				return getLNodeType();
			case SclPackage.DATA_TYPE_TEMPLATES__SCL:
				return getSCL();
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
			case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
				getDAType().clear();
				getDAType().addAll((Collection<? extends DAType>)newValue);
				return;
			case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
				getDOType().clear();
				getDOType().addAll((Collection<? extends DOType>)newValue);
				return;
			case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
				getEnumType().clear();
				getEnumType().addAll((Collection<? extends EnumType>)newValue);
				return;
			case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
				getLNodeType().clear();
				getLNodeType().addAll((Collection<? extends LNodeType>)newValue);
				return;
			case SclPackage.DATA_TYPE_TEMPLATES__SCL:
				setSCL((SCL)newValue);
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
			case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
				unsetDAType();
				return;
			case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
				unsetDOType();
				return;
			case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
				unsetEnumType();
				return;
			case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
				unsetLNodeType();
				return;
			case SclPackage.DATA_TYPE_TEMPLATES__SCL:
				setSCL((SCL)null);
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
			case SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE:
				return isSetDAType();
			case SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE:
				return isSetDOType();
			case SclPackage.DATA_TYPE_TEMPLATES__ENUM_TYPE:
				return isSetEnumType();
			case SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE:
				return isSetLNodeType();
			case SclPackage.DATA_TYPE_TEMPLATES__SCL:
				return getSCL() != null;
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
			case SclPackage.DATA_TYPE_TEMPLATES___VALIDATE_DATA_TYPE_TEMPLATES_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateDataTypeTemplates_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.DATA_TYPE_TEMPLATES___VALIDATE_DATA_TYPE_TEMPLATES_AT_LEAST_ONE_LNODE_TYPE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateDataTypeTemplates_at_least_one_LNodeType_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.DATA_TYPE_TEMPLATES___VALIDATE_DATA_TYPE_TEMPLATES_AT_LEAST_ONE_DO_TYPE_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateDataTypeTemplates_at_least_one_DOType_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataTypeTemplatesImpl
