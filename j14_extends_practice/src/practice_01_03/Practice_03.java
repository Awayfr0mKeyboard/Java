package practice_01_03;


public class Practice_03 {

	public static void main(String[] args) {
		// code 작성
		
		// 난수 10개를 저장할 배열 생성
		int[] arr = new int[10];
		
		// 1~100까지의 난수를 저장하는 반복문
		System.out.print("최초의 리스트 : ");
		for (int i = 0; i < arr.length; i++) {
			// 1~100까지의 난수를 생성하는 Math.random()
			int number = (int) ((Math.random() * 100) + 1);
			arr[i] = number;
			System.out.print(arr[i] + " ");
		}
		System.out.println();		// 줄바꿈
		
		System.out.print("정렬된 리스트 : ");
		// arr에 저장된 난수를 내림차순으로 재정렬하는 반복문
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				// arr[i] 번 째(앞 배열)의 값이 arr[j] 번 째(뒷 배열)보다 작다면
				if (arr[i] < arr[j]) {
					// temp 변수에 앞 배열의 값 대입
					int temp = arr[i];
					// 앞 배열에 뒷 배열의 값 대입 (큰 수를 앞으로)
					arr[i] = arr[j];
					// 뒷 배열에 앞 배열의 값 대입 (작은 수를 뒤로)
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
