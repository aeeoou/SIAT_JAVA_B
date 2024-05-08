package ch07.ex04.case05;

public class ScoreDaoTest {
	public static void main(String[] args) {
		// fixture = 소프트웨어 테스트에서 사용되는 용어
		//           테스트를 수행하기 위해 필요한 초기화된 상태나 환경을 의미
		Score score1 = new Score(100, 100, 100);
		Score score2 = new Score(10, 10, 10);
		
		Score[] scores = new Score[2];
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		
		scoreDao.insertScore(score1);
		scoreDao.insertScore(score2);
		
		scores = scoreDao.selectScores();
		for(Score score: scores) System.out.println(score);
	}
}
