package ch05.ex05.case07;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		// 과제
		// 농부가 1000원에 사과를 유통업자에게 넘겼다.
		// 유통업자는 사과를 2000원에 판다.
		retailer.sell(farmer.sell(1000));
	}
}
