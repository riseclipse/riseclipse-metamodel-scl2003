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
 * A representation of the model object '<em><b>LN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getAccessPoint <em>Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getLDevice <em>LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getLNode <em>LNode</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN()
 * @model
 * @generated
 */
public interface LN extends AnyLN {
    /**
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #setPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN_Prefix()
     * @model default="" unsettable="true"
     * @generated
     */
    String getPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @generated
     */
    void setPrefix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    void unsetPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getPrefix <em>Prefix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefix</em>' attribute is set.
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    boolean isSetPrefix();

    /**
     * Returns the value of the '<em><b>Access Point</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getLN <em>LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access Point</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Access Point</em>' container reference.
     * @see #setAccessPoint(AccessPoint)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN_AccessPoint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getLN
     * @model opposite="LN" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    AccessPoint getAccessPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getAccessPoint <em>Access Point</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Access Point</em>' container reference.
     * @see #getAccessPoint()
     * @generated
     */
    void setAccessPoint( AccessPoint value );

    /**
     * Returns the value of the '<em><b>LDevice</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN <em>LN</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>LDevice</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>LDevice</em>' container reference.
     * @see #setLDevice(LDevice)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN_LDevice()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN
     * @model opposite="LN" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    LDevice getLDevice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getLDevice <em>LDevice</em>}' container reference.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @param value the new value of the '<em>LDevice</em>' container reference.
     * @see #getLDevice()
     * @generated
     */
    void setLDevice( LDevice value );

    /**
     * Returns the value of the '<em><b>LNode</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLN <em>LN</em>}'.
     * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>LNode</em>' reference isn't clear,
    * there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
     * @return the value of the '<em>LNode</em>' reference list.
     * @see #isSetLNode()
     * @see #unsetLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLN_LNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLN
     * @model opposite="LN" resolveProxies="false" unsettable="true" transient="true" ordered="false"
     * @generated
     */
    EList<LNode> getLNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getLNode <em>LNode</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLNode()
     * @see #getLNode()
     * @generated
     */
    void unsetLNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getLNode <em>LNode</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>LNode</em>' reference list is set.
     * @see #unsetLNode()
     * @see #getLNode()
     * @generated
     */
    boolean isSetLNode();

} // LN
