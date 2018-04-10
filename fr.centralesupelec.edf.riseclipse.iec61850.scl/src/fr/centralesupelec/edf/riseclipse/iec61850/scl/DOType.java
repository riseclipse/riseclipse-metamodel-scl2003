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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByDO <em>Referred By DO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getSDO <em>SDO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredBySDO <em>Referred By SDO</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType()
 * @model
 * @generated
 */
public interface DOType extends IDNaming {
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
     * @model unsettable="true"
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getDOType <em>DO Type</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getDOType
     * @model opposite="DOType" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<DA> getDA();

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
     * Returns the value of the '<em><b>Referred By DO</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getRefersToDOType <em>Refers To DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By DO</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By DO</em>' reference list.
     * @see #isSetReferredByDO()
     * @see #unsetReferredByDO()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_ReferredByDO()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getRefersToDOType
     * @model opposite="RefersToDOType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList<DO> getReferredByDO();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByDO <em>Referred By DO</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByDO()
     * @see #getReferredByDO()
     * @generated
     */
    void unsetReferredByDO();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByDO <em>Referred By DO</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By DO</em>' reference list is set.
     * @see #unsetReferredByDO()
     * @see #getReferredByDO()
     * @generated
     */
    boolean isSetReferredByDO();

    /**
     * Returns the value of the '<em><b>Data Type Templates</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDOType <em>DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type Templates</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type Templates</em>' container reference.
     * @see #setDataTypeTemplates(DataTypeTemplates)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_DataTypeTemplates()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDOType
     * @model opposite="DOType" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    DataTypeTemplates getDataTypeTemplates();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDataTypeTemplates <em>Data Type Templates</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type Templates</em>' container reference.
     * @see #getDataTypeTemplates()
     * @generated
     */
    void setDataTypeTemplates( DataTypeTemplates value );

    /**
     * Returns the value of the '<em><b>SDO</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getDOType <em>DO Type</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getDOType
     * @model opposite="DOType" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<SDO> getSDO();

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

    /**
     * Returns the value of the '<em><b>Referred By SDO</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getRefersToDOType <em>Refers To DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Referred By SDO</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By SDO</em>' reference list.
     * @see #isSetReferredBySDO()
     * @see #unsetReferredBySDO()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getDOType_ReferredBySDO()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getRefersToDOType
     * @model opposite="RefersToDOType" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList<SDO> getReferredBySDO();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredBySDO <em>Referred By SDO</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredBySDO()
     * @see #getReferredBySDO()
     * @generated
     */
    void unsetReferredBySDO();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredBySDO <em>Referred By SDO</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By SDO</em>' reference list is set.
     * @see #unsetReferredBySDO()
     * @see #getReferredBySDO()
     * @generated
     */
    boolean isSetReferredBySDO();

} // DOType
