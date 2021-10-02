package com.rajat.dp.decorator.parttwo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringNewLineDecorator implements StringDecorator{

	private StringDecorator decorator;
	
	public StringNewLineDecorator(StringDecorator decorator) {
		this.decorator=decorator;
	}
	@Override
	public String display() {
		String text = decorator.display();
		String[] list = text.split(",");
		return Arrays.stream(list).map(l -> l+"\n").collect(Collectors.joining());
	}

}
