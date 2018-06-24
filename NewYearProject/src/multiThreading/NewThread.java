// new way extending Thread class

package multiThreading;

public class NewThread extends Thread {

	public NewThread() {

		// calling super class constructor to set thread name
		super("child demo");
		System.out.println("Child thread:  " + this);
		start();
	}

	// overrides runnable
	public void run() {
		System.out.println(Thread.currentThread());
		Thread t = Thread.currentThread();
		
		// set new name and priority
		t.setName("test child");
		t.setPriority(Thread.MIN_PRIORITY + 3);

		for (int i = 1; i <= 5; i++) {
			System.out.println("child thread:  " + i);

			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				System.out.println("child interrupted");

			}
		}
		System.out.println("existing from child thread...");
		
		// display name and priority
		System.out.println("\nname of child thread:  " + t.getName());
		System.out.println("priority of child:  " + t.getPriority());
	}
}
