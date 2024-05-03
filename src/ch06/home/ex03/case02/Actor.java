package ch06.home.ex03.case02;
//@Override(오버라이드) : 덮어쓴다.
//@ = annotation = 주석
public class Actor extends Entertainer {
	@Override
	public void show() {
		System.out.println("배우는 공연 때 연기를 한다.");
	}
}
