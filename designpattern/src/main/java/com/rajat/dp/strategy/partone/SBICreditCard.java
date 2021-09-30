package com.rajat.dp.strategy.partone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SBICreditCard implements CreditCard {

	private static final Logger LOG = LoggerFactory.getLogger(SBICreditCard.class);
	@Override
	public void payBill(int amount) {
		LOG.debug(" In SBI payBill with amount {}",amount);
		int discount = 20;
		int totalAmount = amount - discount;
		LOG.debug(" In SBI payBill with final amount {} with discount {}",totalAmount,discount);
	}

}
