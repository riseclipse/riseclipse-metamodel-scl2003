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
 * A representation of the model object '<em><b>Data Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getParentAnyLN <em>Parent Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getReferredByControl <em>Referred By Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getFCDA <em>FCDA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataSet()
 * @model
 * @generated
 */
public interface DataSet extends UnNaming {
    /**
     * Returns the value of the '<em><b>Parent Any LN</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Any LN</em>' container reference.
     * @see #setParentAnyLN(AnyLN)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataSet_ParentAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDataSet
     * @model opposite="DataSet" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AnyLN getParentAnyLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getParentAnyLN <em>Parent Any LN</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Any LN</em>' container reference.
     * @see #getParentAnyLN()
     * @generated
     */
    void setParentAnyLN( AnyLN value );

    /**
     * Returns the value of the '<em><b>Referred By Control</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getRefersToDataSet <em>Refers To Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Control</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Control</em>' reference list.
     * @see #isSetReferredByControl()
     * @see #unsetReferredByControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataSet_ReferredByControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getRefersToDataSet
     * @model opposite="RefersToDataSet" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< Control > getReferredByControl();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getReferredByControl <em>Referred By Control</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByControl()
     * @see #getReferredByControl()
     * @generated
     */
    void unsetReferredByControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getReferredByControl <em>Referred By Control</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Control</em>' reference list is set.
     * @see #unsetReferredByControl()
     * @see #getReferredByControl()
     * @generated
     */
    boolean isSetReferredByControl();

    /**
     * Returns the value of the '<em><b>FCDA</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getParentDataSet <em>Parent Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>FCDA</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>FCDA</em>' containment reference list.
     * @see #isSetFCDA()
     * @see #unsetFCDA()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataSet_FCDA()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getParentDataSet
     * @model opposite="ParentDataSet" containment="true" unsettable="true"
     * @generated
     */
    EList< FCDA > getFCDA();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getFCDA <em>FCDA</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFCDA()
     * @see #getFCDA()
     * @generated
     */
    void unsetFCDA();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getFCDA <em>FCDA</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>FCDA</em>' containment reference list is set.
     * @see #unsetFCDA()
     * @see #getFCDA()
     * @generated
     */
    boolean isSetFCDA();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDataSet_Name()
     * @model unsettable="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

} // DataSet
