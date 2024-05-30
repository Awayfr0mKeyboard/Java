package h_arrays;

import java.util.Arrays;

public class ArraysEqualsExample {

	public static void main(String[] args) {
		int[][] original = {
				{1, 2},		// original[0]
				{3, 4}		// original[1]
		};
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.deepToString(original));
		
		int[][] copy = Arrays.copyOf(original, original.length);
		System.out.println(original.equals(copy));
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(original, copy));
		
		// 1차원 배열의 각 항목의 값을 저장하고 있는 새로운 배열을 생성
		copy[0] = Arrays.copyOf(original[0], original[0].length);	// 1, 2
		copy[1] = Arrays.copyOf(original[1], original[1].length);	// 3, 4
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(original, copy));
		
		// 2차원 배열에 저장된 각 항목의 1차원 배열 항목 값을 비교
		copy[0][0] = 100;
		System.out.println(Arrays.deepEquals(original, copy));
		System.out.println(Arrays.deepToString(original));
		System.out.println(Arrays.deepToString(copy));
		
		
	}

}
