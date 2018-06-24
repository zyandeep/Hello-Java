// enum deceleration inside a class

package enumeration;

public class EnumDemo1 {

	Lang e = Lang.Java;

	// Lang is visible outside of EnumDemo1
	enum Lang {
		Java(9.5), Php(9.0), Javascript(9.0), Cplspls(8.5);

		private double rating;

		Lang(double r) {
			this.rating = r;
		}

		double get() {
			System.out.println("rating of " + this + " is...");
			return rating;
		}
	}

	public void testEnum() {
		System.out.println(e.get());

		// accessing private members of inner-enum by enclosing class
		System.out.println(Lang.Php.rating);

	}
}
