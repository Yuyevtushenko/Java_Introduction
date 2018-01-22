package lessons.lesson13;

import java.util.Comparator;

/**
 * Created by Hillel8 on 14.01.2018.
 */
public class UserSalaryComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) { //ля обратного порядка поменять либо меньше равно либо -1 и 1
        if(o1.getSalary() >= o2.getSalary()){
            return 1;
        }else{
            return -1;
        }
    }
}
