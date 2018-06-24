/** a game based on random numbers
 * Date: 07/01/14
 * @author Zyandeep
 */

import java.util.Random;

public class RandomGame {
	final int NO_OF_GAMES;
	private int random, noOfWin;
	private boolean count;
	private Random r = new Random();
	
	// initialising no_of_games
	public RandomGame() {
		NO_OF_GAMES = 10;
	}
	
	public void startGame() {
		for(int i = 1; i<=NO_OF_GAMES; i++) {
			random = r.nextInt(10) + 1;
			
			if(random % 2 == 0) {
				System.out.println("OH! " +random + " is divisible by 2 !");
				count = true;
			}
			else {
				System.out.println("SORRY! "+random + " is not divisible by 2 !");
				count = false;
			}
				

			if(count)
				noOfWin ++;
		}
	}
	
	public void displayResult() {
		System.out.println("\n\n\t The result of the game is below....\n");
		if(noOfWin == 0) {
			System.out.println("Sorry, you have lost the game!");
			System.out.println("Your score is: " + noOfWin + " / 5");
		}
		else {
			if(noOfWin >= 7) 
				System.out.println("You are ginious dude!");
			else
				System.out.println("hurry!, you have won the game!");
				
			System.out.println("Your score is: " + noOfWin + " / 10");
		}
	}
			
}
