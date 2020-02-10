package University;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("aa","aa",2.2,22,"aa","aa",2,2);
        Student student2 = new Student("aa","bb",2.2,22,"aa","aa",2,2);
        Student student3 = new Student("aa","cc",2.2,22,"aa","aa",2,2);
        Student student4 = new Student("aa","hh",2.2,22,"aa","aa",2,2);
        Student student5 = new Student("aa","ee",2.2,22,"aa","aa",2,2);
        Student student6 = new Student("aa","n",2.2,22,"aa","aa",2,2);
        Student student7 = new Student("aa","tc",2.2,22,"aa","aa",2,2);
        Student student8 = new Student("aa","yc",2.2,22,"aa","aa",2,2);
        Student student9 = new Student("aa","oc",2.2,22,"aa","aa",2,2);
        Student student10 = new Student("aa","zc",2.2,22,"aa","aa",2,2);

        student1.getInfo();

        Group group1 = new Group();
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        group1.addStudent(student6);
        group1.addStudent(student7);
        group1.addStudent(student8);
        group1.addStudent(student9);
        group1.addStudent(student10);
        group1.prizovniky();
        /*group1.sort();*/
    }
}
