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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.util.InternalEList;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Log;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogImpl#getParentAnyLN <em>Parent Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogImpl#getReferredByLogControl <em>Referred By Log Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogImpl extends UnNamingImpl implements Log {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;
    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The cached value of the '{@link #getReferredByLogControl() <em>Referred By Log Control</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByLogControl()
     * @generated
     * @ordered
     */
    protected EList< LogControl > referredByLogControl;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LogImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLog();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnyLN getParentAnyLN() {
        if( eContainerFeatureID() != SclPackage.LOG__PARENT_ANY_LN ) return null;
        return ( AnyLN ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAnyLN( AnyLN newParentAnyLN, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAnyLN, SclPackage.LOG__PARENT_ANY_LN, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAnyLN( AnyLN newParentAnyLN ) {
        if( newParentAnyLN != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LOG__PARENT_ANY_LN && newParentAnyLN != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAnyLN ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentAnyLN != null )
                msgs = ( ( InternalEObject ) newParentAnyLN ).eInverseAdd( this, SclPackage.ANY_LN__LOG, AnyLN.class,
                        msgs );
            msgs = basicSetParentAnyLN( newParentAnyLN, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LOG__PARENT_ANY_LN, newParentAnyLN,
                    newParentAnyLN ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LOG__NAME, oldName, name,
                    !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.LOG__NAME, oldName, NAME_EDEFAULT,
                    oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LogControl > getReferredByLogControl() {
        if( referredByLogControl == null ) {
            referredByLogControl = new EObjectWithInverseEList.Unsettable< LogControl >( LogControl.class, this,
                    SclPackage.LOG__REFERRED_BY_LOG_CONTROL, SclPackage.LOG_CONTROL__REFERS_TO_LOG );
        }
        return referredByLogControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByLogControl() {
        if( referredByLogControl != null ) ( ( InternalEList.Unsettable< ? > ) referredByLogControl ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByLogControl() {
        return referredByLogControl != null && ( ( InternalEList.Unsettable< ? > ) referredByLogControl ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.LOG__PARENT_ANY_LN:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentAnyLN( ( AnyLN ) otherEnd, msgs );
        case SclPackage.LOG__REFERRED_BY_LOG_CONTROL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByLogControl() )
                    .basicAdd( otherEnd, msgs );
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
        case SclPackage.LOG__PARENT_ANY_LN:
            return basicSetParentAnyLN( null, msgs );
        case SclPackage.LOG__REFERRED_BY_LOG_CONTROL:
            return ( ( InternalEList< ? > ) getReferredByLogControl() ).basicRemove( otherEnd, msgs );
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
        case SclPackage.LOG__PARENT_ANY_LN:
            return eInternalContainer().eInverseRemove( this, SclPackage.ANY_LN__LOG, AnyLN.class, msgs );
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
        case SclPackage.LOG__PARENT_ANY_LN:
            return getParentAnyLN();
        case SclPackage.LOG__NAME:
            return getName();
        case SclPackage.LOG__REFERRED_BY_LOG_CONTROL:
            return getReferredByLogControl();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case SclPackage.LOG__PARENT_ANY_LN:
            setParentAnyLN( ( AnyLN ) newValue );
            return;
        case SclPackage.LOG__NAME:
            setName( ( String ) newValue );
            return;
        case SclPackage.LOG__REFERRED_BY_LOG_CONTROL:
            getReferredByLogControl().clear();
            getReferredByLogControl().addAll( ( Collection< ? extends LogControl > ) newValue );
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
        case SclPackage.LOG__PARENT_ANY_LN:
            setParentAnyLN( ( AnyLN ) null );
            return;
        case SclPackage.LOG__NAME:
            unsetName();
            return;
        case SclPackage.LOG__REFERRED_BY_LOG_CONTROL:
            unsetReferredByLogControl();
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
        case SclPackage.LOG__PARENT_ANY_LN:
            return getParentAnyLN() != null;
        case SclPackage.LOG__NAME:
            return isSetName();
        case SclPackage.LOG__REFERRED_BY_LOG_CONTROL:
            return isSetReferredByLogControl();
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
        result.append( " (name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LogImpl
