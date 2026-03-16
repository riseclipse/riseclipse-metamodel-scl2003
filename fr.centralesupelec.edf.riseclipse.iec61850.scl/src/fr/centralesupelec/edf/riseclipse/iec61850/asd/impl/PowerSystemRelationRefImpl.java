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
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power System Relation Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationRefImpl#getPowerSystemRelation <em>Power System Relation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationRefImpl#getPowerSystemRelationUuid <em>Power System Relation Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationRefImpl#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationRefImpl#getRefersToPowerSystemRelation <em>Refers To Power System Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSystemRelationRefImpl extends FunctionalVariantRefContainerImpl implements PowerSystemRelationRef {
    /**
     * The default value of the '{@link #getPowerSystemRelation() <em>Power System Relation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemRelation()
     * @generated
     * @ordered
     */
    protected static final String POWER_SYSTEM_RELATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPowerSystemRelation() <em>Power System Relation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemRelation()
     * @generated
     * @ordered
     */
    protected String powerSystemRelation = POWER_SYSTEM_RELATION_EDEFAULT;

    /**
     * The default value of the '{@link #getPowerSystemRelationUuid() <em>Power System Relation Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemRelationUuid()
     * @generated
     * @ordered
     */
    protected static final String POWER_SYSTEM_RELATION_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPowerSystemRelationUuid() <em>Power System Relation Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemRelationUuid()
     * @generated
     * @ordered
     */
    protected String powerSystemRelationUuid = POWER_SYSTEM_RELATION_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToPowerSystemRelation() <em>Refers To Power System Relation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToPowerSystemRelation()
     * @generated
     * @ordered
     */
    protected PowerSystemRelation refersToPowerSystemRelation;

    /**
     * This is true if the Refers To Power System Relation reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToPowerSystemRelationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerSystemRelationRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getPowerSystemRelationRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPowerSystemRelation() {
        return powerSystemRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPowerSystemRelation( String newPowerSystemRelation ) {
        String oldPowerSystemRelation = powerSystemRelation;
        powerSystemRelation = newPowerSystemRelation;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION, oldPowerSystemRelation,
                    powerSystemRelation ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPowerSystemRelationUuid() {
        return powerSystemRelationUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPowerSystemRelationUuid( String newPowerSystemRelationUuid ) {
        String oldPowerSystemRelationUuid = powerSystemRelationUuid;
        powerSystemRelationUuid = newPowerSystemRelationUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION_UUID, oldPowerSystemRelationUuid,
                    powerSystemRelationUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionRoleContent getParentFunctionRoleContent() {
        if( eContainerFeatureID() != AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT ) {
            return null;
        }
        return ( FunctionRoleContent ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentFunctionRoleContent( FunctionRoleContent newParentFunctionRoleContent,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentFunctionRoleContent,
                AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentFunctionRoleContent( FunctionRoleContent newParentFunctionRoleContent ) {
        if( newParentFunctionRoleContent != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT
                        && newParentFunctionRoleContent != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentFunctionRoleContent ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentFunctionRoleContent != null ) {
                msgs = ( ( InternalEObject ) newParentFunctionRoleContent ).eInverseAdd( this,
                        AsdPackage.FUNCTION_ROLE_CONTENT__POWER_SYSTEM_RELATION_REF, FunctionRoleContent.class, msgs );
            }
            msgs = basicSetParentFunctionRoleContent( newParentFunctionRoleContent, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT, newParentFunctionRoleContent,
                    newParentFunctionRoleContent ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemRelation getRefersToPowerSystemRelation() {
        if( refersToPowerSystemRelation != null && refersToPowerSystemRelation.eIsProxy() ) {
            InternalEObject oldRefersToPowerSystemRelation = ( InternalEObject ) refersToPowerSystemRelation;
            refersToPowerSystemRelation = ( PowerSystemRelation ) eResolveProxy( oldRefersToPowerSystemRelation );
            if( refersToPowerSystemRelation != oldRefersToPowerSystemRelation ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION,
                            oldRefersToPowerSystemRelation, refersToPowerSystemRelation ) );
                }
            }
        }
        return refersToPowerSystemRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerSystemRelation basicGetRefersToPowerSystemRelation() {
        return refersToPowerSystemRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToPowerSystemRelation( PowerSystemRelation newRefersToPowerSystemRelation,
            NotificationChain msgs ) {
        PowerSystemRelation oldRefersToPowerSystemRelation = refersToPowerSystemRelation;
        refersToPowerSystemRelation = newRefersToPowerSystemRelation;
        boolean oldRefersToPowerSystemRelationESet = refersToPowerSystemRelationESet;
        refersToPowerSystemRelationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION,
                    oldRefersToPowerSystemRelation, newRefersToPowerSystemRelation,
                    !oldRefersToPowerSystemRelationESet );
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
    public void setRefersToPowerSystemRelation( PowerSystemRelation newRefersToPowerSystemRelation ) {
        if( newRefersToPowerSystemRelation != refersToPowerSystemRelation ) {
            NotificationChain msgs = null;
            if( refersToPowerSystemRelation != null ) {
                msgs = ( ( InternalEObject ) refersToPowerSystemRelation ).eInverseRemove( this,
                        AsdPackage.POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF,
                        PowerSystemRelation.class, msgs );
            }
            if( newRefersToPowerSystemRelation != null ) {
                msgs = ( ( InternalEObject ) newRefersToPowerSystemRelation ).eInverseAdd( this,
                        AsdPackage.POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF,
                        PowerSystemRelation.class, msgs );
            }
            msgs = basicSetRefersToPowerSystemRelation( newRefersToPowerSystemRelation, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToPowerSystemRelationESet = refersToPowerSystemRelationESet;
            refersToPowerSystemRelationESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION,
                        newRefersToPowerSystemRelation, newRefersToPowerSystemRelation,
                        !oldRefersToPowerSystemRelationESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToPowerSystemRelation( NotificationChain msgs ) {
        PowerSystemRelation oldRefersToPowerSystemRelation = refersToPowerSystemRelation;
        refersToPowerSystemRelation = null;
        boolean oldRefersToPowerSystemRelationESet = refersToPowerSystemRelationESet;
        refersToPowerSystemRelationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION,
                    oldRefersToPowerSystemRelation, null, oldRefersToPowerSystemRelationESet );
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
    public void unsetRefersToPowerSystemRelation() {
        if( refersToPowerSystemRelation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToPowerSystemRelation ).eInverseRemove( this,
                    AsdPackage.POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF, PowerSystemRelation.class,
                    msgs );
            msgs = basicUnsetRefersToPowerSystemRelation( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToPowerSystemRelationESet = refersToPowerSystemRelationESet;
            refersToPowerSystemRelationESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION, null, null,
                        oldRefersToPowerSystemRelationESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToPowerSystemRelation() {
        return refersToPowerSystemRelationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionRoleContent( ( FunctionRoleContent ) otherEnd, msgs );
        case AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION:
            if( refersToPowerSystemRelation != null ) {
                msgs = ( ( InternalEObject ) refersToPowerSystemRelation ).eInverseRemove( this,
                        AsdPackage.POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF,
                        PowerSystemRelation.class, msgs );
            }
            return basicSetRefersToPowerSystemRelation( ( PowerSystemRelation ) otherEnd, msgs );
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
        case AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return basicSetParentFunctionRoleContent( null, msgs );
        case AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION:
            return basicUnsetRefersToPowerSystemRelation( msgs );
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
        case AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return eInternalContainer().eInverseRemove( this,
                    AsdPackage.FUNCTION_ROLE_CONTENT__POWER_SYSTEM_RELATION_REF, FunctionRoleContent.class, msgs );
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
        case AsdPackage.POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION:
            return getPowerSystemRelation();
        case AsdPackage.POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION_UUID:
            return getPowerSystemRelationUuid();
        case AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent();
        case AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION:
            if( resolve ) {
                return getRefersToPowerSystemRelation();
            }
            return basicGetRefersToPowerSystemRelation();
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
        case AsdPackage.POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION:
            setPowerSystemRelation( ( String ) newValue );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION_UUID:
            setPowerSystemRelationUuid( ( String ) newValue );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) newValue );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION:
            setRefersToPowerSystemRelation( ( PowerSystemRelation ) newValue );
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
        case AsdPackage.POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION:
            setPowerSystemRelation( POWER_SYSTEM_RELATION_EDEFAULT );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION_UUID:
            setPowerSystemRelationUuid( POWER_SYSTEM_RELATION_UUID_EDEFAULT );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) null );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION:
            unsetRefersToPowerSystemRelation();
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
        case AsdPackage.POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION:
            return POWER_SYSTEM_RELATION_EDEFAULT == null ? powerSystemRelation != null
                    : !POWER_SYSTEM_RELATION_EDEFAULT.equals( powerSystemRelation );
        case AsdPackage.POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION_UUID:
            return POWER_SYSTEM_RELATION_UUID_EDEFAULT == null ? powerSystemRelationUuid != null
                    : !POWER_SYSTEM_RELATION_UUID_EDEFAULT.equals( powerSystemRelationUuid );
        case AsdPackage.POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent() != null;
        case AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION:
            return isSetRefersToPowerSystemRelation();
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
        result.append( " (powerSystemRelation: " );
        result.append( powerSystemRelation );
        result.append( ", powerSystemRelationUuid: " );
        result.append( powerSystemRelationUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "PowerSystemRelationRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from PowerSystemRelationRef: ";
        doBuildExplicitLinkWithPowerSystemRelation( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithPowerSystemRelation( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for PowerSystemRelation) ";

        SCL sclRoot = AsdUtilities.getSCL( this );

        if( getPowerSystemRelationUuid() != null && !getPowerSystemRelationUuid().isEmpty() ) {
            List< PowerSystemRelation > res = new ArrayList<>();

            TreeIterator< EObject > it = sclRoot.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( o instanceof PowerSystemRelation
                        && getPowerSystemRelationUuid().equals( ( ( PowerSystemRelation ) o ).getUuid() ) ) {
                    res.add( ( PowerSystemRelation ) o );
                }
            }

            if( res.size() == 1 ) {
                setRefersToPowerSystemRelation( res.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "PowerSystemRelationRef refers to PowerSystemRelation( name = ", getPowerSystemRelationUuid(),
                        " ) on line ",
                        getRefersToPowerSystemRelation().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                //         " PowerSystemRelation( uuid = ", getPowerSystemRelationUuid(), " )" );
            }

        }
        else if( getPowerSystemRelation() != null && !getPowerSystemRelation().isEmpty() ) {

            String[] powerSystemRelationPath = getPowerSystemRelation().split( "/" );

            Pair< LNodeContainer, Integer > res1 = AsdUtilities.getLNodeContainer(
                    sclRoot,
                    Arrays.copyOf( powerSystemRelationPath, powerSystemRelationPath.length - 1 ) );
            if( res1.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res1.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "Function( name = ", powerSystemRelationPath[powerSystemRelationPath.length - 2], " )" );
                return;
            }
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found Function( name = ",
                    powerSystemRelationPath[powerSystemRelationPath.length - 2], " ) on line ",
                    res1.getLeft().getLineNumber() );

            List< PowerSystemRelation > res2 = res1.getLeft().getPrivate()
                    .stream()
                    .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                    .map( Private::getAsdObjects )
                    .flatMap( Collection::stream )
                    .filter( o -> o instanceof PowerSystemRelations )
                    .map( p -> ( ( PowerSystemRelations ) p ).getPowerSystemRelation() )
                    .flatMap( Collection::stream )
                    .filter( p -> powerSystemRelationPath[powerSystemRelationPath.length - 1]
                            .equals( p.getName() ) )
                    .toList();

            if( res2.size() != 1 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res2.size() == 0 ) ? "cannot find" : "found several" ),
                //         " PowerSystemRelation( name = ", powerSystemRelationPath[powerSystemRelationPath.length - 1], " )" );
                return;
            }

            setRefersToPowerSystemRelation( res2.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "PowerSystemRelationRef refers to PowerSystemRelation( id = ",
                    powerSystemRelationPath[powerSystemRelationPath.length - 1], " )", " on line ",
                    getRefersToPowerSystemRelation().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix,
                    "link not resolved because powerSystemRelation and powerSystemRelationUuid are missing" );
        }

    }

} //PowerSystemRelationRefImpl
