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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Requested SCD File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.MinRequestedSCDFile#getParentMinRequestedSCDFiles <em>Parent Min Requested SCD Files</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMinRequestedSCDFile()
 * @model
 * @generated
 */
public interface MinRequestedSCDFile extends SclFileUUIDReference {
    /**
     * Returns the value of the '<em><b>Parent Min Requested SCD Files</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.MinRequestedSCDFiles#getMinRequestedSCDFile <em>Min Requested SCD File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Min Requested SCD Files</em>' container reference.
     * @see #setParentMinRequestedSCDFiles(MinRequestedSCDFiles)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getMinRequestedSCDFile_ParentMinRequestedSCDFiles()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.MinRequestedSCDFiles#getMinRequestedSCDFile
     * @model opposite="MinRequestedSCDFile" unsettable="true" ordered="false"
     * @generated
     */
    MinRequestedSCDFiles getParentMinRequestedSCDFiles();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.MinRequestedSCDFile#getParentMinRequestedSCDFiles <em>Parent Min Requested SCD Files</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Min Requested SCD Files</em>' container reference.
     * @see #getParentMinRequestedSCDFiles()
     * @generated
     */
    void setParentMinRequestedSCDFiles( MinRequestedSCDFiles value );

} // MinRequestedSCDFile
