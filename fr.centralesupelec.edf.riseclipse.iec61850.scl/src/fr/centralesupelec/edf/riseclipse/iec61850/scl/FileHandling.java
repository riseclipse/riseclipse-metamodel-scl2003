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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtp <em>Ftp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtps <em>Ftps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getMms <em>Mms</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFileHandling()
 * @model
 * @generated
 */
public interface FileHandling extends SclObject {
    /**
	 * Returns the value of the '<em><b>Ftp</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ftp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftp</em>' attribute.
	 * @see #isSetFtp()
	 * @see #unsetFtp()
	 * @see #setFtp(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFileHandling_Ftp()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FileHandling!ftp'"
	 * @generated
	 */
    Boolean getFtp();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtp <em>Ftp</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ftp</em>' attribute.
	 * @see #isSetFtp()
	 * @see #unsetFtp()
	 * @see #getFtp()
	 * @generated
	 */
    void setFtp( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtp <em>Ftp</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetFtp()
	 * @see #getFtp()
	 * @see #setFtp(Boolean)
	 * @generated
	 */
    void unsetFtp();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtp <em>Ftp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ftp</em>' attribute is set.
	 * @see #unsetFtp()
	 * @see #getFtp()
	 * @see #setFtp(Boolean)
	 * @generated
	 */
    boolean isSetFtp();

    /**
	 * Returns the value of the '<em><b>Ftps</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ftps</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Ftps</em>' attribute.
	 * @see #isSetFtps()
	 * @see #unsetFtps()
	 * @see #setFtps(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFileHandling_Ftps()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FileHandling!ftps'"
	 * @generated
	 */
    Boolean getFtps();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtps <em>Ftps</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ftps</em>' attribute.
	 * @see #isSetFtps()
	 * @see #unsetFtps()
	 * @see #getFtps()
	 * @generated
	 */
    void setFtps( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtps <em>Ftps</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetFtps()
	 * @see #getFtps()
	 * @see #setFtps(Boolean)
	 * @generated
	 */
    void unsetFtps();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtps <em>Ftps</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ftps</em>' attribute is set.
	 * @see #unsetFtps()
	 * @see #getFtps()
	 * @see #setFtps(Boolean)
	 * @generated
	 */
    boolean isSetFtps();

    /**
	 * Returns the value of the '<em><b>Mms</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mms</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Mms</em>' attribute.
	 * @see #isSetMms()
	 * @see #unsetMms()
	 * @see #setMms(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFileHandling_Mms()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FileHandling!mms'"
	 * @generated
	 */
    Boolean getMms();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getMms <em>Mms</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mms</em>' attribute.
	 * @see #isSetMms()
	 * @see #unsetMms()
	 * @see #getMms()
	 * @generated
	 */
    void setMms( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getMms <em>Mms</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetMms()
	 * @see #getMms()
	 * @see #setMms(Boolean)
	 * @generated
	 */
    void unsetMms();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getMms <em>Mms</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mms</em>' attribute is set.
	 * @see #unsetMms()
	 * @see #getMms()
	 * @see #setMms(Boolean)
	 * @generated
	 */
    boolean isSetMms();

    /**
	 * Returns the value of the '<em><b>Services</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getFileHandling <em>File Handling</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' container reference.
	 * @see #setServices(Services)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getFileHandling_Services()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getFileHandling
	 * @model opposite="FileHandling" resolveProxies="false" unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!FileHandling!Services'"
	 * @generated
	 */
    Services getServices();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getServices <em>Services</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' container reference.
	 * @see #getServices()
	 * @generated
	 */
    void setServices( Services value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FileHandling_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv FileHandling_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateFileHandling_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // FileHandling
