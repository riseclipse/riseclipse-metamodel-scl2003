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
 * A representation of the model object '<em><b>Process Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to resources. Could refer any named process element or LNode
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getResource <em>Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getMax <em>Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getSelector <em>Selector</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getParentProcessResources <em>Parent Process Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByProcessResourceRef <em>Referred By Process Resource Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControllingLNode <em>Referred By Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredBySubscriberLNode <em>Referred By Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControlRef <em>Referred By Control Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredbySourceRef <em>Referredby Source Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource()
 * @model extendedMetaData="name='tProcessResource' kind='elementOnly'"
 * @generated
 */
public interface ProcessResource extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getParentProcessResource <em>Parent Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * resource bound to this element could be multi
     * <!-- end-model-doc -->
     * @return the value of the '<em>Resource</em>' containment reference list.
     * @see #isSetResource()
     * @see #unsetResource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_Resource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getParentProcessResource
     * @model opposite="ParentProcessResource" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Resource' namespace='##targetNamespace'"
     * @generated
     */
    EList< Resource > getResource();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getResource <em>Resource</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResource()
     * @see #getResource()
     * @generated
     */
    void unsetResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getResource <em>Resource</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resource</em>' containment reference list is set.
     * @see #unsetResource()
     * @see #getResource()
     * @generated
     */
    boolean isSetResource();

    /**
     * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
     * The default value is <code>"1..1"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This attribute indicates the multiple instances allowed for the current element.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cardinality</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum
     * @see #isSetCardinality()
     * @see #unsetCardinality()
     * @see #setCardinality(CardinalityEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_Cardinality()
     * @model default="1..1" unsettable="true"
     *        extendedMetaData="kind='attribute' name='cardinality'"
     * @generated
     */
    CardinalityEnum getCardinality();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getCardinality <em>Cardinality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cardinality</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum
     * @see #isSetCardinality()
     * @see #unsetCardinality()
     * @see #getCardinality()
     * @generated
     */
    void setCardinality( CardinalityEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getCardinality <em>Cardinality</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCardinality()
     * @see #getCardinality()
     * @see #setCardinality(CardinalityEnum)
     * @generated
     */
    void unsetCardinality();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getCardinality <em>Cardinality</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cardinality</em>' attribute is set.
     * @see #unsetCardinality()
     * @see #getCardinality()
     * @see #setCardinality(CardinalityEnum)
     * @generated
     */
    boolean isSetCardinality();

    /**
     * Returns the value of the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * This attribute indicates the maximum number of an element in case of cardinality allowing multiple instances. If not defined, there is no limit
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max</em>' attribute.
     * @see #setMax(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_Max()
     * @model extendedMetaData="kind='attribute' name='max'"
     * @generated
     */
    int getMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max</em>' attribute.
     * @see #getMax()
     * @generated
     */
    void setMax( int value );

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * a name used to identify the process resource in the rest of the SCL elements
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_Name()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getName <em>Name</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_OriginUuid()
     * @model extendedMetaData="kind='attribute' name='originUuid'"
     * @generated
     */
    String getOriginUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getOriginUuid <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Origin Uuid</em>' attribute.
     * @see #getOriginUuid()
     * @generated
     */
    void setOriginUuid( String value );

    /**
     * Returns the value of the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Selector is used to give a searching rule to help user to select a target. It is represented by an XPath
     * <!-- end-model-doc -->
     * @return the value of the '<em>Selector</em>' attribute.
     * @see #setSelector(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_Selector()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='selector'"
     * @generated
     */
    String getSelector();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getSelector <em>Selector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' attribute.
     * @see #getSelector()
     * @generated
     */
    void setSelector( String value );

    /**
     * Returns the value of the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template Uuid</em>' attribute.
     * @see #setTemplateUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_TemplateUuid()
     * @model extendedMetaData="kind='attribute' name='templateUuid'"
     * @generated
     */
    String getTemplateUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getTemplateUuid <em>Template Uuid</em>}' attribute.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_Uuid()
     * @model extendedMetaData="kind='attribute' name='uuid'"
     * @generated
     */
    String getUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getUuid <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uuid</em>' attribute.
     * @see #getUuid()
     * @generated
     */
    void setUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Process Resources</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources#getProcessResource <em>Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Process Resources</em>' container reference.
     * @see #setParentProcessResources(ProcessResources)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ParentProcessResources()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources#getProcessResource
     * @model opposite="processResource" unsettable="true" ordered="false"
     * @generated
     */
    ProcessResources getParentProcessResources();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getParentProcessResources <em>Parent Process Resources</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Process Resources</em>' container reference.
     * @see #getParentProcessResources()
     * @generated
     */
    void setParentProcessResources( ProcessResources value );

    /**
     * Returns the value of the '<em><b>Referred By Process Resource Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Process Resource Ref</em>' reference list.
     * @see #isSetReferredByProcessResourceRef()
     * @see #unsetReferredByProcessResourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ReferredByProcessResourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getRefersToProcessResource
     * @model opposite="RefersToProcessResource" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ProcessResourceRef > getReferredByProcessResourceRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByProcessResourceRef <em>Referred By Process Resource Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByProcessResourceRef()
     * @see #getReferredByProcessResourceRef()
     * @generated
     */
    void unsetReferredByProcessResourceRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByProcessResourceRef <em>Referred By Process Resource Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Process Resource Ref</em>' reference list is set.
     * @see #unsetReferredByProcessResourceRef()
     * @see #getReferredByProcessResourceRef()
     * @generated
     */
    boolean isSetReferredByProcessResourceRef();

    /**
     * Returns the value of the '<em><b>Referred By Controlling LNode</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Controlling LNode</em>' reference list.
     * @see #isSetReferredByControllingLNode()
     * @see #unsetReferredByControllingLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ReferredByControllingLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getRefersToProcessResource
     * @model opposite="RefersToProcessResource" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ControllingLNode > getReferredByControllingLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControllingLNode <em>Referred By Controlling LNode</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByControllingLNode()
     * @see #getReferredByControllingLNode()
     * @generated
     */
    void unsetReferredByControllingLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControllingLNode <em>Referred By Controlling LNode</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Controlling LNode</em>' reference list is set.
     * @see #unsetReferredByControllingLNode()
     * @see #getReferredByControllingLNode()
     * @generated
     */
    boolean isSetReferredByControllingLNode();

    /**
     * Returns the value of the '<em><b>Referred By Subscriber LNode</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Subscriber LNode</em>' reference list.
     * @see #isSetReferredBySubscriberLNode()
     * @see #unsetReferredBySubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ReferredBySubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getRefersToProcessResource
     * @model opposite="RefersToProcessResource" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SubscriberLNode > getReferredBySubscriberLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredBySubscriberLNode <em>Referred By Subscriber LNode</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySubscriberLNode()
     * @see #getReferredBySubscriberLNode()
     * @generated
     */
    void unsetReferredBySubscriberLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredBySubscriberLNode <em>Referred By Subscriber LNode</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Subscriber LNode</em>' reference list is set.
     * @see #unsetReferredBySubscriberLNode()
     * @see #getReferredBySubscriberLNode()
     * @generated
     */
    boolean isSetReferredBySubscriberLNode();

    /**
     * Returns the value of the '<em><b>Referred By Control Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Control Ref</em>' reference list.
     * @see #isSetReferredByControlRef()
     * @see #unsetReferredByControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ReferredByControlRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToProcessResource
     * @model opposite="RefersToProcessResource" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ControlRef > getReferredByControlRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControlRef <em>Referred By Control Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByControlRef()
     * @see #getReferredByControlRef()
     * @generated
     */
    void unsetReferredByControlRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControlRef <em>Referred By Control Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Control Ref</em>' reference list is set.
     * @see #unsetReferredByControlRef()
     * @see #getReferredByControlRef()
     * @generated
     */
    boolean isSetReferredByControlRef();

    /**
     * Returns the value of the '<em><b>Referredby Source Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referredby Source Ref</em>' reference list.
     * @see #isSetReferredbySourceRef()
     * @see #unsetReferredbySourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getProcessResource_ReferredbySourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToProcessResource
     * @model opposite="RefersToProcessResource" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SourceRef > getReferredbySourceRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredbySourceRef <em>Referredby Source Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredbySourceRef()
     * @see #getReferredbySourceRef()
     * @generated
     */
    void unsetReferredbySourceRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredbySourceRef <em>Referredby Source Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referredby Source Ref</em>' reference list is set.
     * @see #unsetReferredbySourceRef()
     * @see #getReferredbySourceRef()
     * @generated
     */
    boolean isSetReferredbySourceRef();

} // ProcessResource
