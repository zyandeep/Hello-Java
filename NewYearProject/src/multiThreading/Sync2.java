// problems for unsynchronized threads

package multiThreading;

public class Sync2 {

	public static void main(String[] args) {

		CallMe target = new CallMe();

		// creating threads
		Caller2 o1 = new Caller2("child1", "Hello", target);
		Caller2 o2 = new Caller2("child2", "World", target);
		Caller2 o3 = new Caller2("child3", "Java", target);

		// waits for the threads to finish
		try {
			System.out.println("\n Main thread joins behind other threads...");

			// join() joins the caller of join() behind the thread on which join() is called
			o1.t.join();
			o2.t.join();
			o3.t.join();
			
		} catch (InterruptedException e) {
			System.out.println("main thread is interrupted!");

		}
		System.out.println("\n Main Thraed existing...");

	}

}
