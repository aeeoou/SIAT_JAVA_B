package ch07.ex03.domain;
// domain - dao - 
public class User {
	// 필드 = 클래스나 객체의 상태를 나타내는 변수
	private String userName;
	
	// 필드를 이용하는 방법 = setter or 생성자로 사용
	// 생성자 (userrName 필드를 매개변수로 받는다.)
	public User(String userName) {
		this.userName = userName;
	}
	
	// setter
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "이름";
	}
}
