/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io/
*************************************************************************
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getParentDOType <em>Parent DO Type</em>}</li>
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
     * Returns the value of the '<em><b>Parent DO Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA <em>DA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DO Type</em>' container reference.
     * @see #setParentDOType(DOType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDA_ParentDOType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA
     * @model opposite="DA" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DOType getParentDOType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getParentDOType <em>Parent DO Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DO Type</em>' container reference.
     * @see #getParentDOType()
     * @generated
     */
    void setParentDOType( DOType value );

    /**
     * Returns the value of the '<em><b>Prot Ns</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getParentDA <em>Parent DA</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getParentDA
     * @model opposite="ParentDA" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< ProtNs > getProtNs();

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
