package com.rajat.dp.chainofresponsibility.parttwo;

public class HundredCheckout extends AmountWithdraw{

	@Override
	public void dispense(Amount amount) {
		if (amount != null) {
			int money = amount.getAmount();
			int remainder = money;
			if (money >= 100) {
				int count = money / 100;
				remainder = money % 100;
				System.out.printf("Dispensing '%d' 100 Rs currency note.\n", count);
			}
			if (remainder > 0 && this.nextDispenserProcessor != null) {
				this.nextDispenserProcessor.dispense(new Amount(remainder));
			}
		}
	}

}
