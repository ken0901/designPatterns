package designPatterns.templateMethodPattern.otherEx;

/*
 * Requirement
 * → Conscript citizen and train them as a soldier
 * • conscription():Soldier
 * 
 * 1. Find people who can be a marine from citizens
 * • conscriptionCitizen():Citizen
 * 
 * 2. Train conscripted soldier
 * • traning(Citizen):void
 * 
 * 3. Transfer a position citizen to soldier
 * • changeOfPosition(Citizen citizen):Soldier
 * 
 * 4. Supply equipments
 * • supplyEquipment(Solder soldier); 
 * 

*/
public abstract class AbstSoldierConscriptionHelper {
	protected abstract Citizen conscriptionCitizen(); // 1. Find people who can be a marine from citizens
	protected abstract void training(Citizen citizen); // 2. Train conscripted soldier
	protected abstract Soldier changeOfPosition(Citizen citizen); // 3. Transfer a position citizen to soldier
	protected abstract void supplyEquipment(Soldier soldier); // 4. Supply equipments
	
	public Soldier conscription() {
		Citizen citizen = conscriptionCitizen();
		training(citizen);
		Soldier soldier = changeOfPosition(citizen);
		supplyEquipment(soldier);
		return soldier;
	}
}
