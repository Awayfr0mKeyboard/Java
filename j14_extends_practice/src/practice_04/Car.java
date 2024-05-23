package practice_04;

public class Car {
	
	// field
	String color;
	int speed;
	int gear;
	
	// changeGear Method
	void changeGear(int changeGear) {
		this.gear = changeGear;
	}
	// speedUP Method
	void speedUp() {
		this.speed += 10;
	}
	// speedDown Method
	void speedDown() {
		this.speed -= 10;
	}
	
	// 모든 class 는 기본적으로 extends Object 상태이기 때문에
	// 모든 객체는 Object 의 기능을 사용할 수 있다.
	// toString 을 overriding 을 하면 객체의 내용을 알려줌
	public String toString() {
		return "Car [color = " + this.color + ", speed = " + this.speed + ", gear = " + this.gear + "]"; 
	}
	

}