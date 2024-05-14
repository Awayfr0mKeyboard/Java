package final_test;

public class Car {

	static String company;		// 제조사
	
	final String model;		// 차량의 모델
	final int maxSpeed;		// 자동차가 낼 수 있는 최대 속도
	// 자동차마다 최고 속도는 달라질 수 있지만 정해지면 변경되지 않는다.
	
	
	int speed;			// 자동차의 현재 속도
	
	/*
	 * 최저 속도는 모두 0이고 변경될 수 없으며 모든 차들이 같은 값을 가질 수 있도록
	 * 공유되어야 한다.
	 * - 생상되는 차마다 독립적인 값을 가질 필요없는 공유 자원이지 변경되지 않아야할 값
	 *   상수 == constant
	 */
	final static int MIN_SPEED = 0;
	
	Car (String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
}	// end Car class
