package de.cooperateproject.rcptt.ecl.cooperate.repository.service.impl;

import org.apache.activemq.broker.BrokerService;

import de.cooperateproject.rcptt.ecl.cooperate.constants.RepositoryConstants;

public class MessageServer {
    private static BrokerService brokerInstance;

    private MessageServer() {
        // empty implementation
    }
    
    public static void startBroker() throws RuntimeException {
        try {
            if (brokerInstance == null) {
                BrokerService broker = createBroker("CooperateRepositoryMessageBroker", RepositoryConstants.HOST_NAME, RepositoryConstants.MSG_PORT);
                brokerInstance = broker;
            }
            if (!brokerInstance.isStarted()) {
                brokerInstance.start();
            }
        } catch (Exception e) {
            throw new RuntimeException("Could not initialize and start message broker.", e);
        }
    }

    public static void stopBroker() throws RuntimeException {
        try {           
            if (brokerInstance != null && brokerInstance.isStarted()) {
                if (!brokerInstance.isStopping()) {
                    brokerInstance.stop();
                }
                brokerInstance.waitUntilStopped();
                brokerInstance = null;
            }
        } catch (Exception e) {
            throw new RuntimeException("Could not stop message broker.", e);
        }
    }

    private static BrokerService createBroker(String name, String host, int port) throws Exception {
        BrokerService broker = new BrokerService();
        broker.setBrokerName(name);
        broker.addConnector(String.format("tcp://%s:%d", host, port));
        broker.setUseShutdownHook(true);
        broker.setUseJmx(true);
        broker.setPersistent(false);
        return broker;
    }
}
