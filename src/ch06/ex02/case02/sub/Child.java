package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;
// 접근제한자 (private -> default -> protected -> public)
public class Child extends Parent {
	public void paly() {
//		this.getRegNum();     // private
		this.getParentName(); // public
		this.getMoney();      // protected
//		this.addMoney(10000);      // default
	}
	
}
