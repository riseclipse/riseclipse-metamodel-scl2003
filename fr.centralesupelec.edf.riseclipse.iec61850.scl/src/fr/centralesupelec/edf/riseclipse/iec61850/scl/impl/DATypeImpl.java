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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DA Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl#getBDA <em>BDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl#getProtNs <em>Prot Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DATypeImpl extends IDNamingImpl implements DAType {
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
     * The cached value of the '{@link #getBDA() <em>BDA</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBDA()
     * @generated
     * @ordered
     */
    protected EList<BDA> bda;

    /**
     * The cached value of the '{@link #getReferredByAbstractDataAttribute() <em>Referred By Abstract Data Attribute</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAbstractDataAttribute()
     * @generated
     * @ordered
     */
    protected EList<AbstractDataAttribute> referredByAbstractDataAttribute;

    /**
     * The cached value of the '{@link #getProtNs() <em>Prot Ns</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtNs()
     * @generated
     * @ordered
     */
    protected EList<ProtNs> protNs;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DATypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDAType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getIedType() {
        return iedType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIedType( String newIedType ) {
        String oldIedType = iedType;
        iedType = newIedType;
        boolean oldIedTypeESet = iedTypeESet;
        iedTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DA_TYPE__IED_TYPE, oldIedType, iedType, !oldIedTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIedType() {
        String oldIedType = iedType;
        boolean oldIedTypeESet = iedTypeESet;
        iedType = IED_TYPE_EDEFAULT;
        iedTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DA_TYPE__IED_TYPE, oldIedType, IED_TYPE_EDEFAULT, oldIedTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIedType() {
        return iedTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<BDA> getBDA() {
        if (bda == null) {
            bda = new EObjectContainmentWithInverseEList.Unsettable<BDA>(BDA.class, this, SclPackage.DA_TYPE__BDA, SclPackage.BDA__DA_TYPE);
        }
        return bda;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBDA() {
        if (bda != null) ((InternalEList.Unsettable<?>)bda).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBDA() {
        return bda != null && ((InternalEList.Unsettable<?>)bda).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AbstractDataAttribute> getReferredByAbstractDataAttribute() {
        if (referredByAbstractDataAttribute == null) {
            referredByAbstractDataAttribute = new EObjectWithInverseEList.Unsettable<AbstractDataAttribute>(AbstractDataAttribute.class, this, SclPackage.DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE, SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE);
        }
        return referredByAbstractDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAbstractDataAttribute() {
        if (referredByAbstractDataAttribute != null) ((InternalEList.Unsettable<?>)referredByAbstractDataAttribute).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAbstractDataAttribute() {
        return referredByAbstractDataAttribute != null && ((InternalEList.Unsettable<?>)referredByAbstractDataAttribute).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataTypeTemplates getDataTypeTemplates() {
        if (eContainerFeatureID() != SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES) return null;
        return (DataTypeTemplates)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataTypeTemplates( DataTypeTemplates newDataTypeTemplates, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newDataTypeTemplates, SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataTypeTemplates( DataTypeTemplates newDataTypeTemplates ) {
        if (newDataTypeTemplates != eInternalContainer() || (eContainerFeatureID() != SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES && newDataTypeTemplates != null)) {
            if (EcoreUtil.isAncestor(this, newDataTypeTemplates))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDataTypeTemplates != null)
                msgs = ((InternalEObject)newDataTypeTemplates).eInverseAdd(this, SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE, DataTypeTemplates.class, msgs);
            msgs = basicSetDataTypeTemplates(newDataTypeTemplates, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES, newDataTypeTemplates, newDataTypeTemplates));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ProtNs> getProtNs() {
        if (protNs == null) {
            protNs = new EObjectContainmentWithInverseEList.Unsettable<ProtNs>(ProtNs.class, this, SclPackage.DA_TYPE__PROT_NS, SclPackage.PROT_NS__DA_TYPE);
        }
        return protNs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProtNs() {
        if (protNs != null) ((InternalEList.Unsettable<?>)protNs).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProtNs() {
        return protNs != null && ((InternalEList.Unsettable<?>)protNs).isSet();
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
            case SclPackage.DA_TYPE__BDA:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getBDA()).basicAdd(otherEnd, msgs);
            case SclPackage.DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByAbstractDataAttribute()).basicAdd(otherEnd, msgs);
            case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDataTypeTemplates((DataTypeTemplates)otherEnd, msgs);
            case SclPackage.DA_TYPE__PROT_NS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getProtNs()).basicAdd(otherEnd, msgs);
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
            case SclPackage.DA_TYPE__BDA:
                return ((InternalEList<?>)getBDA()).basicRemove(otherEnd, msgs);
            case SclPackage.DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
                return ((InternalEList<?>)getReferredByAbstractDataAttribute()).basicRemove(otherEnd, msgs);
            case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
                return basicSetDataTypeTemplates(null, msgs);
            case SclPackage.DA_TYPE__PROT_NS:
                return ((InternalEList<?>)getProtNs()).basicRemove(otherEnd, msgs);
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
            case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
                return eInternalContainer().eInverseRemove(this, SclPackage.DATA_TYPE_TEMPLATES__DA_TYPE, DataTypeTemplates.class, msgs);
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
            case SclPackage.DA_TYPE__IED_TYPE:
                return getIedType();
            case SclPackage.DA_TYPE__BDA:
                return getBDA();
            case SclPackage.DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
                return getReferredByAbstractDataAttribute();
            case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
                return getDataTypeTemplates();
            case SclPackage.DA_TYPE__PROT_NS:
                return getProtNs();
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
            case SclPackage.DA_TYPE__IED_TYPE:
                setIedType((String)newValue);
                return;
            case SclPackage.DA_TYPE__BDA:
                getBDA().clear();
                getBDA().addAll((Collection<? extends BDA>)newValue);
                return;
            case SclPackage.DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
                getReferredByAbstractDataAttribute().clear();
                getReferredByAbstractDataAttribute().addAll((Collection<? extends AbstractDataAttribute>)newValue);
                return;
            case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
                setDataTypeTemplates((DataTypeTemplates)newValue);
                return;
            case SclPackage.DA_TYPE__PROT_NS:
                getProtNs().clear();
                getProtNs().addAll((Collection<? extends ProtNs>)newValue);
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
            case SclPackage.DA_TYPE__IED_TYPE:
                unsetIedType();
                return;
            case SclPackage.DA_TYPE__BDA:
                unsetBDA();
                return;
            case SclPackage.DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
                unsetReferredByAbstractDataAttribute();
                return;
            case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
                setDataTypeTemplates((DataTypeTemplates)null);
                return;
            case SclPackage.DA_TYPE__PROT_NS:
                unsetProtNs();
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
            case SclPackage.DA_TYPE__IED_TYPE:
                return isSetIedType();
            case SclPackage.DA_TYPE__BDA:
                return isSetBDA();
            case SclPackage.DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE:
                return isSetReferredByAbstractDataAttribute();
            case SclPackage.DA_TYPE__DATA_TYPE_TEMPLATES:
                return getDataTypeTemplates() != null;
            case SclPackage.DA_TYPE__PROT_NS:
                return isSetProtNs();
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
        result.append(" (iedType: ");
        if (iedTypeESet) result.append(iedType); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DATypeImpl
