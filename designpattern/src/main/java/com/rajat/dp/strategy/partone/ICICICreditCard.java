package com.rajat.dp.strategy.partone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ICICICreditCard implements CreditCard {

	private static final Logger LOG = LoggerFactory.getLogger(ICICICreditCard.class);
	@Override
	public void payBill(int amount) {
		LOG.debug(" In ICICI payBill with amount {}",amount);
		int discount = 10;
		int totalAmount = amount - discount;
		LOG.debug(" In ICICI payBill with final amount {} with discount {}",totalAmount,discount);
	}

}
