package ch05.home.ex05.case06;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Phone {
	private String brand;
	private int price;
	
	public void buy() {
		System.out.println(brand + "폰을 샀다.");
	}
	
	public void send() {
		System.out.println("메세지를 보낸다.");
	}
	
	public void call() {
		System.out.println("답장이 없어 전화를 걸어보니, 연결이 안된다. 잠시 뒤에 다시 연락해본다.");	
	}
	
	public void game() {
		System.out.println("기다리는 동안 폰으로 게임을 한다.");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
