package Shape;

public class Square extends Shape{        //прямоугольник (коментарий чисто для себя)
    private Point a;
    private Point b;

    public Square() {
    }

    public Square(Point a, Point b) {
        this.a = a;
        this.b = b;
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
    private double getSide(){
        return Point.setDistance(a,b);
    }

    @Override
    double getPerimeter() {
        return getSide()*4;
    }

    @Override
    double getArea() {
        return Math.pow(getSide(),2);
    }

    @Override
    public String toString() {
        return "Square = " + getArea();
    }
}
