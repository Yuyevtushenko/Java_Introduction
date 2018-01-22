package homeWorks.homeWorkEight.human;

public class Employee extends Human {

    protected int salary;
    protected int expirience;

    public Employee(int salary, int expirience) {
        this.salary = salary;
        this.expirience = expirience;
    }

    @Override
    public void printInfo() {
        System.out.println("Колисетво рук = " + getArms() + "\nКоличество ног = " + getLegs()
                + "\nИмя = " + getName() +
                "\nФамилия = " + getSurname() + "\nВозраст = " + getAge()
                + "\nЗарплаьта = " + salary + "\nСтаж = " + expirience);
    }
}
