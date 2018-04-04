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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfDataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLdName;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLogControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfReportControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSigRef;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObjectDirectory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSetDirectory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DynAssociation;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DynDataSet;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEDir;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GSSE;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GetCBValues;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataObjectDefinition;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataSetValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDirectory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ReadWrite;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclTables;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Services;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SetDataSetValue;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.TimerActivatedControl;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getNameLength <em>Name Length</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getAccessPoint <em>Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getClientServices <em>Client Services</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getCommProt <em>Comm Prot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getConfDataSet <em>Conf Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getConfLNs <em>Conf LNs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getConfLdName <em>Conf Ld Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getConfLogControl <em>Conf Log Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getConfReportControl <em>Conf Report Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getConfSigRef <em>Conf Sig Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getDataObjectDirectory <em>Data Object Directory</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getDataSetDirectory <em>Data Set Directory</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getDynAssociation <em>Dyn Association</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getDynDataSet <em>Dyn Data Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getFileHandling <em>File Handling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getGOOSE <em>GOOSE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getGSEDir <em>GSE Dir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getGSESettings <em>GSE Settings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getGSSE <em>GSSE</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getGetCBValues <em>Get CB Values</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getGetDataObjectDefinition <em>Get Data Object Definition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getGetDataSetValue <em>Get Data Set Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getGetDirectory <em>Get Directory</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getIED <em>IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getLogSettings <em>Log Settings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getReadWrite <em>Read Write</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getRedProt <em>Red Prot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getReportSettings <em>Report Settings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getSMVsc <em>SM Vsc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getSupSubscription <em>Sup Subscription</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getValueHandling <em>Value Handling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getSetDataSetValue <em>Set Data Set Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getSettingGroups <em>Setting Groups</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getTimeSyncProt <em>Time Sync Prot</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl#getTimerActivatedControl <em>Timer Activated Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicesImpl extends SclObjectImpl implements Services {
    /**
	 * The default value of the '{@link #getNameLength() <em>Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNameLength()
	 * @generated
	 * @ordered
	 */
    protected static final Integer NAME_LENGTH_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getNameLength() <em>Name Length</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNameLength()
	 * @generated
	 * @ordered
	 */
    protected Integer nameLength = NAME_LENGTH_EDEFAULT;

    /**
	 * This is true if the Name Length attribute has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean nameLengthESet;

    /**
	 * The cached value of the '{@link #getClientServices() <em>Client Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getClientServices()
	 * @generated
	 * @ordered
	 */
    protected ClientServices clientServices;

    /**
	 * This is true if the Client Services containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean clientServicesESet;

    /**
	 * The cached value of the '{@link #getCommProt() <em>Comm Prot</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getCommProt()
	 * @generated
	 * @ordered
	 */
    protected CommProt commProt;

    /**
	 * This is true if the Comm Prot containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean commProtESet;

    /**
	 * The cached value of the '{@link #getConfDataSet() <em>Conf Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfDataSet()
	 * @generated
	 * @ordered
	 */
    protected ConfDataSet confDataSet;

    /**
	 * This is true if the Conf Data Set containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean confDataSetESet;

    /**
	 * The cached value of the '{@link #getConfLNs() <em>Conf LNs</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfLNs()
	 * @generated
	 * @ordered
	 */
    protected ConfLNs confLNs;

    /**
	 * This is true if the Conf LNs containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean confLNsESet;

    /**
	 * The cached value of the '{@link #getConfLdName() <em>Conf Ld Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfLdName()
	 * @generated
	 * @ordered
	 */
    protected ConfLdName confLdName;

    /**
	 * This is true if the Conf Ld Name containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean confLdNameESet;

    /**
	 * The cached value of the '{@link #getConfLogControl() <em>Conf Log Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfLogControl()
	 * @generated
	 * @ordered
	 */
    protected ConfLogControl confLogControl;

    /**
	 * This is true if the Conf Log Control containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean confLogControlESet;

    /**
	 * The cached value of the '{@link #getConfReportControl() <em>Conf Report Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfReportControl()
	 * @generated
	 * @ordered
	 */
    protected ConfReportControl confReportControl;

    /**
	 * This is true if the Conf Report Control containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean confReportControlESet;

    /**
	 * The cached value of the '{@link #getConfSigRef() <em>Conf Sig Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConfSigRef()
	 * @generated
	 * @ordered
	 */
    protected ConfSigRef confSigRef;

    /**
	 * This is true if the Conf Sig Ref containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean confSigRefESet;

    /**
	 * The cached value of the '{@link #getDataObjectDirectory() <em>Data Object Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDataObjectDirectory()
	 * @generated
	 * @ordered
	 */
    protected DataObjectDirectory dataObjectDirectory;

    /**
	 * This is true if the Data Object Directory containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean dataObjectDirectoryESet;

    /**
	 * The cached value of the '{@link #getDataSetDirectory() <em>Data Set Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDataSetDirectory()
	 * @generated
	 * @ordered
	 */
    protected DataSetDirectory dataSetDirectory;

    /**
	 * This is true if the Data Set Directory containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean dataSetDirectoryESet;

    /**
	 * The cached value of the '{@link #getDynAssociation() <em>Dyn Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDynAssociation()
	 * @generated
	 * @ordered
	 */
    protected DynAssociation dynAssociation;

    /**
	 * This is true if the Dyn Association containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean dynAssociationESet;

    /**
	 * The cached value of the '{@link #getDynDataSet() <em>Dyn Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDynDataSet()
	 * @generated
	 * @ordered
	 */
    protected DynDataSet dynDataSet;

    /**
	 * This is true if the Dyn Data Set containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean dynDataSetESet;

    /**
	 * The cached value of the '{@link #getFileHandling() <em>File Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFileHandling()
	 * @generated
	 * @ordered
	 */
    protected FileHandling fileHandling;

    /**
	 * This is true if the File Handling containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean fileHandlingESet;

    /**
	 * The cached value of the '{@link #getGOOSE() <em>GOOSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGOOSE()
	 * @generated
	 * @ordered
	 */
    protected GOOSE goose;

    /**
	 * This is true if the GOOSE containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean gooseESet;

    /**
	 * The cached value of the '{@link #getGSEDir() <em>GSE Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGSEDir()
	 * @generated
	 * @ordered
	 */
    protected GSEDir gseDir;

    /**
	 * This is true if the GSE Dir containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean gseDirESet;

    /**
	 * The cached value of the '{@link #getGSESettings() <em>GSE Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGSESettings()
	 * @generated
	 * @ordered
	 */
    protected GSESettings gseSettings;

    /**
	 * This is true if the GSE Settings containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean gseSettingsESet;

    /**
	 * The cached value of the '{@link #getGSSE() <em>GSSE</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGSSE()
	 * @generated
	 * @ordered
	 */
    protected GSSE gsse;

    /**
	 * This is true if the GSSE containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean gsseESet;

    /**
	 * The cached value of the '{@link #getGetCBValues() <em>Get CB Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGetCBValues()
	 * @generated
	 * @ordered
	 */
    protected GetCBValues getCBValues;

    /**
	 * This is true if the Get CB Values containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean getCBValuesESet;

    /**
	 * The cached value of the '{@link #getGetDataObjectDefinition() <em>Get Data Object Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGetDataObjectDefinition()
	 * @generated
	 * @ordered
	 */
    protected GetDataObjectDefinition getDataObjectDefinition;

    /**
	 * This is true if the Get Data Object Definition containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean getDataObjectDefinitionESet;

    /**
	 * The cached value of the '{@link #getGetDataSetValue() <em>Get Data Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGetDataSetValue()
	 * @generated
	 * @ordered
	 */
    protected GetDataSetValue getDataSetValue;

    /**
	 * This is true if the Get Data Set Value containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean getDataSetValueESet;

    /**
	 * The cached value of the '{@link #getGetDirectory() <em>Get Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGetDirectory()
	 * @generated
	 * @ordered
	 */
    protected GetDirectory getDirectory;

    /**
	 * This is true if the Get Directory containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean getDirectoryESet;

    /**
	 * The cached value of the '{@link #getLogSettings() <em>Log Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getLogSettings()
	 * @generated
	 * @ordered
	 */
    protected LogSettings logSettings;

    /**
	 * This is true if the Log Settings containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean logSettingsESet;

    /**
	 * The cached value of the '{@link #getReadWrite() <em>Read Write</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReadWrite()
	 * @generated
	 * @ordered
	 */
    protected ReadWrite readWrite;

    /**
	 * This is true if the Read Write containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean readWriteESet;

    /**
	 * The cached value of the '{@link #getRedProt() <em>Red Prot</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRedProt()
	 * @generated
	 * @ordered
	 */
    protected RedProt redProt;

    /**
	 * This is true if the Red Prot containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean redProtESet;

    /**
	 * The cached value of the '{@link #getReportSettings() <em>Report Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReportSettings()
	 * @generated
	 * @ordered
	 */
    protected ReportSettings reportSettings;

    /**
	 * This is true if the Report Settings containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean reportSettingsESet;

    /**
	 * The cached value of the '{@link #getSMVsc() <em>SM Vsc</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSMVsc()
	 * @generated
	 * @ordered
	 */
    protected SMVsc smVsc;

    /**
	 * This is true if the SM Vsc containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean smVscESet;

    /**
	 * The cached value of the '{@link #getSupSubscription() <em>Sup Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSupSubscription()
	 * @generated
	 * @ordered
	 */
    protected SupSubscription supSubscription;

    /**
	 * This is true if the Sup Subscription containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean supSubscriptionESet;

    /**
	 * The cached value of the '{@link #getValueHandling() <em>Value Handling</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValueHandling()
	 * @generated
	 * @ordered
	 */
    protected ValueHandling valueHandling;

    /**
	 * This is true if the Value Handling containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean valueHandlingESet;

    /**
	 * The cached value of the '{@link #getSetDataSetValue() <em>Set Data Set Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSetDataSetValue()
	 * @generated
	 * @ordered
	 */
    protected SetDataSetValue setDataSetValue;

    /**
	 * This is true if the Set Data Set Value containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean setDataSetValueESet;

    /**
	 * The cached value of the '{@link #getSettingGroups() <em>Setting Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSettingGroups()
	 * @generated
	 * @ordered
	 */
    protected SettingGroups settingGroups;

    /**
	 * This is true if the Setting Groups containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean settingGroupsESet;

    /**
	 * The cached value of the '{@link #getTimeSyncProt() <em>Time Sync Prot</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTimeSyncProt()
	 * @generated
	 * @ordered
	 */
    protected TimeSyncProt timeSyncProt;

    /**
	 * This is true if the Time Sync Prot containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean timeSyncProtESet;

    /**
	 * The cached value of the '{@link #getTimerActivatedControl() <em>Timer Activated Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTimerActivatedControl()
	 * @generated
	 * @ordered
	 */
    protected TimerActivatedControl timerActivatedControl;

    /**
	 * This is true if the Timer Activated Control containment reference has been set.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    protected boolean timerActivatedControlESet;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ServicesImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getServices();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Integer getNameLength() {
		return nameLength;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNameLength(Integer newNameLength) {
		Integer oldNameLength = nameLength;
		nameLength = newNameLength;
		boolean oldNameLengthESet = nameLengthESet;
		nameLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__NAME_LENGTH, oldNameLength, nameLength, !oldNameLengthESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetNameLength() {
		Integer oldNameLength = nameLength;
		boolean oldNameLengthESet = nameLengthESet;
		nameLength = NAME_LENGTH_EDEFAULT;
		nameLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__NAME_LENGTH, oldNameLength, NAME_LENGTH_EDEFAULT, oldNameLengthESet));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetNameLength() {
		return nameLengthESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AccessPoint getAccessPoint() {
		if (eContainerFeatureID() != SclPackage.SERVICES__ACCESS_POINT) return null;
		return (AccessPoint)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetAccessPoint( AccessPoint newAccessPoint, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newAccessPoint, SclPackage.SERVICES__ACCESS_POINT, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAccessPoint( AccessPoint newAccessPoint ) {
		if (newAccessPoint != eInternalContainer() || (eContainerFeatureID() != SclPackage.SERVICES__ACCESS_POINT && newAccessPoint != null)) {
			if (EcoreUtil.isAncestor(this, newAccessPoint))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAccessPoint != null)
				msgs = ((InternalEObject)newAccessPoint).eInverseAdd(this, SclPackage.ACCESS_POINT__SERVICES, AccessPoint.class, msgs);
			msgs = basicSetAccessPoint(newAccessPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__ACCESS_POINT, newAccessPoint, newAccessPoint));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ClientServices getClientServices() {
		return clientServices;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetClientServices( ClientServices newClientServices, NotificationChain msgs ) {
		ClientServices oldClientServices = clientServices;
		clientServices = newClientServices;
		boolean oldClientServicesESet = clientServicesESet;
		clientServicesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CLIENT_SERVICES, oldClientServices, newClientServices, !oldClientServicesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setClientServices( ClientServices newClientServices ) {
		if (newClientServices != clientServices) {
			NotificationChain msgs = null;
			if (clientServices != null)
				msgs = ((InternalEObject)clientServices).eInverseRemove(this, SclPackage.CLIENT_SERVICES__SERVICES, ClientServices.class, msgs);
			if (newClientServices != null)
				msgs = ((InternalEObject)newClientServices).eInverseAdd(this, SclPackage.CLIENT_SERVICES__SERVICES, ClientServices.class, msgs);
			msgs = basicSetClientServices(newClientServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientServicesESet = clientServicesESet;
			clientServicesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CLIENT_SERVICES, newClientServices, newClientServices, !oldClientServicesESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetClientServices( NotificationChain msgs ) {
		ClientServices oldClientServices = clientServices;
		clientServices = null;
		boolean oldClientServicesESet = clientServicesESet;
		clientServicesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CLIENT_SERVICES, oldClientServices, null, oldClientServicesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetClientServices() {
		if (clientServices != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)clientServices).eInverseRemove(this, SclPackage.CLIENT_SERVICES__SERVICES, ClientServices.class, msgs);
			msgs = basicUnsetClientServices(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldClientServicesESet = clientServicesESet;
			clientServicesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CLIENT_SERVICES, null, null, oldClientServicesESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetClientServices() {
		return clientServicesESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CommProt getCommProt() {
		return commProt;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetCommProt( CommProt newCommProt, NotificationChain msgs ) {
		CommProt oldCommProt = commProt;
		commProt = newCommProt;
		boolean oldCommProtESet = commProtESet;
		commProtESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__COMM_PROT, oldCommProt, newCommProt, !oldCommProtESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setCommProt( CommProt newCommProt ) {
		if (newCommProt != commProt) {
			NotificationChain msgs = null;
			if (commProt != null)
				msgs = ((InternalEObject)commProt).eInverseRemove(this, SclPackage.COMM_PROT__SERVICES, CommProt.class, msgs);
			if (newCommProt != null)
				msgs = ((InternalEObject)newCommProt).eInverseAdd(this, SclPackage.COMM_PROT__SERVICES, CommProt.class, msgs);
			msgs = basicSetCommProt(newCommProt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCommProtESet = commProtESet;
			commProtESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__COMM_PROT, newCommProt, newCommProt, !oldCommProtESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetCommProt( NotificationChain msgs ) {
		CommProt oldCommProt = commProt;
		commProt = null;
		boolean oldCommProtESet = commProtESet;
		commProtESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__COMM_PROT, oldCommProt, null, oldCommProtESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetCommProt() {
		if (commProt != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)commProt).eInverseRemove(this, SclPackage.COMM_PROT__SERVICES, CommProt.class, msgs);
			msgs = basicUnsetCommProt(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCommProtESet = commProtESet;
			commProtESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__COMM_PROT, null, null, oldCommProtESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetCommProt() {
		return commProtESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConfDataSet getConfDataSet() {
		return confDataSet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetConfDataSet( ConfDataSet newConfDataSet, NotificationChain msgs ) {
		ConfDataSet oldConfDataSet = confDataSet;
		confDataSet = newConfDataSet;
		boolean oldConfDataSetESet = confDataSetESet;
		confDataSetESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_DATA_SET, oldConfDataSet, newConfDataSet, !oldConfDataSetESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfDataSet( ConfDataSet newConfDataSet ) {
		if (newConfDataSet != confDataSet) {
			NotificationChain msgs = null;
			if (confDataSet != null)
				msgs = ((InternalEObject)confDataSet).eInverseRemove(this, SclPackage.CONF_DATA_SET__SERVICES, ConfDataSet.class, msgs);
			if (newConfDataSet != null)
				msgs = ((InternalEObject)newConfDataSet).eInverseAdd(this, SclPackage.CONF_DATA_SET__SERVICES, ConfDataSet.class, msgs);
			msgs = basicSetConfDataSet(newConfDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfDataSetESet = confDataSetESet;
			confDataSetESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_DATA_SET, newConfDataSet, newConfDataSet, !oldConfDataSetESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetConfDataSet( NotificationChain msgs ) {
		ConfDataSet oldConfDataSet = confDataSet;
		confDataSet = null;
		boolean oldConfDataSetESet = confDataSetESet;
		confDataSetESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_DATA_SET, oldConfDataSet, null, oldConfDataSetESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetConfDataSet() {
		if (confDataSet != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)confDataSet).eInverseRemove(this, SclPackage.CONF_DATA_SET__SERVICES, ConfDataSet.class, msgs);
			msgs = basicUnsetConfDataSet(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfDataSetESet = confDataSetESet;
			confDataSetESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_DATA_SET, null, null, oldConfDataSetESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetConfDataSet() {
		return confDataSetESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConfLNs getConfLNs() {
		return confLNs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetConfLNs( ConfLNs newConfLNs, NotificationChain msgs ) {
		ConfLNs oldConfLNs = confLNs;
		confLNs = newConfLNs;
		boolean oldConfLNsESet = confLNsESet;
		confLNsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_LNS, oldConfLNs, newConfLNs, !oldConfLNsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfLNs( ConfLNs newConfLNs ) {
		if (newConfLNs != confLNs) {
			NotificationChain msgs = null;
			if (confLNs != null)
				msgs = ((InternalEObject)confLNs).eInverseRemove(this, SclPackage.CONF_LNS__SERVICES, ConfLNs.class, msgs);
			if (newConfLNs != null)
				msgs = ((InternalEObject)newConfLNs).eInverseAdd(this, SclPackage.CONF_LNS__SERVICES, ConfLNs.class, msgs);
			msgs = basicSetConfLNs(newConfLNs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfLNsESet = confLNsESet;
			confLNsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_LNS, newConfLNs, newConfLNs, !oldConfLNsESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetConfLNs( NotificationChain msgs ) {
		ConfLNs oldConfLNs = confLNs;
		confLNs = null;
		boolean oldConfLNsESet = confLNsESet;
		confLNsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_LNS, oldConfLNs, null, oldConfLNsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetConfLNs() {
		if (confLNs != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)confLNs).eInverseRemove(this, SclPackage.CONF_LNS__SERVICES, ConfLNs.class, msgs);
			msgs = basicUnsetConfLNs(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfLNsESet = confLNsESet;
			confLNsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_LNS, null, null, oldConfLNsESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetConfLNs() {
		return confLNsESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConfLdName getConfLdName() {
		return confLdName;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetConfLdName( ConfLdName newConfLdName, NotificationChain msgs ) {
		ConfLdName oldConfLdName = confLdName;
		confLdName = newConfLdName;
		boolean oldConfLdNameESet = confLdNameESet;
		confLdNameESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_LD_NAME, oldConfLdName, newConfLdName, !oldConfLdNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfLdName( ConfLdName newConfLdName ) {
		if (newConfLdName != confLdName) {
			NotificationChain msgs = null;
			if (confLdName != null)
				msgs = ((InternalEObject)confLdName).eInverseRemove(this, SclPackage.CONF_LD_NAME__SERVICES, ConfLdName.class, msgs);
			if (newConfLdName != null)
				msgs = ((InternalEObject)newConfLdName).eInverseAdd(this, SclPackage.CONF_LD_NAME__SERVICES, ConfLdName.class, msgs);
			msgs = basicSetConfLdName(newConfLdName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfLdNameESet = confLdNameESet;
			confLdNameESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_LD_NAME, newConfLdName, newConfLdName, !oldConfLdNameESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetConfLdName( NotificationChain msgs ) {
		ConfLdName oldConfLdName = confLdName;
		confLdName = null;
		boolean oldConfLdNameESet = confLdNameESet;
		confLdNameESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_LD_NAME, oldConfLdName, null, oldConfLdNameESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetConfLdName() {
		if (confLdName != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)confLdName).eInverseRemove(this, SclPackage.CONF_LD_NAME__SERVICES, ConfLdName.class, msgs);
			msgs = basicUnsetConfLdName(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfLdNameESet = confLdNameESet;
			confLdNameESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_LD_NAME, null, null, oldConfLdNameESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetConfLdName() {
		return confLdNameESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConfLogControl getConfLogControl() {
		return confLogControl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetConfLogControl( ConfLogControl newConfLogControl, NotificationChain msgs ) {
		ConfLogControl oldConfLogControl = confLogControl;
		confLogControl = newConfLogControl;
		boolean oldConfLogControlESet = confLogControlESet;
		confLogControlESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_LOG_CONTROL, oldConfLogControl, newConfLogControl, !oldConfLogControlESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfLogControl( ConfLogControl newConfLogControl ) {
		if (newConfLogControl != confLogControl) {
			NotificationChain msgs = null;
			if (confLogControl != null)
				msgs = ((InternalEObject)confLogControl).eInverseRemove(this, SclPackage.CONF_LOG_CONTROL__SERVICES, ConfLogControl.class, msgs);
			if (newConfLogControl != null)
				msgs = ((InternalEObject)newConfLogControl).eInverseAdd(this, SclPackage.CONF_LOG_CONTROL__SERVICES, ConfLogControl.class, msgs);
			msgs = basicSetConfLogControl(newConfLogControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfLogControlESet = confLogControlESet;
			confLogControlESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_LOG_CONTROL, newConfLogControl, newConfLogControl, !oldConfLogControlESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetConfLogControl( NotificationChain msgs ) {
		ConfLogControl oldConfLogControl = confLogControl;
		confLogControl = null;
		boolean oldConfLogControlESet = confLogControlESet;
		confLogControlESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_LOG_CONTROL, oldConfLogControl, null, oldConfLogControlESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetConfLogControl() {
		if (confLogControl != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)confLogControl).eInverseRemove(this, SclPackage.CONF_LOG_CONTROL__SERVICES, ConfLogControl.class, msgs);
			msgs = basicUnsetConfLogControl(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfLogControlESet = confLogControlESet;
			confLogControlESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_LOG_CONTROL, null, null, oldConfLogControlESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetConfLogControl() {
		return confLogControlESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConfReportControl getConfReportControl() {
		return confReportControl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetConfReportControl( ConfReportControl newConfReportControl, NotificationChain msgs ) {
		ConfReportControl oldConfReportControl = confReportControl;
		confReportControl = newConfReportControl;
		boolean oldConfReportControlESet = confReportControlESet;
		confReportControlESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_REPORT_CONTROL, oldConfReportControl, newConfReportControl, !oldConfReportControlESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfReportControl( ConfReportControl newConfReportControl ) {
		if (newConfReportControl != confReportControl) {
			NotificationChain msgs = null;
			if (confReportControl != null)
				msgs = ((InternalEObject)confReportControl).eInverseRemove(this, SclPackage.CONF_REPORT_CONTROL__SERVICES, ConfReportControl.class, msgs);
			if (newConfReportControl != null)
				msgs = ((InternalEObject)newConfReportControl).eInverseAdd(this, SclPackage.CONF_REPORT_CONTROL__SERVICES, ConfReportControl.class, msgs);
			msgs = basicSetConfReportControl(newConfReportControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfReportControlESet = confReportControlESet;
			confReportControlESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_REPORT_CONTROL, newConfReportControl, newConfReportControl, !oldConfReportControlESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetConfReportControl( NotificationChain msgs ) {
		ConfReportControl oldConfReportControl = confReportControl;
		confReportControl = null;
		boolean oldConfReportControlESet = confReportControlESet;
		confReportControlESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_REPORT_CONTROL, oldConfReportControl, null, oldConfReportControlESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetConfReportControl() {
		if (confReportControl != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)confReportControl).eInverseRemove(this, SclPackage.CONF_REPORT_CONTROL__SERVICES, ConfReportControl.class, msgs);
			msgs = basicUnsetConfReportControl(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfReportControlESet = confReportControlESet;
			confReportControlESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_REPORT_CONTROL, null, null, oldConfReportControlESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetConfReportControl() {
		return confReportControlESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConfSigRef getConfSigRef() {
		return confSigRef;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetConfSigRef( ConfSigRef newConfSigRef, NotificationChain msgs ) {
		ConfSigRef oldConfSigRef = confSigRef;
		confSigRef = newConfSigRef;
		boolean oldConfSigRefESet = confSigRefESet;
		confSigRefESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_SIG_REF, oldConfSigRef, newConfSigRef, !oldConfSigRefESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConfSigRef( ConfSigRef newConfSigRef ) {
		if (newConfSigRef != confSigRef) {
			NotificationChain msgs = null;
			if (confSigRef != null)
				msgs = ((InternalEObject)confSigRef).eInverseRemove(this, SclPackage.CONF_SIG_REF__SERVICES, ConfSigRef.class, msgs);
			if (newConfSigRef != null)
				msgs = ((InternalEObject)newConfSigRef).eInverseAdd(this, SclPackage.CONF_SIG_REF__SERVICES, ConfSigRef.class, msgs);
			msgs = basicSetConfSigRef(newConfSigRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfSigRefESet = confSigRefESet;
			confSigRefESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__CONF_SIG_REF, newConfSigRef, newConfSigRef, !oldConfSigRefESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetConfSigRef( NotificationChain msgs ) {
		ConfSigRef oldConfSigRef = confSigRef;
		confSigRef = null;
		boolean oldConfSigRefESet = confSigRefESet;
		confSigRefESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_SIG_REF, oldConfSigRef, null, oldConfSigRefESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetConfSigRef() {
		if (confSigRef != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)confSigRef).eInverseRemove(this, SclPackage.CONF_SIG_REF__SERVICES, ConfSigRef.class, msgs);
			msgs = basicUnsetConfSigRef(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldConfSigRefESet = confSigRefESet;
			confSigRefESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__CONF_SIG_REF, null, null, oldConfSigRefESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetConfSigRef() {
		return confSigRefESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataObjectDirectory getDataObjectDirectory() {
		return dataObjectDirectory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDataObjectDirectory( DataObjectDirectory newDataObjectDirectory,
            NotificationChain msgs ) {
		DataObjectDirectory oldDataObjectDirectory = dataObjectDirectory;
		dataObjectDirectory = newDataObjectDirectory;
		boolean oldDataObjectDirectoryESet = dataObjectDirectoryESet;
		dataObjectDirectoryESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__DATA_OBJECT_DIRECTORY, oldDataObjectDirectory, newDataObjectDirectory, !oldDataObjectDirectoryESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataObjectDirectory( DataObjectDirectory newDataObjectDirectory ) {
		if (newDataObjectDirectory != dataObjectDirectory) {
			NotificationChain msgs = null;
			if (dataObjectDirectory != null)
				msgs = ((InternalEObject)dataObjectDirectory).eInverseRemove(this, SclPackage.DATA_OBJECT_DIRECTORY__SERVICES, DataObjectDirectory.class, msgs);
			if (newDataObjectDirectory != null)
				msgs = ((InternalEObject)newDataObjectDirectory).eInverseAdd(this, SclPackage.DATA_OBJECT_DIRECTORY__SERVICES, DataObjectDirectory.class, msgs);
			msgs = basicSetDataObjectDirectory(newDataObjectDirectory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataObjectDirectoryESet = dataObjectDirectoryESet;
			dataObjectDirectoryESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__DATA_OBJECT_DIRECTORY, newDataObjectDirectory, newDataObjectDirectory, !oldDataObjectDirectoryESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetDataObjectDirectory( NotificationChain msgs ) {
		DataObjectDirectory oldDataObjectDirectory = dataObjectDirectory;
		dataObjectDirectory = null;
		boolean oldDataObjectDirectoryESet = dataObjectDirectoryESet;
		dataObjectDirectoryESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__DATA_OBJECT_DIRECTORY, oldDataObjectDirectory, null, oldDataObjectDirectoryESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetDataObjectDirectory() {
		if (dataObjectDirectory != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataObjectDirectory).eInverseRemove(this, SclPackage.DATA_OBJECT_DIRECTORY__SERVICES, DataObjectDirectory.class, msgs);
			msgs = basicUnsetDataObjectDirectory(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataObjectDirectoryESet = dataObjectDirectoryESet;
			dataObjectDirectoryESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__DATA_OBJECT_DIRECTORY, null, null, oldDataObjectDirectoryESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetDataObjectDirectory() {
		return dataObjectDirectoryESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DataSetDirectory getDataSetDirectory() {
		return dataSetDirectory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDataSetDirectory( DataSetDirectory newDataSetDirectory, NotificationChain msgs ) {
		DataSetDirectory oldDataSetDirectory = dataSetDirectory;
		dataSetDirectory = newDataSetDirectory;
		boolean oldDataSetDirectoryESet = dataSetDirectoryESet;
		dataSetDirectoryESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__DATA_SET_DIRECTORY, oldDataSetDirectory, newDataSetDirectory, !oldDataSetDirectoryESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDataSetDirectory( DataSetDirectory newDataSetDirectory ) {
		if (newDataSetDirectory != dataSetDirectory) {
			NotificationChain msgs = null;
			if (dataSetDirectory != null)
				msgs = ((InternalEObject)dataSetDirectory).eInverseRemove(this, SclPackage.DATA_SET_DIRECTORY__SERVICES, DataSetDirectory.class, msgs);
			if (newDataSetDirectory != null)
				msgs = ((InternalEObject)newDataSetDirectory).eInverseAdd(this, SclPackage.DATA_SET_DIRECTORY__SERVICES, DataSetDirectory.class, msgs);
			msgs = basicSetDataSetDirectory(newDataSetDirectory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetDirectoryESet = dataSetDirectoryESet;
			dataSetDirectoryESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__DATA_SET_DIRECTORY, newDataSetDirectory, newDataSetDirectory, !oldDataSetDirectoryESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetDataSetDirectory( NotificationChain msgs ) {
		DataSetDirectory oldDataSetDirectory = dataSetDirectory;
		dataSetDirectory = null;
		boolean oldDataSetDirectoryESet = dataSetDirectoryESet;
		dataSetDirectoryESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__DATA_SET_DIRECTORY, oldDataSetDirectory, null, oldDataSetDirectoryESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetDataSetDirectory() {
		if (dataSetDirectory != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dataSetDirectory).eInverseRemove(this, SclPackage.DATA_SET_DIRECTORY__SERVICES, DataSetDirectory.class, msgs);
			msgs = basicUnsetDataSetDirectory(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDataSetDirectoryESet = dataSetDirectoryESet;
			dataSetDirectoryESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__DATA_SET_DIRECTORY, null, null, oldDataSetDirectoryESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetDataSetDirectory() {
		return dataSetDirectoryESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DynAssociation getDynAssociation() {
		return dynAssociation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDynAssociation( DynAssociation newDynAssociation, NotificationChain msgs ) {
		DynAssociation oldDynAssociation = dynAssociation;
		dynAssociation = newDynAssociation;
		boolean oldDynAssociationESet = dynAssociationESet;
		dynAssociationESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__DYN_ASSOCIATION, oldDynAssociation, newDynAssociation, !oldDynAssociationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDynAssociation( DynAssociation newDynAssociation ) {
		if (newDynAssociation != dynAssociation) {
			NotificationChain msgs = null;
			if (dynAssociation != null)
				msgs = ((InternalEObject)dynAssociation).eInverseRemove(this, SclPackage.DYN_ASSOCIATION__SERVICES, DynAssociation.class, msgs);
			if (newDynAssociation != null)
				msgs = ((InternalEObject)newDynAssociation).eInverseAdd(this, SclPackage.DYN_ASSOCIATION__SERVICES, DynAssociation.class, msgs);
			msgs = basicSetDynAssociation(newDynAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDynAssociationESet = dynAssociationESet;
			dynAssociationESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__DYN_ASSOCIATION, newDynAssociation, newDynAssociation, !oldDynAssociationESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetDynAssociation( NotificationChain msgs ) {
		DynAssociation oldDynAssociation = dynAssociation;
		dynAssociation = null;
		boolean oldDynAssociationESet = dynAssociationESet;
		dynAssociationESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__DYN_ASSOCIATION, oldDynAssociation, null, oldDynAssociationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetDynAssociation() {
		if (dynAssociation != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dynAssociation).eInverseRemove(this, SclPackage.DYN_ASSOCIATION__SERVICES, DynAssociation.class, msgs);
			msgs = basicUnsetDynAssociation(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDynAssociationESet = dynAssociationESet;
			dynAssociationESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__DYN_ASSOCIATION, null, null, oldDynAssociationESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetDynAssociation() {
		return dynAssociationESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DynDataSet getDynDataSet() {
		return dynDataSet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDynDataSet( DynDataSet newDynDataSet, NotificationChain msgs ) {
		DynDataSet oldDynDataSet = dynDataSet;
		dynDataSet = newDynDataSet;
		boolean oldDynDataSetESet = dynDataSetESet;
		dynDataSetESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__DYN_DATA_SET, oldDynDataSet, newDynDataSet, !oldDynDataSetESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setDynDataSet( DynDataSet newDynDataSet ) {
		if (newDynDataSet != dynDataSet) {
			NotificationChain msgs = null;
			if (dynDataSet != null)
				msgs = ((InternalEObject)dynDataSet).eInverseRemove(this, SclPackage.DYN_DATA_SET__SERVICES, DynDataSet.class, msgs);
			if (newDynDataSet != null)
				msgs = ((InternalEObject)newDynDataSet).eInverseAdd(this, SclPackage.DYN_DATA_SET__SERVICES, DynDataSet.class, msgs);
			msgs = basicSetDynDataSet(newDynDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDynDataSetESet = dynDataSetESet;
			dynDataSetESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__DYN_DATA_SET, newDynDataSet, newDynDataSet, !oldDynDataSetESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetDynDataSet( NotificationChain msgs ) {
		DynDataSet oldDynDataSet = dynDataSet;
		dynDataSet = null;
		boolean oldDynDataSetESet = dynDataSetESet;
		dynDataSetESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__DYN_DATA_SET, oldDynDataSet, null, oldDynDataSetESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetDynDataSet() {
		if (dynDataSet != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dynDataSet).eInverseRemove(this, SclPackage.DYN_DATA_SET__SERVICES, DynDataSet.class, msgs);
			msgs = basicUnsetDynDataSet(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDynDataSetESet = dynDataSetESet;
			dynDataSetESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__DYN_DATA_SET, null, null, oldDynDataSetESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetDynDataSet() {
		return dynDataSetESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FileHandling getFileHandling() {
		return fileHandling;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetFileHandling( FileHandling newFileHandling, NotificationChain msgs ) {
		FileHandling oldFileHandling = fileHandling;
		fileHandling = newFileHandling;
		boolean oldFileHandlingESet = fileHandlingESet;
		fileHandlingESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__FILE_HANDLING, oldFileHandling, newFileHandling, !oldFileHandlingESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFileHandling( FileHandling newFileHandling ) {
		if (newFileHandling != fileHandling) {
			NotificationChain msgs = null;
			if (fileHandling != null)
				msgs = ((InternalEObject)fileHandling).eInverseRemove(this, SclPackage.FILE_HANDLING__SERVICES, FileHandling.class, msgs);
			if (newFileHandling != null)
				msgs = ((InternalEObject)newFileHandling).eInverseAdd(this, SclPackage.FILE_HANDLING__SERVICES, FileHandling.class, msgs);
			msgs = basicSetFileHandling(newFileHandling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFileHandlingESet = fileHandlingESet;
			fileHandlingESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__FILE_HANDLING, newFileHandling, newFileHandling, !oldFileHandlingESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetFileHandling( NotificationChain msgs ) {
		FileHandling oldFileHandling = fileHandling;
		fileHandling = null;
		boolean oldFileHandlingESet = fileHandlingESet;
		fileHandlingESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__FILE_HANDLING, oldFileHandling, null, oldFileHandlingESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetFileHandling() {
		if (fileHandling != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)fileHandling).eInverseRemove(this, SclPackage.FILE_HANDLING__SERVICES, FileHandling.class, msgs);
			msgs = basicUnsetFileHandling(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldFileHandlingESet = fileHandlingESet;
			fileHandlingESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__FILE_HANDLING, null, null, oldFileHandlingESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetFileHandling() {
		return fileHandlingESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GOOSE getGOOSE() {
		return goose;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGOOSE( GOOSE newGOOSE, NotificationChain msgs ) {
		GOOSE oldGOOSE = goose;
		goose = newGOOSE;
		boolean oldGOOSEESet = gooseESet;
		gooseESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GOOSE, oldGOOSE, newGOOSE, !oldGOOSEESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGOOSE( GOOSE newGOOSE ) {
		if (newGOOSE != goose) {
			NotificationChain msgs = null;
			if (goose != null)
				msgs = ((InternalEObject)goose).eInverseRemove(this, SclPackage.GOOSE__SERVICES, GOOSE.class, msgs);
			if (newGOOSE != null)
				msgs = ((InternalEObject)newGOOSE).eInverseAdd(this, SclPackage.GOOSE__SERVICES, GOOSE.class, msgs);
			msgs = basicSetGOOSE(newGOOSE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGOOSEESet = gooseESet;
			gooseESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GOOSE, newGOOSE, newGOOSE, !oldGOOSEESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetGOOSE( NotificationChain msgs ) {
		GOOSE oldGOOSE = goose;
		goose = null;
		boolean oldGOOSEESet = gooseESet;
		gooseESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GOOSE, oldGOOSE, null, oldGOOSEESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetGOOSE() {
		if (goose != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)goose).eInverseRemove(this, SclPackage.GOOSE__SERVICES, GOOSE.class, msgs);
			msgs = basicUnsetGOOSE(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGOOSEESet = gooseESet;
			gooseESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GOOSE, null, null, oldGOOSEESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGOOSE() {
		return gooseESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GSEDir getGSEDir() {
		return gseDir;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGSEDir( GSEDir newGSEDir, NotificationChain msgs ) {
		GSEDir oldGSEDir = gseDir;
		gseDir = newGSEDir;
		boolean oldGSEDirESet = gseDirESet;
		gseDirESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GSE_DIR, oldGSEDir, newGSEDir, !oldGSEDirESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGSEDir( GSEDir newGSEDir ) {
		if (newGSEDir != gseDir) {
			NotificationChain msgs = null;
			if (gseDir != null)
				msgs = ((InternalEObject)gseDir).eInverseRemove(this, SclPackage.GSE_DIR__SERVICES, GSEDir.class, msgs);
			if (newGSEDir != null)
				msgs = ((InternalEObject)newGSEDir).eInverseAdd(this, SclPackage.GSE_DIR__SERVICES, GSEDir.class, msgs);
			msgs = basicSetGSEDir(newGSEDir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGSEDirESet = gseDirESet;
			gseDirESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GSE_DIR, newGSEDir, newGSEDir, !oldGSEDirESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetGSEDir( NotificationChain msgs ) {
		GSEDir oldGSEDir = gseDir;
		gseDir = null;
		boolean oldGSEDirESet = gseDirESet;
		gseDirESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GSE_DIR, oldGSEDir, null, oldGSEDirESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetGSEDir() {
		if (gseDir != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)gseDir).eInverseRemove(this, SclPackage.GSE_DIR__SERVICES, GSEDir.class, msgs);
			msgs = basicUnsetGSEDir(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGSEDirESet = gseDirESet;
			gseDirESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GSE_DIR, null, null, oldGSEDirESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGSEDir() {
		return gseDirESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GSESettings getGSESettings() {
		return gseSettings;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGSESettings( GSESettings newGSESettings, NotificationChain msgs ) {
		GSESettings oldGSESettings = gseSettings;
		gseSettings = newGSESettings;
		boolean oldGSESettingsESet = gseSettingsESet;
		gseSettingsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GSE_SETTINGS, oldGSESettings, newGSESettings, !oldGSESettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGSESettings( GSESettings newGSESettings ) {
		if (newGSESettings != gseSettings) {
			NotificationChain msgs = null;
			if (gseSettings != null)
				msgs = ((InternalEObject)gseSettings).eInverseRemove(this, SclPackage.GSE_SETTINGS__SERVICES, GSESettings.class, msgs);
			if (newGSESettings != null)
				msgs = ((InternalEObject)newGSESettings).eInverseAdd(this, SclPackage.GSE_SETTINGS__SERVICES, GSESettings.class, msgs);
			msgs = basicSetGSESettings(newGSESettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGSESettingsESet = gseSettingsESet;
			gseSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GSE_SETTINGS, newGSESettings, newGSESettings, !oldGSESettingsESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetGSESettings( NotificationChain msgs ) {
		GSESettings oldGSESettings = gseSettings;
		gseSettings = null;
		boolean oldGSESettingsESet = gseSettingsESet;
		gseSettingsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GSE_SETTINGS, oldGSESettings, null, oldGSESettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetGSESettings() {
		if (gseSettings != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)gseSettings).eInverseRemove(this, SclPackage.GSE_SETTINGS__SERVICES, GSESettings.class, msgs);
			msgs = basicUnsetGSESettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGSESettingsESet = gseSettingsESet;
			gseSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GSE_SETTINGS, null, null, oldGSESettingsESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGSESettings() {
		return gseSettingsESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GSSE getGSSE() {
		return gsse;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGSSE( GSSE newGSSE, NotificationChain msgs ) {
		GSSE oldGSSE = gsse;
		gsse = newGSSE;
		boolean oldGSSEESet = gsseESet;
		gsseESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GSSE, oldGSSE, newGSSE, !oldGSSEESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGSSE( GSSE newGSSE ) {
		if (newGSSE != gsse) {
			NotificationChain msgs = null;
			if (gsse != null)
				msgs = ((InternalEObject)gsse).eInverseRemove(this, SclPackage.GSSE__SERVICES, GSSE.class, msgs);
			if (newGSSE != null)
				msgs = ((InternalEObject)newGSSE).eInverseAdd(this, SclPackage.GSSE__SERVICES, GSSE.class, msgs);
			msgs = basicSetGSSE(newGSSE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGSSEESet = gsseESet;
			gsseESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GSSE, newGSSE, newGSSE, !oldGSSEESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetGSSE( NotificationChain msgs ) {
		GSSE oldGSSE = gsse;
		gsse = null;
		boolean oldGSSEESet = gsseESet;
		gsseESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GSSE, oldGSSE, null, oldGSSEESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetGSSE() {
		if (gsse != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)gsse).eInverseRemove(this, SclPackage.GSSE__SERVICES, GSSE.class, msgs);
			msgs = basicUnsetGSSE(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGSSEESet = gsseESet;
			gsseESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GSSE, null, null, oldGSSEESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGSSE() {
		return gsseESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GetCBValues getGetCBValues() {
		return getCBValues;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGetCBValues( GetCBValues newGetCBValues, NotificationChain msgs ) {
		GetCBValues oldGetCBValues = getCBValues;
		getCBValues = newGetCBValues;
		boolean oldGetCBValuesESet = getCBValuesESet;
		getCBValuesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GET_CB_VALUES, oldGetCBValues, newGetCBValues, !oldGetCBValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGetCBValues( GetCBValues newGetCBValues ) {
		if (newGetCBValues != getCBValues) {
			NotificationChain msgs = null;
			if (getCBValues != null)
				msgs = ((InternalEObject)getCBValues).eInverseRemove(this, SclPackage.GET_CB_VALUES__SERVICES, GetCBValues.class, msgs);
			if (newGetCBValues != null)
				msgs = ((InternalEObject)newGetCBValues).eInverseAdd(this, SclPackage.GET_CB_VALUES__SERVICES, GetCBValues.class, msgs);
			msgs = basicSetGetCBValues(newGetCBValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGetCBValuesESet = getCBValuesESet;
			getCBValuesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GET_CB_VALUES, newGetCBValues, newGetCBValues, !oldGetCBValuesESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetGetCBValues( NotificationChain msgs ) {
		GetCBValues oldGetCBValues = getCBValues;
		getCBValues = null;
		boolean oldGetCBValuesESet = getCBValuesESet;
		getCBValuesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GET_CB_VALUES, oldGetCBValues, null, oldGetCBValuesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetGetCBValues() {
		if (getCBValues != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)getCBValues).eInverseRemove(this, SclPackage.GET_CB_VALUES__SERVICES, GetCBValues.class, msgs);
			msgs = basicUnsetGetCBValues(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGetCBValuesESet = getCBValuesESet;
			getCBValuesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GET_CB_VALUES, null, null, oldGetCBValuesESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGetCBValues() {
		return getCBValuesESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GetDataObjectDefinition getGetDataObjectDefinition() {
		return getDataObjectDefinition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGetDataObjectDefinition( GetDataObjectDefinition newGetDataObjectDefinition,
            NotificationChain msgs ) {
		GetDataObjectDefinition oldGetDataObjectDefinition = getDataObjectDefinition;
		getDataObjectDefinition = newGetDataObjectDefinition;
		boolean oldGetDataObjectDefinitionESet = getDataObjectDefinitionESet;
		getDataObjectDefinitionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION, oldGetDataObjectDefinition, newGetDataObjectDefinition, !oldGetDataObjectDefinitionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGetDataObjectDefinition( GetDataObjectDefinition newGetDataObjectDefinition ) {
		if (newGetDataObjectDefinition != getDataObjectDefinition) {
			NotificationChain msgs = null;
			if (getDataObjectDefinition != null)
				msgs = ((InternalEObject)getDataObjectDefinition).eInverseRemove(this, SclPackage.GET_DATA_OBJECT_DEFINITION__SERVICES, GetDataObjectDefinition.class, msgs);
			if (newGetDataObjectDefinition != null)
				msgs = ((InternalEObject)newGetDataObjectDefinition).eInverseAdd(this, SclPackage.GET_DATA_OBJECT_DEFINITION__SERVICES, GetDataObjectDefinition.class, msgs);
			msgs = basicSetGetDataObjectDefinition(newGetDataObjectDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGetDataObjectDefinitionESet = getDataObjectDefinitionESet;
			getDataObjectDefinitionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION, newGetDataObjectDefinition, newGetDataObjectDefinition, !oldGetDataObjectDefinitionESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetGetDataObjectDefinition( NotificationChain msgs ) {
		GetDataObjectDefinition oldGetDataObjectDefinition = getDataObjectDefinition;
		getDataObjectDefinition = null;
		boolean oldGetDataObjectDefinitionESet = getDataObjectDefinitionESet;
		getDataObjectDefinitionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION, oldGetDataObjectDefinition, null, oldGetDataObjectDefinitionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetGetDataObjectDefinition() {
		if (getDataObjectDefinition != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)getDataObjectDefinition).eInverseRemove(this, SclPackage.GET_DATA_OBJECT_DEFINITION__SERVICES, GetDataObjectDefinition.class, msgs);
			msgs = basicUnsetGetDataObjectDefinition(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGetDataObjectDefinitionESet = getDataObjectDefinitionESet;
			getDataObjectDefinitionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION, null, null, oldGetDataObjectDefinitionESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGetDataObjectDefinition() {
		return getDataObjectDefinitionESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GetDataSetValue getGetDataSetValue() {
		return getDataSetValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGetDataSetValue( GetDataSetValue newGetDataSetValue, NotificationChain msgs ) {
		GetDataSetValue oldGetDataSetValue = getDataSetValue;
		getDataSetValue = newGetDataSetValue;
		boolean oldGetDataSetValueESet = getDataSetValueESet;
		getDataSetValueESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GET_DATA_SET_VALUE, oldGetDataSetValue, newGetDataSetValue, !oldGetDataSetValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGetDataSetValue( GetDataSetValue newGetDataSetValue ) {
		if (newGetDataSetValue != getDataSetValue) {
			NotificationChain msgs = null;
			if (getDataSetValue != null)
				msgs = ((InternalEObject)getDataSetValue).eInverseRemove(this, SclPackage.GET_DATA_SET_VALUE__SERVICES, GetDataSetValue.class, msgs);
			if (newGetDataSetValue != null)
				msgs = ((InternalEObject)newGetDataSetValue).eInverseAdd(this, SclPackage.GET_DATA_SET_VALUE__SERVICES, GetDataSetValue.class, msgs);
			msgs = basicSetGetDataSetValue(newGetDataSetValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGetDataSetValueESet = getDataSetValueESet;
			getDataSetValueESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GET_DATA_SET_VALUE, newGetDataSetValue, newGetDataSetValue, !oldGetDataSetValueESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetGetDataSetValue( NotificationChain msgs ) {
		GetDataSetValue oldGetDataSetValue = getDataSetValue;
		getDataSetValue = null;
		boolean oldGetDataSetValueESet = getDataSetValueESet;
		getDataSetValueESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GET_DATA_SET_VALUE, oldGetDataSetValue, null, oldGetDataSetValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetGetDataSetValue() {
		if (getDataSetValue != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)getDataSetValue).eInverseRemove(this, SclPackage.GET_DATA_SET_VALUE__SERVICES, GetDataSetValue.class, msgs);
			msgs = basicUnsetGetDataSetValue(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGetDataSetValueESet = getDataSetValueESet;
			getDataSetValueESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GET_DATA_SET_VALUE, null, null, oldGetDataSetValueESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGetDataSetValue() {
		return getDataSetValueESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public GetDirectory getGetDirectory() {
		return getDirectory;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetGetDirectory( GetDirectory newGetDirectory, NotificationChain msgs ) {
		GetDirectory oldGetDirectory = getDirectory;
		getDirectory = newGetDirectory;
		boolean oldGetDirectoryESet = getDirectoryESet;
		getDirectoryESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GET_DIRECTORY, oldGetDirectory, newGetDirectory, !oldGetDirectoryESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setGetDirectory( GetDirectory newGetDirectory ) {
		if (newGetDirectory != getDirectory) {
			NotificationChain msgs = null;
			if (getDirectory != null)
				msgs = ((InternalEObject)getDirectory).eInverseRemove(this, SclPackage.GET_DIRECTORY__SERVICES, GetDirectory.class, msgs);
			if (newGetDirectory != null)
				msgs = ((InternalEObject)newGetDirectory).eInverseAdd(this, SclPackage.GET_DIRECTORY__SERVICES, GetDirectory.class, msgs);
			msgs = basicSetGetDirectory(newGetDirectory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGetDirectoryESet = getDirectoryESet;
			getDirectoryESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__GET_DIRECTORY, newGetDirectory, newGetDirectory, !oldGetDirectoryESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetGetDirectory( NotificationChain msgs ) {
		GetDirectory oldGetDirectory = getDirectory;
		getDirectory = null;
		boolean oldGetDirectoryESet = getDirectoryESet;
		getDirectoryESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GET_DIRECTORY, oldGetDirectory, null, oldGetDirectoryESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetGetDirectory() {
		if (getDirectory != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)getDirectory).eInverseRemove(this, SclPackage.GET_DIRECTORY__SERVICES, GetDirectory.class, msgs);
			msgs = basicUnsetGetDirectory(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGetDirectoryESet = getDirectoryESet;
			getDirectoryESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__GET_DIRECTORY, null, null, oldGetDirectoryESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetGetDirectory() {
		return getDirectoryESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IED getIED() {
		if (eContainerFeatureID() != SclPackage.SERVICES__IED) return null;
		return (IED)eInternalContainer();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetIED( IED newIED, NotificationChain msgs ) {
		msgs = eBasicSetContainer((InternalEObject)newIED, SclPackage.SERVICES__IED, msgs);
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIED( IED newIED ) {
		if (newIED != eInternalContainer() || (eContainerFeatureID() != SclPackage.SERVICES__IED && newIED != null)) {
			if (EcoreUtil.isAncestor(this, newIED))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIED != null)
				msgs = ((InternalEObject)newIED).eInverseAdd(this, SclPackage.IED__SERVICES, IED.class, msgs);
			msgs = basicSetIED(newIED, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__IED, newIED, newIED));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public LogSettings getLogSettings() {
		return logSettings;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetLogSettings( LogSettings newLogSettings, NotificationChain msgs ) {
		LogSettings oldLogSettings = logSettings;
		logSettings = newLogSettings;
		boolean oldLogSettingsESet = logSettingsESet;
		logSettingsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__LOG_SETTINGS, oldLogSettings, newLogSettings, !oldLogSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setLogSettings( LogSettings newLogSettings ) {
		if (newLogSettings != logSettings) {
			NotificationChain msgs = null;
			if (logSettings != null)
				msgs = ((InternalEObject)logSettings).eInverseRemove(this, SclPackage.LOG_SETTINGS__SERVICES, LogSettings.class, msgs);
			if (newLogSettings != null)
				msgs = ((InternalEObject)newLogSettings).eInverseAdd(this, SclPackage.LOG_SETTINGS__SERVICES, LogSettings.class, msgs);
			msgs = basicSetLogSettings(newLogSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLogSettingsESet = logSettingsESet;
			logSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__LOG_SETTINGS, newLogSettings, newLogSettings, !oldLogSettingsESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetLogSettings( NotificationChain msgs ) {
		LogSettings oldLogSettings = logSettings;
		logSettings = null;
		boolean oldLogSettingsESet = logSettingsESet;
		logSettingsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__LOG_SETTINGS, oldLogSettings, null, oldLogSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetLogSettings() {
		if (logSettings != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)logSettings).eInverseRemove(this, SclPackage.LOG_SETTINGS__SERVICES, LogSettings.class, msgs);
			msgs = basicUnsetLogSettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldLogSettingsESet = logSettingsESet;
			logSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__LOG_SETTINGS, null, null, oldLogSettingsESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetLogSettings() {
		return logSettingsESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReadWrite getReadWrite() {
		return readWrite;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetReadWrite( ReadWrite newReadWrite, NotificationChain msgs ) {
		ReadWrite oldReadWrite = readWrite;
		readWrite = newReadWrite;
		boolean oldReadWriteESet = readWriteESet;
		readWriteESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__READ_WRITE, oldReadWrite, newReadWrite, !oldReadWriteESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReadWrite( ReadWrite newReadWrite ) {
		if (newReadWrite != readWrite) {
			NotificationChain msgs = null;
			if (readWrite != null)
				msgs = ((InternalEObject)readWrite).eInverseRemove(this, SclPackage.READ_WRITE__SERVICES, ReadWrite.class, msgs);
			if (newReadWrite != null)
				msgs = ((InternalEObject)newReadWrite).eInverseAdd(this, SclPackage.READ_WRITE__SERVICES, ReadWrite.class, msgs);
			msgs = basicSetReadWrite(newReadWrite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReadWriteESet = readWriteESet;
			readWriteESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__READ_WRITE, newReadWrite, newReadWrite, !oldReadWriteESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetReadWrite( NotificationChain msgs ) {
		ReadWrite oldReadWrite = readWrite;
		readWrite = null;
		boolean oldReadWriteESet = readWriteESet;
		readWriteESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__READ_WRITE, oldReadWrite, null, oldReadWriteESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetReadWrite() {
		if (readWrite != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)readWrite).eInverseRemove(this, SclPackage.READ_WRITE__SERVICES, ReadWrite.class, msgs);
			msgs = basicUnsetReadWrite(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReadWriteESet = readWriteESet;
			readWriteESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__READ_WRITE, null, null, oldReadWriteESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetReadWrite() {
		return readWriteESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RedProt getRedProt() {
		return redProt;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRedProt( RedProt newRedProt, NotificationChain msgs ) {
		RedProt oldRedProt = redProt;
		redProt = newRedProt;
		boolean oldRedProtESet = redProtESet;
		redProtESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__RED_PROT, oldRedProt, newRedProt, !oldRedProtESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRedProt( RedProt newRedProt ) {
		if (newRedProt != redProt) {
			NotificationChain msgs = null;
			if (redProt != null)
				msgs = ((InternalEObject)redProt).eInverseRemove(this, SclPackage.RED_PROT__SERVICES, RedProt.class, msgs);
			if (newRedProt != null)
				msgs = ((InternalEObject)newRedProt).eInverseAdd(this, SclPackage.RED_PROT__SERVICES, RedProt.class, msgs);
			msgs = basicSetRedProt(newRedProt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRedProtESet = redProtESet;
			redProtESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__RED_PROT, newRedProt, newRedProt, !oldRedProtESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetRedProt( NotificationChain msgs ) {
		RedProt oldRedProt = redProt;
		redProt = null;
		boolean oldRedProtESet = redProtESet;
		redProtESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__RED_PROT, oldRedProt, null, oldRedProtESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetRedProt() {
		if (redProt != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)redProt).eInverseRemove(this, SclPackage.RED_PROT__SERVICES, RedProt.class, msgs);
			msgs = basicUnsetRedProt(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRedProtESet = redProtESet;
			redProtESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__RED_PROT, null, null, oldRedProtESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetRedProt() {
		return redProtESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ReportSettings getReportSettings() {
		return reportSettings;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetReportSettings( ReportSettings newReportSettings, NotificationChain msgs ) {
		ReportSettings oldReportSettings = reportSettings;
		reportSettings = newReportSettings;
		boolean oldReportSettingsESet = reportSettingsESet;
		reportSettingsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__REPORT_SETTINGS, oldReportSettings, newReportSettings, !oldReportSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReportSettings( ReportSettings newReportSettings ) {
		if (newReportSettings != reportSettings) {
			NotificationChain msgs = null;
			if (reportSettings != null)
				msgs = ((InternalEObject)reportSettings).eInverseRemove(this, SclPackage.REPORT_SETTINGS__SERVICES, ReportSettings.class, msgs);
			if (newReportSettings != null)
				msgs = ((InternalEObject)newReportSettings).eInverseAdd(this, SclPackage.REPORT_SETTINGS__SERVICES, ReportSettings.class, msgs);
			msgs = basicSetReportSettings(newReportSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReportSettingsESet = reportSettingsESet;
			reportSettingsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__REPORT_SETTINGS, newReportSettings, newReportSettings, !oldReportSettingsESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetReportSettings( NotificationChain msgs ) {
		ReportSettings oldReportSettings = reportSettings;
		reportSettings = null;
		boolean oldReportSettingsESet = reportSettingsESet;
		reportSettingsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__REPORT_SETTINGS, oldReportSettings, null, oldReportSettingsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetReportSettings() {
		if (reportSettings != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)reportSettings).eInverseRemove(this, SclPackage.REPORT_SETTINGS__SERVICES, ReportSettings.class, msgs);
			msgs = basicUnsetReportSettings(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReportSettingsESet = reportSettingsESet;
			reportSettingsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__REPORT_SETTINGS, null, null, oldReportSettingsESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetReportSettings() {
		return reportSettingsESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SMVsc getSMVsc() {
		return smVsc;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSMVsc( SMVsc newSMVsc, NotificationChain msgs ) {
		SMVsc oldSMVsc = smVsc;
		smVsc = newSMVsc;
		boolean oldSMVscESet = smVscESet;
		smVscESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__SM_VSC, oldSMVsc, newSMVsc, !oldSMVscESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSMVsc( SMVsc newSMVsc ) {
		if (newSMVsc != smVsc) {
			NotificationChain msgs = null;
			if (smVsc != null)
				msgs = ((InternalEObject)smVsc).eInverseRemove(this, SclPackage.SM_VSC__SERVICES, SMVsc.class, msgs);
			if (newSMVsc != null)
				msgs = ((InternalEObject)newSMVsc).eInverseAdd(this, SclPackage.SM_VSC__SERVICES, SMVsc.class, msgs);
			msgs = basicSetSMVsc(newSMVsc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSMVscESet = smVscESet;
			smVscESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__SM_VSC, newSMVsc, newSMVsc, !oldSMVscESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetSMVsc( NotificationChain msgs ) {
		SMVsc oldSMVsc = smVsc;
		smVsc = null;
		boolean oldSMVscESet = smVscESet;
		smVscESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__SM_VSC, oldSMVsc, null, oldSMVscESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSMVsc() {
		if (smVsc != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)smVsc).eInverseRemove(this, SclPackage.SM_VSC__SERVICES, SMVsc.class, msgs);
			msgs = basicUnsetSMVsc(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSMVscESet = smVscESet;
			smVscESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__SM_VSC, null, null, oldSMVscESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSMVsc() {
		return smVscESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SupSubscription getSupSubscription() {
		return supSubscription;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSupSubscription( SupSubscription newSupSubscription, NotificationChain msgs ) {
		SupSubscription oldSupSubscription = supSubscription;
		supSubscription = newSupSubscription;
		boolean oldSupSubscriptionESet = supSubscriptionESet;
		supSubscriptionESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__SUP_SUBSCRIPTION, oldSupSubscription, newSupSubscription, !oldSupSubscriptionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSupSubscription( SupSubscription newSupSubscription ) {
		if (newSupSubscription != supSubscription) {
			NotificationChain msgs = null;
			if (supSubscription != null)
				msgs = ((InternalEObject)supSubscription).eInverseRemove(this, SclPackage.SUP_SUBSCRIPTION__SERVICES, SupSubscription.class, msgs);
			if (newSupSubscription != null)
				msgs = ((InternalEObject)newSupSubscription).eInverseAdd(this, SclPackage.SUP_SUBSCRIPTION__SERVICES, SupSubscription.class, msgs);
			msgs = basicSetSupSubscription(newSupSubscription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSupSubscriptionESet = supSubscriptionESet;
			supSubscriptionESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__SUP_SUBSCRIPTION, newSupSubscription, newSupSubscription, !oldSupSubscriptionESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetSupSubscription( NotificationChain msgs ) {
		SupSubscription oldSupSubscription = supSubscription;
		supSubscription = null;
		boolean oldSupSubscriptionESet = supSubscriptionESet;
		supSubscriptionESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__SUP_SUBSCRIPTION, oldSupSubscription, null, oldSupSubscriptionESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSupSubscription() {
		if (supSubscription != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)supSubscription).eInverseRemove(this, SclPackage.SUP_SUBSCRIPTION__SERVICES, SupSubscription.class, msgs);
			msgs = basicUnsetSupSubscription(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSupSubscriptionESet = supSubscriptionESet;
			supSubscriptionESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__SUP_SUBSCRIPTION, null, null, oldSupSubscriptionESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSupSubscription() {
		return supSubscriptionESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ValueHandling getValueHandling() {
		return valueHandling;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetValueHandling( ValueHandling newValueHandling, NotificationChain msgs ) {
		ValueHandling oldValueHandling = valueHandling;
		valueHandling = newValueHandling;
		boolean oldValueHandlingESet = valueHandlingESet;
		valueHandlingESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__VALUE_HANDLING, oldValueHandling, newValueHandling, !oldValueHandlingESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValueHandling( ValueHandling newValueHandling ) {
		if (newValueHandling != valueHandling) {
			NotificationChain msgs = null;
			if (valueHandling != null)
				msgs = ((InternalEObject)valueHandling).eInverseRemove(this, SclPackage.VALUE_HANDLING__SERVICES, ValueHandling.class, msgs);
			if (newValueHandling != null)
				msgs = ((InternalEObject)newValueHandling).eInverseAdd(this, SclPackage.VALUE_HANDLING__SERVICES, ValueHandling.class, msgs);
			msgs = basicSetValueHandling(newValueHandling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldValueHandlingESet = valueHandlingESet;
			valueHandlingESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__VALUE_HANDLING, newValueHandling, newValueHandling, !oldValueHandlingESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetValueHandling( NotificationChain msgs ) {
		ValueHandling oldValueHandling = valueHandling;
		valueHandling = null;
		boolean oldValueHandlingESet = valueHandlingESet;
		valueHandlingESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__VALUE_HANDLING, oldValueHandling, null, oldValueHandlingESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetValueHandling() {
		if (valueHandling != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)valueHandling).eInverseRemove(this, SclPackage.VALUE_HANDLING__SERVICES, ValueHandling.class, msgs);
			msgs = basicUnsetValueHandling(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldValueHandlingESet = valueHandlingESet;
			valueHandlingESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__VALUE_HANDLING, null, null, oldValueHandlingESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetValueHandling() {
		return valueHandlingESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SetDataSetValue getSetDataSetValue() {
		return setDataSetValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSetDataSetValue( SetDataSetValue newSetDataSetValue, NotificationChain msgs ) {
		SetDataSetValue oldSetDataSetValue = setDataSetValue;
		setDataSetValue = newSetDataSetValue;
		boolean oldSetDataSetValueESet = setDataSetValueESet;
		setDataSetValueESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__SET_DATA_SET_VALUE, oldSetDataSetValue, newSetDataSetValue, !oldSetDataSetValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSetDataSetValue( SetDataSetValue newSetDataSetValue ) {
		if (newSetDataSetValue != setDataSetValue) {
			NotificationChain msgs = null;
			if (setDataSetValue != null)
				msgs = ((InternalEObject)setDataSetValue).eInverseRemove(this, SclPackage.SET_DATA_SET_VALUE__SERVICES, SetDataSetValue.class, msgs);
			if (newSetDataSetValue != null)
				msgs = ((InternalEObject)newSetDataSetValue).eInverseAdd(this, SclPackage.SET_DATA_SET_VALUE__SERVICES, SetDataSetValue.class, msgs);
			msgs = basicSetSetDataSetValue(newSetDataSetValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSetDataSetValueESet = setDataSetValueESet;
			setDataSetValueESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__SET_DATA_SET_VALUE, newSetDataSetValue, newSetDataSetValue, !oldSetDataSetValueESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetSetDataSetValue( NotificationChain msgs ) {
		SetDataSetValue oldSetDataSetValue = setDataSetValue;
		setDataSetValue = null;
		boolean oldSetDataSetValueESet = setDataSetValueESet;
		setDataSetValueESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__SET_DATA_SET_VALUE, oldSetDataSetValue, null, oldSetDataSetValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSetDataSetValue() {
		if (setDataSetValue != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)setDataSetValue).eInverseRemove(this, SclPackage.SET_DATA_SET_VALUE__SERVICES, SetDataSetValue.class, msgs);
			msgs = basicUnsetSetDataSetValue(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSetDataSetValueESet = setDataSetValueESet;
			setDataSetValueESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__SET_DATA_SET_VALUE, null, null, oldSetDataSetValueESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSetDataSetValue() {
		return setDataSetValueESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SettingGroups getSettingGroups() {
		return settingGroups;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetSettingGroups( SettingGroups newSettingGroups, NotificationChain msgs ) {
		SettingGroups oldSettingGroups = settingGroups;
		settingGroups = newSettingGroups;
		boolean oldSettingGroupsESet = settingGroupsESet;
		settingGroupsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__SETTING_GROUPS, oldSettingGroups, newSettingGroups, !oldSettingGroupsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSettingGroups( SettingGroups newSettingGroups ) {
		if (newSettingGroups != settingGroups) {
			NotificationChain msgs = null;
			if (settingGroups != null)
				msgs = ((InternalEObject)settingGroups).eInverseRemove(this, SclPackage.SETTING_GROUPS__SERVICES, SettingGroups.class, msgs);
			if (newSettingGroups != null)
				msgs = ((InternalEObject)newSettingGroups).eInverseAdd(this, SclPackage.SETTING_GROUPS__SERVICES, SettingGroups.class, msgs);
			msgs = basicSetSettingGroups(newSettingGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSettingGroupsESet = settingGroupsESet;
			settingGroupsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__SETTING_GROUPS, newSettingGroups, newSettingGroups, !oldSettingGroupsESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetSettingGroups( NotificationChain msgs ) {
		SettingGroups oldSettingGroups = settingGroups;
		settingGroups = null;
		boolean oldSettingGroupsESet = settingGroupsESet;
		settingGroupsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__SETTING_GROUPS, oldSettingGroups, null, oldSettingGroupsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetSettingGroups() {
		if (settingGroups != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)settingGroups).eInverseRemove(this, SclPackage.SETTING_GROUPS__SERVICES, SettingGroups.class, msgs);
			msgs = basicUnsetSettingGroups(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSettingGroupsESet = settingGroupsESet;
			settingGroupsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__SETTING_GROUPS, null, null, oldSettingGroupsESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetSettingGroups() {
		return settingGroupsESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TimeSyncProt getTimeSyncProt() {
		return timeSyncProt;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTimeSyncProt( TimeSyncProt newTimeSyncProt, NotificationChain msgs ) {
		TimeSyncProt oldTimeSyncProt = timeSyncProt;
		timeSyncProt = newTimeSyncProt;
		boolean oldTimeSyncProtESet = timeSyncProtESet;
		timeSyncProtESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__TIME_SYNC_PROT, oldTimeSyncProt, newTimeSyncProt, !oldTimeSyncProtESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTimeSyncProt( TimeSyncProt newTimeSyncProt ) {
		if (newTimeSyncProt != timeSyncProt) {
			NotificationChain msgs = null;
			if (timeSyncProt != null)
				msgs = ((InternalEObject)timeSyncProt).eInverseRemove(this, SclPackage.TIME_SYNC_PROT__SERVICES, TimeSyncProt.class, msgs);
			if (newTimeSyncProt != null)
				msgs = ((InternalEObject)newTimeSyncProt).eInverseAdd(this, SclPackage.TIME_SYNC_PROT__SERVICES, TimeSyncProt.class, msgs);
			msgs = basicSetTimeSyncProt(newTimeSyncProt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTimeSyncProtESet = timeSyncProtESet;
			timeSyncProtESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__TIME_SYNC_PROT, newTimeSyncProt, newTimeSyncProt, !oldTimeSyncProtESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetTimeSyncProt( NotificationChain msgs ) {
		TimeSyncProt oldTimeSyncProt = timeSyncProt;
		timeSyncProt = null;
		boolean oldTimeSyncProtESet = timeSyncProtESet;
		timeSyncProtESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__TIME_SYNC_PROT, oldTimeSyncProt, null, oldTimeSyncProtESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetTimeSyncProt() {
		if (timeSyncProt != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)timeSyncProt).eInverseRemove(this, SclPackage.TIME_SYNC_PROT__SERVICES, TimeSyncProt.class, msgs);
			msgs = basicUnsetTimeSyncProt(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTimeSyncProtESet = timeSyncProtESet;
			timeSyncProtESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__TIME_SYNC_PROT, null, null, oldTimeSyncProtESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetTimeSyncProt() {
		return timeSyncProtESet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public TimerActivatedControl getTimerActivatedControl() {
		return timerActivatedControl;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetTimerActivatedControl( TimerActivatedControl newTimerActivatedControl,
            NotificationChain msgs ) {
		TimerActivatedControl oldTimerActivatedControl = timerActivatedControl;
		timerActivatedControl = newTimerActivatedControl;
		boolean oldTimerActivatedControlESet = timerActivatedControlESet;
		timerActivatedControlESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL, oldTimerActivatedControl, newTimerActivatedControl, !oldTimerActivatedControlESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTimerActivatedControl( TimerActivatedControl newTimerActivatedControl ) {
		if (newTimerActivatedControl != timerActivatedControl) {
			NotificationChain msgs = null;
			if (timerActivatedControl != null)
				msgs = ((InternalEObject)timerActivatedControl).eInverseRemove(this, SclPackage.TIMER_ACTIVATED_CONTROL__SERVICES, TimerActivatedControl.class, msgs);
			if (newTimerActivatedControl != null)
				msgs = ((InternalEObject)newTimerActivatedControl).eInverseAdd(this, SclPackage.TIMER_ACTIVATED_CONTROL__SERVICES, TimerActivatedControl.class, msgs);
			msgs = basicSetTimerActivatedControl(newTimerActivatedControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTimerActivatedControlESet = timerActivatedControlESet;
			timerActivatedControlESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL, newTimerActivatedControl, newTimerActivatedControl, !oldTimerActivatedControlESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicUnsetTimerActivatedControl( NotificationChain msgs ) {
		TimerActivatedControl oldTimerActivatedControl = timerActivatedControl;
		timerActivatedControl = null;
		boolean oldTimerActivatedControlESet = timerActivatedControlESet;
		timerActivatedControlESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL, oldTimerActivatedControl, null, oldTimerActivatedControlESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void unsetTimerActivatedControl() {
		if (timerActivatedControl != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)timerActivatedControl).eInverseRemove(this, SclPackage.TIMER_ACTIVATED_CONTROL__SERVICES, TimerActivatedControl.class, msgs);
			msgs = basicUnsetTimerActivatedControl(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTimerActivatedControlESet = timerActivatedControlESet;
			timerActivatedControlESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL, null, null, oldTimerActivatedControlESet));
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean isSetTimerActivatedControl() {
		return timerActivatedControlESet;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServices_nameLength_valid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv Services_nameLength_valid:
		 *   let
		 *     severity : Integer[1] = 'Services::Services_nameLength_valid'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : OclAny[1] = let status : Boolean[?] = self.nameLength <> null implies self.nameLength = 32 or self.nameLength >= 64
		 *         in
		 *           if status = true
		 *           then true
		 *           else
		 *             Tuple{message = 'nameLength attribute shall be valid in Services (line ' +
		 *               self.lineNumber.toString() + '). ' + 'Current value is ' +
		 *               self.nameLength.toString(), status = status
		 *             }
		 *           endif
		 *       in
		 *         'Services::Services_nameLength_valid'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SclTables.STR_Services_c_c_Services_nameLength_valid);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SclTables.INT_0).booleanValue();
		/*@NonInvalid*/ Object symbol_2;
		if (le) {
			symbol_2 = ValueUtil.TRUE_VALUE;
		}
		else {
			/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_1;
			try {
				final /*@NonInvalid*/ Integer nameLength = this.getNameLength();
				final /*@NonInvalid*/ IntegerValue BOXED_nameLength = nameLength == null ? null : ValueUtil.integerValueOf(nameLength);
				final /*@NonInvalid*/ boolean ne = BOXED_nameLength != null;
				/*@Thrown*/ boolean status;
				if (ne) {
					final /*@NonInvalid*/ boolean eq = SclTables.INT_32.equals(BOXED_nameLength);
					/*@Thrown*/ boolean or;
					if (eq) {
						or = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_nameLength, SclTables.INT_64).booleanValue();
						or = ge;
					}
					status = or;
				}
				else {
					status = ValueUtil.TRUE_VALUE;
				}
				/*@Thrown*/ Object symbol_1;
				if (status) {
					symbol_1 = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ int lineNumber = this.getLineNumber();
					final /*@NonInvalid*/ IntegerValue BOXED_lineNumber = ValueUtil.integerValueOf(lineNumber);
					final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_lineNumber);
					final /*@NonInvalid*/ String sum = StringConcatOperation.INSTANCE.evaluate(SclTables.STR_nameLength_32_attribute_32_shall_32_be_32_valid_32_in_32_Services_32_o_line_32, toString);
					final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(sum, SclTables.STR__e__32);
					final /*@NonInvalid*/ String sum_1 = StringConcatOperation.INSTANCE.evaluate(sum_0, SclTables.STR_Current_32_value_32_is_32);
					final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_nameLength);
					final /*@Thrown*/ String sum_2 = StringConcatOperation.INSTANCE.evaluate(sum_1, toString_0);
					final /*@Thrown*/ TupleValue symbol_0 = ValueUtil.createTupleOfEach(SclTables.TUPLid_, sum_2, status);
					symbol_1 = symbol_0;
				}
				CAUGHT_symbol_1 = symbol_1;
			}
			catch (Exception e) {
				CAUGHT_symbol_1 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SclTables.STR_Services_c_c_Services_nameLength_valid, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_symbol_1, SclTables.INT_0).booleanValue();
			symbol_2 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_2;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.SERVICES__ACCESS_POINT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAccessPoint((AccessPoint)otherEnd, msgs);
			case SclPackage.SERVICES__CLIENT_SERVICES:
				if (clientServices != null)
					msgs = ((InternalEObject)clientServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__CLIENT_SERVICES, null, msgs);
				return basicSetClientServices((ClientServices)otherEnd, msgs);
			case SclPackage.SERVICES__COMM_PROT:
				if (commProt != null)
					msgs = ((InternalEObject)commProt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__COMM_PROT, null, msgs);
				return basicSetCommProt((CommProt)otherEnd, msgs);
			case SclPackage.SERVICES__CONF_DATA_SET:
				if (confDataSet != null)
					msgs = ((InternalEObject)confDataSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__CONF_DATA_SET, null, msgs);
				return basicSetConfDataSet((ConfDataSet)otherEnd, msgs);
			case SclPackage.SERVICES__CONF_LNS:
				if (confLNs != null)
					msgs = ((InternalEObject)confLNs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__CONF_LNS, null, msgs);
				return basicSetConfLNs((ConfLNs)otherEnd, msgs);
			case SclPackage.SERVICES__CONF_LD_NAME:
				if (confLdName != null)
					msgs = ((InternalEObject)confLdName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__CONF_LD_NAME, null, msgs);
				return basicSetConfLdName((ConfLdName)otherEnd, msgs);
			case SclPackage.SERVICES__CONF_LOG_CONTROL:
				if (confLogControl != null)
					msgs = ((InternalEObject)confLogControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__CONF_LOG_CONTROL, null, msgs);
				return basicSetConfLogControl((ConfLogControl)otherEnd, msgs);
			case SclPackage.SERVICES__CONF_REPORT_CONTROL:
				if (confReportControl != null)
					msgs = ((InternalEObject)confReportControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__CONF_REPORT_CONTROL, null, msgs);
				return basicSetConfReportControl((ConfReportControl)otherEnd, msgs);
			case SclPackage.SERVICES__CONF_SIG_REF:
				if (confSigRef != null)
					msgs = ((InternalEObject)confSigRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__CONF_SIG_REF, null, msgs);
				return basicSetConfSigRef((ConfSigRef)otherEnd, msgs);
			case SclPackage.SERVICES__DATA_OBJECT_DIRECTORY:
				if (dataObjectDirectory != null)
					msgs = ((InternalEObject)dataObjectDirectory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__DATA_OBJECT_DIRECTORY, null, msgs);
				return basicSetDataObjectDirectory((DataObjectDirectory)otherEnd, msgs);
			case SclPackage.SERVICES__DATA_SET_DIRECTORY:
				if (dataSetDirectory != null)
					msgs = ((InternalEObject)dataSetDirectory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__DATA_SET_DIRECTORY, null, msgs);
				return basicSetDataSetDirectory((DataSetDirectory)otherEnd, msgs);
			case SclPackage.SERVICES__DYN_ASSOCIATION:
				if (dynAssociation != null)
					msgs = ((InternalEObject)dynAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__DYN_ASSOCIATION, null, msgs);
				return basicSetDynAssociation((DynAssociation)otherEnd, msgs);
			case SclPackage.SERVICES__DYN_DATA_SET:
				if (dynDataSet != null)
					msgs = ((InternalEObject)dynDataSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__DYN_DATA_SET, null, msgs);
				return basicSetDynDataSet((DynDataSet)otherEnd, msgs);
			case SclPackage.SERVICES__FILE_HANDLING:
				if (fileHandling != null)
					msgs = ((InternalEObject)fileHandling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__FILE_HANDLING, null, msgs);
				return basicSetFileHandling((FileHandling)otherEnd, msgs);
			case SclPackage.SERVICES__GOOSE:
				if (goose != null)
					msgs = ((InternalEObject)goose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__GOOSE, null, msgs);
				return basicSetGOOSE((GOOSE)otherEnd, msgs);
			case SclPackage.SERVICES__GSE_DIR:
				if (gseDir != null)
					msgs = ((InternalEObject)gseDir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__GSE_DIR, null, msgs);
				return basicSetGSEDir((GSEDir)otherEnd, msgs);
			case SclPackage.SERVICES__GSE_SETTINGS:
				if (gseSettings != null)
					msgs = ((InternalEObject)gseSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__GSE_SETTINGS, null, msgs);
				return basicSetGSESettings((GSESettings)otherEnd, msgs);
			case SclPackage.SERVICES__GSSE:
				if (gsse != null)
					msgs = ((InternalEObject)gsse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__GSSE, null, msgs);
				return basicSetGSSE((GSSE)otherEnd, msgs);
			case SclPackage.SERVICES__GET_CB_VALUES:
				if (getCBValues != null)
					msgs = ((InternalEObject)getCBValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__GET_CB_VALUES, null, msgs);
				return basicSetGetCBValues((GetCBValues)otherEnd, msgs);
			case SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION:
				if (getDataObjectDefinition != null)
					msgs = ((InternalEObject)getDataObjectDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION, null, msgs);
				return basicSetGetDataObjectDefinition((GetDataObjectDefinition)otherEnd, msgs);
			case SclPackage.SERVICES__GET_DATA_SET_VALUE:
				if (getDataSetValue != null)
					msgs = ((InternalEObject)getDataSetValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__GET_DATA_SET_VALUE, null, msgs);
				return basicSetGetDataSetValue((GetDataSetValue)otherEnd, msgs);
			case SclPackage.SERVICES__GET_DIRECTORY:
				if (getDirectory != null)
					msgs = ((InternalEObject)getDirectory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__GET_DIRECTORY, null, msgs);
				return basicSetGetDirectory((GetDirectory)otherEnd, msgs);
			case SclPackage.SERVICES__IED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIED((IED)otherEnd, msgs);
			case SclPackage.SERVICES__LOG_SETTINGS:
				if (logSettings != null)
					msgs = ((InternalEObject)logSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__LOG_SETTINGS, null, msgs);
				return basicSetLogSettings((LogSettings)otherEnd, msgs);
			case SclPackage.SERVICES__READ_WRITE:
				if (readWrite != null)
					msgs = ((InternalEObject)readWrite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__READ_WRITE, null, msgs);
				return basicSetReadWrite((ReadWrite)otherEnd, msgs);
			case SclPackage.SERVICES__RED_PROT:
				if (redProt != null)
					msgs = ((InternalEObject)redProt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__RED_PROT, null, msgs);
				return basicSetRedProt((RedProt)otherEnd, msgs);
			case SclPackage.SERVICES__REPORT_SETTINGS:
				if (reportSettings != null)
					msgs = ((InternalEObject)reportSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__REPORT_SETTINGS, null, msgs);
				return basicSetReportSettings((ReportSettings)otherEnd, msgs);
			case SclPackage.SERVICES__SM_VSC:
				if (smVsc != null)
					msgs = ((InternalEObject)smVsc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__SM_VSC, null, msgs);
				return basicSetSMVsc((SMVsc)otherEnd, msgs);
			case SclPackage.SERVICES__SUP_SUBSCRIPTION:
				if (supSubscription != null)
					msgs = ((InternalEObject)supSubscription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__SUP_SUBSCRIPTION, null, msgs);
				return basicSetSupSubscription((SupSubscription)otherEnd, msgs);
			case SclPackage.SERVICES__VALUE_HANDLING:
				if (valueHandling != null)
					msgs = ((InternalEObject)valueHandling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__VALUE_HANDLING, null, msgs);
				return basicSetValueHandling((ValueHandling)otherEnd, msgs);
			case SclPackage.SERVICES__SET_DATA_SET_VALUE:
				if (setDataSetValue != null)
					msgs = ((InternalEObject)setDataSetValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__SET_DATA_SET_VALUE, null, msgs);
				return basicSetSetDataSetValue((SetDataSetValue)otherEnd, msgs);
			case SclPackage.SERVICES__SETTING_GROUPS:
				if (settingGroups != null)
					msgs = ((InternalEObject)settingGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__SETTING_GROUPS, null, msgs);
				return basicSetSettingGroups((SettingGroups)otherEnd, msgs);
			case SclPackage.SERVICES__TIME_SYNC_PROT:
				if (timeSyncProt != null)
					msgs = ((InternalEObject)timeSyncProt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__TIME_SYNC_PROT, null, msgs);
				return basicSetTimeSyncProt((TimeSyncProt)otherEnd, msgs);
			case SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL:
				if (timerActivatedControl != null)
					msgs = ((InternalEObject)timerActivatedControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL, null, msgs);
				return basicSetTimerActivatedControl((TimerActivatedControl)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
		switch (featureID) {
			case SclPackage.SERVICES__ACCESS_POINT:
				return basicSetAccessPoint(null, msgs);
			case SclPackage.SERVICES__CLIENT_SERVICES:
				return basicUnsetClientServices(msgs);
			case SclPackage.SERVICES__COMM_PROT:
				return basicUnsetCommProt(msgs);
			case SclPackage.SERVICES__CONF_DATA_SET:
				return basicUnsetConfDataSet(msgs);
			case SclPackage.SERVICES__CONF_LNS:
				return basicUnsetConfLNs(msgs);
			case SclPackage.SERVICES__CONF_LD_NAME:
				return basicUnsetConfLdName(msgs);
			case SclPackage.SERVICES__CONF_LOG_CONTROL:
				return basicUnsetConfLogControl(msgs);
			case SclPackage.SERVICES__CONF_REPORT_CONTROL:
				return basicUnsetConfReportControl(msgs);
			case SclPackage.SERVICES__CONF_SIG_REF:
				return basicUnsetConfSigRef(msgs);
			case SclPackage.SERVICES__DATA_OBJECT_DIRECTORY:
				return basicUnsetDataObjectDirectory(msgs);
			case SclPackage.SERVICES__DATA_SET_DIRECTORY:
				return basicUnsetDataSetDirectory(msgs);
			case SclPackage.SERVICES__DYN_ASSOCIATION:
				return basicUnsetDynAssociation(msgs);
			case SclPackage.SERVICES__DYN_DATA_SET:
				return basicUnsetDynDataSet(msgs);
			case SclPackage.SERVICES__FILE_HANDLING:
				return basicUnsetFileHandling(msgs);
			case SclPackage.SERVICES__GOOSE:
				return basicUnsetGOOSE(msgs);
			case SclPackage.SERVICES__GSE_DIR:
				return basicUnsetGSEDir(msgs);
			case SclPackage.SERVICES__GSE_SETTINGS:
				return basicUnsetGSESettings(msgs);
			case SclPackage.SERVICES__GSSE:
				return basicUnsetGSSE(msgs);
			case SclPackage.SERVICES__GET_CB_VALUES:
				return basicUnsetGetCBValues(msgs);
			case SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION:
				return basicUnsetGetDataObjectDefinition(msgs);
			case SclPackage.SERVICES__GET_DATA_SET_VALUE:
				return basicUnsetGetDataSetValue(msgs);
			case SclPackage.SERVICES__GET_DIRECTORY:
				return basicUnsetGetDirectory(msgs);
			case SclPackage.SERVICES__IED:
				return basicSetIED(null, msgs);
			case SclPackage.SERVICES__LOG_SETTINGS:
				return basicUnsetLogSettings(msgs);
			case SclPackage.SERVICES__READ_WRITE:
				return basicUnsetReadWrite(msgs);
			case SclPackage.SERVICES__RED_PROT:
				return basicUnsetRedProt(msgs);
			case SclPackage.SERVICES__REPORT_SETTINGS:
				return basicUnsetReportSettings(msgs);
			case SclPackage.SERVICES__SM_VSC:
				return basicUnsetSMVsc(msgs);
			case SclPackage.SERVICES__SUP_SUBSCRIPTION:
				return basicUnsetSupSubscription(msgs);
			case SclPackage.SERVICES__VALUE_HANDLING:
				return basicUnsetValueHandling(msgs);
			case SclPackage.SERVICES__SET_DATA_SET_VALUE:
				return basicUnsetSetDataSetValue(msgs);
			case SclPackage.SERVICES__SETTING_GROUPS:
				return basicUnsetSettingGroups(msgs);
			case SclPackage.SERVICES__TIME_SYNC_PROT:
				return basicUnsetTimeSyncProt(msgs);
			case SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL:
				return basicUnsetTimerActivatedControl(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
		switch (eContainerFeatureID()) {
			case SclPackage.SERVICES__ACCESS_POINT:
				return eInternalContainer().eInverseRemove(this, SclPackage.ACCESS_POINT__SERVICES, AccessPoint.class, msgs);
			case SclPackage.SERVICES__IED:
				return eInternalContainer().eInverseRemove(this, SclPackage.IED__SERVICES, IED.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
		switch (featureID) {
			case SclPackage.SERVICES__NAME_LENGTH:
				return getNameLength();
			case SclPackage.SERVICES__ACCESS_POINT:
				return getAccessPoint();
			case SclPackage.SERVICES__CLIENT_SERVICES:
				return getClientServices();
			case SclPackage.SERVICES__COMM_PROT:
				return getCommProt();
			case SclPackage.SERVICES__CONF_DATA_SET:
				return getConfDataSet();
			case SclPackage.SERVICES__CONF_LNS:
				return getConfLNs();
			case SclPackage.SERVICES__CONF_LD_NAME:
				return getConfLdName();
			case SclPackage.SERVICES__CONF_LOG_CONTROL:
				return getConfLogControl();
			case SclPackage.SERVICES__CONF_REPORT_CONTROL:
				return getConfReportControl();
			case SclPackage.SERVICES__CONF_SIG_REF:
				return getConfSigRef();
			case SclPackage.SERVICES__DATA_OBJECT_DIRECTORY:
				return getDataObjectDirectory();
			case SclPackage.SERVICES__DATA_SET_DIRECTORY:
				return getDataSetDirectory();
			case SclPackage.SERVICES__DYN_ASSOCIATION:
				return getDynAssociation();
			case SclPackage.SERVICES__DYN_DATA_SET:
				return getDynDataSet();
			case SclPackage.SERVICES__FILE_HANDLING:
				return getFileHandling();
			case SclPackage.SERVICES__GOOSE:
				return getGOOSE();
			case SclPackage.SERVICES__GSE_DIR:
				return getGSEDir();
			case SclPackage.SERVICES__GSE_SETTINGS:
				return getGSESettings();
			case SclPackage.SERVICES__GSSE:
				return getGSSE();
			case SclPackage.SERVICES__GET_CB_VALUES:
				return getGetCBValues();
			case SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION:
				return getGetDataObjectDefinition();
			case SclPackage.SERVICES__GET_DATA_SET_VALUE:
				return getGetDataSetValue();
			case SclPackage.SERVICES__GET_DIRECTORY:
				return getGetDirectory();
			case SclPackage.SERVICES__IED:
				return getIED();
			case SclPackage.SERVICES__LOG_SETTINGS:
				return getLogSettings();
			case SclPackage.SERVICES__READ_WRITE:
				return getReadWrite();
			case SclPackage.SERVICES__RED_PROT:
				return getRedProt();
			case SclPackage.SERVICES__REPORT_SETTINGS:
				return getReportSettings();
			case SclPackage.SERVICES__SM_VSC:
				return getSMVsc();
			case SclPackage.SERVICES__SUP_SUBSCRIPTION:
				return getSupSubscription();
			case SclPackage.SERVICES__VALUE_HANDLING:
				return getValueHandling();
			case SclPackage.SERVICES__SET_DATA_SET_VALUE:
				return getSetDataSetValue();
			case SclPackage.SERVICES__SETTING_GROUPS:
				return getSettingGroups();
			case SclPackage.SERVICES__TIME_SYNC_PROT:
				return getTimeSyncProt();
			case SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL:
				return getTimerActivatedControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet( int featureID, Object newValue ) {
		switch (featureID) {
			case SclPackage.SERVICES__NAME_LENGTH:
				setNameLength((Integer)newValue);
				return;
			case SclPackage.SERVICES__ACCESS_POINT:
				setAccessPoint((AccessPoint)newValue);
				return;
			case SclPackage.SERVICES__CLIENT_SERVICES:
				setClientServices((ClientServices)newValue);
				return;
			case SclPackage.SERVICES__COMM_PROT:
				setCommProt((CommProt)newValue);
				return;
			case SclPackage.SERVICES__CONF_DATA_SET:
				setConfDataSet((ConfDataSet)newValue);
				return;
			case SclPackage.SERVICES__CONF_LNS:
				setConfLNs((ConfLNs)newValue);
				return;
			case SclPackage.SERVICES__CONF_LD_NAME:
				setConfLdName((ConfLdName)newValue);
				return;
			case SclPackage.SERVICES__CONF_LOG_CONTROL:
				setConfLogControl((ConfLogControl)newValue);
				return;
			case SclPackage.SERVICES__CONF_REPORT_CONTROL:
				setConfReportControl((ConfReportControl)newValue);
				return;
			case SclPackage.SERVICES__CONF_SIG_REF:
				setConfSigRef((ConfSigRef)newValue);
				return;
			case SclPackage.SERVICES__DATA_OBJECT_DIRECTORY:
				setDataObjectDirectory((DataObjectDirectory)newValue);
				return;
			case SclPackage.SERVICES__DATA_SET_DIRECTORY:
				setDataSetDirectory((DataSetDirectory)newValue);
				return;
			case SclPackage.SERVICES__DYN_ASSOCIATION:
				setDynAssociation((DynAssociation)newValue);
				return;
			case SclPackage.SERVICES__DYN_DATA_SET:
				setDynDataSet((DynDataSet)newValue);
				return;
			case SclPackage.SERVICES__FILE_HANDLING:
				setFileHandling((FileHandling)newValue);
				return;
			case SclPackage.SERVICES__GOOSE:
				setGOOSE((GOOSE)newValue);
				return;
			case SclPackage.SERVICES__GSE_DIR:
				setGSEDir((GSEDir)newValue);
				return;
			case SclPackage.SERVICES__GSE_SETTINGS:
				setGSESettings((GSESettings)newValue);
				return;
			case SclPackage.SERVICES__GSSE:
				setGSSE((GSSE)newValue);
				return;
			case SclPackage.SERVICES__GET_CB_VALUES:
				setGetCBValues((GetCBValues)newValue);
				return;
			case SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION:
				setGetDataObjectDefinition((GetDataObjectDefinition)newValue);
				return;
			case SclPackage.SERVICES__GET_DATA_SET_VALUE:
				setGetDataSetValue((GetDataSetValue)newValue);
				return;
			case SclPackage.SERVICES__GET_DIRECTORY:
				setGetDirectory((GetDirectory)newValue);
				return;
			case SclPackage.SERVICES__IED:
				setIED((IED)newValue);
				return;
			case SclPackage.SERVICES__LOG_SETTINGS:
				setLogSettings((LogSettings)newValue);
				return;
			case SclPackage.SERVICES__READ_WRITE:
				setReadWrite((ReadWrite)newValue);
				return;
			case SclPackage.SERVICES__RED_PROT:
				setRedProt((RedProt)newValue);
				return;
			case SclPackage.SERVICES__REPORT_SETTINGS:
				setReportSettings((ReportSettings)newValue);
				return;
			case SclPackage.SERVICES__SM_VSC:
				setSMVsc((SMVsc)newValue);
				return;
			case SclPackage.SERVICES__SUP_SUBSCRIPTION:
				setSupSubscription((SupSubscription)newValue);
				return;
			case SclPackage.SERVICES__VALUE_HANDLING:
				setValueHandling((ValueHandling)newValue);
				return;
			case SclPackage.SERVICES__SET_DATA_SET_VALUE:
				setSetDataSetValue((SetDataSetValue)newValue);
				return;
			case SclPackage.SERVICES__SETTING_GROUPS:
				setSettingGroups((SettingGroups)newValue);
				return;
			case SclPackage.SERVICES__TIME_SYNC_PROT:
				setTimeSyncProt((TimeSyncProt)newValue);
				return;
			case SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL:
				setTimerActivatedControl((TimerActivatedControl)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset( int featureID ) {
		switch (featureID) {
			case SclPackage.SERVICES__NAME_LENGTH:
				unsetNameLength();
				return;
			case SclPackage.SERVICES__ACCESS_POINT:
				setAccessPoint((AccessPoint)null);
				return;
			case SclPackage.SERVICES__CLIENT_SERVICES:
				unsetClientServices();
				return;
			case SclPackage.SERVICES__COMM_PROT:
				unsetCommProt();
				return;
			case SclPackage.SERVICES__CONF_DATA_SET:
				unsetConfDataSet();
				return;
			case SclPackage.SERVICES__CONF_LNS:
				unsetConfLNs();
				return;
			case SclPackage.SERVICES__CONF_LD_NAME:
				unsetConfLdName();
				return;
			case SclPackage.SERVICES__CONF_LOG_CONTROL:
				unsetConfLogControl();
				return;
			case SclPackage.SERVICES__CONF_REPORT_CONTROL:
				unsetConfReportControl();
				return;
			case SclPackage.SERVICES__CONF_SIG_REF:
				unsetConfSigRef();
				return;
			case SclPackage.SERVICES__DATA_OBJECT_DIRECTORY:
				unsetDataObjectDirectory();
				return;
			case SclPackage.SERVICES__DATA_SET_DIRECTORY:
				unsetDataSetDirectory();
				return;
			case SclPackage.SERVICES__DYN_ASSOCIATION:
				unsetDynAssociation();
				return;
			case SclPackage.SERVICES__DYN_DATA_SET:
				unsetDynDataSet();
				return;
			case SclPackage.SERVICES__FILE_HANDLING:
				unsetFileHandling();
				return;
			case SclPackage.SERVICES__GOOSE:
				unsetGOOSE();
				return;
			case SclPackage.SERVICES__GSE_DIR:
				unsetGSEDir();
				return;
			case SclPackage.SERVICES__GSE_SETTINGS:
				unsetGSESettings();
				return;
			case SclPackage.SERVICES__GSSE:
				unsetGSSE();
				return;
			case SclPackage.SERVICES__GET_CB_VALUES:
				unsetGetCBValues();
				return;
			case SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION:
				unsetGetDataObjectDefinition();
				return;
			case SclPackage.SERVICES__GET_DATA_SET_VALUE:
				unsetGetDataSetValue();
				return;
			case SclPackage.SERVICES__GET_DIRECTORY:
				unsetGetDirectory();
				return;
			case SclPackage.SERVICES__IED:
				setIED((IED)null);
				return;
			case SclPackage.SERVICES__LOG_SETTINGS:
				unsetLogSettings();
				return;
			case SclPackage.SERVICES__READ_WRITE:
				unsetReadWrite();
				return;
			case SclPackage.SERVICES__RED_PROT:
				unsetRedProt();
				return;
			case SclPackage.SERVICES__REPORT_SETTINGS:
				unsetReportSettings();
				return;
			case SclPackage.SERVICES__SM_VSC:
				unsetSMVsc();
				return;
			case SclPackage.SERVICES__SUP_SUBSCRIPTION:
				unsetSupSubscription();
				return;
			case SclPackage.SERVICES__VALUE_HANDLING:
				unsetValueHandling();
				return;
			case SclPackage.SERVICES__SET_DATA_SET_VALUE:
				unsetSetDataSetValue();
				return;
			case SclPackage.SERVICES__SETTING_GROUPS:
				unsetSettingGroups();
				return;
			case SclPackage.SERVICES__TIME_SYNC_PROT:
				unsetTimeSyncProt();
				return;
			case SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL:
				unsetTimerActivatedControl();
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet( int featureID ) {
		switch (featureID) {
			case SclPackage.SERVICES__NAME_LENGTH:
				return isSetNameLength();
			case SclPackage.SERVICES__ACCESS_POINT:
				return getAccessPoint() != null;
			case SclPackage.SERVICES__CLIENT_SERVICES:
				return isSetClientServices();
			case SclPackage.SERVICES__COMM_PROT:
				return isSetCommProt();
			case SclPackage.SERVICES__CONF_DATA_SET:
				return isSetConfDataSet();
			case SclPackage.SERVICES__CONF_LNS:
				return isSetConfLNs();
			case SclPackage.SERVICES__CONF_LD_NAME:
				return isSetConfLdName();
			case SclPackage.SERVICES__CONF_LOG_CONTROL:
				return isSetConfLogControl();
			case SclPackage.SERVICES__CONF_REPORT_CONTROL:
				return isSetConfReportControl();
			case SclPackage.SERVICES__CONF_SIG_REF:
				return isSetConfSigRef();
			case SclPackage.SERVICES__DATA_OBJECT_DIRECTORY:
				return isSetDataObjectDirectory();
			case SclPackage.SERVICES__DATA_SET_DIRECTORY:
				return isSetDataSetDirectory();
			case SclPackage.SERVICES__DYN_ASSOCIATION:
				return isSetDynAssociation();
			case SclPackage.SERVICES__DYN_DATA_SET:
				return isSetDynDataSet();
			case SclPackage.SERVICES__FILE_HANDLING:
				return isSetFileHandling();
			case SclPackage.SERVICES__GOOSE:
				return isSetGOOSE();
			case SclPackage.SERVICES__GSE_DIR:
				return isSetGSEDir();
			case SclPackage.SERVICES__GSE_SETTINGS:
				return isSetGSESettings();
			case SclPackage.SERVICES__GSSE:
				return isSetGSSE();
			case SclPackage.SERVICES__GET_CB_VALUES:
				return isSetGetCBValues();
			case SclPackage.SERVICES__GET_DATA_OBJECT_DEFINITION:
				return isSetGetDataObjectDefinition();
			case SclPackage.SERVICES__GET_DATA_SET_VALUE:
				return isSetGetDataSetValue();
			case SclPackage.SERVICES__GET_DIRECTORY:
				return isSetGetDirectory();
			case SclPackage.SERVICES__IED:
				return getIED() != null;
			case SclPackage.SERVICES__LOG_SETTINGS:
				return isSetLogSettings();
			case SclPackage.SERVICES__READ_WRITE:
				return isSetReadWrite();
			case SclPackage.SERVICES__RED_PROT:
				return isSetRedProt();
			case SclPackage.SERVICES__REPORT_SETTINGS:
				return isSetReportSettings();
			case SclPackage.SERVICES__SM_VSC:
				return isSetSMVsc();
			case SclPackage.SERVICES__SUP_SUBSCRIPTION:
				return isSetSupSubscription();
			case SclPackage.SERVICES__VALUE_HANDLING:
				return isSetValueHandling();
			case SclPackage.SERVICES__SET_DATA_SET_VALUE:
				return isSetSetDataSetValue();
			case SclPackage.SERVICES__SETTING_GROUPS:
				return isSetSettingGroups();
			case SclPackage.SERVICES__TIME_SYNC_PROT:
				return isSetTimeSyncProt();
			case SclPackage.SERVICES__TIMER_ACTIVATED_CONTROL:
				return isSetTimerActivatedControl();
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SclPackage.SERVICES___VALIDATE_SERVICES_NAME_LENGTH_VALID__DIAGNOSTICCHAIN_MAP:
				return validateServices_nameLength_valid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nameLength: ");
		if (nameLengthESet) result.append(nameLength); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServicesImpl
