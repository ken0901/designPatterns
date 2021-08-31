package designPatterns.strategy;

public class GameCharacter {
	// connecting
	private Weapon weapon;
	
	// Enable exchange
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		//Delegate
		if(weapon == null) {
			System.out.println("bare-handed attack");
		}else {
			weapon.attack();
		}
	}
}
