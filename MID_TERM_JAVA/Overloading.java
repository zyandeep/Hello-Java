class AllArea {
    
    void area(double r) {           // Area of a circle
        System.out.println("Area of the circle: " + 3.14 * r * r);    
    }
    
    void area(double h, double b) {           // Area of a triangle
        System.out.println("Area of the triangle: " + (1/2.0) * b * h);
    }
    
   void area(int l, int b) {        // Area of a rectangle
        System.out.println("Area of the rectangle: " + l * b);
   }
}

public class Overloading {
    
    public static void main(String[] args) {
       AllArea a = new AllArea();
       a.area(5.4);
       a.area(12.0, 20.5);
       a.area(5, 4);
    }
}
