package University;

public class Group {
    private Student[] group = new Student[10];

    public Group() {
    }

    public Group(Student[] group) {
        this.group = group;
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }
    public void addStudent(Student student) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = student;
                return;
            }
        }
    }
    public void delStudent(Student student) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == student) {
                group[i]=null;
                break;
            }
        }
    }
    public void surnameSearsh(String surname) {
        try {
            for (int i = 0; i < group.length; i++){
                if (group[i].getSurname().equals(surname)){
                    System.out.println("студент найден");;
                }else{
                    System.out.println("студент не найден");
                }
            }
        }catch (MySearshExeption e){
            e.printStackTrace();
        }
    }

}
