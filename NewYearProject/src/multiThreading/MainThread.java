/* main thread controlling
 * date: 21-01-0214
 */

package multiThreading;

public class MainThread {

	public static void main(String[] args) {
		
		// currentThread() returns the reference of the thread in which it is called
		Thread t = Thread.currentThread();
		System.out.println("main thread:  " + t);
		
		// setName() sets the name of a thread
		t.setName("Main Thread");
		System.out.println("main thread:  " + t);
		
		// getName() returns the name of a thread
		System.out.println( "main thread name:  " + t.getName() );
		
		// controlling main thread
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = "  + i);
			
			// sleep() pauses/sleeps a thread for a given amount( millisecond ) of time
			// and throws a checked exception
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("main thread is interrupted!");
				
			}
		
		}
		System.out.println("existing from main thraed");

	}

}
