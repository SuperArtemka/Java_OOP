package Lesson_1.Lection_1.Task_1;

public class Program {



    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        System.out.println(a.getX());

            Point2D b = new Point2D(10);
            System.out.println(b.getY());

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
    }
