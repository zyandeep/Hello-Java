class MyClass {
    
    void movie() {
        System.out.println("Movie: The Pursuit of Happiness");
    }
    void tvSeries() {
        System.out.println("TV Series: F.R.I.E.N.D.S.");
    }
}

class YourClass extends MyClass {    
    void tvSeries() {
        System.out.println("TV Series: Stranger Things");
    }
}

public class FuncOverRidding {
    
    public static void main(String[] args) {
        MyClass m = new MyClass();
        m.movie();
        m.tvSeries();
        
        m = new YourClass();
        m.movie();
        m.tvSeries();               // tvSeries() has been overridden
    }
}
