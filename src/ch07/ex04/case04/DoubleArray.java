package ch07.ex04.case04;

public class DoubleArray {
	public static void main(String[] args) {
		// 2차원 배열
		int[][] scores = {
				// 원소 안 배열 넣기
				{90, 80, 70},
				{60, 50, 40},
				{30, 20, 10},
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};
		
		System.out.println("번호   국어  영어  수학  합계   평균");
		System.out.println("----------------------------");
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			
			System.out.print(" " + (i + 1) + " ");
			
			for(int j = 0; j < scores[0].length; j++) {
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]);
			}
			System.out.printf("%5d %4d\n", sum, sum / scores[i].length);
		}
	}
}
