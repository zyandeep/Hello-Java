/*
 * Multi threading implementing Runnable
 * Date: 29-09-13
 */

class R1 implements Runnable {
	
	public void run() {
		
		System.out.println("Hello, i'm thread R1");

		for(int i = 0; i<=50; i++) {
			
			System.out.println("From R1, i = " + i);
		}
		System.out.println("Exit from thread R1 ");
	}
}

class R2 implements Runnable {
	
	public void run() {
		
		System.out.println("Hello, i'm thread R2");

		for(int i = 0; i<=50; i++) {
			
			System.out.println("From R2, i = " + i);
		}
		System.out.println("Exit from thread R2 ");
	}
}

public class RunnableTest {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new R1());
		Thread t2 = new Thread(new R2());
		
		t1.start();
		t2.start();
	}

}
