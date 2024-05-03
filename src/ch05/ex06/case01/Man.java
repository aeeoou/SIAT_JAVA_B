package ch05.ex06.case01;
//스태틱 메서드
//# 메서드 선언부 앞에 static을 붙이면 static 메서드가 된다.
public class Man {
	// 스태틱 메서드
	public static void say(String msg) {
		System.out.println(msg);
	}
	
	// 인스턴스 메서드
	public void tell(String msg) {
		System.out.println(msg);
	}
}
