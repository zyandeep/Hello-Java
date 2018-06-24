class A implements Runnable {
    
    public void run() {
        System.out.println("Entering thread A");
        
        for (int i = 1; i <= 7; i++) {
            
            System.out.println("From Thread A, i = " + i);
        }
        
        System.out.println("Exiting from thread A");
    }
}

class B implements Runnable {
    
    public void run() {
        System.out.println("Entering thread B");
        
        for (int j = 1; j <= 7; j++) {
      
            System.out.println("From Thread B, j = " + j);
        }
        
        System.out.println("Exiting from thread B");
    }
    
}

class C implements Runnable {
    
    public void run() {
        System.out.println("Entering thread C");
        
        for (int k = 1; k <= 7; k++) {
       
            System.out.println("From Thread C, k = " + k);
        }
        
        System.out.println("Exiting from C");
    }
}


public class MainRunnable {
    
    public static void main(String[] args) {
        Thread a = new Thread( new A() );
        Thread b = new Thread( new B() );
        Thread c = new Thread( new C() );
        
        a.start(); 
        b.start();
        c.start();
    }
}
