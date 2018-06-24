// getting thread status by getState()

package multiThreading;

public class NewThread5 implements Runnable {

	Thread mt;
	Thread ct;

	public NewThread5(Thread m) {
		mt = m;
		ct = new Thread(this, "child");

		ct.start();
	}

	public void run() {
		System.out.println("child status:\t" + ct.getState());
		
		// getting object's lock
		callMe();
		System.out.println();

	}

	synchronized public void callMe() {
		System.out.println("inside\t" + Thread.currentThread());

		for (int i = 1; i <= 10; i++)
			;
		System.out.println("main\t" + mt.getState());
		System.out.println("child\t" + ct.getState());

	}
}
