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

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.InputsImpl#getParentAnyLN <em>Parent Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.InputsImpl#getExtRef <em>Ext Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputsImpl extends UnNamingImpl implements Inputs {
    /**
     * The cached value of the '{@link #getExtRef() <em>Ext Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtRef()
     * @generated
     * @ordered
     */
    protected EList< ExtRef > extRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InputsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getInputs();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnyLN getParentAnyLN() {
        if( eContainerFeatureID() != SclPackage.INPUTS__PARENT_ANY_LN ) return null;
        return ( AnyLN ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAnyLN( AnyLN newParentAnyLN, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAnyLN, SclPackage.INPUTS__PARENT_ANY_LN, msgs );
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
                || ( eContainerFeatureID() != SclPackage.INPUTS__PARENT_ANY_LN && newParentAnyLN != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAnyLN ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentAnyLN != null )
                msgs = ( ( InternalEObject ) newParentAnyLN ).eInverseAdd( this, SclPackage.ANY_LN__INPUTS, AnyLN.class,
                        msgs );
            msgs = basicSetParentAnyLN( newParentAnyLN, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.INPUTS__PARENT_ANY_LN, newParentAnyLN,
                    newParentAnyLN ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ExtRef > getExtRef() {
        if( extRef == null ) {
            extRef = new EObjectContainmentWithInverseEList.Unsettable< ExtRef >( ExtRef.class, this,
                    SclPackage.INPUTS__EXT_REF, SclPackage.EXT_REF__PARENT_INPUTS );
        }
        return extRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExtRef() {
        if( extRef != null ) ( ( InternalEList.Unsettable< ? > ) extRef ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExtRef() {
        return extRef != null && ( ( InternalEList.Unsettable< ? > ) extRef ).isSet();
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
        case SclPackage.INPUTS__PARENT_ANY_LN:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentAnyLN( ( AnyLN ) otherEnd, msgs );
        case SclPackage.INPUTS__EXT_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getExtRef() ).basicAdd( otherEnd,
                    msgs );
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
        case SclPackage.INPUTS__PARENT_ANY_LN:
            return basicSetParentAnyLN( null, msgs );
        case SclPackage.INPUTS__EXT_REF:
            return ( ( InternalEList< ? > ) getExtRef() ).basicRemove( otherEnd, msgs );
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
        case SclPackage.INPUTS__PARENT_ANY_LN:
            return eInternalContainer().eInverseRemove( this, SclPackage.ANY_LN__INPUTS, AnyLN.class, msgs );
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
        case SclPackage.INPUTS__PARENT_ANY_LN:
            return getParentAnyLN();
        case SclPackage.INPUTS__EXT_REF:
            return getExtRef();
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
        case SclPackage.INPUTS__PARENT_ANY_LN:
            setParentAnyLN( ( AnyLN ) newValue );
            return;
        case SclPackage.INPUTS__EXT_REF:
            getExtRef().clear();
            getExtRef().addAll( ( Collection< ? extends ExtRef > ) newValue );
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
        case SclPackage.INPUTS__PARENT_ANY_LN:
            setParentAnyLN( ( AnyLN ) null );
            return;
        case SclPackage.INPUTS__EXT_REF:
            unsetExtRef();
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
        case SclPackage.INPUTS__PARENT_ANY_LN:
            return getParentAnyLN() != null;
        case SclPackage.INPUTS__EXT_REF:
            return isSetExtRef();
        }
        return super.eIsSet( featureID );
    }

    @Override
    public String getXpath() {
        return getParentAnyLN().getXpath() + "/scl:Inputs";
    }

} //InputsImpl
