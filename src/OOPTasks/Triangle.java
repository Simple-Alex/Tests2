package OOPTasks;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        super();
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public double halfPerimeter(){
        double pp = (side1 + side2 + side3)/2;
        return pp;
    }

    public double triangleArea(){
        double hp = halfPerimeter();
        double s = Math.sqrt(hp*(hp - side1)*(hp - side2)*(hp - side3));
        return s;
    }

    //МЕГА СЛОЖНАЯ РЕКУРСИЯ!!
    @Override
    public String toString() {
        System.out.println("Half triangle perimeter: "+halfPerimeter());
        if (triangleArea()==0.0){
            System.out.println("Triangle doesn't exist");
        }else {
            return "Triangle area: " + triangleArea();
        }
        return toString();
    }
}
