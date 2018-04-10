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
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getAssociationID <em>Association ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getIedName <em>Ied Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLdInst <em>Ld Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLnInst <em>Ln Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getServer <em>Server</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends BaseElement {
    /**
     * Returns the value of the '<em><b>Association ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Association ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Association ID</em>' attribute.
     * @see #isSetAssociationID()
     * @see #unsetAssociationID()
     * @see #setAssociationID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAssociation_AssociationID()
     * @model unsettable="true"
     * @generated
     */
    String getAssociationID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getAssociationID <em>Association ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Association ID</em>' attribute.
     * @see #isSetAssociationID()
     * @see #unsetAssociationID()
     * @see #getAssociationID()
     * @generated
     */
    void setAssociationID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getAssociationID <em>Association ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssociationID()
     * @see #getAssociationID()
     * @see #setAssociationID(String)
     * @generated
     */
    void unsetAssociationID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getAssociationID <em>Association ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Association ID</em>' attribute is set.
     * @see #unsetAssociationID()
     * @see #getAssociationID()
     * @see #setAssociationID(String)
     * @generated
     */
    boolean isSetAssociationID();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAssociation_IedName()
     * @model unsettable="true"
     * @generated
     */
    String getIedName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getIedName <em>Ied Name</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getIedName <em>Ied Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIedName()
     * @see #getIedName()
     * @see #setIedName(String)
     * @generated
     */
    void unsetIedName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getIedName <em>Ied Name</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AssociationKindEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AssociationKindEnum
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(AssociationKindEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAssociation_Kind()
     * @model unsettable="true"
     * @generated
     */
    AssociationKindEnum getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AssociationKindEnum
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( AssociationKindEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(AssociationKindEnum)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(AssociationKindEnum)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ld Inst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ld Inst</em>' attribute.
     * @see #isSetLdInst()
     * @see #unsetLdInst()
     * @see #setLdInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAssociation_LdInst()
     * @model unsettable="true"
     * @generated
     */
    String getLdInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLdInst <em>Ld Inst</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLdInst <em>Ld Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLdInst()
     * @see #getLdInst()
     * @see #setLdInst(String)
     * @generated
     */
    void unsetLdInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLdInst <em>Ld Inst</em>}' attribute is set.
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
     * <p>
     * If the meaning of the '<em>Ln Class</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Class</em>' attribute.
     * @see #isSetLnClass()
     * @see #unsetLnClass()
     * @see #setLnClass(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAssociation_LnClass()
     * @model unsettable="true"
     * @generated
     */
    String getLnClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLnClass <em>Ln Class</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLnClass <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnClass()
     * @see #getLnClass()
     * @see #setLnClass(String)
     * @generated
     */
    void unsetLnClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLnClass <em>Ln Class</em>}' attribute is set.
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
     * <p>
     * If the meaning of the '<em>Ln Inst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Inst</em>' attribute.
     * @see #isSetLnInst()
     * @see #unsetLnInst()
     * @see #setLnInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAssociation_LnInst()
     * @model unsettable="true"
     * @generated
     */
    String getLnInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLnInst <em>Ln Inst</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLnInst <em>Ln Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnInst()
     * @see #getLnInst()
     * @see #setLnInst(String)
     * @generated
     */
    void unsetLnInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getLnInst <em>Ln Inst</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAssociation_Prefix()
     * @model unsettable="true"
     * @generated
     */
    String getPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getPrefix <em>Prefix</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    void unsetPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getPrefix <em>Prefix</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Server</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAssociation <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Server</em>' container reference.
     * @see #setServer(Server)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAssociation_Server()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAssociation
     * @model opposite="Association" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Server getServer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getServer <em>Server</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Server</em>' container reference.
     * @see #getServer()
     * @generated
     */
    void setServer( Server value );

    /**
     * Returns the value of the '<em><b>Refers To Any LN</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByAssociation <em>Referred By Association</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAssociation_RefersToAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByAssociation
     * @model opposite="ReferredByAssociation" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AnyLN getRefersToAnyLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Any LN</em>' reference.
     * @see #isSetRefersToAnyLN()
     * @see #unsetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @generated
     */
    void setRefersToAnyLN(AnyLN value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @generated
     */
    void unsetRefersToAnyLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getRefersToAnyLN <em>Refers To Any LN</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Any LN</em>' reference is set.
     * @see #unsetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @generated
     */
    boolean isSetRefersToAnyLN();

} // Association
