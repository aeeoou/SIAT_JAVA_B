package test01.service;

import test01.domain.User;

// 비즈니스 로직 중에서 CRUD에 관련된 것은 DAO 에 작성, 나머지 비즈니스 로직은 Service 에 작성한다.
public interface UserService {
	// 유저를 읽는 업무
	public User getUser();
	// 유저를 추가하는 업무
	public void addUser(User user);
	// 유저를 수정하는 업무
	public void fixUser(String userName);
	// 유저를 삭제하는 업무
	public void delUser();
}
