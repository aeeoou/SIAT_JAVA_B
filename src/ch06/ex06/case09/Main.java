package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		Chrome chrome = new Chrome();
		
		// Console 클래스에서 상속 받은 out을 사용한다.
		console.out();
		browser.out();
		
		// UI 인터페이스의 스태틱 메서드 in을 사용한다.
		// 스태틱 메서드는 아래처럼 사용하면 된다. (어느 클래스의.메서드();)
		UI.in();
		
		chrome.out();
		
		Chrome.play();
	}
}
