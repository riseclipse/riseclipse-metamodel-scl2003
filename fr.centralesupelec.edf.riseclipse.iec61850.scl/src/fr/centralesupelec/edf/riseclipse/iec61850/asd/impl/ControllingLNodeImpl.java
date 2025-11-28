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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controlling LNode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl#getPLN <em>PLN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl#getResourceUuid <em>Resource Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl#getParentDAS <em>Parent DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl#getParentSDS <em>Parent SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl#getRefersToProcessResource <em>Refers To Process Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl#getReferredByControlRef <em>Referred By Control Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllingLNodeImpl extends BaseExtensionElementWithDescImpl implements ControllingLNode {
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
     * The default value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputName()
     * @generated
     * @ordered
     */
    protected static final String OUTPUT_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputName()
     * @generated
     * @ordered
     */
    protected String outputName = OUTPUT_NAME_EDEFAULT;

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
     * The cached value of the '{@link #getReferredByControlRef() <em>Referred By Control Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferredByControlRef()
     * @generated
     * @ordered
     */
    protected EList< ControlRef > referredByControlRef;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ControllingLNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getControllingLNode();
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
                    AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF, oldBinaryWiringParametersRef,
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
                        AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE,
                        BinaryWiringParametersRef.class, msgs );
            }
            if( newBinaryWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) newBinaryWiringParametersRef ).eInverseAdd( this,
                        AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE,
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
                        AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF, newBinaryWiringParametersRef,
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
                    AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF, oldBinaryWiringParametersRef, null,
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
                    AsdPackage.BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE, BinaryWiringParametersRef.class,
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
                        AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF, null, null,
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
                    AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF, oldAnalogueWiringParametersRef,
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
                        AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE,
                        AnalogueWiringParametersRef.class, msgs );
            }
            if( newAnalogueWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) newAnalogueWiringParametersRef ).eInverseAdd( this,
                        AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE,
                        AnalogueWiringParametersRef.class, msgs );
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
                        AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF, newAnalogueWiringParametersRef,
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
                    AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF, oldAnalogueWiringParametersRef, null,
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
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE,
                    AnalogueWiringParametersRef.class, msgs );
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
                        AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF, null, null,
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
    public String getOutputName() {
        return outputName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutputName( String newOutputName ) {
        String oldOutputName = outputName;
        outputName = newOutputName;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROLLING_LNODE__OUTPUT_NAME,
                    oldOutputName, outputName ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROLLING_LNODE__PLN, oldPLN, pLN ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROLLING_LNODE__RESOURCE_NAME,
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROLLING_LNODE__RESOURCE_UUID,
                    oldResourceUuid, resourceUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAS getParentDAS() {
        if( eContainerFeatureID() != AsdPackage.CONTROLLING_LNODE__PARENT_DAS ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDAS, AsdPackage.CONTROLLING_LNODE__PARENT_DAS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.CONTROLLING_LNODE__PARENT_DAS && newParentDAS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDAS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDAS != null ) {
                msgs = ( ( InternalEObject ) newParentDAS ).eInverseAdd( this, AsdPackage.DAS__CONTROLLING_LNODE,
                        DAS.class, msgs );
            }
            msgs = basicSetParentDAS( newParentDAS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROLLING_LNODE__PARENT_DAS,
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
        if( eContainerFeatureID() != AsdPackage.CONTROLLING_LNODE__PARENT_DOS ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDOS, AsdPackage.CONTROLLING_LNODE__PARENT_DOS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.CONTROLLING_LNODE__PARENT_DOS && newParentDOS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDOS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDOS != null ) {
                msgs = ( ( InternalEObject ) newParentDOS ).eInverseAdd( this, AsdPackage.DOS__CONTROLLING_LNODE,
                        DOS.class, msgs );
            }
            msgs = basicSetParentDOS( newParentDOS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROLLING_LNODE__PARENT_DOS,
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
        if( eContainerFeatureID() != AsdPackage.CONTROLLING_LNODE__PARENT_SDS ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSDS, AsdPackage.CONTROLLING_LNODE__PARENT_SDS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.CONTROLLING_LNODE__PARENT_SDS && newParentSDS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSDS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSDS != null ) {
                msgs = ( ( InternalEObject ) newParentSDS ).eInverseAdd( this, AsdPackage.SDS__CONTROLLING_LNODE,
                        SDS.class, msgs );
            }
            msgs = basicSetParentSDS( newParentSDS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.CONTROLLING_LNODE__PARENT_SDS,
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
                            AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource,
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
                    AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource,
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
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE, ProcessResource.class, msgs );
            }
            if( newRefersToProcessResource != null ) {
                msgs = ( ( InternalEObject ) newRefersToProcessResource ).eInverseAdd( this,
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE, ProcessResource.class, msgs );
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
                        AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE, newRefersToProcessResource,
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
                    AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE, oldRefersToProcessResource, null,
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
                    AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE, ProcessResource.class, msgs );
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
                        AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE, null, null,
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
    public EList< ControlRef > getReferredByControlRef() {
        if( referredByControlRef == null ) {
            referredByControlRef = new EObjectWithInverseResolvingEList.Unsettable< >( ControlRef.class,
                    this, AsdPackage.CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF,
                    AsdPackage.CONTROL_REF__REFERS_TO_CONTROLLING_LNODE );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF:
            if( binaryWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) binaryWiringParametersRef ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF, null,
                        msgs );
            }
            return basicSetBinaryWiringParametersRef( ( BinaryWiringParametersRef ) otherEnd, msgs );
        case AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF:
            if( analogueWiringParametersRef != null ) {
                msgs = ( ( InternalEObject ) analogueWiringParametersRef ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF, null,
                        msgs );
            }
            return basicSetAnalogueWiringParametersRef( ( AnalogueWiringParametersRef ) otherEnd, msgs );
        case AsdPackage.CONTROLLING_LNODE__PARENT_DAS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDAS( ( DAS ) otherEnd, msgs );
        case AsdPackage.CONTROLLING_LNODE__PARENT_DOS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDOS( ( DOS ) otherEnd, msgs );
        case AsdPackage.CONTROLLING_LNODE__PARENT_SDS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSDS( ( SDS ) otherEnd, msgs );
        case AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE:
            if( refersToProcessResource != null ) {
                msgs = ( ( InternalEObject ) refersToProcessResource ).eInverseRemove( this,
                        AsdPackage.PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE, ProcessResource.class, msgs );
            }
            return basicSetRefersToProcessResource( ( ProcessResource ) otherEnd, msgs );
        case AsdPackage.CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReferredByControlRef() )
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
        case AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF:
            return basicUnsetBinaryWiringParametersRef( msgs );
        case AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF:
            return basicUnsetAnalogueWiringParametersRef( msgs );
        case AsdPackage.CONTROLLING_LNODE__PARENT_DAS:
            return basicSetParentDAS( null, msgs );
        case AsdPackage.CONTROLLING_LNODE__PARENT_DOS:
            return basicSetParentDOS( null, msgs );
        case AsdPackage.CONTROLLING_LNODE__PARENT_SDS:
            return basicSetParentSDS( null, msgs );
        case AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE:
            return basicUnsetRefersToProcessResource( msgs );
        case AsdPackage.CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF:
            return ( ( InternalEList< ? > ) getReferredByControlRef() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.CONTROLLING_LNODE__PARENT_DAS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DAS__CONTROLLING_LNODE, DAS.class, msgs );
        case AsdPackage.CONTROLLING_LNODE__PARENT_DOS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DOS__CONTROLLING_LNODE, DOS.class, msgs );
        case AsdPackage.CONTROLLING_LNODE__PARENT_SDS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SDS__CONTROLLING_LNODE, SDS.class, msgs );
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
        case AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF:
            return getBinaryWiringParametersRef();
        case AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF:
            return getAnalogueWiringParametersRef();
        case AsdPackage.CONTROLLING_LNODE__OUTPUT_NAME:
            return getOutputName();
        case AsdPackage.CONTROLLING_LNODE__PLN:
            return getPLN();
        case AsdPackage.CONTROLLING_LNODE__RESOURCE_NAME:
            return getResourceName();
        case AsdPackage.CONTROLLING_LNODE__RESOURCE_UUID:
            return getResourceUuid();
        case AsdPackage.CONTROLLING_LNODE__PARENT_DAS:
            return getParentDAS();
        case AsdPackage.CONTROLLING_LNODE__PARENT_DOS:
            return getParentDOS();
        case AsdPackage.CONTROLLING_LNODE__PARENT_SDS:
            return getParentSDS();
        case AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE:
            if( resolve ) {
                return getRefersToProcessResource();
            }
            return basicGetRefersToProcessResource();
        case AsdPackage.CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF:
            return getReferredByControlRef();
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
        case AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF:
            setBinaryWiringParametersRef( ( BinaryWiringParametersRef ) newValue );
            return;
        case AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF:
            setAnalogueWiringParametersRef( ( AnalogueWiringParametersRef ) newValue );
            return;
        case AsdPackage.CONTROLLING_LNODE__OUTPUT_NAME:
            setOutputName( ( String ) newValue );
            return;
        case AsdPackage.CONTROLLING_LNODE__PLN:
            setPLN( ( String ) newValue );
            return;
        case AsdPackage.CONTROLLING_LNODE__RESOURCE_NAME:
            setResourceName( ( String ) newValue );
            return;
        case AsdPackage.CONTROLLING_LNODE__RESOURCE_UUID:
            setResourceUuid( ( String ) newValue );
            return;
        case AsdPackage.CONTROLLING_LNODE__PARENT_DAS:
            setParentDAS( ( DAS ) newValue );
            return;
        case AsdPackage.CONTROLLING_LNODE__PARENT_DOS:
            setParentDOS( ( DOS ) newValue );
            return;
        case AsdPackage.CONTROLLING_LNODE__PARENT_SDS:
            setParentSDS( ( SDS ) newValue );
            return;
        case AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE:
            setRefersToProcessResource( ( ProcessResource ) newValue );
            return;
        case AsdPackage.CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF:
            getReferredByControlRef().clear();
            getReferredByControlRef().addAll( ( Collection< ? extends ControlRef > ) newValue );
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
        case AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF:
            unsetBinaryWiringParametersRef();
            return;
        case AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF:
            unsetAnalogueWiringParametersRef();
            return;
        case AsdPackage.CONTROLLING_LNODE__OUTPUT_NAME:
            setOutputName( OUTPUT_NAME_EDEFAULT );
            return;
        case AsdPackage.CONTROLLING_LNODE__PLN:
            setPLN( PLN_EDEFAULT );
            return;
        case AsdPackage.CONTROLLING_LNODE__RESOURCE_NAME:
            setResourceName( RESOURCE_NAME_EDEFAULT );
            return;
        case AsdPackage.CONTROLLING_LNODE__RESOURCE_UUID:
            setResourceUuid( RESOURCE_UUID_EDEFAULT );
            return;
        case AsdPackage.CONTROLLING_LNODE__PARENT_DAS:
            setParentDAS( ( DAS ) null );
            return;
        case AsdPackage.CONTROLLING_LNODE__PARENT_DOS:
            setParentDOS( ( DOS ) null );
            return;
        case AsdPackage.CONTROLLING_LNODE__PARENT_SDS:
            setParentSDS( ( SDS ) null );
            return;
        case AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE:
            unsetRefersToProcessResource();
            return;
        case AsdPackage.CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF:
            unsetReferredByControlRef();
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
        case AsdPackage.CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF:
            return isSetBinaryWiringParametersRef();
        case AsdPackage.CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF:
            return isSetAnalogueWiringParametersRef();
        case AsdPackage.CONTROLLING_LNODE__OUTPUT_NAME:
            return OUTPUT_NAME_EDEFAULT == null ? outputName != null : !OUTPUT_NAME_EDEFAULT.equals( outputName );
        case AsdPackage.CONTROLLING_LNODE__PLN:
            return PLN_EDEFAULT == null ? pLN != null : !PLN_EDEFAULT.equals( pLN );
        case AsdPackage.CONTROLLING_LNODE__RESOURCE_NAME:
            return RESOURCE_NAME_EDEFAULT == null ? resourceName != null
                    : !RESOURCE_NAME_EDEFAULT.equals( resourceName );
        case AsdPackage.CONTROLLING_LNODE__RESOURCE_UUID:
            return RESOURCE_UUID_EDEFAULT == null ? resourceUuid != null
                    : !RESOURCE_UUID_EDEFAULT.equals( resourceUuid );
        case AsdPackage.CONTROLLING_LNODE__PARENT_DAS:
            return getParentDAS() != null;
        case AsdPackage.CONTROLLING_LNODE__PARENT_DOS:
            return getParentDOS() != null;
        case AsdPackage.CONTROLLING_LNODE__PARENT_SDS:
            return getParentSDS() != null;
        case AsdPackage.CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE:
            return isSetRefersToProcessResource();
        case AsdPackage.CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF:
            return isSetReferredByControlRef();
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
        result.append( " (outputName: " );
        result.append( outputName );
        result.append( ", pLN: " );
        result.append( pLN );
        result.append( ", resourceName: " );
        result.append( resourceName );
        result.append( ", resourceUuid: " );
        result.append( resourceUuid );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "ControllingLNode.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from ControllingLNode: ";
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
                    "ControllingLNode refers to ProcessResource( name = ", getRefersToProcessResource().getName(),
                    " )", " on line ", getRefersToProcessResource().getLineNumber() );

        }
        else {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, " ControllingLNode is not inside a LNode" );
        }
    }

} //ControllingLNodeImpl
