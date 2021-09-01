package designPatterns.templateMethodPattern;

public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	//template method
	public String requestConnection(String encodedInfo) {
		
		// 1. Security -> decode encoded characters
		String decodedInfo = doSecurity(encodedInfo);
		
		// 2. authentication
		String id = "abc";
		String password = "a123";
		if(!authentication(id, password)){
			throw new Error("id,password is not matched");
		}
		
		// 3. authorization
		String userName = "userName";
		int i = authorization(userName);
		
		switch(i) {
		case 0: // Game manager
			break;
		case 1: // paid user
			break;
		case 2: // free user
			break;
		case 3: // no role
			break;
		default: // etc
			break;
		}
		
		
		// 3. 
		
		return connection(decodedInfo);
	}
}
