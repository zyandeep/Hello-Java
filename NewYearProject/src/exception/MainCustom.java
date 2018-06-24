// custom exception demo

package exception;

public class MainCustom {

	public static void main(String[] args) {

		System.out.println("custom exception is thrown...");

		try {
			throw new CustomException("custom exception demo");
			
		} catch (Exception e) {
			System.out.println("Custom exception is caught");
			System.out.println("error\t" + e);

		} finally {
			System.out.println("finally block doesn't handle exception!");
			
		}

	}

}
