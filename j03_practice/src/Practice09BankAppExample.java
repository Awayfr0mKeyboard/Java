import java.util.Scanner;

public class Practice09BankAppExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// while문 종료 flag, true = 계속 실행, false = 종료
		boolean isRun = true;
		int money = 0;	// 사용자의 예금을 저장할 변수
		
		while (isRun) {	// isRun이 true면 반복, false면 탈출
			System.out.println("=========================");
			System.out.println("1.예금|2.출금|3.잔액확인|4.종료");
			System.out.println("=========================");
			System.out.println("번호를 입력해 주세요(1~4) > ");
			
			int selectNo = sc.nextInt(); // 메뉴 선택 번호 저장
			System.out.println("선택하신 메뉴 번호는 :" + selectNo);
			
			/*
			 	1. 예금 - 입금할 금액을 입력받아 money 변수에 누적 저장
			 	2. 출금 - 출금할 금액을 입력받아 money 변수에 저장된 값을 감소
			 			 단, 출금 금액은 예금된 금액을 초과할 수 없음.
			 	3. 잔액 - money 변수(예금)을 저장된 값을 출력
			 	4. 종료 - 프로그램 종료 (while문을 종료시켜 main 종료)
			 */
			/*
		if (selectNo == 1) {	// 1. 예금
			System.out.println("입금");
			System.out.println("입금하실 금액을 입력하세요.");
			int deposit = sc.nextInt();
			money = money + deposit;
			System.out.println(deposit + "원이 입금되었습니다.");
		} else if (selectNo == 2) {	   // 2. 출금
			System.out.println("출금");
			System.out.println("출금하실 금액을 입력해 주세요.");
			int withdraw = sc.nextInt();
				if (money < withdraw) {    // 출금할 수 있는 금액인지 확인
				System.out.println("출금 금액이 예금된 금액보다 클 수 없습니다.");
				continue;
			}
			money = money - withdraw;
			System.out.println(withdraw + "원이 출금되었습니다.");
		} else if (selectNo == 3) {	   // 3. 잔액 확인
			System.out.println("잔액 확인");
			System.out.println("잔액 : " + money + "원");
		} else if (selectNo == 4) {    // 4. 종료
			isRun = false;
			// break;    // 즉시 종료
		} else {
			System.out.println("선택하신 메뉴 번호는 존재하지 않습니다.");
		} // if end
		*/ // if문 주석 처리
			
		switch (selectNo) {
			case 1 :    // 1. 입금
				System.out.println("입금하실 금액을 입력하세요.");
				int deposit = sc.nextInt();
				money += deposit;
				System.out.println(deposit + "원이 입금되었습니다.");
				break;
			case 2 :    // 2. 출금
				System.out.println("출금하실 금액을 입력하세요.");
				int withdraw = sc.nextInt();
					if (withdraw > money) {
						System.out.println("출금할 수 없는 금액");
					} else {
						money -= withdraw;
						System.out.println(withdraw + "원이 출금되었습니다.");
					}
				break;
			case 3 :    // 3. 잔액 확인
				System.out.println("잔액은 " + money);
				break;
			case 4 :    // 4. 종료
				System.out.println("종료합니다.");
				isRun = false;
				break;
			default :
				System.out.println("선택할 수 없는 메뉴 번호");
		} // switch end
		
		} // while end
	} // main end
} // class end
