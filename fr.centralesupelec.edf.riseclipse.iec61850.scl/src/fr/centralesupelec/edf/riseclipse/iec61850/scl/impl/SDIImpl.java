/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getDAI <em>DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getDOI <em>DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getSubSDI <em>Sub SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getParentSDI <em>Parent SDI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDIImpl extends DataAttributeImpl implements SDI {
    /**
     * The default value of the '{@link #getIx() <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIx()
     * @generated
     * @ordered
     */
    protected static final Integer IX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIx() <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIx()
     * @generated
     * @ordered
     */
    protected Integer ix = IX_EDEFAULT;

    /**
     * This is true if the Ix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ixESet;

    /**
     * The default value of the '{@link #getSAddr() <em>SAddr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAddr()
     * @generated
     * @ordered
     */
    protected static final String SADDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSAddr() <em>SAddr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAddr()
     * @generated
     * @ordered
     */
    protected String sAddr = SADDR_EDEFAULT;

    /**
     * This is true if the SAddr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sAddrESet;

    /**
     * The cached value of the '{@link #getDAI() <em>DAI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAI()
     * @generated
     * @ordered
     */
    protected EList<DAI> dai;

    /**
     * The cached value of the '{@link #getSubSDI() <em>Sub SDI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubSDI()
     * @generated
     * @ordered
     */
    protected EList<SDI> subSDI;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SDIImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSDI();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer getIx() {
        return ix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIx( Integer newIx ) {
        Integer oldIx = ix;
        ix = newIx;
        boolean oldIxESet = ixESet;
        ixESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SDI__IX, oldIx, ix, !oldIxESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIx() {
        Integer oldIx = ix;
        boolean oldIxESet = ixESet;
        ix = IX_EDEFAULT;
        ixESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SDI__IX, oldIx, IX_EDEFAULT, oldIxESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIx() {
        return ixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSAddr() {
        return sAddr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSAddr( String newSAddr ) {
        String oldSAddr = sAddr;
        sAddr = newSAddr;
        boolean oldSAddrESet = sAddrESet;
        sAddrESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SDI__SADDR, oldSAddr, sAddr, !oldSAddrESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSAddr() {
        String oldSAddr = sAddr;
        boolean oldSAddrESet = sAddrESet;
        sAddr = SADDR_EDEFAULT;
        sAddrESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SDI__SADDR, oldSAddr, SADDR_EDEFAULT, oldSAddrESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSAddr() {
        return sAddrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DAI> getDAI() {
        if (dai == null) {
            dai = new EObjectContainmentWithInverseEList.Unsettable<DAI>(DAI.class, this, SclPackage.SDI__DAI, SclPackage.DAI__SDI);
        }
        return dai;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDAI() {
        if (dai != null) ((InternalEList.Unsettable<?>)dai).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDAI() {
        return dai != null && ((InternalEList.Unsettable<?>)dai).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DOI getDOI() {
        if (eContainerFeatureID() != SclPackage.SDI__DOI) return null;
        return (DOI)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDOI( DOI newDOI, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newDOI, SclPackage.SDI__DOI, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDOI( DOI newDOI ) {
        if (newDOI != eInternalContainer() || (eContainerFeatureID() != SclPackage.SDI__DOI && newDOI != null)) {
            if (EcoreUtil.isAncestor(this, newDOI))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDOI != null)
                msgs = ((InternalEObject)newDOI).eInverseAdd(this, SclPackage.DOI__SDI, DOI.class, msgs);
            msgs = basicSetDOI(newDOI, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SDI__DOI, newDOI, newDOI));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SDI> getSubSDI() {
        if (subSDI == null) {
            subSDI = new EObjectContainmentWithInverseEList.Unsettable<SDI>(SDI.class, this, SclPackage.SDI__SUB_SDI, SclPackage.SDI__PARENT_SDI);
        }
        return subSDI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSubSDI() {
        if (subSDI != null) ((InternalEList.Unsettable<?>)subSDI).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSubSDI() {
        return subSDI != null && ((InternalEList.Unsettable<?>)subSDI).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SDI getParentSDI() {
        if (eContainerFeatureID() != SclPackage.SDI__PARENT_SDI) return null;
        return (SDI)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSDI( SDI newParentSDI, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newParentSDI, SclPackage.SDI__PARENT_SDI, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setParentSDI( SDI newParentSDI ) {
        if (newParentSDI != eInternalContainer() || (eContainerFeatureID() != SclPackage.SDI__PARENT_SDI && newParentSDI != null)) {
            if (EcoreUtil.isAncestor(this, newParentSDI))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentSDI != null)
                msgs = ((InternalEObject)newParentSDI).eInverseAdd(this, SclPackage.SDI__SUB_SDI, SDI.class, msgs);
            msgs = basicSetParentSDI(newParentSDI, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SDI__PARENT_SDI, newParentSDI, newParentSDI));
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
            case SclPackage.SDI__DAI:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDAI()).basicAdd(otherEnd, msgs);
            case SclPackage.SDI__DOI:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDOI((DOI)otherEnd, msgs);
            case SclPackage.SDI__SUB_SDI:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubSDI()).basicAdd(otherEnd, msgs);
            case SclPackage.SDI__PARENT_SDI:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentSDI((SDI)otherEnd, msgs);
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
            case SclPackage.SDI__DAI:
                return ((InternalEList<?>)getDAI()).basicRemove(otherEnd, msgs);
            case SclPackage.SDI__DOI:
                return basicSetDOI(null, msgs);
            case SclPackage.SDI__SUB_SDI:
                return ((InternalEList<?>)getSubSDI()).basicRemove(otherEnd, msgs);
            case SclPackage.SDI__PARENT_SDI:
                return basicSetParentSDI(null, msgs);
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
            case SclPackage.SDI__DOI:
                return eInternalContainer().eInverseRemove(this, SclPackage.DOI__SDI, DOI.class, msgs);
            case SclPackage.SDI__PARENT_SDI:
                return eInternalContainer().eInverseRemove(this, SclPackage.SDI__SUB_SDI, SDI.class, msgs);
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
            case SclPackage.SDI__IX:
                return getIx();
            case SclPackage.SDI__SADDR:
                return getSAddr();
            case SclPackage.SDI__DAI:
                return getDAI();
            case SclPackage.SDI__DOI:
                return getDOI();
            case SclPackage.SDI__SUB_SDI:
                return getSubSDI();
            case SclPackage.SDI__PARENT_SDI:
                return getParentSDI();
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
            case SclPackage.SDI__IX:
                setIx((Integer)newValue);
                return;
            case SclPackage.SDI__SADDR:
                setSAddr((String)newValue);
                return;
            case SclPackage.SDI__DAI:
                getDAI().clear();
                getDAI().addAll((Collection<? extends DAI>)newValue);
                return;
            case SclPackage.SDI__DOI:
                setDOI((DOI)newValue);
                return;
            case SclPackage.SDI__SUB_SDI:
                getSubSDI().clear();
                getSubSDI().addAll((Collection<? extends SDI>)newValue);
                return;
            case SclPackage.SDI__PARENT_SDI:
                setParentSDI((SDI)newValue);
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
            case SclPackage.SDI__IX:
                unsetIx();
                return;
            case SclPackage.SDI__SADDR:
                unsetSAddr();
                return;
            case SclPackage.SDI__DAI:
                unsetDAI();
                return;
            case SclPackage.SDI__DOI:
                setDOI((DOI)null);
                return;
            case SclPackage.SDI__SUB_SDI:
                unsetSubSDI();
                return;
            case SclPackage.SDI__PARENT_SDI:
                setParentSDI((SDI)null);
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
            case SclPackage.SDI__IX:
                return isSetIx();
            case SclPackage.SDI__SADDR:
                return isSetSAddr();
            case SclPackage.SDI__DAI:
                return isSetDAI();
            case SclPackage.SDI__DOI:
                return getDOI() != null;
            case SclPackage.SDI__SUB_SDI:
                return isSetSubSDI();
            case SclPackage.SDI__PARENT_SDI:
                return getParentSDI() != null;
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
        result.append(" (ix: ");
        if (ixESet) result.append(ix); else result.append("<unset>");
        result.append(", sAddr: ");
        if (sAddrESet) result.append(sAddr); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SDIImpl
