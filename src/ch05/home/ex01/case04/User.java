package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	// 캡슐화해서 디자인한다.
	private String userName;
	private int age;
	private LocalDate regDate;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getRegDate() {
		return regDate;
	}
	
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}
