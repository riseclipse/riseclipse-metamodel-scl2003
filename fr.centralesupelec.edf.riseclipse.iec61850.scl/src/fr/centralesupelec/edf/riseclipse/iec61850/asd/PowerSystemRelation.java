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
 * A representation of the model object '<em><b>Power System Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relation to a power system element. Could refer any named process element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getOriginUuid <em>Origin Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getRelation <em>Relation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getRelationUuid <em>Relation Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getSelector <em>Selector</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getTemplateUuid <em>Template Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getUuid <em>Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getParentPowerSystemRelation <em>Parent Power System Relation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getReferredByPowerSystemRelationRef <em>Referred By Power System Relation Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelation()
 * @model extendedMetaData="name='tPowerSystemRelation' kind='elementOnly'"
 * @generated
 */
public interface PowerSystemRelation extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * a name used to identify the power system relation in the rest of the SCL elements
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelation_Name()
     * @model extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Returns the value of the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Origin Uuid</em>' attribute.
     * @see #setOriginUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelation_OriginUuid()
     * @model extendedMetaData="kind='attribute' name='originUuid'"
     * @generated
     */
    String getOriginUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getOriginUuid <em>Origin Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Origin Uuid</em>' attribute.
     * @see #getOriginUuid()
     * @generated
     */
    void setOriginUuid( String value );

    /**
     * Returns the value of the '<em><b>Relation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * reference to an element of the Power System functionally related to function
     * <!-- end-model-doc -->
     * @return the value of the '<em>Relation</em>' attribute.
     * @see #setRelation(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelation_Relation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='relation'"
     * @generated
     */
    String getRelation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getRelation <em>Relation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relation</em>' attribute.
     * @see #getRelation()
     * @generated
     */
    void setRelation( String value );

    /**
     * Returns the value of the '<em><b>Relation Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the element of the Power System functionally related to function
     * <!-- end-model-doc -->
     * @return the value of the '<em>Relation Uuid</em>' attribute.
     * @see #setRelationUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelation_RelationUuid()
     * @model extendedMetaData="kind='attribute' name='relationUuid'"
     * @generated
     */
    String getRelationUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getRelationUuid <em>Relation Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relation Uuid</em>' attribute.
     * @see #getRelationUuid()
     * @generated
     */
    void setRelationUuid( String value );

    /**
     * Returns the value of the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Selector is used to give a searching rule to help user to select a target. It is represented by an XPath
     * <!-- end-model-doc -->
     * @return the value of the '<em>Selector</em>' attribute.
     * @see #setSelector(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelation_Selector()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='selector'"
     * @generated
     */
    String getSelector();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getSelector <em>Selector</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' attribute.
     * @see #getSelector()
     * @generated
     */
    void setSelector( String value );

    /**
     * Returns the value of the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Template Uuid</em>' attribute.
     * @see #setTemplateUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelation_TemplateUuid()
     * @model extendedMetaData="kind='attribute' name='templateUuid'"
     * @generated
     */
    String getTemplateUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getTemplateUuid <em>Template Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Template Uuid</em>' attribute.
     * @see #getTemplateUuid()
     * @generated
     */
    void setTemplateUuid( String value );

    /**
     * Returns the value of the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uuid</em>' attribute.
     * @see #setUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelation_Uuid()
     * @model extendedMetaData="kind='attribute' name='uuid'"
     * @generated
     */
    String getUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getUuid <em>Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uuid</em>' attribute.
     * @see #getUuid()
     * @generated
     */
    void setUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Power System Relation</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations#getPowerSystemRelation <em>Power System Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Power System Relation</em>' container reference.
     * @see #setParentPowerSystemRelation(PowerSystemRelations)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelation_ParentPowerSystemRelation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations#getPowerSystemRelation
     * @model opposite="powerSystemRelation" unsettable="true" ordered="false"
     * @generated
     */
    PowerSystemRelations getParentPowerSystemRelation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getParentPowerSystemRelation <em>Parent Power System Relation</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Power System Relation</em>' container reference.
     * @see #getParentPowerSystemRelation()
     * @generated
     */
    void setParentPowerSystemRelation( PowerSystemRelations value );

    /**
     * Returns the value of the '<em><b>Referred By Power System Relation Ref</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getRefersToPowerSystemRelation <em>Refers To Power System Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred By Power System Relation Ref</em>' reference list.
     * @see #isSetReferredByPowerSystemRelationRef()
     * @see #unsetReferredByPowerSystemRelationRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getPowerSystemRelation_ReferredByPowerSystemRelationRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getRefersToPowerSystemRelation
     * @model opposite="RefersToPowerSystemRelation" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList< PowerSystemRelationRef > getReferredByPowerSystemRelationRef();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getReferredByPowerSystemRelationRef <em>Referred By Power System Relation Ref</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferredByPowerSystemRelationRef()
     * @see #getReferredByPowerSystemRelationRef()
     * @generated
     */
    void unsetReferredByPowerSystemRelationRef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getReferredByPowerSystemRelationRef <em>Referred By Power System Relation Ref</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Referred By Power System Relation Ref</em>' reference list is set.
     * @see #unsetReferredByPowerSystemRelationRef()
     * @see #getReferredByPowerSystemRelationRef()
     * @generated
     */
    boolean isSetReferredByPowerSystemRelationRef();

} // PowerSystemRelation
