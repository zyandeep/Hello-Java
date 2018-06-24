package multiThreading;

public class NewThread1 implements Runnable {
	
	private String msg;
	private SyncBlock1 sync;
	Thread t;
	
	public NewThread1(String msg, String name, SyncBlock1 sync ) {
		this.msg = msg;
		this.sync = sync;
		
		t = new Thread(this, name);
		System.out.println("child:  " + t);
		t.start();
	}
	
	public void run() {
		synchronized (sync) {
			sync.paint(msg);
			
		}
	}

}
