package test01.service;

import test01.dao.UserDao;
import test01.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	// 생성자
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	// 유저를 읽는 업무
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
	
	// 유저를 추가하는 업무
	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}
	// 유저를 수정하는 업무
	@Override
	public void fixUser(String userName) {
		userDao.updateUser(userName);
	}
	
	// 유저를 삭제하는 업무
	@Override
	public void delUser() {
		userDao.deleteUser();
	}
}
