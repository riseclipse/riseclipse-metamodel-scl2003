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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Samples Per Sec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SamplesPerSecImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SamplesPerSecImpl#getParentSMVSettings <em>Parent SMV Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SamplesPerSecImpl extends SclObjectImpl implements SamplesPerSec {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final Integer VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected Integer value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SamplesPerSecImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSamplesPerSec();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( Integer newValue ) {
        Integer oldValue = value;
        value = newValue;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SAMPLES_PER_SEC__VALUE, oldValue,
                    value ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVSettings getParentSMVSettings() {
        if( eContainerFeatureID() != SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS ) {
            return null;
        }
        return ( SMVSettings ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSMVSettings( SMVSettings newParentSMVSettings, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSMVSettings,
                SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSMVSettings( SMVSettings newParentSMVSettings ) {
        if( newParentSMVSettings != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS
                        && newParentSMVSettings != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSMVSettings ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSMVSettings != null ) {
                msgs = ( ( InternalEObject ) newParentSMVSettings ).eInverseAdd( this,
                        SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC, SMVSettings.class, msgs );
            }
            msgs = basicSetParentSMVSettings( newParentSMVSettings, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS,
                    newParentSMVSettings, newParentSMVSettings ) );
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
        case SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSMVSettings( ( SMVSettings ) otherEnd, msgs );
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
        case SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS:
            return basicSetParentSMVSettings( null, msgs );
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
        case SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS:
            return eInternalContainer().eInverseRemove( this, SclPackage.SMV_SETTINGS__SAMPLES_PER_SEC,
                    SMVSettings.class, msgs );
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
        case SclPackage.SAMPLES_PER_SEC__VALUE:
            return getValue();
        case SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS:
            return getParentSMVSettings();
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
        case SclPackage.SAMPLES_PER_SEC__VALUE:
            setValue( ( Integer ) newValue );
            return;
        case SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS:
            setParentSMVSettings( ( SMVSettings ) newValue );
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
        case SclPackage.SAMPLES_PER_SEC__VALUE:
            setValue( VALUE_EDEFAULT );
            return;
        case SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS:
            setParentSMVSettings( ( SMVSettings ) null );
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
        case SclPackage.SAMPLES_PER_SEC__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals( value );
        case SclPackage.SAMPLES_PER_SEC__PARENT_SMV_SETTINGS:
            return getParentSMVSettings() != null;
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
        result.append( " (value: " );
        result.append( value );
        result.append( ')' );
        return result.toString();
    }

    @Override
    public String getXpath() {
        if( getParentSMVSettings().getSamplesPerSec().size() == 1 ) {
            return getParentSMVSettings().getXpath() + "/scl:SamplesPerSec";
        }
        return getParentSMVSettings().getXpath() + "/scl:SamplesPerSec["
                + ( getParentSMVSettings().getSamplesPerSec().indexOf( this ) + 1 ) + "]";
    }

} //SamplesPerSecImpl
