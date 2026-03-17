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
import java.util.function.Predicate;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getGooseParametersRef <em>Goose Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getSMVParametersRef <em>SMV Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getReportParametersRef <em>Report Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getExtRefAddr <em>Ext Ref Addr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getExtRefUuid <em>Ext Ref Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getInput <em>Input</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getInputInst <em>Input Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getService <em>Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getSourceDaName <em>Source Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getSourceDoName <em>Source Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getSourceLNodeUuid <em>Source LNode Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getParentLNodeInputs <em>Parent LNode Inputs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getReferredByInputVar <em>Referred By Input Var</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getReferredByLNodeInputRef <em>Referred By LNode Input Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getRefersToSubscriberLNode <em>Refers To Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getRefersToProcessResource <em>Refers To Process Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getRefersToLNode <em>Refers To LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl#getRefersToExtRef <em>Refers To Ext Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceRefImpl extends LinkFCDARefImpl implements SourceRef {
    /**
     * The cached value of the '{@link #getGooseParametersRef() <em>Goose Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGooseParametersRef()
     * @generated
     * @ordered
     */
    protected GooseParametersRef gooseParametersRef;

    /**
     * This is true if the Goose Parameters Ref containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gooseParametersRefESet;

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
     * The cached value of the '{@link #getAnalogueWiringParametersRef() <em>Analogue Wiring Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalogueWiringParametersRef()
     * @generated
     * @ordered
     */
    protected AnalogueWiringParametersRef analogueWiringParametersRef;

    /**
     * This is true if the Analogue Wiring Parameters Ref containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean analogueWiringParametersRefESet;

    /**
     * The default value of the '{@link #getExtRefAddr() <em>Ext Ref Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtRefAddr()
     * @generated
     * @ordered
     */
    protected static final String EXT_REF_ADDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExtRefAddr() <em>Ext Ref Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtRefAddr()
     * @generated
     * @ordered
     */
    protected String extRefAddr = EXT_REF_ADDR_EDEFAULT;

    /**
     * The default value of the '{@link #getExtRefUuid() <em>Ext Ref Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtRefUuid()
     * @generated
     * @ordered
     */
    protected static final String EXT_REF_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExtRefUuid() <em>Ext Ref Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtRefUuid()
     * @generated
     * @ordered
     */
    protected String extRefUuid = EXT_REF_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected static final String INPUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected String input = INPUT_EDEFAULT;

    /**
     * The default value of the '{@link #getInputInst() <em>Input Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputInst()
     * @generated
     * @ordered
     */
    protected static final int INPUT_INST_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getInputInst() <em>Input Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputInst()
     * @generated
     * @ordered
     */
    protected int inputInst = INPUT_INST_EDEFAULT;

    /**
     * This is true if the Input Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inputInstESet;

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
     * The default value of the '{@link #getSourceDaName() <em>Source Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceDaName()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_DA_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceDaName() <em>Source Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceDaName()
     * @generated
     * @ordered
     */
    protected String sourceDaName = SOURCE_DA_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSourceDoName() <em>Source Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceDoName()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_DO_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceDoName() <em>Source Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceDoName()
     * @generated
     * @ordered
     */
    protected String sourceDoName = SOURCE_DO_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getSourceLNodeUuid() <em>Source LNode Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceLNodeUuid()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_LNODE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSourceLNodeUuid() <em>Source LNode Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceLNodeUuid()
     * @generated
     * @ordered
     */
    protected String sourceLNodeUuid = SOURCE_LNODE_UUID_EDEFAULT;

    /**
     * The cached value of the '{@link #getReferredByInputVar() <em>Referred By Input Var</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByInputVar()
     * @generated
     * @ordered
     */
    protected EList< InputVar > referredByInputVar;

    /**
     * The cached value of the '{@link #getReferredByLNodeInputRef() <em>Referred By LNode Input Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByLNodeInputRef()
     * @generated
     * @ordered
     */
    protected EList< LNodeInputRef > referredByLNodeInputRef;

    /**
     * The cached value of the '{@link #getRefersToSubscriberLNode() <em>Refers To Subscriber LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToSubscriberLNode()
     * @generated
     * @ordered
     */
    protected SubscriberLNode refersToSubscriberLNode;

    /**
     * This is true if the Refers To Subscriber LNode reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToSubscriberLNodeESet;

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
     * The cached value of the '{@link #getRefersToLNode() <em>Refers To LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToLNode()
     * @generated
     * @ordered
     */
    protected LNode refersToLNode;

    /**
     * This is true if the Refers To LNode reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToLNodeESet;

    /**
     * The cached value of the '{@link #getRefersToExtRef() <em>Refers To Ext Ref</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToExtRef()
     * @generated
     * @ordered
     */
    protected ExtRef refersToExtRef;

    /**
     * This is true if the Refers To Ext Ref reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToExtRefESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SourceRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getSourceRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GooseParametersRef getGooseParametersRef() {
        return gooseParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGooseParametersRef( GooseParametersRef newGooseParametersRef,
            NotificationChain msgs ) {
        GooseParametersRef oldGooseParametersRef = gooseParametersRef;
        gooseParametersRef = newGooseParametersRef;
        boolean oldGooseParametersRefESet = gooseParametersRefESet;
        gooseParametersRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF, oldGooseParametersRef, newGooseParametersRef,
                    !oldGooseParametersRefESet );
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
    public void setGooseParametersRef( GooseParametersRef newGooseParametersRef ) {
        if( newGooseParametersRef != gooseParametersRef ) {
            NotificationChain msgs = null;
            if( gooseParametersRef != null ) {
                msgs = ( ( InternalEObject ) gooseParametersRef ).eInverseRemove( this,
                        AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF, GooseParametersRef.class, msgs );
            }
            if( newGooseParametersRef != null ) {
                msgs = ( ( InternalEObject ) newGooseParametersRef ).eInverseAdd( this,
                        AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF, GooseParametersRef.class, msgs );
            }
            msgs = basicSetGooseParametersRef( newGooseParametersRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldGooseParametersRefESet = gooseParametersRefESet;
            gooseParametersRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF,
                        newGooseParametersRef, newGooseParametersRef, !oldGooseParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetGooseParametersRef( NotificationChain msgs ) {
        GooseParametersRef oldGooseParametersRef = gooseParametersRef;
        gooseParametersRef = null;
        boolean oldGooseParametersRefESet = gooseParametersRefESet;
        gooseParametersRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF, oldGooseParametersRef, null,
                    oldGooseParametersRefESet );
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
    public void unsetGooseParametersRef() {
        if( gooseParametersRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) gooseParametersRef ).eInverseRemove( this,
                    AsdPackage.GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF, GooseParametersRef.class, msgs );
            msgs = basicUnsetGooseParametersRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldGooseParametersRefESet = gooseParametersRefESet;
            gooseParametersRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF,
                        null, null, oldGooseParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGooseParametersRef() {
        return gooseParametersRefESet;
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
                    AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF, oldSMVParametersRef, newSMVParametersRef,
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
                        AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF, SMVParametersRef.class, msgs );
            }
            if( newSMVParametersRef != null ) {
                msgs = ( ( InternalEObject ) newSMVParametersRef ).eInverseAdd( this,
                        AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF, SMVParametersRef.class, msgs );
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
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF,
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
                    AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF, oldSMVParametersRef, null, oldSMVParametersRefESet );
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
                    AsdPackage.SMV_PARAMETERS_REF__PARENT_SOURCE_REF, SMVParametersRef.class, msgs );
            msgs = basicUnsetSMVParametersRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldSMVParametersRefESet = smvParametersRefESet;
            smvParametersRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF,
                        null, null, oldSMVParametersRefESet ) );
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
                    AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF, oldReportParametersRef, newReportParametersRef,
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
                        AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF, ReportParametersRef.class, msgs );
            }
            if( newReportParametersRef != null ) {
                msgs = ( ( InternalEObject ) newReportParametersRef ).eInverseAdd( this,
                        AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF, ReportParametersRef.class, msgs );
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
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF,
                        newReportParametersRef, newReportParametersRef, !oldReportParametersRefESet ) );
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
                    AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF, oldReportParametersRef, null,
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
                    AsdPackage.REPORT_PARAMETERS_REF__PARENT_SOURCE_REF, ReportParametersRef.class, msgs );
            msgs = basicUnsetReportParametersRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldReportParametersRefESet = reportParametersRefESet;
            reportParametersRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF,
                        null, null, oldReportParametersRefESet ) );
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
                    AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF, oldBinaryWiringParametersRef,
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
                        AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF, BinaryWiringParametersRef.class,
                        msgs );
            }
            if( newBinaryWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) newBinaryWiringParametersRef ).eInverseAdd( this,
                        AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF, BinaryWiringParametersRef.class,
                        msgs );
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
                        AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF, newBinaryWiringParametersRef,
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
                    AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF, oldBinaryWiringParametersRef, null,
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
                    AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF, BinaryWiringParametersRef.class, msgs );
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
                        AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF, null, null,
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
    public AnalogueWiringParametersRef getAnalogueWiringParametersRef() {
        return analogueWiringParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnalogueWiringParametersRef(
            AnalogueWiringParametersRef newAnalogueWiringParametersRef, NotificationChain msgs ) {
        AnalogueWiringParametersRef oldAnalogueWiringParametersRef = analogueWiringParametersRef;
        analogueWiringParametersRef = newAnalogueWiringParametersRef;
        boolean oldAnalogueWiringParametersRefESet = analogueWiringParametersRefESet;
        analogueWiringParametersRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF, oldAnalogueWiringParametersRef,
                    newAnalogueWiringParametersRef, !oldAnalogueWiringParametersRefESet );
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
    public void setAnalogueWiringParametersRef( AnalogueWiringParametersRef newAnalogueWiringParametersRef ) {
        if( newAnalogueWiringParametersRef != analogueWiringParametersRef ) {
            NotificationChain msgs = null;
            if( analogueWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) analogueWiringParametersRef ).eInverseRemove( this,
                        AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF, AnalogueWiringParametersRef.class,
                        msgs );
            }
            if( newAnalogueWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) newAnalogueWiringParametersRef ).eInverseAdd( this,
                        AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF, AnalogueWiringParametersRef.class,
                        msgs );
            }
            msgs = basicSetAnalogueWiringParametersRef( newAnalogueWiringParametersRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldAnalogueWiringParametersRefESet = analogueWiringParametersRefESet;
            analogueWiringParametersRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF, newAnalogueWiringParametersRef,
                        newAnalogueWiringParametersRef, !oldAnalogueWiringParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAnalogueWiringParametersRef( NotificationChain msgs ) {
        AnalogueWiringParametersRef oldAnalogueWiringParametersRef = analogueWiringParametersRef;
        analogueWiringParametersRef = null;
        boolean oldAnalogueWiringParametersRefESet = analogueWiringParametersRefESet;
        analogueWiringParametersRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF, oldAnalogueWiringParametersRef, null,
                    oldAnalogueWiringParametersRefESet );
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
    public void unsetAnalogueWiringParametersRef() {
        if( analogueWiringParametersRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) analogueWiringParametersRef ).eInverseRemove( this,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF, AnalogueWiringParametersRef.class,
                    msgs );
            msgs = basicUnsetAnalogueWiringParametersRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldAnalogueWiringParametersRefESet = analogueWiringParametersRefESet;
            analogueWiringParametersRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF, null, null,
                        oldAnalogueWiringParametersRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalogueWiringParametersRef() {
        return analogueWiringParametersRefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getExtRefAddr() {
        return extRefAddr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExtRefAddr( String newExtRefAddr ) {
        String oldExtRefAddr = extRefAddr;
        extRefAddr = newExtRefAddr;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__EXT_REF_ADDR, oldExtRefAddr,
                    extRefAddr ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getExtRefUuid() {
        return extRefUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExtRefUuid( String newExtRefUuid ) {
        String oldExtRefUuid = extRefUuid;
        extRefUuid = newExtRefUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__EXT_REF_UUID, oldExtRefUuid,
                    extRefUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getInput() {
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInput( String newInput ) {
        String oldInput = input;
        input = newInput;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__INPUT, oldInput, input ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getInputInst() {
        return inputInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputInst( int newInputInst ) {
        int oldInputInst = inputInst;
        inputInst = newInputInst;
        boolean oldInputInstESet = inputInstESet;
        inputInstESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__INPUT_INST, oldInputInst,
                    inputInst, !oldInputInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInputInst() {
        int oldInputInst = inputInst;
        boolean oldInputInstESet = inputInstESet;
        inputInst = INPUT_INST_EDEFAULT;
        inputInstESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SOURCE_REF__INPUT_INST, oldInputInst,
                    INPUT_INST_EDEFAULT, oldInputInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInputInst() {
        return inputInstESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__SERVICE, oldService, service,
                    !oldServiceESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SOURCE_REF__SERVICE, oldService,
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
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__SOURCE, oldSource,
                    source ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSourceDaName() {
        return sourceDaName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSourceDaName( String newSourceDaName ) {
        String oldSourceDaName = sourceDaName;
        sourceDaName = newSourceDaName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__SOURCE_DA_NAME,
                    oldSourceDaName, sourceDaName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSourceDoName() {
        return sourceDoName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSourceDoName( String newSourceDoName ) {
        String oldSourceDoName = sourceDoName;
        sourceDoName = newSourceDoName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__SOURCE_DO_NAME,
                    oldSourceDoName, sourceDoName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSourceLNodeUuid() {
        return sourceLNodeUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSourceLNodeUuid( String newSourceLNodeUuid ) {
        String oldSourceLNodeUuid = sourceLNodeUuid;
        sourceLNodeUuid = newSourceLNodeUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__SOURCE_LNODE_UUID,
                    oldSourceLNodeUuid, sourceLNodeUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeInputs getParentLNodeInputs() {
        if( eContainerFeatureID() != AsdPackage.SOURCE_REF__PARENT_LNODE_INPUTS ) {
            return null;
        }
        return ( LNodeInputs ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLNodeInputs( LNodeInputs newParentLNodeInputs, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLNodeInputs, AsdPackage.SOURCE_REF__PARENT_LNODE_INPUTS,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLNodeInputs( LNodeInputs newParentLNodeInputs ) {
        if( newParentLNodeInputs != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.SOURCE_REF__PARENT_LNODE_INPUTS
                        && newParentLNodeInputs != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLNodeInputs ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentLNodeInputs != null ) {
                msgs = ( ( InternalEObject ) newParentLNodeInputs ).eInverseAdd( this,
                        AsdPackage.LNODE_INPUTS__SOURCE_REF, LNodeInputs.class, msgs );
            }
            msgs = basicSetParentLNodeInputs( newParentLNodeInputs, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__PARENT_LNODE_INPUTS,
                    newParentLNodeInputs, newParentLNodeInputs ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< InputVar > getReferredByInputVar() {
        if( referredByInputVar == null ) {
            referredByInputVar = new EObjectWithInverseResolvingEList.Unsettable< >( InputVar.class, this,
                    AsdPackage.SOURCE_REF__REFERRED_BY_INPUT_VAR, AsdPackage.INPUT_VAR__REFERS_TO_SOURCE_REF );
        }
        return referredByInputVar;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByInputVar() {
        if( referredByInputVar != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByInputVar ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByInputVar() {
        return referredByInputVar != null && ( ( InternalEList.Unsettable< ? > ) referredByInputVar ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LNodeInputRef > getReferredByLNodeInputRef() {
        if( referredByLNodeInputRef == null ) {
            referredByLNodeInputRef = new EObjectWithInverseResolvingEList.Unsettable< >(
                    LNodeInputRef.class, this, AsdPackage.SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF,
                    AsdPackage.LNODE_INPUT_REF__REFERS_TO_SOURCE_REF );
        }
        return referredByLNodeInputRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByLNodeInputRef() {
        if( referredByLNodeInputRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByLNodeInputRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByLNodeInputRef() {
        return referredByLNodeInputRef != null && ( ( InternalEList.Unsettable< ? > ) referredByLNodeInputRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubscriberLNode getRefersToSubscriberLNode() {
        if( refersToSubscriberLNode != null && refersToSubscriberLNode.eIsProxy() ) {
            InternalEObject oldRefersToSubscriberLNode = ( InternalEObject ) refersToSubscriberLNode;
            refersToSubscriberLNode = ( SubscriberLNode ) eResolveProxy( oldRefersToSubscriberLNode );
            if( refersToSubscriberLNode != oldRefersToSubscriberLNode ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE, oldRefersToSubscriberLNode,
                            refersToSubscriberLNode ) );
                }
            }
        }
        return refersToSubscriberLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubscriberLNode basicGetRefersToSubscriberLNode() {
        return refersToSubscriberLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToSubscriberLNode( SubscriberLNode newRefersToSubscriberLNode,
            NotificationChain msgs ) {
        SubscriberLNode oldRefersToSubscriberLNode = refersToSubscriberLNode;
        refersToSubscriberLNode = newRefersToSubscriberLNode;
        boolean oldRefersToSubscriberLNodeESet = refersToSubscriberLNodeESet;
        refersToSubscriberLNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE, oldRefersToSubscriberLNode,
                    newRefersToSubscriberLNode, !oldRefersToSubscriberLNodeESet );
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
    public void setRefersToSubscriberLNode( SubscriberLNode newRefersToSubscriberLNode ) {
        if( newRefersToSubscriberLNode != refersToSubscriberLNode ) {
            NotificationChain msgs = null;
            if( refersToSubscriberLNode != null ) {
                msgs = ( ( InternalEObject ) refersToSubscriberLNode ).eInverseRemove( this,
                        AsdPackage.SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF, SubscriberLNode.class, msgs );
            }
            if( newRefersToSubscriberLNode != null ) {
                msgs = ( ( InternalEObject ) newRefersToSubscriberLNode ).eInverseAdd( this,
                        AsdPackage.SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF, SubscriberLNode.class, msgs );
            }
            msgs = basicSetRefersToSubscriberLNode( newRefersToSubscriberLNode, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSubscriberLNodeESet = refersToSubscriberLNodeESet;
            refersToSubscriberLNodeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE, newRefersToSubscriberLNode,
                        newRefersToSubscriberLNode, !oldRefersToSubscriberLNodeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToSubscriberLNode( NotificationChain msgs ) {
        SubscriberLNode oldRefersToSubscriberLNode = refersToSubscriberLNode;
        refersToSubscriberLNode = null;
        boolean oldRefersToSubscriberLNodeESet = refersToSubscriberLNodeESet;
        refersToSubscriberLNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE, oldRefersToSubscriberLNode, null,
                    oldRefersToSubscriberLNodeESet );
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
    public void unsetRefersToSubscriberLNode() {
        if( refersToSubscriberLNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToSubscriberLNode ).eInverseRemove( this,
                    AsdPackage.SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF, SubscriberLNode.class, msgs );
            msgs = basicUnsetRefersToSubscriberLNode( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSubscriberLNodeESet = refersToSubscriberLNodeESet;
            refersToSubscriberLNodeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE, null, null,
                        oldRefersToSubscriberLNodeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToSubscriberLNode() {
        return refersToSubscriberLNodeESet;
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
                            AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource,
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
                    AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource,
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
                        AsdPackage.PROCESS_RESOURCE__REFERREDBY_SOURCE_REF, ProcessResource.class, msgs );
            }
            if( newRefersToProcessResource != null ) {
                msgs = ( ( InternalEObject ) newRefersToProcessResource ).eInverseAdd( this,
                        AsdPackage.PROCESS_RESOURCE__REFERREDBY_SOURCE_REF, ProcessResource.class, msgs );
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
                        AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE, newRefersToProcessResource,
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
                    AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource, null,
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
                    AsdPackage.PROCESS_RESOURCE__REFERREDBY_SOURCE_REF, ProcessResource.class, msgs );
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
                        AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE, null, null,
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
    public LNode getRefersToLNode() {
        if( refersToLNode != null && refersToLNode.eIsProxy() ) {
            InternalEObject oldRefersToLNode = ( InternalEObject ) refersToLNode;
            refersToLNode = ( LNode ) eResolveProxy( oldRefersToLNode );
            if( refersToLNode != oldRefersToLNode ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, AsdPackage.SOURCE_REF__REFERS_TO_LNODE,
                            oldRefersToLNode, refersToLNode ) );
                }
            }
        }
        return refersToLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LNode basicGetRefersToLNode() {
        return refersToLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToLNode( LNode newRefersToLNode, NotificationChain msgs ) {
        LNode oldRefersToLNode = refersToLNode;
        refersToLNode = newRefersToLNode;
        boolean oldRefersToLNodeESet = refersToLNodeESet;
        refersToLNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SOURCE_REF__REFERS_TO_LNODE, oldRefersToLNode, newRefersToLNode, !oldRefersToLNodeESet );
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
    public void setRefersToLNode( LNode newRefersToLNode ) {
        if( newRefersToLNode != refersToLNode ) {
            NotificationChain msgs = null;
            if( refersToLNode != null ) {
                msgs = ( ( InternalEObject ) refersToLNode ).eInverseRemove( this,
                        SclPackage.LNODE__REFERRED_BY_SOURCE_REF, LNode.class, msgs );
            }
            if( newRefersToLNode != null ) {
                msgs = ( ( InternalEObject ) newRefersToLNode ).eInverseAdd( this,
                        SclPackage.LNODE__REFERRED_BY_SOURCE_REF, LNode.class, msgs );
            }
            msgs = basicSetRefersToLNode( newRefersToLNode, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToLNodeESet = refersToLNodeESet;
            refersToLNodeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__REFERS_TO_LNODE,
                        newRefersToLNode, newRefersToLNode, !oldRefersToLNodeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToLNode( NotificationChain msgs ) {
        LNode oldRefersToLNode = refersToLNode;
        refersToLNode = null;
        boolean oldRefersToLNodeESet = refersToLNodeESet;
        refersToLNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.SOURCE_REF__REFERS_TO_LNODE, oldRefersToLNode, null, oldRefersToLNodeESet );
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
    public void unsetRefersToLNode() {
        if( refersToLNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToLNode ).eInverseRemove( this, SclPackage.LNODE__REFERRED_BY_SOURCE_REF,
                    LNode.class, msgs );
            msgs = basicUnsetRefersToLNode( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToLNodeESet = refersToLNodeESet;
            refersToLNodeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SOURCE_REF__REFERS_TO_LNODE, null,
                        null, oldRefersToLNodeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToLNode() {
        return refersToLNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExtRef getRefersToExtRef() {
        if( refersToExtRef != null && refersToExtRef.eIsProxy() ) {
            InternalEObject oldRefersToExtRef = ( InternalEObject ) refersToExtRef;
            refersToExtRef = ( ExtRef ) eResolveProxy( oldRefersToExtRef );
            if( refersToExtRef != oldRefersToExtRef ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.SOURCE_REF__REFERS_TO_EXT_REF, oldRefersToExtRef, refersToExtRef ) );
                }
            }
        }
        return refersToExtRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtRef basicGetRefersToExtRef() {
        return refersToExtRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToExtRef( ExtRef newRefersToExtRef, NotificationChain msgs ) {
        ExtRef oldRefersToExtRef = refersToExtRef;
        refersToExtRef = newRefersToExtRef;
        boolean oldRefersToExtRefESet = refersToExtRefESet;
        refersToExtRefESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.SOURCE_REF__REFERS_TO_EXT_REF, oldRefersToExtRef, newRefersToExtRef,
                    !oldRefersToExtRefESet );
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
    public void setRefersToExtRef( ExtRef newRefersToExtRef ) {
        if( newRefersToExtRef != refersToExtRef ) {
            NotificationChain msgs = null;
            if( refersToExtRef != null ) {
                msgs = ( ( InternalEObject ) refersToExtRef ).eInverseRemove( this,
                        SclPackage.EXT_REF__REFERRED_BY_SOURCE_REF, ExtRef.class, msgs );
            }
            if( newRefersToExtRef != null ) {
                msgs = ( ( InternalEObject ) newRefersToExtRef ).eInverseAdd( this,
                        SclPackage.EXT_REF__REFERRED_BY_SOURCE_REF, ExtRef.class, msgs );
            }
            msgs = basicSetRefersToExtRef( newRefersToExtRef, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToExtRefESet = refersToExtRefESet;
            refersToExtRefESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SOURCE_REF__REFERS_TO_EXT_REF,
                        newRefersToExtRef, newRefersToExtRef, !oldRefersToExtRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToExtRef( NotificationChain msgs ) {
        ExtRef oldRefersToExtRef = refersToExtRef;
        refersToExtRef = null;
        boolean oldRefersToExtRefESet = refersToExtRefESet;
        refersToExtRefESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.SOURCE_REF__REFERS_TO_EXT_REF, oldRefersToExtRef, null, oldRefersToExtRefESet );
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
    public void unsetRefersToExtRef() {
        if( refersToExtRef != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToExtRef ).eInverseRemove( this,
                    SclPackage.EXT_REF__REFERRED_BY_SOURCE_REF, ExtRef.class, msgs );
            msgs = basicUnsetRefersToExtRef( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToExtRefESet = refersToExtRefESet;
            refersToExtRefESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SOURCE_REF__REFERS_TO_EXT_REF,
                        null, null, oldRefersToExtRefESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToExtRef() {
        return refersToExtRefESet;
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
        case AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF:
            if( gooseParametersRef != null ) {
                msgs = ( ( InternalEObject ) gooseParametersRef ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF, null, msgs );
            }
            return basicSetGooseParametersRef( ( GooseParametersRef ) otherEnd, msgs );
        case AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF:
            if( smvParametersRef != null ) {
                msgs = ( ( InternalEObject ) smvParametersRef ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF, null, msgs );
            }
            return basicSetSMVParametersRef( ( SMVParametersRef ) otherEnd, msgs );
        case AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF:
            if( reportParametersRef != null ) {
                msgs = ( ( InternalEObject ) reportParametersRef ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF, null, msgs );
            }
            return basicSetReportParametersRef( ( ReportParametersRef ) otherEnd, msgs );
        case AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF:
            if( binaryWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) binaryWiringParametersRef ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF, null, msgs );
            }
            return basicSetBinaryWiringParametersRef( ( BinaryWiringParametersRef ) otherEnd, msgs );
        case AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            if( analogueWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) analogueWiringParametersRef ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF, null, msgs );
            }
            return basicSetAnalogueWiringParametersRef( ( AnalogueWiringParametersRef ) otherEnd, msgs );
        case AsdPackage.SOURCE_REF__PARENT_LNODE_INPUTS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentLNodeInputs( ( LNodeInputs ) otherEnd, msgs );
        case AsdPackage.SOURCE_REF__REFERRED_BY_INPUT_VAR:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByInputVar() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByLNodeInputRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE:
            if( refersToSubscriberLNode != null ) {
                msgs = ( ( InternalEObject ) refersToSubscriberLNode ).eInverseRemove( this,
                        AsdPackage.SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF, SubscriberLNode.class, msgs );
            }
            return basicSetRefersToSubscriberLNode( ( SubscriberLNode ) otherEnd, msgs );
        case AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            if( refersToProcessResource != null ) {
                msgs = ( ( InternalEObject ) refersToProcessResource ).eInverseRemove( this,
                        AsdPackage.PROCESS_RESOURCE__REFERREDBY_SOURCE_REF, ProcessResource.class, msgs );
            }
            return basicSetRefersToProcessResource( ( ProcessResource ) otherEnd, msgs );
        case AsdPackage.SOURCE_REF__REFERS_TO_LNODE:
            if( refersToLNode != null ) {
                msgs = ( ( InternalEObject ) refersToLNode ).eInverseRemove( this,
                        SclPackage.LNODE__REFERRED_BY_SOURCE_REF, LNode.class, msgs );
            }
            return basicSetRefersToLNode( ( LNode ) otherEnd, msgs );
        case AsdPackage.SOURCE_REF__REFERS_TO_EXT_REF:
            if( refersToExtRef != null ) {
                msgs = ( ( InternalEObject ) refersToExtRef ).eInverseRemove( this,
                        SclPackage.EXT_REF__REFERRED_BY_SOURCE_REF, ExtRef.class, msgs );
            }
            return basicSetRefersToExtRef( ( ExtRef ) otherEnd, msgs );
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
        case AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF:
            return basicUnsetGooseParametersRef( msgs );
        case AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF:
            return basicUnsetSMVParametersRef( msgs );
        case AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF:
            return basicUnsetReportParametersRef( msgs );
        case AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF:
            return basicUnsetBinaryWiringParametersRef( msgs );
        case AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            return basicUnsetAnalogueWiringParametersRef( msgs );
        case AsdPackage.SOURCE_REF__PARENT_LNODE_INPUTS:
            return basicSetParentLNodeInputs( null, msgs );
        case AsdPackage.SOURCE_REF__REFERRED_BY_INPUT_VAR:
            return ( ( InternalEList< ? > ) getReferredByInputVar() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF:
            return ( ( InternalEList< ? > ) getReferredByLNodeInputRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE:
            return basicUnsetRefersToSubscriberLNode( msgs );
        case AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            return basicUnsetRefersToProcessResource( msgs );
        case AsdPackage.SOURCE_REF__REFERS_TO_LNODE:
            return basicUnsetRefersToLNode( msgs );
        case AsdPackage.SOURCE_REF__REFERS_TO_EXT_REF:
            return basicUnsetRefersToExtRef( msgs );
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
        case AsdPackage.SOURCE_REF__PARENT_LNODE_INPUTS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.LNODE_INPUTS__SOURCE_REF, LNodeInputs.class,
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
        case AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF:
            return getGooseParametersRef();
        case AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF:
            return getSMVParametersRef();
        case AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF:
            return getReportParametersRef();
        case AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF:
            return getBinaryWiringParametersRef();
        case AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            return getAnalogueWiringParametersRef();
        case AsdPackage.SOURCE_REF__EXT_REF_ADDR:
            return getExtRefAddr();
        case AsdPackage.SOURCE_REF__EXT_REF_UUID:
            return getExtRefUuid();
        case AsdPackage.SOURCE_REF__INPUT:
            return getInput();
        case AsdPackage.SOURCE_REF__INPUT_INST:
            return getInputInst();
        case AsdPackage.SOURCE_REF__SERVICE:
            return getService();
        case AsdPackage.SOURCE_REF__SOURCE:
            return getSource();
        case AsdPackage.SOURCE_REF__SOURCE_DA_NAME:
            return getSourceDaName();
        case AsdPackage.SOURCE_REF__SOURCE_DO_NAME:
            return getSourceDoName();
        case AsdPackage.SOURCE_REF__SOURCE_LNODE_UUID:
            return getSourceLNodeUuid();
        case AsdPackage.SOURCE_REF__PARENT_LNODE_INPUTS:
            return getParentLNodeInputs();
        case AsdPackage.SOURCE_REF__REFERRED_BY_INPUT_VAR:
            return getReferredByInputVar();
        case AsdPackage.SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF:
            return getReferredByLNodeInputRef();
        case AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE:
            if( resolve ) {
                return getRefersToSubscriberLNode();
            }
            return basicGetRefersToSubscriberLNode();
        case AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            if( resolve ) {
                return getRefersToProcessResource();
            }
            return basicGetRefersToProcessResource();
        case AsdPackage.SOURCE_REF__REFERS_TO_LNODE:
            if( resolve ) {
                return getRefersToLNode();
            }
            return basicGetRefersToLNode();
        case AsdPackage.SOURCE_REF__REFERS_TO_EXT_REF:
            if( resolve ) {
                return getRefersToExtRef();
            }
            return basicGetRefersToExtRef();
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
        case AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF:
            setGooseParametersRef( ( GooseParametersRef ) newValue );
            return;
        case AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF:
            setSMVParametersRef( ( SMVParametersRef ) newValue );
            return;
        case AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF:
            setReportParametersRef( ( ReportParametersRef ) newValue );
            return;
        case AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF:
            setBinaryWiringParametersRef( ( BinaryWiringParametersRef ) newValue );
            return;
        case AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            setAnalogueWiringParametersRef( ( AnalogueWiringParametersRef ) newValue );
            return;
        case AsdPackage.SOURCE_REF__EXT_REF_ADDR:
            setExtRefAddr( ( String ) newValue );
            return;
        case AsdPackage.SOURCE_REF__EXT_REF_UUID:
            setExtRefUuid( ( String ) newValue );
            return;
        case AsdPackage.SOURCE_REF__INPUT:
            setInput( ( String ) newValue );
            return;
        case AsdPackage.SOURCE_REF__INPUT_INST:
            setInputInst( ( Integer ) newValue );
            return;
        case AsdPackage.SOURCE_REF__SERVICE:
            setService( ( SpecServiceEnum ) newValue );
            return;
        case AsdPackage.SOURCE_REF__SOURCE:
            setSource( ( String ) newValue );
            return;
        case AsdPackage.SOURCE_REF__SOURCE_DA_NAME:
            setSourceDaName( ( String ) newValue );
            return;
        case AsdPackage.SOURCE_REF__SOURCE_DO_NAME:
            setSourceDoName( ( String ) newValue );
            return;
        case AsdPackage.SOURCE_REF__SOURCE_LNODE_UUID:
            setSourceLNodeUuid( ( String ) newValue );
            return;
        case AsdPackage.SOURCE_REF__PARENT_LNODE_INPUTS:
            setParentLNodeInputs( ( LNodeInputs ) newValue );
            return;
        case AsdPackage.SOURCE_REF__REFERRED_BY_INPUT_VAR:
            getReferredByInputVar().clear();
            getReferredByInputVar().addAll( ( Collection< ? extends InputVar > ) newValue );
            return;
        case AsdPackage.SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF:
            getReferredByLNodeInputRef().clear();
            getReferredByLNodeInputRef().addAll( ( Collection< ? extends LNodeInputRef > ) newValue );
            return;
        case AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE:
            setRefersToSubscriberLNode( ( SubscriberLNode ) newValue );
            return;
        case AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            setRefersToProcessResource( ( ProcessResource ) newValue );
            return;
        case AsdPackage.SOURCE_REF__REFERS_TO_LNODE:
            setRefersToLNode( ( LNode ) newValue );
            return;
        case AsdPackage.SOURCE_REF__REFERS_TO_EXT_REF:
            setRefersToExtRef( ( ExtRef ) newValue );
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
        case AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF:
            unsetGooseParametersRef();
            return;
        case AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF:
            unsetSMVParametersRef();
            return;
        case AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF:
            unsetReportParametersRef();
            return;
        case AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF:
            unsetBinaryWiringParametersRef();
            return;
        case AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            unsetAnalogueWiringParametersRef();
            return;
        case AsdPackage.SOURCE_REF__EXT_REF_ADDR:
            setExtRefAddr( EXT_REF_ADDR_EDEFAULT );
            return;
        case AsdPackage.SOURCE_REF__EXT_REF_UUID:
            setExtRefUuid( EXT_REF_UUID_EDEFAULT );
            return;
        case AsdPackage.SOURCE_REF__INPUT:
            setInput( INPUT_EDEFAULT );
            return;
        case AsdPackage.SOURCE_REF__INPUT_INST:
            unsetInputInst();
            return;
        case AsdPackage.SOURCE_REF__SERVICE:
            unsetService();
            return;
        case AsdPackage.SOURCE_REF__SOURCE:
            setSource( SOURCE_EDEFAULT );
            return;
        case AsdPackage.SOURCE_REF__SOURCE_DA_NAME:
            setSourceDaName( SOURCE_DA_NAME_EDEFAULT );
            return;
        case AsdPackage.SOURCE_REF__SOURCE_DO_NAME:
            setSourceDoName( SOURCE_DO_NAME_EDEFAULT );
            return;
        case AsdPackage.SOURCE_REF__SOURCE_LNODE_UUID:
            setSourceLNodeUuid( SOURCE_LNODE_UUID_EDEFAULT );
            return;
        case AsdPackage.SOURCE_REF__PARENT_LNODE_INPUTS:
            setParentLNodeInputs( ( LNodeInputs ) null );
            return;
        case AsdPackage.SOURCE_REF__REFERRED_BY_INPUT_VAR:
            unsetReferredByInputVar();
            return;
        case AsdPackage.SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF:
            unsetReferredByLNodeInputRef();
            return;
        case AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE:
            unsetRefersToSubscriberLNode();
            return;
        case AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            unsetRefersToProcessResource();
            return;
        case AsdPackage.SOURCE_REF__REFERS_TO_LNODE:
            unsetRefersToLNode();
            return;
        case AsdPackage.SOURCE_REF__REFERS_TO_EXT_REF:
            unsetRefersToExtRef();
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
        case AsdPackage.SOURCE_REF__GOOSE_PARAMETERS_REF:
            return isSetGooseParametersRef();
        case AsdPackage.SOURCE_REF__SMV_PARAMETERS_REF:
            return isSetSMVParametersRef();
        case AsdPackage.SOURCE_REF__REPORT_PARAMETERS_REF:
            return isSetReportParametersRef();
        case AsdPackage.SOURCE_REF__BINARY_WIRING_PARAMETERS_REF:
            return isSetBinaryWiringParametersRef();
        case AsdPackage.SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            return isSetAnalogueWiringParametersRef();
        case AsdPackage.SOURCE_REF__EXT_REF_ADDR:
            return EXT_REF_ADDR_EDEFAULT == null ? extRefAddr != null : !EXT_REF_ADDR_EDEFAULT.equals( extRefAddr );
        case AsdPackage.SOURCE_REF__EXT_REF_UUID:
            return EXT_REF_UUID_EDEFAULT == null ? extRefUuid != null : !EXT_REF_UUID_EDEFAULT.equals( extRefUuid );
        case AsdPackage.SOURCE_REF__INPUT:
            return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals( input );
        case AsdPackage.SOURCE_REF__INPUT_INST:
            return isSetInputInst();
        case AsdPackage.SOURCE_REF__SERVICE:
            return isSetService();
        case AsdPackage.SOURCE_REF__SOURCE:
            return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals( source );
        case AsdPackage.SOURCE_REF__SOURCE_DA_NAME:
            return SOURCE_DA_NAME_EDEFAULT == null ? sourceDaName != null
                    : !SOURCE_DA_NAME_EDEFAULT.equals( sourceDaName );
        case AsdPackage.SOURCE_REF__SOURCE_DO_NAME:
            return SOURCE_DO_NAME_EDEFAULT == null ? sourceDoName != null
                    : !SOURCE_DO_NAME_EDEFAULT.equals( sourceDoName );
        case AsdPackage.SOURCE_REF__SOURCE_LNODE_UUID:
            return SOURCE_LNODE_UUID_EDEFAULT == null ? sourceLNodeUuid != null
                    : !SOURCE_LNODE_UUID_EDEFAULT.equals( sourceLNodeUuid );
        case AsdPackage.SOURCE_REF__PARENT_LNODE_INPUTS:
            return getParentLNodeInputs() != null;
        case AsdPackage.SOURCE_REF__REFERRED_BY_INPUT_VAR:
            return isSetReferredByInputVar();
        case AsdPackage.SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF:
            return isSetReferredByLNodeInputRef();
        case AsdPackage.SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE:
            return isSetRefersToSubscriberLNode();
        case AsdPackage.SOURCE_REF__REFERS_TO_PROCESS_RESOURCE:
            return isSetRefersToProcessResource();
        case AsdPackage.SOURCE_REF__REFERS_TO_LNODE:
            return isSetRefersToLNode();
        case AsdPackage.SOURCE_REF__REFERS_TO_EXT_REF:
            return isSetRefersToExtRef();
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
        result.append( " (extRefAddr: " );
        result.append( extRefAddr );
        result.append( ", extRefUuid: " );
        result.append( extRefUuid );
        result.append( ", input: " );
        result.append( input );
        result.append( ", inputInst: " );
        if( inputInstESet ) {
            result.append( inputInst );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", service: " );
        if( serviceESet ) {
            result.append( service );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", source: " );
        result.append( source );
        result.append( ", sourceDaName: " );
        result.append( sourceDaName );
        result.append( ", sourceDoName: " );
        result.append( sourceDoName );
        result.append( ", sourceLNodeUuid: " );
        result.append( sourceLNodeUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "SourceRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from SourceRef: ";
        doBuildExplicitLinkWithProcessResource( console, messagePrefix );
        doBuildExplicitLinkWithLNode( console, messagePrefix );
        doBuildExplicitLinkWithExtRef( console, messagePrefix );
        doBuildExplicitLinkWithSubscriberLNode( console, messagePrefix );
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

        if( getParentLNodeInputs().getParentPrivate().getParentBaseElement() instanceof LNode ) {
            LNode parentLNode = ( LNode ) getParentLNodeInputs().getParentPrivate().getParentBaseElement();

            LNodeContainer container = parentLNode.getParentLNodeContainer();
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
                    "SourceRef refers to ProcessResource( name = ", getRefersToProcessResource().getName(),
                    " )", " on line ", getRefersToProcessResource().getLineNumber() );

        }
        else {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, " SourceRef is not inside a LNode" );
        }

    }

    private void doBuildExplicitLinkWithLNode( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for LNode) ";

        SCL sclRoot = AsdUtilities.getSCL( this );

        if( getSourceLNodeUuid() != null && !getSourceLNodeUuid().isEmpty() ) {
            Pair< LNode, Integer > res = AsdUtilities.findByUuid( sclRoot, getSourceLNodeUuid(), LNode.class );

            if( res.getLeft() != null ) {
                setRefersToLNode( res.getLeft() );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "SourceRef refers to LNode( uuid = ", getSourceLNodeUuid(), " ) on line ",
                        getRefersToLNode().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.getRight() == 0 ) ? "cannot find" : "found several" ),
                //         " LNode( uuid = ", getSourceLNodeUuid(), " )" );
            }

        }
        else if( getSource() != null && !getSource().isEmpty() ) {
            String[] sourcePath = getSource().split( "\\.", 2 );

            if( sourcePath.length < 2 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, "inexpected source format: ", getSource() );
                return;
            }

            String[] lnodePath = sourcePath[0].split( "/" );

            Pair< LNode, Integer > lnode = AsdUtilities.getLNode( sclRoot, lnodePath );
            if( lnode.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( lnode.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "LNode( name = ", lnodePath[lnodePath.length - 1], " )" );
                return;
            }

            setRefersToLNode( lnode.getLeft() );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "SourceRef refers to LNode( name = ", lnodePath[lnodePath.length - 1], " )", " on line ",
                    getRefersToLNode().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because source and sourceLNodeUuid are missing" );
        }

    }

    private void doBuildExplicitLinkWithExtRef( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for ExtRef) ";

        if( getExtRefUuid() != null && !getExtRefUuid().isEmpty() ) {
            SCL sclRoot = AsdUtilities.getSCL( this );

            Pair< LNode, Integer > res = AsdUtilities.findByUuid( sclRoot.getIED(), getExtRefUuid(), LNode.class );

            if( res.getLeft() != null ) {
                setRefersToLNode( res.getLeft() );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "SourceRef refers to ExtRef( uuid = ", getExtRefUuid(), " ) on line ",
                        getRefersToExtRef().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.getRight() == 0 ) ? "cannot find" : "found several" ),
                //         " ExtRef( uuid = ", getExtRefUuid(), " )" );
            }
        }
        else if( getExtRefAddr() != null && !getExtRefAddr().isEmpty() ) {
            String[] extRefPath = getExtRefAddr().split( "/" );

            if( extRefPath.length == 1 ) {
                if( getParentLNodeInputs().getParentPrivate().getParentBaseElement() instanceof LNode ) {
                    LNode parentLNode = ( LNode ) getParentLNodeInputs().getParentPrivate().getParentBaseElement();

                    if( !parentLNode.isSetRefersToAnyLN() ) {
                        parentLNode.buildExplicitLinks( console, false );
                    }

                    Pair< ExtRef, Integer > extRef = getExtRef( parentLNode.getRefersToAnyLN(), extRefPath[0] );
                    if( extRef.getLeft() == null ) {
                        // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        //         messagePrefix, ( ( extRef.getRight() == 0 ) ? "cannot find" : "found several" ),
                        //         " ExtRef( intAddr = ", extRefPath[0], " ) );
                    }

                    setRefersToExtRef( extRef.getLeft() );
                    console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                            "SourceRef refers to ExtRef( intAddr = ", extRefPath[0], " ) on line ",
                            getRefersToExtRef().getLineNumber() );
                }
                else {
                    // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    //         messagePrefix, " SourceRef is not inside a LNode" );
                }

            }
            else if( extRefPath.length == 3 ) {
                LNode lookupLNode = null;
                if( getRefersToLNode() != null ) {
                    lookupLNode = getRefersToLNode();
                }
                else if( getParentLNodeInputs().getParentPrivate().getParentBaseElement() instanceof LNode ) {
                    lookupLNode = ( LNode ) getParentLNodeInputs().getParentPrivate().getParentBaseElement();
                }

                if( lookupLNode != null ) {
                    if( !lookupLNode.isSetRefersToAnyLN() ) {
                        lookupLNode.buildExplicitLinks( console, false );
                    }

                    IED ied = SclUtilities.getMyIED( lookupLNode.getRefersToAnyLN() );

                    Pair< LDevice, Integer > ldevice = SclUtilities.getLDevice( ied, extRefPath[0] );
                    if( ldevice.getLeft() == null ) {
                        // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        //         messagePrefix, ( ( ldevice.getRight() == 0 ) ? "cannot find " : "found several " ),
                        //         "LDevice( name = ", extRefPath[0], " )" );
                        return;
                    }

                    Pair< AnyLN, Integer > ln = SclUtilities.getAnyLN( ldevice.getLeft(), extRefPath[1] );
                    if( ln.getLeft() == null ) {
                        // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        //         messagePrefix, ( ( ln.getRight() == 0 ) ? "cannot find " : "found several " ),
                        //         "LN( name = ", extRefPath[1], " )" );
                        return;
                    }

                    Pair< ExtRef, Integer > extRef = getExtRef( ln.getLeft(), extRefPath[2] );
                    if( extRef.getLeft() == null ) {
                        // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        //         messagePrefix, ( ( extRef.getRight() == 0 ) ? "cannot find" : "found several" ),
                        //         " ExtRef( intAddr = ", extRefPath[2], " ) );
                    }

                    setRefersToExtRef( extRef.getLeft() );
                    console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                            "SourceRef refers to ExtRef( intAddr = ", extRefPath[2], " ) on line ",
                            getRefersToExtRef().getLineNumber() );
                }
                else {
                    // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    //         messagePrefix, " SourceRef is not inside a LNode" );
                }

            }
            else if( extRefPath.length == 4 ) {
                SCL sclRoot = AsdUtilities.getSCL( this );

                Pair< IED, Integer > ied = SclUtilities.getIED( sclRoot, extRefPath[0] );
                if( ied.getLeft() == null ) {
                    // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    //         messagePrefix, ( ( ied.getRight() == 0 ) ? "cannot find " : "found several " ),
                    //         "IED( name = ", extRefPath[0], " )" );
                    return;
                }

                Pair< LDevice, Integer > ldevice = SclUtilities.getLDevice( ied.getLeft(), extRefPath[1] );
                if( ldevice.getLeft() == null ) {
                    // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    //         messagePrefix, ( ( ldevice.getRight() == 0 ) ? "cannot find " : "found several " ),
                    //         "LDevice( name = ", extRefPath[1], " )" );
                    return;
                }

                Pair< AnyLN, Integer > ln = SclUtilities.getAnyLN( ldevice.getLeft(), extRefPath[2] );
                if( ln.getLeft() == null ) {
                    // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    //         messagePrefix, ( ( ln.getRight() == 0 ) ? "cannot find " : "found several " ),
                    //         "LN( name = ", extRefPath[2], " )" );
                    return;
                }

                Pair< ExtRef, Integer > extRef = getExtRef( ln.getLeft(), extRefPath[3] );
                if( extRef.getLeft() == null ) {
                    // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    //         messagePrefix, ( ( extRef.getRight() == 0 ) ? "cannot find" : "found several" ),
                    //         " ExtRef( intAddr = ", extRefPath[3], " ) );
                }

                setRefersToExtRef( extRef.getLeft() );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "SourceRef refers to ExtRef( intAddr = ", extRefPath[3], " ) on line ",
                        getRefersToExtRef().getLineNumber() );

            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, "inexpected extRefAddr format: ", getExtRefAddr() );
            }

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because extRefAddr and extRefUuid are missing" );
            return;
        }

    }

    private void doBuildExplicitLinkWithSubscriberLNode( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for SubscriberLNode) ";

        if( refersToLNodeESet && getRefersToLNode() != null && getInput() != null && !getInput().isEmpty() ) {
            List< SubscriberLNode > res = new ArrayList<>();
            List< DOS > parentDos = getRefersToLNode().getPrivate()
                    .stream()
                    .filter( p -> "eIEC61850-6-100".equals( p.getType() ) )
                    .map( Private::getAsdObjects )
                    .flatMap( Collection::stream )
                    .filter( o -> o instanceof DOS )
                    .map( d -> ( DOS ) d )
                    .toList();

            for( DOS dos : parentDos ) {
                TreeIterator< EObject > it = dos.eAllContents();
                while( it.hasNext() ) {
                    EObject o = it.next();
                    if( o instanceof SubscriberLNode
                            && getInput().equals( ( ( SubscriberLNode ) o ).getInputName() ) ) {
                        res.add( ( SubscriberLNode ) o );
                    }
                }
            }

            if( res.size() != 1 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.getSize() == 0 ) ? "cannot find" : "found several" ),
                //         " SubscriberLNode( inputName = ", getInput(), " )" );
                return;
            }

            setRefersToSubscriberLNode( res.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "SourceRef refers to SubscriberLNode( inputName = ", getInput(), " ) on line ",
                    getRefersToSubscriberLNode().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because LNode was not resolved or input is missing" );
        }

    }

    private Pair< ExtRef, Integer > getExtRef( AnyLN ln, String extRefAddr ) {
        if( ln == null ) {
            return Pair.of( null, 0 );
        }

        List< ExtRef > res = ln.getInputs()
                .getExtRef()
                .stream()
                .filter( e -> extRefAddr.equals( e.getIntAddr() ) )
                .toList();

        if( res.size() != 1 ) {
            return Pair.of( null, res.size() );
        }
        return Pair.of( res.get( 0 ), 1 );

    }

} //SourceRefImpl
