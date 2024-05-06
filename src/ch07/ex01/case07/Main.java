package ch07.ex01.case07;

public class Main {
	public static void main(String[] args) {
		Human human = new Human();
		Pizza pizza = new Pizza();
		Sushi sushi = new Sushi();
		Banana banana = new Banana();
		
		human.eat(pizza);
		human.eat(sushi);
		human.eat(new Banana());
	}
}
