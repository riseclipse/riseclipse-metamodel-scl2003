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
 * A representation of the model object '<em><b>Service Conf Report Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufMode <em>Buf Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufConf <em>Buf Conf</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceConfReportControl()
 * @model
 * @generated
 */
public interface ServiceConfReportControl extends ServiceWithMax {
    /**
	 * Returns the value of the '<em><b>Buf Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.bufModeEnum}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Buf Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Buf Mode</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.bufModeEnum
	 * @see #isSetBufMode()
	 * @see #unsetBufMode()
	 * @see #setBufMode(bufModeEnum)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceConfReportControl_BufMode()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ServiceConfReportControl!bufMode'"
	 * @generated
	 */
    bufModeEnum getBufMode();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufMode <em>Buf Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buf Mode</em>' attribute.
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.bufModeEnum
	 * @see #isSetBufMode()
	 * @see #unsetBufMode()
	 * @see #getBufMode()
	 * @generated
	 */
    void setBufMode(bufModeEnum value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufMode <em>Buf Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetBufMode()
	 * @see #getBufMode()
	 * @see #setBufMode(bufModeEnum)
	 * @generated
	 */
    void unsetBufMode();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufMode <em>Buf Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buf Mode</em>' attribute is set.
	 * @see #unsetBufMode()
	 * @see #getBufMode()
	 * @see #setBufMode(bufModeEnum)
	 * @generated
	 */
    boolean isSetBufMode();

    /**
	 * Returns the value of the '<em><b>Buf Conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Buf Conf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Buf Conf</em>' attribute.
	 * @see #isSetBufConf()
	 * @see #unsetBufConf()
	 * @see #setBufConf(Boolean)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getServiceConfReportControl_BufConf()
	 * @model unsettable="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.iec.ch/61850/2003/SCL!ServiceConfReportControl!bufConf'"
	 * @generated
	 */
    Boolean getBufConf();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufConf <em>Buf Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buf Conf</em>' attribute.
	 * @see #isSetBufConf()
	 * @see #unsetBufConf()
	 * @see #getBufConf()
	 * @generated
	 */
    void setBufConf(Boolean value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufConf <em>Buf Conf</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetBufConf()
	 * @see #getBufConf()
	 * @see #setBufConf(Boolean)
	 * @generated
	 */
    void unsetBufConf();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufConf <em>Buf Conf</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buf Conf</em>' attribute is set.
	 * @see #unsetBufConf()
	 * @see #getBufConf()
	 * @see #setBufConf(Boolean)
	 * @generated
	 */
    boolean isSetBufConf();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ServiceConfReportControl_nothing'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n * inv ServiceConfReportControl_nothing: true\n \052/\nreturn &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;'"
	 * @generated
	 */
	boolean validateServiceConfReportControl_nothing(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ServiceConfReportControl
