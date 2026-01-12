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
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import fr.centralesupelec.edf.riseclipse.iec61850.asd.AsdPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DAS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.DOS;
import fr.centralesupelec.edf.riseclipse.iec61850.asd.SDS;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AccessPoint;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.IED;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LDevice;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNode;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.LNodeType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Label;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Labels;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Naming;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labels</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentAbstractDataAttribute <em>Parent Abstract Data Attribute</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentDAI <em>Parent DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentDAType <em>Parent DA Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentDOI <em>Parent DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentDOType <em>Parent DO Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentLNode <em>Parent LNode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentLNodeType <em>Parent LNode Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentSDI <em>Parent SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentAccessPoint <em>Parent Access Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentAnyLN <em>Parent Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentIED <em>Parent IED</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentLDevice <em>Parent LDevice</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentNaming <em>Parent Naming</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentDAS <em>Parent DAS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentDOS <em>Parent DOS</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.LabelsImpl#getParentSDS <em>Parent SDS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelsImpl extends UnNamingImpl implements Labels {
    /**
     * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabel()
     * @generated
     * @ordered
     */
    protected EList< Label > label;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LabelsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getLabels();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Label > getLabel() {
        if( label == null ) {
            label = new EObjectContainmentWithInverseEList.Unsettable< Label >( Label.class, this,
                    SclPackage.LABELS__LABEL, SclPackage.LABEL__PARENT_LABELS );
        }
        return label;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLabel() {
        if( label != null ) {
            ( ( InternalEList.Unsettable< ? > ) label ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLabel() {
        return label != null && ( ( InternalEList.Unsettable< ? > ) label ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractDataAttribute getParentAbstractDataAttribute() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_ABSTRACT_DATA_ATTRIBUTE ) {
            return null;
        }
        return ( AbstractDataAttribute ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAbstractDataAttribute( AbstractDataAttribute newParentAbstractDataAttribute,
            NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAbstractDataAttribute,
                SclPackage.LABELS__PARENT_ABSTRACT_DATA_ATTRIBUTE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAbstractDataAttribute( AbstractDataAttribute newParentAbstractDataAttribute ) {
        if( newParentAbstractDataAttribute != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_ABSTRACT_DATA_ATTRIBUTE
                        && newParentAbstractDataAttribute != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAbstractDataAttribute ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentAbstractDataAttribute != null ) {
                msgs = ( ( InternalEObject ) newParentAbstractDataAttribute ).eInverseAdd( this,
                        SclPackage.ABSTRACT_DATA_ATTRIBUTE__LABELS, AbstractDataAttribute.class, msgs );
            }
            msgs = basicSetParentAbstractDataAttribute( newParentAbstractDataAttribute, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_ABSTRACT_DATA_ATTRIBUTE,
                    newParentAbstractDataAttribute, newParentAbstractDataAttribute ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAI getParentDAI() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_DAI ) {
            return null;
        }
        return ( DAI ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDAI( DAI newParentDAI, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDAI, SclPackage.LABELS__PARENT_DAI, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDAI( DAI newParentDAI ) {
        if( newParentDAI != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_DAI && newParentDAI != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDAI ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDAI != null ) {
                msgs = ( ( InternalEObject ) newParentDAI ).eInverseAdd( this, SclPackage.DAI__LABELS, DAI.class,
                        msgs );
            }
            msgs = basicSetParentDAI( newParentDAI, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_DAI, newParentDAI,
                    newParentDAI ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAType getParentDAType() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_DA_TYPE ) {
            return null;
        }
        return ( DAType ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDAType( DAType newParentDAType, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDAType, SclPackage.LABELS__PARENT_DA_TYPE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDAType( DAType newParentDAType ) {
        if( newParentDAType != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_DA_TYPE && newParentDAType != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDAType ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDAType != null ) {
                msgs = ( ( InternalEObject ) newParentDAType ).eInverseAdd( this, SclPackage.DA_TYPE__LABELS,
                        DAType.class, msgs );
            }
            msgs = basicSetParentDAType( newParentDAType, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_DA_TYPE, newParentDAType,
                    newParentDAType ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOI getParentDOI() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_DOI ) {
            return null;
        }
        return ( DOI ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDOI( DOI newParentDOI, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDOI, SclPackage.LABELS__PARENT_DOI, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDOI( DOI newParentDOI ) {
        if( newParentDOI != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_DOI && newParentDOI != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDOI ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDOI != null ) {
                msgs = ( ( InternalEObject ) newParentDOI ).eInverseAdd( this, SclPackage.DOI__LABELS, DOI.class,
                        msgs );
            }
            msgs = basicSetParentDOI( newParentDOI, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_DOI, newParentDOI,
                    newParentDOI ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOType getParentDOType() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_DO_TYPE ) {
            return null;
        }
        return ( DOType ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDOType( DOType newParentDOType, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDOType, SclPackage.LABELS__PARENT_DO_TYPE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDOType( DOType newParentDOType ) {
        if( newParentDOType != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_DO_TYPE && newParentDOType != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDOType ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDOType != null ) {
                msgs = ( ( InternalEObject ) newParentDOType ).eInverseAdd( this, SclPackage.DO_TYPE__LABELS,
                        DOType.class, msgs );
            }
            msgs = basicSetParentDOType( newParentDOType, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_DO_TYPE, newParentDOType,
                    newParentDOType ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNode getParentLNode() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_LNODE ) {
            return null;
        }
        return ( LNode ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLNode( LNode newParentLNode, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLNode, SclPackage.LABELS__PARENT_LNODE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLNode( LNode newParentLNode ) {
        if( newParentLNode != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_LNODE && newParentLNode != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLNode ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentLNode != null ) {
                msgs = ( ( InternalEObject ) newParentLNode ).eInverseAdd( this, SclPackage.LNODE__LABELS, LNode.class,
                        msgs );
            }
            msgs = basicSetParentLNode( newParentLNode, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_LNODE, newParentLNode,
                    newParentLNode ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LNodeType getParentLNodeType() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_LNODE_TYPE ) {
            return null;
        }
        return ( LNodeType ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLNodeType( LNodeType newParentLNodeType, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLNodeType, SclPackage.LABELS__PARENT_LNODE_TYPE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLNodeType( LNodeType newParentLNodeType ) {
        if( newParentLNodeType != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_LNODE_TYPE && newParentLNodeType != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLNodeType ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentLNodeType != null ) {
                msgs = ( ( InternalEObject ) newParentLNodeType ).eInverseAdd( this, SclPackage.LNODE_TYPE__LABELS,
                        LNodeType.class, msgs );
            }
            msgs = basicSetParentLNodeType( newParentLNodeType, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_LNODE_TYPE,
                    newParentLNodeType, newParentLNodeType ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SDI getParentSDI() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_SDI ) {
            return null;
        }
        return ( SDI ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSDI( SDI newParentSDI, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSDI, SclPackage.LABELS__PARENT_SDI, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSDI( SDI newParentSDI ) {
        if( newParentSDI != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_SDI && newParentSDI != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSDI ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSDI != null ) {
                msgs = ( ( InternalEObject ) newParentSDI ).eInverseAdd( this, SclPackage.SDI__LABELS, SDI.class,
                        msgs );
            }
            msgs = basicSetParentSDI( newParentSDI, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_SDI, newParentSDI,
                    newParentSDI ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccessPoint getParentAccessPoint() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_ACCESS_POINT ) {
            return null;
        }
        return ( AccessPoint ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAccessPoint( AccessPoint newParentAccessPoint, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAccessPoint, SclPackage.LABELS__PARENT_ACCESS_POINT,
                msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAccessPoint( AccessPoint newParentAccessPoint ) {
        if( newParentAccessPoint != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_ACCESS_POINT
                        && newParentAccessPoint != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAccessPoint ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentAccessPoint != null ) {
                msgs = ( ( InternalEObject ) newParentAccessPoint ).eInverseAdd( this, SclPackage.ACCESS_POINT__LABELS,
                        AccessPoint.class, msgs );
            }
            msgs = basicSetParentAccessPoint( newParentAccessPoint, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_ACCESS_POINT,
                    newParentAccessPoint, newParentAccessPoint ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnyLN getParentAnyLN() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_ANY_LN ) {
            return null;
        }
        return ( AnyLN ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentAnyLN( AnyLN newParentAnyLN, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAnyLN, SclPackage.LABELS__PARENT_ANY_LN, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAnyLN( AnyLN newParentAnyLN ) {
        if( newParentAnyLN != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_ANY_LN && newParentAnyLN != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAnyLN ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentAnyLN != null ) {
                msgs = ( ( InternalEObject ) newParentAnyLN ).eInverseAdd( this, SclPackage.ANY_LN__LABELS, AnyLN.class,
                        msgs );
            }
            msgs = basicSetParentAnyLN( newParentAnyLN, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_ANY_LN, newParentAnyLN,
                    newParentAnyLN ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IED getParentIED() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_IED ) {
            return null;
        }
        return ( IED ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentIED( IED newParentIED, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentIED, SclPackage.LABELS__PARENT_IED, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentIED( IED newParentIED ) {
        if( newParentIED != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_IED && newParentIED != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentIED ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentIED != null ) {
                msgs = ( ( InternalEObject ) newParentIED ).eInverseAdd( this, SclPackage.IED__LABELS, IED.class,
                        msgs );
            }
            msgs = basicSetParentIED( newParentIED, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_IED, newParentIED,
                    newParentIED ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LDevice getParentLDevice() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_LDEVICE ) {
            return null;
        }
        return ( LDevice ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentLDevice( LDevice newParentLDevice, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentLDevice, SclPackage.LABELS__PARENT_LDEVICE, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentLDevice( LDevice newParentLDevice ) {
        if( newParentLDevice != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_LDEVICE && newParentLDevice != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentLDevice ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentLDevice != null ) {
                msgs = ( ( InternalEObject ) newParentLDevice ).eInverseAdd( this, SclPackage.LDEVICE__LABELS,
                        LDevice.class, msgs );
            }
            msgs = basicSetParentLDevice( newParentLDevice, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_LDEVICE, newParentLDevice,
                    newParentLDevice ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Naming getParentNaming() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_NAMING ) {
            return null;
        }
        return ( Naming ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentNaming( Naming newParentNaming, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentNaming, SclPackage.LABELS__PARENT_NAMING, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentNaming( Naming newParentNaming ) {
        if( newParentNaming != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_NAMING && newParentNaming != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentNaming ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentNaming != null ) {
                msgs = ( ( InternalEObject ) newParentNaming ).eInverseAdd( this, SclPackage.NAMING__LABELS,
                        Naming.class, msgs );
            }
            msgs = basicSetParentNaming( newParentNaming, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_NAMING, newParentNaming,
                    newParentNaming ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DAS getParentDAS() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_DAS ) {
            return null;
        }
        return ( DAS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDAS( DAS newParentDAS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDAS, SclPackage.LABELS__PARENT_DAS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDAS( DAS newParentDAS ) {
        if( newParentDAS != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_DAS && newParentDAS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDAS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDAS != null ) {
                msgs = ( ( InternalEObject ) newParentDAS ).eInverseAdd( this, AsdPackage.DAS__LABELS, DAS.class,
                        msgs );
            }
            msgs = basicSetParentDAS( newParentDAS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_DAS, newParentDAS,
                    newParentDAS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOS getParentDOS() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_DOS ) {
            return null;
        }
        return ( DOS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentDOS( DOS newParentDOS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDOS, SclPackage.LABELS__PARENT_DOS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentDOS( DOS newParentDOS ) {
        if( newParentDOS != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_DOS && newParentDOS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDOS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDOS != null ) {
                msgs = ( ( InternalEObject ) newParentDOS ).eInverseAdd( this, AsdPackage.DOS__LABELS, DOS.class,
                        msgs );
            }
            msgs = basicSetParentDOS( newParentDOS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_DOS, newParentDOS,
                    newParentDOS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SDS getParentSDS() {
        if( eContainerFeatureID() != SclPackage.LABELS__PARENT_SDS ) {
            return null;
        }
        return ( SDS ) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParentSDS( SDS newParentSDS, NotificationChain msgs ) {
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSDS, SclPackage.LABELS__PARENT_SDS, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentSDS( SDS newParentSDS ) {
        if( newParentSDS != eInternalContainer()
                || ( eContainerFeatureID() != SclPackage.LABELS__PARENT_SDS && newParentSDS != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSDS ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSDS != null ) {
                msgs = ( ( InternalEObject ) newParentSDS ).eInverseAdd( this, AsdPackage.SDS__LABELS, SDS.class,
                        msgs );
            }
            msgs = basicSetParentSDS( newParentSDS, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.LABELS__PARENT_SDS, newParentSDS,
                    newParentSDS ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.LABELS__LABEL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLabel() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.LABELS__PARENT_ABSTRACT_DATA_ATTRIBUTE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentAbstractDataAttribute( ( AbstractDataAttribute ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_DAI:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDAI( ( DAI ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_DA_TYPE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDAType( ( DAType ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_DOI:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDOI( ( DOI ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_DO_TYPE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDOType( ( DOType ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_LNODE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentLNode( ( LNode ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_LNODE_TYPE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentLNodeType( ( LNodeType ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_SDI:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSDI( ( SDI ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_ACCESS_POINT:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentAccessPoint( ( AccessPoint ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_ANY_LN:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentAnyLN( ( AnyLN ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_IED:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentIED( ( IED ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_LDEVICE:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentLDevice( ( LDevice ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_NAMING:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentNaming( ( Naming ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_DAS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDAS( ( DAS ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_DOS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDOS( ( DOS ) otherEnd, msgs );
        case SclPackage.LABELS__PARENT_SDS:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSDS( ( SDS ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case SclPackage.LABELS__LABEL:
            return ( ( InternalEList< ? > ) getLabel() ).basicRemove( otherEnd, msgs );
        case SclPackage.LABELS__PARENT_ABSTRACT_DATA_ATTRIBUTE:
            return basicSetParentAbstractDataAttribute( null, msgs );
        case SclPackage.LABELS__PARENT_DAI:
            return basicSetParentDAI( null, msgs );
        case SclPackage.LABELS__PARENT_DA_TYPE:
            return basicSetParentDAType( null, msgs );
        case SclPackage.LABELS__PARENT_DOI:
            return basicSetParentDOI( null, msgs );
        case SclPackage.LABELS__PARENT_DO_TYPE:
            return basicSetParentDOType( null, msgs );
        case SclPackage.LABELS__PARENT_LNODE:
            return basicSetParentLNode( null, msgs );
        case SclPackage.LABELS__PARENT_LNODE_TYPE:
            return basicSetParentLNodeType( null, msgs );
        case SclPackage.LABELS__PARENT_SDI:
            return basicSetParentSDI( null, msgs );
        case SclPackage.LABELS__PARENT_ACCESS_POINT:
            return basicSetParentAccessPoint( null, msgs );
        case SclPackage.LABELS__PARENT_ANY_LN:
            return basicSetParentAnyLN( null, msgs );
        case SclPackage.LABELS__PARENT_IED:
            return basicSetParentIED( null, msgs );
        case SclPackage.LABELS__PARENT_LDEVICE:
            return basicSetParentLDevice( null, msgs );
        case SclPackage.LABELS__PARENT_NAMING:
            return basicSetParentNaming( null, msgs );
        case SclPackage.LABELS__PARENT_DAS:
            return basicSetParentDAS( null, msgs );
        case SclPackage.LABELS__PARENT_DOS:
            return basicSetParentDOS( null, msgs );
        case SclPackage.LABELS__PARENT_SDS:
            return basicSetParentSDS( null, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature( NotificationChain msgs ) {
        switch( eContainerFeatureID() ) {
        case SclPackage.LABELS__PARENT_ABSTRACT_DATA_ATTRIBUTE:
            return eInternalContainer().eInverseRemove( this, SclPackage.ABSTRACT_DATA_ATTRIBUTE__LABELS,
                    AbstractDataAttribute.class, msgs );
        case SclPackage.LABELS__PARENT_DAI:
            return eInternalContainer().eInverseRemove( this, SclPackage.DAI__LABELS, DAI.class, msgs );
        case SclPackage.LABELS__PARENT_DA_TYPE:
            return eInternalContainer().eInverseRemove( this, SclPackage.DA_TYPE__LABELS, DAType.class, msgs );
        case SclPackage.LABELS__PARENT_DOI:
            return eInternalContainer().eInverseRemove( this, SclPackage.DOI__LABELS, DOI.class, msgs );
        case SclPackage.LABELS__PARENT_DO_TYPE:
            return eInternalContainer().eInverseRemove( this, SclPackage.DO_TYPE__LABELS, DOType.class, msgs );
        case SclPackage.LABELS__PARENT_LNODE:
            return eInternalContainer().eInverseRemove( this, SclPackage.LNODE__LABELS, LNode.class, msgs );
        case SclPackage.LABELS__PARENT_LNODE_TYPE:
            return eInternalContainer().eInverseRemove( this, SclPackage.LNODE_TYPE__LABELS, LNodeType.class, msgs );
        case SclPackage.LABELS__PARENT_SDI:
            return eInternalContainer().eInverseRemove( this, SclPackage.SDI__LABELS, SDI.class, msgs );
        case SclPackage.LABELS__PARENT_ACCESS_POINT:
            return eInternalContainer().eInverseRemove( this, SclPackage.ACCESS_POINT__LABELS, AccessPoint.class,
                    msgs );
        case SclPackage.LABELS__PARENT_ANY_LN:
            return eInternalContainer().eInverseRemove( this, SclPackage.ANY_LN__LABELS, AnyLN.class, msgs );
        case SclPackage.LABELS__PARENT_IED:
            return eInternalContainer().eInverseRemove( this, SclPackage.IED__LABELS, IED.class, msgs );
        case SclPackage.LABELS__PARENT_LDEVICE:
            return eInternalContainer().eInverseRemove( this, SclPackage.LDEVICE__LABELS, LDevice.class, msgs );
        case SclPackage.LABELS__PARENT_NAMING:
            return eInternalContainer().eInverseRemove( this, SclPackage.NAMING__LABELS, Naming.class, msgs );
        case SclPackage.LABELS__PARENT_DAS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DAS__LABELS, DAS.class, msgs );
        case SclPackage.LABELS__PARENT_DOS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.DOS__LABELS, DOS.class, msgs );
        case SclPackage.LABELS__PARENT_SDS:
            return eInternalContainer().eInverseRemove( this, AsdPackage.SDS__LABELS, SDS.class, msgs );
        }
        return super.eBasicRemoveFromContainerFeature( msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case SclPackage.LABELS__LABEL:
            return getLabel();
        case SclPackage.LABELS__PARENT_ABSTRACT_DATA_ATTRIBUTE:
            return getParentAbstractDataAttribute();
        case SclPackage.LABELS__PARENT_DAI:
            return getParentDAI();
        case SclPackage.LABELS__PARENT_DA_TYPE:
            return getParentDAType();
        case SclPackage.LABELS__PARENT_DOI:
            return getParentDOI();
        case SclPackage.LABELS__PARENT_DO_TYPE:
            return getParentDOType();
        case SclPackage.LABELS__PARENT_LNODE:
            return getParentLNode();
        case SclPackage.LABELS__PARENT_LNODE_TYPE:
            return getParentLNodeType();
        case SclPackage.LABELS__PARENT_SDI:
            return getParentSDI();
        case SclPackage.LABELS__PARENT_ACCESS_POINT:
            return getParentAccessPoint();
        case SclPackage.LABELS__PARENT_ANY_LN:
            return getParentAnyLN();
        case SclPackage.LABELS__PARENT_IED:
            return getParentIED();
        case SclPackage.LABELS__PARENT_LDEVICE:
            return getParentLDevice();
        case SclPackage.LABELS__PARENT_NAMING:
            return getParentNaming();
        case SclPackage.LABELS__PARENT_DAS:
            return getParentDAS();
        case SclPackage.LABELS__PARENT_DOS:
            return getParentDOS();
        case SclPackage.LABELS__PARENT_SDS:
            return getParentSDS();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case SclPackage.LABELS__LABEL:
            getLabel().clear();
            getLabel().addAll( ( Collection< ? extends Label > ) newValue );
            return;
        case SclPackage.LABELS__PARENT_ABSTRACT_DATA_ATTRIBUTE:
            setParentAbstractDataAttribute( ( AbstractDataAttribute ) newValue );
            return;
        case SclPackage.LABELS__PARENT_DAI:
            setParentDAI( ( DAI ) newValue );
            return;
        case SclPackage.LABELS__PARENT_DA_TYPE:
            setParentDAType( ( DAType ) newValue );
            return;
        case SclPackage.LABELS__PARENT_DOI:
            setParentDOI( ( DOI ) newValue );
            return;
        case SclPackage.LABELS__PARENT_DO_TYPE:
            setParentDOType( ( DOType ) newValue );
            return;
        case SclPackage.LABELS__PARENT_LNODE:
            setParentLNode( ( LNode ) newValue );
            return;
        case SclPackage.LABELS__PARENT_LNODE_TYPE:
            setParentLNodeType( ( LNodeType ) newValue );
            return;
        case SclPackage.LABELS__PARENT_SDI:
            setParentSDI( ( SDI ) newValue );
            return;
        case SclPackage.LABELS__PARENT_ACCESS_POINT:
            setParentAccessPoint( ( AccessPoint ) newValue );
            return;
        case SclPackage.LABELS__PARENT_ANY_LN:
            setParentAnyLN( ( AnyLN ) newValue );
            return;
        case SclPackage.LABELS__PARENT_IED:
            setParentIED( ( IED ) newValue );
            return;
        case SclPackage.LABELS__PARENT_LDEVICE:
            setParentLDevice( ( LDevice ) newValue );
            return;
        case SclPackage.LABELS__PARENT_NAMING:
            setParentNaming( ( Naming ) newValue );
            return;
        case SclPackage.LABELS__PARENT_DAS:
            setParentDAS( ( DAS ) newValue );
            return;
        case SclPackage.LABELS__PARENT_DOS:
            setParentDOS( ( DOS ) newValue );
            return;
        case SclPackage.LABELS__PARENT_SDS:
            setParentSDS( ( SDS ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case SclPackage.LABELS__LABEL:
            unsetLabel();
            return;
        case SclPackage.LABELS__PARENT_ABSTRACT_DATA_ATTRIBUTE:
            setParentAbstractDataAttribute( ( AbstractDataAttribute ) null );
            return;
        case SclPackage.LABELS__PARENT_DAI:
            setParentDAI( ( DAI ) null );
            return;
        case SclPackage.LABELS__PARENT_DA_TYPE:
            setParentDAType( ( DAType ) null );
            return;
        case SclPackage.LABELS__PARENT_DOI:
            setParentDOI( ( DOI ) null );
            return;
        case SclPackage.LABELS__PARENT_DO_TYPE:
            setParentDOType( ( DOType ) null );
            return;
        case SclPackage.LABELS__PARENT_LNODE:
            setParentLNode( ( LNode ) null );
            return;
        case SclPackage.LABELS__PARENT_LNODE_TYPE:
            setParentLNodeType( ( LNodeType ) null );
            return;
        case SclPackage.LABELS__PARENT_SDI:
            setParentSDI( ( SDI ) null );
            return;
        case SclPackage.LABELS__PARENT_ACCESS_POINT:
            setParentAccessPoint( ( AccessPoint ) null );
            return;
        case SclPackage.LABELS__PARENT_ANY_LN:
            setParentAnyLN( ( AnyLN ) null );
            return;
        case SclPackage.LABELS__PARENT_IED:
            setParentIED( ( IED ) null );
            return;
        case SclPackage.LABELS__PARENT_LDEVICE:
            setParentLDevice( ( LDevice ) null );
            return;
        case SclPackage.LABELS__PARENT_NAMING:
            setParentNaming( ( Naming ) null );
            return;
        case SclPackage.LABELS__PARENT_DAS:
            setParentDAS( ( DAS ) null );
            return;
        case SclPackage.LABELS__PARENT_DOS:
            setParentDOS( ( DOS ) null );
            return;
        case SclPackage.LABELS__PARENT_SDS:
            setParentSDS( ( SDS ) null );
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case SclPackage.LABELS__LABEL:
            return isSetLabel();
        case SclPackage.LABELS__PARENT_ABSTRACT_DATA_ATTRIBUTE:
            return getParentAbstractDataAttribute() != null;
        case SclPackage.LABELS__PARENT_DAI:
            return getParentDAI() != null;
        case SclPackage.LABELS__PARENT_DA_TYPE:
            return getParentDAType() != null;
        case SclPackage.LABELS__PARENT_DOI:
            return getParentDOI() != null;
        case SclPackage.LABELS__PARENT_DO_TYPE:
            return getParentDOType() != null;
        case SclPackage.LABELS__PARENT_LNODE:
            return getParentLNode() != null;
        case SclPackage.LABELS__PARENT_LNODE_TYPE:
            return getParentLNodeType() != null;
        case SclPackage.LABELS__PARENT_SDI:
            return getParentSDI() != null;
        case SclPackage.LABELS__PARENT_ACCESS_POINT:
            return getParentAccessPoint() != null;
        case SclPackage.LABELS__PARENT_ANY_LN:
            return getParentAnyLN() != null;
        case SclPackage.LABELS__PARENT_IED:
            return getParentIED() != null;
        case SclPackage.LABELS__PARENT_LDEVICE:
            return getParentLDevice() != null;
        case SclPackage.LABELS__PARENT_NAMING:
            return getParentNaming() != null;
        case SclPackage.LABELS__PARENT_DAS:
            return getParentDAS() != null;
        case SclPackage.LABELS__PARENT_DOS:
            return getParentDOS() != null;
        case SclPackage.LABELS__PARENT_SDS:
            return getParentSDS() != null;
        }
        return super.eIsSet( featureID );
    }

} //LabelsImpl
