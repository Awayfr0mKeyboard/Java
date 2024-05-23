package practice_06;

/**
 * Bank Class 생성
 * Bank Class 를 상속 받는 BadBank, NormalBank, GoodBank class 작성 
 *
 */

class Bank {
	
	// 부모 클래스에 상속할 기능인 getInterestRate() Method
	double getInterestRate() {
		 return 0.0;
	}
} // end Bank class

class BadBank extends Bank {
	
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
		
	}

}
