package designPatterns.templateMethodPattern;

public class Main {
	
	// Divide algorithm  to variable steps
	// Declare methods for divided algorithm
	// Create template method to execute algorithm
	// Implement divided methods from sub class 
	
	public static void main(String[] args) {
		
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("id, password, access info etc");
	}

}
