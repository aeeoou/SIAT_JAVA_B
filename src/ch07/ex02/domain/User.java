package ch07.ex02.domain;
//데이터는 domain 이라 부른다.
//이 데이터를 엑세스 하는 객체를 DAO 라 부른다.
public class User {
	// 멤버변수
	private String userName;
	
	// 멤버변수를 파라미터로 받는 생성자
	public User(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return this.userName;
	}
}
