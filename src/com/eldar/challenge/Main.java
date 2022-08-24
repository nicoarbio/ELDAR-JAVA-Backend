package com.eldar.challenge;

import java.time.LocalDate;

import com.eldar.challenge.models.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number;
		String cardholder;
		LocalDate expDate;
		
		number = "0123 4567 8901 2345";
		cardholder = "Nicolás G. Arbio";
		expDate = LocalDate.of(2027, 8, 22);
		CreditCard miVisa = new VisaCreditCard(number, cardholder, expDate);		

		number = "9876 5432 1098 7654";
		cardholder = "Nicolas G. Arbio";
		expDate = LocalDate.of(2025, 8, 22);
		CreditCard miNaranja = new NaraCreditCard(number, cardholder, expDate);
				
		number = "5647 8901 2345 6789";
		cardholder = "Nicolas Arbio";
		expDate = LocalDate.of(2022, 8, 22);
		CreditCard miAmex = new AmexCreditCard(number, cardholder, expDate);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("> Credit cards information:");
		System.out.println(miVisa.getCardInformation());
		System.out.println(miNaranja.getCardInformation());
		System.out.println(miAmex.getCardInformation());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("> Performing transactions:");
		System.out.println(miVisa.doTransaction(999.9));
		System.out.println(miNaranja.doTransaction(1000));
		System.out.println(miAmex.doTransaction(1500.123));

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("> Are credit cards valid?");
		System.out.println(miVisa.isOperative());
		System.out.println(miNaranja.isOperative());
		System.out.println(miAmex.isOperative());
				
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("> Are credit cards different to each other?");
		System.out.println(miVisa.isDifferent(miAmex));
		System.out.println(miNaranja.isDifferent(miVisa));
		System.out.println(miAmex.isDifferent(miAmex));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("> Get credit cards processing fee: ($)");
		System.out.println(miVisa.getProcessingFee(500));
		System.out.println(miNaranja.getProcessingFee(500));
		System.out.println(miAmex.getProcessingFee(500));
	}

}
