package ch05.ex06.case02;
//스태틱 메서드
//# 메서드 선언부 앞에 static을 붙이면 static 메서드가 된다.
public class Main {
	public static void main(String[] args) {
		// 스태틱 메서드는 객체 생성 없이 호출함
		Console.inStr("문자 입력");
		Console.inNum("숫자 입력");
		
		Console.err("에러");
		Console.info("끝");
	}
}
