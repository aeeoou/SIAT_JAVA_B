package ch06.ex02.case02;
// 접근제한자 (private -> default -> protected -> public)
public class Parent {
	private String regNum;
	private String parentName;
	private int money;
	
	// 주민번호 private
	private String getRegNum() {
		return regNum;
	}
	
	public String getParentName() {
		return parentName;
	}
	
	// 돈 protected (일부만 공개 허용)
	protected int getMoney() {
		return money;
	}
	
	// default
	void addMoney(int money) {
		this.money += money;
	}
}
