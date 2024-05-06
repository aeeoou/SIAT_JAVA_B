package ch07.ex01.case08;

public class Clerk {
	public Flower sell(String flowerName) {
		Flower flower = switch(flowerName) {
		case "장미" -> new Rose();
		case "코스모스" -> new Cosmos();
		default -> null;
		};
		
		return flower;
	}
}
