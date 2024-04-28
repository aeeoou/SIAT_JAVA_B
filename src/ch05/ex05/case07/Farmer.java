package ch05.ex05.case07;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Farmer {
	// 농부가 사과를 판다.(가격책정)
	public Apple sell(int price) {
		// 농부가 사과를 키운다.
		Apple apple = new Apple();
		// 사과에 가격을 1000원으로 책정
		apple.setPrice(price);
		
		return apple;
	}
}
