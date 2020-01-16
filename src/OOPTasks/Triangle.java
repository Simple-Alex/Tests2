package OOPTasks;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private int s;
    private double pp = (side1 + side2 + side3)/2;

    public Triangle() {
        super();
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int triangleArea(){
        return s = ((int)Math.sqrt(pp*(pp - side1)*(pp - side2)*(pp - side3)));
    }
}
