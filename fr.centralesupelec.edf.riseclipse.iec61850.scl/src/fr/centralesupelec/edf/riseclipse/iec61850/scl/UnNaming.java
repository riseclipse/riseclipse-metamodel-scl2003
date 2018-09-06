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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Un Naming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.UnNaming#getDesc <em>Desc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getUnNaming()
 * @model abstract="true"
 * @generated
 */
public interface UnNaming extends BaseElement {
    /**
     * Returns the value of the '<em><b>Desc</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Desc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Desc</em>' attribute.
     * @see #isSetDesc()
     * @see #unsetDesc()
     * @see #setDesc(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getUnNaming_Desc()
     * @model default="" unsettable="true"
     * @generated
     */
    String getDesc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.UnNaming#getDesc <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Desc</em>' attribute.
     * @see #isSetDesc()
     * @see #unsetDesc()
     * @see #getDesc()
     * @generated
     */
    void setDesc(String value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.UnNaming#getDesc <em>Desc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDesc()
     * @see #getDesc()
     * @see #setDesc(String)
     * @generated
     */
    void unsetDesc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.UnNaming#getDesc <em>Desc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Desc</em>' attribute is set.
     * @see #unsetDesc()
     * @see #getDesc()
     * @see #setDesc(String)
     * @generated
     */
    boolean isSetDesc();

} // UnNaming
