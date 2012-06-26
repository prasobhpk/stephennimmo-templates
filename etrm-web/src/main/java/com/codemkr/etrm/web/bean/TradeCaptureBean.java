package com.codemkr.etrm.web.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codemkr.etrm.core.service.TradeService;

@ManagedBean
@SessionScoped
@Component
public class TradeCaptureBean extends AbstractBean {
	
	@Autowired
	TradeService tradeService;
	
	

}
