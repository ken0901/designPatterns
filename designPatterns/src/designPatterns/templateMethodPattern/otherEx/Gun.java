package designPatterns.templateMethodPattern.otherEx;

public class Gun implements Weapon{
	@Override
	public void attack() {
		System.out.println("Shooting");
	}
}
