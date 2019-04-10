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

import java.io.IOException;
import java.net.URL;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFactory;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SclPackageImpl extends EPackageImpl implements SclPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected String packageFilename = "scl.ecore";

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass anyContentFromOtherNamespaceEClass = null;

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    private EClass baseElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass headerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass historyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hitemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass idNamingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lineEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass privateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sclEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass textEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass addressEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass communicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectedAPEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass controlBlockEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pAddrEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass p_PhysConnEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass physConnEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smvEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subNetworkEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractDataAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bdaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass daEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass daTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass doEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass doTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataTypeTemplatesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumValEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lNodeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass protNsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sdoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bitRateInMbPerSecEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass minTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass maxTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bitRateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smpRateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass samplesPerSecEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass secPerSamplesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mcSecurityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass durationInMilliSecEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accessControlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass accessPointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass anyLNEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass associationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass authenticationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass certificateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clientLNEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass clientServicesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass commProtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass confDataSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass confLNsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass confLdNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass confLogControlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass confReportControlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass confSGEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass confSigRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass controlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass controlWithIEDNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass controlWithTriggerOptEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass daiEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass doiEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataObjectDirectoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataSetDirectoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dynAssociationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dynDataSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fcdaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fileHandlingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gooseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gooseSecurityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gseControlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gseDirEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gseSettingsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gsseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass getCBValuesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass getDataObjectDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass getDataSetValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass getDirectoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass iedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass iedNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass issuerNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kdcEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lDeviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lnEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ln0EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass logEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass logControlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass logSettingsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass optFieldsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass protocolEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass readWriteEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass redProtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass reportControlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass reportSettingsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rptEnabledEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sdiEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sgEditEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smvSecurityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smvSettingsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smVscEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sampledValueControlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serverEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serverAtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceSettingsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceWithMaxEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass servicesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass setDataSetValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass settingControlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass settingGroupsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass smvOptsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass supSubscriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeSyncProtEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timerActivatedControlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass trgOpsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valueHandlingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractConductingEquipmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractEqFuncSubFuncEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conductingEquipmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectivityNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eqFunctionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eqSubFunctionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass equipmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass equipmentContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass generalEquipmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass generalEquipmentContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass lNodeContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass neutralPointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass powerSystemResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass powerTransformerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subEquipmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subFunctionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass substationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tapChangerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass terminalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transformerWindingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass voltageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass voltageLevelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass explicitLinkResolverEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sclObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unNamingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceYesNoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceWithOptionalMaxEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceWithMaxNonZeroEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceConfReportControlEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceWithMaxAndMaxAttributesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceWithMaxAndModifyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceForConfDataSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass certEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valueWithUnitEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass durationInSecEClass = null;

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    private EEnum associationKindEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum fcEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum gseControlTypeEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum phaseEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum predefinedTypeOfSecurityEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum smvDeliveryEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum serviceSettingsEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum serviceSettingsNoDynEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum serviceTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum smpModEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum unitMultiplierEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum valKindEnumEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum bufModeEnumEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SclPackageImpl() {
        super(eNS_URI, SclFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link SclPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @generated
     */
    public static SclPackage init() {
        if (isInited) return (SclPackage)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredSclPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        SclPackageImpl theSclPackage = registeredSclPackage instanceof SclPackageImpl ? (SclPackageImpl)registeredSclPackage : new SclPackageImpl();

        isInited = true;

        // Load packages
        theSclPackage.loadPackage();

        // Fix loaded packages
        theSclPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theSclPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SclPackage.eNS_URI, theSclPackage);
        return theSclPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnyContentFromOtherNamespace() {
        if (anyContentFromOtherNamespaceEClass == null) {
            anyContentFromOtherNamespaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(0);
        }
        return anyContentFromOtherNamespaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAnyContentFromOtherNamespace_Mixed() {
        return (EAttribute)getAnyContentFromOtherNamespace().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAnyContentFromOtherNamespace_Group() {
        return (EAttribute)getAnyContentFromOtherNamespace().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAnyContentFromOtherNamespace_Any() {
        return (EAttribute)getAnyContentFromOtherNamespace().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAnyContentFromOtherNamespace_AnyAttribute() {
        return (EAttribute)getAnyContentFromOtherNamespace().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBaseElement() {
        if (baseElementEClass == null) {
            baseElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(1);
        }
        return baseElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBaseElement_Private() {
        return (EReference)getBaseElement().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBaseElement_Text() {
        return (EReference)getBaseElement().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBaseElement_Any() {
        return (EAttribute)getBaseElement().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBaseElement_AnyAttribute() {
        return (EAttribute)getBaseElement().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHeader() {
        if (headerEClass == null) {
            headerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(2);
        }
        return headerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHeader_Id() {
        return (EAttribute)getHeader().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHeader_NameStructure() {
        return (EAttribute)getHeader().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHeader_Revision() {
        return (EAttribute)getHeader().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHeader_ToolID() {
        return (EAttribute)getHeader().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHeader_Version() {
        return (EAttribute)getHeader().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getHeader_SCL() {
        return (EReference)getHeader().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getHeader_Text() {
        return (EReference)getHeader().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getHeader_History() {
        return (EReference)getHeader().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHistory() {
        if (historyEClass == null) {
            historyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(3);
        }
        return historyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getHistory_Header() {
        return (EReference)getHistory().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getHistory_Hitem() {
        return (EReference)getHistory().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHitem() {
        if (hitemEClass == null) {
            hitemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(4);
        }
        return hitemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHitem_Revision() {
        return (EAttribute)getHitem().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHitem_Version() {
        return (EAttribute)getHitem().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHitem_What() {
        return (EAttribute)getHitem().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHitem_When() {
        return (EAttribute)getHitem().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHitem_Who() {
        return (EAttribute)getHitem().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHitem_Why() {
        return (EAttribute)getHitem().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getHitem_History() {
        return (EReference)getHitem().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIDNaming() {
        if (idNamingEClass == null) {
            idNamingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(5);
        }
        return idNamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIDNaming_Id() {
        return (EAttribute)getIDNaming().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIDNaming_Desc() {
        return (EAttribute)getIDNaming().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLine() {
        if (lineEClass == null) {
            lineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(6);
        }
        return lineEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLine_Type() {
        return (EAttribute)getLine().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLine_Process() {
        return (EReference)getLine().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLine_SCL() {
        return (EReference)getLine().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLine_ConnectivityNode() {
        return (EReference)getLine().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLine_ConductingEquipment() {
        return (EReference)getLine().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLine_Voltage() {
        return (EReference)getLine().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLine_NomFreq() {
        return (EAttribute)getLine().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLine_NumPhases() {
        return (EAttribute)getLine().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNaming() {
        if (namingEClass == null) {
            namingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(7);
        }
        return namingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNaming_Name() {
        return (EAttribute)getNaming().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNaming_Desc() {
        return (EAttribute)getNaming().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPrivate() {
        if (privateEClass == null) {
            privateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(8);
        }
        return privateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPrivate_Source() {
        return (EAttribute)getPrivate().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPrivate_Type() {
        return (EAttribute)getPrivate().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPrivate_BaseElement() {
        return (EReference)getPrivate().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProcess() {
        if (processEClass == null) {
            processEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(9);
        }
        return processEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProcess_Type() {
        return (EAttribute)getProcess().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcess_Line() {
        return (EReference)getProcess().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcess_SCL() {
        return (EReference)getProcess().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcess_ConductingEquipment() {
        return (EReference)getProcess().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcess_Substation() {
        return (EReference)getProcess().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcess_SubProcesses() {
        return (EReference)getProcess().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProcess_ParentProcess() {
        return (EReference)getProcess().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSCL() {
        if (sclEClass == null) {
            sclEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(10);
        }
        return sclEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSCL_Revision() {
        return (EAttribute)getSCL().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSCL_Version() {
        return (EAttribute)getSCL().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSCL_Header() {
        return (EReference)getSCL().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSCL_Line() {
        return (EReference)getSCL().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSCL_Process() {
        return (EReference)getSCL().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSCL_IED() {
        return (EReference)getSCL().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSCL_DataTypeTemplates() {
        return (EReference)getSCL().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSCL_Communication() {
        return (EReference)getSCL().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSCL_Substation() {
        return (EReference)getSCL().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSCL_Release() {
        return (EAttribute)getSCL().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getText() {
        if (textEClass == null) {
            textEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(11);
        }
        return textEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getText_Source() {
        return (EAttribute)getText().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getText_BaseElement() {
        return (EReference)getText().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getText_Header() {
        return (EReference)getText().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getText_Value() {
        return (EAttribute)getText().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAddress() {
        if (addressEClass == null) {
            addressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(12);
        }
        return addressEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAddress_ConnectedAP() {
        return (EReference)getAddress().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAddress_ControlBlock() {
        return (EReference)getAddress().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAddress_P() {
        return (EReference)getAddress().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCommunication() {
        if (communicationEClass == null) {
            communicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(13);
        }
        return communicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCommunication_SubNetwork() {
        return (EReference)getCommunication().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCommunication_SCL() {
        return (EReference)getCommunication().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConnectedAP() {
        if (connectedAPEClass == null) {
            connectedAPEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(14);
        }
        return connectedAPEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConnectedAP_ApName() {
        return (EAttribute)getConnectedAP().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConnectedAP_IedName() {
        return (EAttribute)getConnectedAP().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConnectedAP_RedProt() {
        return (EAttribute)getConnectedAP().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConnectedAP_Address() {
        return (EReference)getConnectedAP().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConnectedAP_SubNetwork() {
        return (EReference)getConnectedAP().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConnectedAP_RefersToAccessPoint() {
        return (EReference)getConnectedAP().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConnectedAP_PhysConn() {
        return (EReference)getConnectedAP().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConnectedAP_GSE() {
        return (EReference)getConnectedAP().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConnectedAP_SMV() {
        return (EReference)getConnectedAP().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getControlBlock() {
        if (controlBlockEClass == null) {
            controlBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(15);
        }
        return controlBlockEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlBlock_CbName() {
        return (EAttribute)getControlBlock().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlBlock_LdInst() {
        return (EAttribute)getControlBlock().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlBlock_Address() {
        return (EReference)getControlBlock().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlBlock_RefersToLDevice() {
        return (EReference)getControlBlock().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlBlock_RefersToControlWithIEDName() {
        return (EReference)getControlBlock().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGSE() {
        if (gseEClass == null) {
            gseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(16);
        }
        return gseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGSE_MaxTime() {
        return (EReference)getGSE().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGSE_MinTime() {
        return (EReference)getGSE().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGSE_ConnectedAP() {
        return (EReference)getGSE().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getP() {
        if (pEClass == null) {
            pEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(17);
        }
        return pEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getP_Address() {
        return (EReference)getP().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPAddr() {
        if (pAddrEClass == null) {
            pAddrEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(18);
        }
        return pAddrEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPAddr_Type() {
        return (EAttribute)getPAddr().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPAddr_Value() {
        return (EAttribute)getPAddr().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getP_PhysConn() {
        if (p_PhysConnEClass == null) {
            p_PhysConnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(19);
        }
        return p_PhysConnEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getP_PhysConn_PhysConn() {
        return (EReference)getP_PhysConn().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPhysConn() {
        if (physConnEClass == null) {
            physConnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(20);
        }
        return physConnEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPhysConn_Type() {
        return (EAttribute)getPhysConn().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPhysConn_ConnectedAP() {
        return (EReference)getPhysConn().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPhysConn_P() {
        return (EReference)getPhysConn().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSMV() {
        if (smvEClass == null) {
            smvEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(21);
        }
        return smvEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMV_ConnectedAP() {
        return (EReference)getSMV().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubNetwork() {
        if (subNetworkEClass == null) {
            subNetworkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(22);
        }
        return subNetworkEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubNetwork_Type() {
        return (EAttribute)getSubNetwork().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubNetwork_BitRate() {
        return (EReference)getSubNetwork().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubNetwork_Communication() {
        return (EReference)getSubNetwork().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubNetwork_ConnectedAP() {
        return (EReference)getSubNetwork().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbstractDataAttribute() {
        if (abstractDataAttributeEClass == null) {
            abstractDataAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(23);
        }
        return abstractDataAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractDataAttribute_BType() {
        return (EAttribute)getAbstractDataAttribute().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractDataAttribute_Count() {
        return (EAttribute)getAbstractDataAttribute().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractDataAttribute_SAddr() {
        return (EAttribute)getAbstractDataAttribute().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractDataAttribute_Type() {
        return (EAttribute)getAbstractDataAttribute().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractDataAttribute_ValImport() {
        return (EAttribute)getAbstractDataAttribute().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractDataAttribute_ValKind() {
        return (EAttribute)getAbstractDataAttribute().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbstractDataAttribute_RefersToEnumType() {
        return (EReference)getAbstractDataAttribute().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbstractDataAttribute_Val() {
        return (EReference)getAbstractDataAttribute().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBDA() {
        if (bdaEClass == null) {
            bdaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(24);
        }
        return bdaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBDA_DAType() {
        return (EReference)getBDA().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDA() {
        if (daEClass == null) {
            daEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(25);
        }
        return daEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDA_Dchg() {
        return (EAttribute)getDA().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDA_Dupd() {
        return (EAttribute)getDA().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDA_Fc() {
        return (EAttribute)getDA().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDA_Qchg() {
        return (EAttribute)getDA().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDA_RefersToDAType() {
        return (EReference)getDA().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDA_DOType() {
        return (EReference)getDA().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDA_ProtNs() {
        return (EReference)getDA().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDAType() {
        if (daTypeEClass == null) {
            daTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(26);
        }
        return daTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDAType_IedType() {
        return (EAttribute)getDAType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAType_BDA() {
        return (EReference)getDAType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAType_ReferredByDA() {
        return (EReference)getDAType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAType_DataTypeTemplates() {
        return (EReference)getDAType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAType_ProtNs() {
        return (EReference)getDAType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDO() {
        if (doEClass == null) {
            doEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(27);
        }
        return doEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDO_Transient() {
        return (EAttribute)getDO().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDO_Type() {
        return (EAttribute)getDO().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDO_LNodeType() {
        return (EReference)getDO().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDO_RefersToDOType() {
        return (EReference)getDO().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDOType() {
        if (doTypeEClass == null) {
            doTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(28);
        }
        return doTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDOType_Cdc() {
        return (EAttribute)getDOType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDOType_IedType() {
        return (EAttribute)getDOType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOType_DA() {
        return (EReference)getDOType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOType_ReferredByDO() {
        return (EReference)getDOType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOType_DataTypeTemplates() {
        return (EReference)getDOType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOType_SDO() {
        return (EReference)getDOType().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOType_ReferredBySDO() {
        return (EReference)getDOType().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataTypeTemplates() {
        if (dataTypeTemplatesEClass == null) {
            dataTypeTemplatesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(29);
        }
        return dataTypeTemplatesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataTypeTemplates_DAType() {
        return (EReference)getDataTypeTemplates().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataTypeTemplates_DOType() {
        return (EReference)getDataTypeTemplates().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataTypeTemplates_EnumType() {
        return (EReference)getDataTypeTemplates().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataTypeTemplates_LNodeType() {
        return (EReference)getDataTypeTemplates().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataTypeTemplates_SCL() {
        return (EReference)getDataTypeTemplates().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEnumType() {
        if (enumTypeEClass == null) {
            enumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(30);
        }
        return enumTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumType_ReferredByAbstractDataAttribute() {
        return (EReference)getEnumType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumType_DataTypeTemplates() {
        return (EReference)getEnumType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumType_EnumVal() {
        return (EReference)getEnumType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEnumVal() {
        if (enumValEClass == null) {
            enumValEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(31);
        }
        return enumValEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEnumVal_Ord() {
        return (EAttribute)getEnumVal().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumVal_EnumType() {
        return (EReference)getEnumVal().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEnumVal_Value() {
        return (EAttribute)getEnumVal().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEnumVal_Desc() {
        return (EAttribute)getEnumVal().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLNodeType() {
        if (lNodeTypeEClass == null) {
            lNodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(32);
        }
        return lNodeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeType_IedType() {
        return (EAttribute)getLNodeType().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNodeType_LnClass() {
        return (EAttribute)getLNodeType().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeType_DO() {
        return (EReference)getLNodeType().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeType_DataTypeTemplates() {
        return (EReference)getLNodeType().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeType_ReferredByAnyLN() {
        return (EReference)getLNodeType().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProtNs() {
        if (protNsEClass == null) {
            protNsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(33);
        }
        return protNsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProtNs_Type() {
        return (EAttribute)getProtNs().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProtNs_DA() {
        return (EReference)getProtNs().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProtNs_DAType() {
        return (EReference)getProtNs().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProtNs_Value() {
        return (EAttribute)getProtNs().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSDO() {
        if (sdoEClass == null) {
            sdoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(34);
        }
        return sdoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSDO_Count() {
        return (EAttribute)getSDO().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSDO_Type() {
        return (EAttribute)getSDO().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDO_DOType() {
        return (EReference)getSDO().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSDO_Name() {
        return (EAttribute)getSDO().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDO_RefersToDOType() {
        return (EReference)getSDO().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVal() {
        if (valEClass == null) {
            valEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(35);
        }
        return valEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVal_SGroup() {
        return (EAttribute)getVal().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVal_AbstractDataAttribute() {
        return (EReference)getVal().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVal_DAI() {
        return (EReference)getVal().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVal_Value() {
        return (EAttribute)getVal().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBitRateInMbPerSec() {
        if (bitRateInMbPerSecEClass == null) {
            bitRateInMbPerSecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(168);
        }
        return bitRateInMbPerSecEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBitRateInMbPerSec_Value() {
        return (EAttribute)getBitRateInMbPerSec().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBitRateInMbPerSec_Multiplier() {
        return (EAttribute)getBitRateInMbPerSec().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBitRateInMbPerSec_Unit() {
        return (EAttribute)getBitRateInMbPerSec().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMinTime() {
        if (minTimeEClass == null) {
            minTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(169);
        }
        return minTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMaxTime() {
        if (maxTimeEClass == null) {
            maxTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(170);
        }
        return maxTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBitRate() {
        if (bitRateEClass == null) {
            bitRateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(171);
        }
        return bitRateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSmpRate() {
        if (smpRateEClass == null) {
            smpRateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(172);
        }
        return smpRateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSmpRate_Value() {
        return (EAttribute)getSmpRate().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSamplesPerSec() {
        if (samplesPerSecEClass == null) {
            samplesPerSecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(173);
        }
        return samplesPerSecEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSamplesPerSec_Value() {
        return (EAttribute)getSamplesPerSec().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSecPerSamples() {
        if (secPerSamplesEClass == null) {
            secPerSamplesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(174);
        }
        return secPerSamplesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSecPerSamples_Value() {
        return (EAttribute)getSecPerSamples().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMcSecurity() {
        if (mcSecurityEClass == null) {
            mcSecurityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(175);
        }
        return mcSecurityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMcSecurity_ClientServices() {
        return (EReference)getMcSecurity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMcSecurity_GSESettings() {
        return (EReference)getMcSecurity().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMcSecurity_SMVSettings() {
        return (EReference)getMcSecurity().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMcSecurity_Signature() {
        return (EAttribute)getMcSecurity().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMcSecurity_Encryption() {
        return (EAttribute)getMcSecurity().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDurationInMilliSec() {
        if (durationInMilliSecEClass == null) {
            durationInMilliSecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(167);
        }
        return durationInMilliSecEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDurationInMilliSec_Value() {
        return (EAttribute)getDurationInMilliSec().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDurationInMilliSec_Multiplier() {
        return (EAttribute)getDurationInMilliSec().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDurationInMilliSec_Unit() {
        return (EAttribute)getDurationInMilliSec().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAccessControl() {
        if (accessControlEClass == null) {
            accessControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(36);
        }
        return accessControlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAccessControl_LDevice() {
        return (EReference)getAccessControl().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAccessPoint() {
        if (accessPointEClass == null) {
            accessPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(37);
        }
        return accessPointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAccessPoint_Clock() {
        return (EAttribute)getAccessPoint().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAccessPoint_Kdc() {
        return (EAttribute)getAccessPoint().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAccessPoint_Router() {
        return (EAttribute)getAccessPoint().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAccessPoint_IED() {
        return (EReference)getAccessPoint().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAccessPoint_LN() {
        return (EReference)getAccessPoint().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAccessPoint_SMVSecurity() {
        return (EReference)getAccessPoint().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAccessPoint_ServerAt() {
        return (EReference)getAccessPoint().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAccessPoint_Server() {
        return (EReference)getAccessPoint().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAccessPoint_Services() {
        return (EReference)getAccessPoint().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAccessPoint_GOOSESecurity() {
        return (EReference)getAccessPoint().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAccessPoint_ReferredByServerAt() {
        return (EReference)getAccessPoint().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAccessPoint_Name() {
        return (EAttribute)getAccessPoint().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAccessPoint_ReferredByConnectedAP() {
        return (EReference)getAccessPoint().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAccessPoint_ReferredByKDC() {
        return (EReference)getAccessPoint().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAnyLN() {
        if (anyLNEClass == null) {
            anyLNEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(38);
        }
        return anyLNEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAnyLN_Inst() {
        return (EAttribute)getAnyLN().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAnyLN_LnClass() {
        return (EAttribute)getAnyLN().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAnyLN_LnType() {
        return (EAttribute)getAnyLN().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_RefersToLNodeType() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_Inputs() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_Log() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_DOI() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_ReportControl() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_LogControl() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_DataSet() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_ReferredByFCDA() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_ReferredByExtRef() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_ReferredByClientLN() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_ReferredByLogControl() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_ReferredByAssociation() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAnyLN_ReferredIEDName() {
        return (EReference)getAnyLN().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssociation() {
        if (associationEClass == null) {
            associationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(39);
        }
        return associationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAssociation_AssociationID() {
        return (EAttribute)getAssociation().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAssociation_IedName() {
        return (EAttribute)getAssociation().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAssociation_Kind() {
        return (EAttribute)getAssociation().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAssociation_LdInst() {
        return (EAttribute)getAssociation().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAssociation_LnClass() {
        return (EAttribute)getAssociation().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAssociation_LnInst() {
        return (EAttribute)getAssociation().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAssociation_Prefix() {
        return (EAttribute)getAssociation().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssociation_Server() {
        return (EReference)getAssociation().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAssociation_RefersToAnyLN() {
        return (EReference)getAssociation().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAuthentication() {
        if (authenticationEClass == null) {
            authenticationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(40);
        }
        return authenticationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAuthentication_Certificate() {
        return (EAttribute)getAuthentication().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAuthentication_None() {
        return (EAttribute)getAuthentication().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAuthentication_Password() {
        return (EAttribute)getAuthentication().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAuthentication_Strong() {
        return (EAttribute)getAuthentication().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAuthentication_Weak() {
        return (EAttribute)getAuthentication().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAuthentication_Server() {
        return (EReference)getAuthentication().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCertificate() {
        if (certificateEClass == null) {
            certificateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(41);
        }
        return certificateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCertificate_SerialNumber() {
        return (EAttribute)getCertificate().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCertificate_XferNumber() {
        return (EAttribute)getCertificate().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCertificate_Subject() {
        return (EReference)getCertificate().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCertificate_IssuerName() {
        return (EReference)getCertificate().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getClientLN() {
        if (clientLNEClass == null) {
            clientLNEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(42);
        }
        return clientLNEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientLN_ApRef() {
        return (EAttribute)getClientLN().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientLN_IedName() {
        return (EAttribute)getClientLN().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientLN_LdInst() {
        return (EAttribute)getClientLN().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientLN_LnClass() {
        return (EAttribute)getClientLN().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientLN_LnInst() {
        return (EAttribute)getClientLN().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientLN_Prefix() {
        return (EAttribute)getClientLN().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getClientLN_RptEnabled() {
        return (EReference)getClientLN().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientLN_Desc() {
        return (EAttribute)getClientLN().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getClientLN_RefersToAnyLN() {
        return (EReference)getClientLN().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getClientServices() {
        if (clientServicesEClass == null) {
            clientServicesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(43);
        }
        return clientServicesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_BufReport() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_Goose() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_Gsse() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_MaxAttributes() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_MaxGOOSE() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_MaxReports() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_MaxSMV() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_ReadLog() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_SupportsLdName() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_Sv() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_UnbufReport() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getClientServices_Services() {
        return (EReference)getClientServices().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getClientServices_TimeSyncProt() {
        return (EReference)getClientServices().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_RGOOSE() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_RSV() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getClientServices_NoIctBinding() {
        return (EAttribute)getClientServices().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getClientServices_McSecurity() {
        return (EReference)getClientServices().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCommProt() {
        if (commProtEClass == null) {
            commProtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(44);
        }
        return commProtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCommProt_Ipv6() {
        return (EAttribute)getCommProt().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCommProt_Services() {
        return (EReference)getCommProt().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConfDataSet() {
        if (confDataSetEClass == null) {
            confDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(45);
        }
        return confDataSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConfDataSet_Services() {
        return (EReference)getConfDataSet().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConfLNs() {
        if (confLNsEClass == null) {
            confLNsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(46);
        }
        return confLNsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConfLNs_FixLnInst() {
        return (EAttribute)getConfLNs().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConfLNs_FixPrefix() {
        return (EAttribute)getConfLNs().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConfLNs_Services() {
        return (EReference)getConfLNs().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConfLdName() {
        if (confLdNameEClass == null) {
            confLdNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(47);
        }
        return confLdNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConfLdName_Services() {
        return (EReference)getConfLdName().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConfLogControl() {
        if (confLogControlEClass == null) {
            confLogControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(48);
        }
        return confLogControlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConfLogControl_Services() {
        return (EReference)getConfLogControl().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConfReportControl() {
        if (confReportControlEClass == null) {
            confReportControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(49);
        }
        return confReportControlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConfReportControl_Services() {
        return (EReference)getConfReportControl().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConfSG() {
        if (confSGEClass == null) {
            confSGEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(50);
        }
        return confSGEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConfSG_ResvTms() {
        return (EAttribute)getConfSG().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConfSG_SettingGroups() {
        return (EReference)getConfSG().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConfSigRef() {
        if (confSigRefEClass == null) {
            confSigRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(51);
        }
        return confSigRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConfSigRef_Services() {
        return (EReference)getConfSigRef().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getControl() {
        if (controlEClass == null) {
            controlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(52);
        }
        return controlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControl_DatSet() {
        return (EAttribute)getControl().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControl_RefersToDataSet() {
        return (EReference)getControl().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControl_Name() {
        return (EAttribute)getControl().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getControlWithIEDName() {
        if (controlWithIEDNameEClass == null) {
            controlWithIEDNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(53);
        }
        return controlWithIEDNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlWithIEDName_ConfRev() {
        return (EAttribute)getControlWithIEDName().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlWithIEDName_IEDName() {
        return (EReference)getControlWithIEDName().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlWithIEDName_ReferredByControlBlock() {
        return (EReference)getControlWithIEDName().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlWithIEDName_Protocol() {
        return (EReference)getControlWithIEDName().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getControlWithTriggerOpt() {
        if (controlWithTriggerOptEClass == null) {
            controlWithTriggerOptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(54);
        }
        return controlWithTriggerOptEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getControlWithTriggerOpt_IntgPd() {
        return (EAttribute)getControlWithTriggerOpt().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getControlWithTriggerOpt_TrgOps() {
        return (EReference)getControlWithTriggerOpt().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDAI() {
        if (daiEClass == null) {
            daiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(55);
        }
        return daiEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDAI_Ix() {
        return (EAttribute)getDAI().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDAI_SAddr() {
        return (EAttribute)getDAI().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDAI_ValImport() {
        return (EAttribute)getDAI().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDAI_ValKind() {
        return (EAttribute)getDAI().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAI_Val() {
        return (EReference)getDAI().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAI_DOI() {
        return (EReference)getDAI().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDAI_SDI() {
        return (EReference)getDAI().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDOI() {
        if (doiEClass == null) {
            doiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(56);
        }
        return doiEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDOI_Ix() {
        return (EAttribute)getDOI().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOI_AnyLN() {
        return (EReference)getDOI().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOI_DAI() {
        return (EReference)getDOI().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDOI_SDI() {
        return (EReference)getDOI().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataObjectDirectory() {
        if (dataObjectDirectoryEClass == null) {
            dataObjectDirectoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(57);
        }
        return dataObjectDirectoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataObjectDirectory_Services() {
        return (EReference)getDataObjectDirectory().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataSet() {
        if (dataSetEClass == null) {
            dataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(58);
        }
        return dataSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataSet_AnyLN() {
        return (EReference)getDataSet().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataSet_ReferredByControl() {
        return (EReference)getDataSet().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataSet_FCDA() {
        return (EReference)getDataSet().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataSet_Name() {
        return (EAttribute)getDataSet().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataSetDirectory() {
        if (dataSetDirectoryEClass == null) {
            dataSetDirectoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(59);
        }
        return dataSetDirectoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataSetDirectory_Services() {
        return (EReference)getDataSetDirectory().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDynAssociation() {
        if (dynAssociationEClass == null) {
            dynAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(60);
        }
        return dynAssociationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDynAssociation_Services() {
        return (EReference)getDynAssociation().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDynDataSet() {
        if (dynDataSetEClass == null) {
            dynDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(61);
        }
        return dynDataSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDynDataSet_Services() {
        return (EReference)getDynDataSet().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExtRef() {
        if (extRefEClass == null) {
            extRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(62);
        }
        return extRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_DaName() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_DoName() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_IedName() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_IntAddr() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_LdInst() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_LnClass() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_LnInst() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_Prefix() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_ServiceType() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_SrcCBName() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_SrcLDInst() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_SrcLNClass() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_SrcLNInst() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_SrcPrefix() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExtRef_Inputs() {
        return (EReference)getExtRef().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExtRef_RefersToAnyLN() {
        return (EReference)getExtRef().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExtRef_RefersToDataAttribute() {
        return (EReference)getExtRef().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getExtRef_RefersToDataObject() {
        return (EReference)getExtRef().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_Desc() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_PServT() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_PLN() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_PDO() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getExtRef_PDA() {
        return (EAttribute)getExtRef().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFCDA() {
        if (fcdaEClass == null) {
            fcdaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(63);
        }
        return fcdaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFCDA_DaName() {
        return (EAttribute)getFCDA().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFCDA_DoName() {
        return (EAttribute)getFCDA().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFCDA_Fc() {
        return (EAttribute)getFCDA().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFCDA_Ix() {
        return (EAttribute)getFCDA().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFCDA_LdInst() {
        return (EAttribute)getFCDA().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFCDA_LnClass() {
        return (EAttribute)getFCDA().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFCDA_LnInst() {
        return (EAttribute)getFCDA().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFCDA_Prefix() {
        return (EAttribute)getFCDA().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFCDA_RefersToDataAttribute() {
        return (EReference)getFCDA().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFCDA_RefersToDataObject() {
        return (EReference)getFCDA().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFCDA_DataSet() {
        return (EReference)getFCDA().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFCDA_RefersToAnyLN() {
        return (EReference)getFCDA().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFileHandling() {
        if (fileHandlingEClass == null) {
            fileHandlingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(64);
        }
        return fileHandlingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFileHandling_Ftp() {
        return (EAttribute)getFileHandling().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFileHandling_Ftps() {
        return (EAttribute)getFileHandling().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFileHandling_Mms() {
        return (EAttribute)getFileHandling().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFileHandling_Services() {
        return (EReference)getFileHandling().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGOOSE() {
        if (gooseEClass == null) {
            gooseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(65);
        }
        return gooseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGOOSE_FixedOffs() {
        return (EAttribute)getGOOSE().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGOOSE_Services() {
        return (EReference)getGOOSE().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGOOSE_Goose() {
        return (EAttribute)getGOOSE().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGOOSE_RGOOSE() {
        return (EAttribute)getGOOSE().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGOOSESecurity() {
        if (gooseSecurityEClass == null) {
            gooseSecurityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(66);
        }
        return gooseSecurityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGOOSESecurity_AccessPoint() {
        return (EReference)getGOOSESecurity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGSEControl() {
        if (gseControlEClass == null) {
            gseControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(67);
        }
        return gseControlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGSEControl_AppID() {
        return (EAttribute)getGSEControl().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGSEControl_FixedOffs() {
        return (EAttribute)getGSEControl().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGSEControl_SecurityEnable() {
        return (EAttribute)getGSEControl().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGSEControl_Type() {
        return (EAttribute)getGSEControl().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGSEControl_LN0() {
        return (EReference)getGSEControl().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGSEDir() {
        if (gseDirEClass == null) {
            gseDirEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(68);
        }
        return gseDirEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGSEDir_Services() {
        return (EReference)getGSEDir().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGSESettings() {
        if (gseSettingsEClass == null) {
            gseSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(69);
        }
        return gseSettingsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGSESettings_AppID() {
        return (EAttribute)getGSESettings().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGSESettings_DataLabel() {
        return (EAttribute)getGSESettings().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGSESettings_Services() {
        return (EReference)getGSESettings().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGSESettings_McSecurity() {
        return (EReference)getGSESettings().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGSESettings_KdaParticipant() {
        return (EAttribute)getGSESettings().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGSSE() {
        if (gsseEClass == null) {
            gsseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(70);
        }
        return gsseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGSSE_Services() {
        return (EReference)getGSSE().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGetCBValues() {
        if (getCBValuesEClass == null) {
            getCBValuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(71);
        }
        return getCBValuesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGetCBValues_Services() {
        return (EReference)getGetCBValues().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGetDataObjectDefinition() {
        if (getDataObjectDefinitionEClass == null) {
            getDataObjectDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(72);
        }
        return getDataObjectDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGetDataObjectDefinition_Services() {
        return (EReference)getGetDataObjectDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGetDataSetValue() {
        if (getDataSetValueEClass == null) {
            getDataSetValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(73);
        }
        return getDataSetValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGetDataSetValue_Services() {
        return (EReference)getGetDataSetValue().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGetDirectory() {
        if (getDirectoryEClass == null) {
            getDirectoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(74);
        }
        return getDirectoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGetDirectory_Services() {
        return (EReference)getGetDirectory().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIED() {
        if (iedEClass == null) {
            iedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(75);
        }
        return iedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIED_ConfigVersion() {
        return (EAttribute)getIED().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIED_EngRight() {
        return (EAttribute)getIED().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIED_Manufacturer() {
        return (EAttribute)getIED().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIED_OriginalSclRevision() {
        return (EAttribute)getIED().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIED_OriginalSclVersion() {
        return (EAttribute)getIED().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIED_Owner() {
        return (EAttribute)getIED().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIED_Type() {
        return (EAttribute)getIED().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIED_AccessPoint() {
        return (EReference)getIED().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIED_LNode() {
        return (EReference)getIED().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIED_KDC() {
        return (EReference)getIED().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIED_Services() {
        return (EReference)getIED().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIED_SCL() {
        return (EReference)getIED().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIED_Name() {
        return (EAttribute)getIED().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIED_OriginalSclRelease() {
        return (EAttribute)getIED().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIEDName() {
        if (iedNameEClass == null) {
            iedNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(76);
        }
        return iedNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIEDName_ApRef() {
        return (EAttribute)getIEDName().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIEDName_LdInst() {
        return (EAttribute)getIEDName().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIEDName_LnClass() {
        return (EAttribute)getIEDName().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIEDName_LnInst() {
        return (EAttribute)getIEDName().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIEDName_Prefix() {
        return (EAttribute)getIEDName().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIEDName_ControlWithIEDName() {
        return (EReference)getIEDName().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIEDName_RefersToAnyLN() {
        return (EReference)getIEDName().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIEDName_Value() {
        return (EAttribute)getIEDName().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInputs() {
        if (inputsEClass == null) {
            inputsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(77);
        }
        return inputsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInputs_AnyLN() {
        return (EReference)getInputs().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInputs_ExtRef() {
        return (EReference)getInputs().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIssuerName() {
        if (issuerNameEClass == null) {
            issuerNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(78);
        }
        return issuerNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIssuerName_Certificate() {
        return (EReference)getIssuerName().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getKDC() {
        if (kdcEClass == null) {
            kdcEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(79);
        }
        return kdcEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getKDC_ApName() {
        return (EAttribute)getKDC().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getKDC_IedName() {
        return (EAttribute)getKDC().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getKDC_IED() {
        return (EReference)getKDC().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getKDC_RefersToAccessPoint() {
        return (EReference)getKDC().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLDevice() {
        if (lDeviceEClass == null) {
            lDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(80);
        }
        return lDeviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLDevice_Inst() {
        return (EAttribute)getLDevice().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLDevice_LdName() {
        return (EAttribute)getLDevice().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLDevice_ReferredByControlBlock() {
        return (EReference)getLDevice().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLDevice_AccessControl() {
        return (EReference)getLDevice().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLDevice_Server() {
        return (EReference)getLDevice().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLDevice_LNode() {
        return (EReference)getLDevice().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLDevice_LN() {
        return (EReference)getLDevice().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLDevice_LN0() {
        return (EReference)getLDevice().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLN() {
        if (lnEClass == null) {
            lnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(81);
        }
        return lnEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLN_Prefix() {
        return (EAttribute)getLN().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLN_AccessPoint() {
        return (EReference)getLN().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLN_LDevice() {
        return (EReference)getLN().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLN_LNode() {
        return (EReference)getLN().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLN0() {
        if (ln0EClass == null) {
            ln0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(82);
        }
        return ln0EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLN0_GSEControl() {
        return (EReference)getLN0().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLN0_LDevice() {
        return (EReference)getLN0().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLN0_SampledValueControl() {
        return (EReference)getLN0().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLN0_SettingControl() {
        return (EReference)getLN0().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLog() {
        if (logEClass == null) {
            logEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(83);
        }
        return logEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLog_AnyLN() {
        return (EReference)getLog().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLog_Name() {
        return (EAttribute)getLog().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLog_ReferredByLogControl() {
        return (EReference)getLog().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLogControl() {
        if (logControlEClass == null) {
            logControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(84);
        }
        return logControlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogControl_BufTime() {
        return (EAttribute)getLogControl().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogControl_LdInst() {
        return (EAttribute)getLogControl().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogControl_LnClass() {
        return (EAttribute)getLogControl().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogControl_LnInst() {
        return (EAttribute)getLogControl().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogControl_LogEna() {
        return (EAttribute)getLogControl().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogControl_LogName() {
        return (EAttribute)getLogControl().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogControl_Prefix() {
        return (EAttribute)getLogControl().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogControl_ReasonCode() {
        return (EAttribute)getLogControl().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogControl_AnyLN() {
        return (EReference)getLogControl().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogControl_RefersToAnyLN() {
        return (EReference)getLogControl().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogControl_RefersToLog() {
        return (EReference)getLogControl().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLogSettings() {
        if (logSettingsEClass == null) {
            logSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(85);
        }
        return logSettingsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogSettings_IntgPd() {
        return (EAttribute)getLogSettings().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogSettings_LogEna() {
        return (EAttribute)getLogSettings().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLogSettings_TrgOps() {
        return (EAttribute)getLogSettings().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLogSettings_Services() {
        return (EReference)getLogSettings().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getOptFields() {
        if (optFieldsEClass == null) {
            optFieldsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(86);
        }
        return optFieldsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getOptFields_BufOvfl() {
        return (EAttribute)getOptFields().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getOptFields_ConfigRef() {
        return (EAttribute)getOptFields().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getOptFields_DataRef() {
        return (EAttribute)getOptFields().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getOptFields_DataSet() {
        return (EAttribute)getOptFields().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getOptFields_EntryID() {
        return (EAttribute)getOptFields().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getOptFields_ReasonCode() {
        return (EAttribute)getOptFields().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getOptFields_SeqNum() {
        return (EAttribute)getOptFields().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getOptFields_TimeStamp() {
        return (EAttribute)getOptFields().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getOptFields_ReportControl() {
        return (EReference)getOptFields().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProtocol() {
        if (protocolEClass == null) {
            protocolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(87);
        }
        return protocolEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProtocol_MustUnderstand() {
        return (EAttribute)getProtocol().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProtocol_ControlWithIEDName() {
        return (EReference)getProtocol().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReadWrite() {
        if (readWriteEClass == null) {
            readWriteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(88);
        }
        return readWriteEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReadWrite_Services() {
        return (EReference)getReadWrite().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRedProt() {
        if (redProtEClass == null) {
            redProtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(89);
        }
        return redProtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRedProt_Hsr() {
        return (EAttribute)getRedProt().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRedProt_Prp() {
        return (EAttribute)getRedProt().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRedProt_Rstp() {
        return (EAttribute)getRedProt().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRedProt_Services() {
        return (EReference)getRedProt().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReportControl() {
        if (reportControlEClass == null) {
            reportControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(90);
        }
        return reportControlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportControl_Buffered() {
        return (EAttribute)getReportControl().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportControl_BufTime() {
        return (EAttribute)getReportControl().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportControl_ConfRev() {
        return (EAttribute)getReportControl().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportControl_Indexed() {
        return (EAttribute)getReportControl().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportControl_RptID() {
        return (EAttribute)getReportControl().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReportControl_AnyLN() {
        return (EReference)getReportControl().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReportControl_OptFields() {
        return (EReference)getReportControl().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReportControl_RptEnabled() {
        return (EReference)getReportControl().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getReportSettings() {
        if (reportSettingsEClass == null) {
            reportSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(91);
        }
        return reportSettingsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportSettings_BufTime() {
        return (EAttribute)getReportSettings().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportSettings_IntgPd() {
        return (EAttribute)getReportSettings().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportSettings_OptFields() {
        return (EAttribute)getReportSettings().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportSettings_Owner() {
        return (EAttribute)getReportSettings().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportSettings_ResvTms() {
        return (EAttribute)getReportSettings().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportSettings_RptID() {
        return (EAttribute)getReportSettings().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getReportSettings_TrgOps() {
        return (EAttribute)getReportSettings().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getReportSettings_Services() {
        return (EReference)getReportSettings().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRptEnabled() {
        if (rptEnabledEClass == null) {
            rptEnabledEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(92);
        }
        return rptEnabledEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRptEnabled_Max() {
        return (EAttribute)getRptEnabled().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRptEnabled_ClientLN() {
        return (EReference)getRptEnabled().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRptEnabled_ReportControl() {
        return (EReference)getRptEnabled().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSDI() {
        if (sdiEClass == null) {
            sdiEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(93);
        }
        return sdiEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSDI_Ix() {
        return (EAttribute)getSDI().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSDI_SAddr() {
        return (EAttribute)getSDI().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDI_DAI() {
        return (EReference)getSDI().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDI_DOI() {
        return (EReference)getSDI().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDI_SubSDI() {
        return (EReference)getSDI().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSDI_ParentSDI() {
        return (EReference)getSDI().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSGEdit() {
        if (sgEditEClass == null) {
            sgEditEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(94);
        }
        return sgEditEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSGEdit_ResvTms() {
        return (EAttribute)getSGEdit().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSGEdit_SettingGroups() {
        return (EReference)getSGEdit().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSMVSecurity() {
        if (smvSecurityEClass == null) {
            smvSecurityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(95);
        }
        return smvSecurityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVSecurity_AccessPoint() {
        return (EReference)getSMVSecurity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSMVSettings() {
        if (smvSettingsEClass == null) {
            smvSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(96);
        }
        return smvSettingsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVSettings_SvID() {
        return (EAttribute)getSMVSettings().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVSettings_OptFields() {
        return (EAttribute)getSMVSettings().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVSettings_SmpRateAttribute() {
        return (EAttribute)getSMVSettings().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVSettings_SamplesPerSecAttribute() {
        return (EAttribute)getSMVSettings().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVSettings_PdcTimeStamp() {
        return (EAttribute)getSMVSettings().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVSettings_SmpRate() {
        return (EReference)getSMVSettings().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVSettings_SamplesPerSec() {
        return (EReference)getSMVSettings().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVSettings_SecPerSamples() {
        return (EReference)getSMVSettings().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVSettings_Services() {
        return (EReference)getSMVSettings().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVSettings_SynchSrcId() {
        return (EAttribute)getSMVSettings().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVSettings_NofASDU() {
        return (EAttribute)getSMVSettings().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVSettings_KdaParticipant() {
        return (EAttribute)getSMVSettings().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVSettings_McSecurity() {
        return (EReference)getSMVSettings().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSMVsc() {
        if (smVscEClass == null) {
            smVscEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(97);
        }
        return smVscEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVsc_Delivery() {
        return (EAttribute)getSMVsc().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVsc_DeliveryConf() {
        return (EAttribute)getSMVsc().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSMVsc_Services() {
        return (EReference)getSMVsc().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVsc_Sv() {
        return (EAttribute)getSMVsc().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSMVsc_RSV() {
        return (EAttribute)getSMVsc().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSampledValueControl() {
        if (sampledValueControlEClass == null) {
            sampledValueControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(98);
        }
        return sampledValueControlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSampledValueControl_Multicast() {
        return (EAttribute)getSampledValueControl().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSampledValueControl_NofASDU() {
        return (EAttribute)getSampledValueControl().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSampledValueControl_SecurityEnable() {
        return (EAttribute)getSampledValueControl().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSampledValueControl_SmpMod() {
        return (EAttribute)getSampledValueControl().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSampledValueControl_SmpRate() {
        return (EAttribute)getSampledValueControl().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSampledValueControl_SmvID() {
        return (EAttribute)getSampledValueControl().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSampledValueControl_LN0() {
        return (EReference)getSampledValueControl().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSampledValueControl_SmvOpts() {
        return (EReference)getSampledValueControl().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServer() {
        if (serverEClass == null) {
            serverEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(99);
        }
        return serverEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServer_Timeout() {
        return (EAttribute)getServer().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServer_AccessPoint() {
        return (EReference)getServer().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServer_Association() {
        return (EReference)getServer().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServer_Authentication() {
        return (EReference)getServer().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServer_LDevice() {
        return (EReference)getServer().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServerAt() {
        if (serverAtEClass == null) {
            serverAtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(100);
        }
        return serverAtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServerAt_ApName() {
        return (EAttribute)getServerAt().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServerAt_AccessPoint() {
        return (EReference)getServerAt().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServerAt_RefersToAccessPoint() {
        return (EReference)getServerAt().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceSettings() {
        if (serviceSettingsEClass == null) {
            serviceSettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(101);
        }
        return serviceSettingsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceSettings_CbName() {
        return (EAttribute)getServiceSettings().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceSettings_DatSet() {
        return (EAttribute)getServiceSettings().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceWithMax() {
        if (serviceWithMaxEClass == null) {
            serviceWithMaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(102);
        }
        return serviceWithMaxEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceWithMax_Max() {
        return (EAttribute)getServiceWithMax().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServices() {
        if (servicesEClass == null) {
            servicesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(103);
        }
        return servicesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServices_NameLength() {
        return (EAttribute)getServices().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_AccessPoint() {
        return (EReference)getServices().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_ClientServices() {
        return (EReference)getServices().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_CommProt() {
        return (EReference)getServices().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_ConfDataSet() {
        return (EReference)getServices().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_ConfLNs() {
        return (EReference)getServices().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_ConfLdName() {
        return (EReference)getServices().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_ConfLogControl() {
        return (EReference)getServices().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_ConfReportControl() {
        return (EReference)getServices().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_ConfSigRef() {
        return (EReference)getServices().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_DataObjectDirectory() {
        return (EReference)getServices().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_DataSetDirectory() {
        return (EReference)getServices().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_DynAssociation() {
        return (EReference)getServices().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_DynDataSet() {
        return (EReference)getServices().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_FileHandling() {
        return (EReference)getServices().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_GOOSE() {
        return (EReference)getServices().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_GSEDir() {
        return (EReference)getServices().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_GSESettings() {
        return (EReference)getServices().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_GSSE() {
        return (EReference)getServices().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_GetCBValues() {
        return (EReference)getServices().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_GetDataObjectDefinition() {
        return (EReference)getServices().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_GetDataSetValue() {
        return (EReference)getServices().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_GetDirectory() {
        return (EReference)getServices().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_IED() {
        return (EReference)getServices().getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_LogSettings() {
        return (EReference)getServices().getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_ReadWrite() {
        return (EReference)getServices().getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_RedProt() {
        return (EReference)getServices().getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_ReportSettings() {
        return (EReference)getServices().getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_SMVsc() {
        return (EReference)getServices().getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_SupSubscription() {
        return (EReference)getServices().getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_ValueHandling() {
        return (EReference)getServices().getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_SetDataSetValue() {
        return (EReference)getServices().getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_SettingGroups() {
        return (EReference)getServices().getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_TimeSyncProt() {
        return (EReference)getServices().getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_TimerActivatedControl() {
        return (EReference)getServices().getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServices_SMVSettings() {
        return (EReference)getServices().getEStructuralFeatures().get(35);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSetDataSetValue() {
        if (setDataSetValueEClass == null) {
            setDataSetValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(104);
        }
        return setDataSetValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSetDataSetValue_Services() {
        return (EReference)getSetDataSetValue().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSettingControl() {
        if (settingControlEClass == null) {
            settingControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(105);
        }
        return settingControlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSettingControl_ActSG() {
        return (EAttribute)getSettingControl().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSettingControl_NumOfSGs() {
        return (EAttribute)getSettingControl().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSettingControl_ResvTms() {
        return (EAttribute)getSettingControl().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSettingControl_LN0() {
        return (EReference)getSettingControl().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSettingGroups() {
        if (settingGroupsEClass == null) {
            settingGroupsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(106);
        }
        return settingGroupsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSettingGroups_ConfSG() {
        return (EReference)getSettingGroups().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSettingGroups_SGEdit() {
        return (EReference)getSettingGroups().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSettingGroups_Services() {
        return (EReference)getSettingGroups().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSmvOpts() {
        if (smvOptsEClass == null) {
            smvOptsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(107);
        }
        return smvOptsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSmvOpts_DataSet() {
        return (EAttribute)getSmvOpts().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSmvOpts_RefreshTime() {
        return (EAttribute)getSmvOpts().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSmvOpts_SampleRate() {
        return (EAttribute)getSmvOpts().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSmvOpts_SampleSynchronized() {
        return (EAttribute)getSmvOpts().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSmvOpts_Security() {
        return (EAttribute)getSmvOpts().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSmvOpts_Timestamp() {
        return (EAttribute)getSmvOpts().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSmvOpts_SampledValueControl() {
        return (EReference)getSmvOpts().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSmvOpts_SynchSourceId() {
        return (EAttribute)getSmvOpts().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubject() {
        if (subjectEClass == null) {
            subjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(108);
        }
        return subjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubject_Certificate() {
        return (EReference)getSubject().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSupSubscription() {
        if (supSubscriptionEClass == null) {
            supSubscriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(109);
        }
        return supSubscriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSupSubscription_MaxGo() {
        return (EAttribute)getSupSubscription().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSupSubscription_MaxSv() {
        return (EAttribute)getSupSubscription().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSupSubscription_Services() {
        return (EReference)getSupSubscription().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTimeSyncProt() {
        if (timeSyncProtEClass == null) {
            timeSyncProtEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(110);
        }
        return timeSyncProtEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTimeSyncProt_C37_238() {
        return (EAttribute)getTimeSyncProt().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTimeSyncProt_Other() {
        return (EAttribute)getTimeSyncProt().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTimeSyncProt_Sntp() {
        return (EAttribute)getTimeSyncProt().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTimeSyncProt_ClientServices() {
        return (EReference)getTimeSyncProt().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTimeSyncProt_Services() {
        return (EReference)getTimeSyncProt().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTimeSyncProt_Iec61850_9_3() {
        return (EAttribute)getTimeSyncProt().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTimerActivatedControl() {
        if (timerActivatedControlEClass == null) {
            timerActivatedControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(111);
        }
        return timerActivatedControlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTimerActivatedControl_Services() {
        return (EReference)getTimerActivatedControl().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTrgOps() {
        if (trgOpsEClass == null) {
            trgOpsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(112);
        }
        return trgOpsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrgOps_Dchg() {
        return (EAttribute)getTrgOps().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrgOps_Dupd() {
        return (EAttribute)getTrgOps().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrgOps_Gi() {
        return (EAttribute)getTrgOps().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrgOps_Period() {
        return (EAttribute)getTrgOps().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTrgOps_Qchg() {
        return (EAttribute)getTrgOps().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTrgOps_ControlWithTriggerOpt() {
        return (EReference)getTrgOps().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getValueHandling() {
        if (valueHandlingEClass == null) {
            valueHandlingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(113);
        }
        return valueHandlingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getValueHandling_SetToRO() {
        return (EAttribute)getValueHandling().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getValueHandling_Services() {
        return (EReference)getValueHandling().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbstractConductingEquipment() {
        if (abstractConductingEquipmentEClass == null) {
            abstractConductingEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(114);
        }
        return abstractConductingEquipmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbstractConductingEquipment_SubEquipment() {
        return (EReference)getAbstractConductingEquipment().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbstractConductingEquipment_Terminal() {
        return (EReference)getAbstractConductingEquipment().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAbstractEqFuncSubFunc() {
        if (abstractEqFuncSubFuncEClass == null) {
            abstractEqFuncSubFuncEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(115);
        }
        return abstractEqFuncSubFuncEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAbstractEqFuncSubFunc_Type() {
        return (EAttribute)getAbstractEqFuncSubFunc().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbstractEqFuncSubFunc_EqSubFunction() {
        return (EReference)getAbstractEqFuncSubFunc().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAbstractEqFuncSubFunc_SubGeneralEquipment() {
        return (EReference)getAbstractEqFuncSubFunc().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBay() {
        if (bayEClass == null) {
            bayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(116);
        }
        return bayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBay_VoltageLevel() {
        return (EReference)getBay().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBay_Function() {
        return (EReference)getBay().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBay_ConnectivityNode() {
        return (EReference)getBay().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBay_ConductingEquipment() {
        return (EReference)getBay().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConductingEquipment() {
        if (conductingEquipmentEClass == null) {
            conductingEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(117);
        }
        return conductingEquipmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConductingEquipment_Type() {
        return (EAttribute)getConductingEquipment().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConductingEquipment_Bay() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConductingEquipment_Function() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConductingEquipment_SubFunction() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConductingEquipment_EqFunction() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConductingEquipment_Line() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConductingEquipment_Process() {
        return (EReference)getConductingEquipment().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConnectivityNode() {
        if (connectivityNodeEClass == null) {
            connectivityNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(118);
        }
        return connectivityNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConnectivityNode_PathName() {
        return (EAttribute)getConnectivityNode().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConnectivityNode_Bay() {
        return (EReference)getConnectivityNode().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConnectivityNode_ReferredByTerminal() {
        return (EReference)getConnectivityNode().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConnectivityNode_Line() {
        return (EReference)getConnectivityNode().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEqFunction() {
        if (eqFunctionEClass == null) {
            eqFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(119);
        }
        return eqFunctionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEqFunction_ConductingEquipment() {
        return (EReference)getEqFunction().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEqFunction_GeneralEquipment() {
        return (EReference)getEqFunction().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEqFunction_PowerTransformer() {
        return (EReference)getEqFunction().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEqFunction_SubEquipment() {
        return (EReference)getEqFunction().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEqFunction_TransformerWinding() {
        return (EReference)getEqFunction().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEqFunction_TapChanger() {
        return (EReference)getEqFunction().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEqSubFunction() {
        if (eqSubFunctionEClass == null) {
            eqSubFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(120);
        }
        return eqSubFunctionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEqSubFunction_AbstractEqFuncSubFunc() {
        return (EReference)getEqSubFunction().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEquipment() {
        if (equipmentEClass == null) {
            equipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(121);
        }
        return equipmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEquipment_Virtual() {
        return (EAttribute)getEquipment().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEquipmentContainer() {
        if (equipmentContainerEClass == null) {
            equipmentContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(122);
        }
        return equipmentContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEquipmentContainer_PowerTransformer() {
        return (EReference)getEquipmentContainer().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEquipmentContainer_GeneralEquipment() {
        return (EReference)getEquipmentContainer().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFunction() {
        if (functionEClass == null) {
            functionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(123);
        }
        return functionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFunction_Type() {
        return (EAttribute)getFunction().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunction_Bay() {
        return (EReference)getFunction().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunction_ConductingEquipment() {
        return (EReference)getFunction().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunction_GeneralEquipmentContainer() {
        return (EReference)getFunction().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunction_Substation() {
        return (EReference)getFunction().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunction_VoltageLevel() {
        return (EReference)getFunction().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunction_SubFunction() {
        return (EReference)getFunction().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFunction_GeneralEquipment() {
        return (EReference)getFunction().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGeneralEquipment() {
        if (generalEquipmentEClass == null) {
            generalEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(124);
        }
        return generalEquipmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getGeneralEquipment_Type() {
        return (EAttribute)getGeneralEquipment().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGeneralEquipment_AbstractEqFuncSubFunc() {
        return (EReference)getGeneralEquipment().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGeneralEquipment_EqFunction() {
        return (EReference)getGeneralEquipment().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGeneralEquipment_EquipmentContainer() {
        return (EReference)getGeneralEquipment().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGeneralEquipment_Function() {
        return (EReference)getGeneralEquipment().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGeneralEquipment_GeneralEquipmentContainer() {
        return (EReference)getGeneralEquipment().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGeneralEquipment_SubFunction() {
        return (EReference)getGeneralEquipment().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getGeneralEquipmentContainer() {
        if (generalEquipmentContainerEClass == null) {
            generalEquipmentContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(125);
        }
        return generalEquipmentContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGeneralEquipmentContainer_Function() {
        return (EReference)getGeneralEquipmentContainer().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getGeneralEquipmentContainer_GeneralEquipment() {
        return (EReference)getGeneralEquipmentContainer().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLNode() {
        if (lNodeEClass == null) {
            lNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(126);
        }
        return lNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNode_IedName() {
        return (EAttribute)getLNode().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNode_LdInst() {
        return (EAttribute)getLNode().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNode_LnClass() {
        return (EAttribute)getLNode().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNode_LnInst() {
        return (EAttribute)getLNode().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNode_LnType() {
        return (EAttribute)getLNode().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLNode_Prefix() {
        return (EAttribute)getLNode().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNode_IED() {
        return (EReference)getLNode().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNode_LDevice() {
        return (EReference)getLNode().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNode_LN() {
        return (EReference)getLNode().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNode_LNodeContainer() {
        return (EReference)getLNode().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLNodeContainer() {
        if (lNodeContainerEClass == null) {
            lNodeContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(127);
        }
        return lNodeContainerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLNodeContainer_LNode() {
        return (EReference)getLNodeContainer().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNeutralPoint() {
        if (neutralPointEClass == null) {
            neutralPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(128);
        }
        return neutralPointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNeutralPoint_TransformerWinding() {
        return (EReference)getNeutralPoint().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPowerSystemResource() {
        if (powerSystemResourceEClass == null) {
            powerSystemResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(129);
        }
        return powerSystemResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPowerTransformer() {
        if (powerTransformerEClass == null) {
            powerTransformerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(130);
        }
        return powerTransformerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getPowerTransformer_Type() {
        return (EAttribute)getPowerTransformer().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPowerTransformer_EqFunction() {
        return (EReference)getPowerTransformer().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPowerTransformer_EquipmentContainer() {
        return (EReference)getPowerTransformer().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPowerTransformer_SubEquipment() {
        return (EReference)getPowerTransformer().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getPowerTransformer_TransformerWinding() {
        return (EReference)getPowerTransformer().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubEquipment() {
        if (subEquipmentEClass == null) {
            subEquipmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(131);
        }
        return subEquipmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubEquipment_Phase() {
        return (EAttribute)getSubEquipment().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubEquipment_Virtual() {
        return (EAttribute)getSubEquipment().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubEquipment_AbstractConductingEquipment() {
        return (EReference)getSubEquipment().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubEquipment_EqFunction() {
        return (EReference)getSubEquipment().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubEquipment_PowerTransformer() {
        return (EReference)getSubEquipment().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubEquipment_TapChanger() {
        return (EReference)getSubEquipment().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubFunction() {
        if (subFunctionEClass == null) {
            subFunctionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(132);
        }
        return subFunctionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSubFunction_Type() {
        return (EAttribute)getSubFunction().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubFunction_ConductingEquipment() {
        return (EReference)getSubFunction().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubFunction_Function() {
        return (EReference)getSubFunction().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubFunction_GeneralEquipment() {
        return (EReference)getSubFunction().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubFunction_SubSubFunctions() {
        return (EReference)getSubFunction().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSubstation() {
        if (substationEClass == null) {
            substationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(133);
        }
        return substationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubstation_Function() {
        return (EReference)getSubstation().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubstation_VoltageLevel() {
        return (EReference)getSubstation().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubstation_Process() {
        return (EReference)getSubstation().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSubstation_SCL() {
        return (EReference)getSubstation().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTapChanger() {
        if (tapChangerEClass == null) {
            tapChangerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(134);
        }
        return tapChangerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTapChanger_Type() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTapChanger_Virtual() {
        return (EAttribute)getTapChanger().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTapChanger_EqFunction() {
        return (EReference)getTapChanger().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTapChanger_SubEquipment() {
        return (EReference)getTapChanger().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTapChanger_TransformerWinding() {
        return (EReference)getTapChanger().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTerminal() {
        if (terminalEClass == null) {
            terminalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(135);
        }
        return terminalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTerminal_BayName() {
        return (EAttribute)getTerminal().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTerminal_CNodeName() {
        return (EAttribute)getTerminal().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTerminal_ConnectivityNode() {
        return (EAttribute)getTerminal().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTerminal_ProcessName() {
        return (EAttribute)getTerminal().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTerminal_SubstationName() {
        return (EAttribute)getTerminal().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTerminal_VoltageLevelName() {
        return (EAttribute)getTerminal().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTerminal_AbstractConductingEquipment() {
        return (EReference)getTerminal().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTerminal_RefersToConnectivityNode() {
        return (EReference)getTerminal().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTerminal_Name() {
        return (EAttribute)getTerminal().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTerminal_LineName() {
        return (EAttribute)getTerminal().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTransformerWinding() {
        if (transformerWindingEClass == null) {
            transformerWindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(136);
        }
        return transformerWindingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTransformerWinding_Type() {
        return (EAttribute)getTransformerWinding().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTransformerWinding_EqFunction() {
        return (EReference)getTransformerWinding().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTransformerWinding_NeutralPoint() {
        return (EReference)getTransformerWinding().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTransformerWinding_PowerTransformer() {
        return (EReference)getTransformerWinding().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTransformerWinding_TapChanger() {
        return (EReference)getTransformerWinding().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVoltage() {
        if (voltageEClass == null) {
            voltageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(137);
        }
        return voltageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVoltage_Line() {
        return (EReference)getVoltage().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getVoltageLevel() {
        if (voltageLevelEClass == null) {
            voltageLevelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(138);
        }
        return voltageLevelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVoltageLevel_NomFreq() {
        return (EAttribute)getVoltageLevel().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getVoltageLevel_NumPhases() {
        return (EAttribute)getVoltageLevel().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVoltageLevel_Bay() {
        return (EReference)getVoltageLevel().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVoltageLevel_Function() {
        return (EReference)getVoltageLevel().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVoltageLevel_Substation() {
        return (EReference)getVoltageLevel().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getVoltageLevel_Voltage() {
        return (EReference)getVoltageLevel().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getExplicitLinkResolver() {
        if (explicitLinkResolverEClass == null) {
            explicitLinkResolverEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(152);
        }
        return explicitLinkResolverEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataObject() {
        if (dataObjectEClass == null) {
            dataObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(153);
        }
        return dataObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_AccessControl() {
        return (EAttribute)getDataObject().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataObject_ReferredByFCDA() {
        return (EReference)getDataObject().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataObject_Name() {
        return (EAttribute)getDataObject().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataObject_ReferredByExtRef() {
        return (EReference)getDataObject().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataAttribute() {
        if (dataAttributeEClass == null) {
            dataAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(154);
        }
        return dataAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataAttribute_ReferredByFCDA() {
        return (EReference)getDataAttribute().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataAttribute_Name() {
        return (EAttribute)getDataAttribute().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataAttribute_ReferredByExtRef() {
        return (EReference)getDataAttribute().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSclObject() {
        if (sclObjectEClass == null) {
            sclObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(155);
        }
        return sclObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSclObject_LineNumber() {
        return (EAttribute)getSclObject().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUnNaming() {
        if (unNamingEClass == null) {
            unNamingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(156);
        }
        return unNamingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getUnNaming_Desc() {
        return (EAttribute)getUnNaming().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceYesNo() {
        if (serviceYesNoEClass == null) {
            serviceYesNoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(157);
        }
        return serviceYesNoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceWithOptionalMax() {
        if (serviceWithOptionalMaxEClass == null) {
            serviceWithOptionalMaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(158);
        }
        return serviceWithOptionalMaxEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceWithOptionalMax_Max() {
        return (EAttribute)getServiceWithOptionalMax().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceWithMaxNonZero() {
        if (serviceWithMaxNonZeroEClass == null) {
            serviceWithMaxNonZeroEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(159);
        }
        return serviceWithMaxNonZeroEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceWithMaxNonZero_Max() {
        return (EAttribute)getServiceWithMaxNonZero().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceConfReportControl() {
        if (serviceConfReportControlEClass == null) {
            serviceConfReportControlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(160);
        }
        return serviceConfReportControlEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceConfReportControl_BufMode() {
        return (EAttribute)getServiceConfReportControl().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceConfReportControl_BufConf() {
        return (EAttribute)getServiceConfReportControl().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceConfReportControl_MaxBuf() {
        return (EAttribute)getServiceConfReportControl().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceWithMaxAndMaxAttributes() {
        if (serviceWithMaxAndMaxAttributesEClass == null) {
            serviceWithMaxAndMaxAttributesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(161);
        }
        return serviceWithMaxAndMaxAttributesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceWithMaxAndMaxAttributes_MaxAttributes() {
        return (EAttribute)getServiceWithMaxAndMaxAttributes().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceWithMaxAndModify() {
        if (serviceWithMaxAndModifyEClass == null) {
            serviceWithMaxAndModifyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(162);
        }
        return serviceWithMaxAndModifyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceWithMaxAndModify_Modify() {
        return (EAttribute)getServiceWithMaxAndModify().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceForConfDataSet() {
        if (serviceForConfDataSetEClass == null) {
            serviceForConfDataSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(163);
        }
        return serviceForConfDataSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getServiceForConfDataSet_Modify() {
        return (EAttribute)getServiceForConfDataSet().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCert() {
        if (certEClass == null) {
            certEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(164);
        }
        return certEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCert_CommonName() {
        return (EAttribute)getCert().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getCert_IdHierarchy() {
        return (EAttribute)getCert().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getValueWithUnit() {
        if (valueWithUnitEClass == null) {
            valueWithUnitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(165);
        }
        return valueWithUnitEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getValueWithUnit_Value() {
        return (EAttribute)getValueWithUnit().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getValueWithUnit_Multiplier() {
        return (EAttribute)getValueWithUnit().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getValueWithUnit_Unit() {
        return (EAttribute)getValueWithUnit().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDurationInSec() {
        if (durationInSecEClass == null) {
            durationInSecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(166);
        }
        return durationInSecEClass;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getAssociationKindEnum() {
        if (associationKindEnumEEnum == null) {
            associationKindEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(139);
        }
        return associationKindEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getFCEnum() {
        if (fcEnumEEnum == null) {
            fcEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(140);
        }
        return fcEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getGSEControlTypeEnum() {
        if (gseControlTypeEnumEEnum == null) {
            gseControlTypeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(141);
        }
        return gseControlTypeEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getPhaseEnum() {
        if (phaseEnumEEnum == null) {
            phaseEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(142);
        }
        return phaseEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getPredefinedTypeOfSecurityEnum() {
        if (predefinedTypeOfSecurityEnumEEnum == null) {
            predefinedTypeOfSecurityEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(143);
        }
        return predefinedTypeOfSecurityEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getSMVDeliveryEnum() {
        if (smvDeliveryEnumEEnum == null) {
            smvDeliveryEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(144);
        }
        return smvDeliveryEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getServiceSettingsEnum() {
        if (serviceSettingsEnumEEnum == null) {
            serviceSettingsEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(145);
        }
        return serviceSettingsEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getServiceSettingsNoDynEnum() {
        if (serviceSettingsNoDynEnumEEnum == null) {
            serviceSettingsNoDynEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(146);
        }
        return serviceSettingsNoDynEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getServiceType() {
        if (serviceTypeEEnum == null) {
            serviceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(147);
        }
        return serviceTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getSmpMod() {
        if (smpModEEnum == null) {
            smpModEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(148);
        }
        return smpModEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getUnitMultiplierEnum() {
        if (unitMultiplierEnumEEnum == null) {
            unitMultiplierEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(149);
        }
        return unitMultiplierEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getValKindEnum() {
        if (valKindEnumEEnum == null) {
            valKindEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(150);
        }
        return valKindEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getbufModeEnum() {
        if (bufModeEnumEEnum == null) {
            bufModeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(SclPackage.eNS_URI).getEClassifiers().get(151);
        }
        return bufModeEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SclFactory getSclFactory() {
        return (SclFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isLoaded = false;

    /**
     * Laods the package and any sub-packages from their serialized form.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void loadPackage() {
        if (isLoaded) return;
        isLoaded = true;

        URL url = getClass().getResource(packageFilename);
        if (url == null) {
            throw new RuntimeException("Missing serialized package: " + packageFilename);
        }
        URI uri = URI.createURI(url.toString());
        Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
        try {
            resource.load(null);
        }
        catch (IOException exception) {
            throw new WrappedException(exception);
        }
        initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
        createResource(eNS_URI);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isFixed = false;

    /**
     * Fixes up the loaded package, to make it appear as if it had been programmatically built.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fixPackageContents() {
        if (isFixed) return;
        isFixed = true;
        fixEClassifiers();
    }

    /**
     * Sets the instance class on the given classifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void fixInstanceClass( EClassifier eClassifier ) {
        if (eClassifier.getInstanceClassName() == null) {
            eClassifier.setInstanceClassName("fr.centralesupelec.edf.riseclipse.iec61850.scl." + eClassifier.getName());
            setGeneratedClassName(eClassifier);
        }
    }

} //SclPackageImpl
