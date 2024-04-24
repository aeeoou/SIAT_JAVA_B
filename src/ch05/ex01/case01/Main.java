package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		int hour = 23;
		int minute = 18;
		int second = 30;
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		// Time 클래스 사용하기
		Time time = new Time();
		time.hour = 11;
		time.minute = 14;
		time.second = 59;
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		Time time2 = new Time();
		time2.hour = 12;
		time2.minute = 20;
		time2.second = 29;
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
		
		System.out.println(time);
	}
}
