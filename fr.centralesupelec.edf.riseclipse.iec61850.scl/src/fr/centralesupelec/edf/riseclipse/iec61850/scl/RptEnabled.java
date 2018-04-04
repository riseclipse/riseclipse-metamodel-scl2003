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
 * A representation of the model object '<em><b>Rpt Enabled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getMax <em>Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getClientLN <em>Client LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getReportControl <em>Report Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRptEnabled()
 * @model
 * @generated
 */
public interface RptEnabled extends UnNaming {
    /**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #setMax(Integer)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRptEnabled_Max()
	 * @model unsettable="true"
	 * @generated
	 */
    Integer getMax();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #getMax()
	 * @generated
	 */
    void setMax( Integer value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetMax()
	 * @see #getMax()
	 * @see #setMax(Integer)
	 * @generated
	 */
    void unsetMax();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getMax <em>Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max</em>' attribute is set.
	 * @see #unsetMax()
	 * @see #getMax()
	 * @see #setMax(Integer)
	 * @generated
	 */
    boolean isSetMax();

    /**
	 * Returns the value of the '<em><b>Client LN</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getRptEnabled <em>Rpt Enabled</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Client LN</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Client LN</em>' containment reference list.
	 * @see #isSetClientLN()
	 * @see #unsetClientLN()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRptEnabled_ClientLN()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getRptEnabled
	 * @model opposite="RptEnabled" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<ClientLN> getClientLN();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getClientLN <em>Client LN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetClientLN()
	 * @see #getClientLN()
	 * @generated
	 */
    void unsetClientLN();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getClientLN <em>Client LN</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Client LN</em>' containment reference list is set.
	 * @see #unsetClientLN()
	 * @see #getClientLN()
	 * @generated
	 */
    boolean isSetClientLN();

    /**
	 * Returns the value of the '<em><b>Report Control</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptEnabled <em>Rpt Enabled</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Report Control</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Control</em>' container reference.
	 * @see #setReportControl(ReportControl)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getRptEnabled_ReportControl()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptEnabled
	 * @model opposite="RptEnabled" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    ReportControl getReportControl();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getReportControl <em>Report Control</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Control</em>' container reference.
	 * @see #getReportControl()
	 * @generated
	 */
    void setReportControl( ReportControl value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RptEnabled_max_unsigned_int'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'max attribute shall be valid in RptEnabled (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.max.toString()\n        ,\n\tstatus : Boolean = \n        self.max &lt;&gt; null implies self.max &gt;= 0\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateRptEnabled_max_unsigned_int(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RptEnabled
