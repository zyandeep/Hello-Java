package multiThreading;

public class WriteInfo implements Runnable {
	SyncOnject sync;
	String name;
	int age;
	Thread t;

	public WriteInfo(SyncOnject obj, String name, int age) {
		this.name = name;
		this.age = age;
		sync = obj;
		t = new Thread(this);

		t.start();
	}

	public void run() {
		sync.writeInfo(name, age);

	}
}
