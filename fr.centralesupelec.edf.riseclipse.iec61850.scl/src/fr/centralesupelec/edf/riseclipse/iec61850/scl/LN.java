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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentAccessPoint <em>Parent Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentLDevice <em>Parent LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getRefersToGSEControl <em>Refers To GSE Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN()
 * @model
 * @generated
 */
public interface LN extends AnyLN {
    /**
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #setPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN_Prefix()
     * @model default="" unsettable="true"
     * @generated
     */
    String getPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @generated
     */
    void setPrefix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    void unsetPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getPrefix <em>Prefix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefix</em>' attribute is set.
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    boolean isSetPrefix();

    /**
     * Returns the value of the '<em><b>Parent Access Point</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getLN <em>LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Access Point</em>' container reference.
     * @see #setParentAccessPoint(AccessPoint)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN_ParentAccessPoint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getLN
     * @model opposite="LN" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AccessPoint getParentAccessPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentAccessPoint <em>Parent Access Point</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Access Point</em>' container reference.
     * @see #getParentAccessPoint()
     * @generated
     */
    void setParentAccessPoint( AccessPoint value );

    /**
     * Returns the value of the '<em><b>Parent LDevice</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN <em>LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LDevice</em>' container reference.
     * @see #setParentLDevice(LDevice)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN_ParentLDevice()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN
     * @model opposite="LN" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    @Override
    LDevice getParentLDevice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentLDevice <em>Parent LDevice</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LDevice</em>' container reference.
     * @see #getParentLDevice()
     * @generated
     */
    void setParentLDevice( LDevice value );

    /**
     * Returns the value of the '<em><b>Refers To GSE Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getReferredByLSVS <em>Referred By LSVS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To GSE Control</em>' reference.
     * @see #isSetRefersToGSEControl()
     * @see #unsetRefersToGSEControl()
     * @see #setRefersToGSEControl(GSEControl)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN_RefersToGSEControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getReferredByLSVS
     * @model opposite="ReferredByLSVS" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    GSEControl getRefersToGSEControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getRefersToGSEControl <em>Refers To GSE Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To GSE Control</em>' reference.
     * @see #isSetRefersToGSEControl()
     * @see #unsetRefersToGSEControl()
     * @see #getRefersToGSEControl()
     * @generated
     */
    void setRefersToGSEControl( GSEControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getRefersToGSEControl <em>Refers To GSE Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToGSEControl()
     * @see #getRefersToGSEControl()
     * @see #setRefersToGSEControl(GSEControl)
     * @generated
     */
    void unsetRefersToGSEControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getRefersToGSEControl <em>Refers To GSE Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To GSE Control</em>' reference is set.
     * @see #unsetRefersToGSEControl()
     * @see #getRefersToGSEControl()
     * @see #setRefersToGSEControl(GSEControl)
     * @generated
     */
    boolean isSetRefersToGSEControl();

} // LN
