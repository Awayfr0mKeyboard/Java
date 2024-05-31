package api_practice;

import java.util.Scanner;



public class Practice03StringCaseExample {
	
	public static void main(String[] args) {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		
		System.out.println("문자나 숫자를 입력해 주세요.");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
				
		System.out.println("입력받은 문자 : " + str);
		// String lowerStr = str.toLowerCase();
		
		boolean charsContain = chars.contains(str);
		boolean numbersContain = numbers.contains(str);
		
		
		System.out.println("영어문자 : " + charsContain);
		System.out.println("숫자 : " + numbersContain);
		
		/*
		if (charsContain) {
		
		} else {
			charsContain = chars.contains(str);
			System.out.println("영어문자 : " + contain);
			contain = numbers.contains(str);
			System.out.println("숫자 : " + contain);	
		}
		String lowerStr = str.toLowerCase();
		*/
			
	
	}

}








