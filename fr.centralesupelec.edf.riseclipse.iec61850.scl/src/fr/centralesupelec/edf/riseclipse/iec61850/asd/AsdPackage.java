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
package fr.centralesupelec.edf.riseclipse.iec61850.asd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 *
 *             COPYRIGHT (c) IEC, 2024. This XSD schema is part of IEC 61850-90-30:2022 ed1 and IEC 61850-7-6:2020 ed2; see the IEC 61850-90-30:2022 ed1 and IEC 61850-7-6:2020 ed2 for full legal notices. In case of any differences between the here-below code and the IEC published content, the here-below definition supersedes the IEC publication; it may contain updates. See history files. The whole document has to be taken into account to have a full description of this code component.
 * See www.iec.ch/CCv1 for copyright details.
 *
 *
 * 			COPYRIGHT (c) IEC, 2023. This version of this XSD is part of IEC 61850-6:2009/AMD2:2023; see the IEC 61850-6:2009/AMD2:2023 for full legal notices. In case of any differences between the here-below code and the IEC published content, the here-below definition supersedes the IEC publication; it may contain updates. See history files. The whole document has to be taken into account to have a full description of this code component.
 * 			See www.iec.ch/CCv1 for copyright details.
 *
 *
 * 			SCL schema version "2007" revision "C" release 5,  for IEC 61850-6 Ed. 2.2. 2024-02-02
 *
 * 			Implemented Ed. 2.1 TISSUEs (since "2007B4"): 1672, 1674, 1675, 1708, 1734, 1768, 1874.
 * 			TISSUEs not relevant for the SCL schema (since "2007B4"): 1669, 1683, 1729, 1740, 1745, 1787, 1808, 1813, 1823, 1832, 1834.
 * 			TISSUEs not applicable: 1628, 1695, 1723, 1725, 1746, 1750, 1772, 1791, 1812, 1872.
 * 			TISSUEs for Ed. 3: 1673, 1727, 1794, 1799.
 *
 *
 * 			COPYRIGHT (c) IEC, 2023. This version of this XSD is part of IEC 61850-6:2009/AMD2:2023; see the IEC 61850-6:2009/AMD2:2023 for full legal notices. In case of any differences between the here-below code and the IEC published content, the here-below definition supersedes the IEC publication; it may contain updates. See history files. The whole document has to be taken into account to have a full description of this code component.
 * 			See www.iec.ch/CCv1 for copyright details.
 *
 *
 * 			SCL schema version "2007" revision "C" release 5,  for IEC 61850-6 Ed. 2.2. 2024-02-02
 *
 *
 * 						COPYRIGHT (c) IEC, 2023. This version of this XSD is part of IEC 61850-6:2009/AMD2:2023; see the IEC 61850-6:2009/AMD2:2023 for full legal notices. In case of any differences between the here-below code and the IEC published content, the here-below definition supersedes the IEC publication; it may contain updates. See history files. The whole document has to be taken into account to have a full description of this code component.
 * 			See www.iec.ch/CCv1 for copyright details.
 *
 *
 * 			SCL schema version "2007" revision "C" release 5,  for IEC 61850-6 Ed. 2.2. 2024-02-02
 *
 *
 * 			COPYRIGHT (c) IEC, 2023. This version of this XSD is part of IEC 61850-6:2009/AMD2:2023; see the IEC 61850-6:2009/AMD2:2023 for full legal notices. In case of any differences between the here-below code and the IEC published content, the here-below definition supersedes the IEC publication; it may contain updates. See history files. The whole document has to be taken into account to have a full description of this code component.
 * 			See www.iec.ch/CCv1 for copyright details.
 *
 *
 * 			SCL schema version "2007" revision "C" release 5,  for IEC 61850-6 Ed. 2.2. 2024-02-02
 *
 *
 * 			COPYRIGHT (c) IEC, 2023. This version of this XSD is part of IEC 61850-6:2009/AMD2:2023; see the IEC 61850-6:2009/AMD2:2023 for full legal notices. In case of any differences between the here-below code and the IEC published content, the here-below definition supersedes the IEC publication; it may contain updates. See history files. The whole document has to be taken into account to have a full description of this code component.
 * 			See www.iec.ch/CCv1 for copyright details.
 *
 *
 * 			SCL schema version "2007" revision "C" release 5,  for IEC 61850-6 Ed. 2.2. 2024-02-02
 *
 *
 * 			COPYRIGHT (c) IEC, 2023. This version of this XSD is part of IEC 61850-6:2009/AMD2:2023; see the IEC 61850-6:2009/AMD2:2023 for full legal notices. In case of any differences between the here-below code and the IEC published content, the here-below definition supersedes the IEC publication; it may contain updates. See history files. The whole document has to be taken into account to have a full description of this code component.
 * 			See www.iec.ch/CCv1 for copyright details.
 *
 *
 * 			SCL schema version "2007" revision "C" release 5,  for IEC 61850-6 Ed. 2.2. 2024-02-02
 *
 *
 * 			COPYRIGHT (c) IEC, 2023. This version of this XSD is part of IEC 61850-6:2009/AMD2:2023; see the IEC 61850-6:2009/AMD2:2023 for full legal notices. In case of any differences between the here-below code and the IEC published content, the here-below definition supersedes the IEC publication; it may contain updates. See history files. The whole document has to be taken into account to have a full description of this code component.
 * 			See www.iec.ch/CCv1 for copyright details.
 *
 *
 * 			SCL schema version "2007" revision "C" release 5,  for IEC 61850-6 Ed. 2.2. 2024-02-02
 *
 *
 * 			COPYRIGHT (c) IEC, 2023. This version of this XSD is part of IEC 61850-6:2009/AMD2:2023; see the IEC 61850-6:2009/AMD2:2023 for full legal notices. In case of any differences between the here-below code and the IEC published content, the here-below definition supersedes the IEC publication; it may contain updates. See history files. The whole document has to be taken into account to have a full description of this code component.
 * 			See www.iec.ch/CCv1 for copyright details.
 *
 *
 * 			SCL schema version "2007" revision "C" release 5,  for IEC 61850-6 Ed. 2.2. 2024-02-02
 *
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdFactory
 * @model kind="package"
 * @generated
 */
