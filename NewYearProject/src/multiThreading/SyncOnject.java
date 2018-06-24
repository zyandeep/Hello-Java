// inter thread communication

package multiThreading;

public class SyncOnject {
	private String name;
	private int age;
	private boolean status;

	public synchronized void writeInfo(String n, int a) {
		try {
			while(status) {
				System.out.println("waiting for reading...\n");
				wait();
			}
				
		}
		catch(InterruptedException e){			
		}
		
		System.out.println("information is set!");
		name = n;
		age = a;
		status = true;
		notifyAll();
	}

	public synchronized void readInfo() {
		try {
			while(!status) {
				System.out.println("waiting for writing...\n");
				wait();
			}
		}catch(InterruptedException e) {
			
		}
		
		System.out.println("reading information...");

		System.out.println("name:  " + this.name);
		System.out.println("age:  " + this.age);
		status = false;
		notifyAll();
	}

}
