// inter-thread communication demo

package multiThreading;

public class InterThread {
public static void main(String[] args) {
	
	ProdCust2 pc = new ProdCust2();
	
	// creating threads
	Producer o1 = new Producer(pc);
	Consumer o2 = new Consumer(pc);
	
	// main waits until other threads die
	try{
		o1.t.join();
		o2.t.join();
		
	}catch(InterruptedException e) {
		System.out.println(e);
		
	}
	
	System.out.println("\n existing main thread...");
	
}
}
