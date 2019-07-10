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
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getParentProcess <em>Parent Process</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getParentSCL <em>Parent SCL</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNomFreq <em>Nom Freq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNumPhases <em>Num Phases</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends GeneralEquipmentContainer {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLine_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Parent Process</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getLine <em>Line</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Process</em>' container reference.
     * @see #setParentProcess(fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLine_ParentProcess()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getLine
     * @model opposite="Line" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    fr.centralesupelec.edf.riseclipse.iec61850.scl.Process getParentProcess();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getParentProcess <em>Parent Process</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Process</em>' container reference.
     * @see #getParentProcess()
     * @generated
     */
    void setParentProcess(fr.centralesupelec.edf.riseclipse.iec61850.scl.Process value);

    /**
     * Returns the value of the '<em><b>Parent SCL</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getLine <em>Line</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SCL</em>' container reference.
     * @see #setParentSCL(SCL)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLine_ParentSCL()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getLine
     * @model opposite="Line" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SCL getParentSCL();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getParentSCL <em>Parent SCL</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SCL</em>' container reference.
     * @see #getParentSCL()
     * @generated
     */
    void setParentSCL(SCL value);

    /**
     * Returns the value of the '<em><b>Connectivity Node</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentLine <em>Parent Line</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectivity Node</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectivity Node</em>' containment reference list.
     * @see #isSetConnectivityNode()
     * @see #unsetConnectivityNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLine_ConnectivityNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentLine
     * @model opposite="ParentLine" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<ConnectivityNode> getConnectivityNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConnectivityNode <em>Connectivity Node</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNode()
     * @see #getConnectivityNode()
     * @generated
     */
    void unsetConnectivityNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConnectivityNode <em>Connectivity Node</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Node</em>' containment reference list is set.
     * @see #unsetConnectivityNode()
     * @see #getConnectivityNode()
     * @generated
     */
    boolean isSetConnectivityNode();

    /**
     * Returns the value of the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentLine <em>Parent Line</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conducting Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conducting Equipment</em>' containment reference list.
     * @see #isSetConductingEquipment()
     * @see #unsetConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLine_ConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentLine
     * @model opposite="ParentLine" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<ConductingEquipment> getConductingEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    void unsetConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conducting Equipment</em>' containment reference list is set.
     * @see #unsetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    boolean isSetConductingEquipment();

    /**
     * Returns the value of the '<em><b>Voltage</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentLine <em>Parent Line</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage</em>' containment reference.
     * @see #isSetVoltage()
     * @see #unsetVoltage()
     * @see #setVoltage(Voltage)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLine_Voltage()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentLine
     * @model opposite="ParentLine" containment="true" unsettable="true"
     * @generated
     */
    Voltage getVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getVoltage <em>Voltage</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage</em>' containment reference.
     * @see #isSetVoltage()
     * @see #unsetVoltage()
     * @see #getVoltage()
     * @generated
     */
    void setVoltage(Voltage value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getVoltage <em>Voltage</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltage()
     * @see #getVoltage()
     * @see #setVoltage(Voltage)
     * @generated
     */
    void unsetVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getVoltage <em>Voltage</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage</em>' containment reference is set.
     * @see #unsetVoltage()
     * @see #getVoltage()
     * @see #setVoltage(Voltage)
     * @generated
     */
    boolean isSetVoltage();

    /**
     * Returns the value of the '<em><b>Nom Freq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nom Freq</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nom Freq</em>' attribute.
     * @see #isSetNomFreq()
     * @see #unsetNomFreq()
     * @see #setNomFreq(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLine_NomFreq()
     * @model unsettable="true"
     * @generated
     */
    BigDecimal getNomFreq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNomFreq <em>Nom Freq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nom Freq</em>' attribute.
     * @see #isSetNomFreq()
     * @see #unsetNomFreq()
     * @see #getNomFreq()
     * @generated
     */
    void setNomFreq(BigDecimal value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNomFreq <em>Nom Freq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNomFreq()
     * @see #getNomFreq()
     * @see #setNomFreq(BigDecimal)
     * @generated
     */
    void unsetNomFreq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNomFreq <em>Nom Freq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nom Freq</em>' attribute is set.
     * @see #unsetNomFreq()
     * @see #getNomFreq()
     * @see #setNomFreq(BigDecimal)
     * @generated
     */
    boolean isSetNomFreq();

    /**
     * Returns the value of the '<em><b>Num Phases</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Num Phases</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Num Phases</em>' attribute.
     * @see #isSetNumPhases()
     * @see #unsetNumPhases()
     * @see #setNumPhases(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLine_NumPhases()
     * @model unsettable="true"
     * @generated
     */
    Integer getNumPhases();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNumPhases <em>Num Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Num Phases</em>' attribute.
     * @see #isSetNumPhases()
     * @see #unsetNumPhases()
     * @see #getNumPhases()
     * @generated
     */
    void setNumPhases(Integer value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNumPhases <em>Num Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNumPhases()
     * @see #getNumPhases()
     * @see #setNumPhases(Integer)
     * @generated
     */
    void unsetNumPhases();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNumPhases <em>Num Phases</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Num Phases</em>' attribute is set.
     * @see #unsetNumPhases()
     * @see #getNumPhases()
     * @see #setNumPhases(Integer)
     * @generated
     */
    boolean isSetNumPhases();

} // Line
