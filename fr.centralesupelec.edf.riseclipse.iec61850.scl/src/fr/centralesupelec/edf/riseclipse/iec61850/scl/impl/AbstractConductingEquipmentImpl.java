/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractConductingEquipmentImpl#getSubEquipment <em>Sub Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractConductingEquipmentImpl#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractConductingEquipmentImpl extends EquipmentImpl implements AbstractConductingEquipment {
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
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected EList<Terminal> terminal;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractConductingEquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getAbstractConductingEquipment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<SubEquipment> getSubEquipment() {
        if (subEquipment == null) {
            subEquipment = new EObjectContainmentWithInverseEList.Unsettable<SubEquipment>(SubEquipment.class, this, SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT, SclPackage.SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT);
        }
        return subEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubEquipment() {
        if (subEquipment != null) ((InternalEList.Unsettable<?>)subEquipment).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubEquipment() {
        return subEquipment != null && ((InternalEList.Unsettable<?>)subEquipment).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Terminal> getTerminal() {
        if (terminal == null) {
            terminal = new EObjectContainmentWithInverseEList.Unsettable<Terminal>(Terminal.class, this, SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL, SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT);
        }
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTerminal() {
        if (terminal != null) ((InternalEList.Unsettable<?>)terminal).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminal != null && ((InternalEList.Unsettable<?>)terminal).isSet();
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
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubEquipment()).basicAdd(otherEnd, msgs);
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerminal()).basicAdd(otherEnd, msgs);
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
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT:
                return ((InternalEList<?>)getSubEquipment()).basicRemove(otherEnd, msgs);
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL:
                return ((InternalEList<?>)getTerminal()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT:
                return getSubEquipment();
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL:
                return getTerminal();
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
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT:
                getSubEquipment().clear();
                getSubEquipment().addAll((Collection<? extends SubEquipment>)newValue);
                return;
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL:
                getTerminal().clear();
                getTerminal().addAll((Collection<? extends Terminal>)newValue);
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
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT:
                unsetSubEquipment();
                return;
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL:
                unsetTerminal();
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
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT:
                return isSetSubEquipment();
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL:
                return isSetTerminal();
        }
        return super.eIsSet(featureID);
    }

} //AbstractConductingEquipmentImpl
