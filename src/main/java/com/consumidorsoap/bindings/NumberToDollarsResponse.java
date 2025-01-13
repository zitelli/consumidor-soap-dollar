package com.consumidorsoap.bindings;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NumberToDollarsResponse")
public class NumberToDollarsResponse {
	private String numberToDollarsResult;
	
	@XmlElement(name = "NumberToDollarsResult")
	public String getNumberToDollarsResult() {
	    return numberToDollarsResult;
	}
	
	public void setNumberToDollarsResult(String numberToDollarsResult) {
	    this.numberToDollarsResult = numberToDollarsResult;
	}
	
	
}