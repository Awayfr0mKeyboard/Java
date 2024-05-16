package java02_test;

public class Random {

	public static void main(String[] args) {
		
		int save[] = new int[10];
		
		int sum = 0;	// 난수 총 합계
		
		
		for (int i = 0; i < 10; i++) {
			save[i] = (int) (Math.random() * 100);
			sum += save[i];
			System.out.print(save[i] + " ");
		}
		System.out.print("난수 총 합계 : " + sum);
		
	}	// main method end
	
}
