class A implements Runnable {
    
    public void run() {
        System.out.println("Entering thread A");
        
        for (int i = 1; i <= 7; i++) {
            
            System.out.println("From Thread A, i = " + i);
        }
        
        System.out.println("Exiting from thread A");
    }
}




public class RunnableDemo {
    
    public static void main(String[] args) {
        Thread t = new Thread(new A(), "MyThread");
       
        t.start();
        
    }
}
