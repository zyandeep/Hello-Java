// Demonstration of ordinal(), compareTo(), equals()

package enumeration;

public class EnumDemo2 {

	public static void main(String[] args) {

		Apple ap, ap2, ap3;
		int test;
		boolean b;

		// ordinal() returns the index(ordinal) of a enum-constant.
		System.out.println("These are ordinal values of all Apple constant...\n");

		for (Apple a : Apple.values()) {
			System.out.println(a + " : " + a.ordinal());
		}

		ap = Apple.Reddel;
		ap2 = Apple.GoldenDel;
		ap3 = Apple.Reddel;

		System.out.println();

		// Comparing ordinal values using compareTo()
		if ( (test = ap.compareTo(ap2)) < 0)
			System.out.println(ap + " comes before " + ap2 + "\t result = " + test);

		if ((test = ap.compareTo(ap2)) > 0)
			System.out.println(ap + " comes after " + ap2 + "\t result = " + test);

		if ( (test = ap.compareTo(ap2)) == 0)
			System.out.println(ap + " equals " + ap3 + "\t result = " + test);

		System.out.println();

		// Comparing reference variables using equals() (same as ==)
		if ( (b = ap.equals(ap2)) )
			System.out.println("Error!\t" + b);

		if ( (b = ap.equals(ap3)) )
			System.out.println(ap + " equals " + ap3 + "\t result = " + b);

		if (ap == ap3)
			System.out.println(ap + " == " + ap3);

	}
}
