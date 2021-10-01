package com.rajat.dp.decorator.partone;

import java.math.BigDecimal;

public abstract class IndianSandwich {

	protected String description = "IndianSandwich";
	
	public String getDescription(){
        return description;
    }
   
    public abstract BigDecimal cost();

}
