/**
 */
package de.cooperateproject.rcptt.ecl.cooperate.cooperate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.rcptt.ecl.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.CooperateFactory
 * @model kind="package"
 * @generated
 */
public interface CooperatePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "cooperate";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://cooperateproject.de/rcptt/ecl/cooperate.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "de.cooperateproject.rcptt.ecl.cooperate";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CooperatePackage eINSTANCE = de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.CooperatePackageImpl.init();

    /**
     * The meta object id for the '{@link de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.StartCooperateRepositoryImpl <em>Start Cooperate Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.StartCooperateRepositoryImpl
     * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.CooperatePackageImpl#getStartCooperateRepository()
     * @generated
     */
    int START_COOPERATE_REPOSITORY = 0;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_COOPERATE_REPOSITORY__HOST = CorePackage.COMMAND__HOST;

    /**
     * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_COOPERATE_REPOSITORY__BINDINGS = CorePackage.COMMAND__BINDINGS;

    /**
     * The number of structural features of the '<em>Start Cooperate Repository</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int START_COOPERATE_REPOSITORY_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.StopCooperateRepositoryImpl <em>Stop Cooperate Repository</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.StopCooperateRepositoryImpl
     * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.CooperatePackageImpl#getStopCooperateRepository()
     * @generated
     */
    int STOP_COOPERATE_REPOSITORY = 1;

    /**
     * The feature id for the '<em><b>Host</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_COOPERATE_REPOSITORY__HOST = CorePackage.COMMAND__HOST;

    /**
     * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_COOPERATE_REPOSITORY__BINDINGS = CorePackage.COMMAND__BINDINGS;

    /**
     * The number of structural features of the '<em>Stop Cooperate Repository</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STOP_COOPERATE_REPOSITORY_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link de.cooperateproject.rcptt.ecl.cooperate.cooperate.StartCooperateRepository <em>Start Cooperate Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Start Cooperate Repository</em>'.
     * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.StartCooperateRepository
     * @generated
     */
    EClass getStartCooperateRepository();

    /**
     * Returns the meta object for class '{@link de.cooperateproject.rcptt.ecl.cooperate.cooperate.StopCooperateRepository <em>Stop Cooperate Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Stop Cooperate Repository</em>'.
     * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.StopCooperateRepository
     * @generated
     */
    EClass getStopCooperateRepository();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    CooperateFactory getCooperateFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.StartCooperateRepositoryImpl <em>Start Cooperate Repository</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.StartCooperateRepositoryImpl
         * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.CooperatePackageImpl#getStartCooperateRepository()
         * @generated
         */
        EClass START_COOPERATE_REPOSITORY = eINSTANCE.getStartCooperateRepository();

        /**
         * The meta object literal for the '{@link de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.StopCooperateRepositoryImpl <em>Stop Cooperate Repository</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.StopCooperateRepositoryImpl
         * @see de.cooperateproject.rcptt.ecl.cooperate.cooperate.impl.CooperatePackageImpl#getStopCooperateRepository()
         * @generated
         */
        EClass STOP_COOPERATE_REPOSITORY = eINSTANCE.getStopCooperateRepository();

    }

} //CooperatePackage
