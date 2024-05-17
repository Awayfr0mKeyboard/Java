package test2_2;

public class Car {

	String color;
	int speed;
	int gear;
	
	String showInfo() {
		return "Car [color = " + this.color + ", speed = " + this.speed + ", gear = " + this.gear + "]";
	}
	
	void speedUp() {
		// 객체가 가진 speed field의 값을 10 증가
		this.speed += 10;
	}
	
	void speedDown() {
		// 객체가 가진 speed field의 값을 10 증가
		this.speed = speed - 10;
	}
	
}	// end Car class
