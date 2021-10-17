package com.rajat.dp.chainofresponsibility.parttwo;

public class FiftyCheckout extends AmountWithdraw {

	@Override
	public void dispense(Amount amount) {
		if (amount != null) {
			int money = amount.getAmount();
			int remainder = money;
			if (money >= 50) {
				int count = money / 50;
				remainder = money % 50;
				System.out.printf("Dispensing '%d' 50 Rs currency note.\n", count);
			}
			if (remainder > 0 && this.nextDispenserProcessor != null) {
				this.nextDispenserProcessor.dispense(new Amount(remainder));
			}
		}
		
	}

}
