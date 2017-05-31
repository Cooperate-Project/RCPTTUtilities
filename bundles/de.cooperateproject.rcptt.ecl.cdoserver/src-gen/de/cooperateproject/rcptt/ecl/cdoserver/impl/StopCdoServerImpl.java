/**
 */
package de.cooperateproject.rcptt.ecl.cdoserver.impl;

import de.cooperateproject.rcptt.ecl.cdoserver.CdoserverPackage;
import de.cooperateproject.rcptt.ecl.cdoserver.StopCdoServer;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.rcptt.ecl.core.impl.CommandImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Cdo Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StopCdoServerImpl extends CommandImpl implements StopCdoServer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopCdoServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdoserverPackage.Literals.STOP_CDO_SERVER;
	}

} //StopCdoServerImpl
