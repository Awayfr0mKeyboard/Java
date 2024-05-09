package f_cooperation;

/**
 * 버스, 지하철 등의 탈 것과
 * 자동차 클래스간의 협력 관계
 */
public class TakeVehicle {

	public static void main(String[] args) {
		Bus bus100 = new Bus(100);
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("green"); 
		subwayGreen.showInfo();
		
		Worker choi = new Worker("최기근", 2_100_000_000);
		choi.takeBus(bus100);
		choi.showInfo();
		bus100.showInfo();
		
		System.out.println("==========================");
		choi.takeSubway(subwayGreen);
		choi.showInfo();
		subwayGreen.showInfo();
		
		System.out.println("==========================");
		Student lee = new Student("이유리", 1, 500_000_000);
		lee.showInfo();
		
		Bus bus50 = new Bus(50);
		lee.takeVehicle(bus50);
		lee.takeVehicle(subwayGreen);
		lee.showInfo();
		bus50.showInfo();
		subwayGreen.showInfo();
		
		
	} // main end
	
} // class end
