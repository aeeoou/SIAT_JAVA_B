package ch05.ex09.case01;

import ch05.ex06.case02.Console;
//생성자(constructor)
//모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
public class Init {
	// 스태틱 변수 생성
	private static int s;
	// 인스턴스 변수 생성
	private int i;
	
	static {
		Init.s = 1;
		Console.info("스태틱 변수가 실행되었다.");
	}
	
	{
		this.i = 1;
		Init.s = 1;
		Console.info("{}");
	}
	
	{
		Console.info("{}2");
	}
	
	// 생성자
	public Init() {
		Console.info("Init()");
	}
	
	public Init(int i) {
		Console.info("Init(int)");
	}
}
