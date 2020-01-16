package OOPTasks;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("tima", "black", 1);
        Cat myau = new Cat("barsik","silver",1.5);
        cat.getColor();
        myau.getAge();
        Triangle triangle = new Triangle(1,2,3);
        triangle.triangleArea();
        System.out.println();
    }
}
