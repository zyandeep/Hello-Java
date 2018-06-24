/*
 * Thread Priority Test
 * Date: 30-09-13
 */

class P1 extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			
			System.out.println("From P1, i = " + i);
		}
		System.out.println("Exit from thread P1 ");
	}
}

class P2 extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			
			System.out.println("From P2, i = " + i);
		}
		System.out.println("Exit from thread P2 ");
	}
}

class P3 extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			
			System.out.println("From P3, i = " + i);
		}
		System.out.println("Exit from thread P3 ");
	}
}

public class PriorityTest {

	public static void main(String[] args) {
		
		P1 a = new P1();
		P2 b = new P2();
		P3 c = new P3();
		
		System.out.println(" Threads priority BEFOR setting... ");
		System.out.println("a's priority: " + a.getPriority());
		System.out.println("b's priority: " + b.getPriority());
		System.out.println("c's priority: " + c.getPriority());
		
		System.out.println("\n\n Threads priority AFTER setting... ");
		b.setPriority(Thread.NORM_PRIORITY + 3);
		c.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("a's priority: " + a.getPriority());
		System.out.println("b's priority: " + b.getPriority());
		System.out.println("c's priority: " + c.getPriority());
		
		a.start();
		b.start();
		c.start();
	
	}

}
