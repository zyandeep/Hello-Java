// demo of deadlock condition

package multiThreading;

public class B {
	
	public B() {
		System.out.println("another sync. object is created!");
	}
	
	public synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " enters B.bar().");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println(name + " trying to call A.last()...");
		a.last();

	}

	public synchronized void last() {
		System.out.println("inside B.last() ");
	}

}
