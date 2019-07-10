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
 * A representation of the model object '<em><b>Server At</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getApName <em>Ap Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getParentAccessPoint <em>Parent Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getRefersToAccessPoint <em>Refers To Access Point</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServerAt()
 * @model
 * @generated
 */
public interface ServerAt extends UnNaming {
    /**
     * Returns the value of the '<em><b>Ap Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ap Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ap Name</em>' attribute.
     * @see #isSetApName()
     * @see #unsetApName()
     * @see #setApName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServerAt_ApName()
     * @model unsettable="true"
     * @generated
     */
    String getApName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getApName <em>Ap Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ap Name</em>' attribute.
     * @see #isSetApName()
     * @see #unsetApName()
     * @see #getApName()
     * @generated
     */
    void setApName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getApName <em>Ap Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApName()
     * @see #getApName()
     * @see #setApName(String)
     * @generated
     */
    void unsetApName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getApName <em>Ap Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ap Name</em>' attribute is set.
     * @see #unsetApName()
     * @see #getApName()
     * @see #setApName(String)
     * @generated
     */
    boolean isSetApName();

    /**
     * Returns the value of the '<em><b>Parent Access Point</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServerAt <em>Server At</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Access Point</em>' container reference.
     * @see #setParentAccessPoint(AccessPoint)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServerAt_ParentAccessPoint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServerAt
     * @model opposite="ServerAt" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AccessPoint getParentAccessPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getParentAccessPoint <em>Parent Access Point</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Access Point</em>' container reference.
     * @see #getParentAccessPoint()
     * @generated
     */
    void setParentAccessPoint( AccessPoint value );

    /**
     * Returns the value of the '<em><b>Refers To Access Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByServerAt <em>Referred By Server At</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Access Point</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Access Point</em>' reference.
     * @see #isSetRefersToAccessPoint()
     * @see #unsetRefersToAccessPoint()
     * @see #setRefersToAccessPoint(AccessPoint)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServerAt_RefersToAccessPoint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByServerAt
     * @model opposite="ReferredByServerAt" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AccessPoint getRefersToAccessPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getRefersToAccessPoint <em>Refers To Access Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Access Point</em>' reference.
     * @see #isSetRefersToAccessPoint()
     * @see #unsetRefersToAccessPoint()
     * @see #getRefersToAccessPoint()
     * @generated
     */
    void setRefersToAccessPoint( AccessPoint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getRefersToAccessPoint <em>Refers To Access Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAccessPoint()
     * @see #getRefersToAccessPoint()
     * @see #setRefersToAccessPoint(AccessPoint)
     * @generated
     */
    void unsetRefersToAccessPoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getRefersToAccessPoint <em>Refers To Access Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Access Point</em>' reference is set.
     * @see #unsetRefersToAccessPoint()
     * @see #getRefersToAccessPoint()
     * @see #setRefersToAccessPoint(AccessPoint)
     * @generated
     */
    boolean isSetRefersToAccessPoint();

} // ServerAt
