package homeWorks.homeWork13;

import java.util.Comparator;

public class CompareLastName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        return s1.getLastname().compareTo(s2.getLastname());
    }
}
