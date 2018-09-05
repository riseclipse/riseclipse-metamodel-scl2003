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
 * A representation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getProcess <em>Process</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getSCL <em>SCL</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubstation()
 * @model
 * @generated
 */
public interface Substation extends EquipmentContainer {
    /**
     * Returns the value of the '<em><b>Function</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getSubstation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Function</em>' containment reference list.
     * @see #isSetFunction()
     * @see #unsetFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubstation_Function()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getSubstation
     * @model opposite="Substation" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<Function> getFunction();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getFunction <em>Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunction()
     * @see #getFunction()
     * @generated
     */
    void unsetFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getFunction <em>Function</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Function</em>' containment reference list is set.
     * @see #unsetFunction()
     * @see #getFunction()
     * @generated
     */
    boolean isSetFunction();

    /**
     * Returns the value of the '<em><b>Voltage Level</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getSubstation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Level</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Level</em>' containment reference list.
     * @see #isSetVoltageLevel()
     * @see #unsetVoltageLevel()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubstation_VoltageLevel()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getSubstation
     * @model opposite="Substation" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<VoltageLevel> getVoltageLevel();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getVoltageLevel <em>Voltage Level</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageLevel()
     * @see #getVoltageLevel()
     * @generated
     */
    void unsetVoltageLevel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getVoltageLevel <em>Voltage Level</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Level</em>' containment reference list is set.
     * @see #unsetVoltageLevel()
     * @see #getVoltageLevel()
     * @generated
     */
    boolean isSetVoltageLevel();

    /**
     * Returns the value of the '<em><b>Process</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubstation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process</em>' container reference.
     * @see #setProcess(fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubstation_Process()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubstation
     * @model opposite="Substation" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    fr.centralesupelec.edf.riseclipse.iec61850.scl.Process getProcess();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getProcess <em>Process</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process</em>' container reference.
     * @see #getProcess()
     * @generated
     */
    void setProcess( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process value );

    /**
     * Returns the value of the '<em><b>SCL</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getSubstation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCL</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCL</em>' container reference.
     * @see #setSCL(SCL)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubstation_SCL()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getSubstation
     * @model opposite="Substation" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SCL getSCL();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getSCL <em>SCL</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCL</em>' container reference.
     * @see #getSCL()
     * @generated
     */
    void setSCL( SCL value );

} // Substation
