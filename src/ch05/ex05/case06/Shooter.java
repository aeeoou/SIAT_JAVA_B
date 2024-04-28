package ch05.ex05.case06;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Shooter {
	// 과제
	// 멤버 변수로, 총잡이가 총을 갖고 있다.를 표현하기
	// Dependecy(의존성) :: 한 클래스나 모듈이 다른 클래스나 모듈에 직접적으로 참조되어 있는 경우
	// A has a B (A에는 B가 있다. - Shooter 에는 Gun이 있다.)
	// 클래스 Shooter 가 클래스 Gun 의 메서드를 호출하거나 클래스 Gun의 인스턴스를 생성하는 경우 클래스 Shooter 는 클래스 Gun 에 의존한다.
	private Gun gun;
	
	// fire 메소드 생성
	public void fire() {
		gun.fire();
	}
	
	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
