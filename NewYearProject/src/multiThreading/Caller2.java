// this class create thread
// using synchronized block to synchronize threads

package multiThreading;

public class Caller2 implements Runnable {

	Thread t;
	String msg, name;
	CallMe cm;

	public Caller2(String n, String m, CallMe c) {
		name = n;
		msg = m;
		cm = c;
		t = new Thread(this, name);
		System.out.println("Child thread:  " + t);
		t.start();
		// System.out.println(name + " is started");
	}

	public void run() {

		// using synchronized block
		synchronized (cm) {
			cm.print(msg);
		}

		// call CallMe.print() method to print the message
		cm.print(msg);
	}

}
