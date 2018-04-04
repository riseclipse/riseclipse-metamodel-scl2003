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
 * A representation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getPathName <em>Path Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getBay <em>Bay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectivityNode()
 * @model
 * @generated
 */
public interface ConnectivityNode extends LNodeContainer {
    /**
	 * Returns the value of the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name</em>' attribute.
	 * @see #isSetPathName()
	 * @see #unsetPathName()
	 * @see #setPathName(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectivityNode_PathName()
	 * @model unsettable="true"
	 * @generated
	 */
    String getPathName();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getPathName <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name</em>' attribute.
	 * @see #isSetPathName()
	 * @see #unsetPathName()
	 * @see #getPathName()
	 * @generated
	 */
    void setPathName( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getPathName <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetPathName()
	 * @see #getPathName()
	 * @see #setPathName(String)
	 * @generated
	 */
    void unsetPathName();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getPathName <em>Path Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Path Name</em>' attribute is set.
	 * @see #unsetPathName()
	 * @see #getPathName()
	 * @see #setPathName(String)
	 * @generated
	 */
    boolean isSetPathName();

    /**
	 * Returns the value of the '<em><b>Bay</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bay</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Bay</em>' container reference.
	 * @see #setBay(Bay)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectivityNode_Bay()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConnectivityNode
	 * @model opposite="ConnectivityNode" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    Bay getBay();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getBay <em>Bay</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bay</em>' container reference.
	 * @see #getBay()
	 * @generated
	 */
    void setBay( Bay value );

    /**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNode <em>CNode</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Terminal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference list.
	 * @see #isSetTerminal()
	 * @see #unsetTerminal()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectivityNode_Terminal()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNode
	 * @model opposite="cNode" resolveProxies="false" unsettable="true" transient="true" ordered="false"
	 * @generated
	 */
    EList<Terminal> getTerminal();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getTerminal <em>Terminal</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetTerminal()
	 * @see #getTerminal()
	 * @generated
	 */
    void unsetTerminal();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getTerminal <em>Terminal</em>}' reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Terminal</em>' reference list is set.
	 * @see #unsetTerminal()
	 * @see #getTerminal()
	 * @generated
	 */
    boolean isSetTerminal();

    /**
	 * Returns the value of the '<em><b>Line</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConnectivityNode <em>Connectivity Node</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' container reference.
	 * @see #setLine(Line)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getConnectivityNode_Line()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConnectivityNode
	 * @model opposite="ConnectivityNode" resolveProxies="false" unsettable="true"
	 * @generated
	 */
    Line getLine();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getLine <em>Line</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' container reference.
	 * @see #getLine()
	 * @generated
	 */
    void setLine( Line value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConnectivityNode_pathName_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'name attribute shall be present in ConnectivityNode (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.pathName &lt;&gt; null\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateConnectivityNode_pathName_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConnectivityNode_pathName_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'name attribute shall be valid in ConnectivityNode (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.pathName.toString()\n        ,\n\tstatus : Boolean = \n        self.pathName &lt;&gt; null implies self.validSclRef( pathName )\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateConnectivityNode_pathName_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConnectivityNode_pathName_value'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'pathName of ConnectivityNode shall be its path starting from Substation (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \'  + self.pathName + \', \'\n          + \'expected value is \' + self.Bay.VoltageLevel.Substation.name\n                           + \'/\' + self.Bay.VoltageLevel.name\n                           + \'/\' + self.Bay.name\n                           + \'/\' + self.name\n        ,\n\tstatus : Boolean = \n        self.pathName &lt;&gt; null\n        implies\n        self.pathName = self.Bay.VoltageLevel.Substation.name\n                + \'/\' + self.Bay.VoltageLevel.name\n                + \'/\' + self.Bay.name\n                + \'/\' + self.name\n\n\n}.status'"
	 * @generated
	 */
	boolean validateConnectivityNode_pathName_value(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ConnectivityNode
