package practice_01_03;


public class Practice_02 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		// int number = (int) (Math.random() * 45 + 1); // 참고
		// 작성
		
		// lotto 배열의 길이만큼 순회하면서 난수 값을 저장
		for (int i = 0; i < lotto.length; i++) {
			int number = (int) (Math.random() * 45 + 1);
			lotto[i] = number;
			// 배열에 값을 저장하면서 중복된 값이 나올 경우
			for (int j = i+1; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					// i의 값을 낮춰 직전의 배열로 다시 돌아가서 새로운 값을 저장 
					i--;
				}
			}
		}
		
		// 저장된 lotto 배열의 값을 오름차순으로 재정렬
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				// lotto[i] 번 째(앞 배열)의 값이 lotto[j] 번 째(뒷 배열)의 값보다 크다면
				if (lotto[i] > lotto[j]) {
					// 큰 값을 temp 변수에 저장
					int temp = lotto[i];
					// 앞 배열에 뒷 배열 값을 대입
					lotto[i] = lotto[j];
					// 뒷 배열에 앞 배열 값을 대입
					lotto[j] = temp;
				}
			}
		}

		
		// 결과 출력 코드 수정 x
		System.out.println("[ 결과 ]");
		for (int i : lotto) {
			System.out.print("[" +i+ "]");
		}
	}
}
