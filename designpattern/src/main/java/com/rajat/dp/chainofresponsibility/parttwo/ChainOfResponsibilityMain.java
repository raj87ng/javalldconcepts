package com.rajat.dp.chainofresponsibility.parttwo;

import java.util.Scanner;

public class ChainOfResponsibilityMain {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.println(
						"Please enter amount to withdraw (multiple of 10, max 1000 Rs, Press Ctrl + C to end): ");
				int amount = scanner.nextInt();
				if (isValid(amount)) {
					ATMCheckout.withdraw(new Amount(amount));
				}

			} while (true);
		}
	}

	private static boolean isValid(int amount) {
		if (amount <= 0) {
			System.out.println("Invalid amount. Try again!");
			return false;
		} else if (amount > 1000) {
			System.out.println("Daily withdrawal limit is 1000 Rs. Try again!");
			return false;
		} else if (amount % 10 != 0) {
			System.out.println("Amount must be mutiple of 10s, Try again!");
			return false;
		}
		return true;
	}
	
	/**
	 * Please enter amount to withdraw (multiple of 10, max 1000 Rs, Press Ctrl + C to end): 
		30
		Dispensing '1' 20 Rs currency note.
		Dispensing '1' 10 Rs currency note.
		Please enter amount to withdraw (multiple of 10, max 1000 Rs, Press Ctrl + C to end): 
		
		490
		Dispensing '4' 100 Rs currency note.
		Dispensing '1' 50 Rs currency note.
		Dispensing '2' 20 Rs currency note.
		Please enter amount to withdraw (multiple of 10, max 1000 Rs, Press Ctrl + C to end): 
		
		900
		Dispensing '9' 100 Rs currency note.
		Please enter amount to withdraw (multiple of 10, max 1000 Rs, Press Ctrl + C to end): 

	 */
}
