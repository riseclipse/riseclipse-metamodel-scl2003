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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl#getQchg <em>Qchg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl#getRefersToDAType <em>Refers To DA Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl#getDOType <em>DO Type</em>}</li>
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
     * The cached value of the '{@link #getRefersToDAType() <em>Refers To DA Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDAType()
     * @generated
     * @ordered
     */
    protected DAType refersToDAType;

    /**
     * This is true if the Refers To DA Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDATypeESet;

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

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAType getRefersToDAType() {
        return refersToDAType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDAType(DAType newRefersToDAType, NotificationChain msgs) {
        DAType oldRefersToDAType = refersToDAType;
        refersToDAType = newRefersToDAType;
        boolean oldRefersToDATypeESet = refersToDATypeESet;
        refersToDATypeESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.DA__REFERS_TO_DA_TYPE, oldRefersToDAType, newRefersToDAType, !oldRefersToDATypeESet);
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
    public void setRefersToDAType(DAType newRefersToDAType) {
        if (newRefersToDAType != refersToDAType) {
            NotificationChain msgs = null;
            if (refersToDAType != null)
                msgs = ((InternalEObject)refersToDAType).eInverseRemove(this, SclPackage.DA_TYPE__REFERRED_BY_DA, DAType.class, msgs);
            if (newRefersToDAType != null)
                msgs = ((InternalEObject)newRefersToDAType).eInverseAdd(this, SclPackage.DA_TYPE__REFERRED_BY_DA, DAType.class, msgs);
            msgs = basicSetRefersToDAType(newRefersToDAType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToDATypeESet = refersToDATypeESet;
            refersToDATypeESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DA__REFERS_TO_DA_TYPE, newRefersToDAType, newRefersToDAType, !oldRefersToDATypeESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDAType(NotificationChain msgs) {
        DAType oldRefersToDAType = refersToDAType;
        refersToDAType = null;
        boolean oldRefersToDATypeESet = refersToDATypeESet;
        refersToDATypeESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.DA__REFERS_TO_DA_TYPE, oldRefersToDAType, null, oldRefersToDATypeESet);
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
    public void unsetRefersToDAType() {
        if (refersToDAType != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)refersToDAType).eInverseRemove(this, SclPackage.DA_TYPE__REFERRED_BY_DA, DAType.class, msgs);
            msgs = basicUnsetRefersToDAType(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldRefersToDATypeESet = refersToDATypeESet;
            refersToDATypeESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.DA__REFERS_TO_DA_TYPE, null, null, oldRefersToDATypeESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDAType() {
        return refersToDATypeESet;
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
    public DOType getDOType() {
        if (eContainerFeatureID() != SclPackage.DA__DO_TYPE) return null;
        return (DOType)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDOType( DOType newDOType, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newDOType, SclPackage.DA__DO_TYPE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDOType( DOType newDOType ) {
        if (newDOType != eInternalContainer() || (eContainerFeatureID() != SclPackage.DA__DO_TYPE && newDOType != null)) {
            if (EcoreUtil.isAncestor(this, newDOType))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDOType != null)
                msgs = ((InternalEObject)newDOType).eInverseAdd(this, SclPackage.DO_TYPE__DA, DOType.class, msgs);
            msgs = basicSetDOType(newDOType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.DA__DO_TYPE, newDOType, newDOType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ProtNs> getProtNs() {
        if (protNs == null) {
            protNs = new EObjectContainmentWithInverseEList.Unsettable<ProtNs>(ProtNs.class, this, SclPackage.DA__PROT_NS, SclPackage.PROT_NS__DA);
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
            case SclPackage.DA__REFERS_TO_DA_TYPE:
                if (refersToDAType != null)
                    msgs = ((InternalEObject)refersToDAType).eInverseRemove(this, SclPackage.DA_TYPE__REFERRED_BY_DA, DAType.class, msgs);
                return basicSetRefersToDAType((DAType)otherEnd, msgs);
            case SclPackage.DA__DO_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetDOType((DOType)otherEnd, msgs);
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
            case SclPackage.DA__REFERS_TO_DA_TYPE:
                return basicUnsetRefersToDAType(msgs);
            case SclPackage.DA__DO_TYPE:
                return basicSetDOType(null, msgs);
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
            case SclPackage.DA__DO_TYPE:
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
            case SclPackage.DA__FC:
                return getFc();
            case SclPackage.DA__QCHG:
                return getQchg();
            case SclPackage.DA__REFERS_TO_DA_TYPE:
                return getRefersToDAType();
            case SclPackage.DA__DO_TYPE:
                return getDOType();
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
            case SclPackage.DA__FC:
                setFc((FCEnum)newValue);
                return;
            case SclPackage.DA__QCHG:
                setQchg((Boolean)newValue);
                return;
            case SclPackage.DA__REFERS_TO_DA_TYPE:
                setRefersToDAType((DAType)newValue);
                return;
            case SclPackage.DA__DO_TYPE:
                setDOType((DOType)newValue);
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
            case SclPackage.DA__FC:
                unsetFc();
                return;
            case SclPackage.DA__QCHG:
                unsetQchg();
                return;
            case SclPackage.DA__REFERS_TO_DA_TYPE:
                unsetRefersToDAType();
                return;
            case SclPackage.DA__DO_TYPE:
                setDOType((DOType)null);
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
            case SclPackage.DA__FC:
                return isSetFc();
            case SclPackage.DA__QCHG:
                return isSetQchg();
            case SclPackage.DA__REFERS_TO_DA_TYPE:
                return isSetRefersToDAType();
            case SclPackage.DA__DO_TYPE:
                return getDOType() != null;
            case SclPackage.DA__PROT_NS:
                return isSetProtNs();
        }
        return super.eIsSet(featureID);
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
        result.append(", fc: ");
        if (fcESet) result.append(fc); else result.append("<unset>");
        result.append(", qchg: ");
        if (qchgESet) result.append(qchg); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doResolveLinks() {
        // see Issue #13
        super.doResolveLinks();
        
        // desc                 Some descriptive text for the attribute
        // name                 The attribute name; the type tAttributeEnum restricts to the attribute names from IEC 61850-7-3, plus new ones starting with lower case letters
        // fc                   The functional constraint for this attribute; fc=SE always also implies fc=SG; fc=SG means that the values are visible, but not editable
        // dchg, qchg, dupd     Defines which trigger options are supported by the attribute (value true means supported)
        // sAddr                an optional short address of this DO attribute
        // bType                The basic type of the attribute, taken from tBasicTypeEnum
        // type                 Only used if bType= Enum or bType = Struct to refer to the appropriate enumeration type or DAType (attribute structure) definition
        // count                Optional. Shall state the number of array elements or reference the attribute stating this number in case that this attribute is an array.
        //                      A referenced attribute shall exist in the same type definition. The default value 0 states that the attribute is no array.
        // valKind              Determines how the value shall be interpreted if any is given

        if( getType() == null ) return;
        DataTypeTemplates dtt = get_DataTypeTemplates();
        if( dtt == null ) return;

        // TODO: put in AbstractDataType

        if( "Enum".equals( getBType() ) ) {

            // find an EnumType with
            //   EnumType.id == DA.type
            SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseEnumType( EnumType object ) {
                    return getType().equals( object.getId() );
                }

                @Override
                public Boolean defaultCase( EObject object ) {
                    return false;
                }

            };

            List< EnumType > res = shallowSearchObjects( dtt.getEnumType(), s );
            String mess = "EnumType( id = " + getType() + " ) for DA on line " + getLineNumber() + " )";
            if( res.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess );
                return;
            }
            if( res.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess );
                return;
            }
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setRefersToEnumType( res.get( 0 ) );
        }
        else if( "Struct".equals( getBType() ) ) {

            // find an DAType with
            //   DAType.id == DA.type
            SclSwitch< Boolean > s = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseDAType( DAType object ) {
                    return getType().equals( object.getId() );
                }

                @Override
                public Boolean defaultCase( EObject object ) {
                    return false;
                }

            };

            List< DAType > res = shallowSearchObjects( dtt.getDAType(), s );
            String mess = "DAType( id = " + getType() + " ) for DA on line " + getLineNumber() + " )";
            if( res.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess );
                return;
            }
            if( res.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess );
                return;
            }
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setRefersToDAType( res.get( 0 ) );
        }
    }

} //DAImpl
