package ch05.ex06.case01;
//스태틱 메서드
//# 메서드 선언부 앞에 static을 붙이면 static 메서드가 된다.
public class Main {
	public static void main(String[] args) {
		// 스태틱과 인스턴스 메서드의 차이점
		// 스태틱 메서드 (객체 생성 없이 바로 사용 가능)
		Man.say("스태틱 메서드~ 무야호~");
		
		// 인스턴스 메서드 (객체 생성 후 사용)
		Man man = new Man();
		man.tell("인스턴스 메서드~ 무야호우~");
	}
}
