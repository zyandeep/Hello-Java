// inter-thread communication demo

package multiThreading;

public class ProdCust {
	private int data;
	
	public synchronized void putData(int d) {
		this.data = d;
		System.out.println(this.data + " is produced.");
	}

	public synchronized int getData() {
		return data;
	}

}
