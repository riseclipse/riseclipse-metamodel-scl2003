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
 * A representation of the model object '<em><b>Substation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getParentProcess <em>Parent Process</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getParentSCL <em>Parent SCL</em>}</li>
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentSubstation <em>Parent Substation</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentSubstation
     * @model opposite="ParentSubstation" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< Function > getFunction();

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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getParentSubstation <em>Parent Substation</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getParentSubstation
     * @model opposite="ParentSubstation" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< VoltageLevel > getVoltageLevel();

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
     * Returns the value of the '<em><b>Parent Process</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubstation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Process</em>' container reference.
     * @see #setParentProcess(fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubstation_ParentProcess()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubstation
     * @model opposite="Substation" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    fr.centralesupelec.edf.riseclipse.iec61850.scl.Process getParentProcess();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getParentProcess <em>Parent Process</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Process</em>' container reference.
     * @see #getParentProcess()
     * @generated
     */
    void setParentProcess( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process value );

    /**
     * Returns the value of the '<em><b>Parent SCL</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getSubstation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SCL</em>' container reference.
     * @see #setParentSCL(SCL)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubstation_ParentSCL()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getSubstation
     * @model opposite="Substation" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SCL getParentSCL();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getParentSCL <em>Parent SCL</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SCL</em>' container reference.
     * @see #getParentSCL()
     * @generated
     */
    void setParentSCL( SCL value );

} // Substation
