// Implementing runnable in old way

package multiThreading;

public class OldRunnable implements Runnable {

	// overriding run()
	public void run() {
		
		System.out.println( Thread.currentThread() );
		Thread t = Thread.currentThread();
		t.setName("test");
	
		for (int i = 1; i <= 5; i++) {
			System.out.println("child thread:  " + i);

			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				System.out.println("child interrupted");

			}
		}
		System.out.println("existing from child thread...");

	}

}
