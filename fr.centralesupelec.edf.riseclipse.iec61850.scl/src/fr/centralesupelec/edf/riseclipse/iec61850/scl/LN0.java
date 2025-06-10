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
 * A representation of the model object '<em><b>LN0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getGSEControl <em>GSE Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getParentLDevice <em>Parent LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSampledValueControl <em>Sampled Value Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSettingControl <em>Setting Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN0()
 * @model
 * @generated
 */
public interface LN0 extends AnyLN {
    /**
     * Returns the value of the '<em><b>GSE Control</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getParentLN0 <em>Parent LN0</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>GSE Control</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>GSE Control</em>' containment reference list.
     * @see #isSetGSEControl()
     * @see #unsetGSEControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN0_GSEControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getParentLN0
     * @model opposite="ParentLN0" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< GSEControl > getGSEControl();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getGSEControl <em>GSE Control</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGSEControl()
     * @see #getGSEControl()
     * @generated
     */
    void unsetGSEControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getGSEControl <em>GSE Control</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>GSE Control</em>' containment reference list is set.
     * @see #unsetGSEControl()
     * @see #getGSEControl()
     * @generated
     */
    boolean isSetGSEControl();

    /**
     * Returns the value of the '<em><b>Parent LDevice</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN0 <em>LN0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LDevice</em>' container reference.
     * @see #setParentLDevice(LDevice)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN0_ParentLDevice()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN0
     * @model opposite="LN0" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    @Override
    LDevice getParentLDevice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getParentLDevice <em>Parent LDevice</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LDevice</em>' container reference.
     * @see #getParentLDevice()
     * @generated
     */
    void setParentLDevice( LDevice value );

    /**
     * Returns the value of the '<em><b>Sampled Value Control</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getParentLN0 <em>Parent LN0</em>}'.
     * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sampled Value Control</em>' containment reference list isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
     * @return the value of the '<em>Sampled Value Control</em>' containment reference list.
     * @see #isSetSampledValueControl()
     * @see #unsetSampledValueControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN0_SampledValueControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getParentLN0
     * @model opposite="ParentLN0" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    EList< SampledValueControl > getSampledValueControl();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSampledValueControl <em>Sampled Value Control</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSampledValueControl()
     * @see #getSampledValueControl()
     * @generated
     */
    void unsetSampledValueControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSampledValueControl <em>Sampled Value Control</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sampled Value Control</em>' containment reference list is set.
     * @see #unsetSampledValueControl()
     * @see #getSampledValueControl()
     * @generated
     */
    boolean isSetSampledValueControl();

    /**
     * Returns the value of the '<em><b>Setting Control</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getParentLN0 <em>Parent LN0</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Setting Control</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Setting Control</em>' containment reference.
     * @see #isSetSettingControl()
     * @see #unsetSettingControl()
     * @see #setSettingControl(SettingControl)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN0_SettingControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getParentLN0
     * @model opposite="ParentLN0" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='##targetNamespace' kind='element'"
     * @generated
     */
    SettingControl getSettingControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSettingControl <em>Setting Control</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Setting Control</em>' containment reference.
     * @see #isSetSettingControl()
     * @see #unsetSettingControl()
     * @see #getSettingControl()
     * @generated
     */
    void setSettingControl( SettingControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSettingControl <em>Setting Control</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSettingControl()
     * @see #getSettingControl()
     * @see #setSettingControl(SettingControl)
     * @generated
     */
    void unsetSettingControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSettingControl <em>Setting Control</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Setting Control</em>' containment reference is set.
     * @see #unsetSettingControl()
     * @see #getSettingControl()
     * @see #setSettingControl(SettingControl)
     * @generated
     */
    boolean isSetSettingControl();

} // LN0
