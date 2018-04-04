/**
 *  Copyright (c) 2017 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.iec61850.scl.util;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Address;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Association;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AssociationKindEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement;
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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Control;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObject;
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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ExplicitLinkResolver;
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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.MinTime;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming;
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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject;
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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.UnNaming;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.bufModeEnum;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage
 * @generated
 */
public class SclValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SclValidator INSTANCE = new SclValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.centralesupelec.edf.riseclipse.iec61850.scl";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Header id required' of 'Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEADER__VALIDATE_HEADER_ID_REQUIRED = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Header name Structure value IED Name' of 'Header'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEADER__VALIDATE_HEADER_NAME_STRUCTURE_VALUE_IED_NAME = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History at least one Hitem required' of 'History'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY__VALIDATE_HISTORY_AT_LEAST_ONE_HITEM_REQUIRED = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hitem version required' of 'Hitem'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HITEM__VALIDATE_HITEM_VERSION_REQUIRED = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hitem revision required' of 'Hitem'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HITEM__VALIDATE_HITEM_REVISION_REQUIRED = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Hitem when required' of 'Hitem'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HITEM__VALIDATE_HITEM_WHEN_REQUIRED = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate ID Naming id required' of 'ID Naming'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ID_NAMING__VALIDATE_ID_NAMING_ID_REQUIRED = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate ID Naming id valid' of 'ID Naming'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ID_NAMING__VALIDATE_ID_NAMING_ID_VALID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Line type valid' of 'Line'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINE__VALIDATE_LINE_TYPE_VALID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Naming name required' of 'Naming'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMING__VALIDATE_NAMING_NAME_REQUIRED = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Naming name valid' of 'Naming'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMING__VALIDATE_NAMING_NAME_VALID = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Private type required' of 'Private'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVATE__VALIDATE_PRIVATE_TYPE_REQUIRED = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Private type valid' of 'Private'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRIVATE__VALIDATE_PRIVATE_TYPE_VALID = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Process type valid' of 'Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESS__VALIDATE_PROCESS_TYPE_VALID = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SCL version required' of 'SCL'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCL__VALIDATE_SCL_VERSION_REQUIRED = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SCL version valid' of 'SCL'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCL__VALIDATE_SCL_VERSION_VALID = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SCL version value 2007' of 'SCL'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCL__VALIDATE_SCL_VERSION_VALUE_2007 = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SCL revision required' of 'SCL'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCL__VALIDATE_SCL_REVISION_REQUIRED = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SCL revision valid' of 'SCL'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCL__VALIDATE_SCL_REVISION_VALID = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SCL revision value B' of 'SCL'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCL__VALIDATE_SCL_REVISION_VALUE_B = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SCL release value 1' of 'SCL'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCL__VALIDATE_SCL_RELEASE_VALUE_1 = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SCL one Header required' of 'SCL'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCL__VALIDATE_SCL_ONE_HEADER_REQUIRED = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Address nothing' of 'Address'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADDRESS__VALIDATE_ADDRESS_NOTHING = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Address at least one Prequired' of 'Address'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADDRESS__VALIDATE_ADDRESS_AT_LEAST_ONE_PREQUIRED = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Communication nothing' of 'Communication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMUNICATION__VALIDATE_COMMUNICATION_NOTHING = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Communication at least one Sub Network required' of 'Communication'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMUNICATION__VALIDATE_COMMUNICATION_AT_LEAST_ONE_SUB_NETWORK_REQUIRED = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Connected AP ied Name required' of 'Connected AP'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTED_AP__VALIDATE_CONNECTED_AP_IED_NAME_REQUIRED = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Connected AP ied Name valid' of 'Connected AP'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTED_AP__VALIDATE_CONNECTED_AP_IED_NAME_VALID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Connected AP ap Name required' of 'Connected AP'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTED_AP__VALIDATE_CONNECTED_AP_AP_NAME_REQUIRED = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Connected AP ap Name valid' of 'Connected AP'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTED_AP__VALIDATE_CONNECTED_AP_AP_NAME_VALID = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Connected AP red Prot valid' of 'Connected AP'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTED_AP__VALIDATE_CONNECTED_AP_RED_PROT_VALID = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Connected AP at most one Phys Conn Type Red Conn required' of 'Connected AP'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTED_AP__VALIDATE_CONNECTED_AP_AT_MOST_ONE_PHYS_CONN_TYPE_RED_CONN_REQUIRED = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Connected AP at most one Phys Conn Type Connection required' of 'Connected AP'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTED_AP__VALIDATE_CONNECTED_AP_AT_MOST_ONE_PHYS_CONN_TYPE_CONNECTION_REQUIRED = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Control Block ld Inst required' of 'Control Block'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROL_BLOCK__VALIDATE_CONTROL_BLOCK_LD_INST_REQUIRED = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Control Block ld Inst valid' of 'Control Block'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROL_BLOCK__VALIDATE_CONTROL_BLOCK_LD_INST_VALID = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Control Block cb Name required' of 'Control Block'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROL_BLOCK__VALIDATE_CONTROL_BLOCK_CB_NAME_REQUIRED = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Control Block cb Name valid' of 'Control Block'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROL_BLOCK__VALIDATE_CONTROL_BLOCK_CB_NAME_VALID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate GSE nothing' of 'GSE'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GSE__VALIDATE_GSE_NOTHING = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ptype required' of 'P'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int P__VALIDATE_PTYPE_REQUIRED = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ptype valid' of 'P'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int P__VALIDATE_PTYPE_VALID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Pvalue' of 'P'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int P__VALIDATE_PVALUE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PPhys Conn type required' of 'PPhys Conn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PPHYS_CONN__VALIDATE_PPHYS_CONN_TYPE_REQUIRED = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate PPhys Conn type valid' of 'PPhys Conn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PPHYS_CONN__VALIDATE_PPHYS_CONN_TYPE_VALID = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phys Conn type required' of 'Phys Conn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYS_CONN__VALIDATE_PHYS_CONN_TYPE_REQUIRED = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Phys Conn type valid' of 'Phys Conn'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYS_CONN__VALIDATE_PHYS_CONN_TYPE_VALID = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SMV nothing' of 'SMV'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SMV__VALIDATE_SMV_NOTHING = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sub Network nothing' of 'Sub Network'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUB_NETWORK__VALIDATE_SUB_NETWORK_NOTHING = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sub Network at least one Connected AP required' of 'Sub Network'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUB_NETWORK__VALIDATE_SUB_NETWORK_AT_LEAST_ONE_CONNECTED_AP_REQUIRED = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abstract Data Attribute bType required' of 'Abstract Data Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABSTRACT_DATA_ATTRIBUTE__VALIDATE_ABSTRACT_DATA_ATTRIBUTE_BTYPE_REQUIRED = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abstract Data Attribute bType valid' of 'Abstract Data Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABSTRACT_DATA_ATTRIBUTE__VALIDATE_ABSTRACT_DATA_ATTRIBUTE_BTYPE_VALID = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abstract Data Attribute type valid' of 'Abstract Data Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABSTRACT_DATA_ATTRIBUTE__VALIDATE_ABSTRACT_DATA_ATTRIBUTE_TYPE_VALID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abstract Data Attribute count valid' of 'Abstract Data Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABSTRACT_DATA_ATTRIBUTE__VALIDATE_ABSTRACT_DATA_ATTRIBUTE_COUNT_VALID = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate BDA nothing' of 'BDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BDA__VALIDATE_BDA_NOTHING = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DA fc required' of 'DA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DA__VALIDATE_DA_FC_REQUIRED = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DA Type nothing' of 'DA Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DA_TYPE__VALIDATE_DA_TYPE_NOTHING = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DA Type at least one BDA required' of 'DA Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DA_TYPE__VALIDATE_DA_TYPE_AT_LEAST_ONE_BDA_REQUIRED = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DO type required' of 'DO'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DO__VALIDATE_DO_TYPE_REQUIRED = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DO type valid' of 'DO'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DO__VALIDATE_DO_TYPE_VALID = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DO Type cdc required' of 'DO Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DO_TYPE__VALIDATE_DO_TYPE_CDC_REQUIRED = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DO Type cdc valid' of 'DO Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DO_TYPE__VALIDATE_DO_TYPE_CDC_VALID = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DO Type ied Type valid' of 'DO Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DO_TYPE__VALIDATE_DO_TYPE_IED_TYPE_VALID = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DO Type at least one SDO or DA required' of 'DO Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DO_TYPE__VALIDATE_DO_TYPE_AT_LEAST_ONE_SDO_OR_DA_REQUIRED = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Data Type Templates nothing' of 'Data Type Templates'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_TYPE_TEMPLATES__VALIDATE_DATA_TYPE_TEMPLATES_NOTHING = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Data Type Templates at least one LNode Type required' of 'Data Type Templates'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_TYPE_TEMPLATES__VALIDATE_DATA_TYPE_TEMPLATES_AT_LEAST_ONE_LNODE_TYPE_REQUIRED = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Data Type Templates at least one DO Type required' of 'Data Type Templates'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_TYPE_TEMPLATES__VALIDATE_DATA_TYPE_TEMPLATES_AT_LEAST_ONE_DO_TYPE_REQUIRED = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Enum Type nothing' of 'Enum Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENUM_TYPE__VALIDATE_ENUM_TYPE_NOTHING = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Enum Type at least one Enum Val required' of 'Enum Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENUM_TYPE__VALIDATE_ENUM_TYPE_AT_LEAST_ONE_ENUM_VAL_REQUIRED = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Enum Val ord required' of 'Enum Val'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENUM_VAL__VALIDATE_ENUM_VAL_ORD_REQUIRED = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LNode Type ln Class required' of 'LNode Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE_TYPE__VALIDATE_LNODE_TYPE_LN_CLASS_REQUIRED = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LNode Type ln Class valid' of 'LNode Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE_TYPE__VALIDATE_LNODE_TYPE_LN_CLASS_VALID = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History at least one DO required' of 'LNode Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE_TYPE__VALIDATE_HISTORY_AT_LEAST_ONE_DO_REQUIRED = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prot Ns value required' of 'Prot Ns'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROT_NS__VALIDATE_PROT_NS_VALUE_REQUIRED = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prot Ns value valid' of 'Prot Ns'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROT_NS__VALIDATE_PROT_NS_VALUE_VALID = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Prot Ns type valid' of 'Prot Ns'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROT_NS__VALIDATE_PROT_NS_TYPE_VALID = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SDO name required' of 'SDO'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SDO__VALIDATE_SDO_NAME_REQUIRED = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SDO name valid' of 'SDO'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SDO__VALIDATE_SDO_NAME_VALID = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SDO type required' of 'SDO'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SDO__VALIDATE_SDO_TYPE_REQUIRED = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SDO type valid' of 'SDO'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SDO__VALIDATE_SDO_TYPE_VALID = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SDO count valid' of 'SDO'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SDO__VALIDATE_SDO_COUNT_VALID = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Val sGroup valid' of 'Val'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VAL__VALIDATE_VAL_SGROUP_VALID = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Access Control nothing' of 'Access Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCESS_CONTROL__VALIDATE_ACCESS_CONTROL_NOTHING = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Access Point name required' of 'Access Point'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCESS_POINT__VALIDATE_ACCESS_POINT_NAME_REQUIRED = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Access Point name valid' of 'Access Point'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCESS_POINT__VALIDATE_ACCESS_POINT_NAME_VALID = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Access Point restriction on content' of 'Access Point'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCESS_POINT__VALIDATE_ACCESS_POINT_RESTRICTION_ON_CONTENT = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Access Point at most securities' of 'Access Point'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCESS_POINT__VALIDATE_ACCESS_POINT_AT_MOST_SECURITIES = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Access Point securities allowed' of 'Access Point'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCESS_POINT__VALIDATE_ACCESS_POINT_SECURITIES_ALLOWED = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LN ln Class required' of 'Any LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANY_LN__VALIDATE_LN_LN_CLASS_REQUIRED = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LN ln Class valid' of 'Any LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANY_LN__VALIDATE_LN_LN_CLASS_VALID = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LN inst required' of 'Any LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANY_LN__VALIDATE_LN_INST_REQUIRED = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Any LN ln Type required' of 'Any LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANY_LN__VALIDATE_ANY_LN_LN_TYPE_REQUIRED = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Any LN ln Type valid' of 'Any LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ANY_LN__VALIDATE_ANY_LN_LN_TYPE_VALID = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Association kind required' of 'Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSOCIATION__VALIDATE_ASSOCIATION_KIND_REQUIRED = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Association association ID valid' of 'Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSOCIATION__VALIDATE_ASSOCIATION_ASSOCIATION_ID_VALID = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Certificate serial Number required' of 'Certificate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERTIFICATE__VALIDATE_CERTIFICATE_SERIAL_NUMBER_REQUIRED = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Certificate serial Number valid' of 'Certificate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERTIFICATE__VALIDATE_CERTIFICATE_SERIAL_NUMBER_VALID = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Certificate xfer Number valid' of 'Certificate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERTIFICATE__VALIDATE_CERTIFICATE_XFER_NUMBER_VALID = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Certificate one Subject required' of 'Certificate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERTIFICATE__VALIDATE_CERTIFICATE_ONE_SUBJECT_REQUIRED = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Certificate one Issuer Name required' of 'Certificate'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERTIFICATE__VALIDATE_CERTIFICATE_ONE_ISSUER_NAME_REQUIRED = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client LN ap Ref valid' of 'Client LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_LN__VALIDATE_CLIENT_LN_AP_REF_VALID = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client LN ied Name required' of 'Client LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_LN__VALIDATE_CLIENT_LN_IED_NAME_REQUIRED = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client LN ied Name valid' of 'Client LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_LN__VALIDATE_CLIENT_LN_IED_NAME_VALID = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client LN ld Inst required' of 'Client LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_LN__VALIDATE_CLIENT_LN_LD_INST_REQUIRED = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client LN ld Inst valid' of 'Client LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_LN__VALIDATE_CLIENT_LN_LD_INST_VALID = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client LN ln Class required' of 'Client LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_LN__VALIDATE_CLIENT_LN_LN_CLASS_REQUIRED = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client LN ln Class valid' of 'Client LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_LN__VALIDATE_CLIENT_LN_LN_CLASS_VALID = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client LN ln Inst required' of 'Client LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_LN__VALIDATE_CLIENT_LN_LN_INST_REQUIRED = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client LN ln Inst valid' of 'Client LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_LN__VALIDATE_CLIENT_LN_LN_INST_VALID = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client LN ln Inst empty for LLN0' of 'Client LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_LN__VALIDATE_CLIENT_LN_LN_INST_EMPTY_FOR_LLN0 = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client LN prefix valid' of 'Client LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_LN__VALIDATE_CLIENT_LN_PREFIX_VALID = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client Services max Attributes valid' of 'Client Services'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_SERVICES__VALIDATE_CLIENT_SERVICES_MAX_ATTRIBUTES_VALID = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client Services max Reports valid' of 'Client Services'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_SERVICES__VALIDATE_CLIENT_SERVICES_MAX_REPORTS_VALID = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client Services max GOOSE valid' of 'Client Services'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_SERVICES__VALIDATE_CLIENT_SERVICES_MAX_GOOSE_VALID = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Client Services max SMV valid' of 'Client Services'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLIENT_SERVICES__VALIDATE_CLIENT_SERVICES_MAX_SMV_VALID = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comm Prot nothing' of 'Comm Prot'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMM_PROT__VALIDATE_COMM_PROT_NOTHING = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Conf LNs nothing' of 'Conf LNs'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONF_LNS__VALIDATE_CONF_LNS_NOTHING = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Control name required' of 'Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROL__VALIDATE_CONTROL_NAME_REQUIRED = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Control name valid' of 'Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROL__VALIDATE_CONTROL_NAME_VALID = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Control dat Set valid' of 'Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROL__VALIDATE_CONTROL_DAT_SET_VALID = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Control With IED Name conf Rev unsigned Int' of 'Control With IED Name'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROL_WITH_IED_NAME__VALIDATE_CONTROL_WITH_IED_NAME_CONF_REV_UNSIGNED_INT = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Control With Trigger Opt intg Pd unsigned int' of 'Control With Trigger Opt'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTROL_WITH_TRIGGER_OPT__VALIDATE_CONTROL_WITH_TRIGGER_OPT_INTG_PD_UNSIGNED_INT = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DAI name required' of 'DAI'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DAI__VALIDATE_DAI_NAME_REQUIRED = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DAI name valid' of 'DAI'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DAI__VALIDATE_DAI_NAME_VALID = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DAI ix valid' of 'DAI'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DAI__VALIDATE_DAI_IX_VALID = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DOI name required' of 'DOI'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOI__VALIDATE_DOI_NAME_REQUIRED = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DOI name valid' of 'DOI'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOI__VALIDATE_DOI_NAME_VALID = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate DOI ix valid' of 'DOI'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DOI__VALIDATE_DOI_IX_VALID = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Data Set name required' of 'Data Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_SET__VALIDATE_DATA_SET_NAME_REQUIRED = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Data Set name valid' of 'Data Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_SET__VALIDATE_DATA_SET_NAME_VALID = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Data Set at least one FCDA required' of 'Data Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_SET__VALIDATE_DATA_SET_AT_LEAST_ONE_FCDA_REQUIRED = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ext Ref ied Name valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_EXT_REF_IED_NAME_VALID = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ext Ref ld Inst valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_EXT_REF_LD_INST_VALID = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ext Ref prefix valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_EXT_REF_PREFIX_VALID = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ext Ref ln Class valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_EXT_REF_LN_CLASS_VALID = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ext Ref ln Inst valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_EXT_REF_LN_INST_VALID = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA do Name valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_FCDA_DO_NAME_VALID = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA da Name valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_FCDA_DA_NAME_VALID = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ext Ref src LD Inst valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_EXT_REF_SRC_LD_INST_VALID = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ext Ref src Prefix valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_EXT_REF_SRC_PREFIX_VALID = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ext Ref src LN Class valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_EXT_REF_SRC_LN_CLASS_VALID = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ext Ref src LN Inst valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_EXT_REF_SRC_LN_INST_VALID = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Ext Ref src CB Name valid' of 'Ext Ref'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXT_REF__VALIDATE_EXT_REF_SRC_CB_NAME_VALID = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA fc required' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_FC_REQUIRED = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA ld Inst required' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_LD_INST_REQUIRED = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA ln Class required' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_LN_CLASS_REQUIRED = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA ln Class valid' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_LN_CLASS_VALID = 145;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA ln Inst required' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_LN_INST_REQUIRED = 146;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA ln Inst valid' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_LN_INST_VALID = 147;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA empty attributes only if GSSE' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_EMPTY_ATTRIBUTES_ONLY_IF_GSSE = 148;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA ld Inst valid' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_LD_INST_VALID = 149;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA prefix valid' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_PREFIX_VALID = 150;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA do Name valid' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_DO_NAME_VALID = 151;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA da Name valid' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_DA_NAME_VALID = 152;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate FCDA ix valid' of 'FCDA'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FCDA__VALIDATE_FCDA_IX_VALID = 153;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate File Handling nothing' of 'File Handling'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FILE_HANDLING__VALIDATE_FILE_HANDLING_NOTHING = 154;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate GOOSE nothing' of 'GOOSE'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GOOSE__VALIDATE_GOOSE_NOTHING = 155;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate GSE Control app ID required' of 'GSE Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GSE_CONTROL__VALIDATE_GSE_CONTROL_APP_ID_REQUIRED = 156;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate GSE Control app ID valid' of 'GSE Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GSE_CONTROL__VALIDATE_GSE_CONTROL_APP_ID_VALID = 157;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate GSE Control conf Rev required' of 'GSE Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GSE_CONTROL__VALIDATE_GSE_CONTROL_CONF_REV_REQUIRED = 158;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate GSE Control conf Rev unsigned Int' of 'GSE Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GSE_CONTROL__VALIDATE_GSE_CONTROL_CONF_REV_UNSIGNED_INT = 159;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate GSE Settings nothing' of 'GSE Settings'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GSE_SETTINGS__VALIDATE_GSE_SETTINGS_NOTHING = 160;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IED name required' of 'IED'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IED__VALIDATE_IED_NAME_REQUIRED = 161;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IED name valid' of 'IED'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IED__VALIDATE_IED_NAME_VALID = 162;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IED original Scl Version valid' of 'IED'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IED__VALIDATE_IED_ORIGINAL_SCL_VERSION_VALID = 163;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IED original Scl Revision valid' of 'IED'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IED__VALIDATE_IED_ORIGINAL_SCL_REVISION_VALID = 164;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IED original Scl Release valid' of 'IED'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IED__VALIDATE_IED_ORIGINAL_SCL_RELEASE_VALID = 165;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validateeng Right valid' of 'IED'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IED__VALIDATEENG_RIGHT_VALID = 166;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IED at least one Access Point required' of 'IED'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IED__VALIDATE_IED_AT_LEAST_ONE_ACCESS_POINT_REQUIRED = 167;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate IED Name value valid' of 'IED Name'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IED_NAME__VALIDATE_IED_NAME_VALUE_VALID = 168;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Inputs nothing' of 'Inputs'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INPUTS__VALIDATE_INPUTS_NOTHING = 169;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Inputs at least one Ext Ref required' of 'Inputs'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INPUTS__VALIDATE_INPUTS_AT_LEAST_ONE_EXT_REF_REQUIRED = 170;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate KDC ied Name required' of 'KDC'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KDC__VALIDATE_KDC_IED_NAME_REQUIRED = 171;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate KDC ied Name valid' of 'KDC'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KDC__VALIDATE_KDC_IED_NAME_VALID = 172;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate KDC ap Name required' of 'KDC'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KDC__VALIDATE_KDC_AP_NAME_REQUIRED = 173;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate KDC ap Name valid' of 'KDC'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int KDC__VALIDATE_KDC_AP_NAME_VALID = 174;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LDevice inst required' of 'LDevice'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LDEVICE__VALIDATE_LDEVICE_INST_REQUIRED = 175;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LDevice inst valid' of 'LDevice'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LDEVICE__VALIDATE_LDEVICE_INST_VALID = 176;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LDevice ld Name valid' of 'LDevice'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LDEVICE__VALIDATE_LDEVICE_LD_NAME_VALID = 177;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LDevice one LN0 required' of 'LDevice'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LDEVICE__VALIDATE_LDEVICE_ONE_LN0_REQUIRED = 178;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LN inst valid' of 'LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LN__VALIDATE_LN_INST_VALID = 179;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LN prefix valid' of 'LN'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LN__VALIDATE_LN_PREFIX_VALID = 180;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LN0 ln Class value' of 'LN0'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LN0__VALIDATE_LN0_LN_CLASS_VALUE = 181;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LN0 inst empty' of 'LN0'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LN0__VALIDATE_LN0_INST_EMPTY = 182;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Log name valid' of 'Log'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOG__VALIDATE_LOG_NAME_VALID = 183;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Log Control log Name required' of 'Log Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOG_CONTROL__VALIDATE_LOG_CONTROL_LOG_NAME_REQUIRED = 184;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Log Control log Name valid' of 'Log Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOG_CONTROL__VALIDATE_LOG_CONTROL_LOG_NAME_VALID = 185;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Log Control ld Inst valid' of 'Log Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOG_CONTROL__VALIDATE_LOG_CONTROL_LD_INST_VALID = 186;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Log Control prefix valid' of 'Log Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOG_CONTROL__VALIDATE_LOG_CONTROL_PREFIX_VALID = 187;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Log Control ln Class valid' of 'Log Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOG_CONTROL__VALIDATE_LOG_CONTROL_LN_CLASS_VALID = 188;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Log Control ln Inst valid' of 'Log Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOG_CONTROL__VALIDATE_LOG_CONTROL_LN_INST_VALID = 189;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Log Control buf Time valid' of 'Log Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOG_CONTROL__VALIDATE_LOG_CONTROL_BUF_TIME_VALID = 190;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Log Settings nothing' of 'Log Settings'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LOG_SETTINGS__VALIDATE_LOG_SETTINGS_NOTHING = 191;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Voltage must Understand required' of 'Protocol'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTOCOL__VALIDATE_VOLTAGE_MUST_UNDERSTAND_REQUIRED = 192;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Voltage must Understand value fixed' of 'Protocol'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROTOCOL__VALIDATE_VOLTAGE_MUST_UNDERSTAND_VALUE_FIXED = 193;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Red Prot nothing' of 'Red Prot'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RED_PROT__VALIDATE_RED_PROT_NOTHING = 194;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Report Control conf Rev required' of 'Report Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORT_CONTROL__VALIDATE_REPORT_CONTROL_CONF_REV_REQUIRED = 195;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Report Control conf Rev unsigned int' of 'Report Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORT_CONTROL__VALIDATE_REPORT_CONTROL_CONF_REV_UNSIGNED_INT = 196;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Report Control rpt ID valid' of 'Report Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORT_CONTROL__VALIDATE_REPORT_CONTROL_RPT_ID_VALID = 197;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Report Control buf Time valid' of 'Report Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORT_CONTROL__VALIDATE_REPORT_CONTROL_BUF_TIME_VALID = 198;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Report Control one Opt Fields required' of 'Report Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORT_CONTROL__VALIDATE_REPORT_CONTROL_ONE_OPT_FIELDS_REQUIRED = 199;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Report Settings nothing' of 'Report Settings'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REPORT_SETTINGS__VALIDATE_REPORT_SETTINGS_NOTHING = 200;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Rpt Enabled max unsigned int' of 'Rpt Enabled'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RPT_ENABLED__VALIDATE_RPT_ENABLED_MAX_UNSIGNED_INT = 201;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SDI name required' of 'SDI'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SDI__VALIDATE_SDI_NAME_REQUIRED = 202;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SDI name valid' of 'SDI'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SDI__VALIDATE_SDI_NAME_VALID = 203;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SDI ix valid' of 'SDI'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SDI__VALIDATE_SDI_IX_VALID = 204;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SMV Settings nothing' of 'SMV Settings'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SMV_SETTINGS__VALIDATE_SMV_SETTINGS_NOTHING = 205;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate SM Vsc nothing' of 'SM Vsc'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SM_VSC__VALIDATE_SM_VSC_NOTHING = 206;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampled Value Control smv ID required' of 'Sampled Value Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SAMPLED_VALUE_CONTROL__VALIDATE_SAMPLED_VALUE_CONTROL_SMV_ID_REQUIRED = 207;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampled Value Control smv ID valid' of 'Sampled Value Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SAMPLED_VALUE_CONTROL__VALIDATE_SAMPLED_VALUE_CONTROL_SMV_ID_VALID = 208;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampled Value Control smp Rate required' of 'Sampled Value Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SAMPLED_VALUE_CONTROL__VALIDATE_SAMPLED_VALUE_CONTROL_SMP_RATE_REQUIRED = 209;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampled Value Control smp Rate valid' of 'Sampled Value Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SAMPLED_VALUE_CONTROL__VALIDATE_SAMPLED_VALUE_CONTROL_SMP_RATE_VALID = 210;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampled Value Control nof ASDU required' of 'Sampled Value Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SAMPLED_VALUE_CONTROL__VALIDATE_SAMPLED_VALUE_CONTROL_NOF_ASDU_REQUIRED = 211;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampled Value Control nof ASDU valid' of 'Sampled Value Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SAMPLED_VALUE_CONTROL__VALIDATE_SAMPLED_VALUE_CONTROL_NOF_ASDU_VALID = 212;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampled Value Control conf Rev required' of 'Sampled Value Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SAMPLED_VALUE_CONTROL__VALIDATE_SAMPLED_VALUE_CONTROL_CONF_REV_REQUIRED = 213;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampled Value Control conf Rev unsigned Int' of 'Sampled Value Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SAMPLED_VALUE_CONTROL__VALIDATE_SAMPLED_VALUE_CONTROL_CONF_REV_UNSIGNED_INT = 214;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampled Value Control one Smv Opts required' of 'Sampled Value Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SAMPLED_VALUE_CONTROL__VALIDATE_SAMPLED_VALUE_CONTROL_ONE_SMV_OPTS_REQUIRED = 215;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sampled Value Control multicast' of 'Sampled Value Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SAMPLED_VALUE_CONTROL__VALIDATE_SAMPLED_VALUE_CONTROL_MULTICAST = 216;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Server timeout unsigned int' of 'Server'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVER__VALIDATE_SERVER_TIMEOUT_UNSIGNED_INT = 217;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Server one Authentication required' of 'Server'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVER__VALIDATE_SERVER_ONE_AUTHENTICATION_REQUIRED = 218;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Server at least one LDevice required' of 'Server'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVER__VALIDATE_SERVER_AT_LEAST_ONE_LDEVICE_REQUIRED = 219;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Server At ap Name required' of 'Server At'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVER_AT__VALIDATE_SERVER_AT_AP_NAME_REQUIRED = 220;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Server At ap Name valid' of 'Server At'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVER_AT__VALIDATE_SERVER_AT_AP_NAME_VALID = 221;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Service Settings nothing' of 'Service Settings'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_SETTINGS__VALIDATE_SERVICE_SETTINGS_NOTHING = 222;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Service With Max max required' of 'Service With Max'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_WITH_MAX__VALIDATE_SERVICE_WITH_MAX_MAX_REQUIRED = 223;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Service With Max max valid' of 'Service With Max'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_WITH_MAX__VALIDATE_SERVICE_WITH_MAX_MAX_VALID = 224;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Services name Length valid' of 'Services'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICES__VALIDATE_SERVICES_NAME_LENGTH_VALID = 225;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Setting Control num Of SGs required' of 'Setting Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SETTING_CONTROL__VALIDATE_SETTING_CONTROL_NUM_OF_SGS_REQUIRED = 226;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Setting Control num Of SGs valid' of 'Setting Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SETTING_CONTROL__VALIDATE_SETTING_CONTROL_NUM_OF_SGS_VALID = 227;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Setting Control act SG valid' of 'Setting Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SETTING_CONTROL__VALIDATE_SETTING_CONTROL_ACT_SG_VALID = 228;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Setting Control resv Tms valid' of 'Setting Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SETTING_CONTROL__VALIDATE_SETTING_CONTROL_RESV_TMS_VALID = 229;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Setting Groups nothing' of 'Setting Groups'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SETTING_GROUPS__VALIDATE_SETTING_GROUPS_NOTHING = 230;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sup Subscription max Go required' of 'Sup Subscription'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUP_SUBSCRIPTION__VALIDATE_SUP_SUBSCRIPTION_MAX_GO_REQUIRED = 231;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sup Subscription max Go valid' of 'Sup Subscription'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUP_SUBSCRIPTION__VALIDATE_SUP_SUBSCRIPTION_MAX_GO_VALID = 232;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sup Subscription max Sv required' of 'Sup Subscription'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUP_SUBSCRIPTION__VALIDATE_SUP_SUBSCRIPTION_MAX_SV_REQUIRED = 233;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sup Subscription max Sv valid' of 'Sup Subscription'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUP_SUBSCRIPTION__VALIDATE_SUP_SUBSCRIPTION_MAX_SV_VALID = 234;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Time Sync Prot nothing' of 'Time Sync Prot'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TIME_SYNC_PROT__VALIDATE_TIME_SYNC_PROT_NOTHING = 235;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Trg Ops nothing' of 'Trg Ops'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRG_OPS__VALIDATE_TRG_OPS_NOTHING = 236;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Value Handling nothing' of 'Value Handling'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VALUE_HANDLING__VALIDATE_VALUE_HANDLING_NOTHING = 237;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Abstract Eq Func Sub Func nothing' of 'Abstract Eq Func Sub Func'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ABSTRACT_EQ_FUNC_SUB_FUNC__VALIDATE_ABSTRACT_EQ_FUNC_SUB_FUNC_NOTHING = 238;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Bay nothing' of 'Bay'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BAY__VALIDATE_BAY_NOTHING = 239;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Conducting Equipment type required' of 'Conducting Equipment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDUCTING_EQUIPMENT__VALIDATE_CONDUCTING_EQUIPMENT_TYPE_REQUIRED = 240;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Conducting Equipment type valid' of 'Conducting Equipment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDUCTING_EQUIPMENT__VALIDATE_CONDUCTING_EQUIPMENT_TYPE_VALID = 241;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Connectivity Node path Name required' of 'Connectivity Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTIVITY_NODE__VALIDATE_CONNECTIVITY_NODE_PATH_NAME_REQUIRED = 242;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Connectivity Node path Name valid' of 'Connectivity Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTIVITY_NODE__VALIDATE_CONNECTIVITY_NODE_PATH_NAME_VALID = 243;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Connectivity Node path Name value' of 'Connectivity Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONNECTIVITY_NODE__VALIDATE_CONNECTIVITY_NODE_PATH_NAME_VALUE = 244;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Eq Function nothing' of 'Eq Function'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EQ_FUNCTION__VALIDATE_EQ_FUNCTION_NOTHING = 245;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Eq Sub Function nothing' of 'Eq Sub Function'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EQ_SUB_FUNCTION__VALIDATE_EQ_SUB_FUNCTION_NOTHING = 246;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Equipment nothing' of 'Equipment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EQUIPMENT__VALIDATE_EQUIPMENT_NOTHING = 247;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Equipment Container nothing' of 'Equipment Container'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EQUIPMENT_CONTAINER__VALIDATE_EQUIPMENT_CONTAINER_NOTHING = 248;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Function nothing' of 'Function'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTION__VALIDATE_FUNCTION_NOTHING = 249;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Equipment type required' of 'General Equipment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EQUIPMENT__VALIDATE_GENERAL_EQUIPMENT_TYPE_REQUIRED = 250;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Equipment type valid' of 'General Equipment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EQUIPMENT__VALIDATE_GENERAL_EQUIPMENT_TYPE_VALID = 251;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Equipment Container nothing' of 'General Equipment Container'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_EQUIPMENT_CONTAINER__VALIDATE_GENERAL_EQUIPMENT_CONTAINER_NOTHING = 252;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LNode ln Class required' of 'LNode'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE__VALIDATE_LNODE_LN_CLASS_REQUIRED = 253;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LNode ln Class value' of 'LNode'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE__VALIDATE_LNODE_LN_CLASS_VALUE = 254;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LNode ln Inst required' of 'LNode'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE__VALIDATE_LNODE_LN_INST_REQUIRED = 255;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LNode ied Name value' of 'LNode'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE__VALIDATE_LNODE_IED_NAME_VALUE = 256;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LNode ld Inst value' of 'LNode'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE__VALIDATE_LNODE_LD_INST_VALUE = 257;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LNode prefix value' of 'LNode'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE__VALIDATE_LNODE_PREFIX_VALUE = 258;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LNode ln Inst value' of 'LNode'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE__VALIDATE_LNODE_LN_INST_VALUE = 259;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LNode ln Type value' of 'LNode'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE__VALIDATE_LNODE_LN_TYPE_VALUE = 260;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate LNode Container nothing' of 'LNode Container'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LNODE_CONTAINER__VALIDATE_LNODE_CONTAINER_NOTHING = 261;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Power System Resource nothing' of 'Power System Resource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POWER_SYSTEM_RESOURCE__VALIDATE_POWER_SYSTEM_RESOURCE_NOTHING = 262;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Power Transformer type value' of 'Power Transformer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POWER_TRANSFORMER__VALIDATE_POWER_TRANSFORMER_TYPE_VALUE = 263;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Power Transformer at least one Transformer Winding required' of 'Power Transformer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POWER_TRANSFORMER__VALIDATE_POWER_TRANSFORMER_AT_LEAST_ONE_TRANSFORMER_WINDING_REQUIRED = 264;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sub Equipment nothing' of 'Sub Equipment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUB_EQUIPMENT__VALIDATE_SUB_EQUIPMENT_NOTHING = 265;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Sub Function nothing' of 'Sub Function'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUB_FUNCTION__VALIDATE_SUB_FUNCTION_NOTHING = 266;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Substation nothing' of 'Substation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSTATION__VALIDATE_SUBSTATION_NOTHING = 267;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Substation at least one Voltage Level required' of 'Substation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUBSTATION__VALIDATE_SUBSTATION_AT_LEAST_ONE_VOLTAGE_LEVEL_REQUIRED = 268;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tap Changer type required' of 'Tap Changer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAP_CHANGER__VALIDATE_TAP_CHANGER_TYPE_REQUIRED = 269;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tap Changer type valid' of 'Tap Changer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAP_CHANGER__VALIDATE_TAP_CHANGER_TYPE_VALID = 270;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Tap Changer type value' of 'Tap Changer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAP_CHANGER__VALIDATE_TAP_CHANGER_TYPE_VALUE = 271;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal connectivity Node required' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_CONNECTIVITY_NODE_REQUIRED = 272;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal connectivity Node valid' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_CONNECTIVITY_NODE_VALID = 273;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal connectivity Node value shall be pathname' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_CONNECTIVITY_NODE_VALUE_SHALL_BE_PATHNAME = 274;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal substation Name required' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_SUBSTATION_NAME_REQUIRED = 275;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal substation Name valid' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_SUBSTATION_NAME_VALID = 276;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal voltage Level Name required' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_VOLTAGE_LEVEL_NAME_REQUIRED = 277;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal voltage Level Name valid' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_VOLTAGE_LEVEL_NAME_VALID = 278;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal bay Name required' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_BAY_NAME_REQUIRED = 279;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal bay Name valid' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_BAY_NAME_VALID = 280;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal cNode Name required' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_CNODE_NAME_REQUIRED = 281;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal cNode Name valid' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_CNODE_NAME_VALID = 282;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Terminal process Name valid' of 'Terminal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TERMINAL__VALIDATE_TERMINAL_PROCESS_NAME_VALID = 283;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Transformer Winding type required' of 'Transformer Winding'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSFORMER_WINDING__VALIDATE_TRANSFORMER_WINDING_TYPE_REQUIRED = 284;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Voltage unit value fixed' of 'Voltage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VOLTAGE__VALIDATE_VOLTAGE_UNIT_VALUE_FIXED = 285;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Voltage Level nom Freq value' of 'Voltage Level'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VOLTAGE_LEVEL__VALIDATE_VOLTAGE_LEVEL_NOM_FREQ_VALUE = 286;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Voltage Level num Phases value' of 'Voltage Level'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VOLTAGE_LEVEL__VALIDATE_VOLTAGE_LEVEL_NUM_PHASES_VALUE = 287;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Voltage Level at least one Bay required' of 'Voltage Level'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VOLTAGE_LEVEL__VALIDATE_VOLTAGE_LEVEL_AT_LEAST_ONE_BAY_REQUIRED = 288;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Data Object name required' of 'Data Object'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_OBJECT__VALIDATE_DATA_OBJECT_NAME_REQUIRED = 289;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Data Object name valid' of 'Data Object'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_OBJECT__VALIDATE_DATA_OBJECT_NAME_VALID = 290;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Data Attribute name required' of 'Data Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_ATTRIBUTE__VALIDATE_DATA_ATTRIBUTE_NAME_REQUIRED = 291;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Data Attribute name valid' of 'Data Attribute'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_ATTRIBUTE__VALIDATE_DATA_ATTRIBUTE_NAME_VALID = 292;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Service Yes No nothing' of 'Service Yes No'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_YES_NO__VALIDATE_SERVICE_YES_NO_NOTHING = 293;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Service With Optional Max max valid' of 'Service With Optional Max'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_WITH_OPTIONAL_MAX__VALIDATE_SERVICE_WITH_OPTIONAL_MAX_MAX_VALID = 294;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Service With Max Non Zero max required' of 'Service With Max Non Zero'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_WITH_MAX_NON_ZERO__VALIDATE_SERVICE_WITH_MAX_NON_ZERO_MAX_REQUIRED = 295;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Service With Max Non Zero max valid' of 'Service With Max Non Zero'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_WITH_MAX_NON_ZERO__VALIDATE_SERVICE_WITH_MAX_NON_ZERO_MAX_VALID = 296;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Service Conf Report Control nothing' of 'Service Conf Report Control'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_CONF_REPORT_CONTROL__VALIDATE_SERVICE_CONF_REPORT_CONTROL_NOTHING = 297;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Service With Max max Attributes valid' of 'Service With Max And Max Attributes'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__VALIDATE_SERVICE_WITH_MAX_MAX_ATTRIBUTES_VALID = 298;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Service With Max And Modify nothing' of 'Service With Max And Modify'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_WITH_MAX_AND_MODIFY__VALIDATE_SERVICE_WITH_MAX_AND_MODIFY_NOTHING = 299;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Service For Conf Data Set nothing' of 'Service For Conf Data Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_FOR_CONF_DATA_SET__VALIDATE_SERVICE_FOR_CONF_DATA_SET_NOTHING = 300;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Cert common Name required' of 'Cert'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERT__VALIDATE_CERT_COMMON_NAME_REQUIRED = 301;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Cert common Name valid' of 'Cert'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERT__VALIDATE_CERT_COMMON_NAME_VALID = 302;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Cert id Hierarchy required' of 'Cert'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERT__VALIDATE_CERT_ID_HIERARCHY_REQUIRED = 303;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Cert id Hierarchy valid' of 'Cert'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERT__VALIDATE_CERT_ID_HIERARCHY_VALID = 304;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Value With Unit value required' of 'Value With Unit'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VALUE_WITH_UNIT__VALIDATE_VALUE_WITH_UNIT_VALUE_REQUIRED = 305;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Value With Unit unit required' of 'Value With Unit'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VALUE_WITH_UNIT__VALIDATE_VALUE_WITH_UNIT_UNIT_REQUIRED = 306;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Value With Unit unit valid' of 'Value With Unit'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VALUE_WITH_UNIT__VALIDATE_VALUE_WITH_UNIT_UNIT_VALID = 307;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Duration In Sec unit value fixed' of 'Duration In Sec'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DURATION_IN_SEC__VALIDATE_DURATION_IN_SEC_UNIT_VALUE_FIXED = 308;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Duration In Milli Sec value required' of 'Duration In Milli Sec'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DURATION_IN_MILLI_SEC__VALIDATE_DURATION_IN_MILLI_SEC_VALUE_REQUIRED = 309;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Duration In Milli Sec value valid' of 'Duration In Milli Sec'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DURATION_IN_MILLI_SEC__VALIDATE_DURATION_IN_MILLI_SEC_VALUE_VALID = 310;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Duration In Milli Sec unit value fixed' of 'Duration In Milli Sec'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DURATION_IN_MILLI_SEC__VALIDATE_DURATION_IN_MILLI_SEC_UNIT_VALUE_FIXED = 311;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Duration In Milli Sec multiplier value fixed' of 'Duration In Milli Sec'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DURATION_IN_MILLI_SEC__VALIDATE_DURATION_IN_MILLI_SEC_MULTIPLIER_VALUE_FIXED = 312;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Bit Rate In Mb Per Sec value required' of 'Bit Rate In Mb Per Sec'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIT_RATE_IN_MB_PER_SEC__VALIDATE_BIT_RATE_IN_MB_PER_SEC_VALUE_REQUIRED = 313;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Bit Rate In Mb Per Sec value valid' of 'Bit Rate In Mb Per Sec'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIT_RATE_IN_MB_PER_SEC__VALIDATE_BIT_RATE_IN_MB_PER_SEC_VALUE_VALID = 314;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Bit Rate In Mb Per Sec unit value' of 'Bit Rate In Mb Per Sec'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIT_RATE_IN_MB_PER_SEC__VALIDATE_BIT_RATE_IN_MB_PER_SEC_UNIT_VALUE = 315;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Bit Rate In Mb Per Sec multiplier value' of 'Bit Rate In Mb Per Sec'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BIT_RATE_IN_MB_PER_SEC__VALIDATE_BIT_RATE_IN_MB_PER_SEC_MULTIPLIER_VALUE = 316;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Min Time nothing' of 'Min Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIN_TIME__VALIDATE_MIN_TIME_NOTHING = 317;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Max Time nothing' of 'Max Time'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MAX_TIME__VALIDATE_MAX_TIME_NOTHING = 318;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 318;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SclValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SclPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SclPackage.ANY_CONTENT_FROM_OTHER_NAMESPACE:
				return validateAnyContentFromOtherNamespace((AnyContentFromOtherNamespace)value, diagnostics, context);
			case SclPackage.BASE_ELEMENT:
				return validateBaseElement((BaseElement)value, diagnostics, context);
			case SclPackage.HEADER:
				return validateHeader((Header)value, diagnostics, context);
			case SclPackage.HISTORY:
				return validateHistory((History)value, diagnostics, context);
			case SclPackage.HITEM:
				return validateHitem((Hitem)value, diagnostics, context);
			case SclPackage.ID_NAMING:
				return validateIDNaming((IDNaming)value, diagnostics, context);
			case SclPackage.LINE:
				return validateLine((Line)value, diagnostics, context);
			case SclPackage.NAMING:
				return validateNaming((Naming)value, diagnostics, context);
			case SclPackage.PRIVATE:
				return validatePrivate((Private)value, diagnostics, context);
			case SclPackage.PROCESS:
				return validateProcess((fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)value, diagnostics, context);
			case SclPackage.SCL:
				return validateSCL((SCL)value, diagnostics, context);
			case SclPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case SclPackage.ADDRESS:
				return validateAddress((Address)value, diagnostics, context);
			case SclPackage.COMMUNICATION:
				return validateCommunication((Communication)value, diagnostics, context);
			case SclPackage.CONNECTED_AP:
				return validateConnectedAP((ConnectedAP)value, diagnostics, context);
			case SclPackage.CONTROL_BLOCK:
				return validateControlBlock((ControlBlock)value, diagnostics, context);
			case SclPackage.GSE:
				return validateGSE((GSE)value, diagnostics, context);
			case SclPackage.P:
				return validateP((P)value, diagnostics, context);
			case SclPackage.PADDR:
				return validatePAddr((PAddr)value, diagnostics, context);
			case SclPackage.PPHYS_CONN:
				return validateP_PhysConn((P_PhysConn)value, diagnostics, context);
			case SclPackage.PHYS_CONN:
				return validatePhysConn((PhysConn)value, diagnostics, context);
			case SclPackage.SMV:
				return validateSMV((SMV)value, diagnostics, context);
			case SclPackage.SUB_NETWORK:
				return validateSubNetwork((SubNetwork)value, diagnostics, context);
			case SclPackage.ABSTRACT_DATA_ATTRIBUTE:
				return validateAbstractDataAttribute((AbstractDataAttribute)value, diagnostics, context);
			case SclPackage.BDA:
				return validateBDA((BDA)value, diagnostics, context);
			case SclPackage.DA:
				return validateDA((DA)value, diagnostics, context);
			case SclPackage.DA_TYPE:
				return validateDAType((DAType)value, diagnostics, context);
			case SclPackage.DO:
				return validateDO((DO)value, diagnostics, context);
			case SclPackage.DO_TYPE:
				return validateDOType((DOType)value, diagnostics, context);
			case SclPackage.DATA_TYPE_TEMPLATES:
				return validateDataTypeTemplates((DataTypeTemplates)value, diagnostics, context);
			case SclPackage.ENUM_TYPE:
				return validateEnumType((EnumType)value, diagnostics, context);
			case SclPackage.ENUM_VAL:
				return validateEnumVal((EnumVal)value, diagnostics, context);
			case SclPackage.LNODE_TYPE:
				return validateLNodeType((LNodeType)value, diagnostics, context);
			case SclPackage.PROT_NS:
				return validateProtNs((ProtNs)value, diagnostics, context);
			case SclPackage.SDO:
				return validateSDO((SDO)value, diagnostics, context);
			case SclPackage.VAL:
				return validateVal((Val)value, diagnostics, context);
			case SclPackage.ACCESS_CONTROL:
				return validateAccessControl((AccessControl)value, diagnostics, context);
			case SclPackage.ACCESS_POINT:
				return validateAccessPoint((AccessPoint)value, diagnostics, context);
			case SclPackage.ANY_LN:
				return validateAnyLN((AnyLN)value, diagnostics, context);
			case SclPackage.ASSOCIATION:
				return validateAssociation((Association)value, diagnostics, context);
			case SclPackage.AUTHENTICATION:
				return validateAuthentication((Authentication)value, diagnostics, context);
			case SclPackage.CERTIFICATE:
				return validateCertificate((Certificate)value, diagnostics, context);
			case SclPackage.CLIENT_LN:
				return validateClientLN((ClientLN)value, diagnostics, context);
			case SclPackage.CLIENT_SERVICES:
				return validateClientServices((ClientServices)value, diagnostics, context);
			case SclPackage.COMM_PROT:
				return validateCommProt((CommProt)value, diagnostics, context);
			case SclPackage.CONF_DATA_SET:
				return validateConfDataSet((ConfDataSet)value, diagnostics, context);
			case SclPackage.CONF_LNS:
				return validateConfLNs((ConfLNs)value, diagnostics, context);
			case SclPackage.CONF_LD_NAME:
				return validateConfLdName((ConfLdName)value, diagnostics, context);
			case SclPackage.CONF_LOG_CONTROL:
				return validateConfLogControl((ConfLogControl)value, diagnostics, context);
			case SclPackage.CONF_REPORT_CONTROL:
				return validateConfReportControl((ConfReportControl)value, diagnostics, context);
			case SclPackage.CONF_SG:
				return validateConfSG((ConfSG)value, diagnostics, context);
			case SclPackage.CONF_SIG_REF:
				return validateConfSigRef((ConfSigRef)value, diagnostics, context);
			case SclPackage.CONTROL:
				return validateControl((Control)value, diagnostics, context);
			case SclPackage.CONTROL_WITH_IED_NAME:
				return validateControlWithIEDName((ControlWithIEDName)value, diagnostics, context);
			case SclPackage.CONTROL_WITH_TRIGGER_OPT:
				return validateControlWithTriggerOpt((ControlWithTriggerOpt)value, diagnostics, context);
			case SclPackage.DAI:
				return validateDAI((DAI)value, diagnostics, context);
			case SclPackage.DOI:
				return validateDOI((DOI)value, diagnostics, context);
			case SclPackage.DATA_OBJECT_DIRECTORY:
				return validateDataObjectDirectory((DataObjectDirectory)value, diagnostics, context);
			case SclPackage.DATA_SET:
				return validateDataSet((DataSet)value, diagnostics, context);
			case SclPackage.DATA_SET_DIRECTORY:
				return validateDataSetDirectory((DataSetDirectory)value, diagnostics, context);
			case SclPackage.DYN_ASSOCIATION:
				return validateDynAssociation((DynAssociation)value, diagnostics, context);
			case SclPackage.DYN_DATA_SET:
				return validateDynDataSet((DynDataSet)value, diagnostics, context);
			case SclPackage.EXT_REF:
				return validateExtRef((ExtRef)value, diagnostics, context);
			case SclPackage.FCDA:
				return validateFCDA((FCDA)value, diagnostics, context);
			case SclPackage.FILE_HANDLING:
				return validateFileHandling((FileHandling)value, diagnostics, context);
			case SclPackage.GOOSE:
				return validateGOOSE((GOOSE)value, diagnostics, context);
			case SclPackage.GOOSE_SECURITY:
				return validateGOOSESecurity((GOOSESecurity)value, diagnostics, context);
			case SclPackage.GSE_CONTROL:
				return validateGSEControl((GSEControl)value, diagnostics, context);
			case SclPackage.GSE_DIR:
				return validateGSEDir((GSEDir)value, diagnostics, context);
			case SclPackage.GSE_SETTINGS:
				return validateGSESettings((GSESettings)value, diagnostics, context);
			case SclPackage.GSSE:
				return validateGSSE((GSSE)value, diagnostics, context);
			case SclPackage.GET_CB_VALUES:
				return validateGetCBValues((GetCBValues)value, diagnostics, context);
			case SclPackage.GET_DATA_OBJECT_DEFINITION:
				return validateGetDataObjectDefinition((GetDataObjectDefinition)value, diagnostics, context);
			case SclPackage.GET_DATA_SET_VALUE:
				return validateGetDataSetValue((GetDataSetValue)value, diagnostics, context);
			case SclPackage.GET_DIRECTORY:
				return validateGetDirectory((GetDirectory)value, diagnostics, context);
			case SclPackage.IED:
				return validateIED((IED)value, diagnostics, context);
			case SclPackage.IED_NAME:
				return validateIEDName((IEDName)value, diagnostics, context);
			case SclPackage.INPUTS:
				return validateInputs((Inputs)value, diagnostics, context);
			case SclPackage.ISSUER_NAME:
				return validateIssuerName((IssuerName)value, diagnostics, context);
			case SclPackage.KDC:
				return validateKDC((KDC)value, diagnostics, context);
			case SclPackage.LDEVICE:
				return validateLDevice((LDevice)value, diagnostics, context);
			case SclPackage.LN:
				return validateLN((LN)value, diagnostics, context);
			case SclPackage.LN0:
				return validateLN0((LN0)value, diagnostics, context);
			case SclPackage.LOG:
				return validateLog((Log)value, diagnostics, context);
			case SclPackage.LOG_CONTROL:
				return validateLogControl((LogControl)value, diagnostics, context);
			case SclPackage.LOG_SETTINGS:
				return validateLogSettings((LogSettings)value, diagnostics, context);
			case SclPackage.OPT_FIELDS:
				return validateOptFields((OptFields)value, diagnostics, context);
			case SclPackage.PROTOCOL:
				return validateProtocol((Protocol)value, diagnostics, context);
			case SclPackage.READ_WRITE:
				return validateReadWrite((ReadWrite)value, diagnostics, context);
			case SclPackage.RED_PROT:
				return validateRedProt((RedProt)value, diagnostics, context);
			case SclPackage.REPORT_CONTROL:
				return validateReportControl((ReportControl)value, diagnostics, context);
			case SclPackage.REPORT_SETTINGS:
				return validateReportSettings((ReportSettings)value, diagnostics, context);
			case SclPackage.RPT_ENABLED:
				return validateRptEnabled((RptEnabled)value, diagnostics, context);
			case SclPackage.SDI:
				return validateSDI((SDI)value, diagnostics, context);
			case SclPackage.SG_EDIT:
				return validateSGEdit((SGEdit)value, diagnostics, context);
			case SclPackage.SMV_SECURITY:
				return validateSMVSecurity((SMVSecurity)value, diagnostics, context);
			case SclPackage.SMV_SETTINGS:
				return validateSMVSettings((SMVSettings)value, diagnostics, context);
			case SclPackage.SM_VSC:
				return validateSMVsc((SMVsc)value, diagnostics, context);
			case SclPackage.SAMPLED_VALUE_CONTROL:
				return validateSampledValueControl((SampledValueControl)value, diagnostics, context);
			case SclPackage.SERVER:
				return validateServer((Server)value, diagnostics, context);
			case SclPackage.SERVER_AT:
				return validateServerAt((ServerAt)value, diagnostics, context);
			case SclPackage.SERVICE_SETTINGS:
				return validateServiceSettings((ServiceSettings)value, diagnostics, context);
			case SclPackage.SERVICE_WITH_MAX:
				return validateServiceWithMax((ServiceWithMax)value, diagnostics, context);
			case SclPackage.SERVICES:
				return validateServices((Services)value, diagnostics, context);
			case SclPackage.SET_DATA_SET_VALUE:
				return validateSetDataSetValue((SetDataSetValue)value, diagnostics, context);
			case SclPackage.SETTING_CONTROL:
				return validateSettingControl((SettingControl)value, diagnostics, context);
			case SclPackage.SETTING_GROUPS:
				return validateSettingGroups((SettingGroups)value, diagnostics, context);
			case SclPackage.SMV_OPTS:
				return validateSmvOpts((SmvOpts)value, diagnostics, context);
			case SclPackage.SUBJECT:
				return validateSubject((Subject)value, diagnostics, context);
			case SclPackage.SUP_SUBSCRIPTION:
				return validateSupSubscription((SupSubscription)value, diagnostics, context);
			case SclPackage.TIME_SYNC_PROT:
				return validateTimeSyncProt((TimeSyncProt)value, diagnostics, context);
			case SclPackage.TIMER_ACTIVATED_CONTROL:
				return validateTimerActivatedControl((TimerActivatedControl)value, diagnostics, context);
			case SclPackage.TRG_OPS:
				return validateTrgOps((TrgOps)value, diagnostics, context);
			case SclPackage.VALUE_HANDLING:
				return validateValueHandling((ValueHandling)value, diagnostics, context);
			case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT:
				return validateAbstractConductingEquipment((AbstractConductingEquipment)value, diagnostics, context);
			case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC:
				return validateAbstractEqFuncSubFunc((AbstractEqFuncSubFunc)value, diagnostics, context);
			case SclPackage.BAY:
				return validateBay((Bay)value, diagnostics, context);
			case SclPackage.CONDUCTING_EQUIPMENT:
				return validateConductingEquipment((ConductingEquipment)value, diagnostics, context);
			case SclPackage.CONNECTIVITY_NODE:
				return validateConnectivityNode((ConnectivityNode)value, diagnostics, context);
			case SclPackage.EQ_FUNCTION:
				return validateEqFunction((EqFunction)value, diagnostics, context);
			case SclPackage.EQ_SUB_FUNCTION:
				return validateEqSubFunction((EqSubFunction)value, diagnostics, context);
			case SclPackage.EQUIPMENT:
				return validateEquipment((Equipment)value, diagnostics, context);
			case SclPackage.EQUIPMENT_CONTAINER:
				return validateEquipmentContainer((EquipmentContainer)value, diagnostics, context);
			case SclPackage.FUNCTION:
				return validateFunction((Function)value, diagnostics, context);
			case SclPackage.GENERAL_EQUIPMENT:
				return validateGeneralEquipment((GeneralEquipment)value, diagnostics, context);
			case SclPackage.GENERAL_EQUIPMENT_CONTAINER:
				return validateGeneralEquipmentContainer((GeneralEquipmentContainer)value, diagnostics, context);
			case SclPackage.LNODE:
				return validateLNode((LNode)value, diagnostics, context);
			case SclPackage.LNODE_CONTAINER:
				return validateLNodeContainer((LNodeContainer)value, diagnostics, context);
			case SclPackage.NEUTRAL_POINT:
				return validateNeutralPoint((NeutralPoint)value, diagnostics, context);
			case SclPackage.POWER_SYSTEM_RESOURCE:
				return validatePowerSystemResource((PowerSystemResource)value, diagnostics, context);
			case SclPackage.POWER_TRANSFORMER:
				return validatePowerTransformer((PowerTransformer)value, diagnostics, context);
			case SclPackage.SUB_EQUIPMENT:
				return validateSubEquipment((SubEquipment)value, diagnostics, context);
			case SclPackage.SUB_FUNCTION:
				return validateSubFunction((SubFunction)value, diagnostics, context);
			case SclPackage.SUBSTATION:
				return validateSubstation((Substation)value, diagnostics, context);
			case SclPackage.TAP_CHANGER:
				return validateTapChanger((TapChanger)value, diagnostics, context);
			case SclPackage.TERMINAL:
				return validateTerminal((Terminal)value, diagnostics, context);
			case SclPackage.TRANSFORMER_WINDING:
				return validateTransformerWinding((TransformerWinding)value, diagnostics, context);
			case SclPackage.VOLTAGE:
				return validateVoltage((Voltage)value, diagnostics, context);
			case SclPackage.VOLTAGE_LEVEL:
				return validateVoltageLevel((VoltageLevel)value, diagnostics, context);
			case SclPackage.EXPLICIT_LINK_RESOLVER:
				return validateExplicitLinkResolver((ExplicitLinkResolver)value, diagnostics, context);
			case SclPackage.DATA_OBJECT:
				return validateDataObject((DataObject)value, diagnostics, context);
			case SclPackage.DATA_ATTRIBUTE:
				return validateDataAttribute((DataAttribute)value, diagnostics, context);
			case SclPackage.SCL_OBJECT:
				return validateSclObject((SclObject)value, diagnostics, context);
			case SclPackage.UN_NAMING:
				return validateUnNaming((UnNaming)value, diagnostics, context);
			case SclPackage.SERVICE_YES_NO:
				return validateServiceYesNo((ServiceYesNo)value, diagnostics, context);
			case SclPackage.SERVICE_WITH_OPTIONAL_MAX:
				return validateServiceWithOptionalMax((ServiceWithOptionalMax)value, diagnostics, context);
			case SclPackage.SERVICE_WITH_MAX_NON_ZERO:
				return validateServiceWithMaxNonZero((ServiceWithMaxNonZero)value, diagnostics, context);
			case SclPackage.SERVICE_CONF_REPORT_CONTROL:
				return validateServiceConfReportControl((ServiceConfReportControl)value, diagnostics, context);
			case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES:
				return validateServiceWithMaxAndMaxAttributes((ServiceWithMaxAndMaxAttributes)value, diagnostics, context);
			case SclPackage.SERVICE_WITH_MAX_AND_MODIFY:
				return validateServiceWithMaxAndModify((ServiceWithMaxAndModify)value, diagnostics, context);
			case SclPackage.SERVICE_FOR_CONF_DATA_SET:
				return validateServiceForConfDataSet((ServiceForConfDataSet)value, diagnostics, context);
			case SclPackage.CERT:
				return validateCert((Cert)value, diagnostics, context);
			case SclPackage.VALUE_WITH_UNIT:
				return validateValueWithUnit((ValueWithUnit)value, diagnostics, context);
			case SclPackage.DURATION_IN_SEC:
				return validateDurationInSec((DurationInSec)value, diagnostics, context);
			case SclPackage.DURATION_IN_MILLI_SEC:
				return validateDurationInMilliSec((DurationInMilliSec)value, diagnostics, context);
			case SclPackage.BIT_RATE_IN_MB_PER_SEC:
				return validateBitRateInMbPerSec((BitRateInMbPerSec)value, diagnostics, context);
			case SclPackage.MIN_TIME:
				return validateMinTime((MinTime)value, diagnostics, context);
			case SclPackage.MAX_TIME:
				return validateMaxTime((MaxTime)value, diagnostics, context);
			case SclPackage.BIT_RATE:
				return validateBitRate((BitRate)value, diagnostics, context);
			case SclPackage.SMP_RATE:
				return validateSmpRate((SmpRate)value, diagnostics, context);
			case SclPackage.SAMPLES_PER_SEC:
				return validateSamplesPerSec((SamplesPerSec)value, diagnostics, context);
			case SclPackage.SEC_PER_SAMPLES:
				return validateSecPerSamples((SecPerSamples)value, diagnostics, context);
			case SclPackage.ASSOCIATION_KIND_ENUM:
				return validateAssociationKindEnum((AssociationKindEnum)value, diagnostics, context);
			case SclPackage.FC_ENUM:
				return validateFCEnum((FCEnum)value, diagnostics, context);
			case SclPackage.GSE_CONTROL_TYPE_ENUM:
				return validateGSEControlTypeEnum((GSEControlTypeEnum)value, diagnostics, context);
			case SclPackage.PHASE_ENUM:
				return validatePhaseEnum((PhaseEnum)value, diagnostics, context);
			case SclPackage.PREDEFINED_TYPE_OF_SECURITY_ENUM:
				return validatePredefinedTypeOfSecurityEnum((PredefinedTypeOfSecurityEnum)value, diagnostics, context);
			case SclPackage.SMV_DELIVERY_ENUM:
				return validateSMVDeliveryEnum((SMVDeliveryEnum)value, diagnostics, context);
			case SclPackage.SERVICE_SETTINGS_ENUM:
				return validateServiceSettingsEnum((ServiceSettingsEnum)value, diagnostics, context);
			case SclPackage.SERVICE_SETTINGS_NO_DYN_ENUM:
				return validateServiceSettingsNoDynEnum((ServiceSettingsNoDynEnum)value, diagnostics, context);
			case SclPackage.SERVICE_TYPE:
				return validateServiceType((ServiceType)value, diagnostics, context);
			case SclPackage.SMP_MOD:
				return validateSmpMod((SmpMod)value, diagnostics, context);
			case SclPackage.UNIT_MULTIPLIER_ENUM:
				return validateUnitMultiplierEnum((UnitMultiplierEnum)value, diagnostics, context);
			case SclPackage.VAL_KIND_ENUM:
				return validateValKindEnum((ValKindEnum)value, diagnostics, context);
			case SclPackage.BUF_MODE_ENUM:
				return validatebufModeEnum((bufModeEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyContentFromOtherNamespace(AnyContentFromOtherNamespace anyContentFromOtherNamespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anyContentFromOtherNamespace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseElement(BaseElement baseElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeader(Header header, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(header, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(header, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(header, diagnostics, context);
		if (result || diagnostics != null) result &= validateHeader_validateHeader_id_required(header, diagnostics, context);
		if (result || diagnostics != null) result &= validateHeader_validateHeader_nameStructure_value_IEDName(header, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHeader_id_required constraint of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeader_validateHeader_id_required(Header header, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return header.validateHeader_id_required(diagnostics, context);
	}

	/**
	 * Validates the validateHeader_nameStructure_value_IEDName constraint of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeader_validateHeader_nameStructure_value_IEDName(Header header, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return header.validateHeader_nameStructure_value_IEDName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistory(History history, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(history, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(history, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(history, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(history, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(history, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(history, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(history, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(history, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(history, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistory_validateHistory_at_least_one_Hitem_required(history, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHistory_at_least_one_Hitem_required constraint of '<em>History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistory_validateHistory_at_least_one_Hitem_required(History history, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return history.validateHistory_at_least_one_Hitem_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHitem(Hitem hitem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hitem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hitem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hitem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hitem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hitem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hitem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hitem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hitem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hitem, diagnostics, context);
		if (result || diagnostics != null) result &= validateHitem_validateHitem_version_required(hitem, diagnostics, context);
		if (result || diagnostics != null) result &= validateHitem_validateHitem_revision_required(hitem, diagnostics, context);
		if (result || diagnostics != null) result &= validateHitem_validateHitem_when_required(hitem, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHitem_version_required constraint of '<em>Hitem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHitem_validateHitem_version_required(Hitem hitem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hitem.validateHitem_version_required(diagnostics, context);
	}

	/**
	 * Validates the validateHitem_revision_required constraint of '<em>Hitem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHitem_validateHitem_revision_required(Hitem hitem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hitem.validateHitem_revision_required(diagnostics, context);
	}

	/**
	 * Validates the validateHitem_when_required constraint of '<em>Hitem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHitem_validateHitem_when_required(Hitem hitem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return hitem.validateHitem_when_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDNaming(IDNaming idNaming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(idNaming, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(idNaming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(idNaming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(idNaming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(idNaming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(idNaming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(idNaming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(idNaming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(idNaming, diagnostics, context);
		if (result || diagnostics != null) result &= validateIDNaming_validateIDNaming_id_required(idNaming, diagnostics, context);
		if (result || diagnostics != null) result &= validateIDNaming_validateIDNaming_id_valid(idNaming, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIDNaming_id_required constraint of '<em>ID Naming</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDNaming_validateIDNaming_id_required(IDNaming idNaming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return idNaming.validateIDNaming_id_required(diagnostics, context);
	}

	/**
	 * Validates the validateIDNaming_id_valid constraint of '<em>ID Naming</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIDNaming_validateIDNaming_id_valid(IDNaming idNaming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return idNaming.validateIDNaming_id_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLine(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(line, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(line, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(line, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(line, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(line, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(line, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(line, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEquipmentContainer_validateGeneralEquipmentContainer_nothing(line, diagnostics, context);
		if (result || diagnostics != null) result &= validateLine_validateLine_type_valid(line, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLine_type_valid constraint of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLine_validateLine_type_valid(Line line, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return line.validateLine_type_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaming(Naming naming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(naming, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(naming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(naming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(naming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(naming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(naming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(naming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(naming, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(naming, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(naming, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(naming, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateNaming_name_required constraint of '<em>Naming</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaming_validateNaming_name_required(Naming naming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return naming.validateNaming_name_required(diagnostics, context);
	}

	/**
	 * Validates the validateNaming_name_valid constraint of '<em>Naming</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaming_validateNaming_name_valid(Naming naming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return naming.validateNaming_name_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivate(Private private_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(private_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(private_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(private_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(private_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(private_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(private_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(private_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(private_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(private_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivate_validatePrivate_type_required(private_, diagnostics, context);
		if (result || diagnostics != null) result &= validatePrivate_validatePrivate_type_valid(private_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePrivate_type_required constraint of '<em>Private</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivate_validatePrivate_type_required(Private private_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return private_.validatePrivate_type_required(diagnostics, context);
	}

	/**
	 * Validates the validatePrivate_type_valid constraint of '<em>Private</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivate_validatePrivate_type_valid(Private private_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return private_.validatePrivate_type_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(fr.centralesupelec.edf.riseclipse.iec61850.scl.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(process, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEquipmentContainer_validateGeneralEquipmentContainer_nothing(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_validateProcess_type_valid(process, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProcess_type_valid constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_validateProcess_type_valid(fr.centralesupelec.edf.riseclipse.iec61850.scl.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return process.validateProcess_type_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL(SCL scl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSCL_validateSCL_version_required(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSCL_validateSCL_version_valid(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSCL_validateSCL_version_value_2007(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSCL_validateSCL_revision_required(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSCL_validateSCL_revision_valid(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSCL_validateSCL_revision_value_B(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSCL_validateSCL_release_value_1(scl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSCL_validateSCL_one_Header_required(scl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSCL_version_required constraint of '<em>SCL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_validateSCL_version_required(SCL scl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scl.validateSCL_version_required(diagnostics, context);
	}

	/**
	 * Validates the validateSCL_version_valid constraint of '<em>SCL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_validateSCL_version_valid(SCL scl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scl.validateSCL_version_valid(diagnostics, context);
	}

	/**
	 * Validates the validateSCL_version_value_2007 constraint of '<em>SCL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_validateSCL_version_value_2007(SCL scl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scl.validateSCL_version_value_2007(diagnostics, context);
	}

	/**
	 * Validates the validateSCL_revision_required constraint of '<em>SCL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_validateSCL_revision_required(SCL scl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scl.validateSCL_revision_required(diagnostics, context);
	}

	/**
	 * Validates the validateSCL_revision_valid constraint of '<em>SCL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_validateSCL_revision_valid(SCL scl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scl.validateSCL_revision_valid(diagnostics, context);
	}

	/**
	 * Validates the validateSCL_revision_value_B constraint of '<em>SCL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_validateSCL_revision_value_B(SCL scl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scl.validateSCL_revision_value_B(diagnostics, context);
	}

	/**
	 * Validates the validateSCL_release_value_1 constraint of '<em>SCL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_validateSCL_release_value_1(SCL scl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scl.validateSCL_release_value_1(diagnostics, context);
	}

	/**
	 * Validates the validateSCL_one_Header_required constraint of '<em>SCL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSCL_validateSCL_one_Header_required(SCL scl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scl.validateSCL_one_Header_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(address, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(address, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(address, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddress_validateAddress_nothing(address, diagnostics, context);
		if (result || diagnostics != null) result &= validateAddress_validateAddress_at_least_one_P_required(address, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAddress_nothing constraint of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress_validateAddress_nothing(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return address.validateAddress_nothing(diagnostics, context);
	}

	/**
	 * Validates the validateAddress_at_least_one_P_required constraint of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddress_validateAddress_at_least_one_P_required(Address address, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return address.validateAddress_at_least_one_P_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunication(Communication communication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(communication, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(communication, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(communication, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommunication_validateCommunication_nothing(communication, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommunication_validateCommunication_at_least_one_SubNetwork_required(communication, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCommunication_nothing constraint of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunication_validateCommunication_nothing(Communication communication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return communication.validateCommunication_nothing(diagnostics, context);
	}

	/**
	 * Validates the validateCommunication_at_least_one_SubNetwork_required constraint of '<em>Communication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunication_validateCommunication_at_least_one_SubNetwork_required(Communication communication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return communication.validateCommunication_at_least_one_SubNetwork_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP(ConnectedAP connectedAP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectedAP, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectedAP_validateConnectedAP_iedName_required(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectedAP_validateConnectedAP_iedName_valid(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectedAP_validateConnectedAP_apName_required(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectedAP_validateConnectedAP_apName_valid(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectedAP_validateConnectedAP_redProt_valid(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectedAP_validateConnectedAP_at_most_one_PhysConnTypeRedConn_required(connectedAP, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectedAP_validateConnectedAP_at_most_one_PhysConnTypeConnection_required(connectedAP, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConnectedAP_iedName_required constraint of '<em>Connected AP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_validateConnectedAP_iedName_required(ConnectedAP connectedAP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectedAP.validateConnectedAP_iedName_required(diagnostics, context);
	}

	/**
	 * Validates the validateConnectedAP_iedName_valid constraint of '<em>Connected AP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_validateConnectedAP_iedName_valid(ConnectedAP connectedAP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectedAP.validateConnectedAP_iedName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateConnectedAP_apName_required constraint of '<em>Connected AP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_validateConnectedAP_apName_required(ConnectedAP connectedAP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectedAP.validateConnectedAP_apName_required(diagnostics, context);
	}

	/**
	 * Validates the validateConnectedAP_apName_valid constraint of '<em>Connected AP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_validateConnectedAP_apName_valid(ConnectedAP connectedAP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectedAP.validateConnectedAP_apName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateConnectedAP_redProt_valid constraint of '<em>Connected AP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_validateConnectedAP_redProt_valid(ConnectedAP connectedAP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectedAP.validateConnectedAP_redProt_valid(diagnostics, context);
	}

	/**
	 * Validates the validateConnectedAP_at_most_one_PhysConnTypeRedConn_required constraint of '<em>Connected AP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_validateConnectedAP_at_most_one_PhysConnTypeRedConn_required(ConnectedAP connectedAP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectedAP.validateConnectedAP_at_most_one_PhysConnTypeRedConn_required(diagnostics, context);
	}

	/**
	 * Validates the validateConnectedAP_at_most_one_PhysConnTypeConnection_required constraint of '<em>Connected AP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectedAP_validateConnectedAP_at_most_one_PhysConnTypeConnection_required(ConnectedAP connectedAP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectedAP.validateConnectedAP_at_most_one_PhysConnTypeConnection_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlBlock(ControlBlock controlBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlBlock, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controlBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controlBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controlBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controlBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controlBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_ldInst_required(controlBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_ldInst_valid(controlBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_cbName_required(controlBlock, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_cbName_valid(controlBlock, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateControlBlock_ldInst_required constraint of '<em>Control Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlBlock_validateControlBlock_ldInst_required(ControlBlock controlBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return controlBlock.validateControlBlock_ldInst_required(diagnostics, context);
	}

	/**
	 * Validates the validateControlBlock_ldInst_valid constraint of '<em>Control Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlBlock_validateControlBlock_ldInst_valid(ControlBlock controlBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return controlBlock.validateControlBlock_ldInst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateControlBlock_cbName_required constraint of '<em>Control Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlBlock_validateControlBlock_cbName_required(ControlBlock controlBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return controlBlock.validateControlBlock_cbName_required(diagnostics, context);
	}

	/**
	 * Validates the validateControlBlock_cbName_valid constraint of '<em>Control Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlBlock_validateControlBlock_cbName_valid(ControlBlock controlBlock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return controlBlock.validateControlBlock_cbName_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSE(GSE gse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_ldInst_required(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_ldInst_valid(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_cbName_required(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_cbName_valid(gse, diagnostics, context);
		if (result || diagnostics != null) result &= validateGSE_validateGSE_nothing(gse, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateGSE_nothing constraint of '<em>GSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSE_validateGSE_nothing(GSE gse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gse.validateGSE_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP(P p, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(p, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(p, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(p, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(p, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(p, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(p, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(p, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(p, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(p, diagnostics, context);
		if (result || diagnostics != null) result &= validateP_validateP_type_required(p, diagnostics, context);
		if (result || diagnostics != null) result &= validateP_validateP_type_valid(p, diagnostics, context);
		if (result || diagnostics != null) result &= validateP_validateP_value(p, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateP_type_required constraint of '<em>P</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP_validateP_type_required(P p, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return p.validateP_type_required(diagnostics, context);
	}

	/**
	 * Validates the validateP_type_valid constraint of '<em>P</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP_validateP_type_valid(P p, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return p.validateP_type_valid(diagnostics, context);
	}

	/**
	 * Validates the validateP_value constraint of '<em>P</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP_validateP_value(P p, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return p.validateP_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePAddr(PAddr pAddr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pAddr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP_PhysConn(P_PhysConn p_PhysConn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(p_PhysConn, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(p_PhysConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(p_PhysConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(p_PhysConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(p_PhysConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(p_PhysConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(p_PhysConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(p_PhysConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(p_PhysConn, diagnostics, context);
		if (result || diagnostics != null) result &= validateP_PhysConn_validateP_PhysConn_type_required(p_PhysConn, diagnostics, context);
		if (result || diagnostics != null) result &= validateP_PhysConn_validateP_PhysConn_type_valid(p_PhysConn, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateP_PhysConn_type_required constraint of '<em>PPhys Conn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP_PhysConn_validateP_PhysConn_type_required(P_PhysConn p_PhysConn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return p_PhysConn.validateP_PhysConn_type_required(diagnostics, context);
	}

	/**
	 * Validates the validateP_PhysConn_type_valid constraint of '<em>PPhys Conn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP_PhysConn_validateP_PhysConn_type_valid(P_PhysConn p_PhysConn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return p_PhysConn.validateP_PhysConn_type_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysConn(PhysConn physConn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(physConn, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(physConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(physConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(physConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(physConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(physConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(physConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(physConn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(physConn, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysConn_validatePhysConn_type_required(physConn, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysConn_validatePhysConn_type_valid(physConn, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePhysConn_type_required constraint of '<em>Phys Conn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysConn_validatePhysConn_type_required(PhysConn physConn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physConn.validatePhysConn_type_required(diagnostics, context);
	}

	/**
	 * Validates the validatePhysConn_type_valid constraint of '<em>Phys Conn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysConn_validatePhysConn_type_valid(PhysConn physConn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physConn.validatePhysConn_type_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSMV(SMV smv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(smv, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_ldInst_required(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_ldInst_valid(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_cbName_required(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlBlock_validateControlBlock_cbName_valid(smv, diagnostics, context);
		if (result || diagnostics != null) result &= validateSMV_validateSMV_nothing(smv, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSMV_nothing constraint of '<em>SMV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSMV_validateSMV_nothing(SMV smv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return smv.validateSMV_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubNetwork(SubNetwork subNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subNetwork, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(subNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(subNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubNetwork_validateSubNetwork_nothing(subNetwork, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubNetwork_validateSubNetwork_at_least_one_ConnectedAP_required(subNetwork, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSubNetwork_nothing constraint of '<em>Sub Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubNetwork_validateSubNetwork_nothing(SubNetwork subNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subNetwork.validateSubNetwork_nothing(diagnostics, context);
	}

	/**
	 * Validates the validateSubNetwork_at_least_one_ConnectedAP_required constraint of '<em>Sub Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubNetwork_validateSubNetwork_at_least_one_ConnectedAP_required(SubNetwork subNetwork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subNetwork.validateSubNetwork_at_least_one_ConnectedAP_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDataAttribute(AbstractDataAttribute abstractDataAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractDataAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_required(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_valid(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_bType_required(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_bType_valid(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_type_valid(abstractDataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_count_valid(abstractDataAttribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAbstractDataAttribute_bType_required constraint of '<em>Abstract Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDataAttribute_validateAbstractDataAttribute_bType_required(AbstractDataAttribute abstractDataAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return abstractDataAttribute.validateAbstractDataAttribute_bType_required(diagnostics, context);
	}

	/**
	 * Validates the validateAbstractDataAttribute_bType_valid constraint of '<em>Abstract Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDataAttribute_validateAbstractDataAttribute_bType_valid(AbstractDataAttribute abstractDataAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return abstractDataAttribute.validateAbstractDataAttribute_bType_valid(diagnostics, context);
	}

	/**
	 * Validates the validateAbstractDataAttribute_type_valid constraint of '<em>Abstract Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDataAttribute_validateAbstractDataAttribute_type_valid(AbstractDataAttribute abstractDataAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return abstractDataAttribute.validateAbstractDataAttribute_type_valid(diagnostics, context);
	}

	/**
	 * Validates the validateAbstractDataAttribute_count_valid constraint of '<em>Abstract Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDataAttribute_validateAbstractDataAttribute_count_valid(AbstractDataAttribute abstractDataAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return abstractDataAttribute.validateAbstractDataAttribute_count_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBDA(BDA bda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bda, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_required(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_valid(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_bType_required(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_bType_valid(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_type_valid(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_count_valid(bda, diagnostics, context);
		if (result || diagnostics != null) result &= validateBDA_validateBDA_nothing(bda, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateBDA_nothing constraint of '<em>BDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBDA_validateBDA_nothing(BDA bda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bda.validateBDA_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDA(DA da, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(da, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(da, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(da, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(da, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(da, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(da, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(da, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(da, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(da, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_required(da, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_valid(da, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_bType_required(da, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_bType_valid(da, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_type_valid(da, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractDataAttribute_validateAbstractDataAttribute_count_valid(da, diagnostics, context);
		if (result || diagnostics != null) result &= validateDA_validateDA_fc_required(da, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDA_fc_required constraint of '<em>DA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDA_validateDA_fc_required(DA da, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return da.validateDA_fc_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAType(DAType daType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daType, diagnostics, context);
		if (result || diagnostics != null) result &= validateIDNaming_validateIDNaming_id_required(daType, diagnostics, context);
		if (result || diagnostics != null) result &= validateIDNaming_validateIDNaming_id_valid(daType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDAType_validateDAType_nothing(daType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDAType_validateDAType_at_least_one_BDA_required(daType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDAType_nothing constraint of '<em>DA Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAType_validateDAType_nothing(DAType daType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return daType.validateDAType_nothing(diagnostics, context);
	}

	/**
	 * Validates the validateDAType_at_least_one_BDA_required constraint of '<em>DA Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAType_validateDAType_at_least_one_BDA_required(DAType daType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return daType.validateDAType_at_least_one_BDA_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDO(DO do_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(do_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(do_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(do_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(do_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(do_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(do_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(do_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(do_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(do_, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObject_validateDataObject_name_required(do_, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObject_validateDataObject_name_valid(do_, diagnostics, context);
		if (result || diagnostics != null) result &= validateDO_validateDO_type_required(do_, diagnostics, context);
		if (result || diagnostics != null) result &= validateDO_validateDO_type_valid(do_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDO_type_required constraint of '<em>DO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDO_validateDO_type_required(DO do_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return do_.validateDO_type_required(diagnostics, context);
	}

	/**
	 * Validates the validateDO_type_valid constraint of '<em>DO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDO_validateDO_type_valid(DO do_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return do_.validateDO_type_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOType(DOType doType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(doType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validateIDNaming_validateIDNaming_id_required(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validateIDNaming_validateIDNaming_id_valid(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOType_validateDOType_cdc_required(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOType_validateDOType_cdc_valid(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOType_validateDOType_iedType_valid(doType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOType_validateDOType_at_least_one_SDO_or_DA_required(doType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDOType_cdc_required constraint of '<em>DO Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOType_validateDOType_cdc_required(DOType doType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return doType.validateDOType_cdc_required(diagnostics, context);
	}

	/**
	 * Validates the validateDOType_cdc_valid constraint of '<em>DO Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOType_validateDOType_cdc_valid(DOType doType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return doType.validateDOType_cdc_valid(diagnostics, context);
	}

	/**
	 * Validates the validateDOType_iedType_valid constraint of '<em>DO Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOType_validateDOType_iedType_valid(DOType doType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return doType.validateDOType_iedType_valid(diagnostics, context);
	}

	/**
	 * Validates the validateDOType_at_least_one_SDO_or_DA_required constraint of '<em>DO Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOType_validateDOType_at_least_one_SDO_or_DA_required(DOType doType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return doType.validateDOType_at_least_one_SDO_or_DA_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTemplates(DataTypeTemplates dataTypeTemplates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataTypeTemplates, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataTypeTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataTypeTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataTypeTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataTypeTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataTypeTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataTypeTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataTypeTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataTypeTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataTypeTemplates_validateDataTypeTemplates_nothing(dataTypeTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataTypeTemplates_validateDataTypeTemplates_at_least_one_LNodeType_required(dataTypeTemplates, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataTypeTemplates_validateDataTypeTemplates_at_least_one_DOType_required(dataTypeTemplates, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDataTypeTemplates_nothing constraint of '<em>Data Type Templates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTemplates_validateDataTypeTemplates_nothing(DataTypeTemplates dataTypeTemplates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataTypeTemplates.validateDataTypeTemplates_nothing(diagnostics, context);
	}

	/**
	 * Validates the validateDataTypeTemplates_at_least_one_LNodeType_required constraint of '<em>Data Type Templates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTemplates_validateDataTypeTemplates_at_least_one_LNodeType_required(DataTypeTemplates dataTypeTemplates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataTypeTemplates.validateDataTypeTemplates_at_least_one_LNodeType_required(diagnostics, context);
	}

	/**
	 * Validates the validateDataTypeTemplates_at_least_one_DOType_required constraint of '<em>Data Type Templates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeTemplates_validateDataTypeTemplates_at_least_one_DOType_required(DataTypeTemplates dataTypeTemplates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataTypeTemplates.validateDataTypeTemplates_at_least_one_DOType_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumType(EnumType enumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validateIDNaming_validateIDNaming_id_required(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validateIDNaming_validateIDNaming_id_valid(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumType_validateEnumType_nothing(enumType, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumType_validateEnumType_at_least_one_EnumVal_required(enumType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEnumType_nothing constraint of '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumType_validateEnumType_nothing(EnumType enumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return enumType.validateEnumType_nothing(diagnostics, context);
	}

	/**
	 * Validates the validateEnumType_at_least_one_EnumVal_required constraint of '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumType_validateEnumType_at_least_one_EnumVal_required(EnumType enumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return enumType.validateEnumType_at_least_one_EnumVal_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumVal(EnumVal enumVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enumVal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enumVal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enumVal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enumVal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enumVal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enumVal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enumVal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enumVal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enumVal, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnumVal_validateEnumVal_ord_required(enumVal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEnumVal_ord_required constraint of '<em>Enum Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumVal_validateEnumVal_ord_required(EnumVal enumVal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return enumVal.validateEnumVal_ord_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNodeType(LNodeType lNodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lNodeType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateIDNaming_validateIDNaming_id_required(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateIDNaming_validateIDNaming_id_valid(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeType_validateLNodeType_lnClass_required(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeType_validateLNodeType_lnClass_valid(lNodeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeType_validateHistory_at_least_one_DO_required(lNodeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLNodeType_lnClass_required constraint of '<em>LNode Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNodeType_validateLNodeType_lnClass_required(LNodeType lNodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNodeType.validateLNodeType_lnClass_required(diagnostics, context);
	}

	/**
	 * Validates the validateLNodeType_lnClass_valid constraint of '<em>LNode Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNodeType_validateLNodeType_lnClass_valid(LNodeType lNodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNodeType.validateLNodeType_lnClass_valid(diagnostics, context);
	}

	/**
	 * Validates the validateHistory_at_least_one_DO_required constraint of '<em>LNode Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNodeType_validateHistory_at_least_one_DO_required(LNodeType lNodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNodeType.validateHistory_at_least_one_DO_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtNs(ProtNs protNs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protNs, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protNs, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtNs_validateProtNs_value_required(protNs, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtNs_validateProtNs_value_valid(protNs, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtNs_validateProtNs_type_valid(protNs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProtNs_value_required constraint of '<em>Prot Ns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtNs_validateProtNs_value_required(ProtNs protNs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protNs.validateProtNs_value_required(diagnostics, context);
	}

	/**
	 * Validates the validateProtNs_value_valid constraint of '<em>Prot Ns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtNs_validateProtNs_value_valid(ProtNs protNs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protNs.validateProtNs_value_valid(diagnostics, context);
	}

	/**
	 * Validates the validateProtNs_type_valid constraint of '<em>Prot Ns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtNs_validateProtNs_type_valid(ProtNs protNs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protNs.validateProtNs_type_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDO(SDO sdo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sdo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validateSDO_validateSDO_name_required(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validateSDO_validateSDO_name_valid(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validateSDO_validateSDO_type_required(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validateSDO_validateSDO_type_valid(sdo, diagnostics, context);
		if (result || diagnostics != null) result &= validateSDO_validateSDO_count_valid(sdo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSDO_name_required constraint of '<em>SDO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDO_validateSDO_name_required(SDO sdo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sdo.validateSDO_name_required(diagnostics, context);
	}

	/**
	 * Validates the validateSDO_name_valid constraint of '<em>SDO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDO_validateSDO_name_valid(SDO sdo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sdo.validateSDO_name_valid(diagnostics, context);
	}

	/**
	 * Validates the validateSDO_type_required constraint of '<em>SDO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDO_validateSDO_type_required(SDO sdo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sdo.validateSDO_type_required(diagnostics, context);
	}

	/**
	 * Validates the validateSDO_type_valid constraint of '<em>SDO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDO_validateSDO_type_valid(SDO sdo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sdo.validateSDO_type_valid(diagnostics, context);
	}

	/**
	 * Validates the validateSDO_count_valid constraint of '<em>SDO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDO_validateSDO_count_valid(SDO sdo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sdo.validateSDO_count_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVal(Val val, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(val, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(val, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(val, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(val, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(val, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(val, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(val, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(val, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(val, diagnostics, context);
		if (result || diagnostics != null) result &= validateVal_validateVal_sGroup_valid(val, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVal_sGroup_valid constraint of '<em>Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVal_validateVal_sGroup_valid(Val val, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return val.validateVal_sGroup_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControl(AccessControl accessControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accessControl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accessControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accessControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accessControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accessControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accessControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accessControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accessControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accessControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessControl_validateAccessControl_nothing(accessControl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAccessControl_nothing constraint of '<em>Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControl_validateAccessControl_nothing(AccessControl accessControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return accessControl.validateAccessControl_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint(AccessPoint accessPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accessPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessPoint_validateAccessPoint_name_required(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessPoint_validateAccessPoint_name_valid(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessPoint_validateAccessPoint_restriction_on_content(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessPoint_validateAccessPoint_at_most_securities(accessPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessPoint_validateAccessPoint_securities_allowed(accessPoint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAccessPoint_name_required constraint of '<em>Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint_validateAccessPoint_name_required(AccessPoint accessPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return accessPoint.validateAccessPoint_name_required(diagnostics, context);
	}

	/**
	 * Validates the validateAccessPoint_name_valid constraint of '<em>Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint_validateAccessPoint_name_valid(AccessPoint accessPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return accessPoint.validateAccessPoint_name_valid(diagnostics, context);
	}

	/**
	 * Validates the validateAccessPoint_restriction_on_content constraint of '<em>Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint_validateAccessPoint_restriction_on_content(AccessPoint accessPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return accessPoint.validateAccessPoint_restriction_on_content(diagnostics, context);
	}

	/**
	 * Validates the validateAccessPoint_at_most_securities constraint of '<em>Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint_validateAccessPoint_at_most_securities(AccessPoint accessPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return accessPoint.validateAccessPoint_at_most_securities(diagnostics, context);
	}

	/**
	 * Validates the validateAccessPoint_securities_allowed constraint of '<em>Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessPoint_validateAccessPoint_securities_allowed(AccessPoint accessPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return accessPoint.validateAccessPoint_securities_allowed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyLN(AnyLN anyLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(anyLN, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateLN_lnClass_required(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateLN_lnClass_valid(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateLN_inst_required(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateAnyLN_lnType_required(anyLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateAnyLN_lnType_valid(anyLN, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLN_lnClass_required constraint of '<em>Any LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyLN_validateLN_lnClass_required(AnyLN anyLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anyLN.validateLN_lnClass_required(diagnostics, context);
	}

	/**
	 * Validates the validateLN_lnClass_valid constraint of '<em>Any LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyLN_validateLN_lnClass_valid(AnyLN anyLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anyLN.validateLN_lnClass_valid(diagnostics, context);
	}

	/**
	 * Validates the validateLN_inst_required constraint of '<em>Any LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyLN_validateLN_inst_required(AnyLN anyLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anyLN.validateLN_inst_required(diagnostics, context);
	}

	/**
	 * Validates the validateAnyLN_lnType_required constraint of '<em>Any LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyLN_validateAnyLN_lnType_required(AnyLN anyLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anyLN.validateAnyLN_lnType_required(diagnostics, context);
	}

	/**
	 * Validates the validateAnyLN_lnType_valid constraint of '<em>Any LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnyLN_validateAnyLN_lnType_valid(AnyLN anyLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return anyLN.validateAnyLN_lnType_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(association, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_validateAssociation_kind_required(association, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssociation_validateAssociation_associationID_valid(association, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAssociation_kind_required constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_validateAssociation_kind_required(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return association.validateAssociation_kind_required(diagnostics, context);
	}

	/**
	 * Validates the validateAssociation_associationID_valid constraint of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociation_validateAssociation_associationID_valid(Association association, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return association.validateAssociation_associationID_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthentication(Authentication authentication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authentication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate(Certificate certificate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(certificate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_serialNumber_required(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_serialNumber_valid(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_xferNumber_valid(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_one_Subject_required(certificate, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_one_IssuerName_required(certificate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCertificate_serialNumber_required constraint of '<em>Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate_validateCertificate_serialNumber_required(Certificate certificate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return certificate.validateCertificate_serialNumber_required(diagnostics, context);
	}

	/**
	 * Validates the validateCertificate_serialNumber_valid constraint of '<em>Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate_validateCertificate_serialNumber_valid(Certificate certificate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return certificate.validateCertificate_serialNumber_valid(diagnostics, context);
	}

	/**
	 * Validates the validateCertificate_xferNumber_valid constraint of '<em>Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate_validateCertificate_xferNumber_valid(Certificate certificate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return certificate.validateCertificate_xferNumber_valid(diagnostics, context);
	}

	/**
	 * Validates the validateCertificate_one_Subject_required constraint of '<em>Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate_validateCertificate_one_Subject_required(Certificate certificate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return certificate.validateCertificate_one_Subject_required(diagnostics, context);
	}

	/**
	 * Validates the validateCertificate_one_IssuerName_required constraint of '<em>Certificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificate_validateCertificate_one_IssuerName_required(Certificate certificate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return certificate.validateCertificate_one_IssuerName_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clientLN, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientLN_validateClientLN_apRef_valid(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientLN_validateClientLN_iedName_required(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientLN_validateClientLN_iedName_valid(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientLN_validateClientLN_ldInst_required(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientLN_validateClientLN_ldInst_valid(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientLN_validateClientLN_lnClass_required(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientLN_validateClientLN_lnClass_valid(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientLN_validateClientLN_lnInst_required(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientLN_validateClientLN_lnInst_valid(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientLN_validateClientLN_lnInst_empty_for_LLN0(clientLN, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientLN_validateClientLN_prefix_valid(clientLN, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClientLN_apRef_valid constraint of '<em>Client LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_validateClientLN_apRef_valid(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientLN.validateClientLN_apRef_valid(diagnostics, context);
	}

	/**
	 * Validates the validateClientLN_iedName_required constraint of '<em>Client LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_validateClientLN_iedName_required(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientLN.validateClientLN_iedName_required(diagnostics, context);
	}

	/**
	 * Validates the validateClientLN_iedName_valid constraint of '<em>Client LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_validateClientLN_iedName_valid(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientLN.validateClientLN_iedName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateClientLN_ldInst_required constraint of '<em>Client LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_validateClientLN_ldInst_required(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientLN.validateClientLN_ldInst_required(diagnostics, context);
	}

	/**
	 * Validates the validateClientLN_ldInst_valid constraint of '<em>Client LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_validateClientLN_ldInst_valid(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientLN.validateClientLN_ldInst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateClientLN_lnClass_required constraint of '<em>Client LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_validateClientLN_lnClass_required(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientLN.validateClientLN_lnClass_required(diagnostics, context);
	}

	/**
	 * Validates the validateClientLN_lnClass_valid constraint of '<em>Client LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_validateClientLN_lnClass_valid(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientLN.validateClientLN_lnClass_valid(diagnostics, context);
	}

	/**
	 * Validates the validateClientLN_lnInst_required constraint of '<em>Client LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_validateClientLN_lnInst_required(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientLN.validateClientLN_lnInst_required(diagnostics, context);
	}

	/**
	 * Validates the validateClientLN_lnInst_valid constraint of '<em>Client LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_validateClientLN_lnInst_valid(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientLN.validateClientLN_lnInst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateClientLN_lnInst_empty_for_LLN0 constraint of '<em>Client LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_validateClientLN_lnInst_empty_for_LLN0(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientLN.validateClientLN_lnInst_empty_for_LLN0(diagnostics, context);
	}

	/**
	 * Validates the validateClientLN_prefix_valid constraint of '<em>Client LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientLN_validateClientLN_prefix_valid(ClientLN clientLN, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientLN.validateClientLN_prefix_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientServices(ClientServices clientServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(clientServices, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(clientServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(clientServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(clientServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(clientServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(clientServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(clientServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(clientServices, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(clientServices, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientServices_validateClientServices_maxAttributes_valid(clientServices, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientServices_validateClientServices_maxReports_valid(clientServices, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientServices_validateClientServices_maxGOOSE_valid(clientServices, diagnostics, context);
		if (result || diagnostics != null) result &= validateClientServices_validateClientServices_maxSMV_valid(clientServices, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateClientServices_maxAttributes_valid constraint of '<em>Client Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientServices_validateClientServices_maxAttributes_valid(ClientServices clientServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientServices.validateClientServices_maxAttributes_valid(diagnostics, context);
	}

	/**
	 * Validates the validateClientServices_maxReports_valid constraint of '<em>Client Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientServices_validateClientServices_maxReports_valid(ClientServices clientServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientServices.validateClientServices_maxReports_valid(diagnostics, context);
	}

	/**
	 * Validates the validateClientServices_maxGOOSE_valid constraint of '<em>Client Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientServices_validateClientServices_maxGOOSE_valid(ClientServices clientServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientServices.validateClientServices_maxGOOSE_valid(diagnostics, context);
	}

	/**
	 * Validates the validateClientServices_maxSMV_valid constraint of '<em>Client Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientServices_validateClientServices_maxSMV_valid(ClientServices clientServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return clientServices.validateClientServices_maxSMV_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommProt(CommProt commProt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(commProt, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(commProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(commProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(commProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(commProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(commProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(commProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(commProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(commProt, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommProt_validateCommProt_nothing(commProt, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCommProt_nothing constraint of '<em>Comm Prot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommProt_validateCommProt_nothing(CommProt commProt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return commProt.validateCommProt_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfDataSet(ConfDataSet confDataSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(confDataSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(confDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(confDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(confDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(confDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(confDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(confDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(confDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(confDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_required(confDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_valid(confDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMaxAndMaxAttributes_validateServiceWithMax_maxAttributes_valid(confDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceForConfDataSet_validateServiceForConfDataSet_nothing(confDataSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfLNs(ConfLNs confLNs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(confLNs, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(confLNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(confLNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(confLNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(confLNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(confLNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(confLNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(confLNs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(confLNs, diagnostics, context);
		if (result || diagnostics != null) result &= validateConfLNs_validateConfLNs_nothing(confLNs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConfLNs_nothing constraint of '<em>Conf LNs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfLNs_validateConfLNs_nothing(ConfLNs confLNs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return confLNs.validateConfLNs_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfLdName(ConfLdName confLdName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(confLdName, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(confLdName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(confLdName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(confLdName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(confLdName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(confLdName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(confLdName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(confLdName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(confLdName, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(confLdName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfLogControl(ConfLogControl confLogControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(confLogControl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(confLogControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(confLogControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(confLogControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(confLogControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(confLogControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(confLogControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(confLogControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(confLogControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMaxNonZero_validateServiceWithMaxNonZero_max_required(confLogControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMaxNonZero_validateServiceWithMaxNonZero_max_valid(confLogControl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfReportControl(ConfReportControl confReportControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(confReportControl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(confReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(confReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(confReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(confReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(confReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(confReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(confReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(confReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_required(confReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_valid(confReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceConfReportControl_validateServiceConfReportControl_nothing(confReportControl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfSG(ConfSG confSG, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confSG, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfSigRef(ConfSigRef confSigRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(confSigRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(confSigRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(confSigRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(confSigRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(confSigRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(confSigRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(confSigRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(confSigRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(confSigRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMaxNonZero_validateServiceWithMaxNonZero_max_required(confSigRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMaxNonZero_validateServiceWithMaxNonZero_max_valid(confSigRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControl(Control control, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(control, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(control, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(control, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(control, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(control, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(control, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(control, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(control, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(control, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_required(control, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_valid(control, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_datSet_valid(control, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateControl_name_required constraint of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControl_validateControl_name_required(Control control, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return control.validateControl_name_required(diagnostics, context);
	}

	/**
	 * Validates the validateControl_name_valid constraint of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControl_validateControl_name_valid(Control control, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return control.validateControl_name_valid(diagnostics, context);
	}

	/**
	 * Validates the validateControl_datSet_valid constraint of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControl_validateControl_datSet_valid(Control control, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return control.validateControl_datSet_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlWithIEDName(ControlWithIEDName controlWithIEDName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlWithIEDName, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controlWithIEDName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlWithIEDName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlWithIEDName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controlWithIEDName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlWithIEDName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controlWithIEDName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controlWithIEDName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controlWithIEDName, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_required(controlWithIEDName, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_valid(controlWithIEDName, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_datSet_valid(controlWithIEDName, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlWithIEDName_validateControlWithIEDName_confRev_unsignedInt(controlWithIEDName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateControlWithIEDName_confRev_unsignedInt constraint of '<em>Control With IED Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlWithIEDName_validateControlWithIEDName_confRev_unsignedInt(ControlWithIEDName controlWithIEDName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return controlWithIEDName.validateControlWithIEDName_confRev_unsignedInt(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlWithTriggerOpt(ControlWithTriggerOpt controlWithTriggerOpt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlWithTriggerOpt, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controlWithTriggerOpt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controlWithTriggerOpt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controlWithTriggerOpt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controlWithTriggerOpt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controlWithTriggerOpt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controlWithTriggerOpt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controlWithTriggerOpt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controlWithTriggerOpt, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_required(controlWithTriggerOpt, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_valid(controlWithTriggerOpt, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_datSet_valid(controlWithTriggerOpt, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlWithTriggerOpt_validateControlWithTriggerOpt_intgPd_unsigned_int(controlWithTriggerOpt, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateControlWithTriggerOpt_intgPd_unsigned_int constraint of '<em>Control With Trigger Opt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlWithTriggerOpt_validateControlWithTriggerOpt_intgPd_unsigned_int(ControlWithTriggerOpt controlWithTriggerOpt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return controlWithTriggerOpt.validateControlWithTriggerOpt_intgPd_unsigned_int(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAI(DAI dai, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dai, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_required(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_valid(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validateDAI_validateDAI_name_required(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validateDAI_validateDAI_name_valid(dai, diagnostics, context);
		if (result || diagnostics != null) result &= validateDAI_validateDAI_ix_valid(dai, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDAI_name_required constraint of '<em>DAI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAI_validateDAI_name_required(DAI dai, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dai.validateDAI_name_required(diagnostics, context);
	}

	/**
	 * Validates the validateDAI_name_valid constraint of '<em>DAI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAI_validateDAI_name_valid(DAI dai, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dai.validateDAI_name_valid(diagnostics, context);
	}

	/**
	 * Validates the validateDAI_ix_valid constraint of '<em>DAI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAI_validateDAI_ix_valid(DAI dai, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dai.validateDAI_ix_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOI(DOI doi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(doi, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObject_validateDataObject_name_required(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObject_validateDataObject_name_valid(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOI_validateDOI_name_required(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOI_validateDOI_name_valid(doi, diagnostics, context);
		if (result || diagnostics != null) result &= validateDOI_validateDOI_ix_valid(doi, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDOI_name_required constraint of '<em>DOI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOI_validateDOI_name_required(DOI doi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return doi.validateDOI_name_required(diagnostics, context);
	}

	/**
	 * Validates the validateDOI_name_valid constraint of '<em>DOI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOI_validateDOI_name_valid(DOI doi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return doi.validateDOI_name_valid(diagnostics, context);
	}

	/**
	 * Validates the validateDOI_ix_valid constraint of '<em>DOI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDOI_validateDOI_ix_valid(DOI doi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return doi.validateDOI_ix_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObjectDirectory(DataObjectDirectory dataObjectDirectory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataObjectDirectory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataObjectDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataObjectDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataObjectDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataObjectDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataObjectDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataObjectDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataObjectDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataObjectDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(dataObjectDirectory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSet(DataSet dataSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataSet_validateDataSet_name_required(dataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataSet_validateDataSet_name_valid(dataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataSet_validateDataSet_at_least_one_FCDA_required(dataSet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDataSet_name_required constraint of '<em>Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSet_validateDataSet_name_required(DataSet dataSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataSet.validateDataSet_name_required(diagnostics, context);
	}

	/**
	 * Validates the validateDataSet_name_valid constraint of '<em>Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSet_validateDataSet_name_valid(DataSet dataSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataSet.validateDataSet_name_valid(diagnostics, context);
	}

	/**
	 * Validates the validateDataSet_at_least_one_FCDA_required constraint of '<em>Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSet_validateDataSet_at_least_one_FCDA_required(DataSet dataSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataSet.validateDataSet_at_least_one_FCDA_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataSetDirectory(DataSetDirectory dataSetDirectory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataSetDirectory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataSetDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataSetDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataSetDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataSetDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataSetDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataSetDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataSetDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataSetDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(dataSetDirectory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynAssociation(DynAssociation dynAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithOptionalMax_validateServiceWithOptionalMax_max_valid(dynAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynDataSet(DynDataSet dynDataSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynDataSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_required(dynDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_valid(dynDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMaxAndMaxAttributes_validateServiceWithMax_maxAttributes_valid(dynDataSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateExtRef_iedName_valid(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateExtRef_ldInst_valid(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateExtRef_prefix_valid(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateExtRef_lnClass_valid(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateExtRef_lnInst_valid(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateFCDA_doName_valid(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateFCDA_daName_valid(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateExtRef_srcLDInst_valid(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateExtRef_srcPrefix_valid(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateExtRef_srcLNClass_valid(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateExtRef_srcLNInst_valid(extRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtRef_validateExtRef_srcCBName_valid(extRef, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateExtRef_iedName_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateExtRef_iedName_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateExtRef_iedName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateExtRef_ldInst_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateExtRef_ldInst_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateExtRef_ldInst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateExtRef_prefix_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateExtRef_prefix_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateExtRef_prefix_valid(diagnostics, context);
	}

	/**
	 * Validates the validateExtRef_lnClass_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateExtRef_lnClass_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateExtRef_lnClass_valid(diagnostics, context);
	}

	/**
	 * Validates the validateExtRef_lnInst_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateExtRef_lnInst_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateExtRef_lnInst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_doName_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateFCDA_doName_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateFCDA_doName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_daName_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateFCDA_daName_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateFCDA_daName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateExtRef_srcLDInst_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateExtRef_srcLDInst_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateExtRef_srcLDInst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateExtRef_srcPrefix_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateExtRef_srcPrefix_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateExtRef_srcPrefix_valid(diagnostics, context);
	}

	/**
	 * Validates the validateExtRef_srcLNClass_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateExtRef_srcLNClass_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateExtRef_srcLNClass_valid(diagnostics, context);
	}

	/**
	 * Validates the validateExtRef_srcLNInst_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateExtRef_srcLNInst_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateExtRef_srcLNInst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateExtRef_srcCBName_valid constraint of '<em>Ext Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtRef_validateExtRef_srcCBName_valid(ExtRef extRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return extRef.validateExtRef_srcCBName_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fcda, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_fc_required(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_ldInst_required(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_lnClass_required(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_lnClass_valid(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_lnInst_required(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_lnInst_valid(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_empty_attributes_only_if_GSSE(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_ldInst_valid(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_prefix_valid(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_doName_valid(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_daName_valid(fcda, diagnostics, context);
		if (result || diagnostics != null) result &= validateFCDA_validateFCDA_ix_valid(fcda, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateFCDA_fc_required constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_fc_required(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_fc_required(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_ldInst_required constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_ldInst_required(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_ldInst_required(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_lnClass_required constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_lnClass_required(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_lnClass_required(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_lnClass_valid constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_lnClass_valid(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_lnClass_valid(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_lnInst_required constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_lnInst_required(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_lnInst_required(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_lnInst_valid constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_lnInst_valid(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_lnInst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_empty_attributes_only_if_GSSE constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_empty_attributes_only_if_GSSE(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_empty_attributes_only_if_GSSE(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_ldInst_valid constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_ldInst_valid(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_ldInst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_prefix_valid constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_prefix_valid(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_prefix_valid(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_doName_valid constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_doName_valid(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_doName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_daName_valid constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_daName_valid(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_daName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateFCDA_ix_valid constraint of '<em>FCDA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCDA_validateFCDA_ix_valid(FCDA fcda, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fcda.validateFCDA_ix_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileHandling(FileHandling fileHandling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fileHandling, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fileHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fileHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fileHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fileHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fileHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fileHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fileHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fileHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validateFileHandling_validateFileHandling_nothing(fileHandling, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateFileHandling_nothing constraint of '<em>File Handling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileHandling_validateFileHandling_nothing(FileHandling fileHandling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fileHandling.validateFileHandling_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGOOSE(GOOSE goose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(goose, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(goose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(goose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(goose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(goose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(goose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(goose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(goose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(goose, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_required(goose, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_valid(goose, diagnostics, context);
		if (result || diagnostics != null) result &= validateGOOSE_validateGOOSE_nothing(goose, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateGOOSE_nothing constraint of '<em>GOOSE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGOOSE_validateGOOSE_nothing(GOOSE goose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return goose.validateGOOSE_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGOOSESecurity(GOOSESecurity gooseSecurity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gooseSecurity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_serialNumber_required(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_serialNumber_valid(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_xferNumber_valid(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_one_Subject_required(gooseSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_one_IssuerName_required(gooseSecurity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSEControl(GSEControl gseControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gseControl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_required(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_valid(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_datSet_valid(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlWithIEDName_validateControlWithIEDName_confRev_unsignedInt(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateGSEControl_validateGSEControl_appID_required(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateGSEControl_validateGSEControl_appID_valid(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateGSEControl_validateGSEControl_confRev_required(gseControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateGSEControl_validateGSEControl_confRev_unsignedInt(gseControl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateGSEControl_appID_required constraint of '<em>GSE Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSEControl_validateGSEControl_appID_required(GSEControl gseControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gseControl.validateGSEControl_appID_required(diagnostics, context);
	}

	/**
	 * Validates the validateGSEControl_appID_valid constraint of '<em>GSE Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSEControl_validateGSEControl_appID_valid(GSEControl gseControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gseControl.validateGSEControl_appID_valid(diagnostics, context);
	}

	/**
	 * Validates the validateGSEControl_confRev_required constraint of '<em>GSE Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSEControl_validateGSEControl_confRev_required(GSEControl gseControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gseControl.validateGSEControl_confRev_required(diagnostics, context);
	}

	/**
	 * Validates the validateGSEControl_confRev_unsignedInt constraint of '<em>GSE Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSEControl_validateGSEControl_confRev_unsignedInt(GSEControl gseControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gseControl.validateGSEControl_confRev_unsignedInt(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSEDir(GSEDir gseDir, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gseDir, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gseDir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gseDir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gseDir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gseDir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gseDir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gseDir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gseDir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gseDir, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(gseDir, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSESettings(GSESettings gseSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gseSettings, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gseSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gseSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gseSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gseSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gseSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gseSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gseSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gseSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceSettings_validateServiceSettings_nothing(gseSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validateGSESettings_validateGSESettings_nothing(gseSettings, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateGSESettings_nothing constraint of '<em>GSE Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSESettings_validateGSESettings_nothing(GSESettings gseSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gseSettings.validateGSESettings_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSSE(GSSE gsse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gsse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gsse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gsse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gsse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gsse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gsse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gsse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gsse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gsse, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_required(gsse, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_valid(gsse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetCBValues(GetCBValues getCBValues, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(getCBValues, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(getCBValues, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(getCBValues, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(getCBValues, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(getCBValues, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(getCBValues, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(getCBValues, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(getCBValues, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(getCBValues, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(getCBValues, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetDataObjectDefinition(GetDataObjectDefinition getDataObjectDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(getDataObjectDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(getDataObjectDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(getDataObjectDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(getDataObjectDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(getDataObjectDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(getDataObjectDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(getDataObjectDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(getDataObjectDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(getDataObjectDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(getDataObjectDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetDataSetValue(GetDataSetValue getDataSetValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(getDataSetValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(getDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(getDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(getDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(getDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(getDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(getDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(getDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(getDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(getDataSetValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGetDirectory(GetDirectory getDirectory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(getDirectory, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(getDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(getDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(getDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(getDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(getDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(getDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(getDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(getDirectory, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(getDirectory, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIED(IED ied, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ied, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validateIED_validateIED_name_required(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validateIED_validateIED_name_valid(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validateIED_validateIED_originalSclVersion_valid(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validateIED_validateIED_originalSclRevision_valid(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validateIED_validateIED_originalSclRelease_valid(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validateIED_validateengRight_valid(ied, diagnostics, context);
		if (result || diagnostics != null) result &= validateIED_validateIED_at_least_one_AccessPoint_required(ied, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIED_name_required constraint of '<em>IED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIED_validateIED_name_required(IED ied, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ied.validateIED_name_required(diagnostics, context);
	}

	/**
	 * Validates the validateIED_name_valid constraint of '<em>IED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIED_validateIED_name_valid(IED ied, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ied.validateIED_name_valid(diagnostics, context);
	}

	/**
	 * Validates the validateIED_originalSclVersion_valid constraint of '<em>IED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIED_validateIED_originalSclVersion_valid(IED ied, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ied.validateIED_originalSclVersion_valid(diagnostics, context);
	}

	/**
	 * Validates the validateIED_originalSclRevision_valid constraint of '<em>IED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIED_validateIED_originalSclRevision_valid(IED ied, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ied.validateIED_originalSclRevision_valid(diagnostics, context);
	}

	/**
	 * Validates the validateIED_originalSclRelease_valid constraint of '<em>IED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIED_validateIED_originalSclRelease_valid(IED ied, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ied.validateIED_originalSclRelease_valid(diagnostics, context);
	}

	/**
	 * Validates the validateengRight_valid constraint of '<em>IED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIED_validateengRight_valid(IED ied, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ied.validateengRight_valid(diagnostics, context);
	}

	/**
	 * Validates the validateIED_at_least_one_AccessPoint_required constraint of '<em>IED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIED_validateIED_at_least_one_AccessPoint_required(IED ied, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ied.validateIED_at_least_one_AccessPoint_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIEDName(IEDName iedName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(iedName, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(iedName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(iedName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(iedName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(iedName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(iedName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(iedName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(iedName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(iedName, diagnostics, context);
		if (result || diagnostics != null) result &= validateIEDName_validateIEDName_value_valid(iedName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIEDName_value_valid constraint of '<em>IED Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIEDName_validateIEDName_value_valid(IEDName iedName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return iedName.validateIEDName_value_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputs(Inputs inputs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputs, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputs, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputs_validateInputs_nothing(inputs, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputs_validateInputs_at_least_one_ExtRef_required(inputs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateInputs_nothing constraint of '<em>Inputs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputs_validateInputs_nothing(Inputs inputs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return inputs.validateInputs_nothing(diagnostics, context);
	}

	/**
	 * Validates the validateInputs_at_least_one_ExtRef_required constraint of '<em>Inputs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputs_validateInputs_at_least_one_ExtRef_required(Inputs inputs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return inputs.validateInputs_at_least_one_ExtRef_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssuerName(IssuerName issuerName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(issuerName, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(issuerName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(issuerName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(issuerName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(issuerName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(issuerName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(issuerName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(issuerName, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(issuerName, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_commonName_required(issuerName, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_commonName_valid(issuerName, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_idHierarchy_required(issuerName, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_idHierarchy_valid(issuerName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKDC(KDC kdc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(kdc, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(kdc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(kdc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(kdc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(kdc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(kdc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(kdc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(kdc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(kdc, diagnostics, context);
		if (result || diagnostics != null) result &= validateKDC_validateKDC_iedName_required(kdc, diagnostics, context);
		if (result || diagnostics != null) result &= validateKDC_validateKDC_iedName_valid(kdc, diagnostics, context);
		if (result || diagnostics != null) result &= validateKDC_validateKDC_apName_required(kdc, diagnostics, context);
		if (result || diagnostics != null) result &= validateKDC_validateKDC_apName_valid(kdc, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateKDC_iedName_required constraint of '<em>KDC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKDC_validateKDC_iedName_required(KDC kdc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kdc.validateKDC_iedName_required(diagnostics, context);
	}

	/**
	 * Validates the validateKDC_iedName_valid constraint of '<em>KDC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKDC_validateKDC_iedName_valid(KDC kdc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kdc.validateKDC_iedName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateKDC_apName_required constraint of '<em>KDC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKDC_validateKDC_apName_required(KDC kdc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kdc.validateKDC_apName_required(diagnostics, context);
	}

	/**
	 * Validates the validateKDC_apName_valid constraint of '<em>KDC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKDC_validateKDC_apName_valid(KDC kdc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return kdc.validateKDC_apName_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLDevice(LDevice lDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lDevice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lDevice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lDevice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lDevice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lDevice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lDevice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lDevice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lDevice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lDevice, diagnostics, context);
		if (result || diagnostics != null) result &= validateLDevice_validateLDevice_inst_required(lDevice, diagnostics, context);
		if (result || diagnostics != null) result &= validateLDevice_validateLDevice_inst_valid(lDevice, diagnostics, context);
		if (result || diagnostics != null) result &= validateLDevice_validateLDevice_ldName_valid(lDevice, diagnostics, context);
		if (result || diagnostics != null) result &= validateLDevice_validateLDevice_one_LN0_required(lDevice, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLDevice_inst_required constraint of '<em>LDevice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLDevice_validateLDevice_inst_required(LDevice lDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lDevice.validateLDevice_inst_required(diagnostics, context);
	}

	/**
	 * Validates the validateLDevice_inst_valid constraint of '<em>LDevice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLDevice_validateLDevice_inst_valid(LDevice lDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lDevice.validateLDevice_inst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateLDevice_ldName_valid constraint of '<em>LDevice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLDevice_validateLDevice_ldName_valid(LDevice lDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lDevice.validateLDevice_ldName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateLDevice_one_LN0_required constraint of '<em>LDevice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLDevice_validateLDevice_one_LN0_required(LDevice lDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lDevice.validateLDevice_one_LN0_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN(LN ln, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ln, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateLN_lnClass_required(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateLN_lnClass_valid(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateLN_inst_required(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateAnyLN_lnType_required(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateAnyLN_lnType_valid(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validateLN_validateLN_inst_valid(ln, diagnostics, context);
		if (result || diagnostics != null) result &= validateLN_validateLN_prefix_valid(ln, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLN_inst_valid constraint of '<em>LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN_validateLN_inst_valid(LN ln, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ln.validateLN_inst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateLN_prefix_valid constraint of '<em>LN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN_validateLN_prefix_valid(LN ln, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ln.validateLN_prefix_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN0(LN0 ln0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ln0, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateLN_lnClass_required(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateLN_lnClass_valid(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateLN_inst_required(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateAnyLN_lnType_required(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnyLN_validateAnyLN_lnType_valid(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validateLN0_validateLN0_lnClass_value(ln0, diagnostics, context);
		if (result || diagnostics != null) result &= validateLN0_validateLN0_inst_empty(ln0, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLN0_lnClass_value constraint of '<em>LN0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN0_validateLN0_lnClass_value(LN0 ln0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ln0.validateLN0_lnClass_value(diagnostics, context);
	}

	/**
	 * Validates the validateLN0_inst_empty constraint of '<em>LN0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLN0_validateLN0_inst_empty(LN0 ln0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ln0.validateLN0_inst_empty(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLog(Log log, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(log, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(log, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(log, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(log, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(log, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(log, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(log, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(log, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(log, diagnostics, context);
		if (result || diagnostics != null) result &= validateLog_validateLog_name_valid(log, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLog_name_valid constraint of '<em>Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLog_validateLog_name_valid(Log log, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return log.validateLog_name_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogControl(LogControl logControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(logControl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_required(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_valid(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_datSet_valid(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlWithTriggerOpt_validateControlWithTriggerOpt_intgPd_unsigned_int(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateLogControl_validateLogControl_logName_required(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateLogControl_validateLogControl_logName_valid(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateLogControl_validateLogControl_ldInst_valid(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateLogControl_validateLogControl_prefix_valid(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateLogControl_validateLogControl_lnClass_valid(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateLogControl_validateLogControl_lnInst_valid(logControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateLogControl_validateLogControl_bufTime_valid(logControl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLogControl_logName_required constraint of '<em>Log Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogControl_validateLogControl_logName_required(LogControl logControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return logControl.validateLogControl_logName_required(diagnostics, context);
	}

	/**
	 * Validates the validateLogControl_logName_valid constraint of '<em>Log Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogControl_validateLogControl_logName_valid(LogControl logControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return logControl.validateLogControl_logName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateLogControl_ldInst_valid constraint of '<em>Log Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogControl_validateLogControl_ldInst_valid(LogControl logControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return logControl.validateLogControl_ldInst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateLogControl_prefix_valid constraint of '<em>Log Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogControl_validateLogControl_prefix_valid(LogControl logControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return logControl.validateLogControl_prefix_valid(diagnostics, context);
	}

	/**
	 * Validates the validateLogControl_lnClass_valid constraint of '<em>Log Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogControl_validateLogControl_lnClass_valid(LogControl logControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return logControl.validateLogControl_lnClass_valid(diagnostics, context);
	}

	/**
	 * Validates the validateLogControl_lnInst_valid constraint of '<em>Log Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogControl_validateLogControl_lnInst_valid(LogControl logControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return logControl.validateLogControl_lnInst_valid(diagnostics, context);
	}

	/**
	 * Validates the validateLogControl_bufTime_valid constraint of '<em>Log Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogControl_validateLogControl_bufTime_valid(LogControl logControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return logControl.validateLogControl_bufTime_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogSettings(LogSettings logSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(logSettings, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(logSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(logSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(logSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(logSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(logSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(logSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(logSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(logSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceSettings_validateServiceSettings_nothing(logSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validateLogSettings_validateLogSettings_nothing(logSettings, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLogSettings_nothing constraint of '<em>Log Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogSettings_validateLogSettings_nothing(LogSettings logSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return logSettings.validateLogSettings_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptFields(OptFields optFields, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optFields, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocol(Protocol protocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protocol, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocol_validateVoltage_mustUnderstand_required(protocol, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocol_validateVoltage_mustUnderstand_value_fixed(protocol, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVoltage_mustUnderstand_required constraint of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocol_validateVoltage_mustUnderstand_required(Protocol protocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protocol.validateVoltage_mustUnderstand_required(diagnostics, context);
	}

	/**
	 * Validates the validateVoltage_mustUnderstand_value_fixed constraint of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocol_validateVoltage_mustUnderstand_value_fixed(Protocol protocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return protocol.validateVoltage_mustUnderstand_value_fixed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadWrite(ReadWrite readWrite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readWrite, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readWrite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readWrite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readWrite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readWrite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readWrite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readWrite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readWrite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readWrite, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(readWrite, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedProt(RedProt redProt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(redProt, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(redProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(redProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(redProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(redProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(redProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(redProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(redProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(redProt, diagnostics, context);
		if (result || diagnostics != null) result &= validateRedProt_validateRedProt_nothing(redProt, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateRedProt_nothing constraint of '<em>Red Prot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedProt_validateRedProt_nothing(RedProt redProt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return redProt.validateRedProt_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportControl(ReportControl reportControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reportControl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_required(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_valid(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_datSet_valid(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlWithTriggerOpt_validateControlWithTriggerOpt_intgPd_unsigned_int(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateReportControl_validateReportControl_confRev_required(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateReportControl_validateReportControl_confRev_unsigned_int(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateReportControl_validateReportControl_rptID_valid(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateReportControl_validateReportControl_bufTime_valid(reportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateReportControl_validateReportControl_one_OptFields_required(reportControl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReportControl_confRev_required constraint of '<em>Report Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportControl_validateReportControl_confRev_required(ReportControl reportControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportControl.validateReportControl_confRev_required(diagnostics, context);
	}

	/**
	 * Validates the validateReportControl_confRev_unsigned_int constraint of '<em>Report Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportControl_validateReportControl_confRev_unsigned_int(ReportControl reportControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportControl.validateReportControl_confRev_unsigned_int(diagnostics, context);
	}

	/**
	 * Validates the validateReportControl_rptID_valid constraint of '<em>Report Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportControl_validateReportControl_rptID_valid(ReportControl reportControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportControl.validateReportControl_rptID_valid(diagnostics, context);
	}

	/**
	 * Validates the validateReportControl_bufTime_valid constraint of '<em>Report Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportControl_validateReportControl_bufTime_valid(ReportControl reportControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportControl.validateReportControl_bufTime_valid(diagnostics, context);
	}

	/**
	 * Validates the validateReportControl_one_OptFields_required constraint of '<em>Report Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportControl_validateReportControl_one_OptFields_required(ReportControl reportControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportControl.validateReportControl_one_OptFields_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportSettings(ReportSettings reportSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reportSettings, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reportSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reportSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reportSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reportSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reportSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reportSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reportSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reportSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceSettings_validateServiceSettings_nothing(reportSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validateReportSettings_validateReportSettings_nothing(reportSettings, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReportSettings_nothing constraint of '<em>Report Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportSettings_validateReportSettings_nothing(ReportSettings reportSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reportSettings.validateReportSettings_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRptEnabled(RptEnabled rptEnabled, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rptEnabled, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rptEnabled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rptEnabled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rptEnabled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rptEnabled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rptEnabled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rptEnabled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rptEnabled, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rptEnabled, diagnostics, context);
		if (result || diagnostics != null) result &= validateRptEnabled_validateRptEnabled_max_unsigned_int(rptEnabled, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateRptEnabled_max_unsigned_int constraint of '<em>Rpt Enabled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRptEnabled_validateRptEnabled_max_unsigned_int(RptEnabled rptEnabled, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return rptEnabled.validateRptEnabled_max_unsigned_int(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDI(SDI sdi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sdi, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_required(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_valid(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validateSDI_validateSDI_name_required(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validateSDI_validateSDI_name_valid(sdi, diagnostics, context);
		if (result || diagnostics != null) result &= validateSDI_validateSDI_ix_valid(sdi, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSDI_name_required constraint of '<em>SDI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDI_validateSDI_name_required(SDI sdi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sdi.validateSDI_name_required(diagnostics, context);
	}

	/**
	 * Validates the validateSDI_name_valid constraint of '<em>SDI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDI_validateSDI_name_valid(SDI sdi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sdi.validateSDI_name_valid(diagnostics, context);
	}

	/**
	 * Validates the validateSDI_ix_valid constraint of '<em>SDI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSDI_validateSDI_ix_valid(SDI sdi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sdi.validateSDI_ix_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSGEdit(SGEdit sgEdit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sgEdit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSMVSecurity(SMVSecurity smvSecurity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(smvSecurity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_serialNumber_required(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_serialNumber_valid(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_xferNumber_valid(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_one_Subject_required(smvSecurity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificate_validateCertificate_one_IssuerName_required(smvSecurity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSMVSettings(SMVSettings smvSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(smvSettings, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(smvSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(smvSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(smvSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(smvSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(smvSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(smvSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(smvSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(smvSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceSettings_validateServiceSettings_nothing(smvSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validateSMVSettings_validateSMVSettings_nothing(smvSettings, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSMVSettings_nothing constraint of '<em>SMV Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSMVSettings_validateSMVSettings_nothing(SMVSettings smvSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return smvSettings.validateSMVSettings_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSMVsc(SMVsc smVsc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(smVsc, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(smVsc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(smVsc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(smVsc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(smVsc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(smVsc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(smVsc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(smVsc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(smVsc, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_required(smVsc, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_valid(smVsc, diagnostics, context);
		if (result || diagnostics != null) result &= validateSMVsc_validateSMVsc_nothing(smVsc, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSMVsc_nothing constraint of '<em>SM Vsc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSMVsc_validateSMVsc_nothing(SMVsc smVsc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return smVsc.validateSMVsc_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl(SampledValueControl sampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sampledValueControl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_required(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_name_valid(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControl_validateControl_datSet_valid(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateControlWithIEDName_validateControlWithIEDName_confRev_unsignedInt(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSampledValueControl_validateSampledValueControl_smvID_required(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSampledValueControl_validateSampledValueControl_smvID_valid(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSampledValueControl_validateSampledValueControl_smpRate_required(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSampledValueControl_validateSampledValueControl_smpRate_valid(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSampledValueControl_validateSampledValueControl_nofASDU_required(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSampledValueControl_validateSampledValueControl_nofASDU_valid(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSampledValueControl_validateSampledValueControl_confRev_required(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSampledValueControl_validateSampledValueControl_confRev_unsignedInt(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSampledValueControl_validateSampledValueControl_one_SmvOpts_required(sampledValueControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSampledValueControl_validateSampledValueControl_multicast(sampledValueControl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSampledValueControl_smvID_required constraint of '<em>Sampled Value Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_validateSampledValueControl_smvID_required(SampledValueControl sampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sampledValueControl.validateSampledValueControl_smvID_required(diagnostics, context);
	}

	/**
	 * Validates the validateSampledValueControl_smvID_valid constraint of '<em>Sampled Value Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_validateSampledValueControl_smvID_valid(SampledValueControl sampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sampledValueControl.validateSampledValueControl_smvID_valid(diagnostics, context);
	}

	/**
	 * Validates the validateSampledValueControl_smpRate_required constraint of '<em>Sampled Value Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_validateSampledValueControl_smpRate_required(SampledValueControl sampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sampledValueControl.validateSampledValueControl_smpRate_required(diagnostics, context);
	}

	/**
	 * Validates the validateSampledValueControl_smpRate_valid constraint of '<em>Sampled Value Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_validateSampledValueControl_smpRate_valid(SampledValueControl sampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sampledValueControl.validateSampledValueControl_smpRate_valid(diagnostics, context);
	}

	/**
	 * Validates the validateSampledValueControl_nofASDU_required constraint of '<em>Sampled Value Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_validateSampledValueControl_nofASDU_required(SampledValueControl sampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sampledValueControl.validateSampledValueControl_nofASDU_required(diagnostics, context);
	}

	/**
	 * Validates the validateSampledValueControl_nofASDU_valid constraint of '<em>Sampled Value Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_validateSampledValueControl_nofASDU_valid(SampledValueControl sampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sampledValueControl.validateSampledValueControl_nofASDU_valid(diagnostics, context);
	}

	/**
	 * Validates the validateSampledValueControl_confRev_required constraint of '<em>Sampled Value Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_validateSampledValueControl_confRev_required(SampledValueControl sampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sampledValueControl.validateSampledValueControl_confRev_required(diagnostics, context);
	}

	/**
	 * Validates the validateSampledValueControl_confRev_unsignedInt constraint of '<em>Sampled Value Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_validateSampledValueControl_confRev_unsignedInt(SampledValueControl sampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sampledValueControl.validateSampledValueControl_confRev_unsignedInt(diagnostics, context);
	}

	/**
	 * Validates the validateSampledValueControl_one_SmvOpts_required constraint of '<em>Sampled Value Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_validateSampledValueControl_one_SmvOpts_required(SampledValueControl sampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sampledValueControl.validateSampledValueControl_one_SmvOpts_required(diagnostics, context);
	}

	/**
	 * Validates the validateSampledValueControl_multicast constraint of '<em>Sampled Value Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampledValueControl_validateSampledValueControl_multicast(SampledValueControl sampledValueControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sampledValueControl.validateSampledValueControl_multicast(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(server, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(server, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(server, diagnostics, context);
		if (result || diagnostics != null) result &= validateServer_validateServer_timeout_unsigned_int(server, diagnostics, context);
		if (result || diagnostics != null) result &= validateServer_validateServer_one_Authentication_required(server, diagnostics, context);
		if (result || diagnostics != null) result &= validateServer_validateServer_at_least_one_LDevice_required(server, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServer_timeout_unsigned_int constraint of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer_validateServer_timeout_unsigned_int(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return server.validateServer_timeout_unsigned_int(diagnostics, context);
	}

	/**
	 * Validates the validateServer_one_Authentication_required constraint of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer_validateServer_one_Authentication_required(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return server.validateServer_one_Authentication_required(diagnostics, context);
	}

	/**
	 * Validates the validateServer_at_least_one_LDevice_required constraint of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServer_validateServer_at_least_one_LDevice_required(Server server, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return server.validateServer_at_least_one_LDevice_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerAt(ServerAt serverAt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serverAt, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serverAt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serverAt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serverAt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serverAt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serverAt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serverAt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serverAt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serverAt, diagnostics, context);
		if (result || diagnostics != null) result &= validateServerAt_validateServerAt_apName_required(serverAt, diagnostics, context);
		if (result || diagnostics != null) result &= validateServerAt_validateServerAt_apName_valid(serverAt, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServerAt_apName_required constraint of '<em>Server At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerAt_validateServerAt_apName_required(ServerAt serverAt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serverAt.validateServerAt_apName_required(diagnostics, context);
	}

	/**
	 * Validates the validateServerAt_apName_valid constraint of '<em>Server At</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerAt_validateServerAt_apName_valid(ServerAt serverAt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serverAt.validateServerAt_apName_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceSettings(ServiceSettings serviceSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceSettings, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceSettings, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceSettings_validateServiceSettings_nothing(serviceSettings, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServiceSettings_nothing constraint of '<em>Service Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceSettings_validateServiceSettings_nothing(ServiceSettings serviceSettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceSettings.validateServiceSettings_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMax(ServiceWithMax serviceWithMax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceWithMax, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceWithMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceWithMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceWithMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceWithMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceWithMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceWithMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceWithMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceWithMax, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_required(serviceWithMax, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_valid(serviceWithMax, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServiceWithMax_max_required constraint of '<em>Service With Max</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMax_validateServiceWithMax_max_required(ServiceWithMax serviceWithMax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceWithMax.validateServiceWithMax_max_required(diagnostics, context);
	}

	/**
	 * Validates the validateServiceWithMax_max_valid constraint of '<em>Service With Max</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMax_validateServiceWithMax_max_valid(ServiceWithMax serviceWithMax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceWithMax.validateServiceWithMax_max_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServices(Services services, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(services, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(services, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(services, diagnostics, context);
		if (result || diagnostics != null) result &= validateServices_validateServices_nameLength_valid(services, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServices_nameLength_valid constraint of '<em>Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServices_validateServices_nameLength_valid(Services services, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return services.validateServices_nameLength_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetDataSetValue(SetDataSetValue setDataSetValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(setDataSetValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(setDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(setDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(setDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(setDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(setDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(setDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(setDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(setDataSetValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(setDataSetValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl(SettingControl settingControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(settingControl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(settingControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(settingControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(settingControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(settingControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(settingControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(settingControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(settingControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(settingControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSettingControl_validateSettingControl_numOfSGs_required(settingControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSettingControl_validateSettingControl_numOfSGs_valid(settingControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSettingControl_validateSettingControl_actSG_valid(settingControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateSettingControl_validateSettingControl_resvTms_valid(settingControl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSettingControl_numOfSGs_required constraint of '<em>Setting Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl_validateSettingControl_numOfSGs_required(SettingControl settingControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return settingControl.validateSettingControl_numOfSGs_required(diagnostics, context);
	}

	/**
	 * Validates the validateSettingControl_numOfSGs_valid constraint of '<em>Setting Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl_validateSettingControl_numOfSGs_valid(SettingControl settingControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return settingControl.validateSettingControl_numOfSGs_valid(diagnostics, context);
	}

	/**
	 * Validates the validateSettingControl_actSG_valid constraint of '<em>Setting Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl_validateSettingControl_actSG_valid(SettingControl settingControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return settingControl.validateSettingControl_actSG_valid(diagnostics, context);
	}

	/**
	 * Validates the validateSettingControl_resvTms_valid constraint of '<em>Setting Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingControl_validateSettingControl_resvTms_valid(SettingControl settingControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return settingControl.validateSettingControl_resvTms_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingGroups(SettingGroups settingGroups, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(settingGroups, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(settingGroups, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(settingGroups, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(settingGroups, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(settingGroups, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(settingGroups, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(settingGroups, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(settingGroups, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(settingGroups, diagnostics, context);
		if (result || diagnostics != null) result &= validateSettingGroups_validateSettingGroups_nothing(settingGroups, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSettingGroups_nothing constraint of '<em>Setting Groups</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingGroups_validateSettingGroups_nothing(SettingGroups settingGroups, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return settingGroups.validateSettingGroups_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmvOpts(SmvOpts smvOpts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smvOpts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubject(Subject subject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subject, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_commonName_required(subject, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_commonName_valid(subject, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_idHierarchy_required(subject, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_idHierarchy_valid(subject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupSubscription(SupSubscription supSubscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supSubscription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supSubscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supSubscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supSubscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(supSubscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supSubscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supSubscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supSubscription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supSubscription, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupSubscription_validateSupSubscription_maxGo_required(supSubscription, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupSubscription_validateSupSubscription_maxGo_valid(supSubscription, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupSubscription_validateSupSubscription_maxSv_required(supSubscription, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupSubscription_validateSupSubscription_maxSv_valid(supSubscription, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSupSubscription_maxGo_required constraint of '<em>Sup Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupSubscription_validateSupSubscription_maxGo_required(SupSubscription supSubscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supSubscription.validateSupSubscription_maxGo_required(diagnostics, context);
	}

	/**
	 * Validates the validateSupSubscription_maxGo_valid constraint of '<em>Sup Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupSubscription_validateSupSubscription_maxGo_valid(SupSubscription supSubscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supSubscription.validateSupSubscription_maxGo_valid(diagnostics, context);
	}

	/**
	 * Validates the validateSupSubscription_maxSv_required constraint of '<em>Sup Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupSubscription_validateSupSubscription_maxSv_required(SupSubscription supSubscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supSubscription.validateSupSubscription_maxSv_required(diagnostics, context);
	}

	/**
	 * Validates the validateSupSubscription_maxSv_valid constraint of '<em>Sup Subscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupSubscription_validateSupSubscription_maxSv_valid(SupSubscription supSubscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supSubscription.validateSupSubscription_maxSv_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSyncProt(TimeSyncProt timeSyncProt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeSyncProt, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeSyncProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeSyncProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeSyncProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeSyncProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeSyncProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeSyncProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeSyncProt, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeSyncProt, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeSyncProt_validateTimeSyncProt_nothing(timeSyncProt, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTimeSyncProt_nothing constraint of '<em>Time Sync Prot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSyncProt_validateTimeSyncProt_nothing(TimeSyncProt timeSyncProt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return timeSyncProt.validateTimeSyncProt_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerActivatedControl(TimerActivatedControl timerActivatedControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timerActivatedControl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timerActivatedControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timerActivatedControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timerActivatedControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timerActivatedControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timerActivatedControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timerActivatedControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timerActivatedControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timerActivatedControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(timerActivatedControl, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgOps(TrgOps trgOps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trgOps, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trgOps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trgOps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trgOps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trgOps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trgOps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trgOps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trgOps, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trgOps, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrgOps_validateTrgOps_nothing(trgOps, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTrgOps_nothing constraint of '<em>Trg Ops</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrgOps_validateTrgOps_nothing(TrgOps trgOps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return trgOps.validateTrgOps_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueHandling(ValueHandling valueHandling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueHandling, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valueHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valueHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valueHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valueHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valueHandling, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueHandling_validateValueHandling_nothing(valueHandling, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateValueHandling_nothing constraint of '<em>Value Handling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueHandling_validateValueHandling_nothing(ValueHandling valueHandling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return valueHandling.validateValueHandling_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractConductingEquipment(AbstractConductingEquipment abstractConductingEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractConductingEquipment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(abstractConductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipment_validateEquipment_nothing(abstractConductingEquipment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractEqFuncSubFunc(AbstractEqFuncSubFunc abstractEqFuncSubFunc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractEqFuncSubFunc, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(abstractEqFuncSubFunc, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractEqFuncSubFunc_validateAbstractEqFuncSubFunc_nothing(abstractEqFuncSubFunc, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAbstractEqFuncSubFunc_nothing constraint of '<em>Abstract Eq Func Sub Func</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractEqFuncSubFunc_validateAbstractEqFuncSubFunc_nothing(AbstractEqFuncSubFunc abstractEqFuncSubFunc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return abstractEqFuncSubFunc.validateAbstractEqFuncSubFunc_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBay(Bay bay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bay, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipmentContainer_validateEquipmentContainer_nothing(bay, diagnostics, context);
		if (result || diagnostics != null) result &= validateBay_validateBay_nothing(bay, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateBay_nothing constraint of '<em>Bay</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBay_validateBay_nothing(Bay bay, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bay.validateBay_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConductingEquipment(ConductingEquipment conductingEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conductingEquipment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipment_validateEquipment_nothing(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateConductingEquipment_validateConductingEquipment_type_required(conductingEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateConductingEquipment_validateConductingEquipment_type_valid(conductingEquipment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConductingEquipment_type_required constraint of '<em>Conducting Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConductingEquipment_validateConductingEquipment_type_required(ConductingEquipment conductingEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conductingEquipment.validateConductingEquipment_type_required(diagnostics, context);
	}

	/**
	 * Validates the validateConductingEquipment_type_valid constraint of '<em>Conducting Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConductingEquipment_validateConductingEquipment_type_valid(ConductingEquipment conductingEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conductingEquipment.validateConductingEquipment_type_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectivityNode(ConnectivityNode connectivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectivityNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectivityNode_validateConnectivityNode_pathName_required(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectivityNode_validateConnectivityNode_pathName_valid(connectivityNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnectivityNode_validateConnectivityNode_pathName_value(connectivityNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConnectivityNode_pathName_required constraint of '<em>Connectivity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectivityNode_validateConnectivityNode_pathName_required(ConnectivityNode connectivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectivityNode.validateConnectivityNode_pathName_required(diagnostics, context);
	}

	/**
	 * Validates the validateConnectivityNode_pathName_valid constraint of '<em>Connectivity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectivityNode_validateConnectivityNode_pathName_valid(ConnectivityNode connectivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectivityNode.validateConnectivityNode_pathName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateConnectivityNode_pathName_value constraint of '<em>Connectivity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectivityNode_validateConnectivityNode_pathName_value(ConnectivityNode connectivityNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return connectivityNode.validateConnectivityNode_pathName_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqFunction(EqFunction eqFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eqFunction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractEqFuncSubFunc_validateAbstractEqFuncSubFunc_nothing(eqFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateEqFunction_validateEqFunction_nothing(eqFunction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEqFunction_nothing constraint of '<em>Eq Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqFunction_validateEqFunction_nothing(EqFunction eqFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eqFunction.validateEqFunction_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqSubFunction(EqSubFunction eqSubFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eqSubFunction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbstractEqFuncSubFunc_validateAbstractEqFuncSubFunc_nothing(eqSubFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateEqSubFunction_validateEqSubFunction_nothing(eqSubFunction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEqSubFunction_nothing constraint of '<em>Eq Sub Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEqSubFunction_validateEqSubFunction_nothing(EqSubFunction eqSubFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eqSubFunction.validateEqSubFunction_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquipment(Equipment equipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(equipment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(equipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipment_validateEquipment_nothing(equipment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEquipment_nothing constraint of '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquipment_validateEquipment_nothing(Equipment equipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return equipment.validateEquipment_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquipmentContainer(EquipmentContainer equipmentContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(equipmentContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(equipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipmentContainer_validateEquipmentContainer_nothing(equipmentContainer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEquipmentContainer_nothing constraint of '<em>Equipment Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquipmentContainer_validateEquipmentContainer_nothing(EquipmentContainer equipmentContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return equipmentContainer.validateEquipmentContainer_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(function, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(function, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(function, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(function, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(function, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunction_validateFunction_nothing(function, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateFunction_nothing constraint of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction_validateFunction_nothing(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return function.validateFunction_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEquipment(GeneralEquipment generalEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalEquipment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipment_validateEquipment_nothing(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEquipment_validateGeneralEquipment_type_required(generalEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEquipment_validateGeneralEquipment_type_valid(generalEquipment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateGeneralEquipment_type_required constraint of '<em>General Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEquipment_validateGeneralEquipment_type_required(GeneralEquipment generalEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEquipment.validateGeneralEquipment_type_required(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralEquipment_type_valid constraint of '<em>General Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEquipment_validateGeneralEquipment_type_valid(GeneralEquipment generalEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEquipment.validateGeneralEquipment_type_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEquipmentContainer(GeneralEquipmentContainer generalEquipmentContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalEquipmentContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(generalEquipmentContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralEquipmentContainer_validateGeneralEquipmentContainer_nothing(generalEquipmentContainer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateGeneralEquipmentContainer_nothing constraint of '<em>General Equipment Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralEquipmentContainer_validateGeneralEquipmentContainer_nothing(GeneralEquipmentContainer generalEquipmentContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalEquipmentContainer.validateGeneralEquipmentContainer_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNode(LNode lNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNode_validateLNode_lnClass_required(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNode_validateLNode_lnClass_value(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNode_validateLNode_lnInst_required(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNode_validateLNode_iedName_value(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNode_validateLNode_ldInst_value(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNode_validateLNode_prefix_value(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNode_validateLNode_lnInst_value(lNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNode_validateLNode_lnType_value(lNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLNode_lnClass_required constraint of '<em>LNode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNode_validateLNode_lnClass_required(LNode lNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNode.validateLNode_lnClass_required(diagnostics, context);
	}

	/**
	 * Validates the validateLNode_lnClass_value constraint of '<em>LNode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNode_validateLNode_lnClass_value(LNode lNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNode.validateLNode_lnClass_value(diagnostics, context);
	}

	/**
	 * Validates the validateLNode_lnInst_required constraint of '<em>LNode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNode_validateLNode_lnInst_required(LNode lNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNode.validateLNode_lnInst_required(diagnostics, context);
	}

	/**
	 * Validates the validateLNode_iedName_value constraint of '<em>LNode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNode_validateLNode_iedName_value(LNode lNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNode.validateLNode_iedName_value(diagnostics, context);
	}

	/**
	 * Validates the validateLNode_ldInst_value constraint of '<em>LNode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNode_validateLNode_ldInst_value(LNode lNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNode.validateLNode_ldInst_value(diagnostics, context);
	}

	/**
	 * Validates the validateLNode_prefix_value constraint of '<em>LNode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNode_validateLNode_prefix_value(LNode lNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNode.validateLNode_prefix_value(diagnostics, context);
	}

	/**
	 * Validates the validateLNode_lnInst_value constraint of '<em>LNode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNode_validateLNode_lnInst_value(LNode lNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNode.validateLNode_lnInst_value(diagnostics, context);
	}

	/**
	 * Validates the validateLNode_lnType_value constraint of '<em>LNode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNode_validateLNode_lnType_value(LNode lNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNode.validateLNode_lnType_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNodeContainer(LNodeContainer lNodeContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lNodeContainer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lNodeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lNodeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lNodeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lNodeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lNodeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lNodeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lNodeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lNodeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(lNodeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(lNodeContainer, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(lNodeContainer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLNodeContainer_nothing constraint of '<em>LNode Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLNodeContainer_validateLNodeContainer_nothing(LNodeContainer lNodeContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lNodeContainer.validateLNodeContainer_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNeutralPoint(NeutralPoint neutralPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(neutralPoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_connectivityNode_required(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_connectivityNode_valid(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_connectivityNode_value_shall_be_pathname(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_substationName_required(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_substationName_valid(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_voltageLevelName_required(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_voltageLevelName_valid(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_bayName_required(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_bayName_valid(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_cNodeName_required(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_cNodeName_valid(neutralPoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_processName_valid(neutralPoint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerSystemResource(PowerSystemResource powerSystemResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(powerSystemResource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(powerSystemResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(powerSystemResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(powerSystemResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(powerSystemResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(powerSystemResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(powerSystemResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(powerSystemResource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(powerSystemResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(powerSystemResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(powerSystemResource, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(powerSystemResource, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(powerSystemResource, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePowerSystemResource_nothing constraint of '<em>Power System Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerSystemResource_validatePowerSystemResource_nothing(PowerSystemResource powerSystemResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return powerSystemResource.validatePowerSystemResource_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerTransformer(PowerTransformer powerTransformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(powerTransformer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipment_validateEquipment_nothing(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerTransformer_validatePowerTransformer_type_value(powerTransformer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerTransformer_validatePowerTransformer_at_least_one_TransformerWinding_required(powerTransformer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePowerTransformer_type_value constraint of '<em>Power Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerTransformer_validatePowerTransformer_type_value(PowerTransformer powerTransformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return powerTransformer.validatePowerTransformer_type_value(diagnostics, context);
	}

	/**
	 * Validates the validatePowerTransformer_at_least_one_TransformerWinding_required constraint of '<em>Power Transformer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerTransformer_validatePowerTransformer_at_least_one_TransformerWinding_required(PowerTransformer powerTransformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return powerTransformer.validatePowerTransformer_at_least_one_TransformerWinding_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubEquipment(SubEquipment subEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subEquipment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(subEquipment, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubEquipment_validateSubEquipment_nothing(subEquipment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSubEquipment_nothing constraint of '<em>Sub Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubEquipment_validateSubEquipment_nothing(SubEquipment subEquipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subEquipment.validateSubEquipment_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubFunction(SubFunction subFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subFunction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(subFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubFunction_validateSubFunction_nothing(subFunction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSubFunction_nothing constraint of '<em>Sub Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubFunction_validateSubFunction_nothing(SubFunction subFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subFunction.validateSubFunction_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstation(Substation substation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(substation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipmentContainer_validateEquipmentContainer_nothing(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubstation_validateSubstation_nothing(substation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubstation_validateSubstation_at_least_one_VoltageLevel_required(substation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSubstation_nothing constraint of '<em>Substation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstation_validateSubstation_nothing(Substation substation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return substation.validateSubstation_nothing(diagnostics, context);
	}

	/**
	 * Validates the validateSubstation_at_least_one_VoltageLevel_required constraint of '<em>Substation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstation_validateSubstation_at_least_one_VoltageLevel_required(Substation substation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return substation.validateSubstation_at_least_one_VoltageLevel_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTapChanger(TapChanger tapChanger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tapChanger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTapChanger_validateTapChanger_type_required(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTapChanger_validateTapChanger_type_valid(tapChanger, diagnostics, context);
		if (result || diagnostics != null) result &= validateTapChanger_validateTapChanger_type_value(tapChanger, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTapChanger_type_required constraint of '<em>Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTapChanger_validateTapChanger_type_required(TapChanger tapChanger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tapChanger.validateTapChanger_type_required(diagnostics, context);
	}

	/**
	 * Validates the validateTapChanger_type_valid constraint of '<em>Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTapChanger_validateTapChanger_type_valid(TapChanger tapChanger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tapChanger.validateTapChanger_type_valid(diagnostics, context);
	}

	/**
	 * Validates the validateTapChanger_type_value constraint of '<em>Tap Changer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTapChanger_validateTapChanger_type_value(TapChanger tapChanger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tapChanger.validateTapChanger_type_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(terminal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_connectivityNode_required(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_connectivityNode_valid(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_connectivityNode_value_shall_be_pathname(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_substationName_required(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_substationName_valid(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_voltageLevelName_required(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_voltageLevelName_valid(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_bayName_required(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_bayName_valid(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_cNodeName_required(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_cNodeName_valid(terminal, diagnostics, context);
		if (result || diagnostics != null) result &= validateTerminal_validateTerminal_processName_valid(terminal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTerminal_connectivityNode_required constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_connectivityNode_required(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_connectivityNode_required(diagnostics, context);
	}

	/**
	 * Validates the validateTerminal_connectivityNode_valid constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_connectivityNode_valid(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_connectivityNode_valid(diagnostics, context);
	}

	/**
	 * Validates the validateTerminal_connectivityNode_value_shall_be_pathname constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_connectivityNode_value_shall_be_pathname(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_connectivityNode_value_shall_be_pathname(diagnostics, context);
	}

	/**
	 * Validates the validateTerminal_substationName_required constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_substationName_required(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_substationName_required(diagnostics, context);
	}

	/**
	 * Validates the validateTerminal_substationName_valid constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_substationName_valid(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_substationName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateTerminal_voltageLevelName_required constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_voltageLevelName_required(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_voltageLevelName_required(diagnostics, context);
	}

	/**
	 * Validates the validateTerminal_voltageLevelName_valid constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_voltageLevelName_valid(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_voltageLevelName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateTerminal_bayName_required constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_bayName_required(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_bayName_required(diagnostics, context);
	}

	/**
	 * Validates the validateTerminal_bayName_valid constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_bayName_valid(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_bayName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateTerminal_cNodeName_required constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_cNodeName_required(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_cNodeName_required(diagnostics, context);
	}

	/**
	 * Validates the validateTerminal_cNodeName_valid constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_cNodeName_valid(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_cNodeName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateTerminal_processName_valid constraint of '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminal_validateTerminal_processName_valid(Terminal terminal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return terminal.validateTerminal_processName_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformerWinding(TransformerWinding transformerWinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transformerWinding, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipment_validateEquipment_nothing(transformerWinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransformerWinding_validateTransformerWinding_type_required(transformerWinding, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateTransformerWinding_type_required constraint of '<em>Transformer Winding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformerWinding_validateTransformerWinding_type_required(TransformerWinding transformerWinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transformerWinding.validateTransformerWinding_type_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltage(Voltage voltage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(voltage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(voltage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(voltage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(voltage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(voltage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(voltage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(voltage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(voltage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(voltage, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueWithUnit_validateValueWithUnit_value_required(voltage, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueWithUnit_validateValueWithUnit_unit_required(voltage, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueWithUnit_validateValueWithUnit_unit_valid(voltage, diagnostics, context);
		if (result || diagnostics != null) result &= validateVoltage_validateVoltage_unit_value_fixed(voltage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVoltage_unit_value_fixed constraint of '<em>Voltage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltage_validateVoltage_unit_value_fixed(Voltage voltage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return voltage.validateVoltage_unit_value_fixed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageLevel(VoltageLevel voltageLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(voltageLevel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_required(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateNaming_validateNaming_name_valid(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateLNodeContainer_validateLNodeContainer_nothing(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerSystemResource_validatePowerSystemResource_nothing(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateEquipmentContainer_validateEquipmentContainer_nothing(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateVoltageLevel_validateVoltageLevel_nomFreq_value(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateVoltageLevel_validateVoltageLevel_numPhases_value(voltageLevel, diagnostics, context);
		if (result || diagnostics != null) result &= validateVoltageLevel_validateVoltageLevel_at_least_one_Bay_required(voltageLevel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVoltageLevel_nomFreq_value constraint of '<em>Voltage Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageLevel_validateVoltageLevel_nomFreq_value(VoltageLevel voltageLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return voltageLevel.validateVoltageLevel_nomFreq_value(diagnostics, context);
	}

	/**
	 * Validates the validateVoltageLevel_numPhases_value constraint of '<em>Voltage Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageLevel_validateVoltageLevel_numPhases_value(VoltageLevel voltageLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return voltageLevel.validateVoltageLevel_numPhases_value(diagnostics, context);
	}

	/**
	 * Validates the validateVoltageLevel_at_least_one_Bay_required constraint of '<em>Voltage Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageLevel_validateVoltageLevel_at_least_one_Bay_required(VoltageLevel voltageLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return voltageLevel.validateVoltageLevel_at_least_one_Bay_required(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExplicitLinkResolver(ExplicitLinkResolver explicitLinkResolver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(explicitLinkResolver, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObject(DataObject dataObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObject_validateDataObject_name_required(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObject_validateDataObject_name_valid(dataObject, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDataObject_name_required constraint of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObject_validateDataObject_name_required(DataObject dataObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataObject.validateDataObject_name_required(diagnostics, context);
	}

	/**
	 * Validates the validateDataObject_name_valid constraint of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObject_validateDataObject_name_valid(DataObject dataObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataObject.validateDataObject_name_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAttribute(DataAttribute dataAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_required(dataAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAttribute_validateDataAttribute_name_valid(dataAttribute, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDataAttribute_name_required constraint of '<em>Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAttribute_validateDataAttribute_name_required(DataAttribute dataAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataAttribute.validateDataAttribute_name_required(diagnostics, context);
	}

	/**
	 * Validates the validateDataAttribute_name_valid constraint of '<em>Data Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAttribute_validateDataAttribute_name_valid(DataAttribute dataAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataAttribute.validateDataAttribute_name_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSclObject(SclObject sclObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sclObject, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnNaming(UnNaming unNaming, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unNaming, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceYesNo(ServiceYesNo serviceYesNo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceYesNo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceYesNo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceYesNo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceYesNo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceYesNo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceYesNo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceYesNo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceYesNo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceYesNo, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceYesNo_validateServiceYesNo_nothing(serviceYesNo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServiceYesNo_nothing constraint of '<em>Service Yes No</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceYesNo_validateServiceYesNo_nothing(ServiceYesNo serviceYesNo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceYesNo.validateServiceYesNo_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithOptionalMax(ServiceWithOptionalMax serviceWithOptionalMax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceWithOptionalMax, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceWithOptionalMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceWithOptionalMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceWithOptionalMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceWithOptionalMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceWithOptionalMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceWithOptionalMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceWithOptionalMax, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceWithOptionalMax, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithOptionalMax_validateServiceWithOptionalMax_max_valid(serviceWithOptionalMax, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServiceWithOptionalMax_max_valid constraint of '<em>Service With Optional Max</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithOptionalMax_validateServiceWithOptionalMax_max_valid(ServiceWithOptionalMax serviceWithOptionalMax, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceWithOptionalMax.validateServiceWithOptionalMax_max_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMaxNonZero(ServiceWithMaxNonZero serviceWithMaxNonZero, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceWithMaxNonZero, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceWithMaxNonZero, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceWithMaxNonZero, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceWithMaxNonZero, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceWithMaxNonZero, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceWithMaxNonZero, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceWithMaxNonZero, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceWithMaxNonZero, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceWithMaxNonZero, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMaxNonZero_validateServiceWithMaxNonZero_max_required(serviceWithMaxNonZero, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMaxNonZero_validateServiceWithMaxNonZero_max_valid(serviceWithMaxNonZero, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServiceWithMaxNonZero_max_required constraint of '<em>Service With Max Non Zero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMaxNonZero_validateServiceWithMaxNonZero_max_required(ServiceWithMaxNonZero serviceWithMaxNonZero, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceWithMaxNonZero.validateServiceWithMaxNonZero_max_required(diagnostics, context);
	}

	/**
	 * Validates the validateServiceWithMaxNonZero_max_valid constraint of '<em>Service With Max Non Zero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMaxNonZero_validateServiceWithMaxNonZero_max_valid(ServiceWithMaxNonZero serviceWithMaxNonZero, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceWithMaxNonZero.validateServiceWithMaxNonZero_max_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConfReportControl(ServiceConfReportControl serviceConfReportControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceConfReportControl, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceConfReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceConfReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceConfReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceConfReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceConfReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceConfReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceConfReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceConfReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_required(serviceConfReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_valid(serviceConfReportControl, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceConfReportControl_validateServiceConfReportControl_nothing(serviceConfReportControl, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServiceConfReportControl_nothing constraint of '<em>Service Conf Report Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceConfReportControl_validateServiceConfReportControl_nothing(ServiceConfReportControl serviceConfReportControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceConfReportControl.validateServiceConfReportControl_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMaxAndMaxAttributes(ServiceWithMaxAndMaxAttributes serviceWithMaxAndMaxAttributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceWithMaxAndMaxAttributes, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceWithMaxAndMaxAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceWithMaxAndMaxAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceWithMaxAndMaxAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceWithMaxAndMaxAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceWithMaxAndMaxAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceWithMaxAndMaxAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceWithMaxAndMaxAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceWithMaxAndMaxAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_required(serviceWithMaxAndMaxAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_valid(serviceWithMaxAndMaxAttributes, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMaxAndMaxAttributes_validateServiceWithMax_maxAttributes_valid(serviceWithMaxAndMaxAttributes, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServiceWithMax_maxAttributes_valid constraint of '<em>Service With Max And Max Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMaxAndMaxAttributes_validateServiceWithMax_maxAttributes_valid(ServiceWithMaxAndMaxAttributes serviceWithMaxAndMaxAttributes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceWithMaxAndMaxAttributes.validateServiceWithMax_maxAttributes_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMaxAndModify(ServiceWithMaxAndModify serviceWithMaxAndModify, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceWithMaxAndModify, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceWithMaxAndModify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceWithMaxAndModify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceWithMaxAndModify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceWithMaxAndModify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceWithMaxAndModify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceWithMaxAndModify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceWithMaxAndModify, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceWithMaxAndModify, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_required(serviceWithMaxAndModify, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_valid(serviceWithMaxAndModify, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMaxAndModify_validateServiceWithMaxAndModify_nothing(serviceWithMaxAndModify, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServiceWithMaxAndModify_nothing constraint of '<em>Service With Max And Modify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceWithMaxAndModify_validateServiceWithMaxAndModify_nothing(ServiceWithMaxAndModify serviceWithMaxAndModify, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceWithMaxAndModify.validateServiceWithMaxAndModify_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceForConfDataSet(ServiceForConfDataSet serviceForConfDataSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceForConfDataSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceForConfDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceForConfDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceForConfDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceForConfDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceForConfDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceForConfDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceForConfDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceForConfDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_required(serviceForConfDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMax_validateServiceWithMax_max_valid(serviceForConfDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceWithMaxAndMaxAttributes_validateServiceWithMax_maxAttributes_valid(serviceForConfDataSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceForConfDataSet_validateServiceForConfDataSet_nothing(serviceForConfDataSet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateServiceForConfDataSet_nothing constraint of '<em>Service For Conf Data Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceForConfDataSet_validateServiceForConfDataSet_nothing(ServiceForConfDataSet serviceForConfDataSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceForConfDataSet.validateServiceForConfDataSet_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCert(Cert cert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cert, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cert, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cert, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_commonName_required(cert, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_commonName_valid(cert, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_idHierarchy_required(cert, diagnostics, context);
		if (result || diagnostics != null) result &= validateCert_validateCert_idHierarchy_valid(cert, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCert_commonName_required constraint of '<em>Cert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCert_validateCert_commonName_required(Cert cert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cert.validateCert_commonName_required(diagnostics, context);
	}

	/**
	 * Validates the validateCert_commonName_valid constraint of '<em>Cert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCert_validateCert_commonName_valid(Cert cert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cert.validateCert_commonName_valid(diagnostics, context);
	}

	/**
	 * Validates the validateCert_idHierarchy_required constraint of '<em>Cert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCert_validateCert_idHierarchy_required(Cert cert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cert.validateCert_idHierarchy_required(diagnostics, context);
	}

	/**
	 * Validates the validateCert_idHierarchy_valid constraint of '<em>Cert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCert_validateCert_idHierarchy_valid(Cert cert, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cert.validateCert_idHierarchy_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueWithUnit(ValueWithUnit valueWithUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(valueWithUnit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(valueWithUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(valueWithUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(valueWithUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(valueWithUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(valueWithUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(valueWithUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(valueWithUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(valueWithUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueWithUnit_validateValueWithUnit_value_required(valueWithUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueWithUnit_validateValueWithUnit_unit_required(valueWithUnit, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueWithUnit_validateValueWithUnit_unit_valid(valueWithUnit, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateValueWithUnit_value_required constraint of '<em>Value With Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueWithUnit_validateValueWithUnit_value_required(ValueWithUnit valueWithUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return valueWithUnit.validateValueWithUnit_value_required(diagnostics, context);
	}

	/**
	 * Validates the validateValueWithUnit_unit_required constraint of '<em>Value With Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueWithUnit_validateValueWithUnit_unit_required(ValueWithUnit valueWithUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return valueWithUnit.validateValueWithUnit_unit_required(diagnostics, context);
	}

	/**
	 * Validates the validateValueWithUnit_unit_valid constraint of '<em>Value With Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueWithUnit_validateValueWithUnit_unit_valid(ValueWithUnit valueWithUnit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return valueWithUnit.validateValueWithUnit_unit_valid(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInSec(DurationInSec durationInSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(durationInSec, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(durationInSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(durationInSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(durationInSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(durationInSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(durationInSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(durationInSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(durationInSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(durationInSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueWithUnit_validateValueWithUnit_value_required(durationInSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueWithUnit_validateValueWithUnit_unit_required(durationInSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateValueWithUnit_validateValueWithUnit_unit_valid(durationInSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInSec_validateDurationInSec_unit_value_fixed(durationInSec, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDurationInSec_unit_value_fixed constraint of '<em>Duration In Sec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInSec_validateDurationInSec_unit_value_fixed(DurationInSec durationInSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return durationInSec.validateDurationInSec_unit_value_fixed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInMilliSec(DurationInMilliSec durationInMilliSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(durationInMilliSec, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(durationInMilliSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(durationInMilliSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(durationInMilliSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(durationInMilliSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(durationInMilliSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(durationInMilliSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(durationInMilliSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(durationInMilliSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_value_required(durationInMilliSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_value_valid(durationInMilliSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_unit_value_fixed(durationInMilliSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_multiplier_value_fixed(durationInMilliSec, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDurationInMilliSec_value_required constraint of '<em>Duration In Milli Sec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInMilliSec_validateDurationInMilliSec_value_required(DurationInMilliSec durationInMilliSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return durationInMilliSec.validateDurationInMilliSec_value_required(diagnostics, context);
	}

	/**
	 * Validates the validateDurationInMilliSec_value_valid constraint of '<em>Duration In Milli Sec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInMilliSec_validateDurationInMilliSec_value_valid(DurationInMilliSec durationInMilliSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return durationInMilliSec.validateDurationInMilliSec_value_valid(diagnostics, context);
	}

	/**
	 * Validates the validateDurationInMilliSec_unit_value_fixed constraint of '<em>Duration In Milli Sec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInMilliSec_validateDurationInMilliSec_unit_value_fixed(DurationInMilliSec durationInMilliSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return durationInMilliSec.validateDurationInMilliSec_unit_value_fixed(diagnostics, context);
	}

	/**
	 * Validates the validateDurationInMilliSec_multiplier_value_fixed constraint of '<em>Duration In Milli Sec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDurationInMilliSec_validateDurationInMilliSec_multiplier_value_fixed(DurationInMilliSec durationInMilliSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return durationInMilliSec.validateDurationInMilliSec_multiplier_value_fixed(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitRateInMbPerSec(BitRateInMbPerSec bitRateInMbPerSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bitRateInMbPerSec, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bitRateInMbPerSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bitRateInMbPerSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bitRateInMbPerSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bitRateInMbPerSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bitRateInMbPerSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bitRateInMbPerSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bitRateInMbPerSec, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bitRateInMbPerSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateBitRateInMbPerSec_validateBitRateInMbPerSec_value_required(bitRateInMbPerSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateBitRateInMbPerSec_validateBitRateInMbPerSec_value_valid(bitRateInMbPerSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateBitRateInMbPerSec_validateBitRateInMbPerSec_unit_value(bitRateInMbPerSec, diagnostics, context);
		if (result || diagnostics != null) result &= validateBitRateInMbPerSec_validateBitRateInMbPerSec_multiplier_value(bitRateInMbPerSec, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateBitRateInMbPerSec_value_required constraint of '<em>Bit Rate In Mb Per Sec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitRateInMbPerSec_validateBitRateInMbPerSec_value_required(BitRateInMbPerSec bitRateInMbPerSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bitRateInMbPerSec.validateBitRateInMbPerSec_value_required(diagnostics, context);
	}

	/**
	 * Validates the validateBitRateInMbPerSec_value_valid constraint of '<em>Bit Rate In Mb Per Sec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitRateInMbPerSec_validateBitRateInMbPerSec_value_valid(BitRateInMbPerSec bitRateInMbPerSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bitRateInMbPerSec.validateBitRateInMbPerSec_value_valid(diagnostics, context);
	}

	/**
	 * Validates the validateBitRateInMbPerSec_unit_value constraint of '<em>Bit Rate In Mb Per Sec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitRateInMbPerSec_validateBitRateInMbPerSec_unit_value(BitRateInMbPerSec bitRateInMbPerSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bitRateInMbPerSec.validateBitRateInMbPerSec_unit_value(diagnostics, context);
	}

	/**
	 * Validates the validateBitRateInMbPerSec_multiplier_value constraint of '<em>Bit Rate In Mb Per Sec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitRateInMbPerSec_validateBitRateInMbPerSec_multiplier_value(BitRateInMbPerSec bitRateInMbPerSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bitRateInMbPerSec.validateBitRateInMbPerSec_multiplier_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinTime(MinTime minTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(minTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_value_required(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_value_valid(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_unit_value_fixed(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_multiplier_value_fixed(minTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateMinTime_validateMinTime_nothing(minTime, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMinTime_nothing constraint of '<em>Min Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinTime_validateMinTime_nothing(MinTime minTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return minTime.validateMinTime_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxTime(MaxTime maxTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(maxTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_value_required(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_value_valid(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_unit_value_fixed(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateDurationInMilliSec_validateDurationInMilliSec_multiplier_value_fixed(maxTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaxTime_validateMaxTime_nothing(maxTime, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMaxTime_nothing constraint of '<em>Max Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxTime_validateMaxTime_nothing(MaxTime maxTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return maxTime.validateMaxTime_nothing(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitRate(BitRate bitRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bitRate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bitRate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bitRate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bitRate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bitRate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bitRate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bitRate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bitRate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bitRate, diagnostics, context);
		if (result || diagnostics != null) result &= validateBitRateInMbPerSec_validateBitRateInMbPerSec_value_required(bitRate, diagnostics, context);
		if (result || diagnostics != null) result &= validateBitRateInMbPerSec_validateBitRateInMbPerSec_value_valid(bitRate, diagnostics, context);
		if (result || diagnostics != null) result &= validateBitRateInMbPerSec_validateBitRateInMbPerSec_unit_value(bitRate, diagnostics, context);
		if (result || diagnostics != null) result &= validateBitRateInMbPerSec_validateBitRateInMbPerSec_multiplier_value(bitRate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmpRate(SmpRate smpRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smpRate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSamplesPerSec(SamplesPerSec samplesPerSec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(samplesPerSec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecPerSamples(SecPerSamples secPerSamples, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secPerSamples, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationKindEnum(AssociationKindEnum associationKindEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFCEnum(FCEnum fcEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGSEControlTypeEnum(GSEControlTypeEnum gseControlTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhaseEnum(PhaseEnum phaseEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredefinedTypeOfSecurityEnum(PredefinedTypeOfSecurityEnum predefinedTypeOfSecurityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSMVDeliveryEnum(SMVDeliveryEnum smvDeliveryEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceSettingsEnum(ServiceSettingsEnum serviceSettingsEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceSettingsNoDynEnum(ServiceSettingsNoDynEnum serviceSettingsNoDynEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceType(ServiceType serviceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmpMod(SmpMod smpMod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitMultiplierEnum(UnitMultiplierEnum unitMultiplierEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValKindEnum(ValKindEnum valKindEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatebufModeEnum(bufModeEnum bufModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SclValidator
