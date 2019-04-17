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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eq Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getParentConductingEquipment <em>Parent Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getParentGeneralEquipment <em>Parent General Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getParentPowerTransformer <em>Parent Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getParentSubEquipment <em>Parent Sub Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getParentTransformerWinding <em>Parent Transformer Winding</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getParentTapChanger <em>Parent Tap Changer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqFunctionImpl extends AbstractEqFuncSubFuncImpl implements EqFunction {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EqFunctionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getEqFunction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConductingEquipment getParentConductingEquipment() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT) return null;
        return (ConductingEquipment)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentConductingEquipment(ConductingEquipment newParentConductingEquipment, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentConductingEquipment, SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentConductingEquipment(ConductingEquipment newParentConductingEquipment) {
        if (newParentConductingEquipment != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT && newParentConductingEquipment != null)) {
            if (EcoreUtil.isAncestor(this, newParentConductingEquipment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentConductingEquipment != null)
                msgs = ((InternalEObject)newParentConductingEquipment).eInverseAdd(this, SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION, ConductingEquipment.class, msgs);
            msgs = basicSetParentConductingEquipment(newParentConductingEquipment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT, newParentConductingEquipment, newParentConductingEquipment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneralEquipment getParentGeneralEquipment() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT) return null;
        return (GeneralEquipment)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentGeneralEquipment(GeneralEquipment newParentGeneralEquipment, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentGeneralEquipment, SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentGeneralEquipment(GeneralEquipment newParentGeneralEquipment) {
        if (newParentGeneralEquipment != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT && newParentGeneralEquipment != null)) {
            if (EcoreUtil.isAncestor(this, newParentGeneralEquipment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentGeneralEquipment != null)
                msgs = ((InternalEObject)newParentGeneralEquipment).eInverseAdd(this, SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION, GeneralEquipment.class, msgs);
            msgs = basicSetParentGeneralEquipment(newParentGeneralEquipment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT, newParentGeneralEquipment, newParentGeneralEquipment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerTransformer getParentPowerTransformer() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER) return null;
        return (PowerTransformer)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentPowerTransformer(PowerTransformer newParentPowerTransformer, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentPowerTransformer, SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentPowerTransformer(PowerTransformer newParentPowerTransformer) {
        if (newParentPowerTransformer != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER && newParentPowerTransformer != null)) {
            if (EcoreUtil.isAncestor(this, newParentPowerTransformer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentPowerTransformer != null)
                msgs = ((InternalEObject)newParentPowerTransformer).eInverseAdd(this, SclPackage.POWER_TRANSFORMER__EQ_FUNCTION, PowerTransformer.class, msgs);
            msgs = basicSetParentPowerTransformer(newParentPowerTransformer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER, newParentPowerTransformer, newParentPowerTransformer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubEquipment getParentSubEquipment() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT) return null;
        return (SubEquipment)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSubEquipment(SubEquipment newParentSubEquipment, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentSubEquipment, SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSubEquipment(SubEquipment newParentSubEquipment) {
        if (newParentSubEquipment != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT && newParentSubEquipment != null)) {
            if (EcoreUtil.isAncestor(this, newParentSubEquipment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentSubEquipment != null)
                msgs = ((InternalEObject)newParentSubEquipment).eInverseAdd(this, SclPackage.SUB_EQUIPMENT__EQ_FUNCTION, SubEquipment.class, msgs);
            msgs = basicSetParentSubEquipment(newParentSubEquipment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT, newParentSubEquipment, newParentSubEquipment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerWinding getParentTransformerWinding() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_TRANSFORMER_WINDING) return null;
        return (TransformerWinding)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentTransformerWinding(TransformerWinding newParentTransformerWinding, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentTransformerWinding, SclPackage.EQ_FUNCTION__PARENT_TRANSFORMER_WINDING, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentTransformerWinding(TransformerWinding newParentTransformerWinding) {
        if (newParentTransformerWinding != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_TRANSFORMER_WINDING && newParentTransformerWinding != null)) {
            if (EcoreUtil.isAncestor(this, newParentTransformerWinding))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentTransformerWinding != null)
                msgs = ((InternalEObject)newParentTransformerWinding).eInverseAdd(this, SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION, TransformerWinding.class, msgs);
            msgs = basicSetParentTransformerWinding(newParentTransformerWinding, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__PARENT_TRANSFORMER_WINDING, newParentTransformerWinding, newParentTransformerWinding));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChanger getParentTapChanger() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_TAP_CHANGER) return null;
        return (TapChanger)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentTapChanger(TapChanger newParentTapChanger, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentTapChanger, SclPackage.EQ_FUNCTION__PARENT_TAP_CHANGER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentTapChanger(TapChanger newParentTapChanger) {
        if (newParentTapChanger != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__PARENT_TAP_CHANGER && newParentTapChanger != null)) {
            if (EcoreUtil.isAncestor(this, newParentTapChanger))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentTapChanger != null)
                msgs = ((InternalEObject)newParentTapChanger).eInverseAdd(this, SclPackage.TAP_CHANGER__EQ_FUNCTION, TapChanger.class, msgs);
            msgs = basicSetParentTapChanger(newParentTapChanger, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__PARENT_TAP_CHANGER, newParentTapChanger, newParentTapChanger));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentConductingEquipment((ConductingEquipment)otherEnd, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentGeneralEquipment((GeneralEquipment)otherEnd, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentPowerTransformer((PowerTransformer)otherEnd, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentSubEquipment((SubEquipment)otherEnd, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_TRANSFORMER_WINDING:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentTransformerWinding((TransformerWinding)otherEnd, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_TAP_CHANGER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentTapChanger((TapChanger)otherEnd, msgs);
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
            case SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT:
                return basicSetParentConductingEquipment(null, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT:
                return basicSetParentGeneralEquipment(null, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER:
                return basicSetParentPowerTransformer(null, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT:
                return basicSetParentSubEquipment(null, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_TRANSFORMER_WINDING:
                return basicSetParentTransformerWinding(null, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_TAP_CHANGER:
                return basicSetParentTapChanger(null, msgs);
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
            case SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT:
                return eInternalContainer().eInverseRemove(this, SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION, ConductingEquipment.class, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT:
                return eInternalContainer().eInverseRemove(this, SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION, GeneralEquipment.class, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER:
                return eInternalContainer().eInverseRemove(this, SclPackage.POWER_TRANSFORMER__EQ_FUNCTION, PowerTransformer.class, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT:
                return eInternalContainer().eInverseRemove(this, SclPackage.SUB_EQUIPMENT__EQ_FUNCTION, SubEquipment.class, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_TRANSFORMER_WINDING:
                return eInternalContainer().eInverseRemove(this, SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION, TransformerWinding.class, msgs);
            case SclPackage.EQ_FUNCTION__PARENT_TAP_CHANGER:
                return eInternalContainer().eInverseRemove(this, SclPackage.TAP_CHANGER__EQ_FUNCTION, TapChanger.class, msgs);
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
            case SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT:
                return getParentConductingEquipment();
            case SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT:
                return getParentGeneralEquipment();
            case SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER:
                return getParentPowerTransformer();
            case SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT:
                return getParentSubEquipment();
            case SclPackage.EQ_FUNCTION__PARENT_TRANSFORMER_WINDING:
                return getParentTransformerWinding();
            case SclPackage.EQ_FUNCTION__PARENT_TAP_CHANGER:
                return getParentTapChanger();
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
            case SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT:
                setParentConductingEquipment((ConductingEquipment)newValue);
                return;
            case SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT:
                setParentGeneralEquipment((GeneralEquipment)newValue);
                return;
            case SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER:
                setParentPowerTransformer((PowerTransformer)newValue);
                return;
            case SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT:
                setParentSubEquipment((SubEquipment)newValue);
                return;
            case SclPackage.EQ_FUNCTION__PARENT_TRANSFORMER_WINDING:
                setParentTransformerWinding((TransformerWinding)newValue);
                return;
            case SclPackage.EQ_FUNCTION__PARENT_TAP_CHANGER:
                setParentTapChanger((TapChanger)newValue);
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
            case SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT:
                setParentConductingEquipment((ConductingEquipment)null);
                return;
            case SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT:
                setParentGeneralEquipment((GeneralEquipment)null);
                return;
            case SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER:
                setParentPowerTransformer((PowerTransformer)null);
                return;
            case SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT:
                setParentSubEquipment((SubEquipment)null);
                return;
            case SclPackage.EQ_FUNCTION__PARENT_TRANSFORMER_WINDING:
                setParentTransformerWinding((TransformerWinding)null);
                return;
            case SclPackage.EQ_FUNCTION__PARENT_TAP_CHANGER:
                setParentTapChanger((TapChanger)null);
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
            case SclPackage.EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT:
                return getParentConductingEquipment() != null;
            case SclPackage.EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT:
                return getParentGeneralEquipment() != null;
            case SclPackage.EQ_FUNCTION__PARENT_POWER_TRANSFORMER:
                return getParentPowerTransformer() != null;
            case SclPackage.EQ_FUNCTION__PARENT_SUB_EQUIPMENT:
                return getParentSubEquipment() != null;
            case SclPackage.EQ_FUNCTION__PARENT_TRANSFORMER_WINDING:
                return getParentTransformerWinding() != null;
            case SclPackage.EQ_FUNCTION__PARENT_TAP_CHANGER:
                return getParentTapChanger() != null;
        }
        return super.eIsSet(featureID);
    }

} //EqFunctionImpl
