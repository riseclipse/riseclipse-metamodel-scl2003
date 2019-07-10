/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getBayName <em>Bay Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNodeName <em>CNode Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getProcessName <em>Process Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getSubstationName <em>Substation Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevelName <em>Voltage Level Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getParentAbstractConductingEquipment <em>Parent Abstract Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getRefersToConnectivityNode <em>Refers To Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getLineName <em>Line Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends UnNaming {
    /**
     * Returns the value of the '<em><b>Bay Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bay Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bay Name</em>' attribute.
     * @see #isSetBayName()
     * @see #unsetBayName()
     * @see #setBayName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_BayName()
     * @model unsettable="true"
     * @generated
     */
    String getBayName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getBayName <em>Bay Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bay Name</em>' attribute.
     * @see #isSetBayName()
     * @see #unsetBayName()
     * @see #getBayName()
     * @generated
     */
    void setBayName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getBayName <em>Bay Name</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetBayName()
     * @see #getBayName()
     * @see #setBayName(String)
     * @generated
     */
    void unsetBayName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getBayName <em>Bay Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bay Name</em>' attribute is set.
     * @see #unsetBayName()
     * @see #getBayName()
     * @see #setBayName(String)
     * @generated
     */
    boolean isSetBayName();

    /**
     * Returns the value of the '<em><b>CNode Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CNode Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CNode Name</em>' attribute.
     * @see #isSetCNodeName()
     * @see #unsetCNodeName()
     * @see #setCNodeName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_CNodeName()
     * @model unsettable="true"
     * @generated
     */
    String getCNodeName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNodeName <em>CNode Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CNode Name</em>' attribute.
     * @see #isSetCNodeName()
     * @see #unsetCNodeName()
     * @see #getCNodeName()
     * @generated
     */
    void setCNodeName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNodeName <em>CNode Name</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetCNodeName()
     * @see #getCNodeName()
     * @see #setCNodeName(String)
     * @generated
     */
    void unsetCNodeName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNodeName <em>CNode Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>CNode Name</em>' attribute is set.
     * @see #unsetCNodeName()
     * @see #getCNodeName()
     * @see #setCNodeName(String)
     * @generated
     */
    boolean isSetCNodeName();

    /**
     * Returns the value of the '<em><b>Connectivity Node</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectivity Node</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectivity Node</em>' attribute.
     * @see #isSetConnectivityNode()
     * @see #unsetConnectivityNode()
     * @see #setConnectivityNode(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_ConnectivityNode()
     * @model unsettable="true"
     * @generated
     */
    String getConnectivityNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getConnectivityNode <em>Connectivity Node</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connectivity Node</em>' attribute.
     * @see #isSetConnectivityNode()
     * @see #unsetConnectivityNode()
     * @see #getConnectivityNode()
     * @generated
     */
    void setConnectivityNode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getConnectivityNode <em>Connectivity Node</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetConnectivityNode()
     * @see #getConnectivityNode()
     * @see #setConnectivityNode(String)
     * @generated
     */
    void unsetConnectivityNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getConnectivityNode <em>Connectivity Node</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Node</em>' attribute is set.
     * @see #unsetConnectivityNode()
     * @see #getConnectivityNode()
     * @see #setConnectivityNode(String)
     * @generated
     */
    boolean isSetConnectivityNode();

    /**
     * Returns the value of the '<em><b>Process Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Name</em>' attribute.
     * @see #isSetProcessName()
     * @see #unsetProcessName()
     * @see #setProcessName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_ProcessName()
     * @model unsettable="true"
     * @generated
     */
    String getProcessName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getProcessName <em>Process Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Name</em>' attribute.
     * @see #isSetProcessName()
     * @see #unsetProcessName()
     * @see #getProcessName()
     * @generated
     */
    void setProcessName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getProcessName <em>Process Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcessName()
     * @see #getProcessName()
     * @see #setProcessName(String)
     * @generated
     */
    void unsetProcessName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getProcessName <em>Process Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Process Name</em>' attribute is set.
     * @see #unsetProcessName()
     * @see #getProcessName()
     * @see #setProcessName(String)
     * @generated
     */
    boolean isSetProcessName();

    /**
     * Returns the value of the '<em><b>Substation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Substation Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Substation Name</em>' attribute.
     * @see #isSetSubstationName()
     * @see #unsetSubstationName()
     * @see #setSubstationName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_SubstationName()
     * @model unsettable="true"
     * @generated
     */
    String getSubstationName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getSubstationName <em>Substation Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Substation Name</em>' attribute.
     * @see #isSetSubstationName()
     * @see #unsetSubstationName()
     * @see #getSubstationName()
     * @generated
     */
    void setSubstationName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getSubstationName <em>Substation Name</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetSubstationName()
     * @see #getSubstationName()
     * @see #setSubstationName(String)
     * @generated
     */
    void unsetSubstationName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getSubstationName <em>Substation Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Substation Name</em>' attribute is set.
     * @see #unsetSubstationName()
     * @see #getSubstationName()
     * @see #setSubstationName(String)
     * @generated
     */
    boolean isSetSubstationName();

    /**
     * Returns the value of the '<em><b>Voltage Level Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Level Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Level Name</em>' attribute.
     * @see #isSetVoltageLevelName()
     * @see #unsetVoltageLevelName()
     * @see #setVoltageLevelName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_VoltageLevelName()
     * @model unsettable="true"
     * @generated
     */
    String getVoltageLevelName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevelName <em>Voltage Level Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Level Name</em>' attribute.
     * @see #isSetVoltageLevelName()
     * @see #unsetVoltageLevelName()
     * @see #getVoltageLevelName()
     * @generated
     */
    void setVoltageLevelName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevelName <em>Voltage Level Name</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetVoltageLevelName()
     * @see #getVoltageLevelName()
     * @see #setVoltageLevelName(String)
     * @generated
     */
    void unsetVoltageLevelName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevelName <em>Voltage Level Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Level Name</em>' attribute is set.
     * @see #unsetVoltageLevelName()
     * @see #getVoltageLevelName()
     * @see #setVoltageLevelName(String)
     * @generated
     */
    boolean isSetVoltageLevelName();

    /**
     * Returns the value of the '<em><b>Parent Abstract Conducting Equipment</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Abstract Conducting Equipment</em>' container reference.
     * @see #setParentAbstractConductingEquipment(AbstractConductingEquipment)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_ParentAbstractConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getTerminal
     * @model opposite="Terminal" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AbstractConductingEquipment getParentAbstractConductingEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getParentAbstractConductingEquipment <em>Parent Abstract Conducting Equipment</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Abstract Conducting Equipment</em>' container reference.
     * @see #getParentAbstractConductingEquipment()
     * @generated
     */
    void setParentAbstractConductingEquipment( AbstractConductingEquipment value );

    /**
     * Returns the value of the '<em><b>Refers To Connectivity Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getReferredByTerminal <em>Referred By Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Connectivity Node</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Refers To Connectivity Node</em>' reference.
     * @see #isSetRefersToConnectivityNode()
     * @see #unsetRefersToConnectivityNode()
     * @see #setRefersToConnectivityNode(ConnectivityNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_RefersToConnectivityNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getReferredByTerminal
     * @model opposite="ReferredByTerminal" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ConnectivityNode getRefersToConnectivityNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getRefersToConnectivityNode <em>Refers To Connectivity Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Refers To Connectivity Node</em>' reference.
     * @see #isSetRefersToConnectivityNode()
     * @see #unsetRefersToConnectivityNode()
     * @see #getRefersToConnectivityNode()
     * @generated
     */
    void setRefersToConnectivityNode( ConnectivityNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getRefersToConnectivityNode <em>Refers To Connectivity Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRefersToConnectivityNode()
     * @see #getRefersToConnectivityNode()
     * @see #setRefersToConnectivityNode(ConnectivityNode)
     * @generated
     */
    void unsetRefersToConnectivityNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getRefersToConnectivityNode <em>Refers To Connectivity Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Refers To Connectivity Node</em>' reference is set.
     * @see #unsetRefersToConnectivityNode()
     * @see #getRefersToConnectivityNode()
     * @see #setRefersToConnectivityNode(ConnectivityNode)
     * @generated
     */
    boolean isSetRefersToConnectivityNode();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_Name()
     * @model unsettable="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Line Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line Name</em>' attribute.
     * @see #isSetLineName()
     * @see #unsetLineName()
     * @see #setLineName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_LineName()
     * @model unsettable="true"
     * @generated
     */
    String getLineName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getLineName <em>Line Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line Name</em>' attribute.
     * @see #isSetLineName()
     * @see #unsetLineName()
     * @see #getLineName()
     * @generated
     */
    void setLineName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getLineName <em>Line Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLineName()
     * @see #getLineName()
     * @see #setLineName(String)
     * @generated
     */
    void unsetLineName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getLineName <em>Line Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Line Name</em>' attribute is set.
     * @see #unsetLineName()
     * @see #getLineName()
     * @see #setLineName(String)
     * @generated
     */
    boolean isSetLineName();

} // Terminal
