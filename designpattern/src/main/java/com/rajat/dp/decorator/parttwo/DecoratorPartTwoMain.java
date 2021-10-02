package com.rajat.dp.decorator.parttwo;

import java.util.ArrayList;
import java.util.List;

public class DecoratorPartTwoMain {

	public static void main(String[] args) {
		List<String>  list = new ArrayList<String>();
		
		list.add("Let me know");
		list.add("I know");
		
		DisplayStringImpl ds = new DisplayStringImpl();
		ds.addStringToDisplay(list);
		
		StringDecorator baseString = new BaseStringDecorator(ds);
		StringDecorator deco = new StringNewLineDecorator(baseString);
		String text = deco.display();
		System.out.println(" Text is :");
		System.out.println("----");
		System.out.println(text);
	}
	
	
	/**
	 * OutPut is : 
	 *  Text is :
	    ----
	    Let me know
	    I know
	 */
}
