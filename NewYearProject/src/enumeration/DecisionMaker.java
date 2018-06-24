// Main game

package enumeration;

public class DecisionMaker {

	public static void check(Answer a) {
		switch (a) {
		case YES:
			System.out.println("YES!");
			break;
		case SOON:
			System.out.println("SOON!");
			break;
		case NO:
			System.out.println("NO!");
			break;
		case NEVER:
			System.out.println("NEVER!");
			break;
		case MAYBE:
			System.out.println("MAYBE!");
			break;
		case LATER:
			System.out.println("LATER!");
			break;
		}

	}

	public static void main(String[] args) {

		Question q = new Question();

		// game starts here...
		check(q.ask());
		check(q.ask());
		check(q.ask());
		check(q.ask());
		check(q.ask());
		check(q.ask());

	}

}
