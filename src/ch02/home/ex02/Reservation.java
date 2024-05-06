package ch02.home.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
//		과제
//		예매하기. 환불은 공연일로부터 3일 전까지 가능
//		공연 일자를 입력하세요.
//		연: 2025
//		월: 4
//		일: 9
//		
//		2025-04-9 공연을 예매했습니다.
//		2025-04-6 까지 환불이 가능합니다.
		Scanner sc = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("공연 일자를 입력하세요.");
		System.out.print("연: "); year = sc.nextInt();
		System.out.print("월: "); month = sc.nextInt();
		System.out.print("일: "); day = sc.nextInt();
		
		LocalDate showDate = LocalDate.of(year, month, month);
		
		System.out.println();
		System.out.println(showDate + " 공연을 예매했습니다.");
		System.out.println(showDate.minusDays(3) + "까지 환불이 가능합니다.");
		
	}
}
