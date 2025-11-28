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

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.util.AsdUtilities;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Echo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessEchoImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessEchoImpl#getSourceDaName <em>Source Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessEchoImpl#getSourceDoName <em>Source Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessEchoImpl#getSourceLNodeUuid <em>Source LNode Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessEchoImpl#getParentDAS <em>Parent DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessEchoImpl#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessEchoImpl#getParentSDS <em>Parent SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessEchoImpl#getRefersToLNode <em>Refers To LNode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessEchoImpl extends BaseExtensionElementWithDescImpl implements ProcessEcho {
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
    protected ProcessEchoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getProcessEcho();
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_ECHO__SOURCE, oldSource,
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_ECHO__SOURCE_DA_NAME,
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_ECHO__SOURCE_DO_NAME,
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_ECHO__SOURCE_LNODE_UUID,
                    oldSourceLNodeUuid, sourceLNodeUuid ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAS getParentDAS() {
        if( eContainerFeatureID() != AsdPackage.PROCESS_ECHO__PARENT_DAS ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDAS, AsdPackage.PROCESS_ECHO__PARENT_DAS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.PROCESS_ECHO__PARENT_DAS && newParentDAS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDAS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDAS != null ) {
                msgs = ( ( InternalEObject ) newParentDAS ).eInverseAdd( this, AsdPackage.DAS__PROCESS_ECHO, DAS.class,
                        msgs );
            }
            msgs = basicSetParentDAS( newParentDAS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_ECHO__PARENT_DAS, newParentDAS,
                    newParentDAS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOS getParentDOS() {
        if( eContainerFeatureID() != AsdPackage.PROCESS_ECHO__PARENT_DOS ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDOS, AsdPackage.PROCESS_ECHO__PARENT_DOS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.PROCESS_ECHO__PARENT_DOS && newParentDOS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDOS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDOS != null ) {
                msgs = ( ( InternalEObject ) newParentDOS ).eInverseAdd( this, AsdPackage.DOS__PROCESS_ECHO, DOS.class,
                        msgs );
            }
            msgs = basicSetParentDOS( newParentDOS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_ECHO__PARENT_DOS, newParentDOS,
                    newParentDOS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SDS getParentSDS() {
        if( eContainerFeatureID() != AsdPackage.PROCESS_ECHO__PARENT_SDS ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSDS, AsdPackage.PROCESS_ECHO__PARENT_SDS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.PROCESS_ECHO__PARENT_SDS && newParentSDS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSDS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSDS != null ) {
                msgs = ( ( InternalEObject ) newParentSDS ).eInverseAdd( this, AsdPackage.SDS__PROCESS_ECHO, SDS.class,
                        msgs );
            }
            msgs = basicSetParentSDS( newParentSDS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_ECHO__PARENT_SDS, newParentSDS,
                    newParentSDS ) );
        }
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
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            AsdPackage.PROCESS_ECHO__REFERS_TO_LNODE, oldRefersToLNode, refersToLNode ) );
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
                    AsdPackage.PROCESS_ECHO__REFERS_TO_LNODE, oldRefersToLNode, newRefersToLNode,
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
                        SclPackage.LNODE__REFERRED_BY_PROCESS_ECHO, LNode.class, msgs );
            }
            if( newRefersToLNode != null ) {
                msgs = ( ( InternalEObject ) newRefersToLNode ).eInverseAdd( this,
                        SclPackage.LNODE__REFERRED_BY_PROCESS_ECHO, LNode.class, msgs );
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
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.PROCESS_ECHO__REFERS_TO_LNODE,
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
                    AsdPackage.PROCESS_ECHO__REFERS_TO_LNODE, oldRefersToLNode, null, oldRefersToLNodeESet );
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
                    SclPackage.LNODE__REFERRED_BY_PROCESS_ECHO, LNode.class, msgs );
            msgs = basicUnsetRefersToLNode( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToLNodeESet = refersToLNodeESet;
            refersToLNodeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.PROCESS_ECHO__REFERS_TO_LNODE,
                        null, null, oldRefersToLNodeESet ) );
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.PROCESS_ECHO__PARENT_DAS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDAS( ( DAS ) otherEnd, msgs );
        case AsdPackage.PROCESS_ECHO__PARENT_DOS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDOS( ( DOS ) otherEnd, msgs );
        case AsdPackage.PROCESS_ECHO__PARENT_SDS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSDS( ( SDS ) otherEnd, msgs );
        case AsdPackage.PROCESS_ECHO__REFERS_TO_LNODE:
            if( refersToLNode != null ) {
                msgs = ( ( InternalEObject ) refersToLNode ).eInverseRemove( this,
                        SclPackage.LNODE__REFERRED_BY_PROCESS_ECHO, LNode.class, msgs );
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
        case AsdPackage.PROCESS_ECHO__PARENT_DAS:
            return basicSetParentDAS( null, msgs );
        case AsdPackage.PROCESS_ECHO__PARENT_DOS:
            return basicSetParentDOS( null, msgs );
        case AsdPackage.PROCESS_ECHO__PARENT_SDS:
            return basicSetParentSDS( null, msgs );
        case AsdPackage.PROCESS_ECHO__REFERS_TO_LNODE:
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
        case AsdPackage.PROCESS_ECHO__PARENT_DAS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DAS__PROCESS_ECHO, DAS.class, msgs );
        case AsdPackage.PROCESS_ECHO__PARENT_DOS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DOS__PROCESS_ECHO, DOS.class, msgs );
        case AsdPackage.PROCESS_ECHO__PARENT_SDS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SDS__PROCESS_ECHO, SDS.class, msgs );
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
        case AsdPackage.PROCESS_ECHO__SOURCE:
            return getSource();
        case AsdPackage.PROCESS_ECHO__SOURCE_DA_NAME:
            return getSourceDaName();
        case AsdPackage.PROCESS_ECHO__SOURCE_DO_NAME:
            return getSourceDoName();
        case AsdPackage.PROCESS_ECHO__SOURCE_LNODE_UUID:
            return getSourceLNodeUuid();
        case AsdPackage.PROCESS_ECHO__PARENT_DAS:
            return getParentDAS();
        case AsdPackage.PROCESS_ECHO__PARENT_DOS:
            return getParentDOS();
        case AsdPackage.PROCESS_ECHO__PARENT_SDS:
            return getParentSDS();
        case AsdPackage.PROCESS_ECHO__REFERS_TO_LNODE:
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
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case AsdPackage.PROCESS_ECHO__SOURCE:
            setSource( ( String ) newValue );
            return;
        case AsdPackage.PROCESS_ECHO__SOURCE_DA_NAME:
            setSourceDaName( ( String ) newValue );
            return;
        case AsdPackage.PROCESS_ECHO__SOURCE_DO_NAME:
            setSourceDoName( ( String ) newValue );
            return;
        case AsdPackage.PROCESS_ECHO__SOURCE_LNODE_UUID:
            setSourceLNodeUuid( ( String ) newValue );
            return;
        case AsdPackage.PROCESS_ECHO__PARENT_DAS:
            setParentDAS( ( DAS ) newValue );
            return;
        case AsdPackage.PROCESS_ECHO__PARENT_DOS:
            setParentDOS( ( DOS ) newValue );
            return;
        case AsdPackage.PROCESS_ECHO__PARENT_SDS:
            setParentSDS( ( SDS ) newValue );
            return;
        case AsdPackage.PROCESS_ECHO__REFERS_TO_LNODE:
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
        case AsdPackage.PROCESS_ECHO__SOURCE:
            setSource( SOURCE_EDEFAULT );
            return;
        case AsdPackage.PROCESS_ECHO__SOURCE_DA_NAME:
            setSourceDaName( SOURCE_DA_NAME_EDEFAULT );
            return;
        case AsdPackage.PROCESS_ECHO__SOURCE_DO_NAME:
            setSourceDoName( SOURCE_DO_NAME_EDEFAULT );
            return;
        case AsdPackage.PROCESS_ECHO__SOURCE_LNODE_UUID:
            setSourceLNodeUuid( SOURCE_LNODE_UUID_EDEFAULT );
            return;
        case AsdPackage.PROCESS_ECHO__PARENT_DAS:
            setParentDAS( ( DAS ) null );
            return;
        case AsdPackage.PROCESS_ECHO__PARENT_DOS:
            setParentDOS( ( DOS ) null );
            return;
        case AsdPackage.PROCESS_ECHO__PARENT_SDS:
            setParentSDS( ( SDS ) null );
            return;
        case AsdPackage.PROCESS_ECHO__REFERS_TO_LNODE:
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
        case AsdPackage.PROCESS_ECHO__SOURCE:
            return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals( source );
        case AsdPackage.PROCESS_ECHO__SOURCE_DA_NAME:
            return SOURCE_DA_NAME_EDEFAULT == null ? sourceDaName != null
                    : !SOURCE_DA_NAME_EDEFAULT.equals( sourceDaName );
        case AsdPackage.PROCESS_ECHO__SOURCE_DO_NAME:
            return SOURCE_DO_NAME_EDEFAULT == null ? sourceDoName != null
                    : !SOURCE_DO_NAME_EDEFAULT.equals( sourceDoName );
        case AsdPackage.PROCESS_ECHO__SOURCE_LNODE_UUID:
            return SOURCE_LNODE_UUID_EDEFAULT == null ? sourceLNodeUuid != null
                    : !SOURCE_LNODE_UUID_EDEFAULT.equals( sourceLNodeUuid );
        case AsdPackage.PROCESS_ECHO__PARENT_DAS:
            return getParentDAS() != null;
        case AsdPackage.PROCESS_ECHO__PARENT_DOS:
            return getParentDOS() != null;
        case AsdPackage.PROCESS_ECHO__PARENT_SDS:
            return getParentSDS() != null;
        case AsdPackage.PROCESS_ECHO__REFERS_TO_LNODE:
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
        result.append( " (source: " );
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
                "ProcessEcho.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from ProcessEcho: ";
        doBuildExplicitLinkWithLNode( console, messagePrefix );
    }

    private void doBuildExplicitLinkWithLNode( @NonNull IRiseClipseConsole console, @NonNull String mPrefix ) {

        String messagePrefix = mPrefix + "(looking for LNode) ";

        SCL sclRoot = AsdUtilities.getSCL( this );

        if( getSourceLNodeUuid() != null && !getSourceLNodeUuid().isEmpty() ) {
            Pair< LNode, Integer > res = AsdUtilities.findByUuid( sclRoot, getSourceLNodeUuid(), LNode.class );

            if( res.getLeft() != null ) {
                setRefersToLNode( res.getLeft() );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "ProcessEcho refers to LNode( uuid = ", getSourceLNodeUuid(), " ) on line ",
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
                    "ProcessEcho refers to LNode( name = ", lnodePath[lnodePath.length - 1], " )", " on line ",
                    getRefersToLNode().getLineNumber() );

        }
        else {
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "link not resolved because source and sourceLNodeUuid are missing" );
        }

    }

} //ProcessEchoImpl
