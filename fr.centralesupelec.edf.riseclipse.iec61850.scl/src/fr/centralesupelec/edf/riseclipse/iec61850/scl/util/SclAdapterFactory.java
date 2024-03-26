/*
*************************************************************************
**  Copyright (c) 2016-2021 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
**
**  This file is part of the RiseClipse tool
**
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.*;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage
 * @generated
 */
public class SclAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static SclPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public SclAdapterFactory() {
        if( modelPackage == null ) {
            modelPackage = SclPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc --> This implementation returns <code>true</code> if
     * the object is either the model's package or is an instance object of the
     * model. <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType( Object object ) {
        if( object == modelPackage ) {
            return true;
        }
        if( object instanceof EObject ) {
            return ( ( EObject ) object ).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SclSwitch< Adapter > modelSwitch = new SclSwitch< >() {
        @Override
        public Adapter caseAnyContentFromOtherNamespace( AnyContentFromOtherNamespace object ) {
            return createAnyContentFromOtherNamespaceAdapter();
        }

        @Override
        public Adapter caseBaseElement( BaseElement object ) {
            return createBaseElementAdapter();
        }

        @Override
        public Adapter caseHeader( Header object ) {
            return createHeaderAdapter();
        }

        @Override
        public Adapter caseHistory( History object ) {
            return createHistoryAdapter();
        }

        @Override
        public Adapter caseHitem( Hitem object ) {
            return createHitemAdapter();
        }

        @Override
        public Adapter caseIDNaming( IDNaming object ) {
            return createIDNamingAdapter();
        }

        @Override
        public Adapter caseLine( Line object ) {
            return createLineAdapter();
        }

        @Override
        public Adapter caseNaming( Naming object ) {
            return createNamingAdapter();
        }

        @Override
        public Adapter casePrivate( Private object ) {
            return createPrivateAdapter();
        }

        @Override
        public Adapter caseProcess( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process object ) {
            return createProcessAdapter();
        }

        @Override
        public Adapter caseSCL( SCL object ) {
            return createSCLAdapter();
        }

        @Override
        public Adapter caseText( Text object ) {
            return createTextAdapter();
        }

        @Override
        public Adapter caseAddress( Address object ) {
            return createAddressAdapter();
        }

        @Override
        public Adapter caseCommunication( Communication object ) {
            return createCommunicationAdapter();
        }

        @Override
        public Adapter caseControlBlock( ControlBlock object ) {
            return createControlBlockAdapter();
        }

        @Override
        public Adapter caseConnectedAP( ConnectedAP object ) {
            return createConnectedAPAdapter();
        }

        @Override
        public Adapter caseGSE( GSE object ) {
            return createGSEAdapter();
        }

        @Override
        public Adapter caseP( P object ) {
            return createPAdapter();
        }

        @Override
        public Adapter casePAddr( PAddr object ) {
            return createPAddrAdapter();
        }

        @Override
        public Adapter caseP_PhysConn( P_PhysConn object ) {
            return createP_PhysConnAdapter();
        }

        @Override
        public Adapter casePhysConn( PhysConn object ) {
            return createPhysConnAdapter();
        }

        @Override
        public Adapter caseSMV( SMV object ) {
            return createSMVAdapter();
        }

        @Override
        public Adapter caseSubNetwork( SubNetwork object ) {
            return createSubNetworkAdapter();
        }

        @Override
        public Adapter caseAbstractDataAttribute( AbstractDataAttribute object ) {
            return createAbstractDataAttributeAdapter();
        }

        @Override
        public Adapter caseBDA( BDA object ) {
            return createBDAAdapter();
        }

        @Override
        public Adapter caseDA( DA object ) {
            return createDAAdapter();
        }

        @Override
        public Adapter caseDAType( DAType object ) {
            return createDATypeAdapter();
        }

        @Override
        public Adapter caseDO( DO object ) {
            return createDOAdapter();
        }

        @Override
        public Adapter caseDOType( DOType object ) {
            return createDOTypeAdapter();
        }

        @Override
        public Adapter caseDataTypeTemplates( DataTypeTemplates object ) {
            return createDataTypeTemplatesAdapter();
        }

        @Override
        public Adapter caseEnumType( EnumType object ) {
            return createEnumTypeAdapter();
        }

        @Override
        public Adapter caseEnumVal( EnumVal object ) {
            return createEnumValAdapter();
        }

        @Override
        public Adapter caseLNodeType( LNodeType object ) {
            return createLNodeTypeAdapter();
        }

        @Override
        public Adapter caseProtNs( ProtNs object ) {
            return createProtNsAdapter();
        }

        @Override
        public Adapter caseSDO( SDO object ) {
            return createSDOAdapter();
        }

        @Override
        public Adapter caseVal( Val object ) {
            return createValAdapter();
        }

        @Override
        public Adapter caseAccessControl( AccessControl object ) {
            return createAccessControlAdapter();
        }

        @Override
        public Adapter caseAccessPoint( AccessPoint object ) {
            return createAccessPointAdapter();
        }

        @Override
        public Adapter caseAnyLN( AnyLN object ) {
            return createAnyLNAdapter();
        }

        @Override
        public Adapter caseAssociation( Association object ) {
            return createAssociationAdapter();
        }

        @Override
        public Adapter caseAuthentication( Authentication object ) {
            return createAuthenticationAdapter();
        }

        @Override
        public Adapter caseCertificate( Certificate object ) {
            return createCertificateAdapter();
        }

        @Override
        public Adapter caseClientLN( ClientLN object ) {
            return createClientLNAdapter();
        }

        @Override
        public Adapter caseClientServices( ClientServices object ) {
            return createClientServicesAdapter();
        }

        @Override
        public Adapter caseCommProt( CommProt object ) {
            return createCommProtAdapter();
        }

        @Override
        public Adapter caseConfDataSet( ConfDataSet object ) {
            return createConfDataSetAdapter();
        }

        @Override
        public Adapter caseConfLNs( ConfLNs object ) {
            return createConfLNsAdapter();
        }

        @Override
        public Adapter caseConfLdName( ConfLdName object ) {
            return createConfLdNameAdapter();
        }

        @Override
        public Adapter caseConfLogControl( ConfLogControl object ) {
            return createConfLogControlAdapter();
        }

        @Override
        public Adapter caseConfReportControl( ConfReportControl object ) {
            return createConfReportControlAdapter();
        }

        @Override
        public Adapter caseConfSG( ConfSG object ) {
            return createConfSGAdapter();
        }

        @Override
        public Adapter caseConfSigRef( ConfSigRef object ) {
            return createConfSigRefAdapter();
        }

        @Override
        public Adapter caseControl( Control object ) {
            return createControlAdapter();
        }

        @Override
        public Adapter caseControlWithIEDName( ControlWithIEDName object ) {
            return createControlWithIEDNameAdapter();
        }

        @Override
        public Adapter caseControlWithTriggerOpt( ControlWithTriggerOpt object ) {
            return createControlWithTriggerOptAdapter();
        }

        @Override
        public Adapter caseDAI( DAI object ) {
            return createDAIAdapter();
        }

        @Override
        public Adapter caseDOI( DOI object ) {
            return createDOIAdapter();
        }

        @Override
        public Adapter caseDataObjectDirectory( DataObjectDirectory object ) {
            return createDataObjectDirectoryAdapter();
        }

        @Override
        public Adapter caseDataSet( DataSet object ) {
            return createDataSetAdapter();
        }

        @Override
        public Adapter caseDataSetDirectory( DataSetDirectory object ) {
            return createDataSetDirectoryAdapter();
        }

        @Override
        public Adapter caseDynAssociation( DynAssociation object ) {
            return createDynAssociationAdapter();
        }

        @Override
        public Adapter caseDynDataSet( DynDataSet object ) {
            return createDynDataSetAdapter();
        }

        @Override
        public Adapter caseExtRef( ExtRef object ) {
            return createExtRefAdapter();
        }

        @Override
        public Adapter caseFCDA( FCDA object ) {
            return createFCDAAdapter();
        }

        @Override
        public Adapter caseFileHandling( FileHandling object ) {
            return createFileHandlingAdapter();
        }

        @Override
        public Adapter caseGOOSE( GOOSE object ) {
            return createGOOSEAdapter();
        }

        @Override
        public Adapter caseGOOSESecurity( GOOSESecurity object ) {
            return createGOOSESecurityAdapter();
        }

        @Override
        public Adapter caseGSEControl( GSEControl object ) {
            return createGSEControlAdapter();
        }

        @Override
        public Adapter caseGSEDir( GSEDir object ) {
            return createGSEDirAdapter();
        }

        @Override
        public Adapter caseGSESettings( GSESettings object ) {
            return createGSESettingsAdapter();
        }

        @Override
        public Adapter caseGSSE( GSSE object ) {
            return createGSSEAdapter();
        }

        @Override
        public Adapter caseGetCBValues( GetCBValues object ) {
            return createGetCBValuesAdapter();
        }

        @Override
        public Adapter caseGetDataObjectDefinition( GetDataObjectDefinition object ) {
            return createGetDataObjectDefinitionAdapter();
        }

        @Override
        public Adapter caseGetDataSetValue( GetDataSetValue object ) {
            return createGetDataSetValueAdapter();
        }

        @Override
        public Adapter caseGetDirectory( GetDirectory object ) {
            return createGetDirectoryAdapter();
        }

        @Override
        public Adapter caseIED( IED object ) {
            return createIEDAdapter();
        }

        @Override
        public Adapter caseIEDName( IEDName object ) {
            return createIEDNameAdapter();
        }

        @Override
        public Adapter caseInputs( Inputs object ) {
            return createInputsAdapter();
        }

        @Override
        public Adapter caseIssuerName( IssuerName object ) {
            return createIssuerNameAdapter();
        }

        @Override
        public Adapter caseKDC( KDC object ) {
            return createKDCAdapter();
        }

        @Override
        public Adapter caseLDevice( LDevice object ) {
            return createLDeviceAdapter();
        }

        @Override
        public Adapter caseLN( LN object ) {
            return createLNAdapter();
        }

        @Override
        public Adapter caseLN0( LN0 object ) {
            return createLN0Adapter();
        }

        @Override
        public Adapter caseLog( Log object ) {
            return createLogAdapter();
        }

        @Override
        public Adapter caseLogControl( LogControl object ) {
            return createLogControlAdapter();
        }

        @Override
        public Adapter caseLogSettings( LogSettings object ) {
            return createLogSettingsAdapter();
        }

        @Override
        public Adapter caseOptFields( OptFields object ) {
            return createOptFieldsAdapter();
        }

        @Override
        public Adapter caseProtocol( Protocol object ) {
            return createProtocolAdapter();
        }

        @Override
        public Adapter caseReadWrite( ReadWrite object ) {
            return createReadWriteAdapter();
        }

        @Override
        public Adapter caseRedProt( RedProt object ) {
            return createRedProtAdapter();
        }

        @Override
        public Adapter caseReportControl( ReportControl object ) {
            return createReportControlAdapter();
        }

        @Override
        public Adapter caseReportSettings( ReportSettings object ) {
            return createReportSettingsAdapter();
        }

        @Override
        public Adapter caseRptEnabled( RptEnabled object ) {
            return createRptEnabledAdapter();
        }

        @Override
        public Adapter caseSDI( SDI object ) {
            return createSDIAdapter();
        }

        @Override
        public Adapter caseSGEdit( SGEdit object ) {
            return createSGEditAdapter();
        }

        @Override
        public Adapter caseSMVSecurity( SMVSecurity object ) {
            return createSMVSecurityAdapter();
        }

        @Override
        public Adapter caseSMVSettings( SMVSettings object ) {
            return createSMVSettingsAdapter();
        }

        @Override
        public Adapter caseSMVsc( SMVsc object ) {
            return createSMVscAdapter();
        }

        @Override
        public Adapter caseSampledValueControl( SampledValueControl object ) {
            return createSampledValueControlAdapter();
        }

        @Override
        public Adapter caseServer( Server object ) {
            return createServerAdapter();
        }

        @Override
        public Adapter caseServerAt( ServerAt object ) {
            return createServerAtAdapter();
        }

        @Override
        public Adapter caseServiceSettings( ServiceSettings object ) {
            return createServiceSettingsAdapter();
        }

        @Override
        public Adapter caseServiceWithMax( ServiceWithMax object ) {
            return createServiceWithMaxAdapter();
        }

        @Override
        public Adapter caseServices( Services object ) {
            return createServicesAdapter();
        }

        @Override
        public Adapter caseSetDataSetValue( SetDataSetValue object ) {
            return createSetDataSetValueAdapter();
        }

        @Override
        public Adapter caseSettingControl( SettingControl object ) {
            return createSettingControlAdapter();
        }

        @Override
        public Adapter caseSettingGroups( SettingGroups object ) {
            return createSettingGroupsAdapter();
        }

        @Override
        public Adapter caseSmvOpts( SmvOpts object ) {
            return createSmvOptsAdapter();
        }

        @Override
        public Adapter caseSubject( Subject object ) {
            return createSubjectAdapter();
        }

        @Override
        public Adapter caseSupSubscription( SupSubscription object ) {
            return createSupSubscriptionAdapter();
        }

        @Override
        public Adapter caseTimeSyncProt( TimeSyncProt object ) {
            return createTimeSyncProtAdapter();
        }

        @Override
        public Adapter caseTimerActivatedControl( TimerActivatedControl object ) {
            return createTimerActivatedControlAdapter();
        }

        @Override
        public Adapter caseTrgOps( TrgOps object ) {
            return createTrgOpsAdapter();
        }

        @Override
        public Adapter caseValueHandling( ValueHandling object ) {
            return createValueHandlingAdapter();
        }

        @Override
        public Adapter caseAbstractConductingEquipment( AbstractConductingEquipment object ) {
            return createAbstractConductingEquipmentAdapter();
        }

        @Override
        public Adapter caseAbstractEqFuncSubFunc( AbstractEqFuncSubFunc object ) {
            return createAbstractEqFuncSubFuncAdapter();
        }

        @Override
        public Adapter caseBay( Bay object ) {
            return createBayAdapter();
        }

        @Override
        public Adapter caseConductingEquipment( ConductingEquipment object ) {
            return createConductingEquipmentAdapter();
        }

        @Override
        public Adapter caseConnectivityNode( ConnectivityNode object ) {
            return createConnectivityNodeAdapter();
        }

        @Override
        public Adapter caseEqFunction( EqFunction object ) {
            return createEqFunctionAdapter();
        }

        @Override
        public Adapter caseEqSubFunction( EqSubFunction object ) {
            return createEqSubFunctionAdapter();
        }

        @Override
        public Adapter caseEquipment( Equipment object ) {
            return createEquipmentAdapter();
        }

        @Override
        public Adapter caseEquipmentContainer( EquipmentContainer object ) {
            return createEquipmentContainerAdapter();
        }

        @Override
        public Adapter caseFunction( Function object ) {
            return createFunctionAdapter();
        }

        @Override
        public Adapter caseGeneralEquipment( GeneralEquipment object ) {
            return createGeneralEquipmentAdapter();
        }

        @Override
        public Adapter caseGeneralEquipmentContainer( GeneralEquipmentContainer object ) {
            return createGeneralEquipmentContainerAdapter();
        }

        @Override
        public Adapter caseLNode( LNode object ) {
            return createLNodeAdapter();
        }

        @Override
        public Adapter caseLNodeContainer( LNodeContainer object ) {
            return createLNodeContainerAdapter();
        }

        @Override
        public Adapter caseNeutralPoint( NeutralPoint object ) {
            return createNeutralPointAdapter();
        }

        @Override
        public Adapter casePowerSystemResource( PowerSystemResource object ) {
            return createPowerSystemResourceAdapter();
        }

        @Override
        public Adapter casePowerTransformer( PowerTransformer object ) {
            return createPowerTransformerAdapter();
        }

        @Override
        public Adapter caseSubEquipment( SubEquipment object ) {
            return createSubEquipmentAdapter();
        }

        @Override
        public Adapter caseSubFunction( SubFunction object ) {
            return createSubFunctionAdapter();
        }

        @Override
        public Adapter caseSubstation( Substation object ) {
            return createSubstationAdapter();
        }

        @Override
        public Adapter caseTapChanger( TapChanger object ) {
            return createTapChangerAdapter();
        }

        @Override
        public Adapter caseTerminal( Terminal object ) {
            return createTerminalAdapter();
        }

        @Override
        public Adapter caseTransformerWinding( TransformerWinding object ) {
            return createTransformerWindingAdapter();
        }

        @Override
        public Adapter caseVoltage( Voltage object ) {
            return createVoltageAdapter();
        }

        @Override
        public Adapter caseVoltageLevel( VoltageLevel object ) {
            return createVoltageLevelAdapter();
        }

        @Override
        public Adapter caseAbstractDataObject( AbstractDataObject object ) {
            return createAbstractDataObjectAdapter();
        }

        @Override
        public Adapter caseSclObject( SclObject object ) {
            return createSclObjectAdapter();
        }

        @Override
        public Adapter caseUnNaming( UnNaming object ) {
            return createUnNamingAdapter();
        }

        @Override
        public Adapter caseServiceYesNo( ServiceYesNo object ) {
            return createServiceYesNoAdapter();
        }

        @Override
        public Adapter caseServiceWithOptionalMax( ServiceWithOptionalMax object ) {
            return createServiceWithOptionalMaxAdapter();
        }

        @Override
        public Adapter caseServiceWithMaxNonZero( ServiceWithMaxNonZero object ) {
            return createServiceWithMaxNonZeroAdapter();
        }

        @Override
        public Adapter caseServiceConfReportControl( ServiceConfReportControl object ) {
            return createServiceConfReportControlAdapter();
        }

        @Override
        public Adapter caseServiceWithMaxAndMaxAttributes( ServiceWithMaxAndMaxAttributes object ) {
            return createServiceWithMaxAndMaxAttributesAdapter();
        }

        @Override
        public Adapter caseServiceWithMaxAndModify( ServiceWithMaxAndModify object ) {
            return createServiceWithMaxAndModifyAdapter();
        }

        @Override
        public Adapter caseServiceForConfDataSet( ServiceForConfDataSet object ) {
            return createServiceForConfDataSetAdapter();
        }

        @Override
        public Adapter caseCert( Cert object ) {
            return createCertAdapter();
        }

        @Override
        public Adapter caseValueWithUnit( ValueWithUnit object ) {
            return createValueWithUnitAdapter();
        }

        @Override
        public Adapter caseDurationInSec( DurationInSec object ) {
            return createDurationInSecAdapter();
        }

        @Override
        public Adapter caseDurationInMilliSec( DurationInMilliSec object ) {
            return createDurationInMilliSecAdapter();
        }

        @Override
        public Adapter caseBitRateInMbPerSec( BitRateInMbPerSec object ) {
            return createBitRateInMbPerSecAdapter();
        }

        @Override
        public Adapter caseMinTime( MinTime object ) {
            return createMinTimeAdapter();
        }

        @Override
        public Adapter caseMaxTime( MaxTime object ) {
            return createMaxTimeAdapter();
        }

        @Override
        public Adapter caseBitRate( BitRate object ) {
            return createBitRateAdapter();
        }

        @Override
        public Adapter caseSmpRate( SmpRate object ) {
            return createSmpRateAdapter();
        }

        @Override
        public Adapter caseSamplesPerSec( SamplesPerSec object ) {
            return createSamplesPerSecAdapter();
        }

        @Override
        public Adapter caseSecPerSamples( SecPerSamples object ) {
            return createSecPerSamplesAdapter();
        }

        @Override
        public Adapter caseMcSecurity( McSecurity object ) {
            return createMcSecurityAdapter();
        }

        @Override
        public Adapter caseAgAuthentication( AgAuthentication object ) {
            return createAgAuthenticationAdapter();
        }

        @Override
        public Adapter caseAgSmvOpts( AgSmvOpts object ) {
            return createAgSmvOptsAdapter();
        }

        @Override
        public Adapter caseAgOptFields( AgOptFields object ) {
            return createAgOptFieldsAdapter();
        }

        @Override
        public Adapter caseAgDesc( AgDesc object ) {
            return createAgDescAdapter();
        }

        @Override
        public Adapter caseAgLDRef( AgLDRef object ) {
            return createAgLDRefAdapter();
        }

        @Override
        public Adapter caseAgLNRef( AgLNRef object ) {
            return createAgLNRefAdapter();
        }

        @Override
        public Adapter caseAgDATrgOp( AgDATrgOp object ) {
            return createAgDATrgOpAdapter();
        }

        @Override
        public Adapter caseAgVirtual( AgVirtual object ) {
            return createAgVirtualAdapter();
        }

        @Override
        public Adapter caseAgUuid( AgUuid object ) {
            return createAgUuidAdapter();
        }

        @Override
        public Adapter caseIRiseClipseConsole( IRiseClipseConsole object ) {
            return createIRiseClipseConsoleAdapter();
        }

        @Override
        public Adapter caseINamespaceGetter( INamespaceGetter object ) {
            return createINamespaceGetterAdapter();
        }

        @Override
        public Adapter defaultCase( EObject object ) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter( Notifier target ) {
        return modelSwitch.doSwitch( ( EObject ) target );
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace <em>Any Content From Other Namespace</em>}'.
     * <!-- begin-user-doc --> This
     * default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace
     * @generated
     */
    public Adapter createAnyContentFromOtherNamespaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement
     * @generated
     */
    public Adapter createBaseElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header <em>Header</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header
     * @generated
     */
    public Adapter createHeaderAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History
     * <em>History</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.History
     * @generated
     */
    public Adapter createHistoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem <em>Hitem</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem
     * @generated
     */
    public Adapter createHitemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IDNaming
     * <em>ID Naming</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IDNaming
     * @generated
     */
    public Adapter createIDNamingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line <em>Line</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line
     * @generated
     */
    public Adapter createLineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming <em>Naming</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming
     * @generated
     */
    public Adapter createNamingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Private
     * <em>Private</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Private
     * @generated
     */
    public Adapter createPrivateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process
     * <em>Process</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process
     * @generated
     */
    public Adapter createProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL <em>SCL</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL
     * @generated
     */
    public Adapter createSCLAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text <em>Text</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Text
     * @generated
     */
    public Adapter createTextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address
     * <em>Address</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Address
     * @generated
     */
    public Adapter createAddressAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication <em>Communication</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication
     * @generated
     */
    public Adapter createCommunicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP <em>Connected AP</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP
     * @generated
     */
    public Adapter createConnectedAPAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock <em>Control Block</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock
     * @generated
     */
    public Adapter createControlBlockAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE <em>GSE</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE
     * @generated
     */
    public Adapter createGSEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P <em>P</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.P
     * @generated
     */
    public Adapter createPAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PAddr <em>PAddr</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PAddr
     * @generated
     */
    public Adapter createPAddrAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P_PhysConn <em>PPhys Conn</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.P_PhysConn
     * @generated
     */
    public Adapter createP_PhysConnAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn
     * <em>Phys Conn</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn
     * @generated
     */
    public Adapter createPhysConnAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV <em>SMV</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV
     * @generated
     */
    public Adapter createSMVAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork <em>Sub Network</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork
     * @generated
     */
    public Adapter createSubNetworkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute <em>Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute
     * @generated
     */
    public Adapter createAbstractDataAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA <em>BDA</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA
     * @generated
     */
    public Adapter createBDAAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA <em>DA</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DA
     * @generated
     */
    public Adapter createDAAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType
     * <em>DA Type</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType
     * @generated
     */
    public Adapter createDATypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO <em>DO</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DO
     * @generated
     */
    public Adapter createDOAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType
     * <em>DO Type</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType
     * @generated
     */
    public Adapter createDOTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates <em>Data Type Templates</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates
     * @generated
     */
    public Adapter createDataTypeTemplatesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType
     * <em>Enum Type</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType
     * @generated
     */
    public Adapter createEnumTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal
     * <em>Enum Val</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal
     * @generated
     */
    public Adapter createEnumValAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType <em>LNode Type</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType
     * @generated
     */
    public Adapter createLNodeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs
     * <em>Prot Ns</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs
     * @generated
     */
    public Adapter createProtNsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO <em>SDO</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO
     * @generated
     */
    public Adapter createSDOAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val <em>Val</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Val
     * @generated
     */
    public Adapter createValAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec <em>Bit Rate In Mb Per Sec</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec
     * @generated
     */
    public Adapter createBitRateInMbPerSecAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.MinTime <em>Min Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.MinTime
     * @generated
     */
    public Adapter createMinTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.MaxTime <em>Max Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.MaxTime
     * @generated
     */
    public Adapter createMaxTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate <em>Bit Rate</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate
     * @generated
     */
    public Adapter createBitRateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate <em>Smp Rate</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate
     * @generated
     */
    public Adapter createSmpRateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec <em>Samples Per Sec</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec
     * @generated
     */
    public Adapter createSamplesPerSecAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples <em>Sec Per Samples</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples
     * @generated
     */
    public Adapter createSecPerSamplesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity <em>Mc Security</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity
     * @generated
     */
    public Adapter createMcSecurityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication <em>Ag Authentication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication
     * @generated
     */
    public Adapter createAgAuthenticationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts <em>Ag Smv Opts</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts
     * @generated
     */
    public Adapter createAgSmvOptsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields <em>Ag Opt Fields</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields
     * @generated
     */
    public Adapter createAgOptFieldsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDesc <em>Ag Desc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDesc
     * @generated
     */
    public Adapter createAgDescAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef <em>Ag LD Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef
     * @generated
     */
    public Adapter createAgLDRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef <em>Ag LN Ref</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef
     * @generated
     */
    public Adapter createAgLNRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp <em>Ag DA Trg Op</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp
     * @generated
     */
    public Adapter createAgDATrgOpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual <em>Ag Virtual</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual
     * @generated
     */
    public Adapter createAgVirtualAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgUuid <em>Ag Uuid</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgUuid
     * @generated
     */
    public Adapter createAgUuidAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole <em>IRise Clipse Console</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole
     * @generated
     */
    public Adapter createIRiseClipseConsoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.INamespaceGetter <em>INamespace Getter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.INamespaceGetter
     * @generated
     */
    public Adapter createINamespaceGetterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec <em>Duration In Milli Sec</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec
     * @generated
     */
    public Adapter createDurationInMilliSecAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl <em>Access Control</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl
     * @generated
     */
    public Adapter createAccessControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint <em>Access Point</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint
     * @generated
     */
    public Adapter createAccessPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN <em>Any LN</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN
     * @generated
     */
    public Adapter createAnyLNAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association <em>Association</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Association
     * @generated
     */
    public Adapter createAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication <em>Authentication</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication
     * @generated
     */
    public Adapter createAuthenticationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate <em>Certificate</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate
     * @generated
     */
    public Adapter createCertificateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN
     * <em>Client LN</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN
     * @generated
     */
    public Adapter createClientLNAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices <em>Client Services</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices
     * @generated
     */
    public Adapter createClientServicesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt
     * <em>Comm Prot</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt
     * @generated
     */
    public Adapter createCommProtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfDataSet <em>Conf Data Set</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfDataSet
     * @generated
     */
    public Adapter createConfDataSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs
     * <em>Conf LNs</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs
     * @generated
     */
    public Adapter createConfLNsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLdName <em>Conf Ld Name</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLdName
     * @generated
     */
    public Adapter createConfLdNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLogControl <em>Conf Log Control</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLogControl
     * @generated
     */
    public Adapter createConfLogControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfReportControl <em>Conf Report Control</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfReportControl
     * @generated
     */
    public Adapter createConfReportControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG
     * <em>Conf SG</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG
     * @generated
     */
    public Adapter createConfSGAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSigRef <em>Conf Sig Ref</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSigRef
     * @generated
     */
    public Adapter createConfSigRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control
     * <em>Control</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Control
     * @generated
     */
    public Adapter createControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName <em>Control With IED Name</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName
     * @generated
     */
    public Adapter createControlWithIEDNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt <em>Control With Trigger Opt</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt
     * @generated
     */
    public Adapter createControlWithTriggerOptAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI <em>DAI</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI
     * @generated
     */
    public Adapter createDAIAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI <em>DOI</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI
     * @generated
     */
    public Adapter createDOIAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObjectDirectory <em>Data Object Directory</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObjectDirectory
     * @generated
     */
    public Adapter createDataObjectDirectoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet
     * <em>Data Set</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet
     * @generated
     */
    public Adapter createDataSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSetDirectory <em>Data Set Directory</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSetDirectory
     * @generated
     */
    public Adapter createDataSetDirectoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DynAssociation <em>Dyn Association</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DynAssociation
     * @generated
     */
    public Adapter createDynAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DynDataSet <em>Dyn Data Set</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DynDataSet
     * @generated
     */
    public Adapter createDynDataSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef
     * <em>Ext Ref</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef
     * @generated
     */
    public Adapter createExtRefAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA <em>FCDA</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA
     * @generated
     */
    public Adapter createFCDAAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling <em>File Handling</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling
     * @generated
     */
    public Adapter createFileHandlingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE <em>GOOSE</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE
     * @generated
     */
    public Adapter createGOOSEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity <em>GOOSE Security</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity
     * @generated
     */
    public Adapter createGOOSESecurityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl <em>GSE Control</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl
     * @generated
     */
    public Adapter createGSEControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEDir
     * <em>GSE Dir</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEDir
     * @generated
     */
    public Adapter createGSEDirAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings <em>GSE Settings</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings
     * @generated
     */
    public Adapter createGSESettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSSE <em>GSSE</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSSE
     * @generated
     */
    public Adapter createGSSEAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetCBValues <em>Get CB Values</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetCBValues
     * @generated
     */
    public Adapter createGetCBValuesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataObjectDefinition <em>Get Data Object Definition</em>}'.
     * <!-- begin-user-doc --> This
     * default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataObjectDefinition
     * @generated
     */
    public Adapter createGetDataObjectDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataSetValue <em>Get Data Set Value</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataSetValue
     * @generated
     */
    public Adapter createGetDataSetValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDirectory <em>Get Directory</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDirectory
     * @generated
     */
    public Adapter createGetDirectoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED <em>IED</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED
     * @generated
     */
    public Adapter createIEDAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName
     * <em>IED Name</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName
     * @generated
     */
    public Adapter createIEDNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs <em>Inputs</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs
     * @generated
     */
    public Adapter createInputsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IssuerName <em>Issuer Name</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IssuerName
     * @generated
     */
    public Adapter createIssuerNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC <em>KDC</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC
     * @generated
     */
    public Adapter createKDCAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice
     * <em>LDevice</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice
     * @generated
     */
    public Adapter createLDeviceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN <em>LN</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN
     * @generated
     */
    public Adapter createLNAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0 <em>LN0</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0
     * @generated
     */
    public Adapter createLN0Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Log <em>Log</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Log
     * @generated
     */
    public Adapter createLogAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl <em>Log Control</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl
     * @generated
     */
    public Adapter createLogControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings <em>Log Settings</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings
     * @generated
     */
    public Adapter createLogSettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields <em>Opt Fields</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields
     * @generated
     */
    public Adapter createOptFieldsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol
     * <em>Protocol</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol
     * @generated
     */
    public Adapter createProtocolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReadWrite <em>Read Write</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReadWrite
     * @generated
     */
    public Adapter createReadWriteAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt
     * <em>Red Prot</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt
     * @generated
     */
    public Adapter createRedProtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl <em>Report Control</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl
     * @generated
     */
    public Adapter createReportControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings <em>Report Settings</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings
     * @generated
     */
    public Adapter createReportSettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled <em>Rpt Enabled</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled
     * @generated
     */
    public Adapter createRptEnabledAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI <em>SDI</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI
     * @generated
     */
    public Adapter createSDIAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit
     * <em>SG Edit</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit
     * @generated
     */
    public Adapter createSGEditAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity <em>SMV Security</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity
     * @generated
     */
    public Adapter createSMVSecurityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings <em>SMV Settings</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings
     * @generated
     */
    public Adapter createSMVSettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc <em>SM Vsc</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc
     * @generated
     */
    public Adapter createSMVscAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl <em>Sampled Value Control</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl
     * @generated
     */
    public Adapter createSampledValueControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server <em>Server</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server
     * @generated
     */
    public Adapter createServerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt
     * <em>Server At</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt
     * @generated
     */
    public Adapter createServerAtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings <em>Service Settings</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings
     * @generated
     */
    public Adapter createServiceSettingsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMax <em>Service With Max</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMax
     * @generated
     */
    public Adapter createServiceWithMaxAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services
     * <em>Services</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services
     * @generated
     */
    public Adapter createServicesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SetDataSetValue <em>Set Data Set Value</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SetDataSetValue
     * @generated
     */
    public Adapter createSetDataSetValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl <em>Setting Control</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl
     * @generated
     */
    public Adapter createSettingControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups <em>Setting Groups</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups
     * @generated
     */
    public Adapter createSettingGroupsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts
     * <em>Smv Opts</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts
     * @generated
     */
    public Adapter createSmvOptsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Subject
     * <em>Subject</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Subject
     * @generated
     */
    public Adapter createSubjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription <em>Sup Subscription</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription
     * @generated
     */
    public Adapter createSupSubscriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt <em>Time Sync Prot</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt
     * @generated
     */
    public Adapter createTimeSyncProtAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimerActivatedControl <em>Timer Activated Control</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimerActivatedControl
     * @generated
     */
    public Adapter createTimerActivatedControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps
     * <em>Trg Ops</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps
     * @generated
     */
    public Adapter createTrgOpsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling <em>Value Handling</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling
     * @generated
     */
    public Adapter createValueHandlingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment <em>Abstract Conducting Equipment</em>}'.
     * <!-- begin-user-doc --> This
     * default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment
     * @generated
     */
    public Adapter createAbstractConductingEquipmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc <em>Abstract Eq Func Sub Func</em>}'.
     * <!-- begin-user-doc --> This
     * default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc
     * @generated
     */
    public Adapter createAbstractEqFuncSubFuncAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay <em>Bay</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay
     * @generated
     */
    public Adapter createBayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment
     * @generated
     */
    public Adapter createConductingEquipmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode <em>Connectivity Node</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode
     * @generated
     */
    public Adapter createConnectivityNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction
     * @generated
     */
    public Adapter createEqFunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction <em>Eq Sub Function</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction
     * @generated
     */
    public Adapter createEqSubFunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Equipment
     * <em>Equipment</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Equipment
     * @generated
     */
    public Adapter createEquipmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer <em>Equipment Container</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer
     * @generated
     */
    public Adapter createEquipmentContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function
     * <em>Function</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function
     * @generated
     */
    public Adapter createFunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment
     * @generated
     */
    public Adapter createGeneralEquipmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer <em>General Equipment Container</em>}'.
     * <!-- begin-user-doc --> This
     * default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer
     * @generated
     */
    public Adapter createGeneralEquipmentContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode <em>LNode</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that
     * we can easily ignore cases; it's useful to ignore a case when inheritance
     * will catch all the cases anyway. <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode
     * @generated
     */
    public Adapter createLNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer <em>LNode Container</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer
     * @generated
     */
    public Adapter createLNodeContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint <em>Neutral Point</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint
     * @generated
     */
    public Adapter createNeutralPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerSystemResource
     * @generated
     */
    public Adapter createPowerSystemResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer <em>Power Transformer</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer
     * @generated
     */
    public Adapter createPowerTransformerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment <em>Sub Equipment</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment
     * @generated
     */
    public Adapter createSubEquipmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction <em>Sub Function</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction
     * @generated
     */
    public Adapter createSubFunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation <em>Substation</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation
     * @generated
     */
    public Adapter createSubstationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger <em>Tap Changer</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger
     * @generated
     */
    public Adapter createTapChangerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal
     * <em>Terminal</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal
     * @generated
     */
    public Adapter createTerminalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding <em>Transformer Winding</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding
     * @generated
     */
    public Adapter createTransformerWindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage
     * <em>Voltage</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a
     * case when inheritance will catch all the cases anyway. <!-- end-user-doc
     * -->
     *
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage
     * @generated
     */
    public Adapter createVoltageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel <em>Voltage Level</em>}'.
     * <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's
     * useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel
     * @generated
     */
    public Adapter createVoltageLevelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject <em>Abstract Data Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject
     * @generated
     */
    public Adapter createAbstractDataObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject
     * @generated
     */
    public Adapter createSclObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.UnNaming <em>Un Naming</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.UnNaming
     * @generated
     */
    public Adapter createUnNamingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceYesNo <em>Service Yes No</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceYesNo
     * @generated
     */
    public Adapter createServiceYesNoAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithOptionalMax <em>Service With Optional Max</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithOptionalMax
     * @generated
     */
    public Adapter createServiceWithOptionalMaxAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxNonZero <em>Service With Max Non Zero</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxNonZero
     * @generated
     */
    public Adapter createServiceWithMaxNonZeroAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl <em>Service Conf Report Control</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl
     * @generated
     */
    public Adapter createServiceConfReportControlAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes <em>Service With Max And Max Attributes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes
     * @generated
     */
    public Adapter createServiceWithMaxAndMaxAttributesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify <em>Service With Max And Modify</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify
     * @generated
     */
    public Adapter createServiceWithMaxAndModifyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceForConfDataSet <em>Service For Conf Data Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceForConfDataSet
     * @generated
     */
    public Adapter createServiceForConfDataSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert <em>Cert</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert
     * @generated
     */
    public Adapter createCertAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit <em>Value With Unit</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit
     * @generated
     */
    public Adapter createValueWithUnitAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInSec <em>Duration In Sec</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInSec
     * @generated
     */
    public Adapter createDurationInSecAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc --> This
    * default implementation returns null. <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // SclAdapterFactory
