package Shape;

public class Triangle1 extends Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle1() {
    }

    public Triangle1(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return Point.setDistance(a,b)+Point.setDistance(b,c)+Point.setDistance(c,a);
    }
    private double halfPerim(){
        return getPerimeter()/2;
    }

    @Override
    double getArea() {
        return Math.sqrt(halfPerim()*(halfPerim() -
                (Point.setDistance(a,b)))*(halfPerim() -
                Point.setDistance(b,c))*(halfPerim() -
                Point.setDistance(c,a)));
    }

    @Override
    public String toString() {
        System.out.println(getArea());   //нужны ли такие строки в серверном приложении...?
        return "Triangle1{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';

    }
}
