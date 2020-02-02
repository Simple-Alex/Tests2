package Shape;

import Shape.Shape;

public class Circle extends Shape {
    private Point o0;
    private Point radius;

    public Circle() {
        super();
    }

    public Circle(Point radius, Point o0) {
        super();
        this.radius = radius;
        this.o0 = o0;
    }

    public Point getRadius() {
        return radius;
    }

    public void setRadius(Point radius) {
        this.radius = radius;
    }

    public Point getO0() {
        return o0;
    }

    public void setO0(Point o0) {
        this.o0 = o0;
    }

    @Override
    double getPerimeter() {
        return 1;
    }

    @Override
    double getArea() {
        return 2*Math.PI*Math.pow(Point.setDistance(radius,o0),2);
    }

    private double getCircumference(){    //длинна окружности
        return 2*Math.PI*Point.setDistance(radius,o0);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Area = " + getArea() +
                ", Circumference =" + getCircumference() +
                '}';
    }
}
