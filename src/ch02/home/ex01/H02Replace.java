package ch02.home.ex01;

import java.util.Scanner;

public class H02Replace {
	public static void main(String[] args) {
		// 과제
		// H01 을 확장성 있게 고도화하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a: %d, b: %d/n",a, b);
		
		System.out.println("=> a, b 값을 교체한다.");
		
		int ab = 0;
		ab = a;
		a = b;
		b = ab;
		System.out.printf("결과 a: %d, b: %d", a, b);
	}
}
