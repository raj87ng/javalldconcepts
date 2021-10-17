package com.rajat.dp.chainofresponsibility.parttwo;

public class ATMCheckout {

	protected static AmountWithdraw hundredChekout = new HundredCheckout();
	protected static AmountWithdraw fiftyChekout = new FiftyCheckout();
	protected static AmountWithdraw twentyChekout = new TwentyCheckout();
	protected static AmountWithdraw tenChekout = new TenCheckout();
	protected static AmountWithdraw chekoutChain;
	static {
		// construct the chain of the currency dispensers in higher to lower
		// denomination
		hundredChekout.setNextDispenserProcessor(fiftyChekout);
		fiftyChekout.setNextDispenserProcessor(twentyChekout);
		twentyChekout.setNextDispenserProcessor(tenChekout);
		chekoutChain = hundredChekout;
	}

	public static void withdraw(Amount currency) {
		if (currency != null) {
			chekoutChain.dispense(currency);
		}
	}
}
