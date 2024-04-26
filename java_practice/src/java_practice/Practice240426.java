package java_practice;
import java.util.Scanner;

public class Practice240426 {

	public static void main(String[] args) {
		
		// 1번
		String str = ("Hello JAVA");
		System.out.println(str);
		
		// 2번
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		double r = 3.14;
		double area = radius * radius * r;
		
		System.out.println("반지름을 입력하시오 : " + radius);
		System.out.println(area);
		
		System.out.println("===================");
		
		// 3번
		int i = 1;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("합 : " + sum);
		
		// 4번
		i = 1;
		int oddSum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				oddSum += i;
			}
		} 
		System.out.println("홀수의 합 : " + oddSum);
		
		// 5번
		int hLine = 5;
		int lLine = 10;
		int hight = 7;
		double ladder = (((hLine + lLine) * (double)hight) / 2);
		System.out.println(ladder);
		
		// 6번
		System.out.println("사원명을 입력하세요 > ");
		String name = sc.next(); // 사원명
		System.out.println("시급을 입력하세요 > ");
		int pay = sc.nextInt(); // 시급
		System.out.println("근무시간을 입력하세요 >");
		int wTime = sc.nextInt(); // 근무 시간

		System.out.println("급여명세서");
		System.out.println("사원명 : " + name);
		int salary = pay * wTime; // 급여
		System.out.println("급여 금액 : " + salary + "원");
		double deduct = salary * 0.03; // 공제액
		System.out.println("공제 금액 : " + deduct + "원");
		System.out.println("공제 금액 : " + (salary - deduct) + "원");
		
		// 8번
		int big = 0;
		System.out.print("첫 번째 정수 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int second = sc.nextInt();
		if (first > big) {
			big = first;
			if (big < second) {
				big = second;
			}
		}
		System.out.println("큰 수는 " + big);
		
		// 9번
		System.out.println("성적을 입력하시오 : ");
		int g1 = sc.nextInt();
		System.out.println("성적을 입력하시오 : ");
		int g2 = sc.nextInt();
		System.out.println("성적을 입력하시오 : ");
		int g3 = sc.nextInt();
		System.out.println("성적을 입력하시오 : ");
		int g4 = sc.nextInt();
		System.out.println("성적을 입력하시오 : ");
		int g5 = sc.nextInt();
		
		int gSum = 0;
		
	} // main end
} // class end
