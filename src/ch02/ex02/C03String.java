package ch02.ex02;

public class C03String {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		// int -> String
		String sumStr = "" + sum;
		System.out.println(sumStr);
		// String -> int
		int i = Integer.parseInt(sumStr);
		System.out.println(i);
		
		String s = a + b + "";
		System.out.println(s);
		
		// 1 과 2로 표현
		s = "" + a + b;
		System.out.println(s);
		
		String dialog = "Miss GO said, \"Goodmoning\".";
		System.out.println(dialog);
	}
}
