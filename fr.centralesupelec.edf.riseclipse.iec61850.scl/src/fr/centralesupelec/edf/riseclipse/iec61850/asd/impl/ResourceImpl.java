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
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ResourceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ResourceImpl#getResInst <em>Res Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ResourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ResourceImpl#getSourceUuid <em>Source Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ResourceImpl#getParentProcessResource <em>Parent Process Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends AsdObjectImpl implements Resource {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getResInst() <em>Res Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResInst()
     * @generated
     * @ordered
     */
    protected static final int RES_INST_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getResInst() <em>Res Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResInst()
     * @generated
     * @ordered
     */
    protected int resInst = RES_INST_EDEFAULT;

    /**
     * This is true if the Res Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean resInstESet;

    /**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected String source = SOURCE_EDEFAULT;

    /**
     * The default value of the '{@link #getSourceUuid() <em>Source Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceUuid()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceUuid() <em>Source Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceUuid()
     * @generated
     * @ordered
     */
    protected String sourceUuid = SOURCE_UUID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getResource();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( String newValue ) {
        String oldValue = value;
        value = newValue;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.RESOURCE__VALUE, oldValue, value ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getResInst() {
        return resInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResInst( int newResInst ) {
        int oldResInst = resInst;
        resInst = newResInst;
        boolean oldResInstESet = resInstESet;
        resInstESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.RESOURCE__RES_INST, oldResInst, resInst,
                    !oldResInstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetResInst() {
        int oldResInst = resInst;
        boolean oldResInstESet = resInstESet;
        resInst = RES_INST_EDEFAULT;
        resInstESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.RESOURCE__RES_INST, oldResInst,
                    RES_INST_EDEFAULT, oldResInstESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetResInst() {
        return resInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSource( String newSource ) {
        String oldSource = source;
        source = newSource;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.RESOURCE__SOURCE, oldSource, source ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSourceUuid() {
        return sourceUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSourceUuid( String newSourceUuid ) {
        String oldSourceUuid = sourceUuid;
        sourceUuid = newSourceUuid;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.RESOURCE__SOURCE_UUID, oldSourceUuid,
                    sourceUuid ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProcessResource getParentProcessResource() {
        if( eContainerFeatureID() != AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE ) return null;
        return ( ProcessResource ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentProcessResource( ProcessResource newParentProcessResource,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentProcessResource,
                AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentProcessResource( ProcessResource newParentProcessResource ) {
        if( newParentProcessResource != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE
                        && newParentProcessResource != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentProcessResource ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentProcessResource != null )
                msgs = ( ( InternalEObject ) newParentProcessResource ).eInverseAdd( this,
                        AsdPackage.PROCESS_RESOURCE__RESOURCE, ProcessResource.class, msgs );
            msgs = basicSetParentProcessResource( newParentProcessResource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE,
                    newParentProcessResource, newParentProcessResource ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentProcessResource( ( ProcessResource ) otherEnd, msgs );
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
        case AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE:
            return basicSetParentProcessResource( null, msgs );
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
        case AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE:
            return eInternalContainer().eInverseRemove( this, AsdPackage.PROCESS_RESOURCE__RESOURCE,
                    ProcessResource.class, msgs );
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
        case AsdPackage.RESOURCE__VALUE:
            return getValue();
        case AsdPackage.RESOURCE__RES_INST:
            return getResInst();
        case AsdPackage.RESOURCE__SOURCE:
            return getSource();
        case AsdPackage.RESOURCE__SOURCE_UUID:
            return getSourceUuid();
        case AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE:
            return getParentProcessResource();
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
        case AsdPackage.RESOURCE__VALUE:
            setValue( ( String ) newValue );
            return;
        case AsdPackage.RESOURCE__RES_INST:
            setResInst( ( Integer ) newValue );
            return;
        case AsdPackage.RESOURCE__SOURCE:
            setSource( ( String ) newValue );
            return;
        case AsdPackage.RESOURCE__SOURCE_UUID:
            setSourceUuid( ( String ) newValue );
            return;
        case AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE:
            setParentProcessResource( ( ProcessResource ) newValue );
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
        case AsdPackage.RESOURCE__VALUE:
            setValue( VALUE_EDEFAULT );
            return;
        case AsdPackage.RESOURCE__RES_INST:
            unsetResInst();
            return;
        case AsdPackage.RESOURCE__SOURCE:
            setSource( SOURCE_EDEFAULT );
            return;
        case AsdPackage.RESOURCE__SOURCE_UUID:
            setSourceUuid( SOURCE_UUID_EDEFAULT );
            return;
        case AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE:
            setParentProcessResource( ( ProcessResource ) null );
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
        case AsdPackage.RESOURCE__VALUE:
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals( value );
        case AsdPackage.RESOURCE__RES_INST:
            return isSetResInst();
        case AsdPackage.RESOURCE__SOURCE:
            return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals( source );
        case AsdPackage.RESOURCE__SOURCE_UUID:
            return SOURCE_UUID_EDEFAULT == null ? sourceUuid != null : !SOURCE_UUID_EDEFAULT.equals( sourceUuid );
        case AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE:
            return getParentProcessResource() != null;
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
        result.append( " (value: " );
        result.append( value );
        result.append( ", resInst: " );
        if( resInstESet )
            result.append( resInst );
        else
            result.append( "<unset>" );
        result.append( ", source: " );
        result.append( source );
        result.append( ", sourceUuid: " );
        result.append( sourceUuid );
        result.append( ')' );
        return result.toString();
    }

} //ResourceImpl
