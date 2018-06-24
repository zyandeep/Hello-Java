// obtaining thread status

package multiThreading;

public class ThreadStatus {

	public static void main(String[] args) {

		TestThread t = new TestThread(Thread.currentThread());
		//System.out.println(t.getState());

		t.start();
		System.out.println("start() is invoked\t" + t.getState());
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("sleep() is invoked\t" + t.getState());
		
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("outside of run()\t" + t.getState());
	
	}

}
