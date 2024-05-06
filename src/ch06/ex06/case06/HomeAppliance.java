package ch06.ex06.case06;
//인터페이스(interface) =
//implements
//몽땅 추상메소드를 가지고 있으면 인터페이스다.
import ch06.ex06.case04.Appliance;
import ch06.ex06.case05.Electronic;
// 인터페이스가 인터페이스를 상속 받는 중
public interface HomeAppliance extends Appliance, Electronic {

}
