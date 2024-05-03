package ch05.ex08.case03;
//생성자(constructor)
//모든 클래스에는 반드시 하나 이상의 생성자가 있어야 한다.
public class Citrus {
	private String citrusName;
	
	// 기본 생성자
	public Citrus() {
		// this = 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용
		//        다른 생성자 호출은 생성자의 첫 문장에서만 가능
		this("레드향");
	}
	
	// 파라미터가 있는 생성자
	public Citrus(String citrusName) {
		this.citrusName = citrusName;
	}
	
	public void setCitrusName(String citrusName) {
		this.citrusName = citrusName;
	}

}
