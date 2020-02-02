package OOPTasks;

import Shape.Point;

public class Main {

    public static void main(String[] aaa) {
        Cat cat = new Cat("tima", "black", 1);
        Cat myau = new Cat("barsik","silver",1.5);
        Triangle triangle = new Triangle(5,5,5);
        System.out.println(myau);
        System.out.println(cat);
        System.out.println(triangle);
        Vector3d vector3d = new Vector3d(1,1,1,2,2,2);
        System.out.println(vector3d);
        Point point = new Point(2,1);
    }
}
