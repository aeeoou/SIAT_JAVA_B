package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		// static 변수는 접두사로 클래스 이름을 쓰면 된다.
		System.out.printf("%d, %d\n", Card.width, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
		// 인스턴스 변수는 new 키워드를 사옹하여 생성
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, Card.width, Card.height);
		System.out.printf("%s %d %d %d\n", card2.kind, card2.number, card2.width, card2.height);
	}
}
