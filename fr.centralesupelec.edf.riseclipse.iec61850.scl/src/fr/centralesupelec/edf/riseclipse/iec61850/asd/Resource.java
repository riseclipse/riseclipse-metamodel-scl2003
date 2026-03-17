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
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * resource bound to this element (could be any named element in the process structure or a LNode)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getResInst <em>Res Inst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getSourceUuid <em>Source Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getParentProcessResource <em>Parent Process Resource</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getResource()
 * @model extendedMetaData="name='tResource' kind='simple'"
 * @generated
 */
public interface Resource extends AsdObject {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getResource_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="name=':0' kind='simple'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue( String value );

    /**
     * Returns the value of the '<em><b>Res Inst</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Instance of the reference in case of multiplicity is allowed
     * <!-- end-model-doc -->
     * @return the value of the '<em>Res Inst</em>' attribute.
     * @see #isSetResInst()
     * @see #unsetResInst()
     * @see #setResInst(int)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getResource_ResInst()
     * @model default="1" unsettable="true"
     *        extendedMetaData="kind='attribute' name='resInst'"
     * @generated
     */
    int getResInst();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getResInst <em>Res Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Res Inst</em>' attribute.
     * @see #isSetResInst()
     * @see #unsetResInst()
     * @see #getResInst()
     * @generated
     */
    void setResInst( int value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getResInst <em>Res Inst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResInst()
     * @see #getResInst()
     * @see #setResInst(int)
     * @generated
     */
    void unsetResInst();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getResInst <em>Res Inst</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Res Inst</em>' attribute is set.
     * @see #unsetResInst()
     * @see #getResInst()
     * @see #setResInst(int)
     * @generated
     */
    boolean isSetResInst();

    /**
     * Returns the value of the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * resource bound to the current instance
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source</em>' attribute.
     * @see #setSource(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getResource_Source()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
     *        extendedMetaData="kind='attribute' name='source'"
     * @generated
     */
    String getSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getSource <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' attribute.
     * @see #getSource()
     * @generated
     */
    void setSource( String value );

    /**
     * Returns the value of the '<em><b>Source Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the resource bound to the current instance
     * <!-- end-model-doc -->
     * @return the value of the '<em>Source Uuid</em>' attribute.
     * @see #setSourceUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getResource_SourceUuid()
     * @model extendedMetaData="kind='attribute' name='sourceUuid'"
     * @generated
     */
    String getSourceUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getSourceUuid <em>Source Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Uuid</em>' attribute.
     * @see #getSourceUuid()
     * @generated
     */
    void setSourceUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Process Resource</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Process Resource</em>' container reference.
     * @see #setParentProcessResource(ProcessResource)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getResource_ParentProcessResource()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getResource
     * @model opposite="Resource" unsettable="true" ordered="false"
     * @generated
     */
    ProcessResource getParentProcessResource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getParentProcessResource <em>Parent Process Resource</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Process Resource</em>' container reference.
     * @see #getParentProcessResource()
     * @generated
     */
    void setParentProcessResource( ProcessResource value );

} // Resource
