package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100);
		System.out.println(score);
		System.out.println(100 + 1);    // expression :: 무언가를 표현할 글 (101 이라는 숫자를 표현한 글)
		System.out.println(Math.random());
		
		System.out.println(200);
		System.out.println(300);
		System.out.println('\n');
		System.out.println(400);
		System.out.println();
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello");
		// 과제: 위 출력문에서 구분자로 '/'를 사용하라.
		System.out.printf("%b/%c/%d/%f/%s/\n", true, 'a', 10, 1.15, "hello");
		
		String myName = "서형종";
		int age = 33;
		System.out.printf("%s %d", myName, age);
		System.out.println("\n");
		System.out.printf("\n%s은 %d살입니다.", myName, age);
		System.out.println();
		System.out.println(myName + "은 " + age + "살입니다.");
		
	}
}
