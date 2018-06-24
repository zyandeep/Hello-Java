package multiThreading;

public class MainRunnable1 {

	public static void main(String[] args) {

		// encapsulate runnable within a Thread object
		Thread t1 = new Thread( new OldRunnable() );
		t1.setName("demo child");
		System.out.println("Child thread:  " + t1 + "  is started!");
		t1.start();

		// main thread
		Thread t2 = Thread.currentThread();
		t2.setName("main thread");
		System.out.println("Main thread:  " + t2);

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
	    System.out.println( t1.getName() );
	    
	}

}
