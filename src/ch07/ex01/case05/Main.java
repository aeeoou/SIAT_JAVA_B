package ch07.ex01.case05;
//다형성 (polymorphism)
public class Main {
	public static void main(String[] args) {
		// Car 타입
		Car car = new Ray();
		// Car 타입이기 때문에 run()만 가능
		car.run();
		// Ray 타입으로 형변환
		Ray ray = (Ray)car;
		ray.small();
		ray.run();
		
		((Car)ray).run();
	}
}
