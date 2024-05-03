package ch05.ex06.case02;

import java.util.Scanner;
//스태틱 메서드
//# 메서드 선언부 앞에 static을 붙이면 static 메서드가 된다.
public class Console {
	private static Scanner sc;
	
	// 스태틱 변수 sc 초기화
	// 바이트 코드가 로딩된 직후에 실행
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.println(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		Console.inMsg(msg);
		return sc.nextLine().trim();
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
