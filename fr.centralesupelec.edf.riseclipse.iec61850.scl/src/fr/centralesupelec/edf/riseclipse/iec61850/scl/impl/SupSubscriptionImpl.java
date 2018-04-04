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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sup Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SupSubscriptionImpl#getMaxGo <em>Max Go</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SupSubscriptionImpl#getMaxSv <em>Max Sv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SupSubscriptionImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupSubscriptionImpl extends SclObjectImpl implements SupSubscription {
    /**
	 * The default value of the '{@link #getMaxGo() <em>Max Go</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMaxGo()
	 * @generated
	 * @ordered
	 */
    protected static final Integer MAX_GO_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMaxGo() <em>Max Go</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMaxGo()
	 * @generated
	 * @ordered
	 */
    protected Integer maxGo = MAX_GO_EDEFAULT;

    /**
	 * This is true if the Max Go attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean maxGoESet;

    /**
	 * The default value of the '{@link #getMaxSv() <em>Max Sv</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMaxSv()
	 * @generated
	 * @ordered
	 */
    protected static final Integer MAX_SV_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getMaxSv() <em>Max Sv</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMaxSv()
	 * @generated
	 * @ordered
	 */
    protected Integer maxSv = MAX_SV_EDEFAULT;

    /**
	 * This is true if the Max Sv attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean maxSvESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SupSubscriptionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getSupSubscription();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getMaxGo() {
		return maxGo;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMaxGo( Integer newMaxGo ) {
		Integer oldMaxGo = maxGo;
		maxGo = newMaxGo;
		boolean oldMaxGoESet = maxGoESet;
		maxGoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUP_SUBSCRIPTION__MAX_GO, oldMaxGo, maxGo, !oldMaxGoESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetMaxGo() {
		Integer oldMaxGo = maxGo;
		boolean oldMaxGoESet = maxGoESet;
		maxGo = MAX_GO_EDEFAULT;
		maxGoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SUP_SUBSCRIPTION__MAX_GO, oldMaxGo, MAX_GO_EDEFAULT, oldMaxGoESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetMaxGo() {
		return maxGoESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getMaxSv() {
		return maxSv;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setMaxSv( Integer newMaxSv ) {
		Integer oldMaxSv = maxSv;
		maxSv = newMaxSv;
		boolean oldMaxSvESet = maxSvESet;
		maxSvESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUP_SUBSCRIPTION__MAX_SV, oldMaxSv, maxSv, !oldMaxSvESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetMaxSv() {
		Integer oldMaxSv = maxSv;
		boolean oldMaxSvESet = maxSvESet;
		maxSv = MAX_SV_EDEFAULT;
		maxSvESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SUP_SUBSCRIPTION__MAX_SV, oldMaxSv, MAX_SV_EDEFAULT, oldMaxSvESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetMaxSv() {
		return maxSvESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Services getServices() {
		if (eContainerFeatureID() != SclPackage.SUP_SUBSCRIPTION__SERVICES) return null;
		return (Services)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetServices( Services newServices, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newServices, SclPackage.SUP_SUBSCRIPTION__SERVICES, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setServices( Services newServices ) {
		if (newServices != eInternalContainer() || (eContainerFeatureID() != SclPackage.SUP_SUBSCRIPTION__SERVICES && newServices != null)) {
			if (EcoreUtil.isAncestor(this, newServices))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, SclPackage.SERVICES__SUP_SUBSCRIPTION, Services.class, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SUP_SUBSCRIPTION__SERVICES, newServices, newServices));
	}

    /**
	 * The cached validation expression for the '{@link #validateSupSubscription_maxGo_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sup Subscription max Go required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupSubscription_maxGo_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUP_SUBSCRIPTION_MAX_GO_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'maxGo attribute shall be present in SupSubscription (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.maxGo <> null\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupSubscription_maxGo_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSupSubscription(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSupSubscription__ValidateSupSubscription_maxGo_required__DiagnosticChain_Map(),
				 VALIDATE_SUP_SUBSCRIPTION_MAX_GO_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SUP_SUBSCRIPTION__VALIDATE_SUP_SUBSCRIPTION_MAX_GO_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateSupSubscription_maxGo_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sup Subscription max Go valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupSubscription_maxGo_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUP_SUBSCRIPTION_MAX_GO_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'maxGo attribute shall be valid in SupSubscription (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.maxGo.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.maxGo <> null implies self.maxGo >= 0\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupSubscription_maxGo_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSupSubscription(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSupSubscription__ValidateSupSubscription_maxGo_valid__DiagnosticChain_Map(),
				 VALIDATE_SUP_SUBSCRIPTION_MAX_GO_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SUP_SUBSCRIPTION__VALIDATE_SUP_SUBSCRIPTION_MAX_GO_VALID);
	}

				/**
	 * The cached validation expression for the '{@link #validateSupSubscription_maxSv_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sup Subscription max Sv required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupSubscription_maxSv_required(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUP_SUBSCRIPTION_MAX_SV_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'maxSv attribute shall be present in SupSubscription (line ' + self.lineNumber.toString() + ')' ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.maxSv <> null\n" +
		"\n" +
		"    \n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupSubscription_maxSv_required(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSupSubscription(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSupSubscription__ValidateSupSubscription_maxSv_required__DiagnosticChain_Map(),
				 VALIDATE_SUP_SUBSCRIPTION_MAX_SV_REQUIRED_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SUP_SUBSCRIPTION__VALIDATE_SUP_SUBSCRIPTION_MAX_SV_REQUIRED);
	}

				/**
	 * The cached validation expression for the '{@link #validateSupSubscription_maxSv_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sup Subscription max Sv valid</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupSubscription_maxSv_valid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUP_SUBSCRIPTION_MAX_SV_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'maxSv attribute shall be valid in SupSubscription (line ' + self.lineNumber.toString() + '). '\n" +
		"          + 'Current value is ' + self.maxSv.toString()\n" +
		"        ,\n" +
		"\tstatus : Boolean = \n" +
		"        self.maxSv <> null implies self.maxSv >= 0\n" +
		"\n" +
		"\n" +
		"\n" +
		"}.status";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupSubscription_maxSv_valid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSupSubscription(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSupSubscription__ValidateSupSubscription_maxSv_valid__DiagnosticChain_Map(),
				 VALIDATE_SUP_SUBSCRIPTION_MAX_SV_VALID_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SUP_SUBSCRIPTION__VALIDATE_SUP_SUBSCRIPTION_MAX_SV_VALID);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.SUP_SUBSCRIPTION__SERVICES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServices((Services)otherEnd, msgs);
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
			case SclPackage.SUP_SUBSCRIPTION__SERVICES:
				return basicSetServices(null, msgs);
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
			case SclPackage.SUP_SUBSCRIPTION__SERVICES:
				return eInternalContainer().eInverseRemove(this, SclPackage.SERVICES__SUP_SUBSCRIPTION, Services.class, msgs);
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
			case SclPackage.SUP_SUBSCRIPTION__MAX_GO:
				return getMaxGo();
			case SclPackage.SUP_SUBSCRIPTION__MAX_SV:
				return getMaxSv();
			case SclPackage.SUP_SUBSCRIPTION__SERVICES:
				return getServices();
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
			case SclPackage.SUP_SUBSCRIPTION__MAX_GO:
				setMaxGo((Integer)newValue);
				return;
			case SclPackage.SUP_SUBSCRIPTION__MAX_SV:
				setMaxSv((Integer)newValue);
				return;
			case SclPackage.SUP_SUBSCRIPTION__SERVICES:
				setServices((Services)newValue);
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
			case SclPackage.SUP_SUBSCRIPTION__MAX_GO:
				unsetMaxGo();
				return;
			case SclPackage.SUP_SUBSCRIPTION__MAX_SV:
				unsetMaxSv();
				return;
			case SclPackage.SUP_SUBSCRIPTION__SERVICES:
				setServices((Services)null);
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
			case SclPackage.SUP_SUBSCRIPTION__MAX_GO:
				return isSetMaxGo();
			case SclPackage.SUP_SUBSCRIPTION__MAX_SV:
				return isSetMaxSv();
			case SclPackage.SUP_SUBSCRIPTION__SERVICES:
				return getServices() != null;
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
			case SclPackage.SUP_SUBSCRIPTION___VALIDATE_SUP_SUBSCRIPTION_MAX_GO_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSupSubscription_maxGo_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SUP_SUBSCRIPTION___VALIDATE_SUP_SUBSCRIPTION_MAX_GO_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSupSubscription_maxGo_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SUP_SUBSCRIPTION___VALIDATE_SUP_SUBSCRIPTION_MAX_SV_REQUIRED__DIAGNOSTICCHAIN_MAP:
				return validateSupSubscription_maxSv_required((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case SclPackage.SUP_SUBSCRIPTION___VALIDATE_SUP_SUBSCRIPTION_MAX_SV_VALID__DIAGNOSTICCHAIN_MAP:
				return validateSupSubscription_maxSv_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (maxGo: ");
		if (maxGoESet) result.append(maxGo); else result.append("<unset>");
		result.append(", maxSv: ");
		if (maxSvESet) result.append(maxSv); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SupSubscriptionImpl
