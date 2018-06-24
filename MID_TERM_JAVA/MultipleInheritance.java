interface A {
    public void funA();
}

interface B {
    public void funB();
}

class C {
    void funC() {
        System.out.println("Hello C!");
    }
}

class D extends C implements A, B {
    public void funA() {
        System.out.println("Hello A!");
    }
    public void funB() {
        System.out.println("Hello B!");
    } 
}

public class MultipleInheritance {
    
    public static void main(String[] args) {
        D d = new D();
        d.funA();
        d.funB();
        d.funC();
    }
}
