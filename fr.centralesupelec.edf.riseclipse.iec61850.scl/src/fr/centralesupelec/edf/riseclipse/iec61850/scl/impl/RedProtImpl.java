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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Red Prot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.RedProtImpl#getHsr <em>Hsr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.RedProtImpl#getPrp <em>Prp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.RedProtImpl#getRstp <em>Rstp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.RedProtImpl#getParentServices <em>Parent Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedProtImpl extends SclObjectImpl implements RedProt {
    /**
     * The default value of the '{@link #getHsr() <em>Hsr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHsr()
     * @generated
     * @ordered
     */
    protected static final Boolean HSR_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getHsr() <em>Hsr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHsr()
     * @generated
     * @ordered
     */
    protected Boolean hsr = HSR_EDEFAULT;

    /**
     * This is true if the Hsr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hsrESet;

    /**
     * The default value of the '{@link #getPrp() <em>Prp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrp()
     * @generated
     * @ordered
     */
    protected static final Boolean PRP_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getPrp() <em>Prp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrp()
     * @generated
     * @ordered
     */
    protected Boolean prp = PRP_EDEFAULT;

    /**
     * This is true if the Prp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean prpESet;

    /**
     * The default value of the '{@link #getRstp() <em>Rstp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRstp()
     * @generated
     * @ordered
     */
    protected static final Boolean RSTP_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getRstp() <em>Rstp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRstp()
     * @generated
     * @ordered
     */
    protected Boolean rstp = RSTP_EDEFAULT;

    /**
     * This is true if the Rstp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rstpESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RedProtImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getRedProt();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getHsr() {
        return hsr;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHsr( Boolean newHsr ) {
        Boolean oldHsr = hsr;
        hsr = newHsr;
        boolean oldHsrESet = hsrESet;
        hsrESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.RED_PROT__HSR, oldHsr, hsr,
                    !oldHsrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHsr() {
        Boolean oldHsr = hsr;
        boolean oldHsrESet = hsrESet;
        hsr = HSR_EDEFAULT;
        hsrESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.RED_PROT__HSR, oldHsr, HSR_EDEFAULT,
                    oldHsrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHsr() {
        return hsrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPrp() {
        return prp;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrp( Boolean newPrp ) {
        Boolean oldPrp = prp;
        prp = newPrp;
        boolean oldPrpESet = prpESet;
        prpESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.RED_PROT__PRP, oldPrp, prp,
                    !oldPrpESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrp() {
        Boolean oldPrp = prp;
        boolean oldPrpESet = prpESet;
        prp = PRP_EDEFAULT;
        prpESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.RED_PROT__PRP, oldPrp, PRP_EDEFAULT,
                    oldPrpESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrp() {
        return prpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRstp() {
        return rstp;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRstp( Boolean newRstp ) {
        Boolean oldRstp = rstp;
        rstp = newRstp;
        boolean oldRstpESet = rstpESet;
        rstpESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.RED_PROT__RSTP, oldRstp, rstp,
                    !oldRstpESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRstp() {
        Boolean oldRstp = rstp;
        boolean oldRstpESet = rstpESet;
        rstp = RSTP_EDEFAULT;
        rstpESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.RED_PROT__RSTP, oldRstp, RSTP_EDEFAULT,
                    oldRstpESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRstp() {
        return rstpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getParentServices() {
        if( eContainerFeatureID() != SclPackage.RED_PROT__PARENT_SERVICES ) {
            return null;
        }
        return ( Services ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentServices( Services newParentServices, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServices, SclPackage.RED_PROT__PARENT_SERVICES, msgs );
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
                || ( eContainerFeatureID() != SclPackage.RED_PROT__PARENT_SERVICES && newParentServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServices ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServices != null ) {
                msgs = ( ( InternalEObject ) newParentServices ).eInverseAdd( this, SclPackage.SERVICES__RED_PROT,
                        Services.class, msgs );
            }
            msgs = basicSetParentServices( newParentServices, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.RED_PROT__PARENT_SERVICES,
                    newParentServices, newParentServices ) );
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
        case SclPackage.RED_PROT__PARENT_SERVICES:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
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
        case SclPackage.RED_PROT__PARENT_SERVICES:
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
        case SclPackage.RED_PROT__PARENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVICES__RED_PROT, Services.class, msgs );
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
        case SclPackage.RED_PROT__HSR:
            return getHsr();
        case SclPackage.RED_PROT__PRP:
            return getPrp();
        case SclPackage.RED_PROT__RSTP:
            return getRstp();
        case SclPackage.RED_PROT__PARENT_SERVICES:
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
        case SclPackage.RED_PROT__HSR:
            setHsr( ( Boolean ) newValue );
            return;
        case SclPackage.RED_PROT__PRP:
            setPrp( ( Boolean ) newValue );
            return;
        case SclPackage.RED_PROT__RSTP:
            setRstp( ( Boolean ) newValue );
            return;
        case SclPackage.RED_PROT__PARENT_SERVICES:
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
        case SclPackage.RED_PROT__HSR:
            unsetHsr();
            return;
        case SclPackage.RED_PROT__PRP:
            unsetPrp();
            return;
        case SclPackage.RED_PROT__RSTP:
            unsetRstp();
            return;
        case SclPackage.RED_PROT__PARENT_SERVICES:
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
        case SclPackage.RED_PROT__HSR:
            return isSetHsr();
        case SclPackage.RED_PROT__PRP:
            return isSetPrp();
        case SclPackage.RED_PROT__RSTP:
            return isSetRstp();
        case SclPackage.RED_PROT__PARENT_SERVICES:
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (hsr: " );
        if( hsrESet ) {
            result.append( hsr );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", prp: " );
        if( prpESet ) {
            result.append( prp );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", rstp: " );
        if( rstpESet ) {
            result.append( rstp );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        return getParentServices().getXpath() + "/scl:RedProt";
    }

} //RedProtImpl
