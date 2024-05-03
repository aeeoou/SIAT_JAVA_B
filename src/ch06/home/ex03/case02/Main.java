package ch06.home.ex03.case02;
//@Override(오버라이드) : 덮어쓴다.
//@ = annotation = 주석
public class Main {
	public static void main(String[] args) {
//		과제 (상속 + 오버라이드 사용)
//		가수가 공연한다.
//		배우가 공연한다.
		Singer singer = new Singer();
		Actor actor = new Actor();
		
		singer.show();
		actor.show();
		
		// 선생님 코드
		new Singer().show();
		new Actor().show();
	}
}
