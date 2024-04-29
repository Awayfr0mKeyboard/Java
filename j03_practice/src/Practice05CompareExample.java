import java.util.Scanner;

public class Practice05CompareExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		
		System.out.println("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		
		if (first > second) {
			System.out.println("큰 수는 : " + first);
		} else {
			// first <= second
			System.out.println("큰 수는 : " + second);
		}
		
		// 변수를 사용한다면
		int max = 0;
		if (first > second) {
			max = first;
		} else {
			max = second;
		}
		System.out.println("큰 수는 : " + max);
		
		// 삼항연산자
		max = (first > second) ? first : second;
		System.out.println("큰 수는 : " + max);
	} // main end
} // class end
