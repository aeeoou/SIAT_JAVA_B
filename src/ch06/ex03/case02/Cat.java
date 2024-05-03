package ch06.ex03.case02;
//@Override(오버라이드) : 덮어쓴다.
//@ = annotation = 주석
public class Cat extends Animal {
	@Override
	public void shout() {
		System.out.println("야옹");
	}
	
}
