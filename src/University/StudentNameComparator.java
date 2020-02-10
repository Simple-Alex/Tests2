package University;

import java.util.Comparator;
// на всякий случай
public class StudentNameComparator implements Comparator {
    @Override
    public int compare(Object t1, Object t2) {
        Student st1 = (Student) t1;
        Student st2 = (Student) t2;
        if (st1==null && st2 !=null) {
            return -1;
        }
        if (st1 !=null && st2==null) {
            return 1;
        }
        if (st1==null && st2==null) {
            return 0;
        }

        if (st1.getName().compareTo(st2.getName())>0) {
            return 1;
        }

        if (st1.getName().compareTo(st2.getName())<0) {
            return -1;
        }
        return 0;
    }
}
