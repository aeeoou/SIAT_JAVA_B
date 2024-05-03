package ch05.constructor;

public class Main {
	public static void main(String[] args) {
		// 생성자의 매개값은 new 연산자로 생성자를 호출할 떄 주어진다.
		
		// 객체 생성
		Person person1 = new Person("고현정", 53, "Actor");
		Person person2 = new Person("서형종", 33, "Student");
		
		// Person1, 2 객체 데이터 읽기
		System.out.println("person1.name : " + person1.name2);
		System.out.println("person1.age : " + person1.age2);
		System.out.println("person1.jon : " + person1.job2);
		System.out.println("person2.name : " + person2.name2);
		System.out.println("person2.age : " + person2.age2);
		System.out.println("person2.jon : " + person2.job2);
	}
}
