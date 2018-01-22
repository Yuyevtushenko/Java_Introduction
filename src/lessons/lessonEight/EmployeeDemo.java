package lessons.lessonEight;

/**
 * Created by Hillel8 on 17.12.2017.
 */
public class EmployeeDemo {

    public static void main(String[] args) {

        Employee employee = new Employee("Nikita", "Shnurov");
     //   Employee employee2 = new Employee();

        employee.setAge(36);
        employee.setDepartment("Alkasha");
        employee.setWagedata(5000);

        employee.printInfo();


        System.out.println(employee.getSurname());
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getDepartment());
        System.out.println(employee.getWagedata());

        Employee employee1 = new Employee("Ivan", "Ivanov", 25, "Kakoito", 5000);
        employee1.printInfo();



    }
}
