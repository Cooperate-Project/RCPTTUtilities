/**
 */
package de.cooperateproject.rcptt.ecl.cdoserver;

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
 * @see de.cooperateproject.rcptt.ecl.cdoserver.CdoserverFactory
 * @model kind="package"
 * @generated
 */
public interface CdoserverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdoserver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cooperateproject.de/rcptt/ecl/cdoserver.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.cooperateproject.rcptt.ecl.cdoserver";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CdoserverPackage eINSTANCE = de.cooperateproject.rcptt.ecl.cdoserver.impl.CdoserverPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cooperateproject.rcptt.ecl.cdoserver.impl.StartCdoServerImpl <em>Start Cdo Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.rcptt.ecl.cdoserver.impl.StartCdoServerImpl
	 * @see de.cooperateproject.rcptt.ecl.cdoserver.impl.CdoserverPackageImpl#getStartCdoServer()
	 * @generated
	 */
	int START_CDO_SERVER = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CDO_SERVER__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CDO_SERVER__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Start Cdo Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_CDO_SERVER_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.cooperateproject.rcptt.ecl.cdoserver.impl.StopCdoServerImpl <em>Stop Cdo Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cooperateproject.rcptt.ecl.cdoserver.impl.StopCdoServerImpl
	 * @see de.cooperateproject.rcptt.ecl.cdoserver.impl.CdoserverPackageImpl#getStopCdoServer()
	 * @generated
	 */
	int STOP_CDO_SERVER = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_CDO_SERVER__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_CDO_SERVER__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Stop Cdo Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_CDO_SERVER_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.cooperateproject.rcptt.ecl.cdoserver.StartCdoServer <em>Start Cdo Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Cdo Server</em>'.
	 * @see de.cooperateproject.rcptt.ecl.cdoserver.StartCdoServer
	 * @generated
	 */
	EClass getStartCdoServer();

	/**
	 * Returns the meta object for class '{@link de.cooperateproject.rcptt.ecl.cdoserver.StopCdoServer <em>Stop Cdo Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Cdo Server</em>'.
	 * @see de.cooperateproject.rcptt.ecl.cdoserver.StopCdoServer
	 * @generated
	 */
	EClass getStopCdoServer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CdoserverFactory getCdoserverFactory();

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
		 * The meta object literal for the '{@link de.cooperateproject.rcptt.ecl.cdoserver.impl.StartCdoServerImpl <em>Start Cdo Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.rcptt.ecl.cdoserver.impl.StartCdoServerImpl
		 * @see de.cooperateproject.rcptt.ecl.cdoserver.impl.CdoserverPackageImpl#getStartCdoServer()
		 * @generated
		 */
		EClass START_CDO_SERVER = eINSTANCE.getStartCdoServer();
		/**
		 * The meta object literal for the '{@link de.cooperateproject.rcptt.ecl.cdoserver.impl.StopCdoServerImpl <em>Stop Cdo Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cooperateproject.rcptt.ecl.cdoserver.impl.StopCdoServerImpl
		 * @see de.cooperateproject.rcptt.ecl.cdoserver.impl.CdoserverPackageImpl#getStopCdoServer()
		 * @generated
		 */
		EClass STOP_CDO_SERVER = eINSTANCE.getStopCdoServer();

	}

} //CdoserverPackage
