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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GOOSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GOOSEImpl#getFixedOffs <em>Fixed Offs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GOOSEImpl#getServices <em>Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GOOSEImpl#getGoose <em>Goose</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GOOSEImpl#getRGOOSE <em>RGOOSE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GOOSEImpl extends ServiceWithMaxImpl implements GOOSE {
    /**
     * The default value of the '{@link #getFixedOffs() <em>Fixed Offs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFixedOffs()
     * @generated
     * @ordered
     */
    protected static final Boolean FIXED_OFFS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFixedOffs() <em>Fixed Offs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFixedOffs()
     * @generated
     * @ordered
     */
    protected Boolean fixedOffs = FIXED_OFFS_EDEFAULT;

    /**
     * This is true if the Fixed Offs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fixedOffsESet;

    /**
     * The default value of the '{@link #getGoose() <em>Goose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGoose()
     * @generated
     * @ordered
     */
    protected static final Boolean GOOSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGoose() <em>Goose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGoose()
     * @generated
     * @ordered
     */
    protected Boolean goose = GOOSE_EDEFAULT;

    /**
     * This is true if the Goose attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gooseESet;

    /**
     * The default value of the '{@link #getRGOOSE() <em>RGOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRGOOSE()
     * @generated
     * @ordered
     */
    protected static final Boolean RGOOSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRGOOSE() <em>RGOOSE</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRGOOSE()
     * @generated
     * @ordered
     */
    protected Boolean rGOOSE = RGOOSE_EDEFAULT;

    /**
     * This is true if the RGOOSE attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rGOOSEESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GOOSEImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getGOOSE();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getFixedOffs() {
        return fixedOffs;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFixedOffs( Boolean newFixedOffs ) {
        Boolean oldFixedOffs = fixedOffs;
        fixedOffs = newFixedOffs;
        boolean oldFixedOffsESet = fixedOffsESet;
        fixedOffsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GOOSE__FIXED_OFFS, oldFixedOffs, fixedOffs, !oldFixedOffsESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFixedOffs() {
        Boolean oldFixedOffs = fixedOffs;
        boolean oldFixedOffsESet = fixedOffsESet;
        fixedOffs = FIXED_OFFS_EDEFAULT;
        fixedOffsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GOOSE__FIXED_OFFS, oldFixedOffs, FIXED_OFFS_EDEFAULT, oldFixedOffsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFixedOffs() {
        return fixedOffsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getServices() {
        if (eContainerFeatureID() != SclPackage.GOOSE__SERVICES) return null;
        return (Services)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServices( Services newServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newServices, SclPackage.GOOSE__SERVICES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServices( Services newServices ) {
        if (newServices != eInternalContainer() || (eContainerFeatureID() != SclPackage.GOOSE__SERVICES && newServices != null)) {
            if (EcoreUtil.isAncestor(this, newServices))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newServices != null)
                msgs = ((InternalEObject)newServices).eInverseAdd(this, SclPackage.SERVICES__GOOSE, Services.class, msgs);
            msgs = basicSetServices(newServices, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GOOSE__SERVICES, newServices, newServices));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getGoose() {
        return goose;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGoose(Boolean newGoose) {
        Boolean oldGoose = goose;
        goose = newGoose;
        boolean oldGooseESet = gooseESet;
        gooseESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GOOSE__GOOSE, oldGoose, goose, !oldGooseESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGoose() {
        Boolean oldGoose = goose;
        boolean oldGooseESet = gooseESet;
        goose = GOOSE_EDEFAULT;
        gooseESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GOOSE__GOOSE, oldGoose, GOOSE_EDEFAULT, oldGooseESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGoose() {
        return gooseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRGOOSE() {
        return rGOOSE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRGOOSE(Boolean newRGOOSE) {
        Boolean oldRGOOSE = rGOOSE;
        rGOOSE = newRGOOSE;
        boolean oldRGOOSEESet = rGOOSEESet;
        rGOOSEESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GOOSE__RGOOSE, oldRGOOSE, rGOOSE, !oldRGOOSEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRGOOSE() {
        Boolean oldRGOOSE = rGOOSE;
        boolean oldRGOOSEESet = rGOOSEESet;
        rGOOSE = RGOOSE_EDEFAULT;
        rGOOSEESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GOOSE__RGOOSE, oldRGOOSE, RGOOSE_EDEFAULT, oldRGOOSEESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRGOOSE() {
        return rGOOSEESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.GOOSE__SERVICES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetServices((Services)otherEnd, msgs);
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
            case SclPackage.GOOSE__SERVICES:
                return basicSetServices(null, msgs);
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
            case SclPackage.GOOSE__SERVICES:
                return eInternalContainer().eInverseRemove(this, SclPackage.SERVICES__GOOSE, Services.class, msgs);
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
            case SclPackage.GOOSE__FIXED_OFFS:
                return getFixedOffs();
            case SclPackage.GOOSE__SERVICES:
                return getServices();
            case SclPackage.GOOSE__GOOSE:
                return getGoose();
            case SclPackage.GOOSE__RGOOSE:
                return getRGOOSE();
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
            case SclPackage.GOOSE__FIXED_OFFS:
                setFixedOffs((Boolean)newValue);
                return;
            case SclPackage.GOOSE__SERVICES:
                setServices((Services)newValue);
                return;
            case SclPackage.GOOSE__GOOSE:
                setGoose((Boolean)newValue);
                return;
            case SclPackage.GOOSE__RGOOSE:
                setRGOOSE((Boolean)newValue);
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
            case SclPackage.GOOSE__FIXED_OFFS:
                unsetFixedOffs();
                return;
            case SclPackage.GOOSE__SERVICES:
                setServices((Services)null);
                return;
            case SclPackage.GOOSE__GOOSE:
                unsetGoose();
                return;
            case SclPackage.GOOSE__RGOOSE:
                unsetRGOOSE();
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
            case SclPackage.GOOSE__FIXED_OFFS:
                return isSetFixedOffs();
            case SclPackage.GOOSE__SERVICES:
                return getServices() != null;
            case SclPackage.GOOSE__GOOSE:
                return isSetGoose();
            case SclPackage.GOOSE__RGOOSE:
                return isSetRGOOSE();
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
        result.append(" (fixedOffs: ");
        if (fixedOffsESet) result.append(fixedOffs); else result.append("<unset>");
        result.append(", goose: ");
        if (gooseESet) result.append(goose); else result.append("<unset>");
        result.append(", rGOOSE: ");
        if (rGOOSEESet) result.append(rGOOSE); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //GOOSEImpl
