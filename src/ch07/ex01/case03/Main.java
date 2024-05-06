package ch07.ex01.case03;
//다형성 (polymorphism)
public class Main {
	public static void main(String[] args) {
		D d = new D();
		// 프로모션 (자식타입이 부모타입으로 캐스팅된 것)
		C c = d;
		B b = d;
		A a = d;
		Object o = d;
		
		d = (D)o;
		d = (D)a;
		d = (D)b;
		d = (D)c;

	}
}
