package TEST240531;

import java.util.Scanner;

public class TestClassMethod {

	public static void main(String[] args) {
		
		// 사용자에게 문자열을 입력 받아 "java"라는 문자열이 입력받은 문자열에 존재할 때 프로그램 종료
		// "java"라는 문자열이 존재하지 않을 때 다시 문자열을 입력받아 확인할 수 있도록 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true;
		
		while (isRun) {
			System.out.println("문자열을 입력해 주세요 >>");
			String str = sc.nextLine();
			
			int index = str.indexOf("java");
			
			if (index == -1) {
				System.out.println("java가 존재하지 않습니다.");
			} else {
				System.out.println("java가 존재합니다.");
				System.err.println("시스템을 종료합니다.");
				isRun = false;
			}
				
		} // end while
			
	} // end main method
	
} // end class
