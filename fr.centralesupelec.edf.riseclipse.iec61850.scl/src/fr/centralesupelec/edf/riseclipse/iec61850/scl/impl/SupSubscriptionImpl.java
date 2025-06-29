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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sup Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SupSubscriptionImpl#getMaxGo <em>Max Go</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SupSubscriptionImpl#getMaxSv <em>Max Sv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SupSubscriptionImpl#getParentServices <em>Parent Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupSubscriptionImpl extends SclObjectImpl implements SupSubscription {
    /**
     * The default value of the '{@link #getMaxGo() <em>Max Go</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxGo()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_GO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxGo() <em>Max Go</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxGo()
     * @generated
     * @ordered
     */
    protected Integer maxGo = MAX_GO_EDEFAULT;

    /**
     * This is true if the Max Go attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxGoESet;

    /**
     * The default value of the '{@link #getMaxSv() <em>Max Sv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxSv()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_SV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxSv() <em>Max Sv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxSv()
     * @generated
     * @ordered
     */
    protected Integer maxSv = MAX_SV_EDEFAULT;

    /**
     * This is true if the Max Sv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxSvESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SupSubscriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSupSubscription();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMaxGo() {
        return maxGo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxGo( Integer newMaxGo ) {
        Integer oldMaxGo = maxGo;
        maxGo = newMaxGo;
        boolean oldMaxGoESet = maxGoESet;
        maxGoESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUP_SUBSCRIPTION__MAX_GO, oldMaxGo,
                    maxGo, !oldMaxGoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxGo() {
        Integer oldMaxGo = maxGo;
        boolean oldMaxGoESet = maxGoESet;
        maxGo = MAX_GO_EDEFAULT;
        maxGoESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SUP_SUBSCRIPTION__MAX_GO, oldMaxGo,
                    MAX_GO_EDEFAULT, oldMaxGoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxGo() {
        return maxGoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMaxSv() {
        return maxSv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxSv( Integer newMaxSv ) {
        Integer oldMaxSv = maxSv;
        maxSv = newMaxSv;
        boolean oldMaxSvESet = maxSvESet;
        maxSvESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUP_SUBSCRIPTION__MAX_SV, oldMaxSv,
                    maxSv, !oldMaxSvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxSv() {
        Integer oldMaxSv = maxSv;
        boolean oldMaxSvESet = maxSvESet;
        maxSv = MAX_SV_EDEFAULT;
        maxSvESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SUP_SUBSCRIPTION__MAX_SV, oldMaxSv,
                    MAX_SV_EDEFAULT, oldMaxSvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxSv() {
        return maxSvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getParentServices() {
        if( eContainerFeatureID() != SclPackage.SUP_SUBSCRIPTION__PARENT_SERVICES ) return null;
        return ( Services ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServices( Services newParentServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServices, SclPackage.SUP_SUBSCRIPTION__PARENT_SERVICES,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentServices( Services newParentServices ) {
        if( newParentServices != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SUP_SUBSCRIPTION__PARENT_SERVICES
                        && newParentServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServices ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentServices != null )
                msgs = ( ( InternalEObject ) newParentServices ).eInverseAdd( this,
                        SclPackage.SERVICES__SUP_SUBSCRIPTION, Services.class, msgs );
            msgs = basicSetParentServices( newParentServices, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SUP_SUBSCRIPTION__PARENT_SERVICES,
                    newParentServices, newParentServices ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.SUP_SUBSCRIPTION__PARENT_SERVICES:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentServices( ( Services ) otherEnd, msgs );
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
        case SclPackage.SUP_SUBSCRIPTION__PARENT_SERVICES:
            return basicSetParentServices( null, msgs );
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
        case SclPackage.SUP_SUBSCRIPTION__PARENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVICES__SUP_SUBSCRIPTION, Services.class,
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
        case SclPackage.SUP_SUBSCRIPTION__MAX_GO:
            return getMaxGo();
        case SclPackage.SUP_SUBSCRIPTION__MAX_SV:
            return getMaxSv();
        case SclPackage.SUP_SUBSCRIPTION__PARENT_SERVICES:
            return getParentServices();
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
        case SclPackage.SUP_SUBSCRIPTION__MAX_GO:
            setMaxGo( ( Integer ) newValue );
            return;
        case SclPackage.SUP_SUBSCRIPTION__MAX_SV:
            setMaxSv( ( Integer ) newValue );
            return;
        case SclPackage.SUP_SUBSCRIPTION__PARENT_SERVICES:
            setParentServices( ( Services ) newValue );
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
        case SclPackage.SUP_SUBSCRIPTION__MAX_GO:
            unsetMaxGo();
            return;
        case SclPackage.SUP_SUBSCRIPTION__MAX_SV:
            unsetMaxSv();
            return;
        case SclPackage.SUP_SUBSCRIPTION__PARENT_SERVICES:
            setParentServices( ( Services ) null );
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
        case SclPackage.SUP_SUBSCRIPTION__MAX_GO:
            return isSetMaxGo();
        case SclPackage.SUP_SUBSCRIPTION__MAX_SV:
            return isSetMaxSv();
        case SclPackage.SUP_SUBSCRIPTION__PARENT_SERVICES:
            return getParentServices() != null;
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
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (maxGo: " );
        if( maxGoESet )
            result.append( maxGo );
        else
            result.append( "<unset>" );
        result.append( ", maxSv: " );
        if( maxSvESet )
            result.append( maxSv );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        return getParentServices().getXpath() + "/scl:SupSubscription";
    }

} //SupSubscriptionImpl
