package com.adp.chapter1;

public class LcmandGcd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 4, 2,  4 };
		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result = gcd(arr[i], result);
		}

		System.out.println(result); //remainder
		//System.out.println(2 / 3); //quotient
		
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) //remainder becomes 0
			return a;
		return gcd(b, a % b);
	}

}
