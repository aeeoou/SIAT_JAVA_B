package test01;

import ch07.ex03.io.Console;
import test01.dao.UserDao;
import test01.dao.UserDaoImpl;
import test01.io.UserIo;
import test01.service.UserService;
import test01.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		// has a 관계 (유저서비스 는 유저dao 다) 
		UserService userService = new UserServiceImpl(userDao);
		// has a 관계 (유저Io 는 유저Service 다)
		UserIo userIo = new UserIo(userService);
		
		userIo.play();
		Console.info("끝.");
	}
}
