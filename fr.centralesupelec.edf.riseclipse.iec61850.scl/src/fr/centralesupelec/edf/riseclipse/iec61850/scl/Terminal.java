/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
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
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getAbstractConductingEquipment <em>Abstract Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNode <em>CNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getName <em>Name</em>}</li>
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
     * Returns the value of the '<em><b>Abstract Conducting Equipment</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract Conducting Equipment</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract Conducting Equipment</em>' container reference.
     * @see #setAbstractConductingEquipment(AbstractConductingEquipment)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_AbstractConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getTerminal
     * @model opposite="Terminal" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AbstractConductingEquipment getAbstractConductingEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getAbstractConductingEquipment <em>Abstract Conducting Equipment</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract Conducting Equipment</em>' container reference.
     * @see #getAbstractConductingEquipment()
     * @generated
     */
    void setAbstractConductingEquipment( AbstractConductingEquipment value );

    /**
     * Returns the value of the '<em><b>Bay</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bay</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bay</em>' reference.
     * @see #isSetBay()
     * @see #unsetBay()
     * @see #setBay(Bay)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_Bay()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getTerminal
     * @model opposite="Terminal" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Bay getBay();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getBay <em>Bay</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bay</em>' reference.
     * @see #isSetBay()
     * @see #unsetBay()
     * @see #getBay()
     * @generated
     */
    void setBay( Bay value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getBay <em>Bay</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBay()
     * @see #getBay()
     * @see #setBay(Bay)
     * @generated
     */
    void unsetBay();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getBay <em>Bay</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bay</em>' reference is set.
     * @see #unsetBay()
     * @see #getBay()
     * @see #setBay(Bay)
     * @generated
     */
    boolean isSetBay();

    /**
     * Returns the value of the '<em><b>CNode</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CNode</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CNode</em>' reference.
     * @see #isSetCNode()
     * @see #unsetCNode()
     * @see #setCNode(ConnectivityNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_CNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getTerminal
     * @model opposite="Terminal" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    ConnectivityNode getCNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNode <em>CNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CNode</em>' reference.
     * @see #isSetCNode()
     * @see #unsetCNode()
     * @see #getCNode()
     * @generated
     */
    void setCNode( ConnectivityNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNode <em>CNode</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCNode()
     * @see #getCNode()
     * @see #setCNode(ConnectivityNode)
     * @generated
     */
    void unsetCNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNode <em>CNode</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>CNode</em>' reference is set.
     * @see #unsetCNode()
     * @see #getCNode()
     * @see #setCNode(ConnectivityNode)
     * @generated
     */
    boolean isSetCNode();

    /**
     * Returns the value of the '<em><b>Substation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Substation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Substation</em>' reference.
     * @see #isSetSubstation()
     * @see #unsetSubstation()
     * @see #setSubstation(Substation)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_Substation()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getTerminal
     * @model opposite="Terminal" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    Substation getSubstation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getSubstation <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Substation</em>' reference.
     * @see #isSetSubstation()
     * @see #unsetSubstation()
     * @see #getSubstation()
     * @generated
     */
    void setSubstation( Substation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getSubstation <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubstation()
     * @see #getSubstation()
     * @see #setSubstation(Substation)
     * @generated
     */
    void unsetSubstation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getSubstation <em>Substation</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Substation</em>' reference is set.
     * @see #unsetSubstation()
     * @see #getSubstation()
     * @see #setSubstation(Substation)
     * @generated
     */
    boolean isSetSubstation();

    /**
     * Returns the value of the '<em><b>Voltage Level</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Level</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Level</em>' reference.
     * @see #isSetVoltageLevel()
     * @see #unsetVoltageLevel()
     * @see #setVoltageLevel(VoltageLevel)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getTerminal_VoltageLevel()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getTerminal
     * @model opposite="Terminal" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    VoltageLevel getVoltageLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevel <em>Voltage Level</em>}' reference.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Level</em>' reference.
     * @see #isSetVoltageLevel()
     * @see #unsetVoltageLevel()
     * @see #getVoltageLevel()
     * @generated
     */
    void setVoltageLevel( VoltageLevel value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevel <em>Voltage Level</em>}' reference.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetVoltageLevel()
     * @see #getVoltageLevel()
     * @see #setVoltageLevel(VoltageLevel)
     * @generated
     */
    void unsetVoltageLevel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevel <em>Voltage Level</em>}' reference is set.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Level</em>' reference is set.
     * @see #unsetVoltageLevel()
     * @see #getVoltageLevel()
     * @see #setVoltageLevel(VoltageLevel)
     * @generated
     */
    boolean isSetVoltageLevel();

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
    void setName(String value);

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

} // Terminal
