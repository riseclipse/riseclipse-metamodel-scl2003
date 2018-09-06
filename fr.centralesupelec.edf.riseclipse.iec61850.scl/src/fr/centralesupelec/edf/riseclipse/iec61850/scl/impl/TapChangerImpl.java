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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TapChangerImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TapChangerImpl#getVirtual <em>Virtual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TapChangerImpl#getEqFunction <em>Eq Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TapChangerImpl#getSubEquipment <em>Sub Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TapChangerImpl#getTransformerWinding <em>Transformer Winding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapChangerImpl extends PowerSystemResourceImpl implements TapChanger {
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
     * The default value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVirtual()
     * @generated
     * @ordered
     */
    protected static final Boolean VIRTUAL_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getVirtual() <em>Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVirtual()
     * @generated
     * @ordered
     */
    protected Boolean virtual = VIRTUAL_EDEFAULT;

    /**
     * This is true if the Virtual attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean virtualESet;

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
     * The cached value of the '{@link #getSubEquipment() <em>Sub Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubEquipment()
     * @generated
     * @ordered
     */
    protected EList<SubEquipment> subEquipment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TapChangerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getTapChanger();
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TAP_CHANGER__TYPE, oldType, type, !oldTypeESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TAP_CHANGER__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
    public Boolean getVirtual() {
        return virtual;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setVirtual( Boolean newVirtual ) {
        Boolean oldVirtual = virtual;
        virtual = newVirtual;
        boolean oldVirtualESet = virtualESet;
        virtualESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TAP_CHANGER__VIRTUAL, oldVirtual, virtual, !oldVirtualESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVirtual() {
        Boolean oldVirtual = virtual;
        boolean oldVirtualESet = virtualESet;
        virtual = VIRTUAL_EDEFAULT;
        virtualESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TAP_CHANGER__VIRTUAL, oldVirtual, VIRTUAL_EDEFAULT, oldVirtualESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVirtual() {
        return virtualESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EqFunction> getEqFunction() {
        if (eqFunction == null) {
            eqFunction = new EObjectContainmentWithInverseEList.Unsettable<EqFunction>(EqFunction.class, this, SclPackage.TAP_CHANGER__EQ_FUNCTION, SclPackage.EQ_FUNCTION__TAP_CHANGER);
        }
        return eqFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetEqFunction() {
        if (eqFunction != null) ((InternalEList.Unsettable<?>)eqFunction).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetEqFunction() {
        return eqFunction != null && ((InternalEList.Unsettable<?>)eqFunction).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SubEquipment> getSubEquipment() {
        if (subEquipment == null) {
            subEquipment = new EObjectContainmentWithInverseEList.Unsettable<SubEquipment>(SubEquipment.class, this, SclPackage.TAP_CHANGER__SUB_EQUIPMENT, SclPackage.SUB_EQUIPMENT__TAP_CHANGER);
        }
        return subEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSubEquipment() {
        if (subEquipment != null) ((InternalEList.Unsettable<?>)subEquipment).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSubEquipment() {
        return subEquipment != null && ((InternalEList.Unsettable<?>)subEquipment).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformerWinding getTransformerWinding() {
        if (eContainerFeatureID() != SclPackage.TAP_CHANGER__TRANSFORMER_WINDING) return null;
        return (TransformerWinding)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransformerWinding( TransformerWinding newTransformerWinding,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newTransformerWinding, SclPackage.TAP_CHANGER__TRANSFORMER_WINDING, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransformerWinding( TransformerWinding newTransformerWinding ) {
        if (newTransformerWinding != eInternalContainer() || (eContainerFeatureID() != SclPackage.TAP_CHANGER__TRANSFORMER_WINDING && newTransformerWinding != null)) {
            if (EcoreUtil.isAncestor(this, newTransformerWinding))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTransformerWinding != null)
                msgs = ((InternalEObject)newTransformerWinding).eInverseAdd(this, SclPackage.TRANSFORMER_WINDING__TAP_CHANGER, TransformerWinding.class, msgs);
            msgs = basicSetTransformerWinding(newTransformerWinding, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TAP_CHANGER__TRANSFORMER_WINDING, newTransformerWinding, newTransformerWinding));
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
            case SclPackage.TAP_CHANGER__EQ_FUNCTION:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getEqFunction()).basicAdd(otherEnd, msgs);
            case SclPackage.TAP_CHANGER__SUB_EQUIPMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubEquipment()).basicAdd(otherEnd, msgs);
            case SclPackage.TAP_CHANGER__TRANSFORMER_WINDING:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetTransformerWinding((TransformerWinding)otherEnd, msgs);
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
            case SclPackage.TAP_CHANGER__EQ_FUNCTION:
                return ((InternalEList<?>)getEqFunction()).basicRemove(otherEnd, msgs);
            case SclPackage.TAP_CHANGER__SUB_EQUIPMENT:
                return ((InternalEList<?>)getSubEquipment()).basicRemove(otherEnd, msgs);
            case SclPackage.TAP_CHANGER__TRANSFORMER_WINDING:
                return basicSetTransformerWinding(null, msgs);
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
            case SclPackage.TAP_CHANGER__TRANSFORMER_WINDING:
                return eInternalContainer().eInverseRemove(this, SclPackage.TRANSFORMER_WINDING__TAP_CHANGER, TransformerWinding.class, msgs);
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
            case SclPackage.TAP_CHANGER__TYPE:
                return getType();
            case SclPackage.TAP_CHANGER__VIRTUAL:
                return getVirtual();
            case SclPackage.TAP_CHANGER__EQ_FUNCTION:
                return getEqFunction();
            case SclPackage.TAP_CHANGER__SUB_EQUIPMENT:
                return getSubEquipment();
            case SclPackage.TAP_CHANGER__TRANSFORMER_WINDING:
                return getTransformerWinding();
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
            case SclPackage.TAP_CHANGER__TYPE:
                setType((String)newValue);
                return;
            case SclPackage.TAP_CHANGER__VIRTUAL:
                setVirtual((Boolean)newValue);
                return;
            case SclPackage.TAP_CHANGER__EQ_FUNCTION:
                getEqFunction().clear();
                getEqFunction().addAll((Collection<? extends EqFunction>)newValue);
                return;
            case SclPackage.TAP_CHANGER__SUB_EQUIPMENT:
                getSubEquipment().clear();
                getSubEquipment().addAll((Collection<? extends SubEquipment>)newValue);
                return;
            case SclPackage.TAP_CHANGER__TRANSFORMER_WINDING:
                setTransformerWinding((TransformerWinding)newValue);
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
            case SclPackage.TAP_CHANGER__TYPE:
                unsetType();
                return;
            case SclPackage.TAP_CHANGER__VIRTUAL:
                unsetVirtual();
                return;
            case SclPackage.TAP_CHANGER__EQ_FUNCTION:
                unsetEqFunction();
                return;
            case SclPackage.TAP_CHANGER__SUB_EQUIPMENT:
                unsetSubEquipment();
                return;
            case SclPackage.TAP_CHANGER__TRANSFORMER_WINDING:
                setTransformerWinding((TransformerWinding)null);
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
            case SclPackage.TAP_CHANGER__TYPE:
                return isSetType();
            case SclPackage.TAP_CHANGER__VIRTUAL:
                return isSetVirtual();
            case SclPackage.TAP_CHANGER__EQ_FUNCTION:
                return isSetEqFunction();
            case SclPackage.TAP_CHANGER__SUB_EQUIPMENT:
                return isSetSubEquipment();
            case SclPackage.TAP_CHANGER__TRANSFORMER_WINDING:
                return getTransformerWinding() != null;
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
        result.append(", virtual: ");
        if (virtualESet) result.append(virtual); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TapChangerImpl
