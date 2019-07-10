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
 * A representation of the model object '<em><b>Client LN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getApRef <em>Ap Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getParentRptEnabled <em>Parent Rpt Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientLN()
 * @model
 * @generated
 */
public interface ClientLN extends SclObject, AgLNRef {
    /**
     * Returns the value of the '<em><b>Ap Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ap Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ap Ref</em>' attribute.
     * @see #isSetApRef()
     * @see #unsetApRef()
     * @see #setApRef(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientLN_ApRef()
     * @model unsettable="true"
     * @generated
     */
    String getApRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getApRef <em>Ap Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ap Ref</em>' attribute.
     * @see #isSetApRef()
     * @see #unsetApRef()
     * @see #getApRef()
     * @generated
     */
    void setApRef( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getApRef <em>Ap Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApRef()
     * @see #getApRef()
     * @see #setApRef(String)
     * @generated
     */
    void unsetApRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getApRef <em>Ap Ref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ap Ref</em>' attribute is set.
     * @see #unsetApRef()
     * @see #getApRef()
     * @see #setApRef(String)
     * @generated
     */
    boolean isSetApRef();

    /**
     * Returns the value of the '<em><b>Parent Rpt Enabled</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getClientLN <em>Client LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Rpt Enabled</em>' container reference.
     * @see #setParentRptEnabled(RptEnabled)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientLN_ParentRptEnabled()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getClientLN
     * @model opposite="ClientLN" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    RptEnabled getParentRptEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getParentRptEnabled <em>Parent Rpt Enabled</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Rpt Enabled</em>' container reference.
     * @see #getParentRptEnabled()
     * @generated
     */
    void setParentRptEnabled( RptEnabled value );

    /**
     * Returns the value of the '<em><b>Refers To Any LN</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByClientLN <em>Referred By Client LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Any LN</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Any LN</em>' reference.
     * @see #isSetRefersToAnyLN()
     * @see #unsetRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getClientLN_RefersToAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByClientLN
     * @model opposite="ReferredByClientLN" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AnyLN getRefersToAnyLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Any LN</em>' reference.
     * @see #isSetRefersToAnyLN()
     * @see #unsetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @generated
     */
    void setRefersToAnyLN( AnyLN value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @generated
     */
    void unsetRefersToAnyLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getRefersToAnyLN <em>Refers To Any LN</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Any LN</em>' reference is set.
     * @see #unsetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @generated
     */
    boolean isSetRefersToAnyLN();

} // ClientLN
