package multiThreading;

public class SuspendResume2 {

	public static void main(String[] args) {
		
		NewThread4 o1 = new NewThread4("one");
		NewThread4 o2 = new NewThread4("two");
		
		try {
			Thread.sleep(1000);
			o1.mySuspend();
			System.out.println("suspending one...");
			Thread.sleep(1000);
			o1.myResume();
			System.out.println("resuming one...");
			
			o2.mySuspend();
			System.out.println("suspending two...");
			Thread.sleep(1000);
			o2.myResume();
			System.out.println("resuming two...");
			
			
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
