// use of isAlive() and join() methods

package multiThreading;

public class NewThread2 implements Runnable {
	String name;
	Thread t;

	public NewThread2(String n) {
		name = n;
		t = new Thread(this, name);
		System.out.println("child thread:  " + t);
		t.start();
	}

	public void run() {
		System.out.println("starting " + name + "...\n");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + ":  " + i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(name + " is interrupted!");
				
			}

		}
		System.out.println(name + " thread existing...");

	}

}
