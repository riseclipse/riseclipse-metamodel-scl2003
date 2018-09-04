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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage
 * @generated
 */
public class SclSwitch< T > extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static SclPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @generated
     */
    public SclSwitch() {
        if (modelPackage == null) {
            modelPackage = SclPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor( EPackage ePackage ) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch( int classifierID, EObject theEObject ) {
        switch (classifierID) {
            case SclPackage.ANY_CONTENT_FROM_OTHER_NAMESPACE: {
                AnyContentFromOtherNamespace anyContentFromOtherNamespace = (AnyContentFromOtherNamespace)theEObject;
                T result = caseAnyContentFromOtherNamespace(anyContentFromOtherNamespace);
                if (result == null) result = caseSclObject(anyContentFromOtherNamespace);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.BASE_ELEMENT: {
                BaseElement baseElement = (BaseElement)theEObject;
                T result = caseBaseElement(baseElement);
                if (result == null) result = caseExplicitLinkResolver(baseElement);
                if (result == null) result = caseSclObject(baseElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.HEADER: {
                Header header = (Header)theEObject;
                T result = caseHeader(header);
                if (result == null) result = caseSclObject(header);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.HISTORY: {
                History history = (History)theEObject;
                T result = caseHistory(history);
                if (result == null) result = caseSclObject(history);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.HITEM: {
                Hitem hitem = (Hitem)theEObject;
                T result = caseHitem(hitem);
                if (result == null) result = caseSclObject(hitem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ID_NAMING: {
                IDNaming idNaming = (IDNaming)theEObject;
                T result = caseIDNaming(idNaming);
                if (result == null) result = caseBaseElement(idNaming);
                if (result == null) result = caseExplicitLinkResolver(idNaming);
                if (result == null) result = caseSclObject(idNaming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.LINE: {
                Line line = (Line)theEObject;
                T result = caseLine(line);
                if (result == null) result = caseGeneralEquipmentContainer(line);
                if (result == null) result = casePowerSystemResource(line);
                if (result == null) result = caseLNodeContainer(line);
                if (result == null) result = caseNaming(line);
                if (result == null) result = caseBaseElement(line);
                if (result == null) result = caseExplicitLinkResolver(line);
                if (result == null) result = caseSclObject(line);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.NAMING: {
                Naming naming = (Naming)theEObject;
                T result = caseNaming(naming);
                if (result == null) result = caseBaseElement(naming);
                if (result == null) result = caseExplicitLinkResolver(naming);
                if (result == null) result = caseSclObject(naming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.PRIVATE: {
                Private private_ = (Private)theEObject;
                T result = casePrivate(private_);
                if (result == null) result = caseAnyContentFromOtherNamespace(private_);
                if (result == null) result = caseSclObject(private_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.PROCESS: {
                fr.centralesupelec.edf.riseclipse.iec61850.scl.Process process = (fr.centralesupelec.edf.riseclipse.iec61850.scl.Process)theEObject;
                T result = caseProcess(process);
                if (result == null) result = caseGeneralEquipmentContainer(process);
                if (result == null) result = casePowerSystemResource(process);
                if (result == null) result = caseLNodeContainer(process);
                if (result == null) result = caseNaming(process);
                if (result == null) result = caseBaseElement(process);
                if (result == null) result = caseExplicitLinkResolver(process);
                if (result == null) result = caseSclObject(process);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SCL: {
                SCL scl = (SCL)theEObject;
                T result = caseSCL(scl);
                if (result == null) result = caseBaseElement(scl);
                if (result == null) result = caseExplicitLinkResolver(scl);
                if (result == null) result = caseSclObject(scl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.TEXT: {
                Text text = (Text)theEObject;
                T result = caseText(text);
                if (result == null) result = caseSclObject(text);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ADDRESS: {
                Address address = (Address)theEObject;
                T result = caseAddress(address);
                if (result == null) result = caseSclObject(address);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.COMMUNICATION: {
                Communication communication = (Communication)theEObject;
                T result = caseCommunication(communication);
                if (result == null) result = caseUnNaming(communication);
                if (result == null) result = caseBaseElement(communication);
                if (result == null) result = caseExplicitLinkResolver(communication);
                if (result == null) result = caseSclObject(communication);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONNECTED_AP: {
                ConnectedAP connectedAP = (ConnectedAP)theEObject;
                T result = caseConnectedAP(connectedAP);
                if (result == null) result = caseUnNaming(connectedAP);
                if (result == null) result = caseBaseElement(connectedAP);
                if (result == null) result = caseExplicitLinkResolver(connectedAP);
                if (result == null) result = caseSclObject(connectedAP);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONTROL_BLOCK: {
                ControlBlock controlBlock = (ControlBlock)theEObject;
                T result = caseControlBlock(controlBlock);
                if (result == null) result = caseUnNaming(controlBlock);
                if (result == null) result = caseBaseElement(controlBlock);
                if (result == null) result = caseExplicitLinkResolver(controlBlock);
                if (result == null) result = caseSclObject(controlBlock);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GSE: {
                GSE gse = (GSE)theEObject;
                T result = caseGSE(gse);
                if (result == null) result = caseControlBlock(gse);
                if (result == null) result = caseUnNaming(gse);
                if (result == null) result = caseBaseElement(gse);
                if (result == null) result = caseExplicitLinkResolver(gse);
                if (result == null) result = caseSclObject(gse);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.P: {
                P p = (P)theEObject;
                T result = caseP(p);
                if (result == null) result = casePAddr(p);
                if (result == null) result = caseSclObject(p);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.PADDR: {
                PAddr pAddr = (PAddr)theEObject;
                T result = casePAddr(pAddr);
                if (result == null) result = caseSclObject(pAddr);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.PPHYS_CONN: {
                P_PhysConn p_PhysConn = (P_PhysConn)theEObject;
                T result = caseP_PhysConn(p_PhysConn);
                if (result == null) result = casePAddr(p_PhysConn);
                if (result == null) result = caseSclObject(p_PhysConn);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.PHYS_CONN: {
                PhysConn physConn = (PhysConn)theEObject;
                T result = casePhysConn(physConn);
                if (result == null) result = caseUnNaming(physConn);
                if (result == null) result = caseBaseElement(physConn);
                if (result == null) result = caseExplicitLinkResolver(physConn);
                if (result == null) result = caseSclObject(physConn);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SMV: {
                SMV smv = (SMV)theEObject;
                T result = caseSMV(smv);
                if (result == null) result = caseControlBlock(smv);
                if (result == null) result = caseUnNaming(smv);
                if (result == null) result = caseBaseElement(smv);
                if (result == null) result = caseExplicitLinkResolver(smv);
                if (result == null) result = caseSclObject(smv);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SUB_NETWORK: {
                SubNetwork subNetwork = (SubNetwork)theEObject;
                T result = caseSubNetwork(subNetwork);
                if (result == null) result = caseNaming(subNetwork);
                if (result == null) result = caseBaseElement(subNetwork);
                if (result == null) result = caseExplicitLinkResolver(subNetwork);
                if (result == null) result = caseSclObject(subNetwork);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ABSTRACT_DATA_ATTRIBUTE: {
                AbstractDataAttribute abstractDataAttribute = (AbstractDataAttribute)theEObject;
                T result = caseAbstractDataAttribute(abstractDataAttribute);
                if (result == null) result = caseDataAttribute(abstractDataAttribute);
                if (result == null) result = caseUnNaming(abstractDataAttribute);
                if (result == null) result = caseBaseElement(abstractDataAttribute);
                if (result == null) result = caseExplicitLinkResolver(abstractDataAttribute);
                if (result == null) result = caseSclObject(abstractDataAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.BDA: {
                BDA bda = (BDA)theEObject;
                T result = caseBDA(bda);
                if (result == null) result = caseAbstractDataAttribute(bda);
                if (result == null) result = caseDataAttribute(bda);
                if (result == null) result = caseUnNaming(bda);
                if (result == null) result = caseBaseElement(bda);
                if (result == null) result = caseExplicitLinkResolver(bda);
                if (result == null) result = caseSclObject(bda);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DA: {
                DA da = (DA)theEObject;
                T result = caseDA(da);
                if (result == null) result = caseAbstractDataAttribute(da);
                if (result == null) result = caseDataAttribute(da);
                if (result == null) result = caseUnNaming(da);
                if (result == null) result = caseBaseElement(da);
                if (result == null) result = caseExplicitLinkResolver(da);
                if (result == null) result = caseSclObject(da);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DA_TYPE: {
                DAType daType = (DAType)theEObject;
                T result = caseDAType(daType);
                if (result == null) result = caseIDNaming(daType);
                if (result == null) result = caseBaseElement(daType);
                if (result == null) result = caseExplicitLinkResolver(daType);
                if (result == null) result = caseSclObject(daType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DO: {
                DO do_ = (DO)theEObject;
                T result = caseDO(do_);
                if (result == null) result = caseDataObject(do_);
                if (result == null) result = caseUnNaming(do_);
                if (result == null) result = caseBaseElement(do_);
                if (result == null) result = caseExplicitLinkResolver(do_);
                if (result == null) result = caseSclObject(do_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DO_TYPE: {
                DOType doType = (DOType)theEObject;
                T result = caseDOType(doType);
                if (result == null) result = caseIDNaming(doType);
                if (result == null) result = caseBaseElement(doType);
                if (result == null) result = caseExplicitLinkResolver(doType);
                if (result == null) result = caseSclObject(doType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DATA_TYPE_TEMPLATES: {
                DataTypeTemplates dataTypeTemplates = (DataTypeTemplates)theEObject;
                T result = caseDataTypeTemplates(dataTypeTemplates);
                if (result == null) result = caseExplicitLinkResolver(dataTypeTemplates);
                if (result == null) result = caseSclObject(dataTypeTemplates);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ENUM_TYPE: {
                EnumType enumType = (EnumType)theEObject;
                T result = caseEnumType(enumType);
                if (result == null) result = caseIDNaming(enumType);
                if (result == null) result = caseBaseElement(enumType);
                if (result == null) result = caseExplicitLinkResolver(enumType);
                if (result == null) result = caseSclObject(enumType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ENUM_VAL: {
                EnumVal enumVal = (EnumVal)theEObject;
                T result = caseEnumVal(enumVal);
                if (result == null) result = caseSclObject(enumVal);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.LNODE_TYPE: {
                LNodeType lNodeType = (LNodeType)theEObject;
                T result = caseLNodeType(lNodeType);
                if (result == null) result = caseIDNaming(lNodeType);
                if (result == null) result = caseBaseElement(lNodeType);
                if (result == null) result = caseExplicitLinkResolver(lNodeType);
                if (result == null) result = caseSclObject(lNodeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.PROT_NS: {
                ProtNs protNs = (ProtNs)theEObject;
                T result = caseProtNs(protNs);
                if (result == null) result = caseSclObject(protNs);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SDO: {
                SDO sdo = (SDO)theEObject;
                T result = caseSDO(sdo);
                if (result == null) result = caseUnNaming(sdo);
                if (result == null) result = caseBaseElement(sdo);
                if (result == null) result = caseExplicitLinkResolver(sdo);
                if (result == null) result = caseSclObject(sdo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.VAL: {
                Val val = (Val)theEObject;
                T result = caseVal(val);
                if (result == null) result = caseSclObject(val);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ACCESS_CONTROL: {
                AccessControl accessControl = (AccessControl)theEObject;
                T result = caseAccessControl(accessControl);
                if (result == null) result = caseSclObject(accessControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ACCESS_POINT: {
                AccessPoint accessPoint = (AccessPoint)theEObject;
                T result = caseAccessPoint(accessPoint);
                if (result == null) result = caseUnNaming(accessPoint);
                if (result == null) result = caseBaseElement(accessPoint);
                if (result == null) result = caseExplicitLinkResolver(accessPoint);
                if (result == null) result = caseSclObject(accessPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ANY_LN: {
                AnyLN anyLN = (AnyLN)theEObject;
                T result = caseAnyLN(anyLN);
                if (result == null) result = caseUnNaming(anyLN);
                if (result == null) result = caseBaseElement(anyLN);
                if (result == null) result = caseExplicitLinkResolver(anyLN);
                if (result == null) result = caseSclObject(anyLN);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ASSOCIATION: {
                Association association = (Association)theEObject;
                T result = caseAssociation(association);
                if (result == null) result = caseBaseElement(association);
                if (result == null) result = caseExplicitLinkResolver(association);
                if (result == null) result = caseSclObject(association);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.AUTHENTICATION: {
                Authentication authentication = (Authentication)theEObject;
                T result = caseAuthentication(authentication);
                if (result == null) result = caseSclObject(authentication);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CERTIFICATE: {
                Certificate certificate = (Certificate)theEObject;
                T result = caseCertificate(certificate);
                if (result == null) result = caseNaming(certificate);
                if (result == null) result = caseBaseElement(certificate);
                if (result == null) result = caseExplicitLinkResolver(certificate);
                if (result == null) result = caseSclObject(certificate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CLIENT_LN: {
                ClientLN clientLN = (ClientLN)theEObject;
                T result = caseClientLN(clientLN);
                if (result == null) result = caseExplicitLinkResolver(clientLN);
                if (result == null) result = caseSclObject(clientLN);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CLIENT_SERVICES: {
                ClientServices clientServices = (ClientServices)theEObject;
                T result = caseClientServices(clientServices);
                if (result == null) result = caseSclObject(clientServices);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.COMM_PROT: {
                CommProt commProt = (CommProt)theEObject;
                T result = caseCommProt(commProt);
                if (result == null) result = caseSclObject(commProt);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONF_DATA_SET: {
                ConfDataSet confDataSet = (ConfDataSet)theEObject;
                T result = caseConfDataSet(confDataSet);
                if (result == null) result = caseServiceForConfDataSet(confDataSet);
                if (result == null) result = caseServiceWithMaxAndMaxAttributes(confDataSet);
                if (result == null) result = caseServiceWithMax(confDataSet);
                if (result == null) result = caseSclObject(confDataSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONF_LNS: {
                ConfLNs confLNs = (ConfLNs)theEObject;
                T result = caseConfLNs(confLNs);
                if (result == null) result = caseSclObject(confLNs);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONF_LD_NAME: {
                ConfLdName confLdName = (ConfLdName)theEObject;
                T result = caseConfLdName(confLdName);
                if (result == null) result = caseServiceYesNo(confLdName);
                if (result == null) result = caseSclObject(confLdName);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONF_LOG_CONTROL: {
                ConfLogControl confLogControl = (ConfLogControl)theEObject;
                T result = caseConfLogControl(confLogControl);
                if (result == null) result = caseServiceWithMaxNonZero(confLogControl);
                if (result == null) result = caseSclObject(confLogControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONF_REPORT_CONTROL: {
                ConfReportControl confReportControl = (ConfReportControl)theEObject;
                T result = caseConfReportControl(confReportControl);
                if (result == null) result = caseServiceConfReportControl(confReportControl);
                if (result == null) result = caseServiceWithMax(confReportControl);
                if (result == null) result = caseSclObject(confReportControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONF_SG: {
                ConfSG confSG = (ConfSG)theEObject;
                T result = caseConfSG(confSG);
                if (result == null) result = caseSclObject(confSG);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONF_SIG_REF: {
                ConfSigRef confSigRef = (ConfSigRef)theEObject;
                T result = caseConfSigRef(confSigRef);
                if (result == null) result = caseServiceWithMaxNonZero(confSigRef);
                if (result == null) result = caseSclObject(confSigRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONTROL: {
                Control control = (Control)theEObject;
                T result = caseControl(control);
                if (result == null) result = caseUnNaming(control);
                if (result == null) result = caseBaseElement(control);
                if (result == null) result = caseExplicitLinkResolver(control);
                if (result == null) result = caseSclObject(control);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONTROL_WITH_IED_NAME: {
                ControlWithIEDName controlWithIEDName = (ControlWithIEDName)theEObject;
                T result = caseControlWithIEDName(controlWithIEDName);
                if (result == null) result = caseControl(controlWithIEDName);
                if (result == null) result = caseUnNaming(controlWithIEDName);
                if (result == null) result = caseBaseElement(controlWithIEDName);
                if (result == null) result = caseExplicitLinkResolver(controlWithIEDName);
                if (result == null) result = caseSclObject(controlWithIEDName);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONTROL_WITH_TRIGGER_OPT: {
                ControlWithTriggerOpt controlWithTriggerOpt = (ControlWithTriggerOpt)theEObject;
                T result = caseControlWithTriggerOpt(controlWithTriggerOpt);
                if (result == null) result = caseControl(controlWithTriggerOpt);
                if (result == null) result = caseUnNaming(controlWithTriggerOpt);
                if (result == null) result = caseBaseElement(controlWithTriggerOpt);
                if (result == null) result = caseExplicitLinkResolver(controlWithTriggerOpt);
                if (result == null) result = caseSclObject(controlWithTriggerOpt);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DAI: {
                DAI dai = (DAI)theEObject;
                T result = caseDAI(dai);
                if (result == null) result = caseDataAttribute(dai);
                if (result == null) result = caseUnNaming(dai);
                if (result == null) result = caseBaseElement(dai);
                if (result == null) result = caseExplicitLinkResolver(dai);
                if (result == null) result = caseSclObject(dai);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DOI: {
                DOI doi = (DOI)theEObject;
                T result = caseDOI(doi);
                if (result == null) result = caseDataObject(doi);
                if (result == null) result = caseUnNaming(doi);
                if (result == null) result = caseBaseElement(doi);
                if (result == null) result = caseExplicitLinkResolver(doi);
                if (result == null) result = caseSclObject(doi);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DATA_OBJECT_DIRECTORY: {
                DataObjectDirectory dataObjectDirectory = (DataObjectDirectory)theEObject;
                T result = caseDataObjectDirectory(dataObjectDirectory);
                if (result == null) result = caseServiceYesNo(dataObjectDirectory);
                if (result == null) result = caseSclObject(dataObjectDirectory);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DATA_SET: {
                DataSet dataSet = (DataSet)theEObject;
                T result = caseDataSet(dataSet);
                if (result == null) result = caseUnNaming(dataSet);
                if (result == null) result = caseBaseElement(dataSet);
                if (result == null) result = caseExplicitLinkResolver(dataSet);
                if (result == null) result = caseSclObject(dataSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DATA_SET_DIRECTORY: {
                DataSetDirectory dataSetDirectory = (DataSetDirectory)theEObject;
                T result = caseDataSetDirectory(dataSetDirectory);
                if (result == null) result = caseServiceYesNo(dataSetDirectory);
                if (result == null) result = caseSclObject(dataSetDirectory);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DYN_ASSOCIATION: {
                DynAssociation dynAssociation = (DynAssociation)theEObject;
                T result = caseDynAssociation(dynAssociation);
                if (result == null) result = caseServiceWithOptionalMax(dynAssociation);
                if (result == null) result = caseSclObject(dynAssociation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DYN_DATA_SET: {
                DynDataSet dynDataSet = (DynDataSet)theEObject;
                T result = caseDynDataSet(dynDataSet);
                if (result == null) result = caseServiceWithMaxAndMaxAttributes(dynDataSet);
                if (result == null) result = caseServiceWithMax(dynDataSet);
                if (result == null) result = caseSclObject(dynDataSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.EXT_REF: {
                ExtRef extRef = (ExtRef)theEObject;
                T result = caseExtRef(extRef);
                if (result == null) result = caseBaseElement(extRef);
                if (result == null) result = caseExplicitLinkResolver(extRef);
                if (result == null) result = caseSclObject(extRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.FCDA: {
                FCDA fcda = (FCDA)theEObject;
                T result = caseFCDA(fcda);
                if (result == null) result = caseExplicitLinkResolver(fcda);
                if (result == null) result = caseSclObject(fcda);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.FILE_HANDLING: {
                FileHandling fileHandling = (FileHandling)theEObject;
                T result = caseFileHandling(fileHandling);
                if (result == null) result = caseSclObject(fileHandling);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GOOSE: {
                GOOSE goose = (GOOSE)theEObject;
                T result = caseGOOSE(goose);
                if (result == null) result = caseServiceWithMax(goose);
                if (result == null) result = caseSclObject(goose);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GOOSE_SECURITY: {
                GOOSESecurity gooseSecurity = (GOOSESecurity)theEObject;
                T result = caseGOOSESecurity(gooseSecurity);
                if (result == null) result = caseCertificate(gooseSecurity);
                if (result == null) result = caseNaming(gooseSecurity);
                if (result == null) result = caseBaseElement(gooseSecurity);
                if (result == null) result = caseExplicitLinkResolver(gooseSecurity);
                if (result == null) result = caseSclObject(gooseSecurity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GSE_CONTROL: {
                GSEControl gseControl = (GSEControl)theEObject;
                T result = caseGSEControl(gseControl);
                if (result == null) result = caseControlWithIEDName(gseControl);
                if (result == null) result = caseControl(gseControl);
                if (result == null) result = caseUnNaming(gseControl);
                if (result == null) result = caseBaseElement(gseControl);
                if (result == null) result = caseExplicitLinkResolver(gseControl);
                if (result == null) result = caseSclObject(gseControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GSE_DIR: {
                GSEDir gseDir = (GSEDir)theEObject;
                T result = caseGSEDir(gseDir);
                if (result == null) result = caseServiceYesNo(gseDir);
                if (result == null) result = caseSclObject(gseDir);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GSE_SETTINGS: {
                GSESettings gseSettings = (GSESettings)theEObject;
                T result = caseGSESettings(gseSettings);
                if (result == null) result = caseServiceSettings(gseSettings);
                if (result == null) result = caseSclObject(gseSettings);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GSSE: {
                GSSE gsse = (GSSE)theEObject;
                T result = caseGSSE(gsse);
                if (result == null) result = caseServiceWithMax(gsse);
                if (result == null) result = caseSclObject(gsse);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GET_CB_VALUES: {
                GetCBValues getCBValues = (GetCBValues)theEObject;
                T result = caseGetCBValues(getCBValues);
                if (result == null) result = caseServiceYesNo(getCBValues);
                if (result == null) result = caseSclObject(getCBValues);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GET_DATA_OBJECT_DEFINITION: {
                GetDataObjectDefinition getDataObjectDefinition = (GetDataObjectDefinition)theEObject;
                T result = caseGetDataObjectDefinition(getDataObjectDefinition);
                if (result == null) result = caseServiceYesNo(getDataObjectDefinition);
                if (result == null) result = caseSclObject(getDataObjectDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GET_DATA_SET_VALUE: {
                GetDataSetValue getDataSetValue = (GetDataSetValue)theEObject;
                T result = caseGetDataSetValue(getDataSetValue);
                if (result == null) result = caseServiceYesNo(getDataSetValue);
                if (result == null) result = caseSclObject(getDataSetValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GET_DIRECTORY: {
                GetDirectory getDirectory = (GetDirectory)theEObject;
                T result = caseGetDirectory(getDirectory);
                if (result == null) result = caseServiceYesNo(getDirectory);
                if (result == null) result = caseSclObject(getDirectory);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.IED: {
                IED ied = (IED)theEObject;
                T result = caseIED(ied);
                if (result == null) result = caseUnNaming(ied);
                if (result == null) result = caseBaseElement(ied);
                if (result == null) result = caseExplicitLinkResolver(ied);
                if (result == null) result = caseSclObject(ied);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.IED_NAME: {
                IEDName iedName = (IEDName)theEObject;
                T result = caseIEDName(iedName);
                if (result == null) result = caseExplicitLinkResolver(iedName);
                if (result == null) result = caseSclObject(iedName);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.INPUTS: {
                Inputs inputs = (Inputs)theEObject;
                T result = caseInputs(inputs);
                if (result == null) result = caseUnNaming(inputs);
                if (result == null) result = caseBaseElement(inputs);
                if (result == null) result = caseExplicitLinkResolver(inputs);
                if (result == null) result = caseSclObject(inputs);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ISSUER_NAME: {
                IssuerName issuerName = (IssuerName)theEObject;
                T result = caseIssuerName(issuerName);
                if (result == null) result = caseCert(issuerName);
                if (result == null) result = caseSclObject(issuerName);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.KDC: {
                KDC kdc = (KDC)theEObject;
                T result = caseKDC(kdc);
                if (result == null) result = caseExplicitLinkResolver(kdc);
                if (result == null) result = caseSclObject(kdc);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.LDEVICE: {
                LDevice lDevice = (LDevice)theEObject;
                T result = caseLDevice(lDevice);
                if (result == null) result = caseUnNaming(lDevice);
                if (result == null) result = caseBaseElement(lDevice);
                if (result == null) result = caseExplicitLinkResolver(lDevice);
                if (result == null) result = caseSclObject(lDevice);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.LN: {
                LN ln = (LN)theEObject;
                T result = caseLN(ln);
                if (result == null) result = caseAnyLN(ln);
                if (result == null) result = caseUnNaming(ln);
                if (result == null) result = caseBaseElement(ln);
                if (result == null) result = caseExplicitLinkResolver(ln);
                if (result == null) result = caseSclObject(ln);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.LN0: {
                LN0 ln0 = (LN0)theEObject;
                T result = caseLN0(ln0);
                if (result == null) result = caseAnyLN(ln0);
                if (result == null) result = caseUnNaming(ln0);
                if (result == null) result = caseBaseElement(ln0);
                if (result == null) result = caseExplicitLinkResolver(ln0);
                if (result == null) result = caseSclObject(ln0);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.LOG: {
                Log log = (Log)theEObject;
                T result = caseLog(log);
                if (result == null) result = caseUnNaming(log);
                if (result == null) result = caseBaseElement(log);
                if (result == null) result = caseExplicitLinkResolver(log);
                if (result == null) result = caseSclObject(log);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.LOG_CONTROL: {
                LogControl logControl = (LogControl)theEObject;
                T result = caseLogControl(logControl);
                if (result == null) result = caseControlWithTriggerOpt(logControl);
                if (result == null) result = caseControl(logControl);
                if (result == null) result = caseUnNaming(logControl);
                if (result == null) result = caseBaseElement(logControl);
                if (result == null) result = caseExplicitLinkResolver(logControl);
                if (result == null) result = caseSclObject(logControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.LOG_SETTINGS: {
                LogSettings logSettings = (LogSettings)theEObject;
                T result = caseLogSettings(logSettings);
                if (result == null) result = caseServiceSettings(logSettings);
                if (result == null) result = caseSclObject(logSettings);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.OPT_FIELDS: {
                OptFields optFields = (OptFields)theEObject;
                T result = caseOptFields(optFields);
                if (result == null) result = caseSclObject(optFields);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.PROTOCOL: {
                Protocol protocol = (Protocol)theEObject;
                T result = caseProtocol(protocol);
                if (result == null) result = caseSclObject(protocol);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.READ_WRITE: {
                ReadWrite readWrite = (ReadWrite)theEObject;
                T result = caseReadWrite(readWrite);
                if (result == null) result = caseServiceYesNo(readWrite);
                if (result == null) result = caseSclObject(readWrite);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.RED_PROT: {
                RedProt redProt = (RedProt)theEObject;
                T result = caseRedProt(redProt);
                if (result == null) result = caseSclObject(redProt);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.REPORT_CONTROL: {
                ReportControl reportControl = (ReportControl)theEObject;
                T result = caseReportControl(reportControl);
                if (result == null) result = caseControlWithTriggerOpt(reportControl);
                if (result == null) result = caseControl(reportControl);
                if (result == null) result = caseUnNaming(reportControl);
                if (result == null) result = caseBaseElement(reportControl);
                if (result == null) result = caseExplicitLinkResolver(reportControl);
                if (result == null) result = caseSclObject(reportControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.REPORT_SETTINGS: {
                ReportSettings reportSettings = (ReportSettings)theEObject;
                T result = caseReportSettings(reportSettings);
                if (result == null) result = caseServiceSettings(reportSettings);
                if (result == null) result = caseSclObject(reportSettings);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.RPT_ENABLED: {
                RptEnabled rptEnabled = (RptEnabled)theEObject;
                T result = caseRptEnabled(rptEnabled);
                if (result == null) result = caseUnNaming(rptEnabled);
                if (result == null) result = caseBaseElement(rptEnabled);
                if (result == null) result = caseExplicitLinkResolver(rptEnabled);
                if (result == null) result = caseSclObject(rptEnabled);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SDI: {
                SDI sdi = (SDI)theEObject;
                T result = caseSDI(sdi);
                if (result == null) result = caseDataAttribute(sdi);
                if (result == null) result = caseUnNaming(sdi);
                if (result == null) result = caseBaseElement(sdi);
                if (result == null) result = caseExplicitLinkResolver(sdi);
                if (result == null) result = caseSclObject(sdi);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SG_EDIT: {
                SGEdit sgEdit = (SGEdit)theEObject;
                T result = caseSGEdit(sgEdit);
                if (result == null) result = caseSclObject(sgEdit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SMV_SECURITY: {
                SMVSecurity smvSecurity = (SMVSecurity)theEObject;
                T result = caseSMVSecurity(smvSecurity);
                if (result == null) result = caseCertificate(smvSecurity);
                if (result == null) result = caseNaming(smvSecurity);
                if (result == null) result = caseBaseElement(smvSecurity);
                if (result == null) result = caseExplicitLinkResolver(smvSecurity);
                if (result == null) result = caseSclObject(smvSecurity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SMV_SETTINGS: {
                SMVSettings smvSettings = (SMVSettings)theEObject;
                T result = caseSMVSettings(smvSettings);
                if (result == null) result = caseServiceSettings(smvSettings);
                if (result == null) result = caseSclObject(smvSettings);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SM_VSC: {
                SMVsc smVsc = (SMVsc)theEObject;
                T result = caseSMVsc(smVsc);
                if (result == null) result = caseServiceWithMax(smVsc);
                if (result == null) result = caseSclObject(smVsc);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SAMPLED_VALUE_CONTROL: {
                SampledValueControl sampledValueControl = (SampledValueControl)theEObject;
                T result = caseSampledValueControl(sampledValueControl);
                if (result == null) result = caseControlWithIEDName(sampledValueControl);
                if (result == null) result = caseControl(sampledValueControl);
                if (result == null) result = caseUnNaming(sampledValueControl);
                if (result == null) result = caseBaseElement(sampledValueControl);
                if (result == null) result = caseExplicitLinkResolver(sampledValueControl);
                if (result == null) result = caseSclObject(sampledValueControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVER: {
                Server server = (Server)theEObject;
                T result = caseServer(server);
                if (result == null) result = caseUnNaming(server);
                if (result == null) result = caseBaseElement(server);
                if (result == null) result = caseExplicitLinkResolver(server);
                if (result == null) result = caseSclObject(server);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVER_AT: {
                ServerAt serverAt = (ServerAt)theEObject;
                T result = caseServerAt(serverAt);
                if (result == null) result = caseUnNaming(serverAt);
                if (result == null) result = caseBaseElement(serverAt);
                if (result == null) result = caseExplicitLinkResolver(serverAt);
                if (result == null) result = caseSclObject(serverAt);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVICE_SETTINGS: {
                ServiceSettings serviceSettings = (ServiceSettings)theEObject;
                T result = caseServiceSettings(serviceSettings);
                if (result == null) result = caseSclObject(serviceSettings);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVICE_WITH_MAX: {
                ServiceWithMax serviceWithMax = (ServiceWithMax)theEObject;
                T result = caseServiceWithMax(serviceWithMax);
                if (result == null) result = caseSclObject(serviceWithMax);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVICES: {
                Services services = (Services)theEObject;
                T result = caseServices(services);
                if (result == null) result = caseSclObject(services);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SET_DATA_SET_VALUE: {
                SetDataSetValue setDataSetValue = (SetDataSetValue)theEObject;
                T result = caseSetDataSetValue(setDataSetValue);
                if (result == null) result = caseServiceYesNo(setDataSetValue);
                if (result == null) result = caseSclObject(setDataSetValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SETTING_CONTROL: {
                SettingControl settingControl = (SettingControl)theEObject;
                T result = caseSettingControl(settingControl);
                if (result == null) result = caseUnNaming(settingControl);
                if (result == null) result = caseBaseElement(settingControl);
                if (result == null) result = caseExplicitLinkResolver(settingControl);
                if (result == null) result = caseSclObject(settingControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SETTING_GROUPS: {
                SettingGroups settingGroups = (SettingGroups)theEObject;
                T result = caseSettingGroups(settingGroups);
                if (result == null) result = caseSclObject(settingGroups);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SMV_OPTS: {
                SmvOpts smvOpts = (SmvOpts)theEObject;
                T result = caseSmvOpts(smvOpts);
                if (result == null) result = caseSclObject(smvOpts);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SUBJECT: {
                Subject subject = (Subject)theEObject;
                T result = caseSubject(subject);
                if (result == null) result = caseCert(subject);
                if (result == null) result = caseSclObject(subject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SUP_SUBSCRIPTION: {
                SupSubscription supSubscription = (SupSubscription)theEObject;
                T result = caseSupSubscription(supSubscription);
                if (result == null) result = caseSclObject(supSubscription);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.TIME_SYNC_PROT: {
                TimeSyncProt timeSyncProt = (TimeSyncProt)theEObject;
                T result = caseTimeSyncProt(timeSyncProt);
                if (result == null) result = caseSclObject(timeSyncProt);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.TIMER_ACTIVATED_CONTROL: {
                TimerActivatedControl timerActivatedControl = (TimerActivatedControl)theEObject;
                T result = caseTimerActivatedControl(timerActivatedControl);
                if (result == null) result = caseServiceYesNo(timerActivatedControl);
                if (result == null) result = caseSclObject(timerActivatedControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.TRG_OPS: {
                TrgOps trgOps = (TrgOps)theEObject;
                T result = caseTrgOps(trgOps);
                if (result == null) result = caseSclObject(trgOps);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.VALUE_HANDLING: {
                ValueHandling valueHandling = (ValueHandling)theEObject;
                T result = caseValueHandling(valueHandling);
                if (result == null) result = caseSclObject(valueHandling);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ABSTRACT_CONDUCTING_EQUIPMENT: {
                AbstractConductingEquipment abstractConductingEquipment = (AbstractConductingEquipment)theEObject;
                T result = caseAbstractConductingEquipment(abstractConductingEquipment);
                if (result == null) result = caseEquipment(abstractConductingEquipment);
                if (result == null) result = casePowerSystemResource(abstractConductingEquipment);
                if (result == null) result = caseLNodeContainer(abstractConductingEquipment);
                if (result == null) result = caseNaming(abstractConductingEquipment);
                if (result == null) result = caseBaseElement(abstractConductingEquipment);
                if (result == null) result = caseExplicitLinkResolver(abstractConductingEquipment);
                if (result == null) result = caseSclObject(abstractConductingEquipment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.ABSTRACT_EQ_FUNC_SUB_FUNC: {
                AbstractEqFuncSubFunc abstractEqFuncSubFunc = (AbstractEqFuncSubFunc)theEObject;
                T result = caseAbstractEqFuncSubFunc(abstractEqFuncSubFunc);
                if (result == null) result = casePowerSystemResource(abstractEqFuncSubFunc);
                if (result == null) result = caseLNodeContainer(abstractEqFuncSubFunc);
                if (result == null) result = caseNaming(abstractEqFuncSubFunc);
                if (result == null) result = caseBaseElement(abstractEqFuncSubFunc);
                if (result == null) result = caseExplicitLinkResolver(abstractEqFuncSubFunc);
                if (result == null) result = caseSclObject(abstractEqFuncSubFunc);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.BAY: {
                Bay bay = (Bay)theEObject;
                T result = caseBay(bay);
                if (result == null) result = caseEquipmentContainer(bay);
                if (result == null) result = casePowerSystemResource(bay);
                if (result == null) result = caseLNodeContainer(bay);
                if (result == null) result = caseNaming(bay);
                if (result == null) result = caseBaseElement(bay);
                if (result == null) result = caseExplicitLinkResolver(bay);
                if (result == null) result = caseSclObject(bay);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONDUCTING_EQUIPMENT: {
                ConductingEquipment conductingEquipment = (ConductingEquipment)theEObject;
                T result = caseConductingEquipment(conductingEquipment);
                if (result == null) result = caseAbstractConductingEquipment(conductingEquipment);
                if (result == null) result = caseEquipment(conductingEquipment);
                if (result == null) result = casePowerSystemResource(conductingEquipment);
                if (result == null) result = caseLNodeContainer(conductingEquipment);
                if (result == null) result = caseNaming(conductingEquipment);
                if (result == null) result = caseBaseElement(conductingEquipment);
                if (result == null) result = caseExplicitLinkResolver(conductingEquipment);
                if (result == null) result = caseSclObject(conductingEquipment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CONNECTIVITY_NODE: {
                ConnectivityNode connectivityNode = (ConnectivityNode)theEObject;
                T result = caseConnectivityNode(connectivityNode);
                if (result == null) result = caseLNodeContainer(connectivityNode);
                if (result == null) result = caseNaming(connectivityNode);
                if (result == null) result = caseBaseElement(connectivityNode);
                if (result == null) result = caseExplicitLinkResolver(connectivityNode);
                if (result == null) result = caseSclObject(connectivityNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.EQ_FUNCTION: {
                EqFunction eqFunction = (EqFunction)theEObject;
                T result = caseEqFunction(eqFunction);
                if (result == null) result = caseAbstractEqFuncSubFunc(eqFunction);
                if (result == null) result = casePowerSystemResource(eqFunction);
                if (result == null) result = caseLNodeContainer(eqFunction);
                if (result == null) result = caseNaming(eqFunction);
                if (result == null) result = caseBaseElement(eqFunction);
                if (result == null) result = caseExplicitLinkResolver(eqFunction);
                if (result == null) result = caseSclObject(eqFunction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.EQ_SUB_FUNCTION: {
                EqSubFunction eqSubFunction = (EqSubFunction)theEObject;
                T result = caseEqSubFunction(eqSubFunction);
                if (result == null) result = caseAbstractEqFuncSubFunc(eqSubFunction);
                if (result == null) result = casePowerSystemResource(eqSubFunction);
                if (result == null) result = caseLNodeContainer(eqSubFunction);
                if (result == null) result = caseNaming(eqSubFunction);
                if (result == null) result = caseBaseElement(eqSubFunction);
                if (result == null) result = caseExplicitLinkResolver(eqSubFunction);
                if (result == null) result = caseSclObject(eqSubFunction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.EQUIPMENT: {
                Equipment equipment = (Equipment)theEObject;
                T result = caseEquipment(equipment);
                if (result == null) result = casePowerSystemResource(equipment);
                if (result == null) result = caseLNodeContainer(equipment);
                if (result == null) result = caseNaming(equipment);
                if (result == null) result = caseBaseElement(equipment);
                if (result == null) result = caseExplicitLinkResolver(equipment);
                if (result == null) result = caseSclObject(equipment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.EQUIPMENT_CONTAINER: {
                EquipmentContainer equipmentContainer = (EquipmentContainer)theEObject;
                T result = caseEquipmentContainer(equipmentContainer);
                if (result == null) result = casePowerSystemResource(equipmentContainer);
                if (result == null) result = caseLNodeContainer(equipmentContainer);
                if (result == null) result = caseNaming(equipmentContainer);
                if (result == null) result = caseBaseElement(equipmentContainer);
                if (result == null) result = caseExplicitLinkResolver(equipmentContainer);
                if (result == null) result = caseSclObject(equipmentContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.FUNCTION: {
                Function function = (Function)theEObject;
                T result = caseFunction(function);
                if (result == null) result = casePowerSystemResource(function);
                if (result == null) result = caseLNodeContainer(function);
                if (result == null) result = caseNaming(function);
                if (result == null) result = caseBaseElement(function);
                if (result == null) result = caseExplicitLinkResolver(function);
                if (result == null) result = caseSclObject(function);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GENERAL_EQUIPMENT: {
                GeneralEquipment generalEquipment = (GeneralEquipment)theEObject;
                T result = caseGeneralEquipment(generalEquipment);
                if (result == null) result = caseEquipment(generalEquipment);
                if (result == null) result = casePowerSystemResource(generalEquipment);
                if (result == null) result = caseLNodeContainer(generalEquipment);
                if (result == null) result = caseNaming(generalEquipment);
                if (result == null) result = caseBaseElement(generalEquipment);
                if (result == null) result = caseExplicitLinkResolver(generalEquipment);
                if (result == null) result = caseSclObject(generalEquipment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.GENERAL_EQUIPMENT_CONTAINER: {
                GeneralEquipmentContainer generalEquipmentContainer = (GeneralEquipmentContainer)theEObject;
                T result = caseGeneralEquipmentContainer(generalEquipmentContainer);
                if (result == null) result = casePowerSystemResource(generalEquipmentContainer);
                if (result == null) result = caseLNodeContainer(generalEquipmentContainer);
                if (result == null) result = caseNaming(generalEquipmentContainer);
                if (result == null) result = caseBaseElement(generalEquipmentContainer);
                if (result == null) result = caseExplicitLinkResolver(generalEquipmentContainer);
                if (result == null) result = caseSclObject(generalEquipmentContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.LNODE: {
                LNode lNode = (LNode)theEObject;
                T result = caseLNode(lNode);
                if (result == null) result = caseUnNaming(lNode);
                if (result == null) result = caseBaseElement(lNode);
                if (result == null) result = caseExplicitLinkResolver(lNode);
                if (result == null) result = caseSclObject(lNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.LNODE_CONTAINER: {
                LNodeContainer lNodeContainer = (LNodeContainer)theEObject;
                T result = caseLNodeContainer(lNodeContainer);
                if (result == null) result = caseNaming(lNodeContainer);
                if (result == null) result = caseBaseElement(lNodeContainer);
                if (result == null) result = caseExplicitLinkResolver(lNodeContainer);
                if (result == null) result = caseSclObject(lNodeContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.NEUTRAL_POINT: {
                NeutralPoint neutralPoint = (NeutralPoint)theEObject;
                T result = caseNeutralPoint(neutralPoint);
                if (result == null) result = caseTerminal(neutralPoint);
                if (result == null) result = caseUnNaming(neutralPoint);
                if (result == null) result = caseBaseElement(neutralPoint);
                if (result == null) result = caseExplicitLinkResolver(neutralPoint);
                if (result == null) result = caseSclObject(neutralPoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.POWER_SYSTEM_RESOURCE: {
                PowerSystemResource powerSystemResource = (PowerSystemResource)theEObject;
                T result = casePowerSystemResource(powerSystemResource);
                if (result == null) result = caseLNodeContainer(powerSystemResource);
                if (result == null) result = caseNaming(powerSystemResource);
                if (result == null) result = caseBaseElement(powerSystemResource);
                if (result == null) result = caseExplicitLinkResolver(powerSystemResource);
                if (result == null) result = caseSclObject(powerSystemResource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.POWER_TRANSFORMER: {
                PowerTransformer powerTransformer = (PowerTransformer)theEObject;
                T result = casePowerTransformer(powerTransformer);
                if (result == null) result = caseEquipment(powerTransformer);
                if (result == null) result = casePowerSystemResource(powerTransformer);
                if (result == null) result = caseLNodeContainer(powerTransformer);
                if (result == null) result = caseNaming(powerTransformer);
                if (result == null) result = caseBaseElement(powerTransformer);
                if (result == null) result = caseExplicitLinkResolver(powerTransformer);
                if (result == null) result = caseSclObject(powerTransformer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SUB_EQUIPMENT: {
                SubEquipment subEquipment = (SubEquipment)theEObject;
                T result = caseSubEquipment(subEquipment);
                if (result == null) result = casePowerSystemResource(subEquipment);
                if (result == null) result = caseLNodeContainer(subEquipment);
                if (result == null) result = caseNaming(subEquipment);
                if (result == null) result = caseBaseElement(subEquipment);
                if (result == null) result = caseExplicitLinkResolver(subEquipment);
                if (result == null) result = caseSclObject(subEquipment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SUB_FUNCTION: {
                SubFunction subFunction = (SubFunction)theEObject;
                T result = caseSubFunction(subFunction);
                if (result == null) result = casePowerSystemResource(subFunction);
                if (result == null) result = caseLNodeContainer(subFunction);
                if (result == null) result = caseNaming(subFunction);
                if (result == null) result = caseBaseElement(subFunction);
                if (result == null) result = caseExplicitLinkResolver(subFunction);
                if (result == null) result = caseSclObject(subFunction);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SUBSTATION: {
                Substation substation = (Substation)theEObject;
                T result = caseSubstation(substation);
                if (result == null) result = caseEquipmentContainer(substation);
                if (result == null) result = casePowerSystemResource(substation);
                if (result == null) result = caseLNodeContainer(substation);
                if (result == null) result = caseNaming(substation);
                if (result == null) result = caseBaseElement(substation);
                if (result == null) result = caseExplicitLinkResolver(substation);
                if (result == null) result = caseSclObject(substation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.TAP_CHANGER: {
                TapChanger tapChanger = (TapChanger)theEObject;
                T result = caseTapChanger(tapChanger);
                if (result == null) result = casePowerSystemResource(tapChanger);
                if (result == null) result = caseLNodeContainer(tapChanger);
                if (result == null) result = caseNaming(tapChanger);
                if (result == null) result = caseBaseElement(tapChanger);
                if (result == null) result = caseExplicitLinkResolver(tapChanger);
                if (result == null) result = caseSclObject(tapChanger);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.TERMINAL: {
                Terminal terminal = (Terminal)theEObject;
                T result = caseTerminal(terminal);
                if (result == null) result = caseUnNaming(terminal);
                if (result == null) result = caseBaseElement(terminal);
                if (result == null) result = caseExplicitLinkResolver(terminal);
                if (result == null) result = caseSclObject(terminal);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.TRANSFORMER_WINDING: {
                TransformerWinding transformerWinding = (TransformerWinding)theEObject;
                T result = caseTransformerWinding(transformerWinding);
                if (result == null) result = caseAbstractConductingEquipment(transformerWinding);
                if (result == null) result = caseEquipment(transformerWinding);
                if (result == null) result = casePowerSystemResource(transformerWinding);
                if (result == null) result = caseLNodeContainer(transformerWinding);
                if (result == null) result = caseNaming(transformerWinding);
                if (result == null) result = caseBaseElement(transformerWinding);
                if (result == null) result = caseExplicitLinkResolver(transformerWinding);
                if (result == null) result = caseSclObject(transformerWinding);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.VOLTAGE: {
                Voltage voltage = (Voltage)theEObject;
                T result = caseVoltage(voltage);
                if (result == null) result = caseValueWithUnit(voltage);
                if (result == null) result = caseSclObject(voltage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.VOLTAGE_LEVEL: {
                VoltageLevel voltageLevel = (VoltageLevel)theEObject;
                T result = caseVoltageLevel(voltageLevel);
                if (result == null) result = caseEquipmentContainer(voltageLevel);
                if (result == null) result = casePowerSystemResource(voltageLevel);
                if (result == null) result = caseLNodeContainer(voltageLevel);
                if (result == null) result = caseNaming(voltageLevel);
                if (result == null) result = caseBaseElement(voltageLevel);
                if (result == null) result = caseExplicitLinkResolver(voltageLevel);
                if (result == null) result = caseSclObject(voltageLevel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.EXPLICIT_LINK_RESOLVER: {
                ExplicitLinkResolver explicitLinkResolver = (ExplicitLinkResolver)theEObject;
                T result = caseExplicitLinkResolver(explicitLinkResolver);
                if (result == null) result = caseSclObject(explicitLinkResolver);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DATA_OBJECT: {
                DataObject dataObject = (DataObject)theEObject;
                T result = caseDataObject(dataObject);
                if (result == null) result = caseUnNaming(dataObject);
                if (result == null) result = caseBaseElement(dataObject);
                if (result == null) result = caseExplicitLinkResolver(dataObject);
                if (result == null) result = caseSclObject(dataObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DATA_ATTRIBUTE: {
                DataAttribute dataAttribute = (DataAttribute)theEObject;
                T result = caseDataAttribute(dataAttribute);
                if (result == null) result = caseUnNaming(dataAttribute);
                if (result == null) result = caseBaseElement(dataAttribute);
                if (result == null) result = caseExplicitLinkResolver(dataAttribute);
                if (result == null) result = caseSclObject(dataAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SCL_OBJECT: {
                SclObject sclObject = (SclObject)theEObject;
                T result = caseSclObject(sclObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.UN_NAMING: {
                UnNaming unNaming = (UnNaming)theEObject;
                T result = caseUnNaming(unNaming);
                if (result == null) result = caseBaseElement(unNaming);
                if (result == null) result = caseExplicitLinkResolver(unNaming);
                if (result == null) result = caseSclObject(unNaming);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVICE_YES_NO: {
                ServiceYesNo serviceYesNo = (ServiceYesNo)theEObject;
                T result = caseServiceYesNo(serviceYesNo);
                if (result == null) result = caseSclObject(serviceYesNo);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVICE_WITH_OPTIONAL_MAX: {
                ServiceWithOptionalMax serviceWithOptionalMax = (ServiceWithOptionalMax)theEObject;
                T result = caseServiceWithOptionalMax(serviceWithOptionalMax);
                if (result == null) result = caseSclObject(serviceWithOptionalMax);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVICE_WITH_MAX_NON_ZERO: {
                ServiceWithMaxNonZero serviceWithMaxNonZero = (ServiceWithMaxNonZero)theEObject;
                T result = caseServiceWithMaxNonZero(serviceWithMaxNonZero);
                if (result == null) result = caseSclObject(serviceWithMaxNonZero);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVICE_CONF_REPORT_CONTROL: {
                ServiceConfReportControl serviceConfReportControl = (ServiceConfReportControl)theEObject;
                T result = caseServiceConfReportControl(serviceConfReportControl);
                if (result == null) result = caseServiceWithMax(serviceConfReportControl);
                if (result == null) result = caseSclObject(serviceConfReportControl);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES: {
                ServiceWithMaxAndMaxAttributes serviceWithMaxAndMaxAttributes = (ServiceWithMaxAndMaxAttributes)theEObject;
                T result = caseServiceWithMaxAndMaxAttributes(serviceWithMaxAndMaxAttributes);
                if (result == null) result = caseServiceWithMax(serviceWithMaxAndMaxAttributes);
                if (result == null) result = caseSclObject(serviceWithMaxAndMaxAttributes);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVICE_WITH_MAX_AND_MODIFY: {
                ServiceWithMaxAndModify serviceWithMaxAndModify = (ServiceWithMaxAndModify)theEObject;
                T result = caseServiceWithMaxAndModify(serviceWithMaxAndModify);
                if (result == null) result = caseServiceWithMax(serviceWithMaxAndModify);
                if (result == null) result = caseSclObject(serviceWithMaxAndModify);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SERVICE_FOR_CONF_DATA_SET: {
                ServiceForConfDataSet serviceForConfDataSet = (ServiceForConfDataSet)theEObject;
                T result = caseServiceForConfDataSet(serviceForConfDataSet);
                if (result == null) result = caseServiceWithMaxAndMaxAttributes(serviceForConfDataSet);
                if (result == null) result = caseServiceWithMax(serviceForConfDataSet);
                if (result == null) result = caseSclObject(serviceForConfDataSet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.CERT: {
                Cert cert = (Cert)theEObject;
                T result = caseCert(cert);
                if (result == null) result = caseSclObject(cert);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.VALUE_WITH_UNIT: {
                ValueWithUnit valueWithUnit = (ValueWithUnit)theEObject;
                T result = caseValueWithUnit(valueWithUnit);
                if (result == null) result = caseSclObject(valueWithUnit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DURATION_IN_SEC: {
                DurationInSec durationInSec = (DurationInSec)theEObject;
                T result = caseDurationInSec(durationInSec);
                if (result == null) result = caseValueWithUnit(durationInSec);
                if (result == null) result = caseSclObject(durationInSec);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.DURATION_IN_MILLI_SEC: {
                DurationInMilliSec durationInMilliSec = (DurationInMilliSec)theEObject;
                T result = caseDurationInMilliSec(durationInMilliSec);
                if (result == null) result = caseSclObject(durationInMilliSec);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.BIT_RATE_IN_MB_PER_SEC: {
                BitRateInMbPerSec bitRateInMbPerSec = (BitRateInMbPerSec)theEObject;
                T result = caseBitRateInMbPerSec(bitRateInMbPerSec);
                if (result == null) result = caseSclObject(bitRateInMbPerSec);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.MIN_TIME: {
                MinTime minTime = (MinTime)theEObject;
                T result = caseMinTime(minTime);
                if (result == null) result = caseDurationInMilliSec(minTime);
                if (result == null) result = caseSclObject(minTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.MAX_TIME: {
                MaxTime maxTime = (MaxTime)theEObject;
                T result = caseMaxTime(maxTime);
                if (result == null) result = caseDurationInMilliSec(maxTime);
                if (result == null) result = caseSclObject(maxTime);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.BIT_RATE: {
                BitRate bitRate = (BitRate)theEObject;
                T result = caseBitRate(bitRate);
                if (result == null) result = caseBitRateInMbPerSec(bitRate);
                if (result == null) result = caseSclObject(bitRate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SMP_RATE: {
                SmpRate smpRate = (SmpRate)theEObject;
                T result = caseSmpRate(smpRate);
                if (result == null) result = caseSclObject(smpRate);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SAMPLES_PER_SEC: {
                SamplesPerSec samplesPerSec = (SamplesPerSec)theEObject;
                T result = caseSamplesPerSec(samplesPerSec);
                if (result == null) result = caseSclObject(samplesPerSec);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.SEC_PER_SAMPLES: {
                SecPerSamples secPerSamples = (SecPerSamples)theEObject;
                T result = caseSecPerSamples(secPerSamples);
                if (result == null) result = caseSclObject(secPerSamples);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SclPackage.MC_SECURITY: {
                McSecurity mcSecurity = (McSecurity)theEObject;
                T result = caseMcSecurity(mcSecurity);
                if (result == null) result = caseSclObject(mcSecurity);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Any Content From Other Namespace</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Any Content From Other Namespace</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnyContentFromOtherNamespace( AnyContentFromOtherNamespace object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Base Element</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Base Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBaseElement( BaseElement object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Header</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHeader( Header object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>History</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>History</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHistory( History object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Hitem</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Hitem</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHitem( Hitem object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>ID Naming</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>ID Naming</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIDNaming( IDNaming object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Line</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Line</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLine( Line object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Naming</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Naming</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNaming( Naming object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Private</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Private</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrivate( Private object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Process</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProcess( fr.centralesupelec.edf.riseclipse.iec61850.scl.Process object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>SCL</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>SCL</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSCL( SCL object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Text</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Text</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseText( Text object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Address</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAddress( Address object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Communication</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Communication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommunication( Communication object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connected AP</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connected AP</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectedAP( ConnectedAP object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control Block</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control Block</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlBlock( ControlBlock object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>GSE</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>GSE</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGSE( GSE object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>P</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>P</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseP( P object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PAddr</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PAddr</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePAddr( PAddr object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PPhys Conn</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PPhys Conn</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseP_PhysConn( P_PhysConn object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Phys Conn</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Phys Conn</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePhysConn( PhysConn object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>SMV</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>SMV</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSMV( SMV object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Network</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Network</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubNetwork( SubNetwork object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Data Attribute</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Data Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractDataAttribute( AbstractDataAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>BDA</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>BDA</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBDA( BDA object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>DA</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>DA</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDA( DA object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DA Type</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DA Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDAType( DAType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>DO</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>DO</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDO( DO object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>DO Type</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>DO Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDOType( DOType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Type Templates</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type Templates</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataTypeTemplates( DataTypeTemplates object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumType( EnumType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enum Val</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enum Val</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumVal( EnumVal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LNode Type</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LNode Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLNodeType( LNodeType object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Prot Ns</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Prot Ns</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProtNs( ProtNs object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>SDO</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>SDO</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSDO( SDO object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Val</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Val</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVal( Val object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bit Rate In Mb Per Sec</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bit Rate In Mb Per Sec</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBitRateInMbPerSec( BitRateInMbPerSec object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Min Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Min Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMinTime(MinTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Max Time</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Max Time</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaxTime(MaxTime object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bit Rate</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bit Rate</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBitRate(BitRate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Smp Rate</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Smp Rate</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSmpRate(SmpRate object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Samples Per Sec</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Samples Per Sec</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSamplesPerSec(SamplesPerSec object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sec Per Samples</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sec Per Samples</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSecPerSamples(SecPerSamples object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mc Security</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mc Security</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMcSecurity(McSecurity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Duration In Milli Sec</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Duration In Milli Sec</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDurationInMilliSec( DurationInMilliSec object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access Control</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccessControl( AccessControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Access Point</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Access Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAccessPoint( AccessPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Any LN</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Any LN</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnyLN( AnyLN object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssociation( Association object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Authentication</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Authentication</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuthentication( Authentication object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Certificate</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Certificate</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCertificate( Certificate object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Client LN</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Client LN</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClientLN( ClientLN object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Client Services</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Client Services</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClientServices( ClientServices object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Comm Prot</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Comm Prot</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCommProt( CommProt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conf Data Set</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conf Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfDataSet( ConfDataSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conf LNs</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conf LNs</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfLNs( ConfLNs object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conf Ld Name</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conf Ld Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfLdName( ConfLdName object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conf Log Control</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conf Log Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfLogControl( ConfLogControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conf Report Control</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conf Report Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfReportControl( ConfReportControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conf SG</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conf SG</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfSG( ConfSG object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conf Sig Ref</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conf Sig Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConfSigRef( ConfSigRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControl( Control object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control With IED Name</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control With IED Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlWithIEDName( ControlWithIEDName object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Control With Trigger Opt</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control With Trigger Opt</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseControlWithTriggerOpt( ControlWithTriggerOpt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>DAI</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>DAI</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDAI( DAI object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>DOI</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>DOI</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDOI( DOI object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Object Directory</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Object Directory</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataObjectDirectory( DataObjectDirectory object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Set</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataSet( DataSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Set Directory</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Set Directory</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataSetDirectory( DataSetDirectory object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dyn Association</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dyn Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDynAssociation( DynAssociation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Dyn Data Set</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Dyn Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDynDataSet( DynDataSet object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ext Ref</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ext Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExtRef( ExtRef object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>FCDA</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>FCDA</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFCDA( FCDA object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Handling</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Handling</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFileHandling( FileHandling object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>GOOSE</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>GOOSE</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGOOSE( GOOSE object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>GOOSE Security</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>GOOSE Security</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGOOSESecurity( GOOSESecurity object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>GSE Control</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>GSE Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGSEControl( GSEControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>GSE Dir</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>GSE Dir</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGSEDir( GSEDir object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>GSE Settings</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>GSE Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGSESettings( GSESettings object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>GSSE</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>GSSE</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGSSE( GSSE object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Get CB Values</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Get CB Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGetCBValues( GetCBValues object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Get Data Object Definition</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Get Data Object Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGetDataObjectDefinition( GetDataObjectDefinition object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Get Data Set Value</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Get Data Set Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGetDataSetValue( GetDataSetValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Get Directory</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Get Directory</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGetDirectory( GetDirectory object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>IED</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>IED</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIED( IED object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>IED Name</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>IED Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIEDName( IEDName object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Inputs</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Inputs</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInputs( Inputs object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Issuer Name</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Issuer Name</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIssuerName( IssuerName object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>KDC</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>KDC</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKDC( KDC object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LDevice</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LDevice</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLDevice( LDevice object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>LN</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>LN</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLN( LN object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>LN0</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>LN0</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLN0( LN0 object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Log</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Log</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLog( Log object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Log Control</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Log Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogControl( LogControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Log Settings</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Log Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogSettings( LogSettings object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Opt Fields</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Opt Fields</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOptFields( OptFields object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProtocol( Protocol object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Read Write</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Read Write</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReadWrite( ReadWrite object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Red Prot</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Red Prot</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRedProt( RedProt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Report Control</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Report Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReportControl( ReportControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Report Settings</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Report Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReportSettings( ReportSettings object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rpt Enabled</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rpt Enabled</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRptEnabled( RptEnabled object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>SDI</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>SDI</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSDI( SDI object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SG Edit</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SG Edit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSGEdit( SGEdit object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SMV Security</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SMV Security</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSMVSecurity( SMVSecurity object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SMV Settings</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SMV Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSMVSettings( SMVSettings object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>SM Vsc</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>SM Vsc</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSMVsc( SMVsc object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sampled Value Control</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sampled Value Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSampledValueControl( SampledValueControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Server</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServer( Server object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Server At</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Server At</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServerAt( ServerAt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Settings</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Settings</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceSettings( ServiceSettings object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service With Max</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service With Max</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceWithMax( ServiceWithMax object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Services</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Services</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServices( Services object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Set Data Set Value</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Set Data Set Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSetDataSetValue( SetDataSetValue object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Setting Control</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Setting Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSettingControl( SettingControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Setting Groups</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Setting Groups</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSettingGroups( SettingGroups object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Smv Opts</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Smv Opts</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSmvOpts( SmvOpts object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubject( Subject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sup Subscription</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sup Subscription</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSupSubscription( SupSubscription object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Sync Prot</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Sync Prot</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeSyncProt( TimeSyncProt object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Timer Activated Control</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Timer Activated Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimerActivatedControl( TimerActivatedControl object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Trg Ops</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Trg Ops</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTrgOps( TrgOps object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Handling</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Handling</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueHandling( ValueHandling object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Conducting Equipment</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Conducting Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractConductingEquipment( AbstractConductingEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Eq Func Sub Func</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Eq Func Sub Func</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractEqFuncSubFunc( AbstractEqFuncSubFunc object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Bay</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc
     * -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Bay</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBay( Bay object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conducting Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConductingEquipment( ConductingEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Connectivity Node</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Connectivity Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConnectivityNode( ConnectivityNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Eq Function</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Eq Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEqFunction( EqFunction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Eq Sub Function</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Eq Sub Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEqSubFunction( EqSubFunction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquipment( Equipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Equipment Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEquipmentContainer( EquipmentContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunction( Function object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>General Equipment</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>General Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeneralEquipment( GeneralEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>General Equipment Container</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>General Equipment Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeneralEquipmentContainer( GeneralEquipmentContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LNode</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LNode</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLNode( LNode object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>LNode Container</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>LNode Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLNodeContainer( LNodeContainer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Neutral Point</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Neutral Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNeutralPoint( NeutralPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSystemResource( PowerSystemResource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power Transformer</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power Transformer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerTransformer( PowerTransformer object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Equipment</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Equipment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubEquipment( SubEquipment object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sub Function</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sub Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubFunction( SubFunction object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Substation</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Substation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubstation( Substation object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Tap Changer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTapChanger( TapChanger object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Terminal</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Terminal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTerminal( Terminal object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transformer Winding</em>'.
     * <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate
     * the switch. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transformer Winding</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransformerWinding( TransformerWinding object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage</em>'.
     * <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltage( Voltage object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Voltage Level</em>'.
     * <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Voltage Level</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVoltageLevel( VoltageLevel object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Explicit Link Resolver</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Explicit Link Resolver</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExplicitLinkResolver( ExplicitLinkResolver object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataObject( DataObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataAttribute( DataAttribute object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSclObject( SclObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Un Naming</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Un Naming</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnNaming(UnNaming object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Yes No</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Yes No</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceYesNo(ServiceYesNo object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service With Optional Max</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service With Optional Max</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceWithOptionalMax(ServiceWithOptionalMax object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service With Max Non Zero</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service With Max Non Zero</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceWithMaxNonZero(ServiceWithMaxNonZero object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Conf Report Control</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Conf Report Control</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceConfReportControl(ServiceConfReportControl object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service With Max And Max Attributes</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service With Max And Max Attributes</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceWithMaxAndMaxAttributes(ServiceWithMaxAndMaxAttributes object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service With Max And Modify</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service With Max And Modify</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceWithMaxAndModify(ServiceWithMaxAndModify object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service For Conf Data Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service For Conf Data Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceForConfDataSet(ServiceForConfDataSet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cert</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cert</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCert(Cert object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value With Unit</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value With Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueWithUnit(ValueWithUnit object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Duration In Sec</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Duration In Sec</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDurationInSec(DurationInSec object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc --> This implementation returns
    * null; returning a non-null result will terminate the switch, but this is
    * the last case anyway. <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase( EObject object ) {
        return null;
    }

} // SclSwitch
