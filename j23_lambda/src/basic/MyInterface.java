package basic;

/**
 * 하나의 기능을 정의하는 interface : 함수형 인터페이스
 */
// 함수형 인터페이스인지 검증하는 annotation
@FunctionalInterface
public interface MyInterface {
	void run();
}

// 매개 변수가 있는 interface 의 추상 메소드
interface MyParamInterface {
	void sum(int x, int y);
}

// 매개 변수와 return type 이 있는 함수형 인터페이스
interface MyReturnInterface {
	int method(int x, int y, String str);
}