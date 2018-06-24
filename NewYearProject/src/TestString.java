/**
 * String class testing
 * Date: 03/01/14
 * 
 */
	
public class TestString {
	
	public static void main(String[] args) {
	
		char[] arr = {'H','e','l','l','o', ' '};
		String s1 = "Happy new year!";
		
		// this String class constructor takes a char[] array as argument
		String s2 = new String(arr);   
		
		System.out.println(s2);
		System.out.printf("%s\n", s2 + s1);
		
		// same as System.out.printf(), returns a formatted string
		System.out.format("%s, %s\n", s1, s2);
		
		// returns a formatted string
		System.out.println(String.format("%s, %d\n", "Zyandeep", 20));
		
	}

}
