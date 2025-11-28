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
 * A representation of the model object '<em><b>Control Block Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Control blocks parameters for service specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters#getCbName <em>Cb Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters#getDsName <em>Ds Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlBlockParameters()
 * @model abstract="true"
 * @generated
 */
public interface ControlBlockParameters extends ServiceParameters {
    /**
     * Returns the value of the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * name to use for the control block or rule to create it
     * <!-- end-model-doc -->
     * @return the value of the '<em>Cb Name</em>' attribute.
     * @see #setCbName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlBlockParameters_CbName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='cbName'"
     * @generated
     */
    String getCbName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters#getCbName <em>Cb Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cb Name</em>' attribute.
     * @see #getCbName()
     * @generated
     */
    void setCbName( String value );

    /**
     * Returns the value of the '<em><b>Ds Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * name to use for the dtatset linked to the control block or rule to create it
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ds Name</em>' attribute.
     * @see #setDsName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getControlBlockParameters_DsName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='dsName'"
     * @generated
     */
    String getDsName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters#getDsName <em>Ds Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ds Name</em>' attribute.
     * @see #getDsName()
     * @generated
     */
    void setDsName( String value );

} // ControlBlockParameters
