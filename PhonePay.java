package com.jsp.Interface;

public class PhonePay 
extends BalanceInquiry 
implements Transaction, Payment {

	public void makePayment() {
		System.out.println("Payment via phonepay");
	}
	
	public void printTransaction() {
		System.out.println("Transaction via phonepay");
	}
	
	public void checkBalance() {
		System.out.println("Check balance via phonepay");
	}
}
