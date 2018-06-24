// suspending and resuming in java

package multiThreading;

public class NewThread3 implements Runnable {
	String name;
	Thread t;
	
	public NewThread3(String name) {
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
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		System.out.println("existing " + name + "...");
		
	}

}
