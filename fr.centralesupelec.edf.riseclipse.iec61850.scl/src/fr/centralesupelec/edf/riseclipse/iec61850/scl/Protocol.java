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
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getControlWithIEDName <em>Control With IED Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends SclObject {
    /**
     * Returns the value of the '<em><b>Must Understand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Must Understand</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Must Understand</em>' attribute.
     * @see #isSetMustUnderstand()
     * @see #unsetMustUnderstand()
     * @see #setMustUnderstand(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProtocol_MustUnderstand()
     * @model unsettable="true"
     * @generated
     */
    Boolean getMustUnderstand();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getMustUnderstand <em>Must Understand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Must Understand</em>' attribute.
     * @see #isSetMustUnderstand()
     * @see #unsetMustUnderstand()
     * @see #getMustUnderstand()
     * @generated
     */
    void setMustUnderstand( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getMustUnderstand <em>Must Understand</em>}' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #isSetMustUnderstand()
     * @see #getMustUnderstand()
     * @see #setMustUnderstand(Boolean)
     * @generated
     */
    void unsetMustUnderstand();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getMustUnderstand <em>Must Understand</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Must Understand</em>' attribute is set.
     * @see #unsetMustUnderstand()
     * @see #getMustUnderstand()
     * @see #setMustUnderstand(Boolean)
     * @generated
     */
    boolean isSetMustUnderstand();

    /**
     * Returns the value of the '<em><b>Control With IED Name</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control With IED Name</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control With IED Name</em>' container reference.
     * @see #setControlWithIEDName(ControlWithIEDName)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getProtocol_ControlWithIEDName()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol
     * @model opposite="Protocol" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    ControlWithIEDName getControlWithIEDName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getControlWithIEDName <em>Control With IED Name</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control With IED Name</em>' container reference.
     * @see #getControlWithIEDName()
     * @generated
     */
    void setControlWithIEDName( ControlWithIEDName value );

} // Protocol
