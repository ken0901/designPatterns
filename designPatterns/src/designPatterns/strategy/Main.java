package designPatterns.strategy;

public class Main {

	public static void main(String[] args) {
//		Ainterface ainterface = new AinterfaceImpl(); 
			
		// connecting
//		ainterface.funcA();
//		AObj aObj = new AObj();
//		aObj.funcAA();
		
		
		GameCharacter character = new GameCharacter();
		character.attack();
		System.out.println("-------------------");
		
		character.setWeapon(new Knife());
		character.attack();
		System.out.println("-------------------");
		
		character.setWeapon(new Sword());
		character.attack();
		
		System.out.println("-------------------");
		character.setWeapon(new Axe());
		character.attack();
	}
}
