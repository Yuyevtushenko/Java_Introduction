package lessons.lesson13;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Hillel8 on 14.01.2018.
 */
public class Test {
    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>(new UserSalaryComparator());

        userSet.add(new User("Yan", "Jonson", 826));
        userSet.add(new User("Petro", "London", 45788));
        userSet.add(new User("Andrey", "Shevchenko", 3600));
        userSet.add(new User("Danil", "Bogdan", 9));

        for (User user : userSet) {
            System.out.println(user);
        }


   }
}
