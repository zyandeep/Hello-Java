// call this class for displaying message

package multiThreading;

public class CallMe {

	// displays the message
	public void print(String msg) {
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
