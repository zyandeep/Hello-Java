// This class generates question

package enumeration;

import java.util.Random;

public class Question {
	Random random = new Random();

	public Answer ask() {
		int prob = random.nextInt(100) + 1;   // generates random nos 1- 100

		if (prob < 15)
			return Answer.MAYBE;

		else if (prob < 30)
			return Answer.NO;

		else if (prob < 60)
			return Answer.YES;

		else if (prob < 75)
			return Answer.LATER;

		else if (prob < 98)
			return Answer.SOON;

		else
			return Answer.NEVER;

	}

}
