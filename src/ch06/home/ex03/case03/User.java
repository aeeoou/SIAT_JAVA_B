package ch06.home.ex03.case03;
//Object 클래스
public class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d세", name, age);
	}
}
