package com.consumidorsoap.bindings;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NumberToDollars")
public class NumberToDollars {
    
    private double dNum;

    public void setDNum(double dNum) {
        this.dNum = dNum;
    }

    @XmlElement(name = "dNum")
	public double getdNum() {
		return dNum;
	}
    
}

