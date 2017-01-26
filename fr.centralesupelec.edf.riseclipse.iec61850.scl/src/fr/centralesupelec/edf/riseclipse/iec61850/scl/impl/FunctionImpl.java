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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getGeneralEquipmentContainer <em>General Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl#getVoltageLevel <em>Voltage Level</em>}</li>
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
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bay getBay() {
        if (eContainerFeatureID() != SclPackage.FUNCTION__BAY) return null;
        return (Bay)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBay( Bay newBay, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newBay, SclPackage.FUNCTION__BAY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBay( Bay newBay ) {
        if (newBay != eInternalContainer() || (eContainerFeatureID() != SclPackage.FUNCTION__BAY && newBay != null)) {
            if (EcoreUtil.isAncestor(this, newBay))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newBay != null)
                msgs = ((InternalEObject)newBay).eInverseAdd(this, SclPackage.BAY__FUNCTION, Bay.class, msgs);
            msgs = basicSetBay(newBay, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FUNCTION__BAY, newBay, newBay));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConductingEquipment> getConductingEquipment() {
        if (conductingEquipment == null) {
            conductingEquipment = new EObjectContainmentWithInverseEList.Unsettable<ConductingEquipment>(ConductingEquipment.class, this, SclPackage.FUNCTION__CONDUCTING_EQUIPMENT, SclPackage.CONDUCTING_EQUIPMENT__FUNCTION);
        }
        return conductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConductingEquipment() {
        if (conductingEquipment != null) ((InternalEList.Unsettable<?>)conductingEquipment).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConductingEquipment() {
        return conductingEquipment != null && ((InternalEList.Unsettable<?>)conductingEquipment).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralEquipmentContainer getGeneralEquipmentContainer() {
        if (eContainerFeatureID() != SclPackage.FUNCTION__GENERAL_EQUIPMENT_CONTAINER) return null;
        return (GeneralEquipmentContainer)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGeneralEquipmentContainer( GeneralEquipmentContainer newGeneralEquipmentContainer,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newGeneralEquipmentContainer, SclPackage.FUNCTION__GENERAL_EQUIPMENT_CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeneralEquipmentContainer( GeneralEquipmentContainer newGeneralEquipmentContainer ) {
        if (newGeneralEquipmentContainer != eInternalContainer() || (eContainerFeatureID() != SclPackage.FUNCTION__GENERAL_EQUIPMENT_CONTAINER && newGeneralEquipmentContainer != null)) {
            if (EcoreUtil.isAncestor(this, newGeneralEquipmentContainer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newGeneralEquipmentContainer != null)
                msgs = ((InternalEObject)newGeneralEquipmentContainer).eInverseAdd(this, SclPackage.GENERAL_EQUIPMENT_CONTAINER__FUNCTION, GeneralEquipmentContainer.class, msgs);
            msgs = basicSetGeneralEquipmentContainer(newGeneralEquipmentContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FUNCTION__GENERAL_EQUIPMENT_CONTAINER, newGeneralEquipmentContainer, newGeneralEquipmentContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Substation getSubstation() {
        if (eContainerFeatureID() != SclPackage.FUNCTION__SUBSTATION) return null;
        return (Substation)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubstation( Substation newSubstation, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newSubstation, SclPackage.FUNCTION__SUBSTATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubstation( Substation newSubstation ) {
        if (newSubstation != eInternalContainer() || (eContainerFeatureID() != SclPackage.FUNCTION__SUBSTATION && newSubstation != null)) {
            if (EcoreUtil.isAncestor(this, newSubstation))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSubstation != null)
                msgs = ((InternalEObject)newSubstation).eInverseAdd(this, SclPackage.SUBSTATION__FUNCTION, Substation.class, msgs);
            msgs = basicSetSubstation(newSubstation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FUNCTION__SUBSTATION, newSubstation, newSubstation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VoltageLevel getVoltageLevel() {
        if (eContainerFeatureID() != SclPackage.FUNCTION__VOLTAGE_LEVEL) return null;
        return (VoltageLevel)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVoltageLevel( VoltageLevel newVoltageLevel, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newVoltageLevel, SclPackage.FUNCTION__VOLTAGE_LEVEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVoltageLevel( VoltageLevel newVoltageLevel ) {
        if (newVoltageLevel != eInternalContainer() || (eContainerFeatureID() != SclPackage.FUNCTION__VOLTAGE_LEVEL && newVoltageLevel != null)) {
            if (EcoreUtil.isAncestor(this, newVoltageLevel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newVoltageLevel != null)
                msgs = ((InternalEObject)newVoltageLevel).eInverseAdd(this, SclPackage.VOLTAGE_LEVEL__FUNCTION, VoltageLevel.class, msgs);
            msgs = basicSetVoltageLevel(newVoltageLevel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.FUNCTION__VOLTAGE_LEVEL, newVoltageLevel, newVoltageLevel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SubFunction> getSubFunction() {
        if (subFunction == null) {
            subFunction = new EObjectContainmentWithInverseEList.Unsettable<SubFunction>(SubFunction.class, this, SclPackage.FUNCTION__SUB_FUNCTION, SclPackage.SUB_FUNCTION__FUNCTION);
        }
        return subFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSubFunction() {
        if (subFunction != null) ((InternalEList.Unsettable<?>)subFunction).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSubFunction() {
        return subFunction != null && ((InternalEList.Unsettable<?>)subFunction).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GeneralEquipment> getGeneralEquipment() {
        if (generalEquipment == null) {
            generalEquipment = new EObjectContainmentWithInverseEList.Unsettable<GeneralEquipment>(GeneralEquipment.class, this, SclPackage.FUNCTION__GENERAL_EQUIPMENT, SclPackage.GENERAL_EQUIPMENT__FUNCTION);
        }
        return generalEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetGeneralEquipment() {
        if (generalEquipment != null) ((InternalEList.Unsettable<?>)generalEquipment).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
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
            case SclPackage.FUNCTION__BAY:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetBay((Bay)otherEnd, msgs);
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipment()).basicAdd(otherEnd, msgs);
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT_CONTAINER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetGeneralEquipmentContainer((GeneralEquipmentContainer)otherEnd, msgs);
            case SclPackage.FUNCTION__SUBSTATION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSubstation((Substation)otherEnd, msgs);
            case SclPackage.FUNCTION__VOLTAGE_LEVEL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetVoltageLevel((VoltageLevel)otherEnd, msgs);
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
            case SclPackage.FUNCTION__BAY:
                return basicSetBay(null, msgs);
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                return ((InternalEList<?>)getConductingEquipment()).basicRemove(otherEnd, msgs);
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT_CONTAINER:
                return basicSetGeneralEquipmentContainer(null, msgs);
            case SclPackage.FUNCTION__SUBSTATION:
                return basicSetSubstation(null, msgs);
            case SclPackage.FUNCTION__VOLTAGE_LEVEL:
                return basicSetVoltageLevel(null, msgs);
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
            case SclPackage.FUNCTION__BAY:
                return eInternalContainer().eInverseRemove(this, SclPackage.BAY__FUNCTION, Bay.class, msgs);
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT_CONTAINER:
                return eInternalContainer().eInverseRemove(this, SclPackage.GENERAL_EQUIPMENT_CONTAINER__FUNCTION, GeneralEquipmentContainer.class, msgs);
            case SclPackage.FUNCTION__SUBSTATION:
                return eInternalContainer().eInverseRemove(this, SclPackage.SUBSTATION__FUNCTION, Substation.class, msgs);
            case SclPackage.FUNCTION__VOLTAGE_LEVEL:
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
            case SclPackage.FUNCTION__BAY:
                return getBay();
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                return getConductingEquipment();
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT_CONTAINER:
                return getGeneralEquipmentContainer();
            case SclPackage.FUNCTION__SUBSTATION:
                return getSubstation();
            case SclPackage.FUNCTION__VOLTAGE_LEVEL:
                return getVoltageLevel();
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
            case SclPackage.FUNCTION__BAY:
                setBay((Bay)newValue);
                return;
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                getConductingEquipment().clear();
                getConductingEquipment().addAll((Collection<? extends ConductingEquipment>)newValue);
                return;
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT_CONTAINER:
                setGeneralEquipmentContainer((GeneralEquipmentContainer)newValue);
                return;
            case SclPackage.FUNCTION__SUBSTATION:
                setSubstation((Substation)newValue);
                return;
            case SclPackage.FUNCTION__VOLTAGE_LEVEL:
                setVoltageLevel((VoltageLevel)newValue);
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
            case SclPackage.FUNCTION__BAY:
                setBay((Bay)null);
                return;
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                unsetConductingEquipment();
                return;
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT_CONTAINER:
                setGeneralEquipmentContainer((GeneralEquipmentContainer)null);
                return;
            case SclPackage.FUNCTION__SUBSTATION:
                setSubstation((Substation)null);
                return;
            case SclPackage.FUNCTION__VOLTAGE_LEVEL:
                setVoltageLevel((VoltageLevel)null);
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
            case SclPackage.FUNCTION__BAY:
                return getBay() != null;
            case SclPackage.FUNCTION__CONDUCTING_EQUIPMENT:
                return isSetConductingEquipment();
            case SclPackage.FUNCTION__GENERAL_EQUIPMENT_CONTAINER:
                return getGeneralEquipmentContainer() != null;
            case SclPackage.FUNCTION__SUBSTATION:
                return getSubstation() != null;
            case SclPackage.FUNCTION__VOLTAGE_LEVEL:
                return getVoltageLevel() != null;
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //FunctionImpl
