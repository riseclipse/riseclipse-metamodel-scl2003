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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getControlled <em>Controlled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getControlledDoName <em>Controlled Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getControlledLNodeUuid <em>Controlled LNode Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getExtCtrlAddr <em>Ext Ctrl Addr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getExtCtrlUuid <em>Ext Ctrl Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getOutputInst <em>Output Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getParentLNodeOutputs <em>Parent LNode Outputs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getReferredByLNodeOutputRef <em>Referred By LNode Output Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getRefersToControllingLNode <em>Refers To Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getRefersToProcessResource <em>Refers To Process Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getReferredByOutputVar <em>Referred By Output Var</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl#getRefersToLNode <em>Refers To LNode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlRefImpl extends LinkFCDRefImpl implements ControlRef {
    /**
     * The cached value of the '{@link #getBinaryWiringParametersRef() <em>Binary Wiring Parameters Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBinaryWiringParametersRef()
     * @generated
     * @ordered
     */
    protected EList< BinaryWiringParametersRef > binaryWiringParametersRef;

    /**
     * The cached value of the '{@link #getAnalogueWiringParametersRef() <em>Analogue Wiring Parameters Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalogueWiringParametersRef()
     * @generated
     * @ordered
     */
    protected EList< AnalogueWiringParametersRef > analogueWiringParametersRef;

    /**
     * The default value of the '{@link #getControlled() <em>Controlled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlled()
     * @generated
     * @ordered
     */
    protected static final String CONTROLLED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlled() <em>Controlled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlled()
     * @generated
     * @ordered
     */
    protected String controlled = CONTROLLED_EDEFAULT;

    /**
     * The default value of the '{@link #getControlledDoName() <em>Controlled Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlledDoName()
     * @generated
     * @ordered
     */
    protected static final String CONTROLLED_DO_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlledDoName() <em>Controlled Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlledDoName()
     * @generated
     * @ordered
     */
    protected String controlledDoName = CONTROLLED_DO_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getControlledLNodeUuid() <em>Controlled LNode Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlledLNodeUuid()
     * @generated
     * @ordered
     */
    protected static final String CONTROLLED_LNODE_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlledLNodeUuid() <em>Controlled LNode Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlledLNodeUuid()
     * @generated
     * @ordered
     */
    protected String controlledLNodeUuid = CONTROLLED_LNODE_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getExtCtrlAddr() <em>Ext Ctrl Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtCtrlAddr()
     * @generated
     * @ordered
     */
    protected static final String EXT_CTRL_ADDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExtCtrlAddr() <em>Ext Ctrl Addr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtCtrlAddr()
     * @generated
     * @ordered
     */
    protected String extCtrlAddr = EXT_CTRL_ADDR_EDEFAULT;

    /**
     * The default value of the '{@link #getExtCtrlUuid() <em>Ext Ctrl Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtCtrlUuid()
     * @generated
     * @ordered
     */
    protected static final String EXT_CTRL_UUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExtCtrlUuid() <em>Ext Ctrl Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtCtrlUuid()
     * @generated
     * @ordered
     */
    protected String extCtrlUuid = EXT_CTRL_UUID_EDEFAULT;

    /**
     * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutput()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutput()
     * @generated
     * @ordered
     */
    protected String output = OUTPUT_EDEFAULT;

    /**
     * The default value of the '{@link #getOutputInst() <em>Output Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputInst()
     * @generated
     * @ordered
     */
    protected static final int OUTPUT_INST_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getOutputInst() <em>Output Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputInst()
     * @generated
     * @ordered
     */
    protected int outputInst = OUTPUT_INST_EDEFAULT;

    /**
     * This is true if the Output Inst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outputInstESet;

    /**
     * The cached value of the '{@link #getReferredByLNodeOutputRef() <em>Referred By LNode Output Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByLNodeOutputRef()
     * @generated
     * @ordered
     */
    protected EList< LNodeOutputRef > referredByLNodeOutputRef;

    /**
     * The cached value of the '{@link #getRefersToControllingLNode() <em>Refers To Controlling LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToControllingLNode()
     * @generated
     * @ordered
     */
    protected ControllingLNode refersToControllingLNode;

    /**
     * This is true if the Refers To Controlling LNode reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToControllingLNodeESet;

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
     * The cached value of the '{@link #getReferredByOutputVar() <em>Referred By Output Var</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByOutputVar()
     * @generated
     * @ordered
     */
    protected EList< OutputVar > referredByOutputVar;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ControlRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getControlRef();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BinaryWiringParametersRef > getBinaryWiringParametersRef() {
        if( binaryWiringParametersRef == null ) {
            binaryWiringParametersRef = new EObjectContainmentWithInverseEList.Unsettable< >(
                    BinaryWiringParametersRef.class, this, AsdPackage.CONTROL_REF__BINARY_WIRING_PARAMETERS_REF,
                    AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF );
        }
        return binaryWiringParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBinaryWiringParametersRef() {
        if( binaryWiringParametersRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) binaryWiringParametersRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBinaryWiringParametersRef() {
        return binaryWiringParametersRef != null
                && ( ( InternalEList.Unsettable< ? > ) binaryWiringParametersRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AnalogueWiringParametersRef > getAnalogueWiringParametersRef() {
        if( analogueWiringParametersRef == null ) {
            analogueWiringParametersRef = new EObjectContainmentWithInverseEList.Unsettable< >(
                    AnalogueWiringParametersRef.class, this, AsdPackage.CONTROL_REF__ANALOGUE_WIRING_PARAMETERS_REF,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF );
        }
        return analogueWiringParametersRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAnalogueWiringParametersRef() {
        if( analogueWiringParametersRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) analogueWiringParametersRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalogueWiringParametersRef() {
        return analogueWiringParametersRef != null
                && ( ( InternalEList.Unsettable< ? > ) analogueWiringParametersRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getControlled() {
        return controlled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlled( String newControlled ) {
        String oldControlled = controlled;
        controlled = newControlled;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROL_REF__CONTROLLED, oldControlled,
                    controlled ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getControlledDoName() {
        return controlledDoName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlledDoName( String newControlledDoName ) {
        String oldControlledDoName = controlledDoName;
        controlledDoName = newControlledDoName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROL_REF__CONTROLLED_DO_NAME,
                    oldControlledDoName, controlledDoName ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getControlledLNodeUuid() {
        return controlledLNodeUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlledLNodeUuid( String newControlledLNodeUuid ) {
        String oldControlledLNodeUuid = controlledLNodeUuid;
        controlledLNodeUuid = newControlledLNodeUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROL_REF__CONTROLLED_LNODE_UUID,
                    oldControlledLNodeUuid, controlledLNodeUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getExtCtrlAddr() {
        return extCtrlAddr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExtCtrlAddr( String newExtCtrlAddr ) {
        String oldExtCtrlAddr = extCtrlAddr;
        extCtrlAddr = newExtCtrlAddr;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROL_REF__EXT_CTRL_ADDR,
                    oldExtCtrlAddr, extCtrlAddr ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getExtCtrlUuid() {
        return extCtrlUuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExtCtrlUuid( String newExtCtrlUuid ) {
        String oldExtCtrlUuid = extCtrlUuid;
        extCtrlUuid = newExtCtrlUuid;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROL_REF__EXT_CTRL_UUID,
                    oldExtCtrlUuid, extCtrlUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOutput() {
        return output;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutput( String newOutput ) {
        String oldOutput = output;
        output = newOutput;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROL_REF__OUTPUT, oldOutput,
                    output ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getOutputInst() {
        return outputInst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutputInst( int newOutputInst ) {
        int oldOutputInst = outputInst;
        outputInst = newOutputInst;
        boolean oldOutputInstESet = outputInstESet;
        outputInstESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROL_REF__OUTPUT_INST, oldOutputInst,
                    outputInst, !oldOutputInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutputInst() {
        int oldOutputInst = outputInst;
        boolean oldOutputInstESet = outputInstESet;
        outputInst = OUTPUT_INST_EDEFAULT;
        outputInstESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.CONTROL_REF__OUTPUT_INST,
                    oldOutputInst, OUTPUT_INST_EDEFAULT, oldOutputInstESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutputInst() {
        return outputInstESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeOutputs getParentLNodeOutputs() {
        if( eContainerFeatureID() != AsdPackage.CONTROL_REF__PARENT_LNODE_OUTPUTS ) {
            return null;
        }
        return ( LNodeOutputs ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLNodeOutputs( LNodeOutputs newParentLNodeOutputs, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLNodeOutputs,
                AsdPackage.CONTROL_REF__PARENT_LNODE_OUTPUTS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLNodeOutputs( LNodeOutputs newParentLNodeOutputs ) {
        if( newParentLNodeOutputs != eInternalContainer()
                || ( eContainerFeatureID() != AsdPackage.CONTROL_REF__PARENT_LNODE_OUTPUTS
                        && newParentLNodeOutputs != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLNodeOutputs ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentLNodeOutputs != null ) {
                msgs = ( ( InternalEObject ) newParentLNodeOutputs ).eInverseAdd( this,
                        AsdPackage.LNODE_OUTPUTS__CONTROL_REF, LNodeOutputs.class, msgs );
            }
            msgs = basicSetParentLNodeOutputs( newParentLNodeOutputs, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROL_REF__PARENT_LNODE_OUTPUTS,
                    newParentLNodeOutputs, newParentLNodeOutputs ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LNodeOutputRef > getReferredByLNodeOutputRef() {
        if( referredByLNodeOutputRef == null ) {
            referredByLNodeOutputRef = new EObjectWithInverseResolvingEList.Unsettable< >(
                    LNodeOutputRef.class, this, AsdPackage.CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF,
                    AsdPackage.LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF );
        }
        return referredByLNodeOutputRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByLNodeOutputRef() {
        if( referredByLNodeOutputRef != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByLNodeOutputRef ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByLNodeOutputRef() {
        return referredByLNodeOutputRef != null
                && ( ( InternalEList.Unsettable< ? > ) referredByLNodeOutputRef ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControllingLNode getRefersToControllingLNode() {
        if( refersToControllingLNode != null && refersToControllingLNode.eIsProxy() ) {
            InternalEObject oldRefersToControllingLNode = ( InternalEObject ) refersToControllingLNode;
            refersToControllingLNode = ( ControllingLNode ) eResolveProxy( oldRefersToControllingLNode );
            if( refersToControllingLNode != oldRefersToControllingLNode ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE, oldRefersToControllingLNode,
                            refersToControllingLNode ) );
                }
            }
        }
        return refersToControllingLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControllingLNode basicGetRefersToControllingLNode() {
        return refersToControllingLNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToControllingLNode( ControllingLNode newRefersToControllingLNode,
            NotificationChain msgs ) {
        ControllingLNode oldRefersToControllingLNode = refersToControllingLNode;
        refersToControllingLNode = newRefersToControllingLNode;
        boolean oldRefersToControllingLNodeESet = refersToControllingLNodeESet;
        refersToControllingLNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE, oldRefersToControllingLNode,
                    newRefersToControllingLNode, !oldRefersToControllingLNodeESet );
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
    public void setRefersToControllingLNode( ControllingLNode newRefersToControllingLNode ) {
        if( newRefersToControllingLNode != refersToControllingLNode ) {
            NotificationChain msgs = null;
            if( refersToControllingLNode != null ) {
                msgs = ( ( InternalEObject ) refersToControllingLNode ).eInverseRemove( this,
                        AsdPackage.CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF, ControllingLNode.class, msgs );
            }
            if( newRefersToControllingLNode != null ) {
                msgs = ( ( InternalEObject ) newRefersToControllingLNode ).eInverseAdd( this,
                        AsdPackage.CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF, ControllingLNode.class, msgs );
            }
            msgs = basicSetRefersToControllingLNode( newRefersToControllingLNode, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToControllingLNodeESet = refersToControllingLNodeESet;
            refersToControllingLNodeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE, newRefersToControllingLNode,
                        newRefersToControllingLNode, !oldRefersToControllingLNodeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToControllingLNode( NotificationChain msgs ) {
        ControllingLNode oldRefersToControllingLNode = refersToControllingLNode;
        refersToControllingLNode = null;
        boolean oldRefersToControllingLNodeESet = refersToControllingLNodeESet;
        refersToControllingLNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE, oldRefersToControllingLNode, null,
                    oldRefersToControllingLNodeESet );
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
    public void unsetRefersToControllingLNode() {
        if( refersToControllingLNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToControllingLNode ).eInverseRemove( this,
                    AsdPackage.CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF, ControllingLNode.class, msgs );
            msgs = basicUnsetRefersToControllingLNode( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToControllingLNodeESet = refersToControllingLNodeESet;
            refersToControllingLNodeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE, null, null,
                        oldRefersToControllingLNodeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToControllingLNode() {
        return refersToControllingLNodeESet;
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
                            AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource,
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
                    AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource,
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
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF, ProcessResource.class, msgs );
            }
            if( newRefersToProcessResource != null ) {
                msgs = ( ( InternalEObject ) newRefersToProcessResource ).eInverseAdd( this,
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF, ProcessResource.class, msgs );
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
                        AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE, newRefersToProcessResource,
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
                    AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource, null,
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
                    AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF, ProcessResource.class, msgs );
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
                        AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE, null, null,
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
    public EList< OutputVar > getReferredByOutputVar() {
        if( referredByOutputVar == null ) {
            referredByOutputVar = new EObjectWithInverseResolvingEList.Unsettable< >( OutputVar.class, this,
                    AsdPackage.CONTROL_REF__REFERRED_BY_OUTPUT_VAR, AsdPackage.OUTPUT_VAR__REFERS_TO_CONTROL_REF );
        }
        return referredByOutputVar;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReferredByOutputVar() {
        if( referredByOutputVar != null ) {
            ( ( InternalEList.Unsettable< ? > ) referredByOutputVar ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReferredByOutputVar() {
        return referredByOutputVar != null && ( ( InternalEList.Unsettable< ? > ) referredByOutputVar ).isSet();
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
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, AsdPackage.CONTROL_REF__REFERS_TO_LNODE,
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
                    AsdPackage.CONTROL_REF__REFERS_TO_LNODE, oldRefersToLNode, newRefersToLNode,
                    !oldRefersToLNodeESet );
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
                        SclPackage.LNODE__REFERRED_BY_CONTROL_REF, LNode.class, msgs );
            }
            if( newRefersToLNode != null ) {
                msgs = ( ( InternalEObject ) newRefersToLNode ).eInverseAdd( this,
                        SclPackage.LNODE__REFERRED_BY_CONTROL_REF, LNode.class, msgs );
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
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROL_REF__REFERS_TO_LNODE,
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
                    AsdPackage.CONTROL_REF__REFERS_TO_LNODE, oldRefersToLNode, null, oldRefersToLNodeESet );
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
            msgs = ( ( InternalEObject ) refersToLNode ).eInverseRemove( this,
                    SclPackage.LNODE__REFERRED_BY_CONTROL_REF, LNode.class, msgs );
            msgs = basicUnsetRefersToLNode( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToLNodeESet = refersToLNodeESet;
            refersToLNodeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.CONTROL_REF__REFERS_TO_LNODE, null,
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.CONTROL_REF__BINARY_WIRING_PARAMETERS_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBinaryWiringParametersRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.CONTROL_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAnalogueWiringParametersRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.CONTROL_REF__PARENT_LNODE_OUTPUTS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentLNodeOutputs( ( LNodeOutputs ) otherEnd, msgs );
        case AsdPackage.CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByLNodeOutputRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE:
            if( refersToControllingLNode != null ) {
                msgs = ( ( InternalEObject ) refersToControllingLNode ).eInverseRemove( this,
                        AsdPackage.CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF, ControllingLNode.class, msgs );
            }
            return basicSetRefersToControllingLNode( ( ControllingLNode ) otherEnd, msgs );
        case AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE:
            if( refersToProcessResource != null ) {
                msgs = ( ( InternalEObject ) refersToProcessResource ).eInverseRemove( this,
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF, ProcessResource.class, msgs );
            }
            return basicSetRefersToProcessResource( ( ProcessResource ) otherEnd, msgs );
        case AsdPackage.CONTROL_REF__REFERRED_BY_OUTPUT_VAR:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByOutputVar() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.CONTROL_REF__REFERS_TO_LNODE:
            if( refersToLNode != null ) {
                msgs = ( ( InternalEObject ) refersToLNode ).eInverseRemove( this,
                        SclPackage.LNODE__REFERRED_BY_CONTROL_REF, LNode.class, msgs );
            }
            return basicSetRefersToLNode( ( LNode ) otherEnd, msgs );
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
        case AsdPackage.CONTROL_REF__BINARY_WIRING_PARAMETERS_REF:
            return ( ( InternalEList< ? > ) getBinaryWiringParametersRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.CONTROL_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            return ( ( InternalEList< ? > ) getAnalogueWiringParametersRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.CONTROL_REF__PARENT_LNODE_OUTPUTS:
            return basicSetParentLNodeOutputs( null, msgs );
        case AsdPackage.CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF:
            return ( ( InternalEList< ? > ) getReferredByLNodeOutputRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE:
            return basicUnsetRefersToControllingLNode( msgs );
        case AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE:
            return basicUnsetRefersToProcessResource( msgs );
        case AsdPackage.CONTROL_REF__REFERRED_BY_OUTPUT_VAR:
            return ( ( InternalEList< ? > ) getReferredByOutputVar() ).basicRemove( otherEnd, msgs );
        case AsdPackage.CONTROL_REF__REFERS_TO_LNODE:
            return basicUnsetRefersToLNode( msgs );
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
        case AsdPackage.CONTROL_REF__PARENT_LNODE_OUTPUTS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.LNODE_OUTPUTS__CONTROL_REF, LNodeOutputs.class,
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
        case AsdPackage.CONTROL_REF__BINARY_WIRING_PARAMETERS_REF:
            return getBinaryWiringParametersRef();
        case AsdPackage.CONTROL_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            return getAnalogueWiringParametersRef();
        case AsdPackage.CONTROL_REF__CONTROLLED:
            return getControlled();
        case AsdPackage.CONTROL_REF__CONTROLLED_DO_NAME:
            return getControlledDoName();
        case AsdPackage.CONTROL_REF__CONTROLLED_LNODE_UUID:
            return getControlledLNodeUuid();
        case AsdPackage.CONTROL_REF__EXT_CTRL_ADDR:
            return getExtCtrlAddr();
        case AsdPackage.CONTROL_REF__EXT_CTRL_UUID:
            return getExtCtrlUuid();
        case AsdPackage.CONTROL_REF__OUTPUT:
            return getOutput();
        case AsdPackage.CONTROL_REF__OUTPUT_INST:
            return getOutputInst();
        case AsdPackage.CONTROL_REF__PARENT_LNODE_OUTPUTS:
            return getParentLNodeOutputs();
        case AsdPackage.CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF:
            return getReferredByLNodeOutputRef();
        case AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE:
            if( resolve ) {
                return getRefersToControllingLNode();
            }
            return basicGetRefersToControllingLNode();
        case AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE:
            if( resolve ) {
                return getRefersToProcessResource();
            }
            return basicGetRefersToProcessResource();
        case AsdPackage.CONTROL_REF__REFERRED_BY_OUTPUT_VAR:
            return getReferredByOutputVar();
        case AsdPackage.CONTROL_REF__REFERS_TO_LNODE:
            if( resolve ) {
                return getRefersToLNode();
            }
            return basicGetRefersToLNode();
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
        case AsdPackage.CONTROL_REF__BINARY_WIRING_PARAMETERS_REF:
            getBinaryWiringParametersRef().clear();
            getBinaryWiringParametersRef().addAll( ( Collection< ? extends BinaryWiringParametersRef > ) newValue );
            return;
        case AsdPackage.CONTROL_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            getAnalogueWiringParametersRef().clear();
            getAnalogueWiringParametersRef().addAll( ( Collection< ? extends AnalogueWiringParametersRef > ) newValue );
            return;
        case AsdPackage.CONTROL_REF__CONTROLLED:
            setControlled( ( String ) newValue );
            return;
        case AsdPackage.CONTROL_REF__CONTROLLED_DO_NAME:
            setControlledDoName( ( String ) newValue );
            return;
        case AsdPackage.CONTROL_REF__CONTROLLED_LNODE_UUID:
            setControlledLNodeUuid( ( String ) newValue );
            return;
        case AsdPackage.CONTROL_REF__EXT_CTRL_ADDR:
            setExtCtrlAddr( ( String ) newValue );
            return;
        case AsdPackage.CONTROL_REF__EXT_CTRL_UUID:
            setExtCtrlUuid( ( String ) newValue );
            return;
        case AsdPackage.CONTROL_REF__OUTPUT:
            setOutput( ( String ) newValue );
            return;
        case AsdPackage.CONTROL_REF__OUTPUT_INST:
            setOutputInst( ( Integer ) newValue );
            return;
        case AsdPackage.CONTROL_REF__PARENT_LNODE_OUTPUTS:
            setParentLNodeOutputs( ( LNodeOutputs ) newValue );
            return;
        case AsdPackage.CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF:
            getReferredByLNodeOutputRef().clear();
            getReferredByLNodeOutputRef().addAll( ( Collection< ? extends LNodeOutputRef > ) newValue );
            return;
        case AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE:
            setRefersToControllingLNode( ( ControllingLNode ) newValue );
            return;
        case AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE:
            setRefersToProcessResource( ( ProcessResource ) newValue );
            return;
        case AsdPackage.CONTROL_REF__REFERRED_BY_OUTPUT_VAR:
            getReferredByOutputVar().clear();
            getReferredByOutputVar().addAll( ( Collection< ? extends OutputVar > ) newValue );
            return;
        case AsdPackage.CONTROL_REF__REFERS_TO_LNODE:
            setRefersToLNode( ( LNode ) newValue );
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
        case AsdPackage.CONTROL_REF__BINARY_WIRING_PARAMETERS_REF:
            unsetBinaryWiringParametersRef();
            return;
        case AsdPackage.CONTROL_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            unsetAnalogueWiringParametersRef();
            return;
        case AsdPackage.CONTROL_REF__CONTROLLED:
            setControlled( CONTROLLED_EDEFAULT );
            return;
        case AsdPackage.CONTROL_REF__CONTROLLED_DO_NAME:
            setControlledDoName( CONTROLLED_DO_NAME_EDEFAULT );
            return;
        case AsdPackage.CONTROL_REF__CONTROLLED_LNODE_UUID:
            setControlledLNodeUuid( CONTROLLED_LNODE_UUID_EDEFAULT );
            return;
        case AsdPackage.CONTROL_REF__EXT_CTRL_ADDR:
            setExtCtrlAddr( EXT_CTRL_ADDR_EDEFAULT );
            return;
        case AsdPackage.CONTROL_REF__EXT_CTRL_UUID:
            setExtCtrlUuid( EXT_CTRL_UUID_EDEFAULT );
            return;
        case AsdPackage.CONTROL_REF__OUTPUT:
            setOutput( OUTPUT_EDEFAULT );
            return;
        case AsdPackage.CONTROL_REF__OUTPUT_INST:
            unsetOutputInst();
            return;
        case AsdPackage.CONTROL_REF__PARENT_LNODE_OUTPUTS:
            setParentLNodeOutputs( ( LNodeOutputs ) null );
            return;
        case AsdPackage.CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF:
            unsetReferredByLNodeOutputRef();
            return;
        case AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE:
            unsetRefersToControllingLNode();
            return;
        case AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE:
            unsetRefersToProcessResource();
            return;
        case AsdPackage.CONTROL_REF__REFERRED_BY_OUTPUT_VAR:
            unsetReferredByOutputVar();
            return;
        case AsdPackage.CONTROL_REF__REFERS_TO_LNODE:
            unsetRefersToLNode();
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
        case AsdPackage.CONTROL_REF__BINARY_WIRING_PARAMETERS_REF:
            return isSetBinaryWiringParametersRef();
        case AsdPackage.CONTROL_REF__ANALOGUE_WIRING_PARAMETERS_REF:
            return isSetAnalogueWiringParametersRef();
        case AsdPackage.CONTROL_REF__CONTROLLED:
            return CONTROLLED_EDEFAULT == null ? controlled != null : !CONTROLLED_EDEFAULT.equals( controlled );
        case AsdPackage.CONTROL_REF__CONTROLLED_DO_NAME:
            return CONTROLLED_DO_NAME_EDEFAULT == null ? controlledDoName != null
                    : !CONTROLLED_DO_NAME_EDEFAULT.equals( controlledDoName );
        case AsdPackage.CONTROL_REF__CONTROLLED_LNODE_UUID:
            return CONTROLLED_LNODE_UUID_EDEFAULT == null ? controlledLNodeUuid != null
                    : !CONTROLLED_LNODE_UUID_EDEFAULT.equals( controlledLNodeUuid );
        case AsdPackage.CONTROL_REF__EXT_CTRL_ADDR:
            return EXT_CTRL_ADDR_EDEFAULT == null ? extCtrlAddr != null : !EXT_CTRL_ADDR_EDEFAULT.equals( extCtrlAddr );
        case AsdPackage.CONTROL_REF__EXT_CTRL_UUID:
            return EXT_CTRL_UUID_EDEFAULT == null ? extCtrlUuid != null : !EXT_CTRL_UUID_EDEFAULT.equals( extCtrlUuid );
        case AsdPackage.CONTROL_REF__OUTPUT:
            return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals( output );
        case AsdPackage.CONTROL_REF__OUTPUT_INST:
            return isSetOutputInst();
        case AsdPackage.CONTROL_REF__PARENT_LNODE_OUTPUTS:
            return getParentLNodeOutputs() != null;
        case AsdPackage.CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF:
            return isSetReferredByLNodeOutputRef();
        case AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE:
            return isSetRefersToControllingLNode();
        case AsdPackage.CONTROL_REF__REFERS_TO_PROCESS_RESOURCE:
            return isSetRefersToProcessResource();
        case AsdPackage.CONTROL_REF__REFERRED_BY_OUTPUT_VAR:
            return isSetReferredByOutputVar();
        case AsdPackage.CONTROL_REF__REFERS_TO_LNODE:
            return isSetRefersToLNode();
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
        result.append( " (controlled: " );
        result.append( controlled );
        result.append( ", controlledDoName: " );
        result.append( controlledDoName );
        result.append( ", controlledLNodeUuid: " );
        result.append( controlledLNodeUuid );
        result.append( ", extCtrlAddr: " );
        result.append( extCtrlAddr );
        result.append( ", extCtrlUuid: " );
        result.append( extCtrlUuid );
        result.append( ", output: " );
        result.append( output );
        result.append( ", outputInst: " );
        if( outputInstESet ) {
            result.append( outputInst );
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
                "ControlRef.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from ControlRef: ";
        doBuildExplicitLinkWithProcessResource( console, messagePrefix );
        doBuildExplicitLinkWithLNode( console, messagePrefix );
        doBuildExplicitLinkWithControllingLNode( console, messagePrefix );
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

        if( getParentLNodeOutputs().getParentPrivate().getParentBaseElement() instanceof LNode ) {
            LNode parentLNode = ( LNode ) getParentLNodeOutputs().getParentPrivate().getParentBaseElement();

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
                    "ControlRef refers to ProcessResource( name = ", getRefersToProcessResource().getName(),
                    " )", " on line ", getRefersToProcessResource().getLineNumber() );

        }
        else {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, " ControlRef is not inside a LNode" );
        }

    }

    private void doBuildExplicitLinkWithLNode( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for LNode) ";

        SCL sclRoot = AsdUtilities.getSCL( this );

        if( getControlledLNodeUuid() != null && !getControlledLNodeUuid().isEmpty() ) {
            Pair< LNode, Integer > res = AsdUtilities.findByUuid( sclRoot, getControlledLNodeUuid(), LNode.class );

            if( res.getLeft() != null ) {
                setRefersToLNode( res.getLeft() );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "ControlRef refers to LNode( uuid = ", getControlledLNodeUuid(), " ) on line ",
                        getRefersToLNode().getLineNumber() );
            }
            else {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.getRight() == 0 ) ? "cannot find" : "found several" ),
                //         " LNode( uuid = ", getControlledLNodeUuid(), " )" );
            }

        }
        else if( getControlled() != null && !getControlled().isEmpty() ) {
            String[] controlledPath = getControlled().split( "\\.", 2 );

            if( controlledPath.length < 2 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, "inexpected controlled format: ", getControlled() );
                return;
            }

            String[] lnodePath = controlledPath[0].split( "/" );

            Pair< LNode, Integer > lnode = AsdUtilities.getLNode( sclRoot, lnodePath );
            if( lnode.getLeft() == null ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( lnode.getRight() == 0 ) ? "cannot find " : "found several " ),
                //         "LNode( name = ", lnodePath[lnodePath.length - 1], " )" );
                return;
            }

            setRefersToLNode( lnode.getLeft() );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "ControlRef refers to LNode( name = ", lnodePath[lnodePath.length - 1], " )", " on line ",
                    getRefersToLNode().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because controlled and controlledLNodeUuid are missing" );
        }

    }

    private void doBuildExplicitLinkWithControllingLNode( @NonNull IRiseClipseConsole console,
            @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for ControllingLNode) ";

        if( refersToLNodeESet && getRefersToLNode() != null && getOutput() != null && !getOutput().isEmpty() ) {
            List< ControllingLNode > res = new ArrayList<>();
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
                    if( o instanceof ControllingLNode
                            && getOutput().equals( ( ( ControllingLNode ) o ).getOutputName() ) ) {
                        res.add( ( ControllingLNode ) o );
                    }
                }
            }

            if( res.size() != 1 ) {
                // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                //         messagePrefix, ( ( res.getSize() == 0 ) ? "cannot find" : "found several" ),
                //         " ControllingLNode( outputName = ", getOutput(), " )" );
                return;
            }

            setRefersToControllingLNode( res.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "SourceRef refers to ControllingLNode( outputName = ", getOutput(), " ) on line ",
                    getRefersToControllingLNode().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because LNode was not resolved or output is missing" );
        }

    }

} //ControlRefImpl
