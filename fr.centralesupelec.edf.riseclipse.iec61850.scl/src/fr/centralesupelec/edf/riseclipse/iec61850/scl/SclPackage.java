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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclFactory
 * @model kind="package"
 * @generated
 */
public interface SclPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "scl";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.iec.ch/61850/2003/SCL";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "scl";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SclPackage eINSTANCE = fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl.init();

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclObjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSclObject()
     * @generated
     */
    int SCL_OBJECT = 141;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_OBJECT__LINE_NUMBER = 0;

    /**
     * The number of structural features of the '<em>Object</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_OBJECT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Object</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_OBJECT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyContentFromOtherNamespaceImpl <em>Any Content From Other Namespace</em>}' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyContentFromOtherNamespaceImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAnyContentFromOtherNamespace()
     * @generated
     */
    int ANY_CONTENT_FROM_OTHER_NAMESPACE = 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_FROM_OTHER_NAMESPACE__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_FROM_OTHER_NAMESPACE__ANY = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Any Content From Other Namespace</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Any Content From Other Namespace</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_FROM_OTHER_NAMESPACE_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExplicitLinkResolverImpl <em>Explicit Link Resolver</em>}' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExplicitLinkResolverImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getExplicitLinkResolver()
     * @generated
     */
    int EXPLICIT_LINK_RESOLVER = 139;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_LINK_RESOLVER__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The number of structural features of the '<em>Explicit Link Resolver</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_LINK_RESOLVER_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Explicit Link Resolver</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPLICIT_LINK_RESOLVER_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BaseElementImpl <em>Base Element</em>}' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BaseElementImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getBaseElement()
     * @generated
     */
    int BASE_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__LINE_NUMBER = EXPLICIT_LINK_RESOLVER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__PRIVATE = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__TEXT = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__ANY = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT__ANY_ATTRIBUTE = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Base Element</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_FEATURE_COUNT = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Base Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BASE_ELEMENT_OPERATION_COUNT = EXPLICIT_LINK_RESOLVER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HeaderImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getHeader()
     * @generated
     */
    int HEADER = 2;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER__ID = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name Structure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER__NAME_STRUCTURE = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER__REVISION = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Tool ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER__TOOL_ID = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER__VERSION = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent SCL</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER__PARENT_SCL = SCL_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER__TEXT = SCL_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>History</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER__HISTORY = SCL_OBJECT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Header</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Header</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HEADER_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HistoryImpl <em>History</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HistoryImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getHistory()
     * @generated
     */
    int HISTORY = 3;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HISTORY__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Header</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HISTORY__PARENT_HEADER = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Hitem</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HISTORY__HITEM = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>History</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HISTORY_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>History</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HISTORY_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HitemImpl <em>Hitem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.HitemImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getHitem()
     * @generated
     */
    int HITEM = 4;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HITEM__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HITEM__REVISION = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HITEM__VERSION = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>What</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HITEM__WHAT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>When</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HITEM__WHEN = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Who</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HITEM__WHO = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Why</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HITEM__WHY = SCL_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Parent History</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HITEM__PARENT_HISTORY = SCL_OBJECT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Hitem</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HITEM_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Hitem</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HITEM_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IDNamingImpl <em>ID Naming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IDNamingImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getIDNaming()
     * @generated
     */
    int ID_NAMING = 5;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ID_NAMING__LINE_NUMBER = BASE_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ID_NAMING__PRIVATE = BASE_ELEMENT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ID_NAMING__TEXT = BASE_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ID_NAMING__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ID_NAMING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ID_NAMING__DESC = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ID_NAMING__ID = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>ID Naming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ID_NAMING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>ID Naming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ID_NAMING_OPERATION_COUNT = BASE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.NamingImpl <em>Naming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.NamingImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getNaming()
     * @generated
     */
    int NAMING = 7;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMING__LINE_NUMBER = BASE_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMING__PRIVATE = BASE_ELEMENT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMING__TEXT = BASE_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMING__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMING__DESC = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMING__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Naming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Naming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMING_OPERATION_COUNT = BASE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeContainerImpl <em>LNode Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeContainerImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getLNodeContainer()
     * @generated
     */
    int LNODE_CONTAINER = 127;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_CONTAINER__LINE_NUMBER = NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_CONTAINER__PRIVATE = NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_CONTAINER__TEXT = NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_CONTAINER__ANY = NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_CONTAINER__ANY_ATTRIBUTE = NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_CONTAINER__DESC = NAMING__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_CONTAINER__NAME = NAMING__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_CONTAINER__LNODE = NAMING_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>LNode Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_CONTAINER_FEATURE_COUNT = NAMING_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>LNode Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_CONTAINER_OPERATION_COUNT = NAMING_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerSystemResourceImpl <em>Power System Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerSystemResourceImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getPowerSystemResource()
     * @generated
     */
    int POWER_SYSTEM_RESOURCE = 129;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RESOURCE__LINE_NUMBER = LNODE_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RESOURCE__PRIVATE = LNODE_CONTAINER__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RESOURCE__TEXT = LNODE_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RESOURCE__ANY = LNODE_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE = LNODE_CONTAINER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RESOURCE__DESC = LNODE_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RESOURCE__NAME = LNODE_CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RESOURCE__LNODE = LNODE_CONTAINER__LNODE;

    /**
     * The number of structural features of the '<em>Power System Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RESOURCE_FEATURE_COUNT = LNODE_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Power System Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_SYSTEM_RESOURCE_OPERATION_COUNT = LNODE_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentContainerImpl <em>General Equipment Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentContainerImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGeneralEquipmentContainer()
     * @generated
     */
    int GENERAL_EQUIPMENT_CONTAINER = 125;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER__LINE_NUMBER = POWER_SYSTEM_RESOURCE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER__PRIVATE = POWER_SYSTEM_RESOURCE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER__TEXT = POWER_SYSTEM_RESOURCE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER__ANY = POWER_SYSTEM_RESOURCE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER__ANY_ATTRIBUTE = POWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER__DESC = POWER_SYSTEM_RESOURCE__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER__NAME = POWER_SYSTEM_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER__LNODE = POWER_SYSTEM_RESOURCE__LNODE;

    /**
     * The feature id for the '<em><b>Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER__FUNCTION = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>General Equipment Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>General Equipment Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_CONTAINER_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LineImpl <em>Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LineImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getLine()
     * @generated
     */
    int LINE = 6;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__LINE_NUMBER = GENERAL_EQUIPMENT_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__PRIVATE = GENERAL_EQUIPMENT_CONTAINER__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__TEXT = GENERAL_EQUIPMENT_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__ANY = GENERAL_EQUIPMENT_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__ANY_ATTRIBUTE = GENERAL_EQUIPMENT_CONTAINER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__DESC = GENERAL_EQUIPMENT_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__NAME = GENERAL_EQUIPMENT_CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__LNODE = GENERAL_EQUIPMENT_CONTAINER__LNODE;

    /**
     * The feature id for the '<em><b>Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__FUNCTION = GENERAL_EQUIPMENT_CONTAINER__FUNCTION;

    /**
     * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__GENERAL_EQUIPMENT = GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__TYPE = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__PARENT_PROCESS = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent SCL</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__PARENT_SCL = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Connectivity Node</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__CONNECTIVITY_NODE = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__CONDUCTING_EQUIPMENT = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Voltage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__VOLTAGE = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Nom Freq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__NOM_FREQ = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Num Phases</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE__NUM_PHASES = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Line</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_FEATURE_COUNT = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Line</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINE_OPERATION_COUNT = GENERAL_EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PrivateImpl <em>Private</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PrivateImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getPrivate()
     * @generated
     */
    int PRIVATE = 8;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE__LINE_NUMBER = ANY_CONTENT_FROM_OTHER_NAMESPACE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE__MIXED = ANY_CONTENT_FROM_OTHER_NAMESPACE__MIXED;

    /**
     * The feature id for the '<em><b>Group</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE__GROUP = ANY_CONTENT_FROM_OTHER_NAMESPACE__GROUP;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE__ANY = ANY_CONTENT_FROM_OTHER_NAMESPACE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE__ANY_ATTRIBUTE = ANY_CONTENT_FROM_OTHER_NAMESPACE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE__SOURCE = ANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE__TYPE = ANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Base Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE__PARENT_BASE_ELEMENT = ANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Private</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE_FEATURE_COUNT = ANY_CONTENT_FROM_OTHER_NAMESPACE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Private</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIVATE_OPERATION_COUNT = ANY_CONTENT_FROM_OTHER_NAMESPACE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProcessImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getProcess()
     * @generated
     */
    int PROCESS = 9;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__LINE_NUMBER = GENERAL_EQUIPMENT_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__PRIVATE = GENERAL_EQUIPMENT_CONTAINER__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__TEXT = GENERAL_EQUIPMENT_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ANY = GENERAL_EQUIPMENT_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__ANY_ATTRIBUTE = GENERAL_EQUIPMENT_CONTAINER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__DESC = GENERAL_EQUIPMENT_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__NAME = GENERAL_EQUIPMENT_CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__LNODE = GENERAL_EQUIPMENT_CONTAINER__LNODE;

    /**
     * The feature id for the '<em><b>Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__FUNCTION = GENERAL_EQUIPMENT_CONTAINER__FUNCTION;

    /**
     * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__GENERAL_EQUIPMENT = GENERAL_EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__TYPE = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__LINE = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent SCL</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__PARENT_SCL = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__CONDUCTING_EQUIPMENT = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Substation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__SUBSTATION = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Sub Processes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__SUB_PROCESSES = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Parent Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS__PARENT_PROCESS = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_FEATURE_COUNT = GENERAL_EQUIPMENT_CONTAINER_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Process</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCESS_OPERATION_COUNT = GENERAL_EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl <em>SCL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SCLImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSCL()
     * @generated
     */
    int SCL = 10;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__LINE_NUMBER = BASE_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__PRIVATE = BASE_ELEMENT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__TEXT = BASE_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__REVISION = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__VERSION = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Header</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__HEADER = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Line</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__LINE = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Process</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__PROCESS = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>IED</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__IED = BASE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Data Type Templates</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__DATA_TYPE_TEMPLATES = BASE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Communication</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__COMMUNICATION = BASE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Substation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__SUBSTATION = BASE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL__RELEASE = BASE_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>SCL</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>SCL</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_OPERATION_COUNT = BASE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TextImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getText()
     * @generated
     */
    int TEXT = 11;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__SOURCE = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Base Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__PARENT_BASE_ELEMENT = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Header</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__PARENT_HEADER = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT__VALUE = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Text</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Text</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXT_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AddressImpl <em>Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AddressImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAddress()
     * @generated
     */
    int ADDRESS = 12;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Connected AP</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS__PARENT_CONNECTED_AP = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Control Block</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS__PARENT_CONTROL_BLOCK = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>P</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS__P = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Address</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADDRESS_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CommunicationImpl <em>Communication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CommunicationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getCommunication()
     * @generated
     */
    int COMMUNICATION = 13;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl <em>Connected AP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectedAPImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getConnectedAP()
     * @generated
     */
    int CONNECTED_AP = 14;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlBlockImpl <em>Control Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlBlockImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getControlBlock()
     * @generated
     */
    int CONTROL_BLOCK = 15;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEImpl <em>GSE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGSE()
     * @generated
     */
    int GSE = 16;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PAddrImpl <em>PAddr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PAddrImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getPAddr()
     * @generated
     */
    int PADDR = 18;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PImpl <em>P</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getP()
     * @generated
     */
    int P = 17;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.P_PhysConnImpl <em>PPhys Conn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.P_PhysConnImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getP_PhysConn()
     * @generated
     */
    int PPHYS_CONN = 19;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PhysConnImpl <em>Phys Conn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PhysConnImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getPhysConn()
     * @generated
     */
    int PHYS_CONN = 20;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVImpl <em>SMV</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSMV()
     * @generated
     */
    int SMV = 21;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubNetworkImpl <em>Sub Network</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubNetworkImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSubNetwork()
     * @generated
     */
    int SUB_NETWORK = 22;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl <em>Abstract Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataAttributeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAbstractDataAttribute()
     * @generated
     */
    int ABSTRACT_DATA_ATTRIBUTE = 23;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BDAImpl <em>BDA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BDAImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getBDA()
     * @generated
     */
    int BDA = 24;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl <em>DA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDA()
     * @generated
     */
    int DA = 25;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl <em>DA Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DATypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDAType()
     * @generated
     */
    int DA_TYPE = 26;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl <em>DO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDO()
     * @generated
     */
    int DO = 27;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOTypeImpl <em>DO Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDOType()
     * @generated
     */
    int DO_TYPE = 28;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl <em>Data Type Templates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataTypeTemplatesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDataTypeTemplates()
     * @generated
     */
    int DATA_TYPE_TEMPLATES = 29;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EnumTypeImpl <em>Enum Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EnumTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getEnumType()
     * @generated
     */
    int ENUM_TYPE = 30;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EnumValImpl <em>Enum Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EnumValImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getEnumVal()
     * @generated
     */
    int ENUM_VAL = 31;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl <em>LNode Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeTypeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getLNodeType()
     * @generated
     */
    int LNODE_TYPE = 32;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtNsImpl <em>Prot Ns</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtNsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getProtNs()
     * @generated
     */
    int PROT_NS = 33;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDOImpl <em>SDO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDOImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSDO()
     * @generated
     */
    int SDO = 34;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValImpl <em>Val</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getVal()
     * @generated
     */
    int VAL = 35;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BitRateInMbPerSecImpl <em>Bit Rate In Mb Per Sec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BitRateInMbPerSecImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getBitRateInMbPerSec()
     * @generated
     */
    int BIT_RATE_IN_MB_PER_SEC = 154;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DurationInMilliSecImpl <em>Duration In Milli Sec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DurationInMilliSecImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDurationInMilliSec()
     * @generated
     */
    int DURATION_IN_MILLI_SEC = 153;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessControlImpl <em>Access Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessControlImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAccessControl()
     * @generated
     */
    int ACCESS_CONTROL = 36;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl <em>Access Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AccessPointImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAccessPoint()
     * @generated
     */
    int ACCESS_POINT = 37;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl <em>Any LN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AnyLNImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAnyLN()
     * @generated
     */
    int ANY_LN = 38;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AssociationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAssociation()
     * @generated
     */
    int ASSOCIATION = 39;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AuthenticationImpl <em>Authentication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AuthenticationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAuthentication()
     * @generated
     */
    int AUTHENTICATION = 40;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertificateImpl <em>Certificate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertificateImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getCertificate()
     * @generated
     */
    int CERTIFICATE = 41;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl <em>Client LN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientLNImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getClientLN()
     * @generated
     */
    int CLIENT_LN = 42;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl <em>Client Services</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ClientServicesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getClientServices()
     * @generated
     */
    int CLIENT_SERVICES = 43;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CommProtImpl <em>Comm Prot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CommProtImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getCommProt()
     * @generated
     */
    int COMM_PROT = 44;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithMaxImpl <em>Service With Max</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithMaxImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceWithMax()
     * @generated
     */
    int SERVICE_WITH_MAX = 102;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfDataSetImpl <em>Conf Data Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfDataSetImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getConfDataSet()
     * @generated
     */
    int CONF_DATA_SET = 45;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfLNsImpl <em>Conf LNs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfLNsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getConfLNs()
     * @generated
     */
    int CONF_LNS = 46;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfLdNameImpl <em>Conf Ld Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfLdNameImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getConfLdName()
     * @generated
     */
    int CONF_LD_NAME = 47;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfLogControlImpl <em>Conf Log Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfLogControlImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getConfLogControl()
     * @generated
     */
    int CONF_LOG_CONTROL = 48;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfReportControlImpl <em>Conf Report Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfReportControlImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getConfReportControl()
     * @generated
     */
    int CONF_REPORT_CONTROL = 49;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfSGImpl <em>Conf SG</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfSGImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getConfSG()
     * @generated
     */
    int CONF_SG = 50;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfSigRefImpl <em>Conf Sig Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConfSigRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getConfSigRef()
     * @generated
     */
    int CONF_SIG_REF = 51;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlImpl <em>Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getControl()
     * @generated
     */
    int CONTROL = 52;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithIEDNameImpl <em>Control With IED Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithIEDNameImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getControlWithIEDName()
     * @generated
     */
    int CONTROL_WITH_IED_NAME = 53;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithTriggerOptImpl <em>Control With Trigger Opt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ControlWithTriggerOptImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getControlWithTriggerOpt()
     * @generated
     */
    int CONTROL_WITH_TRIGGER_OPT = 54;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl <em>DAI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDAI()
     * @generated
     */
    int DAI = 55;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl <em>DOI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDOI()
     * @generated
     */
    int DOI = 56;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataObjectDirectoryImpl <em>Data Object Directory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataObjectDirectoryImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDataObjectDirectory()
     * @generated
     */
    int DATA_OBJECT_DIRECTORY = 57;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataSetImpl <em>Data Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataSetImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDataSet()
     * @generated
     */
    int DATA_SET = 58;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataSetDirectoryImpl <em>Data Set Directory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DataSetDirectoryImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDataSetDirectory()
     * @generated
     */
    int DATA_SET_DIRECTORY = 59;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DynAssociationImpl <em>Dyn Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DynAssociationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDynAssociation()
     * @generated
     */
    int DYN_ASSOCIATION = 60;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DynDataSetImpl <em>Dyn Data Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DynDataSetImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDynDataSet()
     * @generated
     */
    int DYN_DATA_SET = 61;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl <em>Ext Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ExtRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getExtRef()
     * @generated
     */
    int EXT_REF = 62;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl <em>FCDA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FCDAImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getFCDA()
     * @generated
     */
    int FCDA = 63;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FileHandlingImpl <em>File Handling</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FileHandlingImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getFileHandling()
     * @generated
     */
    int FILE_HANDLING = 64;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GOOSEImpl <em>GOOSE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GOOSEImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGOOSE()
     * @generated
     */
    int GOOSE = 65;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GOOSESecurityImpl <em>GOOSE Security</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GOOSESecurityImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGOOSESecurity()
     * @generated
     */
    int GOOSE_SECURITY = 66;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl <em>GSE Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEControlImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGSEControl()
     * @generated
     */
    int GSE_CONTROL = 67;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEDirImpl <em>GSE Dir</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSEDirImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGSEDir()
     * @generated
     */
    int GSE_DIR = 68;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceSettingsImpl <em>Service Settings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceSettingsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceSettings()
     * @generated
     */
    int SERVICE_SETTINGS = 101;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSESettingsImpl <em>GSE Settings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSESettingsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGSESettings()
     * @generated
     */
    int GSE_SETTINGS = 69;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSSEImpl <em>GSSE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GSSEImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGSSE()
     * @generated
     */
    int GSSE = 70;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GetCBValuesImpl <em>Get CB Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GetCBValuesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGetCBValues()
     * @generated
     */
    int GET_CB_VALUES = 71;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GetDataObjectDefinitionImpl <em>Get Data Object Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GetDataObjectDefinitionImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGetDataObjectDefinition()
     * @generated
     */
    int GET_DATA_OBJECT_DEFINITION = 72;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GetDataSetValueImpl <em>Get Data Set Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GetDataSetValueImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGetDataSetValue()
     * @generated
     */
    int GET_DATA_SET_VALUE = 73;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GetDirectoryImpl <em>Get Directory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GetDirectoryImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGetDirectory()
     * @generated
     */
    int GET_DIRECTORY = 74;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl <em>IED</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getIED()
     * @generated
     */
    int IED = 75;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl <em>IED Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IEDNameImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getIEDName()
     * @generated
     */
    int IED_NAME = 76;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.InputsImpl <em>Inputs</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.InputsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getInputs()
     * @generated
     */
    int INPUTS = 77;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IssuerNameImpl <em>Issuer Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.IssuerNameImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getIssuerName()
     * @generated
     */
    int ISSUER_NAME = 78;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.KDCImpl <em>KDC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.KDCImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getKDC()
     * @generated
     */
    int KDC = 79;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl <em>LDevice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LDeviceImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getLDevice()
     * @generated
     */
    int LDEVICE = 80;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl <em>LN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getLN()
     * @generated
     */
    int LN = 81;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LN0Impl <em>LN0</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LN0Impl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getLN0()
     * @generated
     */
    int LN0 = 82;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogImpl <em>Log</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getLog()
     * @generated
     */
    int LOG = 83;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl <em>Log Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogControlImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getLogControl()
     * @generated
     */
    int LOG_CONTROL = 84;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogSettingsImpl <em>Log Settings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LogSettingsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getLogSettings()
     * @generated
     */
    int LOG_SETTINGS = 85;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OptFieldsImpl <em>Opt Fields</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.OptFieldsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getOptFields()
     * @generated
     */
    int OPT_FIELDS = 86;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ProtocolImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getProtocol()
     * @generated
     */
    int PROTOCOL = 87;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReadWriteImpl <em>Read Write</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReadWriteImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getReadWrite()
     * @generated
     */
    int READ_WRITE = 88;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.RedProtImpl <em>Red Prot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.RedProtImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getRedProt()
     * @generated
     */
    int RED_PROT = 89;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportControlImpl <em>Report Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportControlImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getReportControl()
     * @generated
     */
    int REPORT_CONTROL = 90;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportSettingsImpl <em>Report Settings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ReportSettingsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getReportSettings()
     * @generated
     */
    int REPORT_SETTINGS = 91;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.RptEnabledImpl <em>Rpt Enabled</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.RptEnabledImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getRptEnabled()
     * @generated
     */
    int RPT_ENABLED = 92;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl <em>SDI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSDI()
     * @generated
     */
    int SDI = 93;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SGEditImpl <em>SG Edit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SGEditImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSGEdit()
     * @generated
     */
    int SG_EDIT = 94;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSecurityImpl <em>SMV Security</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSecurityImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSMVSecurity()
     * @generated
     */
    int SMV_SECURITY = 95;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl <em>SMV Settings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVSettingsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSMVSettings()
     * @generated
     */
    int SMV_SETTINGS = 96;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVscImpl <em>SM Vsc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SMVscImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSMVsc()
     * @generated
     */
    int SM_VSC = 97;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SampledValueControlImpl <em>Sampled Value Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SampledValueControlImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSampledValueControl()
     * @generated
     */
    int SAMPLED_VALUE_CONTROL = 98;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl <em>Server</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServer()
     * @generated
     */
    int SERVER = 99;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerAtImpl <em>Server At</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServerAtImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServerAt()
     * @generated
     */
    int SERVER_AT = 100;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl <em>Services</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServicesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServices()
     * @generated
     */
    int SERVICES = 103;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SetDataSetValueImpl <em>Set Data Set Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SetDataSetValueImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSetDataSetValue()
     * @generated
     */
    int SET_DATA_SET_VALUE = 104;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl <em>Setting Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingControlImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSettingControl()
     * @generated
     */
    int SETTING_CONTROL = 105;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingGroupsImpl <em>Setting Groups</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SettingGroupsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSettingGroups()
     * @generated
     */
    int SETTING_GROUPS = 106;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmvOptsImpl <em>Smv Opts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmvOptsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSmvOpts()
     * @generated
     */
    int SMV_OPTS = 107;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubjectImpl <em>Subject</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSubject()
     * @generated
     */
    int SUBJECT = 108;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SupSubscriptionImpl <em>Sup Subscription</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SupSubscriptionImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSupSubscription()
     * @generated
     */
    int SUP_SUBSCRIPTION = 109;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl <em>Time Sync Prot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimeSyncProtImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getTimeSyncProt()
     * @generated
     */
    int TIME_SYNC_PROT = 110;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimerActivatedControlImpl <em>Timer Activated Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TimerActivatedControlImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getTimerActivatedControl()
     * @generated
     */
    int TIMER_ACTIVATED_CONTROL = 111;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TrgOpsImpl <em>Trg Ops</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TrgOpsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getTrgOps()
     * @generated
     */
    int TRG_OPS = 112;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValueHandlingImpl <em>Value Handling</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValueHandlingImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getValueHandling()
     * @generated
     */
    int VALUE_HANDLING = 113;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EquipmentImpl <em>Equipment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EquipmentImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getEquipment()
     * @generated
     */
    int EQUIPMENT = 121;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractConductingEquipmentImpl <em>Abstract Conducting Equipment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractConductingEquipmentImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAbstractConductingEquipment()
     * @generated
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT = 114;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractEqFuncSubFuncImpl <em>Abstract Eq Func Sub Func</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractEqFuncSubFuncImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAbstractEqFuncSubFunc()
     * @generated
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC = 115;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EquipmentContainerImpl <em>Equipment Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EquipmentContainerImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getEquipmentContainer()
     * @generated
     */
    int EQUIPMENT_CONTAINER = 122;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BayImpl <em>Bay</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BayImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getBay()
     * @generated
     */
    int BAY = 116;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl <em>Conducting Equipment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConductingEquipmentImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getConductingEquipment()
     * @generated
     */
    int CONDUCTING_EQUIPMENT = 117;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectivityNodeImpl <em>Connectivity Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ConnectivityNodeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getConnectivityNode()
     * @generated
     */
    int CONNECTIVITY_NODE = 118;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl <em>Eq Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqFunctionImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getEqFunction()
     * @generated
     */
    int EQ_FUNCTION = 119;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqSubFunctionImpl <em>Eq Sub Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.EqSubFunctionImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getEqSubFunction()
     * @generated
     */
    int EQ_SUB_FUNCTION = 120;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.FunctionImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getFunction()
     * @generated
     */
    int FUNCTION = 123;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl <em>General Equipment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.GeneralEquipmentImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGeneralEquipment()
     * @generated
     */
    int GENERAL_EQUIPMENT = 124;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl <em>LNode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LNodeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getLNode()
     * @generated
     */
    int LNODE = 126;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl <em>Terminal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TerminalImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getTerminal()
     * @generated
     */
    int TERMINAL = 135;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.NeutralPointImpl <em>Neutral Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.NeutralPointImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getNeutralPoint()
     * @generated
     */
    int NEUTRAL_POINT = 128;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl <em>Power Transformer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.PowerTransformerImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getPowerTransformer()
     * @generated
     */
    int POWER_TRANSFORMER = 130;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl <em>Sub Equipment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubEquipmentImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSubEquipment()
     * @generated
     */
    int SUB_EQUIPMENT = 131;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubFunctionImpl <em>Sub Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubFunctionImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSubFunction()
     * @generated
     */
    int SUB_FUNCTION = 132;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubstationImpl <em>Substation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SubstationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSubstation()
     * @generated
     */
    int SUBSTATION = 133;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TapChangerImpl <em>Tap Changer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TapChangerImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getTapChanger()
     * @generated
     */
    int TAP_CHANGER = 134;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TransformerWindingImpl <em>Transformer Winding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.TransformerWindingImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getTransformerWinding()
     * @generated
     */
    int TRANSFORMER_WINDING = 136;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageImpl <em>Voltage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getVoltage()
     * @generated
     */
    int VOLTAGE = 137;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl <em>Voltage Level</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.VoltageLevelImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getVoltageLevel()
     * @generated
     */
    int VOLTAGE_LEVEL = 138;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.UnNamingImpl <em>Un Naming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.UnNamingImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getUnNaming()
     * @generated
     */
    int UN_NAMING = 142;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_NAMING__LINE_NUMBER = BASE_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_NAMING__PRIVATE = BASE_ELEMENT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_NAMING__TEXT = BASE_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_NAMING__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_NAMING__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_NAMING__DESC = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Un Naming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_NAMING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Un Naming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_NAMING_OPERATION_COUNT = BASE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Sub Network</b></em>' containment reference list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__SUB_NETWORK = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent SCL</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION__PARENT_SCL = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Communication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Communication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMMUNICATION_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Ap Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__AP_NAME = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__IED_NAME = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Red Prot</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__RED_PROT = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__ADDRESS = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Sub Network</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__PARENT_SUB_NETWORK = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Refers To Access Point</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__REFERS_TO_ACCESS_POINT = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Phys Conn</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__PHYS_CONN = UN_NAMING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>GSE</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__GSE = UN_NAMING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>SMV</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__SMV = UN_NAMING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Control Block</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP__CONTROL_BLOCK = UN_NAMING_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Connected AP</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Connected AP</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTED_AP_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK__CB_NAME = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK__LD_INST = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK__ADDRESS = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Control With IED Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Control Block</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Parent Connected AP</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK___GET_PARENT_CONNECTED_AP = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Control Block</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_BLOCK_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 1;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__LINE_NUMBER = CONTROL_BLOCK__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__PRIVATE = CONTROL_BLOCK__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__TEXT = CONTROL_BLOCK__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__ANY = CONTROL_BLOCK__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__ANY_ATTRIBUTE = CONTROL_BLOCK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__DESC = CONTROL_BLOCK__DESC;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__CB_NAME = CONTROL_BLOCK__CB_NAME;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__LD_INST = CONTROL_BLOCK__LD_INST;

    /**
     * The feature id for the '<em><b>Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__ADDRESS = CONTROL_BLOCK__ADDRESS;

    /**
     * The feature id for the '<em><b>Refers To Control With IED Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__REFERS_TO_CONTROL_WITH_IED_NAME = CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME;

    /**
     * The feature id for the '<em><b>Min Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__MIN_TIME = CONTROL_BLOCK_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__MAX_TIME = CONTROL_BLOCK_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Connected AP</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE__PARENT_CONNECTED_AP = CONTROL_BLOCK_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>GSE</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_FEATURE_COUNT = CONTROL_BLOCK_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Parent Connected AP</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE___GET_PARENT_CONNECTED_AP = CONTROL_BLOCK___GET_PARENT_CONNECTED_AP;

    /**
     * The number of operations of the '<em>GSE</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_OPERATION_COUNT = CONTROL_BLOCK_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PADDR__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PADDR__TYPE = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PADDR__VALUE = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>PAddr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PADDR_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>PAddr</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PADDR_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int P__LINE_NUMBER = PADDR__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int P__TYPE = PADDR__TYPE;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int P__VALUE = PADDR__VALUE;

    /**
     * The feature id for the '<em><b>Parent Address</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int P__PARENT_ADDRESS = PADDR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int P_FEATURE_COUNT = PADDR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>P</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int P_OPERATION_COUNT = PADDR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PPHYS_CONN__LINE_NUMBER = PADDR__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PPHYS_CONN__TYPE = PADDR__TYPE;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PPHYS_CONN__VALUE = PADDR__VALUE;

    /**
     * The feature id for the '<em><b>Parent Phys Conn</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PPHYS_CONN__PARENT_PHYS_CONN = PADDR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>PPhys Conn</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PPHYS_CONN_FEATURE_COUNT = PADDR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>PPhys Conn</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PPHYS_CONN_OPERATION_COUNT = PADDR_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYS_CONN__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYS_CONN__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYS_CONN__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYS_CONN__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYS_CONN__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYS_CONN__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYS_CONN__TYPE = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Connected AP</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYS_CONN__PARENT_CONNECTED_AP = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>P</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYS_CONN__P = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Phys Conn</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYS_CONN_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Phys Conn</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PHYS_CONN_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV__LINE_NUMBER = CONTROL_BLOCK__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV__PRIVATE = CONTROL_BLOCK__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV__TEXT = CONTROL_BLOCK__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV__ANY = CONTROL_BLOCK__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV__ANY_ATTRIBUTE = CONTROL_BLOCK__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV__DESC = CONTROL_BLOCK__DESC;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV__CB_NAME = CONTROL_BLOCK__CB_NAME;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV__LD_INST = CONTROL_BLOCK__LD_INST;

    /**
     * The feature id for the '<em><b>Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV__ADDRESS = CONTROL_BLOCK__ADDRESS;

    /**
     * The feature id for the '<em><b>Refers To Control With IED Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV__REFERS_TO_CONTROL_WITH_IED_NAME = CONTROL_BLOCK__REFERS_TO_CONTROL_WITH_IED_NAME;

    /**
     * The feature id for the '<em><b>Parent Connected AP</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV__PARENT_CONNECTED_AP = CONTROL_BLOCK_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>SMV</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_FEATURE_COUNT = CONTROL_BLOCK_FEATURE_COUNT + 1;

    /**
     * The operation id for the '<em>Get Parent Connected AP</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV___GET_PARENT_CONNECTED_AP = CONTROL_BLOCK___GET_PARENT_CONNECTED_AP;

    /**
     * The number of operations of the '<em>SMV</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPERATION_COUNT = CONTROL_BLOCK_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK__LINE_NUMBER = NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK__PRIVATE = NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK__TEXT = NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK__ANY = NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK__ANY_ATTRIBUTE = NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK__DESC = NAMING__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK__NAME = NAMING__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK__TYPE = NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Bit Rate</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK__BIT_RATE = NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Communication</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK__PARENT_COMMUNICATION = NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Connected AP</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK__CONNECTED_AP = NAMING_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Sub Network</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK_FEATURE_COUNT = NAMING_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Sub Network</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_NETWORK_OPERATION_COUNT = NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>BType</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__BTYPE = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__COUNT = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>SAddr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__SADDR = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__TYPE = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Val Import</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Val Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__VAL_KIND = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Refers To Enum Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE = UN_NAMING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Val</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__VAL = UN_NAMING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Refers To DA Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE = UN_NAMING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Referred By FCDA</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA = UN_NAMING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF = UN_NAMING_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE__NAME = UN_NAMING_FEATURE_COUNT + 11;

    /**
     * The number of structural features of the '<em>Abstract Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 12;

    /**
     * The number of operations of the '<em>Abstract Data Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_ATTRIBUTE_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__LINE_NUMBER = ABSTRACT_DATA_ATTRIBUTE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__PRIVATE = ABSTRACT_DATA_ATTRIBUTE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__TEXT = ABSTRACT_DATA_ATTRIBUTE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__ANY = ABSTRACT_DATA_ATTRIBUTE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__ANY_ATTRIBUTE = ABSTRACT_DATA_ATTRIBUTE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__DESC = ABSTRACT_DATA_ATTRIBUTE__DESC;

    /**
     * The feature id for the '<em><b>BType</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__BTYPE = ABSTRACT_DATA_ATTRIBUTE__BTYPE;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__COUNT = ABSTRACT_DATA_ATTRIBUTE__COUNT;

    /**
     * The feature id for the '<em><b>SAddr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__SADDR = ABSTRACT_DATA_ATTRIBUTE__SADDR;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__TYPE = ABSTRACT_DATA_ATTRIBUTE__TYPE;

    /**
     * The feature id for the '<em><b>Val Import</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__VAL_IMPORT = ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT;

    /**
     * The feature id for the '<em><b>Val Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__VAL_KIND = ABSTRACT_DATA_ATTRIBUTE__VAL_KIND;

    /**
     * The feature id for the '<em><b>Refers To Enum Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__REFERS_TO_ENUM_TYPE = ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE;

    /**
     * The feature id for the '<em><b>Val</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__VAL = ABSTRACT_DATA_ATTRIBUTE__VAL;

    /**
     * The feature id for the '<em><b>Refers To DA Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__REFERS_TO_DA_TYPE = ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE;

    /**
     * The feature id for the '<em><b>Referred By FCDA</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__REFERRED_BY_FCDA = ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__REFERRED_BY_EXT_REF = ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__NAME = ABSTRACT_DATA_ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Parent DA Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA__PARENT_DA_TYPE = ABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>BDA</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA_FEATURE_COUNT = ABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>BDA</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BDA_OPERATION_COUNT = ABSTRACT_DATA_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__LINE_NUMBER = ABSTRACT_DATA_ATTRIBUTE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__PRIVATE = ABSTRACT_DATA_ATTRIBUTE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__TEXT = ABSTRACT_DATA_ATTRIBUTE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__ANY = ABSTRACT_DATA_ATTRIBUTE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__ANY_ATTRIBUTE = ABSTRACT_DATA_ATTRIBUTE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__DESC = ABSTRACT_DATA_ATTRIBUTE__DESC;

    /**
     * The feature id for the '<em><b>BType</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__BTYPE = ABSTRACT_DATA_ATTRIBUTE__BTYPE;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__COUNT = ABSTRACT_DATA_ATTRIBUTE__COUNT;

    /**
     * The feature id for the '<em><b>SAddr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__SADDR = ABSTRACT_DATA_ATTRIBUTE__SADDR;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__TYPE = ABSTRACT_DATA_ATTRIBUTE__TYPE;

    /**
     * The feature id for the '<em><b>Val Import</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__VAL_IMPORT = ABSTRACT_DATA_ATTRIBUTE__VAL_IMPORT;

    /**
     * The feature id for the '<em><b>Val Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__VAL_KIND = ABSTRACT_DATA_ATTRIBUTE__VAL_KIND;

    /**
     * The feature id for the '<em><b>Refers To Enum Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__REFERS_TO_ENUM_TYPE = ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_ENUM_TYPE;

    /**
     * The feature id for the '<em><b>Val</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__VAL = ABSTRACT_DATA_ATTRIBUTE__VAL;

    /**
     * The feature id for the '<em><b>Refers To DA Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__REFERS_TO_DA_TYPE = ABSTRACT_DATA_ATTRIBUTE__REFERS_TO_DA_TYPE;

    /**
     * The feature id for the '<em><b>Referred By FCDA</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__REFERRED_BY_FCDA = ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_FCDA;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__REFERRED_BY_EXT_REF = ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_EXT_REF;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__NAME = ABSTRACT_DATA_ATTRIBUTE__NAME;

    /**
     * The feature id for the '<em><b>Dchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__DCHG = ABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Dupd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__DUPD = ABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Qchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__QCHG = ABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__FC = ABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent DO Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__PARENT_DO_TYPE = ABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Prot Ns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA__PROT_NS = ABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>DA</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_FEATURE_COUNT = ABSTRACT_DATA_ATTRIBUTE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>DA</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_OPERATION_COUNT = ABSTRACT_DATA_ATTRIBUTE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__LINE_NUMBER = ID_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__PRIVATE = ID_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__TEXT = ID_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__ANY = ID_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__ANY_ATTRIBUTE = ID_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__DESC = ID_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__ID = ID_NAMING__ID;

    /**
     * The feature id for the '<em><b>Ied Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__IED_TYPE = ID_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>BDA</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__BDA = ID_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Referred By Abstract Data Attribute</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE = ID_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Data Type Templates</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__PARENT_DATA_TYPE_TEMPLATES = ID_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Prot Ns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE__PROT_NS = ID_NAMING_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>DA Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE_FEATURE_COUNT = ID_NAMING_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>DA Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DA_TYPE_OPERATION_COUNT = ID_NAMING_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataObjectImpl <em>Abstract Data Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AbstractDataObjectImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAbstractDataObject()
     * @generated
     */
    int ABSTRACT_DATA_OBJECT = 140;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT__NAME = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT__TYPE = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Refers To DO Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Abstract Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Abstract Data Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_DATA_OBJECT_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__LINE_NUMBER = ABSTRACT_DATA_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__PRIVATE = ABSTRACT_DATA_OBJECT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__TEXT = ABSTRACT_DATA_OBJECT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__ANY = ABSTRACT_DATA_OBJECT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__ANY_ATTRIBUTE = ABSTRACT_DATA_OBJECT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__DESC = ABSTRACT_DATA_OBJECT__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__NAME = ABSTRACT_DATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__TYPE = ABSTRACT_DATA_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Refers To DO Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__REFERS_TO_DO_TYPE = ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__REFERRED_BY_EXT_REF = ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF;

    /**
     * The feature id for the '<em><b>Transient</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__TRANSIENT = ABSTRACT_DATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent LNode Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__PARENT_LNODE_TYPE = ABSTRACT_DATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Access Control</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__ACCESS_CONTROL = ABSTRACT_DATA_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Referred By DOI</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__REFERRED_BY_DOI = ABSTRACT_DATA_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>DO</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_FEATURE_COUNT = ABSTRACT_DATA_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>DO</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_OPERATION_COUNT = ABSTRACT_DATA_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__LINE_NUMBER = ID_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__PRIVATE = ID_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__TEXT = ID_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__ANY = ID_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__ANY_ATTRIBUTE = ID_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__DESC = ID_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__ID = ID_NAMING__ID;

    /**
     * The feature id for the '<em><b>Cdc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__CDC = ID_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ied Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__IED_TYPE = ID_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>DA</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__DA = ID_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Referred By Abstract Data Object</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__REFERRED_BY_ABSTRACT_DATA_OBJECT = ID_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Data Type Templates</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__PARENT_DATA_TYPE_TEMPLATES = ID_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>SDO</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE__SDO = ID_NAMING_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>DO Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE_FEATURE_COUNT = ID_NAMING_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>DO Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_TYPE_OPERATION_COUNT = ID_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_TEMPLATES__LINE_NUMBER = EXPLICIT_LINK_RESOLVER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>DA Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_TEMPLATES__DA_TYPE = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>DO Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_TEMPLATES__DO_TYPE = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Enum Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_TEMPLATES__ENUM_TYPE = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>LNode Type</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_TEMPLATES__LNODE_TYPE = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent SCL</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_TEMPLATES__PARENT_SCL = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Data Type Templates</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_TEMPLATES_FEATURE_COUNT = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Data Type Templates</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_TEMPLATES_OPERATION_COUNT = EXPLICIT_LINK_RESOLVER_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE__LINE_NUMBER = ID_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE__PRIVATE = ID_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE__TEXT = ID_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE__ANY = ID_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE__ANY_ATTRIBUTE = ID_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE__DESC = ID_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE__ID = ID_NAMING__ID;

    /**
     * The feature id for the '<em><b>Referred By Abstract Data Attribute</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE__REFERRED_BY_ABSTRACT_DATA_ATTRIBUTE = ID_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Data Type Templates</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE__PARENT_DATA_TYPE_TEMPLATES = ID_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Enum Val</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE__ENUM_VAL = ID_NAMING_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Enum Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE_FEATURE_COUNT = ID_NAMING_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Enum Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_TYPE_OPERATION_COUNT = ID_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_VAL__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_VAL__DESC = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ord</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_VAL__ORD = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Enum Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_VAL__PARENT_ENUM_TYPE = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_VAL__VALUE = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Enum Val</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_VAL_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Enum Val</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_VAL_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__LINE_NUMBER = ID_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__PRIVATE = ID_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__TEXT = ID_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__ANY = ID_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__ANY_ATTRIBUTE = ID_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__DESC = ID_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__ID = ID_NAMING__ID;

    /**
     * The feature id for the '<em><b>Ied Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__IED_TYPE = ID_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__LN_CLASS = ID_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>DO</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__DO = ID_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Data Type Templates</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__PARENT_DATA_TYPE_TEMPLATES = ID_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Referred By Any LN</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE__REFERRED_BY_ANY_LN = ID_NAMING_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>LNode Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE_FEATURE_COUNT = ID_NAMING_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>LNode Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_TYPE_OPERATION_COUNT = ID_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROT_NS__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROT_NS__TYPE = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent DA</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROT_NS__PARENT_DA = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent DA Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROT_NS__PARENT_DA_TYPE = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROT_NS__VALUE = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Prot Ns</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROT_NS_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Prot Ns</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROT_NS_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__LINE_NUMBER = ABSTRACT_DATA_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__PRIVATE = ABSTRACT_DATA_OBJECT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__TEXT = ABSTRACT_DATA_OBJECT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__ANY = ABSTRACT_DATA_OBJECT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__ANY_ATTRIBUTE = ABSTRACT_DATA_OBJECT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__DESC = ABSTRACT_DATA_OBJECT__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__NAME = ABSTRACT_DATA_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__TYPE = ABSTRACT_DATA_OBJECT__TYPE;

    /**
     * The feature id for the '<em><b>Refers To DO Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__REFERS_TO_DO_TYPE = ABSTRACT_DATA_OBJECT__REFERS_TO_DO_TYPE;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__REFERRED_BY_EXT_REF = ABSTRACT_DATA_OBJECT__REFERRED_BY_EXT_REF;

    /**
     * The feature id for the '<em><b>Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__COUNT = ABSTRACT_DATA_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent DO Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO__PARENT_DO_TYPE = ABSTRACT_DATA_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>SDO</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO_FEATURE_COUNT = ABSTRACT_DATA_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>SDO</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDO_OPERATION_COUNT = ABSTRACT_DATA_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAL__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>SGroup</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAL__SGROUP = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Abstract Data Attribute</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAL__PARENT_ABSTRACT_DATA_ATTRIBUTE = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent DAI</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAL__PARENT_DAI = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAL__VALUE = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Val</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAL_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Val</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VAL_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.MinTimeImpl <em>Min Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.MinTimeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getMinTime()
     * @generated
     */
    int MIN_TIME = 155;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.MaxTimeImpl <em>Max Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.MaxTimeImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getMaxTime()
     * @generated
     */
    int MAX_TIME = 156;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_CONTROL__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent LDevice</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_CONTROL__PARENT_LDEVICE = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Access Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_CONTROL_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Access Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_CONTROL_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Clock</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__CLOCK = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Kdc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__KDC = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Router</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__ROUTER = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent IED</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__PARENT_IED = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>LN</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__LN = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>SMV Security</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__SMV_SECURITY = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Server At</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__SERVER_AT = UN_NAMING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Server</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__SERVER = UN_NAMING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Services</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__SERVICES = UN_NAMING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>GOOSE Security</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__GOOSE_SECURITY = UN_NAMING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Referred By Server At</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__REFERRED_BY_SERVER_AT = UN_NAMING_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__NAME = UN_NAMING_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Referred By Connected AP</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__REFERRED_BY_CONNECTED_AP = UN_NAMING_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Referred By KDC</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT__REFERRED_BY_KDC = UN_NAMING_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>Access Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 14;

    /**
     * The number of operations of the '<em>Access Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACCESS_POINT_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__INST = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__LN_CLASS = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ln Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__LN_TYPE = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To LNode Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__REFERS_TO_LNODE_TYPE = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__INPUTS = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Log</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__LOG = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>DOI</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__DOI = UN_NAMING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Report Control</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__REPORT_CONTROL = UN_NAMING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Log Control</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__LOG_CONTROL = UN_NAMING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__DATA_SET = UN_NAMING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Referred By Client LN</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__REFERRED_BY_CLIENT_LN = UN_NAMING_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Referred By Log Control</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__REFERRED_BY_LOG_CONTROL = UN_NAMING_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Referred By Association</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__REFERRED_BY_ASSOCIATION = UN_NAMING_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Referred By IED Name</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__REFERRED_BY_IED_NAME = UN_NAMING_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Referred By LNode</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__REFERRED_BY_LNODE = UN_NAMING_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Control With Trigger Opt</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__CONTROL_WITH_TRIGGER_OPT = UN_NAMING_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Control</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN__CONTROL = UN_NAMING_FEATURE_COUNT + 16;

    /**
     * The number of structural features of the '<em>Any LN</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 17;

    /**
     * The operation id for the '<em>Get Parent LDevice</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN___GET_PARENT_LDEVICE = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Any LN</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_LN_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 1;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__LINE_NUMBER = BASE_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__PRIVATE = BASE_ELEMENT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__TEXT = BASE_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__DESC = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__IED_NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__LD_INST = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__LN_CLASS = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__LN_INST = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__PREFIX = BASE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Association ID</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ASSOCIATION_ID = BASE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__KIND = BASE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Parent Server</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__PARENT_SERVER = BASE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Refers To Any LN</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__REFERS_TO_ANY_LN = BASE_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_OPERATION_COUNT = BASE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Certificate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION__CERTIFICATE = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>None</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION__NONE = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION__PASSWORD = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Strong</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION__STRONG = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Weak</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION__WEAK = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Server</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION__PARENT_SERVER = SCL_OBJECT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHENTICATION_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE__LINE_NUMBER = NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE__PRIVATE = NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE__TEXT = NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE__ANY = NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE__ANY_ATTRIBUTE = NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE__DESC = NAMING__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE__NAME = NAMING__NAME;

    /**
     * The feature id for the '<em><b>Serial Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE__SERIAL_NUMBER = NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Xfer Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE__XFER_NUMBER = NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE__SUBJECT = NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Issuer Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE__ISSUER_NAME = NAMING_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Certificate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE_FEATURE_COUNT = NAMING_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Certificate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERTIFICATE_OPERATION_COUNT = NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN__LINE_NUMBER = EXPLICIT_LINK_RESOLVER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN__DESC = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN__IED_NAME = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN__LD_INST = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN__LN_CLASS = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN__LN_INST = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN__PREFIX = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Ap Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN__AP_REF = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Parent Rpt Enabled</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN__PARENT_RPT_ENABLED = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Refers To Any LN</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN__REFERS_TO_ANY_LN = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Client LN</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN_FEATURE_COUNT = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>Client LN</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_LN_OPERATION_COUNT = EXPLICIT_LINK_RESOLVER_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Buf Report</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__BUF_REPORT = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Goose</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__GOOSE = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Gsse</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__GSSE = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Max Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__MAX_ATTRIBUTES = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Max GOOSE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__MAX_GOOSE = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Max Reports</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__MAX_REPORTS = SCL_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Max SMV</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__MAX_SMV = SCL_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Read Log</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__READ_LOG = SCL_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Supports Ld Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__SUPPORTS_LD_NAME = SCL_OBJECT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Sv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__SV = SCL_OBJECT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Unbuf Report</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__UNBUF_REPORT = SCL_OBJECT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__PARENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Time Sync Prot</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__TIME_SYNC_PROT = SCL_OBJECT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>RGOOSE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__RGOOSE = SCL_OBJECT_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>RSV</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__RSV = SCL_OBJECT_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>No Ict Binding</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__NO_ICT_BINDING = SCL_OBJECT_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Mc Security</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES__MC_SECURITY = SCL_OBJECT_FEATURE_COUNT + 16;

    /**
     * The number of structural features of the '<em>Client Services</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 17;

    /**
     * The number of operations of the '<em>Client Services</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_SERVICES_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PROT__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Ipv6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PROT__IPV6 = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PROT__PARENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Comm Prot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PROT_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Comm Prot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMM_PROT_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX__MAX = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service With Max</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Service With Max</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithMaxAndMaxAttributesImpl <em>Service With Max And Max Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithMaxAndMaxAttributesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceWithMaxAndMaxAttributes()
     * @generated
     */
    int SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES = 147;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__LINE_NUMBER = SERVICE_WITH_MAX__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX = SERVICE_WITH_MAX__MAX;

    /**
     * The feature id for the '<em><b>Max Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES = SERVICE_WITH_MAX_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service With Max And Max Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_FEATURE_COUNT = SERVICE_WITH_MAX_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Service With Max And Max Attributes</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_OPERATION_COUNT = SERVICE_WITH_MAX_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceForConfDataSetImpl <em>Service For Conf Data Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceForConfDataSetImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceForConfDataSet()
     * @generated
     */
    int SERVICE_FOR_CONF_DATA_SET = 149;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_FOR_CONF_DATA_SET__LINE_NUMBER = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_FOR_CONF_DATA_SET__MAX = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX;

    /**
     * The feature id for the '<em><b>Max Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_FOR_CONF_DATA_SET__MAX_ATTRIBUTES = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Modify</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_FOR_CONF_DATA_SET__MODIFY = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service For Conf Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_FOR_CONF_DATA_SET_FEATURE_COUNT = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Service For Conf Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_FOR_CONF_DATA_SET_OPERATION_COUNT = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_DATA_SET__LINE_NUMBER = SERVICE_FOR_CONF_DATA_SET__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_DATA_SET__MAX = SERVICE_FOR_CONF_DATA_SET__MAX;

    /**
     * The feature id for the '<em><b>Max Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_DATA_SET__MAX_ATTRIBUTES = SERVICE_FOR_CONF_DATA_SET__MAX_ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Modify</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_DATA_SET__MODIFY = SERVICE_FOR_CONF_DATA_SET__MODIFY;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_DATA_SET__PARENT_SERVICES = SERVICE_FOR_CONF_DATA_SET_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Conf Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_DATA_SET_FEATURE_COUNT = SERVICE_FOR_CONF_DATA_SET_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Conf Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_DATA_SET_OPERATION_COUNT = SERVICE_FOR_CONF_DATA_SET_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LNS__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Fix Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LNS__FIX_LN_INST = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Fix Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LNS__FIX_PREFIX = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LNS__PARENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Conf LNs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LNS_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Conf LNs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LNS_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceYesNoImpl <em>Service Yes No</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceYesNoImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceYesNo()
     * @generated
     */
    int SERVICE_YES_NO = 143;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_YES_NO__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The number of structural features of the '<em>Service Yes No</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_YES_NO_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Service Yes No</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_YES_NO_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LD_NAME__LINE_NUMBER = SERVICE_YES_NO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LD_NAME__PARENT_SERVICES = SERVICE_YES_NO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Conf Ld Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LD_NAME_FEATURE_COUNT = SERVICE_YES_NO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Conf Ld Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LD_NAME_OPERATION_COUNT = SERVICE_YES_NO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithMaxNonZeroImpl <em>Service With Max Non Zero</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithMaxNonZeroImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceWithMaxNonZero()
     * @generated
     */
    int SERVICE_WITH_MAX_NON_ZERO = 145;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_NON_ZERO__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_NON_ZERO__MAX = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service With Max Non Zero</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_NON_ZERO_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Service With Max Non Zero</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_NON_ZERO_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LOG_CONTROL__LINE_NUMBER = SERVICE_WITH_MAX_NON_ZERO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LOG_CONTROL__MAX = SERVICE_WITH_MAX_NON_ZERO__MAX;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LOG_CONTROL__PARENT_SERVICES = SERVICE_WITH_MAX_NON_ZERO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Conf Log Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LOG_CONTROL_FEATURE_COUNT = SERVICE_WITH_MAX_NON_ZERO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Conf Log Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_LOG_CONTROL_OPERATION_COUNT = SERVICE_WITH_MAX_NON_ZERO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceConfReportControlImpl <em>Service Conf Report Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceConfReportControlImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceConfReportControl()
     * @generated
     */
    int SERVICE_CONF_REPORT_CONTROL = 146;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONF_REPORT_CONTROL__LINE_NUMBER = SERVICE_WITH_MAX__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONF_REPORT_CONTROL__MAX = SERVICE_WITH_MAX__MAX;

    /**
     * The feature id for the '<em><b>Buf Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONF_REPORT_CONTROL__BUF_MODE = SERVICE_WITH_MAX_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Buf Conf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONF_REPORT_CONTROL__BUF_CONF = SERVICE_WITH_MAX_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Max Buf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONF_REPORT_CONTROL__MAX_BUF = SERVICE_WITH_MAX_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Service Conf Report Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONF_REPORT_CONTROL_FEATURE_COUNT = SERVICE_WITH_MAX_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Service Conf Report Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_CONF_REPORT_CONTROL_OPERATION_COUNT = SERVICE_WITH_MAX_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_REPORT_CONTROL__LINE_NUMBER = SERVICE_CONF_REPORT_CONTROL__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_REPORT_CONTROL__MAX = SERVICE_CONF_REPORT_CONTROL__MAX;

    /**
     * The feature id for the '<em><b>Buf Mode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_REPORT_CONTROL__BUF_MODE = SERVICE_CONF_REPORT_CONTROL__BUF_MODE;

    /**
     * The feature id for the '<em><b>Buf Conf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_REPORT_CONTROL__BUF_CONF = SERVICE_CONF_REPORT_CONTROL__BUF_CONF;

    /**
     * The feature id for the '<em><b>Max Buf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_REPORT_CONTROL__MAX_BUF = SERVICE_CONF_REPORT_CONTROL__MAX_BUF;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_REPORT_CONTROL__PARENT_SERVICES = SERVICE_CONF_REPORT_CONTROL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Conf Report Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_REPORT_CONTROL_FEATURE_COUNT = SERVICE_CONF_REPORT_CONTROL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Conf Report Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_REPORT_CONTROL_OPERATION_COUNT = SERVICE_CONF_REPORT_CONTROL_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_SG__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Resv Tms</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_SG__RESV_TMS = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Setting Groups</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_SG__PARENT_SETTING_GROUPS = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Conf SG</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_SG_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Conf SG</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_SG_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_SIG_REF__LINE_NUMBER = SERVICE_WITH_MAX_NON_ZERO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_SIG_REF__MAX = SERVICE_WITH_MAX_NON_ZERO__MAX;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_SIG_REF__PARENT_SERVICES = SERVICE_WITH_MAX_NON_ZERO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Conf Sig Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_SIG_REF_FEATURE_COUNT = SERVICE_WITH_MAX_NON_ZERO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Conf Sig Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONF_SIG_REF_OPERATION_COUNT = SERVICE_WITH_MAX_NON_ZERO_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__DAT_SET = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Refers To Data Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__REFERS_TO_DATA_SET = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__NAME = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__REFERRED_BY_EXT_REF = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Parent Any LN</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL___GET_PARENT_ANY_LN = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The number of operations of the '<em>Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 1;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__LINE_NUMBER = CONTROL__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__PRIVATE = CONTROL__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__TEXT = CONTROL__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__ANY = CONTROL__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__ANY_ATTRIBUTE = CONTROL__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__DESC = CONTROL__DESC;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__DAT_SET = CONTROL__DAT_SET;

    /**
     * The feature id for the '<em><b>Refers To Data Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__REFERS_TO_DATA_SET = CONTROL__REFERS_TO_DATA_SET;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__NAME = CONTROL__NAME;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__REFERRED_BY_EXT_REF = CONTROL__REFERRED_BY_EXT_REF;

    /**
     * The feature id for the '<em><b>Conf Rev</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__CONF_REV = CONTROL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>IED Name</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__IED_NAME = CONTROL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Referred By Control Block</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK = CONTROL_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Protocol</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME__PROTOCOL = CONTROL_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Control With IED Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 4;

    /**
     * The operation id for the '<em>Get Parent Any LN</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME___GET_PARENT_ANY_LN = CONTROL___GET_PARENT_ANY_LN;

    /**
     * The number of operations of the '<em>Control With IED Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_IED_NAME_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__LINE_NUMBER = CONTROL__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__PRIVATE = CONTROL__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__TEXT = CONTROL__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__ANY = CONTROL__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__ANY_ATTRIBUTE = CONTROL__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__DESC = CONTROL__DESC;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__DAT_SET = CONTROL__DAT_SET;

    /**
     * The feature id for the '<em><b>Refers To Data Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__REFERS_TO_DATA_SET = CONTROL__REFERS_TO_DATA_SET;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__NAME = CONTROL__NAME;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__REFERRED_BY_EXT_REF = CONTROL__REFERRED_BY_EXT_REF;

    /**
     * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__INTG_PD = CONTROL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Trg Ops</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT__TRG_OPS = CONTROL_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Control With Trigger Opt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

    /**
     * The operation id for the '<em>Get Parent Any LN</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT___GET_PARENT_ANY_LN = CONTROL___GET_PARENT_ANY_LN;

    /**
     * The number of operations of the '<em>Control With Trigger Opt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_WITH_TRIGGER_OPT_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Ix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__IX = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>SAddr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__SADDR = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Val Import</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__VAL_IMPORT = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Val Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__VAL_KIND = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Val</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__VAL = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent DOI</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__PARENT_DOI = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Parent SDI</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__PARENT_SDI = UN_NAMING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI__NAME = UN_NAMING_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>DAI</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>DAI</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DAI_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Ix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__IX = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Any LN</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__PARENT_ANY_LN = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>DAI</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__DAI = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>SDI</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__SDI = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Access Control</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__ACCESS_CONTROL = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__NAME = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Refers To DO</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI__REFERS_TO_DO = UN_NAMING_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>DOI</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>DOI</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOI_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_DIRECTORY__LINE_NUMBER = SERVICE_YES_NO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_DIRECTORY__PARENT_SERVICES = SERVICE_YES_NO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data Object Directory</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_DIRECTORY_FEATURE_COUNT = SERVICE_YES_NO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Data Object Directory</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_OBJECT_DIRECTORY_OPERATION_COUNT = SERVICE_YES_NO_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Parent Any LN</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__PARENT_ANY_LN = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Referred By Control</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__REFERRED_BY_CONTROL = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>FCDA</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__FCDA = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET__NAME = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DIRECTORY__LINE_NUMBER = SERVICE_YES_NO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DIRECTORY__PARENT_SERVICES = SERVICE_YES_NO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data Set Directory</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DIRECTORY_FEATURE_COUNT = SERVICE_YES_NO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Data Set Directory</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_SET_DIRECTORY_OPERATION_COUNT = SERVICE_YES_NO_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithOptionalMaxImpl <em>Service With Optional Max</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithOptionalMaxImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceWithOptionalMax()
     * @generated
     */
    int SERVICE_WITH_OPTIONAL_MAX = 144;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_OPTIONAL_MAX__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_OPTIONAL_MAX__MAX = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service With Optional Max</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_OPTIONAL_MAX_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Service With Optional Max</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_OPTIONAL_MAX_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYN_ASSOCIATION__LINE_NUMBER = SERVICE_WITH_OPTIONAL_MAX__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYN_ASSOCIATION__MAX = SERVICE_WITH_OPTIONAL_MAX__MAX;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYN_ASSOCIATION__PARENT_SERVICES = SERVICE_WITH_OPTIONAL_MAX_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dyn Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYN_ASSOCIATION_FEATURE_COUNT = SERVICE_WITH_OPTIONAL_MAX_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Dyn Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYN_ASSOCIATION_OPERATION_COUNT = SERVICE_WITH_OPTIONAL_MAX_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYN_DATA_SET__LINE_NUMBER = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYN_DATA_SET__MAX = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX;

    /**
     * The feature id for the '<em><b>Max Attributes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYN_DATA_SET__MAX_ATTRIBUTES = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES__MAX_ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYN_DATA_SET__PARENT_SERVICES = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Dyn Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYN_DATA_SET_FEATURE_COUNT = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Dyn Data Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DYN_DATA_SET_OPERATION_COUNT = SERVICE_WITH_MAX_AND_MAX_ATTRIBUTES_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__LINE_NUMBER = BASE_ELEMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__PRIVATE = BASE_ELEMENT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__TEXT = BASE_ELEMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__ANY = BASE_ELEMENT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__ANY_ATTRIBUTE = BASE_ELEMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__DESC = BASE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__DA_NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__DO_NAME = BASE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__IED_NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Int Addr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__INT_ADDR = BASE_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__LD_INST = BASE_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__LN_CLASS = BASE_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__LN_INST = BASE_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__PREFIX = BASE_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Service Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__SERVICE_TYPE = BASE_ELEMENT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Src CB Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__SRC_CB_NAME = BASE_ELEMENT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Src LD Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__SRC_LD_INST = BASE_ELEMENT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Src LN Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__SRC_LN_CLASS = BASE_ELEMENT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Src LN Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__SRC_LN_INST = BASE_ELEMENT_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>Src Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__SRC_PREFIX = BASE_ELEMENT_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>Parent Inputs</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__PARENT_INPUTS = BASE_ELEMENT_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>Refers To Abstract Data Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE = BASE_ELEMENT_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>Refers To Abstract Data Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__REFERS_TO_ABSTRACT_DATA_OBJECT = BASE_ELEMENT_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>PServ T</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__PSERV_T = BASE_ELEMENT_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>PLN</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__PLN = BASE_ELEMENT_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>PDO</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__PDO = BASE_ELEMENT_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>PDA</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__PDA = BASE_ELEMENT_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Refers To Control</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF__REFERS_TO_CONTROL = BASE_ELEMENT_FEATURE_COUNT + 22;

    /**
     * The number of structural features of the '<em>Ext Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 23;

    /**
     * The number of operations of the '<em>Ext Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXT_REF_OPERATION_COUNT = BASE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA__LINE_NUMBER = EXPLICIT_LINK_RESOLVER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Da Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA__DA_NAME = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Do Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA__DO_NAME = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Fc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA__FC = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA__IX = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA__LD_INST = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA__LN_CLASS = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA__LN_INST = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA__PREFIX = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Parent Data Set</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA__PARENT_DATA_SET = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Refers To Abstract Data Attribute</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>FCDA</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA_FEATURE_COUNT = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>FCDA</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FCDA_OPERATION_COUNT = EXPLICIT_LINK_RESOLVER_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_HANDLING__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Ftp</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_HANDLING__FTP = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ftps</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_HANDLING__FTPS = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Mms</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_HANDLING__MMS = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_HANDLING__PARENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>File Handling</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_HANDLING_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>File Handling</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FILE_HANDLING_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE__LINE_NUMBER = SERVICE_WITH_MAX__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE__MAX = SERVICE_WITH_MAX__MAX;

    /**
     * The feature id for the '<em><b>Fixed Offs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE__FIXED_OFFS = SERVICE_WITH_MAX_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE__PARENT_SERVICES = SERVICE_WITH_MAX_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Goose</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE__GOOSE = SERVICE_WITH_MAX_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>RGOOSE</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE__RGOOSE = SERVICE_WITH_MAX_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>GOOSE</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_FEATURE_COUNT = SERVICE_WITH_MAX_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>GOOSE</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_OPERATION_COUNT = SERVICE_WITH_MAX_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__LINE_NUMBER = CERTIFICATE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__PRIVATE = CERTIFICATE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__TEXT = CERTIFICATE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__ANY = CERTIFICATE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__ANY_ATTRIBUTE = CERTIFICATE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__DESC = CERTIFICATE__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__NAME = CERTIFICATE__NAME;

    /**
     * The feature id for the '<em><b>Serial Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__SERIAL_NUMBER = CERTIFICATE__SERIAL_NUMBER;

    /**
     * The feature id for the '<em><b>Xfer Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__XFER_NUMBER = CERTIFICATE__XFER_NUMBER;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__SUBJECT = CERTIFICATE__SUBJECT;

    /**
     * The feature id for the '<em><b>Issuer Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__ISSUER_NAME = CERTIFICATE__ISSUER_NAME;

    /**
     * The feature id for the '<em><b>Parent Access Point</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY__PARENT_ACCESS_POINT = CERTIFICATE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>GOOSE Security</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY_FEATURE_COUNT = CERTIFICATE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>GOOSE Security</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOOSE_SECURITY_OPERATION_COUNT = CERTIFICATE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__LINE_NUMBER = CONTROL_WITH_IED_NAME__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__PRIVATE = CONTROL_WITH_IED_NAME__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__TEXT = CONTROL_WITH_IED_NAME__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__ANY = CONTROL_WITH_IED_NAME__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__ANY_ATTRIBUTE = CONTROL_WITH_IED_NAME__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__DESC = CONTROL_WITH_IED_NAME__DESC;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__DAT_SET = CONTROL_WITH_IED_NAME__DAT_SET;

    /**
     * The feature id for the '<em><b>Refers To Data Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__REFERS_TO_DATA_SET = CONTROL_WITH_IED_NAME__REFERS_TO_DATA_SET;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__NAME = CONTROL_WITH_IED_NAME__NAME;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__REFERRED_BY_EXT_REF = CONTROL_WITH_IED_NAME__REFERRED_BY_EXT_REF;

    /**
     * The feature id for the '<em><b>Conf Rev</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__CONF_REV = CONTROL_WITH_IED_NAME__CONF_REV;

    /**
     * The feature id for the '<em><b>IED Name</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__IED_NAME = CONTROL_WITH_IED_NAME__IED_NAME;

    /**
     * The feature id for the '<em><b>Referred By Control Block</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__REFERRED_BY_CONTROL_BLOCK = CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK;

    /**
     * The feature id for the '<em><b>Protocol</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__PROTOCOL = CONTROL_WITH_IED_NAME__PROTOCOL;

    /**
     * The feature id for the '<em><b>App ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__APP_ID = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Fixed Offs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__FIXED_OFFS = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Security Enable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__SECURITY_ENABLE = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__TYPE = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent LN0</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL__PARENT_LN0 = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>GSE Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL_FEATURE_COUNT = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Get Parent Any LN</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL___GET_PARENT_ANY_LN = CONTROL_WITH_IED_NAME___GET_PARENT_ANY_LN;

    /**
     * The number of operations of the '<em>GSE Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_CONTROL_OPERATION_COUNT = CONTROL_WITH_IED_NAME_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_DIR__LINE_NUMBER = SERVICE_YES_NO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_DIR__PARENT_SERVICES = SERVICE_YES_NO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>GSE Dir</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_DIR_FEATURE_COUNT = SERVICE_YES_NO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>GSE Dir</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_DIR_OPERATION_COUNT = SERVICE_YES_NO_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SETTINGS__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SETTINGS__CB_NAME = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SETTINGS__DAT_SET = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Service Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SETTINGS_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Service Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_SETTINGS_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_SETTINGS__LINE_NUMBER = SERVICE_SETTINGS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_SETTINGS__CB_NAME = SERVICE_SETTINGS__CB_NAME;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_SETTINGS__DAT_SET = SERVICE_SETTINGS__DAT_SET;

    /**
     * The feature id for the '<em><b>App ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_SETTINGS__APP_ID = SERVICE_SETTINGS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_SETTINGS__DATA_LABEL = SERVICE_SETTINGS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_SETTINGS__PARENT_SERVICES = SERVICE_SETTINGS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Mc Security</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_SETTINGS__MC_SECURITY = SERVICE_SETTINGS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Kda Participant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_SETTINGS__KDA_PARTICIPANT = SERVICE_SETTINGS_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>GSE Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_SETTINGS_FEATURE_COUNT = SERVICE_SETTINGS_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>GSE Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSE_SETTINGS_OPERATION_COUNT = SERVICE_SETTINGS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSSE__LINE_NUMBER = SERVICE_WITH_MAX__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSSE__MAX = SERVICE_WITH_MAX__MAX;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSSE__PARENT_SERVICES = SERVICE_WITH_MAX_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>GSSE</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSSE_FEATURE_COUNT = SERVICE_WITH_MAX_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>GSSE</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GSSE_OPERATION_COUNT = SERVICE_WITH_MAX_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_CB_VALUES__LINE_NUMBER = SERVICE_YES_NO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_CB_VALUES__PARENT_SERVICES = SERVICE_YES_NO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Get CB Values</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_CB_VALUES_FEATURE_COUNT = SERVICE_YES_NO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Get CB Values</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_CB_VALUES_OPERATION_COUNT = SERVICE_YES_NO_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DATA_OBJECT_DEFINITION__LINE_NUMBER = SERVICE_YES_NO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DATA_OBJECT_DEFINITION__PARENT_SERVICES = SERVICE_YES_NO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Get Data Object Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DATA_OBJECT_DEFINITION_FEATURE_COUNT = SERVICE_YES_NO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Get Data Object Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DATA_OBJECT_DEFINITION_OPERATION_COUNT = SERVICE_YES_NO_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DATA_SET_VALUE__LINE_NUMBER = SERVICE_YES_NO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DATA_SET_VALUE__PARENT_SERVICES = SERVICE_YES_NO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Get Data Set Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DATA_SET_VALUE_FEATURE_COUNT = SERVICE_YES_NO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Get Data Set Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DATA_SET_VALUE_OPERATION_COUNT = SERVICE_YES_NO_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DIRECTORY__LINE_NUMBER = SERVICE_YES_NO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DIRECTORY__PARENT_SERVICES = SERVICE_YES_NO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Get Directory</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DIRECTORY_FEATURE_COUNT = SERVICE_YES_NO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Get Directory</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GET_DIRECTORY_OPERATION_COUNT = SERVICE_YES_NO_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Config Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__CONFIG_VERSION = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Eng Right</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__ENG_RIGHT = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__MANUFACTURER = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Original Scl Revision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__ORIGINAL_SCL_REVISION = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Original Scl Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__ORIGINAL_SCL_VERSION = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Owner</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__OWNER = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__TYPE = UN_NAMING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Access Point</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__ACCESS_POINT = UN_NAMING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>KDC</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__KDC = UN_NAMING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Services</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__SERVICES = UN_NAMING_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Parent SCL</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__PARENT_SCL = UN_NAMING_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__NAME = UN_NAMING_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Original Scl Release</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__ORIGINAL_SCL_RELEASE = UN_NAMING_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Referred By IED Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED__REFERRED_BY_IED_NAME = UN_NAMING_FEATURE_COUNT + 13;

    /**
     * The number of structural features of the '<em>IED</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 14;

    /**
     * The number of operations of the '<em>IED</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME__LINE_NUMBER = EXPLICIT_LINK_RESOLVER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Ap Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME__AP_REF = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME__LD_INST = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME__LN_CLASS = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME__LN_INST = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME__PREFIX = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Control With IED Name</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME__PARENT_CONTROL_WITH_IED_NAME = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Refers To Any LN</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME__REFERS_TO_ANY_LN = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME__VALUE = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Refers To IED</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME__REFERS_TO_IED = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Refers To LDevice</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME__REFERS_TO_LDEVICE = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>IED Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME_FEATURE_COUNT = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>IED Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IED_NAME_OPERATION_COUNT = EXPLICIT_LINK_RESOLVER_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Parent Any LN</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS__PARENT_ANY_LN = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ext Ref</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS__EXT_REF = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Inputs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Inputs</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUTS_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertImpl <em>Cert</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.CertImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getCert()
     * @generated
     */
    int CERT = 150;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERT__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Common Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERT__COMMON_NAME = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id Hierarchy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERT__ID_HIERARCHY = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Cert</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERT_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Cert</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CERT_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISSUER_NAME__LINE_NUMBER = CERT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Common Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISSUER_NAME__COMMON_NAME = CERT__COMMON_NAME;

    /**
     * The feature id for the '<em><b>Id Hierarchy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISSUER_NAME__ID_HIERARCHY = CERT__ID_HIERARCHY;

    /**
     * The feature id for the '<em><b>Parent Certificate</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISSUER_NAME__PARENT_CERTIFICATE = CERT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Issuer Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISSUER_NAME_FEATURE_COUNT = CERT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Issuer Name</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ISSUER_NAME_OPERATION_COUNT = CERT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KDC__LINE_NUMBER = EXPLICIT_LINK_RESOLVER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Ap Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KDC__AP_NAME = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KDC__IED_NAME = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent IED</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KDC__PARENT_IED = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Refers To Access Point</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KDC__REFERS_TO_ACCESS_POINT = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>KDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KDC_FEATURE_COUNT = EXPLICIT_LINK_RESOLVER_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>KDC</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KDC_OPERATION_COUNT = EXPLICIT_LINK_RESOLVER_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__INST = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ld Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__LD_NAME = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Access Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__ACCESS_CONTROL = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Server</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__PARENT_SERVER = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Any LN</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__ANY_LN = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>LN0</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__LN0 = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>LN</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__LN = UN_NAMING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Referred By IED Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE__REFERRED_BY_IED_NAME = UN_NAMING_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>LDevice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>LDevice</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LDEVICE_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__LINE_NUMBER = ANY_LN__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__PRIVATE = ANY_LN__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__TEXT = ANY_LN__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__ANY = ANY_LN__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__ANY_ATTRIBUTE = ANY_LN__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__DESC = ANY_LN__DESC;

    /**
     * The feature id for the '<em><b>Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__INST = ANY_LN__INST;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__LN_CLASS = ANY_LN__LN_CLASS;

    /**
     * The feature id for the '<em><b>Ln Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__LN_TYPE = ANY_LN__LN_TYPE;

    /**
     * The feature id for the '<em><b>Refers To LNode Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__REFERS_TO_LNODE_TYPE = ANY_LN__REFERS_TO_LNODE_TYPE;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__INPUTS = ANY_LN__INPUTS;

    /**
     * The feature id for the '<em><b>Log</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__LOG = ANY_LN__LOG;

    /**
     * The feature id for the '<em><b>DOI</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__DOI = ANY_LN__DOI;

    /**
     * The feature id for the '<em><b>Report Control</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__REPORT_CONTROL = ANY_LN__REPORT_CONTROL;

    /**
     * The feature id for the '<em><b>Log Control</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__LOG_CONTROL = ANY_LN__LOG_CONTROL;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__DATA_SET = ANY_LN__DATA_SET;

    /**
     * The feature id for the '<em><b>Referred By Client LN</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__REFERRED_BY_CLIENT_LN = ANY_LN__REFERRED_BY_CLIENT_LN;

    /**
     * The feature id for the '<em><b>Referred By Log Control</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__REFERRED_BY_LOG_CONTROL = ANY_LN__REFERRED_BY_LOG_CONTROL;

    /**
     * The feature id for the '<em><b>Referred By Association</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__REFERRED_BY_ASSOCIATION = ANY_LN__REFERRED_BY_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Referred By IED Name</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__REFERRED_BY_IED_NAME = ANY_LN__REFERRED_BY_IED_NAME;

    /**
     * The feature id for the '<em><b>Referred By LNode</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__REFERRED_BY_LNODE = ANY_LN__REFERRED_BY_LNODE;

    /**
     * The feature id for the '<em><b>Control With Trigger Opt</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__CONTROL_WITH_TRIGGER_OPT = ANY_LN__CONTROL_WITH_TRIGGER_OPT;

    /**
     * The feature id for the '<em><b>Control</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__CONTROL = ANY_LN__CONTROL;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__PREFIX = ANY_LN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Access Point</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__PARENT_ACCESS_POINT = ANY_LN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent LDevice</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN__PARENT_LDEVICE = ANY_LN_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>LN</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_FEATURE_COUNT = ANY_LN_FEATURE_COUNT + 3;

    /**
     * The operation id for the '<em>Get Parent LDevice</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN___GET_PARENT_LDEVICE = ANY_LN___GET_PARENT_LDEVICE;

    /**
     * The number of operations of the '<em>LN</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN_OPERATION_COUNT = ANY_LN_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__LINE_NUMBER = ANY_LN__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__PRIVATE = ANY_LN__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__TEXT = ANY_LN__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__ANY = ANY_LN__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__ANY_ATTRIBUTE = ANY_LN__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__DESC = ANY_LN__DESC;

    /**
     * The feature id for the '<em><b>Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__INST = ANY_LN__INST;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__LN_CLASS = ANY_LN__LN_CLASS;

    /**
     * The feature id for the '<em><b>Ln Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__LN_TYPE = ANY_LN__LN_TYPE;

    /**
     * The feature id for the '<em><b>Refers To LNode Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__REFERS_TO_LNODE_TYPE = ANY_LN__REFERS_TO_LNODE_TYPE;

    /**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__INPUTS = ANY_LN__INPUTS;

    /**
     * The feature id for the '<em><b>Log</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__LOG = ANY_LN__LOG;

    /**
     * The feature id for the '<em><b>DOI</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__DOI = ANY_LN__DOI;

    /**
     * The feature id for the '<em><b>Report Control</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__REPORT_CONTROL = ANY_LN__REPORT_CONTROL;

    /**
     * The feature id for the '<em><b>Log Control</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__LOG_CONTROL = ANY_LN__LOG_CONTROL;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__DATA_SET = ANY_LN__DATA_SET;

    /**
     * The feature id for the '<em><b>Referred By Client LN</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__REFERRED_BY_CLIENT_LN = ANY_LN__REFERRED_BY_CLIENT_LN;

    /**
     * The feature id for the '<em><b>Referred By Log Control</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__REFERRED_BY_LOG_CONTROL = ANY_LN__REFERRED_BY_LOG_CONTROL;

    /**
     * The feature id for the '<em><b>Referred By Association</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__REFERRED_BY_ASSOCIATION = ANY_LN__REFERRED_BY_ASSOCIATION;

    /**
     * The feature id for the '<em><b>Referred By IED Name</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__REFERRED_BY_IED_NAME = ANY_LN__REFERRED_BY_IED_NAME;

    /**
     * The feature id for the '<em><b>Referred By LNode</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__REFERRED_BY_LNODE = ANY_LN__REFERRED_BY_LNODE;

    /**
     * The feature id for the '<em><b>Control With Trigger Opt</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__CONTROL_WITH_TRIGGER_OPT = ANY_LN__CONTROL_WITH_TRIGGER_OPT;

    /**
     * The feature id for the '<em><b>Control</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__CONTROL = ANY_LN__CONTROL;

    /**
     * The feature id for the '<em><b>GSE Control</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__GSE_CONTROL = ANY_LN_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent LDevice</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__PARENT_LDEVICE = ANY_LN_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sampled Value Control</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__SAMPLED_VALUE_CONTROL = ANY_LN_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Setting Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__SETTING_CONTROL = ANY_LN_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Control With IED Name</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0__CONTROL_WITH_IED_NAME = ANY_LN_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>LN0</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0_FEATURE_COUNT = ANY_LN_FEATURE_COUNT + 5;

    /**
     * The operation id for the '<em>Get Parent LDevice</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0___GET_PARENT_LDEVICE = ANY_LN___GET_PARENT_LDEVICE;

    /**
     * The number of operations of the '<em>LN0</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LN0_OPERATION_COUNT = ANY_LN_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Parent Any LN</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG__PARENT_ANY_LN = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG__NAME = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Referred By Log Control</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG__REFERRED_BY_LOG_CONTROL = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Log</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Log</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__LINE_NUMBER = CONTROL_WITH_TRIGGER_OPT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__PRIVATE = CONTROL_WITH_TRIGGER_OPT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__TEXT = CONTROL_WITH_TRIGGER_OPT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__ANY = CONTROL_WITH_TRIGGER_OPT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__ANY_ATTRIBUTE = CONTROL_WITH_TRIGGER_OPT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__DESC = CONTROL_WITH_TRIGGER_OPT__DESC;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__DAT_SET = CONTROL_WITH_TRIGGER_OPT__DAT_SET;

    /**
     * The feature id for the '<em><b>Refers To Data Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__REFERS_TO_DATA_SET = CONTROL_WITH_TRIGGER_OPT__REFERS_TO_DATA_SET;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__NAME = CONTROL_WITH_TRIGGER_OPT__NAME;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__REFERRED_BY_EXT_REF = CONTROL_WITH_TRIGGER_OPT__REFERRED_BY_EXT_REF;

    /**
     * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__INTG_PD = CONTROL_WITH_TRIGGER_OPT__INTG_PD;

    /**
     * The feature id for the '<em><b>Trg Ops</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__TRG_OPS = CONTROL_WITH_TRIGGER_OPT__TRG_OPS;

    /**
     * The feature id for the '<em><b>Buf Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__BUF_TIME = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__LD_INST = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__LN_CLASS = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__LN_INST = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Log Ena</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__LOG_ENA = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Log Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__LOG_NAME = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__PREFIX = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Reason Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__REASON_CODE = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Parent Any LN</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__PARENT_ANY_LN = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Refers To Any LN</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__REFERS_TO_ANY_LN = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Refers To Log</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL__REFERS_TO_LOG = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 10;

    /**
     * The number of structural features of the '<em>Log Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL_FEATURE_COUNT = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 11;

    /**
     * The operation id for the '<em>Get Parent Any LN</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL___GET_PARENT_ANY_LN = CONTROL_WITH_TRIGGER_OPT___GET_PARENT_ANY_LN;

    /**
     * The number of operations of the '<em>Log Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_CONTROL_OPERATION_COUNT = CONTROL_WITH_TRIGGER_OPT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_SETTINGS__LINE_NUMBER = SERVICE_SETTINGS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_SETTINGS__CB_NAME = SERVICE_SETTINGS__CB_NAME;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_SETTINGS__DAT_SET = SERVICE_SETTINGS__DAT_SET;

    /**
     * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_SETTINGS__INTG_PD = SERVICE_SETTINGS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Log Ena</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_SETTINGS__LOG_ENA = SERVICE_SETTINGS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Trg Ops</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_SETTINGS__TRG_OPS = SERVICE_SETTINGS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_SETTINGS__PARENT_SERVICES = SERVICE_SETTINGS_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Log Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_SETTINGS_FEATURE_COUNT = SERVICE_SETTINGS_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Log Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOG_SETTINGS_OPERATION_COUNT = SERVICE_SETTINGS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Buf Ovfl</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS__BUF_OVFL = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Config Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS__CONFIG_REF = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS__DATA_REF = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS__DATA_SET = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Entry ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS__ENTRY_ID = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Reason Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS__REASON_CODE = SCL_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Seq Num</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS__SEQ_NUM = SCL_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS__TIME_STAMP = SCL_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Segmentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS__SEGMENTATION = SCL_OBJECT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Parent Report Control</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS__PARENT_REPORT_CONTROL = SCL_OBJECT_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Opt Fields</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Opt Fields</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPT_FIELDS_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Must Understand</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL__MUST_UNDERSTAND = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Control With IED Name</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL__PARENT_CONTROL_WITH_IED_NAME = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Protocol</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Protocol</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_WRITE__LINE_NUMBER = SERVICE_YES_NO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_WRITE__PARENT_SERVICES = SERVICE_YES_NO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Read Write</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_WRITE_FEATURE_COUNT = SERVICE_YES_NO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Read Write</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_WRITE_OPERATION_COUNT = SERVICE_YES_NO_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RED_PROT__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Hsr</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RED_PROT__HSR = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Prp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RED_PROT__PRP = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Rstp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RED_PROT__RSTP = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RED_PROT__PARENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Red Prot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RED_PROT_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Red Prot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RED_PROT_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__LINE_NUMBER = CONTROL_WITH_TRIGGER_OPT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__PRIVATE = CONTROL_WITH_TRIGGER_OPT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__TEXT = CONTROL_WITH_TRIGGER_OPT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__ANY = CONTROL_WITH_TRIGGER_OPT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__ANY_ATTRIBUTE = CONTROL_WITH_TRIGGER_OPT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__DESC = CONTROL_WITH_TRIGGER_OPT__DESC;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__DAT_SET = CONTROL_WITH_TRIGGER_OPT__DAT_SET;

    /**
     * The feature id for the '<em><b>Refers To Data Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__REFERS_TO_DATA_SET = CONTROL_WITH_TRIGGER_OPT__REFERS_TO_DATA_SET;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__NAME = CONTROL_WITH_TRIGGER_OPT__NAME;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__REFERRED_BY_EXT_REF = CONTROL_WITH_TRIGGER_OPT__REFERRED_BY_EXT_REF;

    /**
     * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__INTG_PD = CONTROL_WITH_TRIGGER_OPT__INTG_PD;

    /**
     * The feature id for the '<em><b>Trg Ops</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__TRG_OPS = CONTROL_WITH_TRIGGER_OPT__TRG_OPS;

    /**
     * The feature id for the '<em><b>Buffered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__BUFFERED = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Buf Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__BUF_TIME = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Conf Rev</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__CONF_REV = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Indexed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__INDEXED = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Rpt ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__RPT_ID = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Any LN</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__PARENT_ANY_LN = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Opt Fields</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__OPT_FIELDS = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Rpt Enabled</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL__RPT_ENABLED = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Report Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL_FEATURE_COUNT = CONTROL_WITH_TRIGGER_OPT_FEATURE_COUNT + 8;

    /**
     * The operation id for the '<em>Get Parent Any LN</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL___GET_PARENT_ANY_LN = CONTROL_WITH_TRIGGER_OPT___GET_PARENT_ANY_LN;

    /**
     * The number of operations of the '<em>Report Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_CONTROL_OPERATION_COUNT = CONTROL_WITH_TRIGGER_OPT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS__LINE_NUMBER = SERVICE_SETTINGS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS__CB_NAME = SERVICE_SETTINGS__CB_NAME;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS__DAT_SET = SERVICE_SETTINGS__DAT_SET;

    /**
     * The feature id for the '<em><b>Buf Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS__BUF_TIME = SERVICE_SETTINGS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Intg Pd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS__INTG_PD = SERVICE_SETTINGS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Opt Fields</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS__OPT_FIELDS = SERVICE_SETTINGS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Owner</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS__OWNER = SERVICE_SETTINGS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Resv Tms</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS__RESV_TMS = SERVICE_SETTINGS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Rpt ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS__RPT_ID = SERVICE_SETTINGS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Trg Ops</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS__TRG_OPS = SERVICE_SETTINGS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS__PARENT_SERVICES = SERVICE_SETTINGS_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Report Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS_FEATURE_COUNT = SERVICE_SETTINGS_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Report Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPORT_SETTINGS_OPERATION_COUNT = SERVICE_SETTINGS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RPT_ENABLED__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RPT_ENABLED__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RPT_ENABLED__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RPT_ENABLED__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RPT_ENABLED__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RPT_ENABLED__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RPT_ENABLED__MAX = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Client LN</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RPT_ENABLED__CLIENT_LN = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Report Control</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RPT_ENABLED__PARENT_REPORT_CONTROL = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Rpt Enabled</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RPT_ENABLED_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Rpt Enabled</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RPT_ENABLED_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Ix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__IX = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>SAddr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__SADDR = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>DAI</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__DAI = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent DOI</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__PARENT_DOI = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Sub SDI</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__SUB_SDI = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent SDI</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__PARENT_SDI = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI__NAME = UN_NAMING_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>SDI</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>SDI</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SDI_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SG_EDIT__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Resv Tms</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SG_EDIT__RESV_TMS = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Setting Groups</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SG_EDIT__PARENT_SETTING_GROUPS = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>SG Edit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SG_EDIT_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>SG Edit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SG_EDIT_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__LINE_NUMBER = CERTIFICATE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__PRIVATE = CERTIFICATE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__TEXT = CERTIFICATE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__ANY = CERTIFICATE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__ANY_ATTRIBUTE = CERTIFICATE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__DESC = CERTIFICATE__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__NAME = CERTIFICATE__NAME;

    /**
     * The feature id for the '<em><b>Serial Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__SERIAL_NUMBER = CERTIFICATE__SERIAL_NUMBER;

    /**
     * The feature id for the '<em><b>Xfer Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__XFER_NUMBER = CERTIFICATE__XFER_NUMBER;

    /**
     * The feature id for the '<em><b>Subject</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__SUBJECT = CERTIFICATE__SUBJECT;

    /**
     * The feature id for the '<em><b>Issuer Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__ISSUER_NAME = CERTIFICATE__ISSUER_NAME;

    /**
     * The feature id for the '<em><b>Parent Access Point</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY__PARENT_ACCESS_POINT = CERTIFICATE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>SMV Security</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY_FEATURE_COUNT = CERTIFICATE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>SMV Security</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SECURITY_OPERATION_COUNT = CERTIFICATE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__LINE_NUMBER = SERVICE_SETTINGS__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Cb Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__CB_NAME = SERVICE_SETTINGS__CB_NAME;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__DAT_SET = SERVICE_SETTINGS__DAT_SET;

    /**
     * The feature id for the '<em><b>Sv ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__SV_ID = SERVICE_SETTINGS_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Opt Fields</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__OPT_FIELDS = SERVICE_SETTINGS_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Smp Rate Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__SMP_RATE_ATTRIBUTE = SERVICE_SETTINGS_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Samples Per Sec Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__SAMPLES_PER_SEC_ATTRIBUTE = SERVICE_SETTINGS_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Pdc Time Stamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__PDC_TIME_STAMP = SERVICE_SETTINGS_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Smp Rate</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__SMP_RATE = SERVICE_SETTINGS_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Samples Per Sec</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__SAMPLES_PER_SEC = SERVICE_SETTINGS_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Sec Per Samples</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__SEC_PER_SAMPLES = SERVICE_SETTINGS_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__PARENT_SERVICES = SERVICE_SETTINGS_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Synch Src Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__SYNCH_SRC_ID = SERVICE_SETTINGS_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Nof ASDU</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__NOF_ASDU = SERVICE_SETTINGS_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Kda Participant</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__KDA_PARTICIPANT = SERVICE_SETTINGS_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Mc Security</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS__MC_SECURITY = SERVICE_SETTINGS_FEATURE_COUNT + 12;

    /**
     * The number of structural features of the '<em>SMV Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS_FEATURE_COUNT = SERVICE_SETTINGS_FEATURE_COUNT + 13;

    /**
     * The number of operations of the '<em>SMV Settings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_SETTINGS_OPERATION_COUNT = SERVICE_SETTINGS_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SM_VSC__LINE_NUMBER = SERVICE_WITH_MAX__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SM_VSC__MAX = SERVICE_WITH_MAX__MAX;

    /**
     * The feature id for the '<em><b>Delivery</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SM_VSC__DELIVERY = SERVICE_WITH_MAX_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Delivery Conf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SM_VSC__DELIVERY_CONF = SERVICE_WITH_MAX_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SM_VSC__PARENT_SERVICES = SERVICE_WITH_MAX_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SM_VSC__SV = SERVICE_WITH_MAX_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>RSV</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SM_VSC__RSV = SERVICE_WITH_MAX_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>SM Vsc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SM_VSC_FEATURE_COUNT = SERVICE_WITH_MAX_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>SM Vsc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SM_VSC_OPERATION_COUNT = SERVICE_WITH_MAX_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__LINE_NUMBER = CONTROL_WITH_IED_NAME__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__PRIVATE = CONTROL_WITH_IED_NAME__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__TEXT = CONTROL_WITH_IED_NAME__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__ANY = CONTROL_WITH_IED_NAME__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__ANY_ATTRIBUTE = CONTROL_WITH_IED_NAME__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__DESC = CONTROL_WITH_IED_NAME__DESC;

    /**
     * The feature id for the '<em><b>Dat Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__DAT_SET = CONTROL_WITH_IED_NAME__DAT_SET;

    /**
     * The feature id for the '<em><b>Refers To Data Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__REFERS_TO_DATA_SET = CONTROL_WITH_IED_NAME__REFERS_TO_DATA_SET;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__NAME = CONTROL_WITH_IED_NAME__NAME;

    /**
     * The feature id for the '<em><b>Referred By Ext Ref</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__REFERRED_BY_EXT_REF = CONTROL_WITH_IED_NAME__REFERRED_BY_EXT_REF;

    /**
     * The feature id for the '<em><b>Conf Rev</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__CONF_REV = CONTROL_WITH_IED_NAME__CONF_REV;

    /**
     * The feature id for the '<em><b>IED Name</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__IED_NAME = CONTROL_WITH_IED_NAME__IED_NAME;

    /**
     * The feature id for the '<em><b>Referred By Control Block</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__REFERRED_BY_CONTROL_BLOCK = CONTROL_WITH_IED_NAME__REFERRED_BY_CONTROL_BLOCK;

    /**
     * The feature id for the '<em><b>Protocol</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__PROTOCOL = CONTROL_WITH_IED_NAME__PROTOCOL;

    /**
     * The feature id for the '<em><b>Multicast</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__MULTICAST = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Nof ASDU</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__NOF_ASDU = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Security Enable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__SECURITY_ENABLE = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Smp Mod</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__SMP_MOD = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Smp Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__SMP_RATE = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Smv ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__SMV_ID = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Parent LN0</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__PARENT_LN0 = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Smv Opts</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL__SMV_OPTS = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Sampled Value Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL_FEATURE_COUNT = CONTROL_WITH_IED_NAME_FEATURE_COUNT + 8;

    /**
     * The operation id for the '<em>Get Parent Any LN</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL___GET_PARENT_ANY_LN = CONTROL_WITH_IED_NAME___GET_PARENT_ANY_LN;

    /**
     * The number of operations of the '<em>Sampled Value Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLED_VALUE_CONTROL_OPERATION_COUNT = CONTROL_WITH_IED_NAME_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Timeout</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER__TIMEOUT = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Access Point</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER__PARENT_ACCESS_POINT = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER__ASSOCIATION = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Authentication</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER__AUTHENTICATION = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>LDevice</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER__LDEVICE = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Server</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Server</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_AT__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_AT__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_AT__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_AT__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_AT__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_AT__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Ap Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_AT__AP_NAME = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Access Point</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_AT__PARENT_ACCESS_POINT = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Refers To Access Point</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_AT__REFERS_TO_ACCESS_POINT = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Server At</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_AT_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Server At</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVER_AT_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Name Length</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__NAME_LENGTH = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Access Point</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__PARENT_ACCESS_POINT = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Client Services</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__CLIENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Comm Prot</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__COMM_PROT = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Conf Data Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__CONF_DATA_SET = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Conf LNs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__CONF_LNS = SCL_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Conf Ld Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__CONF_LD_NAME = SCL_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Conf Log Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__CONF_LOG_CONTROL = SCL_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Conf Report Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__CONF_REPORT_CONTROL = SCL_OBJECT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Conf Sig Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__CONF_SIG_REF = SCL_OBJECT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Data Object Directory</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__DATA_OBJECT_DIRECTORY = SCL_OBJECT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Data Set Directory</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__DATA_SET_DIRECTORY = SCL_OBJECT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Dyn Association</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__DYN_ASSOCIATION = SCL_OBJECT_FEATURE_COUNT + 12;

    /**
     * The feature id for the '<em><b>Dyn Data Set</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__DYN_DATA_SET = SCL_OBJECT_FEATURE_COUNT + 13;

    /**
     * The feature id for the '<em><b>File Handling</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__FILE_HANDLING = SCL_OBJECT_FEATURE_COUNT + 14;

    /**
     * The feature id for the '<em><b>GOOSE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__GOOSE = SCL_OBJECT_FEATURE_COUNT + 15;

    /**
     * The feature id for the '<em><b>GSE Dir</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__GSE_DIR = SCL_OBJECT_FEATURE_COUNT + 16;

    /**
     * The feature id for the '<em><b>GSE Settings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__GSE_SETTINGS = SCL_OBJECT_FEATURE_COUNT + 17;

    /**
     * The feature id for the '<em><b>GSSE</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__GSSE = SCL_OBJECT_FEATURE_COUNT + 18;

    /**
     * The feature id for the '<em><b>Get CB Values</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__GET_CB_VALUES = SCL_OBJECT_FEATURE_COUNT + 19;

    /**
     * The feature id for the '<em><b>Get Data Object Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__GET_DATA_OBJECT_DEFINITION = SCL_OBJECT_FEATURE_COUNT + 20;

    /**
     * The feature id for the '<em><b>Get Data Set Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__GET_DATA_SET_VALUE = SCL_OBJECT_FEATURE_COUNT + 21;

    /**
     * The feature id for the '<em><b>Get Directory</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__GET_DIRECTORY = SCL_OBJECT_FEATURE_COUNT + 22;

    /**
     * The feature id for the '<em><b>Parent IED</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__PARENT_IED = SCL_OBJECT_FEATURE_COUNT + 23;

    /**
     * The feature id for the '<em><b>Log Settings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__LOG_SETTINGS = SCL_OBJECT_FEATURE_COUNT + 24;

    /**
     * The feature id for the '<em><b>Read Write</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__READ_WRITE = SCL_OBJECT_FEATURE_COUNT + 25;

    /**
     * The feature id for the '<em><b>Red Prot</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__RED_PROT = SCL_OBJECT_FEATURE_COUNT + 26;

    /**
     * The feature id for the '<em><b>Report Settings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__REPORT_SETTINGS = SCL_OBJECT_FEATURE_COUNT + 27;

    /**
     * The feature id for the '<em><b>SM Vsc</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__SM_VSC = SCL_OBJECT_FEATURE_COUNT + 28;

    /**
     * The feature id for the '<em><b>Sup Subscription</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__SUP_SUBSCRIPTION = SCL_OBJECT_FEATURE_COUNT + 29;

    /**
     * The feature id for the '<em><b>Value Handling</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__VALUE_HANDLING = SCL_OBJECT_FEATURE_COUNT + 30;

    /**
     * The feature id for the '<em><b>Set Data Set Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__SET_DATA_SET_VALUE = SCL_OBJECT_FEATURE_COUNT + 31;

    /**
     * The feature id for the '<em><b>Setting Groups</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__SETTING_GROUPS = SCL_OBJECT_FEATURE_COUNT + 32;

    /**
     * The feature id for the '<em><b>Time Sync Prot</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__TIME_SYNC_PROT = SCL_OBJECT_FEATURE_COUNT + 33;

    /**
     * The feature id for the '<em><b>Timer Activated Control</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__TIMER_ACTIVATED_CONTROL = SCL_OBJECT_FEATURE_COUNT + 34;

    /**
     * The feature id for the '<em><b>SMV Settings</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES__SMV_SETTINGS = SCL_OBJECT_FEATURE_COUNT + 35;

    /**
     * The number of structural features of the '<em>Services</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 36;

    /**
     * The number of operations of the '<em>Services</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICES_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_DATA_SET_VALUE__LINE_NUMBER = SERVICE_YES_NO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_DATA_SET_VALUE__PARENT_SERVICES = SERVICE_YES_NO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Set Data Set Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_DATA_SET_VALUE_FEATURE_COUNT = SERVICE_YES_NO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Set Data Set Value</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_DATA_SET_VALUE_OPERATION_COUNT = SERVICE_YES_NO_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Act SG</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL__ACT_SG = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Num Of SGs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL__NUM_OF_SGS = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Resv Tms</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL__RESV_TMS = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent LN0</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL__PARENT_LN0 = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Setting Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Setting Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_CONTROL_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_GROUPS__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Conf SG</b></em>' containment reference.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_GROUPS__CONF_SG = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>SG Edit</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_GROUPS__SG_EDIT = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_GROUPS__PARENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Setting Groups</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_GROUPS_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Setting Groups</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SETTING_GROUPS_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS__DATA_SET = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Refresh Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS__REFRESH_TIME = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sample Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS__SAMPLE_RATE = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sample Synchronized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS__SAMPLE_SYNCHRONIZED = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Security</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS__SECURITY = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS__TIMESTAMP = SCL_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Synch Source Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS__SYNCH_SOURCE_ID = SCL_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Data Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS__DATA_REF = SCL_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Parent Sampled Value Control</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS__PARENT_SAMPLED_VALUE_CONTROL = SCL_OBJECT_FEATURE_COUNT + 8;

    /**
     * The number of structural features of the '<em>Smv Opts</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 9;

    /**
     * The number of operations of the '<em>Smv Opts</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMV_OPTS_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT__LINE_NUMBER = CERT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Common Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT__COMMON_NAME = CERT__COMMON_NAME;

    /**
     * The feature id for the '<em><b>Id Hierarchy</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT__ID_HIERARCHY = CERT__ID_HIERARCHY;

    /**
     * The feature id for the '<em><b>Parent Certificate</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT__PARENT_CERTIFICATE = CERT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Subject</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_FEATURE_COUNT = CERT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Subject</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBJECT_OPERATION_COUNT = CERT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUP_SUBSCRIPTION__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max Go</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUP_SUBSCRIPTION__MAX_GO = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max Sv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUP_SUBSCRIPTION__MAX_SV = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUP_SUBSCRIPTION__PARENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Sup Subscription</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUP_SUBSCRIPTION_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Sup Subscription</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUP_SUBSCRIPTION_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_SYNC_PROT__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>C37 238</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_SYNC_PROT__C37_238 = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Other</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_SYNC_PROT__OTHER = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sntp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_SYNC_PROT__SNTP = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Client Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_SYNC_PROT__PARENT_CLIENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_SYNC_PROT__PARENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Iec61850 93</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_SYNC_PROT__IEC61850_93 = SCL_OBJECT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Time Sync Prot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_SYNC_PROT_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Time Sync Prot</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIME_SYNC_PROT_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_ACTIVATED_CONTROL__LINE_NUMBER = SERVICE_YES_NO__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_ACTIVATED_CONTROL__PARENT_SERVICES = SERVICE_YES_NO_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Timer Activated Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_ACTIVATED_CONTROL_FEATURE_COUNT = SERVICE_YES_NO_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Timer Activated Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMER_ACTIVATED_CONTROL_OPERATION_COUNT = SERVICE_YES_NO_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRG_OPS__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Dchg</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRG_OPS__DCHG = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Dupd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRG_OPS__DUPD = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Gi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRG_OPS__GI = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Period</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRG_OPS__PERIOD = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Qchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRG_OPS__QCHG = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Control With Trigger Opt</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRG_OPS__PARENT_CONTROL_WITH_TRIGGER_OPT = SCL_OBJECT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Trg Ops</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRG_OPS_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Trg Ops</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRG_OPS_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_HANDLING__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Set To RO</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_HANDLING__SET_TO_RO = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_HANDLING__PARENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Value Handling</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_HANDLING_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Value Handling</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_HANDLING_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT__LINE_NUMBER = POWER_SYSTEM_RESOURCE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT__PRIVATE = POWER_SYSTEM_RESOURCE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT__TEXT = POWER_SYSTEM_RESOURCE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT__ANY = POWER_SYSTEM_RESOURCE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT__ANY_ATTRIBUTE = POWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT__DESC = POWER_SYSTEM_RESOURCE__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT__NAME = POWER_SYSTEM_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT__LNODE = POWER_SYSTEM_RESOURCE__LNODE;

    /**
     * The feature id for the '<em><b>Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT__VIRTUAL = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT__LINE_NUMBER = EQUIPMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT__PRIVATE = EQUIPMENT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT__TEXT = EQUIPMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT__ANY = EQUIPMENT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT__ANY_ATTRIBUTE = EQUIPMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT__DESC = EQUIPMENT__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT__NAME = EQUIPMENT__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT__LNODE = EQUIPMENT__LNODE;

    /**
     * The feature id for the '<em><b>Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT__VIRTUAL = EQUIPMENT__VIRTUAL;

    /**
     * The feature id for the '<em><b>Sub Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT = EQUIPMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Terminal</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL = EQUIPMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Abstract Conducting Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Abstract Conducting Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_CONDUCTING_EQUIPMENT_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC__LINE_NUMBER = POWER_SYSTEM_RESOURCE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC__PRIVATE = POWER_SYSTEM_RESOURCE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC__TEXT = POWER_SYSTEM_RESOURCE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC__ANY = POWER_SYSTEM_RESOURCE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC__ANY_ATTRIBUTE = POWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC__DESC = POWER_SYSTEM_RESOURCE__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC__NAME = POWER_SYSTEM_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC__LNODE = POWER_SYSTEM_RESOURCE__LNODE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC__TYPE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Eq Sub Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Sub General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Abstract Eq Func Sub Func</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Abstract Eq Func Sub Func</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABSTRACT_EQ_FUNC_SUB_FUNC_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER__LINE_NUMBER = POWER_SYSTEM_RESOURCE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER__PRIVATE = POWER_SYSTEM_RESOURCE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER__TEXT = POWER_SYSTEM_RESOURCE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER__ANY = POWER_SYSTEM_RESOURCE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER__ANY_ATTRIBUTE = POWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER__DESC = POWER_SYSTEM_RESOURCE__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER__NAME = POWER_SYSTEM_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER__LNODE = POWER_SYSTEM_RESOURCE__LNODE;

    /**
     * The feature id for the '<em><b>Power Transformer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER__POWER_TRANSFORMER = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Equipment Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Equipment Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQUIPMENT_CONTAINER_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__LINE_NUMBER = EQUIPMENT_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__PRIVATE = EQUIPMENT_CONTAINER__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__TEXT = EQUIPMENT_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__ANY = EQUIPMENT_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__ANY_ATTRIBUTE = EQUIPMENT_CONTAINER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__DESC = EQUIPMENT_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__NAME = EQUIPMENT_CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__LNODE = EQUIPMENT_CONTAINER__LNODE;

    /**
     * The feature id for the '<em><b>Power Transformer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__POWER_TRANSFORMER = EQUIPMENT_CONTAINER__POWER_TRANSFORMER;

    /**
     * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__GENERAL_EQUIPMENT = EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT;

    /**
     * The feature id for the '<em><b>Parent Voltage Level</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__PARENT_VOLTAGE_LEVEL = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__FUNCTION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Connectivity Node</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__CONNECTIVITY_NODE = EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY__CONDUCTING_EQUIPMENT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Bay</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Bay</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BAY_OPERATION_COUNT = EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__LINE_NUMBER = ABSTRACT_CONDUCTING_EQUIPMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__PRIVATE = ABSTRACT_CONDUCTING_EQUIPMENT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__TEXT = ABSTRACT_CONDUCTING_EQUIPMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__ANY = ABSTRACT_CONDUCTING_EQUIPMENT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__ANY_ATTRIBUTE = ABSTRACT_CONDUCTING_EQUIPMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__DESC = ABSTRACT_CONDUCTING_EQUIPMENT__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__NAME = ABSTRACT_CONDUCTING_EQUIPMENT__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__LNODE = ABSTRACT_CONDUCTING_EQUIPMENT__LNODE;

    /**
     * The feature id for the '<em><b>Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__VIRTUAL = ABSTRACT_CONDUCTING_EQUIPMENT__VIRTUAL;

    /**
     * The feature id for the '<em><b>Sub Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__SUB_EQUIPMENT = ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT;

    /**
     * The feature id for the '<em><b>Terminal</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__TERMINAL = ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__TYPE = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Bay</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__PARENT_BAY = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Function</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__PARENT_FUNCTION = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Sub Function</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__PARENT_SUB_FUNCTION = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Eq Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__EQ_FUNCTION = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Line</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__PARENT_LINE = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Parent Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT__PARENT_PROCESS = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Conducting Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT_FEATURE_COUNT = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Conducting Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDUCTING_EQUIPMENT_OPERATION_COUNT = ABSTRACT_CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__LINE_NUMBER = LNODE_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__PRIVATE = LNODE_CONTAINER__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__TEXT = LNODE_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__ANY = LNODE_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__ANY_ATTRIBUTE = LNODE_CONTAINER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__DESC = LNODE_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__NAME = LNODE_CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__LNODE = LNODE_CONTAINER__LNODE;

    /**
     * The feature id for the '<em><b>Path Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__PATH_NAME = LNODE_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Bay</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__PARENT_BAY = LNODE_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Referred By Terminal</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__REFERRED_BY_TERMINAL = LNODE_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Line</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE__PARENT_LINE = LNODE_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Connectivity Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE_FEATURE_COUNT = LNODE_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Connectivity Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTIVITY_NODE_OPERATION_COUNT = LNODE_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__LINE_NUMBER = ABSTRACT_EQ_FUNC_SUB_FUNC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__PRIVATE = ABSTRACT_EQ_FUNC_SUB_FUNC__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__TEXT = ABSTRACT_EQ_FUNC_SUB_FUNC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__ANY = ABSTRACT_EQ_FUNC_SUB_FUNC__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__ANY_ATTRIBUTE = ABSTRACT_EQ_FUNC_SUB_FUNC__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__DESC = ABSTRACT_EQ_FUNC_SUB_FUNC__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__NAME = ABSTRACT_EQ_FUNC_SUB_FUNC__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__LNODE = ABSTRACT_EQ_FUNC_SUB_FUNC__LNODE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__TYPE = ABSTRACT_EQ_FUNC_SUB_FUNC__TYPE;

    /**
     * The feature id for the '<em><b>Eq Sub Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__EQ_SUB_FUNCTION = ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION;

    /**
     * The feature id for the '<em><b>Sub General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__SUB_GENERAL_EQUIPMENT = ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT;

    /**
     * The feature id for the '<em><b>Parent Conducting Equipment</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__PARENT_CONDUCTING_EQUIPMENT = ABSTRACT_EQ_FUNC_SUB_FUNC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent General Equipment</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__PARENT_GENERAL_EQUIPMENT = ABSTRACT_EQ_FUNC_SUB_FUNC_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Power Transformer</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__PARENT_POWER_TRANSFORMER = ABSTRACT_EQ_FUNC_SUB_FUNC_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Sub Equipment</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__PARENT_SUB_EQUIPMENT = ABSTRACT_EQ_FUNC_SUB_FUNC_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Transformer Winding</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__PARENT_TRANSFORMER_WINDING = ABSTRACT_EQ_FUNC_SUB_FUNC_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Tap Changer</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION__PARENT_TAP_CHANGER = ABSTRACT_EQ_FUNC_SUB_FUNC_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Eq Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION_FEATURE_COUNT = ABSTRACT_EQ_FUNC_SUB_FUNC_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Eq Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_FUNCTION_OPERATION_COUNT = ABSTRACT_EQ_FUNC_SUB_FUNC_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__LINE_NUMBER = ABSTRACT_EQ_FUNC_SUB_FUNC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__PRIVATE = ABSTRACT_EQ_FUNC_SUB_FUNC__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__TEXT = ABSTRACT_EQ_FUNC_SUB_FUNC__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__ANY = ABSTRACT_EQ_FUNC_SUB_FUNC__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__ANY_ATTRIBUTE = ABSTRACT_EQ_FUNC_SUB_FUNC__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__DESC = ABSTRACT_EQ_FUNC_SUB_FUNC__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__NAME = ABSTRACT_EQ_FUNC_SUB_FUNC__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__LNODE = ABSTRACT_EQ_FUNC_SUB_FUNC__LNODE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__TYPE = ABSTRACT_EQ_FUNC_SUB_FUNC__TYPE;

    /**
     * The feature id for the '<em><b>Eq Sub Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__EQ_SUB_FUNCTION = ABSTRACT_EQ_FUNC_SUB_FUNC__EQ_SUB_FUNCTION;

    /**
     * The feature id for the '<em><b>Sub General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__SUB_GENERAL_EQUIPMENT = ABSTRACT_EQ_FUNC_SUB_FUNC__SUB_GENERAL_EQUIPMENT;

    /**
     * The feature id for the '<em><b>Parent Abstract Eq Func Sub Func</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC = ABSTRACT_EQ_FUNC_SUB_FUNC_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Eq Sub Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION_FEATURE_COUNT = ABSTRACT_EQ_FUNC_SUB_FUNC_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Eq Sub Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EQ_SUB_FUNCTION_OPERATION_COUNT = ABSTRACT_EQ_FUNC_SUB_FUNC_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__LINE_NUMBER = POWER_SYSTEM_RESOURCE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__PRIVATE = POWER_SYSTEM_RESOURCE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__TEXT = POWER_SYSTEM_RESOURCE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__ANY = POWER_SYSTEM_RESOURCE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__ANY_ATTRIBUTE = POWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__DESC = POWER_SYSTEM_RESOURCE__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__NAME = POWER_SYSTEM_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__LNODE = POWER_SYSTEM_RESOURCE__LNODE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__TYPE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Bay</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__PARENT_BAY = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__CONDUCTING_EQUIPMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent General Equipment Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__PARENT_GENERAL_EQUIPMENT_CONTAINER = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Substation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__PARENT_SUBSTATION = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Voltage Level</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__PARENT_VOLTAGE_LEVEL = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Sub Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__SUB_FUNCTION = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__GENERAL_EQUIPMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__LINE_NUMBER = EQUIPMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__PRIVATE = EQUIPMENT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__TEXT = EQUIPMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__ANY = EQUIPMENT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__ANY_ATTRIBUTE = EQUIPMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__DESC = EQUIPMENT__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__NAME = EQUIPMENT__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__LNODE = EQUIPMENT__LNODE;

    /**
     * The feature id for the '<em><b>Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__VIRTUAL = EQUIPMENT__VIRTUAL;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__TYPE = EQUIPMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Abstract Eq Func Sub Func</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__PARENT_ABSTRACT_EQ_FUNC_SUB_FUNC = EQUIPMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Eq Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__EQ_FUNCTION = EQUIPMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Equipment Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__PARENT_EQUIPMENT_CONTAINER = EQUIPMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Function</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__PARENT_FUNCTION = EQUIPMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent General Equipment Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__PARENT_GENERAL_EQUIPMENT_CONTAINER = EQUIPMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Parent Sub Function</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT__PARENT_SUB_FUNCTION = EQUIPMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>General Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>General Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERAL_EQUIPMENT_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__IED_NAME = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__LD_INST = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__LN_CLASS = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__LN_INST = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Ln Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__LN_TYPE = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__PREFIX = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Refers To Any LN</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__REFERS_TO_ANY_LN = UN_NAMING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Parent LNode Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE__PARENT_LNODE_CONTAINER = UN_NAMING_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>LNode</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>LNode</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LNODE_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__LINE_NUMBER = UN_NAMING__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__PRIVATE = UN_NAMING__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__TEXT = UN_NAMING__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__ANY = UN_NAMING__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__ANY_ATTRIBUTE = UN_NAMING__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__DESC = UN_NAMING__DESC;

    /**
     * The feature id for the '<em><b>Bay Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__BAY_NAME = UN_NAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>CNode Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__CNODE_NAME = UN_NAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Connectivity Node</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__CONNECTIVITY_NODE = UN_NAMING_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Process Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__PROCESS_NAME = UN_NAMING_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Substation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__SUBSTATION_NAME = UN_NAMING_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Voltage Level Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__VOLTAGE_LEVEL_NAME = UN_NAMING_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Parent Abstract Conducting Equipment</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT = UN_NAMING_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Refers To Connectivity Node</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__REFERS_TO_CONNECTIVITY_NODE = UN_NAMING_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__NAME = UN_NAMING_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Line Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL__LINE_NAME = UN_NAMING_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Terminal</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_FEATURE_COUNT = UN_NAMING_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Terminal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TERMINAL_OPERATION_COUNT = UN_NAMING_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__LINE_NUMBER = TERMINAL__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__PRIVATE = TERMINAL__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__TEXT = TERMINAL__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__ANY = TERMINAL__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__ANY_ATTRIBUTE = TERMINAL__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__DESC = TERMINAL__DESC;

    /**
     * The feature id for the '<em><b>Bay Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__BAY_NAME = TERMINAL__BAY_NAME;

    /**
     * The feature id for the '<em><b>CNode Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__CNODE_NAME = TERMINAL__CNODE_NAME;

    /**
     * The feature id for the '<em><b>Connectivity Node</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__CONNECTIVITY_NODE = TERMINAL__CONNECTIVITY_NODE;

    /**
     * The feature id for the '<em><b>Process Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__PROCESS_NAME = TERMINAL__PROCESS_NAME;

    /**
     * The feature id for the '<em><b>Substation Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__SUBSTATION_NAME = TERMINAL__SUBSTATION_NAME;

    /**
     * The feature id for the '<em><b>Voltage Level Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__VOLTAGE_LEVEL_NAME = TERMINAL__VOLTAGE_LEVEL_NAME;

    /**
     * The feature id for the '<em><b>Parent Abstract Conducting Equipment</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT = TERMINAL__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT;

    /**
     * The feature id for the '<em><b>Refers To Connectivity Node</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__REFERS_TO_CONNECTIVITY_NODE = TERMINAL__REFERS_TO_CONNECTIVITY_NODE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__NAME = TERMINAL__NAME;

    /**
     * The feature id for the '<em><b>Line Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__LINE_NAME = TERMINAL__LINE_NAME;

    /**
     * The feature id for the '<em><b>Parent Transformer Winding</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT__PARENT_TRANSFORMER_WINDING = TERMINAL_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Neutral Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT_FEATURE_COUNT = TERMINAL_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Neutral Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NEUTRAL_POINT_OPERATION_COUNT = TERMINAL_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__LINE_NUMBER = EQUIPMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__PRIVATE = EQUIPMENT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__TEXT = EQUIPMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__ANY = EQUIPMENT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__ANY_ATTRIBUTE = EQUIPMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__DESC = EQUIPMENT__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__NAME = EQUIPMENT__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__LNODE = EQUIPMENT__LNODE;

    /**
     * The feature id for the '<em><b>Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__VIRTUAL = EQUIPMENT__VIRTUAL;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__TYPE = EQUIPMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Eq Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__EQ_FUNCTION = EQUIPMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Equipment Container</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__PARENT_EQUIPMENT_CONTAINER = EQUIPMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sub Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__SUB_EQUIPMENT = EQUIPMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Transformer Winding</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER__TRANSFORMER_WINDING = EQUIPMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Power Transformer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Power Transformer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int POWER_TRANSFORMER_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__LINE_NUMBER = POWER_SYSTEM_RESOURCE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__PRIVATE = POWER_SYSTEM_RESOURCE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__TEXT = POWER_SYSTEM_RESOURCE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__ANY = POWER_SYSTEM_RESOURCE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__ANY_ATTRIBUTE = POWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__DESC = POWER_SYSTEM_RESOURCE__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__NAME = POWER_SYSTEM_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__LNODE = POWER_SYSTEM_RESOURCE__LNODE;

    /**
     * The feature id for the '<em><b>Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__VIRTUAL = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Phase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__PHASE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Abstract Conducting Equipment</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__PARENT_ABSTRACT_CONDUCTING_EQUIPMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Eq Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__EQ_FUNCTION = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Power Transformer</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__PARENT_POWER_TRANSFORMER = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Tap Changer</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT__PARENT_TAP_CHANGER = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Sub Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Sub Equipment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_EQUIPMENT_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__LINE_NUMBER = POWER_SYSTEM_RESOURCE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__PRIVATE = POWER_SYSTEM_RESOURCE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__TEXT = POWER_SYSTEM_RESOURCE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__ANY = POWER_SYSTEM_RESOURCE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__ANY_ATTRIBUTE = POWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__DESC = POWER_SYSTEM_RESOURCE__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__NAME = POWER_SYSTEM_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__LNODE = POWER_SYSTEM_RESOURCE__LNODE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__TYPE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Conducting Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__CONDUCTING_EQUIPMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Function</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__PARENT_FUNCTION = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__GENERAL_EQUIPMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Sub Sub Functions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__SUB_SUB_FUNCTIONS = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Parent Sub Function</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION__PARENT_SUB_FUNCTION = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Sub Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Sub Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUB_FUNCTION_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__LINE_NUMBER = EQUIPMENT_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__PRIVATE = EQUIPMENT_CONTAINER__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__TEXT = EQUIPMENT_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__ANY = EQUIPMENT_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__ANY_ATTRIBUTE = EQUIPMENT_CONTAINER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__DESC = EQUIPMENT_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__NAME = EQUIPMENT_CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__LNODE = EQUIPMENT_CONTAINER__LNODE;

    /**
     * The feature id for the '<em><b>Power Transformer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__POWER_TRANSFORMER = EQUIPMENT_CONTAINER__POWER_TRANSFORMER;

    /**
     * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__GENERAL_EQUIPMENT = EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT;

    /**
     * The feature id for the '<em><b>Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__FUNCTION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Voltage Level</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__VOLTAGE_LEVEL = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent Process</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__PARENT_PROCESS = EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent SCL</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION__PARENT_SCL = EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Substation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Substation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSTATION_OPERATION_COUNT = EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__LINE_NUMBER = POWER_SYSTEM_RESOURCE__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__PRIVATE = POWER_SYSTEM_RESOURCE__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__TEXT = POWER_SYSTEM_RESOURCE__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__ANY = POWER_SYSTEM_RESOURCE__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__ANY_ATTRIBUTE = POWER_SYSTEM_RESOURCE__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__DESC = POWER_SYSTEM_RESOURCE__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__NAME = POWER_SYSTEM_RESOURCE__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__LNODE = POWER_SYSTEM_RESOURCE__LNODE;

    /**
     * The feature id for the '<em><b>Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__VIRTUAL = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__TYPE = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Eq Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__EQ_FUNCTION = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Sub Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__SUB_EQUIPMENT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Transformer Winding</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER__PARENT_TRANSFORMER_WINDING = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Tap Changer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER_FEATURE_COUNT = POWER_SYSTEM_RESOURCE_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Tap Changer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAP_CHANGER_OPERATION_COUNT = POWER_SYSTEM_RESOURCE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__LINE_NUMBER = ABSTRACT_CONDUCTING_EQUIPMENT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__PRIVATE = ABSTRACT_CONDUCTING_EQUIPMENT__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__TEXT = ABSTRACT_CONDUCTING_EQUIPMENT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__ANY = ABSTRACT_CONDUCTING_EQUIPMENT__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__ANY_ATTRIBUTE = ABSTRACT_CONDUCTING_EQUIPMENT__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__DESC = ABSTRACT_CONDUCTING_EQUIPMENT__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__NAME = ABSTRACT_CONDUCTING_EQUIPMENT__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__LNODE = ABSTRACT_CONDUCTING_EQUIPMENT__LNODE;

    /**
     * The feature id for the '<em><b>Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__VIRTUAL = ABSTRACT_CONDUCTING_EQUIPMENT__VIRTUAL;

    /**
     * The feature id for the '<em><b>Sub Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__SUB_EQUIPMENT = ABSTRACT_CONDUCTING_EQUIPMENT__SUB_EQUIPMENT;

    /**
     * The feature id for the '<em><b>Terminal</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__TERMINAL = ABSTRACT_CONDUCTING_EQUIPMENT__TERMINAL;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__TYPE = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Eq Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__EQ_FUNCTION = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Neutral Point</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__NEUTRAL_POINT = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Parent Power Transformer</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__PARENT_POWER_TRANSFORMER = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Tap Changer</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING__TAP_CHANGER = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Transformer Winding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING_FEATURE_COUNT = ABSTRACT_CONDUCTING_EQUIPMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Transformer Winding</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSFORMER_WINDING_OPERATION_COUNT = ABSTRACT_CONDUCTING_EQUIPMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValueWithUnitImpl <em>Value With Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ValueWithUnitImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getValueWithUnit()
     * @generated
     */
    int VALUE_WITH_UNIT = 151;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_WITH_UNIT__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_WITH_UNIT__VALUE = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_WITH_UNIT__MULTIPLIER = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_WITH_UNIT__UNIT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Value With Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_WITH_UNIT_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Value With Unit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALUE_WITH_UNIT_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE__LINE_NUMBER = VALUE_WITH_UNIT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE__VALUE = VALUE_WITH_UNIT__VALUE;

    /**
     * The feature id for the '<em><b>Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE__MULTIPLIER = VALUE_WITH_UNIT__MULTIPLIER;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE__UNIT = VALUE_WITH_UNIT__UNIT;

    /**
     * The feature id for the '<em><b>Parent Line</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE__PARENT_LINE = VALUE_WITH_UNIT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent Voltage Level</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE__PARENT_VOLTAGE_LEVEL = VALUE_WITH_UNIT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Voltage</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_FEATURE_COUNT = VALUE_WITH_UNIT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Voltage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_OPERATION_COUNT = VALUE_WITH_UNIT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__LINE_NUMBER = EQUIPMENT_CONTAINER__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Private</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__PRIVATE = EQUIPMENT_CONTAINER__PRIVATE;

    /**
     * The feature id for the '<em><b>Text</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__TEXT = EQUIPMENT_CONTAINER__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__ANY = EQUIPMENT_CONTAINER__ANY;

    /**
     * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__ANY_ATTRIBUTE = EQUIPMENT_CONTAINER__ANY_ATTRIBUTE;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__DESC = EQUIPMENT_CONTAINER__DESC;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__NAME = EQUIPMENT_CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>LNode</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__LNODE = EQUIPMENT_CONTAINER__LNODE;

    /**
     * The feature id for the '<em><b>Power Transformer</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__POWER_TRANSFORMER = EQUIPMENT_CONTAINER__POWER_TRANSFORMER;

    /**
     * The feature id for the '<em><b>General Equipment</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__GENERAL_EQUIPMENT = EQUIPMENT_CONTAINER__GENERAL_EQUIPMENT;

    /**
     * The feature id for the '<em><b>Nom Freq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__NOM_FREQ = EQUIPMENT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Num Phases</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__NUM_PHASES = EQUIPMENT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Bay</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__BAY = EQUIPMENT_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Function</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__FUNCTION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Parent Substation</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__PARENT_SUBSTATION = EQUIPMENT_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Voltage</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL__VOLTAGE = EQUIPMENT_CONTAINER_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Voltage Level</em>' class.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL_FEATURE_COUNT = EQUIPMENT_CONTAINER_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Voltage Level</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VOLTAGE_LEVEL_OPERATION_COUNT = EQUIPMENT_CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithMaxAndModifyImpl <em>Service With Max And Modify</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.ServiceWithMaxAndModifyImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceWithMaxAndModify()
     * @generated
     */
    int SERVICE_WITH_MAX_AND_MODIFY = 148;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_AND_MODIFY__LINE_NUMBER = SERVICE_WITH_MAX__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_AND_MODIFY__MAX = SERVICE_WITH_MAX__MAX;

    /**
     * The feature id for the '<em><b>Modify</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_AND_MODIFY__MODIFY = SERVICE_WITH_MAX_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service With Max And Modify</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_AND_MODIFY_FEATURE_COUNT = SERVICE_WITH_MAX_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Service With Max And Modify</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_WITH_MAX_AND_MODIFY_OPERATION_COUNT = SERVICE_WITH_MAX_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DurationInSecImpl <em>Duration In Sec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DurationInSecImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getDurationInSec()
     * @generated
     */
    int DURATION_IN_SEC = 152;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_SEC__LINE_NUMBER = VALUE_WITH_UNIT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_SEC__VALUE = VALUE_WITH_UNIT__VALUE;

    /**
     * The feature id for the '<em><b>Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_SEC__MULTIPLIER = VALUE_WITH_UNIT__MULTIPLIER;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_SEC__UNIT = VALUE_WITH_UNIT__UNIT;

    /**
     * The number of structural features of the '<em>Duration In Sec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_SEC_FEATURE_COUNT = VALUE_WITH_UNIT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Duration In Sec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_SEC_OPERATION_COUNT = VALUE_WITH_UNIT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_MILLI_SEC__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_MILLI_SEC__VALUE = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_MILLI_SEC__MULTIPLIER = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_MILLI_SEC__UNIT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Duration In Milli Sec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_MILLI_SEC_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Duration In Milli Sec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DURATION_IN_MILLI_SEC_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE_IN_MB_PER_SEC__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE_IN_MB_PER_SEC__VALUE = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE_IN_MB_PER_SEC__MULTIPLIER = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE_IN_MB_PER_SEC__UNIT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Bit Rate In Mb Per Sec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE_IN_MB_PER_SEC_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Bit Rate In Mb Per Sec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE_IN_MB_PER_SEC_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_TIME__LINE_NUMBER = DURATION_IN_MILLI_SEC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_TIME__VALUE = DURATION_IN_MILLI_SEC__VALUE;

    /**
     * The feature id for the '<em><b>Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_TIME__MULTIPLIER = DURATION_IN_MILLI_SEC__MULTIPLIER;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_TIME__UNIT = DURATION_IN_MILLI_SEC__UNIT;

    /**
     * The number of structural features of the '<em>Min Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_TIME_FEATURE_COUNT = DURATION_IN_MILLI_SEC_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Min Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MIN_TIME_OPERATION_COUNT = DURATION_IN_MILLI_SEC_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_TIME__LINE_NUMBER = DURATION_IN_MILLI_SEC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_TIME__VALUE = DURATION_IN_MILLI_SEC__VALUE;

    /**
     * The feature id for the '<em><b>Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_TIME__MULTIPLIER = DURATION_IN_MILLI_SEC__MULTIPLIER;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_TIME__UNIT = DURATION_IN_MILLI_SEC__UNIT;

    /**
     * The number of structural features of the '<em>Max Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_TIME_FEATURE_COUNT = DURATION_IN_MILLI_SEC_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Max Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAX_TIME_OPERATION_COUNT = DURATION_IN_MILLI_SEC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BitRateImpl <em>Bit Rate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.BitRateImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getBitRate()
     * @generated
     */
    int BIT_RATE = 157;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE__LINE_NUMBER = BIT_RATE_IN_MB_PER_SEC__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE__VALUE = BIT_RATE_IN_MB_PER_SEC__VALUE;

    /**
     * The feature id for the '<em><b>Multiplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE__MULTIPLIER = BIT_RATE_IN_MB_PER_SEC__MULTIPLIER;

    /**
     * The feature id for the '<em><b>Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE__UNIT = BIT_RATE_IN_MB_PER_SEC__UNIT;

    /**
     * The feature id for the '<em><b>Parent Sub Network</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE__PARENT_SUB_NETWORK = BIT_RATE_IN_MB_PER_SEC_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Bit Rate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE_FEATURE_COUNT = BIT_RATE_IN_MB_PER_SEC_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Bit Rate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIT_RATE_OPERATION_COUNT = BIT_RATE_IN_MB_PER_SEC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmpRateImpl <em>Smp Rate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SmpRateImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSmpRate()
     * @generated
     */
    int SMP_RATE = 158;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMP_RATE__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMP_RATE__VALUE = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent SMV Settings</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMP_RATE__PARENT_SMV_SETTINGS = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Smp Rate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMP_RATE_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Smp Rate</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SMP_RATE_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SamplesPerSecImpl <em>Samples Per Sec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SamplesPerSecImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSamplesPerSec()
     * @generated
     */
    int SAMPLES_PER_SEC = 159;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLES_PER_SEC__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLES_PER_SEC__VALUE = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent SMV Settings</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLES_PER_SEC__PARENT_SMV_SETTINGS = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Samples Per Sec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLES_PER_SEC_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Samples Per Sec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SAMPLES_PER_SEC_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SecPerSamplesImpl <em>Sec Per Samples</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SecPerSamplesImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSecPerSamples()
     * @generated
     */
    int SEC_PER_SAMPLES = 160;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEC_PER_SAMPLES__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEC_PER_SAMPLES__VALUE = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent SMV Settings</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEC_PER_SAMPLES__PARENT_SMV_SETTINGS = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Sec Per Samples</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEC_PER_SAMPLES_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Sec Per Samples</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEC_PER_SAMPLES_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.McSecurityImpl <em>Mc Security</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.McSecurityImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getMcSecurity()
     * @generated
     */
    int MC_SECURITY = 161;

    /**
     * The feature id for the '<em><b>Line Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MC_SECURITY__LINE_NUMBER = SCL_OBJECT__LINE_NUMBER;

    /**
     * The feature id for the '<em><b>Parent Client Services</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MC_SECURITY__PARENT_CLIENT_SERVICES = SCL_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent GSE Settings</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MC_SECURITY__PARENT_GSE_SETTINGS = SCL_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Parent SMV Settings</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MC_SECURITY__PARENT_SMV_SETTINGS = SCL_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Signature</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MC_SECURITY__SIGNATURE = SCL_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Encryption</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MC_SECURITY__ENCRYPTION = SCL_OBJECT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Mc Security</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MC_SECURITY_FEATURE_COUNT = SCL_OBJECT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Mc Security</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MC_SECURITY_OPERATION_COUNT = SCL_OBJECT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgAuthenticationImpl <em>Ag Authentication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgAuthenticationImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAgAuthentication()
     * @generated
     */
    int AG_AUTHENTICATION = 162;

    /**
     * The feature id for the '<em><b>Certificate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_AUTHENTICATION__CERTIFICATE = 0;

    /**
     * The feature id for the '<em><b>None</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_AUTHENTICATION__NONE = 1;

    /**
     * The feature id for the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_AUTHENTICATION__PASSWORD = 2;

    /**
     * The feature id for the '<em><b>Strong</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_AUTHENTICATION__STRONG = 3;

    /**
     * The feature id for the '<em><b>Weak</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_AUTHENTICATION__WEAK = 4;

    /**
     * The number of structural features of the '<em>Ag Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_AUTHENTICATION_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Ag Authentication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_AUTHENTICATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgSmvOptsImpl <em>Ag Smv Opts</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgSmvOptsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAgSmvOpts()
     * @generated
     */
    int AG_SMV_OPTS = 163;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_SMV_OPTS__DATA_SET = 0;

    /**
     * The feature id for the '<em><b>Refresh Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_SMV_OPTS__REFRESH_TIME = 1;

    /**
     * The feature id for the '<em><b>Sample Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_SMV_OPTS__SAMPLE_RATE = 2;

    /**
     * The feature id for the '<em><b>Sample Synchronized</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_SMV_OPTS__SAMPLE_SYNCHRONIZED = 3;

    /**
     * The feature id for the '<em><b>Security</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_SMV_OPTS__SECURITY = 4;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_SMV_OPTS__TIMESTAMP = 5;

    /**
     * The feature id for the '<em><b>Synch Source Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_SMV_OPTS__SYNCH_SOURCE_ID = 6;

    /**
     * The feature id for the '<em><b>Data Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_SMV_OPTS__DATA_REF = 7;

    /**
     * The number of structural features of the '<em>Ag Smv Opts</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_SMV_OPTS_FEATURE_COUNT = 8;

    /**
     * The number of operations of the '<em>Ag Smv Opts</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_SMV_OPTS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgOptFieldsImpl <em>Ag Opt Fields</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgOptFieldsImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAgOptFields()
     * @generated
     */
    int AG_OPT_FIELDS = 164;

    /**
     * The feature id for the '<em><b>Buf Ovfl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_OPT_FIELDS__BUF_OVFL = 0;

    /**
     * The feature id for the '<em><b>Config Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_OPT_FIELDS__CONFIG_REF = 1;

    /**
     * The feature id for the '<em><b>Data Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_OPT_FIELDS__DATA_REF = 2;

    /**
     * The feature id for the '<em><b>Data Set</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_OPT_FIELDS__DATA_SET = 3;

    /**
     * The feature id for the '<em><b>Entry ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_OPT_FIELDS__ENTRY_ID = 4;

    /**
     * The feature id for the '<em><b>Reason Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_OPT_FIELDS__REASON_CODE = 5;

    /**
     * The feature id for the '<em><b>Seq Num</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_OPT_FIELDS__SEQ_NUM = 6;

    /**
     * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_OPT_FIELDS__TIME_STAMP = 7;

    /**
     * The feature id for the '<em><b>Segmentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_OPT_FIELDS__SEGMENTATION = 8;

    /**
     * The number of structural features of the '<em>Ag Opt Fields</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_OPT_FIELDS_FEATURE_COUNT = 9;

    /**
     * The number of operations of the '<em>Ag Opt Fields</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_OPT_FIELDS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgDescImpl <em>Ag Desc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgDescImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAgDesc()
     * @generated
     */
    int AG_DESC = 165;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_DESC__DESC = 0;

    /**
     * The number of structural features of the '<em>Ag Desc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_DESC_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Ag Desc</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_DESC_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgLDRefImpl <em>Ag LD Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgLDRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAgLDRef()
     * @generated
     */
    int AG_LD_REF = 166;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LD_REF__DESC = AG_DESC__DESC;

    /**
     * The feature id for the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LD_REF__IED_NAME = AG_DESC_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LD_REF__LD_INST = AG_DESC_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Ag LD Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LD_REF_FEATURE_COUNT = AG_DESC_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Ag LD Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LD_REF_OPERATION_COUNT = AG_DESC_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgLNRefImpl <em>Ag LN Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgLNRefImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAgLNRef()
     * @generated
     */
    int AG_LN_REF = 167;

    /**
     * The feature id for the '<em><b>Desc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LN_REF__DESC = AG_LD_REF__DESC;

    /**
     * The feature id for the '<em><b>Ied Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LN_REF__IED_NAME = AG_LD_REF__IED_NAME;

    /**
     * The feature id for the '<em><b>Ld Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LN_REF__LD_INST = AG_LD_REF__LD_INST;

    /**
     * The feature id for the '<em><b>Ln Class</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LN_REF__LN_CLASS = AG_LD_REF_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ln Inst</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LN_REF__LN_INST = AG_LD_REF_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LN_REF__PREFIX = AG_LD_REF_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Ag LN Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LN_REF_FEATURE_COUNT = AG_LD_REF_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Ag LN Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_LN_REF_OPERATION_COUNT = AG_LD_REF_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgDATrgOpImpl <em>Ag DA Trg Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgDATrgOpImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAgDATrgOp()
     * @generated
     */
    int AG_DA_TRG_OP = 168;

    /**
     * The feature id for the '<em><b>Dchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_DA_TRG_OP__DCHG = 0;

    /**
     * The feature id for the '<em><b>Dupd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_DA_TRG_OP__DUPD = 1;

    /**
     * The feature id for the '<em><b>Qchg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_DA_TRG_OP__QCHG = 2;

    /**
     * The number of structural features of the '<em>Ag DA Trg Op</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_DA_TRG_OP_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Ag DA Trg Op</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_DA_TRG_OP_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgVirtualImpl <em>Ag Virtual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.AgVirtualImpl
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAgVirtual()
     * @generated
     */
    int AG_VIRTUAL = 169;

    /**
     * The feature id for the '<em><b>Virtual</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_VIRTUAL__VIRTUAL = 0;

    /**
     * The number of structural features of the '<em>Ag Virtual</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_VIRTUAL_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Ag Virtual</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AG_VIRTUAL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AssociationKindEnum <em>Association Kind Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AssociationKindEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getAssociationKindEnum()
     * @generated
     */
    int ASSOCIATION_KIND_ENUM = 170;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum <em>FC Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getFCEnum()
     * @generated
     */
    int FC_ENUM = 171;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum <em>GSE Control Type Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getGSEControlTypeEnum()
     * @generated
     */
    int GSE_CONTROL_TYPE_ENUM = 172;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PhaseEnum <em>Phase Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PhaseEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getPhaseEnum()
     * @generated
     */
    int PHASE_ENUM = 173;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum <em>Predefined Type Of Security Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getPredefinedTypeOfSecurityEnum()
     * @generated
     */
    int PREDEFINED_TYPE_OF_SECURITY_ENUM = 174;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVDeliveryEnum <em>SMV Delivery Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVDeliveryEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSMVDeliveryEnum()
     * @generated
     */
    int SMV_DELIVERY_ENUM = 175;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum <em>Service Settings Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceSettingsEnum()
     * @generated
     */
    int SERVICE_SETTINGS_ENUM = 176;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum <em>Service Settings No Dyn Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceSettingsNoDynEnum()
     * @generated
     */
    int SERVICE_SETTINGS_NO_DYN_ENUM = 177;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType <em>Service Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getServiceType()
     * @generated
     */
    int SERVICE_TYPE = 178;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod <em>Smp Mod</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getSmpMod()
     * @generated
     */
    int SMP_MOD = 179;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum <em>Unit Multiplier Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getUnitMultiplierEnum()
     * @generated
     */
    int UNIT_MULTIPLIER_ENUM = 180;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum <em>Val Kind Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getValKindEnum()
     * @generated
     */
    int VAL_KIND_ENUM = 181;

    /**
     * The meta object id for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.bufModeEnum <em>buf Mode Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.bufModeEnum
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SclPackageImpl#getbufModeEnum()
     * @generated
     */
    int BUF_MODE_ENUM = 182;

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace <em>Any Content From Other Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Any Content From Other Namespace</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace
     * @generated
     */
    EClass getAnyContentFromOtherNamespace();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace#getMixed()
     * @see #getAnyContentFromOtherNamespace()
     * @generated
     */
    EAttribute getAnyContentFromOtherNamespace_Mixed();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace#getGroup <em>Group</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Group</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace#getGroup()
     * @see #getAnyContentFromOtherNamespace()
     * @generated
     */
    EAttribute getAnyContentFromOtherNamespace_Group();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace#getAny()
     * @see #getAnyContentFromOtherNamespace()
     * @generated
     */
    EAttribute getAnyContentFromOtherNamespace_Any();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyContentFromOtherNamespace#getAnyAttribute()
     * @see #getAnyContentFromOtherNamespace()
     * @generated
     */
    EAttribute getAnyContentFromOtherNamespace_AnyAttribute();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for class '<em>Base Element</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement
     * @generated
     */
    EClass getBaseElement();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getPrivate <em>Private</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Private</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getPrivate()
     * @see #getBaseElement()
     * @generated
     */
    EReference getBaseElement_Private();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Text</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getText()
     * @see #getBaseElement()
     * @generated
     */
    EReference getBaseElement_Text();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getAny()
     * @see #getBaseElement()
     * @generated
     */
    EAttribute getBaseElement_Any();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getAnyAttribute <em>Any Attribute</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BaseElement#getAnyAttribute()
     * @see #getBaseElement()
     * @generated
     */
    EAttribute getBaseElement_AnyAttribute();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header <em>Header</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for class '<em>Header</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header
     * @generated
     */
    EClass getHeader();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getId()
     * @see #getHeader()
     * @generated
     */
    EAttribute getHeader_Id();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getNameStructure <em>Name Structure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Structure</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getNameStructure()
     * @see #getHeader()
     * @generated
     */
    EAttribute getHeader_NameStructure();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getRevision()
     * @see #getHeader()
     * @generated
     */
    EAttribute getHeader_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getToolID <em>Tool ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tool ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getToolID()
     * @see #getHeader()
     * @generated
     */
    EAttribute getHeader_ToolID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getVersion()
     * @see #getHeader()
     * @generated
     */
    EAttribute getHeader_Version();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getParentSCL <em>Parent SCL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SCL</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getParentSCL()
     * @see #getHeader()
     * @generated
     */
    EReference getHeader_ParentSCL();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Text</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getText()
     * @see #getHeader()
     * @generated
     */
    EReference getHeader_Text();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory <em>History</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>History</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Header#getHistory()
     * @see #getHeader()
     * @generated
     */
    EReference getHeader_History();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History <em>History</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>History</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.History
     * @generated
     */
    EClass getHistory();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getParentHeader <em>Parent Header</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Header</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getParentHeader()
     * @see #getHistory()
     * @generated
     */
    EReference getHistory_ParentHeader();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHitem <em>Hitem</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Hitem</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.History#getHitem()
     * @see #getHistory()
     * @generated
     */
    EReference getHistory_Hitem();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem <em>Hitem</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Hitem</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem
     * @generated
     */
    EClass getHitem();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getRevision()
     * @see #getHitem()
     * @generated
     */
    EAttribute getHitem_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getVersion()
     * @see #getHitem()
     * @generated
     */
    EAttribute getHitem_Version();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhat <em>What</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>What</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhat()
     * @see #getHitem()
     * @generated
     */
    EAttribute getHitem_What();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhen <em>When</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>When</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhen()
     * @see #getHitem()
     * @generated
     */
    EAttribute getHitem_When();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWho <em>Who</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Who</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWho()
     * @see #getHitem()
     * @generated
     */
    EAttribute getHitem_Who();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhy <em>Why</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Why</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getWhy()
     * @see #getHitem()
     * @generated
     */
    EAttribute getHitem_Why();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getParentHistory <em>Parent History</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent History</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Hitem#getParentHistory()
     * @see #getHitem()
     * @generated
     */
    EReference getHitem_ParentHistory();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IDNaming <em>ID Naming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ID Naming</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IDNaming
     * @generated
     */
    EClass getIDNaming();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IDNaming#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IDNaming#getId()
     * @see #getIDNaming()
     * @generated
     */
    EAttribute getIDNaming_Id();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line <em>Line</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Line</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line
     * @generated
     */
    EClass getLine();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getType()
     * @see #getLine()
     * @generated
     */
    EAttribute getLine_Type();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getParentProcess <em>Parent Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Process</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getParentProcess()
     * @see #getLine()
     * @generated
     */
    EReference getLine_ParentProcess();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getParentSCL <em>Parent SCL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SCL</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getParentSCL()
     * @see #getLine()
     * @generated
     */
    EReference getLine_ParentSCL();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConnectivityNode <em>Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connectivity Node</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConnectivityNode()
     * @see #getLine()
     * @generated
     */
    EReference getLine_ConnectivityNode();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getConductingEquipment()
     * @see #getLine()
     * @generated
     */
    EReference getLine_ConductingEquipment();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getVoltage <em>Voltage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Voltage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getVoltage()
     * @see #getLine()
     * @generated
     */
    EReference getLine_Voltage();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNomFreq <em>Nom Freq</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nom Freq</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNomFreq()
     * @see #getLine()
     * @generated
     */
    EAttribute getLine_NomFreq();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNumPhases <em>Num Phases</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Num Phases</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Line#getNumPhases()
     * @see #getLine()
     * @generated
     */
    EAttribute getLine_NumPhases();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming <em>Naming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Naming</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming
     * @generated
     */
    EClass getNaming();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming#getName()
     * @see #getNaming()
     * @generated
     */
    EAttribute getNaming_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Private <em>Private</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Private</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Private
     * @generated
     */
    EClass getPrivate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Private#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Private#getSource()
     * @see #getPrivate()
     * @generated
     */
    EAttribute getPrivate_Source();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Private#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Private#getType()
     * @see #getPrivate()
     * @generated
     */
    EAttribute getPrivate_Type();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Private#getParentBaseElement <em>Parent Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Base Element</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Private#getParentBaseElement()
     * @see #getPrivate()
     * @generated
     */
    EReference getPrivate_ParentBaseElement();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Process</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process
     * @generated
     */
    EClass getProcess();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getType()
     * @see #getProcess()
     * @generated
     */
    EAttribute getProcess_Type();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getLine <em>Line</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Line</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getLine()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Line();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getParentSCL <em>Parent SCL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SCL</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getParentSCL()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_ParentSCL();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getConductingEquipment()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_ConductingEquipment();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubstation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Substation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubstation()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_Substation();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubProcesses <em>Sub Processes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Processes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getSubProcesses()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_SubProcesses();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getParentProcess <em>Parent Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Process</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Process#getParentProcess()
     * @see #getProcess()
     * @generated
     */
    EReference getProcess_ParentProcess();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL <em>SCL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SCL</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL
     * @generated
     */
    EClass getSCL();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRevision <em>Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRevision()
     * @see #getSCL()
     * @generated
     */
    EAttribute getSCL_Revision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getVersion()
     * @see #getSCL()
     * @generated
     */
    EAttribute getSCL_Version();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getHeader <em>Header</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Header</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getHeader()
     * @see #getSCL()
     * @generated
     */
    EReference getSCL_Header();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getLine <em>Line</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Line</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getLine()
     * @see #getSCL()
     * @generated
     */
    EReference getSCL_Line();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getProcess <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Process</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getProcess()
     * @see #getSCL()
     * @generated
     */
    EReference getSCL_Process();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getIED <em>IED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>IED</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getIED()
     * @see #getSCL()
     * @generated
     */
    EReference getSCL_IED();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getDataTypeTemplates <em>Data Type Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Type Templates</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getDataTypeTemplates()
     * @see #getSCL()
     * @generated
     */
    EReference getSCL_DataTypeTemplates();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getCommunication <em>Communication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Communication</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getCommunication()
     * @see #getSCL()
     * @generated
     */
    EReference getSCL_Communication();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getSubstation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Substation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getSubstation()
     * @see #getSCL()
     * @generated
     */
    EReference getSCL_Substation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRelease <em>Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SCL#getRelease()
     * @see #getSCL()
     * @generated
     */
    EAttribute getSCL_Release();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Text</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Text
     * @generated
     */
    EClass getText();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getSource()
     * @see #getText()
     * @generated
     */
    EAttribute getText_Source();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getParentBaseElement <em>Parent Base Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Base Element</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getParentBaseElement()
     * @see #getText()
     * @generated
     */
    EReference getText_ParentBaseElement();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getParentHeader <em>Parent Header</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Header</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getParentHeader()
     * @see #getText()
     * @generated
     */
    EReference getText_ParentHeader();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Text#getValue()
     * @see #getText()
     * @generated
     */
    EAttribute getText_Value();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Address</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Address
     * @generated
     */
    EClass getAddress();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentConnectedAP <em>Parent Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Connected AP</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentConnectedAP()
     * @see #getAddress()
     * @generated
     */
    EReference getAddress_ParentConnectedAP();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentControlBlock <em>Parent Control Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Control Block</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getParentControlBlock()
     * @see #getAddress()
     * @generated
     */
    EReference getAddress_ParentControlBlock();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP <em>P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>P</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Address#getP()
     * @see #getAddress()
     * @generated
     */
    EReference getAddress_P();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication <em>Communication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Communication</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication
     * @generated
     */
    EClass getCommunication();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSubNetwork <em>Sub Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Network</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getSubNetwork()
     * @see #getCommunication()
     * @generated
     */
    EReference getCommunication_SubNetwork();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getParentSCL <em>Parent SCL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SCL</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Communication#getParentSCL()
     * @see #getCommunication()
     * @generated
     */
    EReference getCommunication_ParentSCL();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP <em>Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connected AP</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP
     * @generated
     */
    EClass getConnectedAP();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getApName <em>Ap Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ap Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getApName()
     * @see #getConnectedAP()
     * @generated
     */
    EAttribute getConnectedAP_ApName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getIedName <em>Ied Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ied Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getIedName()
     * @see #getConnectedAP()
     * @generated
     */
    EAttribute getConnectedAP_IedName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRedProt <em>Red Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Red Prot</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRedProt()
     * @see #getConnectedAP()
     * @generated
     */
    EAttribute getConnectedAP_RedProt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Address</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getAddress()
     * @see #getConnectedAP()
     * @generated
     */
    EReference getConnectedAP_Address();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getParentSubNetwork <em>Parent Sub Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Sub Network</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getParentSubNetwork()
     * @see #getConnectedAP()
     * @generated
     */
    EReference getConnectedAP_ParentSubNetwork();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRefersToAccessPoint <em>Refers To Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Access Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getRefersToAccessPoint()
     * @see #getConnectedAP()
     * @generated
     */
    EReference getConnectedAP_RefersToAccessPoint();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getPhysConn <em>Phys Conn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Phys Conn</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getPhysConn()
     * @see #getConnectedAP()
     * @generated
     */
    EReference getConnectedAP_PhysConn();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getGSE <em>GSE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>GSE</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getGSE()
     * @see #getConnectedAP()
     * @generated
     */
    EReference getConnectedAP_GSE();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getSMV <em>SMV</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SMV</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getSMV()
     * @see #getConnectedAP()
     * @generated
     */
    EReference getConnectedAP_SMV();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getControlBlock <em>Control Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Control Block</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectedAP#getControlBlock()
     * @see #getConnectedAP()
     * @generated
     */
    EAttribute getConnectedAP_ControlBlock();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock <em>Control Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control Block</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock
     * @generated
     */
    EClass getControlBlock();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getCbName <em>Cb Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cb Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getCbName()
     * @see #getControlBlock()
     * @generated
     */
    EAttribute getControlBlock_CbName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getLdInst <em>Ld Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ld Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getLdInst()
     * @see #getControlBlock()
     * @generated
     */
    EAttribute getControlBlock_LdInst();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getAddress <em>Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Address</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getAddress()
     * @see #getControlBlock()
     * @generated
     */
    EReference getControlBlock_Address();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToControlWithIEDName <em>Refers To Control With IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Control With IED Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getRefersToControlWithIEDName()
     * @see #getControlBlock()
     * @generated
     */
    EReference getControlBlock_RefersToControlWithIEDName();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getParentConnectedAP() <em>Get Parent Connected AP</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Parent Connected AP</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlBlock#getParentConnectedAP()
     * @generated
     */
    EOperation getControlBlock__GetParentConnectedAP();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE <em>GSE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>GSE</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE
     * @generated
     */
    EClass getGSE();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMaxTime <em>Max Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Max Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMaxTime()
     * @see #getGSE()
     * @generated
     */
    EReference getGSE_MaxTime();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getParentConnectedAP <em>Parent Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Connected AP</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getParentConnectedAP()
     * @see #getGSE()
     * @generated
     */
    EReference getGSE_ParentConnectedAP();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMinTime <em>Min Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Min Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSE#getMinTime()
     * @see #getGSE()
     * @generated
     */
    EReference getGSE_MinTime();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P <em>P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>P</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.P
     * @generated
     */
    EClass getP();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P#getParentAddress <em>Parent Address</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Address</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.P#getParentAddress()
     * @see #getP()
     * @generated
     */
    EReference getP_ParentAddress();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PAddr <em>PAddr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>PAddr</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PAddr
     * @generated
     */
    EClass getPAddr();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PAddr#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PAddr#getType()
     * @see #getPAddr()
     * @generated
     */
    EAttribute getPAddr_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PAddr#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PAddr#getValue()
     * @see #getPAddr()
     * @generated
     */
    EAttribute getPAddr_Value();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P_PhysConn <em>PPhys Conn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>PPhys Conn</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.P_PhysConn
     * @generated
     */
    EClass getP_PhysConn();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.P_PhysConn#getParentPhysConn <em>Parent Phys Conn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Phys Conn</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.P_PhysConn#getParentPhysConn()
     * @see #getP_PhysConn()
     * @generated
     */
    EReference getP_PhysConn_ParentPhysConn();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn <em>Phys Conn</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Phys Conn</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn
     * @generated
     */
    EClass getPhysConn();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn#getType()
     * @see #getPhysConn()
     * @generated
     */
    EAttribute getPhysConn_Type();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn#getParentConnectedAP <em>Parent Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Connected AP</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn#getParentConnectedAP()
     * @see #getPhysConn()
     * @generated
     */
    EReference getPhysConn_ParentConnectedAP();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn#getP <em>P</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>P</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PhysConn#getP()
     * @see #getPhysConn()
     * @generated
     */
    EReference getPhysConn_P();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV <em>SMV</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SMV</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV
     * @generated
     */
    EClass getSMV();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV#getParentConnectedAP <em>Parent Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Connected AP</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMV#getParentConnectedAP()
     * @see #getSMV()
     * @generated
     */
    EReference getSMV_ParentConnectedAP();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork <em>Sub Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Network</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork
     * @generated
     */
    EClass getSubNetwork();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getType()
     * @see #getSubNetwork()
     * @generated
     */
    EAttribute getSubNetwork_Type();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getBitRate <em>Bit Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bit Rate</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getBitRate()
     * @see #getSubNetwork()
     * @generated
     */
    EReference getSubNetwork_BitRate();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getParentCommunication <em>Parent Communication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Communication</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getParentCommunication()
     * @see #getSubNetwork()
     * @generated
     */
    EReference getSubNetwork_ParentCommunication();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getConnectedAP <em>Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connected AP</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubNetwork#getConnectedAP()
     * @see #getSubNetwork()
     * @generated
     */
    EReference getSubNetwork_ConnectedAP();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute <em>Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute
     * @generated
     */
    EClass getAbstractDataAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getBType <em>BType</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>BType</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getBType()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EAttribute getAbstractDataAttribute_BType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getCount <em>Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Count</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getCount()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EAttribute getAbstractDataAttribute_Count();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getSAddr <em>SAddr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SAddr</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getSAddr()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EAttribute getAbstractDataAttribute_SAddr();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getType()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EAttribute getAbstractDataAttribute_Type();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValImport <em>Val Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Val Import</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValImport()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EAttribute getAbstractDataAttribute_ValImport();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValKind <em>Val Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Val Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getValKind()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EAttribute getAbstractDataAttribute_ValKind();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToEnumType <em>Refers To Enum Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Enum Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToEnumType()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EReference getAbstractDataAttribute_RefersToEnumType();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getVal <em>Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Val</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getVal()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EReference getAbstractDataAttribute_Val();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToDAType <em>Refers To DA Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To DA Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getRefersToDAType()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EReference getAbstractDataAttribute_RefersToDAType();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByFCDA <em>Referred By FCDA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By FCDA</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByFCDA()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EReference getAbstractDataAttribute_ReferredByFCDA();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByExtRef <em>Referred By Ext Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Ext Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getReferredByExtRef()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EReference getAbstractDataAttribute_ReferredByExtRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute#getName()
     * @see #getAbstractDataAttribute()
     * @generated
     */
    EAttribute getAbstractDataAttribute_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA <em>BDA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>BDA</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA
     * @generated
     */
    EClass getBDA();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA#getParentDAType <em>Parent DA Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DA Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA#getParentDAType()
     * @see #getBDA()
     * @generated
     */
    EReference getBDA_ParentDAType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA <em>DA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DA</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DA
     * @generated
     */
    EClass getDA();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getFc <em>Fc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getFc()
     * @see #getDA()
     * @generated
     */
    EAttribute getDA_Fc();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getParentDOType <em>Parent DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DO Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getParentDOType()
     * @see #getDA()
     * @generated
     */
    EReference getDA_ParentDOType();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getProtNs <em>Prot Ns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Prot Ns</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DA#getProtNs()
     * @see #getDA()
     * @generated
     */
    EReference getDA_ProtNs();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType <em>DA Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DA Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType
     * @generated
     */
    EClass getDAType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getIedType <em>Ied Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ied Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getIedType()
     * @see #getDAType()
     * @generated
     */
    EAttribute getDAType_IedType();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getBDA <em>BDA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>BDA</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getBDA()
     * @see #getDAType()
     * @generated
     */
    EReference getDAType_BDA();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Abstract Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getReferredByAbstractDataAttribute()
     * @see #getDAType()
     * @generated
     */
    EReference getDAType_ReferredByAbstractDataAttribute();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Data Type Templates</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getParentDataTypeTemplates()
     * @see #getDAType()
     * @generated
     */
    EReference getDAType_ParentDataTypeTemplates();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getProtNs <em>Prot Ns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Prot Ns</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType#getProtNs()
     * @see #getDAType()
     * @generated
     */
    EReference getDAType_ProtNs();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO <em>DO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DO</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DO
     * @generated
     */
    EClass getDO();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getTransient <em>Transient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transient</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getTransient()
     * @see #getDO()
     * @generated
     */
    EAttribute getDO_Transient();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getParentLNodeType <em>Parent LNode Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LNode Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getParentLNodeType()
     * @see #getDO()
     * @generated
     */
    EReference getDO_ParentLNodeType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getAccessControl <em>Access Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Access Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getAccessControl()
     * @see #getDO()
     * @generated
     */
    EAttribute getDO_AccessControl();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getReferredByDOI <em>Referred By DOI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By DOI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DO#getReferredByDOI()
     * @see #getDO()
     * @generated
     */
    EReference getDO_ReferredByDOI();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType <em>DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DO Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType
     * @generated
     */
    EClass getDOType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getCdc <em>Cdc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cdc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getCdc()
     * @see #getDOType()
     * @generated
     */
    EAttribute getDOType_Cdc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getIedType <em>Ied Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ied Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getIedType()
     * @see #getDOType()
     * @generated
     */
    EAttribute getDOType_IedType();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA <em>DA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>DA</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getDA()
     * @see #getDOType()
     * @generated
     */
    EReference getDOType_DA();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByAbstractDataObject <em>Referred By Abstract Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Abstract Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getReferredByAbstractDataObject()
     * @see #getDOType()
     * @generated
     */
    EReference getDOType_ReferredByAbstractDataObject();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Data Type Templates</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getParentDataTypeTemplates()
     * @see #getDOType()
     * @generated
     */
    EReference getDOType_ParentDataTypeTemplates();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getSDO <em>SDO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SDO</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType#getSDO()
     * @see #getDOType()
     * @generated
     */
    EReference getDOType_SDO();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates <em>Data Type Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Type Templates</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates
     * @generated
     */
    EClass getDataTypeTemplates();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDAType <em>DA Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>DA Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDAType()
     * @see #getDataTypeTemplates()
     * @generated
     */
    EReference getDataTypeTemplates_DAType();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDOType <em>DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>DO Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getDOType()
     * @see #getDataTypeTemplates()
     * @generated
     */
    EReference getDataTypeTemplates_DOType();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getEnumType <em>Enum Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Enum Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getEnumType()
     * @see #getDataTypeTemplates()
     * @generated
     */
    EReference getDataTypeTemplates_EnumType();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getLNodeType <em>LNode Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LNode Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getLNodeType()
     * @see #getDataTypeTemplates()
     * @generated
     */
    EReference getDataTypeTemplates_LNodeType();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getParentSCL <em>Parent SCL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SCL</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataTypeTemplates#getParentSCL()
     * @see #getDataTypeTemplates()
     * @generated
     */
    EReference getDataTypeTemplates_ParentSCL();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType <em>Enum Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enum Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType
     * @generated
     */
    EClass getEnumType();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getReferredByAbstractDataAttribute <em>Referred By Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Abstract Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getReferredByAbstractDataAttribute()
     * @see #getEnumType()
     * @generated
     */
    EReference getEnumType_ReferredByAbstractDataAttribute();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Data Type Templates</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getParentDataTypeTemplates()
     * @see #getEnumType()
     * @generated
     */
    EReference getEnumType_ParentDataTypeTemplates();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getEnumVal <em>Enum Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Enum Val</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumType#getEnumVal()
     * @see #getEnumType()
     * @generated
     */
    EReference getEnumType_EnumVal();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal <em>Enum Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enum Val</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal
     * @generated
     */
    EClass getEnumVal();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getOrd <em>Ord</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ord</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getOrd()
     * @see #getEnumVal()
     * @generated
     */
    EAttribute getEnumVal_Ord();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getParentEnumType <em>Parent Enum Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Enum Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getParentEnumType()
     * @see #getEnumVal()
     * @generated
     */
    EReference getEnumVal_ParentEnumType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EnumVal#getValue()
     * @see #getEnumVal()
     * @generated
     */
    EAttribute getEnumVal_Value();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType <em>LNode Type</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for class '<em>LNode Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType
     * @generated
     */
    EClass getLNodeType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getIedType <em>Ied Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ied Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getIedType()
     * @see #getLNodeType()
     * @generated
     */
    EAttribute getLNodeType_IedType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getLnClass <em>Ln Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getLnClass()
     * @see #getLNodeType()
     * @generated
     */
    EAttribute getLNodeType_LnClass();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getDO <em>DO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>DO</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getDO()
     * @see #getLNodeType()
     * @generated
     */
    EReference getLNodeType_DO();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getParentDataTypeTemplates <em>Parent Data Type Templates</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Data Type Templates</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getParentDataTypeTemplates()
     * @see #getLNodeType()
     * @generated
     */
    EReference getLNodeType_ParentDataTypeTemplates();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByAnyLN <em>Referred By Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType#getReferredByAnyLN()
     * @see #getLNodeType()
     * @generated
     */
    EReference getLNodeType_ReferredByAnyLN();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs <em>Prot Ns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Prot Ns</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs
     * @generated
     */
    EClass getProtNs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getType()
     * @see #getProtNs()
     * @generated
     */
    EAttribute getProtNs_Type();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getParentDA <em>Parent DA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DA</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getParentDA()
     * @see #getProtNs()
     * @generated
     */
    EReference getProtNs_ParentDA();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getParentDAType <em>Parent DA Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DA Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getParentDAType()
     * @see #getProtNs()
     * @generated
     */
    EReference getProtNs_ParentDAType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ProtNs#getValue()
     * @see #getProtNs()
     * @generated
     */
    EAttribute getProtNs_Value();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO <em>SDO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SDO</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO
     * @generated
     */
    EClass getSDO();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getCount <em>Count</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Count</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getCount()
     * @see #getSDO()
     * @generated
     */
    EAttribute getSDO_Count();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getParentDOType <em>Parent DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DO Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO#getParentDOType()
     * @see #getSDO()
     * @generated
     */
    EReference getSDO_ParentDOType();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val <em>Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Val</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Val
     * @generated
     */
    EClass getVal();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getSGroup <em>SGroup</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SGroup</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getSGroup()
     * @see #getVal()
     * @generated
     */
    EAttribute getVal_SGroup();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentAbstractDataAttribute <em>Parent Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Abstract Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentAbstractDataAttribute()
     * @see #getVal()
     * @generated
     */
    EReference getVal_ParentAbstractDataAttribute();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentDAI <em>Parent DAI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DAI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getParentDAI()
     * @see #getVal()
     * @generated
     */
    EReference getVal_ParentDAI();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Val#getValue()
     * @see #getVal()
     * @generated
     */
    EAttribute getVal_Value();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec <em>Bit Rate In Mb Per Sec</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bit Rate In Mb Per Sec</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec
     * @generated
     */
    EClass getBitRateInMbPerSec();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getValue()
     * @see #getBitRateInMbPerSec()
     * @generated
     */
    EAttribute getBitRateInMbPerSec_Value();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getMultiplier <em>Multiplier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiplier</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getMultiplier()
     * @see #getBitRateInMbPerSec()
     * @generated
     */
    EAttribute getBitRateInMbPerSec_Multiplier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unit</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRateInMbPerSec#getUnit()
     * @see #getBitRateInMbPerSec()
     * @generated
     */
    EAttribute getBitRateInMbPerSec_Unit();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.MinTime <em>Min Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Min Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.MinTime
     * @generated
     */
    EClass getMinTime();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.MaxTime <em>Max Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Max Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.MaxTime
     * @generated
     */
    EClass getMaxTime();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate <em>Bit Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bit Rate</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate
     * @generated
     */
    EClass getBitRate();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate#getParentSubNetwork <em>Parent Sub Network</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Sub Network</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.BitRate#getParentSubNetwork()
     * @see #getBitRate()
     * @generated
     */
    EReference getBitRate_ParentSubNetwork();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate <em>Smp Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Smp Rate</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate
     * @generated
     */
    EClass getSmpRate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate#getValue()
     * @see #getSmpRate()
     * @generated
     */
    EAttribute getSmpRate_Value();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate#getParentSMVSettings <em>Parent SMV Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SMV Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpRate#getParentSMVSettings()
     * @see #getSmpRate()
     * @generated
     */
    EReference getSmpRate_ParentSMVSettings();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec <em>Samples Per Sec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Samples Per Sec</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec
     * @generated
     */
    EClass getSamplesPerSec();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec#getValue()
     * @see #getSamplesPerSec()
     * @generated
     */
    EAttribute getSamplesPerSec_Value();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec#getParentSMVSettings <em>Parent SMV Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SMV Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SamplesPerSec#getParentSMVSettings()
     * @see #getSamplesPerSec()
     * @generated
     */
    EReference getSamplesPerSec_ParentSMVSettings();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples <em>Sec Per Samples</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sec Per Samples</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples
     * @generated
     */
    EClass getSecPerSamples();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples#getValue()
     * @see #getSecPerSamples()
     * @generated
     */
    EAttribute getSecPerSamples_Value();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples#getParentSMVSettings <em>Parent SMV Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SMV Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SecPerSamples#getParentSMVSettings()
     * @see #getSecPerSamples()
     * @generated
     */
    EReference getSecPerSamples_ParentSMVSettings();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity <em>Mc Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mc Security</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity
     * @generated
     */
    EClass getMcSecurity();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentClientServices <em>Parent Client Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Client Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentClientServices()
     * @see #getMcSecurity()
     * @generated
     */
    EReference getMcSecurity_ParentClientServices();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentGSESettings <em>Parent GSE Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent GSE Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentGSESettings()
     * @see #getMcSecurity()
     * @generated
     */
    EReference getMcSecurity_ParentGSESettings();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentSMVSettings <em>Parent SMV Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SMV Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getParentSMVSettings()
     * @see #getMcSecurity()
     * @generated
     */
    EReference getMcSecurity_ParentSMVSettings();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getSignature <em>Signature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Signature</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getSignature()
     * @see #getMcSecurity()
     * @generated
     */
    EAttribute getMcSecurity_Signature();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getEncryption <em>Encryption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Encryption</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.McSecurity#getEncryption()
     * @see #getMcSecurity()
     * @generated
     */
    EAttribute getMcSecurity_Encryption();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication <em>Ag Authentication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Authentication</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication
     * @generated
     */
    EClass getAgAuthentication();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getCertificate <em>Certificate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Certificate</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getCertificate()
     * @see #getAgAuthentication()
     * @generated
     */
    EAttribute getAgAuthentication_Certificate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getNone <em>None</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>None</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getNone()
     * @see #getAgAuthentication()
     * @generated
     */
    EAttribute getAgAuthentication_None();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getPassword <em>Password</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Password</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getPassword()
     * @see #getAgAuthentication()
     * @generated
     */
    EAttribute getAgAuthentication_Password();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getStrong <em>Strong</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Strong</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getStrong()
     * @see #getAgAuthentication()
     * @generated
     */
    EAttribute getAgAuthentication_Strong();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getWeak <em>Weak</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Weak</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgAuthentication#getWeak()
     * @see #getAgAuthentication()
     * @generated
     */
    EAttribute getAgAuthentication_Weak();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts <em>Ag Smv Opts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Smv Opts</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts
     * @generated
     */
    EClass getAgSmvOpts();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getDataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getDataSet()
     * @see #getAgSmvOpts()
     * @generated
     */
    EAttribute getAgSmvOpts_DataSet();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getRefreshTime <em>Refresh Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Refresh Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getRefreshTime()
     * @see #getAgSmvOpts()
     * @generated
     */
    EAttribute getAgSmvOpts_RefreshTime();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getSampleRate <em>Sample Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sample Rate</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getSampleRate()
     * @see #getAgSmvOpts()
     * @generated
     */
    EAttribute getAgSmvOpts_SampleRate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getSampleSynchronized <em>Sample Synchronized</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sample Synchronized</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getSampleSynchronized()
     * @see #getAgSmvOpts()
     * @generated
     */
    EAttribute getAgSmvOpts_SampleSynchronized();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getSecurity <em>Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Security</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getSecurity()
     * @see #getAgSmvOpts()
     * @generated
     */
    EAttribute getAgSmvOpts_Security();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getTimestamp <em>Timestamp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timestamp</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getTimestamp()
     * @see #getAgSmvOpts()
     * @generated
     */
    EAttribute getAgSmvOpts_Timestamp();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getSynchSourceId <em>Synch Source Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Synch Source Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getSynchSourceId()
     * @see #getAgSmvOpts()
     * @generated
     */
    EAttribute getAgSmvOpts_SynchSourceId();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getDataRef <em>Data Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgSmvOpts#getDataRef()
     * @see #getAgSmvOpts()
     * @generated
     */
    EAttribute getAgSmvOpts_DataRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields <em>Ag Opt Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Opt Fields</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields
     * @generated
     */
    EClass getAgOptFields();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getBufOvfl <em>Buf Ovfl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buf Ovfl</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getBufOvfl()
     * @see #getAgOptFields()
     * @generated
     */
    EAttribute getAgOptFields_BufOvfl();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getConfigRef <em>Config Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Config Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getConfigRef()
     * @see #getAgOptFields()
     * @generated
     */
    EAttribute getAgOptFields_ConfigRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getDataRef <em>Data Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getDataRef()
     * @see #getAgOptFields()
     * @generated
     */
    EAttribute getAgOptFields_DataRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getDataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getDataSet()
     * @see #getAgOptFields()
     * @generated
     */
    EAttribute getAgOptFields_DataSet();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getEntryID <em>Entry ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Entry ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getEntryID()
     * @see #getAgOptFields()
     * @generated
     */
    EAttribute getAgOptFields_EntryID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getReasonCode <em>Reason Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reason Code</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getReasonCode()
     * @see #getAgOptFields()
     * @generated
     */
    EAttribute getAgOptFields_ReasonCode();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getSeqNum <em>Seq Num</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Seq Num</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getSeqNum()
     * @see #getAgOptFields()
     * @generated
     */
    EAttribute getAgOptFields_SeqNum();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getTimeStamp <em>Time Stamp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Time Stamp</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getTimeStamp()
     * @see #getAgOptFields()
     * @generated
     */
    EAttribute getAgOptFields_TimeStamp();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getSegmentation <em>Segmentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Segmentation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgOptFields#getSegmentation()
     * @see #getAgOptFields()
     * @generated
     */
    EAttribute getAgOptFields_Segmentation();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDesc <em>Ag Desc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Desc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDesc
     * @generated
     */
    EClass getAgDesc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDesc#getDesc <em>Desc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Desc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDesc#getDesc()
     * @see #getAgDesc()
     * @generated
     */
    EAttribute getAgDesc_Desc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef <em>Ag LD Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag LD Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef
     * @generated
     */
    EClass getAgLDRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getIedName <em>Ied Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ied Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getIedName()
     * @see #getAgLDRef()
     * @generated
     */
    EAttribute getAgLDRef_IedName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getLdInst <em>Ld Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ld Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLDRef#getLdInst()
     * @see #getAgLDRef()
     * @generated
     */
    EAttribute getAgLDRef_LdInst();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef <em>Ag LN Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag LN Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef
     * @generated
     */
    EClass getAgLNRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef#getLnClass <em>Ln Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef#getLnClass()
     * @see #getAgLNRef()
     * @generated
     */
    EAttribute getAgLNRef_LnClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef#getLnInst <em>Ln Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef#getLnInst()
     * @see #getAgLNRef()
     * @generated
     */
    EAttribute getAgLNRef_LnInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef#getPrefix <em>Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prefix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgLNRef#getPrefix()
     * @see #getAgLNRef()
     * @generated
     */
    EAttribute getAgLNRef_Prefix();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp <em>Ag DA Trg Op</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag DA Trg Op</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp
     * @generated
     */
    EClass getAgDATrgOp();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDchg <em>Dchg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dchg</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDchg()
     * @see #getAgDATrgOp()
     * @generated
     */
    EAttribute getAgDATrgOp_Dchg();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDupd <em>Dupd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dupd</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getDupd()
     * @see #getAgDATrgOp()
     * @generated
     */
    EAttribute getAgDATrgOp_Dupd();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getQchg <em>Qchg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Qchg</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgDATrgOp#getQchg()
     * @see #getAgDATrgOp()
     * @generated
     */
    EAttribute getAgDATrgOp_Qchg();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual <em>Ag Virtual</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ag Virtual</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual
     * @generated
     */
    EClass getAgVirtual();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual#getVirtual <em>Virtual</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Virtual</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AgVirtual#getVirtual()
     * @see #getAgVirtual()
     * @generated
     */
    EAttribute getAgVirtual_Virtual();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec <em>Duration In Milli Sec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Duration In Milli Sec</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec
     * @generated
     */
    EClass getDurationInMilliSec();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec#getValue()
     * @see #getDurationInMilliSec()
     * @generated
     */
    EAttribute getDurationInMilliSec_Value();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec#getMultiplier <em>Multiplier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiplier</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec#getMultiplier()
     * @see #getDurationInMilliSec()
     * @generated
     */
    EAttribute getDurationInMilliSec_Multiplier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unit</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInMilliSec#getUnit()
     * @see #getDurationInMilliSec()
     * @generated
     */
    EAttribute getDurationInMilliSec_Unit();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl <em>Access Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Access Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl
     * @generated
     */
    EClass getAccessControl();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl#getParentLDevice <em>Parent LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LDevice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessControl#getParentLDevice()
     * @see #getAccessControl()
     * @generated
     */
    EReference getAccessControl_ParentLDevice();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint <em>Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Access Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint
     * @generated
     */
    EClass getAccessPoint();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getClock <em>Clock</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Clock</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getClock()
     * @see #getAccessPoint()
     * @generated
     */
    EAttribute getAccessPoint_Clock();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getKdc <em>Kdc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kdc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getKdc()
     * @see #getAccessPoint()
     * @generated
     */
    EAttribute getAccessPoint_Kdc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getRouter <em>Router</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Router</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getRouter()
     * @see #getAccessPoint()
     * @generated
     */
    EAttribute getAccessPoint_Router();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getParentIED <em>Parent IED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent IED</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getParentIED()
     * @see #getAccessPoint()
     * @generated
     */
    EReference getAccessPoint_ParentIED();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getLN <em>LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getLN()
     * @see #getAccessPoint()
     * @generated
     */
    EReference getAccessPoint_LN();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getSMVSecurity <em>SMV Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SMV Security</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getSMVSecurity()
     * @see #getAccessPoint()
     * @generated
     */
    EReference getAccessPoint_SMVSecurity();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServerAt <em>Server At</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Server At</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServerAt()
     * @see #getAccessPoint()
     * @generated
     */
    EReference getAccessPoint_ServerAt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServer <em>Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Server</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServer()
     * @see #getAccessPoint()
     * @generated
     */
    EReference getAccessPoint_Server();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServices <em>Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getServices()
     * @see #getAccessPoint()
     * @generated
     */
    EReference getAccessPoint_Services();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getGOOSESecurity <em>GOOSE Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>GOOSE Security</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getGOOSESecurity()
     * @see #getAccessPoint()
     * @generated
     */
    EReference getAccessPoint_GOOSESecurity();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByServerAt <em>Referred By Server At</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Server At</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByServerAt()
     * @see #getAccessPoint()
     * @generated
     */
    EReference getAccessPoint_ReferredByServerAt();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getName()
     * @see #getAccessPoint()
     * @generated
     */
    EAttribute getAccessPoint_Name();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByConnectedAP <em>Referred By Connected AP</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Connected AP</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByConnectedAP()
     * @see #getAccessPoint()
     * @generated
     */
    EReference getAccessPoint_ReferredByConnectedAP();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByKDC <em>Referred By KDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By KDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint#getReferredByKDC()
     * @see #getAccessPoint()
     * @generated
     */
    EReference getAccessPoint_ReferredByKDC();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN <em>Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN
     * @generated
     */
    EClass getAnyLN();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInst <em>Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInst()
     * @see #getAnyLN()
     * @generated
     */
    EAttribute getAnyLN_Inst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnClass <em>Ln Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnClass()
     * @see #getAnyLN()
     * @generated
     */
    EAttribute getAnyLN_LnClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnType <em>Ln Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLnType()
     * @see #getAnyLN()
     * @generated
     */
    EAttribute getAnyLN_LnType();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getRefersToLNodeType <em>Refers To LNode Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To LNode Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getRefersToLNodeType()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_RefersToLNodeType();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Inputs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getInputs()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_Inputs();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLog <em>Log</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Log</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLog()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_Log();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDOI <em>DOI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>DOI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDOI()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_DOI();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReportControl <em>Report Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Report Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReportControl()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_ReportControl();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLogControl <em>Log Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Log Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getLogControl()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_LogControl();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getDataSet()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_DataSet();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByClientLN <em>Referred By Client LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Client LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByClientLN()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_ReferredByClientLN();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByLogControl <em>Referred By Log Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Log Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByLogControl()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_ReferredByLogControl();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByAssociation <em>Referred By Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Association</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByAssociation()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_ReferredByAssociation();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByIEDName <em>Referred By IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By IED Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByIEDName()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_ReferredByIEDName();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByLNode <em>Referred By LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getReferredByLNode()
     * @see #getAnyLN()
     * @generated
     */
    EReference getAnyLN_ReferredByLNode();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getControlWithTriggerOpt <em>Control With Trigger Opt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Control With Trigger Opt</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getControlWithTriggerOpt()
     * @see #getAnyLN()
     * @generated
     */
    EAttribute getAnyLN_ControlWithTriggerOpt();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getControl <em>Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getControl()
     * @see #getAnyLN()
     * @generated
     */
    EAttribute getAnyLN_Control();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getParentLDevice() <em>Get Parent LDevice</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Parent LDevice</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN#getParentLDevice()
     * @generated
     */
    EOperation getAnyLN__GetParentLDevice();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Association</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Association
     * @generated
     */
    EClass getAssociation();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getAssociationID <em>Association ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Association ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getAssociationID()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_AssociationID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getKind()
     * @see #getAssociation()
     * @generated
     */
    EAttribute getAssociation_Kind();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getParentServer <em>Parent Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Server</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getParentServer()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_ParentServer();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Association#getRefersToAnyLN()
     * @see #getAssociation()
     * @generated
     */
    EReference getAssociation_RefersToAnyLN();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication <em>Authentication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Authentication</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication
     * @generated
     */
    EClass getAuthentication();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getParentServer <em>Parent Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Server</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Authentication#getParentServer()
     * @see #getAuthentication()
     * @generated
     */
    EReference getAuthentication_ParentServer();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate <em>Certificate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Certificate</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate
     * @generated
     */
    EClass getCertificate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSerialNumber <em>Serial Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Serial Number</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSerialNumber()
     * @see #getCertificate()
     * @generated
     */
    EAttribute getCertificate_SerialNumber();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getXferNumber <em>Xfer Number</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Xfer Number</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getXferNumber()
     * @see #getCertificate()
     * @generated
     */
    EAttribute getCertificate_XferNumber();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSubject <em>Subject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Subject</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getSubject()
     * @see #getCertificate()
     * @generated
     */
    EReference getCertificate_Subject();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getIssuerName <em>Issuer Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Issuer Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Certificate#getIssuerName()
     * @see #getCertificate()
     * @generated
     */
    EReference getCertificate_IssuerName();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN <em>Client LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Client LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN
     * @generated
     */
    EClass getClientLN();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getApRef <em>Ap Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ap Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getApRef()
     * @see #getClientLN()
     * @generated
     */
    EAttribute getClientLN_ApRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getParentRptEnabled <em>Parent Rpt Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Rpt Enabled</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getParentRptEnabled()
     * @see #getClientLN()
     * @generated
     */
    EReference getClientLN_ParentRptEnabled();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientLN#getRefersToAnyLN()
     * @see #getClientLN()
     * @generated
     */
    EReference getClientLN_RefersToAnyLN();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices <em>Client Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Client Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices
     * @generated
     */
    EClass getClientServices();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getBufReport <em>Buf Report</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buf Report</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getBufReport()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_BufReport();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGoose <em>Goose</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Goose</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGoose()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_Goose();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGsse <em>Gsse</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gsse</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getGsse()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_Gsse();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxAttributes <em>Max Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxAttributes()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_MaxAttributes();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxGOOSE <em>Max GOOSE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max GOOSE</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxGOOSE()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_MaxGOOSE();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxReports <em>Max Reports</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Reports</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxReports()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_MaxReports();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxSMV <em>Max SMV</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max SMV</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMaxSMV()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_MaxSMV();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getReadLog <em>Read Log</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Log</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getReadLog()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_ReadLog();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSupportsLdName <em>Supports Ld Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Supports Ld Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSupportsLdName()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_SupportsLdName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSv <em>Sv</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sv</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getSv()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_Sv();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getUnbufReport <em>Unbuf Report</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unbuf Report</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getUnbufReport()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_UnbufReport();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getParentServices()
     * @see #getClientServices()
     * @generated
     */
    EReference getClientServices_ParentServices();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getTimeSyncProt <em>Time Sync Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Time Sync Prot</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getTimeSyncProt()
     * @see #getClientServices()
     * @generated
     */
    EReference getClientServices_TimeSyncProt();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRGOOSE <em>RGOOSE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>RGOOSE</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRGOOSE()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_RGOOSE();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRSV <em>RSV</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>RSV</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getRSV()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_RSV();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getNoIctBinding <em>No Ict Binding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>No Ict Binding</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getNoIctBinding()
     * @see #getClientServices()
     * @generated
     */
    EAttribute getClientServices_NoIctBinding();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMcSecurity <em>Mc Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mc Security</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ClientServices#getMcSecurity()
     * @see #getClientServices()
     * @generated
     */
    EReference getClientServices_McSecurity();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt <em>Comm Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Comm Prot</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt
     * @generated
     */
    EClass getCommProt();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getIpv6 <em>Ipv6</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ipv6</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getIpv6()
     * @see #getCommProt()
     * @generated
     */
    EAttribute getCommProt_Ipv6();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.CommProt#getParentServices()
     * @see #getCommProt()
     * @generated
     */
    EReference getCommProt_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfDataSet <em>Conf Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conf Data Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfDataSet
     * @generated
     */
    EClass getConfDataSet();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfDataSet#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfDataSet#getParentServices()
     * @see #getConfDataSet()
     * @generated
     */
    EReference getConfDataSet_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs <em>Conf LNs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conf LNs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs
     * @generated
     */
    EClass getConfLNs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixLnInst <em>Fix Ln Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fix Ln Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixLnInst()
     * @see #getConfLNs()
     * @generated
     */
    EAttribute getConfLNs_FixLnInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixPrefix <em>Fix Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fix Prefix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getFixPrefix()
     * @see #getConfLNs()
     * @generated
     */
    EAttribute getConfLNs_FixPrefix();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLNs#getParentServices()
     * @see #getConfLNs()
     * @generated
     */
    EReference getConfLNs_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLdName <em>Conf Ld Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conf Ld Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLdName
     * @generated
     */
    EClass getConfLdName();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLdName#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLdName#getParentServices()
     * @see #getConfLdName()
     * @generated
     */
    EReference getConfLdName_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLogControl <em>Conf Log Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conf Log Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLogControl
     * @generated
     */
    EClass getConfLogControl();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLogControl#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfLogControl#getParentServices()
     * @see #getConfLogControl()
     * @generated
     */
    EReference getConfLogControl_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfReportControl <em>Conf Report Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conf Report Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfReportControl
     * @generated
     */
    EClass getConfReportControl();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfReportControl#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfReportControl#getParentServices()
     * @see #getConfReportControl()
     * @generated
     */
    EReference getConfReportControl_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG <em>Conf SG</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conf SG</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG
     * @generated
     */
    EClass getConfSG();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getResvTms <em>Resv Tms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resv Tms</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getResvTms()
     * @see #getConfSG()
     * @generated
     */
    EAttribute getConfSG_ResvTms();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getParentSettingGroups <em>Parent Setting Groups</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Setting Groups</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSG#getParentSettingGroups()
     * @see #getConfSG()
     * @generated
     */
    EReference getConfSG_ParentSettingGroups();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSigRef <em>Conf Sig Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conf Sig Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSigRef
     * @generated
     */
    EClass getConfSigRef();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSigRef#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConfSigRef#getParentServices()
     * @see #getConfSigRef()
     * @generated
     */
    EReference getConfSigRef_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control <em>Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Control
     * @generated
     */
    EClass getControl();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getDatSet <em>Dat Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dat Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getDatSet()
     * @see #getControl()
     * @generated
     */
    EAttribute getControl_DatSet();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getRefersToDataSet <em>Refers To Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Data Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getRefersToDataSet()
     * @see #getControl()
     * @generated
     */
    EReference getControl_RefersToDataSet();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getName()
     * @see #getControl()
     * @generated
     */
    EAttribute getControl_Name();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getReferredByExtRef <em>Referred By Ext Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Ext Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getReferredByExtRef()
     * @see #getControl()
     * @generated
     */
    EReference getControl_ReferredByExtRef();

    /**
     * Returns the meta object for the '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getParentAnyLN() <em>Get Parent Any LN</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Get Parent Any LN</em>' operation.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Control#getParentAnyLN()
     * @generated
     */
    EOperation getControl__GetParentAnyLN();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName <em>Control With IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control With IED Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName
     * @generated
     */
    EClass getControlWithIEDName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getConfRev <em>Conf Rev</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Conf Rev</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getConfRev()
     * @see #getControlWithIEDName()
     * @generated
     */
    EAttribute getControlWithIEDName_ConfRev();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getIEDName <em>IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>IED Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getIEDName()
     * @see #getControlWithIEDName()
     * @generated
     */
    EReference getControlWithIEDName_IEDName();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getReferredByControlBlock <em>Referred By Control Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Control Block</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getReferredByControlBlock()
     * @see #getControlWithIEDName()
     * @generated
     */
    EReference getControlWithIEDName_ReferredByControlBlock();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Protocol</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithIEDName#getProtocol()
     * @see #getControlWithIEDName()
     * @generated
     */
    EReference getControlWithIEDName_Protocol();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt <em>Control With Trigger Opt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control With Trigger Opt</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt
     * @generated
     */
    EClass getControlWithTriggerOpt();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getIntgPd <em>Intg Pd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intg Pd</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getIntgPd()
     * @see #getControlWithTriggerOpt()
     * @generated
     */
    EAttribute getControlWithTriggerOpt_IntgPd();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getTrgOps <em>Trg Ops</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Trg Ops</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ControlWithTriggerOpt#getTrgOps()
     * @see #getControlWithTriggerOpt()
     * @generated
     */
    EReference getControlWithTriggerOpt_TrgOps();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI <em>DAI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DAI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI
     * @generated
     */
    EClass getDAI();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getIx <em>Ix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getIx()
     * @see #getDAI()
     * @generated
     */
    EAttribute getDAI_Ix();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSAddr <em>SAddr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SAddr</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getSAddr()
     * @see #getDAI()
     * @generated
     */
    EAttribute getDAI_SAddr();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValImport <em>Val Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Val Import</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValImport()
     * @see #getDAI()
     * @generated
     */
    EAttribute getDAI_ValImport();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValKind <em>Val Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Val Kind</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getValKind()
     * @see #getDAI()
     * @generated
     */
    EAttribute getDAI_ValKind();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal <em>Val</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Val</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getVal()
     * @see #getDAI()
     * @generated
     */
    EReference getDAI_Val();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentDOI <em>Parent DOI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DOI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentDOI()
     * @see #getDAI()
     * @generated
     */
    EReference getDAI_ParentDOI();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentSDI <em>Parent SDI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SDI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getParentSDI()
     * @see #getDAI()
     * @generated
     */
    EReference getDAI_ParentSDI();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI#getName()
     * @see #getDAI()
     * @generated
     */
    EAttribute getDAI_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI <em>DOI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>DOI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI
     * @generated
     */
    EClass getDOI();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getIx <em>Ix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getIx()
     * @see #getDOI()
     * @generated
     */
    EAttribute getDOI_Ix();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getParentAnyLN()
     * @see #getDOI()
     * @generated
     */
    EReference getDOI_ParentAnyLN();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getDAI <em>DAI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>DAI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getDAI()
     * @see #getDOI()
     * @generated
     */
    EReference getDOI_DAI();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getSDI <em>SDI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>SDI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getSDI()
     * @see #getDOI()
     * @generated
     */
    EReference getDOI_SDI();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getAccessControl <em>Access Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Access Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getAccessControl()
     * @see #getDOI()
     * @generated
     */
    EAttribute getDOI_AccessControl();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getName()
     * @see #getDOI()
     * @generated
     */
    EAttribute getDOI_Name();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getRefersToDO <em>Refers To DO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To DO</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI#getRefersToDO()
     * @see #getDOI()
     * @generated
     */
    EReference getDOI_RefersToDO();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObjectDirectory <em>Data Object Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Object Directory</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObjectDirectory
     * @generated
     */
    EClass getDataObjectDirectory();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObjectDirectory#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataObjectDirectory#getParentServices()
     * @see #getDataObjectDirectory()
     * @generated
     */
    EReference getDataObjectDirectory_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet <em>Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet
     * @generated
     */
    EClass getDataSet();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getParentAnyLN()
     * @see #getDataSet()
     * @generated
     */
    EReference getDataSet_ParentAnyLN();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getReferredByControl <em>Referred By Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getReferredByControl()
     * @see #getDataSet()
     * @generated
     */
    EReference getDataSet_ReferredByControl();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getFCDA <em>FCDA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>FCDA</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getFCDA()
     * @see #getDataSet()
     * @generated
     */
    EReference getDataSet_FCDA();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSet#getName()
     * @see #getDataSet()
     * @generated
     */
    EAttribute getDataSet_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSetDirectory <em>Data Set Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Set Directory</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSetDirectory
     * @generated
     */
    EClass getDataSetDirectory();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSetDirectory#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DataSetDirectory#getParentServices()
     * @see #getDataSetDirectory()
     * @generated
     */
    EReference getDataSetDirectory_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DynAssociation <em>Dyn Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dyn Association</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DynAssociation
     * @generated
     */
    EClass getDynAssociation();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DynAssociation#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DynAssociation#getParentServices()
     * @see #getDynAssociation()
     * @generated
     */
    EReference getDynAssociation_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DynDataSet <em>Dyn Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Dyn Data Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DynDataSet
     * @generated
     */
    EClass getDynDataSet();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DynDataSet#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DynDataSet#getParentServices()
     * @see #getDynDataSet()
     * @generated
     */
    EReference getDynDataSet_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef <em>Ext Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ext Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef
     * @generated
     */
    EClass getExtRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDaName <em>Da Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Da Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDaName()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_DaName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDoName <em>Do Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Do Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getDoName()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_DoName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIedName <em>Ied Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ied Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIedName()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_IedName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIntAddr <em>Int Addr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Int Addr</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getIntAddr()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_IntAddr();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLdInst <em>Ld Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ld Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLdInst()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_LdInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnClass <em>Ln Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnClass()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_LnClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnInst <em>Ln Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getLnInst()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_LnInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPrefix <em>Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prefix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPrefix()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_Prefix();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getServiceType <em>Service Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Service Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getServiceType()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_ServiceType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcCBName <em>Src CB Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Src CB Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcCBName()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_SrcCBName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLDInst <em>Src LD Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Src LD Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLDInst()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_SrcLDInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNClass <em>Src LN Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Src LN Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNClass()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_SrcLNClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNInst <em>Src LN Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Src LN Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcLNInst()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_SrcLNInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcPrefix <em>Src Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Src Prefix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getSrcPrefix()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_SrcPrefix();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getParentInputs <em>Parent Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Inputs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getParentInputs()
     * @see #getExtRef()
     * @generated
     */
    EReference getExtRef_ParentInputs();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Abstract Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataAttribute()
     * @see #getExtRef()
     * @generated
     */
    EReference getExtRef_RefersToAbstractDataAttribute();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataObject <em>Refers To Abstract Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Abstract Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToAbstractDataObject()
     * @see #getExtRef()
     * @generated
     */
    EReference getExtRef_RefersToAbstractDataObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPServT <em>PServ T</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PServ T</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPServT()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_PServT();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPLN <em>PLN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PLN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPLN()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_PLN();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDO <em>PDO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PDO</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDO()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_PDO();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDA <em>PDA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>PDA</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getPDA()
     * @see #getExtRef()
     * @generated
     */
    EAttribute getExtRef_PDA();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToControl <em>Refers To Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExtRef#getRefersToControl()
     * @see #getExtRef()
     * @generated
     */
    EReference getExtRef_RefersToControl();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA <em>FCDA</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>FCDA</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA
     * @generated
     */
    EClass getFCDA();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDaName <em>Da Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Da Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDaName()
     * @see #getFCDA()
     * @generated
     */
    EAttribute getFCDA_DaName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDoName <em>Do Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Do Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getDoName()
     * @see #getFCDA()
     * @generated
     */
    EAttribute getFCDA_DoName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getFc <em>Fc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getFc()
     * @see #getFCDA()
     * @generated
     */
    EAttribute getFCDA_Fc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getIx <em>Ix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getIx()
     * @see #getFCDA()
     * @generated
     */
    EAttribute getFCDA_Ix();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLdInst <em>Ld Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ld Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLdInst()
     * @see #getFCDA()
     * @generated
     */
    EAttribute getFCDA_LdInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnClass <em>Ln Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnClass()
     * @see #getFCDA()
     * @generated
     */
    EAttribute getFCDA_LnClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnInst <em>Ln Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getLnInst()
     * @see #getFCDA()
     * @generated
     */
    EAttribute getFCDA_LnInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getPrefix <em>Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prefix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getPrefix()
     * @see #getFCDA()
     * @generated
     */
    EAttribute getFCDA_Prefix();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getParentDataSet <em>Parent Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Data Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getParentDataSet()
     * @see #getFCDA()
     * @generated
     */
    EReference getFCDA_ParentDataSet();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Refers To Abstract Data Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCDA#getRefersToAbstractDataAttribute()
     * @see #getFCDA()
     * @generated
     */
    EReference getFCDA_RefersToAbstractDataAttribute();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling <em>File Handling</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>File Handling</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling
     * @generated
     */
    EClass getFileHandling();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtp <em>Ftp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ftp</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtp()
     * @see #getFileHandling()
     * @generated
     */
    EAttribute getFileHandling_Ftp();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtps <em>Ftps</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ftps</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getFtps()
     * @see #getFileHandling()
     * @generated
     */
    EAttribute getFileHandling_Ftps();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getMms <em>Mms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mms</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getMms()
     * @see #getFileHandling()
     * @generated
     */
    EAttribute getFileHandling_Mms();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FileHandling#getParentServices()
     * @see #getFileHandling()
     * @generated
     */
    EReference getFileHandling_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE <em>GOOSE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>GOOSE</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE
     * @generated
     */
    EClass getGOOSE();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getFixedOffs <em>Fixed Offs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fixed Offs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getFixedOffs()
     * @see #getGOOSE()
     * @generated
     */
    EAttribute getGOOSE_FixedOffs();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getParentServices()
     * @see #getGOOSE()
     * @generated
     */
    EReference getGOOSE_ParentServices();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getGoose <em>Goose</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Goose</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getGoose()
     * @see #getGOOSE()
     * @generated
     */
    EAttribute getGOOSE_Goose();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getRGOOSE <em>RGOOSE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>RGOOSE</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSE#getRGOOSE()
     * @see #getGOOSE()
     * @generated
     */
    EAttribute getGOOSE_RGOOSE();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity <em>GOOSE Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>GOOSE Security</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity
     * @generated
     */
    EClass getGOOSESecurity();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Access Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GOOSESecurity#getParentAccessPoint()
     * @see #getGOOSESecurity()
     * @generated
     */
    EReference getGOOSESecurity_ParentAccessPoint();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl <em>GSE Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>GSE Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl
     * @generated
     */
    EClass getGSEControl();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getAppID <em>App ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>App ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getAppID()
     * @see #getGSEControl()
     * @generated
     */
    EAttribute getGSEControl_AppID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getFixedOffs <em>Fixed Offs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fixed Offs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getFixedOffs()
     * @see #getGSEControl()
     * @generated
     */
    EAttribute getGSEControl_FixedOffs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getSecurityEnable <em>Security Enable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Security Enable</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getSecurityEnable()
     * @see #getGSEControl()
     * @generated
     */
    EAttribute getGSEControl_SecurityEnable();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getType()
     * @see #getGSEControl()
     * @generated
     */
    EAttribute getGSEControl_Type();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getParentLN0 <em>Parent LN0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LN0</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControl#getParentLN0()
     * @see #getGSEControl()
     * @generated
     */
    EReference getGSEControl_ParentLN0();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEDir <em>GSE Dir</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>GSE Dir</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEDir
     * @generated
     */
    EClass getGSEDir();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEDir#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEDir#getParentServices()
     * @see #getGSEDir()
     * @generated
     */
    EReference getGSEDir_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings <em>GSE Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>GSE Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings
     * @generated
     */
    EClass getGSESettings();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getAppID <em>App ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>App ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getAppID()
     * @see #getGSESettings()
     * @generated
     */
    EAttribute getGSESettings_AppID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getDataLabel <em>Data Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Label</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getDataLabel()
     * @see #getGSESettings()
     * @generated
     */
    EAttribute getGSESettings_DataLabel();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getParentServices()
     * @see #getGSESettings()
     * @generated
     */
    EReference getGSESettings_ParentServices();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getMcSecurity <em>Mc Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mc Security</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getMcSecurity()
     * @see #getGSESettings()
     * @generated
     */
    EReference getGSESettings_McSecurity();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getKdaParticipant <em>Kda Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kda Participant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSESettings#getKdaParticipant()
     * @see #getGSESettings()
     * @generated
     */
    EAttribute getGSESettings_KdaParticipant();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSSE <em>GSSE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>GSSE</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSSE
     * @generated
     */
    EClass getGSSE();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSSE#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSSE#getParentServices()
     * @see #getGSSE()
     * @generated
     */
    EReference getGSSE_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetCBValues <em>Get CB Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Get CB Values</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetCBValues
     * @generated
     */
    EClass getGetCBValues();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetCBValues#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetCBValues#getParentServices()
     * @see #getGetCBValues()
     * @generated
     */
    EReference getGetCBValues_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataObjectDefinition <em>Get Data Object Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Get Data Object Definition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataObjectDefinition
     * @generated
     */
    EClass getGetDataObjectDefinition();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataObjectDefinition#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataObjectDefinition#getParentServices()
     * @see #getGetDataObjectDefinition()
     * @generated
     */
    EReference getGetDataObjectDefinition_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataSetValue <em>Get Data Set Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Get Data Set Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataSetValue
     * @generated
     */
    EClass getGetDataSetValue();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataSetValue#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDataSetValue#getParentServices()
     * @see #getGetDataSetValue()
     * @generated
     */
    EReference getGetDataSetValue_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDirectory <em>Get Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Get Directory</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDirectory
     * @generated
     */
    EClass getGetDirectory();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDirectory#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GetDirectory#getParentServices()
     * @see #getGetDirectory()
     * @generated
     */
    EReference getGetDirectory_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED <em>IED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IED</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED
     * @generated
     */
    EClass getIED();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getConfigVersion <em>Config Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Config Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getConfigVersion()
     * @see #getIED()
     * @generated
     */
    EAttribute getIED_ConfigVersion();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getEngRight <em>Eng Right</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Eng Right</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getEngRight()
     * @see #getIED()
     * @generated
     */
    EAttribute getIED_EngRight();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getManufacturer <em>Manufacturer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Manufacturer</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getManufacturer()
     * @see #getIED()
     * @generated
     */
    EAttribute getIED_Manufacturer();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRevision <em>Original Scl Revision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Original Scl Revision</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRevision()
     * @see #getIED()
     * @generated
     */
    EAttribute getIED_OriginalSclRevision();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclVersion <em>Original Scl Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Original Scl Version</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclVersion()
     * @see #getIED()
     * @generated
     */
    EAttribute getIED_OriginalSclVersion();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Owner</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOwner()
     * @see #getIED()
     * @generated
     */
    EAttribute getIED_Owner();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getType()
     * @see #getIED()
     * @generated
     */
    EAttribute getIED_Type();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getAccessPoint <em>Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Access Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getAccessPoint()
     * @see #getIED()
     * @generated
     */
    EReference getIED_AccessPoint();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getKDC <em>KDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>KDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getKDC()
     * @see #getIED()
     * @generated
     */
    EReference getIED_KDC();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getServices <em>Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getServices()
     * @see #getIED()
     * @generated
     */
    EReference getIED_Services();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getParentSCL <em>Parent SCL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SCL</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getParentSCL()
     * @see #getIED()
     * @generated
     */
    EReference getIED_ParentSCL();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getName()
     * @see #getIED()
     * @generated
     */
    EAttribute getIED_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRelease <em>Original Scl Release</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Original Scl Release</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getOriginalSclRelease()
     * @see #getIED()
     * @generated
     */
    EAttribute getIED_OriginalSclRelease();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getReferredByIEDName <em>Referred By IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred By IED Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IED#getReferredByIEDName()
     * @see #getIED()
     * @generated
     */
    EReference getIED_ReferredByIEDName();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName <em>IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>IED Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName
     * @generated
     */
    EClass getIEDName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getApRef <em>Ap Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ap Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getApRef()
     * @see #getIEDName()
     * @generated
     */
    EAttribute getIEDName_ApRef();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getLdInst <em>Ld Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ld Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getLdInst()
     * @see #getIEDName()
     * @generated
     */
    EAttribute getIEDName_LdInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getLnClass <em>Ln Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getLnClass()
     * @see #getIEDName()
     * @generated
     */
    EAttribute getIEDName_LnClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getLnInst <em>Ln Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getLnInst()
     * @see #getIEDName()
     * @generated
     */
    EAttribute getIEDName_LnInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getPrefix <em>Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prefix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getPrefix()
     * @see #getIEDName()
     * @generated
     */
    EAttribute getIEDName_Prefix();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getParentControlWithIEDName <em>Parent Control With IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Control With IED Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getParentControlWithIEDName()
     * @see #getIEDName()
     * @generated
     */
    EReference getIEDName_ParentControlWithIEDName();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getRefersToAnyLN()
     * @see #getIEDName()
     * @generated
     */
    EReference getIEDName_RefersToAnyLN();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getValue()
     * @see #getIEDName()
     * @generated
     */
    EAttribute getIEDName_Value();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getRefersToIED <em>Refers To IED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To IED</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getRefersToIED()
     * @see #getIEDName()
     * @generated
     */
    EReference getIEDName_RefersToIED();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getRefersToLDevice <em>Refers To LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To LDevice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IEDName#getRefersToLDevice()
     * @see #getIEDName()
     * @generated
     */
    EReference getIEDName_RefersToLDevice();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Inputs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs
     * @generated
     */
    EClass getInputs();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getParentAnyLN()
     * @see #getInputs()
     * @generated
     */
    EReference getInputs_ParentAnyLN();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getExtRef <em>Ext Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Ext Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Inputs#getExtRef()
     * @see #getInputs()
     * @generated
     */
    EReference getInputs_ExtRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IssuerName <em>Issuer Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Issuer Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IssuerName
     * @generated
     */
    EClass getIssuerName();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.IssuerName#getParentCertificate <em>Parent Certificate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Certificate</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.IssuerName#getParentCertificate()
     * @see #getIssuerName()
     * @generated
     */
    EReference getIssuerName_ParentCertificate();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC <em>KDC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KDC</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC
     * @generated
     */
    EClass getKDC();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getApName <em>Ap Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ap Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getApName()
     * @see #getKDC()
     * @generated
     */
    EAttribute getKDC_ApName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getIedName <em>Ied Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ied Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getIedName()
     * @see #getKDC()
     * @generated
     */
    EAttribute getKDC_IedName();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getParentIED <em>Parent IED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent IED</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getParentIED()
     * @see #getKDC()
     * @generated
     */
    EReference getKDC_ParentIED();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getRefersToAccessPoint <em>Refers To Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Access Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.KDC#getRefersToAccessPoint()
     * @see #getKDC()
     * @generated
     */
    EReference getKDC_RefersToAccessPoint();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice <em>LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LDevice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice
     * @generated
     */
    EClass getLDevice();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getInst <em>Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getInst()
     * @see #getLDevice()
     * @generated
     */
    EAttribute getLDevice_Inst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLdName <em>Ld Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ld Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLdName()
     * @see #getLDevice()
     * @generated
     */
    EAttribute getLDevice_LdName();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAccessControl <em>Access Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Access Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAccessControl()
     * @see #getLDevice()
     * @generated
     */
    EReference getLDevice_AccessControl();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getParentServer <em>Parent Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Server</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getParentServer()
     * @see #getLDevice()
     * @generated
     */
    EReference getLDevice_ParentServer();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAnyLN <em>Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getAnyLN()
     * @see #getLDevice()
     * @generated
     */
    EAttribute getLDevice_AnyLN();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN <em>LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN()
     * @see #getLDevice()
     * @generated
     */
    EReference getLDevice_LN();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getReferredByIEDName <em>Referred By IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred By IED Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getReferredByIEDName()
     * @see #getLDevice()
     * @generated
     */
    EReference getLDevice_ReferredByIEDName();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN0 <em>LN0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>LN0</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice#getLN0()
     * @see #getLDevice()
     * @generated
     */
    EReference getLDevice_LN0();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN <em>LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN
     * @generated
     */
    EClass getLN();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getPrefix <em>Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prefix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getPrefix()
     * @see #getLN()
     * @generated
     */
    EAttribute getLN_Prefix();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Access Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentAccessPoint()
     * @see #getLN()
     * @generated
     */
    EReference getLN_ParentAccessPoint();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentLDevice <em>Parent LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LDevice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN#getParentLDevice()
     * @see #getLN()
     * @generated
     */
    EReference getLN_ParentLDevice();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0 <em>LN0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LN0</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0
     * @generated
     */
    EClass getLN0();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getGSEControl <em>GSE Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>GSE Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getGSEControl()
     * @see #getLN0()
     * @generated
     */
    EReference getLN0_GSEControl();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getParentLDevice <em>Parent LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LDevice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getParentLDevice()
     * @see #getLN0()
     * @generated
     */
    EReference getLN0_ParentLDevice();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSampledValueControl <em>Sampled Value Control</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sampled Value Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSampledValueControl()
     * @see #getLN0()
     * @generated
     */
    EReference getLN0_SampledValueControl();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSettingControl <em>Setting Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Setting Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getSettingControl()
     * @see #getLN0()
     * @generated
     */
    EReference getLN0_SettingControl();

    /**
     * Returns the meta object for the attribute list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getControlWithIEDName <em>Control With IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Control With IED Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LN0#getControlWithIEDName()
     * @see #getLN0()
     * @generated
     */
    EAttribute getLN0_ControlWithIEDName();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Log <em>Log</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Log</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Log
     * @generated
     */
    EClass getLog();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Log#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Log#getParentAnyLN()
     * @see #getLog()
     * @generated
     */
    EReference getLog_ParentAnyLN();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Log#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Log#getName()
     * @see #getLog()
     * @generated
     */
    EAttribute getLog_Name();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Log#getReferredByLogControl <em>Referred By Log Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Log Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Log#getReferredByLogControl()
     * @see #getLog()
     * @generated
     */
    EReference getLog_ReferredByLogControl();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl <em>Log Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Log Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl
     * @generated
     */
    EClass getLogControl();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getBufTime <em>Buf Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buf Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getBufTime()
     * @see #getLogControl()
     * @generated
     */
    EAttribute getLogControl_BufTime();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getLdInst <em>Ld Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ld Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getLdInst()
     * @see #getLogControl()
     * @generated
     */
    EAttribute getLogControl_LdInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getLnClass <em>Ln Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getLnClass()
     * @see #getLogControl()
     * @generated
     */
    EAttribute getLogControl_LnClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getLnInst <em>Ln Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getLnInst()
     * @see #getLogControl()
     * @generated
     */
    EAttribute getLogControl_LnInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getLogEna <em>Log Ena</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log Ena</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getLogEna()
     * @see #getLogControl()
     * @generated
     */
    EAttribute getLogControl_LogEna();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getLogName <em>Log Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getLogName()
     * @see #getLogControl()
     * @generated
     */
    EAttribute getLogControl_LogName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getPrefix <em>Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prefix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getPrefix()
     * @see #getLogControl()
     * @generated
     */
    EAttribute getLogControl_Prefix();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getReasonCode <em>Reason Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Reason Code</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getReasonCode()
     * @see #getLogControl()
     * @generated
     */
    EAttribute getLogControl_ReasonCode();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getParentAnyLN()
     * @see #getLogControl()
     * @generated
     */
    EReference getLogControl_ParentAnyLN();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getRefersToAnyLN()
     * @see #getLogControl()
     * @generated
     */
    EReference getLogControl_RefersToAnyLN();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getRefersToLog <em>Refers To Log</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Log</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogControl#getRefersToLog()
     * @see #getLogControl()
     * @generated
     */
    EReference getLogControl_RefersToLog();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings <em>Log Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Log Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings
     * @generated
     */
    EClass getLogSettings();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getIntgPd <em>Intg Pd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intg Pd</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getIntgPd()
     * @see #getLogSettings()
     * @generated
     */
    EAttribute getLogSettings_IntgPd();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getLogEna <em>Log Ena</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log Ena</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getLogEna()
     * @see #getLogSettings()
     * @generated
     */
    EAttribute getLogSettings_LogEna();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getTrgOps <em>Trg Ops</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Trg Ops</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getTrgOps()
     * @see #getLogSettings()
     * @generated
     */
    EAttribute getLogSettings_TrgOps();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LogSettings#getParentServices()
     * @see #getLogSettings()
     * @generated
     */
    EReference getLogSettings_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields <em>Opt Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Opt Fields</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields
     * @generated
     */
    EClass getOptFields();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getParentReportControl <em>Parent Report Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Report Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.OptFields#getParentReportControl()
     * @see #getOptFields()
     * @generated
     */
    EReference getOptFields_ParentReportControl();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol <em>Protocol</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Protocol</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol
     * @generated
     */
    EClass getProtocol();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getMustUnderstand <em>Must Understand</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Must Understand</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getMustUnderstand()
     * @see #getProtocol()
     * @generated
     */
    EAttribute getProtocol_MustUnderstand();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getParentControlWithIEDName <em>Parent Control With IED Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Control With IED Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Protocol#getParentControlWithIEDName()
     * @see #getProtocol()
     * @generated
     */
    EReference getProtocol_ParentControlWithIEDName();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReadWrite <em>Read Write</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Read Write</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReadWrite
     * @generated
     */
    EClass getReadWrite();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReadWrite#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReadWrite#getParentServices()
     * @see #getReadWrite()
     * @generated
     */
    EReference getReadWrite_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt <em>Red Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Red Prot</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt
     * @generated
     */
    EClass getRedProt();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getHsr <em>Hsr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Hsr</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getHsr()
     * @see #getRedProt()
     * @generated
     */
    EAttribute getRedProt_Hsr();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getPrp <em>Prp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prp</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getPrp()
     * @see #getRedProt()
     * @generated
     */
    EAttribute getRedProt_Prp();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getRstp <em>Rstp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rstp</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getRstp()
     * @see #getRedProt()
     * @generated
     */
    EAttribute getRedProt_Rstp();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RedProt#getParentServices()
     * @see #getRedProt()
     * @generated
     */
    EReference getRedProt_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl <em>Report Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Report Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl
     * @generated
     */
    EClass getReportControl();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBuffered <em>Buffered</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buffered</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBuffered()
     * @see #getReportControl()
     * @generated
     */
    EAttribute getReportControl_Buffered();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBufTime <em>Buf Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buf Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getBufTime()
     * @see #getReportControl()
     * @generated
     */
    EAttribute getReportControl_BufTime();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getConfRev <em>Conf Rev</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Conf Rev</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getConfRev()
     * @see #getReportControl()
     * @generated
     */
    EAttribute getReportControl_ConfRev();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getIndexed <em>Indexed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Indexed</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getIndexed()
     * @see #getReportControl()
     * @generated
     */
    EAttribute getReportControl_Indexed();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptID <em>Rpt ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rpt ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptID()
     * @see #getReportControl()
     * @generated
     */
    EAttribute getReportControl_RptID();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getParentAnyLN <em>Parent Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getParentAnyLN()
     * @see #getReportControl()
     * @generated
     */
    EReference getReportControl_ParentAnyLN();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getOptFields <em>Opt Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Opt Fields</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getOptFields()
     * @see #getReportControl()
     * @generated
     */
    EReference getReportControl_OptFields();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptEnabled <em>Rpt Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Rpt Enabled</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportControl#getRptEnabled()
     * @see #getReportControl()
     * @generated
     */
    EReference getReportControl_RptEnabled();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings <em>Report Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Report Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings
     * @generated
     */
    EClass getReportSettings();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getBufTime <em>Buf Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buf Time</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getBufTime()
     * @see #getReportSettings()
     * @generated
     */
    EAttribute getReportSettings_BufTime();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getIntgPd <em>Intg Pd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Intg Pd</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getIntgPd()
     * @see #getReportSettings()
     * @generated
     */
    EAttribute getReportSettings_IntgPd();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOptFields <em>Opt Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Opt Fields</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOptFields()
     * @see #getReportSettings()
     * @generated
     */
    EAttribute getReportSettings_OptFields();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Owner</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getOwner()
     * @see #getReportSettings()
     * @generated
     */
    EAttribute getReportSettings_Owner();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getResvTms <em>Resv Tms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resv Tms</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getResvTms()
     * @see #getReportSettings()
     * @generated
     */
    EAttribute getReportSettings_ResvTms();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getRptID <em>Rpt ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Rpt ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getRptID()
     * @see #getReportSettings()
     * @generated
     */
    EAttribute getReportSettings_RptID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getTrgOps <em>Trg Ops</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Trg Ops</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getTrgOps()
     * @see #getReportSettings()
     * @generated
     */
    EAttribute getReportSettings_TrgOps();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ReportSettings#getParentServices()
     * @see #getReportSettings()
     * @generated
     */
    EReference getReportSettings_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled <em>Rpt Enabled</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rpt Enabled</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled
     * @generated
     */
    EClass getRptEnabled();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getMax()
     * @see #getRptEnabled()
     * @generated
     */
    EAttribute getRptEnabled_Max();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getClientLN <em>Client LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Client LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getClientLN()
     * @see #getRptEnabled()
     * @generated
     */
    EReference getRptEnabled_ClientLN();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getParentReportControl <em>Parent Report Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Report Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.RptEnabled#getParentReportControl()
     * @see #getRptEnabled()
     * @generated
     */
    EReference getRptEnabled_ParentReportControl();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI <em>SDI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SDI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI
     * @generated
     */
    EClass getSDI();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getIx <em>Ix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getIx()
     * @see #getSDI()
     * @generated
     */
    EAttribute getSDI_Ix();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSAddr <em>SAddr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SAddr</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSAddr()
     * @see #getSDI()
     * @generated
     */
    EAttribute getSDI_SAddr();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI <em>DAI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>DAI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getDAI()
     * @see #getSDI()
     * @generated
     */
    EReference getSDI_DAI();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentDOI <em>Parent DOI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent DOI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentDOI()
     * @see #getSDI()
     * @generated
     */
    EReference getSDI_ParentDOI();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI <em>Sub SDI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub SDI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getSubSDI()
     * @see #getSDI()
     * @generated
     */
    EReference getSDI_SubSDI();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentSDI <em>Parent SDI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SDI</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getParentSDI()
     * @see #getSDI()
     * @generated
     */
    EReference getSDI_ParentSDI();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI#getName()
     * @see #getSDI()
     * @generated
     */
    EAttribute getSDI_Name();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit <em>SG Edit</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for class '<em>SG Edit</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit
     * @generated
     */
    EClass getSGEdit();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit#getResvTms <em>Resv Tms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resv Tms</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit#getResvTms()
     * @see #getSGEdit()
     * @generated
     */
    EAttribute getSGEdit_ResvTms();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit#getParentSettingGroups <em>Parent Setting Groups</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Setting Groups</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SGEdit#getParentSettingGroups()
     * @see #getSGEdit()
     * @generated
     */
    EReference getSGEdit_ParentSettingGroups();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity <em>SMV Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SMV Security</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity
     * @generated
     */
    EClass getSMVSecurity();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Access Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSecurity#getParentAccessPoint()
     * @see #getSMVSecurity()
     * @generated
     */
    EReference getSMVSecurity_ParentAccessPoint();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings <em>SMV Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SMV Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings
     * @generated
     */
    EClass getSMVSettings();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSvID <em>Sv ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sv ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSvID()
     * @see #getSMVSettings()
     * @generated
     */
    EAttribute getSMVSettings_SvID();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getOptFields <em>Opt Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Opt Fields</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getOptFields()
     * @see #getSMVSettings()
     * @generated
     */
    EAttribute getSMVSettings_OptFields();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSmpRateAttribute <em>Smp Rate Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Smp Rate Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSmpRateAttribute()
     * @see #getSMVSettings()
     * @generated
     */
    EAttribute getSMVSettings_SmpRateAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isSamplesPerSecAttribute <em>Samples Per Sec Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Samples Per Sec Attribute</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isSamplesPerSecAttribute()
     * @see #getSMVSettings()
     * @generated
     */
    EAttribute getSMVSettings_SamplesPerSecAttribute();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isPdcTimeStamp <em>Pdc Time Stamp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pdc Time Stamp</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#isPdcTimeStamp()
     * @see #getSMVSettings()
     * @generated
     */
    EAttribute getSMVSettings_PdcTimeStamp();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSmpRate <em>Smp Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Smp Rate</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSmpRate()
     * @see #getSMVSettings()
     * @generated
     */
    EReference getSMVSettings_SmpRate();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSamplesPerSec <em>Samples Per Sec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Samples Per Sec</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSamplesPerSec()
     * @see #getSMVSettings()
     * @generated
     */
    EReference getSMVSettings_SamplesPerSec();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSecPerSamples <em>Sec Per Samples</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sec Per Samples</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSecPerSamples()
     * @see #getSMVSettings()
     * @generated
     */
    EReference getSMVSettings_SecPerSamples();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getParentServices()
     * @see #getSMVSettings()
     * @generated
     */
    EReference getSMVSettings_ParentServices();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSynchSrcId <em>Synch Src Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Synch Src Id</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getSynchSrcId()
     * @see #getSMVSettings()
     * @generated
     */
    EAttribute getSMVSettings_SynchSrcId();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getNofASDU <em>Nof ASDU</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nof ASDU</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getNofASDU()
     * @see #getSMVSettings()
     * @generated
     */
    EAttribute getSMVSettings_NofASDU();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getKdaParticipant <em>Kda Participant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kda Participant</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getKdaParticipant()
     * @see #getSMVSettings()
     * @generated
     */
    EAttribute getSMVSettings_KdaParticipant();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getMcSecurity <em>Mc Security</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mc Security</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVSettings#getMcSecurity()
     * @see #getSMVSettings()
     * @generated
     */
    EReference getSMVSettings_McSecurity();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc <em>SM Vsc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SM Vsc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc
     * @generated
     */
    EClass getSMVsc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDelivery <em>Delivery</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delivery</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDelivery()
     * @see #getSMVsc()
     * @generated
     */
    EAttribute getSMVsc_Delivery();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDeliveryConf <em>Delivery Conf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delivery Conf</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getDeliveryConf()
     * @see #getSMVsc()
     * @generated
     */
    EAttribute getSMVsc_DeliveryConf();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getParentServices()
     * @see #getSMVsc()
     * @generated
     */
    EReference getSMVsc_ParentServices();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getSv <em>Sv</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sv</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getSv()
     * @see #getSMVsc()
     * @generated
     */
    EAttribute getSMVsc_Sv();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getRSV <em>RSV</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>RSV</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVsc#getRSV()
     * @see #getSMVsc()
     * @generated
     */
    EAttribute getSMVsc_RSV();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl <em>Sampled Value Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sampled Value Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl
     * @generated
     */
    EClass getSampledValueControl();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getMulticast <em>Multicast</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multicast</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getMulticast()
     * @see #getSampledValueControl()
     * @generated
     */
    EAttribute getSampledValueControl_Multicast();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getNofASDU <em>Nof ASDU</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nof ASDU</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getNofASDU()
     * @see #getSampledValueControl()
     * @generated
     */
    EAttribute getSampledValueControl_NofASDU();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSecurityEnable <em>Security Enable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Security Enable</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSecurityEnable()
     * @see #getSampledValueControl()
     * @generated
     */
    EAttribute getSampledValueControl_SecurityEnable();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpMod <em>Smp Mod</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Smp Mod</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpMod()
     * @see #getSampledValueControl()
     * @generated
     */
    EAttribute getSampledValueControl_SmpMod();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpRate <em>Smp Rate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Smp Rate</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmpRate()
     * @see #getSampledValueControl()
     * @generated
     */
    EAttribute getSampledValueControl_SmpRate();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvID <em>Smv ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Smv ID</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvID()
     * @see #getSampledValueControl()
     * @generated
     */
    EAttribute getSampledValueControl_SmvID();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getParentLN0 <em>Parent LN0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LN0</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getParentLN0()
     * @see #getSampledValueControl()
     * @generated
     */
    EReference getSampledValueControl_ParentLN0();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvOpts <em>Smv Opts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Smv Opts</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SampledValueControl#getSmvOpts()
     * @see #getSampledValueControl()
     * @generated
     */
    EReference getSampledValueControl_SmvOpts();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server <em>Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Server</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server
     * @generated
     */
    EClass getServer();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getTimeout <em>Timeout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Timeout</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getTimeout()
     * @see #getServer()
     * @generated
     */
    EAttribute getServer_Timeout();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Access Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getParentAccessPoint()
     * @see #getServer()
     * @generated
     */
    EReference getServer_ParentAccessPoint();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAssociation <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Association</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAssociation()
     * @see #getServer()
     * @generated
     */
    EReference getServer_Association();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication <em>Authentication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Authentication</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getAuthentication()
     * @see #getServer()
     * @generated
     */
    EReference getServer_Authentication();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice <em>LDevice</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LDevice</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Server#getLDevice()
     * @see #getServer()
     * @generated
     */
    EReference getServer_LDevice();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt <em>Server At</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Server At</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt
     * @generated
     */
    EClass getServerAt();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getApName <em>Ap Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ap Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getApName()
     * @see #getServerAt()
     * @generated
     */
    EAttribute getServerAt_ApName();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Access Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getParentAccessPoint()
     * @see #getServerAt()
     * @generated
     */
    EReference getServerAt_ParentAccessPoint();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getRefersToAccessPoint <em>Refers To Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Access Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServerAt#getRefersToAccessPoint()
     * @see #getServerAt()
     * @generated
     */
    EReference getServerAt_RefersToAccessPoint();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings <em>Service Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings
     * @generated
     */
    EClass getServiceSettings();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getCbName <em>Cb Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cb Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getCbName()
     * @see #getServiceSettings()
     * @generated
     */
    EAttribute getServiceSettings_CbName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getDatSet <em>Dat Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dat Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettings#getDatSet()
     * @see #getServiceSettings()
     * @generated
     */
    EAttribute getServiceSettings_DatSet();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMax <em>Service With Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service With Max</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMax
     * @generated
     */
    EClass getServiceWithMax();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMax#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMax#getMax()
     * @see #getServiceWithMax()
     * @generated
     */
    EAttribute getServiceWithMax_Max();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services <em>Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services
     * @generated
     */
    EClass getServices();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getNameLength <em>Name Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name Length</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getNameLength()
     * @see #getServices()
     * @generated
     */
    EAttribute getServices_NameLength();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getParentAccessPoint <em>Parent Access Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Access Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getParentAccessPoint()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ParentAccessPoint();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getClientServices <em>Client Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Client Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getClientServices()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ClientServices();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getCommProt <em>Comm Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Comm Prot</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getCommProt()
     * @see #getServices()
     * @generated
     */
    EReference getServices_CommProt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfDataSet <em>Conf Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conf Data Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfDataSet()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ConfDataSet();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLNs <em>Conf LNs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conf LNs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLNs()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ConfLNs();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLdName <em>Conf Ld Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conf Ld Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLdName()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ConfLdName();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLogControl <em>Conf Log Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conf Log Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfLogControl()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ConfLogControl();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfReportControl <em>Conf Report Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conf Report Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfReportControl()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ConfReportControl();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfSigRef <em>Conf Sig Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conf Sig Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getConfSigRef()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ConfSigRef();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataObjectDirectory <em>Data Object Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Object Directory</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataObjectDirectory()
     * @see #getServices()
     * @generated
     */
    EReference getServices_DataObjectDirectory();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataSetDirectory <em>Data Set Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Data Set Directory</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDataSetDirectory()
     * @see #getServices()
     * @generated
     */
    EReference getServices_DataSetDirectory();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynAssociation <em>Dyn Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Dyn Association</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynAssociation()
     * @see #getServices()
     * @generated
     */
    EReference getServices_DynAssociation();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynDataSet <em>Dyn Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Dyn Data Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getDynDataSet()
     * @see #getServices()
     * @generated
     */
    EReference getServices_DynDataSet();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getFileHandling <em>File Handling</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>File Handling</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getFileHandling()
     * @see #getServices()
     * @generated
     */
    EReference getServices_FileHandling();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGOOSE <em>GOOSE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>GOOSE</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGOOSE()
     * @see #getServices()
     * @generated
     */
    EReference getServices_GOOSE();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSEDir <em>GSE Dir</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>GSE Dir</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSEDir()
     * @see #getServices()
     * @generated
     */
    EReference getServices_GSEDir();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSESettings <em>GSE Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>GSE Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSESettings()
     * @see #getServices()
     * @generated
     */
    EReference getServices_GSESettings();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSSE <em>GSSE</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>GSSE</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGSSE()
     * @see #getServices()
     * @generated
     */
    EReference getServices_GSSE();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetCBValues <em>Get CB Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Get CB Values</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetCBValues()
     * @see #getServices()
     * @generated
     */
    EReference getServices_GetCBValues();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataObjectDefinition <em>Get Data Object Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Get Data Object Definition</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataObjectDefinition()
     * @see #getServices()
     * @generated
     */
    EReference getServices_GetDataObjectDefinition();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataSetValue <em>Get Data Set Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Get Data Set Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDataSetValue()
     * @see #getServices()
     * @generated
     */
    EReference getServices_GetDataSetValue();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDirectory <em>Get Directory</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Get Directory</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getGetDirectory()
     * @see #getServices()
     * @generated
     */
    EReference getServices_GetDirectory();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getParentIED <em>Parent IED</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent IED</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getParentIED()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ParentIED();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getLogSettings <em>Log Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Log Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getLogSettings()
     * @see #getServices()
     * @generated
     */
    EReference getServices_LogSettings();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReadWrite <em>Read Write</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Read Write</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReadWrite()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ReadWrite();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getRedProt <em>Red Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Red Prot</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getRedProt()
     * @see #getServices()
     * @generated
     */
    EReference getServices_RedProt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReportSettings <em>Report Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Report Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getReportSettings()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ReportSettings();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVsc <em>SM Vsc</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SM Vsc</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVsc()
     * @see #getServices()
     * @generated
     */
    EReference getServices_SMVsc();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSupSubscription <em>Sup Subscription</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Sup Subscription</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSupSubscription()
     * @see #getServices()
     * @generated
     */
    EReference getServices_SupSubscription();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getValueHandling <em>Value Handling</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value Handling</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getValueHandling()
     * @see #getServices()
     * @generated
     */
    EReference getServices_ValueHandling();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSetDataSetValue <em>Set Data Set Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Set Data Set Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSetDataSetValue()
     * @see #getServices()
     * @generated
     */
    EReference getServices_SetDataSetValue();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSettingGroups <em>Setting Groups</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Setting Groups</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSettingGroups()
     * @see #getServices()
     * @generated
     */
    EReference getServices_SettingGroups();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimeSyncProt <em>Time Sync Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Time Sync Prot</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimeSyncProt()
     * @see #getServices()
     * @generated
     */
    EReference getServices_TimeSyncProt();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimerActivatedControl <em>Timer Activated Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Timer Activated Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getTimerActivatedControl()
     * @see #getServices()
     * @generated
     */
    EReference getServices_TimerActivatedControl();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVSettings <em>SMV Settings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SMV Settings</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Services#getSMVSettings()
     * @see #getServices()
     * @generated
     */
    EReference getServices_SMVSettings();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SetDataSetValue <em>Set Data Set Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Set Data Set Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SetDataSetValue
     * @generated
     */
    EClass getSetDataSetValue();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SetDataSetValue#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SetDataSetValue#getParentServices()
     * @see #getSetDataSetValue()
     * @generated
     */
    EReference getSetDataSetValue_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl <em>Setting Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Setting Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl
     * @generated
     */
    EClass getSettingControl();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getActSG <em>Act SG</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Act SG</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getActSG()
     * @see #getSettingControl()
     * @generated
     */
    EAttribute getSettingControl_ActSG();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getNumOfSGs <em>Num Of SGs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Num Of SGs</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getNumOfSGs()
     * @see #getSettingControl()
     * @generated
     */
    EAttribute getSettingControl_NumOfSGs();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getResvTms <em>Resv Tms</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resv Tms</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getResvTms()
     * @see #getSettingControl()
     * @generated
     */
    EAttribute getSettingControl_ResvTms();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getParentLN0 <em>Parent LN0</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LN0</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingControl#getParentLN0()
     * @see #getSettingControl()
     * @generated
     */
    EReference getSettingControl_ParentLN0();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups <em>Setting Groups</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Setting Groups</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups
     * @generated
     */
    EClass getSettingGroups();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getConfSG <em>Conf SG</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Conf SG</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getConfSG()
     * @see #getSettingGroups()
     * @generated
     */
    EReference getSettingGroups_ConfSG();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getSGEdit <em>SG Edit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>SG Edit</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getSGEdit()
     * @see #getSettingGroups()
     * @generated
     */
    EReference getSettingGroups_SGEdit();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SettingGroups#getParentServices()
     * @see #getSettingGroups()
     * @generated
     */
    EReference getSettingGroups_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts <em>Smv Opts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Smv Opts</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts
     * @generated
     */
    EClass getSmvOpts();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getParentSampledValueControl <em>Parent Sampled Value Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Sampled Value Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmvOpts#getParentSampledValueControl()
     * @see #getSmvOpts()
     * @generated
     */
    EReference getSmvOpts_ParentSampledValueControl();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Subject <em>Subject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Subject</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Subject
     * @generated
     */
    EClass getSubject();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Subject#getParentCertificate <em>Parent Certificate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Certificate</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Subject#getParentCertificate()
     * @see #getSubject()
     * @generated
     */
    EReference getSubject_ParentCertificate();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription <em>Sup Subscription</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sup Subscription</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription
     * @generated
     */
    EClass getSupSubscription();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxGo <em>Max Go</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Go</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxGo()
     * @see #getSupSubscription()
     * @generated
     */
    EAttribute getSupSubscription_MaxGo();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxSv <em>Max Sv</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Sv</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getMaxSv()
     * @see #getSupSubscription()
     * @generated
     */
    EAttribute getSupSubscription_MaxSv();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SupSubscription#getParentServices()
     * @see #getSupSubscription()
     * @generated
     */
    EReference getSupSubscription_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt <em>Time Sync Prot</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Time Sync Prot</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt
     * @generated
     */
    EClass getTimeSyncProt();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getC37_238 <em>C37 238</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>C37 238</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getC37_238()
     * @see #getTimeSyncProt()
     * @generated
     */
    EAttribute getTimeSyncProt_C37_238();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getOther <em>Other</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Other</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getOther()
     * @see #getTimeSyncProt()
     * @generated
     */
    EAttribute getTimeSyncProt_Other();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getSntp <em>Sntp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sntp</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getSntp()
     * @see #getTimeSyncProt()
     * @generated
     */
    EAttribute getTimeSyncProt_Sntp();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getParentClientServices <em>Parent Client Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Client Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getParentClientServices()
     * @see #getTimeSyncProt()
     * @generated
     */
    EReference getTimeSyncProt_ParentClientServices();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getParentServices()
     * @see #getTimeSyncProt()
     * @generated
     */
    EReference getTimeSyncProt_ParentServices();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getIec61850_9_3 <em>Iec61850 93</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Iec61850 93</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimeSyncProt#getIec61850_9_3()
     * @see #getTimeSyncProt()
     * @generated
     */
    EAttribute getTimeSyncProt_Iec61850_9_3();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimerActivatedControl <em>Timer Activated Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Timer Activated Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimerActivatedControl
     * @generated
     */
    EClass getTimerActivatedControl();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TimerActivatedControl#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TimerActivatedControl#getParentServices()
     * @see #getTimerActivatedControl()
     * @generated
     */
    EReference getTimerActivatedControl_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps <em>Trg Ops</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trg Ops</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps
     * @generated
     */
    EClass getTrgOps();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDchg <em>Dchg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dchg</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDchg()
     * @see #getTrgOps()
     * @generated
     */
    EAttribute getTrgOps_Dchg();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDupd <em>Dupd</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Dupd</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getDupd()
     * @see #getTrgOps()
     * @generated
     */
    EAttribute getTrgOps_Dupd();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getGi <em>Gi</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gi</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getGi()
     * @see #getTrgOps()
     * @generated
     */
    EAttribute getTrgOps_Gi();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getPeriod <em>Period</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Period</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getPeriod()
     * @see #getTrgOps()
     * @generated
     */
    EAttribute getTrgOps_Period();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getQchg <em>Qchg</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Qchg</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getQchg()
     * @see #getTrgOps()
     * @generated
     */
    EAttribute getTrgOps_Qchg();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getParentControlWithTriggerOpt <em>Parent Control With Trigger Opt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Control With Trigger Opt</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TrgOps#getParentControlWithTriggerOpt()
     * @see #getTrgOps()
     * @generated
     */
    EReference getTrgOps_ParentControlWithTriggerOpt();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling <em>Value Handling</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value Handling</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling
     * @generated
     */
    EClass getValueHandling();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getSetToRO <em>Set To RO</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Set To RO</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getSetToRO()
     * @see #getValueHandling()
     * @generated
     */
    EAttribute getValueHandling_SetToRO();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getParentServices <em>Parent Services</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Services</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueHandling#getParentServices()
     * @see #getValueHandling()
     * @generated
     */
    EReference getValueHandling_ParentServices();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment <em>Abstract Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment
     * @generated
     */
    EClass getAbstractConductingEquipment();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getSubEquipment <em>Sub Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getSubEquipment()
     * @see #getAbstractConductingEquipment()
     * @generated
     */
    EReference getAbstractConductingEquipment_SubEquipment();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Terminal</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractConductingEquipment#getTerminal()
     * @see #getAbstractConductingEquipment()
     * @generated
     */
    EReference getAbstractConductingEquipment_Terminal();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc <em>Abstract Eq Func Sub Func</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Eq Func Sub Func</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc
     * @generated
     */
    EClass getAbstractEqFuncSubFunc();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getType()
     * @see #getAbstractEqFuncSubFunc()
     * @generated
     */
    EAttribute getAbstractEqFuncSubFunc_Type();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getEqSubFunction <em>Eq Sub Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Eq Sub Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getEqSubFunction()
     * @see #getAbstractEqFuncSubFunc()
     * @generated
     */
    EReference getAbstractEqFuncSubFunc_EqSubFunction();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getSubGeneralEquipment <em>Sub General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub General Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractEqFuncSubFunc#getSubGeneralEquipment()
     * @see #getAbstractEqFuncSubFunc()
     * @generated
     */
    EReference getAbstractEqFuncSubFunc_SubGeneralEquipment();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay <em>Bay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bay</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay
     * @generated
     */
    EClass getBay();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getParentVoltageLevel <em>Parent Voltage Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Voltage Level</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getParentVoltageLevel()
     * @see #getBay()
     * @generated
     */
    EReference getBay_ParentVoltageLevel();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getFunction()
     * @see #getBay()
     * @generated
     */
    EReference getBay_Function();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConnectivityNode <em>Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connectivity Node</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConnectivityNode()
     * @see #getBay()
     * @generated
     */
    EReference getBay_ConnectivityNode();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Bay#getConductingEquipment()
     * @see #getBay()
     * @generated
     */
    EReference getBay_ConductingEquipment();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment
     * @generated
     */
    EClass getConductingEquipment();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getType()
     * @see #getConductingEquipment()
     * @generated
     */
    EAttribute getConductingEquipment_Type();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentBay <em>Parent Bay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Bay</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentBay()
     * @see #getConductingEquipment()
     * @generated
     */
    EReference getConductingEquipment_ParentBay();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentFunction <em>Parent Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentFunction()
     * @see #getConductingEquipment()
     * @generated
     */
    EReference getConductingEquipment_ParentFunction();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentSubFunction <em>Parent Sub Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Sub Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentSubFunction()
     * @see #getConductingEquipment()
     * @generated
     */
    EReference getConductingEquipment_ParentSubFunction();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Eq Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getEqFunction()
     * @see #getConductingEquipment()
     * @generated
     */
    EReference getConductingEquipment_EqFunction();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentLine <em>Parent Line</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Line</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentLine()
     * @see #getConductingEquipment()
     * @generated
     */
    EReference getConductingEquipment_ParentLine();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentProcess <em>Parent Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Process</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConductingEquipment#getParentProcess()
     * @see #getConductingEquipment()
     * @generated
     */
    EReference getConductingEquipment_ParentProcess();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode <em>Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connectivity Node</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode
     * @generated
     */
    EClass getConnectivityNode();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getPathName <em>Path Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getPathName()
     * @see #getConnectivityNode()
     * @generated
     */
    EAttribute getConnectivityNode_PathName();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentBay <em>Parent Bay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Bay</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentBay()
     * @see #getConnectivityNode()
     * @generated
     */
    EReference getConnectivityNode_ParentBay();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getReferredByTerminal <em>Referred By Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Terminal</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getReferredByTerminal()
     * @see #getConnectivityNode()
     * @generated
     */
    EReference getConnectivityNode_ReferredByTerminal();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentLine <em>Parent Line</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Line</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ConnectivityNode#getParentLine()
     * @see #getConnectivityNode()
     * @generated
     */
    EReference getConnectivityNode_ParentLine();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Eq Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction
     * @generated
     */
    EClass getEqFunction();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentConductingEquipment <em>Parent Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentConductingEquipment()
     * @see #getEqFunction()
     * @generated
     */
    EReference getEqFunction_ParentConductingEquipment();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentGeneralEquipment <em>Parent General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent General Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentGeneralEquipment()
     * @see #getEqFunction()
     * @generated
     */
    EReference getEqFunction_ParentGeneralEquipment();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentPowerTransformer <em>Parent Power Transformer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Power Transformer</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentPowerTransformer()
     * @see #getEqFunction()
     * @generated
     */
    EReference getEqFunction_ParentPowerTransformer();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentSubEquipment <em>Parent Sub Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Sub Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentSubEquipment()
     * @see #getEqFunction()
     * @generated
     */
    EReference getEqFunction_ParentSubEquipment();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentTransformerWinding <em>Parent Transformer Winding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Transformer Winding</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentTransformerWinding()
     * @see #getEqFunction()
     * @generated
     */
    EReference getEqFunction_ParentTransformerWinding();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentTapChanger <em>Parent Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Tap Changer</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqFunction#getParentTapChanger()
     * @see #getEqFunction()
     * @generated
     */
    EReference getEqFunction_ParentTapChanger();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction <em>Eq Sub Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Eq Sub Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction
     * @generated
     */
    EClass getEqSubFunction();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction#getParentAbstractEqFuncSubFunc <em>Parent Abstract Eq Func Sub Func</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Abstract Eq Func Sub Func</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EqSubFunction#getParentAbstractEqFuncSubFunc()
     * @see #getEqSubFunction()
     * @generated
     */
    EReference getEqSubFunction_ParentAbstractEqFuncSubFunc();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Equipment <em>Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Equipment
     * @generated
     */
    EClass getEquipment();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer <em>Equipment Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Equipment Container</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer
     * @generated
     */
    EClass getEquipmentContainer();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getPowerTransformer <em>Power Transformer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Power Transformer</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getPowerTransformer()
     * @see #getEquipmentContainer()
     * @generated
     */
    EReference getEquipmentContainer_PowerTransformer();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getGeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>General Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.EquipmentContainer#getGeneralEquipment()
     * @see #getEquipmentContainer()
     * @generated
     */
    EReference getEquipmentContainer_GeneralEquipment();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function
     * @generated
     */
    EClass getFunction();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getType()
     * @see #getFunction()
     * @generated
     */
    EAttribute getFunction_Type();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentBay <em>Parent Bay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Bay</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentBay()
     * @see #getFunction()
     * @generated
     */
    EReference getFunction_ParentBay();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getConductingEquipment()
     * @see #getFunction()
     * @generated
     */
    EReference getFunction_ConductingEquipment();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentGeneralEquipmentContainer <em>Parent General Equipment Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent General Equipment Container</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentGeneralEquipmentContainer()
     * @see #getFunction()
     * @generated
     */
    EReference getFunction_ParentGeneralEquipmentContainer();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentSubstation <em>Parent Substation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Substation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentSubstation()
     * @see #getFunction()
     * @generated
     */
    EReference getFunction_ParentSubstation();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentVoltageLevel <em>Parent Voltage Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Voltage Level</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getParentVoltageLevel()
     * @see #getFunction()
     * @generated
     */
    EReference getFunction_ParentVoltageLevel();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getSubFunction <em>Sub Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getSubFunction()
     * @see #getFunction()
     * @generated
     */
    EReference getFunction_SubFunction();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getGeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>General Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Function#getGeneralEquipment()
     * @see #getFunction()
     * @generated
     */
    EReference getFunction_GeneralEquipment();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>General Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment
     * @generated
     */
    EClass getGeneralEquipment();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getType()
     * @see #getGeneralEquipment()
     * @generated
     */
    EAttribute getGeneralEquipment_Type();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentAbstractEqFuncSubFunc <em>Parent Abstract Eq Func Sub Func</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Abstract Eq Func Sub Func</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentAbstractEqFuncSubFunc()
     * @see #getGeneralEquipment()
     * @generated
     */
    EReference getGeneralEquipment_ParentAbstractEqFuncSubFunc();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Eq Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getEqFunction()
     * @see #getGeneralEquipment()
     * @generated
     */
    EReference getGeneralEquipment_EqFunction();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentEquipmentContainer <em>Parent Equipment Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Equipment Container</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentEquipmentContainer()
     * @see #getGeneralEquipment()
     * @generated
     */
    EReference getGeneralEquipment_ParentEquipmentContainer();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentFunction <em>Parent Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentFunction()
     * @see #getGeneralEquipment()
     * @generated
     */
    EReference getGeneralEquipment_ParentFunction();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentGeneralEquipmentContainer <em>Parent General Equipment Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent General Equipment Container</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentGeneralEquipmentContainer()
     * @see #getGeneralEquipment()
     * @generated
     */
    EReference getGeneralEquipment_ParentGeneralEquipmentContainer();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentSubFunction <em>Parent Sub Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Sub Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipment#getParentSubFunction()
     * @see #getGeneralEquipment()
     * @generated
     */
    EReference getGeneralEquipment_ParentSubFunction();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer <em>General Equipment Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>General Equipment Container</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer
     * @generated
     */
    EClass getGeneralEquipmentContainer();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getFunction()
     * @see #getGeneralEquipmentContainer()
     * @generated
     */
    EReference getGeneralEquipmentContainer_Function();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getGeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>General Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GeneralEquipmentContainer#getGeneralEquipment()
     * @see #getGeneralEquipmentContainer()
     * @generated
     */
    EReference getGeneralEquipmentContainer_GeneralEquipment();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode <em>LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode
     * @generated
     */
    EClass getLNode();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIedName <em>Ied Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ied Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getIedName()
     * @see #getLNode()
     * @generated
     */
    EAttribute getLNode_IedName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLdInst <em>Ld Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ld Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLdInst()
     * @see #getLNode()
     * @generated
     */
    EAttribute getLNode_LdInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnClass <em>Ln Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Class</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnClass()
     * @see #getLNode()
     * @generated
     */
    EAttribute getLNode_LnClass();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnInst <em>Ln Inst</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Inst</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnInst()
     * @see #getLNode()
     * @generated
     */
    EAttribute getLNode_LnInst();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnType <em>Ln Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ln Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getLnType()
     * @see #getLNode()
     * @generated
     */
    EAttribute getLNode_LnType();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getPrefix <em>Prefix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Prefix</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getPrefix()
     * @see #getLNode()
     * @generated
     */
    EAttribute getLNode_Prefix();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToAnyLN <em>Refers To Any LN</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Any LN</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getRefersToAnyLN()
     * @see #getLNode()
     * @generated
     */
    EReference getLNode_RefersToAnyLN();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getParentLNodeContainer <em>Parent LNode Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent LNode Container</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode#getParentLNodeContainer()
     * @see #getLNode()
     * @generated
     */
    EReference getLNode_ParentLNodeContainer();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer <em>LNode Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>LNode Container</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer
     * @generated
     */
    EClass getLNodeContainer();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode <em>LNode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>LNode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeContainer#getLNode()
     * @see #getLNodeContainer()
     * @generated
     */
    EReference getLNodeContainer_LNode();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint <em>Neutral Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Neutral Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint
     * @generated
     */
    EClass getNeutralPoint();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint#getParentTransformerWinding <em>Parent Transformer Winding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Transformer Winding</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.NeutralPoint#getParentTransformerWinding()
     * @see #getNeutralPoint()
     * @generated
     */
    EReference getNeutralPoint_ParentTransformerWinding();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Power System Resource</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerSystemResource
     * @generated
     */
    EClass getPowerSystemResource();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer <em>Power Transformer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Power Transformer</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer
     * @generated
     */
    EClass getPowerTransformer();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getType()
     * @see #getPowerTransformer()
     * @generated
     */
    EAttribute getPowerTransformer_Type();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Eq Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getEqFunction()
     * @see #getPowerTransformer()
     * @generated
     */
    EReference getPowerTransformer_EqFunction();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getParentEquipmentContainer <em>Parent Equipment Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Equipment Container</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getParentEquipmentContainer()
     * @see #getPowerTransformer()
     * @generated
     */
    EReference getPowerTransformer_ParentEquipmentContainer();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getSubEquipment <em>Sub Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getSubEquipment()
     * @see #getPowerTransformer()
     * @generated
     */
    EReference getPowerTransformer_SubEquipment();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getTransformerWinding <em>Transformer Winding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Transformer Winding</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PowerTransformer#getTransformerWinding()
     * @see #getPowerTransformer()
     * @generated
     */
    EReference getPowerTransformer_TransformerWinding();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment <em>Sub Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment
     * @generated
     */
    EClass getSubEquipment();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getPhase <em>Phase</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Phase</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getPhase()
     * @see #getSubEquipment()
     * @generated
     */
    EAttribute getSubEquipment_Phase();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getParentAbstractConductingEquipment <em>Parent Abstract Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Abstract Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getParentAbstractConductingEquipment()
     * @see #getSubEquipment()
     * @generated
     */
    EReference getSubEquipment_ParentAbstractConductingEquipment();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Eq Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getEqFunction()
     * @see #getSubEquipment()
     * @generated
     */
    EReference getSubEquipment_EqFunction();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getParentPowerTransformer <em>Parent Power Transformer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Power Transformer</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getParentPowerTransformer()
     * @see #getSubEquipment()
     * @generated
     */
    EReference getSubEquipment_ParentPowerTransformer();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getParentTapChanger <em>Parent Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Tap Changer</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubEquipment#getParentTapChanger()
     * @see #getSubEquipment()
     * @generated
     */
    EReference getSubEquipment_ParentTapChanger();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction <em>Sub Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sub Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction
     * @generated
     */
    EClass getSubFunction();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getType()
     * @see #getSubFunction()
     * @generated
     */
    EAttribute getSubFunction_Type();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getConductingEquipment <em>Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getConductingEquipment()
     * @see #getSubFunction()
     * @generated
     */
    EReference getSubFunction_ConductingEquipment();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getParentFunction <em>Parent Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getParentFunction()
     * @see #getSubFunction()
     * @generated
     */
    EReference getSubFunction_ParentFunction();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getGeneralEquipment <em>General Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>General Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getGeneralEquipment()
     * @see #getSubFunction()
     * @generated
     */
    EReference getSubFunction_GeneralEquipment();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getSubSubFunctions <em>Sub Sub Functions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Sub Functions</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getSubSubFunctions()
     * @see #getSubFunction()
     * @generated
     */
    EReference getSubFunction_SubSubFunctions();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getParentSubFunction <em>Parent Sub Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Sub Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SubFunction#getParentSubFunction()
     * @see #getSubFunction()
     * @generated
     */
    EReference getSubFunction_ParentSubFunction();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation <em>Substation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Substation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation
     * @generated
     */
    EClass getSubstation();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getFunction()
     * @see #getSubstation()
     * @generated
     */
    EReference getSubstation_Function();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getVoltageLevel <em>Voltage Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Voltage Level</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getVoltageLevel()
     * @see #getSubstation()
     * @generated
     */
    EReference getSubstation_VoltageLevel();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getParentProcess <em>Parent Process</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Process</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getParentProcess()
     * @see #getSubstation()
     * @generated
     */
    EReference getSubstation_ParentProcess();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getParentSCL <em>Parent SCL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent SCL</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Substation#getParentSCL()
     * @see #getSubstation()
     * @generated
     */
    EReference getSubstation_ParentSCL();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger <em>Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tap Changer</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger
     * @generated
     */
    EClass getTapChanger();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getType()
     * @see #getTapChanger()
     * @generated
     */
    EAttribute getTapChanger_Type();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Eq Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getEqFunction()
     * @see #getTapChanger()
     * @generated
     */
    EReference getTapChanger_EqFunction();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getSubEquipment <em>Sub Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getSubEquipment()
     * @see #getTapChanger()
     * @generated
     */
    EReference getTapChanger_SubEquipment();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getParentTransformerWinding <em>Parent Transformer Winding</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Transformer Winding</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TapChanger#getParentTransformerWinding()
     * @see #getTapChanger()
     * @generated
     */
    EReference getTapChanger_ParentTransformerWinding();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Terminal</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal
     * @generated
     */
    EClass getTerminal();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getBayName <em>Bay Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Bay Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getBayName()
     * @see #getTerminal()
     * @generated
     */
    EAttribute getTerminal_BayName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNodeName <em>CNode Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>CNode Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getCNodeName()
     * @see #getTerminal()
     * @generated
     */
    EAttribute getTerminal_CNodeName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getConnectivityNode <em>Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Connectivity Node</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getConnectivityNode()
     * @see #getTerminal()
     * @generated
     */
    EAttribute getTerminal_ConnectivityNode();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getProcessName <em>Process Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Process Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getProcessName()
     * @see #getTerminal()
     * @generated
     */
    EAttribute getTerminal_ProcessName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getSubstationName <em>Substation Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Substation Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getSubstationName()
     * @see #getTerminal()
     * @generated
     */
    EAttribute getTerminal_SubstationName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevelName <em>Voltage Level Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Voltage Level Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getVoltageLevelName()
     * @see #getTerminal()
     * @generated
     */
    EAttribute getTerminal_VoltageLevelName();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getParentAbstractConductingEquipment <em>Parent Abstract Conducting Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Abstract Conducting Equipment</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getParentAbstractConductingEquipment()
     * @see #getTerminal()
     * @generated
     */
    EReference getTerminal_ParentAbstractConductingEquipment();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getRefersToConnectivityNode <em>Refers To Connectivity Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To Connectivity Node</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getRefersToConnectivityNode()
     * @see #getTerminal()
     * @generated
     */
    EReference getTerminal_RefersToConnectivityNode();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getName()
     * @see #getTerminal()
     * @generated
     */
    EAttribute getTerminal_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getLineName <em>Line Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Terminal#getLineName()
     * @see #getTerminal()
     * @generated
     */
    EAttribute getTerminal_LineName();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding <em>Transformer Winding</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transformer Winding</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding
     * @generated
     */
    EClass getTransformerWinding();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getType()
     * @see #getTransformerWinding()
     * @generated
     */
    EAttribute getTransformerWinding_Type();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getEqFunction <em>Eq Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Eq Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getEqFunction()
     * @see #getTransformerWinding()
     * @generated
     */
    EReference getTransformerWinding_EqFunction();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getNeutralPoint <em>Neutral Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Neutral Point</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getNeutralPoint()
     * @see #getTransformerWinding()
     * @generated
     */
    EReference getTransformerWinding_NeutralPoint();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getParentPowerTransformer <em>Parent Power Transformer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Power Transformer</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getParentPowerTransformer()
     * @see #getTransformerWinding()
     * @generated
     */
    EReference getTransformerWinding_ParentPowerTransformer();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getTapChanger <em>Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Tap Changer</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.TransformerWinding#getTapChanger()
     * @see #getTransformerWinding()
     * @generated
     */
    EReference getTransformerWinding_TapChanger();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage <em>Voltage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Voltage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage
     * @generated
     */
    EClass getVoltage();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentLine <em>Parent Line</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Line</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentLine()
     * @see #getVoltage()
     * @generated
     */
    EReference getVoltage_ParentLine();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentVoltageLevel <em>Parent Voltage Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Voltage Level</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Voltage#getParentVoltageLevel()
     * @see #getVoltage()
     * @generated
     */
    EReference getVoltage_ParentVoltageLevel();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel <em>Voltage Level</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for class '<em>Voltage Level</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel
     * @generated
     */
    EClass getVoltageLevel();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNomFreq <em>Nom Freq</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nom Freq</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNomFreq()
     * @see #getVoltageLevel()
     * @generated
     */
    EAttribute getVoltageLevel_NomFreq();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNumPhases <em>Num Phases</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Num Phases</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getNumPhases()
     * @see #getVoltageLevel()
     * @generated
     */
    EAttribute getVoltageLevel_NumPhases();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getBay <em>Bay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Bay</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getBay()
     * @see #getVoltageLevel()
     * @generated
     */
    EReference getVoltageLevel_Bay();

    /**
     * Returns the meta object for the containment reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Function</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getFunction()
     * @see #getVoltageLevel()
     * @generated
     */
    EReference getVoltageLevel_Function();

    /**
     * Returns the meta object for the container reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getParentSubstation <em>Parent Substation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Substation</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getParentSubstation()
     * @see #getVoltageLevel()
     * @generated
     */
    EReference getVoltageLevel_ParentSubstation();

    /**
     * Returns the meta object for the containment reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage <em>Voltage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Voltage</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.VoltageLevel#getVoltage()
     * @see #getVoltageLevel()
     * @generated
     */
    EReference getVoltageLevel_Voltage();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ExplicitLinkResolver <em>Explicit Link Resolver</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for class '<em>Explicit Link Resolver</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ExplicitLinkResolver
     * @generated
     */
    EClass getExplicitLinkResolver();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject <em>Abstract Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abstract Data Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject
     * @generated
     */
    EClass getAbstractDataObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getName()
     * @see #getAbstractDataObject()
     * @generated
     */
    EAttribute getAbstractDataObject_Name();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getType()
     * @see #getAbstractDataObject()
     * @generated
     */
    EAttribute getAbstractDataObject_Type();

    /**
     * Returns the meta object for the reference '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getRefersToDOType <em>Refers To DO Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Refers To DO Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getRefersToDOType()
     * @see #getAbstractDataObject()
     * @generated
     */
    EReference getAbstractDataObject_RefersToDOType();

    /**
     * Returns the meta object for the reference list '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getReferredByExtRef <em>Referred By Ext Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Referred By Ext Ref</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataObject#getReferredByExtRef()
     * @see #getAbstractDataObject()
     * @generated
     */
    EReference getAbstractDataObject_ReferredByExtRef();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Object</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject
     * @generated
     */
    EClass getSclObject();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject#getLineNumber <em>Line Number</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line Number</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SclObject#getLineNumber()
     * @see #getSclObject()
     * @generated
     */
    EAttribute getSclObject_LineNumber();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.UnNaming <em>Un Naming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Un Naming</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.UnNaming
     * @generated
     */
    EClass getUnNaming();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceYesNo <em>Service Yes No</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Yes No</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceYesNo
     * @generated
     */
    EClass getServiceYesNo();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithOptionalMax <em>Service With Optional Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service With Optional Max</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithOptionalMax
     * @generated
     */
    EClass getServiceWithOptionalMax();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithOptionalMax#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithOptionalMax#getMax()
     * @see #getServiceWithOptionalMax()
     * @generated
     */
    EAttribute getServiceWithOptionalMax_Max();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxNonZero <em>Service With Max Non Zero</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service With Max Non Zero</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxNonZero
     * @generated
     */
    EClass getServiceWithMaxNonZero();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxNonZero#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxNonZero#getMax()
     * @see #getServiceWithMaxNonZero()
     * @generated
     */
    EAttribute getServiceWithMaxNonZero_Max();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl <em>Service Conf Report Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Conf Report Control</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl
     * @generated
     */
    EClass getServiceConfReportControl();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufMode <em>Buf Mode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buf Mode</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufMode()
     * @see #getServiceConfReportControl()
     * @generated
     */
    EAttribute getServiceConfReportControl_BufMode();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufConf <em>Buf Conf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Buf Conf</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getBufConf()
     * @see #getServiceConfReportControl()
     * @generated
     */
    EAttribute getServiceConfReportControl_BufConf();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getMaxBuf <em>Max Buf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Buf</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceConfReportControl#getMaxBuf()
     * @see #getServiceConfReportControl()
     * @generated
     */
    EAttribute getServiceConfReportControl_MaxBuf();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes <em>Service With Max And Max Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service With Max And Max Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes
     * @generated
     */
    EClass getServiceWithMaxAndMaxAttributes();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes#getMaxAttributes <em>Max Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Attributes</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndMaxAttributes#getMaxAttributes()
     * @see #getServiceWithMaxAndMaxAttributes()
     * @generated
     */
    EAttribute getServiceWithMaxAndMaxAttributes_MaxAttributes();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify <em>Service With Max And Modify</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service With Max And Modify</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify
     * @generated
     */
    EClass getServiceWithMaxAndModify();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify#getModify <em>Modify</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modify</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceWithMaxAndModify#getModify()
     * @see #getServiceWithMaxAndModify()
     * @generated
     */
    EAttribute getServiceWithMaxAndModify_Modify();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceForConfDataSet <em>Service For Conf Data Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service For Conf Data Set</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceForConfDataSet
     * @generated
     */
    EClass getServiceForConfDataSet();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceForConfDataSet#getModify <em>Modify</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modify</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceForConfDataSet#getModify()
     * @see #getServiceForConfDataSet()
     * @generated
     */
    EAttribute getServiceForConfDataSet_Modify();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert <em>Cert</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cert</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert
     * @generated
     */
    EClass getCert();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getCommonName <em>Common Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Common Name</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getCommonName()
     * @see #getCert()
     * @generated
     */
    EAttribute getCert_CommonName();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getIdHierarchy <em>Id Hierarchy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id Hierarchy</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.Cert#getIdHierarchy()
     * @see #getCert()
     * @generated
     */
    EAttribute getCert_IdHierarchy();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit <em>Value With Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Value With Unit</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit
     * @generated
     */
    EClass getValueWithUnit();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit#getValue()
     * @see #getValueWithUnit()
     * @generated
     */
    EAttribute getValueWithUnit_Value();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit#getMultiplier <em>Multiplier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiplier</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit#getMultiplier()
     * @see #getValueWithUnit()
     * @generated
     */
    EAttribute getValueWithUnit_Multiplier();

    /**
     * Returns the meta object for the attribute '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unit</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValueWithUnit#getUnit()
     * @see #getValueWithUnit()
     * @generated
     */
    EAttribute getValueWithUnit_Unit();

    /**
     * Returns the meta object for class '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInSec <em>Duration In Sec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Duration In Sec</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.DurationInSec
     * @generated
     */
    EClass getDurationInSec();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.AssociationKindEnum <em>Association Kind Enum</em>}'.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Association Kind Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.AssociationKindEnum
     * @generated
     */
    EEnum getAssociationKindEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum <em>FC Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>FC Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.FCEnum
     * @generated
     */
    EEnum getFCEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum <em>GSE Control Type Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>GSE Control Type Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.GSEControlTypeEnum
     * @generated
     */
    EEnum getGSEControlTypeEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PhaseEnum <em>Phase Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Phase Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PhaseEnum
     * @generated
     */
    EEnum getPhaseEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum <em>Predefined Type Of Security Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Predefined Type Of Security Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.PredefinedTypeOfSecurityEnum
     * @generated
     */
    EEnum getPredefinedTypeOfSecurityEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVDeliveryEnum <em>SMV Delivery Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>SMV Delivery Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SMVDeliveryEnum
     * @generated
     */
    EEnum getSMVDeliveryEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum <em>Service Settings Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Service Settings Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsEnum
     * @generated
     */
    EEnum getServiceSettingsEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum <em>Service Settings No Dyn Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Service Settings No Dyn Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceSettingsNoDynEnum
     * @generated
     */
    EEnum getServiceSettingsNoDynEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType <em>Service Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Service Type</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ServiceType
     * @generated
     */
    EEnum getServiceType();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod <em>Smp Mod</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Smp Mod</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.SmpMod
     * @generated
     */
    EEnum getSmpMod();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum <em>Unit Multiplier Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Unit Multiplier Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.UnitMultiplierEnum
     * @generated
     */
    EEnum getUnitMultiplierEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum <em>Val Kind Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Val Kind Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum
     * @generated
     */
    EEnum getValKindEnum();

    /**
     * Returns the meta object for enum '{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.bufModeEnum <em>buf Mode Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>buf Mode Enum</em>'.
     * @see fr.centralesupelec.edf.riseclipse.iec61850.scl.bufModeEnum
     * @generated
     */
    EEnum getbufModeEnum();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SclFactory getSclFactory();

} //SclPackage
