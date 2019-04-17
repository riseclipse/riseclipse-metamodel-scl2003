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
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getParentVoltageLevel <em>Parent Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBay()
 * @model
 * @generated
 */
public interface Bay extends EquipmentContainer {
    /**
     * Returns the value of the '<em><b>Parent Voltage Level</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getBay <em>Bay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Voltage Level</em>' container reference.
     * @see #setParentVoltageLevel(VoltageLevel)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBay_ParentVoltageLevel()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getBay
     * @model opposite="Bay" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    VoltageLevel getParentVoltageLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getParentVoltageLevel <em>Parent Voltage Level</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Voltage Level</em>' container reference.
     * @see #getParentVoltageLevel()
     * @generated
     */
    void setParentVoltageLevel(VoltageLevel value);

    /**
     * Returns the value of the '<em><b>Function</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentBay <em>Parent Bay</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Function</em>' containment reference list.
     * @see #isSetFunction()
     * @see #unsetFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBay_Function()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentBay
     * @model opposite="ParentBay" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<Function> getFunction();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getFunction <em>Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunction()
     * @see #getFunction()
     * @generated
     */
    void unsetFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getFunction <em>Function</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Function</em>' containment reference list is set.
     * @see #unsetFunction()
     * @see #getFunction()
     * @generated
     */
    boolean isSetFunction();

    /**
     * Returns the value of the '<em><b>Connectivity Node</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentBay <em>Parent Bay</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectivity Node</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectivity Node</em>' containment reference list.
     * @see #isSetConnectivityNode()
     * @see #unsetConnectivityNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBay_ConnectivityNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentBay
     * @model opposite="ParentBay" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<ConnectivityNode> getConnectivityNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConnectivityNode <em>Connectivity Node</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNode()
     * @see #getConnectivityNode()
     * @generated
     */
    void unsetConnectivityNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConnectivityNode <em>Connectivity Node</em>}' containment reference list is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentBay <em>Parent Bay</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conducting Equipment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conducting Equipment</em>' containment reference list.
     * @see #isSetConductingEquipment()
     * @see #unsetConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getBay_ConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentBay
     * @model opposite="ParentBay" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<ConductingEquipment> getConductingEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    void unsetConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConductingEquipment <em>Conducting Equipment</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conducting Equipment</em>' containment reference list is set.
     * @see #unsetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    boolean isSetConductingEquipment();

} // Bay
