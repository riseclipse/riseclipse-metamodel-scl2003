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
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getDatSet <em>Dat Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getRefersToDataSet <em>Refers To Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControl()
 * @model abstract="true"
 * @generated
 */
public interface Control extends UnNaming {
    /**
	 * Returns the value of the '<em><b>Dat Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dat Set</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Dat Set</em>' attribute.
	 * @see #isSetDatSet()
	 * @see #unsetDatSet()
	 * @see #setDatSet(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControl_DatSet()
	 * @model unsettable="true"
	 * @generated
	 */
    String getDatSet();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getDatSet <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dat Set</em>' attribute.
	 * @see #isSetDatSet()
	 * @see #unsetDatSet()
	 * @see #getDatSet()
	 * @generated
	 */
    void setDatSet( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getDatSet <em>Dat Set</em>}' attribute.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @see #isSetDatSet()
	 * @see #getDatSet()
	 * @see #setDatSet(String)
	 * @generated
	 */
    void unsetDatSet();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getDatSet <em>Dat Set</em>}' attribute is set.
	 * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dat Set</em>' attribute is set.
	 * @see #unsetDatSet()
	 * @see #getDatSet()
	 * @see #setDatSet(String)
	 * @generated
	 */
    boolean isSetDatSet();

    /**
	 * Returns the value of the '<em><b>Refers To Data Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getReferredByControl <em>Referred By Control</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Refers To Data Set</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Data Set</em>' reference.
	 * @see #isSetRefersToDataSet()
	 * @see #unsetRefersToDataSet()
	 * @see #setRefersToDataSet(DataSet)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControl_RefersToDataSet()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getReferredByControl
	 * @model opposite="ReferredByControl" resolveProxies="false" unsettable="true" transient="true"
	 * @generated
	 */
    DataSet getRefersToDataSet();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getRefersToDataSet <em>Refers To Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Data Set</em>' reference.
	 * @see #isSetRefersToDataSet()
	 * @see #unsetRefersToDataSet()
	 * @see #getRefersToDataSet()
	 * @generated
	 */
    void setRefersToDataSet(DataSet value);

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getRefersToDataSet <em>Refers To Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetRefersToDataSet()
	 * @see #getRefersToDataSet()
	 * @see #setRefersToDataSet(DataSet)
	 * @generated
	 */
    void unsetRefersToDataSet();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getRefersToDataSet <em>Refers To Data Set</em>}' reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refers To Data Set</em>' reference is set.
	 * @see #unsetRefersToDataSet()
	 * @see #getRefersToDataSet()
	 * @see #setRefersToDataSet(DataSet)
	 * @generated
	 */
    boolean isSetRefersToDataSet();

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
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getControl_Name()
	 * @model unsettable="true"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getName <em>Name</em>}' attribute.
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
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
    void unsetName();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getName <em>Name</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Control_name_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'name attribute shall be present in Control (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.name &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateControl_name_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Control_name_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'name attribute shall be valid in Control (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.name.toString()\n        ,\n\tstatus : Boolean = \n        self.name &lt;&gt; null implies self.validSclCBName( name )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateControl_name_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Control_datSet_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'datSet attribute shall be valid in Control (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.datSet.toString()\n        ,\n\tstatus : Boolean = \n        self.datSet &lt;&gt; null implies self.validSclDataSetName( datSet )\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateControl_datSet_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				AnyLN getAnyLN();

} // Control
