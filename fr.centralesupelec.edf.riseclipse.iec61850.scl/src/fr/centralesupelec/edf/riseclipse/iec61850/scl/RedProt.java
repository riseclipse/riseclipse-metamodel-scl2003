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
 * A representation of the model object '<em><b>Red Prot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getHsr <em>Hsr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getPrp <em>Prp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getRstp <em>Rstp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRedProt()
 * @model
 * @generated
 */
public interface RedProt extends SclObject {
    /**
	 * Returns the value of the '<em><b>Hsr</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hsr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Hsr</em>' attribute.
	 * @see #isSetHsr()
	 * @see #unsetHsr()
	 * @see #setHsr(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRedProt_Hsr()
	 * @model unsettable="true"
	 * @generated
	 */
    Boolean getHsr();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getHsr <em>Hsr</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hsr</em>' attribute.
	 * @see #isSetHsr()
	 * @see #unsetHsr()
	 * @see #getHsr()
	 * @generated
	 */
    void setHsr( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getHsr <em>Hsr</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetHsr()
	 * @see #getHsr()
	 * @see #setHsr(Boolean)
	 * @generated
	 */
    void unsetHsr();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getHsr <em>Hsr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hsr</em>' attribute is set.
	 * @see #unsetHsr()
	 * @see #getHsr()
	 * @see #setHsr(Boolean)
	 * @generated
	 */
    boolean isSetHsr();

    /**
	 * Returns the value of the '<em><b>Prp</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Prp</em>' attribute.
	 * @see #isSetPrp()
	 * @see #unsetPrp()
	 * @see #setPrp(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRedProt_Prp()
	 * @model unsettable="true"
	 * @generated
	 */
    Boolean getPrp();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getPrp <em>Prp</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prp</em>' attribute.
	 * @see #isSetPrp()
	 * @see #unsetPrp()
	 * @see #getPrp()
	 * @generated
	 */
    void setPrp( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getPrp <em>Prp</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetPrp()
	 * @see #getPrp()
	 * @see #setPrp(Boolean)
	 * @generated
	 */
    void unsetPrp();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getPrp <em>Prp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prp</em>' attribute is set.
	 * @see #unsetPrp()
	 * @see #getPrp()
	 * @see #setPrp(Boolean)
	 * @generated
	 */
    boolean isSetPrp();

    /**
	 * Returns the value of the '<em><b>Rstp</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rstp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Rstp</em>' attribute.
	 * @see #isSetRstp()
	 * @see #unsetRstp()
	 * @see #setRstp(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRedProt_Rstp()
	 * @model unsettable="true"
	 * @generated
	 */
    Boolean getRstp();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getRstp <em>Rstp</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rstp</em>' attribute.
	 * @see #isSetRstp()
	 * @see #unsetRstp()
	 * @see #getRstp()
	 * @generated
	 */
    void setRstp( Boolean value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getRstp <em>Rstp</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetRstp()
	 * @see #getRstp()
	 * @see #setRstp(Boolean)
	 * @generated
	 */
    void unsetRstp();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getRstp <em>Rstp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rstp</em>' attribute is set.
	 * @see #unsetRstp()
	 * @see #getRstp()
	 * @see #setRstp(Boolean)
	 * @generated
	 */
    boolean isSetRstp();

    /**
	 * Returns the value of the '<em><b>Services</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getRedProt <em>Red Prot</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' container reference.
	 * @see #setServices(Services)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRedProt_Services()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getRedProt
	 * @model opposite="RedProt" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    Services getServices();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getServices <em>Services</em>}' container reference.
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
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RedProt_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        true\n\n\n'"
	 * @generated
	 */
	boolean validateRedProt_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RedProt
