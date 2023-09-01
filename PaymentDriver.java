package com.jsp.Interface;

public class PaymentDriver {

	public static void main(String[] args) {
		PhonePay pay = new PhonePay();
		pay.cancelPayment();
		pay.checkBalance();
		pay.printTransaction();
		pay.makePayment();

	}

}
