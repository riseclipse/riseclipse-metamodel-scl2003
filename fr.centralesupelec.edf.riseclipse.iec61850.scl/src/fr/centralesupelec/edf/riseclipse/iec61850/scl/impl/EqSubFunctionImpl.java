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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eq Sub Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqSubFunctionImpl#getAbstractEqFuncSubFunc <em>Abstract Eq Func Sub Func</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqSubFunctionImpl extends AbstractEqFuncSubFuncImpl implements EqSubFunction {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected EqSubFunctionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getEqSubFunction();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AbstractEqFuncSubFunc getAbstractEqFuncSubFunc() {
		if (eContainerFeatureID() != SclPackage.EQ_SUB_FUNCTION__ABSTRACT_EQ_FUNC_SUB_FUNC) return null;
		return (AbstractEqFuncSubFunc)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAbstractEqFuncSubFunc( AbstractEqFuncSubFunc newAbstractEqFuncSubFunc,
            NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newAbstractEqFuncSubFunc, SclPackage.EQ_SUB_FUNCTION__ABSTRACT_EQ_FUNC_SUB_FUNC, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAbstractEqFuncSubFunc( AbstractEqFuncSubFunc newAbstractEqFuncSubFunc ) {
		if (newAbstractEqFuncSubFunc != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_SUB_FUNCTION__ABSTRACT_EQ_FUNC_SUB_FUNC && newAbstractEqFuncSubFunc != null)) {
			if (EcoreUtil.isAncestor(this, newAbstractEqFuncSubFunc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAbstractEqFuncSubFunc != null)
				msgs = ((InternalEObject)newAbstractEqFuncSubFunc).eInverseAdd(this, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION, AbstractEqFuncSubFunc.class, msgs);
			msgs = basicSetAbstractEqFuncSubFunc(newAbstractEqFuncSubFunc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_SUB_FUNCTION__ABSTRACT_EQ_FUNC_SUB_FUNC, newAbstractEqFuncSubFunc, newAbstractEqFuncSubFunc));
	}

    /**
	 * The cached validation expression for the '{@link #validateEqSubFunction_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eq Sub Function nothing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEqSubFunction_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EQ_SUB_FUNCTION_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"        true\n" +
		"\n" +
		"\n" +
		"";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqSubFunction_nothing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getEqSubFunction(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getEqSubFunction__ValidateEqSubFunction_nothing__DiagnosticChain_Map(),
				 VALIDATE_EQ_SUB_FUNCTION_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.EQ_SUB_FUNCTION__VALIDATE_EQ_SUB_FUNCTION_NOTHING);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.EQ_SUB_FUNCTION__ABSTRACT_EQ_FUNC_SUB_FUNC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)otherEnd, msgs);
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
			case SclPackage.EQ_SUB_FUNCTION__ABSTRACT_EQ_FUNC_SUB_FUNC:
				return basicSetAbstractEqFuncSubFunc(null, msgs);
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
			case SclPackage.EQ_SUB_FUNCTION__ABSTRACT_EQ_FUNC_SUB_FUNC:
				return eInternalContainer().eInverseRemove(this, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION, AbstractEqFuncSubFunc.class, msgs);
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
			case SclPackage.EQ_SUB_FUNCTION__ABSTRACT_EQ_FUNC_SUB_FUNC:
				return getAbstractEqFuncSubFunc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet( int featureID, Object newValue ) {
		switch (featureID) {
			case SclPackage.EQ_SUB_FUNCTION__ABSTRACT_EQ_FUNC_SUB_FUNC:
				setAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)newValue);
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
			case SclPackage.EQ_SUB_FUNCTION__ABSTRACT_EQ_FUNC_SUB_FUNC:
				setAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)null);
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
			case SclPackage.EQ_SUB_FUNCTION__ABSTRACT_EQ_FUNC_SUB_FUNC:
				return getAbstractEqFuncSubFunc() != null;
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
			case SclPackage.EQ_SUB_FUNCTION___VALIDATE_EQ_SUB_FUNCTION_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateEqSubFunction_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EqSubFunctionImpl
