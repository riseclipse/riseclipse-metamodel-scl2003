/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conf SG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfSGImpl#getResvTms <em>Resv Tms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfSGImpl#getParentSettingGroups <em>Parent Setting Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfSGImpl extends SclObjectImpl implements ConfSG {
    /**
     * The default value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResvTms()
     * @generated
     * @ordered
     */
    protected static final Boolean RESV_TMS_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getResvTms() <em>Resv Tms</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResvTms()
     * @generated
     * @ordered
     */
    protected Boolean resvTms = RESV_TMS_EDEFAULT;

    /**
     * This is true if the Resv Tms attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean resvTmsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfSGImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getConfSG();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getResvTms() {
        return resvTms;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResvTms( Boolean newResvTms ) {
        Boolean oldResvTms = resvTms;
        resvTms = newResvTms;
        boolean oldResvTmsESet = resvTmsESet;
        resvTmsESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONF_SG__RESV_TMS, oldResvTms, resvTms,
                    !oldResvTmsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetResvTms() {
        Boolean oldResvTms = resvTms;
        boolean oldResvTmsESet = resvTmsESet;
        resvTms = RESV_TMS_EDEFAULT;
        resvTmsESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.CONF_SG__RESV_TMS, oldResvTms,
                    RESV_TMS_EDEFAULT, oldResvTmsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetResvTms() {
        return resvTmsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SettingGroups getParentSettingGroups() {
        if( eContainerFeatureID() != SclPackage.CONF_SG__PARENT_SETTING_GROUPS ) {
            return null;
        }
        return ( SettingGroups ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSettingGroups( SettingGroups newParentSettingGroups,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSettingGroups,
                SclPackage.CONF_SG__PARENT_SETTING_GROUPS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSettingGroups( SettingGroups newParentSettingGroups ) {
        if( newParentSettingGroups != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.CONF_SG__PARENT_SETTING_GROUPS
                        && newParentSettingGroups != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSettingGroups ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSettingGroups != null ) {
                msgs = ( ( InternalEObject ) newParentSettingGroups ).eInverseAdd( this,
                        SclPackage.SETTING_GROUPS__CONF_SG, SettingGroups.class, msgs );
            }
            msgs = basicSetParentSettingGroups( newParentSettingGroups, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.CONF_SG__PARENT_SETTING_GROUPS,
                    newParentSettingGroups, newParentSettingGroups ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.CONF_SG__PARENT_SETTING_GROUPS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSettingGroups( ( SettingGroups ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.CONF_SG__PARENT_SETTING_GROUPS:
            return basicSetParentSettingGroups( null, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch( eContainerFeatureID() ) {
        case SclPackage.CONF_SG__PARENT_SETTING_GROUPS:
            return eInternalContainer().eInverseRemove( this, SclPackage.SETTING_GROUPS__CONF_SG, SettingGroups.class,
                    msgs );
        }
        return super.eBasicRemoveFromContainerFeature( msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.CONF_SG__RESV_TMS:
            return getResvTms();
        case SclPackage.CONF_SG__PARENT_SETTING_GROUPS:
            return getParentSettingGroups();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case SclPackage.CONF_SG__RESV_TMS:
            setResvTms( ( Boolean ) newValue );
            return;
        case SclPackage.CONF_SG__PARENT_SETTING_GROUPS:
            setParentSettingGroups( ( SettingGroups ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case SclPackage.CONF_SG__RESV_TMS:
            unsetResvTms();
            return;
        case SclPackage.CONF_SG__PARENT_SETTING_GROUPS:
            setParentSettingGroups( ( SettingGroups ) null );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case SclPackage.CONF_SG__RESV_TMS:
            return isSetResvTms();
        case SclPackage.CONF_SG__PARENT_SETTING_GROUPS:
            return getParentSettingGroups() != null;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (resvTms: " );
        if( resvTmsESet ) {
            result.append( resvTms );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        return getParentSettingGroups().getXpath() + "/scl:ConfSG";
    }

} //ConfSGImpl
