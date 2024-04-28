package ch05.home.ex05.case08;
//dependency (의존성)
//# 한 클래스나 모듈이 다른 클래스나 모듈에 직접적으로 참조되어 있는 경우
//# A has a B (A에게는 B가 있다.)

//dependency (의존성)
//# 한 클래스나 모듈이 다른 클래스나 모듈에 직접적으로 참조되어 있는 경우
//# A has a B (A에게는 B가 있다.)
public class Person {
	private String name;
	
	public Ball pass(Ball ball) {
		return ball;
	}
	
	public Ball kick(Ball ball) {
		return ball;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
