package ch07.home.ex04.case01;

public class MaxMin {
	public static void main(String[] args) {
		int[] scores = {77, 88, 91, 33, 100, 55, 95};
		
		int max = scores[0];
		int min = scores[0];
		// 최소값과 최대값을 구하라
		for (int i = 1; i < scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
			if (scores[i] < min){
				min = scores[i];
			}
		}
		
//		for (int score: scores) {
//			if(score > max) max = score;
//			if(score < min) min = score;
//		}
		
		System.out.printf("%d %d", max, min);
	}
}
