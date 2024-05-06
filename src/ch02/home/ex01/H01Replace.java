package ch02.home.ex01;

public class H01Replace {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("a: %d, b: %d", a, b);
		System.out.println();
		// 과제
		// 두 변수의 데이터를 교체하라
		// a: 1, b: 2
		// a: 2, b: 1
		int ab = a;    // a값 백업(복사)
		a = b;
		b = ab;
		 
		System.out.printf("a: %d, b: %d", a, b);
	}
}
