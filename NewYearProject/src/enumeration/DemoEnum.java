// demo of enum
// date: 30/01/2014
package enumeration;

public class DemoEnum {

	public static void main(String[] args) {

		// (ref.)variable of enum Apple
		Apple ap;
		ap = Apple.Jonathan;

		// Output an enum value
		System.out.println("Value of app:\t" + ap);
		System.out.println("testing enum:\t" + Apple.GoldenDel);

		// enum variable in if stament
		if (ap == Apple.GoldenDel) {
			System.out.println(ap);
		}

		// enum in switch statement
		switch (ap) {
		case Reddel:
			System.out.println("Red Delicious is red!");
			break;
		case GoldenDel:
			System.out.println("Golden Delicious is yellow!");
			break;
		case Winesap:
			System.out.println("Winesap is red!");
			break;
		case Jonathan:
			System.out.println("Jonathan is red!");
			break;
		case Cortland:
			System.out.println("Cortaland is red!");
			break;
		}
	}

}
