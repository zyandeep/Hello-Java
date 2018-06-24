package multiThreading;

public class SyncData {

	public static void main(String[] args) {
		SyncOnject so = new SyncOnject();
		
		// creating threads
		WriteInfo o1 = new WriteInfo(so, "harry", 10);
		WriteInfo o2 = new WriteInfo(so, "tom", 20);
		ReadInfo o8 = new ReadInfo(so);
		WriteInfo o3 = new WriteInfo(so, "sarah", 18);
		WriteInfo o4 = new WriteInfo(so, "kate", 15);
		ReadInfo o5 = new ReadInfo(so);
		ReadInfo o6 = new ReadInfo(so);
		ReadInfo o7 = new ReadInfo(so);
	
		// main waits until other threads die
		try{
			o1.t.join();
			o2.t.join();
			o3.t.join();
			o4.t.join();
			o5.t.join();
			o6.t.join();
			o7.t.join();
			o8.t.join();
			
		}catch(InterruptedException e) {
			System.out.println(e);
			
		}
		
		System.out.println("\n existing main thread...");

	}

}
