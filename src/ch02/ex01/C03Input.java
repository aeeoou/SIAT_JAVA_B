package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 과제: <입력값>을 입력했습니다.
//		System.out.print("문자열을 입력하세요.\n>");
//		String str = sc.nextLine();
//		System.out.printf("%s을(를) 입력했습니다.", str);
		
		System.out.println("숫자를 입력하세요.\n> ");
		int i = sc.nextInt();
		System.out.println(i + "을(를) 입력했습니다.");

	}
}
