package ch06.ex06.case08;

public interface Animal {
	// 추상메소드
	void move();
	
	// 기본메소드
	default void eat() {}
}
