
public class Point {
    private char name;
    private double x;

    public Point(char name, double x) {
        this.name = name;
        this.x = x;
    }

    public void translate(double x) {
        this.x += x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "name=" + name +
                ", x=" + x +
                '}';
    }

}
