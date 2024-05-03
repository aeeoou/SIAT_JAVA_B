package ch05.ex09.case02;
//생성자(constructor)
//모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
public class Phone {
	// 객체들이 공유하는 데이터면, static 변수로 생성
	private static int cnt;
	// 객체 별로 따로따로 가져가는 데이터면, 인스턴스 변수로 생성
	private int serial;
	
	{
		// 시리얼 값 초기화
		serial = ++cnt * 100;
	}
	
	// 기본 생성자
	public Phone() {}
	
	// Phone int 생성자
	public Phone(int serial) {
		this.serial = serial;
	}
	
	public int getSerial() {
		return this.serial;
	}
}
