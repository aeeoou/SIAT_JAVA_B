package ch06.ex06.case04;
//인터페이스(interface) =
//implements
//몽땅 추상메소드를 가지고 있으면 인터페이스다.
public class Main {
	public static void main(String[] args) {
		Fridge fridge = new Fridge();
		
		fridge.on();
		fridge.off();
	}
}
