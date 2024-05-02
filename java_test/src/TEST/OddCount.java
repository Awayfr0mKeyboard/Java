package TEST;

public class OddCount {

	public static void main(String[] args) {
	
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				count++;
			}
		} // for end
		System.out.println("홀수의 개수는 : " + count);
		
	} // main end
	
} // class end
