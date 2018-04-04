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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setting Groups</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingGroupsImpl#getConfSG <em>Conf SG</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingGroupsImpl#getSGEdit <em>SG Edit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingGroupsImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettingGroupsImpl extends SclObjectImpl implements SettingGroups {
    /**
	 * The cached value of the '{@link #getConfSG() <em>Conf SG</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfSG()
	 * @generated
	 * @ordered
	 */
    protected ConfSG confSG;

    /**
	 * This is true if the Conf SG containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean confSGESet;

    /**
	 * The cached value of the '{@link #getSGEdit() <em>SG Edit</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSGEdit()
	 * @generated
	 * @ordered
	 */
    protected SGEdit sgEdit;

    /**
	 * This is true if the SG Edit containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean sgEditESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SettingGroupsImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getSettingGroups();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConfSG getConfSG() {
		return confSG;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetConfSG( ConfSG newConfSG, NotificationChain msgs ) {
		ConfSG oldConfSG = confSG;
		confSG = newConfSG;
		boolean oldConfSGESet = confSGESet;
		confSGESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_GROUPS__CONF_SG, oldConfSG, newConfSG, !oldConfSGESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfSG( ConfSG newConfSG ) {
		if (newConfSG != confSG) {
			NotificationChain msgs = null;
			if (confSG != null)
				msgs = ((InternalEObject)confSG).eInverseRemove(this, SclPackage.CONF_SG__SETTING_GROUPS, ConfSG.class, msgs);
			if (newConfSG != null)
				msgs = ((InternalEObject)newConfSG).eInverseAdd(this, SclPackage.CONF_SG__SETTING_GROUPS, ConfSG.class, msgs);
			msgs = basicSetConfSG(newConfSG, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfSGESet = confSGESet;
			confSGESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_GROUPS__CONF_SG, newConfSG, newConfSG, !oldConfSGESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetConfSG( NotificationChain msgs ) {
		ConfSG oldConfSG = confSG;
		confSG = null;
		boolean oldConfSGESet = confSGESet;
		confSGESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SETTING_GROUPS__CONF_SG, oldConfSG, null, oldConfSGESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetConfSG() {
		if (confSG != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)confSG).eInverseRemove(this, SclPackage.CONF_SG__SETTING_GROUPS, ConfSG.class, msgs);
			msgs = basicUnsetConfSG(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfSGESet = confSGESet;
			confSGESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SETTING_GROUPS__CONF_SG, null, null, oldConfSGESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetConfSG() {
		return confSGESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SGEdit getSGEdit() {
		return sgEdit;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSGEdit( SGEdit newSGEdit, NotificationChain msgs ) {
		SGEdit oldSGEdit = sgEdit;
		sgEdit = newSGEdit;
		boolean oldSGEditESet = sgEditESet;
		sgEditESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_GROUPS__SG_EDIT, oldSGEdit, newSGEdit, !oldSGEditESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSGEdit( SGEdit newSGEdit ) {
		if (newSGEdit != sgEdit) {
			NotificationChain msgs = null;
			if (sgEdit != null)
				msgs = ((InternalEObject)sgEdit).eInverseRemove(this, SclPackage.SG_EDIT__SETTING_GROUPS, SGEdit.class, msgs);
			if (newSGEdit != null)
				msgs = ((InternalEObject)newSGEdit).eInverseAdd(this, SclPackage.SG_EDIT__SETTING_GROUPS, SGEdit.class, msgs);
			msgs = basicSetSGEdit(newSGEdit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSGEditESet = sgEditESet;
			sgEditESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_GROUPS__SG_EDIT, newSGEdit, newSGEdit, !oldSGEditESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetSGEdit( NotificationChain msgs ) {
		SGEdit oldSGEdit = sgEdit;
		sgEdit = null;
		boolean oldSGEditESet = sgEditESet;
		sgEditESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SETTING_GROUPS__SG_EDIT, oldSGEdit, null, oldSGEditESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSGEdit() {
		if (sgEdit != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)sgEdit).eInverseRemove(this, SclPackage.SG_EDIT__SETTING_GROUPS, SGEdit.class, msgs);
			msgs = basicUnsetSGEdit(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSGEditESet = sgEditESet;
			sgEditESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SETTING_GROUPS__SG_EDIT, null, null, oldSGEditESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSGEdit() {
		return sgEditESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Services getServices() {
		if (eContainerFeatureID() != SclPackage.SETTING_GROUPS__SERVICES) return null;
		return (Services)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetServices( Services newServices, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newServices, SclPackage.SETTING_GROUPS__SERVICES, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setServices( Services newServices ) {
		if (newServices != eInternalContainer() || (eContainerFeatureID() != SclPackage.SETTING_GROUPS__SERVICES && newServices != null)) {
			if (EcoreUtil.isAncestor(this, newServices))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, SclPackage.SERVICES__SETTING_GROUPS, Services.class, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SETTING_GROUPS__SERVICES, newServices, newServices));
	}

    /**
	 * The cached validation expression for the '{@link #validateSettingGroups_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Setting Groups nothing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSettingGroups_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SETTING_GROUPS_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"        true\n" +
		"\n" +
		"\n" +
		"";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingGroups_nothing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getSettingGroups(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getSettingGroups__ValidateSettingGroups_nothing__DiagnosticChain_Map(),
				 VALIDATE_SETTING_GROUPS_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.SETTING_GROUPS__VALIDATE_SETTING_GROUPS_NOTHING);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.SETTING_GROUPS__CONF_SG:
				if (confSG != null)
					msgs = ((InternalEObject)confSG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SETTING_GROUPS__CONF_SG, null, msgs);
				return basicSetConfSG((ConfSG)otherEnd, msgs);
			case SclPackage.SETTING_GROUPS__SG_EDIT:
				if (sgEdit != null)
					msgs = ((InternalEObject)sgEdit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SETTING_GROUPS__SG_EDIT, null, msgs);
				return basicSetSGEdit((SGEdit)otherEnd, msgs);
			case SclPackage.SETTING_GROUPS__SERVICES:
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
			case SclPackage.SETTING_GROUPS__CONF_SG:
				return basicUnsetConfSG(msgs);
			case SclPackage.SETTING_GROUPS__SG_EDIT:
				return basicUnsetSGEdit(msgs);
			case SclPackage.SETTING_GROUPS__SERVICES:
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
			case SclPackage.SETTING_GROUPS__SERVICES:
				return eInternalContainer().eInverseRemove(this, SclPackage.SERVICES__SETTING_GROUPS, Services.class, msgs);
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
			case SclPackage.SETTING_GROUPS__CONF_SG:
				return getConfSG();
			case SclPackage.SETTING_GROUPS__SG_EDIT:
				return getSGEdit();
			case SclPackage.SETTING_GROUPS__SERVICES:
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
			case SclPackage.SETTING_GROUPS__CONF_SG:
				setConfSG((ConfSG)newValue);
				return;
			case SclPackage.SETTING_GROUPS__SG_EDIT:
				setSGEdit((SGEdit)newValue);
				return;
			case SclPackage.SETTING_GROUPS__SERVICES:
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
			case SclPackage.SETTING_GROUPS__CONF_SG:
				unsetConfSG();
				return;
			case SclPackage.SETTING_GROUPS__SG_EDIT:
				unsetSGEdit();
				return;
			case SclPackage.SETTING_GROUPS__SERVICES:
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
			case SclPackage.SETTING_GROUPS__CONF_SG:
				return isSetConfSG();
			case SclPackage.SETTING_GROUPS__SG_EDIT:
				return isSetSGEdit();
			case SclPackage.SETTING_GROUPS__SERVICES:
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
			case SclPackage.SETTING_GROUPS___VALIDATE_SETTING_GROUPS_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateSettingGroups_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SettingGroupsImpl
