class A extends Thread {
    
    public void run() {
        System.out.println("Entering thread A");
        
        for (int i = 1; i <= 7; i++) {
            
            System.out.println("From Thread A, i = " + i);
        }
        
        System.out.println("Exiting from thread A");
    }
}

class B extends Thread {
    
    public void run() {
        System.out.println("Entering thread B");
        
        for (int j = 1; j <= 7; j++) {
      
            System.out.println("From Thread B, j = " + j);
        }
        
        System.out.println("Exiting from thread B");
    }
    
}

class C extends Thread {
    
    public void run() {
        System.out.println("Entering thread C");
        
        for (int k = 1; k <= 7; k++) {
       
            System.out.println("From Thread C, k = " + k);
        }
        
        System.out.println("Exiting from C");
    }
}


public class ThreadPriority {
    
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(b.getPriority() - 2);
        c.setPriority(Thread.MAX_PRIORITY);
        
        a.start();
        b.start();
        c.start();
    }
}
