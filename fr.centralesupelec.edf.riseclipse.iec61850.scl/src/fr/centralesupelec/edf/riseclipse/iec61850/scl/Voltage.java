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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentLine <em>Parent Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentVoltageLevel <em>Parent Voltage Level</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltage()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface Voltage extends ValueWithUnit {

    /**
     * Returns the value of the '<em><b>Parent Line</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getVoltage <em>Voltage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Line</em>' container reference.
     * @see #setParentLine(Line)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltage_ParentLine()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getVoltage
     * @model opposite="Voltage" resolveProxies="false" unsettable="true"
     * @generated
     */
    Line getParentLine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentLine <em>Parent Line</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Line</em>' container reference.
     * @see #getParentLine()
     * @generated
     */
    void setParentLine(Line value);

    /**
     * Returns the value of the '<em><b>Parent Voltage Level</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage <em>Voltage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Voltage Level</em>' container reference.
     * @see #setParentVoltageLevel(VoltageLevel)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltage_ParentVoltageLevel()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage
     * @model opposite="Voltage" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    VoltageLevel getParentVoltageLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentVoltageLevel <em>Parent Voltage Level</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Voltage Level</em>' container reference.
     * @see #getParentVoltageLevel()
     * @generated
     */
    void setParentVoltageLevel(VoltageLevel value);

} // Voltage
