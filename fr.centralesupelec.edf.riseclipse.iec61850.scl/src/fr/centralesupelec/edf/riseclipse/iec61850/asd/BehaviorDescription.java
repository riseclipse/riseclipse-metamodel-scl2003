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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the BehaviorDescription element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getInputVar <em>Input Var</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getOutputVar <em>Output Var</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getBehaviorReference <em>Behavior Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getFileReference <em>File Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getFormat <em>Format</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSimulation <em>Is Simulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSpecification <em>Is Specification</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getReferredByBehaviorDescriptionRef <em>Referred By Behavior Description Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription()
 * @model extendedMetaData="name='BehaviorDescription' kind='elementOnly'"
 * @generated
 */
public interface BehaviorDescription extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Input Var</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getParentBehaviorDescription <em>Parent Behavior Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input variable used in the behavior description
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Var</em>' containment reference list.
     * @see #isSetInputVar()
     * @see #unsetInputVar()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_InputVar()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getParentBehaviorDescription
     * @model opposite="ParentBehaviorDescription" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='InputVar' namespace='##targetNamespace'"
     * @generated
     */
    EList< InputVar > getInputVar();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getInputVar <em>Input Var</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInputVar()
     * @see #getInputVar()
     * @generated
     */
    void unsetInputVar();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getInputVar <em>Input Var</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Input Var</em>' containment reference list is set.
     * @see #unsetInputVar()
     * @see #getInputVar()
     * @generated
     */
    boolean isSetInputVar();

    /**
     * Returns the value of the '<em><b>Output Var</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getParentBehaviorDescription <em>Parent Behavior Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Output variable used in the behavior description
     * <!-- end-model-doc -->
     * @return the value of the '<em>Output Var</em>' containment reference list.
     * @see #isSetOutputVar()
     * @see #unsetOutputVar()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_OutputVar()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getParentBehaviorDescription
     * @model opposite="ParentBehaviorDescription" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='OutputVar' namespace='##targetNamespace'"
     * @generated
     */
    EList< OutputVar > getOutputVar();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getOutputVar <em>Output Var</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutputVar()
     * @see #getOutputVar()
     * @generated
     */
    void unsetOutputVar();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getOutputVar <em>Output Var</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Output Var</em>' containment reference list is set.
     * @see #unsetOutputVar()
     * @see #getOutputVar()
     * @generated
     */
    boolean isSetOutputVar();

    /**
     * Returns the value of the '<em><b>Behavior Reference</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getParentBehaviorDescription <em>Parent Behavior Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference to a behavior description when for example a manufacturer wants to indicate its implementation of a user specification described by another behavior description
     * <!-- end-model-doc -->
     * @return the value of the '<em>Behavior Reference</em>' containment reference list.
     * @see #isSetBehaviorReference()
     * @see #unsetBehaviorReference()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_BehaviorReference()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getParentBehaviorDescription
     * @model opposite="ParentBehaviorDescription" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='BehaviorReference' namespace='##targetNamespace'"
     * @generated
     */
    EList< BehaviorReference > getBehaviorReference();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getBehaviorReference <em>Behavior Reference</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBehaviorReference()
     * @see #getBehaviorReference()
     * @generated
     */
    void unsetBehaviorReference();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getBehaviorReference <em>Behavior Reference</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Behavior Reference</em>' containment reference list is set.
     * @see #unsetBehaviorReference()
     * @see #getBehaviorReference()
     * @generated
     */
    boolean isSetBehaviorReference();

    /**
     * Returns the value of the '<em><b>File Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Path to the behavior description file
     * <!-- end-model-doc -->
     * @return the value of the '<em>File Reference</em>' attribute.
     * @see #setFileReference(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_FileReference()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='fileReference'"
     * @generated
     */
    String getFileReference();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getFileReference <em>File Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Reference</em>' attribute.
     * @see #getFileReference()
     * @generated
     */
    void setFileReference( String value );

    /**
     * Returns the value of the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identification of the behavior description format
     * <!-- end-model-doc -->
     * @return the value of the '<em>Format</em>' attribute.
     * @see #setFormat(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_Format()
     * @model extendedMetaData="kind='attribute' name='format'"
     * @generated
     */
    int getFormat();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getFormat <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Format</em>' attribute.
     * @see #getFormat()
     * @generated
     */
    void setFormat( int value );

    /**
     * Returns the value of the '<em><b>Is Simulation</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * indication that the behavior description is used for simulation
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Simulation</em>' attribute.
     * @see #isSetIsSimulation()
     * @see #unsetIsSimulation()
     * @see #setIsSimulation(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_IsSimulation()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isSimulation'"
     * @generated
     */
    boolean isIsSimulation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSimulation <em>Is Simulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Simulation</em>' attribute.
     * @see #isSetIsSimulation()
     * @see #unsetIsSimulation()
     * @see #isIsSimulation()
     * @generated
     */
    void setIsSimulation( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSimulation <em>Is Simulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsSimulation()
     * @see #isIsSimulation()
     * @see #setIsSimulation(boolean)
     * @generated
     */
    void unsetIsSimulation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSimulation <em>Is Simulation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Simulation</em>' attribute is set.
     * @see #unsetIsSimulation()
     * @see #isIsSimulation()
     * @see #setIsSimulation(boolean)
     * @generated
     */
    boolean isSetIsSimulation();

    /**
     * Returns the value of the '<em><b>Is Specification</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * indication that the behavior description is used for specification
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Specification</em>' attribute.
     * @see #isSetIsSpecification()
     * @see #unsetIsSpecification()
     * @see #setIsSpecification(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_IsSpecification()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isSpecification'"
     * @generated
     */
    boolean isIsSpecification();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSpecification <em>Is Specification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Specification</em>' attribute.
     * @see #isSetIsSpecification()
     * @see #unsetIsSpecification()
     * @see #isIsSpecification()
     * @generated
     */
    void setIsSpecification( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSpecification <em>Is Specification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsSpecification()
     * @see #isIsSpecification()
     * @see #setIsSpecification(boolean)
     * @generated
     */
    void unsetIsSpecification();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSpecification <em>Is Specification</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Specification</em>' attribute is set.
     * @see #unsetIsSpecification()
     * @see #isIsSpecification()
     * @see #setIsSpecification(boolean)
     * @generated
     */
    boolean isSetIsSpecification();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the behavior description.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_Name()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Returns the value of the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Origin Uuid</em>' attribute.
     * @see #setOriginUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_OriginUuid()
     * @model extendedMetaData="kind='attribute' name='originUuid'"
     * @generated
     */
    String getOriginUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getOriginUuid <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Origin Uuid</em>' attribute.
     * @see #getOriginUuid()
     * @generated
     */
    void setOriginUuid( String value );

    /**
     * Returns the value of the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template Uuid</em>' attribute.
     * @see #setTemplateUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_TemplateUuid()
     * @model extendedMetaData="kind='attribute' name='templateUuid'"
     * @generated
     */
    String getTemplateUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getTemplateUuid <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template Uuid</em>' attribute.
     * @see #getTemplateUuid()
     * @generated
     */
    void setTemplateUuid( String value );

    /**
     * Returns the value of the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uuid</em>' attribute.
     * @see #setUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_Uuid()
     * @model extendedMetaData="kind='attribute' name='uuid'"
     * @generated
     */
    String getUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getUuid <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uuid</em>' attribute.
     * @see #getUuid()
     * @generated
     */
    void setUuid( String value );

    /**
     * Returns the value of the '<em><b>Referred By Behavior Description Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getRefersToBehaviorDescription <em>Refers To Behavior Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Behavior Description Ref</em>' reference list.
     * @see #isSetReferredByBehaviorDescriptionRef()
     * @see #unsetReferredByBehaviorDescriptionRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorDescription_ReferredByBehaviorDescriptionRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getRefersToBehaviorDescription
     * @model opposite="RefersToBehaviorDescription" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< BehaviorDescriptionRef > getReferredByBehaviorDescriptionRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getReferredByBehaviorDescriptionRef <em>Referred By Behavior Description Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByBehaviorDescriptionRef()
     * @see #getReferredByBehaviorDescriptionRef()
     * @generated
     */
    void unsetReferredByBehaviorDescriptionRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getReferredByBehaviorDescriptionRef <em>Referred By Behavior Description Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Behavior Description Ref</em>' reference list is set.
     * @see #unsetReferredByBehaviorDescriptionRef()
     * @see #getReferredByBehaviorDescriptionRef()
     * @generated
     */
    boolean isSetReferredByBehaviorDescriptionRef();

} // BehaviorDescription
