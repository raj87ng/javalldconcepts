package com.rajat.dp.decorator.partone;

import java.math.BigDecimal;

public class CornDecorator extends SandwichDecorator{

	IndianSandwich currentSandwich;
	   
    public CornDecorator(IndianSandwich sw){
        currentSandwich = sw;
    }
   
    @Override
    public String getDescription(){
        return currentSandwich.getDescription() + ", Corn";
    }


	@Override
	public BigDecimal cost() {
		return currentSandwich.cost().add(new BigDecimal("1.0"));
	}

}
