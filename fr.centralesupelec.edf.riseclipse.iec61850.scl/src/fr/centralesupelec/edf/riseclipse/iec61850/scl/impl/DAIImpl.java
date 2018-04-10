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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getValImport <em>Val Import</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getValKind <em>Val Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getVal <em>Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getDOI <em>DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getSDI <em>SDI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAIImpl extends DataAttributeImpl implements DAI {
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
     * The default value of the '{@link #getValImport() <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValImport()
     * @generated
     * @ordered
     */
    protected static final Boolean VAL_IMPORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValImport() <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValImport()
     * @generated
     * @ordered
     */
    protected Boolean valImport = VAL_IMPORT_EDEFAULT;

    /**
     * This is true if the Val Import attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valImportESet;

    /**
     * The default value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValKind()
     * @generated NOT
     * @ordered
     */
    protected static final ValKindEnum VAL_KIND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValKind()
     * @generated
     * @ordered
     */
    protected ValKindEnum valKind = VAL_KIND_EDEFAULT;

    /**
     * This is true if the Val Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valKindESet;

    /**
     * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVal()
     * @generated
     * @ordered
     */
    protected EList<Val> val;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DAIImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDAI();
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DAI__IX, oldIx, ix, !oldIxESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DAI__IX, oldIx, IX_EDEFAULT, oldIxESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DAI__SADDR, oldSAddr, sAddr, !oldSAddrESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DAI__SADDR, oldSAddr, SADDR_EDEFAULT, oldSAddrESet));
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
    public Boolean getValImport() {
        return valImport;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setValImport( Boolean newValImport ) {
        Boolean oldValImport = valImport;
        valImport = newValImport;
        boolean oldValImportESet = valImportESet;
        valImportESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DAI__VAL_IMPORT, oldValImport, valImport, !oldValImportESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetValImport() {
        Boolean oldValImport = valImport;
        boolean oldValImportESet = valImportESet;
        valImport = VAL_IMPORT_EDEFAULT;
        valImportESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DAI__VAL_IMPORT, oldValImport, VAL_IMPORT_EDEFAULT, oldValImportESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetValImport() {
        return valImportESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValKindEnum getValKind() {
        return valKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValKind( ValKindEnum newValKind ) {
        ValKindEnum oldValKind = valKind;
        valKind = newValKind == null ? VAL_KIND_EDEFAULT : newValKind;
        boolean oldValKindESet = valKindESet;
        valKindESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DAI__VAL_KIND, oldValKind, valKind, !oldValKindESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetValKind() {
        ValKindEnum oldValKind = valKind;
        boolean oldValKindESet = valKindESet;
        valKind = VAL_KIND_EDEFAULT;
        valKindESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DAI__VAL_KIND, oldValKind, VAL_KIND_EDEFAULT, oldValKindESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetValKind() {
        return valKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Val> getVal() {
        if (val == null) {
            val = new EObjectContainmentWithInverseEList.Unsettable<Val>(Val.class, this, SclPackage.DAI__VAL, SclPackage.VAL__DAI);
        }
        return val;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVal() {
        if (val != null) ((InternalEList.Unsettable<?>)val).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVal() {
        return val != null && ((InternalEList.Unsettable<?>)val).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DOI getDOI() {
        if (eContainerFeatureID() != SclPackage.DAI__DOI) return null;
        return (DOI)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDOI( DOI newDOI, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newDOI, SclPackage.DAI__DOI, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDOI( DOI newDOI ) {
        if (newDOI != eInternalContainer() || (eContainerFeatureID() != SclPackage.DAI__DOI && newDOI != null)) {
            if (EcoreUtil.isAncestor(this, newDOI))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDOI != null)
                msgs = ((InternalEObject)newDOI).eInverseAdd(this, SclPackage.DOI__DAI, DOI.class, msgs);
            msgs = basicSetDOI(newDOI, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DAI__DOI, newDOI, newDOI));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SDI getSDI() {
        if (eContainerFeatureID() != SclPackage.DAI__SDI) return null;
        return (SDI)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSDI( SDI newSDI, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newSDI, SclPackage.DAI__SDI, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSDI( SDI newSDI ) {
        if (newSDI != eInternalContainer() || (eContainerFeatureID() != SclPackage.DAI__SDI && newSDI != null)) {
            if (EcoreUtil.isAncestor(this, newSDI))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSDI != null)
                msgs = ((InternalEObject)newSDI).eInverseAdd(this, SclPackage.SDI__DAI, SDI.class, msgs);
            msgs = basicSetSDI(newSDI, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DAI__SDI, newSDI, newSDI));
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
            case SclPackage.DAI__VAL:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getVal()).basicAdd(otherEnd, msgs);
            case SclPackage.DAI__DOI:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDOI((DOI)otherEnd, msgs);
            case SclPackage.DAI__SDI:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetSDI((SDI)otherEnd, msgs);
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
            case SclPackage.DAI__VAL:
                return ((InternalEList<?>)getVal()).basicRemove(otherEnd, msgs);
            case SclPackage.DAI__DOI:
                return basicSetDOI(null, msgs);
            case SclPackage.DAI__SDI:
                return basicSetSDI(null, msgs);
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
            case SclPackage.DAI__DOI:
                return eInternalContainer().eInverseRemove(this, SclPackage.DOI__DAI, DOI.class, msgs);
            case SclPackage.DAI__SDI:
                return eInternalContainer().eInverseRemove(this, SclPackage.SDI__DAI, SDI.class, msgs);
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
            case SclPackage.DAI__IX:
                return getIx();
            case SclPackage.DAI__SADDR:
                return getSAddr();
            case SclPackage.DAI__VAL_IMPORT:
                return getValImport();
            case SclPackage.DAI__VAL_KIND:
                return getValKind();
            case SclPackage.DAI__VAL:
                return getVal();
            case SclPackage.DAI__DOI:
                return getDOI();
            case SclPackage.DAI__SDI:
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
            case SclPackage.DAI__IX:
                setIx((Integer)newValue);
                return;
            case SclPackage.DAI__SADDR:
                setSAddr((String)newValue);
                return;
            case SclPackage.DAI__VAL_IMPORT:
                setValImport((Boolean)newValue);
                return;
            case SclPackage.DAI__VAL_KIND:
                setValKind((ValKindEnum)newValue);
                return;
            case SclPackage.DAI__VAL:
                getVal().clear();
                getVal().addAll((Collection<? extends Val>)newValue);
                return;
            case SclPackage.DAI__DOI:
                setDOI((DOI)newValue);
                return;
            case SclPackage.DAI__SDI:
                setSDI((SDI)newValue);
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
            case SclPackage.DAI__IX:
                unsetIx();
                return;
            case SclPackage.DAI__SADDR:
                unsetSAddr();
                return;
            case SclPackage.DAI__VAL_IMPORT:
                unsetValImport();
                return;
            case SclPackage.DAI__VAL_KIND:
                unsetValKind();
                return;
            case SclPackage.DAI__VAL:
                unsetVal();
                return;
            case SclPackage.DAI__DOI:
                setDOI((DOI)null);
                return;
            case SclPackage.DAI__SDI:
                setSDI((SDI)null);
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
            case SclPackage.DAI__IX:
                return isSetIx();
            case SclPackage.DAI__SADDR:
                return isSetSAddr();
            case SclPackage.DAI__VAL_IMPORT:
                return isSetValImport();
            case SclPackage.DAI__VAL_KIND:
                return isSetValKind();
            case SclPackage.DAI__VAL:
                return isSetVal();
            case SclPackage.DAI__DOI:
                return getDOI() != null;
            case SclPackage.DAI__SDI:
                return getSDI() != null;
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
        result.append(", valImport: ");
        if (valImportESet) result.append(valImport); else result.append("<unset>");
        result.append(", valKind: ");
        if (valKindESet) result.append(valKind); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DAIImpl
