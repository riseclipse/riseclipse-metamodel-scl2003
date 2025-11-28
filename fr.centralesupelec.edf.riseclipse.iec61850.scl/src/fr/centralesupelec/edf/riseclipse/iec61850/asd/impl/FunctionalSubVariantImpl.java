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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Sub Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalSubVariantImpl#getParentAbstractFunctionalVariant <em>Parent Abstract Functional Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalSubVariantImpl extends AbstractFunctionalVariantImpl implements FunctionalSubVariant {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionalSubVariantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getFunctionalSubVariant();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractFunctionalVariant getParentAbstractFunctionalVariant() {
        if( eContainerFeatureID() != AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT ) {
            return null;
        }
        return ( AbstractFunctionalVariant ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAbstractFunctionalVariant(
            AbstractFunctionalVariant newParentAbstractFunctionalVariant, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAbstractFunctionalVariant,
                AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAbstractFunctionalVariant( AbstractFunctionalVariant newParentAbstractFunctionalVariant ) {
        if( newParentAbstractFunctionalVariant != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT
                        && newParentAbstractFunctionalVariant != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAbstractFunctionalVariant ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentAbstractFunctionalVariant != null ) {
                msgs = ( ( InternalEObject ) newParentAbstractFunctionalVariant ).eInverseAdd( this,
                        AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT, AbstractFunctionalVariant.class,
                        msgs );
            }
            msgs = basicSetParentAbstractFunctionalVariant( newParentAbstractFunctionalVariant, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT,
                    newParentAbstractFunctionalVariant, newParentAbstractFunctionalVariant ) );
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
        case AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentAbstractFunctionalVariant( ( AbstractFunctionalVariant ) otherEnd, msgs );
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
        case AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            return basicSetParentAbstractFunctionalVariant( null, msgs );
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
        case AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            return eInternalContainer().eInverseRemove( this,
                    AsdPackage.ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT, AbstractFunctionalVariant.class,
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
        case AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            return getParentAbstractFunctionalVariant();
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
        case AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            setParentAbstractFunctionalVariant( ( AbstractFunctionalVariant ) newValue );
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
        case AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            setParentAbstractFunctionalVariant( ( AbstractFunctionalVariant ) null );
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
        case AsdPackage.FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT:
            return getParentAbstractFunctionalVariant() != null;
        }
        return super.eIsSet( featureID );
    }

} //FunctionalSubVariantImpl
