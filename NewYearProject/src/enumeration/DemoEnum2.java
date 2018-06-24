// demo of values() and valueOf()

package enumeration;

enum Apple2 {
	Jonathan, GoldenDel, Winesap, Reddel, Cortland;
}

public class DemoEnum2 {

	public static void main(String[] args) {

		Apple2 ap;
		Apple2[] allapple = Apple2.values(); // values() returns the reference to
											// array of Apple enum-constants.

		System.out.println("Here are all apple constants...\n");

		for (Apple2 a : allapple) {
			System.out.println(a);
		}

		System.out.println();

		// valueOf() converts a string to its corresponding enum constant
		ap = Apple2.valueOf("Jonathan");
		System.out.println("ap contains: " + ap);

	}

}
