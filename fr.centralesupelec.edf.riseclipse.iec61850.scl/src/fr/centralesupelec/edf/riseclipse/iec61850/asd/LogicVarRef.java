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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Var Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A binding between a variable in the behavior description and a specification data object in the behavior description hierarchy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDaName <em>Da Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDataName <em>Data Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDoName <em>Do Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getLnodeUuid <em>Lnode Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getVarName <em>Var Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getRefersToLNode <em>Refers To LNode</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogicVarRef()
 * @model extendedMetaData="name='tLogicVarRef' kind='elementOnly'"
 * @generated
 */
public interface LogicVarRef extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the DA to be used in the logic (as input or output) when lnodeUuid is defined
     * <!-- end-model-doc -->
     * @return the value of the '<em>Da Name</em>' attribute.
     * @see #setDaName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogicVarRef_DaName()
     * @model extendedMetaData="kind='attribute' name='daName'"
     * @generated
     */
    String getDaName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDaName <em>Da Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Da Name</em>' attribute.
     * @see #getDaName()
     * @generated
     */
    void setDaName( String value );

    /**
     * Returns the value of the '<em><b>Data Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * local path to a DO or DA to be used in the logic (as input or output)
     * <!-- end-model-doc -->
     * @return the value of the '<em>Data Name</em>' attribute.
     * @see #setDataName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogicVarRef_DataName()
     * @model extendedMetaData="kind='attribute' name='dataName'"
     * @generated
     */
    String getDataName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDataName <em>Data Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Name</em>' attribute.
     * @see #getDataName()
     * @generated
     */
    void setDataName( String value );

    /**
     * Returns the value of the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Name of the DO to be used in the logic (as input or output) when lnodeUuid is defined
     * <!-- end-model-doc -->
     * @return the value of the '<em>Do Name</em>' attribute.
     * @see #setDoName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogicVarRef_DoName()
     * @model extendedMetaData="kind='attribute' name='doName'"
     * @generated
     */
    String getDoName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDoName <em>Do Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Do Name</em>' attribute.
     * @see #getDoName()
     * @generated
     */
    void setDoName( String value );

    /**
     * Returns the value of the '<em><b>Lnode Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of the LNode which contain the data to be used in the logic (as input or output)
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lnode Uuid</em>' attribute.
     * @see #setLnodeUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogicVarRef_LnodeUuid()
     * @model extendedMetaData="kind='attribute' name='lnodeUuid'"
     * @generated
     */
    String getLnodeUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getLnodeUuid <em>Lnode Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lnode Uuid</em>' attribute.
     * @see #getLnodeUuid()
     * @generated
     */
    void setLnodeUuid( String value );

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * In case of internal variable (not linked to a data or an input or output) a default value can be defined
     * <!-- end-model-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogicVarRef_Value()
     * @model extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue( String value );

    /**
     * Returns the value of the '<em><b>Var Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * variable name used in the logic
     * <!-- end-model-doc -->
     * @return the value of the '<em>Var Name</em>' attribute.
     * @see #setVarName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogicVarRef_VarName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" required="true"
     *        extendedMetaData="kind='attribute' name='varName'"
     * @generated
     */
    String getVarName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getVarName <em>Var Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Var Name</em>' attribute.
     * @see #getVarName()
     * @generated
     */
    void setVarName( String value );

    /**
     * Returns the value of the '<em><b>Refers To LNode</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByLogicVarRef <em>Referred By Logic Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To LNode</em>' reference.
     * @see #isSetRefersToLNode()
     * @see #unsetRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getLogicVarRef_RefersToLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getReferredByLogicVarRef
     * @model opposite="ReferredByLogicVarRef" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    LNode getRefersToLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getRefersToLNode <em>Refers To LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To LNode</em>' reference.
     * @see #isSetRefersToLNode()
     * @see #unsetRefersToLNode()
     * @see #getRefersToLNode()
     * @generated
     */
    void setRefersToLNode( LNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getRefersToLNode <em>Refers To LNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToLNode()
     * @see #getRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @generated
     */
    void unsetRefersToLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getRefersToLNode <em>Refers To LNode</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To LNode</em>' reference is set.
     * @see #unsetRefersToLNode()
     * @see #getRefersToLNode()
     * @see #setRefersToLNode(LNode)
     * @generated
     */
    boolean isSetRefersToLNode();

} // LogicVarRef
