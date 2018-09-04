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
 * 
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getClientServices <em>Client Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getGSESettings <em>GSE Settings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getSMVSettings <em>SMV Settings</em>}</li>
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
     * Returns the value of the '<em><b>Client Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMcSecurity <em>Mc Security</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Client Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Client Services</em>' container reference.
     * @see #setClientServices(ClientServices)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMcSecurity_ClientServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMcSecurity
     * @model opposite="McSecurity" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ClientServices getClientServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getClientServices <em>Client Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Client Services</em>' container reference.
     * @see #getClientServices()
     * @generated
     */
    void setClientServices(ClientServices value);

    /**
     * Returns the value of the '<em><b>GSE Settings</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getMcSecurity <em>Mc Security</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GSE Settings</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>GSE Settings</em>' container reference.
     * @see #setGSESettings(GSESettings)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMcSecurity_GSESettings()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getMcSecurity
     * @model opposite="McSecurity" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    GSESettings getGSESettings();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getGSESettings <em>GSE Settings</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>GSE Settings</em>' container reference.
     * @see #getGSESettings()
     * @generated
     */
    void setGSESettings(GSESettings value);

    /**
     * Returns the value of the '<em><b>SMV Settings</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getMcSecurity <em>Mc Security</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SMV Settings</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SMV Settings</em>' container reference.
     * @see #setSMVSettings(SMVSettings)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMcSecurity_SMVSettings()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getMcSecurity
     * @model opposite="McSecurity" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SMVSettings getSMVSettings();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getSMVSettings <em>SMV Settings</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SMV Settings</em>' container reference.
     * @see #getSMVSettings()
     * @generated
     */
    void setSMVSettings(SMVSettings value);

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
    void setSignature(Boolean value);

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
    void setEncryption(Boolean value);

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
