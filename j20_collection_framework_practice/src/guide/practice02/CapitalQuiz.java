package guide.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CapitalQuiz {
	
	private List<Nation> store = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	/**
	 * 객체 생성시 store ArrayList에 8개의 국가에 대한 기본적인 정보 입력 
	 */
	public CapitalQuiz() {
		store.add(new Nation("한국", "서울"));
		na = new Nation("프랑스", "파리");
	}
	
	/**
	 * 수도 맞추기 게임 시작
	 */
	public void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.println("입력 : 1, 퀴즈 : 2, 종료 : 3");
			int menu = sc.nextInt();
			switch(menu) {
				case 1 :
					// 국가별 수도 정보 추가
					input();
					break;
				case 2 : 
					// 국가 이름으로 수도 정보 맞추기
					quiz();
					break;
				case 3 : 
					System.out.println("게임을 종료합니다.");
					return;
				default :
					System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	/**
	 * 국가 등록 - 국가 이름, 수도 이름 Nation 정보 등록 
	 */
	private void input() {
		boolean isRun = true;
		while (isRun) {
			System.out.println("국가 입력(현재 : " + (store.size() + 1) + "번 째 국가 등록 / q는 종료)>>");
			String country = sc.next();
			if (country.equals("q")) {
				System.out.println("입력을 종료합니다.");
				return;
			}
			System.out.println("수도 입력>>");
			String capital = sc.next();
			Nation inform = new Nation(country, capital);
			boolean isChecked = store.contains(inform);
			if (isChecked) {
				System.out.println(country + "는(은) 이미 있습니다.");
			} else {				
				store.add(inform);
			}
			
			
		} // end while
	}
	
	/**
	 * 국가 별 수도 이름 맞추기 게임 
	 */
	private void quiz() {
		boolean isRun = true;
		int random = ((int)Math.random() * store.size());
		while (isRun) {
			System.out.println(store.get(random) + "의 수도는?");
			
		}
	}

	public static void main(String[] args) {
		CapitalQuiz quize = new CapitalQuiz();
		quize.run();
	}

}





