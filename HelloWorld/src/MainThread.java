class ZThread implements Runnable {

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
			if (i == 5) {

				try {

					System.out.println("i'm sleeping");
					Thread.sleep(5000);

				} catch (Exception e) {
				}
			}
		}
	}
}

public class MainThread {

	public static void main(String[] args) {

		ZThread z = new ZThread();
		new Thread(z).start();

	}

}
