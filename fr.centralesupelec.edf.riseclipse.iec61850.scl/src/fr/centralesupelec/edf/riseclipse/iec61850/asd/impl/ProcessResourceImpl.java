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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getMax <em>Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getParentProcessResources <em>Parent Process Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getReferredByProcessResourceRef <em>Referred By Process Resource Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getReferredByControllingLNode <em>Referred By Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getReferredBySubscriberLNode <em>Referred By Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getReferredByControlRef <em>Referred By Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl#getReferredbySourceRef <em>Referredby Source Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessResourceImpl extends BaseExtensionElementWithDescImpl implements ProcessResource {
    /**
     * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResource()
     * @generated
     * @ordered
     */
    protected EList< Resource > resource;

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
     * The cached value of the '{@link #getReferredByProcessResourceRef() <em>Referred By Process Resource Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByProcessResourceRef()
     * @generated
     * @ordered
     */
    protected EList< ProcessResourceRef > referredByProcessResourceRef;

    /**
     * The cached value of the '{@link #getReferredByControllingLNode() <em>Referred By Controlling LNode</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByControllingLNode()
     * @generated
     * @ordered
     */
    protected EList< ControllingLNode > referredByControllingLNode;

    /**
     * The cached value of the '{@link #getReferredBySubscriberLNode() <em>Referred By Subscriber LNode</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredBySubscriberLNode()
     * @generated
     * @ordered
     */
    protected EList< SubscriberLNode > referredBySubscriberLNode;

    /**
     * The cached value of the '{@link #getReferredByControlRef() <em>Referred By Control Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByControlRef()
     * @generated
     * @ordered
     */
    protected EList< ControlRef > referredByControlRef;

    /**
     * The cached value of the '{@link #getReferredbySourceRef() <em>Referredby Source Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredbySourceRef()
     * @generated
     * @ordered
     */
    protected EList< SourceRef > referredbySourceRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcessResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getProcessResource();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Resource > getResource() {
        if( resource == null ) {
            resource = new EObjectContainmentWithInverseEList.Unsettable< >( Resource.class, this,
                    AsdPackage.PROCESS_RESOURCE__RESOURCE, AsdPackage.RESOURCE__PARENT_PROCESS_RESOURCE );
        }
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetResource() {
        if( resource != null ) {
            ( ( InternalEList.Unsettable< ? > ) resource ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetResource() {
        return resource != null && ( ( InternalEList.Unsettable< ? > ) resource ).isSet();
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_RESOURCE__CARDINALITY,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.PROCESS_RESOURCE__CARDINALITY,
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_RESOURCE__MAX, oldMax, max ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_RESOURCE__NAME, oldName,
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_RESOURCE__ORIGIN_UUID,
                    oldOriginUuid, originUuid ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_RESOURCE__SELECTOR, oldSelector,
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_RESOURCE__TEMPLATE_UUID,
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_RESOURCE__UUID, oldUuid,
                    uuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProcessResources getParentProcessResources() {
        if( eContainerFeatureID() != AsdPackage.PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES ) {
            return null;
        }
        return ( ProcessResources ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentProcessResources( ProcessResources newParentProcessResources,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentProcessResources,
                AsdPackage.PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentProcessResources( ProcessResources newParentProcessResources ) {
        if( newParentProcessResources != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES
                        && newParentProcessResources != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentProcessResources ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentProcessResources != null ) {
                msgs = ( ( InternalEObject ) newParentProcessResources ).eInverseAdd( this,
                        AsdPackage.PROCESS_RESOURCES__PROCESS_RESOURCE, ProcessResources.class, msgs );
            }
            msgs = basicSetParentProcessResources( newParentProcessResources, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    AsdPackage.PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES, newParentProcessResources,
                    newParentProcessResources ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProcessResourceRef > getReferredByProcessResourceRef() {
        if( referredByProcessResourceRef == null ) {
            referredByProcessResourceRef = new EObjectWithInverseResolvingEList.Unsettable< >(
                    ProcessResourceRef.class, this, AsdPackage.PROCESS_RESOURCE__REFERRED_BY_PROCESS_RESOURCE_REF,
                    AsdPackage.PROCESS_RESOURCE_REF__REFERS_TO_PROCESS_RESOURCE );
        }
        return referredByProcessResourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByProcessResourceRef() {
        if( referredByProcessResourceRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByProcessResourceRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByProcessResourceRef() {
        return referredByProcessResourceRef != null
                && ( ( InternalEList.Unsettable< ? > ) referredByProcessResourceRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ControllingLNode > getReferredByControllingLNode() {
        if( referredByControllingLNode == null ) {
            referredByControllingLNode = new EObjectWithInverseResolvingEList.Unsettable< >(
                    ControllingLNode.class, this, AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE,
                    AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE );
        }
        return referredByControllingLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByControllingLNode() {
        if( referredByControllingLNode != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByControllingLNode ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByControllingLNode() {
        return referredByControllingLNode != null
                && ( ( InternalEList.Unsettable< ? > ) referredByControllingLNode ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SubscriberLNode > getReferredBySubscriberLNode() {
        if( referredBySubscriberLNode == null ) {
            referredBySubscriberLNode = new EObjectWithInverseResolvingEList.Unsettable< >(
                    SubscriberLNode.class, this, AsdPackage.PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE,
                    AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE );
        }
        return referredBySubscriberLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredBySubscriberLNode() {
        if( referredBySubscriberLNode != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredBySubscriberLNode ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredBySubscriberLNode() {
        return referredBySubscriberLNode != null
                && ( ( InternalEList.Unsettable< ? > ) referredBySubscriberLNode ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ControlRef > getReferredByControlRef() {
        if( referredByControlRef == null ) {
            referredByControlRef = new EObjectWithInverseResolvingEList.Unsettable< >( ControlRef.class,
                    this, AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF,
                    AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE );
        }
        return referredByControlRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByControlRef() {
        if( referredByControlRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByControlRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByControlRef() {
        return referredByControlRef != null && ( ( InternalEList.Unsettable< ? > ) referredByControlRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SourceRef > getReferredbySourceRef() {
        if( referredbySourceRef == null ) {
            referredbySourceRef = new EObjectWithInverseResolvingEList.Unsettable< >( SourceRef.class, this,
                    AsdPackage.PROCESS_RESOURCE__REFERREDBY_SOURCE_REF,
                    AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE );
        }
        return referredbySourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredbySourceRef() {
        if( referredbySourceRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredbySourceRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredbySourceRef() {
        return referredbySourceRef != null && ( ( InternalEList.Unsettable< ? > ) referredbySourceRef ).isSet();
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
        case AsdPackage.PROCESS_RESOURCE__RESOURCE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getResource() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentProcessResources( ( ProcessResources ) otherEnd, msgs );
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_PROCESS_RESOURCE_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByProcessResourceRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByControllingLNode() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredBySubscriberLNode() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByControlRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.PROCESS_RESOURCE__REFERREDBY_SOURCE_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredbySourceRef() )
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
        case AsdPackage.PROCESS_RESOURCE__RESOURCE:
            return ( ( InternalEList< ? > ) getResource() ).basicRemove( otherEnd, msgs );
        case AsdPackage.PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES:
            return basicSetParentProcessResources( null, msgs );
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_PROCESS_RESOURCE_REF:
            return ( ( InternalEList< ? > ) getReferredByProcessResourceRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE:
            return ( ( InternalEList< ? > ) getReferredByControllingLNode() ).basicRemove( otherEnd, msgs );
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE:
            return ( ( InternalEList< ? > ) getReferredBySubscriberLNode() ).basicRemove( otherEnd, msgs );
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF:
            return ( ( InternalEList< ? > ) getReferredByControlRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.PROCESS_RESOURCE__REFERREDBY_SOURCE_REF:
            return ( ( InternalEList< ? > ) getReferredbySourceRef() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES:
            return eInternalContainer().eInverseRemove( this, AsdPackage.PROCESS_RESOURCES__PROCESS_RESOURCE,
                    ProcessResources.class, msgs );
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
        case AsdPackage.PROCESS_RESOURCE__RESOURCE:
            return getResource();
        case AsdPackage.PROCESS_RESOURCE__CARDINALITY:
            return getCardinality();
        case AsdPackage.PROCESS_RESOURCE__MAX:
            return getMax();
        case AsdPackage.PROCESS_RESOURCE__NAME:
            return getName();
        case AsdPackage.PROCESS_RESOURCE__ORIGIN_UUID:
            return getOriginUuid();
        case AsdPackage.PROCESS_RESOURCE__SELECTOR:
            return getSelector();
        case AsdPackage.PROCESS_RESOURCE__TEMPLATE_UUID:
            return getTemplateUuid();
        case AsdPackage.PROCESS_RESOURCE__UUID:
            return getUuid();
        case AsdPackage.PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES:
            return getParentProcessResources();
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_PROCESS_RESOURCE_REF:
            return getReferredByProcessResourceRef();
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE:
            return getReferredByControllingLNode();
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE:
            return getReferredBySubscriberLNode();
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF:
            return getReferredByControlRef();
        case AsdPackage.PROCESS_RESOURCE__REFERREDBY_SOURCE_REF:
            return getReferredbySourceRef();
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
        case AsdPackage.PROCESS_RESOURCE__RESOURCE:
            getResource().clear();
            getResource().addAll( ( Collection< ? extends Resource > ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__CARDINALITY:
            setCardinality( ( CardinalityEnum ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__MAX:
            setMax( ( Integer ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__ORIGIN_UUID:
            setOriginUuid( ( String ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__SELECTOR:
            setSelector( ( String ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__TEMPLATE_UUID:
            setTemplateUuid( ( String ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__UUID:
            setUuid( ( String ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES:
            setParentProcessResources( ( ProcessResources ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_PROCESS_RESOURCE_REF:
            getReferredByProcessResourceRef().clear();
            getReferredByProcessResourceRef().addAll( ( Collection< ? extends ProcessResourceRef > ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE:
            getReferredByControllingLNode().clear();
            getReferredByControllingLNode().addAll( ( Collection< ? extends ControllingLNode > ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE:
            getReferredBySubscriberLNode().clear();
            getReferredBySubscriberLNode().addAll( ( Collection< ? extends SubscriberLNode > ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF:
            getReferredByControlRef().clear();
            getReferredByControlRef().addAll( ( Collection< ? extends ControlRef > ) newValue );
            return;
        case AsdPackage.PROCESS_RESOURCE__REFERREDBY_SOURCE_REF:
            getReferredbySourceRef().clear();
            getReferredbySourceRef().addAll( ( Collection< ? extends SourceRef > ) newValue );
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
        case AsdPackage.PROCESS_RESOURCE__RESOURCE:
            unsetResource();
            return;
        case AsdPackage.PROCESS_RESOURCE__CARDINALITY:
            unsetCardinality();
            return;
        case AsdPackage.PROCESS_RESOURCE__MAX:
            setMax( MAX_EDEFAULT );
            return;
        case AsdPackage.PROCESS_RESOURCE__NAME:
            setName( NAME_EDEFAULT );
            return;
        case AsdPackage.PROCESS_RESOURCE__ORIGIN_UUID:
            setOriginUuid( ORIGIN_UUID_EDEFAULT );
            return;
        case AsdPackage.PROCESS_RESOURCE__SELECTOR:
            setSelector( SELECTOR_EDEFAULT );
            return;
        case AsdPackage.PROCESS_RESOURCE__TEMPLATE_UUID:
            setTemplateUuid( TEMPLATE_UUID_EDEFAULT );
            return;
        case AsdPackage.PROCESS_RESOURCE__UUID:
            setUuid( UUID_EDEFAULT );
            return;
        case AsdPackage.PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES:
            setParentProcessResources( ( ProcessResources ) null );
            return;
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_PROCESS_RESOURCE_REF:
            unsetReferredByProcessResourceRef();
            return;
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE:
            unsetReferredByControllingLNode();
            return;
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE:
            unsetReferredBySubscriberLNode();
            return;
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF:
            unsetReferredByControlRef();
            return;
        case AsdPackage.PROCESS_RESOURCE__REFERREDBY_SOURCE_REF:
            unsetReferredbySourceRef();
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
        case AsdPackage.PROCESS_RESOURCE__RESOURCE:
            return isSetResource();
        case AsdPackage.PROCESS_RESOURCE__CARDINALITY:
            return isSetCardinality();
        case AsdPackage.PROCESS_RESOURCE__MAX:
            return max != MAX_EDEFAULT;
        case AsdPackage.PROCESS_RESOURCE__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case AsdPackage.PROCESS_RESOURCE__ORIGIN_UUID:
            return ORIGIN_UUID_EDEFAULT == null ? originUuid != null : !ORIGIN_UUID_EDEFAULT.equals( originUuid );
        case AsdPackage.PROCESS_RESOURCE__SELECTOR:
            return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals( selector );
        case AsdPackage.PROCESS_RESOURCE__TEMPLATE_UUID:
            return TEMPLATE_UUID_EDEFAULT == null ? templateUuid != null
                    : !TEMPLATE_UUID_EDEFAULT.equals( templateUuid );
        case AsdPackage.PROCESS_RESOURCE__UUID:
            return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals( uuid );
        case AsdPackage.PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES:
            return getParentProcessResources() != null;
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_PROCESS_RESOURCE_REF:
            return isSetReferredByProcessResourceRef();
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE:
            return isSetReferredByControllingLNode();
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE:
            return isSetReferredBySubscriberLNode();
        case AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF:
            return isSetReferredByControlRef();
        case AsdPackage.PROCESS_RESOURCE__REFERREDBY_SOURCE_REF:
            return isSetReferredbySourceRef();
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
        result.append( " (cardinality: " );
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
        result.append( ", originUuid: " );
        result.append( originUuid );
        result.append( ", selector: " );
        result.append( selector );
        result.append( ", templateUuid: " );
        result.append( templateUuid );
        result.append( ", uuid: " );
        result.append( uuid );
        result.append( ')' );
        return result.toString();
    }

} //ProcessResourceImpl
