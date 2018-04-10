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
 * A representation of the model object '<em><b>Hitem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getRevision <em>Revision</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhat <em>What</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhen <em>When</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWho <em>Who</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhy <em>Why</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getHistory <em>History</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHitem()
 * @model
 * @generated
 */
public interface Hitem extends SclObject {
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHitem_Revision()
     * @model unsettable="true"
     * @generated
     */
    String getRevision();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getRevision <em>Revision</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getRevision <em>Revision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRevision()
     * @see #getRevision()
     * @see #setRevision(String)
     * @generated
     */
    void unsetRevision();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getRevision <em>Revision</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHitem_Version()
     * @model unsettable="true"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getVersion <em>Version</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVersion()
     * @see #getVersion()
     * @see #setVersion(String)
     * @generated
     */
    void unsetVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getVersion <em>Version</em>}' attribute is set.
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
     * Returns the value of the '<em><b>What</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>What</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>What</em>' attribute.
     * @see #isSetWhat()
     * @see #unsetWhat()
     * @see #setWhat(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHitem_What()
     * @model unsettable="true"
     * @generated
     */
    String getWhat();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhat <em>What</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>What</em>' attribute.
     * @see #isSetWhat()
     * @see #unsetWhat()
     * @see #getWhat()
     * @generated
     */
    void setWhat( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhat <em>What</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWhat()
     * @see #getWhat()
     * @see #setWhat(String)
     * @generated
     */
    void unsetWhat();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhat <em>What</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>What</em>' attribute is set.
     * @see #unsetWhat()
     * @see #getWhat()
     * @see #setWhat(String)
     * @generated
     */
    boolean isSetWhat();

    /**
     * Returns the value of the '<em><b>When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>When</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>When</em>' attribute.
     * @see #isSetWhen()
     * @see #unsetWhen()
     * @see #setWhen(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHitem_When()
     * @model unsettable="true"
     * @generated
     */
    String getWhen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhen <em>When</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhen <em>When</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWhen()
     * @see #getWhen()
     * @see #setWhen(String)
     * @generated
     */
    void unsetWhen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhen <em>When</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Who</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Who</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Who</em>' attribute.
     * @see #isSetWho()
     * @see #unsetWho()
     * @see #setWho(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHitem_Who()
     * @model unsettable="true"
     * @generated
     */
    String getWho();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWho <em>Who</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Who</em>' attribute.
     * @see #isSetWho()
     * @see #unsetWho()
     * @see #getWho()
     * @generated
     */
    void setWho( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWho <em>Who</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWho()
     * @see #getWho()
     * @see #setWho(String)
     * @generated
     */
    void unsetWho();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWho <em>Who</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Who</em>' attribute is set.
     * @see #unsetWho()
     * @see #getWho()
     * @see #setWho(String)
     * @generated
     */
    boolean isSetWho();

    /**
     * Returns the value of the '<em><b>Why</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Why</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Why</em>' attribute.
     * @see #isSetWhy()
     * @see #unsetWhy()
     * @see #setWhy(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHitem_Why()
     * @model unsettable="true"
     * @generated
     */
    String getWhy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhy <em>Why</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Why</em>' attribute.
     * @see #isSetWhy()
     * @see #unsetWhy()
     * @see #getWhy()
     * @generated
     */
    void setWhy( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhy <em>Why</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWhy()
     * @see #getWhy()
     * @see #setWhy(String)
     * @generated
     */
    void unsetWhy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhy <em>Why</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Why</em>' attribute is set.
     * @see #unsetWhy()
     * @see #getWhy()
     * @see #setWhy(String)
     * @generated
     */
    boolean isSetWhy();

    /**
     * Returns the value of the '<em><b>History</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHitem <em>Hitem</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>History</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>History</em>' container reference.
     * @see #setHistory(History)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getHitem_History()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHitem
     * @model opposite="Hitem" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    History getHistory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getHistory <em>History</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>History</em>' container reference.
     * @see #getHistory()
     * @generated
     */
    void setHistory( History value );

} // Hitem
