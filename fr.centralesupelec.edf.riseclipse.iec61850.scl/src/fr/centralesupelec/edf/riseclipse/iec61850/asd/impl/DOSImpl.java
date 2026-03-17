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

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DOS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl#getSDS <em>SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl#getDAS <em>DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl#getSubscriberLNode <em>Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl#getControllingLNode <em>Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl#getProcessEcho <em>Process Echo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl#getLogParametersRef <em>Log Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl#getMappedDoName <em>Mapped Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl#getMappedLnUuid <em>Mapped Ln Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOSImpl extends BaseExtensionElementWithDescImpl implements DOS {
    /**
     * The cached value of the '{@link #getSDS() <em>SDS</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSDS()
     * @generated
     * @ordered
     */
    protected EList< SDS > sds;

    /**
     * The cached value of the '{@link #getDAS() <em>DAS</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAS()
     * @generated
     * @ordered
     */
    protected EList< DAS > das;

    /**
     * The cached value of the '{@link #getSubscriberLNode() <em>Subscriber LNode</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubscriberLNode()
     * @generated
     * @ordered
     */
    protected EList< SubscriberLNode > subscriberLNode;

    /**
     * The cached value of the '{@link #getControllingLNode() <em>Controlling LNode</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControllingLNode()
     * @generated
     * @ordered
     */
    protected EList< ControllingLNode > controllingLNode;

    /**
     * The cached value of the '{@link #getProcessEcho() <em>Process Echo</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessEcho()
     * @generated
     * @ordered
     */
    protected EList< ProcessEcho > processEcho;

    /**
     * The cached value of the '{@link #getLogParametersRef() <em>Log Parameters Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogParametersRef()
     * @generated
     * @ordered
     */
    protected EList< LogParametersRef > logParametersRef;

    /**
     * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabels()
     * @generated
     * @ordered
     */
    protected Labels labels;

    /**
     * The default value of the '{@link #getMappedDoName() <em>Mapped Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMappedDoName()
     * @generated
     * @ordered
     */
    protected static final String MAPPED_DO_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMappedDoName() <em>Mapped Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMappedDoName()
     * @generated
     * @ordered
     */
    protected String mappedDoName = MAPPED_DO_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getMappedLnUuid() <em>Mapped Ln Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMappedLnUuid()
     * @generated
     * @ordered
     */
    protected static final String MAPPED_LN_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMappedLnUuid() <em>Mapped Ln Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMappedLnUuid()
     * @generated
     * @ordered
     */
    protected String mappedLnUuid = MAPPED_LN_UUID_EDEFAULT;

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
     * The cached value of the '{@link #getRefersToAnyLN() <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAnyLN()
     * @generated
     * @ordered
     */
    protected AnyLN refersToAnyLN;

    /**
     * This is true if the Refers To Any LN reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAnyLNESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DOSImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getDOS();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SDS > getSDS() {
        if( sds == null ) {
            sds = new EObjectContainmentWithInverseEList.Unsettable< >( SDS.class, this, AsdPackage.DOS__SDS,
                    AsdPackage.SDS__PARENT_DOS );
        }
        return sds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSDS() {
        if( sds != null ) {
            ( ( InternalEList.Unsettable< ? > ) sds ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSDS() {
        return sds != null && ( ( InternalEList.Unsettable< ? > ) sds ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DAS > getDAS() {
        if( das == null ) {
            das = new EObjectContainmentWithInverseEList.Unsettable< >( DAS.class, this, AsdPackage.DOS__DAS,
                    AsdPackage.DAS__PARENT_DOS );
        }
        return das;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDAS() {
        if( das != null ) {
            ( ( InternalEList.Unsettable< ? > ) das ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDAS() {
        return das != null && ( ( InternalEList.Unsettable< ? > ) das ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SubscriberLNode > getSubscriberLNode() {
        if( subscriberLNode == null ) {
            subscriberLNode = new EObjectContainmentWithInverseEList.Unsettable< >(
                    SubscriberLNode.class, this, AsdPackage.DOS__SUBSCRIBER_LNODE,
                    AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS );
        }
        return subscriberLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubscriberLNode() {
        if( subscriberLNode != null ) {
            ( ( InternalEList.Unsettable< ? > ) subscriberLNode ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubscriberLNode() {
        return subscriberLNode != null && ( ( InternalEList.Unsettable< ? > ) subscriberLNode ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ControllingLNode > getControllingLNode() {
        if( controllingLNode == null ) {
            controllingLNode = new EObjectContainmentWithInverseEList.Unsettable< >(
                    ControllingLNode.class, this, AsdPackage.DOS__CONTROLLING_LNODE,
                    AsdPackage.CONTROLLING_LNODE__PARENT_DOS );
        }
        return controllingLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControllingLNode() {
        if( controllingLNode != null ) {
            ( ( InternalEList.Unsettable< ? > ) controllingLNode ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControllingLNode() {
        return controllingLNode != null && ( ( InternalEList.Unsettable< ? > ) controllingLNode ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ProcessEcho > getProcessEcho() {
        if( processEcho == null ) {
            processEcho = new EObjectContainmentWithInverseEList.Unsettable< >( ProcessEcho.class, this,
                    AsdPackage.DOS__PROCESS_ECHO, AsdPackage.PROCESS_ECHO__PARENT_DOS );
        }
        return processEcho;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProcessEcho() {
        if( processEcho != null ) {
            ( ( InternalEList.Unsettable< ? > ) processEcho ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcessEcho() {
        return processEcho != null && ( ( InternalEList.Unsettable< ? > ) processEcho ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LogParametersRef > getLogParametersRef() {
        if( logParametersRef == null ) {
            logParametersRef = new EObjectContainmentWithInverseEList.Unsettable< >(
                    LogParametersRef.class, this, AsdPackage.DOS__LOG_PARAMETERS_REF,
                    AsdPackage.LOG_PARAMETERS_REF__PARENT_DOS );
        }
        return logParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLogParametersRef() {
        if( logParametersRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) logParametersRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLogParametersRef() {
        return logParametersRef != null && ( ( InternalEList.Unsettable< ? > ) logParametersRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Labels getLabels() {
        return labels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLabels( Labels newLabels, NotificationChain msgs ) {
        Labels oldLabels = labels;
        labels = newLabels;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, AsdPackage.DOS__LABELS,
                    oldLabels, newLabels );
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
    public void setLabels( Labels newLabels ) {
        if( newLabels != labels ) {
            NotificationChain msgs = null;
            if( labels != null ) {
                msgs = ( ( InternalEObject ) labels ).eInverseRemove( this, SclPackage.LABELS__PARENT_DOS, Labels.class,
                        msgs );
            }
            if( newLabels != null ) {
                msgs = ( ( InternalEObject ) newLabels ).eInverseAdd( this, SclPackage.LABELS__PARENT_DOS, Labels.class,
                        msgs );
            }
            msgs = basicSetLabels( newLabels, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DOS__LABELS, newLabels, newLabels ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMappedDoName() {
        return mappedDoName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMappedDoName( String newMappedDoName ) {
        String oldMappedDoName = mappedDoName;
        mappedDoName = newMappedDoName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DOS__MAPPED_DO_NAME, oldMappedDoName,
                    mappedDoName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMappedLnUuid() {
        return mappedLnUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMappedLnUuid( String newMappedLnUuid ) {
        String oldMappedLnUuid = mappedLnUuid;
        mappedLnUuid = newMappedLnUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DOS__MAPPED_LN_UUID, oldMappedLnUuid,
                    mappedLnUuid ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DOS__NAME, oldName, name ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnyLN getRefersToAnyLN() {
        if( refersToAnyLN != null && refersToAnyLN.eIsProxy() ) {
            InternalEObject oldRefersToAnyLN = ( InternalEObject ) refersToAnyLN;
            refersToAnyLN = ( AnyLN ) eResolveProxy( oldRefersToAnyLN );
            if( refersToAnyLN != oldRefersToAnyLN ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, AsdPackage.DOS__REFERS_TO_ANY_LN,
                            oldRefersToAnyLN, refersToAnyLN ) );
                }
            }
        }
        return refersToAnyLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyLN basicGetRefersToAnyLN() {
        return refersToAnyLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAnyLN( AnyLN newRefersToAnyLN, NotificationChain msgs ) {
        AnyLN oldRefersToAnyLN = refersToAnyLN;
        refersToAnyLN = newRefersToAnyLN;
        boolean oldRefersToAnyLNESet = refersToAnyLNESet;
        refersToAnyLNESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.DOS__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet );
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
    public void setRefersToAnyLN( AnyLN newRefersToAnyLN ) {
        if( newRefersToAnyLN != refersToAnyLN ) {
            NotificationChain msgs = null;
            if( refersToAnyLN != null ) {
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_DOS,
                        AnyLN.class, msgs );
            }
            if( newRefersToAnyLN != null ) {
                msgs = ( ( InternalEObject ) newRefersToAnyLN ).eInverseAdd( this, SclPackage.ANY_LN__REFERRED_BY_DOS,
                        AnyLN.class, msgs );
            }
            msgs = basicSetRefersToAnyLN( newRefersToAnyLN, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.DOS__REFERS_TO_ANY_LN,
                        newRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAnyLN( NotificationChain msgs ) {
        AnyLN oldRefersToAnyLN = refersToAnyLN;
        refersToAnyLN = null;
        boolean oldRefersToAnyLNESet = refersToAnyLNESet;
        refersToAnyLNESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.DOS__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet );
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
    public void unsetRefersToAnyLN() {
        if( refersToAnyLN != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_DOS,
                    AnyLN.class, msgs );
            msgs = basicUnsetRefersToAnyLN( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAnyLNESet = refersToAnyLNESet;
            refersToAnyLNESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.DOS__REFERS_TO_ANY_LN, null, null,
                        oldRefersToAnyLNESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAnyLN() {
        return refersToAnyLNESet;
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
        case AsdPackage.DOS__SDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSDS() ).basicAdd( otherEnd, msgs );
        case AsdPackage.DOS__DAS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDAS() ).basicAdd( otherEnd, msgs );
        case AsdPackage.DOS__SUBSCRIBER_LNODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubscriberLNode() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.DOS__CONTROLLING_LNODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getControllingLNode() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.DOS__PROCESS_ECHO:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProcessEcho() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.DOS__LOG_PARAMETERS_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLogParametersRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.DOS__LABELS:
            if( labels != null ) {
                msgs = ( ( InternalEObject ) labels ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.DOS__LABELS, null, msgs );
            }
            return basicSetLabels( ( Labels ) otherEnd, msgs );
        case AsdPackage.DOS__REFERS_TO_ANY_LN:
            if( refersToAnyLN != null ) {
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_DOS,
                        AnyLN.class, msgs );
            }
            return basicSetRefersToAnyLN( ( AnyLN ) otherEnd, msgs );
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
        case AsdPackage.DOS__SDS:
            return ( ( InternalEList< ? > ) getSDS() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DOS__DAS:
            return ( ( InternalEList< ? > ) getDAS() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DOS__SUBSCRIBER_LNODE:
            return ( ( InternalEList< ? > ) getSubscriberLNode() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DOS__CONTROLLING_LNODE:
            return ( ( InternalEList< ? > ) getControllingLNode() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DOS__PROCESS_ECHO:
            return ( ( InternalEList< ? > ) getProcessEcho() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DOS__LOG_PARAMETERS_REF:
            return ( ( InternalEList< ? > ) getLogParametersRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.DOS__LABELS:
            return basicSetLabels( null, msgs );
        case AsdPackage.DOS__REFERS_TO_ANY_LN:
            return basicUnsetRefersToAnyLN( msgs );
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
        case AsdPackage.DOS__SDS:
            return getSDS();
        case AsdPackage.DOS__DAS:
            return getDAS();
        case AsdPackage.DOS__SUBSCRIBER_LNODE:
            return getSubscriberLNode();
        case AsdPackage.DOS__CONTROLLING_LNODE:
            return getControllingLNode();
        case AsdPackage.DOS__PROCESS_ECHO:
            return getProcessEcho();
        case AsdPackage.DOS__LOG_PARAMETERS_REF:
            return getLogParametersRef();
        case AsdPackage.DOS__LABELS:
            return getLabels();
        case AsdPackage.DOS__MAPPED_DO_NAME:
            return getMappedDoName();
        case AsdPackage.DOS__MAPPED_LN_UUID:
            return getMappedLnUuid();
        case AsdPackage.DOS__NAME:
            return getName();
        case AsdPackage.DOS__REFERS_TO_ANY_LN:
            if( resolve ) {
                return getRefersToAnyLN();
            }
            return basicGetRefersToAnyLN();
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
        case AsdPackage.DOS__SDS:
            getSDS().clear();
            getSDS().addAll( ( Collection< ? extends SDS > ) newValue );
            return;
        case AsdPackage.DOS__DAS:
            getDAS().clear();
            getDAS().addAll( ( Collection< ? extends DAS > ) newValue );
            return;
        case AsdPackage.DOS__SUBSCRIBER_LNODE:
            getSubscriberLNode().clear();
            getSubscriberLNode().addAll( ( Collection< ? extends SubscriberLNode > ) newValue );
            return;
        case AsdPackage.DOS__CONTROLLING_LNODE:
            getControllingLNode().clear();
            getControllingLNode().addAll( ( Collection< ? extends ControllingLNode > ) newValue );
            return;
        case AsdPackage.DOS__PROCESS_ECHO:
            getProcessEcho().clear();
            getProcessEcho().addAll( ( Collection< ? extends ProcessEcho > ) newValue );
            return;
        case AsdPackage.DOS__LOG_PARAMETERS_REF:
            getLogParametersRef().clear();
            getLogParametersRef().addAll( ( Collection< ? extends LogParametersRef > ) newValue );
            return;
        case AsdPackage.DOS__LABELS:
            setLabels( ( Labels ) newValue );
            return;
        case AsdPackage.DOS__MAPPED_DO_NAME:
            setMappedDoName( ( String ) newValue );
            return;
        case AsdPackage.DOS__MAPPED_LN_UUID:
            setMappedLnUuid( ( String ) newValue );
            return;
        case AsdPackage.DOS__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.DOS__REFERS_TO_ANY_LN:
            setRefersToAnyLN( ( AnyLN ) newValue );
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
        case AsdPackage.DOS__SDS:
            unsetSDS();
            return;
        case AsdPackage.DOS__DAS:
            unsetDAS();
            return;
        case AsdPackage.DOS__SUBSCRIBER_LNODE:
            unsetSubscriberLNode();
            return;
        case AsdPackage.DOS__CONTROLLING_LNODE:
            unsetControllingLNode();
            return;
        case AsdPackage.DOS__PROCESS_ECHO:
            unsetProcessEcho();
            return;
        case AsdPackage.DOS__LOG_PARAMETERS_REF:
            unsetLogParametersRef();
            return;
        case AsdPackage.DOS__LABELS:
            setLabels( ( Labels ) null );
            return;
        case AsdPackage.DOS__MAPPED_DO_NAME:
            setMappedDoName( MAPPED_DO_NAME_EDEFAULT );
            return;
        case AsdPackage.DOS__MAPPED_LN_UUID:
            setMappedLnUuid( MAPPED_LN_UUID_EDEFAULT );
            return;
        case AsdPackage.DOS__NAME:
            setName( NAME_EDEFAULT );
            return;
        case AsdPackage.DOS__REFERS_TO_ANY_LN:
            unsetRefersToAnyLN();
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
        case AsdPackage.DOS__SDS:
            return isSetSDS();
        case AsdPackage.DOS__DAS:
            return isSetDAS();
        case AsdPackage.DOS__SUBSCRIBER_LNODE:
            return isSetSubscriberLNode();
        case AsdPackage.DOS__CONTROLLING_LNODE:
            return isSetControllingLNode();
        case AsdPackage.DOS__PROCESS_ECHO:
            return isSetProcessEcho();
        case AsdPackage.DOS__LOG_PARAMETERS_REF:
            return isSetLogParametersRef();
        case AsdPackage.DOS__LABELS:
            return labels != null;
        case AsdPackage.DOS__MAPPED_DO_NAME:
            return MAPPED_DO_NAME_EDEFAULT == null ? mappedDoName != null
                    : !MAPPED_DO_NAME_EDEFAULT.equals( mappedDoName );
        case AsdPackage.DOS__MAPPED_LN_UUID:
            return MAPPED_LN_UUID_EDEFAULT == null ? mappedLnUuid != null
                    : !MAPPED_LN_UUID_EDEFAULT.equals( mappedLnUuid );
        case AsdPackage.DOS__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case AsdPackage.DOS__REFERS_TO_ANY_LN:
            return isSetRefersToAnyLN();
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
        result.append( " (mappedDoName: " );
        result.append( mappedDoName );
        result.append( ", mappedLnUuid: " );
        result.append( mappedLnUuid );
        result.append( ", name: " );
        result.append( name );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "DOS.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from DOS: ";
        doBuildExplicitLinkWithAnyLN( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithAnyLN( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for AnyLN) ";

        SCL sclRoot = AsdUtilities.getSCL( this );

        if( getMappedLnUuid() != null && !getMappedLnUuid().isEmpty() ) {
            Pair< AnyLN, Integer > res = AsdUtilities.findByUuid( sclRoot.getIED(), getMappedLnUuid(), AnyLN.class );

            if( res.getLeft() != null ) {
                setRefersToAnyLN( res.getLeft() );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "DOS refers to AnyLN( uuid = ", getMappedLnUuid(), " ) on line ",
                        getRefersToAnyLN().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.getRight() == 0 ) ? "cannot find" : "found several" ),
                //         " AnyLN( uuid = ", getMappedLnUuid(), " )" );
            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because mappedLnUuid are missing" );
        }

    }

} //DOSImpl
