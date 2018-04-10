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
 * A representation of the model object '<em><b>Cert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getIdHierarchy <em>Id Hierarchy</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCert()
 * @model
 * @generated
 */
public interface Cert extends SclObject {
    /**
     * Returns the value of the '<em><b>Common Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Common Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Common Name</em>' attribute.
     * @see #isSetCommonName()
     * @see #unsetCommonName()
     * @see #setCommonName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCert_CommonName()
     * @model unsettable="true"
     * @generated
     */
    String getCommonName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getCommonName <em>Common Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Common Name</em>' attribute.
     * @see #isSetCommonName()
     * @see #unsetCommonName()
     * @see #getCommonName()
     * @generated
     */
    void setCommonName(String value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getCommonName <em>Common Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCommonName()
     * @see #getCommonName()
     * @see #setCommonName(String)
     * @generated
     */
    void unsetCommonName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getCommonName <em>Common Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Common Name</em>' attribute is set.
     * @see #unsetCommonName()
     * @see #getCommonName()
     * @see #setCommonName(String)
     * @generated
     */
    boolean isSetCommonName();

    /**
     * Returns the value of the '<em><b>Id Hierarchy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id Hierarchy</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id Hierarchy</em>' attribute.
     * @see #isSetIdHierarchy()
     * @see #unsetIdHierarchy()
     * @see #setIdHierarchy(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getCert_IdHierarchy()
     * @model unsettable="true"
     * @generated
     */
    String getIdHierarchy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getIdHierarchy <em>Id Hierarchy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id Hierarchy</em>' attribute.
     * @see #isSetIdHierarchy()
     * @see #unsetIdHierarchy()
     * @see #getIdHierarchy()
     * @generated
     */
    void setIdHierarchy(String value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getIdHierarchy <em>Id Hierarchy</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIdHierarchy()
     * @see #getIdHierarchy()
     * @see #setIdHierarchy(String)
     * @generated
     */
    void unsetIdHierarchy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getIdHierarchy <em>Id Hierarchy</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Id Hierarchy</em>' attribute is set.
     * @see #unsetIdHierarchy()
     * @see #getIdHierarchy()
     * @see #setIdHierarchy(String)
     * @generated
     */
    boolean isSetIdHierarchy();

} // Cert
