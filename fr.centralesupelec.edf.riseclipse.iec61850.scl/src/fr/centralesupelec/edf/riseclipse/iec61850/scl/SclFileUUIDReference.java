/**
 *  Copyright (c) 2016-2024 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
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
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File UUID Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileName <em>File Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileType <em>File Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileUuid <em>File Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getWhen <em>When</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getParentHeaderSclRef <em>Parent Header Scl Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getParentApplicationSclRef <em>Parent Application Scl Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getParentFunctionSclRef <em>Parent Function Scl Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getParentIEDSclRef <em>Parent IED Scl Ref</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclFileUUIDReference()
 * @model
 * @generated
 */
public interface SclFileUUIDReference extends SclObject {
    /**
     * Returns the value of the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Name</em>' attribute.
     * @see #isSetFileName()
     * @see #unsetFileName()
     * @see #setFileName(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclFileUUIDReference_FileName()
     * @model unsettable="true"
     * @generated
     */
    String getFileName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileName <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Name</em>' attribute.
     * @see #isSetFileName()
     * @see #unsetFileName()
     * @see #getFileName()
     * @generated
     */
    void setFileName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileName <em>File Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFileName()
     * @see #getFileName()
     * @see #setFileName(String)
     * @generated
     */
    void unsetFileName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileName <em>File Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>File Name</em>' attribute is set.
     * @see #unsetFileName()
     * @see #getFileName()
     * @see #setFileName(String)
     * @generated
     */
    boolean isSetFileName();

    /**
     * Returns the value of the '<em><b>File Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Type</em>' attribute.
     * @see #isSetFileType()
     * @see #unsetFileType()
     * @see #setFileType(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclFileUUIDReference_FileType()
     * @model unsettable="true"
     * @generated
     */
    String getFileType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileType <em>File Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Type</em>' attribute.
     * @see #isSetFileType()
     * @see #unsetFileType()
     * @see #getFileType()
     * @generated
     */
    void setFileType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileType <em>File Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFileType()
     * @see #getFileType()
     * @see #setFileType(String)
     * @generated
     */
    void unsetFileType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileType <em>File Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>File Type</em>' attribute is set.
     * @see #unsetFileType()
     * @see #getFileType()
     * @see #setFileType(String)
     * @generated
     */
    boolean isSetFileType();

    /**
     * Returns the value of the '<em><b>File Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>File Uuid</em>' attribute.
     * @see #isSetFileUuid()
     * @see #unsetFileUuid()
     * @see #setFileUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclFileUUIDReference_FileUuid()
     * @model unsettable="true"
     * @generated
     */
    String getFileUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileUuid <em>File Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Uuid</em>' attribute.
     * @see #isSetFileUuid()
     * @see #unsetFileUuid()
     * @see #getFileUuid()
     * @generated
     */
    void setFileUuid( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileUuid <em>File Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFileUuid()
     * @see #getFileUuid()
     * @see #setFileUuid(String)
     * @generated
     */
    void unsetFileUuid();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getFileUuid <em>File Uuid</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>File Uuid</em>' attribute is set.
     * @see #unsetFileUuid()
     * @see #getFileUuid()
     * @see #setFileUuid(String)
     * @generated
     */
    boolean isSetFileUuid();

    /**
     * Returns the value of the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Revision</em>' attribute.
     * @see #isSetRevision()
     * @see #unsetRevision()
     * @see #setRevision(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclFileUUIDReference_Revision()
     * @model unsettable="true"
     * @generated
     */
    String getRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getRevision <em>Revision</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    void unsetRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getRevision <em>Revision</em>}' attribute is set.
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
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #setVersion(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclFileUUIDReference_Version()
     * @model unsettable="true"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getVersion <em>Version</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVersion()
     * @see #getVersion()
     * @see #setVersion(String)
     * @generated
     */
    void unsetVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getVersion <em>Version</em>}' attribute is set.
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
     * Returns the value of the '<em><b>When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>When</em>' attribute.
     * @see #isSetWhen()
     * @see #unsetWhen()
     * @see #setWhen(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclFileUUIDReference_When()
     * @model unsettable="true"
     * @generated
     */
    String getWhen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getWhen <em>When</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>When</em>' attribute.
     * @see #isSetWhen()
     * @see #unsetWhen()
     * @see #getWhen()
     * @generated
     */
    void setWhen( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getWhen <em>When</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWhen()
     * @see #getWhen()
     * @see #setWhen(String)
     * @generated
     */
    void unsetWhen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getWhen <em>When</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>When</em>' attribute is set.
     * @see #unsetWhen()
     * @see #getWhen()
     * @see #setWhen(String)
     * @generated
     */
    boolean isSetWhen();

    /**
     * Returns the value of the '<em><b>Parent Header Scl Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.HeaderSclRef#getSclFileReference <em>Scl File Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Header Scl Ref</em>' container reference.
     * @see #setParentHeaderSclRef(HeaderSclRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclFileUUIDReference_ParentHeaderSclRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.HeaderSclRef#getSclFileReference
     * @model opposite="SclFileReference" unsettable="true" ordered="false"
     * @generated
     */
    HeaderSclRef getParentHeaderSclRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getParentHeaderSclRef <em>Parent Header Scl Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Header Scl Ref</em>' container reference.
     * @see #getParentHeaderSclRef()
     * @generated
     */
    void setParentHeaderSclRef( HeaderSclRef value );

    /**
     * Returns the value of the '<em><b>Parent Application Scl Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getSclFileReference <em>Scl File Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Application Scl Ref</em>' container reference.
     * @see #setParentApplicationSclRef(ApplicationSclRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclFileUUIDReference_ParentApplicationSclRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getSclFileReference
     * @model opposite="SclFileReference" unsettable="true" ordered="false"
     * @generated
     */
    ApplicationSclRef getParentApplicationSclRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getParentApplicationSclRef <em>Parent Application Scl Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Application Scl Ref</em>' container reference.
     * @see #getParentApplicationSclRef()
     * @generated
     */
    void setParentApplicationSclRef( ApplicationSclRef value );

    /**
     * Returns the value of the '<em><b>Parent Function Scl Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef#getSclFileReference <em>Scl File Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Function Scl Ref</em>' container reference.
     * @see #setParentFunctionSclRef(FunctionSclRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclFileUUIDReference_ParentFunctionSclRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef#getSclFileReference
     * @model opposite="SclFileReference" unsettable="true" ordered="false"
     * @generated
     */
    FunctionSclRef getParentFunctionSclRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getParentFunctionSclRef <em>Parent Function Scl Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Function Scl Ref</em>' container reference.
     * @see #getParentFunctionSclRef()
     * @generated
     */
    void setParentFunctionSclRef( FunctionSclRef value );

    /**
     * Returns the value of the '<em><b>Parent IED Scl Ref</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDSclRef#getSclFileReference <em>Scl File Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent IED Scl Ref</em>' container reference.
     * @see #setParentIEDSclRef(IEDSclRef)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclFileUUIDReference_ParentIEDSclRef()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDSclRef#getSclFileReference
     * @model opposite="SclFileReference" unsettable="true" ordered="false"
     * @generated
     */
    IEDSclRef getParentIEDSclRef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFileUUIDReference#getParentIEDSclRef <em>Parent IED Scl Ref</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent IED Scl Ref</em>' container reference.
     * @see #getParentIEDSclRef()
     * @generated
     */
    void setParentIEDSclRef( IEDSclRef value );

} // SclFileUUIDReference
