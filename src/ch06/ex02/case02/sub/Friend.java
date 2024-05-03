package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;
//접근제한자 (private -> default -> protected -> public)
public class Friend {
	public void play() {
		Parent parent = new Parent();
		
//		parent.getRegNum();     // private
		parent.getParentName(); // public 
//		parent.getMoney();      // protected
//		patent.addMoney();      // default
	}
}
