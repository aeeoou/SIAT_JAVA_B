package test01.domain;

public class User {
	// 필드 (속성)
	private String userName;
//	private int userAge;
//	private String userGenger;
	
	// 생성자
	public User(String userName) {
		this.userName = userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

//	public void setUserAge(int userAge) {
//		this.userAge = userAge;
//	}
//
//	public void setUserGenger(String userGenger) {
//		this.userGenger = userGenger;
//	}
	
	@Override
	public String toString() {
		return this.userName;
	}
	
}
