package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	// public or private static 리턴타입 메소드명(매개변수, ...){}
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힣]+");
			if(!isGood) Console.err("문자가 아님");
		} while(!isGood);
		
		return input;
	}
	
	public static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("^[1-9][0-9]*");
			if(!isGood) Console.err("자연수가 아님");
		}while(!isGood);
		
		return Integer.parseInt(input);
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
