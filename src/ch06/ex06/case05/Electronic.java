package ch06.ex06.case05;

import java.time.LocalDate;
//인터페이스(interface) =
//implements
//몽땅 추상메소드를 가지고 있으면 인터페이스다.
public interface Electronic {
	// 멤버 변수
	//(자동적으로 public static final 을 추가시킨다.)
	public static final int VOLTAGE = 200;
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();

	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
}
