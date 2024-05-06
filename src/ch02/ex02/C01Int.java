package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(Integer.toBinaryString(x)); // 정수를 이진수로 변환 (0 과 1)
		
		x = 012; // 10의 8진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA; // 10의 16진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010;
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567;
		System.out.println(x + 1);
		
		double y = 1e1;
		System.out.println(y);
	}
}
