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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Scl Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to the FSD files used to create a Function
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef#getSclFileReference <em>Scl File Reference</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionSclRef()
 * @model extendedMetaData="name='FunctionSclRef' kind='elementOnly'"
 * @generated
 */
public interface FunctionSclRef extends BaseExtensionElement {
    /**
     * Returns the value of the '<em><b>Scl File Reference</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getParentFunctionSclRef <em>Parent Function Scl Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scl File Reference</em>' containment reference.
     * @see #isSetSclFileReference()
     * @see #unsetSclFileReference()
     * @see #setSclFileReference(SclFileUUIDReference)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionSclRef_SclFileReference()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getParentFunctionSclRef
     * @model opposite="ParentFunctionSclRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SclFileReference' namespace='##targetNamespace'"
     * @generated
     */
    SclFileUUIDReference getSclFileReference();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef#getSclFileReference <em>Scl File Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scl File Reference</em>' containment reference.
     * @see #isSetSclFileReference()
     * @see #unsetSclFileReference()
     * @see #getSclFileReference()
     * @generated
     */
    void setSclFileReference( SclFileUUIDReference value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef#getSclFileReference <em>Scl File Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSclFileReference()
     * @see #getSclFileReference()
     * @see #setSclFileReference(SclFileUUIDReference)
     * @generated
     */
    void unsetSclFileReference();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef#getSclFileReference <em>Scl File Reference</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scl File Reference</em>' containment reference is set.
     * @see #unsetSclFileReference()
     * @see #getSclFileReference()
     * @see #setSclFileReference(SclFileUUIDReference)
     * @generated
     */
    boolean isSetSclFileReference();

} // FunctionSclRef
