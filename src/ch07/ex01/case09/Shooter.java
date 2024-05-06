package ch07.ex01.case09;

public class Shooter {
	private Gun gun;
	
	public void fire() {
		this.gun.fire();
	}
	
	// DI : Dependency Injection
	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
