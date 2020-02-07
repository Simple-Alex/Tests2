package University;

public class Human {
    private String name;
    private String surname;
    private double age;

    public Human() {
    }

    public Human(String name, String surname, double age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void getInfo(){
        String className = this.getClass().getName();
        System.out.print(className+" {name - "+name+", surname - "+surname+", age = "+age+"");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
