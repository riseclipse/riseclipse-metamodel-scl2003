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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getId <em>Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getNameStructure <em>Name Structure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getToolID <em>Tool ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getSCL <em>SCL</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getText <em>Text</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory <em>History</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends SclObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #setId(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHeader_Id()
     * @model unsettable="true"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #isSetId()
     * @see #unsetId()
     * @see #getId()
     * @generated
     */
    void setId( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetId()
     * @see #getId()
     * @see #setId(String)
     * @generated
     */
    void unsetId();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getId <em>Id</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Id</em>' attribute is set.
     * @see #unsetId()
     * @see #getId()
     * @see #setId(String)
     * @generated
     */
    boolean isSetId();

    /**
     * Returns the value of the '<em><b>Name Structure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name Structure</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name Structure</em>' attribute.
     * @see #isSetNameStructure()
     * @see #unsetNameStructure()
     * @see #setNameStructure(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHeader_NameStructure()
     * @model unsettable="true"
     * @generated
     */
    String getNameStructure();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getNameStructure <em>Name Structure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name Structure</em>' attribute.
     * @see #isSetNameStructure()
     * @see #unsetNameStructure()
     * @see #getNameStructure()
     * @generated
     */
    void setNameStructure( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getNameStructure <em>Name Structure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNameStructure()
     * @see #getNameStructure()
     * @see #setNameStructure(String)
     * @generated
     */
    void unsetNameStructure();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getNameStructure <em>Name Structure</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name Structure</em>' attribute is set.
     * @see #unsetNameStructure()
     * @see #getNameStructure()
     * @see #setNameStructure(String)
     * @generated
     */
    boolean isSetNameStructure();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHeader_Revision()
     * @model unsettable="true"
     * @generated
     */
    String getRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getRevision <em>Revision</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    void unsetRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getRevision <em>Revision</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tool ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tool ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tool ID</em>' attribute.
     * @see #isSetToolID()
     * @see #unsetToolID()
     * @see #setToolID(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHeader_ToolID()
     * @model unsettable="true"
     * @generated
     */
    String getToolID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getToolID <em>Tool ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tool ID</em>' attribute.
     * @see #isSetToolID()
     * @see #unsetToolID()
     * @see #getToolID()
     * @generated
     */
    void setToolID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getToolID <em>Tool ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetToolID()
     * @see #getToolID()
     * @see #setToolID(String)
     * @generated
     */
    void unsetToolID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getToolID <em>Tool ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tool ID</em>' attribute is set.
     * @see #unsetToolID()
     * @see #getToolID()
     * @see #setToolID(String)
     * @generated
     */
    boolean isSetToolID();

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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHeader_Version()
     * @model unsettable="true"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getVersion <em>Version</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVersion()
     * @see #getVersion()
     * @see #setVersion(String)
     * @generated
     */
    void unsetVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getVersion <em>Version</em>}' attribute is set.
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
     * Returns the value of the '<em><b>SCL</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getHeader <em>Header</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SCL</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SCL</em>' container reference.
     * @see #setSCL(SCL)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHeader_SCL()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getHeader
     * @model opposite="Header" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SCL getSCL();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getSCL <em>SCL</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SCL</em>' container reference.
     * @see #getSCL()
     * @generated
     */
    void setSCL( SCL value );

    /**
     * Returns the value of the '<em><b>Text</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getHeader <em>Header</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Text</em>' containment reference.
     * @see #isSetText()
     * @see #unsetText()
     * @see #setText(Text)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHeader_Text()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getHeader
     * @model opposite="Header" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    Text getText();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getText <em>Text</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' containment reference.
     * @see #isSetText()
     * @see #unsetText()
     * @see #getText()
     * @generated
     */
    void setText( Text value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getText <em>Text</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetText()
     * @see #getText()
     * @see #setText(Text)
     * @generated
     */
    void unsetText();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getText <em>Text</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Text</em>' containment reference is set.
     * @see #unsetText()
     * @see #getText()
     * @see #setText(Text)
     * @generated
     */
    boolean isSetText();

    /**
     * Returns the value of the '<em><b>History</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHeader <em>Header</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>History</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>History</em>' containment reference.
     * @see #isSetHistory()
     * @see #unsetHistory()
     * @see #setHistory(History)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHeader_History()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHeader
     * @model opposite="Header" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    History getHistory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory <em>History</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>History</em>' containment reference.
     * @see #isSetHistory()
     * @see #unsetHistory()
     * @see #getHistory()
     * @generated
     */
    void setHistory( History value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory <em>History</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHistory()
     * @see #getHistory()
     * @see #setHistory(History)
     * @generated
     */
    void unsetHistory();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory <em>History</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>History</em>' containment reference is set.
     * @see #unsetHistory()
     * @see #getHistory()
     * @see #setHistory(History)
     * @generated
     */
    boolean isSetHistory();

} // Header
