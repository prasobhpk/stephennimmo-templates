package nimmo.template.hazelcast.object;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

public class MarketDataPrice extends AbstractEntity {
	
	private static final long serialVersionUID = 4705826887019434430L;
	
	private String symbol;
	private BigDecimal price;
	private Calendar calendar;
	
	public MarketDataPrice() {
	}
	
	public MarketDataPrice(String symbol, BigDecimal price, Calendar calendar) {
		this.symbol = symbol;
		this.price = price;
		this.calendar = calendar;
	}

	public Serializable getKey() {
		return symbol;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
}
