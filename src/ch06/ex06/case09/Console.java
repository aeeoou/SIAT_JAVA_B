package ch06.ex06.case09;

public class Console implements UI {
	@Override
	// UI 로부터 상속받은 out을 오버라이드
	public void out() {
		System.out.println("println()");
	}

}
