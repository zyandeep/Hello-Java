// demo of deadlock condition

package multiThreading;

public class DeadLock implements Runnable {
	
	A ob1 = new A();
	B ob2 = new B();
	Thread t;
	
	public DeadLock() {
		t = new Thread(this, "child thread");
		Thread.currentThread().setName("main Thread");
		
		t.start();
		ob1.foo(ob2);
		System.out.println("Back to main thread.");
	}
	
	public void run() {
		ob2.bar(ob1);
		System.out.println("Back to child thread.");
	}

	public static void main(String[] args) {
		new DeadLock();

	}

}
