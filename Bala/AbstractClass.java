abstract class A {
    abstract void disp(int number);
    void disp(char c) {
        System.out.println(c);
    }
}

class B extends A {
    void disp(int number) {
        System.out.println(number);
        disp('A');
    }
}

class AbstractClass {
    
    public static void main (String[] args) {
        new B().disp(25);
    }
}
