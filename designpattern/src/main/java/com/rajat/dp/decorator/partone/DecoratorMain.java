package com.rajat.dp.decorator.partone;

public class DecoratorMain {

	public static void main(String[] args) {
		IndianSandwich mySandwich = new WhiteBreadSandwich("White bread Sandwich");
        System.out.printf("Price of %s is $%.2f %n", mySandwich.getDescription(), mySandwich.cost());
       
        //adding extra cheese using Decorator Pattern
        mySandwich = new CheeseDecorator(mySandwich);
        System.out.printf("Price of %s is $%.2f %n", mySandwich.getDescription(),mySandwich.cost()); 

        /**
         * Brown Bread with Cheese and corn                                            
         */
        IndianSandwich brownSandwich = new BrownBreadSandwich("Brown bread Sandwich");
        System.out.printf("Price of %s is $%.2f %n", brownSandwich.getDescription(), brownSandwich.cost());
       
        //adding extra cheese using Decorator Pattern
        brownSandwich = new CheeseDecorator(brownSandwich);
        brownSandwich = new CornDecorator(brownSandwich);
        System.out.printf("Price of %s is $%.2f %n", brownSandwich.getDescription(),brownSandwich.cost());


        /*
         * OutPut is : 
         * 
         * Price of White bread Sandwich is $3.00 
		   Price of White bread Sandwich, Cheese is $4.50 
		   Price of Brown bread Sandwich is $5.00 
		   Price of Brown bread Sandwich, Cheese, Corn is $7.50 
         */
	}
}
