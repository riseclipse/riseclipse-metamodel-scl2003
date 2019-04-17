/**
 *  Copyright (c) 2018 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
 *      http://wdi.supelec.fr/software/RiseClipse/
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getBitRate <em>Bit Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getParentCommunication <em>Parent Communication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getConnectedAP <em>Connected AP</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubNetwork()
 * @model
 * @generated
 */
public interface SubNetwork extends Naming {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubNetwork_Type()
     * @model unsettable="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(String)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Bit Rate</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate#getParentSubNetwork <em>Parent Sub Network</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bit Rate</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bit Rate</em>' containment reference.
     * @see #isSetBitRate()
     * @see #unsetBitRate()
     * @see #setBitRate(BitRate)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubNetwork_BitRate()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate#getParentSubNetwork
     * @model opposite="ParentSubNetwork" containment="true" unsettable="true"
     * @generated
     */
    BitRate getBitRate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getBitRate <em>Bit Rate</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bit Rate</em>' containment reference.
     * @see #isSetBitRate()
     * @see #unsetBitRate()
     * @see #getBitRate()
     * @generated
     */
    void setBitRate(BitRate value);

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getBitRate <em>Bit Rate</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBitRate()
     * @see #getBitRate()
     * @see #setBitRate(BitRate)
     * @generated
     */
    void unsetBitRate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getBitRate <em>Bit Rate</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bit Rate</em>' containment reference is set.
     * @see #unsetBitRate()
     * @see #getBitRate()
     * @see #setBitRate(BitRate)
     * @generated
     */
    boolean isSetBitRate();

    /**
     * Returns the value of the '<em><b>Parent Communication</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSubNetwork <em>Sub Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Communication</em>' container reference.
     * @see #setParentCommunication(Communication)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubNetwork_ParentCommunication()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSubNetwork
     * @model opposite="SubNetwork" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    Communication getParentCommunication();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getParentCommunication <em>Parent Communication</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Communication</em>' container reference.
     * @see #getParentCommunication()
     * @generated
     */
    void setParentCommunication(Communication value);

    /**
     * Returns the value of the '<em><b>Connected AP</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getParentSubNetwork <em>Parent Sub Network</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connected AP</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connected AP</em>' containment reference list.
     * @see #isSetConnectedAP()
     * @see #unsetConnectedAP()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSubNetwork_ConnectedAP()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getParentSubNetwork
     * @model opposite="ParentSubNetwork" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList<ConnectedAP> getConnectedAP();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getConnectedAP <em>Connected AP</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectedAP()
     * @see #getConnectedAP()
     * @generated
     */
    void unsetConnectedAP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getConnectedAP <em>Connected AP</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connected AP</em>' containment reference list is set.
     * @see #unsetConnectedAP()
     * @see #getConnectedAP()
     * @generated
     */
    boolean isSetConnectedAP();

} // SubNetwork
