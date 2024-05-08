package test01.dao;

import test01.domain.User;

public class UserDaoImpl implements UserDao {
	// 배열 객체를 둔다. (DB와 연결을 안할 시)
	private User user;
	
	// 상속 받은 메서드들 오버라이드
	@Override
	public User selectUser() {
		return this.user;
	}
	
	@Override
	public void insertUser(User user) {
		this.user = user;
	}
	
	@Override
	public void updateUser(String userName) {
		this.user.setUserName(userName);
	}
	
	@Override
	public void deleteUser() {
		this.user = null;
	}
}
