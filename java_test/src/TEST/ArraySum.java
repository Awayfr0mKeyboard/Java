package TEST;

public class ArraySum {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			};
		int sum = 0;	// 총합
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[i][j];
			}
		} // 외부 for end
		System.out.println("총합은 : " + sum);
		
	} // main end
	
} // class end
