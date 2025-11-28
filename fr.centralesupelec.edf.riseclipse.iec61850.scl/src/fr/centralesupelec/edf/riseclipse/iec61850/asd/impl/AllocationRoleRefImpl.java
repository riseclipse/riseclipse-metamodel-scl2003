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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Application;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Role Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AllocationRoleRefImpl#getAllocationRole <em>Allocation Role</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AllocationRoleRefImpl#getAllocationRoleUuid <em>Allocation Role Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AllocationRoleRefImpl#getParentApplication <em>Parent Application</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AllocationRoleRefImpl#getRefersToAllocationRole <em>Refers To Allocation Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationRoleRefImpl extends FunctionalVariantRefContainerImpl implements AllocationRoleRef {
    /**
     * The default value of the '{@link #getAllocationRole() <em>Allocation Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllocationRole()
     * @generated
     * @ordered
     */
    protected static final String ALLOCATION_ROLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAllocationRole() <em>Allocation Role</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllocationRole()
     * @generated
     * @ordered
     */
    protected String allocationRole = ALLOCATION_ROLE_EDEFAULT;

    /**
     * The default value of the '{@link #getAllocationRoleUuid() <em>Allocation Role Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllocationRoleUuid()
     * @generated
     * @ordered
     */
    protected static final String ALLOCATION_ROLE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAllocationRoleUuid() <em>Allocation Role Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllocationRoleUuid()
     * @generated
     * @ordered
     */
    protected String allocationRoleUuid = ALLOCATION_ROLE_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToAllocationRole() <em>Refers To Allocation Role</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAllocationRole()
     * @generated
     * @ordered
     */
    protected AllocationRole refersToAllocationRole;

    /**
     * This is true if the Refers To Allocation Role reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAllocationRoleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AllocationRoleRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getAllocationRoleRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAllocationRole() {
        return allocationRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAllocationRole( String newAllocationRole ) {
        String oldAllocationRole = allocationRole;
        allocationRole = newAllocationRole;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.ALLOCATION_ROLE_REF__ALLOCATION_ROLE,
                    oldAllocationRole, allocationRole ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAllocationRoleUuid() {
        return allocationRoleUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAllocationRoleUuid( String newAllocationRoleUuid ) {
        String oldAllocationRoleUuid = allocationRoleUuid;
        allocationRoleUuid = newAllocationRoleUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.ALLOCATION_ROLE_REF__ALLOCATION_ROLE_UUID, oldAllocationRoleUuid, allocationRoleUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Application getParentApplication() {
        if( eContainerFeatureID() != AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION ) {
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
                AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION
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
                        AsdPackage.APPLICATION__ALLOCATION_ROLE_REF, Application.class, msgs );
            }
            msgs = basicSetParentApplication( newParentApplication, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION,
                    newParentApplication, newParentApplication ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AllocationRole getRefersToAllocationRole() {
        if( refersToAllocationRole != null && refersToAllocationRole.eIsProxy() ) {
            InternalEObject oldRefersToAllocationRole = ( InternalEObject ) refersToAllocationRole;
            refersToAllocationRole = ( AllocationRole ) eResolveProxy( oldRefersToAllocationRole );
            if( refersToAllocationRole != oldRefersToAllocationRole ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE, oldRefersToAllocationRole,
                            refersToAllocationRole ) );
                }
            }
        }
        return refersToAllocationRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AllocationRole basicGetRefersToAllocationRole() {
        return refersToAllocationRole;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAllocationRole( AllocationRole newRefersToAllocationRole,
            NotificationChain msgs ) {
        AllocationRole oldRefersToAllocationRole = refersToAllocationRole;
        refersToAllocationRole = newRefersToAllocationRole;
        boolean oldRefersToAllocationRoleESet = refersToAllocationRoleESet;
        refersToAllocationRoleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE, oldRefersToAllocationRole,
                    newRefersToAllocationRole, !oldRefersToAllocationRoleESet );
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
    public void setRefersToAllocationRole( AllocationRole newRefersToAllocationRole ) {
        if( newRefersToAllocationRole != refersToAllocationRole ) {
            NotificationChain msgs = null;
            if( refersToAllocationRole != null ) {
                msgs = ( ( InternalEObject ) refersToAllocationRole ).eInverseRemove( this,
                        AsdPackage.ALLOCATION_ROLE__REFERRED_BY_ALLOCATION_ROLE_REF, AllocationRole.class, msgs );
            }
            if( newRefersToAllocationRole != null ) {
                msgs = ( ( InternalEObject ) newRefersToAllocationRole ).eInverseAdd( this,
                        AsdPackage.ALLOCATION_ROLE__REFERRED_BY_ALLOCATION_ROLE_REF, AllocationRole.class, msgs );
            }
            msgs = basicSetRefersToAllocationRole( newRefersToAllocationRole, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAllocationRoleESet = refersToAllocationRoleESet;
            refersToAllocationRoleESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE, newRefersToAllocationRole,
                        newRefersToAllocationRole, !oldRefersToAllocationRoleESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAllocationRole( NotificationChain msgs ) {
        AllocationRole oldRefersToAllocationRole = refersToAllocationRole;
        refersToAllocationRole = null;
        boolean oldRefersToAllocationRoleESet = refersToAllocationRoleESet;
        refersToAllocationRoleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE, oldRefersToAllocationRole, null,
                    oldRefersToAllocationRoleESet );
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
    public void unsetRefersToAllocationRole() {
        if( refersToAllocationRole != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToAllocationRole ).eInverseRemove( this,
                    AsdPackage.ALLOCATION_ROLE__REFERRED_BY_ALLOCATION_ROLE_REF, AllocationRole.class, msgs );
            msgs = basicUnsetRefersToAllocationRole( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAllocationRoleESet = refersToAllocationRoleESet;
            refersToAllocationRoleESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE, null, null,
                        oldRefersToAllocationRoleESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAllocationRole() {
        return refersToAllocationRoleESet;
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
        case AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentApplication( ( Application ) otherEnd, msgs );
        case AsdPackage.ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE:
            if( refersToAllocationRole != null ) {
                msgs = ( ( InternalEObject ) refersToAllocationRole ).eInverseRemove( this,
                        AsdPackage.ALLOCATION_ROLE__REFERRED_BY_ALLOCATION_ROLE_REF, AllocationRole.class, msgs );
            }
            return basicSetRefersToAllocationRole( ( AllocationRole ) otherEnd, msgs );
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
        case AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION:
            return basicSetParentApplication( null, msgs );
        case AsdPackage.ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE:
            return basicUnsetRefersToAllocationRole( msgs );
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
        case AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION:
            return eInternalContainer().eInverseRemove( this, AsdPackage.APPLICATION__ALLOCATION_ROLE_REF,
                    Application.class, msgs );
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
        case AsdPackage.ALLOCATION_ROLE_REF__ALLOCATION_ROLE:
            return getAllocationRole();
        case AsdPackage.ALLOCATION_ROLE_REF__ALLOCATION_ROLE_UUID:
            return getAllocationRoleUuid();
        case AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION:
            return getParentApplication();
        case AsdPackage.ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE:
            if( resolve ) {
                return getRefersToAllocationRole();
            }
            return basicGetRefersToAllocationRole();
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
        case AsdPackage.ALLOCATION_ROLE_REF__ALLOCATION_ROLE:
            setAllocationRole( ( String ) newValue );
            return;
        case AsdPackage.ALLOCATION_ROLE_REF__ALLOCATION_ROLE_UUID:
            setAllocationRoleUuid( ( String ) newValue );
            return;
        case AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION:
            setParentApplication( ( Application ) newValue );
            return;
        case AsdPackage.ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE:
            setRefersToAllocationRole( ( AllocationRole ) newValue );
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
        case AsdPackage.ALLOCATION_ROLE_REF__ALLOCATION_ROLE:
            setAllocationRole( ALLOCATION_ROLE_EDEFAULT );
            return;
        case AsdPackage.ALLOCATION_ROLE_REF__ALLOCATION_ROLE_UUID:
            setAllocationRoleUuid( ALLOCATION_ROLE_UUID_EDEFAULT );
            return;
        case AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION:
            setParentApplication( ( Application ) null );
            return;
        case AsdPackage.ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE:
            unsetRefersToAllocationRole();
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
        case AsdPackage.ALLOCATION_ROLE_REF__ALLOCATION_ROLE:
            return ALLOCATION_ROLE_EDEFAULT == null ? allocationRole != null
                    : !ALLOCATION_ROLE_EDEFAULT.equals( allocationRole );
        case AsdPackage.ALLOCATION_ROLE_REF__ALLOCATION_ROLE_UUID:
            return ALLOCATION_ROLE_UUID_EDEFAULT == null ? allocationRoleUuid != null
                    : !ALLOCATION_ROLE_UUID_EDEFAULT.equals( allocationRoleUuid );
        case AsdPackage.ALLOCATION_ROLE_REF__PARENT_APPLICATION:
            return getParentApplication() != null;
        case AsdPackage.ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE:
            return isSetRefersToAllocationRole();
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
        result.append( " (allocationRole: " );
        result.append( allocationRole );
        result.append( ", allocationRoleUuid: " );
        result.append( allocationRoleUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "AllocationRoleRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from AllocationRoleRef: ";
        doBuildExplicitLinkWithAllocationRole( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithAllocationRole( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for AllocationRole) ";

        SCL sclRoot = AsdUtilities.getSCL( this );

        if( getAllocationRoleUuid() != null && !getAllocationRoleUuid().isEmpty() ) {
            List< AllocationRole > refersToAllocationRole = new ArrayList<>();

            TreeIterator< EObject > it = sclRoot.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( o instanceof LNode && getAllocationRoleUuid().equals( ( ( LNode ) o ).getUuid() ) ) {
                    refersToAllocationRole.add( ( AllocationRole ) o );
                }
            }

            if( refersToAllocationRole.size() == 1 ) {
                setRefersToAllocationRole( refersToAllocationRole.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "AllocationRoleRef refers to AllocationRole( uuid = ", getAllocationRoleUuid(),
                        " ) on line ",
                        getRefersToAllocationRole().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( refersToAllocationRole.size() == 0 ) ? "cannot find" : "found several" ),
                //         " AllocationRole( uuid = ", getAllocationRoleUuid(), " ) );
            }

        }
        else if( getAllocationRole() != null && !getAllocationRole().isEmpty() ) {
            String[] allocationRolePath = getAllocationRole().split( "/" );

            Pair< AllocationRole, Integer > allocationRole = getAllocationRoleFromSCL( sclRoot,
                    allocationRolePath );
            if( allocationRole.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( allocationRole.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "AllocationRole( name = ", allocationRolePath[allocationRolePath.length - 1], " )" );
                return;
            }

            setRefersToAllocationRole( allocationRole.getLeft() );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "AllocationRoleRef refers to AllocationRole( name = ",
                    allocationRolePath[allocationRolePath.length - 1], " )", " on line ",
                    getRefersToAllocationRole().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because allocationRole and allocationRoleUuid are missing" );
        }

    }

    private static Pair< AllocationRole, Integer > getAllocationRoleFromSCL( SCL sclRoot, String[] path ) {
        if( path.length < 2 ) {
            return Pair.of( null, 0 );
        }

        String name = path[0];
        List< LNodeContainer > res = sclRoot.eContents().stream()
                .filter( o -> o instanceof LNodeContainer && name.equals( ( ( LNodeContainer ) o ).getName() ) )
                .map( o -> ( LNodeContainer ) o )
                .toList();

        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }

        LNodeContainer lnodeContainer = res.get( 0 );

        for( int i = 1; i < path.length - 1; i++ ) {
            String name1 = path[i];
            List< LNodeContainer > res1 = lnodeContainer.eContents().stream()
                    .filter( o -> o instanceof LNodeContainer && name1.equals( ( ( LNodeContainer ) o ).getName() ) )
                    .map( o -> ( LNodeContainer ) o )
                    .toList();

            if( res1.size() != 1 ) {
                return Pair.of( null, res1.size() );
            }

            lnodeContainer = res1.get( 0 );
        }

        List< AllocationRole > res2 = lnodeContainer.getPrivate()
                .stream()
                .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                .map( Private::getAsdObjects )
                .flatMap( Collection::stream )
                .filter( o -> o instanceof AllocationRole
                        && path[path.length - 1].equals( ( ( AllocationRole ) o ).getName() ) )
                .map( a -> ( AllocationRole ) a )
                .toList();

        if( res2.size() != 1 ) {
            return Pair.of( null, res2.size() );
        }

        return Pair.of( res2.get( 0 ), 1 );
    }

} //AllocationRoleRefImpl
