/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service With Max And Modify</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithMaxAndModifyImpl#getModify <em>Modify</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceWithMaxAndModifyImpl extends ServiceWithMaxImpl implements ServiceWithMaxAndModify {
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
    protected ServiceWithMaxAndModifyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getServiceWithMaxAndModify();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getModify() {
        return modify;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setModify(Boolean newModify) {
        Boolean oldModify = modify;
        modify = newModify;
        boolean oldModifyESet = modifyESet;
        modifyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICE_WITH_MAX_AND_MODIFY__MODIFY, oldModify, modify, !oldModifyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetModify() {
        Boolean oldModify = modify;
        boolean oldModifyESet = modifyESet;
        modify = MODIFY_EDEFAULT;
        modifyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICE_WITH_MAX_AND_MODIFY__MODIFY, oldModify, MODIFY_EDEFAULT, oldModifyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetModify() {
        return modifyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SclPackage.SERVICE_WITH_MAX_AND_MODIFY__MODIFY:
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
            case SclPackage.SERVICE_WITH_MAX_AND_MODIFY__MODIFY:
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
            case SclPackage.SERVICE_WITH_MAX_AND_MODIFY__MODIFY:
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
            case SclPackage.SERVICE_WITH_MAX_AND_MODIFY__MODIFY:
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
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (modify: ");
        if (modifyESet) result.append(modify); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ServiceWithMaxAndModifyImpl
