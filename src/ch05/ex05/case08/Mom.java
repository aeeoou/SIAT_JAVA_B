package ch05.ex05.case08;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.

//dependency (의존성)
//# 한 클래스나 모듈이 다른 클래스나 모듈에 직접적으로 참조되어 있는 경우
//# A has a B (A에게는 B가 있다.)
public class Mom {
	public Pasta cook() {
		return new Pasta();
	}
}