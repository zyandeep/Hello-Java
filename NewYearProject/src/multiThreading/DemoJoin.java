package multiThreading;

public class DemoJoin {

	public static void main(String[] args) {
		
		// creating threads
		NewThread2 o1 = new NewThread2("Child1");
		NewThread2 o2 = new NewThread2("Child2");
		NewThread2 o3 = new NewThread2("Child3");
		
		// isAlive methods checks whether a thread is alive or not and returns a boolean value
		System.out.println("Thread Child1 is alive: " + o1.t.isAlive());
		System.out.println("Thread Child2 is alive: " + o2.t.isAlive());
		System.out.println("Thread Child3 is alive: " + o3.t.isAlive());
		
		//waits for the threads to finish
		try {
			System.out.println("\n Main thread joins behind other threads...");
			
			// join() joins the caller of join behind the thread on which join() is called
			o1.t.join();
			o2.t.join();
			o3.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("main thread is interrupted!");
			
		}
		
		//
		System.out.println("Thread Child1 is alive: " + o1.t.isAlive());
		System.out.println("Thread Child2 is alive: " + o2.t.isAlive());
		System.out.println("Thread Child3 is alive: " + o3.t.isAlive());
		
		System.out.println("Main thread existing...");

	}

}
