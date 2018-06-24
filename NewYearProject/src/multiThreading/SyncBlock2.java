// demo of sync block: 2

package multiThreading;

public class SyncBlock2 {

	public void display(int num) {
		System.out.println("i am:  " + Thread.currentThread().getName());

		// sync block
		synchronized (this) {
			for (int i = 1; i <= num; i++) {
				System.out.println("i = " + i);
			}
		}
	}
}
