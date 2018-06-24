class Date {
    private int year;
    private int month;
    private int day;

    Date() {
        year = 2000;
        month = 1;
        day = 1;
    }
    Date(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return String.format("%d-%d-%d", day, month, year);
    }
}

public class Ex11_4 {
    
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(new Date(27, 7, 1993));
    }
}