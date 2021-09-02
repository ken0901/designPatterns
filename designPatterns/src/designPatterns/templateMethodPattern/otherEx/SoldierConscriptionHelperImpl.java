package designPatterns.templateMethodPattern.otherEx;

public class SoldierConscriptionHelperImpl extends AbstSoldierConscriptionHelper {
	@Override
	protected Citizen conscriptionCitizen() {
		System.out.println("Conscript !");
		return new Citizen();
	}
	
	@Override
	protected void training(Citizen citizen) {
		citizen.updateStrength(10);
		citizen.updateAgility(5);
		citizen.updateIntelligence(-1);
		System.out.println("Training !");
	}
	
	@Override
	protected void supplyEquipment(Soldier soldier) {
		soldier.setWeapon(new Gun());
		soldier.setArmor(new SteelArmor());
		System.out.println("Suppling");
	}
	
	@Override
	protected Soldier changeOfPosition(Citizen citizen) {
		System.out.println("Transfer ! Citizen -> Soldier");
		return new Soldier(citizen);
	}
	
}
