/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
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
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage;
import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LineImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LineImpl#getParentProcess <em>Parent Process</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LineImpl#getParentSCL <em>Parent SCL</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LineImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LineImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LineImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LineImpl#getNomFreq <em>Nom Freq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LineImpl#getNumPhases <em>Num Phases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineImpl extends GeneralEquipmentContainerImpl implements Line {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNode()
     * @generated
     * @ordered
     */
    protected EList<ConnectivityNode> connectivityNode;

    /**
     * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConductingEquipment()
     * @generated
     * @ordered
     */
    protected EList<ConductingEquipment> conductingEquipment;

    /**
     * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltage()
     * @generated
     * @ordered
     */
    protected Voltage voltage;

    /**
     * This is true if the Voltage containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageESet;

    /**
     * The default value of the '{@link #getNomFreq() <em>Nom Freq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNomFreq()
     * @generated
     * @ordered
     */
    protected static final BigDecimal NOM_FREQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNomFreq() <em>Nom Freq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNomFreq()
     * @generated
     * @ordered
     */
    protected BigDecimal nomFreq = NOM_FREQ_EDEFAULT;

    /**
     * This is true if the Nom Freq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nomFreqESet;

    /**
     * The default value of the '{@link #getNumPhases() <em>Num Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumPhases()
     * @generated
     * @ordered
     */
    protected static final Integer NUM_PHASES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNumPhases() <em>Num Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumPhases()
     * @generated
     * @ordered
     */
    protected Integer numPhases = NUM_PHASES_EDEFAULT;

    /**
     * This is true if the Num Phases attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean numPhasesESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLine();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LINE__TYPE, oldType, type, !oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LINE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public fr.centralesupelec.edf.riseclipse.iec61850.scl.Process getParentProcess() {
        if (eContainerFeatureID() != SclPackage.LINE__PARENT_PROCESS) return null;
        return (fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentProcess(fr.centralesupelec.edf.riseclipse.iec61850.scl.Process newParentProcess, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentProcess, SclPackage.LINE__PARENT_PROCESS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentProcess(fr.centralesupelec.edf.riseclipse.iec61850.scl.Process newParentProcess) {
        if (newParentProcess != eInternalContainer() || (eContainerFeatureID() != SclPackage.LINE__PARENT_PROCESS && newParentProcess != null)) {
            if (EcoreUtil.isAncestor(this, newParentProcess))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentProcess != null)
                msgs = ((InternalEObject)newParentProcess).eInverseAdd(this, SclPackage.PROCESS__LINE, fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs);
            msgs = basicSetParentProcess(newParentProcess, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LINE__PARENT_PROCESS, newParentProcess, newParentProcess));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SCL getParentSCL() {
        if (eContainerFeatureID() != SclPackage.LINE__PARENT_SCL) return null;
        return (SCL)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSCL(SCL newParentSCL, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newParentSCL, SclPackage.LINE__PARENT_SCL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSCL(SCL newParentSCL) {
        if (newParentSCL != eInternalContainer() || (eContainerFeatureID() != SclPackage.LINE__PARENT_SCL && newParentSCL != null)) {
            if (EcoreUtil.isAncestor(this, newParentSCL))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newParentSCL != null)
                msgs = ((InternalEObject)newParentSCL).eInverseAdd(this, SclPackage.SCL__LINE, SCL.class, msgs);
            msgs = basicSetParentSCL(newParentSCL, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LINE__PARENT_SCL, newParentSCL, newParentSCL));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConnectivityNode> getConnectivityNode() {
        if (connectivityNode == null) {
            connectivityNode = new EObjectContainmentWithInverseEList.Unsettable<ConnectivityNode>(ConnectivityNode.class, this, SclPackage.LINE__CONNECTIVITY_NODE, SclPackage.CONNECTIVITY_NODE__PARENT_LINE);
        }
        return connectivityNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectivityNode() {
        if (connectivityNode != null) ((InternalEList.Unsettable<?>)connectivityNode).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectivityNode() {
        return connectivityNode != null && ((InternalEList.Unsettable<?>)connectivityNode).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ConductingEquipment> getConductingEquipment() {
        if (conductingEquipment == null) {
            conductingEquipment = new EObjectContainmentWithInverseEList.Unsettable<ConductingEquipment>(ConductingEquipment.class, this, SclPackage.LINE__CONDUCTING_EQUIPMENT, SclPackage.CONDUCTING_EQUIPMENT__PARENT_LINE);
        }
        return conductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConductingEquipment() {
        if (conductingEquipment != null) ((InternalEList.Unsettable<?>)conductingEquipment).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConductingEquipment() {
        return conductingEquipment != null && ((InternalEList.Unsettable<?>)conductingEquipment).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Voltage getVoltage() {
        return voltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVoltage(Voltage newVoltage, NotificationChain msgs) {
        Voltage oldVoltage = voltage;
        voltage = newVoltage;
        boolean oldVoltageESet = voltageESet;
        voltageESet = true;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.LINE__VOLTAGE, oldVoltage, newVoltage, !oldVoltageESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltage(Voltage newVoltage) {
        if (newVoltage != voltage) {
            NotificationChain msgs = null;
            if (voltage != null)
                msgs = ((InternalEObject)voltage).eInverseRemove(this, SclPackage.VOLTAGE__PARENT_LINE, Voltage.class, msgs);
            if (newVoltage != null)
                msgs = ((InternalEObject)newVoltage).eInverseAdd(this, SclPackage.VOLTAGE__PARENT_LINE, Voltage.class, msgs);
            msgs = basicSetVoltage(newVoltage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldVoltageESet = voltageESet;
            voltageESet = true;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LINE__VOLTAGE, newVoltage, newVoltage, !oldVoltageESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVoltage(NotificationChain msgs) {
        Voltage oldVoltage = voltage;
        voltage = null;
        boolean oldVoltageESet = voltageESet;
        voltageESet = false;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.LINE__VOLTAGE, oldVoltage, null, oldVoltageESet);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltage() {
        if (voltage != null) {
            NotificationChain msgs = null;
            msgs = ((InternalEObject)voltage).eInverseRemove(this, SclPackage.VOLTAGE__PARENT_LINE, Voltage.class, msgs);
            msgs = basicUnsetVoltage(msgs);
            if (msgs != null) msgs.dispatch();
        }
        else {
            boolean oldVoltageESet = voltageESet;
            voltageESet = false;
            if (eNotificationRequired())
                eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LINE__VOLTAGE, null, null, oldVoltageESet));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltage() {
        return voltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getNomFreq() {
        return nomFreq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNomFreq(BigDecimal newNomFreq) {
        BigDecimal oldNomFreq = nomFreq;
        nomFreq = newNomFreq;
        boolean oldNomFreqESet = nomFreqESet;
        nomFreqESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LINE__NOM_FREQ, oldNomFreq, nomFreq, !oldNomFreqESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNomFreq() {
        BigDecimal oldNomFreq = nomFreq;
        boolean oldNomFreqESet = nomFreqESet;
        nomFreq = NOM_FREQ_EDEFAULT;
        nomFreqESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LINE__NOM_FREQ, oldNomFreq, NOM_FREQ_EDEFAULT, oldNomFreqESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNomFreq() {
        return nomFreqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNumPhases() {
        return numPhases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNumPhases(Integer newNumPhases) {
        Integer oldNumPhases = numPhases;
        numPhases = newNumPhases;
        boolean oldNumPhasesESet = numPhasesESet;
        numPhasesESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.LINE__NUM_PHASES, oldNumPhases, numPhases, !oldNumPhasesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNumPhases() {
        Integer oldNumPhases = numPhases;
        boolean oldNumPhasesESet = numPhasesESet;
        numPhases = NUM_PHASES_EDEFAULT;
        numPhasesESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.LINE__NUM_PHASES, oldNumPhases, NUM_PHASES_EDEFAULT, oldNumPhasesESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNumPhases() {
        return numPhasesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch (featureID) {
            case SclPackage.LINE__PARENT_PROCESS:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)otherEnd, msgs);
            case SclPackage.LINE__PARENT_SCL:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetParentSCL((SCL)otherEnd, msgs);
            case SclPackage.LINE__CONNECTIVITY_NODE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectivityNode()).basicAdd(otherEnd, msgs);
            case SclPackage.LINE__CONDUCTING_EQUIPMENT:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getConductingEquipment()).basicAdd(otherEnd, msgs);
            case SclPackage.LINE__VOLTAGE:
                if (voltage != null)
                    msgs = ((InternalEObject)voltage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.LINE__VOLTAGE, null, msgs);
                return basicSetVoltage((Voltage)otherEnd, msgs);
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
            case SclPackage.LINE__PARENT_PROCESS:
                return basicSetParentProcess(null, msgs);
            case SclPackage.LINE__PARENT_SCL:
                return basicSetParentSCL(null, msgs);
            case SclPackage.LINE__CONNECTIVITY_NODE:
                return ((InternalEList<?>)getConnectivityNode()).basicRemove(otherEnd, msgs);
            case SclPackage.LINE__CONDUCTING_EQUIPMENT:
                return ((InternalEList<?>)getConductingEquipment()).basicRemove(otherEnd, msgs);
            case SclPackage.LINE__VOLTAGE:
                return basicUnsetVoltage(msgs);
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
            case SclPackage.LINE__PARENT_PROCESS:
                return eInternalContainer().eInverseRemove(this, SclPackage.PROCESS__LINE, fr.centralesupelec.edf.riseclipse.iec61850.scl.Process.class, msgs);
            case SclPackage.LINE__PARENT_SCL:
                return eInternalContainer().eInverseRemove(this, SclPackage.SCL__LINE, SCL.class, msgs);
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
            case SclPackage.LINE__TYPE:
                return getType();
            case SclPackage.LINE__PARENT_PROCESS:
                return getParentProcess();
            case SclPackage.LINE__PARENT_SCL:
                return getParentSCL();
            case SclPackage.LINE__CONNECTIVITY_NODE:
                return getConnectivityNode();
            case SclPackage.LINE__CONDUCTING_EQUIPMENT:
                return getConductingEquipment();
            case SclPackage.LINE__VOLTAGE:
                return getVoltage();
            case SclPackage.LINE__NOM_FREQ:
                return getNomFreq();
            case SclPackage.LINE__NUM_PHASES:
                return getNumPhases();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch (featureID) {
            case SclPackage.LINE__TYPE:
                setType((String)newValue);
                return;
            case SclPackage.LINE__PARENT_PROCESS:
                setParentProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)newValue);
                return;
            case SclPackage.LINE__PARENT_SCL:
                setParentSCL((SCL)newValue);
                return;
            case SclPackage.LINE__CONNECTIVITY_NODE:
                getConnectivityNode().clear();
                getConnectivityNode().addAll((Collection<? extends ConnectivityNode>)newValue);
                return;
            case SclPackage.LINE__CONDUCTING_EQUIPMENT:
                getConductingEquipment().clear();
                getConductingEquipment().addAll((Collection<? extends ConductingEquipment>)newValue);
                return;
            case SclPackage.LINE__VOLTAGE:
                setVoltage((Voltage)newValue);
                return;
            case SclPackage.LINE__NOM_FREQ:
                setNomFreq((BigDecimal)newValue);
                return;
            case SclPackage.LINE__NUM_PHASES:
                setNumPhases((Integer)newValue);
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
            case SclPackage.LINE__TYPE:
                unsetType();
                return;
            case SclPackage.LINE__PARENT_PROCESS:
                setParentProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)null);
                return;
            case SclPackage.LINE__PARENT_SCL:
                setParentSCL((SCL)null);
                return;
            case SclPackage.LINE__CONNECTIVITY_NODE:
                unsetConnectivityNode();
                return;
            case SclPackage.LINE__CONDUCTING_EQUIPMENT:
                unsetConductingEquipment();
                return;
            case SclPackage.LINE__VOLTAGE:
                unsetVoltage();
                return;
            case SclPackage.LINE__NOM_FREQ:
                unsetNomFreq();
                return;
            case SclPackage.LINE__NUM_PHASES:
                unsetNumPhases();
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
            case SclPackage.LINE__TYPE:
                return isSetType();
            case SclPackage.LINE__PARENT_PROCESS:
                return getParentProcess() != null;
            case SclPackage.LINE__PARENT_SCL:
                return getParentSCL() != null;
            case SclPackage.LINE__CONNECTIVITY_NODE:
                return isSetConnectivityNode();
            case SclPackage.LINE__CONDUCTING_EQUIPMENT:
                return isSetConductingEquipment();
            case SclPackage.LINE__VOLTAGE:
                return isSetVoltage();
            case SclPackage.LINE__NOM_FREQ:
                return isSetNomFreq();
            case SclPackage.LINE__NUM_PHASES:
                return isSetNumPhases();
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

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(", nomFreq: ");
        if (nomFreqESet) result.append(nomFreq); else result.append("<unset>");
        result.append(", numPhases: ");
        if (numPhasesESet) result.append(numPhases); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //LineImpl
