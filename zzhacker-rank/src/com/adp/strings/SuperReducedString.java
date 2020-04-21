package com.adp.strings;

import java.util.Scanner;

public class SuperReducedString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean changed = true;
		while(changed) {
			changed = false;
			for(int i=0; i< str.length()-1; i++) {
				if(str.charAt(i) == str.charAt(i+1)) {
					str = str.substring(0, i) + str.substring(i+2);
					changed = true;
					System.out.println(str);
					break;
				}
			}
		}
		
	}

}
