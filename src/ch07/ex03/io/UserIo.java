package ch07.ex03.io;

import ch07.ex03.domain.User;
import ch07.ex03.service.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		String userName = Console.inStr("추가 회원을 입력해주세요.");
		userService.addUser(new User(userName));
		Console.info(userService.getUser() + "을 추가하였습니다.");
		
	}
}
