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
 * A representation of the model object '<em><b>Smv Opts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getParentSampledValueControl <em>Parent Sampled Value Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmvOpts()
 * @model
 * @generated
 */
public interface SmvOpts extends SclObject, AgSmvOpts {
    /**
     * Returns the value of the '<em><b>Parent Sampled Value Control</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvOpts <em>Smv Opts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Sampled Value Control</em>' container reference.
     * @see #setParentSampledValueControl(SampledValueControl)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSmvOpts_ParentSampledValueControl()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvOpts
     * @model opposite="SmvOpts" resolveProxies="false" unsettable="true" ordered="false"
     * @generated
     */
    SampledValueControl getParentSampledValueControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getParentSampledValueControl <em>Parent Sampled Value Control</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Sampled Value Control</em>' container reference.
     * @see #getParentSampledValueControl()
     * @generated
     */
    void setParentSampledValueControl(SampledValueControl value);

} // SmvOpts
