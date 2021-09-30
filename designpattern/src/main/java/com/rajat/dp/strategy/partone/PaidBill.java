package com.rajat.dp.strategy.partone;

public class PaidBill {

	private CreditCard creditCard;
	
	public PaidBill(CreditCard card) {
		this.creditCard = card;
	}
	
	public void billPaid(int amount) {
		creditCard.payBill(amount);
	}
}
