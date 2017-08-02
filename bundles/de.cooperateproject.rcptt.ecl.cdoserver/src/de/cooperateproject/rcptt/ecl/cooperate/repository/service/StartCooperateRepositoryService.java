package de.cooperateproject.rcptt.ecl.cooperate.repository.service;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.rcptt.ecl.core.Command;
import org.eclipse.rcptt.ecl.runtime.ICommandService;
import org.eclipse.rcptt.ecl.runtime.IProcess;

import de.cooperateproject.rcptt.ecl.cooperate.repository.service.impl.EmbeddedCdoServer;
import de.cooperateproject.rcptt.ecl.cooperate.repository.service.impl.MessageServer;

public class StartCooperateRepositoryService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context) throws InterruptedException, CoreException {
		EmbeddedCdoServer.getInstance().start();
		MessageServer.startBroker();
		return Status.OK_STATUS;
	}

}
