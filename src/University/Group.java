package University;

import java.util.Arrays;

public class Group implements Voenkom{
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
    public void surnameSearsh(String surname) {   //возможно! логика потерялась по пути
        try {
            for (int i = 0; i < group.length; i++){
                if (group[i].getSurname().equals(surname)){
                    System.out.println("студент найден");;
                }else{
                    System.out.println("студент не найден");
                }
            }
        }catch (MySearshExeption e){
            System.out.println(e.getMessage());
        }
    }

    //сортирует фамилии, компаратор не использовался
    public void sort() throws MySearshExeption{
        String[] surname = new String[10];
        for (int i = 0; i < group.length; i++) {
            surname[i] = group[i].getSurname();
        }
        Arrays.sort(surname);
        for (int i = 0; i < group.length; i++){
            System.out.println(surname[i]);
        }
    }

    @Override
    // при проектировке не учитывальсь, что студентами могут быть и девушки =D
    // представим что девушки тоже служат
    public String prizovniky() {
        int d = 0;
        for (int i = 0; i < group.length; i++){
                if (group[i].getAge()>=18){
                    d++;
                }

        }Student[] prizov = new Student[d];
        for (int i = 0; i < group.length; i++){
            if (group[i].getAge()>=18){
                prizov[i] = group[i];
            }return "призовник: "+prizov[i].getSurname()+" "+prizov[i].getName()+", возраст: "+prizov[i].getAge();
        }return "";
    }

    @Override
    public String toString() {
        return "Group{" +
                "group=" + Arrays.toString(group) +
                '}';
    }
}
