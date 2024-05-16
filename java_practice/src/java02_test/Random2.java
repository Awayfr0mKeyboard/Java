package java02_test;

public class Random2 {

	public static void main(String[] args) {
		int[] save = new int[10];
		
		System.out.print("최초의 리스트 : ");
		for (int i = 0; i < 10; i++) {
			save[i] = (int) (Math.random() * 100);
			System.out.print(save[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("정렬된 리스트 : ");
		for (int i = 0; i < 10; i++) {
			for (int j = i+1; j < 10; j++) {
				if (save[i] > save[j]) {
					int temp;
					temp = save[i];
					save[i] = save[j];
					save[j] = temp;
				}
			}
			System.out.print(save[i] + " ");
		}
		
	}	// end main method
	
}
