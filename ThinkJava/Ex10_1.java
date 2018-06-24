import java.awt.Point;

class Ex10_1 {

    public static int riddle(int x, Point p) {
        x = x + 7;
        p.x = 12;
        p.y = 10;
        return x + p.x + p.y;
    }

    public static void main(String[] args) {
        int x = 5;
        Point blank = new Point(1, 2);
        System.out.println(riddle(x, blank));
        System.out.println(x);
        System.out.println(blank.x);    // blank object is mutable
        System.out.println(blank.y);
    }
}