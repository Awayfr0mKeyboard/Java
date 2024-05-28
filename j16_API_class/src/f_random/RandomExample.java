package f_random;

import java.util.Random;

/**
 * Random Class
 * int, double, boolean 타입의 무작위 값을 출력하는 class
 * 객체 생성 시 생성자의 매개변수로 seed 값이 결정되며
 * seed 값이 일치하면 동일한 패턴으로 난수가 발생됨.
 */
public class RandomExample {

	public static void main(String[] args) {
		
		// 1970년 1월 1일 목요일 09:00:00 부터 시작된 컴퓨터 시간을 1 / 1000 초로 반환
		long millisTime = System.currentTimeMillis();
		System.out.println(millisTime);
		// 1716873565429
		// 1716873586206
		
		// 10억분의 1초 나노 second(1 / 1000000000);
		long startTime = System.nanoTime();
		
		Random random = new Random();		// import 추가
		random = new Random(5);	// seed 값을 5로 지정
		for (int i = 0; i < 6; i++) {
			// 0 <= ~~~ < 45
			int result = random.nextInt(45) + 1;
			System.out.println(result + " ");
		}
		
		System.out.println("==========================");
		random = new Random(System.nanoTime());
		for (int i = 0; i < 10; i++) {
			System.out.println("==========================");
			// ture or false
			System.out.println(random.nextBoolean());	// boolean
			// -2(32승) ~ 2(32승)-1, int 정수값 범위의 랜덤한 정수
			System.out.println(random.nextInt());
			// 0 <= ~~~ < n
			System.out.println(random.nextInt(100));
			// 0.0 <= ~~~ < 1.0
			System.out.println(random.nextDouble());
			System.out.println("==========================");
		}
		
	}

}
