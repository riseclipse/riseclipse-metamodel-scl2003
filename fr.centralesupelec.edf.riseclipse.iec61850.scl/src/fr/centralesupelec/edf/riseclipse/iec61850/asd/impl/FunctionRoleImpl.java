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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AgCardinality;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AgCardinalityWithSelector;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AgSelector;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AgUuidWithOrigin;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Application;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgUuid;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl#getMax <em>Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl#getFunctionRoleContent <em>Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl#getParentApplication <em>Parent Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionRoleImpl extends FunctionalVariantRefContainerImpl implements FunctionRole {
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
     * This is true if the Uuid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uuidESet;

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
     * This is true if the Template Uuid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean templateUuidESet;

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
     * This is true if the Origin Uuid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean originUuidESet;

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
     * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCardinality()
     * @generated
     * @ordered
     */
    protected static final CardinalityEnum CARDINALITY_EDEFAULT = CardinalityEnum._11;

    /**
     * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCardinality()
     * @generated
     * @ordered
     */
    protected CardinalityEnum cardinality = CARDINALITY_EDEFAULT;

    /**
     * This is true if the Cardinality attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cardinalityESet;

    /**
     * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected static final int MAX_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected int max = MAX_EDEFAULT;

    /**
     * The cached value of the '{@link #getFunctionRoleContent() <em>Function Role Content</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunctionRoleContent()
     * @generated
     * @ordered
     */
    protected EList< FunctionRoleContent > functionRoleContent;

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
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FunctionRoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getFunctionRole();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FunctionRoleContent > getFunctionRoleContent() {
        if( functionRoleContent == null ) {
            functionRoleContent = new EObjectContainmentWithInverseEList.Unsettable< >(
                    FunctionRoleContent.class, this, AsdPackage.FUNCTION_ROLE__FUNCTION_ROLE_CONTENT,
                    AsdPackage.FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE );
        }
        return functionRoleContent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunctionRoleContent() {
        if( functionRoleContent != null ) {
            ( ( InternalEList.Unsettable< ? > ) functionRoleContent ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunctionRoleContent() {
        return functionRoleContent != null && ( ( InternalEList.Unsettable< ? > ) functionRoleContent ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CardinalityEnum getCardinality() {
        return cardinality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCardinality( CardinalityEnum newCardinality ) {
        CardinalityEnum oldCardinality = cardinality;
        cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
        boolean oldCardinalityESet = cardinalityESet;
        cardinalityESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_ROLE__CARDINALITY,
                    oldCardinality, cardinality, !oldCardinalityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCardinality() {
        CardinalityEnum oldCardinality = cardinality;
        boolean oldCardinalityESet = cardinalityESet;
        cardinality = CARDINALITY_EDEFAULT;
        cardinalityESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.FUNCTION_ROLE__CARDINALITY,
                    oldCardinality, CARDINALITY_EDEFAULT, oldCardinalityESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCardinality() {
        return cardinalityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getMax() {
        return max;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMax( int newMax ) {
        int oldMax = max;
        max = newMax;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_ROLE__MAX, oldMax, max ) );
        }
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_ROLE__NAME, oldName, name ) );
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
        boolean oldOriginUuidESet = originUuidESet;
        originUuidESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_ROLE__ORIGIN_UUID,
                    oldOriginUuid, originUuid, !oldOriginUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOriginUuid() {
        String oldOriginUuid = originUuid;
        boolean oldOriginUuidESet = originUuidESet;
        originUuid = ORIGIN_UUID_EDEFAULT;
        originUuidESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.FUNCTION_ROLE__ORIGIN_UUID,
                    oldOriginUuid, ORIGIN_UUID_EDEFAULT, oldOriginUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOriginUuid() {
        return originUuidESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_ROLE__SELECTOR, oldSelector,
                    selector ) );
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
        boolean oldTemplateUuidESet = templateUuidESet;
        templateUuidESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_ROLE__TEMPLATE_UUID,
                    oldTemplateUuid, templateUuid, !oldTemplateUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTemplateUuid() {
        String oldTemplateUuid = templateUuid;
        boolean oldTemplateUuidESet = templateUuidESet;
        templateUuid = TEMPLATE_UUID_EDEFAULT;
        templateUuidESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.FUNCTION_ROLE__TEMPLATE_UUID,
                    oldTemplateUuid, TEMPLATE_UUID_EDEFAULT, oldTemplateUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTemplateUuid() {
        return templateUuidESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_ROLE__TYPE, oldType, type ) );
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
        boolean oldUuidESet = uuidESet;
        uuidESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_ROLE__UUID, oldUuid, uuid,
                    !oldUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUuid() {
        String oldUuid = uuid;
        boolean oldUuidESet = uuidESet;
        uuid = UUID_EDEFAULT;
        uuidESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.FUNCTION_ROLE__UUID, oldUuid,
                    UUID_EDEFAULT, oldUuidESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUuid() {
        return uuidESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Application getParentApplication() {
        if( eContainerFeatureID() != AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION ) {
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
                AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION
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
                        AsdPackage.APPLICATION__FUNCTION_ROLE, Application.class, msgs );
            }
            msgs = basicSetParentApplication( newParentApplication, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION,
                    newParentApplication, newParentApplication ) );
        }
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
        case AsdPackage.FUNCTION_ROLE__FUNCTION_ROLE_CONTENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFunctionRoleContent() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentApplication( ( Application ) otherEnd, msgs );
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
        case AsdPackage.FUNCTION_ROLE__FUNCTION_ROLE_CONTENT:
            return ( ( InternalEList< ? > ) getFunctionRoleContent() ).basicRemove( otherEnd, msgs );
        case AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION:
            return basicSetParentApplication( null, msgs );
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
        case AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION:
            return eInternalContainer().eInverseRemove( this, AsdPackage.APPLICATION__FUNCTION_ROLE, Application.class,
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
        case AsdPackage.FUNCTION_ROLE__UUID:
            return getUuid();
        case AsdPackage.FUNCTION_ROLE__TEMPLATE_UUID:
            return getTemplateUuid();
        case AsdPackage.FUNCTION_ROLE__ORIGIN_UUID:
            return getOriginUuid();
        case AsdPackage.FUNCTION_ROLE__SELECTOR:
            return getSelector();
        case AsdPackage.FUNCTION_ROLE__CARDINALITY:
            return getCardinality();
        case AsdPackage.FUNCTION_ROLE__MAX:
            return getMax();
        case AsdPackage.FUNCTION_ROLE__FUNCTION_ROLE_CONTENT:
            return getFunctionRoleContent();
        case AsdPackage.FUNCTION_ROLE__NAME:
            return getName();
        case AsdPackage.FUNCTION_ROLE__TYPE:
            return getType();
        case AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION:
            return getParentApplication();
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
        case AsdPackage.FUNCTION_ROLE__UUID:
            setUuid( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE__TEMPLATE_UUID:
            setTemplateUuid( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE__ORIGIN_UUID:
            setOriginUuid( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE__SELECTOR:
            setSelector( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE__CARDINALITY:
            setCardinality( ( CardinalityEnum ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE__MAX:
            setMax( ( Integer ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE__FUNCTION_ROLE_CONTENT:
            getFunctionRoleContent().clear();
            getFunctionRoleContent().addAll( ( Collection< ? extends FunctionRoleContent > ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE__TYPE:
            setType( ( String ) newValue );
            return;
        case AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION:
            setParentApplication( ( Application ) newValue );
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
        case AsdPackage.FUNCTION_ROLE__UUID:
            unsetUuid();
            return;
        case AsdPackage.FUNCTION_ROLE__TEMPLATE_UUID:
            unsetTemplateUuid();
            return;
        case AsdPackage.FUNCTION_ROLE__ORIGIN_UUID:
            unsetOriginUuid();
            return;
        case AsdPackage.FUNCTION_ROLE__SELECTOR:
            setSelector( SELECTOR_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_ROLE__CARDINALITY:
            unsetCardinality();
            return;
        case AsdPackage.FUNCTION_ROLE__MAX:
            setMax( MAX_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_ROLE__FUNCTION_ROLE_CONTENT:
            unsetFunctionRoleContent();
            return;
        case AsdPackage.FUNCTION_ROLE__NAME:
            setName( NAME_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_ROLE__TYPE:
            setType( TYPE_EDEFAULT );
            return;
        case AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION:
            setParentApplication( ( Application ) null );
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
        case AsdPackage.FUNCTION_ROLE__UUID:
            return isSetUuid();
        case AsdPackage.FUNCTION_ROLE__TEMPLATE_UUID:
            return isSetTemplateUuid();
        case AsdPackage.FUNCTION_ROLE__ORIGIN_UUID:
            return isSetOriginUuid();
        case AsdPackage.FUNCTION_ROLE__SELECTOR:
            return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals( selector );
        case AsdPackage.FUNCTION_ROLE__CARDINALITY:
            return isSetCardinality();
        case AsdPackage.FUNCTION_ROLE__MAX:
            return max != MAX_EDEFAULT;
        case AsdPackage.FUNCTION_ROLE__FUNCTION_ROLE_CONTENT:
            return isSetFunctionRoleContent();
        case AsdPackage.FUNCTION_ROLE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case AsdPackage.FUNCTION_ROLE__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals( type );
        case AsdPackage.FUNCTION_ROLE__PARENT_APPLICATION:
            return getParentApplication() != null;
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID( int derivedFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgUuid.class ) {
            switch( derivedFeatureID ) {
            case AsdPackage.FUNCTION_ROLE__UUID:
                return SclPackage.AG_UUID__UUID;
            case AsdPackage.FUNCTION_ROLE__TEMPLATE_UUID:
                return SclPackage.AG_UUID__TEMPLATE_UUID;
            default:
                return -1;
            }
        }
        if( baseClass == AgUuidWithOrigin.class ) {
            switch( derivedFeatureID ) {
            case AsdPackage.FUNCTION_ROLE__ORIGIN_UUID:
                return AsdPackage.AG_UUID_WITH_ORIGIN__ORIGIN_UUID;
            default:
                return -1;
            }
        }
        if( baseClass == AgSelector.class ) {
            switch( derivedFeatureID ) {
            case AsdPackage.FUNCTION_ROLE__SELECTOR:
                return AsdPackage.AG_SELECTOR__SELECTOR;
            default:
                return -1;
            }
        }
        if( baseClass == AgCardinality.class ) {
            switch( derivedFeatureID ) {
            case AsdPackage.FUNCTION_ROLE__CARDINALITY:
                return AsdPackage.AG_CARDINALITY__CARDINALITY;
            case AsdPackage.FUNCTION_ROLE__MAX:
                return AsdPackage.AG_CARDINALITY__MAX;
            default:
                return -1;
            }
        }
        if( baseClass == AgCardinalityWithSelector.class ) {
            switch( derivedFeatureID ) {
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID( int baseFeatureID, Class< ? > baseClass ) {
        if( baseClass == AgUuid.class ) {
            switch( baseFeatureID ) {
            case SclPackage.AG_UUID__UUID:
                return AsdPackage.FUNCTION_ROLE__UUID;
            case SclPackage.AG_UUID__TEMPLATE_UUID:
                return AsdPackage.FUNCTION_ROLE__TEMPLATE_UUID;
            default:
                return -1;
            }
        }
        if( baseClass == AgUuidWithOrigin.class ) {
            switch( baseFeatureID ) {
            case AsdPackage.AG_UUID_WITH_ORIGIN__ORIGIN_UUID:
                return AsdPackage.FUNCTION_ROLE__ORIGIN_UUID;
            default:
                return -1;
            }
        }
        if( baseClass == AgSelector.class ) {
            switch( baseFeatureID ) {
            case AsdPackage.AG_SELECTOR__SELECTOR:
                return AsdPackage.FUNCTION_ROLE__SELECTOR;
            default:
                return -1;
            }
        }
        if( baseClass == AgCardinality.class ) {
            switch( baseFeatureID ) {
            case AsdPackage.AG_CARDINALITY__CARDINALITY:
                return AsdPackage.FUNCTION_ROLE__CARDINALITY;
            case AsdPackage.AG_CARDINALITY__MAX:
                return AsdPackage.FUNCTION_ROLE__MAX;
            default:
                return -1;
            }
        }
        if( baseClass == AgCardinalityWithSelector.class ) {
            switch( baseFeatureID ) {
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
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
        result.append( " (uuid: " );
        if( uuidESet ) {
            result.append( uuid );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", templateUuid: " );
        if( templateUuidESet ) {
            result.append( templateUuid );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", originUuid: " );
        if( originUuidESet ) {
            result.append( originUuid );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", selector: " );
        result.append( selector );
        result.append( ", cardinality: " );
        if( cardinalityESet ) {
            result.append( cardinality );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", max: " );
        result.append( max );
        result.append( ", name: " );
        result.append( name );
        result.append( ", type: " );
        result.append( type );
        result.append( ')' );
        return result.toString();
    }

} //FunctionRoleImpl
