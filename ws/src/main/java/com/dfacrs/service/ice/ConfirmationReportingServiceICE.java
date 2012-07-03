package com.dfacrs.service.ice;

import java.io.InputStream;
import java.io.StringWriter;

import javax.annotation.PostConstruct;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.cxf.jaxrs.client.WebClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dfacrs.object.Trade;
import com.dfacrs.object.TradeValuation;
import com.dfacrs.repository.TradeRepository;
import com.dfacrs.service.ConfirmationReportingService;
import com.dfacrs.service.ConversionService;

@Service("ICE")
public class ConfirmationReportingServiceICE implements ConfirmationReportingService {
	
	private static Logger logger = LoggerFactory.getLogger(ConfirmationReportingServiceICE.class);
	
	@Autowired
	TradeRepository tradeRepository;
	
	@Autowired
	ConversionService conversionService;
	
	@Value("${ice.url}")
	private String url;
	@Value("${ice.batchid}")
	private String batchId;
	@Value("${ice.login}")
	private String login;
	@Value("${ice.password}")
	private String password;
	
	JAXBContext context;
	private MultivaluedMap<String, Object> map;
	
	public ConfirmationReportingServiceICE() throws JAXBException {
		context = JAXBContext.newInstance("com.dfacrs.service.ice");
	}
	
	@PostConstruct
	public void authenticate(){
		try {
			AuthRequest authRequest = new AuthRequest();
			authRequest.setName(login);
			authRequest.setPassword(password);
			StringWriter requestXml = new StringWriter();
			context.createMarshaller().marshal(authRequest, requestXml);
			Response response =  sendRequest(1, requestXml.toString());
			map = response.getMetadata();
			InputStream inputStream = (InputStream) response.getEntity();
			AuthResponse authResponse = (AuthResponse)context.createUnmarshaller().unmarshal(inputStream);
			authResponse.toString();
			//TODO Send to eConfirm
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	private Response sendRequest(int requestType, String requestValue) {
		WebClient webClient = WebClient.create(url);
		webClient.accept("text/xml");
		webClient.query("requestType", requestType);
		webClient.query("requestValue", requestValue);
		return webClient.get();
	}
	
	@Override
	public Trade handleTradeExecution(Trade trade)  {
		logger.info(trade.toString());
		trade = tradeRepository.save(trade);
		return trade;
	}
	
	@Override
	public Trade handleTradeConfirmation(Trade trade) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public TradeValuation handleTradeValuation(TradeValuation tradeValuation) {
		// TODO Auto-generated method stub
		return null;
	}

}
