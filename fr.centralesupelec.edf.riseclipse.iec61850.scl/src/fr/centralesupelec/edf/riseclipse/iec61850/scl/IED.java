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

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getConfigVersion <em>Config Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getEngRight <em>Eng Right</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRevision <em>Original Scl Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclVersion <em>Original Scl Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOwner <em>Owner</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getAccessPoint <em>Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getLNode <em>LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getKDC <em>KDC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getServices <em>Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getSCL <em>SCL</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRelease <em>Original Scl Release</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED()
 * @model
 * @generated
 */
public interface IED extends UnNaming {
    /**
	 * Returns the value of the '<em><b>Config Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Config Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Version</em>' attribute.
	 * @see #isSetConfigVersion()
	 * @see #unsetConfigVersion()
	 * @see #setConfigVersion(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_ConfigVersion()
	 * @model unsettable="true"
	 * @generated
	 */
    String getConfigVersion();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getConfigVersion <em>Config Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Version</em>' attribute.
	 * @see #isSetConfigVersion()
	 * @see #unsetConfigVersion()
	 * @see #getConfigVersion()
	 * @generated
	 */
    void setConfigVersion( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getConfigVersion <em>Config Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetConfigVersion()
	 * @see #getConfigVersion()
	 * @see #setConfigVersion(String)
	 * @generated
	 */
    void unsetConfigVersion();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getConfigVersion <em>Config Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Config Version</em>' attribute is set.
	 * @see #unsetConfigVersion()
	 * @see #getConfigVersion()
	 * @see #setConfigVersion(String)
	 * @generated
	 */
    boolean isSetConfigVersion();

    /**
	 * Returns the value of the '<em><b>Eng Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Eng Right</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Eng Right</em>' attribute.
	 * @see #isSetEngRight()
	 * @see #unsetEngRight()
	 * @see #setEngRight(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_EngRight()
	 * @model unsettable="true"
	 * @generated
	 */
    String getEngRight();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getEngRight <em>Eng Right</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eng Right</em>' attribute.
	 * @see #isSetEngRight()
	 * @see #unsetEngRight()
	 * @see #getEngRight()
	 * @generated
	 */
    void setEngRight(String value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getEngRight <em>Eng Right</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetEngRight()
	 * @see #getEngRight()
	 * @see #setEngRight(String)
	 * @generated
	 */
    void unsetEngRight();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getEngRight <em>Eng Right</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eng Right</em>' attribute is set.
	 * @see #unsetEngRight()
	 * @see #getEngRight()
	 * @see #setEngRight(String)
	 * @generated
	 */
    boolean isSetEngRight();

    /**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Manufacturer</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #isSetManufacturer()
	 * @see #unsetManufacturer()
	 * @see #setManufacturer(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_Manufacturer()
	 * @model unsettable="true"
	 * @generated
	 */
    String getManufacturer();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #isSetManufacturer()
	 * @see #unsetManufacturer()
	 * @see #getManufacturer()
	 * @generated
	 */
    void setManufacturer( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetManufacturer()
	 * @see #getManufacturer()
	 * @see #setManufacturer(String)
	 * @generated
	 */
    void unsetManufacturer();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getManufacturer <em>Manufacturer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Manufacturer</em>' attribute is set.
	 * @see #unsetManufacturer()
	 * @see #getManufacturer()
	 * @see #setManufacturer(String)
	 * @generated
	 */
    boolean isSetManufacturer();

    /**
	 * Returns the value of the '<em><b>Original Scl Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Original Scl Revision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Scl Revision</em>' attribute.
	 * @see #isSetOriginalSclRevision()
	 * @see #unsetOriginalSclRevision()
	 * @see #setOriginalSclRevision(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_OriginalSclRevision()
	 * @model unsettable="true"
	 * @generated
	 */
    String getOriginalSclRevision();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRevision <em>Original Scl Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Scl Revision</em>' attribute.
	 * @see #isSetOriginalSclRevision()
	 * @see #unsetOriginalSclRevision()
	 * @see #getOriginalSclRevision()
	 * @generated
	 */
    void setOriginalSclRevision(String value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRevision <em>Original Scl Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetOriginalSclRevision()
	 * @see #getOriginalSclRevision()
	 * @see #setOriginalSclRevision(String)
	 * @generated
	 */
    void unsetOriginalSclRevision();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRevision <em>Original Scl Revision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Original Scl Revision</em>' attribute is set.
	 * @see #unsetOriginalSclRevision()
	 * @see #getOriginalSclRevision()
	 * @see #setOriginalSclRevision(String)
	 * @generated
	 */
    boolean isSetOriginalSclRevision();

    /**
	 * Returns the value of the '<em><b>Original Scl Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Original Scl Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Scl Version</em>' attribute.
	 * @see #isSetOriginalSclVersion()
	 * @see #unsetOriginalSclVersion()
	 * @see #setOriginalSclVersion(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_OriginalSclVersion()
	 * @model unsettable="true"
	 * @generated
	 */
    String getOriginalSclVersion();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclVersion <em>Original Scl Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Scl Version</em>' attribute.
	 * @see #isSetOriginalSclVersion()
	 * @see #unsetOriginalSclVersion()
	 * @see #getOriginalSclVersion()
	 * @generated
	 */
    void setOriginalSclVersion(String value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclVersion <em>Original Scl Version</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetOriginalSclVersion()
	 * @see #getOriginalSclVersion()
	 * @see #setOriginalSclVersion(String)
	 * @generated
	 */
    void unsetOriginalSclVersion();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclVersion <em>Original Scl Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Original Scl Version</em>' attribute is set.
	 * @see #unsetOriginalSclVersion()
	 * @see #getOriginalSclVersion()
	 * @see #setOriginalSclVersion(String)
	 * @generated
	 */
    boolean isSetOriginalSclVersion();

    /**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #isSetOwner()
	 * @see #unsetOwner()
	 * @see #setOwner(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_Owner()
	 * @model unsettable="true"
	 * @generated
	 */
    String getOwner();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #isSetOwner()
	 * @see #unsetOwner()
	 * @see #getOwner()
	 * @generated
	 */
    void setOwner( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetOwner()
	 * @see #getOwner()
	 * @see #setOwner(String)
	 * @generated
	 */
    void unsetOwner();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOwner <em>Owner</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owner</em>' attribute is set.
	 * @see #unsetOwner()
	 * @see #getOwner()
	 * @see #setOwner(String)
	 * @generated
	 */
    boolean isSetOwner();

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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_Type()
	 * @model unsettable="true"
	 * @generated
	 */
    String getType();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
    void unsetType();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getType <em>Type</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Access Point</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getIED <em>IED</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access Point</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Point</em>' containment reference list.
	 * @see #isSetAccessPoint()
	 * @see #unsetAccessPoint()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_AccessPoint()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getIED
	 * @model opposite="IED" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<AccessPoint> getAccessPoint();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getAccessPoint <em>Access Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetAccessPoint()
	 * @see #getAccessPoint()
	 * @generated
	 */
    void unsetAccessPoint();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getAccessPoint <em>Access Point</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Point</em>' containment reference list is set.
	 * @see #unsetAccessPoint()
	 * @see #getAccessPoint()
	 * @generated
	 */
    boolean isSetAccessPoint();

    /**
	 * Returns the value of the '<em><b>LNode</b></em>' reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIED <em>IED</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LNode</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>LNode</em>' reference list.
	 * @see #isSetLNode()
	 * @see #unsetLNode()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_LNode()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIED
	 * @model opposite="IED" resolveProxies="false" unsettable="true" transient="true" ordered="false"
	 * @generated
	 */
    EList<LNode> getLNode();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getLNode <em>LNode</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetLNode()
	 * @see #getLNode()
	 * @generated
	 */
    void unsetLNode();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getLNode <em>LNode</em>}' reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>LNode</em>' reference list is set.
	 * @see #unsetLNode()
	 * @see #getLNode()
	 * @generated
	 */
    boolean isSetLNode();

    /**
	 * Returns the value of the '<em><b>KDC</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getIED <em>IED</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>KDC</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>KDC</em>' containment reference list.
	 * @see #isSetKDC()
	 * @see #unsetKDC()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_KDC()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getIED
	 * @model opposite="IED" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<KDC> getKDC();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getKDC <em>KDC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetKDC()
	 * @see #getKDC()
	 * @generated
	 */
    void unsetKDC();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getKDC <em>KDC</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>KDC</em>' containment reference list is set.
	 * @see #unsetKDC()
	 * @see #getKDC()
	 * @generated
	 */
    boolean isSetKDC();

    /**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getIED <em>IED</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #isSetServices()
	 * @see #unsetServices()
	 * @see #setServices(Services)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_Services()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getIED
	 * @model opposite="IED" containment="true" unsettable="true"
	 * @generated
	 */
    Services getServices();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #isSetServices()
	 * @see #unsetServices()
	 * @see #getServices()
	 * @generated
	 */
    void setServices( Services value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetServices()
	 * @see #getServices()
	 * @see #setServices(Services)
	 * @generated
	 */
    void unsetServices();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getServices <em>Services</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Services</em>' containment reference is set.
	 * @see #unsetServices()
	 * @see #getServices()
	 * @see #setServices(Services)
	 * @generated
	 */
    boolean isSetServices();

    /**
	 * Returns the value of the '<em><b>SCL</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getIED <em>IED</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCL</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>SCL</em>' container reference.
	 * @see #setSCL(SCL)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_SCL()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getIED
	 * @model opposite="IED" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    SCL getSCL();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getSCL <em>SCL</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCL</em>' container reference.
	 * @see #getSCL()
	 * @generated
	 */
    void setSCL( SCL value );

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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_Name()
	 * @model unsettable="true"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
    void unsetName();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getName <em>Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Original Scl Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Original Scl Release</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Scl Release</em>' attribute.
	 * @see #isSetOriginalSclRelease()
	 * @see #unsetOriginalSclRelease()
	 * @see #setOriginalSclRelease(Byte)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getIED_OriginalSclRelease()
	 * @model unsettable="true"
	 * @generated
	 */
    Byte getOriginalSclRelease();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRelease <em>Original Scl Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Scl Release</em>' attribute.
	 * @see #isSetOriginalSclRelease()
	 * @see #unsetOriginalSclRelease()
	 * @see #getOriginalSclRelease()
	 * @generated
	 */
    void setOriginalSclRelease(Byte value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRelease <em>Original Scl Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetOriginalSclRelease()
	 * @see #getOriginalSclRelease()
	 * @see #setOriginalSclRelease(Byte)
	 * @generated
	 */
    void unsetOriginalSclRelease();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRelease <em>Original Scl Release</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Original Scl Release</em>' attribute is set.
	 * @see #unsetOriginalSclRelease()
	 * @see #getOriginalSclRelease()
	 * @see #setOriginalSclRelease(Byte)
	 * @generated
	 */
    boolean isSetOriginalSclRelease();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IED_name_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'name attribute shall be present in IED (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.name &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateIED_name_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IED_name_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'name attribute shall have between 1 and 64 alphanumeric characters in IED (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.name.toString()\n        ,\n\tstatus : Boolean = \n        self.name &lt;&gt; null implies self.validSclIEDName( name )\n    \n    \n}.status'"
	 * @generated
	 */
	boolean validateIED_name_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IED_originalSclVersion_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'originalSclVersion attribute shall be valid in IED (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.originalSclVersion.toString()\n        ,\n\tstatus : Boolean = \n        self.originalSclVersion &lt;&gt; null implies self.validSclVersion( originalSclVersion )\n    \n    \n}.status'"
	 * @generated
	 */
	boolean validateIED_originalSclVersion_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IED_originalSclRevision_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'originalSclRevision attribute shall be an uppercase letter in IED (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.originalSclRevision.toString()\n        ,\n\tstatus : Boolean = \n        self.originalSclRevision &lt;&gt; null implies self.validSclRevision( originalSclRevision )\n    \n    \n}.status'"
	 * @generated
	 */
	boolean validateIED_originalSclRevision_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IED_originalSclRelease_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'originalSclRelease attribute shall be an uppercase letter in IED (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.originalSclRelease.toString()\n        ,\n\tstatus : Boolean = \n        self.originalSclRelease &lt;&gt; null implies self.originalSclRelease &gt; 0\n    \n    \n}.status'"
	 * @generated
	 */
	boolean validateIED_originalSclRelease_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='engRight_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'engRight attribute shall be valid in IED (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.engRight.toString()\n        ,\n\tstatus : Boolean = \n        self.engRight &lt;&gt; null implies self.validSclRightEnum( engRight )\n    \n    \n    \n}.status'"
	 * @generated
	 */
	boolean validateengRight_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='IED_at_least_one_AccessPoint_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'IED shall contain at least one AccessPoint (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.AccessPoint-&gt;notEmpty()\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateIED_at_least_one_AccessPoint_required(DiagnosticChain diagnostics, Map<Object, Object> context);

} // IED
