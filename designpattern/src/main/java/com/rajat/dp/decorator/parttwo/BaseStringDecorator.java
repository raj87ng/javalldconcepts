package com.rajat.dp.decorator.parttwo;

import java.util.List;
import java.util.stream.Collectors;


public class BaseStringDecorator implements StringDecorator {

	private List<String> text;
	
	public BaseStringDecorator(DisplayString ds) {
		this.text = ds.getStringsToDisplay();
	}
	
	@Override
	public String display() {
		return text.stream().map(d -> d + ",").collect(Collectors.joining());

	}

	/*
	 * public static void main(String[] args) { List<String> a = new
	 * ArrayList<String>(); a.add("abcdftg"); a.add("ffssss"); BaseStringDecorator b
	 * = new BaseStringDecorator(a); System.out.println(" Text is "+b.display()); }
	 */
}
