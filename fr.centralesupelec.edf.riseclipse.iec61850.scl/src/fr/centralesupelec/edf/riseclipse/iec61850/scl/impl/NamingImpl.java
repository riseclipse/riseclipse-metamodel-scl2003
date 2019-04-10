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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Naming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.NamingImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.NamingImpl#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamingImpl extends BaseElementImpl implements Naming {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDesc()
     * @generated
     * @ordered
     */
    protected static final String DESC_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDesc()
     * @generated
     * @ordered
     */
    protected String desc = DESC_EDEFAULT;

    /**
     * This is true if the Desc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean descESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NamingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getNaming();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.NAMING__NAME, oldName, name, !oldNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.NAMING__NAME, oldName, NAME_EDEFAULT, oldNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDesc() {
        return desc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDesc(String newDesc) {
        String oldDesc = desc;
        desc = newDesc;
        boolean oldDescESet = descESet;
        descESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.NAMING__DESC, oldDesc, desc, !oldDescESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDesc() {
        String oldDesc = desc;
        boolean oldDescESet = descESet;
        desc = DESC_EDEFAULT;
        descESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.NAMING__DESC, oldDesc, DESC_EDEFAULT, oldDescESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDesc() {
        return descESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
            case SclPackage.NAMING__NAME:
                return getName();
            case SclPackage.NAMING__DESC:
                return getDesc();
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
            case SclPackage.NAMING__NAME:
                setName((String)newValue);
                return;
            case SclPackage.NAMING__DESC:
                setDesc((String)newValue);
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
            case SclPackage.NAMING__NAME:
                unsetName();
                return;
            case SclPackage.NAMING__DESC:
                unsetDesc();
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
            case SclPackage.NAMING__NAME:
                return isSetName();
            case SclPackage.NAMING__DESC:
                return isSetDesc();
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
        result.append(" (name: ");
        if (nameESet) result.append(name); else result.append("<unset>");
        result.append(", desc: ");
        if (descESet) result.append(desc); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //NamingImpl
