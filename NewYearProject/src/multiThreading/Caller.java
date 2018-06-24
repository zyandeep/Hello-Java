// this class create thread

package multiThreading;

public class Caller implements Runnable {

	Thread t;
	String msg, name;
	CallMe2 cm;

	public Caller(String n, String m, CallMe2 c) {
		name = n;
		msg = m;
		cm = c;
		t = new Thread(this, name);
		System.out.println("Child thread:  " + t);
		t.start();
		//System.out.println(name + " is started");
	}

	public void run() {

		// call CallMe.print() method to print the message
		cm.print(msg);
	}

}
