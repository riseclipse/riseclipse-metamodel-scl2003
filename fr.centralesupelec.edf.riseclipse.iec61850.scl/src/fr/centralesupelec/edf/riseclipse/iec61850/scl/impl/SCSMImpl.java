/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCSM;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCSMImpl#isIec61850_8_1 <em>Iec61850 81</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCSMImpl#isIec61850_8_2 <em>Iec61850 82</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCSMImpl#isServerAssociationInitiation <em>Server Association Initiation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCSMImpl#getParentServices <em>Parent Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SCSMImpl extends ServiceYesNoImpl implements SCSM {
    /**
     * The default value of the '{@link #isIec61850_8_1() <em>Iec61850 81</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIec61850_8_1()
     * @generated
     * @ordered
     */
    protected static final boolean IEC61850_81_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isIec61850_8_1() <em>Iec61850 81</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIec61850_8_1()
     * @generated
     * @ordered
     */
    protected boolean iec61850_8_1 = IEC61850_81_EDEFAULT;

    /**
     * This is true if the Iec61850 81 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iec61850_8_1ESet;

    /**
     * The default value of the '{@link #isIec61850_8_2() <em>Iec61850 82</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIec61850_8_2()
     * @generated
     * @ordered
     */
    protected static final boolean IEC61850_82_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIec61850_8_2() <em>Iec61850 82</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIec61850_8_2()
     * @generated
     * @ordered
     */
    protected boolean iec61850_8_2 = IEC61850_82_EDEFAULT;

    /**
     * This is true if the Iec61850 82 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iec61850_8_2ESet;

    /**
     * The default value of the '{@link #isServerAssociationInitiation() <em>Server Association Initiation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isServerAssociationInitiation()
     * @generated
     * @ordered
     */
    protected static final boolean SERVER_ASSOCIATION_INITIATION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isServerAssociationInitiation() <em>Server Association Initiation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isServerAssociationInitiation()
     * @generated
     * @ordered
     */
    protected boolean serverAssociationInitiation = SERVER_ASSOCIATION_INITIATION_EDEFAULT;

    /**
     * This is true if the Server Association Initiation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serverAssociationInitiationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SCSMImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSCSM();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIec61850_8_1() {
        return iec61850_8_1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIec61850_8_1( boolean newIec61850_8_1 ) {
        boolean oldIec61850_8_1 = iec61850_8_1;
        iec61850_8_1 = newIec61850_8_1;
        boolean oldIec61850_8_1ESet = iec61850_8_1ESet;
        iec61850_8_1ESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCSM__IEC61850_81, oldIec61850_8_1,
                    iec61850_8_1, !oldIec61850_8_1ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIec61850_8_1() {
        boolean oldIec61850_8_1 = iec61850_8_1;
        boolean oldIec61850_8_1ESet = iec61850_8_1ESet;
        iec61850_8_1 = IEC61850_81_EDEFAULT;
        iec61850_8_1ESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SCSM__IEC61850_81, oldIec61850_8_1,
                    IEC61850_81_EDEFAULT, oldIec61850_8_1ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIec61850_8_1() {
        return iec61850_8_1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIec61850_8_2() {
        return iec61850_8_2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIec61850_8_2( boolean newIec61850_8_2 ) {
        boolean oldIec61850_8_2 = iec61850_8_2;
        iec61850_8_2 = newIec61850_8_2;
        boolean oldIec61850_8_2ESet = iec61850_8_2ESet;
        iec61850_8_2ESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCSM__IEC61850_82, oldIec61850_8_2,
                    iec61850_8_2, !oldIec61850_8_2ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIec61850_8_2() {
        boolean oldIec61850_8_2 = iec61850_8_2;
        boolean oldIec61850_8_2ESet = iec61850_8_2ESet;
        iec61850_8_2 = IEC61850_82_EDEFAULT;
        iec61850_8_2ESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SCSM__IEC61850_82, oldIec61850_8_2,
                    IEC61850_82_EDEFAULT, oldIec61850_8_2ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIec61850_8_2() {
        return iec61850_8_2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isServerAssociationInitiation() {
        return serverAssociationInitiation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setServerAssociationInitiation( boolean newServerAssociationInitiation ) {
        boolean oldServerAssociationInitiation = serverAssociationInitiation;
        serverAssociationInitiation = newServerAssociationInitiation;
        boolean oldServerAssociationInitiationESet = serverAssociationInitiationESet;
        serverAssociationInitiationESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCSM__SERVER_ASSOCIATION_INITIATION,
                    oldServerAssociationInitiation, serverAssociationInitiation,
                    !oldServerAssociationInitiationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetServerAssociationInitiation() {
        boolean oldServerAssociationInitiation = serverAssociationInitiation;
        boolean oldServerAssociationInitiationESet = serverAssociationInitiationESet;
        serverAssociationInitiation = SERVER_ASSOCIATION_INITIATION_EDEFAULT;
        serverAssociationInitiationESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SCSM__SERVER_ASSOCIATION_INITIATION,
                    oldServerAssociationInitiation, SERVER_ASSOCIATION_INITIATION_EDEFAULT,
                    oldServerAssociationInitiationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetServerAssociationInitiation() {
        return serverAssociationInitiationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getParentServices() {
        if( eContainerFeatureID() != SclPackage.SCSM__PARENT_SERVICES ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServices, SclPackage.SCSM__PARENT_SERVICES, msgs );
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
                || ( eContainerFeatureID() != SclPackage.SCSM__PARENT_SERVICES && newParentServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServices ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServices != null ) {
                msgs = ( ( InternalEObject ) newParentServices ).eInverseAdd( this, SclPackage.SERVICES__SCSM,
                        Services.class, msgs );
            }
            msgs = basicSetParentServices( newParentServices, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SCSM__PARENT_SERVICES, newParentServices,
                    newParentServices ) );
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
        case SclPackage.SCSM__PARENT_SERVICES:
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
        case SclPackage.SCSM__PARENT_SERVICES:
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
        case SclPackage.SCSM__PARENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVICES__SCSM, Services.class, msgs );
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
        case SclPackage.SCSM__IEC61850_81:
            return isIec61850_8_1();
        case SclPackage.SCSM__IEC61850_82:
            return isIec61850_8_2();
        case SclPackage.SCSM__SERVER_ASSOCIATION_INITIATION:
            return isServerAssociationInitiation();
        case SclPackage.SCSM__PARENT_SERVICES:
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
        case SclPackage.SCSM__IEC61850_81:
            setIec61850_8_1( ( Boolean ) newValue );
            return;
        case SclPackage.SCSM__IEC61850_82:
            setIec61850_8_2( ( Boolean ) newValue );
            return;
        case SclPackage.SCSM__SERVER_ASSOCIATION_INITIATION:
            setServerAssociationInitiation( ( Boolean ) newValue );
            return;
        case SclPackage.SCSM__PARENT_SERVICES:
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
        case SclPackage.SCSM__IEC61850_81:
            unsetIec61850_8_1();
            return;
        case SclPackage.SCSM__IEC61850_82:
            unsetIec61850_8_2();
            return;
        case SclPackage.SCSM__SERVER_ASSOCIATION_INITIATION:
            unsetServerAssociationInitiation();
            return;
        case SclPackage.SCSM__PARENT_SERVICES:
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
        case SclPackage.SCSM__IEC61850_81:
            return isSetIec61850_8_1();
        case SclPackage.SCSM__IEC61850_82:
            return isSetIec61850_8_2();
        case SclPackage.SCSM__SERVER_ASSOCIATION_INITIATION:
            return isSetServerAssociationInitiation();
        case SclPackage.SCSM__PARENT_SERVICES:
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
        result.append( " (iec61850_8_1: " );
        if( iec61850_8_1ESet ) {
            result.append( iec61850_8_1 );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", iec61850_8_2: " );
        if( iec61850_8_2ESet ) {
            result.append( iec61850_8_2 );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", serverAssociationInitiation: " );
        if( serverAssociationInitiationESet ) {
            result.append( serverAssociationInitiation );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //SCSMImpl
