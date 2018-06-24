// synchronizes version of CallMe
// synchronization helps in preventing other threads from accessing a shared resource when a thread access that resource

package multiThreading;

public class CallMe2 {

	// displays the message
	synchronized public void print(String msg) {
		System.out.println("inside " + (Thread.currentThread()).getName());
		System.out.print("[" + msg);

		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread() + " is interrupted!");
			
		}
		System.out.println("]");

	}

}
