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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.MaxTime;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.MinTime;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEImpl#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEImpl#getMaxTime <em>Max Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEImpl#getParentConnectedAP <em>Parent Connected AP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSEImpl extends ControlBlockImpl implements GSE {
    /**
     * The cached value of the '{@link #getMinTime() <em>Min Time</em>}' containment reference.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #getMinTime()
     * @generated
     * @ordered
     */
    protected MinTime minTime;

    /**
     * This is true if the Min Time containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minTimeESet;

    /**
     * The cached value of the '{@link #getMaxTime() <em>Max Time</em>}' containment reference.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #getMaxTime()
     * @generated
     * @ordered
     */
    protected MaxTime maxTime;

    /**
     * This is true if the Max Time containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxTimeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GSEImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getGSE();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MaxTime getMaxTime() {
        return maxTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMaxTime( MaxTime newMaxTime, NotificationChain msgs ) {
        MaxTime oldMaxTime = maxTime;
        maxTime = newMaxTime;
        boolean oldMaxTimeESet = maxTimeESet;
        maxTimeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, SclPackage.GSE__MAX_TIME,
                    oldMaxTime, newMaxTime, !oldMaxTimeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxTime( MaxTime newMaxTime ) {
        if( newMaxTime != maxTime ) {
            NotificationChain msgs = null;
            if( maxTime != null ) {
                msgs = ( ( InternalEObject ) maxTime ).eInverseRemove( this, SclPackage.MAX_TIME__PARENT_GSE,
                        MaxTime.class, msgs );
            }
            if( newMaxTime != null ) {
                msgs = ( ( InternalEObject ) newMaxTime ).eInverseAdd( this, SclPackage.MAX_TIME__PARENT_GSE,
                        MaxTime.class, msgs );
            }
            msgs = basicSetMaxTime( newMaxTime, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldMaxTimeESet = maxTimeESet;
            maxTimeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.GSE__MAX_TIME, newMaxTime,
                        newMaxTime, !oldMaxTimeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMaxTime( NotificationChain msgs ) {
        MaxTime oldMaxTime = maxTime;
        maxTime = null;
        boolean oldMaxTimeESet = maxTimeESet;
        maxTimeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, SclPackage.GSE__MAX_TIME,
                    oldMaxTime, null, oldMaxTimeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxTime() {
        if( maxTime != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) maxTime ).eInverseRemove( this, SclPackage.MAX_TIME__PARENT_GSE, MaxTime.class,
                    msgs );
            msgs = basicUnsetMaxTime( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldMaxTimeESet = maxTimeESet;
            maxTimeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.GSE__MAX_TIME, null, null,
                        oldMaxTimeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxTime() {
        return maxTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectedAP getParentConnectedAP() {
        if( eContainerFeatureID() != SclPackage.GSE__PARENT_CONNECTED_AP ) {
            return null;
        }
        return ( ConnectedAP ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentConnectedAP( ConnectedAP newParentConnectedAP, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentConnectedAP, SclPackage.GSE__PARENT_CONNECTED_AP,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentConnectedAP( ConnectedAP newParentConnectedAP ) {
        if( newParentConnectedAP != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.GSE__PARENT_CONNECTED_AP && newParentConnectedAP != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentConnectedAP ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentConnectedAP != null ) {
                msgs = ( ( InternalEObject ) newParentConnectedAP ).eInverseAdd( this, SclPackage.CONNECTED_AP__GSE,
                        ConnectedAP.class, msgs );
            }
            msgs = basicSetParentConnectedAP( newParentConnectedAP, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.GSE__PARENT_CONNECTED_AP,
                    newParentConnectedAP, newParentConnectedAP ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MinTime getMinTime() {
        return minTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMinTime( MinTime newMinTime, NotificationChain msgs ) {
        MinTime oldMinTime = minTime;
        minTime = newMinTime;
        boolean oldMinTimeESet = minTimeESet;
        minTimeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, SclPackage.GSE__MIN_TIME,
                    oldMinTime, newMinTime, !oldMinTimeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinTime( MinTime newMinTime ) {
        if( newMinTime != minTime ) {
            NotificationChain msgs = null;
            if( minTime != null ) {
                msgs = ( ( InternalEObject ) minTime ).eInverseRemove( this, SclPackage.MIN_TIME__PARENT_GSE,
                        MinTime.class, msgs );
            }
            if( newMinTime != null ) {
                msgs = ( ( InternalEObject ) newMinTime ).eInverseAdd( this, SclPackage.MIN_TIME__PARENT_GSE,
                        MinTime.class, msgs );
            }
            msgs = basicSetMinTime( newMinTime, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldMinTimeESet = minTimeESet;
            minTimeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.GSE__MIN_TIME, newMinTime,
                        newMinTime, !oldMinTimeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMinTime( NotificationChain msgs ) {
        MinTime oldMinTime = minTime;
        minTime = null;
        boolean oldMinTimeESet = minTimeESet;
        minTimeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, SclPackage.GSE__MIN_TIME,
                    oldMinTime, null, oldMinTimeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinTime() {
        if( minTime != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) minTime ).eInverseRemove( this, SclPackage.MIN_TIME__PARENT_GSE, MinTime.class,
                    msgs );
            msgs = basicUnsetMinTime( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldMinTimeESet = minTimeESet;
            minTimeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.GSE__MIN_TIME, null, null,
                        oldMinTimeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinTime() {
        return minTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.GSE__MIN_TIME:
            if( minTime != null ) {
                msgs = ( ( InternalEObject ) minTime ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.GSE__MIN_TIME, null, msgs );
            }
            return basicSetMinTime( ( MinTime ) otherEnd, msgs );
        case SclPackage.GSE__MAX_TIME:
            if( maxTime != null ) {
                msgs = ( ( InternalEObject ) maxTime ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - SclPackage.GSE__MAX_TIME, null, msgs );
            }
            return basicSetMaxTime( ( MaxTime ) otherEnd, msgs );
        case SclPackage.GSE__PARENT_CONNECTED_AP:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentConnectedAP( ( ConnectedAP ) otherEnd, msgs );
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
        case SclPackage.GSE__MIN_TIME:
            return basicUnsetMinTime( msgs );
        case SclPackage.GSE__MAX_TIME:
            return basicUnsetMaxTime( msgs );
        case SclPackage.GSE__PARENT_CONNECTED_AP:
            return basicSetParentConnectedAP( null, msgs );
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
        case SclPackage.GSE__PARENT_CONNECTED_AP:
            return eInternalContainer().eInverseRemove( this, SclPackage.CONNECTED_AP__GSE, ConnectedAP.class, msgs );
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
        case SclPackage.GSE__MIN_TIME:
            return getMinTime();
        case SclPackage.GSE__MAX_TIME:
            return getMaxTime();
        case SclPackage.GSE__PARENT_CONNECTED_AP:
            return getParentConnectedAP();
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
        case SclPackage.GSE__MIN_TIME:
            setMinTime( ( MinTime ) newValue );
            return;
        case SclPackage.GSE__MAX_TIME:
            setMaxTime( ( MaxTime ) newValue );
            return;
        case SclPackage.GSE__PARENT_CONNECTED_AP:
            setParentConnectedAP( ( ConnectedAP ) newValue );
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
        case SclPackage.GSE__MIN_TIME:
            unsetMinTime();
            return;
        case SclPackage.GSE__MAX_TIME:
            unsetMaxTime();
            return;
        case SclPackage.GSE__PARENT_CONNECTED_AP:
            setParentConnectedAP( ( ConnectedAP ) null );
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
        case SclPackage.GSE__MIN_TIME:
            return isSetMinTime();
        case SclPackage.GSE__MAX_TIME:
            return isSetMaxTime();
        case SclPackage.GSE__PARENT_CONNECTED_AP:
            return getParentConnectedAP() != null;
        }
        return super.eIsSet( featureID );
    }

    @Override
    public String getXpath() {
        return getParentConnectedAP().getXpath() + "/scl:GSE[@ldInst='" + getLdInst() + "'][@cbName='" + getCbName()
                + "']";
    }

} //GSEImpl
