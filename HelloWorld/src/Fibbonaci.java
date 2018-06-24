/*
 * Fibonaci Series
 */
public class Fibbonaci {

	public static void main(String[] args) {
		
		int a,b,c;
		
		a = 0;
		b = 1;
		
		for(int i = 1; i<=7; i++){
			
			if(a == 0 && b == 1)
				System.out.println(+ a + "\n"+ b + "");
			
			c = a + b;
			System.out.println(+ c + "");
			
			a = b;
			b = c;
		}

	}

}
