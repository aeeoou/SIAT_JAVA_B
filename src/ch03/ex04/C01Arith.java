package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		byte c = (byte)(a + b);
		System.out.println(c);
		
		c++;
		System.out.println(c);
		
		double d = a / b;
		System.out.println(d);
		
		d = a / b;
		System.out.println(d);
		
//		과제
//		d 변수에 1.5 저장하기
		d = (double)a / b;
		System.out.println(d);
		
		d = 1.0 * a / b;
		System.out.println(d);
	}
}
