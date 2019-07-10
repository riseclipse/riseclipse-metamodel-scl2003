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
 * A representation of the model object '<em><b>Opt Fields</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getParentReportControl <em>Parent Report Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields()
 * @model
 * @generated
 */
public interface OptFields extends SclObject, AgOptFields {
    /**
     * Returns the value of the '<em><b>Parent Report Control</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getOptFields <em>Opt Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Report Control</em>' container reference.
     * @see #setParentReportControl(ReportControl)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getOptFields_ParentReportControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getOptFields
     * @model opposite="OptFields" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ReportControl getParentReportControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getParentReportControl <em>Parent Report Control</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Report Control</em>' container reference.
     * @see #getParentReportControl()
     * @generated
     */
    void setParentReportControl( ReportControl value );

} // OptFields
