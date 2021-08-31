package designPatterns.strategy;

public class Knife implements Weapon {

	@Override
	public void attack() {
		System.out.println("knife attack");
	}

}
