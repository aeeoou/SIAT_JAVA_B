package ch05.ex05.case03;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	// 리턴타입: Paper, 메서드명: add
	public Paper add(Paper paper) {
		// 과제
		// Paper의 a,b를 더한 result를 paper에 적어라.
		// 위 paper를 return 하라
		paper.setResult(paper.getA() + paper.getB());
		return paper;
	}
}
