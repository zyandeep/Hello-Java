public class WrapperDemo {

	public static void main(String[] args) {
		
		Integer intObj = 5;  // autoboxing
		System.out.println(intObj + 5); // unboxing
		
		Double d = new Double("2.5");
		System.out.println(d.doubleValue() + 5);
		
		String s1 = Integer.toString(20);  // converting numbers to string
		String s2 = String.valueOf(1);
		System.out.println(s1 + s2);
		
		Integer i1 = Integer.valueOf("20");  // converting strings to number
		double d1 = Double.valueOf("5.25"); 
		boolean b = Boolean.parseBoolean("true");
		System.out.println(i1 + d1);
		System.out.println(b);
	}

}
