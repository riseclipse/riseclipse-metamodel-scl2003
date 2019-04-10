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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getGeneralEquipment <em>General Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getSubEquipment <em>Sub Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getTransformerWinding <em>Transformer Winding</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl#getTapChanger <em>Tap Changer</em>}</li>
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
    public ConductingEquipment getConductingEquipment() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT) return null;
        return (ConductingEquipment)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConductingEquipment( ConductingEquipment newConductingEquipment,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newConductingEquipment, SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConductingEquipment( ConductingEquipment newConductingEquipment ) {
        if (newConductingEquipment != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT && newConductingEquipment != null)) {
            if (EcoreUtil.isAncestor(this, newConductingEquipment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newConductingEquipment != null)
                msgs = ((InternalEObject)newConductingEquipment).eInverseAdd(this, SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION, ConductingEquipment.class, msgs);
            msgs = basicSetConductingEquipment(newConductingEquipment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT, newConductingEquipment, newConductingEquipment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneralEquipment getGeneralEquipment() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT) return null;
        return (GeneralEquipment)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGeneralEquipment( GeneralEquipment newGeneralEquipment, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newGeneralEquipment, SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGeneralEquipment( GeneralEquipment newGeneralEquipment ) {
        if (newGeneralEquipment != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT && newGeneralEquipment != null)) {
            if (EcoreUtil.isAncestor(this, newGeneralEquipment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newGeneralEquipment != null)
                msgs = ((InternalEObject)newGeneralEquipment).eInverseAdd(this, SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION, GeneralEquipment.class, msgs);
            msgs = basicSetGeneralEquipment(newGeneralEquipment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT, newGeneralEquipment, newGeneralEquipment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerTransformer getPowerTransformer() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__POWER_TRANSFORMER) return null;
        return (PowerTransformer)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerTransformer( PowerTransformer newPowerTransformer, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newPowerTransformer, SclPackage.EQ_FUNCTION__POWER_TRANSFORMER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPowerTransformer( PowerTransformer newPowerTransformer ) {
        if (newPowerTransformer != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__POWER_TRANSFORMER && newPowerTransformer != null)) {
            if (EcoreUtil.isAncestor(this, newPowerTransformer))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newPowerTransformer != null)
                msgs = ((InternalEObject)newPowerTransformer).eInverseAdd(this, SclPackage.POWER_TRANSFORMER__EQ_FUNCTION, PowerTransformer.class, msgs);
            msgs = basicSetPowerTransformer(newPowerTransformer, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__POWER_TRANSFORMER, newPowerTransformer, newPowerTransformer));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubEquipment getSubEquipment() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__SUB_EQUIPMENT) return null;
        return (SubEquipment)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubEquipment( SubEquipment newSubEquipment, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newSubEquipment, SclPackage.EQ_FUNCTION__SUB_EQUIPMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubEquipment( SubEquipment newSubEquipment ) {
        if (newSubEquipment != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__SUB_EQUIPMENT && newSubEquipment != null)) {
            if (EcoreUtil.isAncestor(this, newSubEquipment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSubEquipment != null)
                msgs = ((InternalEObject)newSubEquipment).eInverseAdd(this, SclPackage.SUB_EQUIPMENT__EQ_FUNCTION, SubEquipment.class, msgs);
            msgs = basicSetSubEquipment(newSubEquipment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__SUB_EQUIPMENT, newSubEquipment, newSubEquipment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerWinding getTransformerWinding() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING) return null;
        return (TransformerWinding)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransformerWinding( TransformerWinding newTransformerWinding,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newTransformerWinding, SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransformerWinding( TransformerWinding newTransformerWinding ) {
        if (newTransformerWinding != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING && newTransformerWinding != null)) {
            if (EcoreUtil.isAncestor(this, newTransformerWinding))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTransformerWinding != null)
                msgs = ((InternalEObject)newTransformerWinding).eInverseAdd(this, SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION, TransformerWinding.class, msgs);
            msgs = basicSetTransformerWinding(newTransformerWinding, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING, newTransformerWinding, newTransformerWinding));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChanger getTapChanger() {
        if (eContainerFeatureID() != SclPackage.EQ_FUNCTION__TAP_CHANGER) return null;
        return (TapChanger)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTapChanger( TapChanger newTapChanger, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newTapChanger, SclPackage.EQ_FUNCTION__TAP_CHANGER, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTapChanger( TapChanger newTapChanger ) {
        if (newTapChanger != eInternalContainer() || (eContainerFeatureID() != SclPackage.EQ_FUNCTION__TAP_CHANGER && newTapChanger != null)) {
            if (EcoreUtil.isAncestor(this, newTapChanger))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTapChanger != null)
                msgs = ((InternalEObject)newTapChanger).eInverseAdd(this, SclPackage.TAP_CHANGER__EQ_FUNCTION, TapChanger.class, msgs);
            msgs = basicSetTapChanger(newTapChanger, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.EQ_FUNCTION__TAP_CHANGER, newTapChanger, newTapChanger));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetConductingEquipment((ConductingEquipment)otherEnd, msgs);
            case SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetGeneralEquipment((GeneralEquipment)otherEnd, msgs);
            case SclPackage.EQ_FUNCTION__POWER_TRANSFORMER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetPowerTransformer((PowerTransformer)otherEnd, msgs);
            case SclPackage.EQ_FUNCTION__SUB_EQUIPMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSubEquipment((SubEquipment)otherEnd, msgs);
            case SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetTransformerWinding((TransformerWinding)otherEnd, msgs);
            case SclPackage.EQ_FUNCTION__TAP_CHANGER:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetTapChanger((TapChanger)otherEnd, msgs);
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
            case SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT:
                return basicSetConductingEquipment(null, msgs);
            case SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT:
                return basicSetGeneralEquipment(null, msgs);
            case SclPackage.EQ_FUNCTION__POWER_TRANSFORMER:
                return basicSetPowerTransformer(null, msgs);
            case SclPackage.EQ_FUNCTION__SUB_EQUIPMENT:
                return basicSetSubEquipment(null, msgs);
            case SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING:
                return basicSetTransformerWinding(null, msgs);
            case SclPackage.EQ_FUNCTION__TAP_CHANGER:
                return basicSetTapChanger(null, msgs);
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
            case SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT:
                return eInternalContainer().eInverseRemove(this, SclPackage.CONDUCTING_EQUIPMENT__EQ_FUNCTION, ConductingEquipment.class, msgs);
            case SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT:
                return eInternalContainer().eInverseRemove(this, SclPackage.GENERAL_EQUIPMENT__EQ_FUNCTION, GeneralEquipment.class, msgs);
            case SclPackage.EQ_FUNCTION__POWER_TRANSFORMER:
                return eInternalContainer().eInverseRemove(this, SclPackage.POWER_TRANSFORMER__EQ_FUNCTION, PowerTransformer.class, msgs);
            case SclPackage.EQ_FUNCTION__SUB_EQUIPMENT:
                return eInternalContainer().eInverseRemove(this, SclPackage.SUB_EQUIPMENT__EQ_FUNCTION, SubEquipment.class, msgs);
            case SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING:
                return eInternalContainer().eInverseRemove(this, SclPackage.TRANSFORMER_WINDING__EQ_FUNCTION, TransformerWinding.class, msgs);
            case SclPackage.EQ_FUNCTION__TAP_CHANGER:
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
            case SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT:
                return getConductingEquipment();
            case SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT:
                return getGeneralEquipment();
            case SclPackage.EQ_FUNCTION__POWER_TRANSFORMER:
                return getPowerTransformer();
            case SclPackage.EQ_FUNCTION__SUB_EQUIPMENT:
                return getSubEquipment();
            case SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING:
                return getTransformerWinding();
            case SclPackage.EQ_FUNCTION__TAP_CHANGER:
                return getTapChanger();
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
            case SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT:
                setConductingEquipment((ConductingEquipment)newValue);
                return;
            case SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT:
                setGeneralEquipment((GeneralEquipment)newValue);
                return;
            case SclPackage.EQ_FUNCTION__POWER_TRANSFORMER:
                setPowerTransformer((PowerTransformer)newValue);
                return;
            case SclPackage.EQ_FUNCTION__SUB_EQUIPMENT:
                setSubEquipment((SubEquipment)newValue);
                return;
            case SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING:
                setTransformerWinding((TransformerWinding)newValue);
                return;
            case SclPackage.EQ_FUNCTION__TAP_CHANGER:
                setTapChanger((TapChanger)newValue);
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
            case SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT:
                setConductingEquipment((ConductingEquipment)null);
                return;
            case SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT:
                setGeneralEquipment((GeneralEquipment)null);
                return;
            case SclPackage.EQ_FUNCTION__POWER_TRANSFORMER:
                setPowerTransformer((PowerTransformer)null);
                return;
            case SclPackage.EQ_FUNCTION__SUB_EQUIPMENT:
                setSubEquipment((SubEquipment)null);
                return;
            case SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING:
                setTransformerWinding((TransformerWinding)null);
                return;
            case SclPackage.EQ_FUNCTION__TAP_CHANGER:
                setTapChanger((TapChanger)null);
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
            case SclPackage.EQ_FUNCTION__CONDUCTING_EQUIPMENT:
                return getConductingEquipment() != null;
            case SclPackage.EQ_FUNCTION__GENERAL_EQUIPMENT:
                return getGeneralEquipment() != null;
            case SclPackage.EQ_FUNCTION__POWER_TRANSFORMER:
                return getPowerTransformer() != null;
            case SclPackage.EQ_FUNCTION__SUB_EQUIPMENT:
                return getSubEquipment() != null;
            case SclPackage.EQ_FUNCTION__TRANSFORMER_WINDING:
                return getTransformerWinding() != null;
            case SclPackage.EQ_FUNCTION__TAP_CHANGER:
                return getTapChanger() != null;
        }
        return super.eIsSet(featureID);
    }

} //EqFunctionImpl
