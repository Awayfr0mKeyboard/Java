package c5_compare;

public class Person implements Comparable<Person> {

	private String name;
	private int age;
	
	
	// 전체 필드값을 매개 변수로 전달받는 생성자
	// toString() 추가
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Person o) {
		// 양수 음수 0
		// 양수 : or 0 이동 X
		// 음수 : 두 수의 자리 변경
		int result = this.age - o.age;
		System.out.println(this.age + " - " + o.age + " = " + result);
		return result;
	}
	
	
}
