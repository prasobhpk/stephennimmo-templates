package com.codemkr.etrm.fixserver.quickfixj;

import org.springframework.stereotype.Component;

import quickfix.Application;
import quickfix.DoNotSend;
import quickfix.FieldNotFound;
import quickfix.IncorrectDataFormat;
import quickfix.IncorrectTagValue;
import quickfix.Message;
import quickfix.MessageCracker;
import quickfix.RejectLogon;
import quickfix.SessionID;
import quickfix.UnsupportedMessageType;

@Component
public class DefaultApplication extends MessageCracker implements Application {

	public void fromAdmin(Message message, SessionID arg1) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, RejectLogon {
		
	}

	public void fromApp(Message arg0, SessionID arg1) throws FieldNotFound, IncorrectDataFormat, IncorrectTagValue, UnsupportedMessageType {
		
	}

	public void onCreate(SessionID arg0) {
		
	}

	public void onLogon(SessionID arg0) {
		
	}

	public void onLogout(SessionID arg0) {
		
	}

	public void toAdmin(Message arg0, SessionID arg1) {
		
	}

	public void toApp(Message arg0, SessionID arg1) throws DoNotSend {
		
	}

}
