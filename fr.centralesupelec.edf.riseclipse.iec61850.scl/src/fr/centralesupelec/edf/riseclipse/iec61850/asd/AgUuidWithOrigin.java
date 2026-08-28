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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgUuid;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag Uuid With Origin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgUuidWithOrigin#getOriginUuid <em>Origin Uuid</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAgUuidWithOrigin()
 * @model
 * @generated
 */
public interface AgUuidWithOrigin extends AgUuid {
    /**
     * Returns the value of the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Origin Uuid</em>' attribute.
     * @see #isSetOriginUuid()
     * @see #unsetOriginUuid()
     * @see #setOriginUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getAgUuidWithOrigin_OriginUuid()
     * @model unsettable="true"
     * @generated
     */
    String getOriginUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgUuidWithOrigin#getOriginUuid <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Origin Uuid</em>' attribute.
     * @see #isSetOriginUuid()
     * @see #unsetOriginUuid()
     * @see #getOriginUuid()
     * @generated
     */
    void setOriginUuid( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgUuidWithOrigin#getOriginUuid <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOriginUuid()
     * @see #getOriginUuid()
     * @see #setOriginUuid(String)
     * @generated
     */
    void unsetOriginUuid();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AgUuidWithOrigin#getOriginUuid <em>Origin Uuid</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Origin Uuid</em>' attribute is set.
     * @see #unsetOriginUuid()
     * @see #getOriginUuid()
     * @see #setOriginUuid(String)
     * @generated
     */
    boolean isSetOriginUuid();

} // AgUuidWithOrigin
