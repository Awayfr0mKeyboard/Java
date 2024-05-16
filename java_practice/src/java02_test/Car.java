package java02_test;

public class Car {
	
	String color;
	int speed;
	int gear;
	
	// speedUp method 호출 시 speed field의 값 10 증가
	int speedUp() {
		speed += 10;
		return speed;
	}
	
	// speedDown method 호출 시 speed field의 값 10 감소
	int speedDown() {
		speed -= 10;
		return speed;
	}
	
	// showInfo
	public String showInfo() {
		return "Car [color = " + color + ", speed = " + speed + ", gear = " + gear + "]";
	}

}
