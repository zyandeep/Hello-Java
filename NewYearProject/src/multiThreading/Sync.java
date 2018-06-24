// problems for unsynchronized threads

package multiThreading;

public class Sync {

	public static void main(String[] args) {

		CallMe2 target = new CallMe2();

		// creating threads
		Caller o1 = new Caller("child1", "Hello", target);
		Caller o2 = new Caller("child2", "World", target);
		Caller o3 = new Caller("child3", "Java", target);

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
