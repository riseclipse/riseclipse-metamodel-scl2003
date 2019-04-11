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
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag Virtual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual#getVirtual <em>Virtual</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgVirtual()
 * @model abstract="true"
 * @generated
 */
public interface AgVirtual extends EObject {
    /**
     * Returns the value of the '<em><b>Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Virtual</em>' attribute.
     * @see #isSetVirtual()
     * @see #unsetVirtual()
     * @see #setVirtual(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgVirtual_Virtual()
     * @model unsettable="true"
     * @generated
     */
    Boolean getVirtual();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual#getVirtual <em>Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Virtual</em>' attribute.
     * @see #isSetVirtual()
     * @see #unsetVirtual()
     * @see #getVirtual()
     * @generated
     */
    void setVirtual(Boolean value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual#getVirtual <em>Virtual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVirtual()
     * @see #getVirtual()
     * @see #setVirtual(Boolean)
     * @generated
     */
    void unsetVirtual();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual#getVirtual <em>Virtual</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Virtual</em>' attribute is set.
     * @see #unsetVirtual()
     * @see #getVirtual()
     * @see #setVirtual(Boolean)
     * @generated
     */
    boolean isSetVirtual();

} // AgVirtual
