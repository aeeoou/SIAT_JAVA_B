package ch05.home.ex05.case08;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.

//dependency (의존성)
//# 한 클래스나 모듈이 다른 클래스나 모듈에 직접적으로 참조되어 있는 경우
//# A has a B (A에게는 B가 있다.)
public class Main {
	public static void main(String[] args) {
		// 과제
		// 최한석, 한아름, 양승일이 축구를 한다.
		// 한석이가 아름이한테 공을 패스한다.
		// 아름이는 승일이한테 공을 패스한다.
		// 승일이는 공을 찬다.
		Ball ball = new Ball();
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		
		person1.setName("김남길");
		person2.setName("고현정");
		person3.setName("박해일");
		
		person3.kick(person2.pass(person1.pass(ball)));
	}
}
