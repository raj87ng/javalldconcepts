package com.rajat.dp.chainofresponsibility.parttwo;

public class TenCheckout extends AmountWithdraw{

	@Override
	public void dispense(Amount amount) {
		if (amount != null) {
			int money = amount.getAmount();
			int remainder = money;
			if (money >= 10) {
				int count = money / 10;
				remainder = money % 10;
				System.out.printf("Dispensing '%d' 10 Rs currency note.\n", count);
			}
			if (remainder > 0 && this.nextDispenserProcessor != null) {
				this.nextDispenserProcessor.dispense(new Amount(remainder));
			}
		}
		
	}

}
