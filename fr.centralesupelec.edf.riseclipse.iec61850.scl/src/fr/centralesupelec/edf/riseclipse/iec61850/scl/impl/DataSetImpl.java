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
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Control;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataSetImpl#getParentAnyLN <em>Parent Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataSetImpl#getReferredByControl <em>Referred By Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataSetImpl#getFCDA <em>FCDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataSetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSetImpl extends UnNamingImpl implements DataSet {
    /**
     * The cached value of the '{@link #getReferredByControl() <em>Referred By Control</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByControl()
     * @generated
     * @ordered
     */
    protected EList<Control> referredByControl;

    /**
     * The cached value of the '{@link #getFCDA() <em>FCDA</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFCDA()
     * @generated
     * @ordered
     */
    protected EList<FCDA> fcda;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDataSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnyLN getParentAnyLN() {
        if (eContainerFeatureID() != SclPackage.DATA_SET__PARENT_ANY_LN) return null;
        return (AnyLN)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAnyLN(AnyLN newParentAnyLN, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentAnyLN, SclPackage.DATA_SET__PARENT_ANY_LN, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAnyLN(AnyLN newParentAnyLN) {
        if (newParentAnyLN != eInternalContainer() || (eContainerFeatureID() != SclPackage.DATA_SET__PARENT_ANY_LN && newParentAnyLN != null)) {
            if (EcoreUtil.isAncestor(this, newParentAnyLN))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentAnyLN != null)
                msgs = ((InternalEObject)newParentAnyLN).eInverseAdd(this, SclPackage.ANY_LN__DATA_SET, AnyLN.class, msgs);
            msgs = basicSetParentAnyLN(newParentAnyLN, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DATA_SET__PARENT_ANY_LN, newParentAnyLN, newParentAnyLN));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Control> getReferredByControl() {
        if (referredByControl == null) {
            referredByControl = new EObjectWithInverseEList.Unsettable<Control>(Control.class, this, SclPackage.DATA_SET__REFERRED_BY_CONTROL, SclPackage.CONTROL__REFERS_TO_DATA_SET);
        }
        return referredByControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByControl() {
        if (referredByControl != null) ((InternalEList.Unsettable<?>)referredByControl).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByControl() {
        return referredByControl != null && ((InternalEList.Unsettable<?>)referredByControl).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<FCDA> getFCDA() {
        if (fcda == null) {
            fcda = new EObjectContainmentWithInverseEList.Unsettable<FCDA>(FCDA.class, this, SclPackage.DATA_SET__FCDA, SclPackage.FCDA__PARENT_DATA_SET);
        }
        return fcda;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFCDA() {
        if (fcda != null) ((InternalEList.Unsettable<?>)fcda).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFCDA() {
        return fcda != null && ((InternalEList.Unsettable<?>)fcda).isSet();
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
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DATA_SET__NAME, oldName, name, !oldNameESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DATA_SET__NAME, oldName, NAME_EDEFAULT, oldNameESet));
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.DATA_SET__PARENT_ANY_LN:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentAnyLN((AnyLN)otherEnd, msgs);
            case SclPackage.DATA_SET__REFERRED_BY_CONTROL:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByControl()).basicAdd(otherEnd, msgs);
            case SclPackage.DATA_SET__FCDA:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getFCDA()).basicAdd(otherEnd, msgs);
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
            case SclPackage.DATA_SET__PARENT_ANY_LN:
                return basicSetParentAnyLN(null, msgs);
            case SclPackage.DATA_SET__REFERRED_BY_CONTROL:
                return ((InternalEList<?>)getReferredByControl()).basicRemove(otherEnd, msgs);
            case SclPackage.DATA_SET__FCDA:
                return ((InternalEList<?>)getFCDA()).basicRemove(otherEnd, msgs);
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
            case SclPackage.DATA_SET__PARENT_ANY_LN:
                return eInternalContainer().eInverseRemove(this, SclPackage.ANY_LN__DATA_SET, AnyLN.class, msgs);
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
            case SclPackage.DATA_SET__PARENT_ANY_LN:
                return getParentAnyLN();
            case SclPackage.DATA_SET__REFERRED_BY_CONTROL:
                return getReferredByControl();
            case SclPackage.DATA_SET__FCDA:
                return getFCDA();
            case SclPackage.DATA_SET__NAME:
                return getName();
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
            case SclPackage.DATA_SET__PARENT_ANY_LN:
                setParentAnyLN((AnyLN)newValue);
                return;
            case SclPackage.DATA_SET__REFERRED_BY_CONTROL:
                getReferredByControl().clear();
                getReferredByControl().addAll((Collection<? extends Control>)newValue);
                return;
            case SclPackage.DATA_SET__FCDA:
                getFCDA().clear();
                getFCDA().addAll((Collection<? extends FCDA>)newValue);
                return;
            case SclPackage.DATA_SET__NAME:
                setName((String)newValue);
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
            case SclPackage.DATA_SET__PARENT_ANY_LN:
                setParentAnyLN((AnyLN)null);
                return;
            case SclPackage.DATA_SET__REFERRED_BY_CONTROL:
                unsetReferredByControl();
                return;
            case SclPackage.DATA_SET__FCDA:
                unsetFCDA();
                return;
            case SclPackage.DATA_SET__NAME:
                unsetName();
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
            case SclPackage.DATA_SET__PARENT_ANY_LN:
                return getParentAnyLN() != null;
            case SclPackage.DATA_SET__REFERRED_BY_CONTROL:
                return isSetReferredByControl();
            case SclPackage.DATA_SET__FCDA:
                return isSetFCDA();
            case SclPackage.DATA_SET__NAME:
                return isSetName();
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
        result.append(')');
        return result.toString();
    }

} //DataSetImpl
