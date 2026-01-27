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
 * A representation of the model object '<em><b>Analogue Wiring Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Analogue wiring parameters for service specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getDsgInp <em>Dsg Inp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getFctInp <em>Fct Inp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getReferredByAnalogueWiringParametersRef <em>Referred By Analogue Wiring Parameters Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAnalogueWiringParameters()
 * @model
 * @generated
 */
public interface AnalogueWiringParameters extends WiringParameters {
    /**
     * Returns the value of the '<em><b>Dsg Inp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Designation of the input to use in LPAI
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dsg Inp</em>' attribute.
     * @see #setDsgInp(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAnalogueWiringParameters_DsgInp()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='dsgInp'"
     * @generated
     */
    String getDsgInp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getDsgInp <em>Dsg Inp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dsg Inp</em>' attribute.
     * @see #getDsgInp()
     * @generated
     */
    void setDsgInp( String value );

    /**
     * Returns the value of the '<em><b>Fct Inp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Function designation of the input to use in LPAI
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fct Inp</em>' attribute.
     * @see #setFctInp(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAnalogueWiringParameters_FctInp()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='fctInp'"
     * @generated
     */
    String getFctInp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getFctInp <em>Fct Inp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fct Inp</em>' attribute.
     * @see #getFctInp()
     * @generated
     */
    void setFctInp( String value );

    /**
     * Returns the value of the '<em><b>Parent Service Specifications</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getAnalogueWiringParameters <em>Analogue Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #setParentServiceSpecifications(ServiceSpecifications)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAnalogueWiringParameters_ParentServiceSpecifications()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getAnalogueWiringParameters
     * @model opposite="AnalogueWiringParameters" unsettable="true" ordered="false"
     * @generated
     */
    ServiceSpecifications getParentServiceSpecifications();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Service Specifications</em>' container reference.
     * @see #getParentServiceSpecifications()
     * @generated
     */
    void setParentServiceSpecifications( ServiceSpecifications value );

    /**
     * Returns the value of the '<em><b>Referred By Analogue Wiring Parameters Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getRefersToAnalogueWiringParameters <em>Refers To Analogue Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Analogue Wiring Parameters Ref</em>' reference list.
     * @see #isSetReferredByAnalogueWiringParametersRef()
     * @see #unsetReferredByAnalogueWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAnalogueWiringParameters_ReferredByAnalogueWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getRefersToAnalogueWiringParameters
     * @model opposite="RefersToAnalogueWiringParameters" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AnalogueWiringParametersRef > getReferredByAnalogueWiringParametersRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getReferredByAnalogueWiringParametersRef <em>Referred By Analogue Wiring Parameters Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAnalogueWiringParametersRef()
     * @see #getReferredByAnalogueWiringParametersRef()
     * @generated
     */
    void unsetReferredByAnalogueWiringParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getReferredByAnalogueWiringParametersRef <em>Referred By Analogue Wiring Parameters Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Analogue Wiring Parameters Ref</em>' reference list is set.
     * @see #unsetReferredByAnalogueWiringParametersRef()
     * @see #getReferredByAnalogueWiringParametersRef()
     * @generated
     */
    boolean isSetReferredByAnalogueWiringParametersRef();

} // AnalogueWiringParameters
