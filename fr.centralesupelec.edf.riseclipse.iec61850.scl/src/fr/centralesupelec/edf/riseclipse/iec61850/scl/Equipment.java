/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Equipment#getVirtual <em>Virtual</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEquipment()
 * @model
 * @generated
 */
public interface Equipment extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Virtual</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Virtual</em>' attribute.
     * @see #isSetVirtual()
     * @see #unsetVirtual()
     * @see #setVirtual(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getEquipment_Virtual()
     * @model unsettable="true"
     * @generated
     */
    Boolean getVirtual();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Equipment#getVirtual <em>Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Virtual</em>' attribute.
     * @see #isSetVirtual()
     * @see #unsetVirtual()
     * @see #getVirtual()
     * @generated
     */
    void setVirtual( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Equipment#getVirtual <em>Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetVirtual()
     * @see #getVirtual()
     * @see #setVirtual(Boolean)
     * @generated
     */
    void unsetVirtual();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Equipment#getVirtual <em>Virtual</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Virtual</em>' attribute is set.
     * @see #unsetVirtual()
     * @see #getVirtual()
     * @see #setVirtual(Boolean)
     * @generated
     */
    boolean isSetVirtual();

} // Equipment
