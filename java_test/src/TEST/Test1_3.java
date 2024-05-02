package TEST;

import java.util.Scanner;

public class Test1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		
		if (number == 0) {
			System.out.println("입력한 수는 0입니다.");
		} else if (number > 0) {
			System.out.println("입력한 수는 양수입니다.");
		} else {
			System.out.println("입력한 수는 음수입니다.");
		} // if end
		
	} // main end
	
} // class end
