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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVDeliveryEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SM Vsc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVscImpl#getDelivery <em>Delivery</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVscImpl#getDeliveryConf <em>Delivery Conf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVscImpl#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVscImpl#getSv <em>Sv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVscImpl#getRSV <em>RSV</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMVscImpl extends ServiceWithMaxImpl implements SMVsc {
    /**
     * The default value of the '{@link #getDelivery() <em>Delivery</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelivery()
     * @generated
     * @ordered
     */
    protected static final SMVDeliveryEnum DELIVERY_EDEFAULT = SMVDeliveryEnum.MULTICAST;

    /**
     * The cached value of the '{@link #getDelivery() <em>Delivery</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelivery()
     * @generated
     * @ordered
     */
    protected SMVDeliveryEnum delivery = DELIVERY_EDEFAULT;

    /**
     * This is true if the Delivery attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deliveryESet;

    /**
     * The default value of the '{@link #getDeliveryConf() <em>Delivery Conf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeliveryConf()
     * @generated
     * @ordered
     */
    protected static final Boolean DELIVERY_CONF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDeliveryConf() <em>Delivery Conf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeliveryConf()
     * @generated
     * @ordered
     */
    protected Boolean deliveryConf = DELIVERY_CONF_EDEFAULT;

    /**
     * This is true if the Delivery Conf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deliveryConfESet;

    /**
     * The default value of the '{@link #getSv() <em>Sv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSv()
     * @generated
     * @ordered
     */
    protected static final Boolean SV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSv() <em>Sv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSv()
     * @generated
     * @ordered
     */
    protected Boolean sv = SV_EDEFAULT;

    /**
     * This is true if the Sv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svESet;

    /**
     * The default value of the '{@link #getRSV() <em>RSV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRSV()
     * @generated
     * @ordered
     */
    protected static final Boolean RSV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRSV() <em>RSV</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRSV()
     * @generated
     * @ordered
     */
    protected Boolean rSV = RSV_EDEFAULT;

    /**
     * This is true if the RSV attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rSVESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SMVscImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSMVsc();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVDeliveryEnum getDelivery() {
        return delivery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDelivery( SMVDeliveryEnum newDelivery ) {
        SMVDeliveryEnum oldDelivery = delivery;
        delivery = newDelivery == null ? DELIVERY_EDEFAULT : newDelivery;
        boolean oldDeliveryESet = deliveryESet;
        deliveryESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SM_VSC__DELIVERY, oldDelivery, delivery,
                    !oldDeliveryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDelivery() {
        SMVDeliveryEnum oldDelivery = delivery;
        boolean oldDeliveryESet = deliveryESet;
        delivery = DELIVERY_EDEFAULT;
        deliveryESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SM_VSC__DELIVERY, oldDelivery,
                    DELIVERY_EDEFAULT, oldDeliveryESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDelivery() {
        return deliveryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getDeliveryConf() {
        return deliveryConf;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDeliveryConf( Boolean newDeliveryConf ) {
        Boolean oldDeliveryConf = deliveryConf;
        deliveryConf = newDeliveryConf;
        boolean oldDeliveryConfESet = deliveryConfESet;
        deliveryConfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SM_VSC__DELIVERY_CONF, oldDeliveryConf,
                    deliveryConf, !oldDeliveryConfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDeliveryConf() {
        Boolean oldDeliveryConf = deliveryConf;
        boolean oldDeliveryConfESet = deliveryConfESet;
        deliveryConf = DELIVERY_CONF_EDEFAULT;
        deliveryConfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SM_VSC__DELIVERY_CONF, oldDeliveryConf,
                    DELIVERY_CONF_EDEFAULT, oldDeliveryConfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDeliveryConf() {
        return deliveryConfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getParentServices() {
        if( eContainerFeatureID() != SclPackage.SM_VSC__PARENT_SERVICES ) return null;
        return ( Services ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServices( Services newParentServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServices, SclPackage.SM_VSC__PARENT_SERVICES, msgs );
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
                || ( eContainerFeatureID() != SclPackage.SM_VSC__PARENT_SERVICES && newParentServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServices ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentServices != null )
                msgs = ( ( InternalEObject ) newParentServices ).eInverseAdd( this, SclPackage.SERVICES__SM_VSC,
                        Services.class, msgs );
            msgs = basicSetParentServices( newParentServices, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SM_VSC__PARENT_SERVICES,
                    newParentServices, newParentServices ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSv() {
        return sv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSv( Boolean newSv ) {
        Boolean oldSv = sv;
        sv = newSv;
        boolean oldSvESet = svESet;
        svESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SM_VSC__SV, oldSv, sv, !oldSvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSv() {
        Boolean oldSv = sv;
        boolean oldSvESet = svESet;
        sv = SV_EDEFAULT;
        svESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SM_VSC__SV, oldSv, SV_EDEFAULT,
                    oldSvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSv() {
        return svESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRSV() {
        return rSV;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRSV( Boolean newRSV ) {
        Boolean oldRSV = rSV;
        rSV = newRSV;
        boolean oldRSVESet = rSVESet;
        rSVESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SM_VSC__RSV, oldRSV, rSV,
                    !oldRSVESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRSV() {
        Boolean oldRSV = rSV;
        boolean oldRSVESet = rSVESet;
        rSV = RSV_EDEFAULT;
        rSVESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SM_VSC__RSV, oldRSV, RSV_EDEFAULT,
                    oldRSVESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRSV() {
        return rSVESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.SM_VSC__PARENT_SERVICES:
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
        case SclPackage.SM_VSC__PARENT_SERVICES:
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
        case SclPackage.SM_VSC__PARENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVICES__SM_VSC, Services.class, msgs );
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
        case SclPackage.SM_VSC__DELIVERY:
            return getDelivery();
        case SclPackage.SM_VSC__DELIVERY_CONF:
            return getDeliveryConf();
        case SclPackage.SM_VSC__PARENT_SERVICES:
            return getParentServices();
        case SclPackage.SM_VSC__SV:
            return getSv();
        case SclPackage.SM_VSC__RSV:
            return getRSV();
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
        case SclPackage.SM_VSC__DELIVERY:
            setDelivery( ( SMVDeliveryEnum ) newValue );
            return;
        case SclPackage.SM_VSC__DELIVERY_CONF:
            setDeliveryConf( ( Boolean ) newValue );
            return;
        case SclPackage.SM_VSC__PARENT_SERVICES:
            setParentServices( ( Services ) newValue );
            return;
        case SclPackage.SM_VSC__SV:
            setSv( ( Boolean ) newValue );
            return;
        case SclPackage.SM_VSC__RSV:
            setRSV( ( Boolean ) newValue );
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
        case SclPackage.SM_VSC__DELIVERY:
            unsetDelivery();
            return;
        case SclPackage.SM_VSC__DELIVERY_CONF:
            unsetDeliveryConf();
            return;
        case SclPackage.SM_VSC__PARENT_SERVICES:
            setParentServices( ( Services ) null );
            return;
        case SclPackage.SM_VSC__SV:
            unsetSv();
            return;
        case SclPackage.SM_VSC__RSV:
            unsetRSV();
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
        case SclPackage.SM_VSC__DELIVERY:
            return isSetDelivery();
        case SclPackage.SM_VSC__DELIVERY_CONF:
            return isSetDeliveryConf();
        case SclPackage.SM_VSC__PARENT_SERVICES:
            return getParentServices() != null;
        case SclPackage.SM_VSC__SV:
            return isSetSv();
        case SclPackage.SM_VSC__RSV:
            return isSetRSV();
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
        result.append( " (delivery: " );
        if( deliveryESet )
            result.append( delivery );
        else
            result.append( "<unset>" );
        result.append( ", deliveryConf: " );
        if( deliveryConfESet )
            result.append( deliveryConf );
        else
            result.append( "<unset>" );
        result.append( ", sv: " );
        if( svESet )
            result.append( sv );
        else
            result.append( "<unset>" );
        result.append( ", rSV: " );
        if( rSVESet )
            result.append( rSV );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SMVscImpl
