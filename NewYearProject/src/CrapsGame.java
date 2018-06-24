/**
 * Simulation of the dice game CRAPS
 * date: 10/01/2014
 * @author Zyandeep
 */

import java.util.Random;    // to generate random numbers

public class CrapsGame {
	
	// Declaration of static members
	private static int t1, t2, sum, point;
	
	static Random r = new Random();     // creating a Random object
	
	// game starts here
	public static void rollDice() {
		System.out.println( "You are rolling the two dices..." );
		
		t1 = r.nextInt(6) + 1;     // make a integer range of 6 (i,e  0 to 5 )
		System.out.println( " The 1st dice shows\t" + t1);
		
		t2 = r.nextInt(6) + 1;
		System.out.println( " The 2nd dice shows\t" + t2);
		
		sum = t1 + t2;
		System.out.printf("%s\t%d + %d = %d\n", "The sum of two dices", t1, t2, sum);
		
		// invoking makeDecision()
		makeDecision();
		
	}
	
	// method to make decision on the SUM
	public static void makeDecision() {
		
		switch(sum) {
		case 7:
		case 11:
			System.out.println("HEY!... You WON the game!!");
			break;
		case 2:
		case 3:
		case 12:
			System.out.println("OH!... You LOSS the game!!");
			break;
		default:
			point = sum;
			System.out.println("You make a POINT of " + point);
			
			// invoking makePoint()
			makePoint();
		}
	}
	
	// method to make decision on the POINT
	public static void makePoint() {
		boolean count = true;
		
		while( count ) {
			System.out.println("\nRolling the dices again...");
			
			t1 = r.nextInt(6) + 1;
			System.out.println( " The 1st dice shows\t" + t1);
			
			t2 = r.nextInt(6) + 1;
			System.out.println( " The 2nd dice shows\t" + t2);
			
			sum = t1 + t2;
			System.out.printf("%s\t%d + %d = %d\n", "The sum of two dices", t1, t2, sum);
			
			if( sum == point) {
				count = false;
				System.out.println("HEY!.. You WON the game!!");	
			}
			
			else if( sum == 7) {
				count = false;
				System.out.println("OH!... You LOSS the game!!");	
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Play the game CRAPS....\n");
		
		// stating the game
		rollDice();
	}
}
