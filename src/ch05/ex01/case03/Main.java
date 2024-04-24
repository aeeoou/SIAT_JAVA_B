package ch05.ex01.case03;
// 디자인 패턴 - 캡슐화 (private을 붙임으로써 캡슐화{감춘다})
// getter, setter 사용하기
public class Main {
	public static void main(String[] args) {
		User user = new User();
		
		// set (사용하기)
		user.setUserName("서형종");
		user.setAge(33);
		
		user.setUserName("고현정");
		user.setAge(53);
		
		// get (읽기)
		System.out.printf("%s, %d\n", user.getUserName(), user.getAge());
	}
}
//객체지향 : 객체.setUserName("");
//절차지향 : setUserName("");
