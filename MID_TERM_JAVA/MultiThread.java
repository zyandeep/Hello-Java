class A implements Runnable {
    
    public void run() {
        System.out.println("This is Thread A.");
        
        for (int i = 1; i <= 7; i++) {
            
            System.out.println("From Thread A, i = " + i);
        }
        
        System.out.println("Exiting from thread A");
    }
}

class B extends Thread {

    public void run() {
        System.out.println("This is Thread B.");
        
        for (int j = 1; j <= 7; j++) {
            
            System.out.println("From Thread B, j = " + j);
        }
        
        System.out.println("Exiting from thread B");
    }
}



public class MultiThread {

    public static void main(String[] args) {
        Thread t = new Thread( new A());
        B b = new B();

        t.start();
        b.start();
    }
}