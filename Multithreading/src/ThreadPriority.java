/*
 * Thread priority in Multi threading
 * Date: 29-09-13
 */

class A extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=5; i++) {
			
			System.out.println("From A, i = " + i);
		}
	}
}

class B extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=5; i++) {
			
			System.out.println("From B, i = " + i);
		}
	}
}

class C extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=5; i++) {
			
			System.out.println("From C, i = " + i);
		}
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		c.setPriority(Thread.MAX_PRIORITY);
		b.setPriority(Thread.NORM_PRIORITY);
		a.setPriority(Thread.MIN_PRIORITY);
		
		c.start();
		a.start();
		b.start();
	}

}
