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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSE Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl#getAppID <em>App ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl#getFixedOffs <em>Fixed Offs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl#getSecurityEnable <em>Security Enable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl#getParentLN0 <em>Parent LN0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSEControlImpl extends ControlWithIEDNameImpl implements GSEControl {
    /**
     * The default value of the '{@link #getAppID() <em>App ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppID()
     * @generated
     * @ordered
     */
    protected static final String APP_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAppID() <em>App ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppID()
     * @generated
     * @ordered
     */
    protected String appID = APP_ID_EDEFAULT;

    /**
     * This is true if the App ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean appIDESet;

    /**
     * The default value of the '{@link #getFixedOffs() <em>Fixed Offs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFixedOffs()
     * @generated
     * @ordered
     */
    protected static final Boolean FIXED_OFFS_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getFixedOffs() <em>Fixed Offs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFixedOffs()
     * @generated
     * @ordered
     */
    protected Boolean fixedOffs = FIXED_OFFS_EDEFAULT;

    /**
     * This is true if the Fixed Offs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fixedOffsESet;

    /**
     * The default value of the '{@link #getSecurityEnable() <em>Security Enable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityEnable()
     * @generated
     * @ordered
     */
    protected static final PredefinedTypeOfSecurityEnum SECURITY_ENABLE_EDEFAULT = PredefinedTypeOfSecurityEnum.NONE;

    /**
     * The cached value of the '{@link #getSecurityEnable() <em>Security Enable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecurityEnable()
     * @generated
     * @ordered
     */
    protected PredefinedTypeOfSecurityEnum securityEnable = SECURITY_ENABLE_EDEFAULT;

    /**
     * This is true if the Security Enable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean securityEnableESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final GSEControlTypeEnum TYPE_EDEFAULT = GSEControlTypeEnum.GOOSE;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected GSEControlTypeEnum type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GSEControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getGSEControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAppID() {
        return appID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAppID( String newAppID ) {
        String oldAppID = appID;
        appID = newAppID;
        boolean oldAppIDESet = appIDESet;
        appIDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_CONTROL__APP_ID, oldAppID, appID, !oldAppIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAppID() {
        String oldAppID = appID;
        boolean oldAppIDESet = appIDESet;
        appID = APP_ID_EDEFAULT;
        appIDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GSE_CONTROL__APP_ID, oldAppID, APP_ID_EDEFAULT, oldAppIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAppID() {
        return appIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getFixedOffs() {
        return fixedOffs;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFixedOffs( Boolean newFixedOffs ) {
        Boolean oldFixedOffs = fixedOffs;
        fixedOffs = newFixedOffs;
        boolean oldFixedOffsESet = fixedOffsESet;
        fixedOffsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_CONTROL__FIXED_OFFS, oldFixedOffs, fixedOffs, !oldFixedOffsESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFixedOffs() {
        Boolean oldFixedOffs = fixedOffs;
        boolean oldFixedOffsESet = fixedOffsESet;
        fixedOffs = FIXED_OFFS_EDEFAULT;
        fixedOffsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GSE_CONTROL__FIXED_OFFS, oldFixedOffs, FIXED_OFFS_EDEFAULT, oldFixedOffsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFixedOffs() {
        return fixedOffsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PredefinedTypeOfSecurityEnum getSecurityEnable() {
        return securityEnable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSecurityEnable( PredefinedTypeOfSecurityEnum newSecurityEnable ) {
        PredefinedTypeOfSecurityEnum oldSecurityEnable = securityEnable;
        securityEnable = newSecurityEnable == null ? SECURITY_ENABLE_EDEFAULT : newSecurityEnable;
        boolean oldSecurityEnableESet = securityEnableESet;
        securityEnableESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_CONTROL__SECURITY_ENABLE, oldSecurityEnable, securityEnable, !oldSecurityEnableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSecurityEnable() {
        PredefinedTypeOfSecurityEnum oldSecurityEnable = securityEnable;
        boolean oldSecurityEnableESet = securityEnableESet;
        securityEnable = SECURITY_ENABLE_EDEFAULT;
        securityEnableESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GSE_CONTROL__SECURITY_ENABLE, oldSecurityEnable, SECURITY_ENABLE_EDEFAULT, oldSecurityEnableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecurityEnable() {
        return securityEnableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GSEControlTypeEnum getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( GSEControlTypeEnum newType ) {
        GSEControlTypeEnum oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_CONTROL__TYPE, oldType, type, !oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        GSEControlTypeEnum oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.GSE_CONTROL__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LN0 getParentLN0() {
        if (eContainerFeatureID() != SclPackage.GSE_CONTROL__PARENT_LN0) return null;
        return (LN0)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLN0(LN0 newParentLN0, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentLN0, SclPackage.GSE_CONTROL__PARENT_LN0, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLN0(LN0 newParentLN0) {
        if (newParentLN0 != eInternalContainer() || (eContainerFeatureID() != SclPackage.GSE_CONTROL__PARENT_LN0 && newParentLN0 != null)) {
            if (EcoreUtil.isAncestor(this, newParentLN0))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentLN0 != null)
                msgs = ((InternalEObject)newParentLN0).eInverseAdd(this, SclPackage.LN0__GSE_CONTROL, LN0.class, msgs);
            msgs = basicSetParentLN0(newParentLN0, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.GSE_CONTROL__PARENT_LN0, newParentLN0, newParentLN0));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.GSE_CONTROL__PARENT_LN0:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentLN0((LN0)otherEnd, msgs);
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
            case SclPackage.GSE_CONTROL__PARENT_LN0:
                return basicSetParentLN0(null, msgs);
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
            case SclPackage.GSE_CONTROL__PARENT_LN0:
                return eInternalContainer().eInverseRemove(this, SclPackage.LN0__GSE_CONTROL, LN0.class, msgs);
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
            case SclPackage.GSE_CONTROL__APP_ID:
                return getAppID();
            case SclPackage.GSE_CONTROL__FIXED_OFFS:
                return getFixedOffs();
            case SclPackage.GSE_CONTROL__SECURITY_ENABLE:
                return getSecurityEnable();
            case SclPackage.GSE_CONTROL__TYPE:
                return getType();
            case SclPackage.GSE_CONTROL__PARENT_LN0:
                return getParentLN0();
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
            case SclPackage.GSE_CONTROL__APP_ID:
                setAppID((String)newValue);
                return;
            case SclPackage.GSE_CONTROL__FIXED_OFFS:
                setFixedOffs((Boolean)newValue);
                return;
            case SclPackage.GSE_CONTROL__SECURITY_ENABLE:
                setSecurityEnable((PredefinedTypeOfSecurityEnum)newValue);
                return;
            case SclPackage.GSE_CONTROL__TYPE:
                setType((GSEControlTypeEnum)newValue);
                return;
            case SclPackage.GSE_CONTROL__PARENT_LN0:
                setParentLN0((LN0)newValue);
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
            case SclPackage.GSE_CONTROL__APP_ID:
                unsetAppID();
                return;
            case SclPackage.GSE_CONTROL__FIXED_OFFS:
                unsetFixedOffs();
                return;
            case SclPackage.GSE_CONTROL__SECURITY_ENABLE:
                unsetSecurityEnable();
                return;
            case SclPackage.GSE_CONTROL__TYPE:
                unsetType();
                return;
            case SclPackage.GSE_CONTROL__PARENT_LN0:
                setParentLN0((LN0)null);
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
            case SclPackage.GSE_CONTROL__APP_ID:
                return isSetAppID();
            case SclPackage.GSE_CONTROL__FIXED_OFFS:
                return isSetFixedOffs();
            case SclPackage.GSE_CONTROL__SECURITY_ENABLE:
                return isSetSecurityEnable();
            case SclPackage.GSE_CONTROL__TYPE:
                return isSetType();
            case SclPackage.GSE_CONTROL__PARENT_LN0:
                return getParentLN0() != null;
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
        result.append(" (appID: ");
        if (appIDESet) result.append(appID); else result.append("<unset>");
        result.append(", fixedOffs: ");
        if (fixedOffsESet) result.append(fixedOffs); else result.append("<unset>");
        result.append(", securityEnable: ");
        if (securityEnableESet) result.append(securityEnable); else result.append("<unset>");
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    public AnyLN getParentAnyLN() {
        return getParentLN0();
    }

} //GSEControlImpl
