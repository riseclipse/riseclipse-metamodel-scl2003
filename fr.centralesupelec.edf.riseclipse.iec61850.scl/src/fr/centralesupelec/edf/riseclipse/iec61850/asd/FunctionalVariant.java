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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a functional variant of the Application
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getParentApplication <em>Parent Application</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getParentFunctionalVariantGroup <em>Parent Functional Variant Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getReferredByFunctionalVariantRef <em>Referred By Functional Variant Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariant()
 * @model
 * @generated
 */
public interface FunctionalVariant extends AbstractFunctionalVariant {
    /**
     * Returns the value of the '<em><b>Parent Application</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariant <em>Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Application</em>' container reference.
     * @see #setParentApplication(Application)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariant_ParentApplication()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariant
     * @model opposite="FunctionalVariant" unsettable="true" ordered="false"
     * @generated
     */
    Application getParentApplication();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getParentApplication <em>Parent Application</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Application</em>' container reference.
     * @see #getParentApplication()
     * @generated
     */
    void setParentApplication( Application value );

    /**
     * Returns the value of the '<em><b>Parent Functional Variant Group</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getFunctionalVariant <em>Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Functional Variant Group</em>' container reference.
     * @see #setParentFunctionalVariantGroup(FunctionalVariantGroup)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariant_ParentFunctionalVariantGroup()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getFunctionalVariant
     * @model opposite="functionalVariant" unsettable="true" ordered="false"
     * @generated
     */
    FunctionalVariantGroup getParentFunctionalVariantGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getParentFunctionalVariantGroup <em>Parent Functional Variant Group</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Functional Variant Group</em>' container reference.
     * @see #getParentFunctionalVariantGroup()
     * @generated
     */
    void setParentFunctionalVariantGroup( FunctionalVariantGroup value );

    /**
     * Returns the value of the '<em><b>Referred By Functional Variant Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getRefersToFunctionalVariant <em>Refers To Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Functional Variant Ref</em>' reference list.
     * @see #isSetReferredByFunctionalVariantRef()
     * @see #unsetReferredByFunctionalVariantRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getFunctionalVariant_ReferredByFunctionalVariantRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getRefersToFunctionalVariant
     * @model opposite="RefersToFunctionalVariant" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< FunctionalVariantRef > getReferredByFunctionalVariantRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getReferredByFunctionalVariantRef <em>Referred By Functional Variant Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByFunctionalVariantRef()
     * @see #getReferredByFunctionalVariantRef()
     * @generated
     */
    void unsetReferredByFunctionalVariantRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getReferredByFunctionalVariantRef <em>Referred By Functional Variant Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Functional Variant Ref</em>' reference list is set.
     * @see #unsetReferredByFunctionalVariantRef()
     * @see #getReferredByFunctionalVariantRef()
     * @generated
     */
    boolean isSetReferredByFunctionalVariantRef();

} // FunctionalVariant
