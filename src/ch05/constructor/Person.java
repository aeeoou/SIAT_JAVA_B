package ch05.constructor;

public class Person {
	// 생성자 선언
//	Person(String name, int age, String job){}
	
	// 객체마다 동일한 값을 갖고 있다면 필드 선언 시 초기값을 대입하는 것이 좋고,
	// 객체마다 다른 값을 가져야 한다면 생성자에서 필드를 초기화하는 것이 좋다.
	
	// 필드 선언
	String name2;
	int age2;
	String job2;
	
	// 생성자 선언
	public Person(String name, int age, String job) {
//		name2 = name;
//		age2 = age;
//		job2 = job;
		// 매개변수명이 필드명과 동일할 시 필드임을 구분하기 위해 this 키워드를 앞에 붙여준다.
		// this는 현재 객체를 말하며, this.name2는 현재 객체의 데이터(필드)로서의 name을 뜻함
		this.name2 = name;
		this.age2 = age;
		this.job2 = job;
	}
}
