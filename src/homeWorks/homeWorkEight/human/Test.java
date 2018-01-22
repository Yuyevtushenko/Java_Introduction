package homeWorks.homeWorkEight.human;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(2, "Engineer");
        student.setAge(18);
        student.getArms();
        student.getLegs();
        student.setName("Ivan");
        student.setSurname("Ivanov");
        student.printInfo();

        Employee employee = new Employee(50000, 10);
        employee.setAge(30);
        employee.getArms();
        employee.getLegs();
        employee.setName("Petr");
        employee.setSurname("Petrov");
        System.out.println();
        employee.printInfo();

        Politician politician = new Politician("Хиппи", 10000);
        politician.setAge(30);
        politician.getArms();
        politician.getLegs();
        politician.setName("Petr");
        politician.setSurname("Petrov");
        System.out.println();
        politician.printInfo();

    }
}
