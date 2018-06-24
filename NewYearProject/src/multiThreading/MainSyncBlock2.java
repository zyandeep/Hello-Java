package multiThreading;

public class MainSyncBlock2 implements Runnable {
	
	private SyncBlock2 sync = new SyncBlock2();
	private Thread t;
	private int num;
	
	public MainSyncBlock2(String name, int num) {
		this.num = num;
		t = new Thread(this, name);
		System.out.println("thread:  " + t);
		
		t.start();
	}
	
	public void run() {
		sync.display(num);
	}
 

	public static void main(String[] args) {

		System.out.println("thread:  " + Thread.currentThread());
		
		MainSyncBlock2 ob = new MainSyncBlock2("child", 5);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		ob.sync.display(10);
		
	}

}
