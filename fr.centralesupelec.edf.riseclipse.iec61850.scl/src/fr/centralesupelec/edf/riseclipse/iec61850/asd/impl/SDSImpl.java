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
import org.eclipse.emf.ecore.util.EcoreUtil;
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
 * An implementation of the model object '<em><b>SDS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getSDS <em>SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getDAS <em>DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getSubscriberLNode <em>Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getControllingLNode <em>Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getProcessEcho <em>Process Echo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getLogParametersRef <em>Log Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getMappedDoName <em>Mapped Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getMappedLnUuid <em>Mapped Ln Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getParentSDS <em>Parent SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDSImpl extends BaseExtensionElementWithDescImpl implements SDS {
    /**
     * The cached value of the '{@link #getSDS() <em>SDS</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSDS()
     * @generated
     * @ordered
     */
    protected EList< SDS > sDS;

    /**
     * The cached value of the '{@link #getDAS() <em>DAS</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAS()
     * @generated
     * @ordered
     */
    protected EList< DAS > dAS;

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
     * This is true if the Labels containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean labelsESet;

    /**
     * The default value of the '{@link #getIx() <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIx()
     * @generated
     * @ordered
     */
    protected static final long IX_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getIx() <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIx()
     * @generated
     * @ordered
     */
    protected long ix = IX_EDEFAULT;

    /**
     * This is true if the Ix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ixESet;

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
    protected SDSImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getSDS();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SDS > getSDS() {
        if( sDS == null ) {
            sDS = new EObjectContainmentWithInverseEList.Unsettable< >( SDS.class, this, AsdPackage.SDS__SDS,
                    AsdPackage.SDS__PARENT_SDS );
        }
        return sDS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSDS() {
        if( sDS != null ) {
            ( ( InternalEList.Unsettable< ? > ) sDS ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSDS() {
        return sDS != null && ( ( InternalEList.Unsettable< ? > ) sDS ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DAS > getDAS() {
        if( dAS == null ) {
            dAS = new EObjectContainmentWithInverseEList.Unsettable< >( DAS.class, this, AsdPackage.SDS__DAS,
                    AsdPackage.DAS__PARENT_SDS );
        }
        return dAS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDAS() {
        if( dAS != null ) {
            ( ( InternalEList.Unsettable< ? > ) dAS ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDAS() {
        return dAS != null && ( ( InternalEList.Unsettable< ? > ) dAS ).isSet();
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
                    SubscriberLNode.class, this, AsdPackage.SDS__SUBSCRIBER_LNODE,
                    AsdPackage.SUBSCRIBER_LNODE__PARENT_SDS );
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
                    ControllingLNode.class, this, AsdPackage.SDS__CONTROLLING_LNODE,
                    AsdPackage.CONTROLLING_LNODE__PARENT_SDS );
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
                    AsdPackage.SDS__PROCESS_ECHO, AsdPackage.PROCESS_ECHO__PARENT_SDS );
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
                    LogParametersRef.class, this, AsdPackage.SDS__LOG_PARAMETERS_REF,
                    AsdPackage.LOG_PARAMETERS_REF__PARENT_SDS );
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
        boolean oldLabelsESet = labelsESet;
        labelsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, AsdPackage.SDS__LABELS,
                    oldLabels, newLabels, !oldLabelsESet );
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
                msgs = ( ( InternalEObject ) labels ).eInverseRemove( this, SclPackage.LABELS__PARENT_SDS, Labels.class,
                        msgs );
            }
            if( newLabels != null ) {
                msgs = ( ( InternalEObject ) newLabels ).eInverseAdd( this, SclPackage.LABELS__PARENT_SDS, Labels.class,
                        msgs );
            }
            msgs = basicSetLabels( newLabels, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldLabelsESet = labelsESet;
            labelsESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SDS__LABELS, newLabels, newLabels,
                        !oldLabelsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLabels( NotificationChain msgs ) {
        Labels oldLabels = labels;
        labels = null;
        boolean oldLabelsESet = labelsESet;
        labelsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, AsdPackage.SDS__LABELS,
                    oldLabels, null, oldLabelsESet );
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
    public void unsetLabels() {
        if( labels != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) labels ).eInverseRemove( this, SclPackage.LABELS__PARENT_SDS, Labels.class,
                    msgs );
            msgs = basicUnsetLabels( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldLabelsESet = labelsESet;
            labelsESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SDS__LABELS, null, null,
                        oldLabelsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLabels() {
        return labelsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public long getIx() {
        return ix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIx( long newIx ) {
        long oldIx = ix;
        ix = newIx;
        boolean oldIxESet = ixESet;
        ixESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SDS__IX, oldIx, ix, !oldIxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIx() {
        long oldIx = ix;
        boolean oldIxESet = ixESet;
        ix = IX_EDEFAULT;
        ixESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SDS__IX, oldIx, IX_EDEFAULT,
                    oldIxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIx() {
        return ixESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SDS__MAPPED_DO_NAME, oldMappedDoName,
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SDS__MAPPED_LN_UUID, oldMappedLnUuid,
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
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SDS__NAME, oldName, name ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOS getParentDOS() {
        if( eContainerFeatureID() != AsdPackage.SDS__PARENT_DOS ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDOS, AsdPackage.SDS__PARENT_DOS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.SDS__PARENT_DOS && newParentDOS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDOS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDOS != null ) {
                msgs = ( ( InternalEObject ) newParentDOS ).eInverseAdd( this, AsdPackage.DOS__SDS, DOS.class, msgs );
            }
            msgs = basicSetParentDOS( newParentDOS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SDS__PARENT_DOS, newParentDOS,
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
        if( eContainerFeatureID() != AsdPackage.SDS__PARENT_SDS ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSDS, AsdPackage.SDS__PARENT_SDS, msgs );
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
                || ( eContainerFeatureID() != AsdPackage.SDS__PARENT_SDS && newParentSDS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSDS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSDS != null ) {
                msgs = ( ( InternalEObject ) newParentSDS ).eInverseAdd( this, AsdPackage.SDS__SDS, SDS.class, msgs );
            }
            msgs = basicSetParentSDS( newParentSDS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SDS__PARENT_SDS, newParentSDS,
                    newParentSDS ) );
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
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, AsdPackage.SDS__REFERS_TO_ANY_LN,
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
                    AsdPackage.SDS__REFERS_TO_ANY_LN, oldRefersToAnyLN, newRefersToAnyLN, !oldRefersToAnyLNESet );
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
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_SDS,
                        AnyLN.class, msgs );
            }
            if( newRefersToAnyLN != null ) {
                msgs = ( ( InternalEObject ) newRefersToAnyLN ).eInverseAdd( this, SclPackage.ANY_LN__REFERRED_BY_SDS,
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
                eNotify( new ENotificationImpl( this, Notification.SET, AsdPackage.SDS__REFERS_TO_ANY_LN,
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
                    AsdPackage.SDS__REFERS_TO_ANY_LN, oldRefersToAnyLN, null, oldRefersToAnyLNESet );
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
            msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_SDS,
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
                eNotify( new ENotificationImpl( this, Notification.UNSET, AsdPackage.SDS__REFERS_TO_ANY_LN, null, null,
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
        case AsdPackage.SDS__SDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSDS() ).basicAdd( otherEnd, msgs );
        case AsdPackage.SDS__DAS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDAS() ).basicAdd( otherEnd, msgs );
        case AsdPackage.SDS__SUBSCRIBER_LNODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubscriberLNode() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SDS__CONTROLLING_LNODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getControllingLNode() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SDS__PROCESS_ECHO:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProcessEcho() ).basicAdd( otherEnd,
                    msgs );
        case AsdPackage.SDS__LOG_PARAMETERS_REF:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLogParametersRef() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SDS__LABELS:
            if( labels != null ) {
                msgs = ( ( InternalEObject ) labels ).eInverseRemove( this,
                        EOPPOSITE_FEATURE_BASE - AsdPackage.SDS__LABELS, null, msgs );
            }
            return basicSetLabels( ( Labels ) otherEnd, msgs );
        case AsdPackage.SDS__PARENT_DOS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDOS( ( DOS ) otherEnd, msgs );
        case AsdPackage.SDS__PARENT_SDS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSDS( ( SDS ) otherEnd, msgs );
        case AsdPackage.SDS__REFERS_TO_ANY_LN:
            if( refersToAnyLN != null ) {
                msgs = ( ( InternalEObject ) refersToAnyLN ).eInverseRemove( this, SclPackage.ANY_LN__REFERRED_BY_SDS,
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
        case AsdPackage.SDS__SDS:
            return ( ( InternalEList< ? > ) getSDS() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SDS__DAS:
            return ( ( InternalEList< ? > ) getDAS() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SDS__SUBSCRIBER_LNODE:
            return ( ( InternalEList< ? > ) getSubscriberLNode() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SDS__CONTROLLING_LNODE:
            return ( ( InternalEList< ? > ) getControllingLNode() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SDS__PROCESS_ECHO:
            return ( ( InternalEList< ? > ) getProcessEcho() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SDS__LOG_PARAMETERS_REF:
            return ( ( InternalEList< ? > ) getLogParametersRef() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SDS__LABELS:
            return basicUnsetLabels( msgs );
        case AsdPackage.SDS__PARENT_DOS:
            return basicSetParentDOS( null, msgs );
        case AsdPackage.SDS__PARENT_SDS:
            return basicSetParentSDS( null, msgs );
        case AsdPackage.SDS__REFERS_TO_ANY_LN:
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
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch( eContainerFeatureID() ) {
        case AsdPackage.SDS__PARENT_DOS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DOS__SDS, DOS.class, msgs );
        case AsdPackage.SDS__PARENT_SDS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SDS__SDS, SDS.class, msgs );
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
        case AsdPackage.SDS__SDS:
            return getSDS();
        case AsdPackage.SDS__DAS:
            return getDAS();
        case AsdPackage.SDS__SUBSCRIBER_LNODE:
            return getSubscriberLNode();
        case AsdPackage.SDS__CONTROLLING_LNODE:
            return getControllingLNode();
        case AsdPackage.SDS__PROCESS_ECHO:
            return getProcessEcho();
        case AsdPackage.SDS__LOG_PARAMETERS_REF:
            return getLogParametersRef();
        case AsdPackage.SDS__LABELS:
            return getLabels();
        case AsdPackage.SDS__IX:
            return getIx();
        case AsdPackage.SDS__MAPPED_DO_NAME:
            return getMappedDoName();
        case AsdPackage.SDS__MAPPED_LN_UUID:
            return getMappedLnUuid();
        case AsdPackage.SDS__NAME:
            return getName();
        case AsdPackage.SDS__PARENT_DOS:
            return getParentDOS();
        case AsdPackage.SDS__PARENT_SDS:
            return getParentSDS();
        case AsdPackage.SDS__REFERS_TO_ANY_LN:
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
        case AsdPackage.SDS__SDS:
            getSDS().clear();
            getSDS().addAll( ( Collection< ? extends SDS > ) newValue );
            return;
        case AsdPackage.SDS__DAS:
            getDAS().clear();
            getDAS().addAll( ( Collection< ? extends DAS > ) newValue );
            return;
        case AsdPackage.SDS__SUBSCRIBER_LNODE:
            getSubscriberLNode().clear();
            getSubscriberLNode().addAll( ( Collection< ? extends SubscriberLNode > ) newValue );
            return;
        case AsdPackage.SDS__CONTROLLING_LNODE:
            getControllingLNode().clear();
            getControllingLNode().addAll( ( Collection< ? extends ControllingLNode > ) newValue );
            return;
        case AsdPackage.SDS__PROCESS_ECHO:
            getProcessEcho().clear();
            getProcessEcho().addAll( ( Collection< ? extends ProcessEcho > ) newValue );
            return;
        case AsdPackage.SDS__LOG_PARAMETERS_REF:
            getLogParametersRef().clear();
            getLogParametersRef().addAll( ( Collection< ? extends LogParametersRef > ) newValue );
            return;
        case AsdPackage.SDS__LABELS:
            setLabels( ( Labels ) newValue );
            return;
        case AsdPackage.SDS__IX:
            setIx( ( Long ) newValue );
            return;
        case AsdPackage.SDS__MAPPED_DO_NAME:
            setMappedDoName( ( String ) newValue );
            return;
        case AsdPackage.SDS__MAPPED_LN_UUID:
            setMappedLnUuid( ( String ) newValue );
            return;
        case AsdPackage.SDS__NAME:
            setName( ( String ) newValue );
            return;
        case AsdPackage.SDS__PARENT_DOS:
            setParentDOS( ( DOS ) newValue );
            return;
        case AsdPackage.SDS__PARENT_SDS:
            setParentSDS( ( SDS ) newValue );
            return;
        case AsdPackage.SDS__REFERS_TO_ANY_LN:
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
        case AsdPackage.SDS__SDS:
            unsetSDS();
            return;
        case AsdPackage.SDS__DAS:
            unsetDAS();
            return;
        case AsdPackage.SDS__SUBSCRIBER_LNODE:
            unsetSubscriberLNode();
            return;
        case AsdPackage.SDS__CONTROLLING_LNODE:
            unsetControllingLNode();
            return;
        case AsdPackage.SDS__PROCESS_ECHO:
            unsetProcessEcho();
            return;
        case AsdPackage.SDS__LOG_PARAMETERS_REF:
            unsetLogParametersRef();
            return;
        case AsdPackage.SDS__LABELS:
            unsetLabels();
            return;
        case AsdPackage.SDS__IX:
            unsetIx();
            return;
        case AsdPackage.SDS__MAPPED_DO_NAME:
            setMappedDoName( MAPPED_DO_NAME_EDEFAULT );
            return;
        case AsdPackage.SDS__MAPPED_LN_UUID:
            setMappedLnUuid( MAPPED_LN_UUID_EDEFAULT );
            return;
        case AsdPackage.SDS__NAME:
            setName( NAME_EDEFAULT );
            return;
        case AsdPackage.SDS__PARENT_DOS:
            setParentDOS( ( DOS ) null );
            return;
        case AsdPackage.SDS__PARENT_SDS:
            setParentSDS( ( SDS ) null );
            return;
        case AsdPackage.SDS__REFERS_TO_ANY_LN:
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
        case AsdPackage.SDS__SDS:
            return isSetSDS();
        case AsdPackage.SDS__DAS:
            return isSetDAS();
        case AsdPackage.SDS__SUBSCRIBER_LNODE:
            return isSetSubscriberLNode();
        case AsdPackage.SDS__CONTROLLING_LNODE:
            return isSetControllingLNode();
        case AsdPackage.SDS__PROCESS_ECHO:
            return isSetProcessEcho();
        case AsdPackage.SDS__LOG_PARAMETERS_REF:
            return isSetLogParametersRef();
        case AsdPackage.SDS__LABELS:
            return isSetLabels();
        case AsdPackage.SDS__IX:
            return isSetIx();
        case AsdPackage.SDS__MAPPED_DO_NAME:
            return MAPPED_DO_NAME_EDEFAULT == null ? mappedDoName != null
                    : !MAPPED_DO_NAME_EDEFAULT.equals( mappedDoName );
        case AsdPackage.SDS__MAPPED_LN_UUID:
            return MAPPED_LN_UUID_EDEFAULT == null ? mappedLnUuid != null
                    : !MAPPED_LN_UUID_EDEFAULT.equals( mappedLnUuid );
        case AsdPackage.SDS__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals( name );
        case AsdPackage.SDS__PARENT_DOS:
            return getParentDOS() != null;
        case AsdPackage.SDS__PARENT_SDS:
            return getParentSDS() != null;
        case AsdPackage.SDS__REFERS_TO_ANY_LN:
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
        result.append( " (ix: " );
        if( ixESet ) {
            result.append( ix );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", mappedDoName: " );
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
                "SDS.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from SDS: ";
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
                        "SDS refers to AnyLN( uuid = ", getMappedLnUuid(), " ) on line ",
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

} //SDSImpl
