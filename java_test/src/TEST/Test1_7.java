package TEST;

import java.util.Scanner;

public class Test1_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;	// 총합
		int sum1 = 0;	// 배수 합
		
		System.out.println("숫자를 입력하세요 > ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (i % 3 == 0) {
				sum1 += i;
			}
		} // for end
		System.out.println("1부터 " + num + "까지의 총 합계 : " + sum);
		System.out.println("1부터 " + num + "까지의 3의 배수의 총 합계: " + sum1);
		
	} // main end
	
} // class end
