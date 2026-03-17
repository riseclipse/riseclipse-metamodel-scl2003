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
package fr.centralesupelec.edf.riseclipse.iec61850.asd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to another behavior description, used when a vendor is describing his implementation of a specific specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getBehaviorReference <em>Behavior Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getBehaviorUuid <em>Behavior Uuid</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getParentBehaviorDescription <em>Parent Behavior Description</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorReference()
 * @model
 * @generated
 */
public interface BehaviorReference extends BaseExtensionElementWithDesc {
    /**
     * Returns the value of the '<em><b>Behavior Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * path to another BehaviorDescription
     * <!-- end-model-doc -->
     * @return the value of the '<em>Behavior Reference</em>' attribute.
     * @see #setBehaviorReference(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorReference_BehaviorReference()
     * @model extendedMetaData="kind='attribute' name='behaviorReference'"
     * @generated
     */
    String getBehaviorReference();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getBehaviorReference <em>Behavior Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Reference</em>' attribute.
     * @see #getBehaviorReference()
     * @generated
     */
    void setBehaviorReference( String value );

    /**
     * Returns the value of the '<em><b>Behavior Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UUID of another BehaviorDescription
     * <!-- end-model-doc -->
     * @return the value of the '<em>Behavior Uuid</em>' attribute.
     * @see #setBehaviorUuid(String)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorReference_BehaviorUuid()
     * @model extendedMetaData="kind='attribute' name='behaviorUuid'"
     * @generated
     */
    String getBehaviorUuid();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getBehaviorUuid <em>Behavior Uuid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Uuid</em>' attribute.
     * @see #getBehaviorUuid()
     * @generated
     */
    void setBehaviorUuid( String value );

    /**
     * Returns the value of the '<em><b>Parent Behavior Description</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getBehaviorReference <em>Behavior Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Behavior Description</em>' container reference.
     * @see #setParentBehaviorDescription(BehaviorDescription)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage#getBehaviorReference_ParentBehaviorDescription()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getBehaviorReference
     * @model opposite="BehaviorReference" unsettable="true" ordered="false"
     * @generated
     */
    BehaviorDescription getParentBehaviorDescription();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getParentBehaviorDescription <em>Parent Behavior Description</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Behavior Description</em>' container reference.
     * @see #getParentBehaviorDescription()
     * @generated
     */
    void setParentBehaviorDescription( BehaviorDescription value );

} // BehaviorReference
