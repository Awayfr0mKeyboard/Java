package extends3_protected.b;

import extends3_protected.a.A;

/**
 * D 객체가 생성될 때 같이 생성된
 * 부모 클래스로만 접근이 가능하다.
 */

public class D extends A {

	public D() {
		super();	// new A();
		
		A a = new A();
		a.a = 100;				// public
		// a.b = 200;			// protected
		// a.methodA();			// protected
		
		super.a = 100;			// public
		super.b = 200;			// protected
		// super.c = 300;		// default
		super.methodA(); 		// protected
	}
	
	// overriding
	@Override
	protected void methodA() {
	// 부모가 정의한 method 의 접근 제한자보다
	// 좁은 범위의 접근 제한자를 사용할 수 없음.
	// void methodA() {	
		// 명시적으로 부모에 정의된 method 호출 
		super.methodA();
	}
	
	// final method 는 자식 class 에서 재정의 불가
	// public void methodB() {}
	
}
