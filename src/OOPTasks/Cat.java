package OOPTasks;

public class Cat {
    private String name;
    private double age;
    private String color;
    private int weight;
    private int speed;

    public Cat() {
        super();
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, String color, double age) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat(String name, String color, double age, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public Cat(String name, double age, String color, int weight, int speed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static void bite(String part) {
        System.out.println("cat bite you in " + part);
    }

    public void voice() {
        System.out.println("mrrr");
    }

    public void sprint() {
        System.out.println("cat is sprint with " + speed + "km of speed");

    }

    public void premonition() {
        System.out.println("anticipates something ");
    }


    @Override
    public String toString() {
        return "Cat name = " + name + ", weight = " + weight + ", color = " + color + ", age =" + age;
    }
}
