package Shape;

import OOPTasks.Triangle;

public class Main {
    static Point point1 = new Point(2,5);
    static Point point2 = new Point(-5,9);
    static Point point3 = new Point(-2,8);
    private static Circle Circle;
    private static Square Square;

    public static void main(String[] args) {
        Triangle1 triangle1 = new Triangle1(point1,point2,point3);
        triangle1.toString();      //проверочная
        Circle circle = new Circle(point1,point3);
        circle.toString();
        Square square = new Square(point1,point3);
        square.toString();
        Table table = new Table();
        table.putShape(Circle);
        table.putShape(Square);
        table.infoTable();
    }
}
