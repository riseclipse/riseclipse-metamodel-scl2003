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
 * A representation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getXferNumber <em>Xfer Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSubject <em>Subject</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getIssuerName <em>Issuer Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCertificate()
 * @model
 * @generated
 */
public interface Certificate extends Naming {
    /**
     * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Serial Number</em>' attribute.
     * @see #isSetSerialNumber()
     * @see #unsetSerialNumber()
     * @see #setSerialNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCertificate_SerialNumber()
     * @model unsettable="true"
     * @generated
     */
    String getSerialNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSerialNumber <em>Serial Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Serial Number</em>' attribute.
     * @see #isSetSerialNumber()
     * @see #unsetSerialNumber()
     * @see #getSerialNumber()
     * @generated
     */
    void setSerialNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSerialNumber <em>Serial Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSerialNumber()
     * @see #getSerialNumber()
     * @see #setSerialNumber(String)
     * @generated
     */
    void unsetSerialNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSerialNumber <em>Serial Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Serial Number</em>' attribute is set.
     * @see #unsetSerialNumber()
     * @see #getSerialNumber()
     * @see #setSerialNumber(String)
     * @generated
     */
    boolean isSetSerialNumber();

    /**
     * Returns the value of the '<em><b>Xfer Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xfer Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xfer Number</em>' attribute.
     * @see #isSetXferNumber()
     * @see #unsetXferNumber()
     * @see #setXferNumber(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCertificate_XferNumber()
     * @model unsettable="true"
     * @generated
     */
    Integer getXferNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getXferNumber <em>Xfer Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xfer Number</em>' attribute.
     * @see #isSetXferNumber()
     * @see #unsetXferNumber()
     * @see #getXferNumber()
     * @generated
     */
    void setXferNumber( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getXferNumber <em>Xfer Number</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetXferNumber()
     * @see #getXferNumber()
     * @see #setXferNumber(Integer)
     * @generated
     */
    void unsetXferNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getXferNumber <em>Xfer Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xfer Number</em>' attribute is set.
     * @see #unsetXferNumber()
     * @see #getXferNumber()
     * @see #setXferNumber(Integer)
     * @generated
     */
    boolean isSetXferNumber();

    /**
     * Returns the value of the '<em><b>Subject</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Subject#getCertificate <em>Certificate</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subject</em>' containment reference.
     * @see #isSetSubject()
     * @see #unsetSubject()
     * @see #setSubject(Subject)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCertificate_Subject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Subject#getCertificate
     * @model opposite="Certificate" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Subject getSubject();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSubject <em>Subject</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subject</em>' containment reference.
     * @see #isSetSubject()
     * @see #unsetSubject()
     * @see #getSubject()
     * @generated
     */
    void setSubject( Subject value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSubject <em>Subject</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubject()
     * @see #getSubject()
     * @see #setSubject(Subject)
     * @generated
     */
    void unsetSubject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSubject <em>Subject</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Subject</em>' containment reference is set.
     * @see #unsetSubject()
     * @see #getSubject()
     * @see #setSubject(Subject)
     * @generated
     */
    boolean isSetSubject();

    /**
     * Returns the value of the '<em><b>Issuer Name</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IssuerName#getCertificate <em>Certificate</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issuer Name</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Issuer Name</em>' containment reference.
     * @see #isSetIssuerName()
     * @see #unsetIssuerName()
     * @see #setIssuerName(IssuerName)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCertificate_IssuerName()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IssuerName#getCertificate
     * @model opposite="Certificate" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    IssuerName getIssuerName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getIssuerName <em>Issuer Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Issuer Name</em>' containment reference.
     * @see #isSetIssuerName()
     * @see #unsetIssuerName()
     * @see #getIssuerName()
     * @generated
     */
    void setIssuerName( IssuerName value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getIssuerName <em>Issuer Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIssuerName()
     * @see #getIssuerName()
     * @see #setIssuerName(IssuerName)
     * @generated
     */
    void unsetIssuerName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getIssuerName <em>Issuer Name</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Issuer Name</em>' containment reference is set.
     * @see #unsetIssuerName()
     * @see #getIssuerName()
     * @see #setIssuerName(IssuerName)
     * @generated
     */
    boolean isSetIssuerName();

} // Certificate
