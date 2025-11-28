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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentAbstractDataAttribute <em>Parent Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDAI <em>Parent DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDAType <em>Parent DA Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDOI <em>Parent DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDOType <em>Parent DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentLNode <em>Parent LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentLNodeType <em>Parent LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentSDI <em>Parent SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentAccessPoint <em>Parent Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentAnyLN <em>Parent Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentIED <em>Parent IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentLDevice <em>Parent LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentNaming <em>Parent Naming</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDAS <em>Parent DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentSDS <em>Parent SDS</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels()
 * @model
 * @generated
 */
public interface Labels extends UnNaming {
    /**
     * Returns the value of the '<em><b>Label</b></em>' containment reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Label}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Label#getParentLabels <em>Parent Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' containment reference list.
     * @see #isSetLabel()
     * @see #unsetLabel()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_Label()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Label#getParentLabels
     * @model opposite="ParentLabels" containment="true" unsettable="true" ordered="false"
     * @generated
     */
    EList< Label > getLabel();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getLabel <em>Label</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLabel()
     * @see #getLabel()
     * @generated
     */
    void unsetLabel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getLabel <em>Label</em>}' containment reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Label</em>' containment reference list is set.
     * @see #unsetLabel()
     * @see #getLabel()
     * @generated
     */
    boolean isSetLabel();

    /**
     * Returns the value of the '<em><b>Parent Abstract Data Attribute</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Abstract Data Attribute</em>' container reference.
     * @see #setParentAbstractDataAttribute(AbstractDataAttribute)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentAbstractDataAttribute()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getLabels
     * @model opposite="labels" unsettable="true" ordered="false"
     * @generated
     */
    AbstractDataAttribute getParentAbstractDataAttribute();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentAbstractDataAttribute <em>Parent Abstract Data Attribute</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Abstract Data Attribute</em>' container reference.
     * @see #getParentAbstractDataAttribute()
     * @generated
     */
    void setParentAbstractDataAttribute( AbstractDataAttribute value );

    /**
     * Returns the value of the '<em><b>Parent DAI</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DAI</em>' container reference.
     * @see #setParentDAI(DAI)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentDAI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    DAI getParentDAI();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDAI <em>Parent DAI</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DAI</em>' container reference.
     * @see #getParentDAI()
     * @generated
     */
    void setParentDAI( DAI value );

    /**
     * Returns the value of the '<em><b>Parent DA Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DA Type</em>' container reference.
     * @see #setParentDAType(DAType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentDAType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    DAType getParentDAType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDAType <em>Parent DA Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DA Type</em>' container reference.
     * @see #getParentDAType()
     * @generated
     */
    void setParentDAType( DAType value );

    /**
     * Returns the value of the '<em><b>Parent DOI</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DOI</em>' container reference.
     * @see #setParentDOI(DOI)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentDOI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    DOI getParentDOI();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDOI <em>Parent DOI</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DOI</em>' container reference.
     * @see #getParentDOI()
     * @generated
     */
    void setParentDOI( DOI value );

    /**
     * Returns the value of the '<em><b>Parent DO Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DO Type</em>' container reference.
     * @see #setParentDOType(DOType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentDOType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    DOType getParentDOType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDOType <em>Parent DO Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DO Type</em>' container reference.
     * @see #getParentDOType()
     * @generated
     */
    void setParentDOType( DOType value );

    /**
     * Returns the value of the '<em><b>Parent LNode</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LNode</em>' container reference.
     * @see #setParentLNode(LNode)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentLNode()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    LNode getParentLNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentLNode <em>Parent LNode</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LNode</em>' container reference.
     * @see #getParentLNode()
     * @generated
     */
    void setParentLNode( LNode value );

    /**
     * Returns the value of the '<em><b>Parent LNode Type</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LNode Type</em>' container reference.
     * @see #setParentLNodeType(LNodeType)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentLNodeType()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    LNodeType getParentLNodeType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentLNodeType <em>Parent LNode Type</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LNode Type</em>' container reference.
     * @see #getParentLNodeType()
     * @generated
     */
    void setParentLNodeType( LNodeType value );

    /**
     * Returns the value of the '<em><b>Parent SDI</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SDI</em>' container reference.
     * @see #setParentSDI(SDI)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentSDI()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    SDI getParentSDI();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentSDI <em>Parent SDI</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SDI</em>' container reference.
     * @see #getParentSDI()
     * @generated
     */
    void setParentSDI( SDI value );

    /**
     * Returns the value of the '<em><b>Parent Access Point</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Access Point</em>' container reference.
     * @see #setParentAccessPoint(AccessPoint)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentAccessPoint()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    AccessPoint getParentAccessPoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentAccessPoint <em>Parent Access Point</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Access Point</em>' container reference.
     * @see #getParentAccessPoint()
     * @generated
     */
    void setParentAccessPoint( AccessPoint value );

    /**
     * Returns the value of the '<em><b>Parent Any LN</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Any LN</em>' container reference.
     * @see #setParentAnyLN(AnyLN)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentAnyLN()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    AnyLN getParentAnyLN();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentAnyLN <em>Parent Any LN</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Any LN</em>' container reference.
     * @see #getParentAnyLN()
     * @generated
     */
    void setParentAnyLN( AnyLN value );

    /**
     * Returns the value of the '<em><b>Parent IED</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent IED</em>' container reference.
     * @see #setParentIED(IED)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentIED()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    IED getParentIED();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentIED <em>Parent IED</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent IED</em>' container reference.
     * @see #getParentIED()
     * @generated
     */
    void setParentIED( IED value );

    /**
     * Returns the value of the '<em><b>Parent LDevice</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent LDevice</em>' container reference.
     * @see #setParentLDevice(LDevice)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentLDevice()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    LDevice getParentLDevice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentLDevice <em>Parent LDevice</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent LDevice</em>' container reference.
     * @see #getParentLDevice()
     * @generated
     */
    void setParentLDevice( LDevice value );

    /**
     * Returns the value of the '<em><b>Parent Naming</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Naming</em>' container reference.
     * @see #setParentNaming(Naming)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentNaming()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming#getLabels
     * @model opposite="Labels" unsettable="true" ordered="false"
     * @generated
     */
    Naming getParentNaming();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentNaming <em>Parent Naming</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Naming</em>' container reference.
     * @see #getParentNaming()
     * @generated
     */
    void setParentNaming( Naming value );

    /**
     * Returns the value of the '<em><b>Parent DAS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DAS</em>' container reference.
     * @see #setParentDAS(DAS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentDAS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLabels
     * @model opposite="labels" unsettable="true" ordered="false"
     * @generated
     */
    DAS getParentDAS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDAS <em>Parent DAS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DAS</em>' container reference.
     * @see #getParentDAS()
     * @generated
     */
    void setParentDAS( DAS value );

    /**
     * Returns the value of the '<em><b>Parent DOS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent DOS</em>' container reference.
     * @see #setParentDOS(DOS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentDOS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLabels
     * @model opposite="labels" unsettable="true" ordered="false"
     * @generated
     */
    DOS getParentDOS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentDOS <em>Parent DOS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent DOS</em>' container reference.
     * @see #getParentDOS()
     * @generated
     */
    void setParentDOS( DOS value );

    /**
     * Returns the value of the '<em><b>Parent SDS</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent SDS</em>' container reference.
     * @see #setParentSDS(SDS)
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getLabels_ParentSDS()
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getLabels
     * @model opposite="labels" unsettable="true" ordered="false"
     * @generated
     */
    SDS getParentSDS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels#getParentSDS <em>Parent SDS</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent SDS</em>' container reference.
     * @see #getParentSDS()
     * @generated
     */
    void setParentSDS( SDS value );

} // Labels
