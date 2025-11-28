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

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Service Specifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CommServiceSpecificationsImpl#getGooseParameters <em>Goose Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CommServiceSpecificationsImpl#getSMVParameters <em>SMV Parameters</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CommServiceSpecificationsImpl#getReportParameters <em>Report Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommServiceSpecificationsImpl extends BaseExtensionElementWithDescImpl
        implements CommServiceSpecifications {
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
    protected EList< SMVParameters > sMVParameters;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CommServiceSpecificationsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return AsdPackage.eINSTANCE.getCommServiceSpecifications();
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
                    GooseParameters.class, this, AsdPackage.COMM_SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS,
                    AsdPackage.GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS );
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
        if( sMVParameters == null ) {
            sMVParameters = new EObjectContainmentWithInverseEList.Unsettable< >( SMVParameters.class,
                    this, AsdPackage.COMM_SERVICE_SPECIFICATIONS__SMV_PARAMETERS,
                    AsdPackage.SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS );
        }
        return sMVParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSMVParameters() {
        if( sMVParameters != null ) {
            ( ( InternalEList.Unsettable< ? > ) sMVParameters ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSMVParameters() {
        return sMVParameters != null && ( ( InternalEList.Unsettable< ? > ) sMVParameters ).isSet();
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
                    ReportParameters.class, this, AsdPackage.COMM_SERVICE_SPECIFICATIONS__REPORT_PARAMETERS,
                    AsdPackage.REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGooseParameters() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSMVParameters() )
                    .basicAdd( otherEnd, msgs );
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReportParameters() )
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
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            return ( ( InternalEList< ? > ) getGooseParameters() ).basicRemove( otherEnd, msgs );
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            return ( ( InternalEList< ? > ) getSMVParameters() ).basicRemove( otherEnd, msgs );
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            return ( ( InternalEList< ? > ) getReportParameters() ).basicRemove( otherEnd, msgs );
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
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            return getGooseParameters();
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            return getSMVParameters();
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            return getReportParameters();
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
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            getGooseParameters().clear();
            getGooseParameters().addAll( ( Collection< ? extends GooseParameters > ) newValue );
            return;
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            getSMVParameters().clear();
            getSMVParameters().addAll( ( Collection< ? extends SMVParameters > ) newValue );
            return;
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            getReportParameters().clear();
            getReportParameters().addAll( ( Collection< ? extends ReportParameters > ) newValue );
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
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            unsetGooseParameters();
            return;
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            unsetSMVParameters();
            return;
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            unsetReportParameters();
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
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS:
            return isSetGooseParameters();
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__SMV_PARAMETERS:
            return isSetSMVParameters();
        case AsdPackage.COMM_SERVICE_SPECIFICATIONS__REPORT_PARAMETERS:
            return isSetReportParameters();
        }
        return super.eIsSet( featureID );
    }

} //CommServiceSpecificationsImpl
