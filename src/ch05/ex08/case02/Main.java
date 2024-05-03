package ch05.ex08.case02;

import java.time.LocalDate;
//생성자(constructor)
//모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
public class Main {
	public static void main(String[] args) {
//		User 클래스의 객체를 두 가지 방식으로 생성!!
//		
//		1) 생성자(User클래스)를 이용하여 객체를 생성하는 방식
//		여기서 "고현정", 53, LocalDate.now()는 User 클래스의 생성자에 전달되는 매개변수
//		따라서 이 코드는 이름이 "고현정"이고 나이가 53이며 등록일자가 현재 날짜인 User 객체를
//		생성하게 된다.
		User user1 = new User("고현정", 53, LocalDate.now());
		
//		2) 생성자 대신에 클래스의 setter 메서드를 사용하여 객체를 생성하는 방식
//		생성자를 호출하여 객체를 생성하는 대신에 객체를 생성한 후 각 변수에 값을 설정하는 방식
		User user2 = new User();
		user2.setUserName("고현정");
		user2.setAge(53);
		user2.setRegDate(LocalDate.now());
		
//		두 방식의 차이점은 객체 생성 지점에 있다.
//		1) 방식은 객체 생성과 동시에 초기화가 이뤄지지만,
//		2) 방식은 객체를 생성한 후에 값을 설정하기 때문에 초기화 과정이 두 단계로 나뉜다.
	}
}
