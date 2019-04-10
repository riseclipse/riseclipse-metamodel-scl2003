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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getAbstractEqFuncSubFunc <em>Abstract Eq Func Sub Func</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getEquipmentContainer <em>Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getGeneralEquipmentContainer <em>General Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl#getSubFunction <em>Sub Function</em>}</li>
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
    public AbstractEqFuncSubFunc getAbstractEqFuncSubFunc() {
        if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC) return null;
        return (AbstractEqFuncSubFunc)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAbstractEqFuncSubFunc( AbstractEqFuncSubFunc newAbstractEqFuncSubFunc,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newAbstractEqFuncSubFunc, SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAbstractEqFuncSubFunc( AbstractEqFuncSubFunc newAbstractEqFuncSubFunc ) {
        if (newAbstractEqFuncSubFunc != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC && newAbstractEqFuncSubFunc != null)) {
            if (EcoreUtil.isAncestor(this, newAbstractEqFuncSubFunc))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAbstractEqFuncSubFunc != null)
                msgs = ((InternalEObject)newAbstractEqFuncSubFunc).eInverseAdd(this, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT, AbstractEqFuncSubFunc.class, msgs);
            msgs = basicSetAbstractEqFuncSubFunc(newAbstractEqFuncSubFunc, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC, newAbstractEqFuncSubFunc, newAbstractEqFuncSubFunc));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EqFunction> getEqFunction() {
        if (eqFunction == null) {
            eqFunction = new EObjectContainmentWithInverseEList.Unsettable<EqFunction>(EqFunction.class, this, SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION, SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT);
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
    public EquipmentContainer getEquipmentContainer() {
        if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER) return null;
        return (EquipmentContainer)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEquipmentContainer( EquipmentContainer newEquipmentContainer,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newEquipmentContainer, SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEquipmentContainer( EquipmentContainer newEquipmentContainer ) {
        if (newEquipmentContainer != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER && newEquipmentContainer != null)) {
            if (EcoreUtil.isAncestor(this, newEquipmentContainer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEquipmentContainer != null)
                msgs = ((InternalEObject)newEquipmentContainer).eInverseAdd(this, SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, EquipmentContainer.class, msgs);
            msgs = basicSetEquipmentContainer(newEquipmentContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER, newEquipmentContainer, newEquipmentContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Function getFunction() {
        if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__FUNCTION) return null;
        return (Function)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFunction( Function newFunction, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newFunction, SclPackage.GENERAL_EQUIPMENT__FUNCTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunction( Function newFunction ) {
        if (newFunction != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__FUNCTION && newFunction != null)) {
            if (EcoreUtil.isAncestor(this, newFunction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newFunction != null)
                msgs = ((InternalEObject)newFunction).eInverseAdd(this, SclPackage.FUNCTION__GENERAL_EQUIPMENT, Function.class, msgs);
            msgs = basicSetFunction(newFunction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__FUNCTION, newFunction, newFunction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneralEquipmentContainer getGeneralEquipmentContainer() {
        if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER) return null;
        return (GeneralEquipmentContainer)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGeneralEquipmentContainer( GeneralEquipmentContainer newGeneralEquipmentContainer,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newGeneralEquipmentContainer, SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGeneralEquipmentContainer( GeneralEquipmentContainer newGeneralEquipmentContainer ) {
        if (newGeneralEquipmentContainer != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER && newGeneralEquipmentContainer != null)) {
            if (EcoreUtil.isAncestor(this, newGeneralEquipmentContainer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newGeneralEquipmentContainer != null)
                msgs = ((InternalEObject)newGeneralEquipmentContainer).eInverseAdd(this, SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, GeneralEquipmentContainer.class, msgs);
            msgs = basicSetGeneralEquipmentContainer(newGeneralEquipmentContainer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER, newGeneralEquipmentContainer, newGeneralEquipmentContainer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubFunction getSubFunction() {
        if (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION) return null;
        return (SubFunction)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubFunction( SubFunction newSubFunction, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newSubFunction, SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubFunction( SubFunction newSubFunction ) {
        if (newSubFunction != eInternalContainer() || (eContainerFeatureID() != SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION && newSubFunction != null)) {
            if (EcoreUtil.isAncestor(this, newSubFunction))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSubFunction != null)
                msgs = ((InternalEObject)newSubFunction).eInverseAdd(this, SclPackage.SUB_FUNCTION__GENERAL_EQUIPMENT, SubFunction.class, msgs);
            msgs = basicSetSubFunction(newSubFunction, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION, newSubFunction, newSubFunction));
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
            case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEqFunction()).basicAdd(otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEquipmentContainer((EquipmentContainer)otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetFunction((Function)otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetGeneralEquipmentContainer((GeneralEquipmentContainer)otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSubFunction((SubFunction)otherEnd, msgs);
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
            case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
                return basicSetAbstractEqFuncSubFunc(null, msgs);
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                return ((InternalEList<?>)getEqFunction()).basicRemove(otherEnd, msgs);
            case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
                return basicSetEquipmentContainer(null, msgs);
            case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
                return basicSetFunction(null, msgs);
            case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
                return basicSetGeneralEquipmentContainer(null, msgs);
            case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
                return basicSetSubFunction(null, msgs);
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
            case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
                return eInternalContainer().eInverseRemove(this, SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT, AbstractEqFuncSubFunc.class, msgs);
            case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
                return eInternalContainer().eInverseRemove(this, SclPackage.EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, EquipmentContainer.class, msgs);
            case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
                return eInternalContainer().eInverseRemove(this, SclPackage.FUNCTION__GENERAL_EQUIPMENT, Function.class, msgs);
            case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
                return eInternalContainer().eInverseRemove(this, SclPackage.GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT, GeneralEquipmentContainer.class, msgs);
            case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
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
            case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
                return getAbstractEqFuncSubFunc();
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                return getEqFunction();
            case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
                return getEquipmentContainer();
            case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
                return getFunction();
            case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
                return getGeneralEquipmentContainer();
            case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
                return getSubFunction();
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
            case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
                setAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)newValue);
                return;
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                getEqFunction().clear();
                getEqFunction().addAll((Collection<? extends EqFunction>)newValue);
                return;
            case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
                setEquipmentContainer((EquipmentContainer)newValue);
                return;
            case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
                setFunction((Function)newValue);
                return;
            case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
                setGeneralEquipmentContainer((GeneralEquipmentContainer)newValue);
                return;
            case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
                setSubFunction((SubFunction)newValue);
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
            case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
                setAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)null);
                return;
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                unsetEqFunction();
                return;
            case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
                setEquipmentContainer((EquipmentContainer)null);
                return;
            case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
                setFunction((Function)null);
                return;
            case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
                setGeneralEquipmentContainer((GeneralEquipmentContainer)null);
                return;
            case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
                setSubFunction((SubFunction)null);
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
            case SclPackage.GENERAL_EQUIPMENT__ABSTRACT_EQ_FUNC_SUB_FUNC:
                return getAbstractEqFuncSubFunc() != null;
            case SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION:
                return isSetEqFunction();
            case SclPackage.GENERAL_EQUIPMENT__EQUIPMENT_CONTAINER:
                return getEquipmentContainer() != null;
            case SclPackage.GENERAL_EQUIPMENT__FUNCTION:
                return getFunction() != null;
            case SclPackage.GENERAL_EQUIPMENT__GENERAL_EQUIPMENT_CONTAINER:
                return getGeneralEquipmentContainer() != null;
            case SclPackage.GENERAL_EQUIPMENT__SUB_FUNCTION:
                return getSubFunction() != null;
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
