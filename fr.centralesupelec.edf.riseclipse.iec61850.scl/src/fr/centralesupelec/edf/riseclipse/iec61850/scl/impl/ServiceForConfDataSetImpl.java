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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceForConfDataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service For Conf Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceForConfDataSetImpl#getModify <em>Modify</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceForConfDataSetImpl extends ServiceWithMaxAndMaxAttributesImpl implements ServiceForConfDataSet {
    /**
	 * The default value of the '{@link #getModify() <em>Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getModify()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean MODIFY_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getModify() <em>Modify</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getModify()
	 * @generated
	 * @ordered
	 */
    protected Boolean modify = MODIFY_EDEFAULT;

    /**
	 * This is true if the Modify attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean modifyESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ServiceForConfDataSetImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getServiceForConfDataSet();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getModify() {
		return modify;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setModify(Boolean newModify) {
		Boolean oldModify = modify;
		modify = newModify;
		boolean oldModifyESet = modifyESet;
		modifyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICE_FOR_CONF_DATA_SET__MODIFY, oldModify, modify, !oldModifyESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetModify() {
		Boolean oldModify = modify;
		boolean oldModifyESet = modifyESet;
		modify = MODIFY_EDEFAULT;
		modifyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICE_FOR_CONF_DATA_SET__MODIFY, oldModify, MODIFY_EDEFAULT, oldModifyESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetModify() {
		return modifyESet;
	}

    /**
	 * The cached validation expression for the '{@link #validateServiceForConfDataSet_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service For Conf Data Set nothing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceForConfDataSet_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_FOR_CONF_DATA_SET_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"        true\n" +
		"\n" +
		"\n" +
		"";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceForConfDataSet_nothing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getServiceForConfDataSet(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getServiceForConfDataSet__ValidateServiceForConfDataSet_nothing__DiagnosticChain_Map(),
				 VALIDATE_SERVICE_FOR_CONF_DATA_SET_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SERVICE_FOR_CONF_DATA_SET__VALIDATE_SERVICE_FOR_CONF_DATA_SET_NOTHING);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SclPackage.SERVICE_FOR_CONF_DATA_SET__MODIFY:
				return getModify();
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
			case SclPackage.SERVICE_FOR_CONF_DATA_SET__MODIFY:
				setModify((Boolean)newValue);
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
			case SclPackage.SERVICE_FOR_CONF_DATA_SET__MODIFY:
				unsetModify();
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
			case SclPackage.SERVICE_FOR_CONF_DATA_SET__MODIFY:
				return isSetModify();
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
			case SclPackage.SERVICE_FOR_CONF_DATA_SET___VALIDATE_SERVICE_FOR_CONF_DATA_SET_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateServiceForConfDataSet_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (modify: ");
		if (modifyESet) result.append(modify); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServiceForConfDataSetImpl
