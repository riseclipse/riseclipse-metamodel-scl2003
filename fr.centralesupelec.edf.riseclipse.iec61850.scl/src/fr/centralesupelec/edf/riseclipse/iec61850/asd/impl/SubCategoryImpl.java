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
package fr.centralesupelec.edf.riseclipse.iec61850.asd.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubCategoryImpl#getParentFunctionCategory <em>Parent Function Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubCategoryImpl extends FunctionCategoryImpl implements SubCategory {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubCategoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getSubCategory();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionCategory getParentFunctionCategory() {
        if( eContainerFeatureID() != AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY ) return null;
        return ( FunctionCategory ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionCategory( FunctionCategory newParentFunctionCategory,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionCategory,
                AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionCategory( FunctionCategory newParentFunctionCategory ) {
        if( newParentFunctionCategory != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY
                        && newParentFunctionCategory != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionCategory ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentFunctionCategory != null )
                msgs = ( ( InternalEObject ) newParentFunctionCategory ).eInverseAdd( this,
                        AsdPackage.FUNCTION_CATEGORY__SUB_CATEGORY, FunctionCategory.class, msgs );
            msgs = basicSetParentFunctionCategory( newParentFunctionCategory, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY,
                    newParentFunctionCategory, newParentFunctionCategory ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentFunctionCategory( ( FunctionCategory ) otherEnd, msgs );
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
        case AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY:
            return basicSetParentFunctionCategory( null, msgs );
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
        case AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY:
            return eInternalContainer().eInverseRemove( this, AsdPackage.FUNCTION_CATEGORY__SUB_CATEGORY,
                    FunctionCategory.class, msgs );
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
        case AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY:
            return getParentFunctionCategory();
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
        case AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY:
            setParentFunctionCategory( ( FunctionCategory ) newValue );
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
        case AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY:
            setParentFunctionCategory( ( FunctionCategory ) null );
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
        case AsdPackage.SUB_CATEGORY__PARENT_FUNCTION_CATEGORY:
            return getParentFunctionCategory() != null;
        }
        return super.eIsSet( featureID );
    }

} //SubCategoryImpl
