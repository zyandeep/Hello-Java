// enum deceleration inside a class

package enumeration;

public class EnumDemo3 {

	public static void main(String[] args) {

		EnumDemo1 ob = new EnumDemo1();
		
		/*System.out.println(ob.e);
		ob.testEnum();

		System.out.println();

		// accessing inner-enum outside its enclosing class
		for (EnumDemo1.Lang var : EnumDemo1.Lang.values())
			System.out.println(var);*/
		
		ob.testEnum();
		
		// accessing Cplspls's non-private members from main() 
		System.out.println( EnumDemo1.Lang.Cplspls.get() );
		
		// EnumDemo1.Lang.Java.rating;   error! can't access private members outside enum                                        

	}

}
