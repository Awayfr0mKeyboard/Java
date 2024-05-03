package j05_test;

public class TestArray {

	public static void main(String[] args) {
		/*
			주어진 정수 배열 numbers의 반복문을 사용하여 모든 요소(항목)를 출력하는 소스코드를 작성하시오.
		 */
		int[] numbers = { 1, 2, 3, 4, 5 };
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		/*
			주어진 정수 배열 numbers에서 홀수의 개수가 몇 개인지 출력하는 소스코드를 작성하시오.
		 */
		numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				count++;
			}
		} // for end
		System.out.println("홀수의 개수는 : " + count);
		
		/*
		 	반복문을 활용하여 주어진 2차원 배열 matrix의 모든 요소(항목)의 값을 더하여 합계를 출력하는 
		 	소스코드를 작성하시오.
		 */
		int[][] matrix = {
							{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}
						};
		int sum = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		} // 외부 for end
		System.out.println("총합은 : " + sum);
		
		// 향상된 for문
		int total = 0;		// 총합을 저장할 변수
		for(int[] arr : matrix) {
			for (int i : arr) {
				total += i;
			}
		}
		System.out.println("총합은 : " + total);
		
	} // main end
	
} // class end
