package ch05.ex09.case02;
//생성자(constructor)
//모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
public class Main {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		// 시리얼 넘버 수동 할당
		Phone phone3 = new Phone(1000);
		Phone phone4 = new Phone();
		
		System.out.printf("%d\n%d\n%d\n%d",
				phone1.getSerial(),
				phone2.getSerial(),
				phone3.getSerial(),
				phone4.getSerial());
	}
}
