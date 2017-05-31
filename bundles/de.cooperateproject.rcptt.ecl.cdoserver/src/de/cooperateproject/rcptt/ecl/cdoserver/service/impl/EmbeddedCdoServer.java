package de.cooperateproject.rcptt.ecl.cdoserver.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.db.DBUtil;
import org.eclipse.net4j.db.IDBAdapter;
import org.eclipse.net4j.db.IDBConnectionProvider;
import org.eclipse.net4j.db.h2.H2Adapter;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.h2.jdbcx.JdbcDataSource;

public class EmbeddedCdoServer {

	private static final String ADDR = "localhost";
	private static final int PORT = 2036;

	private static EmbeddedCdoServer instance;

	public static EmbeddedCdoServer getInstance() {
		if (instance == null) {
			// Enable logging and tracing
			/*
			 * OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
			 * OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);
			 * OMPlatform.INSTANCE.setDebugging(true);
			 */

			instance = new EmbeddedCdoServer("ui-tests-repo");
		}

		return instance;
	}

	private static String getAcceptorDetailsString() {
		return ADDR + ":" + PORT;
	}

	private final String repoName;
	private IManagedContainer containerOrNull;

	public EmbeddedCdoServer(final String repoName) {
		this.repoName = repoName;
	}

	public void start() {
		// Stop server if already running to reset the data.
		if (containerOrNull != null) {
			stop();
		}
		JdbcDataSource dataSource = getJdbcDataSource("jdbc:h2:file:" + repoName);
		try {
			DBUtil.dropAllTables(dataSource.getConnection(), repoName);
		} catch (SQLException e) {
		}

		IStore cdoStore = getStore(dataSource);
		IRepository cdoRepository = getRepository(cdoStore);

		containerOrNull = getContainer();
		CDOServerUtil.addRepository(containerOrNull, cdoRepository);

		TCPUtil.getAcceptor(containerOrNull, getAcceptorDetailsString());
	}

	public void stop() {
		if (containerOrNull != null) {
			containerOrNull.deactivate();
			containerOrNull = null;
		}
	}

	private JdbcDataSource getJdbcDataSource(String url) {
		// Setup JdbcDataSource
		JdbcDataSource dataSource = new JdbcDataSource();
		dataSource.setURL(url);

		return dataSource;
	}

	private IStore getStore(JdbcDataSource dataSource) {
		// Setup Store
		IMappingStrategy mappingStrategy = CDODBUtil.createHorizontalMappingStrategy(true);
		IDBAdapter dbAdapter = new H2Adapter();
		IDBConnectionProvider dbConnectionProvider = DBUtil.createConnectionProvider(dataSource);

		return CDODBUtil.createStore(mappingStrategy, dbAdapter, dbConnectionProvider);
	}

	private IRepository getRepository(IStore store) {
		// Setup Repository
		Map<String, String> props = new HashMap<>();
		props.put(IRepository.Props.OVERRIDE_UUID, repoName);
		props.put(IRepository.Props.SUPPORTING_AUDITS, "true");
		props.put(IRepository.Props.SUPPORTING_BRANCHES, "true");
		props.put(IRepository.Props.SUPPORTING_UNITS, "false");
		props.put(IRepository.Props.CHECK_UNIT_MOVES, "false");
		props.put(IRepository.Props.ENSURE_REFERENTIAL_INTEGRITY, "false");
		props.put(IRepository.Props.ALLOW_INTERRUPT_RUNNING_QUERIES, "true");
		props.put(IRepository.Props.ID_GENERATION_LOCATION, "STORE");
		props.put(IRepository.Props.SERIALIZE_COMMITS, "false");
		props.put(IRepository.Props.OPTIMISTIC_LOCKING_TIMEOUT, "10000");

		return CDOServerUtil.createRepository(repoName, store, props);
	}

	private IManagedContainer getContainer() {
		IManagedContainer container = ContainerUtil.createContainer();
		Net4jUtil.prepareContainer(container);
		TCPUtil.prepareContainer(container);
		CDONet4jUtil.prepareContainer(container);
		CDONet4jServerUtil.prepareContainer(container);
		container.activate();

		return container;
	}
}
