package com.adp.strings;

import java.util.Scanner;

public class SuperReducedString1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		boolean changed = true;
		while(changed) {
			changed = false;
			for(int i=0; i<input.length()-1; i++) {
				if(input.charAt(i) == input.charAt(i+1)) {
					input = input.substring(0, i) + input.substring(i+2);
					changed = true;
					System.out.println(input);
					break;
				}
			}
		}
	}

}
