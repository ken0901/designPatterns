package designPatterns.templateMethodPattern.otherEx;

public class Main {
	public static void main(String[] args) {
		Citizen c1 = new Citizen(); // concript citizen
		System.out.println("Concript citizen: "+c1.toString());
		AbstSoldierConscriptionHelper helper = new SoldierConscriptionHelperImpl();
		Soldier s1 = helper.conscription(); // become a soldier
		System.out.println();
		//skills
		s1.defense();
		s1.getPosition();
		System.out.println("Intelligence: "+s1.getIntelligence());
		System.out.println("Agility: "+s1.getAgility());
		System.out.println("Strength: "+s1.getStrength());
	}
}
