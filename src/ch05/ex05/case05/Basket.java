package ch05.ex05.case05;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Basket {
	// 과제
	// 멤버 변수로, 사과 바구니를 표현하기
	// 데이터 타입: Apple - 변수이름: apple
	private Apple apple;
	
	// 사과 넣고 빼기
	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}
