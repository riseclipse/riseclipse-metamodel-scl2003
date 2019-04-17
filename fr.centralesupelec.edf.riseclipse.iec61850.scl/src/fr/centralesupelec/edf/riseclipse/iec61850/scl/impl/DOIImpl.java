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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DOI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getParentAnyLN <em>Parent Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getDAI <em>DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getSDI <em>SDI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOIImpl extends DataObjectImpl implements DOI {
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
     * The cached value of the '{@link #getDAI() <em>DAI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAI()
     * @generated
     * @ordered
     */
    protected EList<DAI> dai;

    /**
     * The cached value of the '{@link #getSDI() <em>SDI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSDI()
     * @generated
     * @ordered
     */
    protected EList<SDI> sdi;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DOIImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDOI();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getIx() {
        return ix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIx( Integer newIx ) {
        Integer oldIx = ix;
        ix = newIx;
        boolean oldIxESet = ixESet;
        ixESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DOI__IX, oldIx, ix, !oldIxESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIx() {
        Integer oldIx = ix;
        boolean oldIxESet = ixESet;
        ix = IX_EDEFAULT;
        ixESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DOI__IX, oldIx, IX_EDEFAULT, oldIxESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIx() {
        return ixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnyLN getParentAnyLN() {
        if (eContainerFeatureID() != SclPackage.DOI__PARENT_ANY_LN) return null;
        return (AnyLN)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAnyLN(AnyLN newParentAnyLN, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentAnyLN, SclPackage.DOI__PARENT_ANY_LN, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAnyLN(AnyLN newParentAnyLN) {
        if (newParentAnyLN != eInternalContainer() || (eContainerFeatureID() != SclPackage.DOI__PARENT_ANY_LN && newParentAnyLN != null)) {
            if (EcoreUtil.isAncestor(this, newParentAnyLN))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentAnyLN != null)
                msgs = ((InternalEObject)newParentAnyLN).eInverseAdd(this, SclPackage.ANY_LN__DOI, AnyLN.class, msgs);
            msgs = basicSetParentAnyLN(newParentAnyLN, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DOI__PARENT_ANY_LN, newParentAnyLN, newParentAnyLN));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<DAI> getDAI() {
        if (dai == null) {
            dai = new EObjectContainmentWithInverseEList.Unsettable<DAI>(DAI.class, this, SclPackage.DOI__DAI, SclPackage.DAI__PARENT_DOI);
        }
        return dai;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDAI() {
        if (dai != null) ((InternalEList.Unsettable<?>)dai).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDAI() {
        return dai != null && ((InternalEList.Unsettable<?>)dai).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<SDI> getSDI() {
        if (sdi == null) {
            sdi = new EObjectContainmentWithInverseEList.Unsettable<SDI>(SDI.class, this, SclPackage.DOI__SDI, SclPackage.SDI__PARENT_DOI);
        }
        return sdi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSDI() {
        if (sdi != null) ((InternalEList.Unsettable<?>)sdi).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSDI() {
        return sdi != null && ((InternalEList.Unsettable<?>)sdi).isSet();
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
            case SclPackage.DOI__PARENT_ANY_LN:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentAnyLN((AnyLN)otherEnd, msgs);
            case SclPackage.DOI__DAI:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDAI()).basicAdd(otherEnd, msgs);
            case SclPackage.DOI__SDI:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSDI()).basicAdd(otherEnd, msgs);
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
            case SclPackage.DOI__PARENT_ANY_LN:
                return basicSetParentAnyLN(null, msgs);
            case SclPackage.DOI__DAI:
                return ((InternalEList<?>)getDAI()).basicRemove(otherEnd, msgs);
            case SclPackage.DOI__SDI:
                return ((InternalEList<?>)getSDI()).basicRemove(otherEnd, msgs);
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
            case SclPackage.DOI__PARENT_ANY_LN:
                return eInternalContainer().eInverseRemove(this, SclPackage.ANY_LN__DOI, AnyLN.class, msgs);
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
            case SclPackage.DOI__IX:
                return getIx();
            case SclPackage.DOI__PARENT_ANY_LN:
                return getParentAnyLN();
            case SclPackage.DOI__DAI:
                return getDAI();
            case SclPackage.DOI__SDI:
                return getSDI();
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
            case SclPackage.DOI__IX:
                setIx((Integer)newValue);
                return;
            case SclPackage.DOI__PARENT_ANY_LN:
                setParentAnyLN((AnyLN)newValue);
                return;
            case SclPackage.DOI__DAI:
                getDAI().clear();
                getDAI().addAll((Collection<? extends DAI>)newValue);
                return;
            case SclPackage.DOI__SDI:
                getSDI().clear();
                getSDI().addAll((Collection<? extends SDI>)newValue);
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
            case SclPackage.DOI__IX:
                unsetIx();
                return;
            case SclPackage.DOI__PARENT_ANY_LN:
                setParentAnyLN((AnyLN)null);
                return;
            case SclPackage.DOI__DAI:
                unsetDAI();
                return;
            case SclPackage.DOI__SDI:
                unsetSDI();
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
            case SclPackage.DOI__IX:
                return isSetIx();
            case SclPackage.DOI__PARENT_ANY_LN:
                return getParentAnyLN() != null;
            case SclPackage.DOI__DAI:
                return isSetDAI();
            case SclPackage.DOI__SDI:
                return isSetSDI();
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
        result.append(" (ix: ");
        if (ixESet) result.append(ix); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DOIImpl
