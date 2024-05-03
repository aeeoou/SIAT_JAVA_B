package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;
// 접근제한자 (private -> default -> protected -> public)
// 상속을 하여 접근 제한자 살펴보기
public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
//		x = a.a; // private 사용 못함
//		x = a.b; // default 사용 못함 (같은 패키지 안에 있어야 사용 가능!)
//		x = a.c; // protected 사용 못함 (같은 패키지 안에 있어야 사용 가능!)
		x = a.d; // public 사용 가능!
		
//		a.m1(); // private 사용 못함
//		a.m2(); // default 사용 못함 (같은 패키지 안에 있어야 사용 가능!)
//		a.m3(); // protected 사용 못함 (같은 패키지 안에 있어야 사용 가능!)
		a.m4(); // public 사용 가능!
	}
}
