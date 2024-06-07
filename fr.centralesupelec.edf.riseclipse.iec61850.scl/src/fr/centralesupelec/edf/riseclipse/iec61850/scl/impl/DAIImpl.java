/*
*************************************************************************
**  Copyright (c) 2016-2022 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
**
**  This file is part of the RiseClipse tool
**
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.iec61850.scl.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AbstractDataAttribute;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.BDA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOType;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.Val;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.ValKindEnum;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getValImport <em>Val Import</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getValKind <em>Val Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getVal <em>Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getParentDOI <em>Parent DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getParentSDI <em>Parent SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DAIImpl#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAIImpl extends UnNamingImpl implements DAI {
    /**
     * The default value of the '{@link #getIx() <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIx()
     * @generated
     * @ordered
     */
    protected static final Integer IX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIx() <em>Ix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIx()
     * @generated
     * @ordered
     */
    protected Integer ix = IX_EDEFAULT;

    /**
     * This is true if the Ix attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ixESet;

    /**
     * The default value of the '{@link #getSAddr() <em>SAddr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAddr()
     * @generated
     * @ordered
     */
    protected static final String SADDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSAddr() <em>SAddr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSAddr()
     * @generated
     * @ordered
     */
    protected String sAddr = SADDR_EDEFAULT;

    /**
     * This is true if the SAddr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sAddrESet;

    /**
     * The default value of the '{@link #getValImport() <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValImport()
     * @generated
     * @ordered
     */
    protected static final Boolean VAL_IMPORT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValImport() <em>Val Import</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValImport()
     * @generated
     * @ordered
     */
    protected Boolean valImport = VAL_IMPORT_EDEFAULT;

    /**
     * This is true if the Val Import attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valImportESet;

    /**
     * The default value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValKind()
     * @generated NOT because there is no default value in SCL
     * @ordered
     */
    protected static final ValKindEnum VAL_KIND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValKind() <em>Val Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValKind()
     * @generated
     * @ordered
     */
    protected ValKindEnum valKind = VAL_KIND_EDEFAULT;

    /**
     * This is true if the Val Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valKindESet;

    /**
     * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVal()
     * @generated
     * @ordered
     */
    protected EList< Val > val;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * This is true if the Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nameESet;

    /**
     * The cached value of the '{@link #getRefersToAbstractDataAttribute() <em>Refers To Abstract Data Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToAbstractDataAttribute()
     * @generated
     * @ordered
     */
    protected AbstractDataAttribute refersToAbstractDataAttribute;

    /**
     * This is true if the Refers To Abstract Data Attribute reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToAbstractDataAttributeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DAIImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDAI();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getIx() {
        return ix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIx( Integer newIx ) {
        Integer oldIx = ix;
        ix = newIx;
        boolean oldIxESet = ixESet;
        ixESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DAI__IX, oldIx, ix, !oldIxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIx() {
        Integer oldIx = ix;
        boolean oldIxESet = ixESet;
        ix = IX_EDEFAULT;
        ixESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DAI__IX, oldIx, IX_EDEFAULT,
                    oldIxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIx() {
        return ixESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSAddr() {
        return sAddr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSAddr( String newSAddr ) {
        String oldSAddr = sAddr;
        sAddr = newSAddr;
        boolean oldSAddrESet = sAddrESet;
        sAddrESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DAI__SADDR, oldSAddr, sAddr,
                    !oldSAddrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSAddr() {
        String oldSAddr = sAddr;
        boolean oldSAddrESet = sAddrESet;
        sAddr = SADDR_EDEFAULT;
        sAddrESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DAI__SADDR, oldSAddr, SADDR_EDEFAULT,
                    oldSAddrESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSAddr() {
        return sAddrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getValImport() {
        return valImport;
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValImport( Boolean newValImport ) {
        Boolean oldValImport = valImport;
        valImport = newValImport;
        boolean oldValImportESet = valImportESet;
        valImportESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DAI__VAL_IMPORT, oldValImport, valImport,
                    !oldValImportESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValImport() {
        Boolean oldValImport = valImport;
        boolean oldValImportESet = valImportESet;
        valImport = VAL_IMPORT_EDEFAULT;
        valImportESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DAI__VAL_IMPORT, oldValImport,
                    VAL_IMPORT_EDEFAULT, oldValImportESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValImport() {
        return valImportESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValKindEnum getValKind() {
        return valKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValKind( ValKindEnum newValKind ) {
        ValKindEnum oldValKind = valKind;
        valKind = newValKind == null ? VAL_KIND_EDEFAULT : newValKind;
        boolean oldValKindESet = valKindESet;
        valKindESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DAI__VAL_KIND, oldValKind, valKind,
                    !oldValKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValKind() {
        ValKindEnum oldValKind = valKind;
        boolean oldValKindESet = valKindESet;
        valKind = VAL_KIND_EDEFAULT;
        valKindESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DAI__VAL_KIND, oldValKind,
                    VAL_KIND_EDEFAULT, oldValKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValKind() {
        return valKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public EList< Val > getVal() {
        if( val == null ) {
            // If there is no Val, we try to get it from its associated DA
            // We do this to solve https://github.com/riseclipse/riseclipse-metamodel-scl2003/issues/43
            if(( getRefersToAbstractDataAttribute() != null ) && ( getRefersToAbstractDataAttribute().isSetVal() )) {
                // We make a copy to protect the DA from changes
                EList< Val > valDA = getRefersToAbstractDataAttribute().getVal();
                if(( valDA != null ) && ( valDA.size() > 0 )) {
                    // We make a copy to protect the DA from changes
                    val = new EObjectContainmentWithInverseEList.Unsettable< >( Val.class, this, SclPackage.DAI__VAL,
                            SclPackage.VAL__PARENT_DAI );
                    for( Val v : valDA ) {
                        val.add( EcoreUtil.copy( v ));
                    }
                }
                
            }
        }
        
        if( val == null ) {
            val = new EObjectContainmentWithInverseEList.Unsettable< >( Val.class, this, SclPackage.DAI__VAL,
                SclPackage.VAL__PARENT_DAI );
        }
        return val;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVal() {
        if( val != null ) {
            ( ( InternalEList.Unsettable< ? > ) val ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVal() {
        return val != null && ( ( InternalEList.Unsettable< ? > ) val ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOI getParentDOI() {
        if( eContainerFeatureID() != SclPackage.DAI__PARENT_DOI ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDOI, SclPackage.DAI__PARENT_DOI, msgs );
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
                || ( eContainerFeatureID() != SclPackage.DAI__PARENT_DOI && newParentDOI != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDOI ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDOI != null ) {
                msgs = ( ( InternalEObject ) newParentDOI ).eInverseAdd( this, SclPackage.DOI__DAI, DOI.class, msgs );
            }
            msgs = basicSetParentDOI( newParentDOI, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DAI__PARENT_DOI, newParentDOI,
                    newParentDOI ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SDI getParentSDI() {
        if( eContainerFeatureID() != SclPackage.DAI__PARENT_SDI ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSDI, SclPackage.DAI__PARENT_SDI, msgs );
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
                || ( eContainerFeatureID() != SclPackage.DAI__PARENT_SDI && newParentSDI != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSDI ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSDI != null ) {
                msgs = ( ( InternalEObject ) newParentSDI ).eInverseAdd( this, SclPackage.SDI__DAI, SDI.class, msgs );
            }
            msgs = basicSetParentSDI( newParentSDI, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DAI__PARENT_SDI, newParentSDI,
                    newParentSDI ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName( String newName ) {
        String oldName = name;
        name = newName;
        boolean oldNameESet = nameESet;
        nameESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DAI__NAME, oldName, name,
                    !oldNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetName() {
        String oldName = name;
        boolean oldNameESet = nameESet;
        name = NAME_EDEFAULT;
        nameESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DAI__NAME, oldName, NAME_EDEFAULT,
                    oldNameESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetName() {
        return nameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AbstractDataAttribute getRefersToAbstractDataAttribute() {
        return refersToAbstractDataAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToAbstractDataAttribute(
            AbstractDataAttribute newRefersToAbstractDataAttribute, NotificationChain msgs ) {
        AbstractDataAttribute oldRefersToAbstractDataAttribute = refersToAbstractDataAttribute;
        refersToAbstractDataAttribute = newRefersToAbstractDataAttribute;
        boolean oldRefersToAbstractDataAttributeESet = refersToAbstractDataAttributeESet;
        refersToAbstractDataAttributeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.DAI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, oldRefersToAbstractDataAttribute,
                    newRefersToAbstractDataAttribute, !oldRefersToAbstractDataAttributeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRefersToAbstractDataAttribute( AbstractDataAttribute newRefersToAbstractDataAttribute ) {
        if( newRefersToAbstractDataAttribute != refersToAbstractDataAttribute ) {
            NotificationChain msgs = null;
            if( refersToAbstractDataAttribute != null ) {
                msgs = ( ( InternalEObject ) refersToAbstractDataAttribute ).eInverseRemove( this,
                        SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_DAI, AbstractDataAttribute.class, msgs );
            }
            if( newRefersToAbstractDataAttribute != null ) {
                msgs = ( ( InternalEObject ) newRefersToAbstractDataAttribute ).eInverseAdd( this,
                        SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_DAI, AbstractDataAttribute.class, msgs );
            }
            msgs = basicSetRefersToAbstractDataAttribute( newRefersToAbstractDataAttribute, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAbstractDataAttributeESet = refersToAbstractDataAttributeESet;
            refersToAbstractDataAttributeESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        SclPackage.DAI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, newRefersToAbstractDataAttribute,
                        newRefersToAbstractDataAttribute, !oldRefersToAbstractDataAttributeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToAbstractDataAttribute( NotificationChain msgs ) {
        AbstractDataAttribute oldRefersToAbstractDataAttribute = refersToAbstractDataAttribute;
        refersToAbstractDataAttribute = null;
        boolean oldRefersToAbstractDataAttributeESet = refersToAbstractDataAttributeESet;
        refersToAbstractDataAttributeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.DAI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, oldRefersToAbstractDataAttribute, null,
                    oldRefersToAbstractDataAttributeESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRefersToAbstractDataAttribute() {
        if( refersToAbstractDataAttribute != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToAbstractDataAttribute ).eInverseRemove( this,
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_DAI, AbstractDataAttribute.class, msgs );
            msgs = basicUnsetRefersToAbstractDataAttribute( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToAbstractDataAttributeESet = refersToAbstractDataAttributeESet;
            refersToAbstractDataAttributeESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        SclPackage.DAI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, null, null,
                        oldRefersToAbstractDataAttributeESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToAbstractDataAttribute() {
        return refersToAbstractDataAttributeESet;
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
        case SclPackage.DAI__VAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVal() ).basicAdd( otherEnd, msgs );
        case SclPackage.DAI__PARENT_DOI:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDOI( ( DOI ) otherEnd, msgs );
        case SclPackage.DAI__PARENT_SDI:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSDI( ( SDI ) otherEnd, msgs );
        case SclPackage.DAI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            if( refersToAbstractDataAttribute != null ) {
                msgs = ( ( InternalEObject ) refersToAbstractDataAttribute ).eInverseRemove( this,
                        SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_DAI, AbstractDataAttribute.class, msgs );
            }
            return basicSetRefersToAbstractDataAttribute( ( AbstractDataAttribute ) otherEnd, msgs );
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
        case SclPackage.DAI__VAL:
            return ( ( InternalEList< ? > ) getVal() ).basicRemove( otherEnd, msgs );
        case SclPackage.DAI__PARENT_DOI:
            return basicSetParentDOI( null, msgs );
        case SclPackage.DAI__PARENT_SDI:
            return basicSetParentSDI( null, msgs );
        case SclPackage.DAI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            return basicUnsetRefersToAbstractDataAttribute( msgs );
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
        case SclPackage.DAI__PARENT_DOI:
            return eInternalContainer().eInverseRemove( this, SclPackage.DOI__DAI, DOI.class, msgs );
        case SclPackage.DAI__PARENT_SDI:
            return eInternalContainer().eInverseRemove( this, SclPackage.SDI__DAI, SDI.class, msgs );
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
        case SclPackage.DAI__IX:
            return getIx();
        case SclPackage.DAI__SADDR:
            return getSAddr();
        case SclPackage.DAI__VAL_IMPORT:
            return getValImport();
        case SclPackage.DAI__VAL_KIND:
            return getValKind();
        case SclPackage.DAI__VAL:
            return getVal();
        case SclPackage.DAI__PARENT_DOI:
            return getParentDOI();
        case SclPackage.DAI__PARENT_SDI:
            return getParentSDI();
        case SclPackage.DAI__NAME:
            return getName();
        case SclPackage.DAI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            return getRefersToAbstractDataAttribute();
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
        case SclPackage.DAI__IX:
            setIx( ( Integer ) newValue );
            return;
        case SclPackage.DAI__SADDR:
            setSAddr( ( String ) newValue );
            return;
        case SclPackage.DAI__VAL_IMPORT:
            setValImport( ( Boolean ) newValue );
            return;
        case SclPackage.DAI__VAL_KIND:
            setValKind( ( ValKindEnum ) newValue );
            return;
        case SclPackage.DAI__VAL:
            getVal().clear();
            getVal().addAll( ( Collection< ? extends Val > ) newValue );
            return;
        case SclPackage.DAI__PARENT_DOI:
            setParentDOI( ( DOI ) newValue );
            return;
        case SclPackage.DAI__PARENT_SDI:
            setParentSDI( ( SDI ) newValue );
            return;
        case SclPackage.DAI__NAME:
            setName( ( String ) newValue );
            return;
        case SclPackage.DAI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            setRefersToAbstractDataAttribute( ( AbstractDataAttribute ) newValue );
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
        case SclPackage.DAI__IX:
            unsetIx();
            return;
        case SclPackage.DAI__SADDR:
            unsetSAddr();
            return;
        case SclPackage.DAI__VAL_IMPORT:
            unsetValImport();
            return;
        case SclPackage.DAI__VAL_KIND:
            unsetValKind();
            return;
        case SclPackage.DAI__VAL:
            unsetVal();
            return;
        case SclPackage.DAI__PARENT_DOI:
            setParentDOI( ( DOI ) null );
            return;
        case SclPackage.DAI__PARENT_SDI:
            setParentSDI( ( SDI ) null );
            return;
        case SclPackage.DAI__NAME:
            unsetName();
            return;
        case SclPackage.DAI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            unsetRefersToAbstractDataAttribute();
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
        case SclPackage.DAI__IX:
            return isSetIx();
        case SclPackage.DAI__SADDR:
            return isSetSAddr();
        case SclPackage.DAI__VAL_IMPORT:
            return isSetValImport();
        case SclPackage.DAI__VAL_KIND:
            return isSetValKind();
        case SclPackage.DAI__VAL:
            return isSetVal();
        case SclPackage.DAI__PARENT_DOI:
            return getParentDOI() != null;
        case SclPackage.DAI__PARENT_SDI:
            return getParentSDI() != null;
        case SclPackage.DAI__NAME:
            return isSetName();
        case SclPackage.DAI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            return isSetRefersToAbstractDataAttribute();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (ix: " );
        if( ixESet ) {
            result.append( ix );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", sAddr: " );
        if( sAddrESet ) {
            result.append( sAddr );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", valImport: " );
        if( valImportESet ) {
            result.append( valImport );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", valKind: " );
        if( valKindESet ) {
            result.append( valKind );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", name: " );
        if( nameESet ) {
            result.append( name );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

    @Override
    protected void doBuildExplicitLinks( @NonNull IRiseClipseConsole console ) {
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "DAIImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from DAI: ";

        if( ( getName() == null ) || getName().isEmpty() ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "name is missing" );
            return;
        }

        if( getParentDOI() != null ) {
            doBuildExplicitLinkWithParentDOI( console, messagePrefix );
        }
        else if( getParentSDI() != null ) {
            doBuildExplicitLinkWithParentSDI( console, messagePrefix );
        }
        else {
            // Unexpected
        }
    }

    private void doBuildExplicitLinkWithParentDOI( @NonNull IRiseClipseConsole console,
            @NonNull String messagePrefix ) {
        // No error or warning messages here: if this happens, error should have been detected before
        DO do_ = getParentDOI().getRefersToDO();
        if( do_ == null ) {
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                messagePrefix, "found DO on line ", do_.getLineNumber() );

        do_.buildExplicitLinks( console, false );
        DOType dot = do_.getRefersToDOType();
        // No error or warning message here: if this happens, error should have been detected before
        if( dot == null ) {
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                messagePrefix, "found DOType on line ", dot.getLineNumber() );

        List< DA > res = dot
                .getDA()
                .stream()
                .filter( d -> getName().equals( d.getName() ) )
                .collect( Collectors.toList() );

        if( res.size() != 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                    " DA( name = ", getName(), " )" );
            return;
        }
        setRefersToAbstractDataAttribute( res.get( 0 ) );
        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "DAI refers to DA( name = " + getName(), " ) on line ",
                getRefersToAbstractDataAttribute().getLineNumber() );
    }

    private void doBuildExplicitLinkWithParentSDI( @NonNull IRiseClipseConsole console,
            @NonNull String messagePrefix ) {
        // No error or warning messages here: if this happens, error should have been detected before
        AbstractDataAttribute att = getParentSDI().getRefersToAbstractDataAttribute();
        if( att == null ) {
            // SDI may refers also to an SDO
            SDO sdo = getParentSDI().getRefersToSDO();
            if( sdo == null ) {
                return;
            }
            sdo.buildExplicitLinks( console, false );
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found SDO on line ", sdo.getLineNumber() );
            DOType dot = sdo.getRefersToDOType();
            // No error or warning message here: if this happens, error should have been detected before
            if( dot == null ) {
                return;
            }
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found DOType on line ", dot.getLineNumber() );

            List< DA > res = dot
                    .getDA()
                    .stream()
                    .filter( d -> getName().equals( d.getName() ) )
                    .collect( Collectors.toList() );

            if( res.size() != 1 ) {
                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                        " DA( name = ", getName(), " )" );
                return;
            }
            setRefersToAbstractDataAttribute( res.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "DAI refers to DA( name = ", getName(), " ) on line ",
                    getRefersToAbstractDataAttribute().getLineNumber() );
            return;
        }
        att.buildExplicitLinks( console, false );
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                messagePrefix, "found AbstractDataAttribute on line ", att.getLineNumber() );

        DAType dat = att.getRefersToDAType();
        // No error or warning message here: if this happens, error should have been detected before
        if( dat == null ) {
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                messagePrefix, "found DAType on line ", dat.getLineNumber() );

        List< BDA > res = dat
                .getBDA()
                .stream()
                .filter( b -> getName().equals( b.getName() ) )
                .collect( Collectors.toList() );

        if( res.size() != 1 ) {
            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
                    " BDA( name = ", getName(), " )" );
            return;
        }
        setRefersToAbstractDataAttribute( res.get( 0 ) );
        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "DAI refers to ", "BDA( name = " + getName() + " )", " on line ",
                getRefersToAbstractDataAttribute().getLineNumber() );
    }

} //DAIImpl
