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

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNomFreq <em>Nom Freq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNumPhases <em>Num Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getFunction <em>Function</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getParentSubstation <em>Parent Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage <em>Voltage</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel()
 * @model
 * @generated
 */
public interface VoltageLevel extends EquipmentContainer {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_NomFreq()
     * @model unsettable="true"
     * @generated
     */
    BigDecimal getNomFreq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNomFreq <em>Nom Freq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nom Freq</em>' attribute.
     * @see #isSetNomFreq()
     * @see #unsetNomFreq()
     * @see #getNomFreq()
     * @generated
     */
    void setNomFreq( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNomFreq <em>Nom Freq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNomFreq()
     * @see #getNomFreq()
     * @see #setNomFreq(BigDecimal)
     * @generated
     */
    void unsetNomFreq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNomFreq <em>Nom Freq</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_NumPhases()
     * @model unsettable="true"
     * @generated
     */
    Integer getNumPhases();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNumPhases <em>Num Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Num Phases</em>' attribute.
     * @see #isSetNumPhases()
     * @see #unsetNumPhases()
     * @see #getNumPhases()
     * @generated
     */
    void setNumPhases( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNumPhases <em>Num Phases</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetNumPhases()
     * @see #getNumPhases()
     * @see #setNumPhases(Integer)
     * @generated
     */
    void unsetNumPhases();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNumPhases <em>Num Phases</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Num Phases</em>' attribute is set.
     * @see #unsetNumPhases()
     * @see #getNumPhases()
     * @see #setNumPhases(Integer)
     * @generated
     */
    boolean isSetNumPhases();

    /**
     * Returns the value of the '<em><b>Bay</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getParentVoltageLevel <em>Parent Voltage Level</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bay</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bay</em>' containment reference list.
     * @see #isSetBay()
     * @see #unsetBay()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_Bay()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getParentVoltageLevel
     * @model opposite="ParentVoltageLevel" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< Bay > getBay();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getBay <em>Bay</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBay()
     * @see #getBay()
     * @generated
     */
    void unsetBay();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getBay <em>Bay</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bay</em>' containment reference list is set.
     * @see #unsetBay()
     * @see #getBay()
     * @generated
     */
    boolean isSetBay();

    /**
     * Returns the value of the '<em><b>Function</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentVoltageLevel <em>Parent Voltage Level</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Function</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Function</em>' containment reference list.
     * @see #isSetFunction()
     * @see #unsetFunction()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_Function()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentVoltageLevel
     * @model opposite="ParentVoltageLevel" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< Function > getFunction();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getFunction <em>Function</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunction()
     * @see #getFunction()
     * @generated
     */
    void unsetFunction();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getFunction <em>Function</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Function</em>' containment reference list is set.
     * @see #unsetFunction()
     * @see #getFunction()
     * @generated
     */
    boolean isSetFunction();

    /**
     * Returns the value of the '<em><b>Parent Substation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getVoltageLevel <em>Voltage Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Substation</em>' container reference.
     * @see #setParentSubstation(Substation)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_ParentSubstation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getVoltageLevel
     * @model opposite="VoltageLevel" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Substation getParentSubstation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getParentSubstation <em>Parent Substation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Substation</em>' container reference.
     * @see #getParentSubstation()
     * @generated
     */
    void setParentSubstation( Substation value );

    /**
     * Returns the value of the '<em><b>Voltage</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentVoltageLevel <em>Parent Voltage Level</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getVoltageLevel_Voltage()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentVoltageLevel
     * @model opposite="ParentVoltageLevel" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    Voltage getVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage <em>Voltage</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage</em>' containment reference.
     * @see #isSetVoltage()
     * @see #unsetVoltage()
     * @see #getVoltage()
     * @generated
     */
    void setVoltage( Voltage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage <em>Voltage</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltage()
     * @see #getVoltage()
     * @see #setVoltage(Voltage)
     * @generated
     */
    void unsetVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage <em>Voltage</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage</em>' containment reference is set.
     * @see #unsetVoltage()
     * @see #getVoltage()
     * @see #setVoltage(Voltage)
     * @generated
     */
    boolean isSetVoltage();

} // VoltageLevel
