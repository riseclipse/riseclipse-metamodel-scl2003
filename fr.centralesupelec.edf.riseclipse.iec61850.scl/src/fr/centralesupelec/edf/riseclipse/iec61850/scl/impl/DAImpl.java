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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl#getDchg <em>Dchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl#getDupd <em>Dupd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl#getQchg <em>Qchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl#getParentDOType <em>Parent DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl#getProtNs <em>Prot Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAImpl extends AbstractDataAttributeImpl implements DA {
    /**
     * The default value of the '{@link #getDchg() <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDchg()
     * @generated
     * @ordered
     */
    protected static final Boolean DCHG_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getDchg() <em>Dchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDchg()
     * @generated
     * @ordered
     */
    protected Boolean dchg = DCHG_EDEFAULT;

    /**
     * This is true if the Dchg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dchgESet;

    /**
     * The default value of the '{@link #getDupd() <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDupd()
     * @generated
     * @ordered
     */
    protected static final Boolean DUPD_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getDupd() <em>Dupd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDupd()
     * @generated
     * @ordered
     */
    protected Boolean dupd = DUPD_EDEFAULT;

    /**
     * This is true if the Dupd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dupdESet;

    /**
     * The default value of the '{@link #getQchg() <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQchg()
     * @generated
     * @ordered
     */
    protected static final Boolean QCHG_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getQchg() <em>Qchg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQchg()
     * @generated
     * @ordered
     */
    protected Boolean qchg = QCHG_EDEFAULT;

    /**
     * This is true if the Qchg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qchgESet;

    /**
     * The default value of the '{@link #getFc() <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFc()
     * @generated NOT because there is no default value in SCL
     * @ordered
     */
    protected static final FCEnum FC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFc() <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFc()
     * @generated
     * @ordered
     */
    protected FCEnum fc = FC_EDEFAULT;

    /**
     * This is true if the Fc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fcESet;

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
    protected DAImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDA();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDchg() {
        return dchg;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDchg( Boolean newDchg ) {
        Boolean oldDchg = dchg;
        dchg = newDchg;
        boolean oldDchgESet = dchgESet;
        dchgESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DA__DCHG, oldDchg, dchg, !oldDchgESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDchg() {
        Boolean oldDchg = dchg;
        boolean oldDchgESet = dchgESet;
        dchg = DCHG_EDEFAULT;
        dchgESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DA__DCHG, oldDchg, DCHG_EDEFAULT, oldDchgESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDchg() {
        return dchgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDupd() {
        return dupd;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDupd( Boolean newDupd ) {
        Boolean oldDupd = dupd;
        dupd = newDupd;
        boolean oldDupdESet = dupdESet;
        dupdESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DA__DUPD, oldDupd, dupd, !oldDupdESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDupd() {
        Boolean oldDupd = dupd;
        boolean oldDupdESet = dupdESet;
        dupd = DUPD_EDEFAULT;
        dupdESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DA__DUPD, oldDupd, DUPD_EDEFAULT, oldDupdESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDupd() {
        return dupdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FCEnum getFc() {
        return fc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFc( FCEnum newFc ) {
        FCEnum oldFc = fc;
        fc = newFc == null ? FC_EDEFAULT : newFc;
        boolean oldFcESet = fcESet;
        fcESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DA__FC, oldFc, fc, !oldFcESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFc() {
        FCEnum oldFc = fc;
        boolean oldFcESet = fcESet;
        fc = FC_EDEFAULT;
        fcESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DA__FC, oldFc, FC_EDEFAULT, oldFcESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFc() {
        return fcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOType getParentDOType() {
        if (eContainerFeatureID() != SclPackage.DA__PARENT_DO_TYPE) return null;
        return (DOType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDOType(DOType newParentDOType, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentDOType, SclPackage.DA__PARENT_DO_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDOType(DOType newParentDOType) {
        if (newParentDOType != eInternalContainer() || (eContainerFeatureID() != SclPackage.DA__PARENT_DO_TYPE && newParentDOType != null)) {
            if (EcoreUtil.isAncestor(this, newParentDOType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentDOType != null)
                msgs = ((InternalEObject)newParentDOType).eInverseAdd(this, SclPackage.DO_TYPE__DA, DOType.class, msgs);
            msgs = basicSetParentDOType(newParentDOType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DA__PARENT_DO_TYPE, newParentDOType, newParentDOType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getQchg() {
        return qchg;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQchg( Boolean newQchg ) {
        Boolean oldQchg = qchg;
        qchg = newQchg;
        boolean oldQchgESet = qchgESet;
        qchgESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DA__QCHG, oldQchg, qchg, !oldQchgESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQchg() {
        Boolean oldQchg = qchg;
        boolean oldQchgESet = qchgESet;
        qchg = QCHG_EDEFAULT;
        qchgESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DA__QCHG, oldQchg, QCHG_EDEFAULT, oldQchgESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQchg() {
        return qchgESet;
    }

    public boolean isSetType() {
        return isSetRefersToDAType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ProtNs> getProtNs() {
        if (protNs == null) {
            protNs = new EObjectContainmentWithInverseEList.Unsettable<ProtNs>(ProtNs.class, this, SclPackage.DA__PROT_NS, SclPackage.PROT_NS__PARENT_DA);
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
            case SclPackage.DA__PARENT_DO_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentDOType((DOType)otherEnd, msgs);
            case SclPackage.DA__PROT_NS:
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
            case SclPackage.DA__PARENT_DO_TYPE:
                return basicSetParentDOType(null, msgs);
            case SclPackage.DA__PROT_NS:
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
            case SclPackage.DA__PARENT_DO_TYPE:
                return eInternalContainer().eInverseRemove(this, SclPackage.DO_TYPE__DA, DOType.class, msgs);
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
            case SclPackage.DA__DCHG:
                return getDchg();
            case SclPackage.DA__DUPD:
                return getDupd();
            case SclPackage.DA__QCHG:
                return getQchg();
            case SclPackage.DA__FC:
                return getFc();
            case SclPackage.DA__PARENT_DO_TYPE:
                return getParentDOType();
            case SclPackage.DA__PROT_NS:
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
            case SclPackage.DA__DCHG:
                setDchg((Boolean)newValue);
                return;
            case SclPackage.DA__DUPD:
                setDupd((Boolean)newValue);
                return;
            case SclPackage.DA__QCHG:
                setQchg((Boolean)newValue);
                return;
            case SclPackage.DA__FC:
                setFc((FCEnum)newValue);
                return;
            case SclPackage.DA__PARENT_DO_TYPE:
                setParentDOType((DOType)newValue);
                return;
            case SclPackage.DA__PROT_NS:
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
            case SclPackage.DA__DCHG:
                unsetDchg();
                return;
            case SclPackage.DA__DUPD:
                unsetDupd();
                return;
            case SclPackage.DA__QCHG:
                unsetQchg();
                return;
            case SclPackage.DA__FC:
                unsetFc();
                return;
            case SclPackage.DA__PARENT_DO_TYPE:
                setParentDOType((DOType)null);
                return;
            case SclPackage.DA__PROT_NS:
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
            case SclPackage.DA__DCHG:
                return isSetDchg();
            case SclPackage.DA__DUPD:
                return isSetDupd();
            case SclPackage.DA__QCHG:
                return isSetQchg();
            case SclPackage.DA__FC:
                return isSetFc();
            case SclPackage.DA__PARENT_DO_TYPE:
                return getParentDOType() != null;
            case SclPackage.DA__PROT_NS:
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
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == AgDATrgOp.class) {
            switch (derivedFeatureID) {
                case SclPackage.DA__DCHG: return SclPackage.AG_DA_TRG_OP__DCHG;
                case SclPackage.DA__DUPD: return SclPackage.AG_DA_TRG_OP__DUPD;
                case SclPackage.DA__QCHG: return SclPackage.AG_DA_TRG_OP__QCHG;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == AgDATrgOp.class) {
            switch (baseFeatureID) {
                case SclPackage.AG_DA_TRG_OP__DCHG: return SclPackage.DA__DCHG;
                case SclPackage.AG_DA_TRG_OP__DUPD: return SclPackage.DA__DUPD;
                case SclPackage.AG_DA_TRG_OP__QCHG: return SclPackage.DA__QCHG;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    @Override
    public String getType() {
        if( "Enum".equals( bType ) && isSetRefersToEnumType() )
            return getRefersToEnumType().getId();
        else if( isSetRefersToDAType() )
            return getRefersToDAType().getId();
        else
            return type;
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
        result.append(" (dchg: ");
        if (dchgESet) result.append(dchg); else result.append("<unset>");
        result.append(", dupd: ");
        if (dupdESet) result.append(dupd); else result.append("<unset>");
        result.append(", qchg: ");
        if (qchgESet) result.append(qchg); else result.append("<unset>");
        result.append(", fc: ");
        if (fcESet) result.append(fc); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DAImpl
