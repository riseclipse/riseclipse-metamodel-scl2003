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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Handling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValueHandlingImpl#getSetToRO <em>Set To RO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValueHandlingImpl#getParentServices <em>Parent Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueHandlingImpl extends SclObjectImpl implements ValueHandling {
    /**
     * The default value of the '{@link #getSetToRO() <em>Set To RO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSetToRO()
     * @generated
     * @ordered
     */
    protected static final Boolean SET_TO_RO_EDEFAULT = Boolean.FALSE;

    /**
     * The cached value of the '{@link #getSetToRO() <em>Set To RO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSetToRO()
     * @generated
     * @ordered
     */
    protected Boolean setToRO = SET_TO_RO_EDEFAULT;

    /**
     * This is true if the Set To RO attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean setToROESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValueHandlingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getValueHandling();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSetToRO() {
        return setToRO;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSetToRO( Boolean newSetToRO ) {
        Boolean oldSetToRO = setToRO;
        setToRO = newSetToRO;
        boolean oldSetToROESet = setToROESet;
        setToROESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.VALUE_HANDLING__SET_TO_RO, oldSetToRO,
                    setToRO, !oldSetToROESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSetToRO() {
        Boolean oldSetToRO = setToRO;
        boolean oldSetToROESet = setToROESet;
        setToRO = SET_TO_RO_EDEFAULT;
        setToROESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.VALUE_HANDLING__SET_TO_RO, oldSetToRO,
                    SET_TO_RO_EDEFAULT, oldSetToROESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSetToRO() {
        return setToROESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services getParentServices() {
        if( eContainerFeatureID() != SclPackage.VALUE_HANDLING__PARENT_SERVICES ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentServices, SclPackage.VALUE_HANDLING__PARENT_SERVICES,
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
                || ( eContainerFeatureID() != SclPackage.VALUE_HANDLING__PARENT_SERVICES
                        && newParentServices != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentServices ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentServices != null ) {
                msgs = ( ( InternalEObject ) newParentServices ).eInverseAdd( this, SclPackage.SERVICES__VALUE_HANDLING,
                        Services.class, msgs );
            }
            msgs = basicSetParentServices( newParentServices, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.VALUE_HANDLING__PARENT_SERVICES,
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
        case SclPackage.VALUE_HANDLING__PARENT_SERVICES:
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
        case SclPackage.VALUE_HANDLING__PARENT_SERVICES:
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
        case SclPackage.VALUE_HANDLING__PARENT_SERVICES:
            return eInternalContainer().eInverseRemove( this, SclPackage.SERVICES__VALUE_HANDLING, Services.class,
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
        case SclPackage.VALUE_HANDLING__SET_TO_RO:
            return getSetToRO();
        case SclPackage.VALUE_HANDLING__PARENT_SERVICES:
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
        case SclPackage.VALUE_HANDLING__SET_TO_RO:
            setSetToRO( ( Boolean ) newValue );
            return;
        case SclPackage.VALUE_HANDLING__PARENT_SERVICES:
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
        case SclPackage.VALUE_HANDLING__SET_TO_RO:
            unsetSetToRO();
            return;
        case SclPackage.VALUE_HANDLING__PARENT_SERVICES:
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
        case SclPackage.VALUE_HANDLING__SET_TO_RO:
            return isSetSetToRO();
        case SclPackage.VALUE_HANDLING__PARENT_SERVICES:
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
        result.append( " (setToRO: " );
        if( setToROESet ) {
            result.append( setToRO );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //ValueHandlingImpl
