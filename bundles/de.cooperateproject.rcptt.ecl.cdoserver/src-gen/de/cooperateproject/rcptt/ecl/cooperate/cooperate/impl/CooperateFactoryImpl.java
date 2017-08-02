/**
 */
package de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl;

import de.cooperateproject.rcptt.ecl.cooperate.cooperate.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CooperateFactoryImpl extends EFactoryImpl implements CooperateFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CooperateFactory init() {
        try {
            CooperateFactory theCooperateFactory = (CooperateFactory)EPackage.Registry.INSTANCE.getEFactory(CooperatePackage.eNS_URI);
            if (theCooperateFactory != null) {
                return theCooperateFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CooperateFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CooperateFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case CooperatePackage.START_COOPERATE_REPOSITORY: return createStartCooperateRepository();
            case CooperatePackage.STOP_COOPERATE_REPOSITORY: return createStopCooperateRepository();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StartCooperateRepository createStartCooperateRepository() {
        StartCooperateRepositoryImpl startCooperateRepository = new StartCooperateRepositoryImpl();
        return startCooperateRepository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StopCooperateRepository createStopCooperateRepository() {
        StopCooperateRepositoryImpl stopCooperateRepository = new StopCooperateRepositoryImpl();
        return stopCooperateRepository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CooperatePackage getCooperatePackage() {
        return (CooperatePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CooperatePackage getPackage() {
        return CooperatePackage.eINSTANCE;
    }

} //CooperateFactoryImpl
