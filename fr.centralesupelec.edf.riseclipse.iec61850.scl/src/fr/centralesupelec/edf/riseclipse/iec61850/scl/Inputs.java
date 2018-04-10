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
 * A representation of the model object '<em><b>Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getAnyLN <em>Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getExtRef <em>Ext Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getInputs()
 * @model
 * @generated
 */
public interface Inputs extends UnNaming {
    /**
     * Returns the value of the '<em><b>Any LN</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any LN</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any LN</em>' container reference.
     * @see #setAnyLN(AnyLN)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getInputs_AnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInputs
     * @model opposite="Inputs" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AnyLN getAnyLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getAnyLN <em>Any LN</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Any LN</em>' container reference.
     * @see #getAnyLN()
     * @generated
     */
    void setAnyLN( AnyLN value );

    /**
     * Returns the value of the '<em><b>Ext Ref</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ext Ref</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ext Ref</em>' containment reference list.
     * @see #isSetExtRef()
     * @see #unsetExtRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getInputs_ExtRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getInputs
     * @model opposite="Inputs" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<ExtRef> getExtRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getExtRef <em>Ext Ref</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExtRef()
     * @see #getExtRef()
     * @generated
     */
    void unsetExtRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getExtRef <em>Ext Ref</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ext Ref</em>' containment reference list is set.
     * @see #unsetExtRef()
     * @see #getExtRef()
     * @generated
     */
    boolean isSetExtRef();

} // Inputs
