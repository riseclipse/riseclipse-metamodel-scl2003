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
package fr.centralesupelec.edf.riseclipse.iec61850.asd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Specifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceSpecificationsImpl#getGooseParameters <em>Goose Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceSpecificationsImpl#getSMVParameters <em>SMV Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceSpecificationsImpl#getReportParameters <em>Report Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceSpecificationsImpl#getBinaryWiringParameters <em>Binary Wiring Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceSpecificationsImpl#getAnalogueWiringParameters <em>Analogue Wiring Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceSpecificationsImpl#getLogParameters <em>Log Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSpecificationsImpl extends BaseExtensionElementWithDescImpl implements ServiceSpecifications {
    /**
     * The cached value of the '{@link #getGooseParameters() <em>Goose Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGooseParameters()
     * @generated
     * @ordered
     */
    protected EList< GooseParameters > gooseParameters;

    /**
     * The cached value of the '{@link #getSMVParameters() <em>SMV Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSMVParameters()
     * @generated
     * @ordered
     */
    protected EList< SMVParameters > smvParameters;

    /**
     * The cached value of the '{@link #getReportParameters() <em>Report Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportParameters()
     * @generated
     * @ordered
     */
    protected EList< ReportParameters > reportParameters;

    /**
     * The cached value of the '{@link #getBinaryWiringParameters() <em>Binary Wiring Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBinaryWiringParameters()
     * @generated
     * @ordered
     */
    protected EList< BinaryWiringParameters > binaryWiringParameters;

    /**
     * The cached value of the '{@link #getAnalogueWiringParameters() <em>Analogue Wiring Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalogueWiringParameters()
     * @generated
     * @ordered
     */
    protected EList< AnalogueWiringParameters > analogueWiringParameters;

    /**
     * The cached value of the '{@link #getLogParameters() <em>Log Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLogParameters()
     * @generated
     * @ordered
     */
    protected EList< LogParameters > logParameters;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceSpecificationsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getServiceSpecifications();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GooseParameters > getGooseParameters() {
        if( gooseParameters == null ) {
            gooseParameters = new EObjectContainmentWithInverseEList.Unsettable< >(
                    GooseParameters.class, this, AsdPackage.SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS,
                    AsdPackage.GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS );
        }
        return gooseParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGooseParameters() {
        if( gooseParameters != null ) {
            ( ( InternalEList.Unsettable< ? > ) gooseParameters ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGooseParameters() {
        return gooseParameters != null && ( ( InternalEList.Unsettable< ? > ) gooseParameters ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SMVParameters > getSMVParameters() {
        if( smvParameters == null ) {
            smvParameters = new EObjectContainmentWithInverseEList.Unsettable< >( SMVParameters.class,
                    this, AsdPackage.SERVICE_SPECIFICATIONS__SMV_PARAMETERS,
                    AsdPackage.SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS );
        }
        return smvParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSMVParameters() {
        if( smvParameters != null ) {
            ( ( InternalEList.Unsettable< ? > ) smvParameters ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSMVParameters() {
        return smvParameters != null && ( ( InternalEList.Unsettable< ? > ) smvParameters ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ReportParameters > getReportParameters() {
        if( reportParameters == null ) {
            reportParameters = new EObjectContainmentWithInverseEList.Unsettable< >(
                    ReportParameters.class, this, AsdPackage.SERVICE_SPECIFICATIONS__REPORT_PARAMETERS,
                    AsdPackage.REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS );
        }
        return reportParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReportParameters() {
        if( reportParameters != null ) {
            ( ( InternalEList.Unsettable< ? > ) reportParameters ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReportParameters() {
        return reportParameters != null && ( ( InternalEList.Unsettable< ? > ) reportParameters ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BinaryWiringParameters > getBinaryWiringParameters() {
        if( binaryWiringParameters == null ) {
            binaryWiringParameters = new EObjectContainmentWithInverseEList.Unsettable< >(
                    BinaryWiringParameters.class, this, AsdPackage.SERVICE_SPECIFICATIONS__BINARY_WIRING_PARAMETERS,
                    AsdPackage.BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS );
        }
        return binaryWiringParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBinaryWiringParameters() {
        if( binaryWiringParameters != null ) {
            ( ( InternalEList.Unsettable< ? > ) binaryWiringParameters ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBinaryWiringParameters() {
        return binaryWiringParameters != null && ( ( InternalEList.Unsettable< ? > ) binaryWiringParameters ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AnalogueWiringParameters > getAnalogueWiringParameters() {
        if( analogueWiringParameters == null ) {
            analogueWiringParameters = new EObjectContainmentWithInverseEList.Unsettable< >(
                    AnalogueWiringParameters.class, this, AsdPackage.SERVICE_SPECIFICATIONS__ANALOGUE_WIRING_PARAMETERS,
                    AsdPackage.ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS );
        }
        return analogueWiringParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAnalogueWiringParameters() {
        if( analogueWiringParameters != null ) {
            ( ( InternalEList.Unsettable< ? > ) analogueWiringParameters ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalogueWiringParameters() {
        return analogueWiringParameters != null
                && ( ( InternalEList.Unsettable< ? > ) analogueWiringParameters ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< LogParameters > getLogParameters() {
        if( logParameters == null ) {
            logParameters = new EObjectContainmentWithInverseEList.Unsettable< >( LogParameters.class,
                    this, AsdPackage.SERVICE_SPECIFICATIONS__LOG_PARAMETERS,
                    AsdPackage.LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS );
        }
        return logParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLogParameters() {
        if( logParameters != null ) {
            ( ( InternalEList.Unsettable< ? > ) logParameters ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLogParameters() {
        return logParameters != null && ( ( InternalEList.Unsettable< ? > ) logParameters ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGooseParameters() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSMVParameters() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReportParameters() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SERVICE_SPECIFICATIONS__BINARY_WIRING_PARAMETERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBinaryWiringParameters() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SERVICE_SPECIFICATIONS__ANALOGUE_WIRING_PARAMETERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAnalogueWiringParameters() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.SERVICE_SPECIFICATIONS__LOG_PARAMETERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLogParameters() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            return ( ( InternalEList< ? > ) getGooseParameters() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            return ( ( InternalEList< ? > ) getSMVParameters() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            return ( ( InternalEList< ? > ) getReportParameters() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SERVICE_SPECIFICATIONS__BINARY_WIRING_PARAMETERS:
            return ( ( InternalEList< ? > ) getBinaryWiringParameters() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SERVICE_SPECIFICATIONS__ANALOGUE_WIRING_PARAMETERS:
            return ( ( InternalEList< ? > ) getAnalogueWiringParameters() ).basicRemove( otherEnd, msgs );
        case AsdPackage.SERVICE_SPECIFICATIONS__LOG_PARAMETERS:
            return ( ( InternalEList< ? > ) getLogParameters() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case AsdPackage.SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            return getGooseParameters();
        case AsdPackage.SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            return getSMVParameters();
        case AsdPackage.SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            return getReportParameters();
        case AsdPackage.SERVICE_SPECIFICATIONS__BINARY_WIRING_PARAMETERS:
            return getBinaryWiringParameters();
        case AsdPackage.SERVICE_SPECIFICATIONS__ANALOGUE_WIRING_PARAMETERS:
            return getAnalogueWiringParameters();
        case AsdPackage.SERVICE_SPECIFICATIONS__LOG_PARAMETERS:
            return getLogParameters();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case AsdPackage.SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            getGooseParameters().clear();
            getGooseParameters().addAll( ( Collection< ? extends GooseParameters > ) newValue );
            return;
        case AsdPackage.SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            getSMVParameters().clear();
            getSMVParameters().addAll( ( Collection< ? extends SMVParameters > ) newValue );
            return;
        case AsdPackage.SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            getReportParameters().clear();
            getReportParameters().addAll( ( Collection< ? extends ReportParameters > ) newValue );
            return;
        case AsdPackage.SERVICE_SPECIFICATIONS__BINARY_WIRING_PARAMETERS:
            getBinaryWiringParameters().clear();
            getBinaryWiringParameters().addAll( ( Collection< ? extends BinaryWiringParameters > ) newValue );
            return;
        case AsdPackage.SERVICE_SPECIFICATIONS__ANALOGUE_WIRING_PARAMETERS:
            getAnalogueWiringParameters().clear();
            getAnalogueWiringParameters().addAll( ( Collection< ? extends AnalogueWiringParameters > ) newValue );
            return;
        case AsdPackage.SERVICE_SPECIFICATIONS__LOG_PARAMETERS:
            getLogParameters().clear();
            getLogParameters().addAll( ( Collection< ? extends LogParameters > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case AsdPackage.SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            unsetGooseParameters();
            return;
        case AsdPackage.SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            unsetSMVParameters();
            return;
        case AsdPackage.SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            unsetReportParameters();
            return;
        case AsdPackage.SERVICE_SPECIFICATIONS__BINARY_WIRING_PARAMETERS:
            unsetBinaryWiringParameters();
            return;
        case AsdPackage.SERVICE_SPECIFICATIONS__ANALOGUE_WIRING_PARAMETERS:
            unsetAnalogueWiringParameters();
            return;
        case AsdPackage.SERVICE_SPECIFICATIONS__LOG_PARAMETERS:
            unsetLogParameters();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case AsdPackage.SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            return isSetGooseParameters();
        case AsdPackage.SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            return isSetSMVParameters();
        case AsdPackage.SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            return isSetReportParameters();
        case AsdPackage.SERVICE_SPECIFICATIONS__BINARY_WIRING_PARAMETERS:
            return isSetBinaryWiringParameters();
        case AsdPackage.SERVICE_SPECIFICATIONS__ANALOGUE_WIRING_PARAMETERS:
            return isSetAnalogueWiringParameters();
        case AsdPackage.SERVICE_SPECIFICATIONS__LOG_PARAMETERS:
            return isSetLogParameters();
        }
        return super.eIsSet( featureID );
    }

} //ServiceSpecificationsImpl
