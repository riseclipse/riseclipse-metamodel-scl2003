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
 * A representation of the model object '<em><b>Mc Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentClientServices <em>Parent Client Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentGSESettings <em>Parent GSE Settings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentSMVSettings <em>Parent SMV Settings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getSignature <em>Signature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getEncryption <em>Encryption</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMcSecurity()
 * @model
 * @generated
 */
public interface McSecurity extends SclObject {
    /**
     * Returns the value of the '<em><b>Parent Client Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMcSecurity <em>Mc Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Client Services</em>' container reference.
     * @see #setParentClientServices(ClientServices)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMcSecurity_ParentClientServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMcSecurity
     * @model opposite="McSecurity" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ClientServices getParentClientServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentClientServices <em>Parent Client Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Client Services</em>' container reference.
     * @see #getParentClientServices()
     * @generated
     */
    void setParentClientServices( ClientServices value );

    /**
     * Returns the value of the '<em><b>Parent GSE Settings</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getMcSecurity <em>Mc Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent GSE Settings</em>' container reference.
     * @see #setParentGSESettings(GSESettings)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMcSecurity_ParentGSESettings()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getMcSecurity
     * @model opposite="McSecurity" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    GSESettings getParentGSESettings();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentGSESettings <em>Parent GSE Settings</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent GSE Settings</em>' container reference.
     * @see #getParentGSESettings()
     * @generated
     */
    void setParentGSESettings( GSESettings value );

    /**
     * Returns the value of the '<em><b>Parent SMV Settings</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getMcSecurity <em>Mc Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SMV Settings</em>' container reference.
     * @see #setParentSMVSettings(SMVSettings)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMcSecurity_ParentSMVSettings()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getMcSecurity
     * @model opposite="McSecurity" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SMVSettings getParentSMVSettings();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentSMVSettings <em>Parent SMV Settings</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SMV Settings</em>' container reference.
     * @see #getParentSMVSettings()
     * @generated
     */
    void setParentSMVSettings( SMVSettings value );

    /**
     * Returns the value of the '<em><b>Signature</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signature</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Signature</em>' attribute.
     * @see #isSetSignature()
     * @see #unsetSignature()
     * @see #setSignature(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMcSecurity_Signature()
     * @model unsettable="true"
     * @generated
     */
    Boolean getSignature();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getSignature <em>Signature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signature</em>' attribute.
     * @see #isSetSignature()
     * @see #unsetSignature()
     * @see #getSignature()
     * @generated
     */
    void setSignature( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getSignature <em>Signature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSignature()
     * @see #getSignature()
     * @see #setSignature(Boolean)
     * @generated
     */
    void unsetSignature();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getSignature <em>Signature</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Signature</em>' attribute is set.
     * @see #unsetSignature()
     * @see #getSignature()
     * @see #setSignature(Boolean)
     * @generated
     */
    boolean isSetSignature();

    /**
     * Returns the value of the '<em><b>Encryption</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Encryption</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Encryption</em>' attribute.
     * @see #isSetEncryption()
     * @see #unsetEncryption()
     * @see #setEncryption(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMcSecurity_Encryption()
     * @model unsettable="true"
     * @generated
     */
    Boolean getEncryption();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getEncryption <em>Encryption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Encryption</em>' attribute.
     * @see #isSetEncryption()
     * @see #unsetEncryption()
     * @see #getEncryption()
     * @generated
     */
    void setEncryption( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getEncryption <em>Encryption</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEncryption()
     * @see #getEncryption()
     * @see #setEncryption(Boolean)
     * @generated
     */
    void unsetEncryption();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getEncryption <em>Encryption</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Encryption</em>' attribute is set.
     * @see #unsetEncryption()
     * @see #getEncryption()
     * @see #setEncryption(Boolean)
     * @generated
     */
    boolean isSetEncryption();

} // McSecurity
