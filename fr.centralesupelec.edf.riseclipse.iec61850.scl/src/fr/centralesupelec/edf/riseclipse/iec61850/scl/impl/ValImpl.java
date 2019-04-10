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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Val</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValImpl#getSGroup <em>SGroup</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValImpl#getAbstractDataAttribute <em>Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValImpl#getDAI <em>DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValImpl extends SclObjectImpl implements Val {
    /**
     * The default value of the '{@link #getSGroup() <em>SGroup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSGroup()
     * @generated
     * @ordered
     */
    protected static final Integer SGROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSGroup() <em>SGroup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSGroup()
     * @generated
     * @ordered
     */
    protected Integer sGroup = SGROUP_EDEFAULT;

    /**
     * This is true if the SGroup attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sGroupESet;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    protected ValImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getVal();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getSGroup() {
        return sGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSGroup( Integer newSGroup ) {
        Integer oldSGroup = sGroup;
        sGroup = newSGroup;
        boolean oldSGroupESet = sGroupESet;
        sGroupESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VAL__SGROUP, oldSGroup, sGroup, !oldSGroupESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSGroup() {
        Integer oldSGroup = sGroup;
        boolean oldSGroupESet = sGroupESet;
        sGroup = SGROUP_EDEFAULT;
        sGroupESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.VAL__SGROUP, oldSGroup, SGROUP_EDEFAULT, oldSGroupESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSGroup() {
        return sGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractDataAttribute getAbstractDataAttribute() {
        if (eContainerFeatureID() != SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE) return null;
        return (AbstractDataAttribute)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAbstractDataAttribute( AbstractDataAttribute newAbstractDataAttribute,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newAbstractDataAttribute, SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAbstractDataAttribute( AbstractDataAttribute newAbstractDataAttribute ) {
        if (newAbstractDataAttribute != eInternalContainer() || (eContainerFeatureID() != SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE && newAbstractDataAttribute != null)) {
            if (EcoreUtil.isAncestor(this, newAbstractDataAttribute))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAbstractDataAttribute != null)
                msgs = ((InternalEObject)newAbstractDataAttribute).eInverseAdd(this, SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL, AbstractDataAttribute.class, msgs);
            msgs = basicSetAbstractDataAttribute(newAbstractDataAttribute, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE, newAbstractDataAttribute, newAbstractDataAttribute));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAI getDAI() {
        if (eContainerFeatureID() != SclPackage.VAL__DAI) return null;
        return (DAI)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDAI( DAI newDAI, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newDAI, SclPackage.VAL__DAI, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDAI( DAI newDAI ) {
        if (newDAI != eInternalContainer() || (eContainerFeatureID() != SclPackage.VAL__DAI && newDAI != null)) {
            if (EcoreUtil.isAncestor(this, newDAI))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDAI != null)
                msgs = ((InternalEObject)newDAI).eInverseAdd(this, SclPackage.DAI__VAL, DAI.class, msgs);
            msgs = basicSetDAI(newDAI, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VAL__DAI, newDAI, newDAI));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( String newValue ) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.VAL__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAbstractDataAttribute((AbstractDataAttribute)otherEnd, msgs);
            case SclPackage.VAL__DAI:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDAI((DAI)otherEnd, msgs);
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
            case SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE:
                return basicSetAbstractDataAttribute(null, msgs);
            case SclPackage.VAL__DAI:
                return basicSetDAI(null, msgs);
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
            case SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE:
                return eInternalContainer().eInverseRemove(this, SclPackage.ABSTRACT_DATA_ATTRIBUTE__VAL, AbstractDataAttribute.class, msgs);
            case SclPackage.VAL__DAI:
                return eInternalContainer().eInverseRemove(this, SclPackage.DAI__VAL, DAI.class, msgs);
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
            case SclPackage.VAL__SGROUP:
                return getSGroup();
            case SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE:
                return getAbstractDataAttribute();
            case SclPackage.VAL__DAI:
                return getDAI();
            case SclPackage.VAL__VALUE:
                return getValue();
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
            case SclPackage.VAL__SGROUP:
                setSGroup((Integer)newValue);
                return;
            case SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE:
                setAbstractDataAttribute((AbstractDataAttribute)newValue);
                return;
            case SclPackage.VAL__DAI:
                setDAI((DAI)newValue);
                return;
            case SclPackage.VAL__VALUE:
                setValue((String)newValue);
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
            case SclPackage.VAL__SGROUP:
                unsetSGroup();
                return;
            case SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE:
                setAbstractDataAttribute((AbstractDataAttribute)null);
                return;
            case SclPackage.VAL__DAI:
                setDAI((DAI)null);
                return;
            case SclPackage.VAL__VALUE:
                setValue(VALUE_EDEFAULT);
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
            case SclPackage.VAL__SGROUP:
                return isSetSGroup();
            case SclPackage.VAL__ABSTRACT_DATA_ATTRIBUTE:
                return getAbstractDataAttribute() != null;
            case SclPackage.VAL__DAI:
                return getDAI() != null;
            case SclPackage.VAL__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
        result.append(" (sGroup: ");
        if (sGroupESet) result.append(sGroup); else result.append("<unset>");
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //ValImpl
