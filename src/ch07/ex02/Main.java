package ch07.ex02;

import ch07.ex02.Io.UserIo;
import ch07.ex02.Io.Console;
import ch07.ex02.Service.UserService;
import ch07.ex02.Service.UserServiceImpl;
import ch07.ex02.dao.UserDao;
import ch07.ex02.dao.UserDaoImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
	
		Console.info("start.");
		userIo.play();
		Console.info("end.");
	}
	
}
