package test01.dao;

import test01.domain.User;

// domain 과 dependency
public interface UserDao {
	// DAO 가 가지고 있는 아래 4가지 기능을 CRUD 라 한다. (Create[생성], Read[읽기], Update[수정], Delete[삭제])
	// 비즈니스 로직 중에서 CRUD에 관련된 것은 DAO 에 작성, 나머지 비즈니스 로직은 Service 에 작성한다.
	
	// 유저 데이터를 읽는다.
	public User selectUser();
	// 유저 추가
	public void insertUser(User user);
	// 유저 수정
	public void updateUser(String userName);
	// 유저 삭제
	public void deleteUser();
}
