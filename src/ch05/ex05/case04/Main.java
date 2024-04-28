package ch05.ex05.case04;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.setDogName("보듬이");
		dog.setBreed("시바");
		// 객체지향으로 프로그래밍 한다.
		dog.eat();
		dog.shout();
	}
}
