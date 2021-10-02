package com.rajat.dp.decorator.parttwo;

import java.util.ArrayList;
import java.util.List;


public class DisplayStringImpl implements DisplayString{

	private List<String> text;
	
	@Override
	public List<String> getStringsToDisplay() {
		return text;
	}
	
	
	public void addStringToDisplay(final List<String> textToAdd) {
		if (this.text == null) {
			this.text = new ArrayList<String>();
		}
		this.text.addAll(textToAdd);
	}

}
