// Enum implemented as class

package enumeration;

public class EnumDemo {

	public static void main(String[] args) {

		// Display price of GolrdelDel and Winesap
		System.out.println("\nGoldenDel costs:\t" + Apple3.GoldenDel.getPrice());
		System.out.println("Winesap costs:\t" + Apple3.Winesap.getPrice());

		// Setting price
		Apple3.GoldenDel.setPrice(15);
		Apple3.Winesap.setPrice(25);

		// Display all apples and prices
		System.out.println();
		System.out.println("All apples prices...\n");
		for (Apple3 ap : Apple3.values()) {
			System.out.println(ap + " costs " + ap.getPrice());

		}

	}

}
