package University;

public class Student extends Human{
    private int NumberOfZachotka;
    private String university;
    private String faculty;
    private int course;
    private int group;

    public Student() {
    }

    public Student(String name, String surname, double age, int numberOfZachotka, String university, String faculty, int course, int group) {
        super(name, surname, age);
        this.NumberOfZachotka = numberOfZachotka;
        this.university = university;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getNumberOfZachotka() {
        return NumberOfZachotka;
    }

    public void setNumberOfZachotka(int numberOfZachotka) {
        NumberOfZachotka = numberOfZachotka;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print(NumberOfZachotka+", "+university+", "+faculty+", "+course+", "+group+"}");
    }
}
