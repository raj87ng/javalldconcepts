package com.rajat.dp.decorator.partone;

import java.math.BigDecimal;

public class CheeseDecorator extends SandwichDecorator{

	IndianSandwich currentSandwich;
	   
    public CheeseDecorator(IndianSandwich sw){
        currentSandwich = sw;
    }
   
    @Override
    public String getDescription(){
        return currentSandwich.getDescription() + ", Cheese";
    }


	@Override
	public BigDecimal cost() {
		return currentSandwich.cost().add(new BigDecimal("1.50"));
	}

}
