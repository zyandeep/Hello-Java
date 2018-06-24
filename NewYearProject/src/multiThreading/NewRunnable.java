// Implementing runnable in new way

package multiThreading;

public class NewRunnable implements Runnable {
	
	Thread t;
	
	public NewRunnable() {
		
		// encapsulate runnable within a Thread object
		t = new Thread( this, "child demo");
		System.out.println("Child thread:  " + t);
		t.start();
	}
	
	public void run() {
		
		System.out.println( Thread.currentThread() );
		
		// setPriority() sets the priority of the thread
		t.setPriority( Thread.MIN_PRIORITY + 1 );
		
		for( int i = 1; i <= 5 ; i++) {
			System.out.println("child thread:  " + i);
			
			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				System.out.println("child interrupted");

			}
		}
		System.out.println("existing from child thread...");
		
		// displaying the priority
	    System.out.println("\npriority of child:  " +  t.getPriority());

	}

}
