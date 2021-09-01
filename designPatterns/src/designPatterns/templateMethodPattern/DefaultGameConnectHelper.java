package designPatterns.templateMethodPattern;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {
	
	// if it needs more algorithm add  more algorithm here 

	@Override
	protected String doSecurity(String string) {
		System.out.println("Decode");
//		System.out.println("more security");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("Id/Password check");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("authorization check");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("Final access step");
		return info;
	}

}
