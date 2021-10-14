/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getLine <em>Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getParentSCL <em>Parent SCL</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubProcesses <em>Sub Processes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getParentProcess <em>Parent Process</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends GeneralEquipmentContainer {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProcess_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getType <em>Type</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Line</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getParentProcess <em>Parent Process</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line</em>' containment reference list.
     * @see #isSetLine()
     * @see #unsetLine()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProcess_Line()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getParentProcess
     * @model opposite="ParentProcess" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< Line > getLine();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getLine <em>Line</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLine()
     * @see #getLine()
     * @generated
     */
    void unsetLine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getLine <em>Line</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Line</em>' containment reference list is set.
     * @see #unsetLine()
     * @see #getLine()
     * @generated
     */
    boolean isSetLine();

    /**
     * Returns the value of the '<em><b>Parent SCL</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SCL</em>' container reference.
     * @see #setParentSCL(SCL)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProcess_ParentSCL()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getProcess
     * @model opposite="Process" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SCL getParentSCL();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getParentSCL <em>Parent SCL</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SCL</em>' container reference.
     * @see #getParentSCL()
     * @generated
     */
    void setParentSCL( SCL value );

    /**
     * Returns the value of the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentProcess <em>Parent Process</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conducting Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conducting Equipment</em>' containment reference list.
     * @see #isSetConductingEquipment()
     * @see #unsetConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProcess_ConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentProcess
     * @model opposite="ParentProcess" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< ConductingEquipment > getConductingEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    void unsetConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conducting Equipment</em>' containment reference list is set.
     * @see #unsetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    boolean isSetConductingEquipment();

    /**
     * Returns the value of the '<em><b>Substation</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getParentProcess <em>Parent Process</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Substation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Substation</em>' containment reference list.
     * @see #isSetSubstation()
     * @see #unsetSubstation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProcess_Substation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getParentProcess
     * @model opposite="ParentProcess" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< Substation > getSubstation();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubstation <em>Substation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubstation()
     * @see #getSubstation()
     * @generated
     */
    void unsetSubstation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubstation <em>Substation</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Substation</em>' containment reference list is set.
     * @see #unsetSubstation()
     * @see #getSubstation()
     * @generated
     */
    boolean isSetSubstation();

    /**
     * Returns the value of the '<em><b>Sub Processes</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getParentProcess <em>Parent Process</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Processes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Processes</em>' containment reference list.
     * @see #isSetSubProcesses()
     * @see #unsetSubProcesses()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProcess_SubProcesses()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getParentProcess
     * @model opposite="ParentProcess" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< Process > getSubProcesses();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubProcesses <em>Sub Processes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubProcesses()
     * @see #getSubProcesses()
     * @generated
     */
    void unsetSubProcesses();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubProcesses <em>Sub Processes</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Processes</em>' containment reference list is set.
     * @see #unsetSubProcesses()
     * @see #getSubProcesses()
     * @generated
     */
    boolean isSetSubProcesses();

    /**
     * Returns the value of the '<em><b>Parent Process</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubProcesses <em>Sub Processes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Process</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Process</em>' container reference.
     * @see #setParentProcess(Process)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProcess_ParentProcess()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubProcesses
     * @model opposite="SubProcesses" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Process getParentProcess();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getParentProcess <em>Parent Process</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Process</em>' container reference.
     * @see #getParentProcess()
     * @generated
     */
    void setParentProcess( Process value );

} // Process
