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
 * A representation of the model object '<em><b>Variable Apply To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the application of a Variable
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDaName <em>Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getElement <em>Element</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getElementUuid <em>Element Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getFormat <em>Format</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getSGroup <em>SGroup</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getParentVariable <em>Parent Variable</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableApplyTo()
 * @model extendedMetaData="name='tVariableApplyTo' kind='elementOnly'"
 * @generated
 */
public interface VariableApplyTo extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the attribute in the element where the variable has to be applied. If not defined, variable value will be applied to the text value of the element
     * <!-- end-model-doc -->
     * @return the value of the '<em>Attribute</em>' attribute.
     * @see #setAttribute(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableApplyTo_Attribute()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='attribute'"
     * @generated
     */
    String getAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getAttribute <em>Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute</em>' attribute.
     * @see #getAttribute()
     * @generated
     */
    void setAttribute( String value );

    /**
     * Returns the value of the '<em><b>Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * When element is an LNode, name of the DA of the LNode where the variable has to be applied
     * <!-- end-model-doc -->
     * @return the value of the '<em>Da Name</em>' attribute.
     * @see #setDaName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableApplyTo_DaName()
     * @model extendedMetaData="kind='attribute' name='daName'"
     * @generated
     */
    String getDaName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDaName <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Da Name</em>' attribute.
     * @see #getDaName()
     * @generated
     */
    void setDaName( String value );

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A default value which can be applied if no value is selected
     * <!-- end-model-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableApplyTo_DefaultValue()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='defaultValue'"
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue( String value );

    /**
     * Returns the value of the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * When element is an LNode, name of the DO of the LNode where the variable has to be applied
     * <!-- end-model-doc -->
     * @return the value of the '<em>Do Name</em>' attribute.
     * @see #setDoName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableApplyTo_DoName()
     * @model extendedMetaData="kind='attribute' name='doName'"
     * @generated
     */
    String getDoName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDoName <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Do Name</em>' attribute.
     * @see #getDoName()
     * @generated
     */
    void setDoName( String value );

    /**
     * Returns the value of the '<em><b>Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Path to the element where the variable has to be applied
     * <!-- end-model-doc -->
     * @return the value of the '<em>Element</em>' attribute.
     * @see #setElement(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableApplyTo_Element()
     * @model extendedMetaData="kind='attribute' name='element'"
     * @generated
     */
    String getElement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getElement <em>Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element</em>' attribute.
     * @see #getElement()
     * @generated
     */
    void setElement( String value );

    /**
     * Returns the value of the '<em><b>Element Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the element where the variable has to be applied. If the element is an LNode, additional attributes to identify the DO and the DA have to be fulfilled
     * <!-- end-model-doc -->
     * @return the value of the '<em>Element Uuid</em>' attribute.
     * @see #setElementUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableApplyTo_ElementUuid()
     * @model extendedMetaData="kind='attribute' name='elementUuid'"
     * @generated
     */
    String getElementUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getElementUuid <em>Element Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Uuid</em>' attribute.
     * @see #getElementUuid()
     * @generated
     */
    void setElementUuid( String value );

    /**
     * Returns the value of the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Definition of a format to follow before applying value. This is a text with identification of the place to put the value, identified by brackets.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Format</em>' attribute.
     * @see #setFormat(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableApplyTo_Format()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='format'"
     * @generated
     */
    String getFormat();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getFormat <em>Format</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Format</em>' attribute.
     * @see #getFormat()
     * @generated
     */
    void setFormat( String value );

    /**
     * Returns the value of the '<em><b>SGroup</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * When the element is a DA which belong to a setting group, this attribute indicates the group number to use to set the DA value when no attribute is defined
     * <!-- end-model-doc -->
     * @return the value of the '<em>SGroup</em>' attribute.
     * @see #isSetSGroup()
     * @see #unsetSGroup()
     * @see #setSGroup(long)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableApplyTo_SGroup()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
     *        extendedMetaData="kind='attribute' name='sGroup'"
     * @generated
     */
    long getSGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getSGroup <em>SGroup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SGroup</em>' attribute.
     * @see #isSetSGroup()
     * @see #unsetSGroup()
     * @see #getSGroup()
     * @generated
     */
    void setSGroup( long value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getSGroup <em>SGroup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSGroup()
     * @see #getSGroup()
     * @see #setSGroup(long)
     * @generated
     */
    void unsetSGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getSGroup <em>SGroup</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SGroup</em>' attribute is set.
     * @see #unsetSGroup()
     * @see #getSGroup()
     * @see #setSGroup(long)
     * @generated
     */
    boolean isSetSGroup();

    /**
     * Returns the value of the '<em><b>Parent Variable</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getVariableApplyTo <em>Variable Apply To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Variable</em>' container reference.
     * @see #setParentVariable(Variable)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getVariableApplyTo_ParentVariable()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getVariableApplyTo
     * @model opposite="VariableApplyTo" unsettable="true" ordered="false"
     * @generated
     */
    Variable getParentVariable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getParentVariable <em>Parent Variable</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Variable</em>' container reference.
     * @see #getParentVariable()
     * @generated
     */
    void setParentVariable( Variable value );

} // VariableApplyTo
