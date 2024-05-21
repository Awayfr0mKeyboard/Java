package extends6_abstract_class;

// 추상 메소드가 하나라도 존재하면 해당 class 는
// 추상 class 로 정의되어야 한다.
public abstract class Animal {

	String kind;			// 분류
	
	public void breath() {
		System.out.println("공기로 호흡합니다.");
	}
	
	public abstract void sound();
	
	
}
