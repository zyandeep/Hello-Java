class MyException extends Exception {
    
    MyException(String message) {
        super(message);
    }
}

class MyClass {
    
    static void testMethod(String str) throws MyException {
        if (!str.equals("India"))
            throw new MyException("It's NOT India!!");             
    }
}

public class TestException {

    public static void main(String[] args) {
        try {
            //MyClass.testMethod("America");
            MyClass.testMethod("India");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I'm always here");
        }
    }
}
