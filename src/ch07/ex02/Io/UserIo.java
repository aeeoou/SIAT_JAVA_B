package ch07.ex02.Io;

import ch07.ex02.Service.UserService;

public class UserIo {
	private UserService userService;
	
	// 생성자
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		Console.info(userService.getUser());
	}
}
