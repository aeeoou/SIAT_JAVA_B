package ch07.ex01.case01;
//다형성 (polymorphism)
public class Main {
	public static void main(String[] args) {
		C c = new C();
		// b 타입 변수에 담다
		B b = c;
		// a 타입 변수에 담다
		A a = c;
		// 위 현상을 프로모션이라 부른다. (자식타입이 부모타입으로 캐스팅 된 걸 프로모션이라 한다.)
		// c 는 자식, a 와 b는 부모
		
		// 다시 c타입으로 캐스팅
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
	}
}
