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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
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
		return SclPackage.eINSTANCE.getServiceWithMaxAndMaxAttributes();
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
	 * The cached validation expression for the '{@link #validateServiceWithMax_maxAttributes_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service With Max max Attributes valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceWithMax_maxAttributes_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_WITH_MAX_MAX_ATTRIBUTES_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'maxAttributes attribute shall be valid in ServiceWithMaxAndMaxAttributes (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.maxAttributes.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.maxAttributes <> null implies self.maxAttributes > 0\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMax_maxAttributes_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getServiceWithMaxAndMaxAttributes(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getServiceWithMaxAndMaxAttributes__ValidateServiceWithMax_maxAttributes_valid__DiagnosticChain_Map(),
				 VALIDATE_SERVICE_WITH_MAX_MAX_ATTRIBUTES_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__VALIDATE_SERVICE_WITH_MAX_MAX_ATTRIBUTES_VALID);
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
