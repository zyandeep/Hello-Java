import java.lang.Math;

class Room {
	
	double l,b;
	
	Room(double l, double b) {
		
		this.l = l;
		this.b = b;
		System.out.println("Area is " + this.l * this.b);	
	}
}

public class DemoMath {

	public static void main(String[] args) {
		
		new Room(2.5, 3.6);
		System.out.println((int)Math.sqrt(25));
		System.out.println((int)Math.pow(2, 5));

	}

}
