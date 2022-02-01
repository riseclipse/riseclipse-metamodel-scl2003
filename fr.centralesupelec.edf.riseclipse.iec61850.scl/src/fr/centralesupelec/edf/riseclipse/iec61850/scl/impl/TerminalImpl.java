/*
*************************************************************************
**  Copyright (c) 2016-2022 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclUtilities;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getBayName <em>Bay Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getCNodeName <em>CNode Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getProcessName <em>Process Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getSubstationName <em>Substation Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getVoltageLevelName <em>Voltage Level Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getParentAbstractConductingEquipment <em>Parent Abstract Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getRefersToConnectivityNode <em>Refers To Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getLineName <em>Line Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminalImpl extends UnNamingImpl implements Terminal {
    /**
     * The default value of the '{@link #getBayName() <em>Bay Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBayName()
     * @generated
     * @ordered
     */
    protected static final String BAY_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBayName() <em>Bay Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBayName()
     * @generated
     * @ordered
     */
    protected String bayName = BAY_NAME_EDEFAULT;

    /**
     * This is true if the Bay Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bayNameESet;

    /**
     * The default value of the '{@link #getCNodeName() <em>CNode Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCNodeName()
     * @generated
     * @ordered
     */
    protected static final String CNODE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCNodeName() <em>CNode Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCNodeName()
     * @generated
     * @ordered
     */
    protected String cNodeName = CNODE_NAME_EDEFAULT;

    /**
     * This is true if the CNode Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cNodeNameESet;

    /**
     * The default value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNode()
     * @generated
     * @ordered
     */
    protected static final String CONNECTIVITY_NODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNode()
     * @generated
     * @ordered
     */
    protected String connectivityNode = CONNECTIVITY_NODE_EDEFAULT;

    /**
     * This is true if the Connectivity Node attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectivityNodeESet;

    /**
     * The default value of the '{@link #getProcessName() <em>Process Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessName()
     * @generated
     * @ordered
     */
    protected static final String PROCESS_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProcessName() <em>Process Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessName()
     * @generated
     * @ordered
     */
    protected String processName = PROCESS_NAME_EDEFAULT;

    /**
     * This is true if the Process Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean processNameESet;

    /**
     * The default value of the '{@link #getSubstationName() <em>Substation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubstationName()
     * @generated
     * @ordered
     */
    protected static final String SUBSTATION_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubstationName() <em>Substation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubstationName()
     * @generated
     * @ordered
     */
    protected String substationName = SUBSTATION_NAME_EDEFAULT;

    /**
     * This is true if the Substation Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean substationNameESet;

    /**
     * The default value of the '{@link #getVoltageLevelName() <em>Voltage Level Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageLevelName()
     * @generated
     * @ordered
     */
    protected static final String VOLTAGE_LEVEL_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageLevelName() <em>Voltage Level Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageLevelName()
     * @generated
     * @ordered
     */
    protected String voltageLevelName = VOLTAGE_LEVEL_NAME_EDEFAULT;

    /**
     * This is true if the Voltage Level Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageLevelNameESet;

    /**
     * The cached value of the '{@link #getRefersToConnectivityNode() <em>Refers To Connectivity Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToConnectivityNode()
     * @generated
     * @ordered
     */
    protected ConnectivityNode refersToConnectivityNode;

    /**
     * This is true if the Refers To Connectivity Node reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToConnectivityNodeESet;

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
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The default value of the '{@link #getLineName() <em>Line Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineName()
     * @generated
     * @ordered
     */
    protected static final String LINE_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLineName() <em>Line Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineName()
     * @generated
     * @ordered
     */
    protected String lineName = LINE_NAME_EDEFAULT;

    /**
     * This is true if the Line Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lineNameESet;

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    protected TerminalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getTerminal();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBayName() {
        return bayName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBayName( String newBayName ) {
        String oldBayName = bayName;
        bayName = newBayName;
        boolean oldBayNameESet = bayNameESet;
        bayNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TERMINAL__BAY_NAME, oldBayName, bayName,
                    !oldBayNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBayName() {
        String oldBayName = bayName;
        boolean oldBayNameESet = bayNameESet;
        bayName = BAY_NAME_EDEFAULT;
        bayNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.TERMINAL__BAY_NAME, oldBayName,
                    BAY_NAME_EDEFAULT, oldBayNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBayName() {
        return bayNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCNodeName() {
        return cNodeName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCNodeName( String newCNodeName ) {
        String oldCNodeName = cNodeName;
        cNodeName = newCNodeName;
        boolean oldCNodeNameESet = cNodeNameESet;
        cNodeNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TERMINAL__CNODE_NAME, oldCNodeName,
                    cNodeName, !oldCNodeNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCNodeName() {
        String oldCNodeName = cNodeName;
        boolean oldCNodeNameESet = cNodeNameESet;
        cNodeName = CNODE_NAME_EDEFAULT;
        cNodeNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.TERMINAL__CNODE_NAME, oldCNodeName,
                    CNODE_NAME_EDEFAULT, oldCNodeNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCNodeName() {
        return cNodeNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getConnectivityNode() {
        return connectivityNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConnectivityNode( String newConnectivityNode ) {
        String oldConnectivityNode = connectivityNode;
        connectivityNode = newConnectivityNode;
        boolean oldConnectivityNodeESet = connectivityNodeESet;
        connectivityNodeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TERMINAL__CONNECTIVITY_NODE,
                    oldConnectivityNode, connectivityNode, !oldConnectivityNodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectivityNode() {
        String oldConnectivityNode = connectivityNode;
        boolean oldConnectivityNodeESet = connectivityNodeESet;
        connectivityNode = CONNECTIVITY_NODE_EDEFAULT;
        connectivityNodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.TERMINAL__CONNECTIVITY_NODE,
                    oldConnectivityNode, CONNECTIVITY_NODE_EDEFAULT, oldConnectivityNodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectivityNode() {
        return connectivityNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getProcessName() {
        return processName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProcessName( String newProcessName ) {
        String oldProcessName = processName;
        processName = newProcessName;
        boolean oldProcessNameESet = processNameESet;
        processNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TERMINAL__PROCESS_NAME, oldProcessName,
                    processName, !oldProcessNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProcessName() {
        String oldProcessName = processName;
        boolean oldProcessNameESet = processNameESet;
        processName = PROCESS_NAME_EDEFAULT;
        processNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.TERMINAL__PROCESS_NAME, oldProcessName,
                    PROCESS_NAME_EDEFAULT, oldProcessNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcessName() {
        return processNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSubstationName() {
        return substationName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubstationName( String newSubstationName ) {
        String oldSubstationName = substationName;
        substationName = newSubstationName;
        boolean oldSubstationNameESet = substationNameESet;
        substationNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TERMINAL__SUBSTATION_NAME,
                    oldSubstationName, substationName, !oldSubstationNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubstationName() {
        String oldSubstationName = substationName;
        boolean oldSubstationNameESet = substationNameESet;
        substationName = SUBSTATION_NAME_EDEFAULT;
        substationNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.TERMINAL__SUBSTATION_NAME,
                    oldSubstationName, SUBSTATION_NAME_EDEFAULT, oldSubstationNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubstationName() {
        return substationNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVoltageLevelName() {
        return voltageLevelName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageLevelName( String newVoltageLevelName ) {
        String oldVoltageLevelName = voltageLevelName;
        voltageLevelName = newVoltageLevelName;
        boolean oldVoltageLevelNameESet = voltageLevelNameESet;
        voltageLevelNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TERMINAL__VOLTAGE_LEVEL_NAME,
                    oldVoltageLevelName, voltageLevelName, !oldVoltageLevelNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageLevelName() {
        String oldVoltageLevelName = voltageLevelName;
        boolean oldVoltageLevelNameESet = voltageLevelNameESet;
        voltageLevelName = VOLTAGE_LEVEL_NAME_EDEFAULT;
        voltageLevelNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.TERMINAL__VOLTAGE_LEVEL_NAME,
                    oldVoltageLevelName, VOLTAGE_LEVEL_NAME_EDEFAULT, oldVoltageLevelNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageLevelName() {
        return voltageLevelNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractConductingEquipment getParentAbstractConductingEquipment() {
        if( eContainerFeatureID() != SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT ) return null;
        return ( AbstractConductingEquipment ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAbstractConductingEquipment(
            AbstractConductingEquipment newParentAbstractConductingEquipment, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAbstractConductingEquipment,
                SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAbstractConductingEquipment(
            AbstractConductingEquipment newParentAbstractConductingEquipment ) {
        if( newParentAbstractConductingEquipment != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT
                        && newParentAbstractConductingEquipment != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAbstractConductingEquipment ) )
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            NotificationChain msgs = null;
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            if( newParentAbstractConductingEquipment != null )
                msgs = ( ( InternalEObject ) newParentAbstractConductingEquipment ).eInverseAdd( this,
                        SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL, AbstractConductingEquipment.class, msgs );
            msgs = basicSetParentAbstractConductingEquipment( newParentAbstractConductingEquipment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT, newParentAbstractConductingEquipment,
                    newParentAbstractConductingEquipment ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectivityNode getRefersToConnectivityNode() {
        return refersToConnectivityNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToConnectivityNode( ConnectivityNode newRefersToConnectivityNode,
            NotificationChain msgs ) {
        ConnectivityNode oldRefersToConnectivityNode = refersToConnectivityNode;
        refersToConnectivityNode = newRefersToConnectivityNode;
        boolean oldRefersToConnectivityNodeESet = refersToConnectivityNodeESet;
        refersToConnectivityNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.TERMINAL__REFERS_TO_CONNECTIVITY_NODE, oldRefersToConnectivityNode,
                    newRefersToConnectivityNode, !oldRefersToConnectivityNodeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToConnectivityNode( ConnectivityNode newRefersToConnectivityNode ) {
        if( newRefersToConnectivityNode != refersToConnectivityNode ) {
            NotificationChain msgs = null;
            if( refersToConnectivityNode != null )
                msgs = ( ( InternalEObject ) refersToConnectivityNode ).eInverseRemove( this,
                        SclPackage.CONNECTIVITY_NODE__REFERRED_BY_TERMINAL, ConnectivityNode.class, msgs );
            if( newRefersToConnectivityNode != null )
                msgs = ( ( InternalEObject ) newRefersToConnectivityNode ).eInverseAdd( this,
                        SclPackage.CONNECTIVITY_NODE__REFERRED_BY_TERMINAL, ConnectivityNode.class, msgs );
            msgs = basicSetRefersToConnectivityNode( newRefersToConnectivityNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToConnectivityNodeESet = refersToConnectivityNodeESet;
            refersToConnectivityNodeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        SclPackage.TERMINAL__REFERS_TO_CONNECTIVITY_NODE, newRefersToConnectivityNode,
                        newRefersToConnectivityNode, !oldRefersToConnectivityNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToConnectivityNode( NotificationChain msgs ) {
        ConnectivityNode oldRefersToConnectivityNode = refersToConnectivityNode;
        refersToConnectivityNode = null;
        boolean oldRefersToConnectivityNodeESet = refersToConnectivityNodeESet;
        refersToConnectivityNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.TERMINAL__REFERS_TO_CONNECTIVITY_NODE, oldRefersToConnectivityNode, null,
                    oldRefersToConnectivityNodeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToConnectivityNode() {
        if( refersToConnectivityNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToConnectivityNode ).eInverseRemove( this,
                    SclPackage.CONNECTIVITY_NODE__REFERRED_BY_TERMINAL, ConnectivityNode.class, msgs );
            msgs = basicUnsetRefersToConnectivityNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRefersToConnectivityNodeESet = refersToConnectivityNodeESet;
            refersToConnectivityNodeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        SclPackage.TERMINAL__REFERS_TO_CONNECTIVITY_NODE, null, null,
                        oldRefersToConnectivityNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToConnectivityNode() {
        return refersToConnectivityNodeESet;
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
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TERMINAL__NAME, oldName, name,
                    !oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.TERMINAL__NAME, oldName, NAME_EDEFAULT,
                    oldNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLineName() {
        return lineName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLineName( String newLineName ) {
        String oldLineName = lineName;
        lineName = newLineName;
        boolean oldLineNameESet = lineNameESet;
        lineNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.TERMINAL__LINE_NAME, oldLineName,
                    lineName, !oldLineNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLineName() {
        String oldLineName = lineName;
        boolean oldLineNameESet = lineNameESet;
        lineName = LINE_NAME_EDEFAULT;
        lineNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.TERMINAL__LINE_NAME, oldLineName,
                    LINE_NAME_EDEFAULT, oldLineNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLineName() {
        return lineNameESet;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            if( eInternalContainer() != null )
                msgs = eBasicRemoveFromContainer( msgs );
            return basicSetParentAbstractConductingEquipment( ( AbstractConductingEquipment ) otherEnd, msgs );
        case SclPackage.TERMINAL__REFERS_TO_CONNECTIVITY_NODE:
            if( refersToConnectivityNode != null )
                msgs = ( ( InternalEObject ) refersToConnectivityNode ).eInverseRemove( this,
                        SclPackage.CONNECTIVITY_NODE__REFERRED_BY_TERMINAL, ConnectivityNode.class, msgs );
            return basicSetRefersToConnectivityNode( ( ConnectivityNode ) otherEnd, msgs );
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
        case SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            return basicSetParentAbstractConductingEquipment( null, msgs );
        case SclPackage.TERMINAL__REFERS_TO_CONNECTIVITY_NODE:
            return basicUnsetRefersToConnectivityNode( msgs );
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
        case SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            return eInternalContainer().eInverseRemove( this, SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL,
                    AbstractConductingEquipment.class, msgs );
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
        case SclPackage.TERMINAL__BAY_NAME:
            return getBayName();
        case SclPackage.TERMINAL__CNODE_NAME:
            return getCNodeName();
        case SclPackage.TERMINAL__CONNECTIVITY_NODE:
            return getConnectivityNode();
        case SclPackage.TERMINAL__PROCESS_NAME:
            return getProcessName();
        case SclPackage.TERMINAL__SUBSTATION_NAME:
            return getSubstationName();
        case SclPackage.TERMINAL__VOLTAGE_LEVEL_NAME:
            return getVoltageLevelName();
        case SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            return getParentAbstractConductingEquipment();
        case SclPackage.TERMINAL__REFERS_TO_CONNECTIVITY_NODE:
            return getRefersToConnectivityNode();
        case SclPackage.TERMINAL__NAME:
            return getName();
        case SclPackage.TERMINAL__LINE_NAME:
            return getLineName();
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
        case SclPackage.TERMINAL__BAY_NAME:
            setBayName( ( String ) newValue );
            return;
        case SclPackage.TERMINAL__CNODE_NAME:
            setCNodeName( ( String ) newValue );
            return;
        case SclPackage.TERMINAL__CONNECTIVITY_NODE:
            setConnectivityNode( ( String ) newValue );
            return;
        case SclPackage.TERMINAL__PROCESS_NAME:
            setProcessName( ( String ) newValue );
            return;
        case SclPackage.TERMINAL__SUBSTATION_NAME:
            setSubstationName( ( String ) newValue );
            return;
        case SclPackage.TERMINAL__VOLTAGE_LEVEL_NAME:
            setVoltageLevelName( ( String ) newValue );
            return;
        case SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            setParentAbstractConductingEquipment( ( AbstractConductingEquipment ) newValue );
            return;
        case SclPackage.TERMINAL__REFERS_TO_CONNECTIVITY_NODE:
            setRefersToConnectivityNode( ( ConnectivityNode ) newValue );
            return;
        case SclPackage.TERMINAL__NAME:
            setName( ( String ) newValue );
            return;
        case SclPackage.TERMINAL__LINE_NAME:
            setLineName( ( String ) newValue );
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
        case SclPackage.TERMINAL__BAY_NAME:
            unsetBayName();
            return;
        case SclPackage.TERMINAL__CNODE_NAME:
            unsetCNodeName();
            return;
        case SclPackage.TERMINAL__CONNECTIVITY_NODE:
            unsetConnectivityNode();
            return;
        case SclPackage.TERMINAL__PROCESS_NAME:
            unsetProcessName();
            return;
        case SclPackage.TERMINAL__SUBSTATION_NAME:
            unsetSubstationName();
            return;
        case SclPackage.TERMINAL__VOLTAGE_LEVEL_NAME:
            unsetVoltageLevelName();
            return;
        case SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            setParentAbstractConductingEquipment( ( AbstractConductingEquipment ) null );
            return;
        case SclPackage.TERMINAL__REFERS_TO_CONNECTIVITY_NODE:
            unsetRefersToConnectivityNode();
            return;
        case SclPackage.TERMINAL__NAME:
            unsetName();
            return;
        case SclPackage.TERMINAL__LINE_NAME:
            unsetLineName();
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
        case SclPackage.TERMINAL__BAY_NAME:
            return isSetBayName();
        case SclPackage.TERMINAL__CNODE_NAME:
            return isSetCNodeName();
        case SclPackage.TERMINAL__CONNECTIVITY_NODE:
            return isSetConnectivityNode();
        case SclPackage.TERMINAL__PROCESS_NAME:
            return isSetProcessName();
        case SclPackage.TERMINAL__SUBSTATION_NAME:
            return isSetSubstationName();
        case SclPackage.TERMINAL__VOLTAGE_LEVEL_NAME:
            return isSetVoltageLevelName();
        case SclPackage.TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT:
            return getParentAbstractConductingEquipment() != null;
        case SclPackage.TERMINAL__REFERS_TO_CONNECTIVITY_NODE:
            return isSetRefersToConnectivityNode();
        case SclPackage.TERMINAL__NAME:
            return isSetName();
        case SclPackage.TERMINAL__LINE_NAME:
            return isSetLineName();
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
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (bayName: " );
        if( bayNameESet )
            result.append( bayName );
        else
            result.append( "<unset>" );
        result.append( ", cNodeName: " );
        if( cNodeNameESet )
            result.append( cNodeName );
        else
            result.append( "<unset>" );
        result.append( ", connectivityNode: " );
        if( connectivityNodeESet )
            result.append( connectivityNode );
        else
            result.append( "<unset>" );
        result.append( ", processName: " );
        if( processNameESet )
            result.append( processName );
        else
            result.append( "<unset>" );
        result.append( ", substationName: " );
        if( substationNameESet )
            result.append( substationName );
        else
            result.append( "<unset>" );
        result.append( ", voltageLevelName: " );
        if( voltageLevelNameESet )
            result.append( voltageLevelName );
        else
            result.append( "<unset>" );
        result.append( ", name: " );
        if( nameESet )
            result.append( name );
        else
            result.append( "<unset>" );
        result.append( ", lineName: " );
        if( lineNameESet )
            result.append( lineName );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getLineNumber(), "TerminalImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from Terminal: ";

        if( getSubstationName() != null ) {
            doBuildExplicitLinkWithSubstation( console, messagePrefix );
        }
        else if( getLineName() != null ) {
            doBuildExplicitLinkWithLine( console, messagePrefix );
        }
        else {
            // TODO: processName ?
        }
    }

    private void doBuildExplicitLinkWithSubstation( @NonNull IRiseClipseConsole console, @NonNull String messagePrefix ) {

        // name             The optional relative name of the terminal at this Equipment. The default is the empty string, which means that the name
        //                  of the ConnectivityNode is also the terminal identification.
        // desc             Descriptive text to the terminal
        // connectivityNode The pathname of the connectivity node to which this terminal connects. If the Equipment shall not be connected, then the
        //                  whole Terminal element shall be removed.
        // substationName   The name of the substation containing the connectivityNode
        // voltageLevelName The name of the voltage level containing the connectivityNode
        // bayName          The name of the bay containing the connectivityNode
        // cNodeName        The (relative) name of the connectivityNode within its bay
        // neutralPoint     If true, this terminal connects to a neutral (star) point of all power transformer windings. Default value is false.

        if( ( getCNodeName() == null ) || getCNodeName().isEmpty() ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, "cNodeName is missing" );
            return;
        }
        if( ( getVoltageLevelName() == null ) || getVoltageLevelName().isEmpty() ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, "voltageLevelName is missing" );
            return;
        }
        if( ( getBayName() == null ) || getBayName().isEmpty() ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, "bayName is missing" );
            return;
        }

        // find a Substation with
        //   Substation.name == Terminal.substationName
        List< Substation > res1 = SclUtilities
                .getSCL( this )
                .getSubstation()
                .stream()
                .filter( s -> getSubstationName().equals( s.getName() ) )
                .collect( Collectors.toList() );

        if( res1.size() != 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, (( res1.size() == 0 ) ? "cannot find" : "found several" ),
                             " Substation( name = ", getSubstationName(), " )" );
            return;
        }
        Substation substation = res1.get( 0 );
        console.info( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                         messagePrefix, "found Substation( name = ", getSubstationName(), " ) on line ",
                         substation.getLineNumber() );

        // find a VoltageLevel with
        //   VoltageLevel.name == Terminal.voltageLevelName
        List< VoltageLevel > res2 = substation
                .getVoltageLevel()
                .stream()
                .filter( vl -> getVoltageLevelName().equals( vl.getName() ) )
                .collect( Collectors.toList() );

        if( res2.size() != 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, (( res2.size() == 0 ) ? "cannot find" : "found several" ),
                             " VoltageLevel( name = ", getVoltageLevelName(), " )" );
            return;
        }
        VoltageLevel voltageLevel = res2.get( 0 );
        console.info( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                         messagePrefix, "found VoltageLevel( name = ", getVoltageLevelName(), " ) on line ",
                         voltageLevel.getLineNumber() );

        // find a Bay with
        //   Bay.name == Terminal.bayName
        List< Bay > res3 = voltageLevel
                .getBay()
                .stream()
                .filter( b -> getBayName().equals( b.getName() ) )
                .collect( Collectors.toList() );

        if( res3.size() != 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, (( res3.size() == 0 ) ? "cannot find" : "found several" ),
                             " Bay( name = ", getBayName(), " )" );
            return;
        }
        Bay bay = res3.get( 0 );
        console.info( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                         messagePrefix, "found Bay( name = ", getBayName(), " ) on line ",
                         voltageLevel.getLineNumber() );

        // find a ConnectivityNode with
        //   ConnectivityNode.name == Terminal.bayName
        List< ConnectivityNode > res4 = bay
                .getConnectivityNode()
                .stream()
                .filter( cn -> getCNodeName().equals( cn.getName() ) )
                .collect( Collectors.toList() );

        if( res4.size() != 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, (( res4.size() == 0 ) ? "cannot find" : "found several" ),
                             " ConnectivityNode( name = ", getCNodeName(), " )" );
            return;
        }
        setRefersToConnectivityNode( res4.get( 0 ) );
        console.notice( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                      "Terminal refers to ConnectivityNode( name = ", getCNodeName(), " ) on line ",
                      getRefersToConnectivityNode().getLineNumber() );
    }

    private void doBuildExplicitLinkWithLine( @NonNull IRiseClipseConsole console, @NonNull String messagePrefix ) {
        if( ( getCNodeName() == null ) || getCNodeName().isEmpty() ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, "cNodeName is missing" );
            return;
        }

        // find a Line with
        //   Line.name == Terminal.lineName
        List< Line > res1 = SclUtilities
                .getSCL( this )
                .getLine()
                .stream()
                .filter( l -> getLineName().equals( l.getName() ) )
                .collect( Collectors.toList() );

        if( res1.size() != 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, (( res1.size() == 0 ) ? "cannot find" : "found several" ),
                             " Line( name = ", getLineName(), " )" );
            return;
        }
        Line line = res1.get( 0 );
        console.info( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                         messagePrefix, "found Line( name = ", getLineName(), " ) on line ",
                         line.getLineNumber() );

        // find a ConnectivityNode with
        //   ConnectivityNode.name == Terminal.bayName
        List< ConnectivityNode > res2 = line.getConnectivityNode()
                .stream()
                .filter( cn -> getCNodeName().equals( cn.getName() ) )
                .collect( Collectors.toList() );

        if( res2.size() != 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                             messagePrefix, (( res2.size() == 0 ) ? "cannot find" : "found several" ),
                             " ConnectivityNode( name = ", getCNodeName(), " )" );
            return;
        }
        setRefersToConnectivityNode( res2.get( 0 ) );
        console.notice( EXPLICIT_LINK_CATEGORY, getLineNumber(),
                      "Terminal refers to ConnectivityNode( name = ", getCNodeName(), " )", " on line ",
                      getRefersToConnectivityNode().getLineNumber() );
    }

} //TerminalImpl
