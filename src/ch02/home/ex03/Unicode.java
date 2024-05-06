package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
//		과제
//		입력한 문자의 unicode를 출력하라.
//		
//		문자 : A
//		A의 unicode는 65 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		
		char ch = sc.next().charAt(0);
		
		int unicode = (int)ch;
		System.out.println(ch + "의 unicode는 " + unicode + " 입니다.");
	}
}
