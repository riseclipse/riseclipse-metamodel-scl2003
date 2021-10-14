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
 * A representation of the model object '<em><b>Ag LD Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getLdInst <em>Ld Inst</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgLDRef()
 * @model abstract="true"
 * @generated
 */
public interface AgLDRef extends AgDesc {
    /**
     * Returns the value of the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ied Name</em>' attribute.
     * @see #isSetIedName()
     * @see #unsetIedName()
     * @see #setIedName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgLDRef_IedName()
     * @model unsettable="true"
     * @generated
     */
    String getIedName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getIedName <em>Ied Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getIedName <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIedName()
     * @see #getIedName()
     * @see #setIedName(String)
     * @generated
     */
    void unsetIedName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getIedName <em>Ied Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ld Inst</em>' attribute.
     * @see #isSetLdInst()
     * @see #unsetLdInst()
     * @see #setLdInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgLDRef_LdInst()
     * @model unsettable="true"
     * @generated
     */
    String getLdInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getLdInst <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ld Inst</em>' attribute.
     * @see #isSetLdInst()
     * @see #unsetLdInst()
     * @see #getLdInst()
     * @generated
     */
    void setLdInst( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getLdInst <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    void unsetLdInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getLdInst <em>Ld Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ld Inst</em>' attribute is set.
     * @see #unsetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    boolean isSetLdInst();

} // AgLDRef
