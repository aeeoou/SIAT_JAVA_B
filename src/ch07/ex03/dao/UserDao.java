package ch07.ex03.dao;

import ch07.ex03.domain.User;

public interface UserDao {
	public User selectUser();
	public void insertUser(User user); // 추가
	public void updateUser(String userName); // 수정
	public void deleteUser(); // 삭제
}
 