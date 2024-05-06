package ch06.home.ex04.case03;

public class Point {
	private int x;
	private int y;
	
	// x, y를 파라미터로 받는 생성자 생성
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
}
