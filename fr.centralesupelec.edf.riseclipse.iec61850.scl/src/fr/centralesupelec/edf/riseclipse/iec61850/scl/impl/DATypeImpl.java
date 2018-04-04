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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DA Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl#getBDA <em>BDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl#getReferredByDA <em>Referred By DA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl#getProtNs <em>Prot Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DATypeImpl extends IDNamingImpl implements DAType {
    /**
	 * The default value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIedType()
	 * @generated
	 * @ordered
	 */
    protected static final String IED_TYPE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIedType()
	 * @generated
	 * @ordered
	 */
    protected String iedType = IED_TYPE_EDEFAULT;

    /**
	 * This is true if the Ied Type attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean iedTypeESet;

    /**
	 * The cached value of the '{@link #getBDA() <em>BDA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBDA()
	 * @generated
	 * @ordered
	 */
    protected EList<BDA> bda;

    /**
	 * The cached value of the '{@link #getReferredByDA() <em>Referred By DA</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReferredByDA()
	 * @generated
	 * @ordered
	 */
    protected EList<DA> referredByDA;

    /**
	 * The cached value of the '{@link #getProtNs() <em>Prot Ns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProtNs()
	 * @generated
	 * @ordered
	 */
    protected EList<ProtNs> protNs;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DATypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getDAType();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getIedType() {
		return iedType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIedType( String newIedType ) {
		String oldIedType = iedType;
		iedType = newIedType;
		boolean oldIedTypeESet = iedTypeESet;
		iedTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DA_TYPE__IED_TYPE, oldIedType, iedType, !oldIedTypeESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetIedType() {
		String oldIedType = iedType;
		boolean oldIedTypeESet = iedTypeESet;
		iedType = IED_TYPE_EDEFAULT;
		iedTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DA_TYPE__IED_TYPE, oldIedType, IED_TYPE_EDEFAULT, oldIedTypeESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetIedType() {
		return iedTypeESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<BDA> getBDA() {
		if (bda == null) {
			bda = new EObjectContainmentWithInverseEList.Unsettable<BDA>(BDA.class, this, SclPackage.DA_TYPE__BDA, SclPackage.BDA__DA_TYPE);
		}
		return bda;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetBDA() {
		if (bda != null) ((InternalEList.Unsettable<?>)bda).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetBDA() {
		return bda != null && ((InternalEList.Unsettable<?>)bda).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DA> getReferredByDA() {
		if (referredByDA == null) {
			referredByDA = new EObjectWithInverseEList.Unsettable<DA>(DA.class, this, SclPackage.DA_TYPE__REFERRED_BY_DA, SclPackage.DA__REFERS_TO_DA_TYPE);
		}
		return referredByDA;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetReferredByDA() {
		if (referredByDA != null) ((InternalEList.Unsettable<?>)referredByDA).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetReferredByDA() {
		return referredByDA != null && ((InternalEList.Unsettable<?>)referredByDA).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataTypeTemplates getDataTypeTemplates() {
		if (eContainerFeatureID() != SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES) return null;
		return (DataTypeTemplates)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDataTypeTemplates( DataTypeTemplates newDataTypeTemplates, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newDataTypeTemplates, SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataTypeTemplates( DataTypeTemplates newDataTypeTemplates ) {
		if (newDataTypeTemplates != eInternalContainer() || (eContainerFeatureID() != SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES && newDataTypeTemplates != null)) {
			if (EcoreUtil.isAncestor(this, newDataTypeTemplates))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataTypeTemplates != null)
				msgs = ((InternalEObject)newDataTypeTemplates).eInverseAdd(this, SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE, DataTypeTemplates.class, msgs);
			msgs = basicSetDataTypeTemplates(newDataTypeTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES, newDataTypeTemplates, newDataTypeTemplates));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ProtNs> getProtNs() {
		if (protNs == null) {
			protNs = new EObjectContainmentWithInverseEList.Unsettable<ProtNs>(ProtNs.class, this, SclPackage.DA_TYPE__PROT_NS, SclPackage.PROT_NS__DA_TYPE);
		}
		return protNs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetProtNs() {
		if (protNs != null) ((InternalEList.Unsettable<?>)protNs).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetProtNs() {
		return protNs != null && ((InternalEList.Unsettable<?>)protNs).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAType_nothing(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv DAType_nothing: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAType_at_least_one_BDA_required(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv DAType_at_least_one_BDA_required:
		 *   let
		 *     severity : Integer[1] = 'DAType::DAType_at_least_one_BDA_required'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[1] = self.BDA->notEmpty()
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'DAType shall contain at least one BDA (line ' +
		 *               self.lineNumber.toString() + ')', status = status
		 *             }
		 *           endif
		 *       in
		 *         'DAType::DAType_at_least_one_BDA_required'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_DAType_c_c_DAType_at_least_one_BDA_required);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<BDA> BDA = this.getBDA();
			final /*@NonInvalid*/ SetValue BOXED_BDA = idResolver.createSetOfAll(SclTables.SET_CLSSid_BDA, BDA);
			final /*@NonInvalid*/ boolean status = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_BDA).booleanValue();
			/*@NonInvalid*/ Object symbol_1;
			if (status) {
				symbol_1 = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
				final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
				final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
				final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_DAType_32_shall_32_contain_32_at_32_least_32_one_32_BDA_32_o_line_32, toString);
				final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e);
				final /*@NonInvalid*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_0, status);
				symbol_1 = symbol_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_DAType_c_c_DAType_at_least_one_BDA_required, this, (Object)null, diagnostics, context, (Object)null, severity_0, symbol_1, SclTables.INT_0).booleanValue();
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
			case SclPackage.DA_TYPE__BDA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBDA()).basicAdd(otherEnd, msgs);
			case SclPackage.DA_TYPE__REFERRED_BY_DA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByDA()).basicAdd(otherEnd, msgs);
			case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataTypeTemplates((DataTypeTemplates)otherEnd, msgs);
			case SclPackage.DA_TYPE__PROT_NS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProtNs()).basicAdd(otherEnd, msgs);
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
			case SclPackage.DA_TYPE__BDA:
				return ((InternalEList<?>)getBDA()).basicRemove(otherEnd, msgs);
			case SclPackage.DA_TYPE__REFERRED_BY_DA:
				return ((InternalEList<?>)getReferredByDA()).basicRemove(otherEnd, msgs);
			case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
				return basicSetDataTypeTemplates(null, msgs);
			case SclPackage.DA_TYPE__PROT_NS:
				return ((InternalEList<?>)getProtNs()).basicRemove(otherEnd, msgs);
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
			case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
				return eInternalContainer().eInverseRemove(this, SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE, DataTypeTemplates.class, msgs);
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
			case SclPackage.DA_TYPE__IED_TYPE:
				return getIedType();
			case SclPackage.DA_TYPE__BDA:
				return getBDA();
			case SclPackage.DA_TYPE__REFERRED_BY_DA:
				return getReferredByDA();
			case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
				return getDataTypeTemplates();
			case SclPackage.DA_TYPE__PROT_NS:
				return getProtNs();
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
			case SclPackage.DA_TYPE__IED_TYPE:
				setIedType((String)newValue);
				return;
			case SclPackage.DA_TYPE__BDA:
				getBDA().clear();
				getBDA().addAll((Collection<? extends BDA>)newValue);
				return;
			case SclPackage.DA_TYPE__REFERRED_BY_DA:
				getReferredByDA().clear();
				getReferredByDA().addAll((Collection<? extends DA>)newValue);
				return;
			case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
				setDataTypeTemplates((DataTypeTemplates)newValue);
				return;
			case SclPackage.DA_TYPE__PROT_NS:
				getProtNs().clear();
				getProtNs().addAll((Collection<? extends ProtNs>)newValue);
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
			case SclPackage.DA_TYPE__IED_TYPE:
				unsetIedType();
				return;
			case SclPackage.DA_TYPE__BDA:
				unsetBDA();
				return;
			case SclPackage.DA_TYPE__REFERRED_BY_DA:
				unsetReferredByDA();
				return;
			case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
				setDataTypeTemplates((DataTypeTemplates)null);
				return;
			case SclPackage.DA_TYPE__PROT_NS:
				unsetProtNs();
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
			case SclPackage.DA_TYPE__IED_TYPE:
				return isSetIedType();
			case SclPackage.DA_TYPE__BDA:
				return isSetBDA();
			case SclPackage.DA_TYPE__REFERRED_BY_DA:
				return isSetReferredByDA();
			case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
				return getDataTypeTemplates() != null;
			case SclPackage.DA_TYPE__PROT_NS:
				return isSetProtNs();
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
			case SclPackage.DA_TYPE___VALIDATE_DA_TYPE_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateDAType_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.DA_TYPE___VALIDATE_DA_TYPE_AT_LEAST_ONE_BDA_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateDAType_at_least_one_BDA_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (iedType: ");
		if (iedTypeESet) result.append(iedType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DATypeImpl
