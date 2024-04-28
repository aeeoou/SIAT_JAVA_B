package ch05.home.ex05.case04;

import java.time.LocalDate;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Man {
	private String name;
	private int age;
	private LocalDate birthday;
	
	public void sing() {
		System.out.println("남자가 음식을 기다리는 동안 노래를 부른다.");
	}
	public void eat() {
		System.out.println("음식이 나오자 맛있게 먹는다.");
	}
	public void run() {
		System.out.println("다 먹더니, 계산도 안하고 달려 나간다.");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
}
