class A {
    String text = new String("Hello World!");
}

class B extends A {
    void display() {
        System.out.println(text);
    }
}


class TestSubSuper {
    
    public static void main(String[] args) {
        A a = new B();
        a.display();        // A parent reference can only access its members
    }
}