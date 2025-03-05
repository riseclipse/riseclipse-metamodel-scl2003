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

import fr.centralesupelec.edf.riseclipse.iec61850.scl.AnyLN;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DA;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DAI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DO;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.DOI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.INamespaceGetter;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SDI;
import fr.centralesupelec.edf.riseclipse.iec61850.scl.SclPackage;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseConsole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DOI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getIx <em>Ix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getParentAnyLN <em>Parent Any LN</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getDAI <em>DAI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getSDI <em>SDI</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getAccessControl <em>Access Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.iec61850.scl.impl.DOIImpl#getRefersToDO <em>Refers To DO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DOIImpl extends UnNamingImpl implements DOI {
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
     * The cached value of the '{@link #getDAI() <em>DAI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDAI()
     * @generated
     * @ordered
     */
    protected EList< DAI > dai;

    /**
     * The cached value of the '{@link #getSDI() <em>SDI</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSDI()
     * @generated
     * @ordered
     */
    protected EList< SDI > sdi;

    /**
     * The default value of the '{@link #getAccessControl() <em>Access Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessControl()
     * @generated
     * @ordered
     */
    protected static final String ACCESS_CONTROL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessControl()
     * @generated
     * @ordered
     */
    protected String accessControl = ACCESS_CONTROL_EDEFAULT;

    /**
     * This is true if the Access Control attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accessControlESet;

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
     * The cached value of the '{@link #getRefersToDO() <em>Refers To DO</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefersToDO()
     * @generated
     * @ordered
     */
    protected DO refersToDO;

    /**
     * This is true if the Refers To DO reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refersToDOESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DOIImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.eINSTANCE.getDOI();
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DOI__IX, oldIx, ix, !oldIxESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DOI__IX, oldIx, IX_EDEFAULT,
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
    public AnyLN getParentAnyLN() {
        if( eContainerFeatureID() != SclPackage.DOI__PARENT_ANY_LN ) {
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
        msgs = eBasicSetContainer( ( InternalEObject ) newParentAnyLN, SclPackage.DOI__PARENT_ANY_LN, msgs );
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
                || ( eContainerFeatureID() != SclPackage.DOI__PARENT_ANY_LN && newParentAnyLN != null ) ) {
            if( EcoreUtil.isAncestor( this, newParentAnyLN ) ) {
                throw new IllegalArgumentException( "Recursive containment not allowed for " + toString() );
            }
            NotificationChain msgs = null;
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            if( newParentAnyLN != null ) {
                msgs = ( ( InternalEObject ) newParentAnyLN ).eInverseAdd( this, SclPackage.ANY_LN__DOI, AnyLN.class,
                        msgs );
            }
            msgs = basicSetParentAnyLN( newParentAnyLN, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DOI__PARENT_ANY_LN, newParentAnyLN,
                    newParentAnyLN ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DAI > getDAI() {
        if( dai == null ) {
            dai = new EObjectContainmentWithInverseEList.Unsettable< >( DAI.class, this, SclPackage.DOI__DAI,
                    SclPackage.DAI__PARENT_DOI );
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
    public EList< SDI > getSDI() {
        if( sdi == null ) {
            sdi = new EObjectContainmentWithInverseEList.Unsettable< >( SDI.class, this, SclPackage.DOI__SDI,
                    SclPackage.SDI__PARENT_DOI );
        }
        return sdi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSDI() {
        if( sdi != null ) {
            ( ( InternalEList.Unsettable< ? > ) sdi ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSDI() {
        return sdi != null && ( ( InternalEList.Unsettable< ? > ) sdi ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAccessControl() {
        return accessControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccessControl( String newAccessControl ) {
        String oldAccessControl = accessControl;
        accessControl = newAccessControl;
        boolean oldAccessControlESet = accessControlESet;
        accessControlESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DOI__ACCESS_CONTROL, oldAccessControl,
                    accessControl, !oldAccessControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccessControl() {
        String oldAccessControl = accessControl;
        boolean oldAccessControlESet = accessControlESet;
        accessControl = ACCESS_CONTROL_EDEFAULT;
        accessControlESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DOI__ACCESS_CONTROL, oldAccessControl,
                    ACCESS_CONTROL_EDEFAULT, oldAccessControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccessControl() {
        return accessControlESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DOI__NAME, oldName, name,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DOI__NAME, oldName, NAME_EDEFAULT,
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
    public DO getRefersToDO() {
        return refersToDO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefersToDO( DO newRefersToDO, NotificationChain msgs ) {
        DO oldRefersToDO = refersToDO;
        refersToDO = newRefersToDO;
        boolean oldRefersToDOESet = refersToDOESet;
        refersToDOESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    SclPackage.DOI__REFERS_TO_DO, oldRefersToDO, newRefersToDO, !oldRefersToDOESet );
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
    public void setRefersToDO( DO newRefersToDO ) {
        if( newRefersToDO != refersToDO ) {
            NotificationChain msgs = null;
            if( refersToDO != null ) {
                msgs = ( ( InternalEObject ) refersToDO ).eInverseRemove( this, SclPackage.DO__REFERRED_BY_DOI,
                        DO.class, msgs );
            }
            if( newRefersToDO != null ) {
                msgs = ( ( InternalEObject ) newRefersToDO ).eInverseAdd( this, SclPackage.DO__REFERRED_BY_DOI,
                        DO.class, msgs );
            }
            msgs = basicSetRefersToDO( newRefersToDO, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToDOESet = refersToDOESet;
            refersToDOESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, SclPackage.DOI__REFERS_TO_DO, newRefersToDO,
                        newRefersToDO, !oldRefersToDOESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRefersToDO( NotificationChain msgs ) {
        DO oldRefersToDO = refersToDO;
        refersToDO = null;
        boolean oldRefersToDOESet = refersToDOESet;
        refersToDOESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    SclPackage.DOI__REFERS_TO_DO, oldRefersToDO, null, oldRefersToDOESet );
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
    public void unsetRefersToDO() {
        if( refersToDO != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) refersToDO ).eInverseRemove( this, SclPackage.DO__REFERRED_BY_DOI, DO.class,
                    msgs );
            msgs = basicUnsetRefersToDO( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldRefersToDOESet = refersToDOESet;
            refersToDOESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, SclPackage.DOI__REFERS_TO_DO, null, null,
                        oldRefersToDOESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRefersToDO() {
        return refersToDOESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public String getNamespace() {
        //@formatter:off

        // The attribute dataNs shall be a DataAttribute of the data.
        //
        // 1.  DOI.DAI["dataNs"].value                              if present
        // 2.  DOI.DO.DOType.DA["dataNs"].value                     if present
        // 3.  DOI.AnyLN.namespace                                  otherwise



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

        if(( getRefersToDO() != null ) && ( getRefersToDO().getRefersToDOType() != null )) {
            List< DA > dataNsDa =
                     getRefersToDO()
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

        if( getParentAnyLN() != null ) {
            return getParentAnyLN().getNamespace();
        }
        return null;

        //@formatter:on
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
        case SclPackage.DOI__PARENT_ANY_LN:
            if( eInternalContainer() != null ) {
                msgs = eBasicRemoveFromContainer( msgs );
            }
            return basicSetParentAnyLN( ( AnyLN ) otherEnd, msgs );
        case SclPackage.DOI__DAI:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDAI() ).basicAdd( otherEnd, msgs );
        case SclPackage.DOI__SDI:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSDI() ).basicAdd( otherEnd, msgs );
        case SclPackage.DOI__REFERS_TO_DO:
            if( refersToDO != null ) {
                msgs = ( ( InternalEObject ) refersToDO ).eInverseRemove( this, SclPackage.DO__REFERRED_BY_DOI,
                        DO.class, msgs );
            }
            return basicSetRefersToDO( ( DO ) otherEnd, msgs );
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
        case SclPackage.DOI__PARENT_ANY_LN:
            return basicSetParentAnyLN( null, msgs );
        case SclPackage.DOI__DAI:
            return ( ( InternalEList< ? > ) getDAI() ).basicRemove( otherEnd, msgs );
        case SclPackage.DOI__SDI:
            return ( ( InternalEList< ? > ) getSDI() ).basicRemove( otherEnd, msgs );
        case SclPackage.DOI__REFERS_TO_DO:
            return basicUnsetRefersToDO( msgs );
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
        case SclPackage.DOI__PARENT_ANY_LN:
            return eInternalContainer().eInverseRemove( this, SclPackage.ANY_LN__DOI, AnyLN.class, msgs );
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
        case SclPackage.DOI__NAMESPACE:
            return getNamespace();
        case SclPackage.DOI__IX:
            return getIx();
        case SclPackage.DOI__PARENT_ANY_LN:
            return getParentAnyLN();
        case SclPackage.DOI__DAI:
            return getDAI();
        case SclPackage.DOI__SDI:
            return getSDI();
        case SclPackage.DOI__ACCESS_CONTROL:
            return getAccessControl();
        case SclPackage.DOI__NAME:
            return getName();
        case SclPackage.DOI__REFERS_TO_DO:
            return getRefersToDO();
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
        case SclPackage.DOI__IX:
            setIx( ( Integer ) newValue );
            return;
        case SclPackage.DOI__PARENT_ANY_LN:
            setParentAnyLN( ( AnyLN ) newValue );
            return;
        case SclPackage.DOI__DAI:
            getDAI().clear();
            getDAI().addAll( ( Collection< ? extends DAI > ) newValue );
            return;
        case SclPackage.DOI__SDI:
            getSDI().clear();
            getSDI().addAll( ( Collection< ? extends SDI > ) newValue );
            return;
        case SclPackage.DOI__ACCESS_CONTROL:
            setAccessControl( ( String ) newValue );
            return;
        case SclPackage.DOI__NAME:
            setName( ( String ) newValue );
            return;
        case SclPackage.DOI__REFERS_TO_DO:
            setRefersToDO( ( DO ) newValue );
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
        case SclPackage.DOI__IX:
            unsetIx();
            return;
        case SclPackage.DOI__PARENT_ANY_LN:
            setParentAnyLN( ( AnyLN ) null );
            return;
        case SclPackage.DOI__DAI:
            unsetDAI();
            return;
        case SclPackage.DOI__SDI:
            unsetSDI();
            return;
        case SclPackage.DOI__ACCESS_CONTROL:
            unsetAccessControl();
            return;
        case SclPackage.DOI__NAME:
            unsetName();
            return;
        case SclPackage.DOI__REFERS_TO_DO:
            unsetRefersToDO();
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
        case SclPackage.DOI__NAMESPACE:
            return NAMESPACE_EDEFAULT == null ? getNamespace() != null : !NAMESPACE_EDEFAULT.equals( getNamespace() );
        case SclPackage.DOI__IX:
            return isSetIx();
        case SclPackage.DOI__PARENT_ANY_LN:
            return getParentAnyLN() != null;
        case SclPackage.DOI__DAI:
            return isSetDAI();
        case SclPackage.DOI__SDI:
            return isSetSDI();
        case SclPackage.DOI__ACCESS_CONTROL:
            return isSetAccessControl();
        case SclPackage.DOI__NAME:
            return isSetName();
        case SclPackage.DOI__REFERS_TO_DO:
            return isSetRefersToDO();
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
            case SclPackage.DOI__NAMESPACE:
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
                return SclPackage.DOI__NAMESPACE;
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
        result.append( ", accessControl: " );
        if( accessControlESet ) {
            result.append( accessControl );
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
        //@formatter:off

        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(), "DOIImpl.doBuildExplicitLinks()" );

        // see Issue #13
        super.doBuildExplicitLinks( console );

        String messagePrefix = "while resolving link from DOI: ";

        // No error or warning message here: if this happens, error should have been detected before
        if( ( getName() == null ) || getName().isEmpty() || ( getParentAnyLN() == null ) || ( getParentAnyLN().getRefersToLNodeType() == null ) ) {
            return;
        }
        console.debug( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                messagePrefix, "found LNodeType on line ",
                getParentAnyLN().getRefersToLNodeType().getLineNumber() );

        List< DO > res = getParentAnyLN()
                .getRefersToLNodeType()
                .getDO()
                .stream()
                .filter( d -> getName().equals( d.getName() ) )
                .collect( Collectors.toList() );

        if( res.size() != 1 ) {
            // console.warning( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
            //         messagePrefix, ( ( res.size() == 0 ) ? "cannot find" : "found several" ),
            //         " DO( name = ", getName(), " )" );
            return;
        }
        setRefersToDO( res.get( 0 ) );
        console.info( EXPLICIT_LINK_CATEGORY, getFilename(), getLineNumber(),
                "DOI refers to DO( name = ", getName(), " ) on line ", getRefersToDO().getLineNumber() );

        //@formatter:on
    }

    @Override
    public String getXpath() {
        if( getParentAnyLN().getDOI().size() == 1 ) {
            return getParentAnyLN().getXpath() + "/scl:DOI";
        }
        return getParentAnyLN().getXpath() + "/scl:DOI[@name='" + getName() + "']";
    }

} //DOIImpl
