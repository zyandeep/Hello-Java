package multiThreading;

public class SuspendResume {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		NewThread3 o1 = new NewThread3("one");
		NewThread3 o2 = new NewThread3("two");
		
		try {
			Thread.sleep(1000);
			System.out.println("suspending one...");
			o1.t.suspend();
			Thread.sleep(1000);
			System.out.println("resuming one...");
			o1.t.resume();
			System.out.println("suspending two...");
			o2.t.suspend();
			Thread.sleep(1000);
			System.out.println("resuming two...");
			o2.t.resume();
			
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("\n\nmain waits to finish other threads...");
			o1.t.join();
			o2.t.join();
			
		}catch(InterruptedException e) {
			System.out.println(e);
			
		}
		System.out.println("\n\nexisting main...");

	}

}
