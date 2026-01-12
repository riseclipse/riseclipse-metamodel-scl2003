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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getRefersToLogParameters <em>Refers To Log Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDAS <em>Parent DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentSDS <em>Parent SDS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParametersRef()
 * @model
 * @generated
 */
public interface LogParametersRef extends ServiceParametersRef {
    /**
     * Returns the value of the '<em><b>Refers To Log Parameters</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getReferredByLogParametersRef <em>Referred By Log Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Log Parameters</em>' reference.
     * @see #isSetRefersToLogParameters()
     * @see #unsetRefersToLogParameters()
     * @see #setRefersToLogParameters(LogParameters)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParametersRef_RefersToLogParameters()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getReferredByLogParametersRef
     * @model opposite="ReferredByLogParametersRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    LogParameters getRefersToLogParameters();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getRefersToLogParameters <em>Refers To Log Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Log Parameters</em>' reference.
     * @see #isSetRefersToLogParameters()
     * @see #unsetRefersToLogParameters()
     * @see #getRefersToLogParameters()
     * @generated
     */
    void setRefersToLogParameters( LogParameters value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getRefersToLogParameters <em>Refers To Log Parameters</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToLogParameters()
     * @see #getRefersToLogParameters()
     * @see #setRefersToLogParameters(LogParameters)
     * @generated
     */
    void unsetRefersToLogParameters();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getRefersToLogParameters <em>Refers To Log Parameters</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Log Parameters</em>' reference is set.
     * @see #unsetRefersToLogParameters()
     * @see #getRefersToLogParameters()
     * @see #setRefersToLogParameters(LogParameters)
     * @generated
     */
    boolean isSetRefersToLogParameters();

    /**
     * Returns the value of the '<em><b>Parent DAS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLogParametersRef <em>Log Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DAS</em>' container reference.
     * @see #setParentDAS(DAS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParametersRef_ParentDAS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLogParametersRef
     * @model opposite="logParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    DAS getParentDAS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDAS <em>Parent DAS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DAS</em>' container reference.
     * @see #getParentDAS()
     * @generated
     */
    void setParentDAS( DAS value );

    /**
     * Returns the value of the '<em><b>Parent DOS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLogParametersRef <em>Log Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DOS</em>' container reference.
     * @see #setParentDOS(DOS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParametersRef_ParentDOS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLogParametersRef
     * @model opposite="logParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    DOS getParentDOS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDOS <em>Parent DOS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DOS</em>' container reference.
     * @see #getParentDOS()
     * @generated
     */
    void setParentDOS( DOS value );

    /**
     * Returns the value of the '<em><b>Parent SDS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getLogParametersRef <em>Log Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SDS</em>' container reference.
     * @see #setParentSDS(SDS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogParametersRef_ParentSDS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getLogParametersRef
     * @model opposite="logParametersRef" unsettable="true" ordered="false"
     * @generated
     */
    SDS getParentSDS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentSDS <em>Parent SDS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SDS</em>' container reference.
     * @see #getParentSDS()
     * @generated
     */
    void setParentSDS( SDS value );

} // LogParametersRef
