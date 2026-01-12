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
 * A representation of the model object '<em><b>Wiring Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wiring parameters for service specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters#getInpNam <em>Inp Nam</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters#getInpRef <em>Inp Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getWiringParameters()
 * @model extendedMetaData="name='tWiringParameters' kind='elementOnly'"
 * @generated
 */
public interface WiringParameters extends ServiceParameters {
    /**
     * Returns the value of the '<em><b>Inp Nam</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Label text of the input to use in physical input logical node
     * <!-- end-model-doc -->
     * @return the value of the '<em>Inp Nam</em>' attribute.
     * @see #setInpNam(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getWiringParameters_InpNam()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='inpNam'"
     * @generated
     */
    String getInpNam();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters#getInpNam <em>Inp Nam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inp Nam</em>' attribute.
     * @see #getInpNam()
     * @generated
     */
    void setInpNam( String value );

    /**
     * Returns the value of the '<em><b>Inp Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reference of the input to use in physical input logical node
     * <!-- end-model-doc -->
     * @return the value of the '<em>Inp Ref</em>' attribute.
     * @see #setInpRef(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getWiringParameters_InpRef()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='inpRef'"
     * @generated
     */
    String getInpRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters#getInpRef <em>Inp Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inp Ref</em>' attribute.
     * @see #getInpRef()
     * @generated
     */
    void setInpRef( String value );

} // WiringParameters
