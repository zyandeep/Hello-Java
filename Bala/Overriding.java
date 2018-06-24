class A {
    int a;
    
    A() {
        a = 24;
    }
    
    void disp() {
        System.out.println("Hi from A! " + a);
    }
}

class B extends A {
    B() {
        super();
    }
    
    void disp() {
        System.out.println("Hi from B! " + a);
        
        super.disp();
    }
    
    
}

class Overriding {
    
    public static void main (String[] args) {
        new B().disp();
    }
}
