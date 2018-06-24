interface A {
    public static final int myAge = 24;
    public void display();
}

interface B {
    int yourAge = 23;
    void show();
}


class Multiple implements A, B {

    public void display() {
        System.out.println("Zyandeep " + myAge);
    }

    public void show() {
        System.out.println("Dipsikha " + yourAge);
    }
}


class TestInterface {

    public static void main(String[] args) {
        Multiple m = new Multiple();
        m.display();
        m.show(); 
    }
}