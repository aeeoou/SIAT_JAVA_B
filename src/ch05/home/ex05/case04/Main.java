package ch05.home.ex05.case04;

import java.time.LocalDate;
//오버로딩 (Overloading)
//하나의 클래스에 이름이 같고 파라미터가 다른 메서드를 2개 이상 정의하는 것
//# 메서드의 이름이 같아야 한다.
//# 매개변수의 개수 또는 타입이 달라야 한다.
public class Main {
	public static void main(String[] args) {
		// 과제
		// 남자 객체만을 class로 디자인하기
		// 식당에서 한 남자가 다가와 앉는다. 남자가 자기 소개를 한다.
		// 이름: 최한석, 나이 33살, 생일은 2025-06-07
		// 남자가 음식을 기다리는 동안 노래를 부른다.
		// 음식이 나오자 맛있게 먹는다.
		// 다 먹더니, 계산도 안하고 달려 나갑니다.
		Man man = new Man();
		man.setName("서형종");
		man.setAge(33);
		man.setBirthday(LocalDate.of(2030, 4, 9));
		
		man.sing();
		man.eat();
		man.run();
		
		System.out.println(
				"이름: " + man.getName() +
				"\n나이: " + man.getAge() +
				"\n생일: " + man.getBirthday());
	}
}
