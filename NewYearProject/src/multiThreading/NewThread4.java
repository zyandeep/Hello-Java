// suspending and resuming in java with wait() and notify() 

package multiThreading;

public class NewThread4 implements Runnable {
	String name;
	Thread t;
	boolean status;
	
	public NewThread4(String name) {
		this.name = name;
		t = new Thread(this,  name);
		
		System.out.println("child:  " + t);
		System.out.println(this.name + " is started...");
		t.start();	
	}
	
	public void run() {
		for(int i = 1; i<= 20; i++) {
			System.out.println(name + " " + i);
			
			try {
				Thread.sleep(200);
				
				synchronized (this) {
					while(status) {
						wait();
					}
				}
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		System.out.println("existing " + name + "...");
		
	}
	
	synchronized public void mySuspend() {
		status = true;
	}
	
	synchronized public void myResume() {
		status = false;
		notify();
	}

}
