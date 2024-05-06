package ch07.ex02.dao;

import ch07.ex02.domain.User;
//데이터는 domain 이라 부른다.
//이 데이터를 엑세스 하는 객체를 DAO 라 부른다.
public class UserDaoImpl implements UserDao{
	@Override
	public User selectUser() {
		return new User("박해일");
	}
}
