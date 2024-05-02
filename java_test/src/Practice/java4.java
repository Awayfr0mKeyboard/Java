package Practice;

import java.util.Scanner;

public class java4 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 50, 3, 60, -3};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 번호를 입력하세요 > ");
		int f = sc.nextInt();
		
		System.out.println();
		
		System.out.print("두 번째 번호를 입력하세요 > ");
		int s = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[f]) {
				int temp = arr[f];
				arr[f] = arr[s];
				arr[s] = temp;
			}
			System.out.print(arr[i] + "\t");
		}
		
		
	} // main end
	
} // class end
