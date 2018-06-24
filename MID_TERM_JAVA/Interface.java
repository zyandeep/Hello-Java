interface FunFacts {  
	int MAX = 7;
	public void print();  
}


public class Interface implements FunFacts {
	
	public void print() {
		System.out.println("MAX is = " + MAX);
		System.out.println("It's 10:37 pm");
		System.out.println("No, it's 10:43 pm");
	}

	public static void main(String[] args) {

		Interface obj = new Interface();
		obj.print();
	}
}  