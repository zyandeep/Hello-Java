// demo of synchronized block: 1 

package multiThreading;

public class SyncBlock1 {
	
	public void paint(String msg) {
		System.out.println("i am :" + Thread.currentThread().getName());
		
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);

		}
		
		System.out.print("]\n");
	}
}
