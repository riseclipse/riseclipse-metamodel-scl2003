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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any LN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInst <em>Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnClass <em>Ln Class</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnType <em>Ln Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getRefersToLNodeType <em>Refers To LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLog <em>Log</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDOI <em>DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReportControl <em>Report Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLogControl <em>Log Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByClientLN <em>Referred By Client LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByAssociation <em>Referred By Association</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByIEDName <em>Referred By IED Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByLNode <em>Referred By LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLabels <em>Labels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByDOS <em>Referred By DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredBySDS <em>Referred By SDS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByDAS <em>Referred By DAS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN()
 * @model abstract="true"
 * @generated
 */
public interface AnyLN extends UnNaming, INamespaceGetter, AgUuid {
    /**
     * Returns the value of the '<em><b>Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inst</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inst</em>' attribute.
     * @see #isSetInst()
     * @see #unsetInst()
     * @see #setInst(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_Inst()
     * @model unsettable="true"
     * @generated
     */
    String getInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInst <em>Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inst</em>' attribute.
     * @see #isSetInst()
     * @see #unsetInst()
     * @see #getInst()
     * @generated
     */
    void setInst( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInst <em>Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInst()
     * @see #getInst()
     * @see #setInst(String)
     * @generated
     */
    void unsetInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInst <em>Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inst</em>' attribute is set.
     * @see #unsetInst()
     * @see #getInst()
     * @see #setInst(String)
     * @generated
     */
    boolean isSetInst();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_LnClass()
     * @model unsettable="true"
     * @generated
     */
    String getLnClass();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnClass <em>Ln Class</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnClass <em>Ln Class</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnClass()
     * @see #getLnClass()
     * @see #setLnClass(String)
     * @generated
     */
    void unsetLnClass();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnClass <em>Ln Class</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ln Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ln Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ln Type</em>' attribute.
     * @see #isSetLnType()
     * @see #unsetLnType()
     * @see #setLnType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_LnType()
     * @model unsettable="true"
     * @generated
     */
    String getLnType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnType <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ln Type</em>' attribute.
     * @see #isSetLnType()
     * @see #unsetLnType()
     * @see #getLnType()
     * @generated
     */
    void setLnType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnType <em>Ln Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLnType()
     * @see #getLnType()
     * @see #setLnType(String)
     * @generated
     */
    void unsetLnType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnType <em>Ln Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ln Type</em>' attribute is set.
     * @see #unsetLnType()
     * @see #getLnType()
     * @see #setLnType(String)
     * @generated
     */
    boolean isSetLnType();

    /**
     * Returns the value of the '<em><b>Refers To LNode Type</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByAnyLN <em>Referred By Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To LNode Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To LNode Type</em>' reference.
     * @see #isSetRefersToLNodeType()
     * @see #unsetRefersToLNodeType()
     * @see #setRefersToLNodeType(LNodeType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_RefersToLNodeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByAnyLN
     * @model opposite="ReferredByAnyLN" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    LNodeType getRefersToLNodeType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getRefersToLNodeType <em>Refers To LNode Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To LNode Type</em>' reference.
     * @see #isSetRefersToLNodeType()
     * @see #unsetRefersToLNodeType()
     * @see #getRefersToLNodeType()
     * @generated
     */
    void setRefersToLNodeType( LNodeType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getRefersToLNodeType <em>Refers To LNode Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToLNodeType()
     * @see #getRefersToLNodeType()
     * @see #setRefersToLNodeType(LNodeType)
     * @generated
     */
    void unsetRefersToLNodeType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getRefersToLNodeType <em>Refers To LNode Type</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To LNode Type</em>' reference is set.
     * @see #unsetRefersToLNodeType()
     * @see #getRefersToLNodeType()
     * @see #setRefersToLNodeType(LNodeType)
     * @generated
     */
    boolean isSetRefersToLNodeType();

    /**
     * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inputs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inputs</em>' containment reference.
     * @see #isSetInputs()
     * @see #unsetInputs()
     * @see #setInputs(Inputs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_Inputs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getParentAnyLN
     * @model opposite="ParentAnyLN" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    Inputs getInputs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInputs <em>Inputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inputs</em>' containment reference.
     * @see #isSetInputs()
     * @see #unsetInputs()
     * @see #getInputs()
     * @generated
     */
    void setInputs( Inputs value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInputs <em>Inputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInputs()
     * @see #getInputs()
     * @see #setInputs(Inputs)
     * @generated
     */
    void unsetInputs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInputs <em>Inputs</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inputs</em>' containment reference is set.
     * @see #unsetInputs()
     * @see #getInputs()
     * @see #setInputs(Inputs)
     * @generated
     */
    boolean isSetInputs();

    /**
     * Returns the value of the '<em><b>Log</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Log}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Log#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Log</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Log</em>' containment reference list.
     * @see #isSetLog()
     * @see #unsetLog()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_Log()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Log#getParentAnyLN
     * @model opposite="ParentAnyLN" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< Log > getLog();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLog <em>Log</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLog()
     * @see #getLog()
     * @generated
     */
    void unsetLog();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLog <em>Log</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Log</em>' containment reference list is set.
     * @see #unsetLog()
     * @see #getLog()
     * @generated
     */
    boolean isSetLog();

    /**
     * Returns the value of the '<em><b>DOI</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DOI</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DOI</em>' containment reference list.
     * @see #isSetDOI()
     * @see #unsetDOI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_DOI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getParentAnyLN
     * @model opposite="ParentAnyLN" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< DOI > getDOI();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDOI <em>DOI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDOI()
     * @see #getDOI()
     * @generated
     */
    void unsetDOI();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDOI <em>DOI</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DOI</em>' containment reference list is set.
     * @see #unsetDOI()
     * @see #getDOI()
     * @generated
     */
    boolean isSetDOI();

    /**
     * Returns the value of the '<em><b>Report Control</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Report Control</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Report Control</em>' containment reference list.
     * @see #isSetReportControl()
     * @see #unsetReportControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_ReportControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getParentAnyLN
     * @model opposite="ParentAnyLN" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< ReportControl > getReportControl();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReportControl <em>Report Control</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportControl()
     * @see #getReportControl()
     * @generated
     */
    void unsetReportControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReportControl <em>Report Control</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Report Control</em>' containment reference list is set.
     * @see #unsetReportControl()
     * @see #getReportControl()
     * @generated
     */
    boolean isSetReportControl();

    /**
     * Returns the value of the '<em><b>Log Control</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Log Control</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Log Control</em>' containment reference list.
     * @see #isSetLogControl()
     * @see #unsetLogControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_LogControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getParentAnyLN
     * @model opposite="ParentAnyLN" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< LogControl > getLogControl();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLogControl <em>Log Control</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLogControl()
     * @see #getLogControl()
     * @generated
     */
    void unsetLogControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLogControl <em>Log Control</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Log Control</em>' containment reference list is set.
     * @see #unsetLogControl()
     * @see #getLogControl()
     * @generated
     */
    boolean isSetLogControl();

    /**
     * Returns the value of the '<em><b>Data Set</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Set</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Set</em>' containment reference list.
     * @see #isSetDataSet()
     * @see #unsetDataSet()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_DataSet()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getParentAnyLN
     * @model opposite="ParentAnyLN" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< DataSet > getDataSet();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDataSet <em>Data Set</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDataSet()
     * @see #getDataSet()
     * @generated
     */
    void unsetDataSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDataSet <em>Data Set</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Data Set</em>' containment reference list is set.
     * @see #unsetDataSet()
     * @see #getDataSet()
     * @generated
     */
    boolean isSetDataSet();

    /**
     * Returns the value of the '<em><b>Referred By Client LN</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Client LN</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Client LN</em>' reference list.
     * @see #isSetReferredByClientLN()
     * @see #unsetReferredByClientLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_ReferredByClientLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getRefersToAnyLN
     * @model opposite="RefersToAnyLN" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< ClientLN > getReferredByClientLN();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByClientLN <em>Referred By Client LN</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByClientLN()
     * @see #getReferredByClientLN()
     * @generated
     */
    void unsetReferredByClientLN();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByClientLN <em>Referred By Client LN</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Client LN</em>' reference list is set.
     * @see #unsetReferredByClientLN()
     * @see #getReferredByClientLN()
     * @generated
     */
    boolean isSetReferredByClientLN();

    /**
     * Returns the value of the '<em><b>Referred By Association</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By Association</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Association</em>' reference list.
     * @see #isSetReferredByAssociation()
     * @see #unsetReferredByAssociation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_ReferredByAssociation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getRefersToAnyLN
     * @model opposite="RefersToAnyLN" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< Association > getReferredByAssociation();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByAssociation <em>Referred By Association</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAssociation()
     * @see #getReferredByAssociation()
     * @generated
     */
    void unsetReferredByAssociation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByAssociation <em>Referred By Association</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Association</em>' reference list is set.
     * @see #unsetReferredByAssociation()
     * @see #getReferredByAssociation()
     * @generated
     */
    boolean isSetReferredByAssociation();

    /**
     * Returns the value of the '<em><b>Referred By IED Name</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By IED Name</em>' reference list.
     * @see #isSetReferredByIEDName()
     * @see #unsetReferredByIEDName()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_ReferredByIEDName()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getRefersToAnyLN
     * @model opposite="RefersToAnyLN" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< IEDName > getReferredByIEDName();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByIEDName <em>Referred By IED Name</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByIEDName()
     * @see #getReferredByIEDName()
     * @generated
     */
    void unsetReferredByIEDName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByIEDName <em>Referred By IED Name</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By IED Name</em>' reference list is set.
     * @see #unsetReferredByIEDName()
     * @see #getReferredByIEDName()
     * @generated
     */
    boolean isSetReferredByIEDName();

    /**
     * Returns the value of the '<em><b>Referred By LNode</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By LNode</em>' reference list.
     * @see #isSetReferredByLNode()
     * @see #unsetReferredByLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_ReferredByLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToAnyLN
     * @model opposite="RefersToAnyLN" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< LNode > getReferredByLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByLNode <em>Referred By LNode</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByLNode()
     * @see #getReferredByLNode()
     * @generated
     */
    void unsetReferredByLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByLNode <em>Referred By LNode</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By LNode</em>' reference list is set.
     * @see #unsetReferredByLNode()
     * @see #getReferredByLNode()
     * @generated
     */
    boolean isSetReferredByLNode();

    /**
     * Returns the value of the '<em><b>Labels</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labels</em>' containment reference.
     * @see #isSetLabels()
     * @see #unsetLabels()
     * @see #setLabels(Labels)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_Labels()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentAnyLN
     * @model opposite="ParentAnyLN" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Labels getLabels();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLabels <em>Labels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Labels</em>' containment reference.
     * @see #isSetLabels()
     * @see #unsetLabels()
     * @see #getLabels()
     * @generated
     */
    void setLabels( Labels value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLabels <em>Labels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLabels()
     * @see #getLabels()
     * @see #setLabels(Labels)
     * @generated
     */
    void unsetLabels();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLabels <em>Labels</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Labels</em>' containment reference is set.
     * @see #unsetLabels()
     * @see #getLabels()
     * @see #setLabels(Labels)
     * @generated
     */
    boolean isSetLabels();

    /**
     * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Outputs#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outputs</em>' containment reference.
     * @see #isSetOutputs()
     * @see #unsetOutputs()
     * @see #setOutputs(Outputs)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_Outputs()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Outputs#getParentAnyLN
     * @model opposite="ParentAnyLN" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Outputs getOutputs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getOutputs <em>Outputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Outputs</em>' containment reference.
     * @see #isSetOutputs()
     * @see #unsetOutputs()
     * @see #getOutputs()
     * @generated
     */
    void setOutputs( Outputs value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getOutputs <em>Outputs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutputs()
     * @see #getOutputs()
     * @see #setOutputs(Outputs)
     * @generated
     */
    void unsetOutputs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getOutputs <em>Outputs</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Outputs</em>' containment reference is set.
     * @see #unsetOutputs()
     * @see #getOutputs()
     * @see #setOutputs(Outputs)
     * @generated
     */
    boolean isSetOutputs();

    /**
     * Returns the value of the '<em><b>Referred By DOS</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By DOS</em>' reference list.
     * @see #isSetReferredByDOS()
     * @see #unsetReferredByDOS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_ReferredByDOS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getRefersToAnyLN
     * @model opposite="RefersToAnyLN" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< DOS > getReferredByDOS();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByDOS <em>Referred By DOS</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDOS()
     * @see #getReferredByDOS()
     * @generated
     */
    void unsetReferredByDOS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByDOS <em>Referred By DOS</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By DOS</em>' reference list is set.
     * @see #unsetReferredByDOS()
     * @see #getReferredByDOS()
     * @generated
     */
    boolean isSetReferredByDOS();

    /**
     * Returns the value of the '<em><b>Referred By SDS</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By SDS</em>' reference list.
     * @see #isSetReferredBySDS()
     * @see #unsetReferredBySDS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_ReferredBySDS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getRefersToAnyLN
     * @model opposite="RefersToAnyLN" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< SDS > getReferredBySDS();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredBySDS <em>Referred By SDS</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySDS()
     * @see #getReferredBySDS()
     * @generated
     */
    void unsetReferredBySDS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredBySDS <em>Referred By SDS</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By SDS</em>' reference list is set.
     * @see #unsetReferredBySDS()
     * @see #getReferredBySDS()
     * @generated
     */
    boolean isSetReferredBySDS();

    /**
     * Returns the value of the '<em><b>Referred By DAS</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By DAS</em>' reference list.
     * @see #isSetReferredByDAS()
     * @see #unsetReferredByDAS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAnyLN_ReferredByDAS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getRefersToAnyLN
     * @model opposite="RefersToAnyLN" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< DAS > getReferredByDAS();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByDAS <em>Referred By DAS</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDAS()
     * @see #getReferredByDAS()
     * @generated
     */
    void unsetReferredByDAS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByDAS <em>Referred By DAS</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By DAS</em>' reference list is set.
     * @see #unsetReferredByDAS()
     * @see #getReferredByDAS()
     * @generated
     */
    boolean isSetReferredByDAS();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    LDevice getParentLDevice();

} // AnyLN
