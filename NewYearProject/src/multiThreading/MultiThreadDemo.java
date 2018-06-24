package multiThreading;

public class MultiThreadDemo {

	public static void main(String[] args) {

		System.out.println(" inside main thread:  " + Thread.currentThread() + "\n");

		// inside main thread create 3 child thread
		new MultiThread("child1");
		new MultiThread("child2");
		new MultiThread("child3");

		// controlling main thread
		try {
			// waits for other threads to end
			Thread.sleep(10000);
			
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupetd!");
			
		}
		System.out.println("\n Main Thraed existing...");

	}

}
