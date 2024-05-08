package ch07.ex04.case03;

public class Slot {
	private Ball[] balls;
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1);
	}
	
	// 중복되는 랜덤 값이 나오므로 완전하지 않다.
//	public Ball chuck() {
//		return balls[(int)(Math.random() * 45)];
//	}
	
	public Ball chuck() {
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45);
			ball = balls[i];
			balls[i] = null;
		}  while(ball == null);
		
		return ball;
	}
}
