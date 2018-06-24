class SuperClass {
    
    void area(int l, int w) {
        System.out.println("Area of the rectangle = " + l * w);
    }
}

class SubClass extends SuperClass {
    
    void volume(int l, int w, int h) {
        System.out.println("Volume of the box = " + l * w * h);
    }
}


public class Inheritance {

    public static void main(String[] args) {
        SubClass s = new SubClass();
        
        s.area(12, 10);
        s.volume(12, 10, 6);
    }
}
