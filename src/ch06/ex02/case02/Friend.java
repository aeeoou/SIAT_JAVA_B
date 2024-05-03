package ch06.ex02.case02;
// 접근제한자 (private -> default -> protected -> public)
public class Friend {
	public void play() {
		Parent parent = new Parent();
		
//		parent.getRegNum();
		parent.getParentName();
		parent.getMoney();  // 같은 패지키 내 or 자식 클래스면 사용 가능
		parent.addMoney(10000);
	}
}
