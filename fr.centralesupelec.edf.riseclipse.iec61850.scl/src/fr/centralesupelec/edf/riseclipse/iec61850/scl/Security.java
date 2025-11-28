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
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#isACSEAuthentication <em>ACSE Authentication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#isE2ESecurity <em>E2E Security</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#getParentServices <em>Parent Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#getParentClientServices <em>Parent Client Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSecurity()
 * @model
 * @generated
 */
public interface Security extends SclObject {
    /**
     * Returns the value of the '<em><b>ACSE Authentication</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>ACSE Authentication</em>' attribute.
     * @see #isSetACSEAuthentication()
     * @see #unsetACSEAuthentication()
     * @see #setACSEAuthentication(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSecurity_ACSEAuthentication()
     * @model default="false" unsettable="true"
     * @generated
     */
    boolean isACSEAuthentication();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#isACSEAuthentication <em>ACSE Authentication</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ACSE Authentication</em>' attribute.
     * @see #isSetACSEAuthentication()
     * @see #unsetACSEAuthentication()
     * @see #isACSEAuthentication()
     * @generated
     */
    void setACSEAuthentication( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#isACSEAuthentication <em>ACSE Authentication</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetACSEAuthentication()
     * @see #isACSEAuthentication()
     * @see #setACSEAuthentication(boolean)
     * @generated
     */
    void unsetACSEAuthentication();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#isACSEAuthentication <em>ACSE Authentication</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ACSE Authentication</em>' attribute is set.
     * @see #unsetACSEAuthentication()
     * @see #isACSEAuthentication()
     * @see #setACSEAuthentication(boolean)
     * @generated
     */
    boolean isSetACSEAuthentication();

    /**
     * Returns the value of the '<em><b>E2E Security</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>E2E Security</em>' attribute.
     * @see #isSetE2ESecurity()
     * @see #unsetE2ESecurity()
     * @see #setE2ESecurity(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSecurity_E2ESecurity()
     * @model default="false" unsettable="true"
     * @generated
     */
    boolean isE2ESecurity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#isE2ESecurity <em>E2E Security</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>E2E Security</em>' attribute.
     * @see #isSetE2ESecurity()
     * @see #unsetE2ESecurity()
     * @see #isE2ESecurity()
     * @generated
     */
    void setE2ESecurity( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#isE2ESecurity <em>E2E Security</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetE2ESecurity()
     * @see #isE2ESecurity()
     * @see #setE2ESecurity(boolean)
     * @generated
     */
    void unsetE2ESecurity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#isE2ESecurity <em>E2E Security</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>E2E Security</em>' attribute is set.
     * @see #unsetE2ESecurity()
     * @see #isE2ESecurity()
     * @see #setE2ESecurity(boolean)
     * @generated
     */
    boolean isSetE2ESecurity();

    /**
     * Returns the value of the '<em><b>Parent Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSecurity <em>Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Services</em>' container reference.
     * @see #setParentServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSecurity_ParentServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSecurity
     * @model opposite="Security" unsettable="true" ordered="false"
     * @generated
     */
    Services getParentServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#getParentServices <em>Parent Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Services</em>' container reference.
     * @see #getParentServices()
     * @generated
     */
    void setParentServices( Services value );

    /**
     * Returns the value of the '<em><b>Parent Client Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSecurity <em>Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Client Services</em>' container reference.
     * @see #setParentClientServices(ClientServices)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSecurity_ParentClientServices()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSecurity
     * @model opposite="Security" unsettable="true" ordered="false"
     * @generated
     */
    ClientServices getParentClientServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Security#getParentClientServices <em>Parent Client Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Client Services</em>' container reference.
     * @see #getParentClientServices()
     * @generated
     */
    void setParentClientServices( ClientServices value );

} // Security
