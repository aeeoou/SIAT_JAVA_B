package ch05.home.ex05.case06;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Person {
	private String name;
	
	// dependecy (의존성)
	private Phone phone;

	public void buy() {
		phone.buy();
	}
	
	public void send() {
		phone.send();
	}
	
	public void call() {
		phone.call();
	}
	
	public void game() {
		phone.game();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}
