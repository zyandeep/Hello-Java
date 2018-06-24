package multiThreading;

public class MainSyncBlock1 {

	public static void main(String[] args) {
		
		SyncBlock1 sync = new SyncBlock1();
		
		// creating child threads
		NewThread1 o1 = new NewThread1("hello", "child1", sync );
		NewThread1 o2 = new NewThread1("world", "child2", sync );
		NewThread1 o3 = new NewThread1("java", "child3", sync );
		
		// main() waits until child threads ends
		try {
			o1.t.join();
			o2.t.join();
			o3.t.join();
			
		}catch(InterruptedException e) {
			System.out.println(e);

		}
		
		System.out.println("\n\nexisting main...");
	}

}
