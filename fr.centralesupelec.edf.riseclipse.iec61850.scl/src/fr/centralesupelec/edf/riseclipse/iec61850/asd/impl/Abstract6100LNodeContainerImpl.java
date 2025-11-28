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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract6100 LNode Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.Abstract6100LNodeContainerImpl#getLNode <em>LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.Abstract6100LNodeContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.Abstract6100LNodeContainerImpl#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.Abstract6100LNodeContainerImpl#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.Abstract6100LNodeContainerImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Abstract6100LNodeContainerImpl extends BaseExtensionElementWithDescImpl
        implements Abstract6100LNodeContainer {
    /**
     * The cached value of the '{@link #getLNode() <em>LNode</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLNode()
     * @generated
     * @ordered
     */
    protected EList< LNode > lNode;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getOriginUuid() <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginUuid()
     * @generated
     * @ordered
     */
    protected static final String ORIGIN_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOriginUuid() <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOriginUuid()
     * @generated
     * @ordered
     */
    protected String originUuid = ORIGIN_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getTemplateUuid() <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateUuid()
     * @generated
     * @ordered
     */
    protected static final String TEMPLATE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTemplateUuid() <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTemplateUuid()
     * @generated
     * @ordered
     */
    protected String templateUuid = TEMPLATE_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUuid()
     * @generated
     * @ordered
     */
    protected static final String UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUuid()
     * @generated
     * @ordered
     */
    protected String uuid = UUID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Abstract6100LNodeContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getAbstract6100LNodeContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LNode > getLNode() {
        if( lNode == null ) {
            lNode = new EObjectContainmentWithInverseEList.Unsettable< LNode >( LNode.class, this,
                    AsdPackage.ABSTRACT6100_LNODE_CONTAINER__LNODE,
                    SclPackage.LNODE__PARENT_ABSTRACT6100_LNODE_CONTAINER );
        }
        return lNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLNode() {
        if( lNode != null ) ( ( InternalEList.Unsettable< ? > ) lNode ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLNode() {
        return lNode != null && ( ( InternalEList.Unsettable< ? > ) lNode ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.ABSTRACT6100_LNODE_CONTAINER__NAME,
                    oldName, name ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOriginUuid() {
        return originUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOriginUuid( String newOriginUuid ) {
        String oldOriginUuid = originUuid;
        originUuid = newOriginUuid;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.ABSTRACT6100_LNODE_CONTAINER__ORIGIN_UUID, oldOriginUuid, originUuid ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTemplateUuid() {
        return templateUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTemplateUuid( String newTemplateUuid ) {
        String oldTemplateUuid = templateUuid;
        templateUuid = newTemplateUuid;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.ABSTRACT6100_LNODE_CONTAINER__TEMPLATE_UUID, oldTemplateUuid, templateUuid ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUuid() {
        return uuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUuid( String newUuid ) {
        String oldUuid = uuid;
        uuid = newUuid;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.ABSTRACT6100_LNODE_CONTAINER__UUID,
                    oldUuid, uuid ) );
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
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__LNODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLNode() ).basicAdd( otherEnd,
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
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__LNODE:
            return ( ( InternalEList< ? > ) getLNode() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__LNODE:
            return getLNode();
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__NAME:
            return getName();
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__ORIGIN_UUID:
            return getOriginUuid();
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__TEMPLATE_UUID:
            return getTemplateUuid();
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__UUID:
            return getUuid();
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
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__LNODE:
            getLNode().clear();
            getLNode().addAll( ( Collection< ? extends LNode > ) newValue );
            return;
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__ORIGIN_UUID:
            setOriginUuid( ( String ) newValue );
            return;
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__TEMPLATE_UUID:
            setTemplateUuid( ( String ) newValue );
            return;
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__UUID:
            setUuid( ( String ) newValue );
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
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__LNODE:
            unsetLNode();
            return;
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__NAME:
            setName( NAME_EDEFAULT );
            return;
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__ORIGIN_UUID:
            setOriginUuid( ORIGIN_UUID_EDEFAULT );
            return;
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__TEMPLATE_UUID:
            setTemplateUuid( TEMPLATE_UUID_EDEFAULT );
            return;
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__UUID:
            setUuid( UUID_EDEFAULT );
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
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__LNODE:
            return isSetLNode();
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__ORIGIN_UUID:
            return ORIGIN_UUID_EDEFAULT == null ? originUuid != null : !ORIGIN_UUID_EDEFAULT.equals( originUuid );
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__TEMPLATE_UUID:
            return TEMPLATE_UUID_EDEFAULT == null ? templateUuid != null
                    : !TEMPLATE_UUID_EDEFAULT.equals( templateUuid );
        case AsdPackage.ABSTRACT6100_LNODE_CONTAINER__UUID:
            return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals( uuid );
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
        result.append( " (name: " );
        result.append( name );
        result.append( ", originUuid: " );
        result.append( originUuid );
        result.append( ", templateUuid: " );
        result.append( templateUuid );
        result.append( ", uuid: " );
        result.append( uuid );
        result.append( ')' );
        return result.toString();
    }

} //Abstract6100LNodeContainerImpl
