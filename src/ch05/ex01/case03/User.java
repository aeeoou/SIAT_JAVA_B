package ch05.ex01.case03;
// 디자인 패턴 - 캡슐화 (private을 붙임으로써 캡슐화{감춘다})
// getter, setter 사용하기
public class User {
	private String userName;
	private int age;
	
	// 데이터 읽기는 get
	// 데이터 쓰기(사용하기) set
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		// this는 User 타입이다.
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}