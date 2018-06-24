// thread to display 

package multiThreading;

public class TestThread extends Thread {
	Thread mt;

	public TestThread(Thread m) {

		// it returns the reference to the currently running thread
		System.out.println(currentThread());
		mt = m;
		System.out.println("inside constructor\t" + getState());
		System.out.println();
	}

	public void run() {
		System.out.println("inside run()\t" + getState());
		System.out.println(currentThread());
		System.out.println("\n\n i am running...");
		
		try {
			sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n i was sleeping...");
		for(int i = 1; i <=10; i++);
		System.out.println("main\t" + mt.getState());
		
	}
}
