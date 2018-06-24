// this thread produces data

package multiThreading;

public class Producer implements Runnable {
	ProdCust2 pc;
	Thread t;

	public Producer(ProdCust2 pc) {
		this.pc = pc;
	
	    t = new Thread(this, "producer");
		t.start();	
	}
	
	public void run() {
		int i = 0;
		
		while(i++ <= 5) {
			pc.putData(i);
		}
		
	}

}
