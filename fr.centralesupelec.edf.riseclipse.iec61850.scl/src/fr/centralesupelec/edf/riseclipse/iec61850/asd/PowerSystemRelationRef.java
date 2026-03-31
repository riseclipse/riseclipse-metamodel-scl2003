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
 * A representation of the model object '<em><b>Power System Relation Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the PowerSystemRelationRef element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getPowerSystemRelation <em>Power System Relation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getPowerSystemRelationUuid <em>Power System Relation Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getRefersToPowerSystemRelation <em>Refers To Power System Relation</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelationRef()
 * @model extendedMetaData="name='tPowerSystemRelationRef' kind='elementOnly'"
 * @generated
 */
public interface PowerSystemRelationRef extends FunctionalVariantRefContainer {
    /**
     * Returns the value of the '<em><b>Power System Relation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Path to the power system relation referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power System Relation</em>' attribute.
     * @see #setPowerSystemRelation(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelationRef_PowerSystemRelation()
     * @model extendedMetaData="kind='attribute' name='powerSystemRelation'"
     * @generated
     */
    String getPowerSystemRelation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getPowerSystemRelation <em>Power System Relation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power System Relation</em>' attribute.
     * @see #getPowerSystemRelation()
     * @generated
     */
    void setPowerSystemRelation( String value );

    /**
     * Returns the value of the '<em><b>Power System Relation Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the power system relation referenced
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power System Relation Uuid</em>' attribute.
     * @see #setPowerSystemRelationUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelationRef_PowerSystemRelationUuid()
     * @model extendedMetaData="kind='attribute' name='powerSystemRelationUuid'"
     * @generated
     */
    String getPowerSystemRelationUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getPowerSystemRelationUuid <em>Power System Relation Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power System Relation Uuid</em>' attribute.
     * @see #getPowerSystemRelationUuid()
     * @generated
     */
    void setPowerSystemRelationUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Function Role Content</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getPowerSystemRelationRef <em>Power System Relation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #setParentFunctionRoleContent(FunctionRoleContent)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelationRef_ParentFunctionRoleContent()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getPowerSystemRelationRef
     * @model opposite="PowerSystemRelationRef" unsettable="true" ordered="false"
     * @generated
     */
    FunctionRoleContent getParentFunctionRoleContent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Role Content</em>' container reference.
     * @see #getParentFunctionRoleContent()
     * @generated
     */
    void setParentFunctionRoleContent( FunctionRoleContent value );

    /**
     * Returns the value of the '<em><b>Refers To Power System Relation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getReferredByPowerSystemRelationRef <em>Referred By Power System Relation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Power System Relation</em>' reference.
     * @see #isSetRefersToPowerSystemRelation()
     * @see #unsetRefersToPowerSystemRelation()
     * @see #setRefersToPowerSystemRelation(PowerSystemRelation)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelationRef_RefersToPowerSystemRelation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getReferredByPowerSystemRelationRef
     * @model opposite="ReferredByPowerSystemRelationRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    PowerSystemRelation getRefersToPowerSystemRelation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getRefersToPowerSystemRelation <em>Refers To Power System Relation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Power System Relation</em>' reference.
     * @see #isSetRefersToPowerSystemRelation()
     * @see #unsetRefersToPowerSystemRelation()
     * @see #getRefersToPowerSystemRelation()
     * @generated
     */
    void setRefersToPowerSystemRelation( PowerSystemRelation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getRefersToPowerSystemRelation <em>Refers To Power System Relation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToPowerSystemRelation()
     * @see #getRefersToPowerSystemRelation()
     * @see #setRefersToPowerSystemRelation(PowerSystemRelation)
     * @generated
     */
    void unsetRefersToPowerSystemRelation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getRefersToPowerSystemRelation <em>Refers To Power System Relation</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Power System Relation</em>' reference is set.
     * @see #unsetRefersToPowerSystemRelation()
     * @see #getRefersToPowerSystemRelation()
     * @see #setRefersToPowerSystemRelation(PowerSystemRelation)
     * @generated
     */
    boolean isSetRefersToPowerSystemRelation();

} // PowerSystemRelationRef
