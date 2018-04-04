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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.utilities.ValueUtil;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PowerSystemResourceImpl extends LNodeContainerImpl implements PowerSystemResource {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected PowerSystemResourceImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.POWER_SYSTEM_RESOURCE;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerSystemResource_nothing(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv PowerSystemResource_nothing: true
		 */
		return ValueUtil.TRUE_VALUE;
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
			case SclPackage.POWER_SYSTEM_RESOURCE___VALIDATE_POWER_SYSTEM_RESOURCE_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validatePowerSystemResource_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PowerSystemResourceImpl
