package ch07.ex01.case04;
// 다형성 (polymorphism)
public class Main {
	public static void main(String[] args) {
		// 덴시플로럼을 심는다. (덴시플로럼 1그루)
		Densiflorum densiflorum = new Densiflorum();
		
		// 식물을 심는다. (식물 1그루)
		Plantae plantae = new Densiflorum();
		// 캐스팅
		densiflorum = (Densiflorum)plantae;
	}
}
