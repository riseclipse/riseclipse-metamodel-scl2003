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

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertImpl#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertImpl#getIdHierarchy <em>Id Hierarchy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertImpl extends SclObjectImpl implements Cert {
    /**
	 * The default value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCommonName()
	 * @generated
	 * @ordered
	 */
    protected static final String COMMON_NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCommonName()
	 * @generated
	 * @ordered
	 */
    protected String commonName = COMMON_NAME_EDEFAULT;

    /**
	 * This is true if the Common Name attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean commonNameESet;

    /**
	 * The default value of the '{@link #getIdHierarchy() <em>Id Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIdHierarchy()
	 * @generated
	 * @ordered
	 */
    protected static final String ID_HIERARCHY_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getIdHierarchy() <em>Id Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIdHierarchy()
	 * @generated
	 * @ordered
	 */
    protected String idHierarchy = ID_HIERARCHY_EDEFAULT;

    /**
	 * This is true if the Id Hierarchy attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean idHierarchyESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected CertImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getCert();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getCommonName() {
		return commonName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCommonName(String newCommonName) {
		String oldCommonName = commonName;
		commonName = newCommonName;
		boolean oldCommonNameESet = commonNameESet;
		commonNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CERT__COMMON_NAME, oldCommonName, commonName, !oldCommonNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetCommonName() {
		String oldCommonName = commonName;
		boolean oldCommonNameESet = commonNameESet;
		commonName = COMMON_NAME_EDEFAULT;
		commonNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CERT__COMMON_NAME, oldCommonName, COMMON_NAME_EDEFAULT, oldCommonNameESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetCommonName() {
		return commonNameESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getIdHierarchy() {
		return idHierarchy;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIdHierarchy(String newIdHierarchy) {
		String oldIdHierarchy = idHierarchy;
		idHierarchy = newIdHierarchy;
		boolean oldIdHierarchyESet = idHierarchyESet;
		idHierarchyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CERT__ID_HIERARCHY, oldIdHierarchy, idHierarchy, !oldIdHierarchyESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetIdHierarchy() {
		String oldIdHierarchy = idHierarchy;
		boolean oldIdHierarchyESet = idHierarchyESet;
		idHierarchy = ID_HIERARCHY_EDEFAULT;
		idHierarchyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CERT__ID_HIERARCHY, oldIdHierarchy, ID_HIERARCHY_EDEFAULT, oldIdHierarchyESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetIdHierarchy() {
		return idHierarchyESet;
	}

    /**
	 * The cached validation expression for the '{@link #validateCert_commonName_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cert common Name required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCert_commonName_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CERT_COMMON_NAME_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'commonName attribute shall be present in Cert (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.commonName <> null\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCert_commonName_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getCert(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getCert__ValidateCert_commonName_required__DiagnosticChain_Map(),
				 VALIDATE_CERT_COMMON_NAME_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.CERT__VALIDATE_CERT_COMMON_NAME_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateCert_commonName_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cert common Name valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCert_commonName_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CERT_COMMON_NAME_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'commonName attribute shall be valid in Cert (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.commonName.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.commonName <> null\n" +
		"        implies\n" +
		"        ( self.commonName = 'none' or ( self.commonName.matches( '.+' ) and self.commonName.size() >= 4 ))\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCert_commonName_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getCert(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getCert__ValidateCert_commonName_valid__DiagnosticChain_Map(),
				 VALIDATE_CERT_COMMON_NAME_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.CERT__VALIDATE_CERT_COMMON_NAME_VALID);
	}

				/**
	 * The cached validation expression for the '{@link #validateCert_idHierarchy_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cert id Hierarchy required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCert_idHierarchy_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CERT_ID_HIERARCHY_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'idHierarchy attribute shall be present in Cert (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.idHierarchy <> null\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCert_idHierarchy_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getCert(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getCert__ValidateCert_idHierarchy_required__DiagnosticChain_Map(),
				 VALIDATE_CERT_ID_HIERARCHY_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.CERT__VALIDATE_CERT_ID_HIERARCHY_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateCert_idHierarchy_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cert id Hierarchy valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCert_idHierarchy_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CERT_ID_HIERARCHY_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'idHierarchy attribute shall be valid in Cert (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.idHierarchy.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.idHierarchy <> null implies self.idHierarchy.size() > 0\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCert_idHierarchy_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getCert(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getCert__ValidateCert_idHierarchy_valid__DiagnosticChain_Map(),
				 VALIDATE_CERT_ID_HIERARCHY_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.CERT__VALIDATE_CERT_ID_HIERARCHY_VALID);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.CERT__COMMON_NAME:
				return getCommonName();
			case SclPackage.CERT__ID_HIERARCHY:
				return getIdHierarchy();
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
			case SclPackage.CERT__COMMON_NAME:
				setCommonName((String)newValue);
				return;
			case SclPackage.CERT__ID_HIERARCHY:
				setIdHierarchy((String)newValue);
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
			case SclPackage.CERT__COMMON_NAME:
				unsetCommonName();
				return;
			case SclPackage.CERT__ID_HIERARCHY:
				unsetIdHierarchy();
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
			case SclPackage.CERT__COMMON_NAME:
				return isSetCommonName();
			case SclPackage.CERT__ID_HIERARCHY:
				return isSetIdHierarchy();
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
			case SclPackage.CERT___VALIDATE_CERT_COMMON_NAME_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateCert_commonName_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CERT___VALIDATE_CERT_COMMON_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateCert_commonName_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CERT___VALIDATE_CERT_ID_HIERARCHY_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateCert_idHierarchy_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.CERT___VALIDATE_CERT_ID_HIERARCHY_VALID__DIAGNOSTICCHAIN_MAP:
				return validateCert_idHierarchy_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (commonName: ");
		if (commonNameESet) result.append(commonName); else result.append("<unset>");
		result.append(", idHierarchy: ");
		if (idHierarchyESet) result.append(idHierarchy); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CertImpl
