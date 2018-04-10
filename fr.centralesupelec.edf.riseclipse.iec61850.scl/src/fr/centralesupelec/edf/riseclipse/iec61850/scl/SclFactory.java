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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage
 * @generated
 */
public interface SclFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SclFactory eINSTANCE = fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Header</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Header</em>'.
     * @generated
     */
    Header createHeader();

    /**
     * Returns a new object of class '<em>History</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>History</em>'.
     * @generated
     */
    History createHistory();

    /**
     * Returns a new object of class '<em>Hitem</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Hitem</em>'.
     * @generated
     */
    Hitem createHitem();

    /**
     * Returns a new object of class '<em>ID Naming</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>ID Naming</em>'.
     * @generated
     */
    IDNaming createIDNaming();

    /**
     * Returns a new object of class '<em>Line</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Line</em>'.
     * @generated
     */
    Line createLine();

    /**
     * Returns a new object of class '<em>Private</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Private</em>'.
     * @generated
     */
    Private createPrivate();

    /**
     * Returns a new object of class '<em>Process</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Process</em>'.
     * @generated
     */
    Process createProcess();

    /**
     * Returns a new object of class '<em>SCL</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SCL</em>'.
     * @generated
     */
    SCL createSCL();

    /**
     * Returns a new object of class '<em>Text</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Text</em>'.
     * @generated
     */
    Text createText();

    /**
     * Returns a new object of class '<em>Address</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Address</em>'.
     * @generated
     */
    Address createAddress();

    /**
     * Returns a new object of class '<em>Communication</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Communication</em>'.
     * @generated
     */
    Communication createCommunication();

    /**
     * Returns a new object of class '<em>Connected AP</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connected AP</em>'.
     * @generated
     */
    ConnectedAP createConnectedAP();

    /**
     * Returns a new object of class '<em>GSE</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>GSE</em>'.
     * @generated
     */
    GSE createGSE();

    /**
     * Returns a new object of class '<em>P</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>P</em>'.
     * @generated
     */
    P createP();

    /**
     * Returns a new object of class '<em>PAddr</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PAddr</em>'.
     * @generated
     */
    PAddr createPAddr();

    /**
     * Returns a new object of class '<em>PPhys Conn</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>PPhys Conn</em>'.
     * @generated
     */
    P_PhysConn createP_PhysConn();

    /**
     * Returns a new object of class '<em>Phys Conn</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Phys Conn</em>'.
     * @generated
     */
    PhysConn createPhysConn();

    /**
     * Returns a new object of class '<em>SMV</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SMV</em>'.
     * @generated
     */
    SMV createSMV();

    /**
     * Returns a new object of class '<em>Sub Network</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Network</em>'.
     * @generated
     */
    SubNetwork createSubNetwork();

    /**
     * Returns a new object of class '<em>BDA</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>BDA</em>'.
     * @generated
     */
    BDA createBDA();

    /**
     * Returns a new object of class '<em>DA</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DA</em>'.
     * @generated
     */
    DA createDA();

    /**
     * Returns a new object of class '<em>DA Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DA Type</em>'.
     * @generated
     */
    DAType createDAType();

    /**
     * Returns a new object of class '<em>DO</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DO</em>'.
     * @generated
     */
    DO createDO();

    /**
     * Returns a new object of class '<em>DO Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DO Type</em>'.
     * @generated
     */
    DOType createDOType();

    /**
     * Returns a new object of class '<em>Data Type Templates</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Type Templates</em>'.
     * @generated
     */
    DataTypeTemplates createDataTypeTemplates();

    /**
     * Returns a new object of class '<em>Enum Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enum Type</em>'.
     * @generated
     */
    EnumType createEnumType();

    /**
     * Returns a new object of class '<em>Enum Val</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enum Val</em>'.
     * @generated
     */
    EnumVal createEnumVal();

    /**
     * Returns a new object of class '<em>LNode Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LNode Type</em>'.
     * @generated
     */
    LNodeType createLNodeType();

    /**
     * Returns a new object of class '<em>Prot Ns</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Prot Ns</em>'.
     * @generated
     */
    ProtNs createProtNs();

    /**
     * Returns a new object of class '<em>SDO</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SDO</em>'.
     * @generated
     */
    SDO createSDO();

    /**
     * Returns a new object of class '<em>Val</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Val</em>'.
     * @generated
     */
    Val createVal();

    /**
     * Returns a new object of class '<em>Bit Rate In Mb Per Sec</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bit Rate In Mb Per Sec</em>'.
     * @generated
     */
    BitRateInMbPerSec createBitRateInMbPerSec();

    /**
     * Returns a new object of class '<em>Min Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Min Time</em>'.
     * @generated
     */
    MinTime createMinTime();

    /**
     * Returns a new object of class '<em>Max Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Max Time</em>'.
     * @generated
     */
    MaxTime createMaxTime();

    /**
     * Returns a new object of class '<em>Bit Rate</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bit Rate</em>'.
     * @generated
     */
    BitRate createBitRate();

    /**
     * Returns a new object of class '<em>Smp Rate</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Smp Rate</em>'.
     * @generated
     */
    SmpRate createSmpRate();

    /**
     * Returns a new object of class '<em>Samples Per Sec</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Samples Per Sec</em>'.
     * @generated
     */
    SamplesPerSec createSamplesPerSec();

    /**
     * Returns a new object of class '<em>Sec Per Samples</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sec Per Samples</em>'.
     * @generated
     */
    SecPerSamples createSecPerSamples();

    /**
     * Returns a new object of class '<em>Duration In Milli Sec</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Duration In Milli Sec</em>'.
     * @generated
     */
    DurationInMilliSec createDurationInMilliSec();

    /**
     * Returns a new object of class '<em>Access Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Access Control</em>'.
     * @generated
     */
    AccessControl createAccessControl();

    /**
     * Returns a new object of class '<em>Access Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Access Point</em>'.
     * @generated
     */
    AccessPoint createAccessPoint();

    /**
     * Returns a new object of class '<em>Association</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Association</em>'.
     * @generated
     */
    Association createAssociation();

    /**
     * Returns a new object of class '<em>Authentication</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Authentication</em>'.
     * @generated
     */
    Authentication createAuthentication();

    /**
     * Returns a new object of class '<em>Certificate</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Certificate</em>'.
     * @generated
     */
    Certificate createCertificate();

    /**
     * Returns a new object of class '<em>Client LN</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Client LN</em>'.
     * @generated
     */
    ClientLN createClientLN();

    /**
     * Returns a new object of class '<em>Client Services</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Client Services</em>'.
     * @generated
     */
    ClientServices createClientServices();

    /**
     * Returns a new object of class '<em>Comm Prot</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Comm Prot</em>'.
     * @generated
     */
    CommProt createCommProt();

    /**
     * Returns a new object of class '<em>Conf Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conf Data Set</em>'.
     * @generated
     */
    ConfDataSet createConfDataSet();

    /**
     * Returns a new object of class '<em>Conf LNs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conf LNs</em>'.
     * @generated
     */
    ConfLNs createConfLNs();

    /**
     * Returns a new object of class '<em>Conf Ld Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conf Ld Name</em>'.
     * @generated
     */
    ConfLdName createConfLdName();

    /**
     * Returns a new object of class '<em>Conf Log Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conf Log Control</em>'.
     * @generated
     */
    ConfLogControl createConfLogControl();

    /**
     * Returns a new object of class '<em>Conf Report Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conf Report Control</em>'.
     * @generated
     */
    ConfReportControl createConfReportControl();

    /**
     * Returns a new object of class '<em>Conf SG</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conf SG</em>'.
     * @generated
     */
    ConfSG createConfSG();

    /**
     * Returns a new object of class '<em>Conf Sig Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conf Sig Ref</em>'.
     * @generated
     */
    ConfSigRef createConfSigRef();

    /**
     * Returns a new object of class '<em>Control With IED Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Control With IED Name</em>'.
     * @generated
     */
    ControlWithIEDName createControlWithIEDName();

    /**
     * Returns a new object of class '<em>DAI</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DAI</em>'.
     * @generated
     */
    DAI createDAI();

    /**
     * Returns a new object of class '<em>DOI</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>DOI</em>'.
     * @generated
     */
    DOI createDOI();

    /**
     * Returns a new object of class '<em>Data Object Directory</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Object Directory</em>'.
     * @generated
     */
    DataObjectDirectory createDataObjectDirectory();

    /**
     * Returns a new object of class '<em>Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Set</em>'.
     * @generated
     */
    DataSet createDataSet();

    /**
     * Returns a new object of class '<em>Data Set Directory</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Set Directory</em>'.
     * @generated
     */
    DataSetDirectory createDataSetDirectory();

    /**
     * Returns a new object of class '<em>Dyn Association</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dyn Association</em>'.
     * @generated
     */
    DynAssociation createDynAssociation();

    /**
     * Returns a new object of class '<em>Dyn Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dyn Data Set</em>'.
     * @generated
     */
    DynDataSet createDynDataSet();

    /**
     * Returns a new object of class '<em>Ext Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ext Ref</em>'.
     * @generated
     */
    ExtRef createExtRef();

    /**
     * Returns a new object of class '<em>FCDA</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>FCDA</em>'.
     * @generated
     */
    FCDA createFCDA();

    /**
     * Returns a new object of class '<em>File Handling</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Handling</em>'.
     * @generated
     */
    FileHandling createFileHandling();

    /**
     * Returns a new object of class '<em>GOOSE</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>GOOSE</em>'.
     * @generated
     */
    GOOSE createGOOSE();

    /**
     * Returns a new object of class '<em>GOOSE Security</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>GOOSE Security</em>'.
     * @generated
     */
    GOOSESecurity createGOOSESecurity();

    /**
     * Returns a new object of class '<em>GSE Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>GSE Control</em>'.
     * @generated
     */
    GSEControl createGSEControl();

    /**
     * Returns a new object of class '<em>GSE Dir</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>GSE Dir</em>'.
     * @generated
     */
    GSEDir createGSEDir();

    /**
     * Returns a new object of class '<em>GSE Settings</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>GSE Settings</em>'.
     * @generated
     */
    GSESettings createGSESettings();

    /**
     * Returns a new object of class '<em>GSSE</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>GSSE</em>'.
     * @generated
     */
    GSSE createGSSE();

    /**
     * Returns a new object of class '<em>Get CB Values</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Get CB Values</em>'.
     * @generated
     */
    GetCBValues createGetCBValues();

    /**
     * Returns a new object of class '<em>Get Data Object Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Get Data Object Definition</em>'.
     * @generated
     */
    GetDataObjectDefinition createGetDataObjectDefinition();

    /**
     * Returns a new object of class '<em>Get Data Set Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Get Data Set Value</em>'.
     * @generated
     */
    GetDataSetValue createGetDataSetValue();

    /**
     * Returns a new object of class '<em>Get Directory</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Get Directory</em>'.
     * @generated
     */
    GetDirectory createGetDirectory();

    /**
     * Returns a new object of class '<em>IED</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IED</em>'.
     * @generated
     */
    IED createIED();

    /**
     * Returns a new object of class '<em>IED Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>IED Name</em>'.
     * @generated
     */
    IEDName createIEDName();

    /**
     * Returns a new object of class '<em>Inputs</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Inputs</em>'.
     * @generated
     */
    Inputs createInputs();

    /**
     * Returns a new object of class '<em>Issuer Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Issuer Name</em>'.
     * @generated
     */
    IssuerName createIssuerName();

    /**
     * Returns a new object of class '<em>KDC</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>KDC</em>'.
     * @generated
     */
    KDC createKDC();

    /**
     * Returns a new object of class '<em>LDevice</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LDevice</em>'.
     * @generated
     */
    LDevice createLDevice();

    /**
     * Returns a new object of class '<em>LN</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LN</em>'.
     * @generated
     */
    LN createLN();

    /**
     * Returns a new object of class '<em>LN0</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LN0</em>'.
     * @generated
     */
    LN0 createLN0();

    /**
     * Returns a new object of class '<em>Log</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Log</em>'.
     * @generated
     */
    Log createLog();

    /**
     * Returns a new object of class '<em>Log Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Log Control</em>'.
     * @generated
     */
    LogControl createLogControl();

    /**
     * Returns a new object of class '<em>Log Settings</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Log Settings</em>'.
     * @generated
     */
    LogSettings createLogSettings();

    /**
     * Returns a new object of class '<em>Opt Fields</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Opt Fields</em>'.
     * @generated
     */
    OptFields createOptFields();

    /**
     * Returns a new object of class '<em>Protocol</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protocol</em>'.
     * @generated
     */
    Protocol createProtocol();

    /**
     * Returns a new object of class '<em>Read Write</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Write</em>'.
     * @generated
     */
    ReadWrite createReadWrite();

    /**
     * Returns a new object of class '<em>Red Prot</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Red Prot</em>'.
     * @generated
     */
    RedProt createRedProt();

    /**
     * Returns a new object of class '<em>Report Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Report Control</em>'.
     * @generated
     */
    ReportControl createReportControl();

    /**
     * Returns a new object of class '<em>Report Settings</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Report Settings</em>'.
     * @generated
     */
    ReportSettings createReportSettings();

    /**
     * Returns a new object of class '<em>Rpt Enabled</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Rpt Enabled</em>'.
     * @generated
     */
    RptEnabled createRptEnabled();

    /**
     * Returns a new object of class '<em>SDI</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SDI</em>'.
     * @generated
     */
    SDI createSDI();

    /**
     * Returns a new object of class '<em>SG Edit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SG Edit</em>'.
     * @generated
     */
    SGEdit createSGEdit();

    /**
     * Returns a new object of class '<em>SMV Security</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SMV Security</em>'.
     * @generated
     */
    SMVSecurity createSMVSecurity();

    /**
     * Returns a new object of class '<em>SMV Settings</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SMV Settings</em>'.
     * @generated
     */
    SMVSettings createSMVSettings();

    /**
     * Returns a new object of class '<em>SM Vsc</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SM Vsc</em>'.
     * @generated
     */
    SMVsc createSMVsc();

    /**
     * Returns a new object of class '<em>Sampled Value Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sampled Value Control</em>'.
     * @generated
     */
    SampledValueControl createSampledValueControl();

    /**
     * Returns a new object of class '<em>Server</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Server</em>'.
     * @generated
     */
    Server createServer();

    /**
     * Returns a new object of class '<em>Server At</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Server At</em>'.
     * @generated
     */
    ServerAt createServerAt();

    /**
     * Returns a new object of class '<em>Service Settings</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Settings</em>'.
     * @generated
     */
    ServiceSettings createServiceSettings();

    /**
     * Returns a new object of class '<em>Service With Max</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service With Max</em>'.
     * @generated
     */
    ServiceWithMax createServiceWithMax();

    /**
     * Returns a new object of class '<em>Services</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Services</em>'.
     * @generated
     */
    Services createServices();

    /**
     * Returns a new object of class '<em>Set Data Set Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Set Data Set Value</em>'.
     * @generated
     */
    SetDataSetValue createSetDataSetValue();

    /**
     * Returns a new object of class '<em>Setting Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Setting Control</em>'.
     * @generated
     */
    SettingControl createSettingControl();

    /**
     * Returns a new object of class '<em>Setting Groups</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Setting Groups</em>'.
     * @generated
     */
    SettingGroups createSettingGroups();

    /**
     * Returns a new object of class '<em>Smv Opts</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Smv Opts</em>'.
     * @generated
     */
    SmvOpts createSmvOpts();

    /**
     * Returns a new object of class '<em>Subject</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Subject</em>'.
     * @generated
     */
    Subject createSubject();

    /**
     * Returns a new object of class '<em>Sup Subscription</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sup Subscription</em>'.
     * @generated
     */
    SupSubscription createSupSubscription();

    /**
     * Returns a new object of class '<em>Time Sync Prot</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Sync Prot</em>'.
     * @generated
     */
    TimeSyncProt createTimeSyncProt();

    /**
     * Returns a new object of class '<em>Timer Activated Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Timer Activated Control</em>'.
     * @generated
     */
    TimerActivatedControl createTimerActivatedControl();

    /**
     * Returns a new object of class '<em>Trg Ops</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trg Ops</em>'.
     * @generated
     */
    TrgOps createTrgOps();

    /**
     * Returns a new object of class '<em>Value Handling</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Handling</em>'.
     * @generated
     */
    ValueHandling createValueHandling();

    /**
     * Returns a new object of class '<em>Abstract Conducting Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abstract Conducting Equipment</em>'.
     * @generated
     */
    AbstractConductingEquipment createAbstractConductingEquipment();

    /**
     * Returns a new object of class '<em>Abstract Eq Func Sub Func</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abstract Eq Func Sub Func</em>'.
     * @generated
     */
    AbstractEqFuncSubFunc createAbstractEqFuncSubFunc();

    /**
     * Returns a new object of class '<em>Bay</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bay</em>'.
     * @generated
     */
    Bay createBay();

    /**
     * Returns a new object of class '<em>Conducting Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conducting Equipment</em>'.
     * @generated
     */
    ConductingEquipment createConductingEquipment();

    /**
     * Returns a new object of class '<em>Connectivity Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connectivity Node</em>'.
     * @generated
     */
    ConnectivityNode createConnectivityNode();

    /**
     * Returns a new object of class '<em>Eq Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Eq Function</em>'.
     * @generated
     */
    EqFunction createEqFunction();

    /**
     * Returns a new object of class '<em>Eq Sub Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Eq Sub Function</em>'.
     * @generated
     */
    EqSubFunction createEqSubFunction();

    /**
     * Returns a new object of class '<em>Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equipment</em>'.
     * @generated
     */
    Equipment createEquipment();

    /**
     * Returns a new object of class '<em>Equipment Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Equipment Container</em>'.
     * @generated
     */
    EquipmentContainer createEquipmentContainer();

    /**
     * Returns a new object of class '<em>Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function</em>'.
     * @generated
     */
    Function createFunction();

    /**
     * Returns a new object of class '<em>General Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>General Equipment</em>'.
     * @generated
     */
    GeneralEquipment createGeneralEquipment();

    /**
     * Returns a new object of class '<em>General Equipment Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>General Equipment Container</em>'.
     * @generated
     */
    GeneralEquipmentContainer createGeneralEquipmentContainer();

    /**
     * Returns a new object of class '<em>LNode</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LNode</em>'.
     * @generated
     */
    LNode createLNode();

    /**
     * Returns a new object of class '<em>LNode Container</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>LNode Container</em>'.
     * @generated
     */
    LNodeContainer createLNodeContainer();

    /**
     * Returns a new object of class '<em>Neutral Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Neutral Point</em>'.
     * @generated
     */
    NeutralPoint createNeutralPoint();

    /**
     * Returns a new object of class '<em>Power System Resource</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power System Resource</em>'.
     * @generated
     */
    PowerSystemResource createPowerSystemResource();

    /**
     * Returns a new object of class '<em>Power Transformer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Power Transformer</em>'.
     * @generated
     */
    PowerTransformer createPowerTransformer();

    /**
     * Returns a new object of class '<em>Sub Equipment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Equipment</em>'.
     * @generated
     */
    SubEquipment createSubEquipment();

    /**
     * Returns a new object of class '<em>Sub Function</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Function</em>'.
     * @generated
     */
    SubFunction createSubFunction();

    /**
     * Returns a new object of class '<em>Substation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Substation</em>'.
     * @generated
     */
    Substation createSubstation();

    /**
     * Returns a new object of class '<em>Tap Changer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tap Changer</em>'.
     * @generated
     */
    TapChanger createTapChanger();

    /**
     * Returns a new object of class '<em>Terminal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Terminal</em>'.
     * @generated
     */
    Terminal createTerminal();

    /**
     * Returns a new object of class '<em>Transformer Winding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transformer Winding</em>'.
     * @generated
     */
    TransformerWinding createTransformerWinding();

    /**
     * Returns a new object of class '<em>Voltage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage</em>'.
     * @generated
     */
    Voltage createVoltage();

    /**
     * Returns a new object of class '<em>Voltage Level</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Voltage Level</em>'.
     * @generated
     */
    VoltageLevel createVoltageLevel();

    /**
     * Returns a new object of class '<em>Service Yes No</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Yes No</em>'.
     * @generated
     */
    ServiceYesNo createServiceYesNo();

    /**
     * Returns a new object of class '<em>Service With Optional Max</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service With Optional Max</em>'.
     * @generated
     */
    ServiceWithOptionalMax createServiceWithOptionalMax();

    /**
     * Returns a new object of class '<em>Service With Max Non Zero</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service With Max Non Zero</em>'.
     * @generated
     */
    ServiceWithMaxNonZero createServiceWithMaxNonZero();

    /**
     * Returns a new object of class '<em>Service Conf Report Control</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Conf Report Control</em>'.
     * @generated
     */
    ServiceConfReportControl createServiceConfReportControl();

    /**
     * Returns a new object of class '<em>Service With Max And Max Attributes</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service With Max And Max Attributes</em>'.
     * @generated
     */
    ServiceWithMaxAndMaxAttributes createServiceWithMaxAndMaxAttributes();

    /**
     * Returns a new object of class '<em>Service With Max And Modify</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service With Max And Modify</em>'.
     * @generated
     */
    ServiceWithMaxAndModify createServiceWithMaxAndModify();

    /**
     * Returns a new object of class '<em>Service For Conf Data Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service For Conf Data Set</em>'.
     * @generated
     */
    ServiceForConfDataSet createServiceForConfDataSet();

    /**
     * Returns a new object of class '<em>Cert</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cert</em>'.
     * @generated
     */
    Cert createCert();

    /**
     * Returns a new object of class '<em>Value With Unit</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value With Unit</em>'.
     * @generated
     */
    ValueWithUnit createValueWithUnit();

    /**
     * Returns a new object of class '<em>Duration In Sec</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Duration In Sec</em>'.
     * @generated
     */
    DurationInSec createDurationInSec();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    SclPackage getSclPackage();

} //SclFactory
