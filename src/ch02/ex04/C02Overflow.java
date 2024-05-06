package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		byte b = 127;
		byte b2 = 127;
		
		b++;
		++b2;
		
		System.out.println(b);
		System.out.println(b2);
	}
}
