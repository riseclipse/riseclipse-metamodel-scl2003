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
 * A representation of the model object '<em><b>LNode Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getDO <em>DO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByAnyLN <em>Referred By Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByLNode <em>Referred By LNode</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNodeType()
 * @model
 * @generated
 */
public interface LNodeType extends IDNaming, INamespaceGetter {
    /**
     * Returns the value of the '<em><b>Ied Type</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ied Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ied Type</em>' attribute.
     * @see #isSetIedType()
     * @see #unsetIedType()
     * @see #setIedType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNodeType_IedType()
     * @model default="" unsettable="true"
     * @generated
     */
    String getIedType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getIedType <em>Ied Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ied Type</em>' attribute.
     * @see #isSetIedType()
     * @see #unsetIedType()
     * @see #getIedType()
     * @generated
     */
    void setIedType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getIedType <em>Ied Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIedType()
     * @see #getIedType()
     * @see #setIedType(String)
     * @generated
     */
    void unsetIedType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getIedType <em>Ied Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ied Type</em>' attribute is set.
     * @see #unsetIedType()
     * @see #getIedType()
     * @see #setIedType(String)
     * @generated
     */
    boolean isSetIedType();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNodeType_LnClass()
     * @model unsettable="true"
     * @generated
     */
    String getLnClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getLnClass <em>Ln Class</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getLnClass <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnClass()
     * @see #getLnClass()
     * @see #setLnClass(String)
     * @generated
     */
    void unsetLnClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getLnClass <em>Ln Class</em>}' attribute is set.
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
     * Returns the value of the '<em><b>DO</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getParentLNodeType <em>Parent LNode Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DO</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DO</em>' containment reference list.
     * @see #isSetDO()
     * @see #unsetDO()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNodeType_DO()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getParentLNodeType
     * @model opposite="ParentLNodeType" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< DO > getDO();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getDO <em>DO</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDO()
     * @see #getDO()
     * @generated
     */
    void unsetDO();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getDO <em>DO</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DO</em>' containment reference list is set.
     * @see #unsetDO()
     * @see #getDO()
     * @generated
     */
    boolean isSetDO();

    /**
     * Returns the value of the '<em><b>Parent Data Type Templates</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getLNodeType <em>LNode Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Data Type Templates</em>' container reference.
     * @see #setParentDataTypeTemplates(DataTypeTemplates)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNodeType_ParentDataTypeTemplates()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getLNodeType
     * @model opposite="LNodeType" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DataTypeTemplates getParentDataTypeTemplates();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Data Type Templates</em>' container reference.
     * @see #getParentDataTypeTemplates()
     * @generated
     */
    void setParentDataTypeTemplates( DataTypeTemplates value );

    /**
     * Returns the value of the '<em><b>Referred By Any LN</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getRefersToLNodeType <em>Refers To LNode Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Any LN</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Any LN</em>' reference list.
     * @see #isSetReferredByAnyLN()
     * @see #unsetReferredByAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNodeType_ReferredByAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getRefersToLNodeType
     * @model opposite="RefersToLNodeType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AnyLN > getReferredByAnyLN();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByAnyLN <em>Referred By Any LN</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAnyLN()
     * @see #getReferredByAnyLN()
     * @generated
     */
    void unsetReferredByAnyLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByAnyLN <em>Referred By Any LN</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Any LN</em>' reference list is set.
     * @see #unsetReferredByAnyLN()
     * @see #getReferredByAnyLN()
     * @generated
     */
    boolean isSetReferredByAnyLN();

    /**
     * Returns the value of the '<em><b>Referred By LNode</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToLNodeType <em>Refers To LNode Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By LNode</em>' reference list.
     * @see #isSetReferredByLNode()
     * @see #unsetReferredByLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLNodeType_ReferredByLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToLNodeType
     * @model opposite="RefersToLNodeType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< LNode > getReferredByLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByLNode <em>Referred By LNode</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByLNode()
     * @see #getReferredByLNode()
     * @generated
     */
    void unsetReferredByLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByLNode <em>Referred By LNode</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By LNode</em>' reference list is set.
     * @see #unsetReferredByLNode()
     * @see #getReferredByLNode()
     * @generated
     */
    boolean isSetReferredByLNode();

} // LNodeType
