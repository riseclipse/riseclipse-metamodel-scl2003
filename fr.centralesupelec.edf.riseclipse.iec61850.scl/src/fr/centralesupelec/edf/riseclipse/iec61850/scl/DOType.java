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
 * A representation of the model object '<em><b>DO Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getCdc <em>Cdc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA <em>DA</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByAbstractDataObject <em>Referred By Abstract Data Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getSDO <em>SDO</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType()
 * @model
 * @generated
 */
public interface DOType extends IDNaming, INamespaceGetter {
    /**
     * Returns the value of the '<em><b>Cdc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cdc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cdc</em>' attribute.
     * @see #isSetCdc()
     * @see #unsetCdc()
     * @see #setCdc(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_Cdc()
     * @model unsettable="true"
     * @generated
     */
    String getCdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getCdc <em>Cdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cdc</em>' attribute.
     * @see #isSetCdc()
     * @see #unsetCdc()
     * @see #getCdc()
     * @generated
     */
    void setCdc( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getCdc <em>Cdc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCdc()
     * @see #getCdc()
     * @see #setCdc(String)
     * @generated
     */
    void unsetCdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getCdc <em>Cdc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cdc</em>' attribute is set.
     * @see #unsetCdc()
     * @see #getCdc()
     * @see #setCdc(String)
     * @generated
     */
    boolean isSetCdc();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_IedType()
     * @model default="" unsettable="true"
     * @generated
     */
    String getIedType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getIedType <em>Ied Type</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getIedType <em>Ied Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIedType()
     * @see #getIedType()
     * @see #setIedType(String)
     * @generated
     */
    void unsetIedType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getIedType <em>Ied Type</em>}' attribute is set.
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
     * Returns the value of the '<em><b>DA</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getParentDOType <em>Parent DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>DA</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>DA</em>' containment reference list.
     * @see #isSetDA()
     * @see #unsetDA()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_DA()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getParentDOType
     * @model opposite="ParentDOType" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< DA > getDA();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA <em>DA</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDA()
     * @see #getDA()
     * @generated
     */
    void unsetDA();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA <em>DA</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DA</em>' containment reference list is set.
     * @see #unsetDA()
     * @see #getDA()
     * @generated
     */
    boolean isSetDA();

    /**
     * Returns the value of the '<em><b>Referred By Abstract Data Object</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getRefersToDOType <em>Refers To DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Abstract Data Object</em>' reference list.
     * @see #isSetReferredByAbstractDataObject()
     * @see #unsetReferredByAbstractDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_ReferredByAbstractDataObject()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getRefersToDOType
     * @model opposite="RefersToDOType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< AbstractDataObject > getReferredByAbstractDataObject();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByAbstractDataObject <em>Referred By Abstract Data Object</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByAbstractDataObject()
     * @see #getReferredByAbstractDataObject()
     * @generated
     */
    void unsetReferredByAbstractDataObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByAbstractDataObject <em>Referred By Abstract Data Object</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Abstract Data Object</em>' reference list is set.
     * @see #unsetReferredByAbstractDataObject()
     * @see #getReferredByAbstractDataObject()
     * @generated
     */
    boolean isSetReferredByAbstractDataObject();

    /**
     * Returns the value of the '<em><b>Parent Data Type Templates</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDOType <em>DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Data Type Templates</em>' container reference.
     * @see #setParentDataTypeTemplates(DataTypeTemplates)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_ParentDataTypeTemplates()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDOType
     * @model opposite="DOType" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DataTypeTemplates getParentDataTypeTemplates();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Data Type Templates</em>' container reference.
     * @see #getParentDataTypeTemplates()
     * @generated
     */
    void setParentDataTypeTemplates( DataTypeTemplates value );

    /**
     * Returns the value of the '<em><b>SDO</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getParentDOType <em>Parent DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SDO</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SDO</em>' containment reference list.
     * @see #isSetSDO()
     * @see #unsetSDO()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_SDO()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getParentDOType
     * @model opposite="ParentDOType" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< SDO > getSDO();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getSDO <em>SDO</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSDO()
     * @see #getSDO()
     * @generated
     */
    void unsetSDO();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getSDO <em>SDO</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SDO</em>' containment reference list is set.
     * @see #unsetSDO()
     * @see #getSDO()
     * @generated
     */
    boolean isSetSDO();

} // DOType
