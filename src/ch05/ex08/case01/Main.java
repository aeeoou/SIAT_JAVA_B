package ch05.ex08.case01;
//생성자(constructor)
//모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby();
		baby.setBabyName("빵빵이");
		
		// 아기가 태어나자마자 바로 이름이 있는 것
		new Baby("튼튼이");
	}
}
