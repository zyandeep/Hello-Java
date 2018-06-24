// Random number in Java

import java.util.Random;   // for Random class

public class RandomNumber {
	
	//private int random ;
	private Random r = new Random();

	public void testRandom1() {
		for(int i=1; i<=5; i++) {
			System.out.println(r.nextInt());   // range of random integers +- 0-2^32
		}
	}
	
	public void testRandom2() {
		for(int i=1; i<=5; i++) {
			System.out.println(r.nextInt(6) + 1);   // range of random integers 0-5; total 6
		}
	}
}
