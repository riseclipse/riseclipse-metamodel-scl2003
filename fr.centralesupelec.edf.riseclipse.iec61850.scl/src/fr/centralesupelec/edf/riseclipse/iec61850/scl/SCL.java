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
 * A representation of the model object '<em><b>SCL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getHeader <em>Header</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getLine <em>Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getProcess <em>Process</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getIED <em>IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getDataTypeTemplates <em>Data Type Templates</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getCommunication <em>Communication</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRelease <em>Release</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCL()
 * @model
 * @generated
 */
public interface SCL extends BaseElement {
    /**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Revision</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #isSetRevision()
	 * @see #unsetRevision()
	 * @see #setRevision(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCL_Revision()
	 * @model unsettable="true"
	 * @generated
	 */
    String getRevision();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #isSetRevision()
	 * @see #unsetRevision()
	 * @see #getRevision()
	 * @generated
	 */
    void setRevision( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetRevision()
	 * @see #getRevision()
	 * @see #setRevision(String)
	 * @generated
	 */
    void unsetRevision();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRevision <em>Revision</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revision</em>' attribute is set.
	 * @see #unsetRevision()
	 * @see #getRevision()
	 * @see #setRevision(String)
	 * @generated
	 */
    boolean isSetRevision();

    /**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCL_Version()
	 * @model unsettable="true"
	 * @generated
	 */
    String getVersion();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
    void setVersion( String value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
    void unsetVersion();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
    boolean isSetVersion();

    /**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getSCL <em>SCL</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Header</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #isSetHeader()
	 * @see #unsetHeader()
	 * @see #setHeader(Header)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCL_Header()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getSCL
	 * @model opposite="SCL" containment="true" unsettable="true"
	 * @generated
	 */
    Header getHeader();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #isSetHeader()
	 * @see #unsetHeader()
	 * @see #getHeader()
	 * @generated
	 */
    void setHeader( Header value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetHeader()
	 * @see #getHeader()
	 * @see #setHeader(Header)
	 * @generated
	 */
    void unsetHeader();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getHeader <em>Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Header</em>' containment reference is set.
	 * @see #unsetHeader()
	 * @see #getHeader()
	 * @see #setHeader(Header)
	 * @generated
	 */
    boolean isSetHeader();

    /**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getSCL <em>SCL</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see #isSetLine()
	 * @see #unsetLine()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCL_Line()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getSCL
	 * @model opposite="SCL" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<Line> getLine();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getLine <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetLine()
	 * @see #getLine()
	 * @generated
	 */
    void unsetLine();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getLine <em>Line</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line</em>' containment reference list is set.
	 * @see #unsetLine()
	 * @see #getLine()
	 * @generated
	 */
    boolean isSetLine();

    /**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSCL <em>SCL</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see #isSetProcess()
	 * @see #unsetProcess()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCL_Process()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSCL
	 * @model opposite="SCL" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<fr.centralesupelec.edf.riseclipse.iec61850.scl.Process> getProcess();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getProcess <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetProcess()
	 * @see #getProcess()
	 * @generated
	 */
    void unsetProcess();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getProcess <em>Process</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Process</em>' containment reference list is set.
	 * @see #unsetProcess()
	 * @see #getProcess()
	 * @generated
	 */
    boolean isSetProcess();

    /**
	 * Returns the value of the '<em><b>IED</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getSCL <em>SCL</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>IED</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>IED</em>' containment reference list.
	 * @see #isSetIED()
	 * @see #unsetIED()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCL_IED()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getSCL
	 * @model opposite="SCL" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<IED> getIED();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getIED <em>IED</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetIED()
	 * @see #getIED()
	 * @generated
	 */
    void unsetIED();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getIED <em>IED</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IED</em>' containment reference list is set.
	 * @see #unsetIED()
	 * @see #getIED()
	 * @generated
	 */
    boolean isSetIED();

    /**
	 * Returns the value of the '<em><b>Data Type Templates</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getSCL <em>SCL</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Type Templates</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Templates</em>' containment reference.
	 * @see #isSetDataTypeTemplates()
	 * @see #unsetDataTypeTemplates()
	 * @see #setDataTypeTemplates(DataTypeTemplates)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCL_DataTypeTemplates()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getSCL
	 * @model opposite="SCL" containment="true" unsettable="true"
	 * @generated
	 */
    DataTypeTemplates getDataTypeTemplates();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getDataTypeTemplates <em>Data Type Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type Templates</em>' containment reference.
	 * @see #isSetDataTypeTemplates()
	 * @see #unsetDataTypeTemplates()
	 * @see #getDataTypeTemplates()
	 * @generated
	 */
    void setDataTypeTemplates( DataTypeTemplates value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getDataTypeTemplates <em>Data Type Templates</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetDataTypeTemplates()
	 * @see #getDataTypeTemplates()
	 * @see #setDataTypeTemplates(DataTypeTemplates)
	 * @generated
	 */
    void unsetDataTypeTemplates();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getDataTypeTemplates <em>Data Type Templates</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Type Templates</em>' containment reference is set.
	 * @see #unsetDataTypeTemplates()
	 * @see #getDataTypeTemplates()
	 * @see #setDataTypeTemplates(DataTypeTemplates)
	 * @generated
	 */
    boolean isSetDataTypeTemplates();

    /**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSCL <em>SCL</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Communication</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference.
	 * @see #isSetCommunication()
	 * @see #unsetCommunication()
	 * @see #setCommunication(Communication)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCL_Communication()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSCL
	 * @model opposite="SCL" containment="true" unsettable="true"
	 * @generated
	 */
    Communication getCommunication();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getCommunication <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication</em>' containment reference.
	 * @see #isSetCommunication()
	 * @see #unsetCommunication()
	 * @see #getCommunication()
	 * @generated
	 */
    void setCommunication( Communication value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getCommunication <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetCommunication()
	 * @see #getCommunication()
	 * @see #setCommunication(Communication)
	 * @generated
	 */
    void unsetCommunication();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getCommunication <em>Communication</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Communication</em>' containment reference is set.
	 * @see #unsetCommunication()
	 * @see #getCommunication()
	 * @see #setCommunication(Communication)
	 * @generated
	 */
    boolean isSetCommunication();

    /**
	 * Returns the value of the '<em><b>Substation</b></em>' containment reference list.
	 * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation}.
	 * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getSCL <em>SCL</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Substation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Substation</em>' containment reference list.
	 * @see #isSetSubstation()
	 * @see #unsetSubstation()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCL_Substation()
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getSCL
	 * @model opposite="SCL" containment="true" unsettable="true" ordered="false"
	 * @generated
	 */
    EList<Substation> getSubstation();

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getSubstation <em>Substation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetSubstation()
	 * @see #getSubstation()
	 * @generated
	 */
    void unsetSubstation();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getSubstation <em>Substation</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Substation</em>' containment reference list is set.
	 * @see #unsetSubstation()
	 * @see #getSubstation()
	 * @generated
	 */
    boolean isSetSubstation();

    /**
	 * Returns the value of the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Release</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' attribute.
	 * @see #isSetRelease()
	 * @see #unsetRelease()
	 * @see #setRelease(Byte)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSCL_Release()
	 * @model unsettable="true"
	 * @generated
	 */
    Byte getRelease();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' attribute.
	 * @see #isSetRelease()
	 * @see #unsetRelease()
	 * @see #getRelease()
	 * @generated
	 */
    void setRelease( Byte value );

    /**
	 * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isSetRelease()
	 * @see #getRelease()
	 * @see #setRelease(Byte)
	 * @generated
	 */
    void unsetRelease();

    /**
	 * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRelease <em>Release</em>}' attribute is set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Release</em>' attribute is set.
	 * @see #unsetRelease()
	 * @see #getRelease()
	 * @see #setRelease(Byte)
	 * @generated
	 */
    boolean isSetRelease();

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SCL_version_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'version attribute shall be present in SCL (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.version &lt;&gt; null\n    \n}.status'"
	 * @generated
	 */
	boolean validateSCL_version_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SCL_version_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'version attribute shall be a year between 2000 and 2999 in SCL (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.version.toString() ,\n\tstatus : Boolean = \n        self.version &lt;&gt; null implies self.validSclVersion( version )\n    \n}.status'"
	 * @generated
	 */
	boolean validateSCL_version_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SCL_version_value_2007'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'version attribute shall be equal to 2007 in SCL (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.version.toString() ,\n\tstatus : Boolean = \n        self.version &lt;&gt; null implies self.version = \'2007\'\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSCL_version_value_2007(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SCL_revision_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'revision attribute shall be present in SCL (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.revision &lt;&gt; null\n    \n}.status'"
	 * @generated
	 */
	boolean validateSCL_revision_required(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SCL_revision_valid'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'revision attribute shall be an uppercase letter in SCL (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.revision.toString() ,\n\tstatus : Boolean = \n        self.revision &lt;&gt; null implies self.validSclRevision( revision )\n    \n}.status'"
	 * @generated
	 */
	boolean validateSCL_revision_valid(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SCL_revision_value_B'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'revision attribute shall be equal to B in SCL (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.revision.toString() ,\n\tstatus : Boolean = \n        self.revision &lt;&gt; null implies self.revision = \'B\'\n\n    \n}.status'"
	 * @generated
	 */
	boolean validateSCL_revision_value_B(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SCL_release_value_1'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'release attribute shall be equal to 1 in SCL (line \' + self.lineNumber.toString() + \'). \'\n          + \'Current value is \' + self.release.toString() ,\n\tstatus : Boolean = \n        self.release &lt;&gt; null implies self.release = 1\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateSCL_release_value_1(DiagnosticChain diagnostics, Map<Object, Object> context);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SCL_one_Header_required'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'SCL shall contain an Header (line \' + self.lineNumber.toString() + \')\' ,\n\tstatus : Boolean = \n        self.Header &lt;&gt; null\n\n\n\n}.status'"
	 * @generated
	 */
	boolean validateSCL_one_Header_required(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SCL
