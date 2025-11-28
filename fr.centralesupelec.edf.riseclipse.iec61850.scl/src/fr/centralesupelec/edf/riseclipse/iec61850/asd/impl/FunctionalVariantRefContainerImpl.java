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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Variant Ref Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantRefContainerImpl#getFunctionalVariantRef <em>Functional Variant Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionalVariantRefContainerImpl extends BaseExtensionElementWithDescImpl
        implements FunctionalVariantRefContainer {
    /**
     * The cached value of the '{@link #getFunctionalVariantRef() <em>Functional Variant Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalVariantRef()
     * @generated
     * @ordered
     */
    protected EList< FunctionalVariantRef > functionalVariantRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionalVariantRefContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getFunctionalVariantRefContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionalVariantRef > getFunctionalVariantRef() {
        if( functionalVariantRef == null ) {
            functionalVariantRef = new EObjectContainmentWithInverseEList.Unsettable< >(
                    FunctionalVariantRef.class, this,
                    AsdPackage.FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF,
                    AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER );
        }
        return functionalVariantRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunctionalVariantRef() {
        if( functionalVariantRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) functionalVariantRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunctionalVariantRef() {
        return functionalVariantRef != null && ( ( InternalEList.Unsettable< ? > ) functionalVariantRef ).isSet();
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunctionalVariantRef() )
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF:
            return ( ( InternalEList< ? > ) getFunctionalVariantRef() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF:
            return getFunctionalVariantRef();
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF:
            getFunctionalVariantRef().clear();
            getFunctionalVariantRef().addAll( ( Collection< ? extends FunctionalVariantRef > ) newValue );
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF:
            unsetFunctionalVariantRef();
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF:
            return isSetFunctionalVariantRef();
        }
        return super.eIsSet( featureID );
    }

} //FunctionalVariantRefContainerImpl
