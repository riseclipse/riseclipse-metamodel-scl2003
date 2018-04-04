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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataObjectImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataObjectImpl#getReferredByFCDA <em>Referred By FCDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataObjectImpl#getReferredByExtRef <em>Referred By Ext Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataObjectImpl extends UnNamingImpl implements DataObject {
    /**
	 * The default value of the '{@link #getAccessControl() <em>Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
    protected static final String ACCESS_CONTROL_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
    protected String accessControl = ACCESS_CONTROL_EDEFAULT;

    /**
	 * This is true if the Access Control attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean accessControlESet;

    /**
	 * The cached value of the '{@link #getReferredByFCDA() <em>Referred By FCDA</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReferredByFCDA()
	 * @generated
	 * @ordered
	 */
    protected EList<FCDA> referredByFCDA;

    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean nameESet;

    /**
	 * The cached value of the '{@link #getReferredByExtRef() <em>Referred By Ext Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReferredByExtRef()
	 * @generated
	 * @ordered
	 */
    protected EList<ExtRef> referredByExtRef;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DataObjectImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getDataObject();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getAccessControl() {
		return accessControl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAccessControl( String newAccessControl ) {
		String oldAccessControl = accessControl;
		accessControl = newAccessControl;
		boolean oldAccessControlESet = accessControlESet;
		accessControlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DATA_OBJECT__ACCESS_CONTROL, oldAccessControl, accessControl, !oldAccessControlESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetAccessControl() {
		String oldAccessControl = accessControl;
		boolean oldAccessControlESet = accessControlESet;
		accessControl = ACCESS_CONTROL_EDEFAULT;
		accessControlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DATA_OBJECT__ACCESS_CONTROL, oldAccessControl, ACCESS_CONTROL_EDEFAULT, oldAccessControlESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetAccessControl() {
		return accessControlESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<FCDA> getReferredByFCDA() {
		if (referredByFCDA == null) {
			referredByFCDA = new EObjectWithInverseEList.Unsettable<FCDA>(FCDA.class, this, SclPackage.DATA_OBJECT__REFERRED_BY_FCDA, SclPackage.FCDA__REFERS_TO_DATA_OBJECT);
		}
		return referredByFCDA;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetReferredByFCDA() {
		if (referredByFCDA != null) ((InternalEList.Unsettable<?>)referredByFCDA).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetReferredByFCDA() {
		return referredByFCDA != null && ((InternalEList.Unsettable<?>)referredByFCDA).isSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DATA_OBJECT__NAME, oldName, name, !oldNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DATA_OBJECT__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetName() {
		return nameESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ExtRef> getReferredByExtRef() {
		if (referredByExtRef == null) {
			referredByExtRef = new EObjectWithInverseEList.Unsettable<ExtRef>(ExtRef.class, this, SclPackage.DATA_OBJECT__REFERRED_BY_EXT_REF, SclPackage.EXT_REF__REFERS_TO_DATA_OBJECT);
		}
		return referredByExtRef;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetReferredByExtRef() {
		if (referredByExtRef != null) ((InternalEList.Unsettable<?>)referredByExtRef).unset();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetReferredByExtRef() {
		return referredByExtRef != null && ((InternalEList.Unsettable<?>)referredByExtRef).isSet();
	}

    /**
	 * The cached validation expression for the '{@link #validateDataObject_name_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Object name required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataObject_name_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATA_OBJECT_NAME_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'name attribute shall be present in ' + self.oclType().toString() + ' (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.name <> null\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObject_name_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getDataObject(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getDataObject__ValidateDataObject_name_required__DiagnosticChain_Map(),
				 VALIDATE_DATA_OBJECT_NAME_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.DATA_OBJECT__VALIDATE_DATA_OBJECT_NAME_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateDataObject_name_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Object name valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDataObject_name_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATA_OBJECT_NAME_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'name attribute shall be valid in ' + self.oclType().toString() + ' (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.name.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.name <> null implies self.validSclDataName( name )\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObject_name_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getDataObject(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getDataObject__ValidateDataObject_name_valid__DiagnosticChain_Map(),
				 VALIDATE_DATA_OBJECT_NAME_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.DATA_OBJECT__VALIDATE_DATA_OBJECT_NAME_VALID);
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
			case SclPackage.DATA_OBJECT__REFERRED_BY_FCDA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByFCDA()).basicAdd(otherEnd, msgs);
			case SclPackage.DATA_OBJECT__REFERRED_BY_EXT_REF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByExtRef()).basicAdd(otherEnd, msgs);
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
			case SclPackage.DATA_OBJECT__REFERRED_BY_FCDA:
				return ((InternalEList<?>)getReferredByFCDA()).basicRemove(otherEnd, msgs);
			case SclPackage.DATA_OBJECT__REFERRED_BY_EXT_REF:
				return ((InternalEList<?>)getReferredByExtRef()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
		switch (featureID) {
			case SclPackage.DATA_OBJECT__ACCESS_CONTROL:
				return getAccessControl();
			case SclPackage.DATA_OBJECT__REFERRED_BY_FCDA:
				return getReferredByFCDA();
			case SclPackage.DATA_OBJECT__NAME:
				return getName();
			case SclPackage.DATA_OBJECT__REFERRED_BY_EXT_REF:
				return getReferredByExtRef();
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
			case SclPackage.DATA_OBJECT__ACCESS_CONTROL:
				setAccessControl((String)newValue);
				return;
			case SclPackage.DATA_OBJECT__REFERRED_BY_FCDA:
				getReferredByFCDA().clear();
				getReferredByFCDA().addAll((Collection<? extends FCDA>)newValue);
				return;
			case SclPackage.DATA_OBJECT__NAME:
				setName((String)newValue);
				return;
			case SclPackage.DATA_OBJECT__REFERRED_BY_EXT_REF:
				getReferredByExtRef().clear();
				getReferredByExtRef().addAll((Collection<? extends ExtRef>)newValue);
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
			case SclPackage.DATA_OBJECT__ACCESS_CONTROL:
				unsetAccessControl();
				return;
			case SclPackage.DATA_OBJECT__REFERRED_BY_FCDA:
				unsetReferredByFCDA();
				return;
			case SclPackage.DATA_OBJECT__NAME:
				unsetName();
				return;
			case SclPackage.DATA_OBJECT__REFERRED_BY_EXT_REF:
				unsetReferredByExtRef();
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
			case SclPackage.DATA_OBJECT__ACCESS_CONTROL:
				return isSetAccessControl();
			case SclPackage.DATA_OBJECT__REFERRED_BY_FCDA:
				return isSetReferredByFCDA();
			case SclPackage.DATA_OBJECT__NAME:
				return isSetName();
			case SclPackage.DATA_OBJECT__REFERRED_BY_EXT_REF:
				return isSetReferredByExtRef();
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
			case SclPackage.DATA_OBJECT___VALIDATE_DATA_OBJECT_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateDataObject_name_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.DATA_OBJECT___VALIDATE_DATA_OBJECT_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateDataObject_name_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (accessControl: ");
		if (accessControlESet) result.append(accessControl); else result.append("<unset>");
		result.append(", name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataObjectImpl
