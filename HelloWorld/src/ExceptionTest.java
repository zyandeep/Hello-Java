/**
 * User Defined exception
 * Date: 29/12/30
 */

class UserDef extends Exception {       // this will be a checked exception

	UserDef(String str) {
		super(str);
	}
	
	void showMsg() {
		System.out.println("Hello world!");
	}
}

public class ExceptionTest {

	static void test() throws UserDef {
		
		throw new UserDef("Java is wonderfull!");
	}
	
	public static void main(String[] args) {
		
		try {
			test();
		}
		catch(UserDef u) {
			
			u.getMessage();
			u.printStackTrace();
			u.showMsg();
		}
		finally {
			System.out.println("This will run for sure!");
		}
	}

}
