class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void increment(int seconds) {
        this.second += seconds;

        if (this.second >= 60) {
            this.minute += this.second / 60;
            this.second %= 60;
        }
        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute %= 60;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d\n", this.hour, this.minute, this.second);
    }
}

public class Ex11_2 {

    public static void main(String[] args) {
        Time t = new Time(18, 50, 30);
        t.increment(8160);
        System.out.println(t);
    }
}