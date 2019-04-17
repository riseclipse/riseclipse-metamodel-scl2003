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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getParentAbstractEqFuncSubFunc <em>Parent Abstract Eq Func Sub Func</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getParentEquipmentContainer <em>Parent Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getParentFunction <em>Parent Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getParentGeneralEquipmentContainer <em>Parent General Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getParentSubFunction <em>Parent Sub Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralEquipmentImpl extends EquipmentImpl implements GeneralEquipment {
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
     * The cached value of the '{@link #getEqFunction() <em>Eq Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEqFunction()
     * @generated
     * @ordered
     */
    protected EList<EqFunction> eqFunction;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeneralEquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getGeneralEquipment();
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__TYPE, oldType, type, !oldTypeESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GENERAL_EQUIPMENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
    public AbstractEqFuncSubFunc getParentAbstractEqFuncSubFunc() {
        if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC) return null;
        return (AbstractEqFuncSubFunc)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAbstractEqFuncSubFunc(AbstractEqFuncSubFunc newParentAbstractEqFuncSubFunc, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentAbstractEqFuncSubFunc, SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAbstractEqFuncSubFunc(AbstractEqFuncSubFunc newParentAbstractEqFuncSubFunc) {
        if (newParentAbstractEqFuncSubFunc != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC && newParentAbstractEqFuncSubFunc != null)) {
            if (EcoreUtil.isAncestor(this, newParentAbstractEqFuncSubFunc))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentAbstractEqFuncSubFunc != null)
                msgs = ((InternalEObject)newParentAbstractEqFuncSubFunc).eInverseAdd(this, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT, AbstractEqFuncSubFunc.class, msgs);
            msgs = basicSetParentAbstractEqFuncSubFunc(newParentAbstractEqFuncSubFunc, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC, newParentAbstractEqFuncSubFunc, newParentAbstractEqFuncSubFunc));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EqFunction> getEqFunction() {
        if (eqFunction == null) {
            eqFunction = new EObjectContainmentWithInverseEList.Unsettable<EqFunction>(EqFunction.class, this, SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION, SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT);
        }
        return eqFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEqFunction() {
        if (eqFunction != null) ((InternalEList.Unsettable<?>)eqFunction).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEqFunction() {
        return eqFunction != null && ((InternalEList.Unsettable<?>)eqFunction).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquipmentContainer getParentEquipmentContainer() {
        if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER) return null;
        return (EquipmentContainer)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentEquipmentContainer(EquipmentContainer newParentEquipmentContainer, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentEquipmentContainer, SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentEquipmentContainer(EquipmentContainer newParentEquipmentContainer) {
        if (newParentEquipmentContainer != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER && newParentEquipmentContainer != null)) {
            if (EcoreUtil.isAncestor(this, newParentEquipmentContainer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentEquipmentContainer != null)
                msgs = ((InternalEObject)newParentEquipmentContainer).eInverseAdd(this, SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, EquipmentContainer.class, msgs);
            msgs = basicSetParentEquipmentContainer(newParentEquipmentContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER, newParentEquipmentContainer, newParentEquipmentContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Function getParentFunction() {
        if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION) return null;
        return (Function)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunction(Function newParentFunction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentFunction, SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunction(Function newParentFunction) {
        if (newParentFunction != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION && newParentFunction != null)) {
            if (EcoreUtil.isAncestor(this, newParentFunction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentFunction != null)
                msgs = ((InternalEObject)newParentFunction).eInverseAdd(this, SclPackage.FUNCTION__GENERAL_EQUIPMENT, Function.class, msgs);
            msgs = basicSetParentFunction(newParentFunction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION, newParentFunction, newParentFunction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneralEquipmentContainer getParentGeneralEquipmentContainer() {
        if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER) return null;
        return (GeneralEquipmentContainer)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentGeneralEquipmentContainer(GeneralEquipmentContainer newParentGeneralEquipmentContainer, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentGeneralEquipmentContainer, SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentGeneralEquipmentContainer(GeneralEquipmentContainer newParentGeneralEquipmentContainer) {
        if (newParentGeneralEquipmentContainer != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER && newParentGeneralEquipmentContainer != null)) {
            if (EcoreUtil.isAncestor(this, newParentGeneralEquipmentContainer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentGeneralEquipmentContainer != null)
                msgs = ((InternalEObject)newParentGeneralEquipmentContainer).eInverseAdd(this, SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, GeneralEquipmentContainer.class, msgs);
            msgs = basicSetParentGeneralEquipmentContainer(newParentGeneralEquipmentContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER, newParentGeneralEquipmentContainer, newParentGeneralEquipmentContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubFunction getParentSubFunction() {
        if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION) return null;
        return (SubFunction)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSubFunction(SubFunction newParentSubFunction, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentSubFunction, SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSubFunction(SubFunction newParentSubFunction) {
        if (newParentSubFunction != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION && newParentSubFunction != null)) {
            if (EcoreUtil.isAncestor(this, newParentSubFunction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentSubFunction != null)
                msgs = ((InternalEObject)newParentSubFunction).eInverseAdd(this, SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT, SubFunction.class, msgs);
            msgs = basicSetParentSubFunction(newParentSubFunction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION, newParentSubFunction, newParentSubFunction));
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
            case SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEqFunction()).basicAdd(otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentEquipmentContainer((EquipmentContainer)otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentFunction((Function)otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentGeneralEquipmentContainer((GeneralEquipmentContainer)otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentSubFunction((SubFunction)otherEnd, msgs);
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
            case SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC:
                return basicSetParentAbstractEqFuncSubFunc(null, msgs);
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                return ((InternalEList<?>)getEqFunction()).basicRemove(otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER:
                return basicSetParentEquipmentContainer(null, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION:
                return basicSetParentFunction(null, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                return basicSetParentGeneralEquipmentContainer(null, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION:
                return basicSetParentSubFunction(null, msgs);
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
            case SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC:
                return eInternalContainer().eInverseRemove(this, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT, AbstractEqFuncSubFunc.class, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER:
                return eInternalContainer().eInverseRemove(this, SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, EquipmentContainer.class, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION:
                return eInternalContainer().eInverseRemove(this, SclPackage.FUNCTION__GENERAL_EQUIPMENT, Function.class, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                return eInternalContainer().eInverseRemove(this, SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, GeneralEquipmentContainer.class, msgs);
            case SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION:
                return eInternalContainer().eInverseRemove(this, SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT, SubFunction.class, msgs);
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
            case SclPackage.GENERAL_EQUIPMENT__TYPE:
                return getType();
            case SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC:
                return getParentAbstractEqFuncSubFunc();
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                return getEqFunction();
            case SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER:
                return getParentEquipmentContainer();
            case SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION:
                return getParentFunction();
            case SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                return getParentGeneralEquipmentContainer();
            case SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION:
                return getParentSubFunction();
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
            case SclPackage.GENERAL_EQUIPMENT__TYPE:
                setType((String)newValue);
                return;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC:
                setParentAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)newValue);
                return;
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                getEqFunction().clear();
                getEqFunction().addAll((Collection<? extends EqFunction>)newValue);
                return;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER:
                setParentEquipmentContainer((EquipmentContainer)newValue);
                return;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION:
                setParentFunction((Function)newValue);
                return;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                setParentGeneralEquipmentContainer((GeneralEquipmentContainer)newValue);
                return;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION:
                setParentSubFunction((SubFunction)newValue);
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
            case SclPackage.GENERAL_EQUIPMENT__TYPE:
                unsetType();
                return;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC:
                setParentAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)null);
                return;
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                unsetEqFunction();
                return;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER:
                setParentEquipmentContainer((EquipmentContainer)null);
                return;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION:
                setParentFunction((Function)null);
                return;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                setParentGeneralEquipmentContainer((GeneralEquipmentContainer)null);
                return;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION:
                setParentSubFunction((SubFunction)null);
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
            case SclPackage.GENERAL_EQUIPMENT__TYPE:
                return isSetType();
            case SclPackage.GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC:
                return getParentAbstractEqFuncSubFunc() != null;
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                return isSetEqFunction();
            case SclPackage.GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER:
                return getParentEquipmentContainer() != null;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_FUNCTION:
                return getParentFunction() != null;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER:
                return getParentGeneralEquipmentContainer() != null;
            case SclPackage.GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION:
                return getParentSubFunction() != null;
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

} //GeneralEquipmentImpl
