package multiThreading;

public class Consumer implements Runnable {
	ProdCust2 pc;
	Thread t;
	
	public Consumer(ProdCust2 pc) {
		this.pc = pc;
		
		t = new Thread(this, "consumer");
		t.start();	
	}
	
	public void run() {
		int i = 0;
		
		while(i++ <= 5) {
			pc.getData();
		}
		
	}

}
