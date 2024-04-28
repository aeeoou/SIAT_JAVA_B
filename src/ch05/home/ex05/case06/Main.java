package ch05.home.ex05.case06;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Main {
	public static void main(String[] args) {
		// 과제
		// 최한석은 삼성폰을 100만원을 주고 샀다.
		// 손에 든 폰을 보니 흐뭇하다.
		// 메세지를 보낸다.
		// 답장이 없어 전화를 걸어보니, 연결이 안된다.
		// 잠시 뒤에 다시 연락해본다.
		// 기다리는 동안 폰으로 게임을 한다.
		
		// Phone, Person 객체 생성 
		Phone phone = new Phone();
		Person person = new Person();
		
		person.setName("김남길");
		// dependecy 하기 (person 가 phone을 가지고 있다.)
		person.setPhone(phone);
		
		phone.setBrand("삼성");
		phone.setPrice(1000000);
	
		System.out.println(person.getName() + "은 " +
				phone.getBrand() + "폰을 " +
				phone.getPrice() + "원에 주고 샀다");
		
		person.buy();
		person.send();
		person.call();
		person.game();
	}
}
