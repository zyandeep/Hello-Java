package multiThreading;

public class ExtendThread {

	public static void main(String[] args) {

		// instantiate thread object
		new NewThread();

		// main thread
		Thread t = Thread.currentThread();
		t.setName("main thread");
		System.out.println("Main thread:  " + t);

		// main thread control
		for (int i = 1; i <= 5; i++) {
			System.out.println("main thread:  " + i);

			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				System.out.println("main interrupted");

			}
		}
		System.out.println("existing from main thread...");

	}

}
