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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject;
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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DO Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOTypeImpl#getCdc <em>Cdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOTypeImpl#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOTypeImpl#getDA <em>DA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOTypeImpl#getReferredByAbstractDataObject <em>Referred By Abstract Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOTypeImpl#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOTypeImpl#getSDO <em>SDO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOTypeImpl extends IDNamingImpl implements DOType {
    /**
     * The default value of the '{@link #getCdc() <em>Cdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCdc()
     * @generated
     * @ordered
     */
    protected static final String CDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCdc() <em>Cdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCdc()
     * @generated
     * @ordered
     */
    protected String cdc = CDC_EDEFAULT;

    /**
     * This is true if the Cdc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cdcESet;

    /**
     * The default value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIedType()
     * @generated
     * @ordered
     */
    protected static final String IED_TYPE_EDEFAULT = "";

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
     * The cached value of the '{@link #getDA() <em>DA</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDA()
     * @generated
     * @ordered
     */
    protected EList<DA> da;

    /**
     * The cached value of the '{@link #getReferredByAbstractDataObject() <em>Referred By Abstract Data Object</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByAbstractDataObject()
     * @generated
     * @ordered
     */
    protected EList<AbstractDataObject> referredByAbstractDataObject;

    /**
     * The cached value of the '{@link #getSDO() <em>SDO</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSDO()
     * @generated
     * @ordered
     */
    protected EList<SDO> sdo;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DOTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDOType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCdc() {
        return cdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCdc( String newCdc ) {
        String oldCdc = cdc;
        cdc = newCdc;
        boolean oldCdcESet = cdcESet;
        cdcESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DO_TYPE__CDC, oldCdc, cdc, !oldCdcESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCdc() {
        String oldCdc = cdc;
        boolean oldCdcESet = cdcESet;
        cdc = CDC_EDEFAULT;
        cdcESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DO_TYPE__CDC, oldCdc, CDC_EDEFAULT, oldCdcESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCdc() {
        return cdcESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DO_TYPE__IED_TYPE, oldIedType, iedType, !oldIedTypeESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DO_TYPE__IED_TYPE, oldIedType, IED_TYPE_EDEFAULT, oldIedTypeESet));
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
    public EList<DA> getDA() {
        if (da == null) {
            da = new EObjectContainmentWithInverseEList.Unsettable<DA>(DA.class, this, SclPackage.DO_TYPE__DA, SclPackage.DA__PARENT_DO_TYPE);
        }
        return da;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDA() {
        if (da != null) ((InternalEList.Unsettable<?>)da).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDA() {
        return da != null && ((InternalEList.Unsettable<?>)da).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AbstractDataObject> getReferredByAbstractDataObject() {
        if (referredByAbstractDataObject == null) {
            referredByAbstractDataObject = new EObjectWithInverseEList.Unsettable<AbstractDataObject>(AbstractDataObject.class, this, SclPackage.DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT, SclPackage.ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE);
        }
        return referredByAbstractDataObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByAbstractDataObject() {
        if (referredByAbstractDataObject != null) ((InternalEList.Unsettable<?>)referredByAbstractDataObject).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByAbstractDataObject() {
        return referredByAbstractDataObject != null && ((InternalEList.Unsettable<?>)referredByAbstractDataObject).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataTypeTemplates getParentDataTypeTemplates() {
        if (eContainerFeatureID() != SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES) return null;
        return (DataTypeTemplates)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDataTypeTemplates(DataTypeTemplates newParentDataTypeTemplates, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentDataTypeTemplates, SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDataTypeTemplates(DataTypeTemplates newParentDataTypeTemplates) {
        if (newParentDataTypeTemplates != eInternalContainer() || (eContainerFeatureID() != SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES && newParentDataTypeTemplates != null)) {
            if (EcoreUtil.isAncestor(this, newParentDataTypeTemplates))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentDataTypeTemplates != null)
                msgs = ((InternalEObject)newParentDataTypeTemplates).eInverseAdd(this, SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE, DataTypeTemplates.class, msgs);
            msgs = basicSetParentDataTypeTemplates(newParentDataTypeTemplates, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES, newParentDataTypeTemplates, newParentDataTypeTemplates));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<SDO> getSDO() {
        if (sdo == null) {
            sdo = new EObjectContainmentWithInverseEList.Unsettable<SDO>(SDO.class, this, SclPackage.DO_TYPE__SDO, SclPackage.SDO__PARENT_DO_TYPE);
        }
        return sdo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSDO() {
        if (sdo != null) ((InternalEList.Unsettable<?>)sdo).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSDO() {
        return sdo != null && ((InternalEList.Unsettable<?>)sdo).isSet();
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
            case SclPackage.DO_TYPE__DA:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getDA()).basicAdd(otherEnd, msgs);
            case SclPackage.DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredByAbstractDataObject()).basicAdd(otherEnd, msgs);
            case SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentDataTypeTemplates((DataTypeTemplates)otherEnd, msgs);
            case SclPackage.DO_TYPE__SDO:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getSDO()).basicAdd(otherEnd, msgs);
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
            case SclPackage.DO_TYPE__DA:
                return ((InternalEList<?>)getDA()).basicRemove(otherEnd, msgs);
            case SclPackage.DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT:
                return ((InternalEList<?>)getReferredByAbstractDataObject()).basicRemove(otherEnd, msgs);
            case SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES:
                return basicSetParentDataTypeTemplates(null, msgs);
            case SclPackage.DO_TYPE__SDO:
                return ((InternalEList<?>)getSDO()).basicRemove(otherEnd, msgs);
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
            case SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES:
                return eInternalContainer().eInverseRemove(this, SclPackage.DATA_TYPE_TEMPLATES__DO_TYPE, DataTypeTemplates.class, msgs);
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
            case SclPackage.DO_TYPE__CDC:
                return getCdc();
            case SclPackage.DO_TYPE__IED_TYPE:
                return getIedType();
            case SclPackage.DO_TYPE__DA:
                return getDA();
            case SclPackage.DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT:
                return getReferredByAbstractDataObject();
            case SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES:
                return getParentDataTypeTemplates();
            case SclPackage.DO_TYPE__SDO:
                return getSDO();
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
            case SclPackage.DO_TYPE__CDC:
                setCdc((String)newValue);
                return;
            case SclPackage.DO_TYPE__IED_TYPE:
                setIedType((String)newValue);
                return;
            case SclPackage.DO_TYPE__DA:
                getDA().clear();
                getDA().addAll((Collection<? extends DA>)newValue);
                return;
            case SclPackage.DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT:
                getReferredByAbstractDataObject().clear();
                getReferredByAbstractDataObject().addAll((Collection<? extends AbstractDataObject>)newValue);
                return;
            case SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES:
                setParentDataTypeTemplates((DataTypeTemplates)newValue);
                return;
            case SclPackage.DO_TYPE__SDO:
                getSDO().clear();
                getSDO().addAll((Collection<? extends SDO>)newValue);
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
            case SclPackage.DO_TYPE__CDC:
                unsetCdc();
                return;
            case SclPackage.DO_TYPE__IED_TYPE:
                unsetIedType();
                return;
            case SclPackage.DO_TYPE__DA:
                unsetDA();
                return;
            case SclPackage.DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT:
                unsetReferredByAbstractDataObject();
                return;
            case SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES:
                setParentDataTypeTemplates((DataTypeTemplates)null);
                return;
            case SclPackage.DO_TYPE__SDO:
                unsetSDO();
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
            case SclPackage.DO_TYPE__CDC:
                return isSetCdc();
            case SclPackage.DO_TYPE__IED_TYPE:
                return isSetIedType();
            case SclPackage.DO_TYPE__DA:
                return isSetDA();
            case SclPackage.DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT:
                return isSetReferredByAbstractDataObject();
            case SclPackage.DO_TYPE__PARENT_DATA_TYPE_TEMPLATES:
                return getParentDataTypeTemplates() != null;
            case SclPackage.DO_TYPE__SDO:
                return isSetSDO();
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
        result.append(" (cdc: ");
        if (cdcESet) result.append(cdc); else result.append("<unset>");
        result.append(", iedType: ");
        if (iedTypeESet) result.append(iedType); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DOTypeImpl