public interface AsdPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "asd";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.iec.ch/61850/2019/SCL/6-100";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "e61850-6-100";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AsdPackage eINSTANCE = fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl.init();

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdObjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getAsdObject()
     * @generated
     */
    int ASD_OBJECT = 8;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASD_OBJECT__FILENAME = 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASD_OBJECT__LINE_NUMBER = 1;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASD_OBJECT__EXPLICIT_LINKS_BUILT = 2;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASD_OBJECT__PARENT_PRIVATE = 3;

    /**
     * The number of structural features of the '<em>Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASD_OBJECT_FEATURE_COUNT = 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = 0;

    /**
     * The number of operations of the '<em>Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASD_OBJECT_OPERATION_COUNT = 1;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BaseExtensionElementImpl <em>Base Extension Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BaseExtensionElementImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getBaseExtensionElement()
     * @generated
     */
    int BASE_EXTENSION_ELEMENT = 9;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT__FILENAME = ASD_OBJECT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT__LINE_NUMBER = ASD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT__EXPLICIT_LINKS_BUILT = ASD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT__PARENT_PRIVATE = ASD_OBJECT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT__TEXT = ASD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT__ANY = ASD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Base Extension Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_FEATURE_COUNT = ASD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = ASD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Base Extension Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_OPERATION_COUNT = ASD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BaseExtensionElementWithDescImpl <em>Base Extension Element With Desc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BaseExtensionElementWithDescImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getBaseExtensionElementWithDesc()
     * @generated
     */
    int BASE_EXTENSION_ELEMENT_WITH_DESC = 10;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME = BASE_EXTENSION_ELEMENT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER = BASE_EXTENSION_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT = BASE_EXTENSION_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_WITH_DESC__ANY = BASE_EXTENSION_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_WITH_DESC__DESC = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Base Extension Element With Desc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Base Extension Element With Desc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AbstractFunctionalVariantImpl <em>Abstract Functional Variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AbstractFunctionalVariantImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getAbstractFunctionalVariant()
     * @generated
     */
    int ABSTRACT_FUNCTIONAL_VARIANT = 1;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AllocationRoleImpl <em>Allocation Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AllocationRoleImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getAllocationRole()
     * @generated
     */
    int ALLOCATION_ROLE = 2;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantRefContainerImpl <em>Functional Variant Ref Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantRefContainerImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionalVariantRefContainer()
     * @generated
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER = 37;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AllocationRoleRefImpl <em>Allocation Role Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AllocationRoleRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getAllocationRoleRef()
     * @generated
     */
    int ALLOCATION_ROLE_REF = 3;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getApplication()
     * @generated
     */
    int APPLICATION = 4;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceParametersImpl <em>Service Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getServiceParameters()
     * @generated
     */
    int SERVICE_PARAMETERS = 71;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.WiringParametersImpl <em>Wiring Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.WiringParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getWiringParameters()
     * @generated
     */
    int WIRING_PARAMETERS = 85;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersImpl <em>Analogue Wiring Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getAnalogueWiringParameters()
     * @generated
     */
    int ANALOGUE_WIRING_PARAMETERS = 5;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.Abstract6100LNodeContainerImpl <em>Abstract6100 LNode Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.Abstract6100LNodeContainerImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getAbstract6100LNodeContainer()
     * @generated
     */
    int ABSTRACT6100_LNODE_CONTAINER = 0;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__LNODE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__ORIGIN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__TEMPLATE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Abstract6100 LNode Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Abstract6100 LNode Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT6100_LNODE_CONTAINER_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Functional Sub Variant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Baseline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__IS_BASELINE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__ORIGIN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__TEMPLATE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Abstract Functional Variant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Abstract Functional Variant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_FUNCTIONAL_VARIANT_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Function Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__FUNCTION_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__ORIGIN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__TEMPLATE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Referred By Allocation Role Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE__REFERRED_BY_ALLOCATION_ROLE_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Allocation Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Allocation Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Functional Variant Ref Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Functional Variant Ref Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Allocation Role</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__ALLOCATION_ROLE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Allocation Role Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__ALLOCATION_ROLE_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Application</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__PARENT_APPLICATION = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Allocation Role</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF__REFERS_TO_ALLOCATION_ROLE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Allocation Role Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Allocation Role Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALLOCATION_ROLE_REF_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Function Role</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__FUNCTION_ROLE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Functional Variant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__FUNCTIONAL_VARIANT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Functional Variant Group</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__FUNCTIONAL_VARIANT_GROUP = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Allocation Role Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__ALLOCATION_ROLE_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Application Scl Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__APPLICATION_SCL_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__ORIGIN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__TEMPLATE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__TYPE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 10;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Application</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS__ID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS__FILENAME = SERVICE_PARAMETERS__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS__LINE_NUMBER = SERVICE_PARAMETERS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS__EXPLICIT_LINKS_BUILT = SERVICE_PARAMETERS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS__PARENT_PRIVATE = SERVICE_PARAMETERS__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS__TEXT = SERVICE_PARAMETERS__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS__ANY = SERVICE_PARAMETERS__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS__DESC = SERVICE_PARAMETERS__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS__ID = SERVICE_PARAMETERS__ID;

    /**
     * The feature id for the '<em><b>Inp Nam</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS__INP_NAM = SERVICE_PARAMETERS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Inp Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS__INP_REF = SERVICE_PARAMETERS_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Wiring Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS_FEATURE_COUNT = SERVICE_PARAMETERS_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = SERVICE_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Wiring Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIRING_PARAMETERS_OPERATION_COUNT = SERVICE_PARAMETERS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__FILENAME = WIRING_PARAMETERS__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__LINE_NUMBER = WIRING_PARAMETERS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__EXPLICIT_LINKS_BUILT = WIRING_PARAMETERS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__PARENT_PRIVATE = WIRING_PARAMETERS__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__TEXT = WIRING_PARAMETERS__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__ANY = WIRING_PARAMETERS__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__DESC = WIRING_PARAMETERS__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__ID = WIRING_PARAMETERS__ID;

    /**
     * The feature id for the '<em><b>Inp Nam</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__INP_NAM = WIRING_PARAMETERS__INP_NAM;

    /**
     * The feature id for the '<em><b>Inp Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__INP_REF = WIRING_PARAMETERS__INP_REF;

    /**
     * The feature id for the '<em><b>Dsg Inp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__DSG_INP = WIRING_PARAMETERS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Fct Inp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__FCT_INP = WIRING_PARAMETERS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Service Specifications</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS = WIRING_PARAMETERS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Referred By Analogue Wiring Parameters Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS__REFERRED_BY_ANALOGUE_WIRING_PARAMETERS_REF = WIRING_PARAMETERS_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Analogue Wiring Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_FEATURE_COUNT = WIRING_PARAMETERS_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = WIRING_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Analogue Wiring Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_OPERATION_COUNT = WIRING_PARAMETERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceParametersRefImpl <em>Service Parameters Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceParametersRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getServiceParametersRef()
     * @generated
     */
    int SERVICE_PARAMETERS_REF = 72;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_REF__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_REF__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_REF__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_REF__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_REF__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_REF__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_REF__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_REF__ID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_REF_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_PARAMETERS_REF_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersRefImpl <em>Analogue Wiring Parameters Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AnalogueWiringParametersRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getAnalogueWiringParametersRef()
     * @generated
     */
    int ANALOGUE_WIRING_PARAMETERS_REF = 6;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__FILENAME = SERVICE_PARAMETERS_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__LINE_NUMBER = SERVICE_PARAMETERS_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__EXPLICIT_LINKS_BUILT = SERVICE_PARAMETERS_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__PARENT_PRIVATE = SERVICE_PARAMETERS_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__TEXT = SERVICE_PARAMETERS_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__ANY = SERVICE_PARAMETERS_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__DESC = SERVICE_PARAMETERS_REF__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__ID = SERVICE_PARAMETERS_REF__ID;

    /**
     * The feature id for the '<em><b>Parent Control Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Controlling LNode</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Source Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Analogue Wiring Parameters</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF__REFERS_TO_ANALOGUE_WIRING_PARAMETERS = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Analogue Wiring Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF_FEATURE_COUNT = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = SERVICE_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Analogue Wiring Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANALOGUE_WIRING_PARAMETERS_REF_OPERATION_COUNT = SERVICE_PARAMETERS_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationSclRefImpl <em>Application Scl Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ApplicationSclRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getApplicationSclRef()
     * @generated
     */
    int APPLICATION_SCL_REF = 7;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_SCL_REF__FILENAME = BASE_EXTENSION_ELEMENT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_SCL_REF__LINE_NUMBER = BASE_EXTENSION_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_SCL_REF__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_SCL_REF__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_SCL_REF__TEXT = BASE_EXTENSION_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_SCL_REF__ANY = BASE_EXTENSION_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Scl File Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_SCL_REF__SCL_FILE_REFERENCE = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Application</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_SCL_REF__PARENT_APPLICATION = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Application Scl Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_SCL_REF_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_SCL_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Application Scl Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_SCL_REF_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BayTypeImpl <em>Bay Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BayTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getBayType()
     * @generated
     */
    int BAY_TYPE = 11;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY_TYPE__FILENAME = ASD_OBJECT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY_TYPE__LINE_NUMBER = ASD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY_TYPE__EXPLICIT_LINKS_BUILT = ASD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY_TYPE__PARENT_PRIVATE = ASD_OBJECT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY_TYPE__VALUE = ASD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Bay Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY_TYPE_FEATURE_COUNT = ASD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY_TYPE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = ASD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Bay Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY_TYPE_OPERATION_COUNT = ASD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl <em>Behavior Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getBehaviorDescription()
     * @generated
     */
    int BEHAVIOR_DESCRIPTION = 12;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Input Var</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__INPUT_VAR = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Output Var</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__OUTPUT_VAR = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Behavior Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__BEHAVIOR_REFERENCE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>File Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__FILE_REFERENCE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__FORMAT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Is Simulation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__IS_SIMULATION = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Is Specification</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__IS_SPECIFICATION = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__ORIGIN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__TEMPLATE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Referred By Behavior Description Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION__REFERRED_BY_BEHAVIOR_DESCRIPTION_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT
            + 11;

    /**
     * The number of structural features of the '<em>Behavior Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 12;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Behavior Description</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionRefImpl <em>Behavior Description Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorDescriptionRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getBehaviorDescriptionRef()
     * @generated
     */
    int BEHAVIOR_DESCRIPTION_REF = 13;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Input Var Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__INPUT_VAR_REF = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Output Var Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__OUTPUT_VAR_REF = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Behavior Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Behavior Description Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__BEHAVIOR_DESCRIPTION_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Function Role Content</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__PARENT_FUNCTION_ROLE_CONTENT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Refers To Behavior Description</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF__REFERS_TO_BEHAVIOR_DESCRIPTION = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Behavior Description Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Behavior Description Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_DESCRIPTION_REF_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorReferenceImpl <em>Behavior Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BehaviorReferenceImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getBehaviorReference()
     * @generated
     */
    int BEHAVIOR_REFERENCE = 14;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Behavior Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE__BEHAVIOR_REFERENCE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Behavior Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE__BEHAVIOR_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Behavior Description</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE__PARENT_BEHAVIOR_DESCRIPTION = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Behavior Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Behavior Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_REFERENCE_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl <em>Binary Wiring Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getBinaryWiringParameters()
     * @generated
     */
    int BINARY_WIRING_PARAMETERS = 15;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__FILENAME = WIRING_PARAMETERS__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__LINE_NUMBER = WIRING_PARAMETERS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__EXPLICIT_LINKS_BUILT = WIRING_PARAMETERS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__PARENT_PRIVATE = WIRING_PARAMETERS__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__TEXT = WIRING_PARAMETERS__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__ANY = WIRING_PARAMETERS__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__DESC = WIRING_PARAMETERS__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__ID = WIRING_PARAMETERS__ID;

    /**
     * The feature id for the '<em><b>Inp Nam</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__INP_NAM = WIRING_PARAMETERS__INP_NAM;

    /**
     * The feature id for the '<em><b>Inp Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__INP_REF = WIRING_PARAMETERS__INP_REF;

    /**
     * The feature id for the '<em><b>Deb Tm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__DEB_TM = WIRING_PARAMETERS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Fast Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__FAST_OUTPUT = WIRING_PARAMETERS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Out Nam</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__OUT_NAM = WIRING_PARAMETERS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Out Off Dl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__OUT_OFF_DL = WIRING_PARAMETERS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Out On Dl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__OUT_ON_DL = WIRING_PARAMETERS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Out Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__OUT_REF = WIRING_PARAMETERS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Out Typ</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__OUT_TYP = WIRING_PARAMETERS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>VIn Off</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__VIN_OFF = WIRING_PARAMETERS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>VIn On</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__VIN_ON = WIRING_PARAMETERS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Parent Service Specifications</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS = WIRING_PARAMETERS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Referred By Binary Wiring Parameters Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS__REFERRED_BY_BINARY_WIRING_PARAMETERS_REF = WIRING_PARAMETERS_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Binary Wiring Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_FEATURE_COUNT = WIRING_PARAMETERS_FEATURE_COUNT + 11;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = WIRING_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Binary Wiring Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_OPERATION_COUNT = WIRING_PARAMETERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersRefImpl <em>Binary Wiring Parameters Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.BinaryWiringParametersRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getBinaryWiringParametersRef()
     * @generated
     */
    int BINARY_WIRING_PARAMETERS_REF = 16;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__FILENAME = SERVICE_PARAMETERS_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__LINE_NUMBER = SERVICE_PARAMETERS_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__EXPLICIT_LINKS_BUILT = SERVICE_PARAMETERS_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__PARENT_PRIVATE = SERVICE_PARAMETERS_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__TEXT = SERVICE_PARAMETERS_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__ANY = SERVICE_PARAMETERS_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__DESC = SERVICE_PARAMETERS_REF__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__ID = SERVICE_PARAMETERS_REF__ID;

    /**
     * The feature id for the '<em><b>Parent Control Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROL_REF = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Controlling LNode</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__PARENT_CONTROLLING_LNODE = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Source Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__PARENT_SOURCE_REF = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Subscriber LNode</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Refers To Binary Wiring Parameters</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF__REFERS_TO_BINARY_WIRING_PARAMETERS = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Binary Wiring Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF_FEATURE_COUNT = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = SERVICE_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Binary Wiring Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BINARY_WIRING_PARAMETERS_REF_OPERATION_COUNT = SERVICE_PARAMETERS_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CheckoutIDImpl <em>Checkout ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CheckoutIDImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getCheckoutID()
     * @generated
     */
    int CHECKOUT_ID = 17;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__LINE_NUMBER = SclPackage.SCL_FILE_REFERENCE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__EXPLICIT_LINKS_BUILT = SclPackage.SCL_FILE_REFERENCE__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__FILENAME = SclPackage.SCL_FILE_REFERENCE__FILENAME;

    /**
     * The feature id for the '<em><b>Xpath</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__XPATH = SclPackage.SCL_FILE_REFERENCE__XPATH;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__FILE_NAME = SclPackage.SCL_FILE_REFERENCE__FILE_NAME;

    /**
     * The feature id for the '<em><b>File Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__FILE_TYPE = SclPackage.SCL_FILE_REFERENCE__FILE_TYPE;

    /**
     * The feature id for the '<em><b>File Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__FILE_UUID = SclPackage.SCL_FILE_REFERENCE__FILE_UUID;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__REVISION = SclPackage.SCL_FILE_REFERENCE__REVISION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__VERSION = SclPackage.SCL_FILE_REFERENCE__VERSION;

    /**
     * The feature id for the '<em><b>When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__WHEN = SclPackage.SCL_FILE_REFERENCE__WHEN;

    /**
     * The feature id for the '<em><b>Parent Source Files</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__PARENT_SOURCE_FILES = SclPackage.SCL_FILE_REFERENCE__PARENT_SOURCE_FILES;

    /**
     * The feature id for the '<em><b>Parent Application Scl Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__PARENT_APPLICATION_SCL_REF = SclPackage.SCL_FILE_REFERENCE__PARENT_APPLICATION_SCL_REF;

    /**
     * The feature id for the '<em><b>Parent Function Scl Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__PARENT_FUNCTION_SCL_REF = SclPackage.SCL_FILE_REFERENCE__PARENT_FUNCTION_SCL_REF;

    /**
     * The feature id for the '<em><b>Parent IED Source Files</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__PARENT_IED_SOURCE_FILES = SclPackage.SCL_FILE_REFERENCE__PARENT_IED_SOURCE_FILES;

    /**
     * The feature id for the '<em><b>Sub Checkout ID</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__SUB_CHECKOUT_ID = SclPackage.SCL_FILE_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Eng Right</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__ENG_RIGHT = SclPackage.SCL_FILE_REFERENCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Header Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID__HEADER_ID = SclPackage.SCL_FILE_REFERENCE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Checkout ID</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID_FEATURE_COUNT = SclPackage.SCL_FILE_REFERENCE_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = SclPackage.SCL_FILE_REFERENCE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Checkout ID</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKOUT_ID_OPERATION_COUNT = SclPackage.SCL_FILE_REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LinkFCDRefImpl <em>Link FCD Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LinkFCDRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getLinkFCDRef()
     * @generated
     */
    int LINK_FCD_REF = 46;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__ORIGIN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>PDO</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__PDO = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>PLN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__PLN = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Resource Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__RESOURCE_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Resource Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__RESOURCE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__TEMPLATE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Link FCD Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Link FCD Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCD_REF_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl <em>Control Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getControlRef()
     * @generated
     */
    int CONTROL_REF = 18;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__FILENAME = LINK_FCD_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__LINE_NUMBER = LINK_FCD_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__EXPLICIT_LINKS_BUILT = LINK_FCD_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__PARENT_PRIVATE = LINK_FCD_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__TEXT = LINK_FCD_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__ANY = LINK_FCD_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__DESC = LINK_FCD_REF__DESC;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__ORIGIN_UUID = LINK_FCD_REF__ORIGIN_UUID;

    /**
     * The feature id for the '<em><b>PDO</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__PDO = LINK_FCD_REF__PDO;

    /**
     * The feature id for the '<em><b>PLN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__PLN = LINK_FCD_REF__PLN;

    /**
     * The feature id for the '<em><b>Resource Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__RESOURCE_NAME = LINK_FCD_REF__RESOURCE_NAME;

    /**
     * The feature id for the '<em><b>Resource Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__RESOURCE_UUID = LINK_FCD_REF__RESOURCE_UUID;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__TEMPLATE_UUID = LINK_FCD_REF__TEMPLATE_UUID;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__UUID = LINK_FCD_REF__UUID;

    /**
     * The feature id for the '<em><b>Binary Wiring Parameters Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__BINARY_WIRING_PARAMETERS_REF = LINK_FCD_REF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Analogue Wiring Parameters Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__ANALOGUE_WIRING_PARAMETERS_REF = LINK_FCD_REF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Controlled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__CONTROLLED = LINK_FCD_REF_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Controlled Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__CONTROLLED_DO_NAME = LINK_FCD_REF_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Controlled LNode Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__CONTROLLED_LNODE_UUID = LINK_FCD_REF_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Ext Ctrl Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__EXT_CTRL_ADDR = LINK_FCD_REF_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Ext Ctrl Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__EXT_CTRL_UUID = LINK_FCD_REF_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__OUTPUT = LINK_FCD_REF_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Output Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__OUTPUT_INST = LINK_FCD_REF_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Parent LNode Outputs</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__PARENT_LNODE_OUTPUTS = LINK_FCD_REF_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Referred By LNode Output Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__REFERRED_BY_LNODE_OUTPUT_REF = LINK_FCD_REF_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Refers To Controlling LNode</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__REFERS_TO_CONTROLLING_LNODE = LINK_FCD_REF_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Refers To Process Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__REFERS_TO_PROCESS_RESOURCE = LINK_FCD_REF_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Referred By Output Var</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__REFERRED_BY_OUTPUT_VAR = LINK_FCD_REF_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Refers To LNode</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF__REFERS_TO_LNODE = LINK_FCD_REF_FEATURE_COUNT + 14;

    /**
     * The number of structural features of the '<em>Control Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF_FEATURE_COUNT = LINK_FCD_REF_FEATURE_COUNT + 15;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = LINK_FCD_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Control Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_REF_OPERATION_COUNT = LINK_FCD_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CommParametersImpl <em>Comm Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CommParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getCommParameters()
     * @generated
     */
    int COMM_PARAMETERS = 19;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>App Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS__APP_ID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Vlan Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS__VLAN_ID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Vlan Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS__VLAN_PRIORITY = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Comm Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Comm Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PARAMETERS_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CommServiceSpecificationsImpl <em>Comm Service Specifications</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.CommServiceSpecificationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getCommServiceSpecifications()
     * @generated
     */
    int COMM_SERVICE_SPECIFICATIONS = 20;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Goose Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>SMV Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS__SMV_PARAMETERS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Report Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS__REPORT_PARAMETERS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Comm Service Specifications</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Comm Service Specifications</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_SERVICE_SPECIFICATIONS_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlBlockParametersImpl <em>Control Block Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControlBlockParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getControlBlockParameters()
     * @generated
     */
    int CONTROL_BLOCK_PARAMETERS = 21;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS__FILENAME = SERVICE_PARAMETERS__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS__LINE_NUMBER = SERVICE_PARAMETERS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS__EXPLICIT_LINKS_BUILT = SERVICE_PARAMETERS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS__PARENT_PRIVATE = SERVICE_PARAMETERS__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS__TEXT = SERVICE_PARAMETERS__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS__ANY = SERVICE_PARAMETERS__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS__DESC = SERVICE_PARAMETERS__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS__ID = SERVICE_PARAMETERS__ID;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS__CB_NAME = SERVICE_PARAMETERS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ds Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS__DS_NAME = SERVICE_PARAMETERS_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Control Block Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT = SERVICE_PARAMETERS_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = SERVICE_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Control Block Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_PARAMETERS_OPERATION_COUNT = SERVICE_PARAMETERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl <em>Controlling LNode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ControllingLNodeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getControllingLNode()
     * @generated
     */
    int CONTROLLING_LNODE = 22;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Binary Wiring Parameters Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__BINARY_WIRING_PARAMETERS_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Analogue Wiring Parameters Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__ANALOGUE_WIRING_PARAMETERS_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Output Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__OUTPUT_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>PLN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__PLN = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Resource Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__RESOURCE_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Resource Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__RESOURCE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Parent DAS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__PARENT_DAS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Parent DOS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__PARENT_DOS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Parent SDS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__PARENT_SDS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Refers To Process Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__REFERS_TO_PROCESS_RESOURCE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Referred By Control Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE__REFERRED_BY_CONTROL_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Controlling LNode</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 11;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Controlling LNode</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROLLING_LNODE_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl <em>DAS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DASImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getDAS()
     * @generated
     */
    int DAS = 23;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Subscriber LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__SUBSCRIBER_LNODE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Controlling LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__CONTROLLING_LNODE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Process Echo</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__PROCESS_ECHO = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Log Parameters Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__LOG_PARAMETERS_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Val</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__VAL = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Labels</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__LABELS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Ix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__IX = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Mapped Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__MAPPED_DA_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Mapped Ln Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__MAPPED_LN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Val Import</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__VAL_IMPORT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Val Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__VAL_KIND = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Parent DOS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__PARENT_DOS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Parent SDS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__PARENT_SDS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Refers To Any LN</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS__REFERS_TO_ANY_LN = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 14;

    /**
     * The number of structural features of the '<em>DAS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 15;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>DAS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAS_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl <em>DOS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.DOSImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getDOS()
     * @generated
     */
    int DOS = 24;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>SDS</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__SDS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>DAS</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__DAS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Subscriber LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__SUBSCRIBER_LNODE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Controlling LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__CONTROLLING_LNODE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Process Echo</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__PROCESS_ECHO = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Log Parameters Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__LOG_PARAMETERS_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Labels</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__LABELS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Mapped Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__MAPPED_DO_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Mapped Ln Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__MAPPED_LN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Refers To Any LN</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS__REFERS_TO_ANY_LN = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>DOS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 11;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>DOS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOS_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryImpl <em>Function Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionCategory()
     * @generated
     */
    int FUNCTION_CATEGORY = 25;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Sub Category</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__SUB_CATEGORY = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Function Cat Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__FUNCTION_CAT_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__ORIGIN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__TEMPLATE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Referred By Function Category Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Function Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Function Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryRefImpl <em>Function Category Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCategoryRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionCategoryRef()
     * @generated
     */
    int FUNCTION_CATEGORY_REF = 26;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Function Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Function Category Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__FUNCTION_CATEGORY_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Function Role Content</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__PARENT_FUNCTION_ROLE_CONTENT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Function Category</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF__REFERS_TO_FUNCTION_CATEGORY = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Function Category Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Function Category Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CATEGORY_REF_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCatRefImpl <em>Function Cat Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionCatRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionCatRef()
     * @generated
     */
    int FUNCTION_CAT_REF = 27;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF__FILENAME = BASE_EXTENSION_ELEMENT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF__LINE_NUMBER = BASE_EXTENSION_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF__TEXT = BASE_EXTENSION_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF__ANY = BASE_EXTENSION_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF__FUNCTION = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Function Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF__FUNCTION_UUID = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Function Category</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF__PARENT_FUNCTION_CATEGORY = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Function</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF__REFERS_TO_FUNCTION = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Function Cat Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Function Cat Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_CAT_REF_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRefImpl <em>Function Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionRef()
     * @generated
     */
    int FUNCTION_REF = 28;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Signal Role</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__SIGNAL_ROLE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__FUNCTION = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Function Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__FUNCTION_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Allocation Role</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__PARENT_ALLOCATION_ROLE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Function Role Content</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__PARENT_FUNCTION_ROLE_CONTENT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Refers To Function</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF__REFERS_TO_FUNCTION = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Function Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Function Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_REF_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl <em>Function Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionRole()
     * @generated
     */
    int FUNCTION_ROLE = 29;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Function Role Content</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__FUNCTION_ROLE_CONTENT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__CARDINALITY = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__MAX = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__NAME = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__ORIGIN_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__SELECTOR = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__TEMPLATE_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__TYPE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Parent Application</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE__PARENT_APPLICATION = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Function Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 10;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Function Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleContentImpl <em>Function Role Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionRoleContentImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionRoleContent()
     * @generated
     */
    int FUNCTION_ROLE_CONTENT = 30;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__FILENAME = BASE_EXTENSION_ELEMENT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__LINE_NUMBER = BASE_EXTENSION_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__TEXT = BASE_EXTENSION_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__ANY = BASE_EXTENSION_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Function Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__FUNCTION_REF = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Behavior Description Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__BEHAVIOR_DESCRIPTION_REF = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Process Resource Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__PROCESS_RESOURCE_REF = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Variable Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__VARIABLE_REF = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Function Category Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__FUNCTION_CATEGORY_REF = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Power System Relation Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__POWER_SYSTEM_RELATION_REF = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Role Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__ROLE_INST = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Parent Function Role</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT__PARENT_FUNCTION_ROLE = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Function Role Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Function Role Content</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_ROLE_CONTENT_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionSclRefImpl <em>Function Scl Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionSclRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionSclRef()
     * @generated
     */
    int FUNCTION_SCL_REF = 31;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_SCL_REF__FILENAME = BASE_EXTENSION_ELEMENT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_SCL_REF__LINE_NUMBER = BASE_EXTENSION_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_SCL_REF__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_SCL_REF__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_SCL_REF__TEXT = BASE_EXTENSION_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_SCL_REF__ANY = BASE_EXTENSION_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Scl File Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_SCL_REF__SCL_FILE_REFERENCE = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Function Scl Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_SCL_REF_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_SCL_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Function Scl Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_SCL_REF_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionTemplateImpl <em>Function Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionTemplateImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionTemplate()
     * @generated
     */
    int FUNCTION_TEMPLATE = 32;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__FILENAME = ABSTRACT6100_LNODE_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__LINE_NUMBER = ABSTRACT6100_LNODE_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__EXPLICIT_LINKS_BUILT = ABSTRACT6100_LNODE_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__PARENT_PRIVATE = ABSTRACT6100_LNODE_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__TEXT = ABSTRACT6100_LNODE_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__ANY = ABSTRACT6100_LNODE_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__DESC = ABSTRACT6100_LNODE_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__LNODE = ABSTRACT6100_LNODE_CONTAINER__LNODE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__NAME = ABSTRACT6100_LNODE_CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__ORIGIN_UUID = ABSTRACT6100_LNODE_CONTAINER__ORIGIN_UUID;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__TEMPLATE_UUID = ABSTRACT6100_LNODE_CONTAINER__TEMPLATE_UUID;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__UUID = ABSTRACT6100_LNODE_CONTAINER__UUID;

    /**
     * The feature id for the '<em><b>Sub Function Template</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__SUB_FUNCTION_TEMPLATE = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__GENERAL_EQUIPMENT = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__CONDUCTING_EQUIPMENT = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE__TYPE = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Function Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE_FEATURE_COUNT = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = ABSTRACT6100_LNODE_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Function Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_TEMPLATE_OPERATION_COUNT = ABSTRACT6100_LNODE_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalSubVariantImpl <em>Functional Sub Variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalSubVariantImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionalSubVariant()
     * @generated
     */
    int FUNCTIONAL_SUB_VARIANT = 33;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__FILENAME = ABSTRACT_FUNCTIONAL_VARIANT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__LINE_NUMBER = ABSTRACT_FUNCTIONAL_VARIANT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__EXPLICIT_LINKS_BUILT = ABSTRACT_FUNCTIONAL_VARIANT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__PARENT_PRIVATE = ABSTRACT_FUNCTIONAL_VARIANT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__TEXT = ABSTRACT_FUNCTIONAL_VARIANT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__ANY = ABSTRACT_FUNCTIONAL_VARIANT__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__DESC = ABSTRACT_FUNCTIONAL_VARIANT__DESC;

    /**
     * The feature id for the '<em><b>Functional Sub Variant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__FUNCTIONAL_SUB_VARIANT = ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT;

    /**
     * The feature id for the '<em><b>Variable Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__VARIABLE_REF = ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF;

    /**
     * The feature id for the '<em><b>Is Baseline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__IS_BASELINE = ABSTRACT_FUNCTIONAL_VARIANT__IS_BASELINE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__NAME = ABSTRACT_FUNCTIONAL_VARIANT__NAME;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__ORIGIN_UUID = ABSTRACT_FUNCTIONAL_VARIANT__ORIGIN_UUID;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__TEMPLATE_UUID = ABSTRACT_FUNCTIONAL_VARIANT__TEMPLATE_UUID;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__UUID = ABSTRACT_FUNCTIONAL_VARIANT__UUID;

    /**
     * The feature id for the '<em><b>Parent Abstract Functional Variant</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT__PARENT_ABSTRACT_FUNCTIONAL_VARIANT = ABSTRACT_FUNCTIONAL_VARIANT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Functional Sub Variant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT_FEATURE_COUNT = ABSTRACT_FUNCTIONAL_VARIANT_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = ABSTRACT_FUNCTIONAL_VARIANT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Functional Sub Variant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_SUB_VARIANT_OPERATION_COUNT = ABSTRACT_FUNCTIONAL_VARIANT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantImpl <em>Functional Variant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionalVariant()
     * @generated
     */
    int FUNCTIONAL_VARIANT = 34;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__FILENAME = ABSTRACT_FUNCTIONAL_VARIANT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__LINE_NUMBER = ABSTRACT_FUNCTIONAL_VARIANT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__EXPLICIT_LINKS_BUILT = ABSTRACT_FUNCTIONAL_VARIANT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__PARENT_PRIVATE = ABSTRACT_FUNCTIONAL_VARIANT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__TEXT = ABSTRACT_FUNCTIONAL_VARIANT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__ANY = ABSTRACT_FUNCTIONAL_VARIANT__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__DESC = ABSTRACT_FUNCTIONAL_VARIANT__DESC;

    /**
     * The feature id for the '<em><b>Functional Sub Variant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT = ABSTRACT_FUNCTIONAL_VARIANT__FUNCTIONAL_SUB_VARIANT;

    /**
     * The feature id for the '<em><b>Variable Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__VARIABLE_REF = ABSTRACT_FUNCTIONAL_VARIANT__VARIABLE_REF;

    /**
     * The feature id for the '<em><b>Is Baseline</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__IS_BASELINE = ABSTRACT_FUNCTIONAL_VARIANT__IS_BASELINE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__NAME = ABSTRACT_FUNCTIONAL_VARIANT__NAME;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__ORIGIN_UUID = ABSTRACT_FUNCTIONAL_VARIANT__ORIGIN_UUID;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__TEMPLATE_UUID = ABSTRACT_FUNCTIONAL_VARIANT__TEMPLATE_UUID;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__UUID = ABSTRACT_FUNCTIONAL_VARIANT__UUID;

    /**
     * The feature id for the '<em><b>Parent Application</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__PARENT_APPLICATION = ABSTRACT_FUNCTIONAL_VARIANT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Functional Variant Group</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__PARENT_FUNCTIONAL_VARIANT_GROUP = ABSTRACT_FUNCTIONAL_VARIANT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Referred By Functional Variant Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT__REFERRED_BY_FUNCTIONAL_VARIANT_REF = ABSTRACT_FUNCTIONAL_VARIANT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Functional Variant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_FEATURE_COUNT = ABSTRACT_FUNCTIONAL_VARIANT_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = ABSTRACT_FUNCTIONAL_VARIANT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Functional Variant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_OPERATION_COUNT = ABSTRACT_FUNCTIONAL_VARIANT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantGroupImpl <em>Functional Variant Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantGroupImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionalVariantGroup()
     * @generated
     */
    int FUNCTIONAL_VARIANT_GROUP = 35;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__FUNCTIONAL_VARIANT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__ORIGIN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__TEMPLATE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Application</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP__PARENT_APPLICATION = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Functional Variant Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Functional Variant Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_GROUP_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantRefImpl <em>Functional Variant Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.FunctionalVariantRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getFunctionalVariantRef()
     * @generated
     */
    int FUNCTIONAL_VARIANT_REF = 36;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF__FILENAME = BASE_EXTENSION_ELEMENT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF__LINE_NUMBER = BASE_EXTENSION_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF__TEXT = BASE_EXTENSION_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF__ANY = BASE_EXTENSION_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Functional Variant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Functional Variant Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF__FUNCTIONAL_VARIANT_UUID = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Update</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF__UPDATE = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Functional Variant Ref Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF__PARENT_FUNCTIONAL_VARIANT_REF_CONTAINER = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Refers To Functional Variant</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF__REFERS_TO_FUNCTIONAL_VARIANT = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Functional Variant Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Functional Variant Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTIONAL_VARIANT_REF_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl <em>Goose Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getGooseParameters()
     * @generated
     */
    int GOOSE_PARAMETERS = 38;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__FILENAME = CONTROL_BLOCK_PARAMETERS__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__LINE_NUMBER = CONTROL_BLOCK_PARAMETERS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__EXPLICIT_LINKS_BUILT = CONTROL_BLOCK_PARAMETERS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__PARENT_PRIVATE = CONTROL_BLOCK_PARAMETERS__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__TEXT = CONTROL_BLOCK_PARAMETERS__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__ANY = CONTROL_BLOCK_PARAMETERS__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__DESC = CONTROL_BLOCK_PARAMETERS__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__ID = CONTROL_BLOCK_PARAMETERS__ID;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__CB_NAME = CONTROL_BLOCK_PARAMETERS__CB_NAME;

    /**
     * The feature id for the '<em><b>Ds Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__DS_NAME = CONTROL_BLOCK_PARAMETERS__DS_NAME;

    /**
     * The feature id for the '<em><b>L2 Comm Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__L2_COMM_PARAMETERS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>L3I Pv4 Comm Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__L3I_PV4_COMM_PARAMETERS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>L3I Pv6 Comm Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__L3I_PV6_COMM_PARAMETERS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Go Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__GO_ID = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Max Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__MAX_TIME = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Min Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__MIN_TIME = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__SECURITY_ENABLED = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Parent Comm Service Specifications</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Parent Service Specifications</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Referred By Goose Parameters Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS__REFERRED_BY_GOOSE_PARAMETERS_REF = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Goose Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_FEATURE_COUNT = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 10;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = CONTROL_BLOCK_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Goose Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_OPERATION_COUNT = CONTROL_BLOCK_PARAMETERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersRefImpl <em>Goose Parameters Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.GooseParametersRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getGooseParametersRef()
     * @generated
     */
    int GOOSE_PARAMETERS_REF = 39;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF__FILENAME = SERVICE_PARAMETERS_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF__LINE_NUMBER = SERVICE_PARAMETERS_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF__EXPLICIT_LINKS_BUILT = SERVICE_PARAMETERS_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF__PARENT_PRIVATE = SERVICE_PARAMETERS_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF__TEXT = SERVICE_PARAMETERS_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF__ANY = SERVICE_PARAMETERS_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF__DESC = SERVICE_PARAMETERS_REF__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF__ID = SERVICE_PARAMETERS_REF__ID;

    /**
     * The feature id for the '<em><b>Parent Subscriber LNode</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Source Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF__PARENT_SOURCE_REF = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Refers To Goose Parameters</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF__REFERS_TO_GOOSE_PARAMETERS = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Goose Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF_FEATURE_COUNT = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = SERVICE_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Goose Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_PARAMETERS_REF_OPERATION_COUNT = SERVICE_PARAMETERS_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogicVarRefImpl <em>Logic Var Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogicVarRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getLogicVarRef()
     * @generated
     */
    int LOGIC_VAR_REF = 55;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__DA_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__DATA_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__DO_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Lnode Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__LNODE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__VALUE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Var Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__VAR_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Refers To LNode</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF__REFERS_TO_LNODE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Logic Var Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Logic Var Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOGIC_VAR_REF_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.InputVarImpl <em>Input Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.InputVarImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getInputVar()
     * @generated
     */
    int INPUT_VAR = 40;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__FILENAME = LOGIC_VAR_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__LINE_NUMBER = LOGIC_VAR_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__EXPLICIT_LINKS_BUILT = LOGIC_VAR_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__PARENT_PRIVATE = LOGIC_VAR_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__TEXT = LOGIC_VAR_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__ANY = LOGIC_VAR_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__DESC = LOGIC_VAR_REF__DESC;

    /**
     * The feature id for the '<em><b>Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__DA_NAME = LOGIC_VAR_REF__DA_NAME;

    /**
     * The feature id for the '<em><b>Data Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__DATA_NAME = LOGIC_VAR_REF__DATA_NAME;

    /**
     * The feature id for the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__DO_NAME = LOGIC_VAR_REF__DO_NAME;

    /**
     * The feature id for the '<em><b>Lnode Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__LNODE_UUID = LOGIC_VAR_REF__LNODE_UUID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__VALUE = LOGIC_VAR_REF__VALUE;

    /**
     * The feature id for the '<em><b>Var Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__VAR_NAME = LOGIC_VAR_REF__VAR_NAME;

    /**
     * The feature id for the '<em><b>Refers To LNode</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__REFERS_TO_LNODE = LOGIC_VAR_REF__REFERS_TO_LNODE;

    /**
     * The feature id for the '<em><b>Input Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__INPUT_NAME = LOGIC_VAR_REF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Input Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__INPUT_UUID = LOGIC_VAR_REF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Refers To Source Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__REFERS_TO_SOURCE_REF = LOGIC_VAR_REF_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Behavior Description</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION = LOGIC_VAR_REF_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Input Var</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_FEATURE_COUNT = LOGIC_VAR_REF_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = LOGIC_VAR_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Input Var</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_OPERATION_COUNT = LOGIC_VAR_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableRefImpl <em>Variable Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getVariableRef()
     * @generated
     */
    int VARIABLE_REF = 84;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__VALUE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__VARIABLE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Variable Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__VARIABLE_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Abstract Functional Variant</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Function Role Content</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Refers To Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF__REFERS_TO_VARIABLE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Variable Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Variable Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_REF_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.InputVarRefImpl <em>Input Var Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.InputVarRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getInputVarRef()
     * @generated
     */
    int INPUT_VAR_REF = 41;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__FILENAME = VARIABLE_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__LINE_NUMBER = VARIABLE_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__EXPLICIT_LINKS_BUILT = VARIABLE_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__PARENT_PRIVATE = VARIABLE_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__TEXT = VARIABLE_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__ANY = VARIABLE_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__DESC = VARIABLE_REF__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__FUNCTIONAL_VARIANT_REF = VARIABLE_REF__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__VALUE = VARIABLE_REF__VALUE;

    /**
     * The feature id for the '<em><b>Variable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__VARIABLE = VARIABLE_REF__VARIABLE;

    /**
     * The feature id for the '<em><b>Variable Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__VARIABLE_UUID = VARIABLE_REF__VARIABLE_UUID;

    /**
     * The feature id for the '<em><b>Parent Abstract Functional Variant</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT = VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT;

    /**
     * The feature id for the '<em><b>Parent Function Role Content</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__PARENT_FUNCTION_ROLE_CONTENT = VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT;

    /**
     * The feature id for the '<em><b>Refers To Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__REFERS_TO_VARIABLE = VARIABLE_REF__REFERS_TO_VARIABLE;

    /**
     * The feature id for the '<em><b>Parent Behavior Description Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF = VARIABLE_REF_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Input Var Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF_FEATURE_COUNT = VARIABLE_REF_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = VARIABLE_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Input Var Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_VAR_REF_OPERATION_COUNT = VARIABLE_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L2CommParametersImpl <em>L2 Comm Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L2CommParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getL2CommParameters()
     * @generated
     */
    int L2_COMM_PARAMETERS = 42;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__FILENAME = COMM_PARAMETERS__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__LINE_NUMBER = COMM_PARAMETERS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__EXPLICIT_LINKS_BUILT = COMM_PARAMETERS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__PARENT_PRIVATE = COMM_PARAMETERS__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__TEXT = COMM_PARAMETERS__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__ANY = COMM_PARAMETERS__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__DESC = COMM_PARAMETERS__DESC;

    /**
     * The feature id for the '<em><b>App Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__APP_ID = COMM_PARAMETERS__APP_ID;

    /**
     * The feature id for the '<em><b>Vlan Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__VLAN_ID = COMM_PARAMETERS__VLAN_ID;

    /**
     * The feature id for the '<em><b>Vlan Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__VLAN_PRIORITY = COMM_PARAMETERS__VLAN_PRIORITY;

    /**
     * The feature id for the '<em><b>Mac Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__MAC_ADDR = COMM_PARAMETERS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Goose Parameters</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS = COMM_PARAMETERS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent SMV Parameters</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS__PARENT_SMV_PARAMETERS = COMM_PARAMETERS_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>L2 Comm Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS_FEATURE_COUNT = COMM_PARAMETERS_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = COMM_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>L2 Comm Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L2_COMM_PARAMETERS_OPERATION_COUNT = COMM_PARAMETERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L3IPv4CommParametersImpl <em>L3I Pv4 Comm Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L3IPv4CommParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getL3IPv4CommParameters()
     * @generated
     */
    int L3I_PV4_COMM_PARAMETERS = 43;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__FILENAME = COMM_PARAMETERS__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__LINE_NUMBER = COMM_PARAMETERS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__EXPLICIT_LINKS_BUILT = COMM_PARAMETERS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__PARENT_PRIVATE = COMM_PARAMETERS__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__TEXT = COMM_PARAMETERS__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__ANY = COMM_PARAMETERS__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__DESC = COMM_PARAMETERS__DESC;

    /**
     * The feature id for the '<em><b>App Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__APP_ID = COMM_PARAMETERS__APP_ID;

    /**
     * The feature id for the '<em><b>Vlan Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__VLAN_ID = COMM_PARAMETERS__VLAN_ID;

    /**
     * The feature id for the '<em><b>Vlan Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__VLAN_PRIORITY = COMM_PARAMETERS__VLAN_PRIORITY;

    /**
     * The feature id for the '<em><b>IPv4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__IPV4 = COMM_PARAMETERS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>IPv4 IGM Pv3 Src</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__IPV4_IGM_PV3_SRC = COMM_PARAMETERS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Goose Parameters</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS = COMM_PARAMETERS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent SMV Parameters</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS__PARENT_SMV_PARAMETERS = COMM_PARAMETERS_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>L3I Pv4 Comm Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS_FEATURE_COUNT = COMM_PARAMETERS_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = COMM_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>L3I Pv4 Comm Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV4_COMM_PARAMETERS_OPERATION_COUNT = COMM_PARAMETERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L3IPv6CommParametersImpl <em>L3I Pv6 Comm Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.L3IPv6CommParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getL3IPv6CommParameters()
     * @generated
     */
    int L3I_PV6_COMM_PARAMETERS = 44;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__FILENAME = COMM_PARAMETERS__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__LINE_NUMBER = COMM_PARAMETERS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__EXPLICIT_LINKS_BUILT = COMM_PARAMETERS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__PARENT_PRIVATE = COMM_PARAMETERS__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__TEXT = COMM_PARAMETERS__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__ANY = COMM_PARAMETERS__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__DESC = COMM_PARAMETERS__DESC;

    /**
     * The feature id for the '<em><b>App Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__APP_ID = COMM_PARAMETERS__APP_ID;

    /**
     * The feature id for the '<em><b>Vlan Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__VLAN_ID = COMM_PARAMETERS__VLAN_ID;

    /**
     * The feature id for the '<em><b>Vlan Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__VLAN_PRIORITY = COMM_PARAMETERS__VLAN_PRIORITY;

    /**
     * The feature id for the '<em><b>IPv6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__IPV6 = COMM_PARAMETERS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>IPv6 IGM Pv3 Src</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__IPV6_IGM_PV3_SRC = COMM_PARAMETERS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Goose Parameters</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__PARENT_GOOSE_PARAMETERS = COMM_PARAMETERS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent SMV Parameters</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS__PARENT_SMV_PARAMETERS = COMM_PARAMETERS_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>L3I Pv6 Comm Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS_FEATURE_COUNT = COMM_PARAMETERS_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = COMM_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>L3I Pv6 Comm Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int L3I_PV6_COMM_PARAMETERS_OPERATION_COUNT = COMM_PARAMETERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LinkFCDARefImpl <em>Link FCDA Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LinkFCDARefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getLinkFCDARef()
     * @generated
     */
    int LINK_FCDA_REF = 45;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__FILENAME = LINK_FCD_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__LINE_NUMBER = LINK_FCD_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__EXPLICIT_LINKS_BUILT = LINK_FCD_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__PARENT_PRIVATE = LINK_FCD_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__TEXT = LINK_FCD_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__ANY = LINK_FCD_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__DESC = LINK_FCD_REF__DESC;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__ORIGIN_UUID = LINK_FCD_REF__ORIGIN_UUID;

    /**
     * The feature id for the '<em><b>PDO</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__PDO = LINK_FCD_REF__PDO;

    /**
     * The feature id for the '<em><b>PLN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__PLN = LINK_FCD_REF__PLN;

    /**
     * The feature id for the '<em><b>Resource Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__RESOURCE_NAME = LINK_FCD_REF__RESOURCE_NAME;

    /**
     * The feature id for the '<em><b>Resource Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__RESOURCE_UUID = LINK_FCD_REF__RESOURCE_UUID;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__TEMPLATE_UUID = LINK_FCD_REF__TEMPLATE_UUID;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__UUID = LINK_FCD_REF__UUID;

    /**
     * The feature id for the '<em><b>PDA</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF__PDA = LINK_FCD_REF_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Link FCDA Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF_FEATURE_COUNT = LINK_FCD_REF_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = LINK_FCD_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Link FCDA Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FCDA_REF_OPERATION_COUNT = LINK_FCD_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeDataRefImpl <em>LNode Data Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeDataRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getLNodeDataRef()
     * @generated
     */
    int LNODE_DATA_REF = 47;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__DA_NAME = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__DATA = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__DO_NAME = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Lnode Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__LNODE_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Refers To LNode</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__REFERS_TO_LNODE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Signal Role</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF__PARENT_SIGNAL_ROLE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>LNode Data Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>LNode Data Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_DATA_REF_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeInputRefImpl <em>LNode Input Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeInputRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getLNodeInputRef()
     * @generated
     */
    int LNODE_INPUT_REF = 48;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__SOURCE_REF = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source Ref Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__SOURCE_REF_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Refers To Source Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__REFERS_TO_SOURCE_REF = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Signal Role</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF__PARENT_SIGNAL_ROLE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>LNode Input Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>LNode Input Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUT_REF_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeInputsImpl <em>LNode Inputs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeInputsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getLNodeInputs()
     * @generated
     */
    int LNODE_INPUTS = 49;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUTS__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUTS__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUTS__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUTS__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUTS__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUTS__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUTS__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Source Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUTS__SOURCE_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>LNode Inputs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUTS_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUTS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>LNode Inputs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_INPUTS_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeOutputRefImpl <em>LNode Output Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeOutputRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getLNodeOutputRef()
     * @generated
     */
    int LNODE_OUTPUT_REF = 50;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Control Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__CONTROL_REF = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Control Ref Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__CONTROL_REF_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Refers To Control Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__REFERS_TO_CONTROL_REF = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Signal Role</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF__PARENT_SIGNAL_ROLE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>LNode Output Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>LNode Output Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUT_REF_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeOutputsImpl <em>LNode Outputs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeOutputsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getLNodeOutputs()
     * @generated
     */
    int LNODE_OUTPUTS = 51;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUTS__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUTS__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUTS__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUTS__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUTS__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUTS__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUTS__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Control Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUTS__CONTROL_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>LNode Outputs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUTS_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUTS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>LNode Outputs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OUTPUTS_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeSpecNamingImpl <em>LNode Spec Naming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LNodeSpecNamingImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getLNodeSpecNaming()
     * @generated
     */
    int LNODE_SPEC_NAMING = 52;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING__FILENAME = BASE_EXTENSION_ELEMENT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING__LINE_NUMBER = BASE_EXTENSION_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING__TEXT = BASE_EXTENSION_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING__ANY = BASE_EXTENSION_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>SIed Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING__SIED_NAME = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>SLd Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING__SLD_INST = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>SLn Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING__SLN_CLASS = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>SLn Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING__SLN_INST = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>SPrefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING__SPREFIX = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>LNode Spec Naming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>LNode Spec Naming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_SPEC_NAMING_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl <em>Log Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getLogParameters()
     * @generated
     */
    int LOG_PARAMETERS = 53;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__FILENAME = CONTROL_BLOCK_PARAMETERS__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__LINE_NUMBER = CONTROL_BLOCK_PARAMETERS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__EXPLICIT_LINKS_BUILT = CONTROL_BLOCK_PARAMETERS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__PARENT_PRIVATE = CONTROL_BLOCK_PARAMETERS__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__TEXT = CONTROL_BLOCK_PARAMETERS__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__ANY = CONTROL_BLOCK_PARAMETERS__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__DESC = CONTROL_BLOCK_PARAMETERS__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__ID = CONTROL_BLOCK_PARAMETERS__ID;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__CB_NAME = CONTROL_BLOCK_PARAMETERS__CB_NAME;

    /**
     * The feature id for the '<em><b>Ds Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__DS_NAME = CONTROL_BLOCK_PARAMETERS__DS_NAME;

    /**
     * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__INTG_PD = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Log Ena</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__LOG_ENA = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Log Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__LOG_LD_INST = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Log Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__LOG_LN_CLASS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Log Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__LOG_LN_INST = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Log Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__LOG_NAME = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Log Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__LOG_PREFIX = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Reason Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__REASON_CODE = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Parent Service Specifications</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Referred By Log Parameters Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS__REFERRED_BY_LOG_PARAMETERS_REF = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Log Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_FEATURE_COUNT = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 10;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = CONTROL_BLOCK_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Log Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_OPERATION_COUNT = CONTROL_BLOCK_PARAMETERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersRefImpl <em>Log Parameters Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.LogParametersRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getLogParametersRef()
     * @generated
     */
    int LOG_PARAMETERS_REF = 54;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__FILENAME = SERVICE_PARAMETERS_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__LINE_NUMBER = SERVICE_PARAMETERS_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__EXPLICIT_LINKS_BUILT = SERVICE_PARAMETERS_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__PARENT_PRIVATE = SERVICE_PARAMETERS_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__TEXT = SERVICE_PARAMETERS_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__ANY = SERVICE_PARAMETERS_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__DESC = SERVICE_PARAMETERS_REF__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__ID = SERVICE_PARAMETERS_REF__ID;

    /**
     * The feature id for the '<em><b>Refers To Log Parameters</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__REFERS_TO_LOG_PARAMETERS = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent DAS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__PARENT_DAS = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent DOS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__PARENT_DOS = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent SDS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF__PARENT_SDS = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Log Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF_FEATURE_COUNT = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = SERVICE_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Log Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_PARAMETERS_REF_OPERATION_COUNT = SERVICE_PARAMETERS_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.OutputVarImpl <em>Output Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.OutputVarImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getOutputVar()
     * @generated
     */
    int OUTPUT_VAR = 56;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__FILENAME = LOGIC_VAR_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__LINE_NUMBER = LOGIC_VAR_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__EXPLICIT_LINKS_BUILT = LOGIC_VAR_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__PARENT_PRIVATE = LOGIC_VAR_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__TEXT = LOGIC_VAR_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__ANY = LOGIC_VAR_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__DESC = LOGIC_VAR_REF__DESC;

    /**
     * The feature id for the '<em><b>Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__DA_NAME = LOGIC_VAR_REF__DA_NAME;

    /**
     * The feature id for the '<em><b>Data Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__DATA_NAME = LOGIC_VAR_REF__DATA_NAME;

    /**
     * The feature id for the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__DO_NAME = LOGIC_VAR_REF__DO_NAME;

    /**
     * The feature id for the '<em><b>Lnode Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__LNODE_UUID = LOGIC_VAR_REF__LNODE_UUID;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__VALUE = LOGIC_VAR_REF__VALUE;

    /**
     * The feature id for the '<em><b>Var Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__VAR_NAME = LOGIC_VAR_REF__VAR_NAME;

    /**
     * The feature id for the '<em><b>Refers To LNode</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__REFERS_TO_LNODE = LOGIC_VAR_REF__REFERS_TO_LNODE;

    /**
     * The feature id for the '<em><b>Output Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__OUTPUT_NAME = LOGIC_VAR_REF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Output Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__OUTPUT_UUID = LOGIC_VAR_REF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Refers To Control Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__REFERS_TO_CONTROL_REF = LOGIC_VAR_REF_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Behavior Description</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR__PARENT_BEHAVIOR_DESCRIPTION = LOGIC_VAR_REF_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Output Var</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_FEATURE_COUNT = LOGIC_VAR_REF_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = LOGIC_VAR_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Output Var</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_OPERATION_COUNT = LOGIC_VAR_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.OutputVarRefImpl <em>Output Var Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.OutputVarRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getOutputVarRef()
     * @generated
     */
    int OUTPUT_VAR_REF = 57;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__FILENAME = VARIABLE_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__LINE_NUMBER = VARIABLE_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__EXPLICIT_LINKS_BUILT = VARIABLE_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__PARENT_PRIVATE = VARIABLE_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__TEXT = VARIABLE_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__ANY = VARIABLE_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__DESC = VARIABLE_REF__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__FUNCTIONAL_VARIANT_REF = VARIABLE_REF__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__VALUE = VARIABLE_REF__VALUE;

    /**
     * The feature id for the '<em><b>Variable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__VARIABLE = VARIABLE_REF__VARIABLE;

    /**
     * The feature id for the '<em><b>Variable Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__VARIABLE_UUID = VARIABLE_REF__VARIABLE_UUID;

    /**
     * The feature id for the '<em><b>Parent Abstract Functional Variant</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT = VARIABLE_REF__PARENT_ABSTRACT_FUNCTIONAL_VARIANT;

    /**
     * The feature id for the '<em><b>Parent Function Role Content</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__PARENT_FUNCTION_ROLE_CONTENT = VARIABLE_REF__PARENT_FUNCTION_ROLE_CONTENT;

    /**
     * The feature id for the '<em><b>Refers To Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__REFERS_TO_VARIABLE = VARIABLE_REF__REFERS_TO_VARIABLE;

    /**
     * The feature id for the '<em><b>Parent Behavior Description Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF__PARENT_BEHAVIOR_DESCRIPTION_REF = VARIABLE_REF_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Output Var Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF_FEATURE_COUNT = VARIABLE_REF_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = VARIABLE_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Output Var Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_VAR_REF_OPERATION_COUNT = VARIABLE_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationImpl <em>Power System Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getPowerSystemRelation()
     * @generated
     */
    int POWER_SYSTEM_RELATION = 58;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__ORIGIN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Relation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__RELATION = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Relation Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__RELATION_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__SELECTOR = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__TEMPLATE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Parent Power System Relation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__PARENT_POWER_SYSTEM_RELATION = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Referred By Power System Relation Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION__REFERRED_BY_POWER_SYSTEM_RELATION_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT
            + 8;

    /**
     * The number of structural features of the '<em>Power System Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 9;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Power System Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationRefImpl <em>Power System Relation Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getPowerSystemRelationRef()
     * @generated
     */
    int POWER_SYSTEM_RELATION_REF = 59;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Power System Relation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Power System Relation Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__POWER_SYSTEM_RELATION_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Function Role Content</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__PARENT_FUNCTION_ROLE_CONTENT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Power System Relation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF__REFERS_TO_POWER_SYSTEM_RELATION = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Power System Relation Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Power System Relation Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATION_REF_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationsImpl <em>Power System Relations</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.PowerSystemRelationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getPowerSystemRelations()
     * @generated
     */
    int POWER_SYSTEM_RELATIONS = 60;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATIONS__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATIONS__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATIONS__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATIONS__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATIONS__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATIONS__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATIONS__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Power System Relation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATIONS__POWER_SYSTEM_RELATION = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Power System Relations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATIONS_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATIONS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Power System Relations</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RELATIONS_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessEchoImpl <em>Process Echo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessEchoImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getProcessEcho()
     * @generated
     */
    int PROCESS_ECHO = 61;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__SOURCE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Source Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__SOURCE_DA_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Source Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__SOURCE_DO_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Source LNode Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__SOURCE_LNODE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent DAS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__PARENT_DAS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent DOS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__PARENT_DOS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Parent SDS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__PARENT_SDS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Refers To LNode</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO__REFERS_TO_LNODE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Process Echo</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 8;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Process Echo</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_ECHO_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl <em>Process Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getProcessResource()
     * @generated
     */
    int PROCESS_RESOURCE = 62;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__RESOURCE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__CARDINALITY = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__MAX = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__ORIGIN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Selector</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__SELECTOR = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__TEMPLATE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Parent Process Resources</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__PARENT_PROCESS_RESOURCES = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Referred By Process Resource Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__REFERRED_BY_PROCESS_RESOURCE_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Referred By Controlling LNode</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__REFERRED_BY_CONTROLLING_LNODE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Referred By Subscriber LNode</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__REFERRED_BY_SUBSCRIBER_LNODE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Referred By Control Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__REFERRED_BY_CONTROL_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Referredby Source Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE__REFERREDBY_SOURCE_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Process Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 14;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Process Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceRefImpl <em>Process Resource Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourceRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getProcessResourceRef()
     * @generated
     */
    int PROCESS_RESOURCE_REF = 63;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Process Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__PROCESS_RESOURCE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Process Resource Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__PROCESS_RESOURCE_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Function Role Content</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__PARENT_FUNCTION_ROLE_CONTENT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Process Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF__REFERS_TO_PROCESS_RESOURCE = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Process Resource Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Process Resource Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCE_REF_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourcesImpl <em>Process Resources</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProcessResourcesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getProcessResources()
     * @generated
     */
    int PROCESS_RESOURCES = 64;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCES__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCES__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCES__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCES__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCES__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCES__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCES__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Process Resource</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCES__PROCESS_RESOURCE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Process Resources</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCES_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCES___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Process Resources</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_RESOURCES_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getProject()
     * @generated
     */
    int PROJECT = 65;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Project Process Reference</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__PROJECT_PROCESS_REFERENCE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Project</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Project</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProjectProcessReferenceImpl <em>Project Process Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ProjectProcessReferenceImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getProjectProcessReference()
     * @generated
     */
    int PROJECT_PROCESS_REFERENCE = 66;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Process Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE__PROCESS_REFERENCE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Process Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE__PROCESS_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Project</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE__PARENT_PROJECT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Project Process Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Project Process Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_PROCESS_REFERENCE_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersImpl <em>Report Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getReportParameters()
     * @generated
     */
    int REPORT_PARAMETERS = 67;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__FILENAME = CONTROL_BLOCK_PARAMETERS__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__LINE_NUMBER = CONTROL_BLOCK_PARAMETERS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__EXPLICIT_LINKS_BUILT = CONTROL_BLOCK_PARAMETERS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__PARENT_PRIVATE = CONTROL_BLOCK_PARAMETERS__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__TEXT = CONTROL_BLOCK_PARAMETERS__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__ANY = CONTROL_BLOCK_PARAMETERS__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__DESC = CONTROL_BLOCK_PARAMETERS__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__ID = CONTROL_BLOCK_PARAMETERS__ID;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__CB_NAME = CONTROL_BLOCK_PARAMETERS__CB_NAME;

    /**
     * The feature id for the '<em><b>Ds Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__DS_NAME = CONTROL_BLOCK_PARAMETERS__DS_NAME;

    /**
     * The feature id for the '<em><b>Buffered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__BUFFERED = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Buf Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__BUF_TIME = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__INTG_PD = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Comm Service Specifications</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Service Specifications</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Referred By Report Parameters Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS__REFERRED_BY_REPORT_PARAMETERS_REF = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Report Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_FEATURE_COUNT = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = CONTROL_BLOCK_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Report Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_OPERATION_COUNT = CONTROL_BLOCK_PARAMETERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersRefImpl <em>Report Parameters Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ReportParametersRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getReportParametersRef()
     * @generated
     */
    int REPORT_PARAMETERS_REF = 68;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF__FILENAME = SERVICE_PARAMETERS_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF__LINE_NUMBER = SERVICE_PARAMETERS_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF__EXPLICIT_LINKS_BUILT = SERVICE_PARAMETERS_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF__PARENT_PRIVATE = SERVICE_PARAMETERS_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF__TEXT = SERVICE_PARAMETERS_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF__ANY = SERVICE_PARAMETERS_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF__DESC = SERVICE_PARAMETERS_REF__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF__ID = SERVICE_PARAMETERS_REF__ID;

    /**
     * The feature id for the '<em><b>Refers To Report Parameters</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF__REFERS_TO_REPORT_PARAMETERS = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Source Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF__PARENT_SOURCE_REF = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Subscriber LNode</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Report Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF_FEATURE_COUNT = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = SERVICE_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Report Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_PARAMETERS_REF_OPERATION_COUNT = SERVICE_PARAMETERS_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ResourceImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getResource()
     * @generated
     */
    int RESOURCE = 69;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__FILENAME = ASD_OBJECT__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__LINE_NUMBER = ASD_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__EXPLICIT_LINKS_BUILT = ASD_OBJECT__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__PARENT_PRIVATE = ASD_OBJECT__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__VALUE = ASD_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Res Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__RES_INST = ASD_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__SOURCE = ASD_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Source Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__SOURCE_UUID = ASD_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Process Resource</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE__PARENT_PROCESS_RESOURCE = ASD_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_FEATURE_COUNT = ASD_OBJECT_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = ASD_OBJECT___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESOURCE_OPERATION_COUNT = ASD_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl <em>SDS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SDSImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getSDS()
     * @generated
     */
    int SDS = 70;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>SDS</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__SDS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>DAS</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__DAS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Subscriber LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__SUBSCRIBER_LNODE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Controlling LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__CONTROLLING_LNODE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Process Echo</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__PROCESS_ECHO = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Log Parameters Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__LOG_PARAMETERS_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Labels</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__LABELS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Ix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__IX = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Mapped Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__MAPPED_DO_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Mapped Ln Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__MAPPED_LN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Parent DOS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__PARENT_DOS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Parent SDS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__PARENT_SDS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Refers To Any LN</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS__REFERS_TO_ANY_LN = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>SDS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 14;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>SDS</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDS_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceSpecificationsImpl <em>Service Specifications</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.ServiceSpecificationsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getServiceSpecifications()
     * @generated
     */
    int SERVICE_SPECIFICATIONS = 73;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Goose Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__GOOSE_PARAMETERS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>SMV Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__SMV_PARAMETERS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Report Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__REPORT_PARAMETERS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Binary Wiring Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__BINARY_WIRING_PARAMETERS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Analogue Wiring Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__ANALOGUE_WIRING_PARAMETERS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Log Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS__LOG_PARAMETERS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Service Specifications</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Service Specifications</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SPECIFICATIONS_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SignalRoleImpl <em>Signal Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SignalRoleImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getSignalRole()
     * @generated
     */
    int SIGNAL_ROLE = 74;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__FILENAME = FUNCTIONAL_VARIANT_REF_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__LINE_NUMBER = FUNCTIONAL_VARIANT_REF_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__EXPLICIT_LINKS_BUILT = FUNCTIONAL_VARIANT_REF_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__PARENT_PRIVATE = FUNCTIONAL_VARIANT_REF_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__TEXT = FUNCTIONAL_VARIANT_REF_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__ANY = FUNCTIONAL_VARIANT_REF_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__DESC = FUNCTIONAL_VARIANT_REF_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Functional Variant Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__FUNCTIONAL_VARIANT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER__FUNCTIONAL_VARIANT_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__NAME = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__ORIGIN_UUID = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Function Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__PARENT_FUNCTION_REF = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>LNode Input Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__LNODE_INPUT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>LNode Output Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__LNODE_OUTPUT_REF = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>LNode Data Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE__LNODE_DATA_REF = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Signal Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE_FEATURE_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTIONAL_VARIANT_REF_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Signal Role</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_ROLE_OPERATION_COUNT = FUNCTIONAL_VARIANT_REF_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl <em>Source Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SourceRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getSourceRef()
     * @generated
     */
    int SOURCE_REF = 75;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__FILENAME = LINK_FCDA_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__LINE_NUMBER = LINK_FCDA_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__EXPLICIT_LINKS_BUILT = LINK_FCDA_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__PARENT_PRIVATE = LINK_FCDA_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__TEXT = LINK_FCDA_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__ANY = LINK_FCDA_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__DESC = LINK_FCDA_REF__DESC;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__ORIGIN_UUID = LINK_FCDA_REF__ORIGIN_UUID;

    /**
     * The feature id for the '<em><b>PDO</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__PDO = LINK_FCDA_REF__PDO;

    /**
     * The feature id for the '<em><b>PLN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__PLN = LINK_FCDA_REF__PLN;

    /**
     * The feature id for the '<em><b>Resource Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__RESOURCE_NAME = LINK_FCDA_REF__RESOURCE_NAME;

    /**
     * The feature id for the '<em><b>Resource Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__RESOURCE_UUID = LINK_FCDA_REF__RESOURCE_UUID;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__TEMPLATE_UUID = LINK_FCDA_REF__TEMPLATE_UUID;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__UUID = LINK_FCDA_REF__UUID;

    /**
     * The feature id for the '<em><b>PDA</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__PDA = LINK_FCDA_REF__PDA;

    /**
     * The feature id for the '<em><b>Goose Parameters Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__GOOSE_PARAMETERS_REF = LINK_FCDA_REF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>SMV Parameters Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__SMV_PARAMETERS_REF = LINK_FCDA_REF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Report Parameters Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__REPORT_PARAMETERS_REF = LINK_FCDA_REF_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Binary Wiring Parameters Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__BINARY_WIRING_PARAMETERS_REF = LINK_FCDA_REF_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Analogue Wiring Parameters Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__ANALOGUE_WIRING_PARAMETERS_REF = LINK_FCDA_REF_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Ext Ref Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__EXT_REF_ADDR = LINK_FCDA_REF_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Ext Ref Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__EXT_REF_UUID = LINK_FCDA_REF_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__INPUT = LINK_FCDA_REF_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Input Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__INPUT_INST = LINK_FCDA_REF_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Service</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__SERVICE = LINK_FCDA_REF_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__SOURCE = LINK_FCDA_REF_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Source Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__SOURCE_DA_NAME = LINK_FCDA_REF_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Source Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__SOURCE_DO_NAME = LINK_FCDA_REF_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Source LNode Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__SOURCE_LNODE_UUID = LINK_FCDA_REF_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Parent LNode Inputs</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__PARENT_LNODE_INPUTS = LINK_FCDA_REF_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Referred By Input Var</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__REFERRED_BY_INPUT_VAR = LINK_FCDA_REF_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Referred By LNode Input Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__REFERRED_BY_LNODE_INPUT_REF = LINK_FCDA_REF_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Refers To Subscriber LNode</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__REFERS_TO_SUBSCRIBER_LNODE = LINK_FCDA_REF_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>Refers To Process Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__REFERS_TO_PROCESS_RESOURCE = LINK_FCDA_REF_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Refers To LNode</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__REFERS_TO_LNODE = LINK_FCDA_REF_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Refers To Ext Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF__REFERS_TO_EXT_REF = LINK_FCDA_REF_FEATURE_COUNT + 20;

    /**
     * The number of structural features of the '<em>Source Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF_FEATURE_COUNT = LINK_FCDA_REF_FEATURE_COUNT + 21;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = LINK_FCDA_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Source Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_REF_OPERATION_COUNT = LINK_FCDA_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubCategoryImpl <em>Sub Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubCategoryImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getSubCategory()
     * @generated
     */
    int SUB_CATEGORY = 76;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__FILENAME = FUNCTION_CATEGORY__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__LINE_NUMBER = FUNCTION_CATEGORY__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__EXPLICIT_LINKS_BUILT = FUNCTION_CATEGORY__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__PARENT_PRIVATE = FUNCTION_CATEGORY__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__TEXT = FUNCTION_CATEGORY__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__ANY = FUNCTION_CATEGORY__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__DESC = FUNCTION_CATEGORY__DESC;

    /**
     * The feature id for the '<em><b>Sub Category</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__SUB_CATEGORY = FUNCTION_CATEGORY__SUB_CATEGORY;

    /**
     * The feature id for the '<em><b>Function Cat Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__FUNCTION_CAT_REF = FUNCTION_CATEGORY__FUNCTION_CAT_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__NAME = FUNCTION_CATEGORY__NAME;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__ORIGIN_UUID = FUNCTION_CATEGORY__ORIGIN_UUID;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__TEMPLATE_UUID = FUNCTION_CATEGORY__TEMPLATE_UUID;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__UUID = FUNCTION_CATEGORY__UUID;

    /**
     * The feature id for the '<em><b>Referred By Function Category Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF = FUNCTION_CATEGORY__REFERRED_BY_FUNCTION_CATEGORY_REF;

    /**
     * The feature id for the '<em><b>Parent Function Category</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY__PARENT_FUNCTION_CATEGORY = FUNCTION_CATEGORY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Sub Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY_FEATURE_COUNT = FUNCTION_CATEGORY_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = FUNCTION_CATEGORY___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Sub Category</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CATEGORY_OPERATION_COUNT = FUNCTION_CATEGORY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubCheckoutIDImpl <em>Sub Checkout ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubCheckoutIDImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getSubCheckoutID()
     * @generated
     */
    int SUB_CHECKOUT_ID = 77;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__LINE_NUMBER = CHECKOUT_ID__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__EXPLICIT_LINKS_BUILT = CHECKOUT_ID__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__FILENAME = CHECKOUT_ID__FILENAME;

    /**
     * The feature id for the '<em><b>Xpath</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__XPATH = CHECKOUT_ID__XPATH;

    /**
     * The feature id for the '<em><b>File Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__FILE_NAME = CHECKOUT_ID__FILE_NAME;

    /**
     * The feature id for the '<em><b>File Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__FILE_TYPE = CHECKOUT_ID__FILE_TYPE;

    /**
     * The feature id for the '<em><b>File Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__FILE_UUID = CHECKOUT_ID__FILE_UUID;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__REVISION = CHECKOUT_ID__REVISION;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__VERSION = CHECKOUT_ID__VERSION;

    /**
     * The feature id for the '<em><b>When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__WHEN = CHECKOUT_ID__WHEN;

    /**
     * The feature id for the '<em><b>Parent Source Files</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__PARENT_SOURCE_FILES = CHECKOUT_ID__PARENT_SOURCE_FILES;

    /**
     * The feature id for the '<em><b>Parent Application Scl Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__PARENT_APPLICATION_SCL_REF = CHECKOUT_ID__PARENT_APPLICATION_SCL_REF;

    /**
     * The feature id for the '<em><b>Parent Function Scl Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__PARENT_FUNCTION_SCL_REF = CHECKOUT_ID__PARENT_FUNCTION_SCL_REF;

    /**
     * The feature id for the '<em><b>Parent IED Source Files</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__PARENT_IED_SOURCE_FILES = CHECKOUT_ID__PARENT_IED_SOURCE_FILES;

    /**
     * The feature id for the '<em><b>Sub Checkout ID</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__SUB_CHECKOUT_ID = CHECKOUT_ID__SUB_CHECKOUT_ID;

    /**
     * The feature id for the '<em><b>Eng Right</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__ENG_RIGHT = CHECKOUT_ID__ENG_RIGHT;

    /**
     * The feature id for the '<em><b>Header Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__HEADER_ID = CHECKOUT_ID__HEADER_ID;

    /**
     * The feature id for the '<em><b>Parent Checkout ID</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID__PARENT_CHECKOUT_ID = CHECKOUT_ID_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Sub Checkout ID</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID_FEATURE_COUNT = CHECKOUT_ID_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = CHECKOUT_ID___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Sub Checkout ID</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_CHECKOUT_ID_OPERATION_COUNT = CHECKOUT_ID_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubFunctionTemplateImpl <em>Sub Function Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubFunctionTemplateImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getSubFunctionTemplate()
     * @generated
     */
    int SUB_FUNCTION_TEMPLATE = 78;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__FILENAME = ABSTRACT6100_LNODE_CONTAINER__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__LINE_NUMBER = ABSTRACT6100_LNODE_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__EXPLICIT_LINKS_BUILT = ABSTRACT6100_LNODE_CONTAINER__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__PARENT_PRIVATE = ABSTRACT6100_LNODE_CONTAINER__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__TEXT = ABSTRACT6100_LNODE_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__ANY = ABSTRACT6100_LNODE_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__DESC = ABSTRACT6100_LNODE_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__LNODE = ABSTRACT6100_LNODE_CONTAINER__LNODE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__NAME = ABSTRACT6100_LNODE_CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__ORIGIN_UUID = ABSTRACT6100_LNODE_CONTAINER__ORIGIN_UUID;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__TEMPLATE_UUID = ABSTRACT6100_LNODE_CONTAINER__TEMPLATE_UUID;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__UUID = ABSTRACT6100_LNODE_CONTAINER__UUID;

    /**
     * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__GENERAL_EQUIPMENT = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__CONDUCTING_EQUIPMENT = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sub Function Template</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__SUB_FUNCTION_TEMPLATE = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__TYPE = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Function Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__PARENT_FUNCTION_TEMPLATE = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Sub Function Template</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE__PARENT_SUB_FUNCTION_TEMPLATE = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Sub Function Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE_FEATURE_COUNT = ABSTRACT6100_LNODE_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = ABSTRACT6100_LNODE_CONTAINER___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Sub Function Template</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_TEMPLATE_OPERATION_COUNT = ABSTRACT6100_LNODE_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl <em>SMV Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getSMVParameters()
     * @generated
     */
    int SMV_PARAMETERS = 79;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__FILENAME = CONTROL_BLOCK_PARAMETERS__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__LINE_NUMBER = CONTROL_BLOCK_PARAMETERS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__EXPLICIT_LINKS_BUILT = CONTROL_BLOCK_PARAMETERS__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__PARENT_PRIVATE = CONTROL_BLOCK_PARAMETERS__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__TEXT = CONTROL_BLOCK_PARAMETERS__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__ANY = CONTROL_BLOCK_PARAMETERS__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__DESC = CONTROL_BLOCK_PARAMETERS__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__ID = CONTROL_BLOCK_PARAMETERS__ID;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__CB_NAME = CONTROL_BLOCK_PARAMETERS__CB_NAME;

    /**
     * The feature id for the '<em><b>Ds Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__DS_NAME = CONTROL_BLOCK_PARAMETERS__DS_NAME;

    /**
     * The feature id for the '<em><b>L2 Comm Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__L2_COMM_PARAMETERS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>L3I Pv4 Comm Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__L3I_PV4_COMM_PARAMETERS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>L3I Pv6 Comm Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__L3I_PV6_COMM_PARAMETERS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Multicast</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__MULTICAST = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Nof ASDU</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__NOF_ASDU = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Security Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__SECURITY_ENABLED = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Smp Mod</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__SMP_MOD = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Smp Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__SMP_RATE = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Smv Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__SMV_ID = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Parent Comm Service Specifications</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__PARENT_COMM_SERVICE_SPECIFICATIONS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Parent Service Specifications</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__PARENT_SERVICE_SPECIFICATIONS = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Referred By SMV Parameters Ref</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS__REFERRED_BY_SMV_PARAMETERS_REF = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>SMV Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_FEATURE_COUNT = CONTROL_BLOCK_PARAMETERS_FEATURE_COUNT + 12;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = CONTROL_BLOCK_PARAMETERS___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>SMV Parameters</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_OPERATION_COUNT = CONTROL_BLOCK_PARAMETERS_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersRefImpl <em>SMV Parameters Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SMVParametersRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getSMVParametersRef()
     * @generated
     */
    int SMV_PARAMETERS_REF = 80;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF__FILENAME = SERVICE_PARAMETERS_REF__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF__LINE_NUMBER = SERVICE_PARAMETERS_REF__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF__EXPLICIT_LINKS_BUILT = SERVICE_PARAMETERS_REF__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF__PARENT_PRIVATE = SERVICE_PARAMETERS_REF__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF__TEXT = SERVICE_PARAMETERS_REF__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF__ANY = SERVICE_PARAMETERS_REF__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF__DESC = SERVICE_PARAMETERS_REF__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF__ID = SERVICE_PARAMETERS_REF__ID;

    /**
     * The feature id for the '<em><b>Refers To SMV Parameters</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF__REFERS_TO_SMV_PARAMETERS = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Source Ref</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF__PARENT_SOURCE_REF = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Subscriber LNode</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF__PARENT_SUBSCRIBER_LNODE = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>SMV Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF_FEATURE_COUNT = SERVICE_PARAMETERS_REF_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = SERVICE_PARAMETERS_REF___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>SMV Parameters Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_PARAMETERS_REF_OPERATION_COUNT = SERVICE_PARAMETERS_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl <em>Subscriber LNode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.SubscriberLNodeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getSubscriberLNode()
     * @generated
     */
    int SUBSCRIBER_LNODE = 81;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Goose Parameters Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__GOOSE_PARAMETERS_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>SMV Parameters Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__SMV_PARAMETERS_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Report Parameters Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__REPORT_PARAMETERS_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Binary Wiring Parameters Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__BINARY_WIRING_PARAMETERS_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Input Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__INPUT_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>PLN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__PLN = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Resource Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__RESOURCE_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Resource Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__RESOURCE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Service</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__SERVICE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Parent DAS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__PARENT_DAS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Parent DOS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__PARENT_DOS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Parent SDS</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__PARENT_SDS = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Refers To Process Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__REFERS_TO_PROCESS_RESOURCE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Referred By Source Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE__REFERRED_BY_SOURCE_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Subscriber LNode</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 14;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Subscriber LNode</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSCRIBER_LNODE_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getVariable()
     * @generated
     */
    int VARIABLE = 82;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Variable Apply To</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__VARIABLE_APPLY_TO = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Origin Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__ORIGIN_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Template Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__TEMPLATE_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__VALUE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Referred By Variable Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__REFERRED_BY_VARIABLE_REF = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableApplyToImpl <em>Variable Apply To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.VariableApplyToImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getVariableApplyTo()
     * @generated
     */
    int VARIABLE_APPLY_TO = 83;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__FILENAME = BASE_EXTENSION_ELEMENT_WITH_DESC__FILENAME;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__LINE_NUMBER = BASE_EXTENSION_ELEMENT_WITH_DESC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Explicit Links Built</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__EXPLICIT_LINKS_BUILT = BASE_EXTENSION_ELEMENT_WITH_DESC__EXPLICIT_LINKS_BUILT;

    /**
     * The feature id for the '<em><b>Parent Private</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__PARENT_PRIVATE = BASE_EXTENSION_ELEMENT_WITH_DESC__PARENT_PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__TEXT = BASE_EXTENSION_ELEMENT_WITH_DESC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__ANY = BASE_EXTENSION_ELEMENT_WITH_DESC__ANY;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__DESC = BASE_EXTENSION_ELEMENT_WITH_DESC__DESC;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__ATTRIBUTE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__DA_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__DEFAULT_VALUE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__DO_NAME = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__ELEMENT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Element Uuid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__ELEMENT_UUID = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Format</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__FORMAT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>SGroup</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__SGROUP = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Parent Variable</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO__PARENT_VARIABLE = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Variable Apply To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO_FEATURE_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_FEATURE_COUNT + 9;

    /**
     * The operation id for the '<em>Build Explicit Links</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN = BASE_EXTENSION_ELEMENT_WITH_DESC___BUILD_EXPLICIT_LINKS__IRISECLIPSECONSOLE_BOOLEAN;

    /**
     * The number of operations of the '<em>Variable Apply To</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_APPLY_TO_OPERATION_COUNT = BASE_EXTENSION_ELEMENT_WITH_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum <em>Cardinality Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getCardinalityEnum()
     * @generated
     */
    int CARDINALITY_ENUM = 86;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutTypEnum <em>Out Typ Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutTypEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getOutTypEnum()
     * @generated
     */
    int OUT_TYP_ENUM = 87;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.UpdateEnum <em>Update Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.UpdateEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getUpdateEnum()
     * @generated
     */
    int UPDATE_ENUM = 88;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum <em>Spec Service Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.impl.AsdPackageImpl#getSpecServiceEnum()
     * @generated
     */
    int SPEC_SERVICE_ENUM = 89;

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant <em>Abstract Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Functional Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant
     * @generated
     */
    EClass getAbstractFunctionalVariant();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getFunctionalSubVariant <em>Functional Sub Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Functional Sub Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getFunctionalSubVariant()
     * @see #getAbstractFunctionalVariant()
     * @generated
     */
    EReference getAbstractFunctionalVariant_FunctionalSubVariant();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getVariableRef <em>Variable Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getVariableRef()
     * @see #getAbstractFunctionalVariant()
     * @generated
     */
    EReference getAbstractFunctionalVariant_VariableRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#isIsBaseline <em>Is Baseline</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Baseline</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#isIsBaseline()
     * @see #getAbstractFunctionalVariant()
     * @generated
     */
    EAttribute getAbstractFunctionalVariant_IsBaseline();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getName()
     * @see #getAbstractFunctionalVariant()
     * @generated
     */
    EAttribute getAbstractFunctionalVariant_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getOriginUuid()
     * @see #getAbstractFunctionalVariant()
     * @generated
     */
    EAttribute getAbstractFunctionalVariant_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getTemplateUuid()
     * @see #getAbstractFunctionalVariant()
     * @generated
     */
    EAttribute getAbstractFunctionalVariant_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AbstractFunctionalVariant#getUuid()
     * @see #getAbstractFunctionalVariant()
     * @generated
     */
    EAttribute getAbstractFunctionalVariant_Uuid();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole <em>Allocation Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Allocation Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole
     * @generated
     */
    EClass getAllocationRole();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getFunctionRef <em>Function Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getFunctionRef()
     * @see #getAllocationRole()
     * @generated
     */
    EReference getAllocationRole_FunctionRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getName()
     * @see #getAllocationRole()
     * @generated
     */
    EAttribute getAllocationRole_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getOriginUuid()
     * @see #getAllocationRole()
     * @generated
     */
    EAttribute getAllocationRole_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getTemplateUuid()
     * @see #getAllocationRole()
     * @generated
     */
    EAttribute getAllocationRole_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getUuid()
     * @see #getAllocationRole()
     * @generated
     */
    EAttribute getAllocationRole_Uuid();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getReferredByAllocationRoleRef <em>Referred By Allocation Role Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Allocation Role Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRole#getReferredByAllocationRoleRef()
     * @see #getAllocationRole()
     * @generated
     */
    EReference getAllocationRole_ReferredByAllocationRoleRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef <em>Allocation Role Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Allocation Role Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef
     * @generated
     */
    EClass getAllocationRoleRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getAllocationRole <em>Allocation Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Allocation Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getAllocationRole()
     * @see #getAllocationRoleRef()
     * @generated
     */
    EAttribute getAllocationRoleRef_AllocationRole();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getAllocationRoleUuid <em>Allocation Role Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Allocation Role Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getAllocationRoleUuid()
     * @see #getAllocationRoleRef()
     * @generated
     */
    EAttribute getAllocationRoleRef_AllocationRoleUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getParentApplication <em>Parent Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Application</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getParentApplication()
     * @see #getAllocationRoleRef()
     * @generated
     */
    EReference getAllocationRoleRef_ParentApplication();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getRefersToAllocationRole <em>Refers To Allocation Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Allocation Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AllocationRoleRef#getRefersToAllocationRole()
     * @see #getAllocationRoleRef()
     * @generated
     */
    EReference getAllocationRoleRef_RefersToAllocationRole();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application <em>Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Application</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application
     * @generated
     */
    EClass getApplication();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionRole <em>Function Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionRole()
     * @see #getApplication()
     * @generated
     */
    EReference getApplication_FunctionRole();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariant <em>Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Functional Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariant()
     * @see #getApplication()
     * @generated
     */
    EReference getApplication_FunctionalVariant();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariantGroup <em>Functional Variant Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Functional Variant Group</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getFunctionalVariantGroup()
     * @see #getApplication()
     * @generated
     */
    EReference getApplication_FunctionalVariantGroup();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getAllocationRoleRef <em>Allocation Role Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Allocation Role Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getAllocationRoleRef()
     * @see #getApplication()
     * @generated
     */
    EReference getApplication_AllocationRoleRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getApplicationSclRef <em>Application Scl Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Application Scl Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getApplicationSclRef()
     * @see #getApplication()
     * @generated
     */
    EReference getApplication_ApplicationSclRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getName()
     * @see #getApplication()
     * @generated
     */
    EAttribute getApplication_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getOriginUuid()
     * @see #getApplication()
     * @generated
     */
    EAttribute getApplication_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getTemplateUuid()
     * @see #getApplication()
     * @generated
     */
    EAttribute getApplication_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getType()
     * @see #getApplication()
     * @generated
     */
    EAttribute getApplication_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Application#getUuid()
     * @see #getApplication()
     * @generated
     */
    EAttribute getApplication_Uuid();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters <em>Analogue Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Analogue Wiring Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters
     * @generated
     */
    EClass getAnalogueWiringParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getDsgInp <em>Dsg Inp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dsg Inp</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getDsgInp()
     * @see #getAnalogueWiringParameters()
     * @generated
     */
    EAttribute getAnalogueWiringParameters_DsgInp();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getFctInp <em>Fct Inp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fct Inp</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getFctInp()
     * @see #getAnalogueWiringParameters()
     * @generated
     */
    EAttribute getAnalogueWiringParameters_FctInp();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service Specifications</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getParentServiceSpecifications()
     * @see #getAnalogueWiringParameters()
     * @generated
     */
    EReference getAnalogueWiringParameters_ParentServiceSpecifications();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getReferredByAnalogueWiringParametersRef <em>Referred By Analogue Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Analogue Wiring Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParameters#getReferredByAnalogueWiringParametersRef()
     * @see #getAnalogueWiringParameters()
     * @generated
     */
    EReference getAnalogueWiringParameters_ReferredByAnalogueWiringParametersRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer <em>Abstract6100 LNode Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract6100 LNode Container</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer
     * @generated
     */
    EClass getAbstract6100LNodeContainer();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getLNode <em>LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getLNode()
     * @see #getAbstract6100LNodeContainer()
     * @generated
     */
    EReference getAbstract6100LNodeContainer_LNode();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getName()
     * @see #getAbstract6100LNodeContainer()
     * @generated
     */
    EAttribute getAbstract6100LNodeContainer_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getOriginUuid()
     * @see #getAbstract6100LNodeContainer()
     * @generated
     */
    EAttribute getAbstract6100LNodeContainer_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getTemplateUuid()
     * @see #getAbstract6100LNodeContainer()
     * @generated
     */
    EAttribute getAbstract6100LNodeContainer_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Abstract6100LNodeContainer#getUuid()
     * @see #getAbstract6100LNodeContainer()
     * @generated
     */
    EAttribute getAbstract6100LNodeContainer_Uuid();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Analogue Wiring Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef
     * @generated
     */
    EClass getAnalogueWiringParametersRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControlRef <em>Parent Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Control Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControlRef()
     * @see #getAnalogueWiringParametersRef()
     * @generated
     */
    EReference getAnalogueWiringParametersRef_ParentControlRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControllingLNode <em>Parent Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Controlling LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentControllingLNode()
     * @see #getAnalogueWiringParametersRef()
     * @generated
     */
    EReference getAnalogueWiringParametersRef_ParentControllingLNode();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentSourceRef <em>Parent Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getParentSourceRef()
     * @see #getAnalogueWiringParametersRef()
     * @generated
     */
    EReference getAnalogueWiringParametersRef_ParentSourceRef();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getRefersToAnalogueWiringParameters <em>Refers To Analogue Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Analogue Wiring Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AnalogueWiringParametersRef#getRefersToAnalogueWiringParameters()
     * @see #getAnalogueWiringParametersRef()
     * @generated
     */
    EReference getAnalogueWiringParametersRef_RefersToAnalogueWiringParameters();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef <em>Application Scl Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Application Scl Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef
     * @generated
     */
    EClass getApplicationSclRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getSclFileReference <em>Scl File Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Scl File Reference</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getSclFileReference()
     * @see #getApplicationSclRef()
     * @generated
     */
    EReference getApplicationSclRef_SclFileReference();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getParentApplication <em>Parent Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Application</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ApplicationSclRef#getParentApplication()
     * @see #getApplicationSclRef()
     * @generated
     */
    EReference getApplicationSclRef_ParentApplication();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject
     * @generated
     */
    EClass getAsdObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getFilename <em>Filename</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filename</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getFilename()
     * @see #getAsdObject()
     * @generated
     */
    EAttribute getAsdObject_Filename();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getLineNumber <em>Line Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line Number</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getLineNumber()
     * @see #getAsdObject()
     * @generated
     */
    EAttribute getAsdObject_LineNumber();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#isExplicitLinksBuilt <em>Explicit Links Built</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Explicit Links Built</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#isExplicitLinksBuilt()
     * @see #getAsdObject()
     * @generated
     */
    EAttribute getAsdObject_ExplicitLinksBuilt();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getParentPrivate <em>Parent Private</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Private</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#getParentPrivate()
     * @see #getAsdObject()
     * @generated
     */
    EReference getAsdObject_ParentPrivate();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#buildExplicitLinks(fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole, java.lang.Boolean) <em>Build Explicit Links</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Build Explicit Links</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdObject#buildExplicitLinks(fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole, java.lang.Boolean)
     * @generated
     */
    EOperation getAsdObject__BuildExplicitLinks__IRiseClipseConsole_Boolean();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement <em>Base Extension Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Extension Element</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement
     * @generated
     */
    EClass getBaseExtensionElement();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Text</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement#getText()
     * @see #getBaseExtensionElement()
     * @generated
     */
    EReference getBaseExtensionElement_Text();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElement#getAny()
     * @see #getBaseExtensionElement()
     * @generated
     */
    EAttribute getBaseExtensionElement_Any();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElementWithDesc <em>Base Extension Element With Desc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Extension Element With Desc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElementWithDesc
     * @generated
     */
    EClass getBaseExtensionElementWithDesc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElementWithDesc#getDesc <em>Desc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BaseExtensionElementWithDesc#getDesc()
     * @see #getBaseExtensionElementWithDesc()
     * @generated
     */
    EAttribute getBaseExtensionElementWithDesc_Desc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BayType <em>Bay Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bay Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BayType
     * @generated
     */
    EClass getBayType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BayType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BayType#getValue()
     * @see #getBayType()
     * @generated
     */
    EAttribute getBayType_Value();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription <em>Behavior Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Description</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription
     * @generated
     */
    EClass getBehaviorDescription();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getInputVar <em>Input Var</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Input Var</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getInputVar()
     * @see #getBehaviorDescription()
     * @generated
     */
    EReference getBehaviorDescription_InputVar();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getOutputVar <em>Output Var</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Output Var</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getOutputVar()
     * @see #getBehaviorDescription()
     * @generated
     */
    EReference getBehaviorDescription_OutputVar();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getBehaviorReference <em>Behavior Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Behavior Reference</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getBehaviorReference()
     * @see #getBehaviorDescription()
     * @generated
     */
    EReference getBehaviorDescription_BehaviorReference();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getFileReference <em>File Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Reference</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getFileReference()
     * @see #getBehaviorDescription()
     * @generated
     */
    EAttribute getBehaviorDescription_FileReference();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getFormat <em>Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Format</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getFormat()
     * @see #getBehaviorDescription()
     * @generated
     */
    EAttribute getBehaviorDescription_Format();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSimulation <em>Is Simulation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Simulation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSimulation()
     * @see #getBehaviorDescription()
     * @generated
     */
    EAttribute getBehaviorDescription_IsSimulation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSpecification <em>Is Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Specification</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#isIsSpecification()
     * @see #getBehaviorDescription()
     * @generated
     */
    EAttribute getBehaviorDescription_IsSpecification();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getName()
     * @see #getBehaviorDescription()
     * @generated
     */
    EAttribute getBehaviorDescription_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getOriginUuid()
     * @see #getBehaviorDescription()
     * @generated
     */
    EAttribute getBehaviorDescription_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getTemplateUuid()
     * @see #getBehaviorDescription()
     * @generated
     */
    EAttribute getBehaviorDescription_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getUuid()
     * @see #getBehaviorDescription()
     * @generated
     */
    EAttribute getBehaviorDescription_Uuid();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getReferredByBehaviorDescriptionRef <em>Referred By Behavior Description Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Behavior Description Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescription#getReferredByBehaviorDescriptionRef()
     * @see #getBehaviorDescription()
     * @generated
     */
    EReference getBehaviorDescription_ReferredByBehaviorDescriptionRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef <em>Behavior Description Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Description Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef
     * @generated
     */
    EClass getBehaviorDescriptionRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getInputVarRef <em>Input Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Input Var Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getInputVarRef()
     * @see #getBehaviorDescriptionRef()
     * @generated
     */
    EReference getBehaviorDescriptionRef_InputVarRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getOutputVarRef <em>Output Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Output Var Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getOutputVarRef()
     * @see #getBehaviorDescriptionRef()
     * @generated
     */
    EReference getBehaviorDescriptionRef_OutputVarRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getBehaviorDescription <em>Behavior Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Behavior Description</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getBehaviorDescription()
     * @see #getBehaviorDescriptionRef()
     * @generated
     */
    EAttribute getBehaviorDescriptionRef_BehaviorDescription();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getBehaviorDescriptionUuid <em>Behavior Description Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Behavior Description Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getBehaviorDescriptionUuid()
     * @see #getBehaviorDescriptionRef()
     * @generated
     */
    EAttribute getBehaviorDescriptionRef_BehaviorDescriptionUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function Role Content</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getParentFunctionRoleContent()
     * @see #getBehaviorDescriptionRef()
     * @generated
     */
    EReference getBehaviorDescriptionRef_ParentFunctionRoleContent();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getRefersToBehaviorDescription <em>Refers To Behavior Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Behavior Description</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorDescriptionRef#getRefersToBehaviorDescription()
     * @see #getBehaviorDescriptionRef()
     * @generated
     */
    EReference getBehaviorDescriptionRef_RefersToBehaviorDescription();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference <em>Behavior Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Reference</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference
     * @generated
     */
    EClass getBehaviorReference();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getBehaviorReference <em>Behavior Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Behavior Reference</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getBehaviorReference()
     * @see #getBehaviorReference()
     * @generated
     */
    EAttribute getBehaviorReference_BehaviorReference();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getBehaviorUuid <em>Behavior Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Behavior Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getBehaviorUuid()
     * @see #getBehaviorReference()
     * @generated
     */
    EAttribute getBehaviorReference_BehaviorUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getParentBehaviorDescription <em>Parent Behavior Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Behavior Description</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BehaviorReference#getParentBehaviorDescription()
     * @see #getBehaviorReference()
     * @generated
     */
    EReference getBehaviorReference_ParentBehaviorDescription();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters <em>Binary Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binary Wiring Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters
     * @generated
     */
    EClass getBinaryWiringParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getDebTm <em>Deb Tm</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deb Tm</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getDebTm()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    EAttribute getBinaryWiringParameters_DebTm();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#isFastOutput <em>Fast Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fast Output</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#isFastOutput()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    EAttribute getBinaryWiringParameters_FastOutput();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutNam <em>Out Nam</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Out Nam</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutNam()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    EAttribute getBinaryWiringParameters_OutNam();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOffDl <em>Out Off Dl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Out Off Dl</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOffDl()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    EAttribute getBinaryWiringParameters_OutOffDl();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOnDl <em>Out On Dl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Out On Dl</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutOnDl()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    EAttribute getBinaryWiringParameters_OutOnDl();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutRef <em>Out Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Out Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutRef()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    EAttribute getBinaryWiringParameters_OutRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutTyp <em>Out Typ</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Out Typ</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getOutTyp()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    EAttribute getBinaryWiringParameters_OutTyp();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOff <em>VIn Off</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VIn Off</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOff()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    EAttribute getBinaryWiringParameters_VInOff();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOn <em>VIn On</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>VIn On</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getVInOn()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    EAttribute getBinaryWiringParameters_VInOn();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service Specifications</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getParentServiceSpecifications()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    EReference getBinaryWiringParameters_ParentServiceSpecifications();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getReferredByBinaryWiringParametersRef <em>Referred By Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Binary Wiring Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParameters#getReferredByBinaryWiringParametersRef()
     * @see #getBinaryWiringParameters()
     * @generated
     */
    EReference getBinaryWiringParameters_ReferredByBinaryWiringParametersRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Binary Wiring Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef
     * @generated
     */
    EClass getBinaryWiringParametersRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControlRef <em>Parent Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Control Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControlRef()
     * @see #getBinaryWiringParametersRef()
     * @generated
     */
    EReference getBinaryWiringParametersRef_ParentControlRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControllingLNode <em>Parent Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Controlling LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentControllingLNode()
     * @see #getBinaryWiringParametersRef()
     * @generated
     */
    EReference getBinaryWiringParametersRef_ParentControllingLNode();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSourceRef <em>Parent Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSourceRef()
     * @see #getBinaryWiringParametersRef()
     * @generated
     */
    EReference getBinaryWiringParametersRef_ParentSourceRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Subscriber LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getParentSubscriberLNode()
     * @see #getBinaryWiringParametersRef()
     * @generated
     */
    EReference getBinaryWiringParametersRef_ParentSubscriberLNode();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getRefersToBinaryWiringParameters <em>Refers To Binary Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Binary Wiring Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.BinaryWiringParametersRef#getRefersToBinaryWiringParameters()
     * @see #getBinaryWiringParametersRef()
     * @generated
     */
    EReference getBinaryWiringParametersRef_RefersToBinaryWiringParameters();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID <em>Checkout ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Checkout ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID
     * @generated
     */
    EClass getCheckoutID();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getSubCheckoutID <em>Sub Checkout ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sub Checkout ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getSubCheckoutID()
     * @see #getCheckoutID()
     * @generated
     */
    EReference getCheckoutID_SubCheckoutID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getEngRight <em>Eng Right</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Eng Right</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getEngRight()
     * @see #getCheckoutID()
     * @generated
     */
    EAttribute getCheckoutID_EngRight();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getHeaderId <em>Header Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Header Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CheckoutID#getHeaderId()
     * @see #getCheckoutID()
     * @generated
     */
    EAttribute getCheckoutID_HeaderId();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef <em>Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef
     * @generated
     */
    EClass getControlRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Binary Wiring Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getBinaryWiringParametersRef()
     * @see #getControlRef()
     * @generated
     */
    EReference getControlRef_BinaryWiringParametersRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Analogue Wiring Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getAnalogueWiringParametersRef()
     * @see #getControlRef()
     * @generated
     */
    EReference getControlRef_AnalogueWiringParametersRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlled <em>Controlled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Controlled</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlled()
     * @see #getControlRef()
     * @generated
     */
    EAttribute getControlRef_Controlled();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlledDoName <em>Controlled Do Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Controlled Do Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlledDoName()
     * @see #getControlRef()
     * @generated
     */
    EAttribute getControlRef_ControlledDoName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlledLNodeUuid <em>Controlled LNode Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Controlled LNode Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getControlledLNodeUuid()
     * @see #getControlRef()
     * @generated
     */
    EAttribute getControlRef_ControlledLNodeUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getExtCtrlAddr <em>Ext Ctrl Addr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ext Ctrl Addr</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getExtCtrlAddr()
     * @see #getControlRef()
     * @generated
     */
    EAttribute getControlRef_ExtCtrlAddr();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getExtCtrlUuid <em>Ext Ctrl Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ext Ctrl Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getExtCtrlUuid()
     * @see #getControlRef()
     * @generated
     */
    EAttribute getControlRef_ExtCtrlUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getOutput <em>Output</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getOutput()
     * @see #getControlRef()
     * @generated
     */
    EAttribute getControlRef_Output();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getOutputInst <em>Output Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getOutputInst()
     * @see #getControlRef()
     * @generated
     */
    EAttribute getControlRef_OutputInst();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getParentLNodeOutputs <em>Parent LNode Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LNode Outputs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getParentLNodeOutputs()
     * @see #getControlRef()
     * @generated
     */
    EReference getControlRef_ParentLNodeOutputs();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByLNodeOutputRef <em>Referred By LNode Output Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By LNode Output Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByLNodeOutputRef()
     * @see #getControlRef()
     * @generated
     */
    EReference getControlRef_ReferredByLNodeOutputRef();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToControllingLNode <em>Refers To Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Controlling LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToControllingLNode()
     * @see #getControlRef()
     * @generated
     */
    EReference getControlRef_RefersToControllingLNode();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Process Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToProcessResource()
     * @see #getControlRef()
     * @generated
     */
    EReference getControlRef_RefersToProcessResource();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByOutputVar <em>Referred By Output Var</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Output Var</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getReferredByOutputVar()
     * @see #getControlRef()
     * @generated
     */
    EReference getControlRef_ReferredByOutputVar();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToLNode <em>Refers To LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlRef#getRefersToLNode()
     * @see #getControlRef()
     * @generated
     */
    EReference getControlRef_RefersToLNode();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters <em>Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comm Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters
     * @generated
     */
    EClass getCommParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getAppId <em>App Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>App Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getAppId()
     * @see #getCommParameters()
     * @generated
     */
    EAttribute getCommParameters_AppId();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getVlanId <em>Vlan Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Vlan Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getVlanId()
     * @see #getCommParameters()
     * @generated
     */
    EAttribute getCommParameters_VlanId();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getVlanPriority <em>Vlan Priority</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Vlan Priority</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommParameters#getVlanPriority()
     * @see #getCommParameters()
     * @generated
     */
    EAttribute getCommParameters_VlanPriority();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications <em>Comm Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comm Service Specifications</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications
     * @generated
     */
    EClass getCommServiceSpecifications();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getGooseParameters <em>Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Goose Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getGooseParameters()
     * @see #getCommServiceSpecifications()
     * @generated
     */
    EReference getCommServiceSpecifications_GooseParameters();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getSMVParameters <em>SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SMV Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getSMVParameters()
     * @see #getCommServiceSpecifications()
     * @generated
     */
    EReference getCommServiceSpecifications_SMVParameters();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getReportParameters <em>Report Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Report Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CommServiceSpecifications#getReportParameters()
     * @see #getCommServiceSpecifications()
     * @generated
     */
    EReference getCommServiceSpecifications_ReportParameters();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters <em>Control Block Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control Block Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters
     * @generated
     */
    EClass getControlBlockParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters#getCbName <em>Cb Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cb Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters#getCbName()
     * @see #getControlBlockParameters()
     * @generated
     */
    EAttribute getControlBlockParameters_CbName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters#getDsName <em>Ds Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ds Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControlBlockParameters#getDsName()
     * @see #getControlBlockParameters()
     * @generated
     */
    EAttribute getControlBlockParameters_DsName();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode <em>Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Controlling LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode
     * @generated
     */
    EClass getControllingLNode();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binary Wiring Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getBinaryWiringParametersRef()
     * @see #getControllingLNode()
     * @generated
     */
    EReference getControllingLNode_BinaryWiringParametersRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Analogue Wiring Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getAnalogueWiringParametersRef()
     * @see #getControllingLNode()
     * @generated
     */
    EReference getControllingLNode_AnalogueWiringParametersRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getOutputName <em>Output Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getOutputName()
     * @see #getControllingLNode()
     * @generated
     */
    EAttribute getControllingLNode_OutputName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getPLN <em>PLN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PLN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getPLN()
     * @see #getControllingLNode()
     * @generated
     */
    EAttribute getControllingLNode_PLN();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getResourceName <em>Resource Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getResourceName()
     * @see #getControllingLNode()
     * @generated
     */
    EAttribute getControllingLNode_ResourceName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getResourceUuid <em>Resource Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getResourceUuid()
     * @see #getControllingLNode()
     * @generated
     */
    EAttribute getControllingLNode_ResourceUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDAS <em>Parent DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DAS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDAS()
     * @see #getControllingLNode()
     * @generated
     */
    EReference getControllingLNode_ParentDAS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DOS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentDOS()
     * @see #getControllingLNode()
     * @generated
     */
    EReference getControllingLNode_ParentDOS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentSDS <em>Parent SDS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SDS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getParentSDS()
     * @see #getControllingLNode()
     * @generated
     */
    EReference getControllingLNode_ParentSDS();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Process Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getRefersToProcessResource()
     * @see #getControllingLNode()
     * @generated
     */
    EReference getControllingLNode_RefersToProcessResource();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getReferredByControlRef <em>Referred By Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Control Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ControllingLNode#getReferredByControlRef()
     * @see #getControllingLNode()
     * @generated
     */
    EReference getControllingLNode_ReferredByControlRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS <em>DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DAS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS
     * @generated
     */
    EClass getDAS();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getSubscriberLNode <em>Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Subscriber LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getSubscriberLNode()
     * @see #getDAS()
     * @generated
     */
    EReference getDAS_SubscriberLNode();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getControllingLNode <em>Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Controlling LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getControllingLNode()
     * @see #getDAS()
     * @generated
     */
    EReference getDAS_ControllingLNode();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getProcessEcho <em>Process Echo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Process Echo</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getProcessEcho()
     * @see #getDAS()
     * @generated
     */
    EReference getDAS_ProcessEcho();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLogParametersRef <em>Log Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Log Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLogParametersRef()
     * @see #getDAS()
     * @generated
     */
    EReference getDAS_LogParametersRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getVal <em>Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Val</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getVal()
     * @see #getDAS()
     * @generated
     */
    EReference getDAS_Val();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Labels</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getLabels()
     * @see #getDAS()
     * @generated
     */
    EReference getDAS_Labels();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getIx <em>Ix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getIx()
     * @see #getDAS()
     * @generated
     */
    EAttribute getDAS_Ix();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getMappedDaName <em>Mapped Da Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mapped Da Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getMappedDaName()
     * @see #getDAS()
     * @generated
     */
    EAttribute getDAS_MappedDaName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getMappedLnUuid <em>Mapped Ln Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mapped Ln Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getMappedLnUuid()
     * @see #getDAS()
     * @generated
     */
    EAttribute getDAS_MappedLnUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getName()
     * @see #getDAS()
     * @generated
     */
    EAttribute getDAS_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#isValImport <em>Val Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Val Import</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#isValImport()
     * @see #getDAS()
     * @generated
     */
    EAttribute getDAS_ValImport();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getValKind <em>Val Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Val Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getValKind()
     * @see #getDAS()
     * @generated
     */
    EAttribute getDAS_ValKind();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DOS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getParentDOS()
     * @see #getDAS()
     * @generated
     */
    EReference getDAS_ParentDOS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getParentSDS <em>Parent SDS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SDS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getParentSDS()
     * @see #getDAS()
     * @generated
     */
    EReference getDAS_ParentSDS();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS#getRefersToAnyLN()
     * @see #getDAS()
     * @generated
     */
    EReference getDAS_RefersToAnyLN();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS <em>DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DOS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS
     * @generated
     */
    EClass getDOS();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSDS <em>SDS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SDS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSDS()
     * @see #getDOS()
     * @generated
     */
    EReference getDOS_SDS();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getDAS <em>DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>DAS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getDAS()
     * @see #getDOS()
     * @generated
     */
    EReference getDOS_DAS();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSubscriberLNode <em>Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Subscriber LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getSubscriberLNode()
     * @see #getDOS()
     * @generated
     */
    EReference getDOS_SubscriberLNode();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getControllingLNode <em>Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Controlling LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getControllingLNode()
     * @see #getDOS()
     * @generated
     */
    EReference getDOS_ControllingLNode();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getProcessEcho <em>Process Echo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Process Echo</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getProcessEcho()
     * @see #getDOS()
     * @generated
     */
    EReference getDOS_ProcessEcho();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLogParametersRef <em>Log Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Log Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLogParametersRef()
     * @see #getDOS()
     * @generated
     */
    EReference getDOS_LogParametersRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Labels</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getLabels()
     * @see #getDOS()
     * @generated
     */
    EReference getDOS_Labels();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getMappedDoName <em>Mapped Do Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mapped Do Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getMappedDoName()
     * @see #getDOS()
     * @generated
     */
    EAttribute getDOS_MappedDoName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getMappedLnUuid <em>Mapped Ln Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mapped Ln Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getMappedLnUuid()
     * @see #getDOS()
     * @generated
     */
    EAttribute getDOS_MappedLnUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getName()
     * @see #getDOS()
     * @generated
     */
    EAttribute getDOS_Name();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS#getRefersToAnyLN()
     * @see #getDOS()
     * @generated
     */
    EReference getDOS_RefersToAnyLN();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory <em>Function Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Category</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory
     * @generated
     */
    EClass getFunctionCategory();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getSubCategory <em>Sub Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Category</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getSubCategory()
     * @see #getFunctionCategory()
     * @generated
     */
    EReference getFunctionCategory_SubCategory();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getFunctionCatRef <em>Function Cat Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function Cat Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getFunctionCatRef()
     * @see #getFunctionCategory()
     * @generated
     */
    EReference getFunctionCategory_FunctionCatRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getName()
     * @see #getFunctionCategory()
     * @generated
     */
    EAttribute getFunctionCategory_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getOriginUuid()
     * @see #getFunctionCategory()
     * @generated
     */
    EAttribute getFunctionCategory_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getTemplateUuid()
     * @see #getFunctionCategory()
     * @generated
     */
    EAttribute getFunctionCategory_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getUuid()
     * @see #getFunctionCategory()
     * @generated
     */
    EAttribute getFunctionCategory_Uuid();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getReferredByFunctionCategoryRef <em>Referred By Function Category Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Function Category Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategory#getReferredByFunctionCategoryRef()
     * @see #getFunctionCategory()
     * @generated
     */
    EReference getFunctionCategory_ReferredByFunctionCategoryRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef <em>Function Category Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Category Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef
     * @generated
     */
    EClass getFunctionCategoryRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getFunctionCategory <em>Function Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Function Category</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getFunctionCategory()
     * @see #getFunctionCategoryRef()
     * @generated
     */
    EAttribute getFunctionCategoryRef_FunctionCategory();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getFunctionCategoryUuid <em>Function Category Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Function Category Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getFunctionCategoryUuid()
     * @see #getFunctionCategoryRef()
     * @generated
     */
    EAttribute getFunctionCategoryRef_FunctionCategoryUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function Role Content</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getParentFunctionRoleContent()
     * @see #getFunctionCategoryRef()
     * @generated
     */
    EReference getFunctionCategoryRef_ParentFunctionRoleContent();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getRefersToFunctionCategory <em>Refers To Function Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Function Category</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCategoryRef#getRefersToFunctionCategory()
     * @see #getFunctionCategoryRef()
     * @generated
     */
    EReference getFunctionCategoryRef_RefersToFunctionCategory();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef <em>Function Cat Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Cat Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef
     * @generated
     */
    EClass getFunctionCatRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getFunction()
     * @see #getFunctionCatRef()
     * @generated
     */
    EAttribute getFunctionCatRef_Function();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getFunctionUuid <em>Function Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Function Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getFunctionUuid()
     * @see #getFunctionCatRef()
     * @generated
     */
    EAttribute getFunctionCatRef_FunctionUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getParentFunctionCategory <em>Parent Function Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function Category</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getParentFunctionCategory()
     * @see #getFunctionCatRef()
     * @generated
     */
    EReference getFunctionCatRef_ParentFunctionCategory();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getRefersToFunction <em>Refers To Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionCatRef#getRefersToFunction()
     * @see #getFunctionCatRef()
     * @generated
     */
    EReference getFunctionCatRef_RefersToFunction();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef <em>Function Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef
     * @generated
     */
    EClass getFunctionRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getSignalRole <em>Signal Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Signal Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getSignalRole()
     * @see #getFunctionRef()
     * @generated
     */
    EReference getFunctionRef_SignalRole();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getFunction()
     * @see #getFunctionRef()
     * @generated
     */
    EAttribute getFunctionRef_Function();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getFunctionUuid <em>Function Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Function Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getFunctionUuid()
     * @see #getFunctionRef()
     * @generated
     */
    EAttribute getFunctionRef_FunctionUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getParentAllocationRole <em>Parent Allocation Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Allocation Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getParentAllocationRole()
     * @see #getFunctionRef()
     * @generated
     */
    EReference getFunctionRef_ParentAllocationRole();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function Role Content</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getParentFunctionRoleContent()
     * @see #getFunctionRef()
     * @generated
     */
    EReference getFunctionRef_ParentFunctionRoleContent();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getRefersToFunction <em>Refers To Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRef#getRefersToFunction()
     * @see #getFunctionRef()
     * @generated
     */
    EReference getFunctionRef_RefersToFunction();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole <em>Function Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole
     * @generated
     */
    EClass getFunctionRole();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getFunctionRoleContent <em>Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function Role Content</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getFunctionRoleContent()
     * @see #getFunctionRole()
     * @generated
     */
    EReference getFunctionRole_FunctionRoleContent();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getCardinality <em>Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cardinality</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getCardinality()
     * @see #getFunctionRole()
     * @generated
     */
    EAttribute getFunctionRole_Cardinality();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getMax()
     * @see #getFunctionRole()
     * @generated
     */
    EAttribute getFunctionRole_Max();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getName()
     * @see #getFunctionRole()
     * @generated
     */
    EAttribute getFunctionRole_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getOriginUuid()
     * @see #getFunctionRole()
     * @generated
     */
    EAttribute getFunctionRole_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selector</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getSelector()
     * @see #getFunctionRole()
     * @generated
     */
    EAttribute getFunctionRole_Selector();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getTemplateUuid()
     * @see #getFunctionRole()
     * @generated
     */
    EAttribute getFunctionRole_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getType()
     * @see #getFunctionRole()
     * @generated
     */
    EAttribute getFunctionRole_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getUuid()
     * @see #getFunctionRole()
     * @generated
     */
    EAttribute getFunctionRole_Uuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getParentApplication <em>Parent Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Application</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRole#getParentApplication()
     * @see #getFunctionRole()
     * @generated
     */
    EReference getFunctionRole_ParentApplication();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent <em>Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Role Content</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent
     * @generated
     */
    EClass getFunctionRoleContent();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionRef <em>Function Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionRef()
     * @see #getFunctionRoleContent()
     * @generated
     */
    EReference getFunctionRoleContent_FunctionRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getBehaviorDescriptionRef <em>Behavior Description Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Behavior Description Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getBehaviorDescriptionRef()
     * @see #getFunctionRoleContent()
     * @generated
     */
    EReference getFunctionRoleContent_BehaviorDescriptionRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getProcessResourceRef <em>Process Resource Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Process Resource Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getProcessResourceRef()
     * @see #getFunctionRoleContent()
     * @generated
     */
    EReference getFunctionRoleContent_ProcessResourceRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getVariableRef <em>Variable Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getVariableRef()
     * @see #getFunctionRoleContent()
     * @generated
     */
    EReference getFunctionRoleContent_VariableRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionCategoryRef <em>Function Category Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function Category Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getFunctionCategoryRef()
     * @see #getFunctionRoleContent()
     * @generated
     */
    EReference getFunctionRoleContent_FunctionCategoryRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getPowerSystemRelationRef <em>Power System Relation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Power System Relation Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getPowerSystemRelationRef()
     * @see #getFunctionRoleContent()
     * @generated
     */
    EReference getFunctionRoleContent_PowerSystemRelationRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getRoleInst <em>Role Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Role Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getRoleInst()
     * @see #getFunctionRoleContent()
     * @generated
     */
    EAttribute getFunctionRoleContent_RoleInst();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getParentFunctionRole <em>Parent Function Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionRoleContent#getParentFunctionRole()
     * @see #getFunctionRoleContent()
     * @generated
     */
    EReference getFunctionRoleContent_ParentFunctionRole();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef <em>Function Scl Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Scl Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef
     * @generated
     */
    EClass getFunctionSclRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef#getSclFileReference <em>Scl File Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Scl File Reference</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionSclRef#getSclFileReference()
     * @see #getFunctionSclRef()
     * @generated
     */
    EReference getFunctionSclRef_SclFileReference();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate <em>Function Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Template</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate
     * @generated
     */
    EClass getFunctionTemplate();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate#getSubFunctionTemplate <em>Sub Function Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Function Template</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate#getSubFunctionTemplate()
     * @see #getFunctionTemplate()
     * @generated
     */
    EReference getFunctionTemplate_SubFunctionTemplate();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate#getGeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>General Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate#getGeneralEquipment()
     * @see #getFunctionTemplate()
     * @generated
     */
    EReference getFunctionTemplate_GeneralEquipment();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate#getConductingEquipment()
     * @see #getFunctionTemplate()
     * @generated
     */
    EReference getFunctionTemplate_ConductingEquipment();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionTemplate#getType()
     * @see #getFunctionTemplate()
     * @generated
     */
    EAttribute getFunctionTemplate_Type();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant <em>Functional Sub Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Sub Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant
     * @generated
     */
    EClass getFunctionalSubVariant();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant#getParentAbstractFunctionalVariant <em>Parent Abstract Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Abstract Functional Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalSubVariant#getParentAbstractFunctionalVariant()
     * @see #getFunctionalSubVariant()
     * @generated
     */
    EReference getFunctionalSubVariant_ParentAbstractFunctionalVariant();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant <em>Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant
     * @generated
     */
    EClass getFunctionalVariant();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getParentApplication <em>Parent Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Application</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getParentApplication()
     * @see #getFunctionalVariant()
     * @generated
     */
    EReference getFunctionalVariant_ParentApplication();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getParentFunctionalVariantGroup <em>Parent Functional Variant Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Functional Variant Group</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getParentFunctionalVariantGroup()
     * @see #getFunctionalVariant()
     * @generated
     */
    EReference getFunctionalVariant_ParentFunctionalVariantGroup();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getReferredByFunctionalVariantRef <em>Referred By Functional Variant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Functional Variant Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariant#getReferredByFunctionalVariantRef()
     * @see #getFunctionalVariant()
     * @generated
     */
    EReference getFunctionalVariant_ReferredByFunctionalVariantRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup <em>Functional Variant Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Variant Group</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup
     * @generated
     */
    EClass getFunctionalVariantGroup();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getFunctionalVariant <em>Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Functional Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getFunctionalVariant()
     * @see #getFunctionalVariantGroup()
     * @generated
     */
    EReference getFunctionalVariantGroup_FunctionalVariant();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getName()
     * @see #getFunctionalVariantGroup()
     * @generated
     */
    EAttribute getFunctionalVariantGroup_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getOriginUuid()
     * @see #getFunctionalVariantGroup()
     * @generated
     */
    EAttribute getFunctionalVariantGroup_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getTemplateUuid()
     * @see #getFunctionalVariantGroup()
     * @generated
     */
    EAttribute getFunctionalVariantGroup_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getUuid()
     * @see #getFunctionalVariantGroup()
     * @generated
     */
    EAttribute getFunctionalVariantGroup_Uuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getParentApplication <em>Parent Application</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Application</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantGroup#getParentApplication()
     * @see #getFunctionalVariantGroup()
     * @generated
     */
    EReference getFunctionalVariantGroup_ParentApplication();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef <em>Functional Variant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Variant Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef
     * @generated
     */
    EClass getFunctionalVariantRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getFunctionalVariant <em>Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Functional Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getFunctionalVariant()
     * @see #getFunctionalVariantRef()
     * @generated
     */
    EAttribute getFunctionalVariantRef_FunctionalVariant();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getFunctionalVariantUuid <em>Functional Variant Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Functional Variant Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getFunctionalVariantUuid()
     * @see #getFunctionalVariantRef()
     * @generated
     */
    EAttribute getFunctionalVariantRef_FunctionalVariantUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getUpdate <em>Update</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Update</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getUpdate()
     * @see #getFunctionalVariantRef()
     * @generated
     */
    EAttribute getFunctionalVariantRef_Update();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getParentFunctionalVariantRefContainer <em>Parent Functional Variant Ref Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Functional Variant Ref Container</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getParentFunctionalVariantRefContainer()
     * @see #getFunctionalVariantRef()
     * @generated
     */
    EReference getFunctionalVariantRef_ParentFunctionalVariantRefContainer();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getRefersToFunctionalVariant <em>Refers To Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Functional Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRef#getRefersToFunctionalVariant()
     * @see #getFunctionalVariantRef()
     * @generated
     */
    EReference getFunctionalVariantRef_RefersToFunctionalVariant();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer <em>Functional Variant Ref Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Functional Variant Ref Container</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer
     * @generated
     */
    EClass getFunctionalVariantRefContainer();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer#getFunctionalVariantRef <em>Functional Variant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Functional Variant Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.FunctionalVariantRefContainer#getFunctionalVariantRef()
     * @see #getFunctionalVariantRefContainer()
     * @generated
     */
    EReference getFunctionalVariantRefContainer_FunctionalVariantRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters <em>Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Goose Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters
     * @generated
     */
    EClass getGooseParameters();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL2CommParameters <em>L2 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>L2 Comm Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL2CommParameters()
     * @see #getGooseParameters()
     * @generated
     */
    EReference getGooseParameters_L2CommParameters();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>L3I Pv4 Comm Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv4CommParameters()
     * @see #getGooseParameters()
     * @generated
     */
    EReference getGooseParameters_L3IPv4CommParameters();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>L3I Pv6 Comm Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getL3IPv6CommParameters()
     * @see #getGooseParameters()
     * @generated
     */
    EReference getGooseParameters_L3IPv6CommParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getGoId <em>Go Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Go Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getGoId()
     * @see #getGooseParameters()
     * @generated
     */
    EAttribute getGooseParameters_GoId();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getMaxTime <em>Max Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getMaxTime()
     * @see #getGooseParameters()
     * @generated
     */
    EAttribute getGooseParameters_MaxTime();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getMinTime <em>Min Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getMinTime()
     * @see #getGooseParameters()
     * @generated
     */
    EAttribute getGooseParameters_MinTime();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#isSecurityEnabled <em>Security Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Security Enabled</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#isSecurityEnabled()
     * @see #getGooseParameters()
     * @generated
     */
    EAttribute getGooseParameters_SecurityEnabled();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Comm Service Specifications</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentCommServiceSpecifications()
     * @see #getGooseParameters()
     * @generated
     */
    EReference getGooseParameters_ParentCommServiceSpecifications();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service Specifications</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getParentServiceSpecifications()
     * @see #getGooseParameters()
     * @generated
     */
    EReference getGooseParameters_ParentServiceSpecifications();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getReferredByGooseParametersRef <em>Referred By Goose Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred By Goose Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParameters#getReferredByGooseParametersRef()
     * @see #getGooseParameters()
     * @generated
     */
    EReference getGooseParameters_ReferredByGooseParametersRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef <em>Goose Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Goose Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef
     * @generated
     */
    EClass getGooseParametersRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Subscriber LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSubscriberLNode()
     * @see #getGooseParametersRef()
     * @generated
     */
    EReference getGooseParametersRef_ParentSubscriberLNode();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSourceRef <em>Parent Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getParentSourceRef()
     * @see #getGooseParametersRef()
     * @generated
     */
    EReference getGooseParametersRef_ParentSourceRef();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getRefersToGooseParameters <em>Refers To Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Goose Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.GooseParametersRef#getRefersToGooseParameters()
     * @see #getGooseParametersRef()
     * @generated
     */
    EReference getGooseParametersRef_RefersToGooseParameters();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar <em>Input Var</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Var</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar
     * @generated
     */
    EClass getInputVar();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getInputName <em>Input Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getInputName()
     * @see #getInputVar()
     * @generated
     */
    EAttribute getInputVar_InputName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getInputUuid <em>Input Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getInputUuid()
     * @see #getInputVar()
     * @generated
     */
    EAttribute getInputVar_InputUuid();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getRefersToSourceRef <em>Refers To Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getRefersToSourceRef()
     * @see #getInputVar()
     * @generated
     */
    EReference getInputVar_RefersToSourceRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getParentBehaviorDescription <em>Parent Behavior Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Behavior Description</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVar#getParentBehaviorDescription()
     * @see #getInputVar()
     * @generated
     */
    EReference getInputVar_ParentBehaviorDescription();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef <em>Input Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Var Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef
     * @generated
     */
    EClass getInputVarRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef#getParentBehaviorDescriptionRef <em>Parent Behavior Description Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Behavior Description Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.InputVarRef#getParentBehaviorDescriptionRef()
     * @see #getInputVarRef()
     * @generated
     */
    EReference getInputVarRef_ParentBehaviorDescriptionRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters <em>L2 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>L2 Comm Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters
     * @generated
     */
    EClass getL2CommParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getMacAddr <em>Mac Addr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mac Addr</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getMacAddr()
     * @see #getL2CommParameters()
     * @generated
     */
    EAttribute getL2CommParameters_MacAddr();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentGooseParameters <em>Parent Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Goose Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentGooseParameters()
     * @see #getL2CommParameters()
     * @generated
     */
    EReference getL2CommParameters_ParentGooseParameters();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentSMVParameters <em>Parent SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SMV Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L2CommParameters#getParentSMVParameters()
     * @see #getL2CommParameters()
     * @generated
     */
    EReference getL2CommParameters_ParentSMVParameters();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>L3I Pv4 Comm Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters
     * @generated
     */
    EClass getL3IPv4CommParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getIPv4 <em>IPv4</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>IPv4</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getIPv4()
     * @see #getL3IPv4CommParameters()
     * @generated
     */
    EAttribute getL3IPv4CommParameters_IPv4();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getIPv4IGMPv3Src <em>IPv4 IGM Pv3 Src</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>IPv4 IGM Pv3 Src</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getIPv4IGMPv3Src()
     * @see #getL3IPv4CommParameters()
     * @generated
     */
    EAttribute getL3IPv4CommParameters_IPv4IGMPv3Src();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentGooseParameters <em>Parent Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Goose Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentGooseParameters()
     * @see #getL3IPv4CommParameters()
     * @generated
     */
    EReference getL3IPv4CommParameters_ParentGooseParameters();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentSMVParameters <em>Parent SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SMV Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv4CommParameters#getParentSMVParameters()
     * @see #getL3IPv4CommParameters()
     * @generated
     */
    EReference getL3IPv4CommParameters_ParentSMVParameters();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>L3I Pv6 Comm Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters
     * @generated
     */
    EClass getL3IPv6CommParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getIPv6 <em>IPv6</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>IPv6</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getIPv6()
     * @see #getL3IPv6CommParameters()
     * @generated
     */
    EAttribute getL3IPv6CommParameters_IPv6();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getIPv6IGMPv3Src <em>IPv6 IGM Pv3 Src</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>IPv6 IGM Pv3 Src</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getIPv6IGMPv3Src()
     * @see #getL3IPv6CommParameters()
     * @generated
     */
    EAttribute getL3IPv6CommParameters_IPv6IGMPv3Src();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getParentGooseParameters <em>Parent Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Goose Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getParentGooseParameters()
     * @see #getL3IPv6CommParameters()
     * @generated
     */
    EReference getL3IPv6CommParameters_ParentGooseParameters();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getParentSMVParameters <em>Parent SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SMV Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.L3IPv6CommParameters#getParentSMVParameters()
     * @see #getL3IPv6CommParameters()
     * @generated
     */
    EReference getL3IPv6CommParameters_ParentSMVParameters();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDARef <em>Link FCDA Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link FCDA Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDARef
     * @generated
     */
    EClass getLinkFCDARef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDARef#getPDA <em>PDA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PDA</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDARef#getPDA()
     * @see #getLinkFCDARef()
     * @generated
     */
    EAttribute getLinkFCDARef_PDA();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef <em>Link FCD Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link FCD Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef
     * @generated
     */
    EClass getLinkFCDRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getOriginUuid()
     * @see #getLinkFCDRef()
     * @generated
     */
    EAttribute getLinkFCDRef_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getPDO <em>PDO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PDO</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getPDO()
     * @see #getLinkFCDRef()
     * @generated
     */
    EAttribute getLinkFCDRef_PDO();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getPLN <em>PLN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PLN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getPLN()
     * @see #getLinkFCDRef()
     * @generated
     */
    EAttribute getLinkFCDRef_PLN();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getResourceName <em>Resource Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getResourceName()
     * @see #getLinkFCDRef()
     * @generated
     */
    EAttribute getLinkFCDRef_ResourceName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getResourceUuid <em>Resource Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getResourceUuid()
     * @see #getLinkFCDRef()
     * @generated
     */
    EAttribute getLinkFCDRef_ResourceUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getTemplateUuid()
     * @see #getLinkFCDRef()
     * @generated
     */
    EAttribute getLinkFCDRef_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LinkFCDRef#getUuid()
     * @see #getLinkFCDRef()
     * @generated
     */
    EAttribute getLinkFCDRef_Uuid();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef <em>LNode Data Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LNode Data Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef
     * @generated
     */
    EClass getLNodeDataRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getDaName <em>Da Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Da Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getDaName()
     * @see #getLNodeDataRef()
     * @generated
     */
    EAttribute getLNodeDataRef_DaName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getData <em>Data</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getData()
     * @see #getLNodeDataRef()
     * @generated
     */
    EAttribute getLNodeDataRef_Data();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getDoName <em>Do Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Do Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getDoName()
     * @see #getLNodeDataRef()
     * @generated
     */
    EAttribute getLNodeDataRef_DoName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getLnodeUuid <em>Lnode Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lnode Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getLnodeUuid()
     * @see #getLNodeDataRef()
     * @generated
     */
    EAttribute getLNodeDataRef_LnodeUuid();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getRefersToLNode <em>Refers To LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getRefersToLNode()
     * @see #getLNodeDataRef()
     * @generated
     */
    EReference getLNodeDataRef_RefersToLNode();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getParentSignalRole <em>Parent Signal Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Signal Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeDataRef#getParentSignalRole()
     * @see #getLNodeDataRef()
     * @generated
     */
    EReference getLNodeDataRef_ParentSignalRole();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef <em>LNode Input Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LNode Input Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef
     * @generated
     */
    EClass getLNodeInputRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getSourceRef()
     * @see #getLNodeInputRef()
     * @generated
     */
    EAttribute getLNodeInputRef_SourceRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getSourceRefUuid <em>Source Ref Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Ref Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getSourceRefUuid()
     * @see #getLNodeInputRef()
     * @generated
     */
    EAttribute getLNodeInputRef_SourceRefUuid();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getRefersToSourceRef <em>Refers To Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getRefersToSourceRef()
     * @see #getLNodeInputRef()
     * @generated
     */
    EReference getLNodeInputRef_RefersToSourceRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getParentSignalRole <em>Parent Signal Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Signal Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputRef#getParentSignalRole()
     * @see #getLNodeInputRef()
     * @generated
     */
    EReference getLNodeInputRef_ParentSignalRole();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs <em>LNode Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LNode Inputs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs
     * @generated
     */
    EClass getLNodeInputs();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs#getSourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeInputs#getSourceRef()
     * @see #getLNodeInputs()
     * @generated
     */
    EReference getLNodeInputs_SourceRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef <em>LNode Output Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LNode Output Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef
     * @generated
     */
    EClass getLNodeOutputRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getControlRef <em>Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Control Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getControlRef()
     * @see #getLNodeOutputRef()
     * @generated
     */
    EAttribute getLNodeOutputRef_ControlRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getControlRefUuid <em>Control Ref Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Control Ref Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getControlRefUuid()
     * @see #getLNodeOutputRef()
     * @generated
     */
    EAttribute getLNodeOutputRef_ControlRefUuid();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getRefersToControlRef <em>Refers To Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Control Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getRefersToControlRef()
     * @see #getLNodeOutputRef()
     * @generated
     */
    EReference getLNodeOutputRef_RefersToControlRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getParentSignalRole <em>Parent Signal Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Signal Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputRef#getParentSignalRole()
     * @see #getLNodeOutputRef()
     * @generated
     */
    EReference getLNodeOutputRef_ParentSignalRole();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs <em>LNode Outputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LNode Outputs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs
     * @generated
     */
    EClass getLNodeOutputs();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs#getControlRef <em>Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Control Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeOutputs#getControlRef()
     * @see #getLNodeOutputs()
     * @generated
     */
    EReference getLNodeOutputs_ControlRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming <em>LNode Spec Naming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LNode Spec Naming</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming
     * @generated
     */
    EClass getLNodeSpecNaming();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSIedName <em>SIed Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SIed Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSIedName()
     * @see #getLNodeSpecNaming()
     * @generated
     */
    EAttribute getLNodeSpecNaming_SIedName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLdInst <em>SLd Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SLd Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLdInst()
     * @see #getLNodeSpecNaming()
     * @generated
     */
    EAttribute getLNodeSpecNaming_SLdInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLnClass <em>SLn Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SLn Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLnClass()
     * @see #getLNodeSpecNaming()
     * @generated
     */
    EAttribute getLNodeSpecNaming_SLnClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLnInst <em>SLn Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SLn Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSLnInst()
     * @see #getLNodeSpecNaming()
     * @generated
     */
    EAttribute getLNodeSpecNaming_SLnInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSPrefix <em>SPrefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SPrefix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LNodeSpecNaming#getSPrefix()
     * @see #getLNodeSpecNaming()
     * @generated
     */
    EAttribute getLNodeSpecNaming_SPrefix();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters <em>Log Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Log Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters
     * @generated
     */
    EClass getLogParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getIntgPd <em>Intg Pd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intg Pd</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getIntgPd()
     * @see #getLogParameters()
     * @generated
     */
    EAttribute getLogParameters_IntgPd();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isLogEna <em>Log Ena</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log Ena</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isLogEna()
     * @see #getLogParameters()
     * @generated
     */
    EAttribute getLogParameters_LogEna();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLdInst <em>Log Ld Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log Ld Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLdInst()
     * @see #getLogParameters()
     * @generated
     */
    EAttribute getLogParameters_LogLdInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLnClass <em>Log Ln Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log Ln Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLnClass()
     * @see #getLogParameters()
     * @generated
     */
    EAttribute getLogParameters_LogLnClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLnInst <em>Log Ln Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log Ln Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogLnInst()
     * @see #getLogParameters()
     * @generated
     */
    EAttribute getLogParameters_LogLnInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogName <em>Log Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogName()
     * @see #getLogParameters()
     * @generated
     */
    EAttribute getLogParameters_LogName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogPrefix <em>Log Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log Prefix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getLogPrefix()
     * @see #getLogParameters()
     * @generated
     */
    EAttribute getLogParameters_LogPrefix();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isReasonCode <em>Reason Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reason Code</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#isReasonCode()
     * @see #getLogParameters()
     * @generated
     */
    EAttribute getLogParameters_ReasonCode();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service Specifications</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getParentServiceSpecifications()
     * @see #getLogParameters()
     * @generated
     */
    EReference getLogParameters_ParentServiceSpecifications();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getReferredByLogParametersRef <em>Referred By Log Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Log Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParameters#getReferredByLogParametersRef()
     * @see #getLogParameters()
     * @generated
     */
    EReference getLogParameters_ReferredByLogParametersRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef <em>Log Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Log Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef
     * @generated
     */
    EClass getLogParametersRef();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getRefersToLogParameters <em>Refers To Log Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Log Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getRefersToLogParameters()
     * @see #getLogParametersRef()
     * @generated
     */
    EReference getLogParametersRef_RefersToLogParameters();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDAS <em>Parent DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DAS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDAS()
     * @see #getLogParametersRef()
     * @generated
     */
    EReference getLogParametersRef_ParentDAS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DOS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentDOS()
     * @see #getLogParametersRef()
     * @generated
     */
    EReference getLogParametersRef_ParentDOS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentSDS <em>Parent SDS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SDS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogParametersRef#getParentSDS()
     * @see #getLogParametersRef()
     * @generated
     */
    EReference getLogParametersRef_ParentSDS();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef <em>Logic Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Logic Var Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef
     * @generated
     */
    EClass getLogicVarRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDaName <em>Da Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Da Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDaName()
     * @see #getLogicVarRef()
     * @generated
     */
    EAttribute getLogicVarRef_DaName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDataName <em>Data Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDataName()
     * @see #getLogicVarRef()
     * @generated
     */
    EAttribute getLogicVarRef_DataName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDoName <em>Do Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Do Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getDoName()
     * @see #getLogicVarRef()
     * @generated
     */
    EAttribute getLogicVarRef_DoName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getLnodeUuid <em>Lnode Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lnode Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getLnodeUuid()
     * @see #getLogicVarRef()
     * @generated
     */
    EAttribute getLogicVarRef_LnodeUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getValue()
     * @see #getLogicVarRef()
     * @generated
     */
    EAttribute getLogicVarRef_Value();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getVarName <em>Var Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Var Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getVarName()
     * @see #getLogicVarRef()
     * @generated
     */
    EAttribute getLogicVarRef_VarName();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getRefersToLNode <em>Refers To LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.LogicVarRef#getRefersToLNode()
     * @see #getLogicVarRef()
     * @generated
     */
    EReference getLogicVarRef_RefersToLNode();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar <em>Output Var</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Var</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar
     * @generated
     */
    EClass getOutputVar();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getOutputName <em>Output Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getOutputName()
     * @see #getOutputVar()
     * @generated
     */
    EAttribute getOutputVar_OutputName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getOutputUuid <em>Output Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Output Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getOutputUuid()
     * @see #getOutputVar()
     * @generated
     */
    EAttribute getOutputVar_OutputUuid();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getRefersToControlRef <em>Refers To Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Control Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getRefersToControlRef()
     * @see #getOutputVar()
     * @generated
     */
    EReference getOutputVar_RefersToControlRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getParentBehaviorDescription <em>Parent Behavior Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Behavior Description</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVar#getParentBehaviorDescription()
     * @see #getOutputVar()
     * @generated
     */
    EReference getOutputVar_ParentBehaviorDescription();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef <em>Output Var Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Var Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef
     * @generated
     */
    EClass getOutputVarRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef#getParentBehaviorDescriptionRef <em>Parent Behavior Description Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Behavior Description Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutputVarRef#getParentBehaviorDescriptionRef()
     * @see #getOutputVarRef()
     * @generated
     */
    EReference getOutputVarRef_ParentBehaviorDescriptionRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation <em>Power System Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Power System Relation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation
     * @generated
     */
    EClass getPowerSystemRelation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getName()
     * @see #getPowerSystemRelation()
     * @generated
     */
    EAttribute getPowerSystemRelation_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getOriginUuid()
     * @see #getPowerSystemRelation()
     * @generated
     */
    EAttribute getPowerSystemRelation_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getRelation <em>Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Relation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getRelation()
     * @see #getPowerSystemRelation()
     * @generated
     */
    EAttribute getPowerSystemRelation_Relation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getRelationUuid <em>Relation Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Relation Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getRelationUuid()
     * @see #getPowerSystemRelation()
     * @generated
     */
    EAttribute getPowerSystemRelation_RelationUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selector</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getSelector()
     * @see #getPowerSystemRelation()
     * @generated
     */
    EAttribute getPowerSystemRelation_Selector();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getTemplateUuid()
     * @see #getPowerSystemRelation()
     * @generated
     */
    EAttribute getPowerSystemRelation_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getUuid()
     * @see #getPowerSystemRelation()
     * @generated
     */
    EAttribute getPowerSystemRelation_Uuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getParentPowerSystemRelation <em>Parent Power System Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Power System Relation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getParentPowerSystemRelation()
     * @see #getPowerSystemRelation()
     * @generated
     */
    EReference getPowerSystemRelation_ParentPowerSystemRelation();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getReferredByPowerSystemRelationRef <em>Referred By Power System Relation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Power System Relation Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelation#getReferredByPowerSystemRelationRef()
     * @see #getPowerSystemRelation()
     * @generated
     */
    EReference getPowerSystemRelation_ReferredByPowerSystemRelationRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef <em>Power System Relation Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Power System Relation Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef
     * @generated
     */
    EClass getPowerSystemRelationRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getPowerSystemRelation <em>Power System Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Power System Relation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getPowerSystemRelation()
     * @see #getPowerSystemRelationRef()
     * @generated
     */
    EAttribute getPowerSystemRelationRef_PowerSystemRelation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getPowerSystemRelationUuid <em>Power System Relation Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Power System Relation Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getPowerSystemRelationUuid()
     * @see #getPowerSystemRelationRef()
     * @generated
     */
    EAttribute getPowerSystemRelationRef_PowerSystemRelationUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function Role Content</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getParentFunctionRoleContent()
     * @see #getPowerSystemRelationRef()
     * @generated
     */
    EReference getPowerSystemRelationRef_ParentFunctionRoleContent();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getRefersToPowerSystemRelation <em>Refers To Power System Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Power System Relation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelationRef#getRefersToPowerSystemRelation()
     * @see #getPowerSystemRelationRef()
     * @generated
     */
    EReference getPowerSystemRelationRef_RefersToPowerSystemRelation();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations <em>Power System Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Power System Relations</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations
     * @generated
     */
    EClass getPowerSystemRelations();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations#getPowerSystemRelation <em>Power System Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Power System Relation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.PowerSystemRelations#getPowerSystemRelation()
     * @see #getPowerSystemRelations()
     * @generated
     */
    EReference getPowerSystemRelations_PowerSystemRelation();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho <em>Process Echo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Echo</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho
     * @generated
     */
    EClass getProcessEcho();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSource()
     * @see #getProcessEcho()
     * @generated
     */
    EAttribute getProcessEcho_Source();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceDaName <em>Source Da Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Da Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceDaName()
     * @see #getProcessEcho()
     * @generated
     */
    EAttribute getProcessEcho_SourceDaName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceDoName <em>Source Do Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Do Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceDoName()
     * @see #getProcessEcho()
     * @generated
     */
    EAttribute getProcessEcho_SourceDoName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceLNodeUuid <em>Source LNode Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source LNode Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getSourceLNodeUuid()
     * @see #getProcessEcho()
     * @generated
     */
    EAttribute getProcessEcho_SourceLNodeUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDAS <em>Parent DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DAS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDAS()
     * @see #getProcessEcho()
     * @generated
     */
    EReference getProcessEcho_ParentDAS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DOS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentDOS()
     * @see #getProcessEcho()
     * @generated
     */
    EReference getProcessEcho_ParentDOS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentSDS <em>Parent SDS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SDS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getParentSDS()
     * @see #getProcessEcho()
     * @generated
     */
    EReference getProcessEcho_ParentSDS();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getRefersToLNode <em>Refers To LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessEcho#getRefersToLNode()
     * @see #getProcessEcho()
     * @generated
     */
    EReference getProcessEcho_RefersToLNode();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource <em>Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource
     * @generated
     */
    EClass getProcessResource();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getResource()
     * @see #getProcessResource()
     * @generated
     */
    EReference getProcessResource_Resource();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getCardinality <em>Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cardinality</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getCardinality()
     * @see #getProcessResource()
     * @generated
     */
    EAttribute getProcessResource_Cardinality();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getMax()
     * @see #getProcessResource()
     * @generated
     */
    EAttribute getProcessResource_Max();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getName()
     * @see #getProcessResource()
     * @generated
     */
    EAttribute getProcessResource_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getOriginUuid()
     * @see #getProcessResource()
     * @generated
     */
    EAttribute getProcessResource_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selector</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getSelector()
     * @see #getProcessResource()
     * @generated
     */
    EAttribute getProcessResource_Selector();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getTemplateUuid()
     * @see #getProcessResource()
     * @generated
     */
    EAttribute getProcessResource_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getUuid()
     * @see #getProcessResource()
     * @generated
     */
    EAttribute getProcessResource_Uuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getParentProcessResources <em>Parent Process Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Process Resources</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getParentProcessResources()
     * @see #getProcessResource()
     * @generated
     */
    EReference getProcessResource_ParentProcessResources();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByProcessResourceRef <em>Referred By Process Resource Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Process Resource Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByProcessResourceRef()
     * @see #getProcessResource()
     * @generated
     */
    EReference getProcessResource_ReferredByProcessResourceRef();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControllingLNode <em>Referred By Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Controlling LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControllingLNode()
     * @see #getProcessResource()
     * @generated
     */
    EReference getProcessResource_ReferredByControllingLNode();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredBySubscriberLNode <em>Referred By Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Subscriber LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredBySubscriberLNode()
     * @see #getProcessResource()
     * @generated
     */
    EReference getProcessResource_ReferredBySubscriberLNode();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControlRef <em>Referred By Control Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Control Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredByControlRef()
     * @see #getProcessResource()
     * @generated
     */
    EReference getProcessResource_ReferredByControlRef();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredbySourceRef <em>Referredby Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referredby Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResource#getReferredbySourceRef()
     * @see #getProcessResource()
     * @generated
     */
    EReference getProcessResource_ReferredbySourceRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef <em>Process Resource Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Resource Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef
     * @generated
     */
    EClass getProcessResourceRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getProcessResource <em>Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getProcessResource()
     * @see #getProcessResourceRef()
     * @generated
     */
    EAttribute getProcessResourceRef_ProcessResource();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getProcessResourceUuid <em>Process Resource Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Resource Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getProcessResourceUuid()
     * @see #getProcessResourceRef()
     * @generated
     */
    EAttribute getProcessResourceRef_ProcessResourceUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function Role Content</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getParentFunctionRoleContent()
     * @see #getProcessResourceRef()
     * @generated
     */
    EReference getProcessResourceRef_ParentFunctionRoleContent();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Process Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResourceRef#getRefersToProcessResource()
     * @see #getProcessResourceRef()
     * @generated
     */
    EReference getProcessResourceRef_RefersToProcessResource();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources <em>Process Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process Resources</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources
     * @generated
     */
    EClass getProcessResources();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources#getProcessResource <em>Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Process Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProcessResources#getProcessResource()
     * @see #getProcessResources()
     * @generated
     */
    EReference getProcessResources_ProcessResource();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Project <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Project</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Project
     * @generated
     */
    EClass getProject();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Project#getProjectProcessReference <em>Project Process Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Project Process Reference</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Project#getProjectProcessReference()
     * @see #getProject()
     * @generated
     */
    EReference getProject_ProjectProcessReference();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Project#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Project#getName()
     * @see #getProject()
     * @generated
     */
    EAttribute getProject_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Project#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Project#getUuid()
     * @see #getProject()
     * @generated
     */
    EAttribute getProject_Uuid();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference <em>Project Process Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Project Process Reference</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference
     * @generated
     */
    EClass getProjectProcessReference();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getProcessReference <em>Process Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Reference</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getProcessReference()
     * @see #getProjectProcessReference()
     * @generated
     */
    EAttribute getProjectProcessReference_ProcessReference();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getProcessUuid <em>Process Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getProcessUuid()
     * @see #getProjectProcessReference()
     * @generated
     */
    EAttribute getProjectProcessReference_ProcessUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getParentProject <em>Parent Project</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Project</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ProjectProcessReference#getParentProject()
     * @see #getProjectProcessReference()
     * @generated
     */
    EReference getProjectProcessReference_ParentProject();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters <em>Report Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Report Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters
     * @generated
     */
    EClass getReportParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#isBuffered <em>Buffered</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buffered</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#isBuffered()
     * @see #getReportParameters()
     * @generated
     */
    EAttribute getReportParameters_Buffered();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getBufTime <em>Buf Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buf Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getBufTime()
     * @see #getReportParameters()
     * @generated
     */
    EAttribute getReportParameters_BufTime();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getIntgPd <em>Intg Pd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intg Pd</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getIntgPd()
     * @see #getReportParameters()
     * @generated
     */
    EAttribute getReportParameters_IntgPd();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Comm Service Specifications</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentCommServiceSpecifications()
     * @see #getReportParameters()
     * @generated
     */
    EReference getReportParameters_ParentCommServiceSpecifications();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service Specifications</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getParentServiceSpecifications()
     * @see #getReportParameters()
     * @generated
     */
    EReference getReportParameters_ParentServiceSpecifications();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getReferredByReportParametersRef <em>Referred By Report Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Report Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParameters#getReferredByReportParametersRef()
     * @see #getReportParameters()
     * @generated
     */
    EReference getReportParameters_ReferredByReportParametersRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef <em>Report Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Report Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef
     * @generated
     */
    EClass getReportParametersRef();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getRefersToReportParameters <em>Refers To Report Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Report Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getRefersToReportParameters()
     * @see #getReportParametersRef()
     * @generated
     */
    EReference getReportParametersRef_RefersToReportParameters();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSourceRef <em>Parent Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSourceRef()
     * @see #getReportParametersRef()
     * @generated
     */
    EReference getReportParametersRef_ParentSourceRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Subscriber LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ReportParametersRef#getParentSubscriberLNode()
     * @see #getReportParametersRef()
     * @generated
     */
    EReference getReportParametersRef_ParentSubscriberLNode();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource
     * @generated
     */
    EClass getResource();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getValue()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_Value();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getResInst <em>Res Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Res Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getResInst()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_ResInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getSource()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_Source();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getSourceUuid <em>Source Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getSourceUuid()
     * @see #getResource()
     * @generated
     */
    EAttribute getResource_SourceUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getParentProcessResource <em>Parent Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Process Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Resource#getParentProcessResource()
     * @see #getResource()
     * @generated
     */
    EReference getResource_ParentProcessResource();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS <em>SDS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SDS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS
     * @generated
     */
    EClass getSDS();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getSDS <em>SDS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SDS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getSDS()
     * @see #getSDS()
     * @generated
     */
    EReference getSDS_SDS();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getDAS <em>DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>DAS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getDAS()
     * @see #getSDS()
     * @generated
     */
    EReference getSDS_DAS();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getSubscriberLNode <em>Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Subscriber LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getSubscriberLNode()
     * @see #getSDS()
     * @generated
     */
    EReference getSDS_SubscriberLNode();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getControllingLNode <em>Controlling LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Controlling LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getControllingLNode()
     * @see #getSDS()
     * @generated
     */
    EReference getSDS_ControllingLNode();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getProcessEcho <em>Process Echo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Process Echo</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getProcessEcho()
     * @see #getSDS()
     * @generated
     */
    EReference getSDS_ProcessEcho();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getLogParametersRef <em>Log Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Log Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getLogParametersRef()
     * @see #getSDS()
     * @generated
     */
    EReference getSDS_LogParametersRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Labels</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getLabels()
     * @see #getSDS()
     * @generated
     */
    EReference getSDS_Labels();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getIx <em>Ix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getIx()
     * @see #getSDS()
     * @generated
     */
    EAttribute getSDS_Ix();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getMappedDoName <em>Mapped Do Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mapped Do Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getMappedDoName()
     * @see #getSDS()
     * @generated
     */
    EAttribute getSDS_MappedDoName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getMappedLnUuid <em>Mapped Ln Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mapped Ln Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getMappedLnUuid()
     * @see #getSDS()
     * @generated
     */
    EAttribute getSDS_MappedLnUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getName()
     * @see #getSDS()
     * @generated
     */
    EAttribute getSDS_Name();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DOS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getParentDOS()
     * @see #getSDS()
     * @generated
     */
    EReference getSDS_ParentDOS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getParentSDS <em>Parent SDS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SDS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getParentSDS()
     * @see #getSDS()
     * @generated
     */
    EReference getSDS_ParentSDS();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS#getRefersToAnyLN()
     * @see #getSDS()
     * @generated
     */
    EReference getSDS_RefersToAnyLN();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParameters <em>Service Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParameters
     * @generated
     */
    EClass getServiceParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParameters#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParameters#getId()
     * @see #getServiceParameters()
     * @generated
     */
    EAttribute getServiceParameters_Id();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParametersRef <em>Service Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParametersRef
     * @generated
     */
    EClass getServiceParametersRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParametersRef#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceParametersRef#getId()
     * @see #getServiceParametersRef()
     * @generated
     */
    EAttribute getServiceParametersRef_Id();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications <em>Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Specifications</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications
     * @generated
     */
    EClass getServiceSpecifications();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getGooseParameters <em>Goose Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Goose Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getGooseParameters()
     * @see #getServiceSpecifications()
     * @generated
     */
    EReference getServiceSpecifications_GooseParameters();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getSMVParameters <em>SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SMV Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getSMVParameters()
     * @see #getServiceSpecifications()
     * @generated
     */
    EReference getServiceSpecifications_SMVParameters();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getReportParameters <em>Report Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Report Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getReportParameters()
     * @see #getServiceSpecifications()
     * @generated
     */
    EReference getServiceSpecifications_ReportParameters();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getBinaryWiringParameters <em>Binary Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Binary Wiring Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getBinaryWiringParameters()
     * @see #getServiceSpecifications()
     * @generated
     */
    EReference getServiceSpecifications_BinaryWiringParameters();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getAnalogueWiringParameters <em>Analogue Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Analogue Wiring Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getAnalogueWiringParameters()
     * @see #getServiceSpecifications()
     * @generated
     */
    EReference getServiceSpecifications_AnalogueWiringParameters();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getLogParameters <em>Log Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Log Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.ServiceSpecifications#getLogParameters()
     * @see #getServiceSpecifications()
     * @generated
     */
    EReference getServiceSpecifications_LogParameters();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole <em>Signal Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal Role</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole
     * @generated
     */
    EClass getSignalRole();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getName()
     * @see #getSignalRole()
     * @generated
     */
    EAttribute getSignalRole_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getOriginUuid()
     * @see #getSignalRole()
     * @generated
     */
    EAttribute getSignalRole_OriginUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getParentFunctionRef <em>Parent Function Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getParentFunctionRef()
     * @see #getSignalRole()
     * @generated
     */
    EReference getSignalRole_ParentFunctionRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getLNodeInputRef <em>LNode Input Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LNode Input Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getLNodeInputRef()
     * @see #getSignalRole()
     * @generated
     */
    EReference getSignalRole_LNodeInputRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getLNodeOutputRef <em>LNode Output Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LNode Output Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getLNodeOutputRef()
     * @see #getSignalRole()
     * @generated
     */
    EReference getSignalRole_LNodeOutputRef();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getLNodeDataRef <em>LNode Data Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LNode Data Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SignalRole#getLNodeDataRef()
     * @see #getSignalRole()
     * @generated
     */
    EReference getSignalRole_LNodeDataRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef <em>Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef
     * @generated
     */
    EClass getSourceRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getGooseParametersRef <em>Goose Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Goose Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getGooseParametersRef()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_GooseParametersRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSMVParametersRef <em>SMV Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SMV Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSMVParametersRef()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_SMVParametersRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReportParametersRef <em>Report Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Report Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReportParametersRef()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_ReportParametersRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binary Wiring Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getBinaryWiringParametersRef()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_BinaryWiringParametersRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getAnalogueWiringParametersRef <em>Analogue Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Analogue Wiring Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getAnalogueWiringParametersRef()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_AnalogueWiringParametersRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getExtRefAddr <em>Ext Ref Addr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ext Ref Addr</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getExtRefAddr()
     * @see #getSourceRef()
     * @generated
     */
    EAttribute getSourceRef_ExtRefAddr();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getExtRefUuid <em>Ext Ref Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ext Ref Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getExtRefUuid()
     * @see #getSourceRef()
     * @generated
     */
    EAttribute getSourceRef_ExtRefUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getInput <em>Input</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getInput()
     * @see #getSourceRef()
     * @generated
     */
    EAttribute getSourceRef_Input();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getInputInst <em>Input Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getInputInst()
     * @see #getSourceRef()
     * @generated
     */
    EAttribute getSourceRef_InputInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getService()
     * @see #getSourceRef()
     * @generated
     */
    EAttribute getSourceRef_Service();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSource()
     * @see #getSourceRef()
     * @generated
     */
    EAttribute getSourceRef_Source();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceDaName <em>Source Da Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Da Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceDaName()
     * @see #getSourceRef()
     * @generated
     */
    EAttribute getSourceRef_SourceDaName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceDoName <em>Source Do Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source Do Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceDoName()
     * @see #getSourceRef()
     * @generated
     */
    EAttribute getSourceRef_SourceDoName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceLNodeUuid <em>Source LNode Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source LNode Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getSourceLNodeUuid()
     * @see #getSourceRef()
     * @generated
     */
    EAttribute getSourceRef_SourceLNodeUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getParentLNodeInputs <em>Parent LNode Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LNode Inputs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getParentLNodeInputs()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_ParentLNodeInputs();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByInputVar <em>Referred By Input Var</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Input Var</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByInputVar()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_ReferredByInputVar();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByLNodeInputRef <em>Referred By LNode Input Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By LNode Input Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getReferredByLNodeInputRef()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_ReferredByLNodeInputRef();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToSubscriberLNode <em>Refers To Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Subscriber LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToSubscriberLNode()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_RefersToSubscriberLNode();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Process Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToProcessResource()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_RefersToProcessResource();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToLNode <em>Refers To LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToLNode()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_RefersToLNode();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToExtRef <em>Refers To Ext Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Ext Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SourceRef#getRefersToExtRef()
     * @see #getSourceRef()
     * @generated
     */
    EReference getSourceRef_RefersToExtRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory <em>Sub Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Category</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory
     * @generated
     */
    EClass getSubCategory();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory#getParentFunctionCategory <em>Parent Function Category</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function Category</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCategory#getParentFunctionCategory()
     * @see #getSubCategory()
     * @generated
     */
    EReference getSubCategory_ParentFunctionCategory();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID <em>Sub Checkout ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Checkout ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID
     * @generated
     */
    EClass getSubCheckoutID();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID#getParentCheckoutID <em>Parent Checkout ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Checkout ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubCheckoutID#getParentCheckoutID()
     * @see #getSubCheckoutID()
     * @generated
     */
    EReference getSubCheckoutID_ParentCheckoutID();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate <em>Sub Function Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Function Template</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate
     * @generated
     */
    EClass getSubFunctionTemplate();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getGeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>General Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getGeneralEquipment()
     * @see #getSubFunctionTemplate()
     * @generated
     */
    EReference getSubFunctionTemplate_GeneralEquipment();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getConductingEquipment()
     * @see #getSubFunctionTemplate()
     * @generated
     */
    EReference getSubFunctionTemplate_ConductingEquipment();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getSubFunctionTemplate <em>Sub Function Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Function Template</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getSubFunctionTemplate()
     * @see #getSubFunctionTemplate()
     * @generated
     */
    EReference getSubFunctionTemplate_SubFunctionTemplate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getType()
     * @see #getSubFunctionTemplate()
     * @generated
     */
    EAttribute getSubFunctionTemplate_Type();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getParentFunctionTemplate <em>Parent Function Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function Template</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getParentFunctionTemplate()
     * @see #getSubFunctionTemplate()
     * @generated
     */
    EReference getSubFunctionTemplate_ParentFunctionTemplate();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getParentSubFunctionTemplate <em>Parent Sub Function Template</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Sub Function Template</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubFunctionTemplate#getParentSubFunctionTemplate()
     * @see #getSubFunctionTemplate()
     * @generated
     */
    EReference getSubFunctionTemplate_ParentSubFunctionTemplate();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters <em>SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SMV Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters
     * @generated
     */
    EClass getSMVParameters();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL2CommParameters <em>L2 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>L2 Comm Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL2CommParameters()
     * @see #getSMVParameters()
     * @generated
     */
    EReference getSMVParameters_L2CommParameters();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv4CommParameters <em>L3I Pv4 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>L3I Pv4 Comm Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv4CommParameters()
     * @see #getSMVParameters()
     * @generated
     */
    EReference getSMVParameters_L3IPv4CommParameters();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv6CommParameters <em>L3I Pv6 Comm Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>L3I Pv6 Comm Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getL3IPv6CommParameters()
     * @see #getSMVParameters()
     * @generated
     */
    EReference getSMVParameters_L3IPv6CommParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isMulticast <em>Multicast</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multicast</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isMulticast()
     * @see #getSMVParameters()
     * @generated
     */
    EAttribute getSMVParameters_Multicast();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getNofASDU <em>Nof ASDU</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nof ASDU</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getNofASDU()
     * @see #getSMVParameters()
     * @generated
     */
    EAttribute getSMVParameters_NofASDU();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isSecurityEnabled <em>Security Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Security Enabled</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#isSecurityEnabled()
     * @see #getSMVParameters()
     * @generated
     */
    EAttribute getSMVParameters_SecurityEnabled();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpMod <em>Smp Mod</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Smp Mod</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpMod()
     * @see #getSMVParameters()
     * @generated
     */
    EAttribute getSMVParameters_SmpMod();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpRate <em>Smp Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Smp Rate</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmpRate()
     * @see #getSMVParameters()
     * @generated
     */
    EAttribute getSMVParameters_SmpRate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmvId <em>Smv Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Smv Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getSmvId()
     * @see #getSMVParameters()
     * @generated
     */
    EAttribute getSMVParameters_SmvId();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentCommServiceSpecifications <em>Parent Comm Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Comm Service Specifications</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentCommServiceSpecifications()
     * @see #getSMVParameters()
     * @generated
     */
    EReference getSMVParameters_ParentCommServiceSpecifications();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentServiceSpecifications <em>Parent Service Specifications</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Service Specifications</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getParentServiceSpecifications()
     * @see #getSMVParameters()
     * @generated
     */
    EReference getSMVParameters_ParentServiceSpecifications();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getReferredBySMVParametersRef <em>Referred By SMV Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred By SMV Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParameters#getReferredBySMVParametersRef()
     * @see #getSMVParameters()
     * @generated
     */
    EReference getSMVParameters_ReferredBySMVParametersRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef <em>SMV Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SMV Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef
     * @generated
     */
    EClass getSMVParametersRef();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getRefersToSMVParameters <em>Refers To SMV Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To SMV Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getRefersToSMVParameters()
     * @see #getSMVParametersRef()
     * @generated
     */
    EReference getSMVParametersRef_RefersToSMVParameters();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSourceRef <em>Parent Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSourceRef()
     * @see #getSMVParametersRef()
     * @generated
     */
    EReference getSMVParametersRef_ParentSourceRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSubscriberLNode <em>Parent Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Subscriber LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SMVParametersRef#getParentSubscriberLNode()
     * @see #getSMVParametersRef()
     * @generated
     */
    EReference getSMVParametersRef_ParentSubscriberLNode();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode <em>Subscriber LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Subscriber LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode
     * @generated
     */
    EClass getSubscriberLNode();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getGooseParametersRef <em>Goose Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Goose Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getGooseParametersRef()
     * @see #getSubscriberLNode()
     * @generated
     */
    EReference getSubscriberLNode_GooseParametersRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getSMVParametersRef <em>SMV Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SMV Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getSMVParametersRef()
     * @see #getSubscriberLNode()
     * @generated
     */
    EReference getSubscriberLNode_SMVParametersRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReportParametersRef <em>Report Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Report Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReportParametersRef()
     * @see #getSubscriberLNode()
     * @generated
     */
    EReference getSubscriberLNode_ReportParametersRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getBinaryWiringParametersRef <em>Binary Wiring Parameters Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Binary Wiring Parameters Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getBinaryWiringParametersRef()
     * @see #getSubscriberLNode()
     * @generated
     */
    EReference getSubscriberLNode_BinaryWiringParametersRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getInputName <em>Input Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Input Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getInputName()
     * @see #getSubscriberLNode()
     * @generated
     */
    EAttribute getSubscriberLNode_InputName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getPLN <em>PLN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PLN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getPLN()
     * @see #getSubscriberLNode()
     * @generated
     */
    EAttribute getSubscriberLNode_PLN();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getResourceName <em>Resource Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getResourceName()
     * @see #getSubscriberLNode()
     * @generated
     */
    EAttribute getSubscriberLNode_ResourceName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getResourceUuid <em>Resource Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getResourceUuid()
     * @see #getSubscriberLNode()
     * @generated
     */
    EAttribute getSubscriberLNode_ResourceUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getService()
     * @see #getSubscriberLNode()
     * @generated
     */
    EAttribute getSubscriberLNode_Service();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDAS <em>Parent DAS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DAS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDAS()
     * @see #getSubscriberLNode()
     * @generated
     */
    EReference getSubscriberLNode_ParentDAS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDOS <em>Parent DOS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DOS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentDOS()
     * @see #getSubscriberLNode()
     * @generated
     */
    EReference getSubscriberLNode_ParentDOS();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentSDS <em>Parent SDS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SDS</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getParentSDS()
     * @see #getSubscriberLNode()
     * @generated
     */
    EReference getSubscriberLNode_ParentSDS();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getRefersToProcessResource <em>Refers To Process Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Process Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getRefersToProcessResource()
     * @see #getSubscriberLNode()
     * @generated
     */
    EReference getSubscriberLNode_RefersToProcessResource();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReferredBySourceRef <em>Referred By Source Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Source Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SubscriberLNode#getReferredBySourceRef()
     * @see #getSubscriberLNode()
     * @generated
     */
    EReference getSubscriberLNode_ReferredBySourceRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable
     * @generated
     */
    EClass getVariable();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getVariableApplyTo <em>Variable Apply To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Apply To</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getVariableApplyTo()
     * @see #getVariable()
     * @generated
     */
    EReference getVariable_VariableApplyTo();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getName()
     * @see #getVariable()
     * @generated
     */
    EAttribute getVariable_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getOriginUuid <em>Origin Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Origin Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getOriginUuid()
     * @see #getVariable()
     * @generated
     */
    EAttribute getVariable_OriginUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getTemplateUuid <em>Template Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Template Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getTemplateUuid()
     * @see #getVariable()
     * @generated
     */
    EAttribute getVariable_TemplateUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getUuid <em>Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getUuid()
     * @see #getVariable()
     * @generated
     */
    EAttribute getVariable_Uuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getValue()
     * @see #getVariable()
     * @generated
     */
    EAttribute getVariable_Value();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getReferredByVariableRef <em>Referred By Variable Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Variable Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.Variable#getReferredByVariableRef()
     * @see #getVariable()
     * @generated
     */
    EReference getVariable_ReferredByVariableRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo <em>Variable Apply To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Apply To</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo
     * @generated
     */
    EClass getVariableApplyTo();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getAttribute()
     * @see #getVariableApplyTo()
     * @generated
     */
    EAttribute getVariableApplyTo_Attribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDaName <em>Da Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Da Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDaName()
     * @see #getVariableApplyTo()
     * @generated
     */
    EAttribute getVariableApplyTo_DaName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDefaultValue()
     * @see #getVariableApplyTo()
     * @generated
     */
    EAttribute getVariableApplyTo_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDoName <em>Do Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Do Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getDoName()
     * @see #getVariableApplyTo()
     * @generated
     */
    EAttribute getVariableApplyTo_DoName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Element</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getElement()
     * @see #getVariableApplyTo()
     * @generated
     */
    EAttribute getVariableApplyTo_Element();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getElementUuid <em>Element Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Element Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getElementUuid()
     * @see #getVariableApplyTo()
     * @generated
     */
    EAttribute getVariableApplyTo_ElementUuid();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getFormat <em>Format</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Format</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getFormat()
     * @see #getVariableApplyTo()
     * @generated
     */
    EAttribute getVariableApplyTo_Format();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getSGroup <em>SGroup</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SGroup</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getSGroup()
     * @see #getVariableApplyTo()
     * @generated
     */
    EAttribute getVariableApplyTo_SGroup();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getParentVariable <em>Parent Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Variable</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableApplyTo#getParentVariable()
     * @see #getVariableApplyTo()
     * @generated
     */
    EReference getVariableApplyTo_ParentVariable();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef <em>Variable Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef
     * @generated
     */
    EClass getVariableRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getValue()
     * @see #getVariableRef()
     * @generated
     */
    EAttribute getVariableRef_Value();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getVariable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Variable</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getVariable()
     * @see #getVariableRef()
     * @generated
     */
    EAttribute getVariableRef_Variable();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getVariableUuid <em>Variable Uuid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Variable Uuid</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getVariableUuid()
     * @see #getVariableRef()
     * @generated
     */
    EAttribute getVariableRef_VariableUuid();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentAbstractFunctionalVariant <em>Parent Abstract Functional Variant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Abstract Functional Variant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentAbstractFunctionalVariant()
     * @see #getVariableRef()
     * @generated
     */
    EReference getVariableRef_ParentAbstractFunctionalVariant();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentFunctionRoleContent <em>Parent Function Role Content</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function Role Content</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getParentFunctionRoleContent()
     * @see #getVariableRef()
     * @generated
     */
    EReference getVariableRef_ParentFunctionRoleContent();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getRefersToVariable <em>Refers To Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Variable</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.VariableRef#getRefersToVariable()
     * @see #getVariableRef()
     * @generated
     */
    EReference getVariableRef_RefersToVariable();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters <em>Wiring Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Wiring Parameters</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters
     * @generated
     */
    EClass getWiringParameters();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters#getInpNam <em>Inp Nam</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inp Nam</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters#getInpNam()
     * @see #getWiringParameters()
     * @generated
     */
    EAttribute getWiringParameters_InpNam();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters#getInpRef <em>Inp Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inp Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.WiringParameters#getInpRef()
     * @see #getWiringParameters()
     * @generated
     */
    EAttribute getWiringParameters_InpRef();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum <em>Cardinality Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Cardinality Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.CardinalityEnum
     * @generated
     */
    EEnum getCardinalityEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.OutTypEnum <em>Out Typ Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Out Typ Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.OutTypEnum
     * @generated
     */
    EEnum getOutTypEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.UpdateEnum <em>Update Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Update Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.UpdateEnum
     * @generated
     */
    EEnum getUpdateEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum <em>Spec Service Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Spec Service Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.asd.SpecServiceEnum
     * @generated
     */
    EEnum getSpecServiceEnum();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AsdFactory getAsdFactory();

} //AsdPackage
