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
 * A representation of the model object '<em><b>Rpt Enabled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getMax <em>Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getClientLN <em>Client LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getParentReportControl <em>Parent Report Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRptEnabled()
 * @model
 * @generated
 */
public interface RptEnabled extends UnNaming {
    /**
     * Returns the value of the '<em><b>Max</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max</em>' attribute.
     * @see #isSetMax()
     * @see #unsetMax()
     * @see #setMax(Integer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRptEnabled_Max()
     * @model default="1" unsettable="true"
     * @generated
     */
    Integer getMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max</em>' attribute.
     * @see #isSetMax()
     * @see #unsetMax()
     * @see #getMax()
     * @generated
     */
    void setMax( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetMax()
     * @see #getMax()
     * @see #setMax(Integer)
     * @generated
     */
    void unsetMax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getMax <em>Max</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max</em>' attribute is set.
     * @see #unsetMax()
     * @see #getMax()
     * @see #setMax(Integer)
     * @generated
     */
    boolean isSetMax();

    /**
     * Returns the value of the '<em><b>Client LN</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getParentRptEnabled <em>Parent Rpt Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Client LN</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Client LN</em>' containment reference list.
     * @see #isSetClientLN()
     * @see #unsetClientLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRptEnabled_ClientLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getParentRptEnabled
     * @model opposite="ParentRptEnabled" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< ClientLN > getClientLN();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getClientLN <em>Client LN</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetClientLN()
     * @see #getClientLN()
     * @generated
     */
    void unsetClientLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getClientLN <em>Client LN</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Client LN</em>' containment reference list is set.
     * @see #unsetClientLN()
     * @see #getClientLN()
     * @generated
     */
    boolean isSetClientLN();

    /**
     * Returns the value of the '<em><b>Parent Report Control</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptEnabled <em>Rpt Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Report Control</em>' container reference.
     * @see #setParentReportControl(ReportControl)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRptEnabled_ParentReportControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptEnabled
     * @model opposite="RptEnabled" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ReportControl getParentReportControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getParentReportControl <em>Parent Report Control</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Report Control</em>' container reference.
     * @see #getParentReportControl()
     * @generated
     */
    void setParentReportControl( ReportControl value );

} // RptEnabled
