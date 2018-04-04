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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SG Edit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SGEditImpl#getResvTms <em>Resv Tms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SGEditImpl#getSettingGroups <em>Setting Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGEditImpl extends SclObjectImpl implements SGEdit {
    /**
	 * The default value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResvTms()
	 * @generated
	 * @ordered
	 */
    protected static final Boolean RESV_TMS_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResvTms()
	 * @generated
	 * @ordered
	 */
    protected Boolean resvTms = RESV_TMS_EDEFAULT;

    /**
	 * This is true if the Resv Tms attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean resvTmsESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SGEditImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getSGEdit();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Boolean getResvTms() {
		return resvTms;
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void setResvTms( Boolean newResvTms ) {
		Boolean oldResvTms = resvTms;
		resvTms = newResvTms;
		boolean oldResvTmsESet = resvTmsESet;
		resvTmsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SG_EDIT__RESV_TMS, oldResvTms, resvTms, !oldResvTmsESet));
	}

    /**
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetResvTms() {
		Boolean oldResvTms = resvTms;
		boolean oldResvTmsESet = resvTmsESet;
		resvTms = RESV_TMS_EDEFAULT;
		resvTmsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SG_EDIT__RESV_TMS, oldResvTms, RESV_TMS_EDEFAULT, oldResvTmsESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetResvTms() {
		return resvTmsESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SettingGroups getSettingGroups() {
		if (eContainerFeatureID() != SclPackage.SG_EDIT__SETTING_GROUPS) return null;
		return (SettingGroups)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSettingGroups( SettingGroups newSettingGroups, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newSettingGroups, SclPackage.SG_EDIT__SETTING_GROUPS, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSettingGroups( SettingGroups newSettingGroups ) {
		if (newSettingGroups != eInternalContainer() || (eContainerFeatureID() != SclPackage.SG_EDIT__SETTING_GROUPS && newSettingGroups != null)) {
			if (EcoreUtil.isAncestor(this, newSettingGroups))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSettingGroups != null)
				msgs = ((InternalEObject)newSettingGroups).eInverseAdd(this, SclPackage.SETTING_GROUPS__SG_EDIT, SettingGroups.class, msgs);
			msgs = basicSetSettingGroups(newSettingGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SG_EDIT__SETTING_GROUPS, newSettingGroups, newSettingGroups));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.SG_EDIT__SETTING_GROUPS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSettingGroups((SettingGroups)otherEnd, msgs);
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
			case SclPackage.SG_EDIT__SETTING_GROUPS:
				return basicSetSettingGroups(null, msgs);
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
			case SclPackage.SG_EDIT__SETTING_GROUPS:
				return eInternalContainer().eInverseRemove(this, SclPackage.SETTING_GROUPS__SG_EDIT, SettingGroups.class, msgs);
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
			case SclPackage.SG_EDIT__RESV_TMS:
				return getResvTms();
			case SclPackage.SG_EDIT__SETTING_GROUPS:
				return getSettingGroups();
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
			case SclPackage.SG_EDIT__RESV_TMS:
				setResvTms((Boolean)newValue);
				return;
			case SclPackage.SG_EDIT__SETTING_GROUPS:
				setSettingGroups((SettingGroups)newValue);
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
			case SclPackage.SG_EDIT__RESV_TMS:
				unsetResvTms();
				return;
			case SclPackage.SG_EDIT__SETTING_GROUPS:
				setSettingGroups((SettingGroups)null);
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
			case SclPackage.SG_EDIT__RESV_TMS:
				return isSetResvTms();
			case SclPackage.SG_EDIT__SETTING_GROUPS:
				return getSettingGroups() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (resvTms: ");
		if (resvTmsESet) result.append(resvTms); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGEditImpl
