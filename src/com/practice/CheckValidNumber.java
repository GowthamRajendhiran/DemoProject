package com.practice;

import java.util.Scanner;

public class CheckValidNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		String number = sc.nextLine();
		boolean sg = checkValidNumber(number);
		if(sg)
			System.out.println("valid number");
		else
			System.out.println("Invalid number");
	}
	static boolean checkValidNumber(String number) {
		char[] rs=number.toCharArray();
		for(int i = 0 ; i < rs.length; i++) {
			if(rs.length==10 && (rs[0]=='6'||rs[0]=='7'||rs[0]=='8'||rs[0]=='9'))

				return true;
		}
		return false;	

	}
}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Number");
//		int number = sc.nextInt();
//		int[] rs = new int[number];
//		System.out.println("Enter the "+number+" digit number");
//		for(int i = 0 ; i < rs.length ; i++) {
//			rs[i] = sc.nextInt();
//		}
//		checkValidNumber(rs);
//	}
//	static void checkValidNumber(int[] rs) {
//		for(int i = 0 ; i < rs.length; i++) {
//			if((rs.length==10) && (rs[0]==6||rs[0]==7||rs[0]==8||rs[0]==9))
//				System.out.println("valid number");
//			else
//				System.out.println("Invalid number");
//		}

//	}
//
//}