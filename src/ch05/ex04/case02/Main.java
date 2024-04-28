package ch05.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Player.teamName = "맨체스터 시티";
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		player1.playerName = "홀란드";
		player2.playerName = "더브라이너";
		
		System.out.printf("%s %s\n", player1.playerName, player1.teamName);
		System.out.printf("%s %s\n", player2.playerName, player2.teamName);

	}
}
