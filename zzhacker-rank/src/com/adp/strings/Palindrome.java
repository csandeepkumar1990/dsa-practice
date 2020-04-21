package com.adp.strings;

public class Palindrome {
	//01234
	//abcba
	public static void main(String[] args) {
		String str = args[0];
		int j = str.length()-1;
		boolean isPalindrome = true;
		for (int i = 0; i < str.toCharArray().length; i++) {
			System.out.println("abc1221212");
			if(i > j) {
				break;
			}
			if(str.charAt(i) != str.charAt(j)) {
				isPalindrome = false;
			} 
			j = j-1;
		}
		
		if(isPalindrome) {
			System.out.println("is a palindrome");
		} else {
			System.out.println("is not a palindrome");
		}
			
	}

}
