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
 * A representation of the model object '<em><b>DA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getFc <em>Fc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getRefersToDAType <em>Refers To DA Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getDOType <em>DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getProtNs <em>Prot Ns</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDA()
 * @model
 * @generated
 */
public interface DA extends AbstractDataAttribute, AgDATrgOp {
    /**
     * Returns the value of the '<em><b>Fc</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fc</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum
     * @see #isSetFc()
     * @see #unsetFc()
     * @see #setFc(FCEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDA_Fc()
     * @model unsettable="true"
     * @generated
     */
    FCEnum getFc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getFc <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fc</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum
     * @see #isSetFc()
     * @see #unsetFc()
     * @see #getFc()
     * @generated
     */
    void setFc( FCEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getFc <em>Fc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFc()
     * @see #getFc()
     * @see #setFc(FCEnum)
     * @generated
     */
    void unsetFc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getFc <em>Fc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fc</em>' attribute is set.
     * @see #unsetFc()
     * @see #getFc()
     * @see #setFc(FCEnum)
     * @generated
     */
    boolean isSetFc();

    /**
     * Returns the value of the '<em><b>Refers To DA Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByDA <em>Referred By DA</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To DA Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To DA Type</em>' reference.
     * @see #isSetRefersToDAType()
     * @see #unsetRefersToDAType()
     * @see #setRefersToDAType(DAType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDA_RefersToDAType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByDA
     * @model opposite="ReferredByDA" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    DAType getRefersToDAType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getRefersToDAType <em>Refers To DA Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To DA Type</em>' reference.
     * @see #isSetRefersToDAType()
     * @see #unsetRefersToDAType()
     * @see #getRefersToDAType()
     * @generated
     */
    void setRefersToDAType(DAType value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getRefersToDAType <em>Refers To DA Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToDAType()
     * @see #getRefersToDAType()
     * @see #setRefersToDAType(DAType)
     * @generated
     */
    void unsetRefersToDAType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getRefersToDAType <em>Refers To DA Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To DA Type</em>' reference is set.
     * @see #unsetRefersToDAType()
     * @see #getRefersToDAType()
     * @see #setRefersToDAType(DAType)
     * @generated
     */
    boolean isSetRefersToDAType();

    /**
     * Returns the value of the '<em><b>DO Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA <em>DA</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DO Type</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DO Type</em>' container reference.
     * @see #setDOType(DOType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDA_DOType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA
     * @model opposite="DA" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DOType getDOType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getDOType <em>DO Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>DO Type</em>' container reference.
     * @see #getDOType()
     * @generated
     */
    void setDOType( DOType value );

    /**
     * Returns the value of the '<em><b>Prot Ns</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getDA <em>DA</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prot Ns</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prot Ns</em>' containment reference list.
     * @see #isSetProtNs()
     * @see #unsetProtNs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDA_ProtNs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getDA
     * @model opposite="DA" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<ProtNs> getProtNs();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getProtNs <em>Prot Ns</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProtNs()
     * @see #getProtNs()
     * @generated
     */
    void unsetProtNs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getProtNs <em>Prot Ns</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prot Ns</em>' containment reference list is set.
     * @see #unsetProtNs()
     * @see #getProtNs()
     * @generated
     */
    boolean isSetProtNs();

} // DA
