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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
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
	 * The cached validation expression for the '{@link #validateEnumType_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Enum Type nothing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEnumType_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENUM_TYPE_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"        true\n" +
		"\n" +
		"\n" +
		"";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumType_nothing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getEnumType(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getEnumType__ValidateEnumType_nothing__DiagnosticChain_Map(),
				 VALIDATE_ENUM_TYPE_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.ENUM_TYPE__VALIDATE_ENUM_TYPE_NOTHING);
	}

				/**
	 * The cached validation expression for the '{@link #validateEnumType_at_least_one_EnumVal_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Enum Type at least one Enum Val required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEnumType_at_least_one_EnumVal_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENUM_TYPE_AT_LEAST_ONE_ENUM_VAL_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'EnumType shall contain at least one EnumVal (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.EnumVal->notEmpty()\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumType_at_least_one_EnumVal_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getEnumType(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getEnumType__ValidateEnumType_at_least_one_EnumVal_required__DiagnosticChain_Map(),
				 VALIDATE_ENUM_TYPE_AT_LEAST_ONE_ENUM_VAL_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.ENUM_TYPE__VALIDATE_ENUM_TYPE_AT_LEAST_ONE_ENUM_VAL_REQUIRED);
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
