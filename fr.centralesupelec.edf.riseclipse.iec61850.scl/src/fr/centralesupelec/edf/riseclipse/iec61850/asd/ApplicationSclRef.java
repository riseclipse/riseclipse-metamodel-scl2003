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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Scl Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to the ASD files used to create an application
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getSclFileReference <em>Scl File Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getParentApplication <em>Parent Application</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplicationSclRef()
 * @model
 * @generated
 */
public interface ApplicationSclRef extends BaseExtensionElement {
    /**
     * Returns the value of the '<em><b>Scl File Reference</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference#getParentApplicationSclRef <em>Parent Application Scl Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scl File Reference</em>' containment reference.
     * @see #isSetSclFileReference()
     * @see #unsetSclFileReference()
     * @see #setSclFileReference(SclFileReference)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplicationSclRef_SclFileReference()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileReference#getParentApplicationSclRef
     * @model opposite="ParentApplicationSclRef" containment="true" unsettable="true" ordered="false"
     *        extendedMetaData="kind='element' name='SclFileReference' namespace='##targetNamespace'"
     * @generated
     */
    SclFileReference getSclFileReference();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getSclFileReference <em>Scl File Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scl File Reference</em>' containment reference.
     * @see #isSetSclFileReference()
     * @see #unsetSclFileReference()
     * @see #getSclFileReference()
     * @generated
     */
    void setSclFileReference( SclFileReference value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getSclFileReference <em>Scl File Reference</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSclFileReference()
     * @see #getSclFileReference()
     * @see #setSclFileReference(SclFileReference)
     * @generated
     */
    void unsetSclFileReference();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getSclFileReference <em>Scl File Reference</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scl File Reference</em>' containment reference is set.
     * @see #unsetSclFileReference()
     * @see #getSclFileReference()
     * @see #setSclFileReference(SclFileReference)
     * @generated
     */
    boolean isSetSclFileReference();

    /**
     * Returns the value of the '<em><b>Parent Application</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getApplicationSclRef <em>Application Scl Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Application</em>' container reference.
     * @see #setParentApplication(Application)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getApplicationSclRef_ParentApplication()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getApplicationSclRef
     * @model opposite="ApplicationSclRef" unsettable="true" ordered="false"
     * @generated
     */
    Application getParentApplication();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getParentApplication <em>Parent Application</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Application</em>' container reference.
     * @see #getParentApplication()
     * @generated
     */
    void setParentApplication( Application value );

} // ApplicationSclRef
