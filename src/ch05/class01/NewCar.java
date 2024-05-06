package ch05.class01;

public class NewCar {
	public static void main(String[] args) {
		// 필드 (객체의 데이터가 저장되는 곳)
		String carName = "";
		
		// 생성자 (객체 생성 시 초기화 역할)
		Car car1 = new Car();
		System.out.println("car1 변수는 Car 객체를 참조한다.");
		
		Car car2 = new Car();
		System.out.println("car2 변수가 또 다른 Car 객체를 참조한다.");
	
		NewCar newcar1 = new NewCar();
		System.out.println("newCar1 변수");
		
		// 메서드 (객체의 동작으로 호출 시 실행하는 블록)
//		String carName() {
//			
//		}
	}
}
