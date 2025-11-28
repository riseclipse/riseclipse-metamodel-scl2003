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
 * A representation of the model object '<em><b>Source Files</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SourceFiles#getSclFileReference <em>Scl File Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SourceFiles#getParentHitem <em>Parent Hitem</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SourceFiles#getParentHeader <em>Parent Header</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSourceFiles()
 * @model
 * @generated
 */
public interface SourceFiles extends BaseElement {
    /**
     * Returns the value of the '<em><b>Scl File Reference</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference#getParentSourceFiles <em>Parent Source Files</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scl File Reference</em>' containment reference list.
     * @see #isSetSclFileReference()
     * @see #unsetSclFileReference()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSourceFiles_SclFileReference()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference#getParentSourceFiles
     * @model opposite="ParentSourceFiles" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< SclFileReference > getSclFileReference();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SourceFiles#getSclFileReference <em>Scl File Reference</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSclFileReference()
     * @see #getSclFileReference()
     * @generated
     */
    void unsetSclFileReference();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SourceFiles#getSclFileReference <em>Scl File Reference</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scl File Reference</em>' containment reference list is set.
     * @see #unsetSclFileReference()
     * @see #getSclFileReference()
     * @generated
     */
    boolean isSetSclFileReference();

    /**
     * Returns the value of the '<em><b>Parent Hitem</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getSourceFiles <em>Source Files</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Hitem</em>' container reference.
     * @see #setParentHitem(Hitem)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSourceFiles_ParentHitem()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getSourceFiles
     * @model opposite="SourceFiles" unsettable="true" ordered="false"
     * @generated
     */
    Hitem getParentHitem();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SourceFiles#getParentHitem <em>Parent Hitem</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Hitem</em>' container reference.
     * @see #getParentHitem()
     * @generated
     */
    void setParentHitem( Hitem value );

    /**
     * Returns the value of the '<em><b>Parent Header</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getSourceFiles <em>Source Files</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Header</em>' container reference.
     * @see #setParentHeader(Header)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSourceFiles_ParentHeader()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getSourceFiles
     * @model opposite="SourceFiles" unsettable="true" ordered="false"
     * @generated
     */
    Header getParentHeader();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SourceFiles#getParentHeader <em>Parent Header</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Header</em>' container reference.
     * @see #getParentHeader()
     * @generated
     */
    void setParentHeader( Header value );

} // SourceFiles
