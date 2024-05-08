package ch07.ex04.case02;

public class Cat {
	// 필드(객체)
	private String catName;
	
	// 생성자
	public Cat(String catName) {
		this.catName = catName;
	}
	
	@Override
	public String toString() {
		return this.catName;
	}
}
