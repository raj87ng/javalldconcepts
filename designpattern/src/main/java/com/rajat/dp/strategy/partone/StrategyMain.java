package com.rajat.dp.strategy.partone;

public class StrategyMain {

	
	public static void main(String[] args) {
		System.out.println(" I am Strategy Design Pattern ");
		PaidBill icici = new PaidBill(new ICICICreditCard());
		icici.billPaid(200);
		PaidBill sbi = new PaidBill(new SBICreditCard());
		sbi.billPaid(200);
	}
	
	/**
	 * OutPut :
* 2021-09-30_21:45:43.238 [main] DEBUG c.r.d.s.partone.ICICICreditCard.payBill 12 -  In ICICI payBill with amount 200
2021-09-30_21:45:43.258 [main] DEBUG c.r.d.s.partone.ICICICreditCard.payBill 15 -  In ICICI payBill with final amount 190 with discount 10
2021-09-30_21:45:43.261 [main] DEBUG c.r.d.strategy.partone.SBICreditCard.payBill 11 -  In SBI payBill with amount 200
2021-09-30_21:45:43.262 [main] DEBUG c.r.d.strategy.partone.SBICreditCard.payBill 14 -  In SBI payBill with final amount 180 with discount 20
	 * 
	 */
}

