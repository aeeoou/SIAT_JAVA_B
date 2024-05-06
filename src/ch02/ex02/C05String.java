package ch02.ex02;

public class C05String {
	public static void main(String[] args) {
		// text block
		String comment = """
				이력서랑 자소서 쓰기
				깃과 깃허브 연습하기
				포트폴리오 쓰기 (깃허브 MD로 정리)
				면접질의 공부하기
				GPT
				코딩테스트 연습하기
				""";
		System.out.println(comment);
		
		String color = """
				빨강색
				주황색
				노랑색
				초록색
				파란색
				남색
				보라색
				""";
		System.out.println(color);
		
		color = """
				빨강색 \s
				주황색  \s
				노랑색   \s
				초록색    \s
				파란색     \s
				남색       \s
				보라색       \s
				""";
		System.out.println(color);
		
		String type = "int";
		int val = 1;
		String code = """
				public void print(%s a)
					System.out.println(a + %d);
				""".formatted(type, val);
		System.out.println(code);
		
		code = """
				<html>
					<body>
						<p>Hello, Java</p>
					</body>
				</html>""";
		System.out.println("|" + code + "|");
	}
}
