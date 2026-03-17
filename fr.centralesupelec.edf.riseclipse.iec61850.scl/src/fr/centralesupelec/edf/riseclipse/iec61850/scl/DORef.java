/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DO Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnUuid <em>Ln Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPDO <em>PDO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPLN <em>PLN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDORef()
 * @model abstract="true"
 * @generated
 */
public interface DORef extends BaseElement, AgUuid, AgDesc {
    /**
     * Returns the value of the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Do Name</em>' attribute.
     * @see #isSetDoName()
     * @see #unsetDoName()
     * @see #setDoName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDORef_DoName()
     * @model unsettable="true"
     * @generated
     */
    String getDoName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getDoName <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Do Name</em>' attribute.
     * @see #isSetDoName()
     * @see #unsetDoName()
     * @see #getDoName()
     * @generated
     */
    void setDoName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getDoName <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDoName()
     * @see #getDoName()
     * @see #setDoName(String)
     * @generated
     */
    void unsetDoName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getDoName <em>Do Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Do Name</em>' attribute is set.
     * @see #unsetDoName()
     * @see #getDoName()
     * @see #setDoName(String)
     * @generated
     */
    boolean isSetDoName();

    /**
     * Returns the value of the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ied Name</em>' attribute.
     * @see #isSetIedName()
     * @see #unsetIedName()
     * @see #setIedName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDORef_IedName()
     * @model unsettable="true"
     * @generated
     */
    String getIedName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getIedName <em>Ied Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getIedName <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIedName()
     * @see #getIedName()
     * @see #setIedName(String)
     * @generated
     */
    void unsetIedName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getIedName <em>Ied Name</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDORef_LdInst()
     * @model unsettable="true"
     * @generated
     */
    String getLdInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLdInst <em>Ld Inst</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLdInst <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    void unsetLdInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLdInst <em>Ld Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ld Inst</em>' attribute is set.
     * @see #unsetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    boolean isSetLdInst();

    /**
     * Returns the value of the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Class</em>' attribute.
     * @see #isSetLnClass()
     * @see #unsetLnClass()
     * @see #setLnClass(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDORef_LnClass()
     * @model unsettable="true"
     * @generated
     */
    String getLnClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnClass <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ln Class</em>' attribute.
     * @see #isSetLnClass()
     * @see #unsetLnClass()
     * @see #getLnClass()
     * @generated
     */
    void setLnClass( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnClass <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnClass()
     * @see #getLnClass()
     * @see #setLnClass(String)
     * @generated
     */
    void unsetLnClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnClass <em>Ln Class</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ln Class</em>' attribute is set.
     * @see #unsetLnClass()
     * @see #getLnClass()
     * @see #setLnClass(String)
     * @generated
     */
    boolean isSetLnClass();

    /**
     * Returns the value of the '<em><b>Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Inst</em>' attribute.
     * @see #isSetLnInst()
     * @see #unsetLnInst()
     * @see #setLnInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDORef_LnInst()
     * @model unsettable="true"
     * @generated
     */
    String getLnInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnInst <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ln Inst</em>' attribute.
     * @see #isSetLnInst()
     * @see #unsetLnInst()
     * @see #getLnInst()
     * @generated
     */
    void setLnInst( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnInst <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnInst()
     * @see #getLnInst()
     * @see #setLnInst(String)
     * @generated
     */
    void unsetLnInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnInst <em>Ln Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ln Inst</em>' attribute is set.
     * @see #unsetLnInst()
     * @see #getLnInst()
     * @see #setLnInst(String)
     * @generated
     */
    boolean isSetLnInst();

    /**
     * Returns the value of the '<em><b>Ln Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Uuid</em>' attribute.
     * @see #isSetLnUuid()
     * @see #unsetLnUuid()
     * @see #setLnUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDORef_LnUuid()
     * @model unsettable="true"
     * @generated
     */
    String getLnUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnUuid <em>Ln Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ln Uuid</em>' attribute.
     * @see #isSetLnUuid()
     * @see #unsetLnUuid()
     * @see #getLnUuid()
     * @generated
     */
    void setLnUuid( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnUuid <em>Ln Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnUuid()
     * @see #getLnUuid()
     * @see #setLnUuid(String)
     * @generated
     */
    void unsetLnUuid();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getLnUuid <em>Ln Uuid</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ln Uuid</em>' attribute is set.
     * @see #unsetLnUuid()
     * @see #getLnUuid()
     * @see #setLnUuid(String)
     * @generated
     */
    boolean isSetLnUuid();

    /**
     * Returns the value of the '<em><b>PDO</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>PDO</em>' attribute.
     * @see #isSetPDO()
     * @see #unsetPDO()
     * @see #setPDO(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDORef_PDO()
     * @model unsettable="true"
     * @generated
     */
    String getPDO();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPDO <em>PDO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PDO</em>' attribute.
     * @see #isSetPDO()
     * @see #unsetPDO()
     * @see #getPDO()
     * @generated
     */
    void setPDO( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPDO <em>PDO</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPDO()
     * @see #getPDO()
     * @see #setPDO(String)
     * @generated
     */
    void unsetPDO();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPDO <em>PDO</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PDO</em>' attribute is set.
     * @see #unsetPDO()
     * @see #getPDO()
     * @see #setPDO(String)
     * @generated
     */
    boolean isSetPDO();

    /**
     * Returns the value of the '<em><b>PLN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>PLN</em>' attribute.
     * @see #isSetPLN()
     * @see #unsetPLN()
     * @see #setPLN(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDORef_PLN()
     * @model unsettable="true"
     * @generated
     */
    String getPLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPLN <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PLN</em>' attribute.
     * @see #isSetPLN()
     * @see #unsetPLN()
     * @see #getPLN()
     * @generated
     */
    void setPLN( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPLN <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPLN()
     * @see #getPLN()
     * @see #setPLN(String)
     * @generated
     */
    void unsetPLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPLN <em>PLN</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PLN</em>' attribute is set.
     * @see #unsetPLN()
     * @see #getPLN()
     * @see #setPLN(String)
     * @generated
     */
    boolean isSetPLN();

    /**
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #setPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDORef_Prefix()
     * @model unsettable="true"
     * @generated
     */
    String getPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPrefix <em>Prefix</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    void unsetPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DORef#getPrefix <em>Prefix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefix</em>' attribute is set.
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    boolean isSetPrefix();

} // DORef
