package com.adp.strings;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double payment = sc.nextDouble();
		sc.close();
		
		String us = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
		System.out.println(us);
	}

}
