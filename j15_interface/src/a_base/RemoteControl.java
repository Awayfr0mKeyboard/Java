package a_base;

public interface RemoteControl {

	public static final int MAX_VALUE = 30;
	// 따로 선언하지 않아도 interface field 는 자동으로
	// public static final 이 됨.
	int MIN_VALUE = 0;
	
	// interface 는 추상 메소드만 선언 가능
	// void setValue(int value) {}
	public abstract void turnOn();
	// 마찬가지로 따로 지정하지 않아도 public abstract 가 자동으로 붙음
	void turnOff();
	void setValue(int value);
	
}
