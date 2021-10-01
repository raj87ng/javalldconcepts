package com.rajat.dp.decorator.partone;

import java.math.BigDecimal;

public class BrownBreadSandwich extends IndianSandwich{

	public BrownBreadSandwich(String desc){
	       description = desc;
	    }
	
	@Override
	public BigDecimal cost() {
		return new BigDecimal("5.0");
	}

}
