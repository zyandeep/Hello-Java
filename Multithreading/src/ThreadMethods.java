/*
 * Thread methods
 * Date: 30-09-13
 */

class A1 extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			
			System.out.println("From A1, i = " + i);
		}
		System.out.println("Exit from thread A1 ");
	}
}

class B1 extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			
			System.out.println("From B1, i = " + i);
		}
		System.out.println("Exit from thread B1 ");
	}
}

class C1 extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			
			System.out.println("From C1, i = " + i);
		}
		System.out.println("Exit from thread C1 ");
	}
}

public class ThreadMethods{

	public static void main(String[] args) {
		
		A1 a1 = new A1();
		B1 b1 = new B1();
		C1 c1 = new C1();
		
		a1.start();
		b1.start();
		c1.start();
		
	}

}
