/* Common String methods in Java
   Date: 23 sept,13
***************************/
import java.util.Scanner;

class String5
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String s1="  	hello  ";    				// String as primitive data-type
		System.out.println(s1);
		s1=s1.trim();						// remove white-spaces from beg and end 
		System.out.println(s1);
		String s2=new String();		 // String as non-primitive data-type
		System.out.println(" Enter a string: ");
		s2= s1+" "+input.next();
		System.out.println(s2);
		System.out.println("s1 equals to s2? " +s1.equals(s2));   // returns true if s1==s2
		System.out.println("compare s1 to s2 " +s1.compareTo(s2));   // returns +ve if s1>s2; -ve if s1<s2; 0 if s1==s2
		s1=s1.toUpperCase();     // converts s1 to upper-case
		System.out.println(s1);
		s1=s1.toLowerCase();	 // converts s1 to lower-case
		System.out.println(s1);
		s2=s2.replace('l','x');		// replace all 'l' with 'x'
		System.out.println(s2); 
		String s3="world ";
		String s4="technology";
		System.out.println("s3 equals to s4? " +s3.equalsIgnoreCase(s4));  // check for equality ignoring case
		System.out.println("length of s3: " +s3.length());    // returns the length of s3
		System.out.println("Character at index 3 of s4= " +s4.charAt(3));    // returns char at index 3
		System.out.println("Concatenation of s3&s4: " +s3.concat(s4));    // Concatenates s3&s4
		System.out.println("Sub-string from index 4 of s4: " +s4.substring(4));    // returns sub-string  from index 4
		System.out.println("Sub-string from index 4 upto 8 of s4: " +s4.substring(4,8));
		// returns sub-string  from index 4 upto 8
		
		System.out.println("index of first occurrence of 'o' in s4= " +s4.indexOf('o'));  // returns index of first occurrence of 'o'
		System.out.println("index of 'o' of s4 after index 6= " +s4.indexOf('o',6));  // returns index of 'o' after index 5
	}
}