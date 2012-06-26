package com.codemkr.etrm.fixserver.quickfixj;

import java.io.FileNotFoundException;
import java.util.Map;

import javax.management.JMException;

import org.quickfixj.jmx.JmxExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import quickfix.Acceptor;
import quickfix.Application;
import quickfix.ConfigError;
import quickfix.Connector;
import quickfix.DefaultMessageFactory;
import quickfix.DefaultSessionFactory;
import quickfix.FileLogFactory;
import quickfix.FileStoreFactory;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;
import quickfix.RuntimeError;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionSettings;
import quickfix.ThreadedSocketAcceptor;

import com.codemkr.etrm.core.object.FixConnection;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

@Component
public class FixServer { 
	
	@Autowired
	HazelcastInstance hazelcastInstance;
	
	private Map<SessionID, Connector> connectors;
	
    public static void main(String[] args) throws RuntimeError, ConfigError, FileNotFoundException, JMException {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-sharproute-server.xml");
        FixServer server = applicationContext.getBean("fixServer", FixServer.class);
        server.initializeFixConnections();
    }
    
    private void initializeFixConnections() throws RuntimeError, ConfigError, FileNotFoundException, JMException {
    	IMap<Long, FixConnection> map = hazelcastInstance.getMap(FixConnection.class.getSimpleName());
    	SessionSettings sessionSettings = new SessionSettings();
    	sessionSettings.setString(Session.SETTING_USE_DATA_DICTIONARY, "N");
    	sessionSettings.setString("FileStorePath", "./store/");
    	sessionSettings.setString("FileLogPath", "./logs/");
    	sessionSettings.setString("ResetOnLogon", "Y");
    	sessionSettings.setString("StartTime", "01:30:00 US/Eastern");
    	sessionSettings.setString("EndTime", "23:33:00 US/Eastern");
    	for (FixConnection fixConnection : map.values()) {
    		SessionID sessionID = new SessionID(fixConnection.getFixVersion(), fixConnection.getSenderCompId(), fixConnection.getTargetCompId());
    		sessionSettings.setString(sessionID, DefaultSessionFactory.SETTING_CONNECTION_TYPE, fixConnection.getConnectionType());
    		sessionSettings.setString(sessionID, SessionSettings.BEGINSTRING, fixConnection.getFixVersion());
    		sessionSettings.setString(sessionID, SessionSettings.SENDERCOMPID, fixConnection.getSenderCompId());
    		sessionSettings.setString(sessionID, SessionSettings.TARGETCOMPID, fixConnection.getTargetCompId());
    		sessionSettings.setString(sessionID, Acceptor.SETTING_SOCKET_ACCEPT_ADDRESS, fixConnection.getAcceptAddress());
    		sessionSettings.setLong(sessionID, Acceptor.SETTING_SOCKET_ACCEPT_PORT, fixConnection.getPort());
    		sessionSettings.setLong(sessionID, Session.SETTING_HEARTBTINT, fixConnection.getHeartbeatInterval());
        	sessionSettings.setLong(sessionID, "ReconnectInterval", fixConnection.getReconnectInterval());        	
		}
    	MessageStoreFactory storeFactory = new FileStoreFactory(sessionSettings);
	    MessageFactory messageFactory = new DefaultMessageFactory();
	    LogFactory logFactory = new FileLogFactory(sessionSettings);
	    Application application = new DefaultApplication();
        Acceptor acceptor = new ThreadedSocketAcceptor(application, storeFactory, sessionSettings, logFactory, messageFactory);
        JmxExporter jmxExporter = new JmxExporter();
        jmxExporter.export(acceptor);
        acceptor.start();    	
    }
    
}
