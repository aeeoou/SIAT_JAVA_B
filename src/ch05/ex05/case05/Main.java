package ch05.ex05.case05;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Main {
	public static void main(String[] args) {
		// 새로운 Apple 객체 생성 후 변수 apple 에 할당
		Apple apple = new Apple();
		Basket basket = new Basket();
		// 바구니에 사과 담기
		basket.setApple(apple);
		// 바구니에서 사과 빼기
		basket.getApple();
	}
}
