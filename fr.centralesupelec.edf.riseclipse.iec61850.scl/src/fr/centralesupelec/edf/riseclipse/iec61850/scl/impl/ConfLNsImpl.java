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
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.utilities.ValueUtil;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conf LNs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfLNsImpl#getFixLnInst <em>Fix Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfLNsImpl#getFixPrefix <em>Fix Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfLNsImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfLNsImpl extends SclObjectImpl implements ConfLNs {
    /**
	 * The default value of the '{@link #getFixLnInst() <em>Fix Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFixLnInst()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean FIX_LN_INST_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getFixLnInst() <em>Fix Ln Inst</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFixLnInst()
	 * @generated
	 * @ordered
	 */
    protected Boolean fixLnInst = FIX_LN_INST_EDEFAULT;

    /**
	 * This is true if the Fix Ln Inst attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean fixLnInstESet;

    /**
	 * The default value of the '{@link #getFixPrefix() <em>Fix Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFixPrefix()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean FIX_PREFIX_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getFixPrefix() <em>Fix Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFixPrefix()
	 * @generated
	 * @ordered
	 */
    protected Boolean fixPrefix = FIX_PREFIX_EDEFAULT;

    /**
	 * This is true if the Fix Prefix attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean fixPrefixESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ConfLNsImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.Literals.CONF_LNS;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getFixLnInst() {
		return fixLnInst;
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFixLnInst( Boolean newFixLnInst ) {
		Boolean oldFixLnInst = fixLnInst;
		fixLnInst = newFixLnInst;
		boolean oldFixLnInstESet = fixLnInstESet;
		fixLnInstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONF_LNS__FIX_LN_INST, oldFixLnInst, fixLnInst, !oldFixLnInstESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetFixLnInst() {
		Boolean oldFixLnInst = fixLnInst;
		boolean oldFixLnInstESet = fixLnInstESet;
		fixLnInst = FIX_LN_INST_EDEFAULT;
		fixLnInstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONF_LNS__FIX_LN_INST, oldFixLnInst, FIX_LN_INST_EDEFAULT, oldFixLnInstESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetFixLnInst() {
		return fixLnInstESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getFixPrefix() {
		return fixPrefix;
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFixPrefix( Boolean newFixPrefix ) {
		Boolean oldFixPrefix = fixPrefix;
		fixPrefix = newFixPrefix;
		boolean oldFixPrefixESet = fixPrefixESet;
		fixPrefixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONF_LNS__FIX_PREFIX, oldFixPrefix, fixPrefix, !oldFixPrefixESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetFixPrefix() {
		Boolean oldFixPrefix = fixPrefix;
		boolean oldFixPrefixESet = fixPrefixESet;
		fixPrefix = FIX_PREFIX_EDEFAULT;
		fixPrefixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.CONF_LNS__FIX_PREFIX, oldFixPrefix, FIX_PREFIX_EDEFAULT, oldFixPrefixESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetFixPrefix() {
		return fixPrefixESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Services getServices() {
		if (eContainerFeatureID() != SclPackage.CONF_LNS__SERVICES) return null;
		return (Services)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetServices( Services newServices, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newServices, SclPackage.CONF_LNS__SERVICES, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setServices( Services newServices ) {
		if (newServices != eInternalContainer() || (eContainerFeatureID() != SclPackage.CONF_LNS__SERVICES && newServices != null)) {
			if (EcoreUtil.isAncestor(this, newServices))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, SclPackage.SERVICES__CONF_LNS, Services.class, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.CONF_LNS__SERVICES, newServices, newServices));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfLNs_nothing(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * inv ConfLNs_nothing: true
		 */
		return ValueUtil.TRUE_VALUE;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.CONF_LNS__SERVICES:
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
			case SclPackage.CONF_LNS__SERVICES:
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
			case SclPackage.CONF_LNS__SERVICES:
				return eInternalContainer().eInverseRemove(this, SclPackage.SERVICES__CONF_LNS, Services.class, msgs);
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
			case SclPackage.CONF_LNS__FIX_LN_INST:
				return getFixLnInst();
			case SclPackage.CONF_LNS__FIX_PREFIX:
				return getFixPrefix();
			case SclPackage.CONF_LNS__SERVICES:
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
			case SclPackage.CONF_LNS__FIX_LN_INST:
				setFixLnInst((Boolean)newValue);
				return;
			case SclPackage.CONF_LNS__FIX_PREFIX:
				setFixPrefix((Boolean)newValue);
				return;
			case SclPackage.CONF_LNS__SERVICES:
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
			case SclPackage.CONF_LNS__FIX_LN_INST:
				unsetFixLnInst();
				return;
			case SclPackage.CONF_LNS__FIX_PREFIX:
				unsetFixPrefix();
				return;
			case SclPackage.CONF_LNS__SERVICES:
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
			case SclPackage.CONF_LNS__FIX_LN_INST:
				return isSetFixLnInst();
			case SclPackage.CONF_LNS__FIX_PREFIX:
				return isSetFixPrefix();
			case SclPackage.CONF_LNS__SERVICES:
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
			case SclPackage.CONF_LNS___VALIDATE_CONF_LNS_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateConfLNs_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (fixLnInst: ");
		if (fixLnInstESet) result.append(fixLnInst); else result.append("<unset>");
		result.append(", fixPrefix: ");
		if (fixPrefixESet) result.append(fixPrefix); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConfLNsImpl
