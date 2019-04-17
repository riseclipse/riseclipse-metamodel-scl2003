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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getParentBay <em>Parent Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getParentGeneralEquipmentContainer <em>Parent General Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getParentSubstation <em>Parent Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getParentVoltageLevel <em>Parent Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getSubFunction <em>Sub Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getGeneralEquipment <em>General Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends PowerSystemResourceImpl implements Function {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConductingEquipment()
     * @generated
     * @ordered
     */
    protected EList<ConductingEquipment> conductingEquipment;

    /**
     * The cached value of the '{@link #getSubFunction() <em>Sub Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubFunction()
     * @generated
     * @ordered
     */
    protected EList<SubFunction> subFunction;

    /**
     * The cached value of the '{@link #getGeneralEquipment() <em>General Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneralEquipment()
     * @generated
     * @ordered
     */
    protected EList<GeneralEquipment> generalEquipment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getFunction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FUNCTION__TYPE, oldType, type, !oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.FUNCTION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Bay getParentBay() {
        if (eContainerFeatureID() != SclPackage.FUNCTION__PARENT_BAY) return null;
        return (Bay)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentBay(Bay newParentBay, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentBay, SclPackage.FUNCTION__PARENT_BAY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentBay(Bay newParentBay) {
        if (newParentBay != eInternalContainer() || (eContainerFeatureID() != SclPackage.FUNCTION__PARENT_BAY && newParentBay != null)) {
            if (EcoreUtil.isAncestor(this, newParentBay))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentBay != null)
                msgs = ((InternalEObject)newParentBay).eInverseAdd(this, SclPackage.BAY__FUNCTION, Bay.class, msgs);
            msgs = basicSetParentBay(newParentBay, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FUNCTION__PARENT_BAY, newParentBay, newParentBay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConductingEquipment> getConductingEquipment() {
        if (conductingEquipment == null) {
            conductingEquipment = new EObjectContainmentWithInverseEList.Unsettable<ConductingEquipment>(ConductingEquipment.class, this, SclPackage.FUNCTION__CONDUCTING_EQUIPMENT, SclPackage.CONDUCTING_EQUIPMENT__PARENT_FUNCTION);
        }
        return conductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConductingEquipment() {
        if (conductingEquipment != null) ((InternalEList.Unsettable<?>)conductingEquipment).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConductingEquipment() {
        return conductingEquipment != null && ((InternalEList.Unsettable<?>)conductingEquipment).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneralEquipmentContainer getParentGeneralEquipmentContainer() {
        if (eContainerFeatureID() != SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER) return null;
        return (GeneralEquipmentContainer)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentGeneralEquipmentContainer(GeneralEquipmentContainer newParentGeneralEquipmentContainer, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentGeneralEquipmentContainer, SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentGeneralEquipmentContainer(GeneralEquipmentContainer newParentGeneralEquipmentContainer) {
        if (newParentGeneralEquipmentContainer != eInternalContainer() || (eContainerFeatureID() != SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER && newParentGeneralEquipmentContainer != null)) {
            if (EcoreUtil.isAncestor(this, newParentGeneralEquipmentContainer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentGeneralEquipmentContainer != null)
                msgs = ((InternalEObject)newParentGeneralEquipmentContainer).eInverseAdd(this, SclPackage.GENERAL_EQUIPMENT_CONTAINER__FUNCTION, GeneralEquipmentContainer.class, msgs);
            msgs = basicSetParentGeneralEquipmentContainer(newParentGeneralEquipmentContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER, newParentGeneralEquipmentContainer, newParentGeneralEquipmentContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Substation getParentSubstation() {
        if (eContainerFeatureID() != SclPackage.FUNCTION__PARENT_SUBSTATION) return null;
        return (Substation)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSubstation(Substation newParentSubstation, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentSubstation, SclPackage.FUNCTION__PARENT_SUBSTATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSubstation(Substation newParentSubstation) {
        if (newParentSubstation != eInternalContainer() || (eContainerFeatureID() != SclPackage.FUNCTION__PARENT_SUBSTATION && newParentSubstation != null)) {
            if (EcoreUtil.isAncestor(this, newParentSubstation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentSubstation != null)
                msgs = ((InternalEObject)newParentSubstation).eInverseAdd(this, SclPackage.SUBSTATION__FUNCTION, Substation.class, msgs);
            msgs = basicSetParentSubstation(newParentSubstation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FUNCTION__PARENT_SUBSTATION, newParentSubstation, newParentSubstation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageLevel getParentVoltageLevel() {
        if (eContainerFeatureID() != SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL) return null;
        return (VoltageLevel)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentVoltageLevel(VoltageLevel newParentVoltageLevel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentVoltageLevel, SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentVoltageLevel(VoltageLevel newParentVoltageLevel) {
        if (newParentVoltageLevel != eInternalContainer() || (eContainerFeatureID() != SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL && newParentVoltageLevel != null)) {
            if (EcoreUtil.isAncestor(this, newParentVoltageLevel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentVoltageLevel != null)
                msgs = ((InternalEObject)newParentVoltageLevel).eInverseAdd(this, SclPackage.VOLTAGE_LEVEL__FUNCTION, VoltageLevel.class, msgs);
            msgs = basicSetParentVoltageLevel(newParentVoltageLevel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL, newParentVoltageLevel, newParentVoltageLevel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<SubFunction> getSubFunction() {
        if (subFunction == null) {
            subFunction = new EObjectContainmentWithInverseEList.Unsettable<SubFunction>(SubFunction.class, this, SclPackage.FUNCTION__SUB_FUNCTION, SclPackage.SUB_FUNCTION__PARENT_FUNCTION);
        }
        return subFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubFunction() {
        if (subFunction != null) ((InternalEList.Unsettable<?>)subFunction).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubFunction() {
        return subFunction != null && ((InternalEList.Unsettable<?>)subFunction).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<GeneralEquipment> getGeneralEquipment() {
        if (generalEquipment == null) {
            generalEquipment = new EObjectContainmentWithInverseEList.Unsettable<GeneralEquipment>(GeneralEquipment.class, this, SclPackage.FUNCTION__GENERAL_EQUIPMENT, SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION);
        }
        return generalEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGeneralEquipment() {
        if (generalEquipment != null) ((InternalEList.Unsettable<?>)generalEquipment).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGeneralEquipment() {
        return generalEquipment != null && ((InternalEList.Unsettable<?>)generalEquipment).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.FUNCTION__PARENT_BAY:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentBay((Bay)otherEnd, msgs);
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipment()).basicAdd(otherEnd, msgs);
            case SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentGeneralEquipmentContainer((GeneralEquipmentContainer)otherEnd, msgs);
            case SclPackage.FUNCTION__PARENT_SUBSTATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentSubstation((Substation)otherEnd, msgs);
            case SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentVoltageLevel((VoltageLevel)otherEnd, msgs);
            case SclPackage.FUNCTION__SUB_FUNCTION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubFunction()).basicAdd(otherEnd, msgs);
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralEquipment()).basicAdd(otherEnd, msgs);
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
            case SclPackage.FUNCTION__PARENT_BAY:
                return basicSetParentBay(null, msgs);
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                return ((InternalEList<?>)getConductingEquipment()).basicRemove(otherEnd, msgs);
            case SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                return basicSetParentGeneralEquipmentContainer(null, msgs);
            case SclPackage.FUNCTION__PARENT_SUBSTATION:
                return basicSetParentSubstation(null, msgs);
            case SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL:
                return basicSetParentVoltageLevel(null, msgs);
            case SclPackage.FUNCTION__SUB_FUNCTION:
                return ((InternalEList<?>)getSubFunction()).basicRemove(otherEnd, msgs);
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT:
                return ((InternalEList<?>)getGeneralEquipment()).basicRemove(otherEnd, msgs);
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
            case SclPackage.FUNCTION__PARENT_BAY:
                return eInternalContainer().eInverseRemove(this, SclPackage.BAY__FUNCTION, Bay.class, msgs);
            case SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                return eInternalContainer().eInverseRemove(this, SclPackage.GENERAL_EQUIPMENT_CONTAINER__FUNCTION, GeneralEquipmentContainer.class, msgs);
            case SclPackage.FUNCTION__PARENT_SUBSTATION:
                return eInternalContainer().eInverseRemove(this, SclPackage.SUBSTATION__FUNCTION, Substation.class, msgs);
            case SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL:
                return eInternalContainer().eInverseRemove(this, SclPackage.VOLTAGE_LEVEL__FUNCTION, VoltageLevel.class, msgs);
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
            case SclPackage.FUNCTION__TYPE:
                return getType();
            case SclPackage.FUNCTION__PARENT_BAY:
                return getParentBay();
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                return getConductingEquipment();
            case SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                return getParentGeneralEquipmentContainer();
            case SclPackage.FUNCTION__PARENT_SUBSTATION:
                return getParentSubstation();
            case SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL:
                return getParentVoltageLevel();
            case SclPackage.FUNCTION__SUB_FUNCTION:
                return getSubFunction();
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT:
                return getGeneralEquipment();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
            case SclPackage.FUNCTION__TYPE:
                setType((String)newValue);
                return;
            case SclPackage.FUNCTION__PARENT_BAY:
                setParentBay((Bay)newValue);
                return;
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                getConductingEquipment().clear();
                getConductingEquipment().addAll((Collection<? extends ConductingEquipment>)newValue);
                return;
            case SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                setParentGeneralEquipmentContainer((GeneralEquipmentContainer)newValue);
                return;
            case SclPackage.FUNCTION__PARENT_SUBSTATION:
                setParentSubstation((Substation)newValue);
                return;
            case SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL:
                setParentVoltageLevel((VoltageLevel)newValue);
                return;
            case SclPackage.FUNCTION__SUB_FUNCTION:
                getSubFunction().clear();
                getSubFunction().addAll((Collection<? extends SubFunction>)newValue);
                return;
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT:
                getGeneralEquipment().clear();
                getGeneralEquipment().addAll((Collection<? extends GeneralEquipment>)newValue);
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
            case SclPackage.FUNCTION__TYPE:
                unsetType();
                return;
            case SclPackage.FUNCTION__PARENT_BAY:
                setParentBay((Bay)null);
                return;
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                unsetConductingEquipment();
                return;
            case SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                setParentGeneralEquipmentContainer((GeneralEquipmentContainer)null);
                return;
            case SclPackage.FUNCTION__PARENT_SUBSTATION:
                setParentSubstation((Substation)null);
                return;
            case SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL:
                setParentVoltageLevel((VoltageLevel)null);
                return;
            case SclPackage.FUNCTION__SUB_FUNCTION:
                unsetSubFunction();
                return;
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT:
                unsetGeneralEquipment();
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
            case SclPackage.FUNCTION__TYPE:
                return isSetType();
            case SclPackage.FUNCTION__PARENT_BAY:
                return getParentBay() != null;
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                return isSetConductingEquipment();
            case SclPackage.FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                return getParentGeneralEquipmentContainer() != null;
            case SclPackage.FUNCTION__PARENT_SUBSTATION:
                return getParentSubstation() != null;
            case SclPackage.FUNCTION__PARENT_VOLTAGE_LEVEL:
                return getParentVoltageLevel() != null;
            case SclPackage.FUNCTION__SUB_FUNCTION:
                return isSetSubFunction();
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT:
                return isSetGeneralEquipment();
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
        result.append(" (type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //FunctionImpl
