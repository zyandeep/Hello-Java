// Creating multiple threads 

package multiThreading;

public class MultiThread implements Runnable {

	String name;
	Thread t;

	public MultiThread(String n) {
		name = n;
		t = new Thread(this, name);
		System.out.println("\nChild thread:  " + t + "  is created");

		// display main thread
		System.out.println("main thread:  " + Thread.currentThread());

		t.start();

	}

	public void run() {
		System.out.println("\n" + Thread.currentThread() + "  is started");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + ":  " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(name + " interrupted!");
			}

		}
		System.out.println(t.getName() + "  thread existing...");
	
	}
}
