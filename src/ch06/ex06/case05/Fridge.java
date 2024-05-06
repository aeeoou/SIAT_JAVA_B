package ch06.ex06.case05;

import ch06.ex06.case04.Appliance;
//인터페이스(interface) =
//implements
//몽땅 추상메소드를 가지고 있으면 인터페이스다.
                   // implements 뒤에는 인터페이스를 n개 넣을 수 있다.
// 클래스가 인터페이스를 상속 받는 중
public class Fridge implements Appliance, Electronic {
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() { return 0; }
	@Override public String getModelName() { return null; }
}
 