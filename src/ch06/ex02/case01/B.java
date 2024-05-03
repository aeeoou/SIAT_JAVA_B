package ch06.ex02.case01;
// 접근제한자 (private -> default -> protected -> public)
public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
//		x = a.a; // private (사용못함)
		x = a.b; // default
		x = a.c; // protected
		x = a.d; // public
		
//		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}
