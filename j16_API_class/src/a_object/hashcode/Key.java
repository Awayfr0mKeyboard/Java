package a_object.hashcode;

public class Key {

	int number;
	
	// 생성자 추가 alt + s, a
	public Key(int number) {
		super();
		this.number = number;
	}

	@Override
	public int hashCode() {
		System.out.println("Key가 hashcode 호출 - " + this.number);
		return this.number;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Key equals - " + this.number);
		// since java 17
		if (obj instanceof Key key) {
			if(this.number == key.number) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
