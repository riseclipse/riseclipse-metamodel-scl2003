/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.iec61850.asd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Specifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the list of Service Specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getGooseParameters <em>Goose Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getSMVParameters <em>SMV Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getReportParameters <em>Report Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getBinaryWiringParameters <em>Binary Wiring Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getAnalogueWiringParameters <em>Analogue Wiring Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getLogParameters <em>Log Parameters</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getServiceSpecifications()
 * @model extendedMetaData="name='ServiceSpecifications' kind='elementOnly'"
 * @generated
 */
public interface ServiceSpecifications extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Goose Parameters</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Goose Parameters</em>' containment reference list.
     * @see #isSetGooseParameters()
     * @see #unsetGooseParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getServiceSpecifications_GooseParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentServiceSpecifications
     * @model opposite="ParentServiceSpecifications" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='GooseParameters' namespace='##targetNamespace'"
     * @generated
     */
    EList< GooseParameters > getGooseParameters();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getGooseParameters <em>Goose Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGooseParameters()
     * @see #getGooseParameters()
     * @generated
     */
    void unsetGooseParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getGooseParameters <em>Goose Parameters</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Goose Parameters</em>' containment reference list is set.
     * @see #unsetGooseParameters()
     * @see #getGooseParameters()
     * @generated
     */
    boolean isSetGooseParameters();

    /**
     * Returns the value of the '<em><b>SMV Parameters</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>SMV Parameters</em>' containment reference list.
     * @see #isSetSMVParameters()
     * @see #unsetSMVParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getServiceSpecifications_SMVParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentServiceSpecifications
     * @model opposite="ParentServiceSpecifications" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SMVParameters' namespace='##targetNamespace'"
     * @generated
     */
    EList< SMVParameters > getSMVParameters();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getSMVParameters <em>SMV Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSMVParameters()
     * @see #getSMVParameters()
     * @generated
     */
    void unsetSMVParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getSMVParameters <em>SMV Parameters</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SMV Parameters</em>' containment reference list is set.
     * @see #unsetSMVParameters()
     * @see #getSMVParameters()
     * @generated
     */
    boolean isSetSMVParameters();

    /**
     * Returns the value of the '<em><b>Report Parameters</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Report Parameters</em>' containment reference list.
     * @see #isSetReportParameters()
     * @see #unsetReportParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getServiceSpecifications_ReportParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentServiceSpecifications
     * @model opposite="ParentServiceSpecifications" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ReportParameters' namespace='##targetNamespace'"
     * @generated
     */
    EList< ReportParameters > getReportParameters();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getReportParameters <em>Report Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportParameters()
     * @see #getReportParameters()
     * @generated
     */
    void unsetReportParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getReportParameters <em>Report Parameters</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Report Parameters</em>' containment reference list is set.
     * @see #unsetReportParameters()
     * @see #getReportParameters()
     * @generated
     */
    boolean isSetReportParameters();

    /**
     * Returns the value of the '<em><b>Binary Wiring Parameters</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Binary Wiring Parameters</em>' containment reference list.
     * @see #isSetBinaryWiringParameters()
     * @see #unsetBinaryWiringParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getServiceSpecifications_BinaryWiringParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getParentServiceSpecifications
     * @model opposite="ParentServiceSpecifications" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='BinaryWiringParameters' namespace='##targetNamespace'"
     * @generated
     */
    EList< BinaryWiringParameters > getBinaryWiringParameters();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getBinaryWiringParameters <em>Binary Wiring Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBinaryWiringParameters()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    void unsetBinaryWiringParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getBinaryWiringParameters <em>Binary Wiring Parameters</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Binary Wiring Parameters</em>' containment reference list is set.
     * @see #unsetBinaryWiringParameters()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    boolean isSetBinaryWiringParameters();

    /**
     * Returns the value of the '<em><b>Analogue Wiring Parameters</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analogue Wiring Parameters</em>' containment reference list.
     * @see #isSetAnalogueWiringParameters()
     * @see #unsetAnalogueWiringParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getServiceSpecifications_AnalogueWiringParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getParentServiceSpecifications
     * @model opposite="ParentServiceSpecifications" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='AnalogueWiringParameters' namespace='##targetNamespace'"
     * @generated
     */
    EList< AnalogueWiringParameters > getAnalogueWiringParameters();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getAnalogueWiringParameters <em>Analogue Wiring Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalogueWiringParameters()
     * @see #getAnalogueWiringParameters()
     * @generated
     */
    void unsetAnalogueWiringParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getAnalogueWiringParameters <em>Analogue Wiring Parameters</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analogue Wiring Parameters</em>' containment reference list is set.
     * @see #unsetAnalogueWiringParameters()
     * @see #getAnalogueWiringParameters()
     * @generated
     */
    boolean isSetAnalogueWiringParameters();

    /**
     * Returns the value of the '<em><b>Log Parameters</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Log Parameters</em>' containment reference list.
     * @see #isSetLogParameters()
     * @see #unsetLogParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getServiceSpecifications_LogParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getParentServiceSpecifications
     * @model opposite="ParentServiceSpecifications" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='LogParameters' namespace='##targetNamespace'"
     * @generated
     */
    EList< LogParameters > getLogParameters();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getLogParameters <em>Log Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLogParameters()
     * @see #getLogParameters()
     * @generated
     */
    void unsetLogParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getLogParameters <em>Log Parameters</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Log Parameters</em>' containment reference list is set.
     * @see #unsetLogParameters()
     * @see #getLogParameters()
     * @generated
     */
    boolean isSetLogParameters();

} // ServiceSpecifications
