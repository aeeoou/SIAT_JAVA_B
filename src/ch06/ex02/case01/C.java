package ch06.ex02.case01;
// 접근제한자 (private -> default -> protected -> public)
// 상속을 하여 접근 제한자 살펴보기
public class C extends A {
	public void test() {
		int x = 0;
		
//		x = this.a;
		x = this.b; // default
		x = this.c; // protected
		x = this.d; // public
		
//		this.m1();
		this.m2();
		this.m3();
		this.m4();
	}
}
