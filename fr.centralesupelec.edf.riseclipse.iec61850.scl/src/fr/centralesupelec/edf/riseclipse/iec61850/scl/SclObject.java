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
package fr.centralesupelec.edf.riseclipse.iec61850.scl;

import java.math.BigInteger;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject#getLineNumber <em>Line Number</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclObject()
 * @model abstract="true"
 * @generated
 */
public interface SclObject extends EObject {
    /**
	 * Returns the value of the '<em><b>Line Number</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Number</em>' attribute.
	 * @see #setLineNumber(int)
	 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage#getSclObject_LineNumber()
	 * @model default="-1" required="true" transient="true"
	 * @generated
	 */
    int getLineNumber();

    /**
	 * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject#getLineNumber <em>Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Number</em>' attribute.
	 * @see #getLineNumber()
	 * @generated
	 */
    void setLineNumber( int value );

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.matches( \'[A-Za-z0-9][0-9A-Za-z_]*\' )\n\n'"
	 * @generated
	 */
	Boolean validSclAccessPointName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        s.matches( \'[A-Za-z][0-9A-Za-z_]*\' )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclAcsiName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    true\n \n'"
	 * @generated
	 */
	Boolean validSclAnyName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.matches( \'[0-9A-Za-z]+\' )\n\n'"
	 * @generated
	 */
	Boolean validSclAssociationID(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if validSclPredefinedAttributeNameEnum( s ) then\n        true\n    else\n        validSclExtensionAttributeNameEnum( s )\n    endif\n    \n'"
	 * @generated
	 */
	Boolean validSclAttributeNameEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'none\', \'password\', \'weak\', \'strong\', \'certificate\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclAuthenticationEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    validSclPredefinedBasicTypeEnum( s )\n\n'"
	 * @generated
	 */
	Boolean validSclBasicTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclAcsiName( s ) ) then\n        s.size() &lt;= 32\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclCBName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if validSclPredefinedCDCEnum( s ) then\n        true\n    else\n        validSclExtensionCDCEnum( s )\n    endif\n        \n'"
	 * @generated
	 */
	Boolean validSclCDCEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if validSclPredefinedCommonConductingEquipmentEnum( s ) then\n        true\n    else\n        validSclExtensionEquipmentEnum( s )\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclCommonConductingEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.matches( \'[0-9]+\' )\n    or\n    self.validSclAttributeNameEnum( s )\n\n'"
	 * @generated
	 */
	Boolean validSclDACount(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclRestrName1stU( s ) ) then\n        s.size() &lt;= 12\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclDataName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclAcsiName( s ) ) then\n        s.size() &lt;= 32\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclDataSetName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n       validSclDomainLNGroupAEnum( s )\n    or validSclDomainLNGroupCEnum( s )\n    or validSclDomainLNGroupFEnum( s )\n    or validSclDomainLNGroupGEnum( s )\n    or validSclDomainLNGroupIEnum( s )\n    or validSclDomainLNGroupKEnum( s )\n    or validSclDomainLNGroupMEnum( s )\n    or validSclDomainLNGroupPEnum( s )\n    or validSclDomainLNGroupQEnum( s )\n    or validSclDomainLNGroupREnum( s )\n    or validSclDomainLNGroupSEnum( s )\n    or validSclDomainLNGroupTEnum( s )\n    or validSclDomainLNGroupXEnum( s )\n    or validSclDomainLNGroupYEnum( s )\n    or validSclDomainLNGroupZEnum( s )\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'ANCR\', \'ARCO\', \'ARIS\', \'ATCC\', \'AVCO\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupAEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'CALH\', \'CCGR\', \'CILO\', \'CPOW\', \'CSWI\', \'CSYN\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupCEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'FCNT\', \'FCSD\', \'FFIL\', \'FLIM\', \'FPID\', \'FRMP\', \'FSPT\', \'FXOT\', \'FXUT\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupFEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'GAPC\', \'GGIO\', \'GLOG\', \'GSAL\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupGEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'IARC\', \'IHMI\', \'ISAF\', \'ITCI\', \'ITMI\', \'ITPC\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupIEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'KFAN\', \'KFIL\', \'KPMP\', \'KTNK\', \'KVLV\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupKEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'MDIF\', \'MENV\', \'MFLK\', \'MHAI\', \'MHAN\', \'MHYD\', \'MMDC\', \'MMET\', \'MMTN\',\n            \'MMTR\', \'MMXN\', \'MMXU\', \'MSQI\', \'MSTA\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupMEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'PDIF\', \'PDIR\', \'PDIS\', \'PDOP\', \'PDUP\', \'PFRC\', \'PHAR\', \'PHIZ\', \'PIOC\',\n            \'PMRI\', \'PMSS\', \'POPF\', \'PPAM\', \'PRTR\', \'PSCH\', \'PSDE\', \'PTEF\', \'PTHF\',\n            \'PTOC\', \'PTOF\', \'PTOV\', \'PTRC\', \'PTTR\', \'PTUC\', \'PTUF\', \'PTUV\', \'PUPF\',\n            \'PVOC\', \'PVPH\', \'PZSU\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupPEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'QFVR\', \'QITR\', \'QIUB\', \'QVTR\', \'QVUB\', \'QVVR\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupQEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'RADR\', \'RBDR\', \'RBRF\', \'RDIR\', \'RDRE\', \'RDRS\', \'RFLO\', \'RMXU\', \'RPSB\', \'RREC\', \'RSYN\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupREnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'SARC\', \'SCBR\', \'SIMG\', \'SIML\', \'SLTC\', \'SOPM\', \'SPDC\', \'SPTR\', \'SSWI\', \'STMP\', \'SVBR\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupSEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'TANG\', \'TAXD\', \'TCTR\', \'TDST\', \'TFLW\', \'TFRQ\', \'TGSN\', \'THUM\', \'TLVL\',\n            \'TMGF\', \'TMVM\', \'TPOS\', \'TPRS\', \'TRTN\', \'TSND\', \'TTMP\', \'TTNS\', \'TVBR\',\n            \'TVTR\', \'TWPH\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupTEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'XCBR\', \'XSWI\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupXEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'YEFN\', \'YLTC\', \'YPSH\', \'YPTR\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupYEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'ZAXN\', \'ZBAT\', \'ZBSH\', \'ZCAB\', \'ZCAP\', \'ZCON\', \'ZGEN\', \'ZGIL\', \'ZLIN\',\n            \'ZMOT\', \'ZREA\', \'ZRES\', \'ZRRC\', \'ZSAR\', \'ZSCR\', \'ZSMC\', \'ZTCF\', \'ZTCR\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclDomainLNGroupZEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.size() &lt;= 0\n\n'"
	 * @generated
	 */
	Boolean validSclEmpty(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclRestrName1stL( s ) ) then\n        s.size() &lt;= 60\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclExtensionAttributeNameEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        s.matches( \'[A-Za-z]{1,5}\' )\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclExtensionCDCEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        s.size() &gt;= 3 and s.matches( \'E[A-Z]*\' )\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclExtensionEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        s.size() &gt;= 3 and s.matches( \'E[A-Z]*\' )\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclExtensionGeneralEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        s.matches( \'[A-Z]{4}\' )\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclExtensionLNClassEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        -- TODO: find the corresponding OCL RE\n        --self.matches( \'[A-Z][0-9A-Za-z\\-]*\' )\n        s.matches( \'[A-Z][0-9A-Za-z\\u002D]*\' )\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclExtensionPTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.matches( \'[A-Z][0-9A-Za-z]*\' )\n    '"
	 * @generated
	 */
	Boolean validSclExtensionPhysConnTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    -- XSD: &lt;xs:pattern value=\"[a-zA-Z][a-zA-Z0-9]*(\\([0-9]+\\))?(\\.[a-zA-Z][a-zA-Z0-9]*(\\([0-9]+\\))?)*\"/&gt;\n    s.matches( \'[a-zA-Z][a-zA-Z0-9]*(\\u0028[0-9]+\\u0029)?(\\u002E[a-zA-Z][a-zA-Z0-9]*(\\u0028[0-9]+\\u0029)?)*\' )\n\n'"
	 * @generated
	 */
	Boolean validSclFullAttributeName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    -- XSD: &lt;xs:pattern value=\"[A-Z][0-9A-Za-z]{0,11}(\\.[a-z][0-9A-Za-z]*(\\([0-9]+\\))?)?\"/&gt;\n    s.matches( \'[A-Z][0-9A-Za-z]{0,11}(\\u002E[a-z][0-9A-Za-z]*(\\u0028[0-9]+\\u0029)?)?\' )\n \n'"
	 * @generated
	 */
	Boolean validSclFullDOName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if validSclPredefinedGeneralEquipmentEnum( s ) then\n        true\n    else\n        validSclExtensionGeneralEquipmentEnum( s )\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclGeneralEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclVisibleBasicLatin( s ) ) then\n        s.size() &gt;= 1 and s.size() &lt;= 129\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclIEDName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclIEDName( s ) ) then\n        true\n    else\n        self.validSclOnlyRelativeIEDName( s )\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclIEDNameOrRelative(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.matches( \'[A-Za-z0-9][0-9A-Za-z_]{0,63}\' )\n \n'"
	 * @generated
	 */
	Boolean validSclLDInst(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclEmpty( s ) ) then\n        true\n    else\n        self.validSclLDInst( s )\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclLDInstOrEmpty(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.matches( \'[A-Za-z][0-9A-Za-z_]{0,63}\' )\n \n'"
	 * @generated
	 */
	Boolean validSclLDName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'LLN0\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclLLN0Enum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if validSclPredefinedLNClassEnum( s ) then\n        true\n    else\n        validSclExtensionLNClassEnum( s )\n    endif\n    \n'"
	 * @generated
	 */
	Boolean validSclLNClassEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.matches( \'[0-9]{1,12}\' )\n \n'"
	 * @generated
	 */
	Boolean validSclLNInst(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclEmpty( s ) ) then\n        true\n    else\n        self.validSclLNInst( s )\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclLNInstOrEmpty(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'LPHD\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n'"
	 * @generated
	 */
	Boolean validSclLPHDEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.size() &gt;= 1\n\n'"
	 * @generated
	 */
	Boolean validSclLineType(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclAcsiName( s ) ) then\n        s.size() &lt;= 32\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclLogName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclVisibleBasicLatin( s ) ) then\n        s.size() &lt;= 64\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclMessageID(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclAnyName( s ) ) then\n        s.size() &gt;= 1\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    -- XSD: &lt;xs:pattern value=\"[&amp;#x0020;-&amp;#x007E;]+:20\\d\\d[A-Z]?\"/&gt;\n    -- \\d not recognized ?\n    s.matches( \'[\\u0020-\\u007E]+:20[0-9][0-9][A-Z]?\' )\n\n'"
	 * @generated
	 */
	Boolean validSclNamespaceName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    -- XSD: &lt;xs:pattern value=\"&amp;#x0040;\"/&gt;\n    s.matches( \'\\u0040\' )\n\n'"
	 * @generated
	 */
	Boolean validSclOnlyRelativeIEDName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.size() &gt;= 1\n\n'"
	 * @generated
	 */
	Boolean validSclPAddr(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if validSclPredefinedPTypeEnum( s ) then\n        true\n    else\n        validSclExtensionPTypeEnum( s )\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclPTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if validSclPredefinedPTypePhysConnEnum( s ) then\n        true\n    else\n        validSclExtensionPTypeEnum( s )\n    endif\n'"
	 * @generated
	 */
	Boolean validSclPTypePhysConnEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if validSclPredefinedPhysConnTypeEnum( s ) then\n        true\n    else\n        validSclExtensionPhysConnTypeEnum( s )\n    endif\n    \n'"
	 * @generated
	 */
	Boolean validSclPhysConnTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'PTR\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclPowerTransformerEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'T\', \'Test\', \'Check\', \'SIUnit\', \'Oper\', \'SBO\', \'SBOw\', \'Cancel\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclPredefinedAttributeNameEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'BOOLEAN\', \'INT8\', \'INT16\', \'INT24\', \'INT32\', \'INT64\', \'INT128\', \'INT8U\',\n            \'INT16U\', \'INT24U\', \'INT32U\', \'FLOAT32\', \'FLOAT64\', \'Enum\', \'Dbpos\', \'Tcmd\',\n            \'Quality\', \'Timestamp\', \'VisString32\', \'VisString64\', \'VisString65\',\n            \'VisString129\', \'VisString255\', \'Octet64\', \'Unicode255\', \'Struct\', \'EntryTime\',\n            \'Check\', \'ObjRef\', \'Currency\', \'PhyComAddr\', \'TrgOps\', \'OptFlds\', \'SvOptFlds\',\n            \'EntryID\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclPredefinedBasicTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'SPS\', \'DPS\', \'INS\', \'ENS\', \'ACT\', \'ACD\', \'SEC\', \'BCR\', \'HST\', \'VSS\', \'MV\',\n            \'CMV\', \'SAV\', \'WYE\', \'DEL\', \'SEQ\', \'HMV\', \'HWYE\', \'HDEL\', \'SPC\', \'DPC\', \'INC\',\n            \'ENC\', \'BSC\', \'ISC\', \'APC\', \'BAC\', \'SPG\', \'ING\', \'ENG\', \'ORG\', \'TSG\', \'CUG\',\n            \'VSG\', \'ASG\', \'CURVE\', \'CSG\', \'DPL\', \'LPL\', \'CSD\', \'CST\', \'BTS\', \'UTS\', \'LTS\',\n            \'GTS\', \'MTS\', \'NTS\', \'STS\', \'CTS\', \'OTS\', \'VSD\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclPredefinedCDCEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'CBR\', \'DIS\', \'VTR\', \'CTR\', \'GEN\', \'CAP\', \'REA\', \'CON\', \'MOT\', \'EFN\',\n            \'PSH\', \'BAT\', \'BSH\', \'CAB\', \'GIL\', \'LIN\', \'RES\', \'RRC\', \'SAR\', \'TCF\',\n            \'TCR\', \'IFL\', \'FAN\', \'SCR\', \'SMC\', \'PMP\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclPredefinedCommonConductingEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'AXN\', \'BAT\', \'MOT\', \'FAN\', \'FIL\', \'PMP\', \'TNK\', \'VLV\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclPredefinedGeneralEquipmentEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n       validSclSystemLNGroupEnum( s )\n    or validSclDomainLNEnum( s )\n\n'"
	 * @generated
	 */
	Boolean validSclPredefinedLNClassEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'IP\', \'IP-SUBNET\', \'IP-GATEWAY\', \'OSI-NSAP\', \'OSI-TSEL\', \'OSI-SSEL\',\n            \'OSI-PSEL\', \'OSI-AP-Title\', \'OSI-AP-Invoke\', \'OSI-AE-Qualifier\',\n            \'OSI-AE-Invoke\', \'MAC-Address\', \'APPID\', \'VLAN-PRIORITY\', \'VLAN-ID\',\n            \'SNTP-Port\', \'MMS-Port\', \'DNSName\', \'IPv6FlowLabel\', \'IPv6ClassOfTraffic\',\n            \'C37-118-IP-Port\', \'IP-UDP-PORT\', \'IP-TCP-PORT\', \'IPv6\', \'IPv6-SUBNET\',\n            \'IPv6-GATEWAY\' \n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclPredefinedPTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'Type\', \'Plug\', \'Cable\', \'Port\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclPredefinedPTypePhysConnEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    Set{\n        \'Connection\', \'RedConn\'\n    }-&gt;includes( s )\n\n'"
	 * @generated
	 */
	Boolean validSclPredefinedPhysConnTypeEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( s = \'\' ) then\n        true\n    else\n        s.matches( \'[A-Za-z][0-9A-Za-z_]{0,10}\' )\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclPrefix(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.matches( \'.+(/.+)*\' )\n \n'"
	 * @generated
	 */
	Boolean validSclProcessName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.size() &gt;= 1\n\n'"
	 * @generated
	 */
	Boolean validSclProcessType(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'none\', \'hsr\', \'prp\', \'rstp\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclRedProtEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.matches( \'.+/.+/.+/.+(/.+)*\' )\n\n'"
	 * @generated
	 */
	Boolean validSclRef(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    i &gt;= 0 and i &lt;= 255\n\n'"
	 * @generated
	 */
	Boolean validSclRelease(BigInteger i);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        s.matches( \'[a-z][0-9A-Za-z]*\' )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclRestrName1stL(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        s.matches( \'[A-Z][0-9A-Za-z]*\' )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclRestrName1stU(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        s.matches( \'[A-Z]\' )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclRevision(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        Set{\n            \'full\', \'fix\', \'dataflow\'\n        }-&gt;includes( s )\n\n'"
	 * @generated
	 */
	Boolean validSclRightEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    s.matches( \'[0-9]+\' )\n    or\n    self.validSclRestrName1stL( s )\n\n'"
	 * @generated
	 */
	Boolean validSclSDOCount(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclRestrName1stL( s ) ) then\n        s.size() &gt;= 1 and s.size() &lt;= 60\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclSubDataName(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'LLN0\', \'LPHD\', \'LCCH\', \'LGOS\', \'LSVS\', \'LTIM\', \'LTMS\', \'LTRK\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclSystemLNGroupEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        Set{\n            \'PTW\'\n        }-&gt;includes( s )\n    else\n        false\n    endif\n\n'"
	 * @generated
	 */
	Boolean validSclTransformerWindingEnum(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    if( self.validSclName( s ) ) then\n        s.matches( \'2[0-2][0-9]{2}\' )\n    else\n        false\n    endif\n \n'"
	 * @generated
	 */
	Boolean validSclVersion(String s);

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    -- XSD: &lt;xs:pattern value=\"[&amp;#x0020;-&amp;#x007E;]*\"/&gt;\n    -- using \\u0020 because \\x20 is not recognized\n    s.matches( \'[\\u0020-\\u007E]*\' )\n\n'"
	 * @generated
	 */
	Boolean validSclVisibleBasicLatin(String s);

} // SclObject
