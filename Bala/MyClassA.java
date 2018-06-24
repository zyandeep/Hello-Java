public class MyClassA {

    String display() {
        return String.format("**%s**", "Hello!!");
    }
}

class MyClassB {

    public static void main(String[] args) {
        System.out.println(new MyClassA().display());
    }
}