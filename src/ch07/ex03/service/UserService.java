package ch07.ex03.service;

import ch07.ex03.domain.User;

public interface UserService {
	public User getUser();               // 유저를 읽는다.
	public void addUser(User user);
	public void fixUser(String userName);
	public void delUser();
}
