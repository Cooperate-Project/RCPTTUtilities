package de.cooperateproject.rcptt.ecl.cdoserver.service;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.rcptt.ecl.core.Command;
import org.eclipse.rcptt.ecl.runtime.ICommandService;
import org.eclipse.rcptt.ecl.runtime.IProcess;

import de.cooperateproject.rcptt.ecl.cdoserver.EmbeddedCdoServer;

public class StartCdoServerService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		EmbeddedCdoServer.getInstance().start();

		return Status.OK_STATUS;
	}

}
