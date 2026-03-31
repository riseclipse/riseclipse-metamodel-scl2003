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
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IED Source Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDSourceFiles#getSclFileReference <em>Scl File Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDSourceFiles#getParentIED <em>Parent IED</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIEDSourceFiles()
 * @model
 * @generated
 */
public interface IEDSourceFiles extends BaseElement {
    /**
     * Returns the value of the '<em><b>Scl File Reference</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference#getParentIEDSourceFiles <em>Parent IED Source Files</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scl File Reference</em>' containment reference list.
     * @see #isSetSclFileReference()
     * @see #unsetSclFileReference()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIEDSourceFiles_SclFileReference()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference#getParentIEDSourceFiles
     * @model opposite="ParentIEDSourceFiles" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< SclFileReference > getSclFileReference();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDSourceFiles#getSclFileReference <em>Scl File Reference</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSclFileReference()
     * @see #getSclFileReference()
     * @generated
     */
    void unsetSclFileReference();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDSourceFiles#getSclFileReference <em>Scl File Reference</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scl File Reference</em>' containment reference list is set.
     * @see #unsetSclFileReference()
     * @see #getSclFileReference()
     * @generated
     */
    boolean isSetSclFileReference();

    /**
     * Returns the value of the '<em><b>Parent IED</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getIEDSourceFiles <em>IED Source Files</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent IED</em>' container reference.
     * @see #setParentIED(IED)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIEDSourceFiles_ParentIED()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getIEDSourceFiles
     * @model opposite="IEDSourceFiles" unsettable="true" ordered="false"
     * @generated
     */
    IED getParentIED();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDSourceFiles#getParentIED <em>Parent IED</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent IED</em>' container reference.
     * @see #getParentIED()
     * @generated
     */
    void setParentIED( IED value );

} // IEDSourceFiles
