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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Sync Prot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl#getC37_238 <em>C37 238</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl#getOther <em>Other</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl#getSntp <em>Sntp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl#getClientServices <em>Client Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSyncProtImpl extends SclObjectImpl implements TimeSyncProt {
    /**
     * The default value of the '{@link #getC37_238() <em>C37 238</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC37_238()
     * @generated
     * @ordered
     */
    protected static final Boolean C37_238_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getC37_238() <em>C37 238</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC37_238()
     * @generated
     * @ordered
     */
    protected Boolean c37_238 = C37_238_EDEFAULT;

    /**
     * This is true if the C37 238 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean c37_238ESet;

    /**
     * The default value of the '{@link #getOther() <em>Other</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOther()
     * @generated
     * @ordered
     */
    protected static final Boolean OTHER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOther() <em>Other</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOther()
     * @generated
     * @ordered
     */
    protected Boolean other = OTHER_EDEFAULT;

    /**
     * This is true if the Other attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean otherESet;

    /**
     * The default value of the '{@link #getSntp() <em>Sntp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSntp()
     * @generated
     * @ordered
     */
    protected static final Boolean SNTP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSntp() <em>Sntp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSntp()
     * @generated
     * @ordered
     */
    protected Boolean sntp = SNTP_EDEFAULT;

    /**
     * This is true if the Sntp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sntpESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TimeSyncProtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getTimeSyncProt();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getC37_238() {
        return c37_238;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setC37_238( Boolean newC37_238 ) {
        Boolean oldC37_238 = c37_238;
        c37_238 = newC37_238;
        boolean oldC37_238ESet = c37_238ESet;
        c37_238ESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIME_SYNC_PROT__C37_238, oldC37_238, c37_238, !oldC37_238ESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetC37_238() {
        Boolean oldC37_238 = c37_238;
        boolean oldC37_238ESet = c37_238ESet;
        c37_238 = C37_238_EDEFAULT;
        c37_238ESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TIME_SYNC_PROT__C37_238, oldC37_238, C37_238_EDEFAULT, oldC37_238ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetC37_238() {
        return c37_238ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getOther() {
        return other;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setOther( Boolean newOther ) {
        Boolean oldOther = other;
        other = newOther;
        boolean oldOtherESet = otherESet;
        otherESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIME_SYNC_PROT__OTHER, oldOther, other, !oldOtherESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetOther() {
        Boolean oldOther = other;
        boolean oldOtherESet = otherESet;
        other = OTHER_EDEFAULT;
        otherESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TIME_SYNC_PROT__OTHER, oldOther, OTHER_EDEFAULT, oldOtherESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetOther() {
        return otherESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean getSntp() {
        return sntp;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setSntp( Boolean newSntp ) {
        Boolean oldSntp = sntp;
        sntp = newSntp;
        boolean oldSntpESet = sntpESet;
        sntpESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIME_SYNC_PROT__SNTP, oldSntp, sntp, !oldSntpESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSntp() {
        Boolean oldSntp = sntp;
        boolean oldSntpESet = sntpESet;
        sntp = SNTP_EDEFAULT;
        sntpESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TIME_SYNC_PROT__SNTP, oldSntp, SNTP_EDEFAULT, oldSntpESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSntp() {
        return sntpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClientServices getClientServices() {
        if (eContainerFeatureID() != SclPackage.TIME_SYNC_PROT__CLIENT_SERVICES) return null;
        return (ClientServices)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetClientServices( ClientServices newClientServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newClientServices, SclPackage.TIME_SYNC_PROT__CLIENT_SERVICES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClientServices( ClientServices newClientServices ) {
        if (newClientServices != eInternalContainer() || (eContainerFeatureID() != SclPackage.TIME_SYNC_PROT__CLIENT_SERVICES && newClientServices != null)) {
            if (EcoreUtil.isAncestor(this, newClientServices))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newClientServices != null)
                msgs = ((InternalEObject)newClientServices).eInverseAdd(this, SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT, ClientServices.class, msgs);
            msgs = basicSetClientServices(newClientServices, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIME_SYNC_PROT__CLIENT_SERVICES, newClientServices, newClientServices));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Services getServices() {
        if (eContainerFeatureID() != SclPackage.TIME_SYNC_PROT__SERVICES) return null;
        return (Services)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetServices( Services newServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newServices, SclPackage.TIME_SYNC_PROT__SERVICES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setServices( Services newServices ) {
        if (newServices != eInternalContainer() || (eContainerFeatureID() != SclPackage.TIME_SYNC_PROT__SERVICES && newServices != null)) {
            if (EcoreUtil.isAncestor(this, newServices))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newServices != null)
                msgs = ((InternalEObject)newServices).eInverseAdd(this, SclPackage.SERVICES__TIME_SYNC_PROT, Services.class, msgs);
            msgs = basicSetServices(newServices, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TIME_SYNC_PROT__SERVICES, newServices, newServices));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.TIME_SYNC_PROT__CLIENT_SERVICES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetClientServices((ClientServices)otherEnd, msgs);
            case SclPackage.TIME_SYNC_PROT__SERVICES:
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
            case SclPackage.TIME_SYNC_PROT__CLIENT_SERVICES:
                return basicSetClientServices(null, msgs);
            case SclPackage.TIME_SYNC_PROT__SERVICES:
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
            case SclPackage.TIME_SYNC_PROT__CLIENT_SERVICES:
                return eInternalContainer().eInverseRemove(this, SclPackage.CLIENT_SERVICES__TIME_SYNC_PROT, ClientServices.class, msgs);
            case SclPackage.TIME_SYNC_PROT__SERVICES:
                return eInternalContainer().eInverseRemove(this, SclPackage.SERVICES__TIME_SYNC_PROT, Services.class, msgs);
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
            case SclPackage.TIME_SYNC_PROT__C37_238:
                return getC37_238();
            case SclPackage.TIME_SYNC_PROT__OTHER:
                return getOther();
            case SclPackage.TIME_SYNC_PROT__SNTP:
                return getSntp();
            case SclPackage.TIME_SYNC_PROT__CLIENT_SERVICES:
                return getClientServices();
            case SclPackage.TIME_SYNC_PROT__SERVICES:
                return getServices();
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
            case SclPackage.TIME_SYNC_PROT__C37_238:
                setC37_238((Boolean)newValue);
                return;
            case SclPackage.TIME_SYNC_PROT__OTHER:
                setOther((Boolean)newValue);
                return;
            case SclPackage.TIME_SYNC_PROT__SNTP:
                setSntp((Boolean)newValue);
                return;
            case SclPackage.TIME_SYNC_PROT__CLIENT_SERVICES:
                setClientServices((ClientServices)newValue);
                return;
            case SclPackage.TIME_SYNC_PROT__SERVICES:
                setServices((Services)newValue);
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
            case SclPackage.TIME_SYNC_PROT__C37_238:
                unsetC37_238();
                return;
            case SclPackage.TIME_SYNC_PROT__OTHER:
                unsetOther();
                return;
            case SclPackage.TIME_SYNC_PROT__SNTP:
                unsetSntp();
                return;
            case SclPackage.TIME_SYNC_PROT__CLIENT_SERVICES:
                setClientServices((ClientServices)null);
                return;
            case SclPackage.TIME_SYNC_PROT__SERVICES:
                setServices((Services)null);
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
            case SclPackage.TIME_SYNC_PROT__C37_238:
                return isSetC37_238();
            case SclPackage.TIME_SYNC_PROT__OTHER:
                return isSetOther();
            case SclPackage.TIME_SYNC_PROT__SNTP:
                return isSetSntp();
            case SclPackage.TIME_SYNC_PROT__CLIENT_SERVICES:
                return getClientServices() != null;
            case SclPackage.TIME_SYNC_PROT__SERVICES:
                return getServices() != null;
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
        result.append(" (c37_238: ");
        if (c37_238ESet) result.append(c37_238); else result.append("<unset>");
        result.append(", other: ");
        if (otherESet) result.append(other); else result.append("<unset>");
        result.append(", sntp: ");
        if (sntpESet) result.append(sntp); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //TimeSyncProtImpl
