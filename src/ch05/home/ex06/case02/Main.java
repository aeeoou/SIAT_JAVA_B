package ch05.home.ex06.case02;
//스태틱 메서드
//# 메서드 선언부 앞에 static을 붙이면 static 메서드가 된다.
public class Main {
	public static void main(String[] args) {
		// 과제
		// ch05.ex06.case02.Console 을 고도화 하기
		// + 예외 처리를 하라
		// Console.inStr(): 문자를 입력한다.
		// Console.inNum(): 자연수를 입력한다.
		
		// 문자 입력
		// >
		// ERROR] 문자가 아님
		// 문자 입력
		// 12
		// ERROR] 문자가 아님
		// 문자 입력
		// Hi
		// 자연수 입력
		// >
		// ERROR] 자연수가 아님
		// 자연수 입력
		// Hi
		// ERROR] 주연수가 아님
		// 자연수 입력
		// 1
		// 끝
		Console.inStr("문자를 입력하세요.");
		Console.inNum("자연수를 입력하세요.");
		
		Console.info("끝");
	}
}
