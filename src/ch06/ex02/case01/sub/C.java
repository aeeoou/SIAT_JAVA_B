package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;
// 접근제한자 (private -> default -> protected -> public)
// 상속을 하여 접근 제한자 살펴보기
public class C extends A {
	public void test() {
		// default 와 protected 의 차이
		int x = 0;
		
//		x = this.a; // private 사용불가
//		x = this.b; // default 사용불가
		x = this.c; // protected 같은 패지키에 있거나, 자식이면 사용 가능!
		x = this.d; // public
		
//		this.m1(); // private 사용불가
//		this.m2(); // default 사용불가
		this.m3(); // protected 같은 패지키에 있거나, 자식이면 사용 가능!
		this.m4(); // public
	}
}
