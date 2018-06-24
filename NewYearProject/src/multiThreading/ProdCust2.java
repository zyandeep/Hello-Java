// inter-thread communication demo using wait(), notify(), notifyAll()
// oracle recommends wait() should be inside a loop

package multiThreading;

public class ProdCust2 {
	private int data;
	private boolean status;
	
	public synchronized void putData(int d) {
		try {
			while(status) {
				System.out.println("waiting for cosumer...");
				
				// made the current thread to release the object's lock 
				// and waiting for notify()/notifyAll() to resume
				wait();
			}
				
			
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		
		this.data = d;
		System.out.println(this.data + " is produced.");
		
		status = true;
		
		// notify other thread that is waiting for the object's lock
		// made the current thread to release the object's lock 
		System.out.println("consumer is notified! ");
		notify();
		
	}

	public synchronized int getData() {
		try {
			while(!status) {
				System.out.println("waiting for producer...");
				
				// made the current thread to release the object's lock 
				// and waiting for notify()/notifyAll() to resume
				wait();
			}
				
			
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(this.data + " is consumed.");
		status = false;
		
		// notify other thread that is waiting for the object's lock
		// made the current thread to release the object's lock 
		System.out.println("producer is notified! ");
		notify();
		return data;
	}

}
