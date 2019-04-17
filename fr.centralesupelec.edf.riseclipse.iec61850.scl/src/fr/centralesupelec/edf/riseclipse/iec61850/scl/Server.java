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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getParentAccessPoint <em>Parent Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAssociation <em>Association</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication <em>Authentication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice <em>LDevice</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends UnNaming {
    /**
     * Returns the value of the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timeout</em>' attribute.
     * @see #isSetTimeout()
     * @see #unsetTimeout()
     * @see #setTimeout(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer_Timeout()
     * @model unsettable="true"
     * @generated
     */
    Integer getTimeout();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Timeout</em>' attribute.
     * @see #isSetTimeout()
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @generated
     */
    void setTimeout( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getTimeout <em>Timeout</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(Integer)
     * @generated
     */
    void unsetTimeout();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getTimeout <em>Timeout</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Timeout</em>' attribute is set.
     * @see #unsetTimeout()
     * @see #getTimeout()
     * @see #setTimeout(Integer)
     * @generated
     */
    boolean isSetTimeout();

    /**
     * Returns the value of the '<em><b>Parent Access Point</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServer <em>Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Access Point</em>' container reference.
     * @see #setParentAccessPoint(AccessPoint)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer_ParentAccessPoint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServer
     * @model opposite="Server" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AccessPoint getParentAccessPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getParentAccessPoint <em>Parent Access Point</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Access Point</em>' container reference.
     * @see #getParentAccessPoint()
     * @generated
     */
    void setParentAccessPoint(AccessPoint value);

    /**
     * Returns the value of the '<em><b>Association</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getParentServer <em>Parent Server</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Association</em>' containment reference list.
     * @see #isSetAssociation()
     * @see #unsetAssociation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer_Association()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getParentServer
     * @model opposite="ParentServer" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<Association> getAssociation();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAssociation <em>Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssociation()
     * @see #getAssociation()
     * @generated
     */
    void unsetAssociation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAssociation <em>Association</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Association</em>' containment reference list is set.
     * @see #unsetAssociation()
     * @see #getAssociation()
     * @generated
     */
    boolean isSetAssociation();

    /**
     * Returns the value of the '<em><b>Authentication</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getParentServer <em>Parent Server</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Authentication</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Authentication</em>' containment reference.
     * @see #isSetAuthentication()
     * @see #unsetAuthentication()
     * @see #setAuthentication(Authentication)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer_Authentication()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getParentServer
     * @model opposite="ParentServer" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Authentication getAuthentication();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication <em>Authentication</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Authentication</em>' containment reference.
     * @see #isSetAuthentication()
     * @see #unsetAuthentication()
     * @see #getAuthentication()
     * @generated
     */
    void setAuthentication( Authentication value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication <em>Authentication</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuthentication()
     * @see #getAuthentication()
     * @see #setAuthentication(Authentication)
     * @generated
     */
    void unsetAuthentication();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication <em>Authentication</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Authentication</em>' containment reference is set.
     * @see #unsetAuthentication()
     * @see #getAuthentication()
     * @see #setAuthentication(Authentication)
     * @generated
     */
    boolean isSetAuthentication();

    /**
     * Returns the value of the '<em><b>LDevice</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getParentServer <em>Parent Server</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LDevice</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LDevice</em>' containment reference list.
     * @see #isSetLDevice()
     * @see #unsetLDevice()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServer_LDevice()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getParentServer
     * @model opposite="ParentServer" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<LDevice> getLDevice();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice <em>LDevice</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLDevice()
     * @see #getLDevice()
     * @generated
     */
    void unsetLDevice();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice <em>LDevice</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LDevice</em>' containment reference list is set.
     * @see #unsetLDevice()
     * @see #getLDevice()
     * @generated
     */
    boolean isSetLDevice();

} // Server
