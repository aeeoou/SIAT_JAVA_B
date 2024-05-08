package test01.io;

import test01.domain.User;
import test01.service.UserService;

// Io 는 Servvice 와 dependency
public class UserIo {
	private UserService userService;;
	
	// 생성자
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		String userName = Console.inStr("추가할 회원명을 입력하세요.");
		userService.addUser(new User(userName));
		Console.info(userService.getUser() + " 을 추가했습니다.");
	}
}
