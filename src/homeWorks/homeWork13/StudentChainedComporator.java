package homeWorks.homeWork13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentChainedComporator implements Comparator<Student> {

    private List<Comparator<Student>> listComporators;

    @SafeVarargs
    public StudentChainedComporator(Comparator<Student>... comparators){
        this.listComporators = Arrays.asList(comparators);
    }

    @Override
    public int compare(Student s1, Student s2){
        for(Comparator<Student> comparator : listComporators){
            int result = comparator.compare(s1, s2);
            if(result !=0){
                return result;
            }
        }
        return 0;
    }
}
