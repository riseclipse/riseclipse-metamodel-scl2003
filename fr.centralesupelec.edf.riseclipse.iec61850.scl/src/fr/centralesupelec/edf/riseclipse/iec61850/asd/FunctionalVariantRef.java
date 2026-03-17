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
package fr.centralesupelec.edf.riseclipse.iec61850.asd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Variant Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a ref to a functional variant of the Application
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getFunctionalVariant <em>Functional Variant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getFunctionalVariantUuid <em>Functional Variant Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getUpdate <em>Update</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getParentFunctionalVariantRefContainer <em>Parent Functional Variant Ref Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getRefersToFunctionalVariant <em>Refers To Functional Variant</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariantRef()
 * @model
 * @generated
 */
public interface FunctionalVariantRef extends BaseExtensionElement {
    /**
     * Returns the value of the '<em><b>Functional Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the variant
     * <!-- end-model-doc -->
     * @return the value of the '<em>Functional Variant</em>' attribute.
     * @see #setFunctionalVariant(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariantRef_FunctionalVariant()
     * @model extendedMetaData="kind='attribute' name='functionalVariant'"
     * @generated
     */
    String getFunctionalVariant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getFunctionalVariant <em>Functional Variant</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Functional Variant</em>' attribute.
     * @see #getFunctionalVariant()
     * @generated
     */
    void setFunctionalVariant( String value );

    /**
     * Returns the value of the '<em><b>Functional Variant Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the variant
     * <!-- end-model-doc -->
     * @return the value of the '<em>Functional Variant Uuid</em>' attribute.
     * @see #setFunctionalVariantUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariantRef_FunctionalVariantUuid()
     * @model extendedMetaData="kind='attribute' name='functionalVariantUuid'"
     * @generated
     */
    String getFunctionalVariantUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getFunctionalVariantUuid <em>Functional Variant Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Functional Variant Uuid</em>' attribute.
     * @see #getFunctionalVariantUuid()
     * @generated
     */
    void setFunctionalVariantUuid( String value );

    /**
     * Returns the value of the '<em><b>Update</b></em>' attribute.
     * The default value is <code>"add"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.UpdateEnum}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * kind of update to apply to the variant
     * <!-- end-model-doc -->
     * @return the value of the '<em>Update</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.UpdateEnum
     * @see #isSetUpdate()
     * @see #unsetUpdate()
     * @see #setUpdate(UpdateEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariantRef_Update()
     * @model default="add" unsettable="true"
     *        extendedMetaData="kind='attribute' name='update'"
     * @generated
     */
    UpdateEnum getUpdate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getUpdate <em>Update</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Update</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.UpdateEnum
     * @see #isSetUpdate()
     * @see #unsetUpdate()
     * @see #getUpdate()
     * @generated
     */
    void setUpdate( UpdateEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getUpdate <em>Update</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUpdate()
     * @see #getUpdate()
     * @see #setUpdate(UpdateEnum)
     * @generated
     */
    void unsetUpdate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getUpdate <em>Update</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Update</em>' attribute is set.
     * @see #unsetUpdate()
     * @see #getUpdate()
     * @see #setUpdate(UpdateEnum)
     * @generated
     */
    boolean isSetUpdate();

    /**
     * Returns the value of the '<em><b>Parent Functional Variant Ref Container</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer#getFunctionalVariantRef <em>Functional Variant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Functional Variant Ref Container</em>' container reference.
     * @see #setParentFunctionalVariantRefContainer(FunctionalVariantRefContainer)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariantRef_ParentFunctionalVariantRefContainer()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer#getFunctionalVariantRef
     * @model opposite="FunctionalVariantRef" unsettable="true" ordered="false"
     * @generated
     */
    FunctionalVariantRefContainer getParentFunctionalVariantRefContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getParentFunctionalVariantRefContainer <em>Parent Functional Variant Ref Container</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Functional Variant Ref Container</em>' container reference.
     * @see #getParentFunctionalVariantRefContainer()
     * @generated
     */
    void setParentFunctionalVariantRefContainer( FunctionalVariantRefContainer value );

    /**
     * Returns the value of the '<em><b>Refers To Functional Variant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getReferredByFunctionalVariantRef <em>Referred By Functional Variant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Functional Variant</em>' reference.
     * @see #isSetRefersToFunctionalVariant()
     * @see #unsetRefersToFunctionalVariant()
     * @see #setRefersToFunctionalVariant(FunctionalVariant)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariantRef_RefersToFunctionalVariant()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getReferredByFunctionalVariantRef
     * @model opposite="ReferredByFunctionalVariantRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    FunctionalVariant getRefersToFunctionalVariant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getRefersToFunctionalVariant <em>Refers To Functional Variant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Functional Variant</em>' reference.
     * @see #isSetRefersToFunctionalVariant()
     * @see #unsetRefersToFunctionalVariant()
     * @see #getRefersToFunctionalVariant()
     * @generated
     */
    void setRefersToFunctionalVariant( FunctionalVariant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getRefersToFunctionalVariant <em>Refers To Functional Variant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToFunctionalVariant()
     * @see #getRefersToFunctionalVariant()
     * @see #setRefersToFunctionalVariant(FunctionalVariant)
     * @generated
     */
    void unsetRefersToFunctionalVariant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getRefersToFunctionalVariant <em>Refers To Functional Variant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Functional Variant</em>' reference is set.
     * @see #unsetRefersToFunctionalVariant()
     * @see #getRefersToFunctionalVariant()
     * @see #setRefersToFunctionalVariant(FunctionalVariant)
     * @generated
     */
    boolean isSetRefersToFunctionalVariant();

} // FunctionalVariantRef
