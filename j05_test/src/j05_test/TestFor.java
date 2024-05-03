package j05_test;

import java.util.Scanner;

public class TestFor {

	public static void main(String[] args) {
		/*
		 반복문과 조건문을 이용하여 1부터 100까지의 정수 중에서 3의 배수만 콘솔을 통해 출력하는 
         소스코드를 작성하시오.(한 라인에 출력)
		*/
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) System.out.print(i + " ");
		} // for end
		
		// 반복문을 이용하여 구구단 중에서 7단을 출력하는 소스코드를 작성하시오.
		for (int i = 1; i < 10; i++) {
			int result = 7 * i;
			System.out.println("7 * " + i + " = " + result);
		} // for end
		
		/*
		 반복문과 출력문을 이용하여 구구단을 다음의 출력결과처럼 나오게 작성하여 프로그램 소스코드를 작성하시오.
		 (공백은 \t 이스케이프 문자 사용)
		*/
		// 단수를 표현
		for (int i = 2; i <= 9; i++) {
			for (int j = 2; j < 10; j++) {
				// System.out.print(i + " * " + j + " = " + (i * j) + "\t");
				System.out.printf("%d * %d = %2d \t", i, j, (i * j));
			}
			System.out.println();
		} // 외부 for end
		
		 /*
		 	- Scanner를 사용하여  0보다 큰 양의 정수를 입력받는다.
   			- 1에서부터 입력받은 수까지의 총 합계와 3의 배수의 합계를 구하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		// 구해야 하는 것 : 총 합계, 3의 배수의 합계
		int total, sum;
		total = sum = 0;
		
		System.out.println("숫자를 입력하세요 > ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			total += i;		// 총 합계
			if (i % 3 == 0) {
				sum += i;	// 3의 배수의 총 합계
			}
		} // for end
		System.out.printf("1부터 %d까지의 총 합계 : %d \n", num, total);
		System.out.printf("1부터 %d까지의 3의 배수의 총 합계 : %d \n", num, sum);
	} // main end
	
} // class end
