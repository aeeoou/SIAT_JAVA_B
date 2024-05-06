package ch07.ex02.Service;

import ch07.ex02.dao.UserDao;
import ch07.ex02.domain.User;
//데이터는 domain 이라 부른다.
//이 데이터를 엑세스 하는 객체를 DAO 라 부른다.
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}
