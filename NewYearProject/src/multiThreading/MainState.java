// Thread's blocked state demo

package multiThreading;

public class MainState {

	public static void main(String[] args) {
		
		NewThread5 t = new NewThread5(Thread.currentThread());
		
		// main accessing the sync method
		t.callMe();
		

	}

}
