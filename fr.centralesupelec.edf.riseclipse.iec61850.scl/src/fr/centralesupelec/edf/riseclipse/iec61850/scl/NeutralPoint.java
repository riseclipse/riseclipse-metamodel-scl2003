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
 * A representation of the model object '<em><b>Neutral Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint#getTransformerWinding <em>Transformer Winding</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getNeutralPoint()
 * @model
 * @generated
 */
public interface NeutralPoint extends Terminal {
    /**
	 * Returns the value of the '<em><b>Transformer Winding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getNeutralPoint <em>Neutral Point</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer Winding</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Winding</em>' container reference.
	 * @see #setTransformerWinding(TransformerWinding)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getNeutralPoint_TransformerWinding()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getNeutralPoint
	 * @model opposite="NeutralPoint" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!NeutralPoint!TransformerWinding'"
	 * @generated
	 */
    TransformerWinding getTransformerWinding();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint#getTransformerWinding <em>Transformer Winding</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Winding</em>' container reference.
	 * @see #getTransformerWinding()
	 * @generated
	 */
    void setTransformerWinding( TransformerWinding value );

} // NeutralPoint
