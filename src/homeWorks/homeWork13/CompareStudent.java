package homeWorks.homeWork13;

import java.util.Comparator;

public class CompareStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getCourse() > o2.getCourse()) {
            return 1;
        } else {
            return -1;
        }
    }

}
