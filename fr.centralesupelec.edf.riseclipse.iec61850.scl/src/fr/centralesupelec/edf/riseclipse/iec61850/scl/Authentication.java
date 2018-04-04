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
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getNone <em>None</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getPassword <em>Password</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getStrong <em>Strong</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getWeak <em>Weak</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAuthentication()
 * @model
 * @generated
 */
public interface Authentication extends SclObject {
    /**
	 * Returns the value of the '<em><b>Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Certificate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate</em>' attribute.
	 * @see #isSetCertificate()
	 * @see #unsetCertificate()
	 * @see #setCertificate(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAuthentication_Certificate()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Authentication!certificate'"
	 * @generated
	 */
    Boolean getCertificate();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getCertificate <em>Certificate</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getCertificate <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetCertificate()
	 * @see #getCertificate()
	 * @see #setCertificate(Boolean)
	 * @generated
	 */
    void unsetCertificate();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getCertificate <em>Certificate</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>None</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>None</em>' attribute.
	 * @see #isSetNone()
	 * @see #unsetNone()
	 * @see #setNone(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAuthentication_None()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Authentication!none'"
	 * @generated
	 */
    Boolean getNone();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getNone <em>None</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getNone <em>None</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetNone()
	 * @see #getNone()
	 * @see #setNone(Boolean)
	 * @generated
	 */
    void unsetNone();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getNone <em>None</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #isSetPassword()
	 * @see #unsetPassword()
	 * @see #setPassword(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAuthentication_Password()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Authentication!password'"
	 * @generated
	 */
    Boolean getPassword();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getPassword <em>Password</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetPassword()
	 * @see #getPassword()
	 * @see #setPassword(Boolean)
	 * @generated
	 */
    void unsetPassword();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getPassword <em>Password</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Strong</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' attribute.
	 * @see #isSetStrong()
	 * @see #unsetStrong()
	 * @see #setStrong(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAuthentication_Strong()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Authentication!strong'"
	 * @generated
	 */
    Boolean getStrong();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getStrong <em>Strong</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getStrong <em>Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetStrong()
	 * @see #getStrong()
	 * @see #setStrong(Boolean)
	 * @generated
	 */
    void unsetStrong();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getStrong <em>Strong</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weak</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Weak</em>' attribute.
	 * @see #isSetWeak()
	 * @see #unsetWeak()
	 * @see #setWeak(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAuthentication_Weak()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Authentication!weak'"
	 * @generated
	 */
    Boolean getWeak();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getWeak <em>Weak</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getWeak <em>Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetWeak()
	 * @see #getWeak()
	 * @see #setWeak(Boolean)
	 * @generated
	 */
    void unsetWeak();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getWeak <em>Weak</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weak</em>' attribute is set.
	 * @see #unsetWeak()
	 * @see #getWeak()
	 * @see #setWeak(Boolean)
	 * @generated
	 */
    boolean isSetWeak();

    /**
	 * Returns the value of the '<em><b>Server</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' container reference.
	 * @see #setServer(Server)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getAuthentication_Server()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication
	 * @model opposite="Authentication" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!Authentication!Server'"
	 * @generated
	 */
    Server getServer();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getServer <em>Server</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' container reference.
	 * @see #getServer()
	 * @generated
	 */
    void setServer( Server value );

} // Authentication
