package com.rajat.dp.chainofresponsibility.parttwo;

public class TwentyCheckout extends AmountWithdraw {

	@Override
	public void dispense(Amount amount) {
		if (amount != null) {
			int money = amount.getAmount();
			int remainder = money;
			if (money >= 20) {
				int count = money / 20;
				remainder = money % 20;
				System.out.printf("Dispensing '%d' 20 Rs currency note.\n", count);
			}
			if (remainder > 0 && this.nextDispenserProcessor != null) {
				this.nextDispenserProcessor.dispense(new Amount(remainder));
			}
		}
		
	}

}
