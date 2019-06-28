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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KDC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.KDCImpl#getApName <em>Ap Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.KDCImpl#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.KDCImpl#getParentIED <em>Parent IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.KDCImpl#getRefersToAccessPoint <em>Refers To Access Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KDCImpl extends SclObjectImpl implements KDC {
    /**
     * The default value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApName()
     * @generated
     * @ordered
     */
    protected static final String AP_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApName() <em>Ap Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApName()
     * @generated
     * @ordered
     */
    protected String apName = AP_NAME_EDEFAULT;

    /**
     * This is true if the Ap Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean apNameESet;

    /**
     * The default value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIedName()
     * @generated
     * @ordered
     */
    protected static final String IED_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIedName() <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIedName()
     * @generated
     * @ordered
     */
    protected String iedName = IED_NAME_EDEFAULT;

    /**
     * This is true if the Ied Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iedNameESet;

    /**
     * The cached value of the '{@link #getRefersToAccessPoint() <em>Refers To Access Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAccessPoint()
     * @generated
     * @ordered
     */
    protected AccessPoint refersToAccessPoint;

    /**
     * This is true if the Refers To Access Point reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAccessPointESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KDCImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getKDC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getApName() {
        return apName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApName( String newApName ) {
        String oldApName = apName;
        apName = newApName;
        boolean oldApNameESet = apNameESet;
        apNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.KDC__AP_NAME, oldApName, apName, !oldApNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApName() {
        String oldApName = apName;
        boolean oldApNameESet = apNameESet;
        apName = AP_NAME_EDEFAULT;
        apNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.KDC__AP_NAME, oldApName, AP_NAME_EDEFAULT, oldApNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApName() {
        return apNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIedName() {
        return iedName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIedName( String newIedName ) {
        String oldIedName = iedName;
        iedName = newIedName;
        boolean oldIedNameESet = iedNameESet;
        iedNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.KDC__IED_NAME, oldIedName, iedName, !oldIedNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIedName() {
        String oldIedName = iedName;
        boolean oldIedNameESet = iedNameESet;
        iedName = IED_NAME_EDEFAULT;
        iedNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.KDC__IED_NAME, oldIedName, IED_NAME_EDEFAULT, oldIedNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIedName() {
        return iedNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IED getParentIED() {
        if (eContainerFeatureID() != SclPackage.KDC__PARENT_IED) return null;
        return (IED)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentIED(IED newParentIED, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentIED, SclPackage.KDC__PARENT_IED, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentIED(IED newParentIED) {
        if (newParentIED != eInternalContainer() || (eContainerFeatureID() != SclPackage.KDC__PARENT_IED && newParentIED != null)) {
            if (EcoreUtil.isAncestor(this, newParentIED))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentIED != null)
                msgs = ((InternalEObject)newParentIED).eInverseAdd(this, SclPackage.IED__KDC, IED.class, msgs);
            msgs = basicSetParentIED(newParentIED, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.KDC__PARENT_IED, newParentIED, newParentIED));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessPoint getRefersToAccessPoint() {
        return refersToAccessPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAccessPoint(AccessPoint newRefersToAccessPoint, NotificationChain msgs) {
        AccessPoint oldRefersToAccessPoint = refersToAccessPoint;
        refersToAccessPoint = newRefersToAccessPoint;
        boolean oldRefersToAccessPointESet = refersToAccessPointESet;
        refersToAccessPointESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.KDC__REFERS_TO_ACCESS_POINT, oldRefersToAccessPoint, newRefersToAccessPoint, !oldRefersToAccessPointESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToAccessPoint(AccessPoint newRefersToAccessPoint) {
        if (newRefersToAccessPoint != refersToAccessPoint) {
            NotificationChain msgs = null;
            if (refersToAccessPoint != null)
                msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_KDC, AccessPoint.class, msgs);
            if (newRefersToAccessPoint != null)
                msgs = ((InternalEObject)newRefersToAccessPoint).eInverseAdd(this, SclPackage.ACCESS_POINT__REFERRED_BY_KDC, AccessPoint.class, msgs);
            msgs = basicSetRefersToAccessPoint(newRefersToAccessPoint, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAccessPointESet = refersToAccessPointESet;
            refersToAccessPointESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.KDC__REFERS_TO_ACCESS_POINT, newRefersToAccessPoint, newRefersToAccessPoint, !oldRefersToAccessPointESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAccessPoint(NotificationChain msgs) {
        AccessPoint oldRefersToAccessPoint = refersToAccessPoint;
        refersToAccessPoint = null;
        boolean oldRefersToAccessPointESet = refersToAccessPointESet;
        refersToAccessPointESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.KDC__REFERS_TO_ACCESS_POINT, oldRefersToAccessPoint, null, oldRefersToAccessPointESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToAccessPoint() {
        if (refersToAccessPoint != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_KDC, AccessPoint.class, msgs);
            msgs = basicUnsetRefersToAccessPoint(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToAccessPointESet = refersToAccessPointESet;
            refersToAccessPointESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.KDC__REFERS_TO_ACCESS_POINT, null, null, oldRefersToAccessPointESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAccessPoint() {
        return refersToAccessPointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.KDC__PARENT_IED:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentIED((IED)otherEnd, msgs);
            case SclPackage.KDC__REFERS_TO_ACCESS_POINT:
                if (refersToAccessPoint != null)
                    msgs = ((InternalEObject)refersToAccessPoint).eInverseRemove(this, SclPackage.ACCESS_POINT__REFERRED_BY_KDC, AccessPoint.class, msgs);
                return basicSetRefersToAccessPoint((AccessPoint)otherEnd, msgs);
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
            case SclPackage.KDC__PARENT_IED:
                return basicSetParentIED(null, msgs);
            case SclPackage.KDC__REFERS_TO_ACCESS_POINT:
                return basicUnsetRefersToAccessPoint(msgs);
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
            case SclPackage.KDC__PARENT_IED:
                return eInternalContainer().eInverseRemove(this, SclPackage.IED__KDC, IED.class, msgs);
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
            case SclPackage.KDC__AP_NAME:
                return getApName();
            case SclPackage.KDC__IED_NAME:
                return getIedName();
            case SclPackage.KDC__PARENT_IED:
                return getParentIED();
            case SclPackage.KDC__REFERS_TO_ACCESS_POINT:
                return getRefersToAccessPoint();
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
            case SclPackage.KDC__AP_NAME:
                setApName((String)newValue);
                return;
            case SclPackage.KDC__IED_NAME:
                setIedName((String)newValue);
                return;
            case SclPackage.KDC__PARENT_IED:
                setParentIED((IED)newValue);
                return;
            case SclPackage.KDC__REFERS_TO_ACCESS_POINT:
                setRefersToAccessPoint((AccessPoint)newValue);
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
            case SclPackage.KDC__AP_NAME:
                unsetApName();
                return;
            case SclPackage.KDC__IED_NAME:
                unsetIedName();
                return;
            case SclPackage.KDC__PARENT_IED:
                setParentIED((IED)null);
                return;
            case SclPackage.KDC__REFERS_TO_ACCESS_POINT:
                unsetRefersToAccessPoint();
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
            case SclPackage.KDC__AP_NAME:
                return isSetApName();
            case SclPackage.KDC__IED_NAME:
                return isSetIedName();
            case SclPackage.KDC__PARENT_IED:
                return getParentIED() != null;
            case SclPackage.KDC__REFERS_TO_ACCESS_POINT:
                return isSetRefersToAccessPoint();
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
        result.append(" (apName: ");
        if (apNameESet) result.append(apName); else result.append("<unset>");
        result.append(", iedName: ");
        if (iedNameESet) result.append(iedName); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( IRiseClipseConsole console ) {
        // see Issue #13
        super.doBuildExplicitLinks( console );
        
        String messagePrefix = "[SCL links] while resolving link from KDC on line " + getLineNumber() + ": ";

        if(( getIedName() == null ) || getIedName().isEmpty() ) {
            console.warning( messagePrefix, "iedName is missing" );
            return;
        }
        if(( getApName() == null ) || getApName().isEmpty() ) {
            console.warning( messagePrefix, "apName is missing" );
            return;
        }

        // find an IED with
        //   IED.name == ConnectedAP.iedName
        Pair< IED, Integer > ied = SclUtilities.getIED( SclUtilities.getSCL( this ), getIedName() );
        String mess1 = "IED( name = " + getIedName() + " )";
        if( ied.getLeft() == null ) {
            SclUtilities.displayNotFoundWarning( console, messagePrefix, mess1, ied.getRight() );
            return;
        }
        console.verbose( messagePrefix, "found ", mess1, " on line ", ied.getLeft().getLineNumber() );
        
        Pair< AccessPoint, Integer > ap = SclUtilities.getAccessPoint( ied.getLeft(), getApName() );
        String mess2 = "AccessPoint( name = " + getApName() + " )";
        if( ap.getLeft() == null ) {
            SclUtilities.displayNotFoundWarning( console, messagePrefix, mess2, ap.getRight() );
            return;
        }
        setRefersToAccessPoint( ap.getLeft() );
        console.info( "[SCL links] KDC on line ", getLineNumber(), " refers to ", mess2, " on line ", getRefersToAccessPoint().getLineNumber() );
    }

} //KDCImpl
