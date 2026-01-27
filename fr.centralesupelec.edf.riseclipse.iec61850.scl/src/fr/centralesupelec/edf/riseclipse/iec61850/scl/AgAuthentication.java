/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
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
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ag Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getNone <em>None</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getPassword <em>Password</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getStrong <em>Strong</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getWeak <em>Weak</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgAuthentication()
 * @model
 * @generated
 */
public interface AgAuthentication extends EObject {
    /**
     * Returns the value of the '<em><b>Certificate</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Certificate</em>' attribute.
     * @see #isSetCertificate()
     * @see #unsetCertificate()
     * @see #setCertificate(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgAuthentication_Certificate()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getCertificate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getCertificate <em>Certificate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Certificate</em>' attribute.
     * @see #isSetCertificate()
     * @see #unsetCertificate()
     * @see #getCertificate()
     * @generated
     */
    void setCertificate( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getCertificate <em>Certificate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCertificate()
     * @see #getCertificate()
     * @see #setCertificate(Boolean)
     * @generated
     */
    void unsetCertificate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getCertificate <em>Certificate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Certificate</em>' attribute is set.
     * @see #unsetCertificate()
     * @see #getCertificate()
     * @see #setCertificate(Boolean)
     * @generated
     */
    boolean isSetCertificate();

    /**
     * Returns the value of the '<em><b>None</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>None</em>' attribute.
     * @see #isSetNone()
     * @see #unsetNone()
     * @see #setNone(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgAuthentication_None()
     * @model default="true" unsettable="true"
     * @generated
     */
    Boolean getNone();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getNone <em>None</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>None</em>' attribute.
     * @see #isSetNone()
     * @see #unsetNone()
     * @see #getNone()
     * @generated
     */
    void setNone( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getNone <em>None</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNone()
     * @see #getNone()
     * @see #setNone(Boolean)
     * @generated
     */
    void unsetNone();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getNone <em>None</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>None</em>' attribute is set.
     * @see #unsetNone()
     * @see #getNone()
     * @see #setNone(Boolean)
     * @generated
     */
    boolean isSetNone();

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Password</em>' attribute.
     * @see #isSetPassword()
     * @see #unsetPassword()
     * @see #setPassword(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgAuthentication_Password()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getPassword();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Password</em>' attribute.
     * @see #isSetPassword()
     * @see #unsetPassword()
     * @see #getPassword()
     * @generated
     */
    void setPassword( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPassword()
     * @see #getPassword()
     * @see #setPassword(Boolean)
     * @generated
     */
    void unsetPassword();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getPassword <em>Password</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Password</em>' attribute is set.
     * @see #unsetPassword()
     * @see #getPassword()
     * @see #setPassword(Boolean)
     * @generated
     */
    boolean isSetPassword();

    /**
     * Returns the value of the '<em><b>Strong</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Strong</em>' attribute.
     * @see #isSetStrong()
     * @see #unsetStrong()
     * @see #setStrong(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgAuthentication_Strong()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getStrong();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getStrong <em>Strong</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Strong</em>' attribute.
     * @see #isSetStrong()
     * @see #unsetStrong()
     * @see #getStrong()
     * @generated
     */
    void setStrong( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getStrong <em>Strong</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStrong()
     * @see #getStrong()
     * @see #setStrong(Boolean)
     * @generated
     */
    void unsetStrong();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getStrong <em>Strong</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Strong</em>' attribute is set.
     * @see #unsetStrong()
     * @see #getStrong()
     * @see #setStrong(Boolean)
     * @generated
     */
    boolean isSetStrong();

    /**
     * Returns the value of the '<em><b>Weak</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weak</em>' attribute.
     * @see #isSetWeak()
     * @see #unsetWeak()
     * @see #setWeak(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAgAuthentication_Weak()
     * @model default="false" unsettable="true"
     * @generated
     */
    Boolean getWeak();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getWeak <em>Weak</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weak</em>' attribute.
     * @see #isSetWeak()
     * @see #unsetWeak()
     * @see #getWeak()
     * @generated
     */
    void setWeak( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getWeak <em>Weak</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWeak()
     * @see #getWeak()
     * @see #setWeak(Boolean)
     * @generated
     */
    void unsetWeak();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getWeak <em>Weak</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Weak</em>' attribute is set.
     * @see #unsetWeak()
     * @see #getWeak()
     * @see #setWeak(Boolean)
     * @generated
     */
    boolean isSetWeak();

} // AgAuthentication
