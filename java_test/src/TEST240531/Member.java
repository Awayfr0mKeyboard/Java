package TEST240531;


public class Member {

	private String id;
	private String password;
	private String name;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			// equals method 가 호출된 Member 의 id 필드 값과
			// 매개변수로 전달된 Member 의 id 필드 값이 일치하면
			// 동일한 데이터를 지정한 객체
			if (this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
