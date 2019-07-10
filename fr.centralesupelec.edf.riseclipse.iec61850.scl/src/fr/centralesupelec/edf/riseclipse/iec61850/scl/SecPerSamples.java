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
 * A representation of the model object '<em><b>Sec Per Samples</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples#getParentSMVSettings <em>Parent SMV Settings</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSecPerSamples()
 * @model extendedMetaData="kind='simple'"
 * @generated
 */
public interface SecPerSamples extends SclObject {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSecPerSamples_Value()
     * @model required="true"
     *        extendedMetaData="kind='simple'"
     * @generated
     */
    Integer getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(Integer value);

    /**
     * Returns the value of the '<em><b>Parent SMV Settings</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSecPerSamples <em>Sec Per Samples</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SMV Settings</em>' container reference.
     * @see #setParentSMVSettings(SMVSettings)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSecPerSamples_ParentSMVSettings()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSecPerSamples
     * @model opposite="SecPerSamples" resolveProxies="false" ordered="false"
     * @generated
     */
    SMVSettings getParentSMVSettings();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples#getParentSMVSettings <em>Parent SMV Settings</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SMV Settings</em>' container reference.
     * @see #getParentSMVSettings()
     * @generated
     */
    void setParentSMVSettings(SMVSettings value);

} // SecPerSamples
