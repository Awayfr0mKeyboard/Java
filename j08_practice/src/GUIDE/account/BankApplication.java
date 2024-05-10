package GUIDE.account;

import java.util.Scanner;

public class BankApplication {
	
	Account[] account = new Account[100];
	
	Scanner sc = new Scanner(System.in);
	
	BankApplication(){
		run();
	}
	
	int count = 0;
	
	void run() {
		// 1. 계좌생성
		// 2. 계좌조회 
		// 3. 예금
		// 4. 출금
		// 5. 종료
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("========================================");
			System.out.println("1.계좌생성 2.계좌조회 3.예금 4.출금 5.종료");
			System.out.println("========================================");
			
			int selectNo = sc.nextInt();
			if(selectNo == 1) {
				// 계좌생성
				createAccount();
			}else if(selectNo ==2) {
				// 계좌조회
				selectAccount();
			}else if(selectNo ==3) {
				// 예금
				deposit();
			}else if(selectNo ==4) {
				// 출금
				withdraw();
			}else if(selectNo ==5) {
				// 종료
				isRun = false;
				sc.close();
			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	//계좌생성
	void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌 생성");
		System.out.println("--------------");
		System.out.print("계좌주 : ");
		String ano = sc.next();
		System.out.print("계좌 번호 : ");
		String accounts = sc.next();
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		account[count] = new Account(ano, accounts, balance, password);
		
		System.out.print("계좌생성이 완료되었습니다.");
		count++;
	}
	// 계좌조회
	void selectAccount() {
		System.out.println("--------------");
		System.out.println("계좌 목록");
		System.out.println("--------------");
		System.out.print("계좌 번호 : ");
		String number = sc.next();
		System.out.print("비밀번호 : ");
		String pass = sc.next();
		
		Account selectedAccount = findAccount(number, pass);
		
	}
	
	// 예금
	void deposit() {
		
	}
	//출금
	void withdraw() {
		
	}
	
	// 계좌번호와 비밀번호가 일치하는 Account 객체를 찾아서 반환 
	Account findAccount(String ano, String password) {
		return null;
	}
	
	public static void main(String[] args) {
		new BankApplication();
	}
}
