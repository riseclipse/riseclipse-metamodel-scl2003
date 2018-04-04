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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSE Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSESettingsImpl#getAppID <em>App ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSESettingsImpl#getDataLabel <em>Data Label</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSESettingsImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSESettingsImpl extends ServiceSettingsImpl implements GSESettings {
    /**
     * The default value of the '{@link #getAppID() <em>App ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppID()
     * @generated NOT
     * @ordered
     */
    protected static final ServiceSettingsEnum APP_ID_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getAppID() <em>App ID</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAppID()
	 * @generated
	 * @ordered
	 */
    protected ServiceSettingsEnum appID = APP_ID_EDEFAULT;

    /**
	 * This is true if the App ID attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean appIDESet;

    /**
     * The default value of the '{@link #getDataLabel() <em>Data Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataLabel()
     * @generated NOT
     * @ordered
     */
    protected static final ServiceSettingsEnum DATA_LABEL_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getDataLabel() <em>Data Label</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDataLabel()
	 * @generated
	 * @ordered
	 */
    protected ServiceSettingsEnum dataLabel = DATA_LABEL_EDEFAULT;

    /**
	 * This is true if the Data Label attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean dataLabelESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected GSESettingsImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getGSESettings();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ServiceSettingsEnum getAppID() {
		return appID;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAppID( ServiceSettingsEnum newAppID ) {
		ServiceSettingsEnum oldAppID = appID;
		appID = newAppID == null ? APP_ID_EDEFAULT : newAppID;
		boolean oldAppIDESet = appIDESet;
		appIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_SETTINGS__APP_ID, oldAppID, appID, !oldAppIDESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetAppID() {
		ServiceSettingsEnum oldAppID = appID;
		boolean oldAppIDESet = appIDESet;
		appID = APP_ID_EDEFAULT;
		appIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GSE_SETTINGS__APP_ID, oldAppID, APP_ID_EDEFAULT, oldAppIDESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetAppID() {
		return appIDESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ServiceSettingsEnum getDataLabel() {
		return dataLabel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataLabel( ServiceSettingsEnum newDataLabel ) {
		ServiceSettingsEnum oldDataLabel = dataLabel;
		dataLabel = newDataLabel == null ? DATA_LABEL_EDEFAULT : newDataLabel;
		boolean oldDataLabelESet = dataLabelESet;
		dataLabelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_SETTINGS__DATA_LABEL, oldDataLabel, dataLabel, !oldDataLabelESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetDataLabel() {
		ServiceSettingsEnum oldDataLabel = dataLabel;
		boolean oldDataLabelESet = dataLabelESet;
		dataLabel = DATA_LABEL_EDEFAULT;
		dataLabelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GSE_SETTINGS__DATA_LABEL, oldDataLabel, DATA_LABEL_EDEFAULT, oldDataLabelESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetDataLabel() {
		return dataLabelESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Services getServices() {
		if (eContainerFeatureID() != SclPackage.GSE_SETTINGS__SERVICES) return null;
		return (Services)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetServices( Services newServices, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newServices, SclPackage.GSE_SETTINGS__SERVICES, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setServices( Services newServices ) {
		if (newServices != eInternalContainer() || (eContainerFeatureID() != SclPackage.GSE_SETTINGS__SERVICES && newServices != null)) {
			if (EcoreUtil.isAncestor(this, newServices))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, SclPackage.SERVICES__GSE_SETTINGS, Services.class, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_SETTINGS__SERVICES, newServices, newServices));
	}

    /**
	 * The cached validation expression for the '{@link #validateGSESettings_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate GSE Settings nothing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGSESettings_nothing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GSE_SETTINGS_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n" +
		"        true\n" +
		"\n" +
		"";

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSESettings_nothing(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			SclValidator.validate
				(SclPackage.eINSTANCE.getGSESettings(),
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 SclPackage.eINSTANCE.getGSESettings__ValidateGSESettings_nothing__DiagnosticChain_Map(),
				 VALIDATE_GSE_SETTINGS_NOTHING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 SclValidator.DIAGNOSTIC_SOURCE,
				 SclValidator.GSE_SETTINGS__VALIDATE_GSE_SETTINGS_NOTHING);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.GSE_SETTINGS__SERVICES:
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
			case SclPackage.GSE_SETTINGS__SERVICES:
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
			case SclPackage.GSE_SETTINGS__SERVICES:
				return eInternalContainer().eInverseRemove(this, SclPackage.SERVICES__GSE_SETTINGS, Services.class, msgs);
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
			case SclPackage.GSE_SETTINGS__APP_ID:
				return getAppID();
			case SclPackage.GSE_SETTINGS__DATA_LABEL:
				return getDataLabel();
			case SclPackage.GSE_SETTINGS__SERVICES:
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
			case SclPackage.GSE_SETTINGS__APP_ID:
				setAppID((ServiceSettingsEnum)newValue);
				return;
			case SclPackage.GSE_SETTINGS__DATA_LABEL:
				setDataLabel((ServiceSettingsEnum)newValue);
				return;
			case SclPackage.GSE_SETTINGS__SERVICES:
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
			case SclPackage.GSE_SETTINGS__APP_ID:
				unsetAppID();
				return;
			case SclPackage.GSE_SETTINGS__DATA_LABEL:
				unsetDataLabel();
				return;
			case SclPackage.GSE_SETTINGS__SERVICES:
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
			case SclPackage.GSE_SETTINGS__APP_ID:
				return isSetAppID();
			case SclPackage.GSE_SETTINGS__DATA_LABEL:
				return isSetDataLabel();
			case SclPackage.GSE_SETTINGS__SERVICES:
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
			case SclPackage.GSE_SETTINGS___VALIDATE_GSE_SETTINGS_NOTHING__DIAGNOSTICCHAIN_MAP:
				return validateGSESettings_nothing((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (appID: ");
		if (appIDESet) result.append(appID); else result.append("<unset>");
		result.append(", dataLabel: ");
		if (dataLabelESet) result.append(dataLabel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSESettingsImpl
