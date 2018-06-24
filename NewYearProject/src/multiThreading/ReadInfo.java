// Reads information...

package multiThreading;

public class ReadInfo implements Runnable {
	SyncOnject sync;
	Thread t;
	
	public ReadInfo(SyncOnject obj) {
		sync = obj;
		t = new Thread(this);
		
		t.start();
		
	}
	
	public void run() {
		sync.readInfo();
		
	}

}
