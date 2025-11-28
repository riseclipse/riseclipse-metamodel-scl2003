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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.Application;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantImpl#getParentApplication <em>Parent Application</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantImpl#getParentFunctionalVariantGroup <em>Parent Functional Variant Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantImpl#getReferredByFunctionalVariantRef <em>Referred By Functional Variant Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalVariantImpl extends AbstractFunctionalVariantImpl implements FunctionalVariant {
    /**
     * The cached value of the '{@link #getReferredByFunctionalVariantRef() <em>Referred By Functional Variant Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByFunctionalVariantRef()
     * @generated
     * @ordered
     */
    protected EList< FunctionalVariantRef > referredByFunctionalVariantRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionalVariantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getFunctionalVariant();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Application getParentApplication() {
        if( eContainerFeatureID() != AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION ) {
            return null;
        }
        return ( Application ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentApplication( Application newParentApplication, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentApplication,
                AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentApplication( Application newParentApplication ) {
        if( newParentApplication != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION
                        && newParentApplication != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentApplication ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentApplication != null ) {
                msgs = ( ( InternalEObject ) newParentApplication ).eInverseAdd( this,
                        AsdPackage.APPLICATION__FUNCTIONAL_VARIANT, Application.class, msgs );
            }
            msgs = basicSetParentApplication( newParentApplication, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION,
                    newParentApplication, newParentApplication ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalVariantGroup getParentFunctionalVariantGroup() {
        if( eContainerFeatureID() != AsdPackage.FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP ) {
            return null;
        }
        return ( FunctionalVariantGroup ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionalVariantGroup(
            FunctionalVariantGroup newParentFunctionalVariantGroup, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionalVariantGroup,
                AsdPackage.FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionalVariantGroup( FunctionalVariantGroup newParentFunctionalVariantGroup ) {
        if( newParentFunctionalVariantGroup != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP
                        && newParentFunctionalVariantGroup != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionalVariantGroup ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentFunctionalVariantGroup != null ) {
                msgs = ( ( InternalEObject ) newParentFunctionalVariantGroup ).eInverseAdd( this,
                        AsdPackage.FUNCTIONAL_VARIANT_GROUP__FUNCTIONAL_VARIANT, FunctionalVariantGroup.class, msgs );
            }
            msgs = basicSetParentFunctionalVariantGroup( newParentFunctionalVariantGroup, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP, newParentFunctionalVariantGroup,
                    newParentFunctionalVariantGroup ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionalVariantRef > getReferredByFunctionalVariantRef() {
        if( referredByFunctionalVariantRef == null ) {
            referredByFunctionalVariantRef = new EObjectWithInverseResolvingEList.Unsettable< >(
                    FunctionalVariantRef.class, this, AsdPackage.FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF,
                    AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT );
        }
        return referredByFunctionalVariantRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByFunctionalVariantRef() {
        if( referredByFunctionalVariantRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByFunctionalVariantRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByFunctionalVariantRef() {
        return referredByFunctionalVariantRef != null
                && ( ( InternalEList.Unsettable< ? > ) referredByFunctionalVariantRef ).isSet();
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
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentApplication( ( Application ) otherEnd, msgs );
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionalVariantGroup( ( FunctionalVariantGroup ) otherEnd, msgs );
        case AsdPackage.FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByFunctionalVariantRef() )
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
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION:
            return basicSetParentApplication( null, msgs );
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP:
            return basicSetParentFunctionalVariantGroup( null, msgs );
        case AsdPackage.FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF:
            return ( ( InternalEList< ? > ) getReferredByFunctionalVariantRef() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION:
            return eInternalContainer().eInverseRemove( this, AsdPackage.APPLICATION__FUNCTIONAL_VARIANT,
                    Application.class, msgs );
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP:
            return eInternalContainer().eInverseRemove( this, AsdPackage.FUNCTIONAL_VARIANT_GROUP__FUNCTIONAL_VARIANT,
                    FunctionalVariantGroup.class, msgs );
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
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION:
            return getParentApplication();
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP:
            return getParentFunctionalVariantGroup();
        case AsdPackage.FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF:
            return getReferredByFunctionalVariantRef();
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
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION:
            setParentApplication( ( Application ) newValue );
            return;
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP:
            setParentFunctionalVariantGroup( ( FunctionalVariantGroup ) newValue );
            return;
        case AsdPackage.FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF:
            getReferredByFunctionalVariantRef().clear();
            getReferredByFunctionalVariantRef().addAll( ( Collection< ? extends FunctionalVariantRef > ) newValue );
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
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION:
            setParentApplication( ( Application ) null );
            return;
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP:
            setParentFunctionalVariantGroup( ( FunctionalVariantGroup ) null );
            return;
        case AsdPackage.FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF:
            unsetReferredByFunctionalVariantRef();
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
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_APPLICATION:
            return getParentApplication() != null;
        case AsdPackage.FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP:
            return getParentFunctionalVariantGroup() != null;
        case AsdPackage.FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF:
            return isSetReferredByFunctionalVariantRef();
        }
        return super.eIsSet( featureID );
    }

} //FunctionalVariantImpl
