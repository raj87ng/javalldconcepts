package com.rajat.dp.chainofresponsibility.parttwo;

import lombok.Setter;

@Setter
public abstract class AmountWithdraw {

	protected AmountWithdraw nextDispenserProcessor;

	public abstract void dispense(Amount amount);
}
