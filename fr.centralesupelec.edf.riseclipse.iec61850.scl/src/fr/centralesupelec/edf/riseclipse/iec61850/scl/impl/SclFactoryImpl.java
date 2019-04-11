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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Address;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Association;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AssociationKindEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfDataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLdName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLogControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfReportControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSigRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObjectDirectory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSetDirectory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInSec;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DynAssociation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DynDataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Equipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Function;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEDir;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GetCBValues;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataObjectDefinition;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataSetValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDirectory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Header;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.History;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IDNaming;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IssuerName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Line;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Log;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.MaxTime;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.MinTime;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.P;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PAddr;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.P_PhysConn;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PhaseEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Private;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ReadWrite;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVDeliveryEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Server;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceForConfDataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMax;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxNonZero;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithOptionalMax;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceYesNo;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SetDataSetValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Subject;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Text;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TimerActivatedControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.bufModeEnum;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SclFactoryImpl extends EFactoryImpl implements SclFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SclFactory init() {
        try {
            SclFactory theSclFactory = (SclFactory)EPackage.Registry.INSTANCE.getEFactory(SclPackage.eNS_URI);
            if (theSclFactory != null) {
                return theSclFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SclFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SclFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create( EClass eClass ) {
        switch (eClass.getClassifierID()) {
            case SclPackage.HEADER: return createHeader();
            case SclPackage.HISTORY: return createHistory();
            case SclPackage.HITEM: return createHitem();
            case SclPackage.ID_NAMING: return createIDNaming();
            case SclPackage.LINE: return createLine();
            case SclPackage.PRIVATE: return createPrivate();
            case SclPackage.PROCESS: return createProcess();
            case SclPackage.SCL: return createSCL();
            case SclPackage.TEXT: return createText();
            case SclPackage.ADDRESS: return createAddress();
            case SclPackage.COMMUNICATION: return createCommunication();
            case SclPackage.CONNECTED_AP: return createConnectedAP();
            case SclPackage.GSE: return createGSE();
            case SclPackage.P: return createP();
            case SclPackage.PADDR: return createPAddr();
            case SclPackage.PPHYS_CONN: return createP_PhysConn();
            case SclPackage.PHYS_CONN: return createPhysConn();
            case SclPackage.SMV: return createSMV();
            case SclPackage.SUB_NETWORK: return createSubNetwork();
            case SclPackage.BDA: return createBDA();
            case SclPackage.DA: return createDA();
            case SclPackage.DA_TYPE: return createDAType();
            case SclPackage.DO: return createDO();
            case SclPackage.DO_TYPE: return createDOType();
            case SclPackage.DATA_TYPE_TEMPLATES: return createDataTypeTemplates();
            case SclPackage.ENUM_TYPE: return createEnumType();
            case SclPackage.ENUM_VAL: return createEnumVal();
            case SclPackage.LNODE_TYPE: return createLNodeType();
            case SclPackage.PROT_NS: return createProtNs();
            case SclPackage.SDO: return createSDO();
            case SclPackage.VAL: return createVal();
            case SclPackage.ACCESS_CONTROL: return createAccessControl();
            case SclPackage.ACCESS_POINT: return createAccessPoint();
            case SclPackage.ASSOCIATION: return createAssociation();
            case SclPackage.AUTHENTICATION: return createAuthentication();
            case SclPackage.CERTIFICATE: return createCertificate();
            case SclPackage.CLIENT_LN: return createClientLN();
            case SclPackage.CLIENT_SERVICES: return createClientServices();
            case SclPackage.COMM_PROT: return createCommProt();
            case SclPackage.CONF_DATA_SET: return createConfDataSet();
            case SclPackage.CONF_LNS: return createConfLNs();
            case SclPackage.CONF_LD_NAME: return createConfLdName();
            case SclPackage.CONF_LOG_CONTROL: return createConfLogControl();
            case SclPackage.CONF_REPORT_CONTROL: return createConfReportControl();
            case SclPackage.CONF_SG: return createConfSG();
            case SclPackage.CONF_SIG_REF: return createConfSigRef();
            case SclPackage.CONTROL_WITH_IED_NAME: return createControlWithIEDName();
            case SclPackage.DAI: return createDAI();
            case SclPackage.DOI: return createDOI();
            case SclPackage.DATA_OBJECT_DIRECTORY: return createDataObjectDirectory();
            case SclPackage.DATA_SET: return createDataSet();
            case SclPackage.DATA_SET_DIRECTORY: return createDataSetDirectory();
            case SclPackage.DYN_ASSOCIATION: return createDynAssociation();
            case SclPackage.DYN_DATA_SET: return createDynDataSet();
            case SclPackage.EXT_REF: return createExtRef();
            case SclPackage.FCDA: return createFCDA();
            case SclPackage.FILE_HANDLING: return createFileHandling();
            case SclPackage.GOOSE: return createGOOSE();
            case SclPackage.GOOSE_SECURITY: return createGOOSESecurity();
            case SclPackage.GSE_CONTROL: return createGSEControl();
            case SclPackage.GSE_DIR: return createGSEDir();
            case SclPackage.GSE_SETTINGS: return createGSESettings();
            case SclPackage.GSSE: return createGSSE();
            case SclPackage.GET_CB_VALUES: return createGetCBValues();
            case SclPackage.GET_DATA_OBJECT_DEFINITION: return createGetDataObjectDefinition();
            case SclPackage.GET_DATA_SET_VALUE: return createGetDataSetValue();
            case SclPackage.GET_DIRECTORY: return createGetDirectory();
            case SclPackage.IED: return createIED();
            case SclPackage.IED_NAME: return createIEDName();
            case SclPackage.INPUTS: return createInputs();
            case SclPackage.ISSUER_NAME: return createIssuerName();
            case SclPackage.KDC: return createKDC();
            case SclPackage.LDEVICE: return createLDevice();
            case SclPackage.LN: return createLN();
            case SclPackage.LN0: return createLN0();
            case SclPackage.LOG: return createLog();
            case SclPackage.LOG_CONTROL: return createLogControl();
            case SclPackage.LOG_SETTINGS: return createLogSettings();
            case SclPackage.OPT_FIELDS: return createOptFields();
            case SclPackage.PROTOCOL: return createProtocol();
            case SclPackage.READ_WRITE: return createReadWrite();
            case SclPackage.RED_PROT: return createRedProt();
            case SclPackage.REPORT_CONTROL: return createReportControl();
            case SclPackage.REPORT_SETTINGS: return createReportSettings();
            case SclPackage.RPT_ENABLED: return createRptEnabled();
            case SclPackage.SDI: return createSDI();
            case SclPackage.SG_EDIT: return createSGEdit();
            case SclPackage.SMV_SECURITY: return createSMVSecurity();
            case SclPackage.SMV_SETTINGS: return createSMVSettings();
            case SclPackage.SM_VSC: return createSMVsc();
            case SclPackage.SAMPLED_VALUE_CONTROL: return createSampledValueControl();
            case SclPackage.SERVER: return createServer();
            case SclPackage.SERVER_AT: return createServerAt();
            case SclPackage.SERVICE_SETTINGS: return createServiceSettings();
            case SclPackage.SERVICE_WITH_MAX: return createServiceWithMax();
            case SclPackage.SERVICES: return createServices();
            case SclPackage.SET_DATA_SET_VALUE: return createSetDataSetValue();
            case SclPackage.SETTING_CONTROL: return createSettingControl();
            case SclPackage.SETTING_GROUPS: return createSettingGroups();
            case SclPackage.SMV_OPTS: return createSmvOpts();
            case SclPackage.SUBJECT: return createSubject();
            case SclPackage.SUP_SUBSCRIPTION: return createSupSubscription();
            case SclPackage.TIME_SYNC_PROT: return createTimeSyncProt();
            case SclPackage.TIMER_ACTIVATED_CONTROL: return createTimerActivatedControl();
            case SclPackage.TRG_OPS: return createTrgOps();
            case SclPackage.VALUE_HANDLING: return createValueHandling();
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT: return createAbstractConductingEquipment();
            case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC: return createAbstractEqFuncSubFunc();
            case SclPackage.BAY: return createBay();
            case SclPackage.CONDUCTING_EQUIPMENT: return createConductingEquipment();
            case SclPackage.CONNECTIVITY_NODE: return createConnectivityNode();
            case SclPackage.EQ_FUNCTION: return createEqFunction();
            case SclPackage.EQ_SUB_FUNCTION: return createEqSubFunction();
            case SclPackage.EQUIPMENT: return createEquipment();
            case SclPackage.EQUIPMENT_CONTAINER: return createEquipmentContainer();
            case SclPackage.FUNCTION: return createFunction();
            case SclPackage.GENERAL_EQUIPMENT: return createGeneralEquipment();
            case SclPackage.GENERAL_EQUIPMENT_CONTAINER: return createGeneralEquipmentContainer();
            case SclPackage.LNODE: return createLNode();
            case SclPackage.LNODE_CONTAINER: return createLNodeContainer();
            case SclPackage.NEUTRAL_POINT: return createNeutralPoint();
            case SclPackage.POWER_SYSTEM_RESOURCE: return createPowerSystemResource();
            case SclPackage.POWER_TRANSFORMER: return createPowerTransformer();
            case SclPackage.SUB_EQUIPMENT: return createSubEquipment();
            case SclPackage.SUB_FUNCTION: return createSubFunction();
            case SclPackage.SUBSTATION: return createSubstation();
            case SclPackage.TAP_CHANGER: return createTapChanger();
            case SclPackage.TERMINAL: return createTerminal();
            case SclPackage.TRANSFORMER_WINDING: return createTransformerWinding();
            case SclPackage.VOLTAGE: return createVoltage();
            case SclPackage.VOLTAGE_LEVEL: return createVoltageLevel();
            case SclPackage.SERVICE_YES_NO: return createServiceYesNo();
            case SclPackage.SERVICE_WITH_OPTIONAL_MAX: return createServiceWithOptionalMax();
            case SclPackage.SERVICE_WITH_MAX_NON_ZERO: return createServiceWithMaxNonZero();
            case SclPackage.SERVICE_CONF_REPORT_CONTROL: return createServiceConfReportControl();
            case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES: return createServiceWithMaxAndMaxAttributes();
            case SclPackage.SERVICE_WITH_MAX_AND_MODIFY: return createServiceWithMaxAndModify();
            case SclPackage.SERVICE_FOR_CONF_DATA_SET: return createServiceForConfDataSet();
            case SclPackage.CERT: return createCert();
            case SclPackage.VALUE_WITH_UNIT: return createValueWithUnit();
            case SclPackage.DURATION_IN_SEC: return createDurationInSec();
            case SclPackage.DURATION_IN_MILLI_SEC: return createDurationInMilliSec();
            case SclPackage.BIT_RATE_IN_MB_PER_SEC: return createBitRateInMbPerSec();
            case SclPackage.MIN_TIME: return createMinTime();
            case SclPackage.MAX_TIME: return createMaxTime();
            case SclPackage.BIT_RATE: return createBitRate();
            case SclPackage.SMP_RATE: return createSmpRate();
            case SclPackage.SAMPLES_PER_SEC: return createSamplesPerSec();
            case SclPackage.SEC_PER_SAMPLES: return createSecPerSamples();
            case SclPackage.MC_SECURITY: return createMcSecurity();
            case SclPackage.AG_AUTHENTICATION: return createAgAuthentication();
            case SclPackage.AG_LN_REF: return createAgLNRef();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString( EDataType eDataType, String initialValue ) {
        switch (eDataType.getClassifierID()) {
            case SclPackage.ASSOCIATION_KIND_ENUM:
                return createAssociationKindEnumFromString(eDataType, initialValue);
            case SclPackage.FC_ENUM:
                return createFCEnumFromString(eDataType, initialValue);
            case SclPackage.GSE_CONTROL_TYPE_ENUM:
                return createGSEControlTypeEnumFromString(eDataType, initialValue);
            case SclPackage.PHASE_ENUM:
                return createPhaseEnumFromString(eDataType, initialValue);
            case SclPackage.PREDEFINED_TYPE_OF_SECURITY_ENUM:
                return createPredefinedTypeOfSecurityEnumFromString(eDataType, initialValue);
            case SclPackage.SMV_DELIVERY_ENUM:
                return createSMVDeliveryEnumFromString(eDataType, initialValue);
            case SclPackage.SERVICE_SETTINGS_ENUM:
                return createServiceSettingsEnumFromString(eDataType, initialValue);
            case SclPackage.SERVICE_SETTINGS_NO_DYN_ENUM:
                return createServiceSettingsNoDynEnumFromString(eDataType, initialValue);
            case SclPackage.SERVICE_TYPE:
                return createServiceTypeFromString(eDataType, initialValue);
            case SclPackage.SMP_MOD:
                return createSmpModFromString(eDataType, initialValue);
            case SclPackage.UNIT_MULTIPLIER_ENUM:
                return createUnitMultiplierEnumFromString(eDataType, initialValue);
            case SclPackage.VAL_KIND_ENUM:
                return createValKindEnumFromString(eDataType, initialValue);
            case SclPackage.BUF_MODE_ENUM:
                return createbufModeEnumFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString( EDataType eDataType, Object instanceValue ) {
        switch (eDataType.getClassifierID()) {
            case SclPackage.ASSOCIATION_KIND_ENUM:
                return convertAssociationKindEnumToString(eDataType, instanceValue);
            case SclPackage.FC_ENUM:
                return convertFCEnumToString(eDataType, instanceValue);
            case SclPackage.GSE_CONTROL_TYPE_ENUM:
                return convertGSEControlTypeEnumToString(eDataType, instanceValue);
            case SclPackage.PHASE_ENUM:
                return convertPhaseEnumToString(eDataType, instanceValue);
            case SclPackage.PREDEFINED_TYPE_OF_SECURITY_ENUM:
                return convertPredefinedTypeOfSecurityEnumToString(eDataType, instanceValue);
            case SclPackage.SMV_DELIVERY_ENUM:
                return convertSMVDeliveryEnumToString(eDataType, instanceValue);
            case SclPackage.SERVICE_SETTINGS_ENUM:
                return convertServiceSettingsEnumToString(eDataType, instanceValue);
            case SclPackage.SERVICE_SETTINGS_NO_DYN_ENUM:
                return convertServiceSettingsNoDynEnumToString(eDataType, instanceValue);
            case SclPackage.SERVICE_TYPE:
                return convertServiceTypeToString(eDataType, instanceValue);
            case SclPackage.SMP_MOD:
                return convertSmpModToString(eDataType, instanceValue);
            case SclPackage.UNIT_MULTIPLIER_ENUM:
                return convertUnitMultiplierEnumToString(eDataType, instanceValue);
            case SclPackage.VAL_KIND_ENUM:
                return convertValKindEnumToString(eDataType, instanceValue);
            case SclPackage.BUF_MODE_ENUM:
                return convertbufModeEnumToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Header createHeader() {
        HeaderImpl header = new HeaderImpl();
        return header;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public History createHistory() {
        HistoryImpl history = new HistoryImpl();
        return history;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Hitem createHitem() {
        HitemImpl hitem = new HitemImpl();
        return hitem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IDNaming createIDNaming() {
        IDNamingImpl idNaming = new IDNamingImpl();
        return idNaming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Line createLine() {
        LineImpl line = new LineImpl();
        return line;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Private createPrivate() {
        PrivateImpl private_ = new PrivateImpl();
        return private_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public fr.centralesupelec.edf.riseclipse.iec61850.scl.Process createProcess() {
        ProcessImpl process = new ProcessImpl();
        return process;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SCL createSCL() {
        SCLImpl scl = new SCLImpl();
        return scl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Text createText() {
        TextImpl text = new TextImpl();
        return text;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Address createAddress() {
        AddressImpl address = new AddressImpl();
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Communication createCommunication() {
        CommunicationImpl communication = new CommunicationImpl();
        return communication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectedAP createConnectedAP() {
        ConnectedAPImpl connectedAP = new ConnectedAPImpl();
        return connectedAP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GSE createGSE() {
        GSEImpl gse = new GSEImpl();
        return gse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public P createP() {
        PImpl p = new PImpl();
        return p;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PAddr createPAddr() {
        PAddrImpl pAddr = new PAddrImpl();
        return pAddr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public P_PhysConn createP_PhysConn() {
        P_PhysConnImpl p_PhysConn = new P_PhysConnImpl();
        return p_PhysConn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhysConn createPhysConn() {
        PhysConnImpl physConn = new PhysConnImpl();
        return physConn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMV createSMV() {
        SMVImpl smv = new SMVImpl();
        return smv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubNetwork createSubNetwork() {
        SubNetworkImpl subNetwork = new SubNetworkImpl();
        return subNetwork;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BDA createBDA() {
        BDAImpl bda = new BDAImpl();
        return bda;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DA createDA() {
        DAImpl da = new DAImpl();
        return da;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAType createDAType() {
        DATypeImpl daType = new DATypeImpl();
        return daType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DO createDO() {
        DOImpl do_ = new DOImpl();
        return do_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOType createDOType() {
        DOTypeImpl doType = new DOTypeImpl();
        return doType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataTypeTemplates createDataTypeTemplates() {
        DataTypeTemplatesImpl dataTypeTemplates = new DataTypeTemplatesImpl();
        return dataTypeTemplates;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnumType createEnumType() {
        EnumTypeImpl enumType = new EnumTypeImpl();
        return enumType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnumVal createEnumVal() {
        EnumValImpl enumVal = new EnumValImpl();
        return enumVal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeType createLNodeType() {
        LNodeTypeImpl lNodeType = new LNodeTypeImpl();
        return lNodeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProtNs createProtNs() {
        ProtNsImpl protNs = new ProtNsImpl();
        return protNs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SDO createSDO() {
        SDOImpl sdo = new SDOImpl();
        return sdo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Val createVal() {
        ValImpl val = new ValImpl();
        return val;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BitRateInMbPerSec createBitRateInMbPerSec() {
        BitRateInMbPerSecImpl bitRateInMbPerSec = new BitRateInMbPerSecImpl();
        return bitRateInMbPerSec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MinTime createMinTime() {
        MinTimeImpl minTime = new MinTimeImpl();
        return minTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MaxTime createMaxTime() {
        MaxTimeImpl maxTime = new MaxTimeImpl();
        return maxTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BitRate createBitRate() {
        BitRateImpl bitRate = new BitRateImpl();
        return bitRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SmpRate createSmpRate() {
        SmpRateImpl smpRate = new SmpRateImpl();
        return smpRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SamplesPerSec createSamplesPerSec() {
        SamplesPerSecImpl samplesPerSec = new SamplesPerSecImpl();
        return samplesPerSec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SecPerSamples createSecPerSamples() {
        SecPerSamplesImpl secPerSamples = new SecPerSamplesImpl();
        return secPerSamples;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public McSecurity createMcSecurity() {
        McSecurityImpl mcSecurity = new McSecurityImpl();
        return mcSecurity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AgAuthentication createAgAuthentication() {
        AgAuthenticationImpl agAuthentication = new AgAuthenticationImpl();
        return agAuthentication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AgLNRef createAgLNRef() {
        AgLNRefImpl agLNRef = new AgLNRefImpl();
        return agLNRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DurationInMilliSec createDurationInMilliSec() {
        DurationInMilliSecImpl durationInMilliSec = new DurationInMilliSecImpl();
        return durationInMilliSec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessControl createAccessControl() {
        AccessControlImpl accessControl = new AccessControlImpl();
        return accessControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessPoint createAccessPoint() {
        AccessPointImpl accessPoint = new AccessPointImpl();
        return accessPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Association createAssociation() {
        AssociationImpl association = new AssociationImpl();
        return association;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Authentication createAuthentication() {
        AuthenticationImpl authentication = new AuthenticationImpl();
        return authentication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Certificate createCertificate() {
        CertificateImpl certificate = new CertificateImpl();
        return certificate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClientLN createClientLN() {
        ClientLNImpl clientLN = new ClientLNImpl();
        return clientLN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ClientServices createClientServices() {
        ClientServicesImpl clientServices = new ClientServicesImpl();
        return clientServices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CommProt createCommProt() {
        CommProtImpl commProt = new CommProtImpl();
        return commProt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConfDataSet createConfDataSet() {
        ConfDataSetImpl confDataSet = new ConfDataSetImpl();
        return confDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConfLNs createConfLNs() {
        ConfLNsImpl confLNs = new ConfLNsImpl();
        return confLNs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConfLdName createConfLdName() {
        ConfLdNameImpl confLdName = new ConfLdNameImpl();
        return confLdName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConfLogControl createConfLogControl() {
        ConfLogControlImpl confLogControl = new ConfLogControlImpl();
        return confLogControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConfReportControl createConfReportControl() {
        ConfReportControlImpl confReportControl = new ConfReportControlImpl();
        return confReportControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConfSG createConfSG() {
        ConfSGImpl confSG = new ConfSGImpl();
        return confSG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConfSigRef createConfSigRef() {
        ConfSigRefImpl confSigRef = new ConfSigRefImpl();
        return confSigRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlWithIEDName createControlWithIEDName() {
        ControlWithIEDNameImpl controlWithIEDName = new ControlWithIEDNameImpl();
        return controlWithIEDName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAI createDAI() {
        DAIImpl dai = new DAIImpl();
        return dai;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOI createDOI() {
        DOIImpl doi = new DOIImpl();
        return doi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataObjectDirectory createDataObjectDirectory() {
        DataObjectDirectoryImpl dataObjectDirectory = new DataObjectDirectoryImpl();
        return dataObjectDirectory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataSet createDataSet() {
        DataSetImpl dataSet = new DataSetImpl();
        return dataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataSetDirectory createDataSetDirectory() {
        DataSetDirectoryImpl dataSetDirectory = new DataSetDirectoryImpl();
        return dataSetDirectory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DynAssociation createDynAssociation() {
        DynAssociationImpl dynAssociation = new DynAssociationImpl();
        return dynAssociation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DynDataSet createDynDataSet() {
        DynDataSetImpl dynDataSet = new DynDataSetImpl();
        return dynDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExtRef createExtRef() {
        ExtRefImpl extRef = new ExtRefImpl();
        return extRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FCDA createFCDA() {
        FCDAImpl fcda = new FCDAImpl();
        return fcda;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FileHandling createFileHandling() {
        FileHandlingImpl fileHandling = new FileHandlingImpl();
        return fileHandling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GOOSE createGOOSE() {
        GOOSEImpl goose = new GOOSEImpl();
        return goose;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GOOSESecurity createGOOSESecurity() {
        GOOSESecurityImpl gooseSecurity = new GOOSESecurityImpl();
        return gooseSecurity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GSEControl createGSEControl() {
        GSEControlImpl gseControl = new GSEControlImpl();
        return gseControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GSEDir createGSEDir() {
        GSEDirImpl gseDir = new GSEDirImpl();
        return gseDir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GSESettings createGSESettings() {
        GSESettingsImpl gseSettings = new GSESettingsImpl();
        return gseSettings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GSSE createGSSE() {
        GSSEImpl gsse = new GSSEImpl();
        return gsse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GetCBValues createGetCBValues() {
        GetCBValuesImpl getCBValues = new GetCBValuesImpl();
        return getCBValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GetDataObjectDefinition createGetDataObjectDefinition() {
        GetDataObjectDefinitionImpl getDataObjectDefinition = new GetDataObjectDefinitionImpl();
        return getDataObjectDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GetDataSetValue createGetDataSetValue() {
        GetDataSetValueImpl getDataSetValue = new GetDataSetValueImpl();
        return getDataSetValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GetDirectory createGetDirectory() {
        GetDirectoryImpl getDirectory = new GetDirectoryImpl();
        return getDirectory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IED createIED() {
        IEDImpl ied = new IEDImpl();
        return ied;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IEDName createIEDName() {
        IEDNameImpl iedName = new IEDNameImpl();
        return iedName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Inputs createInputs() {
        InputsImpl inputs = new InputsImpl();
        return inputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IssuerName createIssuerName() {
        IssuerNameImpl issuerName = new IssuerNameImpl();
        return issuerName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public KDC createKDC() {
        KDCImpl kdc = new KDCImpl();
        return kdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LDevice createLDevice() {
        LDeviceImpl lDevice = new LDeviceImpl();
        return lDevice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LN createLN() {
        LNImpl ln = new LNImpl();
        return ln;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LN0 createLN0() {
        LN0Impl ln0 = new LN0Impl();
        return ln0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Log createLog() {
        LogImpl log = new LogImpl();
        return log;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LogControl createLogControl() {
        LogControlImpl logControl = new LogControlImpl();
        return logControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LogSettings createLogSettings() {
        LogSettingsImpl logSettings = new LogSettingsImpl();
        return logSettings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OptFields createOptFields() {
        OptFieldsImpl optFields = new OptFieldsImpl();
        return optFields;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Protocol createProtocol() {
        ProtocolImpl protocol = new ProtocolImpl();
        return protocol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReadWrite createReadWrite() {
        ReadWriteImpl readWrite = new ReadWriteImpl();
        return readWrite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RedProt createRedProt() {
        RedProtImpl redProt = new RedProtImpl();
        return redProt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportControl createReportControl() {
        ReportControlImpl reportControl = new ReportControlImpl();
        return reportControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportSettings createReportSettings() {
        ReportSettingsImpl reportSettings = new ReportSettingsImpl();
        return reportSettings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RptEnabled createRptEnabled() {
        RptEnabledImpl rptEnabled = new RptEnabledImpl();
        return rptEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SDI createSDI() {
        SDIImpl sdi = new SDIImpl();
        return sdi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SGEdit createSGEdit() {
        SGEditImpl sgEdit = new SGEditImpl();
        return sgEdit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVSecurity createSMVSecurity() {
        SMVSecurityImpl smvSecurity = new SMVSecurityImpl();
        return smvSecurity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVSettings createSMVSettings() {
        SMVSettingsImpl smvSettings = new SMVSettingsImpl();
        return smvSettings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SMVsc createSMVsc() {
        SMVscImpl smVsc = new SMVscImpl();
        return smVsc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SampledValueControl createSampledValueControl() {
        SampledValueControlImpl sampledValueControl = new SampledValueControlImpl();
        return sampledValueControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Server createServer() {
        ServerImpl server = new ServerImpl();
        return server;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServerAt createServerAt() {
        ServerAtImpl serverAt = new ServerAtImpl();
        return serverAt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceSettings createServiceSettings() {
        ServiceSettingsImpl serviceSettings = new ServiceSettingsImpl();
        return serviceSettings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceWithMax createServiceWithMax() {
        ServiceWithMaxImpl serviceWithMax = new ServiceWithMaxImpl();
        return serviceWithMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Services createServices() {
        ServicesImpl services = new ServicesImpl();
        return services;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SetDataSetValue createSetDataSetValue() {
        SetDataSetValueImpl setDataSetValue = new SetDataSetValueImpl();
        return setDataSetValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SettingControl createSettingControl() {
        SettingControlImpl settingControl = new SettingControlImpl();
        return settingControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SettingGroups createSettingGroups() {
        SettingGroupsImpl settingGroups = new SettingGroupsImpl();
        return settingGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SmvOpts createSmvOpts() {
        SmvOptsImpl smvOpts = new SmvOptsImpl();
        return smvOpts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Subject createSubject() {
        SubjectImpl subject = new SubjectImpl();
        return subject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SupSubscription createSupSubscription() {
        SupSubscriptionImpl supSubscription = new SupSubscriptionImpl();
        return supSubscription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TimeSyncProt createTimeSyncProt() {
        TimeSyncProtImpl timeSyncProt = new TimeSyncProtImpl();
        return timeSyncProt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TimerActivatedControl createTimerActivatedControl() {
        TimerActivatedControlImpl timerActivatedControl = new TimerActivatedControlImpl();
        return timerActivatedControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TrgOps createTrgOps() {
        TrgOpsImpl trgOps = new TrgOpsImpl();
        return trgOps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueHandling createValueHandling() {
        ValueHandlingImpl valueHandling = new ValueHandlingImpl();
        return valueHandling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractConductingEquipment createAbstractConductingEquipment() {
        AbstractConductingEquipmentImpl abstractConductingEquipment = new AbstractConductingEquipmentImpl();
        return abstractConductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractEqFuncSubFunc createAbstractEqFuncSubFunc() {
        AbstractEqFuncSubFuncImpl abstractEqFuncSubFunc = new AbstractEqFuncSubFuncImpl();
        return abstractEqFuncSubFunc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Bay createBay() {
        BayImpl bay = new BayImpl();
        return bay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConductingEquipment createConductingEquipment() {
        ConductingEquipmentImpl conductingEquipment = new ConductingEquipmentImpl();
        return conductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectivityNode createConnectivityNode() {
        ConnectivityNodeImpl connectivityNode = new ConnectivityNodeImpl();
        return connectivityNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EqFunction createEqFunction() {
        EqFunctionImpl eqFunction = new EqFunctionImpl();
        return eqFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EqSubFunction createEqSubFunction() {
        EqSubFunctionImpl eqSubFunction = new EqSubFunctionImpl();
        return eqSubFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Equipment createEquipment() {
        EquipmentImpl equipment = new EquipmentImpl();
        return equipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquipmentContainer createEquipmentContainer() {
        EquipmentContainerImpl equipmentContainer = new EquipmentContainerImpl();
        return equipmentContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Function createFunction() {
        FunctionImpl function = new FunctionImpl();
        return function;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneralEquipment createGeneralEquipment() {
        GeneralEquipmentImpl generalEquipment = new GeneralEquipmentImpl();
        return generalEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneralEquipmentContainer createGeneralEquipmentContainer() {
        GeneralEquipmentContainerImpl generalEquipmentContainer = new GeneralEquipmentContainerImpl();
        return generalEquipmentContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNode createLNode() {
        LNodeImpl lNode = new LNodeImpl();
        return lNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeContainer createLNodeContainer() {
        LNodeContainerImpl lNodeContainer = new LNodeContainerImpl();
        return lNodeContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NeutralPoint createNeutralPoint() {
        NeutralPointImpl neutralPoint = new NeutralPointImpl();
        return neutralPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemResource createPowerSystemResource() {
        PowerSystemResourceImpl powerSystemResource = new PowerSystemResourceImpl();
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerTransformer createPowerTransformer() {
        PowerTransformerImpl powerTransformer = new PowerTransformerImpl();
        return powerTransformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubEquipment createSubEquipment() {
        SubEquipmentImpl subEquipment = new SubEquipmentImpl();
        return subEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SubFunction createSubFunction() {
        SubFunctionImpl subFunction = new SubFunctionImpl();
        return subFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Substation createSubstation() {
        SubstationImpl substation = new SubstationImpl();
        return substation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChanger createTapChanger() {
        TapChangerImpl tapChanger = new TapChangerImpl();
        return tapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Terminal createTerminal() {
        TerminalImpl terminal = new TerminalImpl();
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerWinding createTransformerWinding() {
        TransformerWindingImpl transformerWinding = new TransformerWindingImpl();
        return transformerWinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Voltage createVoltage() {
        VoltageImpl voltage = new VoltageImpl();
        return voltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageLevel createVoltageLevel() {
        VoltageLevelImpl voltageLevel = new VoltageLevelImpl();
        return voltageLevel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceYesNo createServiceYesNo() {
        ServiceYesNoImpl serviceYesNo = new ServiceYesNoImpl();
        return serviceYesNo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceWithOptionalMax createServiceWithOptionalMax() {
        ServiceWithOptionalMaxImpl serviceWithOptionalMax = new ServiceWithOptionalMaxImpl();
        return serviceWithOptionalMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceWithMaxNonZero createServiceWithMaxNonZero() {
        ServiceWithMaxNonZeroImpl serviceWithMaxNonZero = new ServiceWithMaxNonZeroImpl();
        return serviceWithMaxNonZero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceConfReportControl createServiceConfReportControl() {
        ServiceConfReportControlImpl serviceConfReportControl = new ServiceConfReportControlImpl();
        return serviceConfReportControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceWithMaxAndMaxAttributes createServiceWithMaxAndMaxAttributes() {
        ServiceWithMaxAndMaxAttributesImpl serviceWithMaxAndMaxAttributes = new ServiceWithMaxAndMaxAttributesImpl();
        return serviceWithMaxAndMaxAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceWithMaxAndModify createServiceWithMaxAndModify() {
        ServiceWithMaxAndModifyImpl serviceWithMaxAndModify = new ServiceWithMaxAndModifyImpl();
        return serviceWithMaxAndModify;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceForConfDataSet createServiceForConfDataSet() {
        ServiceForConfDataSetImpl serviceForConfDataSet = new ServiceForConfDataSetImpl();
        return serviceForConfDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Cert createCert() {
        CertImpl cert = new CertImpl();
        return cert;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueWithUnit createValueWithUnit() {
        ValueWithUnitImpl valueWithUnit = new ValueWithUnitImpl();
        return valueWithUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DurationInSec createDurationInSec() {
        DurationInSecImpl durationInSec = new DurationInSecImpl();
        return durationInSec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssociationKindEnum createAssociationKindEnumFromString( EDataType eDataType, String initialValue ) {
        AssociationKindEnum result = AssociationKindEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAssociationKindEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FCEnum createFCEnumFromString( EDataType eDataType, String initialValue ) {
        FCEnum result = FCEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFCEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GSEControlTypeEnum createGSEControlTypeEnumFromString( EDataType eDataType, String initialValue ) {
        GSEControlTypeEnum result = GSEControlTypeEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGSEControlTypeEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhaseEnum createPhaseEnumFromString( EDataType eDataType, String initialValue ) {
        PhaseEnum result = PhaseEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPhaseEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PredefinedTypeOfSecurityEnum createPredefinedTypeOfSecurityEnumFromString( EDataType eDataType,
            String initialValue ) {
        PredefinedTypeOfSecurityEnum result = PredefinedTypeOfSecurityEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPredefinedTypeOfSecurityEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SMVDeliveryEnum createSMVDeliveryEnumFromString( EDataType eDataType, String initialValue ) {
        SMVDeliveryEnum result = SMVDeliveryEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSMVDeliveryEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSettingsEnum createServiceSettingsEnumFromString( EDataType eDataType, String initialValue ) {
        ServiceSettingsEnum result = ServiceSettingsEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceSettingsEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceSettingsNoDynEnum createServiceSettingsNoDynEnumFromString( EDataType eDataType, String initialValue ) {
        ServiceSettingsNoDynEnum result = ServiceSettingsNoDynEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceSettingsNoDynEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceType createServiceTypeFromString( EDataType eDataType, String initialValue ) {
        ServiceType result = ServiceType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertServiceTypeToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SmpMod createSmpModFromString( EDataType eDataType, String initialValue ) {
        SmpMod result = SmpMod.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSmpModToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnitMultiplierEnum createUnitMultiplierEnumFromString( EDataType eDataType, String initialValue ) {
        UnitMultiplierEnum result = UnitMultiplierEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUnitMultiplierEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValKindEnum createValKindEnumFromString( EDataType eDataType, String initialValue ) {
        ValKindEnum result = ValKindEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertValKindEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public bufModeEnum createbufModeEnumFromString( EDataType eDataType, String initialValue ) {
        bufModeEnum result = bufModeEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertbufModeEnumToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SclPackage getSclPackage() {
        return (SclPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SclPackage getPackage() {
        return SclPackage.eINSTANCE;
    }

} //SclFactoryImpl
