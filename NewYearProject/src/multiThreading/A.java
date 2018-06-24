// demo of deadlock condition

package multiThreading;

public class A {
	
	public A() {
		System.out.println("a sync. object is created!");
	}
	
	public synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " enters A.foo().");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println(name + " trying to call B.last()...");
		b.last();

	}

	public synchronized void last() {
		System.out.println("inside A.last() ");
	}

}
