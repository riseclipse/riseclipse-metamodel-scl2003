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
 * A representation of the model object '<em><b>KDC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getApName <em>Ap Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getParentIED <em>Parent IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getRefersToAccessPoint <em>Refers To Access Point</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getKDC()
 * @model
 * @generated
 */
public interface KDC extends SclObject {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getKDC_ApName()
     * @model unsettable="true"
     * @generated
     */
    String getApName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getApName <em>Ap Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getApName <em>Ap Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApName()
     * @see #getApName()
     * @see #setApName(String)
     * @generated
     */
    void unsetApName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getApName <em>Ap Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ied Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ied Name</em>' attribute.
     * @see #isSetIedName()
     * @see #unsetIedName()
     * @see #setIedName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getKDC_IedName()
     * @model unsettable="true"
     * @generated
     */
    String getIedName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getIedName <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ied Name</em>' attribute.
     * @see #isSetIedName()
     * @see #unsetIedName()
     * @see #getIedName()
     * @generated
     */
    void setIedName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getIedName <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIedName()
     * @see #getIedName()
     * @see #setIedName(String)
     * @generated
     */
    void unsetIedName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getIedName <em>Ied Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ied Name</em>' attribute is set.
     * @see #unsetIedName()
     * @see #getIedName()
     * @see #setIedName(String)
     * @generated
     */
    boolean isSetIedName();

    /**
     * Returns the value of the '<em><b>Parent IED</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getKDC <em>KDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent IED</em>' container reference.
     * @see #setParentIED(IED)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getKDC_ParentIED()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getKDC
     * @model opposite="KDC" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    IED getParentIED();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getParentIED <em>Parent IED</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent IED</em>' container reference.
     * @see #getParentIED()
     * @generated
     */
    void setParentIED( IED value );

    /**
     * Returns the value of the '<em><b>Refers To Access Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByKDC <em>Referred By KDC</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getKDC_RefersToAccessPoint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByKDC
     * @model opposite="ReferredByKDC" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AccessPoint getRefersToAccessPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getRefersToAccessPoint <em>Refers To Access Point</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getRefersToAccessPoint <em>Refers To Access Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAccessPoint()
     * @see #getRefersToAccessPoint()
     * @see #setRefersToAccessPoint(AccessPoint)
     * @generated
     */
    void unsetRefersToAccessPoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getRefersToAccessPoint <em>Refers To Access Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Access Point</em>' reference is set.
     * @see #unsetRefersToAccessPoint()
     * @see #getRefersToAccessPoint()
     * @see #setRefersToAccessPoint(AccessPoint)
     * @generated
     */
    boolean isSetRefersToAccessPoint();

} // KDC
