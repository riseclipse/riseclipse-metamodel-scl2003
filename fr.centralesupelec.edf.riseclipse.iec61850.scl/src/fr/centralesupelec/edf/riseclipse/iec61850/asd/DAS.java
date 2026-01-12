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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specification of data attribute to be implemented by a device
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getSubscriberLNode <em>Subscriber LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getControllingLNode <em>Controlling LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getProcessEcho <em>Process Echo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLogParametersRef <em>Log Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getVal <em>Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getMappedDaName <em>Mapped Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getMappedLnUuid <em>Mapped Ln Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#isValImport <em>Val Import</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getValKind <em>Val Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getParentSDS <em>Parent SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getRefersToAnyLN <em>Refers To Any LN</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS()
 * @model
 * @generated
 */
public interface DAS extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Subscriber LNode</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDAS <em>Parent DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subscriber LNode</em>' containment reference list.
     * @see #isSetSubscriberLNode()
     * @see #unsetSubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_SubscriberLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDAS
     * @model opposite="ParentDAS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SubscriberLNode' namespace='##targetNamespace'"
     * @generated
     */
    EList< SubscriberLNode > getSubscriberLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getSubscriberLNode <em>Subscriber LNode</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubscriberLNode()
     * @see #getSubscriberLNode()
     * @generated
     */
    void unsetSubscriberLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getSubscriberLNode <em>Subscriber LNode</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Subscriber LNode</em>' containment reference list is set.
     * @see #unsetSubscriberLNode()
     * @see #getSubscriberLNode()
     * @generated
     */
    boolean isSetSubscriberLNode();

    /**
     * Returns the value of the '<em><b>Controlling LNode</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDAS <em>Parent DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Controlling LNode</em>' containment reference list.
     * @see #isSetControllingLNode()
     * @see #unsetControllingLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_ControllingLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDAS
     * @model opposite="ParentDAS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ControllingLNode' namespace='##targetNamespace'"
     * @generated
     */
    EList< ControllingLNode > getControllingLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getControllingLNode <em>Controlling LNode</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControllingLNode()
     * @see #getControllingLNode()
     * @generated
     */
    void unsetControllingLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getControllingLNode <em>Controlling LNode</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Controlling LNode</em>' containment reference list is set.
     * @see #unsetControllingLNode()
     * @see #getControllingLNode()
     * @generated
     */
    boolean isSetControllingLNode();

    /**
     * Returns the value of the '<em><b>Process Echo</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDAS <em>Parent DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Echo</em>' containment reference list.
     * @see #isSetProcessEcho()
     * @see #unsetProcessEcho()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_ProcessEcho()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDAS
     * @model opposite="ParentDAS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ProcessEcho' namespace='##targetNamespace'"
     * @generated
     */
    EList< ProcessEcho > getProcessEcho();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getProcessEcho <em>Process Echo</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcessEcho()
     * @see #getProcessEcho()
     * @generated
     */
    void unsetProcessEcho();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getProcessEcho <em>Process Echo</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Process Echo</em>' containment reference list is set.
     * @see #unsetProcessEcho()
     * @see #getProcessEcho()
     * @generated
     */
    boolean isSetProcessEcho();

    /**
     * Returns the value of the '<em><b>Log Parameters Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDAS <em>Parent DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the Log parameters expected for the current DAS when Log capability is required
     * <!-- end-model-doc -->
     * @return the value of the '<em>Log Parameters Ref</em>' containment reference list.
     * @see #isSetLogParametersRef()
     * @see #unsetLogParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_LogParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDAS
     * @model opposite="ParentDAS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='LogParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< LogParametersRef > getLogParametersRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLogParametersRef <em>Log Parameters Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLogParametersRef()
     * @see #getLogParametersRef()
     * @generated
     */
    void unsetLogParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLogParametersRef <em>Log Parameters Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Log Parameters Ref</em>' containment reference list is set.
     * @see #unsetLogParametersRef()
     * @see #getLogParametersRef()
     * @generated
     */
    boolean isSetLogParametersRef();

    /**
     * Returns the value of the '<em><b>Val</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentDas <em>Parent Das</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Val</em>' containment reference list.
     * @see #isSetVal()
     * @see #unsetVal()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_Val()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentDas
     * @model opposite="ParentDas" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Val' namespace='##targetNamespace'"
     * @generated
     */
    EList< Val > getVal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getVal <em>Val</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVal()
     * @see #getVal()
     * @generated
     */
    void unsetVal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getVal <em>Val</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Val</em>' containment reference list is set.
     * @see #unsetVal()
     * @see #getVal()
     * @generated
     */
    boolean isSetVal();

    /**
     * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDAS <em>Parent DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labels</em>' containment reference list.
     * @see #isSetLabels()
     * @see #unsetLabels()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_Labels()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDAS
     * @model opposite="ParentDAS" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='Labels' namespace='##targetNamespace'"
     * @generated
     */
    EList< Labels > getLabels();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLabels <em>Labels</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLabels()
     * @see #getLabels()
     * @generated
     */
    void unsetLabels();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLabels <em>Labels</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Labels</em>' containment reference list is set.
     * @see #unsetLabels()
     * @see #getLabels()
     * @generated
     */
    boolean isSetLabels();

    /**
     * Returns the value of the '<em><b>Ix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ix</em>' attribute.
     * @see #isSetIx()
     * @see #unsetIx()
     * @see #setIx(long)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_Ix()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='ix'"
     * @generated
     */
    long getIx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getIx <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ix</em>' attribute.
     * @see #isSetIx()
     * @see #unsetIx()
     * @see #getIx()
     * @generated
     */
    void setIx( long value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getIx <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIx()
     * @see #getIx()
     * @see #setIx(long)
     * @generated
     */
    void unsetIx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getIx <em>Ix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ix</em>' attribute is set.
     * @see #unsetIx()
     * @see #getIx()
     * @see #setIx(long)
     * @generated
     */
    boolean isSetIx();

    /**
     * Returns the value of the '<em><b>Mapped Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * DaName in the IED which implements the DAS. If mappedLnUuid is defined or LNode mapped to an LN, the DaName is internal to the referenced LN. If not defined, the mappedDaName shall be an absolute reference to a DA in an IED
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mapped Da Name</em>' attribute.
     * @see #setMappedDaName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_MappedDaName()
     * @model extendedMetaData="kind='attribute' name='mappedDaName'"
     * @generated
     */
    String getMappedDaName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getMappedDaName <em>Mapped Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapped Da Name</em>' attribute.
     * @see #getMappedDaName()
     * @generated
     */
    void setMappedDaName( String value );

    /**
     * Returns the value of the '<em><b>Mapped Ln Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the LN which implements the DAS
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mapped Ln Uuid</em>' attribute.
     * @see #setMappedLnUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_MappedLnUuid()
     * @model extendedMetaData="kind='attribute' name='mappedLnUuid'"
     * @generated
     */
    String getMappedLnUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getMappedLnUuid <em>Mapped Ln Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapped Ln Uuid</em>' attribute.
     * @see #getMappedLnUuid()
     * @generated
     */
    void setMappedLnUuid( String value );

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_Name()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Returns the value of the '<em><b>Val Import</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Val Import</em>' attribute.
     * @see #isSetValImport()
     * @see #unsetValImport()
     * @see #setValImport(boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_ValImport()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='valImport'"
     * @generated
     */
    boolean isValImport();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#isValImport <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Val Import</em>' attribute.
     * @see #isSetValImport()
     * @see #unsetValImport()
     * @see #isValImport()
     * @generated
     */
    void setValImport( boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#isValImport <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValImport()
     * @see #isValImport()
     * @see #setValImport(boolean)
     * @generated
     */
    void unsetValImport();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#isValImport <em>Val Import</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Val Import</em>' attribute is set.
     * @see #unsetValImport()
     * @see #isValImport()
     * @see #setValImport(boolean)
     * @generated
     */
    boolean isSetValImport();

    /**
     * Returns the value of the '<em><b>Val Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Val Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum
     * @see #isSetValKind()
     * @see #unsetValKind()
     * @see #setValKind(ValKindEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_ValKind()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='valKind'"
     * @generated
     */
    ValKindEnum getValKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getValKind <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Val Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum
     * @see #isSetValKind()
     * @see #unsetValKind()
     * @see #getValKind()
     * @generated
     */
    void setValKind( ValKindEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getValKind <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValKind()
     * @see #getValKind()
     * @see #setValKind(ValKindEnum)
     * @generated
     */
    void unsetValKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getValKind <em>Val Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Val Kind</em>' attribute is set.
     * @see #unsetValKind()
     * @see #getValKind()
     * @see #setValKind(ValKindEnum)
     * @generated
     */
    boolean isSetValKind();

    /**
     * Returns the value of the '<em><b>Parent DOS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getDAS <em>DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DOS</em>' container reference.
     * @see #setParentDOS(DOS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_ParentDOS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getDAS
     * @model opposite="dAS" unsettable="true" ordered="false"
     * @generated
     */
    DOS getParentDOS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getParentDOS <em>Parent DOS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DOS</em>' container reference.
     * @see #getParentDOS()
     * @generated
     */
    void setParentDOS( DOS value );

    /**
     * Returns the value of the '<em><b>Parent SDS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getDAS <em>DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SDS</em>' container reference.
     * @see #setParentSDS(SDS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_ParentSDS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getDAS
     * @model opposite="dAS" unsettable="true" ordered="false"
     * @generated
     */
    SDS getParentSDS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getParentSDS <em>Parent SDS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SDS</em>' container reference.
     * @see #getParentSDS()
     * @generated
     */
    void setParentSDS( SDS value );

    /**
     * Returns the value of the '<em><b>Refers To Any LN</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByDAS <em>Referred By DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Any LN</em>' reference.
     * @see #isSetRefersToAnyLN()
     * @see #unsetRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getDAS_RefersToAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByDAS
     * @model opposite="ReferredByDAS" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    AnyLN getRefersToAnyLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Any LN</em>' reference.
     * @see #isSetRefersToAnyLN()
     * @see #unsetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @generated
     */
    void setRefersToAnyLN( AnyLN value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getRefersToAnyLN <em>Refers To Any LN</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @generated
     */
    void unsetRefersToAnyLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getRefersToAnyLN <em>Refers To Any LN</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Any LN</em>' reference is set.
     * @see #unsetRefersToAnyLN()
     * @see #getRefersToAnyLN()
     * @see #setRefersToAnyLN(AnyLN)
     * @generated
     */
    boolean isSetRefersToAnyLN();

} // DAS
