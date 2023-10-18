package Lesson_1.Lection_1.Task_1;

/**
 * Это точка 2D
 */
public class Point2D {
    private int x, y;

    /**
     * @param ValueX это координата Х
     * @param ValueY это координата Y
     */
    public Point2D(int ValueX, int ValueY) {
        x = ValueX;
        y = ValueY;
    }

    public Point2D() {
        this(0);
    }

    public Point2D(int value) {
        this(value, value);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));

    }

}