package homeWorks.homeWork13;

import java.util.Comparator;

public class CompareStudent implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
    return s1.getCourse() - s2.getCourse();
    }

}
