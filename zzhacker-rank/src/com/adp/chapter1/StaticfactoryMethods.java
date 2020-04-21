package com.adp.chapter1;

public class StaticfactoryMethods {
	
	public static void main(String[] args) {
		Boolean trueVal = Boolean.valueOf(true);
		Boolean trueVal2 = Boolean.valueOf(true);
		//Boolean falseVal = Boolean.valueOf(false);
		System.out.println(trueVal == trueVal2);
	}

}
