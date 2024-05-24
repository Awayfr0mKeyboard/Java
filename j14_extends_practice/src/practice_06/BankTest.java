package practice_06;

/**
 * Bank Class 생성
 * Bank Class 를 상속 받는 BadBank, NormalBank, GoodBank class 작성 
 *
 */

abstract class Bank {
	
	// 부모 클래스에 상속할 기능인 getInterestRate() Method
	abstract double getInterestRate();
	
	// abstract 가 붙어있고 실행 블럭이 없다면 추상 메소드
	// 단, 클래스에도 abstract 를 붙여줘야 함
	// abstract class Bank {
	// abstract double getInterestRate();
	
} // end Bank class

class BadBank extends Bank {
	// alt + s, v (재정의할 수 있는 메소드 목록)
	double getInterestRate() {
		// override 를 활용해 return 받을 값을 수정
		return 10.0;
	};
}

class NormalBank extends Bank {
	
	double getInterestRate() {
		// override 를 활용해 return 받을 값을 수정
		return 5.0;
	};
}

class GoodBank extends Bank {
	
	double getInterestRate() {
		// override 를 활용해 return 받을 값을 수정
		return 3.0;
	};
}

public class BankTest {

	public static void main(String[] args) {
		Bank b1 = new BadBank();
		Bank b2 = new NormalBank();
		Bank b3 = new GoodBank();
		
		System.out.println("BadBank의 이자율 : " + b1.getInterestRate());
		System.out.println("NormalBank의 이자율 : " + b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : " + b3.getInterestRate());	
		
		
		// 추상 클래스는 독립적으로 객체 생성 불가
		// Bank bank = new Bank();
		
		// 추상 클래스는 상속받아 추상 메소드의 기능을 구현한
		// 실체(자식) 클래스로만 인스턴스 생성 가능
		Bank bank = new GoodBank();
		
		Bank oneGradeBank = new Bank() { // 익명 구현 객체
			
			private double interestRate = 1.0;
			
			@Override
			double getInterestRate() {
				return this.interestRate;
			}	
		}; // end oneGradeBank 
		System.out.println("oneGradeBank 이자율 : " + oneGradeBank.getInterestRate());
		
		
	}

}
