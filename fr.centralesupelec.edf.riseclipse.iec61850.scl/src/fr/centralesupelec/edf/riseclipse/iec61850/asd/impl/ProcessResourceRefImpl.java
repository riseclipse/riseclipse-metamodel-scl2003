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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Resource Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceRefImpl#getProcessResource <em>Process Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceRefImpl#getProcessResourceUuid <em>Process Resource Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceRefImpl#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceRefImpl#getRefersToProcessResource <em>Refers To Process Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessResourceRefImpl extends FunctionalVariantRefContainerImpl implements ProcessResourceRef {
    /**
     * The default value of the '{@link #getProcessResource() <em>Process Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessResource()
     * @generated
     * @ordered
     */
    protected static final String PROCESS_RESOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcessResource() <em>Process Resource</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessResource()
     * @generated
     * @ordered
     */
    protected String processResource = PROCESS_RESOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #getProcessResourceUuid() <em>Process Resource Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessResourceUuid()
     * @generated
     * @ordered
     */
    protected static final String PROCESS_RESOURCE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcessResourceUuid() <em>Process Resource Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessResourceUuid()
     * @generated
     * @ordered
     */
    protected String processResourceUuid = PROCESS_RESOURCE_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefersToProcessResource() <em>Refers To Process Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToProcessResource()
     * @generated
     * @ordered
     */
    protected ProcessResource refersToProcessResource;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessResourceRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getProcessResourceRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getProcessResource() {
        return processResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProcessResource( String newProcessResource ) {
        String oldProcessResource = processResource;
        processResource = newProcessResource;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_RESOURCE_REF__PROCESS_RESOURCE,
                    oldProcessResource, processResource ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getProcessResourceUuid() {
        return processResourceUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProcessResourceUuid( String newProcessResourceUuid ) {
        String oldProcessResourceUuid = processResourceUuid;
        processResourceUuid = newProcessResourceUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.PROCESS_RESOURCE_REF__PROCESS_RESOURCE_UUID, oldProcessResourceUuid,
                    processResourceUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FunctionRoleContent getParentFunctionRoleContent() {
        if( eContainerFeatureID() != AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT ) {
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
                AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT
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
                        AsdPackage.FUNCTION_ROLE_CONTENT__PROCESS_RESOURCE_REF, FunctionRoleContent.class, msgs );
            }
            msgs = basicSetParentFunctionRoleContent( newParentFunctionRoleContent, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT, newParentFunctionRoleContent,
                    newParentFunctionRoleContent ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProcessResource getRefersToProcessResource() {
        if( refersToProcessResource != null && refersToProcessResource.eIsProxy() ) {
            InternalEObject oldRefersToProcessResource = ( InternalEObject ) refersToProcessResource;
            refersToProcessResource = ( ProcessResource ) eResolveProxy( oldRefersToProcessResource );
            if( refersToProcessResource != oldRefersToProcessResource ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.PROCESS_RESOURCE_REF__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource,
                            refersToProcessResource ) );
                }
            }
        }
        return refersToProcessResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessResource basicGetRefersToProcessResource() {
        return refersToProcessResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToProcessResource( ProcessResource newRefersToProcessResource,
            NotificationChain msgs ) {
        ProcessResource oldRefersToProcessResource = refersToProcessResource;
        refersToProcessResource = newRefersToProcessResource;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.PROCESS_RESOURCE_REF__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource,
                    newRefersToProcessResource );
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
    public void setRefersToProcessResource( ProcessResource newRefersToProcessResource ) {
        if( newRefersToProcessResource != refersToProcessResource ) {
            NotificationChain msgs = null;
            if( refersToProcessResource != null ) {
                msgs = ( ( InternalEObject ) refersToProcessResource ).eInverseRemove( this,
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_PROCESS_RESOURCE_REF, ProcessResource.class, msgs );
            }
            if( newRefersToProcessResource != null ) {
                msgs = ( ( InternalEObject ) newRefersToProcessResource ).eInverseAdd( this,
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_PROCESS_RESOURCE_REF, ProcessResource.class, msgs );
            }
            msgs = basicSetRefersToProcessResource( newRefersToProcessResource, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.PROCESS_RESOURCE_REF__REFERS_TO_PROCESS_RESOURCE, newRefersToProcessResource,
                    newRefersToProcessResource ) );
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
        case AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentFunctionRoleContent( ( FunctionRoleContent ) otherEnd, msgs );
        case AsdPackage.PROCESS_RESOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            if( refersToProcessResource != null ) {
                msgs = ( ( InternalEObject ) refersToProcessResource ).eInverseRemove( this,
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_PROCESS_RESOURCE_REF, ProcessResource.class, msgs );
            }
            return basicSetRefersToProcessResource( ( ProcessResource ) otherEnd, msgs );
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
        case AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return basicSetParentFunctionRoleContent( null, msgs );
        case AsdPackage.PROCESS_RESOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            return basicSetRefersToProcessResource( null, msgs );
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
        case AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return eInternalContainer().eInverseRemove( this, AsdPackage.FUNCTION_ROLE_CONTENT__PROCESS_RESOURCE_REF,
                    FunctionRoleContent.class, msgs );
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
        case AsdPackage.PROCESS_RESOURCE_REF__PROCESS_RESOURCE:
            return getProcessResource();
        case AsdPackage.PROCESS_RESOURCE_REF__PROCESS_RESOURCE_UUID:
            return getProcessResourceUuid();
        case AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent();
        case AsdPackage.PROCESS_RESOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            if( resolve ) {
                return getRefersToProcessResource();
            }
            return basicGetRefersToProcessResource();
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
        case AsdPackage.PROCESS_RESOURCE_REF__PROCESS_RESOURCE:
            setProcessResource( ( String ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE_REF__PROCESS_RESOURCE_UUID:
            setProcessResourceUuid( ( String ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            setRefersToProcessResource( ( ProcessResource ) newValue );
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
        case AsdPackage.PROCESS_RESOURCE_REF__PROCESS_RESOURCE:
            setProcessResource( PROCESS_RESOURCE_EDEFAULT );
            return;
        case AsdPackage.PROCESS_RESOURCE_REF__PROCESS_RESOURCE_UUID:
            setProcessResourceUuid( PROCESS_RESOURCE_UUID_EDEFAULT );
            return;
        case AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            setParentFunctionRoleContent( ( FunctionRoleContent ) null );
            return;
        case AsdPackage.PROCESS_RESOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            setRefersToProcessResource( ( ProcessResource ) null );
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
        case AsdPackage.PROCESS_RESOURCE_REF__PROCESS_RESOURCE:
            return PROCESS_RESOURCE_EDEFAULT == null ? processResource != null
                    : !PROCESS_RESOURCE_EDEFAULT.equals( processResource );
        case AsdPackage.PROCESS_RESOURCE_REF__PROCESS_RESOURCE_UUID:
            return PROCESS_RESOURCE_UUID_EDEFAULT == null ? processResourceUuid != null
                    : !PROCESS_RESOURCE_UUID_EDEFAULT.equals( processResourceUuid );
        case AsdPackage.PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT:
            return getParentFunctionRoleContent() != null;
        case AsdPackage.PROCESS_RESOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            return refersToProcessResource != null;
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
        result.append( " (processResource: " );
        result.append( processResource );
        result.append( ", processResourceUuid: " );
        result.append( processResourceUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "ProcessResourceRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from ProcessResourceRef: ";
        doBuildExplicitLinkWithProcessResource( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithProcessResource( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for ProcessResource) ";

        SCL sclRoot = AsdUtilities.getSCL( this );

        if( getProcessResourceUuid() != null && !getProcessResourceUuid().isEmpty() ) {
            List< ProcessResource > refersToProcessResource = new ArrayList<>();

            TreeIterator< EObject > it = sclRoot.eAllContents();
            while( it.hasNext() ) {
                EObject o = it.next();
                if( o instanceof LNode && getProcessResourceUuid().equals( ( ( LNode ) o ).getUuid() ) ) {
                    refersToProcessResource.add( ( ProcessResource ) o );
                }
            }

            if( refersToProcessResource.size() == 1 ) {
                setRefersToProcessResource( refersToProcessResource.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "ProcessResourceRef refers to ProcessResource( uuid = ", getProcessResourceUuid(),
                        " ) on line ",
                        getRefersToProcessResource().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( refersToProcessResource.size() == 0 ) ? "cannot find" : "found several" ),
                //         " ProcessResource( uuid = ", getProcessResourceUuid(), " ) );
            }

        }
        else if( getProcessResource() != null && !getProcessResource().isEmpty() ) {
            String[] processResourcePath = getProcessResource().split( "/" );

            Pair< ProcessResource, Integer > processResource = AsdUtilities.getProcessResourceFromSCL( sclRoot,
                    processResourcePath );
            if( processResource.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( processResource.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "ProcessResource( name = ", processResourcePath[processResourcePath.length - 1], " )" );
                return;
            }

            setRefersToProcessResource( processResource.getLeft() );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "ProcessResourceRef refers to ProcessResource( name = ",
                    processResourcePath[processResourcePath.length - 1], " )", " on line ",
                    getRefersToProcessResource().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because processResource and processResourceUuid are missing" );
        }

    }

} //ProcessResourceRefImpl
