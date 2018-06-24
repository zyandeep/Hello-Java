class A extends Thread {
    
    public void run() {
        for (int i = 1; i <= 7; i++) {
            if (i == 1) {
                yield();
            }
            System.out.println("From Thread A, i = " + i);
        }
        
        System.out.println("Exiting from A");
    }
}

class B extends Thread {
    
    public void run() {
        for (int j = 1; j <= 7; j++) {
            if (j == 3) {
                stop();
            }
            System.out.println("From Thread B, j = " + j);
        }
        
        System.out.println("Exiting from B");
    }
    
}

class C extends Thread {
    
    public void run() {
        for (int k = 1; k <= 7; k++) {
            if (k == 5) {
                
                try {
                    sleep(1000);        // time is in milisecond
                }
                catch(Exception e) {}

            }
            System.out.println("From Thread C, k = " + k);
        }
        
        System.out.println("Exiting from C");
    }
}


public class ThreadMethods {
    
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}
