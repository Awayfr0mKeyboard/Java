package Practice;

import java.util.Scanner;

public class java3 {

	public static void main(String[] args) {
	
		int[] arr = {10, 20, 30, 50, 3, 60, -3};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 > ");
		int num = sc.nextInt();
		
		if (num == arr[num-1]) {		
			arr[num] = 1000;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	} // main end
	
} // class end
