/*
 * Multi threading Demo
 * Date: 30-09-13
 */

class A2 extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			
			if(i == 3) {
				
				yield();
			}
			System.out.println("From A2, i = " + i);
		}
		System.out.println("Exit from thread A2 ");
	}
}

class B2 extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			
			System.out.println("From B2, i = " + i);
		}
		System.out.println("Exit from thread B2 ");
	}
}

class C2 extends Thread {
	
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			
			if(i == 3) {
				
				try {
					
					sleep(5000);
					
				} catch(InterruptedException ie) { }
					
			}
			System.out.println("From C2, i = " + i);
		}
		System.out.println("Exit from thread C2 ");
	}
}

public class ThreadTest{

	public static void main(String[] args) {
		
		new A2().start();
		new B2().start();
		new C2().start();

	}

}
