package ch06.ex06.case04;
//인터페이스(interface) =
//implements
//몽땅 추상메소드를 가지고 있으면 인터페이스다.
public class Fridge implements Appliance {
	@Override
	// 추상메소드 on
	public void on() {}
	
	@Override
	// 추상메소드 off
	public void off() {}
}
