/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.List;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.util.SclSwitch;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getAbstractConductingEquipment <em>Abstract Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getCNode <em>CNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl#getName <em>Name</em>}</li>
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
     * The cached value of the '{@link #getBay() <em>Bay</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBay()
     * @generated
     * @ordered
     */
    protected Bay bay;

    /**
     * This is true if the Bay reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bayESet;

    /**
     * The cached value of the '{@link #getCNode() <em>CNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCNode()
     * @generated
     * @ordered
     */
    protected ConnectivityNode cNode;

    /**
     * This is true if the CNode reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cNodeESet;

    /**
     * The cached value of the '{@link #getSubstation() <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubstation()
     * @generated
     * @ordered
     */
    protected Substation substation;

    /**
     * This is true if the Substation reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean substationESet;

    /**
     * The cached value of the '{@link #getVoltageLevel() <em>Voltage Level</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageLevel()
     * @generated
     * @ordered
     */
    protected VoltageLevel voltageLevel;

    /**
     * This is true if the Voltage Level reference has been set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageLevelESet;

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
     * @generated NOT
     */
    public String getBayName() {
        if( bay != null )
            return bay.getName();
        else
            return bayName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBayName( String newBayName ) {
        String oldBayName = bayName;
        bayName = newBayName;
        boolean oldBayNameESet = bayNameESet;
        bayNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__BAY_NAME, oldBayName, bayName, !oldBayNameESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBayName() {
        String oldBayName = bayName;
        boolean oldBayNameESet = bayNameESet;
        bayName = BAY_NAME_EDEFAULT;
        bayNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__BAY_NAME, oldBayName, BAY_NAME_EDEFAULT, oldBayNameESet));
    }

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetBayName() {
        return isSetBay();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getCNodeName() {
        if( cNode != null )
            return cNode.getName();
        else
            return cNodeName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCNodeName( String newCNodeName ) {
        String oldCNodeName = cNodeName;
        cNodeName = newCNodeName;
        boolean oldCNodeNameESet = cNodeNameESet;
        cNodeNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__CNODE_NAME, oldCNodeName, cNodeName, !oldCNodeNameESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCNodeName() {
        String oldCNodeName = cNodeName;
        boolean oldCNodeNameESet = cNodeNameESet;
        cNodeName = CNODE_NAME_EDEFAULT;
        cNodeNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__CNODE_NAME, oldCNodeName, CNODE_NAME_EDEFAULT, oldCNodeNameESet));
    }

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetCNodeName() {
        return isSetCNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getConnectivityNode() {
        if( cNode != null )
            return cNode.getPathName();
        else
            return connectivityNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectivityNode( String newConnectivityNode ) {
        String oldConnectivityNode = connectivityNode;
        connectivityNode = newConnectivityNode;
        boolean oldConnectivityNodeESet = connectivityNodeESet;
        connectivityNodeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__CONNECTIVITY_NODE, oldConnectivityNode, connectivityNode, !oldConnectivityNodeESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConnectivityNode() {
        String oldConnectivityNode = connectivityNode;
        boolean oldConnectivityNodeESet = connectivityNodeESet;
        connectivityNode = CONNECTIVITY_NODE_EDEFAULT;
        connectivityNodeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__CONNECTIVITY_NODE, oldConnectivityNode, CONNECTIVITY_NODE_EDEFAULT, oldConnectivityNodeESet));
    }

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetConnectivityNode() {
        return isSetCNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessName( String newProcessName ) {
        String oldProcessName = processName;
        processName = newProcessName;
        boolean oldProcessNameESet = processNameESet;
        processNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__PROCESS_NAME, oldProcessName, processName, !oldProcessNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetProcessName() {
        String oldProcessName = processName;
        boolean oldProcessNameESet = processNameESet;
        processName = PROCESS_NAME_EDEFAULT;
        processNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__PROCESS_NAME, oldProcessName, PROCESS_NAME_EDEFAULT, oldProcessNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetProcessName() {
        return processNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getSubstationName() {
        if( substation != null )
            return substation.getName();
        else
            return substationName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubstationName( String newSubstationName ) {
        String oldSubstationName = substationName;
        substationName = newSubstationName;
        boolean oldSubstationNameESet = substationNameESet;
        substationNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__SUBSTATION_NAME, oldSubstationName, substationName, !oldSubstationNameESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSubstationName() {
        String oldSubstationName = substationName;
        boolean oldSubstationNameESet = substationNameESet;
        substationName = SUBSTATION_NAME_EDEFAULT;
        substationNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__SUBSTATION_NAME, oldSubstationName, SUBSTATION_NAME_EDEFAULT, oldSubstationNameESet));
    }

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetSubstationName() {
        return isSetSubstation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getVoltageLevelName() {
        if( voltageLevel != null )
            return voltageLevel.getName();
        else
            return voltageLevelName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVoltageLevelName( String newVoltageLevelName ) {
        String oldVoltageLevelName = voltageLevelName;
        voltageLevelName = newVoltageLevelName;
        boolean oldVoltageLevelNameESet = voltageLevelNameESet;
        voltageLevelNameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__VOLTAGE_LEVEL_NAME, oldVoltageLevelName, voltageLevelName, !oldVoltageLevelNameESet));
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVoltageLevelName() {
        String oldVoltageLevelName = voltageLevelName;
        boolean oldVoltageLevelNameESet = voltageLevelNameESet;
        voltageLevelName = VOLTAGE_LEVEL_NAME_EDEFAULT;
        voltageLevelNameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__VOLTAGE_LEVEL_NAME, oldVoltageLevelName, VOLTAGE_LEVEL_NAME_EDEFAULT, oldVoltageLevelNameESet));
    }

    /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated NOT
    */
    public boolean isSetVoltageLevelName() {
        return isSetVoltageLevel();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractConductingEquipment getAbstractConductingEquipment() {
        if (eContainerFeatureID() != SclPackage.TERMINAL__ABSTRACT_CONDUCTING_EQUIPMENT) return null;
        return (AbstractConductingEquipment)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAbstractConductingEquipment(
            AbstractConductingEquipment newAbstractConductingEquipment, NotificationChain msgs ) {
        msgs = eBasicSetContainer((InternalEObject)newAbstractConductingEquipment, SclPackage.TERMINAL__ABSTRACT_CONDUCTING_EQUIPMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbstractConductingEquipment( AbstractConductingEquipment newAbstractConductingEquipment ) {
        if (newAbstractConductingEquipment != eInternalContainer() || (eContainerFeatureID() != SclPackage.TERMINAL__ABSTRACT_CONDUCTING_EQUIPMENT && newAbstractConductingEquipment != null)) {
            if (EcoreUtil.isAncestor(this, newAbstractConductingEquipment))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newAbstractConductingEquipment != null)
                msgs = ((InternalEObject)newAbstractConductingEquipment).eInverseAdd(this, SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL, AbstractConductingEquipment.class, msgs);
            msgs = basicSetAbstractConductingEquipment(newAbstractConductingEquipment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__ABSTRACT_CONDUCTING_EQUIPMENT, newAbstractConductingEquipment, newAbstractConductingEquipment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Bay getBay() {
        return bay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBay( Bay newBay, NotificationChain msgs ) {
        Bay oldBay = bay;
        bay = newBay;
        boolean oldBayESet = bayESet;
        bayESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__BAY, oldBay, newBay, !oldBayESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBay( Bay newBay ) {
        if (newBay != bay) {
            NotificationChain msgs = null;
            if (bay != null)
                msgs = ((InternalEObject)bay).eInverseRemove(this, SclPackage.BAY__TERMINAL, Bay.class, msgs);
            if (newBay != null)
                msgs = ((InternalEObject)newBay).eInverseAdd(this, SclPackage.BAY__TERMINAL, Bay.class, msgs);
            msgs = basicSetBay(newBay, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldBayESet = bayESet;
            bayESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__BAY, newBay, newBay, !oldBayESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBay( NotificationChain msgs ) {
        Bay oldBay = bay;
        bay = null;
        boolean oldBayESet = bayESet;
        bayESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__BAY, oldBay, null, oldBayESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBay() {
        if (bay != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)bay).eInverseRemove(this, SclPackage.BAY__TERMINAL, Bay.class, msgs);
            msgs = basicUnsetBay(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldBayESet = bayESet;
            bayESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__BAY, null, null, oldBayESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBay() {
        return bayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectivityNode getCNode() {
        return cNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCNode( ConnectivityNode newCNode, NotificationChain msgs ) {
        ConnectivityNode oldCNode = cNode;
        cNode = newCNode;
        boolean oldCNodeESet = cNodeESet;
        cNodeESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__CNODE, oldCNode, newCNode, !oldCNodeESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCNode( ConnectivityNode newCNode ) {
        if (newCNode != cNode) {
            NotificationChain msgs = null;
            if (cNode != null)
                msgs = ((InternalEObject)cNode).eInverseRemove(this, SclPackage.CONNECTIVITY_NODE__TERMINAL, ConnectivityNode.class, msgs);
            if (newCNode != null)
                msgs = ((InternalEObject)newCNode).eInverseAdd(this, SclPackage.CONNECTIVITY_NODE__TERMINAL, ConnectivityNode.class, msgs);
            msgs = basicSetCNode(newCNode, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldCNodeESet = cNodeESet;
            cNodeESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__CNODE, newCNode, newCNode, !oldCNodeESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCNode( NotificationChain msgs ) {
        ConnectivityNode oldCNode = cNode;
        cNode = null;
        boolean oldCNodeESet = cNodeESet;
        cNodeESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__CNODE, oldCNode, null, oldCNodeESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetCNode() {
        if (cNode != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)cNode).eInverseRemove(this, SclPackage.CONNECTIVITY_NODE__TERMINAL, ConnectivityNode.class, msgs);
            msgs = basicUnsetCNode(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldCNodeESet = cNodeESet;
            cNodeESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__CNODE, null, null, oldCNodeESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetCNode() {
        return cNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Substation getSubstation() {
        return substation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubstation( Substation newSubstation, NotificationChain msgs ) {
        Substation oldSubstation = substation;
        substation = newSubstation;
        boolean oldSubstationESet = substationESet;
        substationESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__SUBSTATION, oldSubstation, newSubstation, !oldSubstationESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubstation( Substation newSubstation ) {
        if (newSubstation != substation) {
            NotificationChain msgs = null;
            if (substation != null)
                msgs = ((InternalEObject)substation).eInverseRemove(this, SclPackage.SUBSTATION__TERMINAL, Substation.class, msgs);
            if (newSubstation != null)
                msgs = ((InternalEObject)newSubstation).eInverseAdd(this, SclPackage.SUBSTATION__TERMINAL, Substation.class, msgs);
            msgs = basicSetSubstation(newSubstation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldSubstationESet = substationESet;
            substationESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__SUBSTATION, newSubstation, newSubstation, !oldSubstationESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSubstation( NotificationChain msgs ) {
        Substation oldSubstation = substation;
        substation = null;
        boolean oldSubstationESet = substationESet;
        substationESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__SUBSTATION, oldSubstation, null, oldSubstationESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSubstation() {
        if (substation != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)substation).eInverseRemove(this, SclPackage.SUBSTATION__TERMINAL, Substation.class, msgs);
            msgs = basicUnsetSubstation(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldSubstationESet = substationESet;
            substationESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__SUBSTATION, null, null, oldSubstationESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSubstation() {
        return substationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VoltageLevel getVoltageLevel() {
        return voltageLevel;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVoltageLevel( VoltageLevel newVoltageLevel, NotificationChain msgs ) {
        VoltageLevel oldVoltageLevel = voltageLevel;
        voltageLevel = newVoltageLevel;
        boolean oldVoltageLevelESet = voltageLevelESet;
        voltageLevelESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__VOLTAGE_LEVEL, oldVoltageLevel, newVoltageLevel, !oldVoltageLevelESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void setVoltageLevel( VoltageLevel newVoltageLevel ) {
        if (newVoltageLevel != voltageLevel) {
            NotificationChain msgs = null;
            if (voltageLevel != null)
                msgs = ((InternalEObject)voltageLevel).eInverseRemove(this, SclPackage.VOLTAGE_LEVEL__TERMINAL, VoltageLevel.class, msgs);
            if (newVoltageLevel != null)
                msgs = ((InternalEObject)newVoltageLevel).eInverseAdd(this, SclPackage.VOLTAGE_LEVEL__TERMINAL, VoltageLevel.class, msgs);
            msgs = basicSetVoltageLevel(newVoltageLevel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldVoltageLevelESet = voltageLevelESet;
            voltageLevelESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__VOLTAGE_LEVEL, newVoltageLevel, newVoltageLevel, !oldVoltageLevelESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVoltageLevel( NotificationChain msgs ) {
        VoltageLevel oldVoltageLevel = voltageLevel;
        voltageLevel = null;
        boolean oldVoltageLevelESet = voltageLevelESet;
        voltageLevelESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__VOLTAGE_LEVEL, oldVoltageLevel, null, oldVoltageLevelESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVoltageLevel() {
        if (voltageLevel != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)voltageLevel).eInverseRemove(this, SclPackage.VOLTAGE_LEVEL__TERMINAL, VoltageLevel.class, msgs);
            msgs = basicUnsetVoltageLevel(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldVoltageLevelESet = voltageLevelESet;
            voltageLevelESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__VOLTAGE_LEVEL, null, null, oldVoltageLevelESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVoltageLevel() {
        return voltageLevelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TERMINAL__NAME, oldName, name, !oldNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TERMINAL__NAME, oldName, NAME_EDEFAULT, oldNameESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.TERMINAL__ABSTRACT_CONDUCTING_EQUIPMENT:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetAbstractConductingEquipment((AbstractConductingEquipment)otherEnd, msgs);
            case SclPackage.TERMINAL__BAY:
                if (bay != null)
                    msgs = ((InternalEObject)bay).eInverseRemove(this, SclPackage.BAY__TERMINAL, Bay.class, msgs);
                return basicSetBay((Bay)otherEnd, msgs);
            case SclPackage.TERMINAL__CNODE:
                if (cNode != null)
                    msgs = ((InternalEObject)cNode).eInverseRemove(this, SclPackage.CONNECTIVITY_NODE__TERMINAL, ConnectivityNode.class, msgs);
                return basicSetCNode((ConnectivityNode)otherEnd, msgs);
            case SclPackage.TERMINAL__SUBSTATION:
                if (substation != null)
                    msgs = ((InternalEObject)substation).eInverseRemove(this, SclPackage.SUBSTATION__TERMINAL, Substation.class, msgs);
                return basicSetSubstation((Substation)otherEnd, msgs);
            case SclPackage.TERMINAL__VOLTAGE_LEVEL:
                if (voltageLevel != null)
                    msgs = ((InternalEObject)voltageLevel).eInverseRemove(this, SclPackage.VOLTAGE_LEVEL__TERMINAL, VoltageLevel.class, msgs);
                return basicSetVoltageLevel((VoltageLevel)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.TERMINAL__ABSTRACT_CONDUCTING_EQUIPMENT:
                return basicSetAbstractConductingEquipment(null, msgs);
            case SclPackage.TERMINAL__BAY:
                return basicUnsetBay(msgs);
            case SclPackage.TERMINAL__CNODE:
                return basicUnsetCNode(msgs);
            case SclPackage.TERMINAL__SUBSTATION:
                return basicUnsetSubstation(msgs);
            case SclPackage.TERMINAL__VOLTAGE_LEVEL:
                return basicUnsetVoltageLevel(msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch (eContainerFeatureID()) {
            case SclPackage.TERMINAL__ABSTRACT_CONDUCTING_EQUIPMENT:
                return eInternalContainer().eInverseRemove(this, SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL, AbstractConductingEquipment.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch (featureID) {
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
            case SclPackage.TERMINAL__ABSTRACT_CONDUCTING_EQUIPMENT:
                return getAbstractConductingEquipment();
            case SclPackage.TERMINAL__BAY:
                return getBay();
            case SclPackage.TERMINAL__CNODE:
                return getCNode();
            case SclPackage.TERMINAL__SUBSTATION:
                return getSubstation();
            case SclPackage.TERMINAL__VOLTAGE_LEVEL:
                return getVoltageLevel();
            case SclPackage.TERMINAL__NAME:
                return getName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
            case SclPackage.TERMINAL__BAY_NAME:
                setBayName((String)newValue);
                return;
            case SclPackage.TERMINAL__CNODE_NAME:
                setCNodeName((String)newValue);
                return;
            case SclPackage.TERMINAL__CONNECTIVITY_NODE:
                setConnectivityNode((String)newValue);
                return;
            case SclPackage.TERMINAL__PROCESS_NAME:
                setProcessName((String)newValue);
                return;
            case SclPackage.TERMINAL__SUBSTATION_NAME:
                setSubstationName((String)newValue);
                return;
            case SclPackage.TERMINAL__VOLTAGE_LEVEL_NAME:
                setVoltageLevelName((String)newValue);
                return;
            case SclPackage.TERMINAL__ABSTRACT_CONDUCTING_EQUIPMENT:
                setAbstractConductingEquipment((AbstractConductingEquipment)newValue);
                return;
            case SclPackage.TERMINAL__BAY:
                setBay((Bay)newValue);
                return;
            case SclPackage.TERMINAL__CNODE:
                setCNode((ConnectivityNode)newValue);
                return;
            case SclPackage.TERMINAL__SUBSTATION:
                setSubstation((Substation)newValue);
                return;
            case SclPackage.TERMINAL__VOLTAGE_LEVEL:
                setVoltageLevel((VoltageLevel)newValue);
                return;
            case SclPackage.TERMINAL__NAME:
                setName((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch (featureID) {
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
            case SclPackage.TERMINAL__ABSTRACT_CONDUCTING_EQUIPMENT:
                setAbstractConductingEquipment((AbstractConductingEquipment)null);
                return;
            case SclPackage.TERMINAL__BAY:
                unsetBay();
                return;
            case SclPackage.TERMINAL__CNODE:
                unsetCNode();
                return;
            case SclPackage.TERMINAL__SUBSTATION:
                unsetSubstation();
                return;
            case SclPackage.TERMINAL__VOLTAGE_LEVEL:
                unsetVoltageLevel();
                return;
            case SclPackage.TERMINAL__NAME:
                unsetName();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch (featureID) {
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
            case SclPackage.TERMINAL__ABSTRACT_CONDUCTING_EQUIPMENT:
                return getAbstractConductingEquipment() != null;
            case SclPackage.TERMINAL__BAY:
                return isSetBay();
            case SclPackage.TERMINAL__CNODE:
                return isSetCNode();
            case SclPackage.TERMINAL__SUBSTATION:
                return isSetSubstation();
            case SclPackage.TERMINAL__VOLTAGE_LEVEL:
                return isSetVoltageLevel();
            case SclPackage.TERMINAL__NAME:
                return isSetName();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (bayName: ");
        if (bayNameESet) result.append(bayName); else result.append("<unset>");
        result.append(", cNodeName: ");
        if (cNodeNameESet) result.append(cNodeName); else result.append("<unset>");
        result.append(", connectivityNode: ");
        if (connectivityNodeESet) result.append(connectivityNode); else result.append("<unset>");
        result.append(", processName: ");
        if (processNameESet) result.append(processName); else result.append("<unset>");
        result.append(", substationName: ");
        if (substationNameESet) result.append(substationName); else result.append("<unset>");
        result.append(", voltageLevelName: ");
        if (voltageLevelNameESet) result.append(voltageLevelName); else result.append("<unset>");
        result.append(", name: ");
        if (nameESet) result.append(name); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    @Override
    protected void doResolveLinks() {
        // see Issue #13
        super.doResolveLinks();
        
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

        // Resolve only if attribute has been read
        // Cannot use isSetSubstationName() Here
        if( !substationNameESet ) return;

        // find a Substation with
        //   Substation.name == Terminal.substationName
        SclSwitch< Boolean > s1 = new SclSwitch< Boolean >() {

            @Override
            public Boolean caseSubstation( Substation object ) {
                return object.getName().equals( getSubstationName() );
            }

            @Override
            public Boolean defaultCase( EObject object ) {
                return false;
            }

        };

        List< Substation > res1 = shallowSearchObjects( getSCLRoot().getSubstation(), s1 );
        String mess = "Substation( name = " + getSubstationName() + " ) for Terminal on line " + getLineNumber()
                + " ( name = " + getName() + " )";
        if( res1.isEmpty() ) {
            AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess );
        }
        else if( res1.size() > 1 ) {
            AbstractRiseClipseConsole.getConsole().error( "found several " + mess );
        }
        else {
            //AbstractRiseClipseConsole.getConsole().info( "found " + mess );
            setSubstation( res1.get( 0 ) );
        }

        if( substation != null ) {
            // Resolve only if attribute has been read
            // Cannot use isSetVoltageLevelName() Here
            if( !voltageLevelNameESet ) return;

            // find a VoltageLevel with
            //   VoltageLevel.name == Terminal.voltageLevelName
            SclSwitch< Boolean > s2 = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseVoltageLevel( VoltageLevel object ) {
                    return object.getName().equals( getVoltageLevelName() );
                }

                @Override
                public Boolean defaultCase( EObject object ) {
                    return false;
                }

            };

            List< VoltageLevel > res2 = shallowSearchObjects( substation.getVoltageLevel(), s2 );
            String mess2 = "VoltageLevel( name = " + getVoltageLevelName() + " ) for Terminal on line "
                    + getLineNumber() + " ( name = " + getName() + " )";
            if( res2.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess2 );
            }
            else if( res2.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess2 );
            }
            else {
                //AbstractRiseClipseConsole.getConsole().info( "found " + mess2 );
                setVoltageLevel( res2.get( 0 ) );
            }
        }

        if( voltageLevel != null ) {
            // Resolve only if attribute has been read
            // Cannot use isSetBayName() Here
            if( !bayNameESet ) return;

            // find a Bay with
            //   Bay.name == Terminal.bayName
            SclSwitch< Boolean > s3 = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseBay( Bay object ) {
                    return object.getName().equals( getBayName() );
                }

                @Override
                public Boolean defaultCase( EObject object ) {
                    return false;
                }

            };

            List< Bay > res3 = shallowSearchObjects( voltageLevel.getBay(), s3 );
            String mess3 = "Bay( name = " + getBayName() + " ) for Terminal on line " + getLineNumber() + " ( name = "
                    + getName() + " )";
            if( res3.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess3 );
            }
            else if( res3.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess3 );
            }
            else {
                //AbstractRiseClipseConsole.getConsole().info( "found " + mess3 );
                setBay( res3.get( 0 ) );
            }
        }

        if( bay != null ) {
            // Resolve only if attribute has been read
            // Cannot use isSetCNodeName() Here
            if( !cNodeNameESet ) return;

            // find a ConnectivityNode with
            //   ConnectivityNode.name == Terminal.bayName
            SclSwitch< Boolean > s4 = new SclSwitch< Boolean >() {

                @Override
                public Boolean caseConnectivityNode( ConnectivityNode object ) {
                    return object.getName().equals( getCNodeName() );
                }

                @Override
                public Boolean defaultCase( EObject object ) {
                    return false;
                }

            };

            List< ConnectivityNode > res4 = shallowSearchObjects( bay.getConnectivityNode(), s4 );
            String mess4 = "ConnectivityNode( name = " + getCNodeName() + " ) for Terminal on line " + getLineNumber()
                    + " ( name = " + getName() + " )";
            if( res4.isEmpty() ) {
                AbstractRiseClipseConsole.getConsole().error( "cannot find " + mess4 );
            }
            else if( res4.size() > 1 ) {
                AbstractRiseClipseConsole.getConsole().error( "found several " + mess4 );
            }
            else {
                //AbstractRiseClipseConsole.getConsole().info( "found " + mess4 );
                setCNode( res4.get( 0 ) );
            }
        }
    }

} //TerminalImpl
