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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Application;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.UpdateEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Variant Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantRefImpl#getFunctionalVariant <em>Functional Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantRefImpl#getFunctionalVariantUuid <em>Functional Variant Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantRefImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantRefImpl#getParentFunctionalVariantRefContainer <em>Parent Functional Variant Ref Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantRefImpl#getRefersToFunctionalVariant <em>Refers To Functional Variant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalVariantRefImpl extends BaseExtensionElementImpl implements FunctionalVariantRef {
    /**
     * The default value of the '{@link #getFunctionalVariant() <em>Functional Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalVariant()
     * @generated
     * @ordered
     */
    protected static final String FUNCTIONAL_VARIANT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFunctionalVariant() <em>Functional Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalVariant()
     * @generated
     * @ordered
     */
    protected String functionalVariant = FUNCTIONAL_VARIANT_EDEFAULT;

    /**
     * The default value of the '{@link #getFunctionalVariantUuid() <em>Functional Variant Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalVariantUuid()
     * @generated
     * @ordered
     */
    protected static final String FUNCTIONAL_VARIANT_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFunctionalVariantUuid() <em>Functional Variant Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionalVariantUuid()
     * @generated
     * @ordered
     */
    protected String functionalVariantUuid = FUNCTIONAL_VARIANT_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getUpdate() <em>Update</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdate()
     * @generated
     * @ordered
     */
    protected static final UpdateEnum UPDATE_EDEFAULT = UpdateEnum.ADD;

    /**
     * The cached value of the '{@link #getUpdate() <em>Update</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdate()
     * @generated
     * @ordered
     */
    protected UpdateEnum update = UPDATE_EDEFAULT;

    /**
     * This is true if the Update attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean updateESet;

    /**
     * The cached value of the '{@link #getRefersToFunctionalVariant() <em>Refers To Functional Variant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToFunctionalVariant()
     * @generated
     * @ordered
     */
    protected FunctionalVariant refersToFunctionalVariant;

    /**
     * This is true if the Refers To Functional Variant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToFunctionalVariantESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionalVariantRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getFunctionalVariantRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFunctionalVariant() {
        return functionalVariant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunctionalVariant( String newFunctionalVariant ) {
        String oldFunctionalVariant = functionalVariant;
        functionalVariant = newFunctionalVariant;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT, oldFunctionalVariant, functionalVariant ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFunctionalVariantUuid() {
        return functionalVariantUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunctionalVariantUuid( String newFunctionalVariantUuid ) {
        String oldFunctionalVariantUuid = functionalVariantUuid;
        functionalVariantUuid = newFunctionalVariantUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT_UUID, oldFunctionalVariantUuid,
                    functionalVariantUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UpdateEnum getUpdate() {
        return update;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUpdate( UpdateEnum newUpdate ) {
        UpdateEnum oldUpdate = update;
        update = newUpdate == null ? UPDATE_EDEFAULT : newUpdate;
        boolean oldUpdateESet = updateESet;
        updateESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTIONAL_VARIANT_REF__UPDATE,
                    oldUpdate, update, !oldUpdateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpdate() {
        UpdateEnum oldUpdate = update;
        boolean oldUpdateESet = updateESet;
        update = UPDATE_EDEFAULT;
        updateESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.FUNCTIONAL_VARIANT_REF__UPDATE,
                    oldUpdate, UPDATE_EDEFAULT, oldUpdateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpdate() {
        return updateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalVariantRefContainer getParentFunctionalVariantRefContainer() {
        if( eContainerFeatureID() != AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER ) {
            return null;
        }
        return ( FunctionalVariantRefContainer ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionalVariantRefContainer(
            FunctionalVariantRefContainer newParentFunctionalVariantRefContainer, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionalVariantRefContainer,
                AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionalVariantRefContainer(
            FunctionalVariantRefContainer newParentFunctionalVariantRefContainer ) {
        if( newParentFunctionalVariantRefContainer != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER
                        && newParentFunctionalVariantRefContainer != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionalVariantRefContainer ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentFunctionalVariantRefContainer != null ) {
                msgs = ( ( InternalEObject ) newParentFunctionalVariantRefContainer ).eInverseAdd( this,
                        AsdPackage.FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF,
                        FunctionalVariantRefContainer.class, msgs );
            }
            msgs = basicSetParentFunctionalVariantRefContainer( newParentFunctionalVariantRefContainer, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER,
                    newParentFunctionalVariantRefContainer, newParentFunctionalVariantRefContainer ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionalVariant getRefersToFunctionalVariant() {
        if( refersToFunctionalVariant != null && refersToFunctionalVariant.eIsProxy() ) {
            InternalEObject oldRefersToFunctionalVariant = ( InternalEObject ) refersToFunctionalVariant;
            refersToFunctionalVariant = ( FunctionalVariant ) eResolveProxy( oldRefersToFunctionalVariant );
            if( refersToFunctionalVariant != oldRefersToFunctionalVariant ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT,
                            oldRefersToFunctionalVariant, refersToFunctionalVariant ) );
                }
            }
        }
        return refersToFunctionalVariant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FunctionalVariant basicGetRefersToFunctionalVariant() {
        return refersToFunctionalVariant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToFunctionalVariant( FunctionalVariant newRefersToFunctionalVariant,
            NotificationChain msgs ) {
        FunctionalVariant oldRefersToFunctionalVariant = refersToFunctionalVariant;
        refersToFunctionalVariant = newRefersToFunctionalVariant;
        boolean oldRefersToFunctionalVariantESet = refersToFunctionalVariantESet;
        refersToFunctionalVariantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT, oldRefersToFunctionalVariant,
                    newRefersToFunctionalVariant, !oldRefersToFunctionalVariantESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToFunctionalVariant( FunctionalVariant newRefersToFunctionalVariant ) {
        if( newRefersToFunctionalVariant != refersToFunctionalVariant ) {
            NotificationChain msgs = null;
            if( refersToFunctionalVariant != null ) {
                msgs = ( ( InternalEObject ) refersToFunctionalVariant ).eInverseRemove( this,
                        AsdPackage.FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF, FunctionalVariant.class,
                        msgs );
            }
            if( newRefersToFunctionalVariant != null ) {
                msgs = ( ( InternalEObject ) newRefersToFunctionalVariant ).eInverseAdd( this,
                        AsdPackage.FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF, FunctionalVariant.class,
                        msgs );
            }
            msgs = basicSetRefersToFunctionalVariant( newRefersToFunctionalVariant, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToFunctionalVariantESet = refersToFunctionalVariantESet;
            refersToFunctionalVariantESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT, newRefersToFunctionalVariant,
                        newRefersToFunctionalVariant, !oldRefersToFunctionalVariantESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToFunctionalVariant( NotificationChain msgs ) {
        FunctionalVariant oldRefersToFunctionalVariant = refersToFunctionalVariant;
        refersToFunctionalVariant = null;
        boolean oldRefersToFunctionalVariantESet = refersToFunctionalVariantESet;
        refersToFunctionalVariantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT, oldRefersToFunctionalVariant, null,
                    oldRefersToFunctionalVariantESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToFunctionalVariant() {
        if( refersToFunctionalVariant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToFunctionalVariant ).eInverseRemove( this,
                    AsdPackage.FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF, FunctionalVariant.class, msgs );
            msgs = basicUnsetRefersToFunctionalVariant( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToFunctionalVariantESet = refersToFunctionalVariantESet;
            refersToFunctionalVariantESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT, null, null,
                        oldRefersToFunctionalVariantESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToFunctionalVariant() {
        return refersToFunctionalVariantESet;
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionalVariantRefContainer( ( FunctionalVariantRefContainer ) otherEnd, msgs );
        case AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT:
            if( refersToFunctionalVariant != null ) {
                msgs = ( ( InternalEObject ) refersToFunctionalVariant ).eInverseRemove( this,
                        AsdPackage.FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF, FunctionalVariant.class,
                        msgs );
            }
            return basicSetRefersToFunctionalVariant( ( FunctionalVariant ) otherEnd, msgs );
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER:
            return basicSetParentFunctionalVariantRefContainer( null, msgs );
        case AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT:
            return basicUnsetRefersToFunctionalVariant( msgs );
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER:
            return eInternalContainer().eInverseRemove( this,
                    AsdPackage.FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF,
                    FunctionalVariantRefContainer.class, msgs );
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT:
            return getFunctionalVariant();
        case AsdPackage.FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT_UUID:
            return getFunctionalVariantUuid();
        case AsdPackage.FUNCTIONAL_VARIANT_REF__UPDATE:
            return getUpdate();
        case AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER:
            return getParentFunctionalVariantRefContainer();
        case AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT:
            if( resolve ) {
                return getRefersToFunctionalVariant();
            }
            return basicGetRefersToFunctionalVariant();
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT:
            setFunctionalVariant( ( String ) newValue );
            return;
        case AsdPackage.FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT_UUID:
            setFunctionalVariantUuid( ( String ) newValue );
            return;
        case AsdPackage.FUNCTIONAL_VARIANT_REF__UPDATE:
            setUpdate( ( UpdateEnum ) newValue );
            return;
        case AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER:
            setParentFunctionalVariantRefContainer( ( FunctionalVariantRefContainer ) newValue );
            return;
        case AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT:
            setRefersToFunctionalVariant( ( FunctionalVariant ) newValue );
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT:
            setFunctionalVariant( FUNCTIONAL_VARIANT_EDEFAULT );
            return;
        case AsdPackage.FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT_UUID:
            setFunctionalVariantUuid( FUNCTIONAL_VARIANT_UUID_EDEFAULT );
            return;
        case AsdPackage.FUNCTIONAL_VARIANT_REF__UPDATE:
            unsetUpdate();
            return;
        case AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER:
            setParentFunctionalVariantRefContainer( ( FunctionalVariantRefContainer ) null );
            return;
        case AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT:
            unsetRefersToFunctionalVariant();
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
        case AsdPackage.FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT:
            return FUNCTIONAL_VARIANT_EDEFAULT == null ? functionalVariant != null
                    : !FUNCTIONAL_VARIANT_EDEFAULT.equals( functionalVariant );
        case AsdPackage.FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT_UUID:
            return FUNCTIONAL_VARIANT_UUID_EDEFAULT == null ? functionalVariantUuid != null
                    : !FUNCTIONAL_VARIANT_UUID_EDEFAULT.equals( functionalVariantUuid );
        case AsdPackage.FUNCTIONAL_VARIANT_REF__UPDATE:
            return isSetUpdate();
        case AsdPackage.FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER:
            return getParentFunctionalVariantRefContainer() != null;
        case AsdPackage.FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT:
            return isSetRefersToFunctionalVariant();
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
        result.append( " (functionalVariant: " );
        result.append( functionalVariant );
        result.append( ", functionalVariantUuid: " );
        result.append( functionalVariantUuid );
        result.append( ", update: " );
        if( updateESet ) {
            result.append( update );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "FunctionalVariantRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from FunctionalVariantRef: ";
        doBuildExplicitLinkWithFunctionalVariant( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithFunctionalVariant( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for FunctionalVariant) ";

        SCL sclRoot = AsdUtilities.getSCL( this );

        if( getFunctionalVariantUuid() != null && !getFunctionalVariantUuid().isEmpty() ) {
            List< FunctionalVariant > res = new ArrayList<>();

            TreeIterator< EObject > it = sclRoot.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( o instanceof FunctionalVariant
                        && getFunctionalVariantUuid().equals( ( ( FunctionalVariant ) o ).getUuid() ) ) {
                    res.add( ( FunctionalVariant ) o );
                }
            }

            if( res.size() == 1 ) {
                setRefersToFunctionalVariant( res.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "FunctionalVariantRef refers to FunctionalVariant( id = ", getFunctionalVariantUuid(),
                        " ) on line ",
                        getRefersToFunctionalVariant().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " FunctionalVariant( uuid = ", getFunctionalVariantUuid(), " )" );
            }

        }
        else if( getFunctionalVariant() != null && !getFunctionalVariant().isEmpty() ) {

            EObject parent = eContainer();
            while( parent != null && !( parent instanceof Application ) ) {
                parent = parent.eContainer();
            }

            Application associatedApplication = null;

            if( parent != null && parent instanceof Application ) {
                associatedApplication = ( Application ) parent;
            }
            else {

                parent = eContainer();
                while( parent != null && !( parent instanceof AllocationRole ) ) {
                    parent = parent.eContainer();
                }

                if( parent != null && parent instanceof AllocationRole ) {
                    AllocationRole parentAllocationRole = ( ( AllocationRole ) parent );

                    if( !parentAllocationRole.isExplicitLinksBuilt() ) {
                        parentAllocationRole.buildExplicitLinks( console, false );
                    }

                    if( parentAllocationRole.isSetReferredByAllocationRoleRef() &&
                            !parentAllocationRole.getReferredByAllocationRoleRef().isEmpty() ) {
                        associatedApplication = parentAllocationRole
                                .getReferredByAllocationRoleRef()
                                .get( 0 )
                                .getParentApplication();
                    }
                }
            }

            if( associatedApplication != null ) {
                List< FunctionalVariant > res = new ArrayList<>();
                List< FunctionalVariant > candidates = associatedApplication.getFunctionalVariant();
                associatedApplication.getFunctionalVariantGroup()
                        .forEach( g -> candidates.addAll( g.getFunctionalVariant() ) );

                for( FunctionalVariant f : candidates ) {
                    if( getFunctionalVariant().equals( f.getName() ) ) {
                        res.add( f );
                    }
                }

                if( res.size() != 1 ) {
                    // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                    //         " FunctionalVariant( name = ", getFunctionalVariant(), " )" );
                    return;
                }

                setRefersToFunctionalVariant( res.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "FunctionalVariantRef refers to FunctionalVariant( name = ", getFunctionalVariant(), " )",
                        " on line ",
                        getRefersToFunctionalVariant().getLineNumber() );

            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because variable and variableUuid are missing" );
        }

    }

} //FunctionalVariantRefImpl
