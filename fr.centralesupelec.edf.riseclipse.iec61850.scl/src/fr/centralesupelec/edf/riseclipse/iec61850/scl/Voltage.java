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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltage()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface Voltage extends ValueWithUnit {

    /**
     * Returns the value of the '<em><b>Line</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getVoltage <em>Voltage</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line</em>' container reference.
     * @see #setLine(Line)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltage_Line()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getVoltage
     * @model opposite="Voltage" resolveProxies="false" unsettable="true"
     * @generated
     */
    Line getLine();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getLine <em>Line</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line</em>' container reference.
     * @see #getLine()
     * @generated
     */
    void setLine(Line value);

} // Voltage
