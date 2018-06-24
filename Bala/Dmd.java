class Super {
    void disp() {
        System.out.println("From Super!");
    }
}

class Sub extends Super {
    void disp() {
        // System.out.println("From Sub!");
        super.disp();
    }
}

class Dmd {
    
    public static void main (String[] args) {
        Super ref = new Super();
        ref.disp();
        
        ref = new Sub(); 
        ref.disp();
    }
}
