package lessons.lesson13;

/**
 * Created by Hillel8 on 14.01.2018.
 */
public class User  {  //implementsComparable для сортировки стрингов

    private String firsName;
    private String lastName;
    private int salary;

    public User(String firsName, String lastName, int salary) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }


//    @Override
//    public int compareTo(User o) {
//        return this.lastName.compareTo(o.lastName); // для обратного порядка поменять о.ластнейм поменять на зис ластнейм
//    }
}
