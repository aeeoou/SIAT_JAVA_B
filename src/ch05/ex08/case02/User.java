package ch05.ex08.case02;

import java.time.LocalDate;
//생성자(constructor)
//모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
public class User {
	private String userName;
	private int age;
	private LocalDate regDate;
	
	// 기본 생성자
	public User() {}
	
	public User(String userName, int age, LocalDate regDate) {
		// this = 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용
		//        다른 생성자 호출은 생성자의 첫 문장에서만 가능
		this.userName = userName;
		this.age = age;
		this.regDate = regDate;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}
