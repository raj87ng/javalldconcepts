package com.rajat.dp.decorator.partone;

import java.math.BigDecimal;

public class WhiteBreadSandwich extends IndianSandwich{

	
	public WhiteBreadSandwich(String desc){
	       description = desc;
	    }
	
	
	@Override
	public BigDecimal cost() {
		return new BigDecimal("3.0");
	}

}
