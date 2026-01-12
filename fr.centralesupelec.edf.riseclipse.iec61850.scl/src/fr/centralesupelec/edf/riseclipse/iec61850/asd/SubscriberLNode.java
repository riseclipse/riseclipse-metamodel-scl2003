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
 * A representation of the model object '<em><b>Subscriber LNode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SubscriberLNode can now where to be create with resource or pLN. At least one of them shall be filled in
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getGooseParametersRef <em>Goose Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getSMVParametersRef <em>SMV Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReportParametersRef <em>Report Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getInputName <em>Input Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getPLN <em>PLN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getResourceUuid <em>Resource Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getService <em>Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDAS <em>Parent DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentSDS <em>Parent SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReferredBySourceRef <em>Referred By Source Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode()
 * @model extendedMetaData="name='tSubscriberLNode' kind='elementOnly'"
 * @generated
 */
public interface SubscriberLNode extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Goose Parameters Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the communication parameters expected for the current SourceRef when ServiceType is GOOSE
     * <!-- end-model-doc -->
     * @return the value of the '<em>Goose Parameters Ref</em>' containment reference list.
     * @see #isSetGooseParametersRef()
     * @see #unsetGooseParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_GooseParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSubscriberLNode
     * @model opposite="ParentSubscriberLNode" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='GooseParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    EList< GooseParametersRef > getGooseParametersRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getGooseParametersRef <em>Goose Parameters Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGooseParametersRef()
     * @see #getGooseParametersRef()
     * @generated
     */
    void unsetGooseParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getGooseParametersRef <em>Goose Parameters Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Goose Parameters Ref</em>' containment reference list is set.
     * @see #unsetGooseParametersRef()
     * @see #getGooseParametersRef()
     * @generated
     */
    boolean isSetGooseParametersRef();

    /**
     * Returns the value of the '<em><b>SMV Parameters Ref</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the communication parameters expected for the current SourceRef when ServiceType is SMV
     * <!-- end-model-doc -->
     * @return the value of the '<em>SMV Parameters Ref</em>' containment reference.
     * @see #isSetSMVParametersRef()
     * @see #unsetSMVParametersRef()
     * @see #setSMVParametersRef(SMVParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_SMVParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSubscriberLNode
     * @model opposite="ParentSubscriberLNode" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SMVParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    SMVParametersRef getSMVParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getSMVParametersRef <em>SMV Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SMV Parameters Ref</em>' containment reference.
     * @see #isSetSMVParametersRef()
     * @see #unsetSMVParametersRef()
     * @see #getSMVParametersRef()
     * @generated
     */
    void setSMVParametersRef( SMVParametersRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getSMVParametersRef <em>SMV Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSMVParametersRef()
     * @see #getSMVParametersRef()
     * @see #setSMVParametersRef(SMVParametersRef)
     * @generated
     */
    void unsetSMVParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getSMVParametersRef <em>SMV Parameters Ref</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SMV Parameters Ref</em>' containment reference is set.
     * @see #unsetSMVParametersRef()
     * @see #getSMVParametersRef()
     * @see #setSMVParametersRef(SMVParametersRef)
     * @generated
     */
    boolean isSetSMVParametersRef();

    /**
     * Returns the value of the '<em><b>Report Parameters Ref</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the communication parameters expected for the current SourceRef when ServiceType is Report
     * <!-- end-model-doc -->
     * @return the value of the '<em>Report Parameters Ref</em>' containment reference.
     * @see #isSetReportParametersRef()
     * @see #unsetReportParametersRef()
     * @see #setReportParametersRef(ReportParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_ReportParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSubscriberLNode
     * @model opposite="ParentSubscriberLNode" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='ReportParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    ReportParametersRef getReportParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReportParametersRef <em>Report Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Report Parameters Ref</em>' containment reference.
     * @see #isSetReportParametersRef()
     * @see #unsetReportParametersRef()
     * @see #getReportParametersRef()
     * @generated
     */
    void setReportParametersRef( ReportParametersRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReportParametersRef <em>Report Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportParametersRef()
     * @see #getReportParametersRef()
     * @see #setReportParametersRef(ReportParametersRef)
     * @generated
     */
    void unsetReportParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReportParametersRef <em>Report Parameters Ref</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Report Parameters Ref</em>' containment reference is set.
     * @see #unsetReportParametersRef()
     * @see #getReportParametersRef()
     * @see #setReportParametersRef(ReportParametersRef)
     * @generated
     */
    boolean isSetReportParametersRef();

    /**
     * Returns the value of the '<em><b>Binary Wiring Parameters Ref</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specification of the binary wiring parameters expected for the current SourceRef when ServiceType is Wired
     * <!-- end-model-doc -->
     * @return the value of the '<em>Binary Wiring Parameters Ref</em>' containment reference.
     * @see #isSetBinaryWiringParametersRef()
     * @see #unsetBinaryWiringParametersRef()
     * @see #setBinaryWiringParametersRef(BinaryWiringParametersRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_BinaryWiringParametersRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSubscriberLNode
     * @model opposite="ParentSubscriberLNode" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='BinaryWiringParametersRef' namespace='##targetNamespace'"
     * @generated
     */
    BinaryWiringParametersRef getBinaryWiringParametersRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binary Wiring Parameters Ref</em>' containment reference.
     * @see #isSetBinaryWiringParametersRef()
     * @see #unsetBinaryWiringParametersRef()
     * @see #getBinaryWiringParametersRef()
     * @generated
     */
    void setBinaryWiringParametersRef( BinaryWiringParametersRef value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBinaryWiringParametersRef()
     * @see #getBinaryWiringParametersRef()
     * @see #setBinaryWiringParametersRef(BinaryWiringParametersRef)
     * @generated
     */
    void unsetBinaryWiringParametersRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Binary Wiring Parameters Ref</em>' containment reference is set.
     * @see #unsetBinaryWiringParametersRef()
     * @see #getBinaryWiringParametersRef()
     * @see #setBinaryWiringParametersRef(BinaryWiringParametersRef)
     * @generated
     */
    boolean isSetBinaryWiringParametersRef();

    /**
     * Returns the value of the '<em><b>Input Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * input name to use in SourceRef created to answer to the SubscribingLNode
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input Name</em>' attribute.
     * @see #setInputName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_InputName()
     * @model required="true"
     *        extendedMetaData="kind='attribute' name='inputName'"
     * @generated
     */
    String getInputName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getInputName <em>Input Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input Name</em>' attribute.
     * @see #getInputName()
     * @generated
     */
    void setInputName( String value );

    /**
     * Returns the value of the '<em><b>PLN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * class of the LNode to select to create SourceRef to answer to the SusbcribingLNode
     * <!-- end-model-doc -->
     * @return the value of the '<em>PLN</em>' attribute.
     * @see #setPLN(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_PLN()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='pLN'"
     * @generated
     */
    String getPLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getPLN <em>PLN</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PLN</em>' attribute.
     * @see #getPLN()
     * @generated
     */
    void setPLN( String value );

    /**
     * Returns the value of the '<em><b>Resource Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Process resource used to instantiate the subscribing LNodes
     * <!-- end-model-doc -->
     * @return the value of the '<em>Resource Name</em>' attribute.
     * @see #setResourceName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_ResourceName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='resourceName'"
     * @generated
     */
    String getResourceName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getResourceName <em>Resource Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Name</em>' attribute.
     * @see #getResourceName()
     * @generated
     */
    void setResourceName( String value );

    /**
     * Returns the value of the '<em><b>Resource Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the ProcessResource used to instantiate the subscribing LNodes
     * <!-- end-model-doc -->
     * @return the value of the '<em>Resource Uuid</em>' attribute.
     * @see #setResourceUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_ResourceUuid()
     * @model extendedMetaData="kind='attribute' name='resourceUuid'"
     * @generated
     */
    String getResourceUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getResourceUuid <em>Resource Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Uuid</em>' attribute.
     * @see #getResourceUuid()
     * @generated
     */
    void setResourceUuid( String value );

    /**
     * Returns the value of the '<em><b>Service</b></em>' attribute.
     * The default value is <code>"GOOSE"</code>.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * type of service to use in SourceRef created to answer to the SubscribingLNode
     * <!-- end-model-doc -->
     * @return the value of the '<em>Service</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum
     * @see #isSetService()
     * @see #unsetService()
     * @see #setService(SpecServiceEnum)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_Service()
     * @model default="GOOSE" unsettable="true"
     *        extendedMetaData="kind='attribute' name='service'"
     * @generated
     */
    SpecServiceEnum getService();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getService <em>Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Service</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum
     * @see #isSetService()
     * @see #unsetService()
     * @see #getService()
     * @generated
     */
    void setService( SpecServiceEnum value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getService <em>Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetService()
     * @see #getService()
     * @see #setService(SpecServiceEnum)
     * @generated
     */
    void unsetService();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getService <em>Service</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Service</em>' attribute is set.
     * @see #unsetService()
     * @see #getService()
     * @see #setService(SpecServiceEnum)
     * @generated
     */
    boolean isSetService();

    /**
     * Returns the value of the '<em><b>Parent DAS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getSubscriberLNode <em>Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DAS</em>' container reference.
     * @see #setParentDAS(DAS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_ParentDAS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getSubscriberLNode
     * @model opposite="subscriberLNode" unsettable="true" ordered="false"
     * @generated
     */
    DAS getParentDAS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDAS <em>Parent DAS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DAS</em>' container reference.
     * @see #getParentDAS()
     * @generated
     */
    void setParentDAS( DAS value );

    /**
     * Returns the value of the '<em><b>Parent DOS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSubscriberLNode <em>Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DOS</em>' container reference.
     * @see #setParentDOS(DOS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_ParentDOS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSubscriberLNode
     * @model opposite="subscriberLNode" unsettable="true" ordered="false"
     * @generated
     */
    DOS getParentDOS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDOS <em>Parent DOS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DOS</em>' container reference.
     * @see #getParentDOS()
     * @generated
     */
    void setParentDOS( DOS value );

    /**
     * Returns the value of the '<em><b>Parent SDS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getSubscriberLNode <em>Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SDS</em>' container reference.
     * @see #setParentSDS(SDS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_ParentSDS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getSubscriberLNode
     * @model opposite="subscriberLNode" unsettable="true" ordered="false"
     * @generated
     */
    SDS getParentSDS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentSDS <em>Parent SDS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SDS</em>' container reference.
     * @see #getParentSDS()
     * @generated
     */
    void setParentSDS( SDS value );

    /**
     * Returns the value of the '<em><b>Refers To Process Resource</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredBySubscriberLNode <em>Referred By Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Process Resource</em>' reference.
     * @see #isSetRefersToProcessResource()
     * @see #unsetRefersToProcessResource()
     * @see #setRefersToProcessResource(ProcessResource)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_RefersToProcessResource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredBySubscriberLNode
     * @model opposite="ReferredBySubscriberLNode" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ProcessResource getRefersToProcessResource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Process Resource</em>' reference.
     * @see #isSetRefersToProcessResource()
     * @see #unsetRefersToProcessResource()
     * @see #getRefersToProcessResource()
     * @generated
     */
    void setRefersToProcessResource( ProcessResource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToProcessResource()
     * @see #getRefersToProcessResource()
     * @see #setRefersToProcessResource(ProcessResource)
     * @generated
     */
    void unsetRefersToProcessResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Process Resource</em>' reference is set.
     * @see #unsetRefersToProcessResource()
     * @see #getRefersToProcessResource()
     * @see #setRefersToProcessResource(ProcessResource)
     * @generated
     */
    boolean isSetRefersToProcessResource();

    /**
     * Returns the value of the '<em><b>Referred By Source Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToSubscriberLNode <em>Refers To Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Source Ref</em>' reference list.
     * @see #isSetReferredBySourceRef()
     * @see #unsetReferredBySourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getSubscriberLNode_ReferredBySourceRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToSubscriberLNode
     * @model opposite="RefersToSubscriberLNode" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SourceRef > getReferredBySourceRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReferredBySourceRef <em>Referred By Source Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySourceRef()
     * @see #getReferredBySourceRef()
     * @generated
     */
    void unsetReferredBySourceRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReferredBySourceRef <em>Referred By Source Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Source Ref</em>' reference list is set.
     * @see #unsetReferredBySourceRef()
     * @see #getReferredBySourceRef()
     * @generated
     */
    boolean isSetReferredBySourceRef();

} // SubscriberLNode
