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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neutral Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint#getParentTransformerWinding <em>Parent Transformer Winding</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getNeutralPoint()
 * @model
 * @generated
 */
public interface NeutralPoint extends Terminal {
    /**
     * Returns the value of the '<em><b>Parent Transformer Winding</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getNeutralPoint <em>Neutral Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Transformer Winding</em>' container reference.
     * @see #setParentTransformerWinding(TransformerWinding)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getNeutralPoint_ParentTransformerWinding()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getNeutralPoint
     * @model opposite="NeutralPoint" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    TransformerWinding getParentTransformerWinding();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint#getParentTransformerWinding <em>Parent Transformer Winding</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Transformer Winding</em>' container reference.
     * @see #getParentTransformerWinding()
     * @generated
     */
    void setParentTransformerWinding( TransformerWinding value );

} // NeutralPoint
