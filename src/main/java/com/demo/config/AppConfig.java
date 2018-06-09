package com.demo.config;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.demo.config.appconfig")
public class AppConfig {

	private boolean b;
	
	private BigDecimal i;
	
	private Date d;

	private String s;

	private List<String> l = new ArrayList<>();

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public List<String> getL() {
		return l;
	}

	public BigDecimal getI() {
		return i;
	}

	public void setI(BigDecimal i) {
		this.i = i;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}


}
