package review;

/**
 * numbsers 배열에서 가장 큰 수, 가장 작은 수 를 찾아 출력하는 Java 프로그램을 작성하세요.
 */
public class Practice03 {

	public static void main(String[] args) {
		
		int[] numbers = { 25, 13, 45, 67, 33, 92, 17 };
		// 코드 작성
		
		int min, max;
		max = 0;
		min = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			} else if (min > numbers[i]) {
				min = numbers[i];
			}
		} // for end
		
		System.out.println(max);
		System.out.println(min);
	} // end main

} // end class
