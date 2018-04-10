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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LNode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl#getDO <em>DO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl#getReferredByAnyLN <em>Referred By Any LN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LNodeTypeImpl extends IDNamingImpl implements LNodeType {
    /**
     * The default value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIedType()
     * @generated
     * @ordered
     */
    protected static final String IED_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIedType()
     * @generated
     * @ordered
     */
    protected String iedType = IED_TYPE_EDEFAULT;

    /**
     * This is true if the Ied Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iedTypeESet;

    /**
     * The default value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnClass()
     * @generated
     * @ordered
     */
    protected static final String LN_CLASS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLnClass() <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLnClass()
     * @generated
     * @ordered
     */
    protected String lnClass = LN_CLASS_EDEFAULT;

    /**
     * This is true if the Ln Class attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lnClassESet;

    /**
     * The cached value of the '{@link #getDO() <em>DO</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDO()
     * @generated
     * @ordered
     */
    protected EList<DO> do_;

    /**
     * The cached value of the '{@link #getReferredByAnyLN() <em>Referred By Any LN</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAnyLN()
     * @generated
     * @ordered
     */
    protected EList<AnyLN> referredByAnyLN;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LNodeTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLNodeType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getIedType() {
        if( isSetIedType() ) {
            return iedType;
        }
        return "";
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIedType( String newIedType ) {
        String oldIedType = iedType;
        iedType = newIedType;
        boolean oldIedTypeESet = iedTypeESet;
        iedTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE_TYPE__IED_TYPE, oldIedType, iedType, !oldIedTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIedType() {
        String oldIedType = iedType;
        boolean oldIedTypeESet = iedTypeESet;
        iedType = IED_TYPE_EDEFAULT;
        iedTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE_TYPE__IED_TYPE, oldIedType, IED_TYPE_EDEFAULT, oldIedTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIedType() {
        return iedTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLnClass() {
        return lnClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLnClass( String newLnClass ) {
        String oldLnClass = lnClass;
        lnClass = newLnClass;
        boolean oldLnClassESet = lnClassESet;
        lnClassESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE_TYPE__LN_CLASS, oldLnClass, lnClass, !oldLnClassESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLnClass() {
        String oldLnClass = lnClass;
        boolean oldLnClassESet = lnClassESet;
        lnClass = LN_CLASS_EDEFAULT;
        lnClassESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LNODE_TYPE__LN_CLASS, oldLnClass, LN_CLASS_EDEFAULT, oldLnClassESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLnClass() {
        return lnClassESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DO> getDO() {
        if (do_ == null) {
            do_ = new EObjectContainmentWithInverseEList.Unsettable<DO>(DO.class, this, SclPackage.LNODE_TYPE__DO, SclPackage.DO__LNODE_TYPE);
        }
        return do_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDO() {
        if (do_ != null) ((InternalEList.Unsettable<?>)do_).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDO() {
        return do_ != null && ((InternalEList.Unsettable<?>)do_).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataTypeTemplates getDataTypeTemplates() {
        if (eContainerFeatureID() != SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES) return null;
        return (DataTypeTemplates)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataTypeTemplates( DataTypeTemplates newDataTypeTemplates, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newDataTypeTemplates, SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataTypeTemplates( DataTypeTemplates newDataTypeTemplates ) {
        if (newDataTypeTemplates != eInternalContainer() || (eContainerFeatureID() != SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES && newDataTypeTemplates != null)) {
            if (EcoreUtil.isAncestor(this, newDataTypeTemplates))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDataTypeTemplates != null)
                msgs = ((InternalEObject)newDataTypeTemplates).eInverseAdd(this, SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE, DataTypeTemplates.class, msgs);
            msgs = basicSetDataTypeTemplates(newDataTypeTemplates, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES, newDataTypeTemplates, newDataTypeTemplates));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AnyLN> getReferredByAnyLN() {
        if (referredByAnyLN == null) {
            referredByAnyLN = new EObjectWithInverseEList.Unsettable<AnyLN>(AnyLN.class, this, SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN, SclPackage.ANY_LN__REFERS_TO_LNODE_TYPE);
        }
        return referredByAnyLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReferredByAnyLN() {
        if (referredByAnyLN != null) ((InternalEList.Unsettable<?>)referredByAnyLN).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetReferredByAnyLN() {
        return referredByAnyLN != null && ((InternalEList.Unsettable<?>)referredByAnyLN).isSet();
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
            case SclPackage.LNODE_TYPE__DO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDO()).basicAdd(otherEnd, msgs);
            case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDataTypeTemplates((DataTypeTemplates)otherEnd, msgs);
            case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByAnyLN()).basicAdd(otherEnd, msgs);
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
            case SclPackage.LNODE_TYPE__DO:
                return ((InternalEList<?>)getDO()).basicRemove(otherEnd, msgs);
            case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
                return basicSetDataTypeTemplates(null, msgs);
            case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
                return ((InternalEList<?>)getReferredByAnyLN()).basicRemove(otherEnd, msgs);
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
            case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
                return eInternalContainer().eInverseRemove(this, SclPackage.DATA_TYPE_TEMPLATES__LNODE_TYPE, DataTypeTemplates.class, msgs);
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
            case SclPackage.LNODE_TYPE__IED_TYPE:
                return getIedType();
            case SclPackage.LNODE_TYPE__LN_CLASS:
                return getLnClass();
            case SclPackage.LNODE_TYPE__DO:
                return getDO();
            case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
                return getDataTypeTemplates();
            case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
                return getReferredByAnyLN();
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
            case SclPackage.LNODE_TYPE__IED_TYPE:
                setIedType((String)newValue);
                return;
            case SclPackage.LNODE_TYPE__LN_CLASS:
                setLnClass((String)newValue);
                return;
            case SclPackage.LNODE_TYPE__DO:
                getDO().clear();
                getDO().addAll((Collection<? extends DO>)newValue);
                return;
            case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
                setDataTypeTemplates((DataTypeTemplates)newValue);
                return;
            case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
                getReferredByAnyLN().clear();
                getReferredByAnyLN().addAll((Collection<? extends AnyLN>)newValue);
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
            case SclPackage.LNODE_TYPE__IED_TYPE:
                unsetIedType();
                return;
            case SclPackage.LNODE_TYPE__LN_CLASS:
                unsetLnClass();
                return;
            case SclPackage.LNODE_TYPE__DO:
                unsetDO();
                return;
            case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
                setDataTypeTemplates((DataTypeTemplates)null);
                return;
            case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
                unsetReferredByAnyLN();
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
            case SclPackage.LNODE_TYPE__IED_TYPE:
                return isSetIedType();
            case SclPackage.LNODE_TYPE__LN_CLASS:
                return isSetLnClass();
            case SclPackage.LNODE_TYPE__DO:
                return isSetDO();
            case SclPackage.LNODE_TYPE__DATA_TYPE_TEMPLATES:
                return getDataTypeTemplates() != null;
            case SclPackage.LNODE_TYPE__REFERRED_BY_ANY_LN:
                return isSetReferredByAnyLN();
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
        result.append(" (iedType: ");
        if (iedTypeESet) result.append(iedType); else result.append("<unset>");
        result.append(", lnClass: ");
        if (lnClassESet) result.append(lnClass); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //LNodeTypeImpl
