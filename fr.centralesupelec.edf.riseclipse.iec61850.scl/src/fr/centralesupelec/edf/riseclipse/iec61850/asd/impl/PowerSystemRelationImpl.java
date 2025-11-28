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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power System Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationImpl#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationImpl#getRelationUuid <em>Relation Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationImpl#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationImpl#getParentPowerSystemRelation <em>Parent Power System Relation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationImpl#getReferredByPowerSystemRelationRef <em>Referred By Power System Relation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSystemRelationImpl extends BaseExtensionElementWithDescImpl implements PowerSystemRelation {
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
     * The default value of the '{@link #getRelation() <em>Relation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelation()
     * @generated
     * @ordered
     */
    protected static final String RELATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRelation() <em>Relation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelation()
     * @generated
     * @ordered
     */
    protected String relation = RELATION_EDEFAULT;

    /**
     * The default value of the '{@link #getRelationUuid() <em>Relation Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelationUuid()
     * @generated
     * @ordered
     */
    protected static final String RELATION_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRelationUuid() <em>Relation Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelationUuid()
     * @generated
     * @ordered
     */
    protected String relationUuid = RELATION_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelector()
     * @generated
     * @ordered
     */
    protected static final String SELECTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSelector()
     * @generated
     * @ordered
     */
    protected String selector = SELECTOR_EDEFAULT;

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
     * The cached value of the '{@link #getReferredByPowerSystemRelationRef() <em>Referred By Power System Relation Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByPowerSystemRelationRef()
     * @generated
     * @ordered
     */
    protected EList< PowerSystemRelationRef > referredByPowerSystemRelationRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerSystemRelationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getPowerSystemRelation();
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.POWER_SYSTEM_RELATION__NAME, oldName,
                    name ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.POWER_SYSTEM_RELATION__ORIGIN_UUID,
                    oldOriginUuid, originUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRelation() {
        return relation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelation( String newRelation ) {
        String oldRelation = relation;
        relation = newRelation;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.POWER_SYSTEM_RELATION__RELATION,
                    oldRelation, relation ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRelationUuid() {
        return relationUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelationUuid( String newRelationUuid ) {
        String oldRelationUuid = relationUuid;
        relationUuid = newRelationUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.POWER_SYSTEM_RELATION__RELATION_UUID,
                    oldRelationUuid, relationUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSelector() {
        return selector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSelector( String newSelector ) {
        String oldSelector = selector;
        selector = newSelector;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.POWER_SYSTEM_RELATION__SELECTOR,
                    oldSelector, selector ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.POWER_SYSTEM_RELATION__TEMPLATE_UUID,
                    oldTemplateUuid, templateUuid ) );
        }
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.POWER_SYSTEM_RELATION__UUID, oldUuid,
                    uuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemRelations getParentPowerSystemRelation() {
        if( eContainerFeatureID() != AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION ) {
            return null;
        }
        return ( PowerSystemRelations ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentPowerSystemRelation( PowerSystemRelations newParentPowerSystemRelation,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentPowerSystemRelation,
                AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentPowerSystemRelation( PowerSystemRelations newParentPowerSystemRelation ) {
        if( newParentPowerSystemRelation != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION
                        && newParentPowerSystemRelation != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentPowerSystemRelation ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentPowerSystemRelation != null ) {
                msgs = ( ( InternalEObject ) newParentPowerSystemRelation ).eInverseAdd( this,
                        AsdPackage.POWER_SYSTEM_RELATIONS__POWER_SYSTEM_RELATION, PowerSystemRelations.class, msgs );
            }
            msgs = basicSetParentPowerSystemRelation( newParentPowerSystemRelation, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION, newParentPowerSystemRelation,
                    newParentPowerSystemRelation ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerSystemRelationRef > getReferredByPowerSystemRelationRef() {
        if( referredByPowerSystemRelationRef == null ) {
            referredByPowerSystemRelationRef = new EObjectWithInverseResolvingEList.Unsettable< >(
                    PowerSystemRelationRef.class, this,
                    AsdPackage.POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF,
                    AsdPackage.POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION );
        }
        return referredByPowerSystemRelationRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByPowerSystemRelationRef() {
        if( referredByPowerSystemRelationRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByPowerSystemRelationRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByPowerSystemRelationRef() {
        return referredByPowerSystemRelationRef != null
                && ( ( InternalEList.Unsettable< ? > ) referredByPowerSystemRelationRef ).isSet();
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
        case AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentPowerSystemRelation( ( PowerSystemRelations ) otherEnd, msgs );
        case AsdPackage.POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByPowerSystemRelationRef() )
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
        case AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION:
            return basicSetParentPowerSystemRelation( null, msgs );
        case AsdPackage.POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF:
            return ( ( InternalEList< ? > ) getReferredByPowerSystemRelationRef() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION:
            return eInternalContainer().eInverseRemove( this, AsdPackage.POWER_SYSTEM_RELATIONS__POWER_SYSTEM_RELATION,
                    PowerSystemRelations.class, msgs );
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
        case AsdPackage.POWER_SYSTEM_RELATION__NAME:
            return getName();
        case AsdPackage.POWER_SYSTEM_RELATION__ORIGIN_UUID:
            return getOriginUuid();
        case AsdPackage.POWER_SYSTEM_RELATION__RELATION:
            return getRelation();
        case AsdPackage.POWER_SYSTEM_RELATION__RELATION_UUID:
            return getRelationUuid();
        case AsdPackage.POWER_SYSTEM_RELATION__SELECTOR:
            return getSelector();
        case AsdPackage.POWER_SYSTEM_RELATION__TEMPLATE_UUID:
            return getTemplateUuid();
        case AsdPackage.POWER_SYSTEM_RELATION__UUID:
            return getUuid();
        case AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION:
            return getParentPowerSystemRelation();
        case AsdPackage.POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF:
            return getReferredByPowerSystemRelationRef();
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
        case AsdPackage.POWER_SYSTEM_RELATION__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__ORIGIN_UUID:
            setOriginUuid( ( String ) newValue );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__RELATION:
            setRelation( ( String ) newValue );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__RELATION_UUID:
            setRelationUuid( ( String ) newValue );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__SELECTOR:
            setSelector( ( String ) newValue );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__TEMPLATE_UUID:
            setTemplateUuid( ( String ) newValue );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__UUID:
            setUuid( ( String ) newValue );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION:
            setParentPowerSystemRelation( ( PowerSystemRelations ) newValue );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF:
            getReferredByPowerSystemRelationRef().clear();
            getReferredByPowerSystemRelationRef().addAll( ( Collection< ? extends PowerSystemRelationRef > ) newValue );
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
        case AsdPackage.POWER_SYSTEM_RELATION__NAME:
            setName( NAME_EDEFAULT );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__ORIGIN_UUID:
            setOriginUuid( ORIGIN_UUID_EDEFAULT );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__RELATION:
            setRelation( RELATION_EDEFAULT );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__RELATION_UUID:
            setRelationUuid( RELATION_UUID_EDEFAULT );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__SELECTOR:
            setSelector( SELECTOR_EDEFAULT );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__TEMPLATE_UUID:
            setTemplateUuid( TEMPLATE_UUID_EDEFAULT );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__UUID:
            setUuid( UUID_EDEFAULT );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION:
            setParentPowerSystemRelation( ( PowerSystemRelations ) null );
            return;
        case AsdPackage.POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF:
            unsetReferredByPowerSystemRelationRef();
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
        case AsdPackage.POWER_SYSTEM_RELATION__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case AsdPackage.POWER_SYSTEM_RELATION__ORIGIN_UUID:
            return ORIGIN_UUID_EDEFAULT == null ? originUuid != null : !ORIGIN_UUID_EDEFAULT.equals( originUuid );
        case AsdPackage.POWER_SYSTEM_RELATION__RELATION:
            return RELATION_EDEFAULT == null ? relation != null : !RELATION_EDEFAULT.equals( relation );
        case AsdPackage.POWER_SYSTEM_RELATION__RELATION_UUID:
            return RELATION_UUID_EDEFAULT == null ? relationUuid != null
                    : !RELATION_UUID_EDEFAULT.equals( relationUuid );
        case AsdPackage.POWER_SYSTEM_RELATION__SELECTOR:
            return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals( selector );
        case AsdPackage.POWER_SYSTEM_RELATION__TEMPLATE_UUID:
            return TEMPLATE_UUID_EDEFAULT == null ? templateUuid != null
                    : !TEMPLATE_UUID_EDEFAULT.equals( templateUuid );
        case AsdPackage.POWER_SYSTEM_RELATION__UUID:
            return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals( uuid );
        case AsdPackage.POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION:
            return getParentPowerSystemRelation() != null;
        case AsdPackage.POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF:
            return isSetReferredByPowerSystemRelationRef();
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
        result.append( " (name: " );
        result.append( name );
        result.append( ", originUuid: " );
        result.append( originUuid );
        result.append( ", relation: " );
        result.append( relation );
        result.append( ", relationUuid: " );
        result.append( relationUuid );
        result.append( ", selector: " );
        result.append( selector );
        result.append( ", templateUuid: " );
        result.append( templateUuid );
        result.append( ", uuid: " );
        result.append( uuid );
        result.append( ')' );
        return result.toString();
    }

} //PowerSystemRelationImpl
