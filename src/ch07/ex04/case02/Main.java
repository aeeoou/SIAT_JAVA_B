package ch07.ex04.case02;

public class Main {
	public static void main(String[] args) {
		// 고양이 3마리가 들어갈 수 있는 집
		Cat[] cats = new Cat[3];
		
		cats[0] = new Cat("고양이1");
		cats[1] = new Cat("고양이2");
		cats[2] = new Cat("고양이3");
		
		// iterating = 데이터를 반복적으로 읽어내는 작업 (for each)
		for(Cat cat: cats) System.out.println(cat);
	}
}
