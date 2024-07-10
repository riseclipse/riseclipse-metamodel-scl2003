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
import fr.centralesupelec.edf.riseclipse.iec61850.scl.INamespaceGetter;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getSAddr <em>SAddr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getDAI <em>DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getParentDOI <em>Parent DOI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getSubSDI <em>Sub SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getParentSDI <em>Parent SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getRefersToSDO <em>Refers To SDO</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.SDIImpl#getRefersToAbstractDataAttribute <em>Refers To Abstract Data Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SDIImpl extends UnNamingImpl implements SDI {
    /**
     * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected static final String NAMESPACE_EDEFAULT = null;

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
     * The cached value of the '{@link #getDAI() <em>DAI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAI()
     * @generated
     * @ordered
     */
    protected EList< DAI > dai;

    /**
     * The cached value of the '{@link #getSubSDI() <em>Sub SDI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubSDI()
     * @generated
     * @ordered
     */
    protected EList< SDI > subSDI;

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
     * The cached value of the '{@link #getRefersToSDO() <em>Refers To SDO</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToSDO()
     * @generated
     * @ordered
     */
    protected SDO refersToSDO;

    /**
     * This is true if the Refers To SDO reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToSDOESet;

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
    protected SDIImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getSDI();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getNamespace() { //@formatter:off

        // The attribute dataNs shall be a DataAttribute of the data.
        //
        // 1.  SDI.DAI["dataNs"].value                              if present
        // 2.  SDI.SDO.DOType.DA["dataNs"].value                    if present
        // 3.  SDI(.ParentSDI)+.DAI["dataNs"].value                 if present
        // 4.  SDI(.ParentSDI)*.ParentDOI.namespace                 otherwise


        List< DAI > dataNsDai =
                 getDAI()
                .stream()
                .filter( dai -> "dataNs".equals( dai.getName() ))
                .collect( Collectors.toList() );
        if( dataNsDai.size() == 1 ) {
            if((       dataNsDai.get( 0 ).getVal().size() == 1 )
                  && ( dataNsDai.get( 0 ).getVal().get( 0 ).getValue() != null )
                  && ( dataNsDai.get( 0 ).getVal().get( 0 ).getValue().length() != 0 )) {
                return dataNsDai.get( 0 ).getVal().get( 0 ).getValue();
            }
        }

        if(( getRefersToSDO() != null ) && ( getRefersToSDO().getRefersToDOType() != null )) {
            List< DA > dataNsDa =
                     getRefersToSDO()
                    .getRefersToDOType()
                    .getDA()
                    .stream()
                    .filter( da -> "dataNs".equals( da.getName() ))
                    .collect( Collectors.toList() );

            if( dataNsDa.size() == 1 ) {
                if((       dataNsDa.get( 0 ).getVal().size() == 1 )
                      && ( dataNsDa.get( 0 ).getVal().get( 0 ).getValue() != null )
                      && ( dataNsDa.get( 0 ).getVal().get( 0 ).getValue().length() != 0 )) {
                    return dataNsDa.get( 0 ).getVal().get( 0 ).getValue();
                }
            }
        }

        SDI sdi = getParentSDI();
        while( sdi != null ) {
            dataNsDai =
                    sdi
                   .getDAI()
                   .stream()
                   .filter( dai -> "dataNs".equals( dai.getName() ))
                   .collect( Collectors.toList() );
           if( dataNsDai.size() == 1 ) {
               if((       dataNsDai.get( 0 ).getVal().size() == 1 )
                     && ( dataNsDai.get( 0 ).getVal().get( 0 ).getValue() != null )
                     && ( dataNsDai.get( 0 ).getVal().get( 0 ).getValue().length() != 0 )) {
                   return dataNsDai.get( 0 ).getVal().get( 0 ).getValue();
               }
           }
           sdi = sdi.getParentSDI();
        }

        sdi = this;
        while( sdi != null ) {
            if( sdi.getParentDOI() != null ) {
                return sdi.getParentDOI().getNamespace();
            }
            sdi = sdi.getParentSDI();
        }

        return null;

        //@formatter:on
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SDI__IX, oldIx, ix, !oldIxESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SDI__IX, oldIx, IX_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SDI__SADDR, oldSAddr, sAddr,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SDI__SADDR, oldSAddr, SADDR_EDEFAULT,
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
    public EList< DAI > getDAI() {
        if( dai == null ) {
            dai = new EObjectContainmentWithInverseEList.Unsettable< >( DAI.class, this, SclPackage.SDI__DAI,
                    SclPackage.DAI__PARENT_SDI );
        }
        return dai;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDAI() {
        if( dai != null ) {
            ( ( InternalEList.Unsettable< ? > ) dai ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDAI() {
        return dai != null && ( ( InternalEList.Unsettable< ? > ) dai ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DOI getParentDOI() {
        if( eContainerFeatureID() != SclPackage.SDI__PARENT_DOI ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentDOI, SclPackage.SDI__PARENT_DOI, msgs );
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
                || ( eContainerFeatureID() != SclPackage.SDI__PARENT_DOI && newParentDOI != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentDOI ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentDOI != null ) {
                msgs = ( ( InternalEObject ) newParentDOI ).eInverseAdd( this, SclPackage.DOI__SDI, DOI.class, msgs );
            }
            msgs = basicSetParentDOI( newParentDOI, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SDI__PARENT_DOI, newParentDOI,
                    newParentDOI ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SDI > getSubSDI() {
        if( subSDI == null ) {
            subSDI = new EObjectContainmentWithInverseEList.Unsettable< >( SDI.class, this, SclPackage.SDI__SUB_SDI,
                    SclPackage.SDI__PARENT_SDI );
        }
        return subSDI;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubSDI() {
        if( subSDI != null ) {
            ( ( InternalEList.Unsettable< ? > ) subSDI ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubSDI() {
        return subSDI != null && ( ( InternalEList.Unsettable< ? > ) subSDI ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SDI getParentSDI() {
        if( eContainerFeatureID() != SclPackage.SDI__PARENT_SDI ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentSDI, SclPackage.SDI__PARENT_SDI, msgs );
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
                || ( eContainerFeatureID() != SclPackage.SDI__PARENT_SDI && newParentSDI != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentSDI ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentSDI != null ) {
                msgs = ( ( InternalEObject ) newParentSDI ).eInverseAdd( this, SclPackage.SDI__SUB_SDI, SDI.class,
                        msgs );
            }
            msgs = basicSetParentSDI( newParentSDI, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SDI__PARENT_SDI, newParentSDI,
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SDI__NAME, oldName, name,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SDI__NAME, oldName, NAME_EDEFAULT,
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
    public SDO getRefersToSDO() {
        return refersToSDO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToSDO( SDO newRefersToSDO, NotificationChain msgs ) {
        SDO oldRefersToSDO = refersToSDO;
        refersToSDO = newRefersToSDO;
        boolean oldRefersToSDOESet = refersToSDOESet;
        refersToSDOESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.SDI__REFERS_TO_SDO, oldRefersToSDO, newRefersToSDO, !oldRefersToSDOESet );
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
    public void setRefersToSDO( SDO newRefersToSDO ) {
        if( newRefersToSDO != refersToSDO ) {
            NotificationChain msgs = null;
            if( refersToSDO != null ) {
                msgs = ( ( InternalEObject ) refersToSDO ).eInverseRemove( this, SclPackage.SDO__REFERRED_BY_SDI,
                        SDO.class, msgs );
            }
            if( newRefersToSDO != null ) {
                msgs = ( ( InternalEObject ) newRefersToSDO ).eInverseAdd( this, SclPackage.SDO__REFERRED_BY_SDI,
                        SDO.class, msgs );
            }
            msgs = basicSetRefersToSDO( newRefersToSDO, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSDOESet = refersToSDOESet;
            refersToSDOESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.SDI__REFERS_TO_SDO, newRefersToSDO,
                        newRefersToSDO, !oldRefersToSDOESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToSDO( NotificationChain msgs ) {
        SDO oldRefersToSDO = refersToSDO;
        refersToSDO = null;
        boolean oldRefersToSDOESet = refersToSDOESet;
        refersToSDOESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.SDI__REFERS_TO_SDO, oldRefersToSDO, null, oldRefersToSDOESet );
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
    public void unsetRefersToSDO() {
        if( refersToSDO != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToSDO ).eInverseRemove( this, SclPackage.SDO__REFERRED_BY_SDI, SDO.class,
                    msgs );
            msgs = basicUnsetRefersToSDO( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToSDOESet = refersToSDOESet;
            refersToSDOESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.SDI__REFERS_TO_SDO, null, null,
                        oldRefersToSDOESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToSDO() {
        return refersToSDOESet;
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
                    SclPackage.SDI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, oldRefersToAbstractDataAttribute,
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
                        SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_SDI, AbstractDataAttribute.class, msgs );
            }
            if( newRefersToAbstractDataAttribute != null ) {
                msgs = ( ( InternalEObject ) newRefersToAbstractDataAttribute ).eInverseAdd( this,
                        SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_SDI, AbstractDataAttribute.class, msgs );
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
                        SclPackage.SDI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, newRefersToAbstractDataAttribute,
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
                    SclPackage.SDI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, oldRefersToAbstractDataAttribute, null,
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
                    SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_SDI, AbstractDataAttribute.class, msgs );
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
                        SclPackage.SDI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE, null, null,
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
        case SclPackage.SDI__DAI:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDAI() ).basicAdd( otherEnd, msgs );
        case SclPackage.SDI__PARENT_DOI:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentDOI( ( DOI ) otherEnd, msgs );
        case SclPackage.SDI__SUB_SDI:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSubSDI() ).basicAdd( otherEnd,
                    msgs );
        case SclPackage.SDI__PARENT_SDI:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentSDI( ( SDI ) otherEnd, msgs );
        case SclPackage.SDI__REFERS_TO_SDO:
            if( refersToSDO != null ) {
                msgs = ( ( InternalEObject ) refersToSDO ).eInverseRemove( this, SclPackage.SDO__REFERRED_BY_SDI,
                        SDO.class, msgs );
            }
            return basicSetRefersToSDO( ( SDO ) otherEnd, msgs );
        case SclPackage.SDI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
            if( refersToAbstractDataAttribute != null ) {
                msgs = ( ( InternalEObject ) refersToAbstractDataAttribute ).eInverseRemove( this,
                        SclPackage.ABSTRACT_DATA_ATTRIBUTE__REFERRED_BY_SDI, AbstractDataAttribute.class, msgs );
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
        case SclPackage.SDI__DAI:
            return ( ( InternalEList< ? > ) getDAI() ).basicRemove( otherEnd, msgs );
        case SclPackage.SDI__PARENT_DOI:
            return basicSetParentDOI( null, msgs );
        case SclPackage.SDI__SUB_SDI:
            return ( ( InternalEList< ? > ) getSubSDI() ).basicRemove( otherEnd, msgs );
        case SclPackage.SDI__PARENT_SDI:
            return basicSetParentSDI( null, msgs );
        case SclPackage.SDI__REFERS_TO_SDO:
            return basicUnsetRefersToSDO( msgs );
        case SclPackage.SDI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
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
        case SclPackage.SDI__PARENT_DOI:
            return eInternalContainer().eInverseRemove( this, SclPackage.DOI__SDI, DOI.class, msgs );
        case SclPackage.SDI__PARENT_SDI:
            return eInternalContainer().eInverseRemove( this, SclPackage.SDI__SUB_SDI, SDI.class, msgs );
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
        case SclPackage.SDI__NAMESPACE:
            return getNamespace();
        case SclPackage.SDI__IX:
            return getIx();
        case SclPackage.SDI__SADDR:
            return getSAddr();
        case SclPackage.SDI__DAI:
            return getDAI();
        case SclPackage.SDI__PARENT_DOI:
            return getParentDOI();
        case SclPackage.SDI__SUB_SDI:
            return getSubSDI();
        case SclPackage.SDI__PARENT_SDI:
            return getParentSDI();
        case SclPackage.SDI__NAME:
            return getName();
        case SclPackage.SDI__REFERS_TO_SDO:
            return getRefersToSDO();
        case SclPackage.SDI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
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
        case SclPackage.SDI__IX:
            setIx( ( Integer ) newValue );
            return;
        case SclPackage.SDI__SADDR:
            setSAddr( ( String ) newValue );
            return;
        case SclPackage.SDI__DAI:
            getDAI().clear();
            getDAI().addAll( ( Collection< ? extends DAI > ) newValue );
            return;
        case SclPackage.SDI__PARENT_DOI:
            setParentDOI( ( DOI ) newValue );
            return;
        case SclPackage.SDI__SUB_SDI:
            getSubSDI().clear();
            getSubSDI().addAll( ( Collection< ? extends SDI > ) newValue );
            return;
        case SclPackage.SDI__PARENT_SDI:
            setParentSDI( ( SDI ) newValue );
            return;
        case SclPackage.SDI__NAME:
            setName( ( String ) newValue );
            return;
        case SclPackage.SDI__REFERS_TO_SDO:
            setRefersToSDO( ( SDO ) newValue );
            return;
        case SclPackage.SDI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
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
        case SclPackage.SDI__IX:
            unsetIx();
            return;
        case SclPackage.SDI__SADDR:
            unsetSAddr();
            return;
        case SclPackage.SDI__DAI:
            unsetDAI();
            return;
        case SclPackage.SDI__PARENT_DOI:
            setParentDOI( ( DOI ) null );
            return;
        case SclPackage.SDI__SUB_SDI:
            unsetSubSDI();
            return;
        case SclPackage.SDI__PARENT_SDI:
            setParentSDI( ( SDI ) null );
            return;
        case SclPackage.SDI__NAME:
            unsetName();
            return;
        case SclPackage.SDI__REFERS_TO_SDO:
            unsetRefersToSDO();
            return;
        case SclPackage.SDI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
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
        case SclPackage.SDI__NAMESPACE:
            return NAMESPACE_EDEFAULT == null ? getNamespace() != null : !NAMESPACE_EDEFAULT.equals( getNamespace() );
        case SclPackage.SDI__IX:
            return isSetIx();
        case SclPackage.SDI__SADDR:
            return isSetSAddr();
        case SclPackage.SDI__DAI:
            return isSetDAI();
        case SclPackage.SDI__PARENT_DOI:
            return getParentDOI() != null;
        case SclPackage.SDI__SUB_SDI:
            return isSetSubSDI();
        case SclPackage.SDI__PARENT_SDI:
            return getParentSDI() != null;
        case SclPackage.SDI__NAME:
            return isSetName();
        case SclPackage.SDI__REFERS_TO_SDO:
            return isSetRefersToSDO();
        case SclPackage.SDI__REFERS_TO_ABSTRACT_DATA_ATTRIBUTE:
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
    public int eBaseStructuralFeatureID( int derivedFeatureID, Class< ? > baseClass ) {
        if( baseClass == INamespaceGetter.class ) {
            switch( derivedFeatureID ) {
            case SclPackage.SDI__NAMESPACE:
                return SclPackage.INAMESPACE_GETTER__NAMESPACE;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID( derivedFeatureID, baseClass );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID( int baseFeatureID, Class< ? > baseClass ) {
        if( baseClass == INamespaceGetter.class ) {
            switch( baseFeatureID ) {
            case SclPackage.INAMESPACE_GETTER__NAMESPACE:
                return SclPackage.SDI__NAMESPACE;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID( baseFeatureID, baseClass );
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
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "SDIImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from SDI: ";

        if( ( getName() == null ) || getName().isEmpty() ) {
//            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
//                    messagePrefix, "name is missing" );
            return;
        }

        if( getParentDOI() != null ) {
            doResolveLinkWithParentDOI( console, messagePrefix );
        }
        else if( getParentSDI() != null ) {
            doResolveLinkWithParentSDI( console, messagePrefix );
        }
        else {
            // Unexpected
        }
    }

    private void doResolveLinkWithParentDOI( @NonNull IRiseClipseConsole console, @NonNull String messagePrefix ) {
        DO do_ = getParentDOI().getRefersToDO();
        // No error or warning message here: if this happens, error should have been detected before
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

        List< SDO > res1 = dot
                .getSDO()
                .stream()
                .filter( d -> getName().equals( d.getName() ) )
                .collect( Collectors.toList() );

        // Not an error if res1.size() == 0: will look for a DA
        if( res1.size() > 1 ) {
//            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
//                    messagePrefix, "found several SDO( name = ", getName(),
//                    " ) using ParentDOI" );
            return;
        }
        if( res1.size() == 1 ) {
            setRefersToSDO( res1.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "SDI refers to SDO( name = ", getName(), " ) on line ",
                    getRefersToSDO().getLineNumber() );
            return;
        }

        List< DA > res2 = dot
                .getDA()
                .stream()
                .filter( d -> getName().equals( d.getName() ) )
                .collect( Collectors.toList() );

        // Specific message if res2.size() == 0
        if( res2.size() == 0 ) {
//            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
//                    messagePrefix, "no SDO or DA found using ParentDOI" );
            return;
        }
        if( res2.size() > 1 ) {
//            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
//                    messagePrefix, "found several DA( name = ", getName(),
//                    " ) using ParentDOI" );
            return;
        }
        setRefersToAbstractDataAttribute( res2.get( 0 ) );
        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "SDI refers to DA( name = ", getName(), " ) on line ",
                getRefersToAbstractDataAttribute().getLineNumber() );
    }

    private void doResolveLinkWithParentSDI( @NonNull IRiseClipseConsole console, @NonNull String messagePrefix ) {
        SDO sdo = getParentSDI().getRefersToSDO();
        if( sdo != null ) {
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found SDO on line ", sdo.getLineNumber() );
            sdo.buildExplicitLinks( console, false );

            DOType dot = sdo.getRefersToDOType();
            // No error or warning message here: if this happens, error should have been detected before
            if( dot == null ) {
                return;
            }
            console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    messagePrefix, "found DOType on line ", dot.getLineNumber() );

            List< SDO > res1 = dot
                    .getSDO()
                    .stream()
                    .filter( d -> getName().equals( d.getName() ) )
                    .collect( Collectors.toList() );

            // Not an error if res1.size() == 0: will look for a DA
            if( res1.size() > 1 ) {
//                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
//                        messagePrefix, "found several SDO( name = ", getName(), " ) using ParentSDI" );
                return;
            }
            if( res1.size() == 1 ) {
                setRefersToSDO( res1.get( 0 ) );
                console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                        "SDI refers to SDO( name = ", getName(), " ) on line ",
                        getRefersToSDO().getLineNumber() );
                return;
            }

            List< DA > res2 = dot
                    .getDA()
                    .stream()
                    .filter( d -> getName().equals( d.getName() ) )
                    .collect( Collectors.toList() );

            // Specific message if res2.size() == 0
            if( res2.size() == 0 ) {
//                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), messagePrefix,
//                        "no SDO or DA found using ParentSDI" );
                return;
            }
            if( res2.size() > 1 ) {
//                console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
//                        messagePrefix, "found several DA( name = ", getName(), " ) using ParentSDI" );
                return;
            }
            setRefersToAbstractDataAttribute( res2.get( 0 ) );
            console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                    "SDI refers to DA( name = ", getName(), " ) on line ",
                    getRefersToAbstractDataAttribute().getLineNumber() );
            return;

        }

        // When getParentSDI().getRefersToSDO() == null
        AbstractDataAttribute att = getParentSDI().getRefersToAbstractDataAttribute();
        if( att == null ) {
//            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
//                    messagePrefix, "cannot find SDO or AbstractDataAttribute using ParentSDI" );
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                messagePrefix, "found AbstractDataAttribute on line ", att.getLineNumber() );

        att.buildExplicitLinks( console, false );
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
//            console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
//                    messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
//                    " BDA( name = ", getName(), " )" );
            return;
        }
        setRefersToAbstractDataAttribute( res.get( 0 ) );
        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "SDI refers to BDA( name = ", getName(), " ) on line ",
                getRefersToAbstractDataAttribute().getLineNumber() );
    }

} //SDIImpl
