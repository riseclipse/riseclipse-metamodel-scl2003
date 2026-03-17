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
import java.util.function.Predicate;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscriber LNode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getGooseParametersRef <em>Goose Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getSMVParametersRef <em>SMV Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getReportParametersRef <em>Report Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getInputName <em>Input Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getPLN <em>PLN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getResourceUuid <em>Resource Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getService <em>Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getParentDAS <em>Parent DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getParentSDS <em>Parent SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getRefersToProcessResource <em>Refers To Process Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl#getReferredBySourceRef <em>Referred By Source Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriberLNodeImpl extends BaseExtensionElementWithDescImpl implements SubscriberLNode {
    /**
     * The cached value of the '{@link #getGooseParametersRef() <em>Goose Parameters Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGooseParametersRef()
     * @generated
     * @ordered
     */
    protected EList< GooseParametersRef > gooseParametersRef;

    /**
     * The cached value of the '{@link #getSMVParametersRef() <em>SMV Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSMVParametersRef()
     * @generated
     * @ordered
     */
    protected SMVParametersRef smvParametersRef;

    /**
     * This is true if the SMV Parameters Ref containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean smvParametersRefESet;

    /**
     * The cached value of the '{@link #getReportParametersRef() <em>Report Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportParametersRef()
     * @generated
     * @ordered
     */
    protected ReportParametersRef reportParametersRef;

    /**
     * This is true if the Report Parameters Ref containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reportParametersRefESet;

    /**
     * The cached value of the '{@link #getBinaryWiringParametersRef() <em>Binary Wiring Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBinaryWiringParametersRef()
     * @generated
     * @ordered
     */
    protected BinaryWiringParametersRef binaryWiringParametersRef;

    /**
     * This is true if the Binary Wiring Parameters Ref containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean binaryWiringParametersRefESet;

    /**
     * The default value of the '{@link #getInputName() <em>Input Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputName()
     * @generated
     * @ordered
     */
    protected static final String INPUT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInputName() <em>Input Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputName()
     * @generated
     * @ordered
     */
    protected String inputName = INPUT_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getPLN() <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPLN()
     * @generated
     * @ordered
     */
    protected static final String PLN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPLN() <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPLN()
     * @generated
     * @ordered
     */
    protected String pLN = PLN_EDEFAULT;

    /**
     * The default value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceName()
     * @generated
     * @ordered
     */
    protected static final String RESOURCE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceName()
     * @generated
     * @ordered
     */
    protected String resourceName = RESOURCE_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getResourceUuid() <em>Resource Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceUuid()
     * @generated
     * @ordered
     */
    protected static final String RESOURCE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResourceUuid() <em>Resource Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResourceUuid()
     * @generated
     * @ordered
     */
    protected String resourceUuid = RESOURCE_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getService() <em>Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getService()
     * @generated
     * @ordered
     */
    protected static final SpecServiceEnum SERVICE_EDEFAULT = SpecServiceEnum.GOOSE;

    /**
     * The cached value of the '{@link #getService() <em>Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getService()
     * @generated
     * @ordered
     */
    protected SpecServiceEnum service = SERVICE_EDEFAULT;

    /**
     * This is true if the Service attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean serviceESet;

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
     * This is true if the Refers To Process Resource reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToProcessResourceESet;

    /**
     * The cached value of the '{@link #getReferredBySourceRef() <em>Referred By Source Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredBySourceRef()
     * @generated
     * @ordered
     */
    protected EList< SourceRef > referredBySourceRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SubscriberLNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getSubscriberLNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GooseParametersRef > getGooseParametersRef() {
        if( gooseParametersRef == null ) {
            gooseParametersRef = new EObjectContainmentWithInverseEList.Unsettable< >(
                    GooseParametersRef.class, this, AsdPackage.SUBSCRIBER_LNODE__GOOSE_PARAMETERS_REF,
                    AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE );
        }
        return gooseParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGooseParametersRef() {
        if( gooseParametersRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) gooseParametersRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGooseParametersRef() {
        return gooseParametersRef != null && ( ( InternalEList.Unsettable< ? > ) gooseParametersRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVParametersRef getSMVParametersRef() {
        return smvParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSMVParametersRef( SMVParametersRef newSMVParametersRef, NotificationChain msgs ) {
        SMVParametersRef oldSMVParametersRef = smvParametersRef;
        smvParametersRef = newSMVParametersRef;
        boolean oldSMVParametersRefESet = smvParametersRefESet;
        smvParametersRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF, oldSMVParametersRef, newSMVParametersRef,
                    !oldSMVParametersRefESet );
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
    public void setSMVParametersRef( SMVParametersRef newSMVParametersRef ) {
        if( newSMVParametersRef != smvParametersRef ) {
            NotificationChain msgs = null;
            if( smvParametersRef != null ) {
                msgs = ( ( InternalEObject ) smvParametersRef ).eInverseRemove( this,
                        AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, SMVParametersRef.class, msgs );
            }
            if( newSMVParametersRef != null ) {
                msgs = ( ( InternalEObject ) newSMVParametersRef ).eInverseAdd( this,
                        AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, SMVParametersRef.class, msgs );
            }
            msgs = basicSetSMVParametersRef( newSMVParametersRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldSMVParametersRefESet = smvParametersRefESet;
            smvParametersRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF,
                        newSMVParametersRef, newSMVParametersRef, !oldSMVParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSMVParametersRef( NotificationChain msgs ) {
        SMVParametersRef oldSMVParametersRef = smvParametersRef;
        smvParametersRef = null;
        boolean oldSMVParametersRefESet = smvParametersRefESet;
        smvParametersRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF, oldSMVParametersRef, null,
                    oldSMVParametersRefESet );
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
    public void unsetSMVParametersRef() {
        if( smvParametersRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) smvParametersRef ).eInverseRemove( this,
                    AsdPackage.SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, SMVParametersRef.class, msgs );
            msgs = basicUnsetSMVParametersRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldSMVParametersRefESet = smvParametersRefESet;
            smvParametersRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF, null, null, oldSMVParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSMVParametersRef() {
        return smvParametersRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportParametersRef getReportParametersRef() {
        return reportParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReportParametersRef( ReportParametersRef newReportParametersRef,
            NotificationChain msgs ) {
        ReportParametersRef oldReportParametersRef = reportParametersRef;
        reportParametersRef = newReportParametersRef;
        boolean oldReportParametersRefESet = reportParametersRefESet;
        reportParametersRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF, oldReportParametersRef, newReportParametersRef,
                    !oldReportParametersRefESet );
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
    public void setReportParametersRef( ReportParametersRef newReportParametersRef ) {
        if( newReportParametersRef != reportParametersRef ) {
            NotificationChain msgs = null;
            if( reportParametersRef != null ) {
                msgs = ( ( InternalEObject ) reportParametersRef ).eInverseRemove( this,
                        AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, ReportParametersRef.class, msgs );
            }
            if( newReportParametersRef != null ) {
                msgs = ( ( InternalEObject ) newReportParametersRef ).eInverseAdd( this,
                        AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, ReportParametersRef.class, msgs );
            }
            msgs = basicSetReportParametersRef( newReportParametersRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldReportParametersRefESet = reportParametersRefESet;
            reportParametersRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF, newReportParametersRef,
                        newReportParametersRef, !oldReportParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReportParametersRef( NotificationChain msgs ) {
        ReportParametersRef oldReportParametersRef = reportParametersRef;
        reportParametersRef = null;
        boolean oldReportParametersRefESet = reportParametersRefESet;
        reportParametersRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF, oldReportParametersRef, null,
                    oldReportParametersRefESet );
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
    public void unsetReportParametersRef() {
        if( reportParametersRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) reportParametersRef ).eInverseRemove( this,
                    AsdPackage.REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, ReportParametersRef.class, msgs );
            msgs = basicUnsetReportParametersRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldReportParametersRefESet = reportParametersRefESet;
            reportParametersRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF, null, null, oldReportParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReportParametersRef() {
        return reportParametersRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BinaryWiringParametersRef getBinaryWiringParametersRef() {
        return binaryWiringParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBinaryWiringParametersRef( BinaryWiringParametersRef newBinaryWiringParametersRef,
            NotificationChain msgs ) {
        BinaryWiringParametersRef oldBinaryWiringParametersRef = binaryWiringParametersRef;
        binaryWiringParametersRef = newBinaryWiringParametersRef;
        boolean oldBinaryWiringParametersRefESet = binaryWiringParametersRefESet;
        binaryWiringParametersRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF, oldBinaryWiringParametersRef,
                    newBinaryWiringParametersRef, !oldBinaryWiringParametersRefESet );
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
    public void setBinaryWiringParametersRef( BinaryWiringParametersRef newBinaryWiringParametersRef ) {
        if( newBinaryWiringParametersRef != binaryWiringParametersRef ) {
            NotificationChain msgs = null;
            if( binaryWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) binaryWiringParametersRef ).eInverseRemove( this,
                        AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE,
                        BinaryWiringParametersRef.class, msgs );
            }
            if( newBinaryWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) newBinaryWiringParametersRef ).eInverseAdd( this,
                        AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE,
                        BinaryWiringParametersRef.class, msgs );
            }
            msgs = basicSetBinaryWiringParametersRef( newBinaryWiringParametersRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldBinaryWiringParametersRefESet = binaryWiringParametersRefESet;
            binaryWiringParametersRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF, newBinaryWiringParametersRef,
                        newBinaryWiringParametersRef, !oldBinaryWiringParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBinaryWiringParametersRef( NotificationChain msgs ) {
        BinaryWiringParametersRef oldBinaryWiringParametersRef = binaryWiringParametersRef;
        binaryWiringParametersRef = null;
        boolean oldBinaryWiringParametersRefESet = binaryWiringParametersRefESet;
        binaryWiringParametersRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF, oldBinaryWiringParametersRef, null,
                    oldBinaryWiringParametersRefESet );
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
    public void unsetBinaryWiringParametersRef() {
        if( binaryWiringParametersRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) binaryWiringParametersRef ).eInverseRemove( this,
                    AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE, BinaryWiringParametersRef.class,
                    msgs );
            msgs = basicUnsetBinaryWiringParametersRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldBinaryWiringParametersRefESet = binaryWiringParametersRefESet;
            binaryWiringParametersRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF, null, null,
                        oldBinaryWiringParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBinaryWiringParametersRef() {
        return binaryWiringParametersRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInputName() {
        return inputName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputName( String newInputName ) {
        String oldInputName = inputName;
        inputName = newInputName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SUBSCRIBER_LNODE__INPUT_NAME,
                    oldInputName, inputName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPLN() {
        return pLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPLN( String newPLN ) {
        String oldPLN = pLN;
        pLN = newPLN;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SUBSCRIBER_LNODE__PLN, oldPLN, pLN ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResourceName( String newResourceName ) {
        String oldResourceName = resourceName;
        resourceName = newResourceName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SUBSCRIBER_LNODE__RESOURCE_NAME,
                    oldResourceName, resourceName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getResourceUuid() {
        return resourceUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResourceUuid( String newResourceUuid ) {
        String oldResourceUuid = resourceUuid;
        resourceUuid = newResourceUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SUBSCRIBER_LNODE__RESOURCE_UUID,
                    oldResourceUuid, resourceUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SpecServiceEnum getService() {
        return service;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setService( SpecServiceEnum newService ) {
        SpecServiceEnum oldService = service;
        service = newService == null ? SERVICE_EDEFAULT : newService;
        boolean oldServiceESet = serviceESet;
        serviceESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SUBSCRIBER_LNODE__SERVICE, oldService,
                    service, !oldServiceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetService() {
        SpecServiceEnum oldService = service;
        boolean oldServiceESet = serviceESet;
        service = SERVICE_EDEFAULT;
        serviceESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SUBSCRIBER_LNODE__SERVICE, oldService,
                    SERVICE_EDEFAULT, oldServiceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetService() {
        return serviceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAS getParentDAS() {
        if( eContainerFeatureID() != AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS ) {
            return null;
        }
        return ( DAS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDAS( DAS newParentDAS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDAS, AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDAS( DAS newParentDAS ) {
        if( newParentDAS != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS && newParentDAS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDAS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDAS != null ) {
                msgs = ( ( InternalEObject ) newParentDAS ).eInverseAdd( this, AsdPackage.DAS__SUBSCRIBER_LNODE,
                        DAS.class, msgs );
            }
            msgs = basicSetParentDAS( newParentDAS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS,
                    newParentDAS, newParentDAS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOS getParentDOS() {
        if( eContainerFeatureID() != AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS ) {
            return null;
        }
        return ( DOS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDOS( DOS newParentDOS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDOS, AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDOS( DOS newParentDOS ) {
        if( newParentDOS != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS && newParentDOS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDOS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDOS != null ) {
                msgs = ( ( InternalEObject ) newParentDOS ).eInverseAdd( this, AsdPackage.DOS__SUBSCRIBER_LNODE,
                        DOS.class, msgs );
            }
            msgs = basicSetParentDOS( newParentDOS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS,
                    newParentDOS, newParentDOS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SDS getParentSDS() {
        if( eContainerFeatureID() != AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS ) {
            return null;
        }
        return ( SDS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSDS( SDS newParentSDS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSDS, AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSDS( SDS newParentSDS ) {
        if( newParentSDS != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS && newParentSDS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSDS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSDS != null ) {
                msgs = ( ( InternalEObject ) newParentSDS ).eInverseAdd( this, AsdPackage.SDS__SUBSCRIBER_LNODE,
                        SDS.class, msgs );
            }
            msgs = basicSetParentSDS( newParentSDS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS,
                    newParentSDS, newParentSDS ) );
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
                            AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource,
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
        boolean oldRefersToProcessResourceESet = refersToProcessResourceESet;
        refersToProcessResourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource,
                    newRefersToProcessResource, !oldRefersToProcessResourceESet );
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
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE, ProcessResource.class, msgs );
            }
            if( newRefersToProcessResource != null ) {
                msgs = ( ( InternalEObject ) newRefersToProcessResource ).eInverseAdd( this,
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE, ProcessResource.class, msgs );
            }
            msgs = basicSetRefersToProcessResource( newRefersToProcessResource, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToProcessResourceESet = refersToProcessResourceESet;
            refersToProcessResourceESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE, newRefersToProcessResource,
                        newRefersToProcessResource, !oldRefersToProcessResourceESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToProcessResource( NotificationChain msgs ) {
        ProcessResource oldRefersToProcessResource = refersToProcessResource;
        refersToProcessResource = null;
        boolean oldRefersToProcessResourceESet = refersToProcessResourceESet;
        refersToProcessResourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource, null,
                    oldRefersToProcessResourceESet );
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
    public void unsetRefersToProcessResource() {
        if( refersToProcessResource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToProcessResource ).eInverseRemove( this,
                    AsdPackage.PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE, ProcessResource.class, msgs );
            msgs = basicUnsetRefersToProcessResource( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToProcessResourceESet = refersToProcessResourceESet;
            refersToProcessResourceESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE, null, null,
                        oldRefersToProcessResourceESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToProcessResource() {
        return refersToProcessResourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SourceRef > getReferredBySourceRef() {
        if( referredBySourceRef == null ) {
            referredBySourceRef = new EObjectWithInverseResolvingEList.Unsettable< >( SourceRef.class, this,
                    AsdPackage.SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF,
                    AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE );
        }
        return referredBySourceRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredBySourceRef() {
        if( referredBySourceRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredBySourceRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredBySourceRef() {
        return referredBySourceRef != null && ( ( InternalEList.Unsettable< ? > ) referredBySourceRef ).isSet();
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
        case AsdPackage.SUBSCRIBER_LNODE__GOOSE_PARAMETERS_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGooseParametersRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF:
            if( smvParametersRef != null ) {
                msgs = ( ( InternalEObject ) smvParametersRef ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF, null, msgs );
            }
            return basicSetSMVParametersRef( ( SMVParametersRef ) otherEnd, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF:
            if( reportParametersRef != null ) {
                msgs = ( ( InternalEObject ) reportParametersRef ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF, null, msgs );
            }
            return basicSetReportParametersRef( ( ReportParametersRef ) otherEnd, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF:
            if( binaryWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) binaryWiringParametersRef ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF, null,
                        msgs );
            }
            return basicSetBinaryWiringParametersRef( ( BinaryWiringParametersRef ) otherEnd, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDAS( ( DAS ) otherEnd, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDOS( ( DOS ) otherEnd, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSDS( ( SDS ) otherEnd, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE:
            if( refersToProcessResource != null ) {
                msgs = ( ( InternalEObject ) refersToProcessResource ).eInverseRemove( this,
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE, ProcessResource.class, msgs );
            }
            return basicSetRefersToProcessResource( ( ProcessResource ) otherEnd, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredBySourceRef() )
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
        case AsdPackage.SUBSCRIBER_LNODE__GOOSE_PARAMETERS_REF:
            return ( ( InternalEList< ? > ) getGooseParametersRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF:
            return basicUnsetSMVParametersRef( msgs );
        case AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF:
            return basicUnsetReportParametersRef( msgs );
        case AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF:
            return basicUnsetBinaryWiringParametersRef( msgs );
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS:
            return basicSetParentDAS( null, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS:
            return basicSetParentDOS( null, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS:
            return basicSetParentSDS( null, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE:
            return basicUnsetRefersToProcessResource( msgs );
        case AsdPackage.SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF:
            return ( ( InternalEList< ? > ) getReferredBySourceRef() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DAS__SUBSCRIBER_LNODE, DAS.class, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DOS__SUBSCRIBER_LNODE, DOS.class, msgs );
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SDS__SUBSCRIBER_LNODE, SDS.class, msgs );
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
        case AsdPackage.SUBSCRIBER_LNODE__GOOSE_PARAMETERS_REF:
            return getGooseParametersRef();
        case AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF:
            return getSMVParametersRef();
        case AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF:
            return getReportParametersRef();
        case AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF:
            return getBinaryWiringParametersRef();
        case AsdPackage.SUBSCRIBER_LNODE__INPUT_NAME:
            return getInputName();
        case AsdPackage.SUBSCRIBER_LNODE__PLN:
            return getPLN();
        case AsdPackage.SUBSCRIBER_LNODE__RESOURCE_NAME:
            return getResourceName();
        case AsdPackage.SUBSCRIBER_LNODE__RESOURCE_UUID:
            return getResourceUuid();
        case AsdPackage.SUBSCRIBER_LNODE__SERVICE:
            return getService();
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS:
            return getParentDAS();
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS:
            return getParentDOS();
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS:
            return getParentSDS();
        case AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE:
            if( resolve ) {
                return getRefersToProcessResource();
            }
            return basicGetRefersToProcessResource();
        case AsdPackage.SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF:
            return getReferredBySourceRef();
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
        case AsdPackage.SUBSCRIBER_LNODE__GOOSE_PARAMETERS_REF:
            getGooseParametersRef().clear();
            getGooseParametersRef().addAll( ( Collection< ? extends GooseParametersRef > ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF:
            setSMVParametersRef( ( SMVParametersRef ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF:
            setReportParametersRef( ( ReportParametersRef ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF:
            setBinaryWiringParametersRef( ( BinaryWiringParametersRef ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__INPUT_NAME:
            setInputName( ( String ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__PLN:
            setPLN( ( String ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__RESOURCE_NAME:
            setResourceName( ( String ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__RESOURCE_UUID:
            setResourceUuid( ( String ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__SERVICE:
            setService( ( SpecServiceEnum ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS:
            setParentDAS( ( DAS ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS:
            setParentDOS( ( DOS ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS:
            setParentSDS( ( SDS ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE:
            setRefersToProcessResource( ( ProcessResource ) newValue );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF:
            getReferredBySourceRef().clear();
            getReferredBySourceRef().addAll( ( Collection< ? extends SourceRef > ) newValue );
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
        case AsdPackage.SUBSCRIBER_LNODE__GOOSE_PARAMETERS_REF:
            unsetGooseParametersRef();
            return;
        case AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF:
            unsetSMVParametersRef();
            return;
        case AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF:
            unsetReportParametersRef();
            return;
        case AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF:
            unsetBinaryWiringParametersRef();
            return;
        case AsdPackage.SUBSCRIBER_LNODE__INPUT_NAME:
            setInputName( INPUT_NAME_EDEFAULT );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__PLN:
            setPLN( PLN_EDEFAULT );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__RESOURCE_NAME:
            setResourceName( RESOURCE_NAME_EDEFAULT );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__RESOURCE_UUID:
            setResourceUuid( RESOURCE_UUID_EDEFAULT );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__SERVICE:
            unsetService();
            return;
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS:
            setParentDAS( ( DAS ) null );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS:
            setParentDOS( ( DOS ) null );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS:
            setParentSDS( ( SDS ) null );
            return;
        case AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE:
            unsetRefersToProcessResource();
            return;
        case AsdPackage.SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF:
            unsetReferredBySourceRef();
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
        case AsdPackage.SUBSCRIBER_LNODE__GOOSE_PARAMETERS_REF:
            return isSetGooseParametersRef();
        case AsdPackage.SUBSCRIBER_LNODE__SMV_PARAMETERS_REF:
            return isSetSMVParametersRef();
        case AsdPackage.SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF:
            return isSetReportParametersRef();
        case AsdPackage.SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF:
            return isSetBinaryWiringParametersRef();
        case AsdPackage.SUBSCRIBER_LNODE__INPUT_NAME:
            return INPUT_NAME_EDEFAULT == null ? inputName != null : !INPUT_NAME_EDEFAULT.equals( inputName );
        case AsdPackage.SUBSCRIBER_LNODE__PLN:
            return PLN_EDEFAULT == null ? pLN != null : !PLN_EDEFAULT.equals( pLN );
        case AsdPackage.SUBSCRIBER_LNODE__RESOURCE_NAME:
            return RESOURCE_NAME_EDEFAULT == null ? resourceName != null
                    : !RESOURCE_NAME_EDEFAULT.equals( resourceName );
        case AsdPackage.SUBSCRIBER_LNODE__RESOURCE_UUID:
            return RESOURCE_UUID_EDEFAULT == null ? resourceUuid != null
                    : !RESOURCE_UUID_EDEFAULT.equals( resourceUuid );
        case AsdPackage.SUBSCRIBER_LNODE__SERVICE:
            return isSetService();
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DAS:
            return getParentDAS() != null;
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_DOS:
            return getParentDOS() != null;
        case AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS:
            return getParentSDS() != null;
        case AsdPackage.SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE:
            return isSetRefersToProcessResource();
        case AsdPackage.SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF:
            return isSetReferredBySourceRef();
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
        result.append( " (inputName: " );
        result.append( inputName );
        result.append( ", pLN: " );
        result.append( pLN );
        result.append( ", resourceName: " );
        result.append( resourceName );
        result.append( ", resourceUuid: " );
        result.append( resourceUuid );
        result.append( ", service: " );
        if( serviceESet ) {
            result.append( service );
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
                "SubscriberLNode.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from SubscriberLNode: ";
        doBuildExplicitLinkWithProcessResource( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithProcessResource( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for ProcessResource) ";

        Predicate< ProcessResource > processResourceFilter;
        if( getResourceUuid() != null && !getResourceUuid().isEmpty() ) {
            processResourceFilter = p -> getResourceUuid().equals( p.getUuid() );

        }
        else if( getResourceName() != null && !getResourceName().isEmpty() ) {
            processResourceFilter = p -> getResourceName().equals( p.getName() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because resource and resourceUuid are missing" );
            return;
        }

        EObject parent = eContainer();
        while( parent != null && !( parent instanceof LNode ) ) {
            parent = parent.eContainer();
        }

        if( parent != null && parent instanceof LNode ) {

            LNodeContainer container = ( ( LNode ) parent ).getParentLNodeContainer();
            Pair< ProcessResource, Integer > processResource = AsdUtilities.getProcessResource( container,
                    processResourceFilter );

            if( processResource.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( processResource.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "ProcessResource( name = ", getResourceName(), " )" );
                return;
            }

            setRefersToProcessResource( processResource.getLeft() );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "SubscriberLNode refers to ProcessResource( name = ", getRefersToProcessResource().getName(),
                    " )", " on line ", getRefersToProcessResource().getLineNumber() );

        }
        else {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, " SubscriberLNode is not inside a LNode" );
        }
    }

} //SubscriberLNodeImpl
