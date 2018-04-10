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
 * A representation of the model object '<em><b>Comm Prot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getIpv6 <em>Ipv6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCommProt()
 * @model
 * @generated
 */
public interface CommProt extends SclObject {
    /**
     * Returns the value of the '<em><b>Ipv6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ipv6</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ipv6</em>' attribute.
     * @see #isSetIpv6()
     * @see #unsetIpv6()
     * @see #setIpv6(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCommProt_Ipv6()
     * @model unsettable="true"
     * @generated
     */
    Boolean getIpv6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getIpv6 <em>Ipv6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ipv6</em>' attribute.
     * @see #isSetIpv6()
     * @see #unsetIpv6()
     * @see #getIpv6()
     * @generated
     */
    void setIpv6( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getIpv6 <em>Ipv6</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetIpv6()
     * @see #getIpv6()
     * @see #setIpv6(Boolean)
     * @generated
     */
    void unsetIpv6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getIpv6 <em>Ipv6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ipv6</em>' attribute is set.
     * @see #unsetIpv6()
     * @see #getIpv6()
     * @see #setIpv6(Boolean)
     * @generated
     */
    boolean isSetIpv6();

    /**
     * Returns the value of the '<em><b>Services</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getCommProt <em>Comm Prot</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Services</em>' container reference.
     * @see #setServices(Services)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCommProt_Services()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getCommProt
     * @model opposite="CommProt" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Services getServices();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getServices <em>Services</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Services</em>' container reference.
     * @see #getServices()
     * @generated
     */
    void setServices( Services value );

} // CommProt
